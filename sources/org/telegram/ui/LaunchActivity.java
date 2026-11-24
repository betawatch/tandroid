package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureUiState;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.Typeface;
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
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class LaunchActivity extends tg0 implements qi5, gk7, wi3 {
    public static final String C1 = UUID.randomUUID().toString();
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static LaunchActivity H1;
    public static Pattern I1;
    public static ts J1;
    public static LaunchActivity K1;
    public obb A1;
    public sgb B0;
    public int B1;
    public rk0 C0;
    public hd E0;
    public View F0;
    public hd G0;
    public boolean H0;
    public HashMap I0;
    public HashMap J0;
    public Intent K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public String P0;
    public String Q0;
    public boolean R;
    public TLRPC.TL_wallPaper R0;
    public String S;
    public akb S0;
    public String T;
    public TLRPC.TL_theme T0;
    public CharSequence U;
    public boolean U0;
    public ArrayList V;
    public hd V0;
    public ArrayList W;
    public ArrayList X;
    public boolean X0;
    public Uri Y;
    public y0a Y0;
    public String Z;
    public ez3 Z0;
    public ArrayList a0;
    public ArrayList b0;
    public Uri c0;
    public int d0;
    public h24 e1;
    public zj f1;
    public twc g1;
    public c25 h0;
    public boolean h1;
    public ArrayList i0;
    public ip4 i1;
    public ArrayList j0;
    public xz5 j1;
    public String k0;
    public yz5 k1;
    public ActionMode l0;
    public boolean l1;
    public boolean m0;
    public wtc m1;
    public umb n0;
    public wtc n1;
    public v31 o0;
    public ActionBarLayout p0;
    public bz5 p1;
    public ActionBarLayout q0;
    public be2 q1;
    public ActionBarLayout r0;
    public boolean r1;
    public zz5 s0;
    public ViewGroup s1;
    public FrameLayout t0;
    public final zq7 t1;
    public n81 u0;
    public hd u1;
    public yc v0;
    public hd v1;
    public vz5 w0;
    public boolean w1;
    public yx0 x0;
    public long x1;
    public mq3 y0;
    public int[] y1;
    public aw7 z0;
    public ValueAnimator z1;
    public final ArrayList Q = new ArrayList();
    public final ArrayList e0 = new ArrayList();
    public final ArrayList f0 = new ArrayList();
    public final ArrayList g0 = new ArrayList();
    public final ArrayList A0 = new ArrayList();
    public final ArrayList D0 = new ArrayList();
    public boolean W0 = false;
    public final ArrayList a1 = new ArrayList();
    public final SparseIntArray b1 = new SparseIntArray();
    public int c1 = 5934;
    public final tz5 d1 = new tz5();
    public boolean o1 = true;

    public LaunchActivity() {
        System.identityHashCode(this);
        this.t1 = new zq7(this);
        this.B1 = 0;
    }

    public static void C0(j5 j5Var, cj3 cj3Var, CharSequence charSequence, long j, k27 k27Var, long j2, boolean z, int i, int i2) {
        bba bbaVar;
        bba bbaVar2;
        int i3 = j5Var.a;
        boolean z2 = cj3Var == null || (bbaVar2 = cj3Var.I2) == null || bbaVar2.n;
        TLRPC.WebPage webPage = null;
        if (z2 && cj3Var != null && (bbaVar = cj3Var.I2) != null) {
            webPage = bbaVar.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (webPage2 == null && z2) {
            z3a.Z(j5Var, charSequence, j, j2, z, i, i2);
            return;
        }
        CharSequence G = z3a.G(charSequence);
        if (G == null || G.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = {G};
        z3a.B(i3).q0(x3a.b(charSequenceArr[0].toString(), j, k27Var, k27Var, webPage2, z2, hq6.d0(i3).Y(charSequenceArr, true, true), null, null, z, i, i2, null, false));
    }

    public static void E(int i) {
        LaunchActivity launchActivity = K1;
        if (launchActivity != null) {
            launchActivity.D(i);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z) {
        org.telegram.ui.ActionBar.d Q = Q();
        if (Q != null) {
            long j = tL_attachMenuBot.bot_id;
            quc b = quc.b(i, j, j, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.O() == null || launchActivity.O().l(b) == null) {
                TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(tL_attachMenuBot.bot_id));
                String C12 = V1 == null ? null : na7.q1(i).C1(V1.restriction_reason);
                if (!TextUtils.isEmpty(C12)) {
                    na7.q1(i);
                    na7.W4(C12, Q);
                    return;
                }
                ow0 ow0Var = new ow0(launchActivity, Q.getResourceProvider());
                ow0Var.C0 = false;
                ow0Var.B(z);
                ow0Var.m0 = launchActivity;
                ow0Var.x(Q, b);
                ow0Var.show();
            }
        }
    }

    public static void K() {
        ArrayList<zf0> arrayList;
        org.telegram.ui.ActionBar.d S = S();
        if (S != null) {
            x14 v = S.getParentLayout() instanceof ActionBarLayout ? ((ActionBarLayout) S.getParentLayout()).v() : null;
            if (v != null && (arrayList = v.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    v.sheetsStack.get(size).a(true);
                }
            }
            ArrayList<zf0> arrayList2 = S.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    S.sheetsStack.get(size2).a(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = ow0.b1.iterator();
            while (it.hasNext()) {
                arrayList3.add((ow0) it.next());
            }
            int size3 = arrayList3.size();
            int i = 0;
            while (i < size3) {
                Object obj = arrayList3.get(i);
                i++;
                ((ow0) obj).m(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.d M() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.r();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ActionBarLayout) ((ui5) b00.f(1, H1.Q))).r();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.N() == null) {
            return null;
        }
        return ((ActionBarLayout) H1.N()).r();
    }

    public static org.telegram.ui.ActionBar.d Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ui5) b00.f(1, H1.Q)).getLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.N() == null) {
            return null;
        }
        return H1.N().getLastFragment();
    }

    public static org.telegram.ui.ActionBar.d S() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ui5) b00.f(1, H1.Q)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.N() == null) {
            return null;
        }
        return H1.N().getSafeLastFragment();
    }

    public static String T(int i, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        return str2 == null ? k96.M0(i, str) : str2;
    }

    public static int U(Uri uri) {
        String query = uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND) ? uri.getQuery() : uri.getQueryParameter("t") != null ? uri.getQueryParameter("t") : null;
        if (TextUtils.isEmpty(query)) {
            return -1;
        }
        Pattern pattern = I1;
        if (pattern == null) {
            pattern = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
            I1 = pattern;
        }
        try {
            Matcher matcher = pattern.matcher(query);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                return ((TextUtils.isEmpty(group) ? 0 : Integer.parseInt(group)) * 86400) + ((TextUtils.isEmpty(group2) ? 0 : Integer.parseInt(group2)) * 3600) + ((TextUtils.isEmpty(group3) ? 0 : Integer.parseInt(group3)) * 60) + (TextUtils.isEmpty(group4) ? 0 : Integer.parseInt(group4));
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
            try {
                return (Integer.parseInt(split.length - 4 >= 0 ? split[split.length - 4] : "0") * 86400) + (Integer.parseInt(split.length - 3 < 0 ? "0" : split[split.length - 3]) * 3600) + (Integer.parseInt(str2) * 60) + Integer.parseInt(str);
            } catch (Exception e) {
                fa4.g(e, true);
                return -1;
            }
        }
    }

    public static void Y(View view) {
        if (view.getLayerType() != 0) {
            view.invalidate();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                Y(viewGroup.getChildAt(i));
            }
        }
    }

    public static void a0(float f, float f2, float f3) {
        View decorView;
        obb obbVar;
        LaunchActivity launchActivity = H1;
        if (launchActivity == null || (decorView = launchActivity.getWindow().getDecorView()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && ((obbVar = launchActivity.A1) == null || ((View) obbVar.a) != decorView)) {
            launchActivity.A1 = new obb(decorView);
        }
        obb obbVar2 = launchActivity.A1;
        if (obbVar2 != null) {
            View view = (View) obbVar2.a;
            ArrayList arrayList = obbVar2.b;
            if (arrayList.size() < 7) {
                float max = (Math.max(Math.max(loe.a(0.0f, 0.0f, f, f2), loe.a(view.getWidth(), 0.0f, f, f2)), Math.max(loe.a(0.0f, view.getHeight(), f, f2), loe.a(view.getWidth(), view.getHeight(), f, f2))) * 2.0f) / (gl.p * 1200.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                nbb nbbVar = new nbb(f, f2, f3);
                ofFloat.addUpdateListener(new pk(obbVar2, nbbVar, (byte) 28));
                ofFloat.addListener(new eh8((Object) obbVar2, (Object) nbbVar, (byte) 18));
                ofFloat.setInterpolator(s33.g);
                ofFloat.setDuration((long) (max * 1000.0f));
                arrayList.add(nbbVar);
                obbVar2.i();
                ofFloat.start();
            }
        }
    }

    public static a06 c0() {
        LaunchActivity launchActivity = H1;
        if (launchActivity != null) {
            return new a06(launchActivity, true);
        }
        return null;
    }

    public final void A(boolean z) {
        int i;
        org.telegram.messenger.a.t();
        org.telegram.messenger.a.m();
        if (!z) {
            boolean z2 = w01.a;
        }
        org.telegram.messenger.a.a.getClass();
        ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
        oh0 e = oh0.e();
        String str = e.a;
        lh0 lh0Var = (str == null || (i = e.b) == 0) ? null : new lh0(str, i, e.c);
        boolean z3 = this.o1;
        this.o1 = false;
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        mn6 mn6Var = new mn6((Object) this, z3, (Object) lh0Var, (byte) 29);
        ((ApplicationLoaderImpl) aVar).getClass();
        oh0.e().a(mn6Var, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r9 = new java.io.BufferedReader(new java.io.InputStreamReader(r6));
        r10 = new java.lang.StringBuilder();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r12 = r9.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r12 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r11 >= 100) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        r10.append(r12);
        r10.append('\n');
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        r3 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r6.closeEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d1, code lost:
    
        if (r6 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00df, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e3, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e4, code lost:
    
        fa4.g(r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00dd, code lost:
    
        if (r6 == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(Uri uri) {
        InputStream inputStream;
        int i = y6c.t0;
        InputStream inputStream2 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        String str = null;
        hd hdVar = new hd(3, null, this);
        byte b = 1;
        int[] iArr = {0};
        String q = ba4.q(MediaController.v(uri));
        if (q == null || !q.endsWith(".zip")) {
            try {
                inputStream = getContentResolver().openInputStream(uri);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        int i2 = 0;
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null || i2 >= 100) {
                                break;
                            }
                            sb.append(readLine);
                            sb.append('\n');
                            i2++;
                        }
                        str = sb.toString();
                    } catch (Exception e) {
                        e = e;
                        fa4.g(e, true);
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
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
                                } catch (Exception e4) {
                                    fa4.g(e4, true);
                                }
                            } else {
                                nextEntry = zipInputStream.getNextEntry();
                            }
                        }
                    }
                    zipInputStream.close();
                } finally {
                }
            } catch (Exception e5) {
                try {
                    fa4.g(e5, true);
                } catch (Exception e6) {
                    fa4.g(e6, true);
                }
            }
        }
        if (str != null) {
            TLRPC.TL_messages_checkHistoryImport tL_messages_checkHistoryImport = new TLRPC.TL_messages_checkHistoryImport();
            tL_messages_checkHistoryImport.import_head = str;
            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(tL_messages_checkHistoryImport, new ae(this, uri, i, hdVar));
            hdVar.setOnCancelListener(new f74(i, iArr, b));
            try {
                hdVar.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void B() {
        if (this.P != y6c.t0 || this.m1 == null) {
            wtc wtcVar = this.m1;
            if (wtcVar != null) {
                wtcVar.a();
                this.m1 = null;
            }
            int i = y6c.t0;
            this.P = i;
            wtc wtcVar2 = new wtc(kk7.f(i), this);
            wtcVar2.b(kk7.o3);
            wtcVar2.b(kk7.H2);
            wtcVar2.b(kk7.i0);
            wtcVar2.b(kk7.Y4);
            wtcVar2.b(kk7.S1);
            wtcVar2.b(kk7.L0);
            wtcVar2.b(kk7.Q0);
            wtcVar2.b(kk7.b1);
            wtcVar2.b(kk7.P);
            wtcVar2.b(kk7.M0);
            wtcVar2.b(kk7.X1);
            wtcVar2.b(kk7.Y1);
            wtcVar2.b(kk7.u1);
            wtcVar2.b(kk7.v2);
            wtcVar2.b(kk7.w1);
            wtcVar2.b(kk7.k5);
            wtcVar2.b(kk7.h5);
            wtcVar2.b(kk7.t5);
            wtcVar2.b(kk7.S5);
            this.m1 = wtcVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final String str26, final String str27, final c01 c01Var, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final String str28, final String str29, final boolean z5, final String str30, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str31, final Integer num3, final boolean z11, final byte[] bArr) {
        hb5 hb5Var;
        final byte b;
        hd hdVar;
        int[] iArr;
        final int i7;
        qx3 qx3Var;
        u0b u0bVar;
        TLRPC.Chat chat;
        if (i2 == 0 && y6c.c() >= 2 && hashMap != null) {
            ij.i(this, new ej() { // from class: iz5
                @Override // ej
                public final void a(int i8) {
                    String str32 = LaunchActivity.C1;
                    LaunchActivity launchActivity = LaunchActivity.this;
                    if (i8 != i) {
                        launchActivity.N0(i8);
                    }
                    launchActivity.B0(i8, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, 1, i3, str23, str24, str25, str26, str27, c01Var, z3, i4, z4, i5, i6, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr);
                }
            }).show();
            return;
        }
        final c01 c01Var2 = c01Var;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        final byte b2 = 0;
        if (str16 != null) {
            SparseArray sparseArray = kk7.e().a;
            int i8 = kk7.i4;
            if (sparseArray.indexOfKey(i8) >= 0) {
                kk7.e().k(i8, str16);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String M0 = k96.M0(R.string.AppName, null);
            hd hdVar2 = alertDialog$Builder.a;
            hdVar2.S = M0;
            hdVar2.U = gl.T2(k96.a0(null, null, 2131747574, str16));
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            F0(alertDialog$Builder);
            return;
        }
        if (str17 != null) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            String M02 = k96.M0(2131753891, null);
            hd hdVar3 = alertDialog$Builder2.a;
            hdVar3.S = M02;
            hdVar3.U = k96.M0(2131753881, null);
            alertDialog$Builder2.j(k96.M0(2131747638, null), null);
            F0(alertDialog$Builder2);
            return;
        }
        hd hdVar4 = new hd(3, null, this);
        final kz5 kz5Var = new kz5(c01Var2, hdVar4, b2);
        final int[] iArr2 = {0};
        if (str10 != null) {
            TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
            tL_contacts_importContactToken.token = str10;
            final byte b3 = 0;
            iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(tL_contacts_importContactToken, new RequestDelegate(this) { // from class: lz5
                public final /* synthetic */ LaunchActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (b3) {
                        case 0:
                            String str32 = LaunchActivity.C1;
                            gl.d3(new qx5(this.b, tLObject, i, str10, tL_error, kz5Var));
                            break;
                        case 1:
                            String str33 = LaunchActivity.C1;
                            gl.d3(new i57((Object) this.b, (Object) tLObject, i, (Object) str10, (Object) kz5Var, (byte) 17));
                            break;
                        default:
                            String str34 = LaunchActivity.C1;
                            gl.d3(new qx5(this.b, tL_error, tLObject, i, str10, kz5Var));
                            break;
                    }
                }
            });
        } else if (str11 != null) {
            TL_chatlists.TL_chatlists_checkChatlistInvite tL_chatlists_checkChatlistInvite = new TL_chatlists.TL_chatlists_checkChatlistInvite();
            tL_chatlists_checkChatlistInvite.slug = str11;
            final byte b4 = 1;
            iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(tL_chatlists_checkChatlistInvite, new RequestDelegate(this) { // from class: lz5
                public final /* synthetic */ LaunchActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (b4) {
                        case 0:
                            String str32 = LaunchActivity.C1;
                            gl.d3(new qx5(this.b, tLObject, i, str11, tL_error, kz5Var));
                            break;
                        case 1:
                            String str33 = LaunchActivity.C1;
                            gl.d3(new i57((Object) this.b, (Object) tLObject, i, (Object) str11, (Object) kz5Var, (byte) 17));
                            break;
                        default:
                            String str34 = LaunchActivity.C1;
                            gl.d3(new qx5(this.b, tL_error, tLObject, i, str11, kz5Var));
                            break;
                    }
                }
            });
        } else {
            byte b5 = 14;
            if (str29 != null) {
                kt4 c5 = kt4.c(this.P);
                i8c i8cVar = new i8c(this) { // from class: mz5
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // i8c
                    public final void a(Object obj, Object obj2) {
                        gt4 b6;
                        byte b7 = b2;
                        kz5 kz5Var2 = kz5Var;
                        switch (b7) {
                            case 0:
                                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                String str32 = LaunchActivity.C1;
                                LaunchActivity launchActivity = this.b;
                                if (tL_error != null) {
                                    ir2.v(null, 2131749800, u21.b0((d) b00.f(1, launchActivity.e0)), R.raw.error, 36);
                                } else if (tL_StarGiftAuctionState != null && (b6 = kt4.c(launchActivity.P).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                    new kna(launchActivity, null, launchActivity.P, b6.d.title, b6.h, false).show();
                                }
                                try {
                                    kz5Var2.run();
                                    break;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                                break;
                            default:
                                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = (TL_payments.TL_StarGiftAuctionState) obj;
                                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                String str33 = LaunchActivity.C1;
                                LaunchActivity launchActivity2 = this.b;
                                if (tL_error2 != null) {
                                    ir2.v(null, 2131749800, u21.b0((d) b00.f(1, launchActivity2.e0)), R.raw.error, 36);
                                } else if (tL_StarGiftAuctionState2 != null) {
                                    ez.Z0(launchActivity2, null, launchActivity2.P, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                }
                                try {
                                    kz5Var2.run();
                                    break;
                                } catch (Exception e2) {
                                    fa4.g(e2, true);
                                }
                        }
                    }
                };
                TL_stars.TL_inputStarGiftAuctionSlug tL_inputStarGiftAuctionSlug = new TL_stars.TL_inputStarGiftAuctionSlug();
                tL_inputStarGiftAuctionSlug.slug = str29;
                TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
                tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuctionSlug;
                tL_getStarGiftAuctionState.version = 0;
                iArr2[0] = c5.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new hc(b2), new ae2(c5, i8cVar, b5));
            } else if (str28 != null) {
                kt4 c6 = kt4.c(this.P);
                final char c7 = c4 == true ? 1 : 0;
                i8c i8cVar2 = new i8c(this) { // from class: mz5
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // i8c
                    public final void a(Object obj, Object obj2) {
                        gt4 b6;
                        byte b7 = c7;
                        kz5 kz5Var2 = kz5Var;
                        switch (b7) {
                            case 0:
                                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                String str32 = LaunchActivity.C1;
                                LaunchActivity launchActivity = this.b;
                                if (tL_error != null) {
                                    ir2.v(null, 2131749800, u21.b0((d) b00.f(1, launchActivity.e0)), R.raw.error, 36);
                                } else if (tL_StarGiftAuctionState != null && (b6 = kt4.c(launchActivity.P).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                    new kna(launchActivity, null, launchActivity.P, b6.d.title, b6.h, false).show();
                                }
                                try {
                                    kz5Var2.run();
                                    break;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                                break;
                            default:
                                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = (TL_payments.TL_StarGiftAuctionState) obj;
                                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                String str33 = LaunchActivity.C1;
                                LaunchActivity launchActivity2 = this.b;
                                if (tL_error2 != null) {
                                    ir2.v(null, 2131749800, u21.b0((d) b00.f(1, launchActivity2.e0)), R.raw.error, 36);
                                } else if (tL_StarGiftAuctionState2 != null) {
                                    ez.Z0(launchActivity2, null, launchActivity2.P, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                }
                                try {
                                    kz5Var2.run();
                                    break;
                                } catch (Exception e2) {
                                    fa4.g(e2, true);
                                }
                        }
                    }
                };
                TL_stars.TL_inputStarGiftAuctionSlug tL_inputStarGiftAuctionSlug2 = new TL_stars.TL_inputStarGiftAuctionSlug();
                tL_inputStarGiftAuctionSlug2.slug = str28;
                TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState2 = new TL_payments.TL_getStarGiftAuctionState();
                tL_getStarGiftAuctionState2.auction = tL_inputStarGiftAuctionSlug2;
                tL_getStarGiftAuctionState2.version = 0;
                iArr2[0] = c6.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState2, new hc(b2), new ae2(c6, i8cVar2, b5));
            } else if (str19 != null) {
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str19;
                final byte b6 = 2;
                iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(getuniquestargift, new RequestDelegate(this) { // from class: lz5
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (b6) {
                            case 0:
                                String str32 = LaunchActivity.C1;
                                gl.d3(new qx5(this.b, tLObject, i, str19, tL_error, kz5Var));
                                break;
                            case 1:
                                String str33 = LaunchActivity.C1;
                                gl.d3(new i57((Object) this.b, (Object) tLObject, i, (Object) str19, (Object) kz5Var, (byte) 17));
                                break;
                            default:
                                String str34 = LaunchActivity.C1;
                                gl.d3(new qx5(this.b, tL_error, tLObject, i, str19, kz5Var));
                                break;
                        }
                    }
                });
            } else if (str18 != null) {
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = str18;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(tL_payments_getPaymentForm, new vt0(this, (Object) tL_inputInvoiceSlug, (Object) kz5Var, i, str18, (byte) 6));
            } else {
                if (str == null) {
                    String str32 = str3;
                    if (str2 == null) {
                        hb5Var = null;
                        ArrayList arrayList = this.e0;
                        if (str32 != null) {
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = str32;
                            org.telegram.ui.ActionBar.d dVar = (org.telegram.ui.ActionBar.d) b00.f(1, arrayList);
                            if (dVar instanceof mu1) {
                                mu1 mu1Var = (mu1) dVar;
                                u0bVar = new u0b(this, dVar, tL_inputStickerSetShortName, null, (mu1Var.d1.getVisibility() == 0 || !((chat = mu1Var.e) == null || hc2.t(chat))) ? null : mu1Var.a0, mu1Var.getResourceProvider());
                                boolean O7 = mu1Var.O7();
                                u0bVar.i0 = O7;
                                u0bVar.n = O7;
                            } else {
                                u0bVar = new u0b(this, dVar, tL_inputStickerSetShortName, null, null, null);
                            }
                            u0bVar.K1 = str4 != null;
                            dVar.showDialog(u0bVar);
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
                            org.telegram.ui.ActionBar.d dVar2 = (org.telegram.ui.ActionBar.d) b00.f(1, arrayList);
                            if (dVar2 instanceof mu1) {
                                mu1 mu1Var2 = (mu1) dVar2;
                                qx3Var = new qx3(dVar2, this, mu1Var2.getResourceProvider(), arrayList2);
                                boolean O72 = mu1Var2.O7();
                                qx3Var.i0 = O72;
                                qx3Var.n = O72;
                            } else {
                                qx3Var = new qx3(dVar2, this, null, arrayList2);
                            }
                            dVar2.showDialog(qx3Var);
                            return;
                        }
                        if (str9 != null) {
                            cj3 cj3Var = new cj3(tb4.j(3, "onlySelect", "dialogsType", true));
                            cj3Var.E2 = new ym1(this, z, i, str9);
                            b = 0;
                            u0(cj3Var, false, true);
                            i7 = i;
                        } else {
                            b = 0;
                            if (hashMap != null) {
                                long longValue = Utilities.A((String) hashMap.get("bot_id")).longValue();
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
                                iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(getauthorizationform, new by5(this, iArr2, i, kz5Var, getauthorizationform, str33, str34, str35, (byte) 1));
                            } else if (str15 != null) {
                                TLRPC.TL_help_getDeepLinkInfo tL_help_getDeepLinkInfo = new TLRPC.TL_help_getDeepLinkInfo();
                                tL_help_getDeepLinkInfo.path = str15;
                                iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(tL_help_getDeepLinkInfo, new RequestDelegate(this) { // from class: jz5
                                    public final /* synthetic */ LaunchActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.tgnet.RequestDelegate
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        switch (b) {
                                            case 0:
                                                String str36 = LaunchActivity.C1;
                                                gl.d3(new sx5((Object) this.b, (Object) kz5Var, (Object) tLObject, (byte) 0));
                                                break;
                                            default:
                                                String str37 = LaunchActivity.C1;
                                                gl.d3(new e45(this.b, kz5Var, tLObject, tL_error, (byte) 9));
                                                break;
                                        }
                                    }
                                });
                            } else if (str14 != null) {
                                TLRPC.TL_langpack_getLanguage tL_langpack_getLanguage = new TLRPC.TL_langpack_getLanguage();
                                tL_langpack_getLanguage.lang_code = str14;
                                tL_langpack_getLanguage.lang_pack = "android";
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.P);
                                final char c8 = c2 == true ? 1 : 0;
                                iArr2[0] = connectionsManager.sendRequest(tL_langpack_getLanguage, new RequestDelegate(this) { // from class: jz5
                                    public final /* synthetic */ LaunchActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.tgnet.RequestDelegate
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        switch (c8) {
                                            case 0:
                                                String str36 = LaunchActivity.C1;
                                                gl.d3(new sx5((Object) this.b, (Object) kz5Var, (Object) tLObject, (byte) 0));
                                                break;
                                            default:
                                                String str37 = LaunchActivity.C1;
                                                gl.d3(new e45(this.b, kz5Var, tLObject, tL_error, (byte) 9));
                                                break;
                                        }
                                    }
                                });
                            } else if (tL_wallPaper != null) {
                                if (TextUtils.isEmpty(tL_wallPaper.slug)) {
                                    try {
                                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                                        int i9 = wallPaperSettings.third_background_color;
                                        gl.d3(new hb5(this, new qmb(i9 != 0 ? new krc(wallPaperSettings.background_color, wallPaperSettings.second_background_color, i9, wallPaperSettings.fourth_background_color, "c") : new krc(wallPaperSettings.background_color, wallPaperSettings.second_background_color, gl.q1(wallPaperSettings.rotation, false), "c"), null, true), (byte) 28));
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                }
                                TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = tL_wallPaper.slug;
                                getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(getwallpaper, new k45(this, kz5Var, tL_wallPaper, (byte) 3));
                            } else {
                                if (str20 != null) {
                                    hb5 hb5Var2 = new hb5(this, c01Var2, (byte) 29);
                                    TL_account.getTheme gettheme = new TL_account.getTheme();
                                    gettheme.format = "android";
                                    TLRPC.TL_inputThemeSlug tL_inputThemeSlug = new TLRPC.TL_inputThemeSlug();
                                    tL_inputThemeSlug.slug = str20;
                                    gettheme.theme = tL_inputThemeSlug;
                                    hdVar = hdVar4;
                                    iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(gettheme, new k45(this, hdVar, kz5Var, (byte) 4));
                                    i7 = i;
                                    hb5Var = hb5Var2;
                                } else {
                                    hdVar = hdVar4;
                                    if (l == null || (num == null && !z5)) {
                                        iArr = iArr2;
                                        i7 = i;
                                        if (str30 != null) {
                                            TL_account.resolveBusinessChatLink resolvebusinesschatlink = new TL_account.resolveBusinessChatLink();
                                            resolvebusinesschatlink.slug = str30;
                                            ConnectionsManager.getInstance(this.P).sendRequest(resolvebusinesschatlink, new cz5(this, c == true ? 1 : 0));
                                        }
                                    } else {
                                        if (l2 != null) {
                                            TLRPC.Chat K0 = na7.q1(i).K0(l);
                                            if (K0 != null) {
                                                iArr2[0] = z0(i, kz5Var, num, num2, l2, num3, null, K0, null, null, 0, -1);
                                            } else {
                                                TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                                                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                                                tL_inputChannel.channel_id = l.longValue();
                                                tL_channels_getChannels.id.add(tL_inputChannel);
                                                iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getChannels, new by5(this, iArr2, i, kz5Var, num, num2, l2, num3, (byte) 2));
                                            }
                                        } else {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", l.longValue());
                                            if (num != null) {
                                                bundle.putInt("message_id", num.intValue());
                                            }
                                            if (num3 != null) {
                                                bundle.putInt("task_id", num3.intValue());
                                            }
                                            if (bArr != null) {
                                                bundle.putByteArray("poll_option_id", bArr);
                                            }
                                            TLRPC.Chat K02 = na7.q1(this.P).K0(l);
                                            if (K02 != null && hc2.R(K02) && z5) {
                                                w0(Long.valueOf(-l.longValue()), kz5Var, c01Var2, null);
                                            } else if (K02 == null || !K02.forum) {
                                                org.telegram.ui.ActionBar.d dVar3 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.d) b00.f(1, arrayList) : null;
                                                if (dVar3 == null || na7.q1(i).A(bundle, dVar3, null, null)) {
                                                    iArr = iArr2;
                                                    i7 = i;
                                                    gl.d3(new jy5(this, bundle, l, iArr2, kz5Var, z5, c01Var2, l2, num, num3, bArr, dVar3, i));
                                                }
                                            } else {
                                                l0(-l.longValue(), num, null, num3, bArr, new ay5(kz5Var, (byte) 2), 0, -1);
                                            }
                                        }
                                        i7 = i;
                                    }
                                }
                                iArr = iArr2;
                            }
                            i7 = i;
                        }
                        iArr = iArr2;
                        hdVar = hdVar4;
                    } else if (i2 == 0) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = str2;
                        iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(tL_messages_checkChatInvite, new vt0(this, i, hdVar4, kz5Var, str2), 2);
                        i7 = i;
                        iArr = iArr2;
                        hdVar = hdVar4;
                        b = 0;
                    } else {
                        if (i2 == 1) {
                            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                            tL_messages_importChatInvite.hash = str2;
                            hb5Var = null;
                            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_importChatInvite, null, new wm1((Object) this, (Object) kz5Var, i, (byte) (c3 == true ? 1 : 0)), 2);
                        } else {
                            hb5Var = null;
                        }
                        i7 = i;
                        iArr = iArr2;
                        hdVar = hdVar4;
                        b = 0;
                    }
                    if (iArr[b] != 0) {
                        hdVar.setOnCancelListener(new ff(i7, iArr, hb5Var));
                        try {
                            if (c01Var2 != null) {
                                c01Var2.b = new j45(i7, iArr, hb5Var);
                                c01Var2.d();
                            } else {
                                hdVar.q(300L);
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                if (c01Var2 != null) {
                    c01Var2.d();
                }
                k7c Y1 = na7.q1(i).Y1();
                i7 = i;
                p8c p8cVar = new p8c() { // from class: nz5
                    /* JADX WARN: Can't wrap try/catch for region: R(10:59|(12:63|(3:(1:362)|(1:365)|(1:368))|66|(2:68|(2:70|(5:72|(2:74|(2:76|77)(1:78))(1:82)|79|80|81)(8:83|84|(2:86|(2:88|89))(1:357)|(3:91|(1:95)|96)(4:(5:118|(1:(2:350|(2:352|(1:354)(1:355)))(3:122|123|(11:125|(3:127|(1:158)(1:131)|132)(2:159|(1:164)(1:163))|133|(2:148|(2:153|(1:157))(1:152))(1:137)|138|(1:140)|141|(1:143)|144|(1:146)|147)(1:(2:319|(3:340|341|(2:343|344)(1:346))(7:325|(1:327)(1:339)|328|(1:330)|331|(2:333|(1:335)(1:337))(1:338)|336))(17:167|(3:169|(1:311)(2:173|(2:175|176)(1:177))|178)(3:312|(3:314|(1:316)|317)|318)|(1:310)(1:183)|184|(1:186)|(3:188|(1:190)|(1:192))|193|(1:195)|196|(1:198)|(1:200)|(1:202)|(1:204)(1:309)|(1:206)(1:308)|207|(1:307)(1:210)|(3:214|(1:306)(1:218)|(1:(2:253|(4:288|289|290|(5:292|(1:294)(1:301)|(2:296|(1:298))|299|300)(1:302))(1:(4:282|(1:284)(1:287)|285|286)(2:(1:281)(1:261)|(8:267|(1:269)|270|(1:272)|273|274|275|277)(2:265|266))))(1:252))(12:221|(1:223)|224|(1:231)|232|(1:234)|235|236|(3:238|(3:240|241|242)(1:244)|243)|245|246|(1:248)(1:249)))))))|356|123|(0)(0))(4:107|(1:117)(2:111|(2:113|114)(1:115))|116|114)|98|99|101)|97|98|99|101))(1:358))(1:360)|359|84|(0)(0)|(0)(0)|97|98|99|101)|372|373|374|(7:376|(1:378)|379|380|381|382|(1:384)(1:385))|97|98|99|101) */
                    /* JADX WARN: Code restructure failed: missing block: B:363:0x0184, code lost:
                    
                        if (r3.longValue() > 0) goto L65;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:366:0x018e, code lost:
                    
                        if (r3.longValue() < 0) goto L65;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:369:0x0198, code lost:
                    
                        if (r3.longValue() < 0) goto L65;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:388:0x0a74, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:389:0x0a72, code lost:
                    
                        r13 = true;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:390:0x0a76, code lost:
                    
                        fa4.g(r0, true);
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:105:0x043e  */
                    /* JADX WARN: Removed duplicated region for block: B:125:0x050e  */
                    /* JADX WARN: Removed duplicated region for block: B:165:0x061e  */
                    /* JADX WARN: Removed duplicated region for block: B:357:0x0414  */
                    /* JADX WARN: Removed duplicated region for block: B:86:0x03f4  */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x041a  */
                    /* JADX WARN: Type inference failed for: r13v40 */
                    /* JADX WARN: Type inference failed for: r13v41, types: [java.lang.String, wjb] */
                    /* JADX WARN: Type inference failed for: r13v43 */
                    @Override // p8c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void a(Object obj) {
                        kz5 kz5Var2;
                        boolean z12;
                        boolean z13;
                        String str36;
                        String str37;
                        final String str38;
                        String str39;
                        String str40;
                        String str41;
                        final String str42;
                        LaunchActivity launchActivity;
                        c01 c01Var3;
                        final boolean z14;
                        final String str43;
                        String str44;
                        int i10;
                        kz5 kz5Var3;
                        final int i11;
                        int i12;
                        String str45;
                        kz5 kz5Var4;
                        LaunchActivity launchActivity2;
                        ArrayList arrayList3;
                        Integer num4;
                        final Long l3;
                        int i13;
                        final int i14;
                        Integer num5;
                        String str46;
                        String str47;
                        int i15;
                        int i16;
                        String str48;
                        Long l4;
                        byte[] bArr2;
                        long j;
                        boolean z15;
                        String str49;
                        boolean z16;
                        x14 v;
                        ArrayList<zf0> arrayList4;
                        kz5 kz5Var5;
                        boolean z17;
                        boolean z18;
                        boolean z19;
                        ?? r13;
                        u21 b0;
                        int i17;
                        final String str50;
                        final Long l5 = (Long) obj;
                        String str51 = LaunchActivity.C1;
                        final LaunchActivity launchActivity3 = LaunchActivity.this;
                        ArrayList arrayList5 = launchActivity3.e0;
                        final kz5 kz5Var6 = kz5Var;
                        Object[] objArr = 0;
                        byte b7 = 1;
                        if (l5 != null && l5.longValue() == Long.MAX_VALUE) {
                            try {
                                kz5Var6.run();
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, null, launchActivity3);
                            String M03 = k96.M0(2131754345, null);
                            hd hdVar5 = alertDialog$Builder3.a;
                            hdVar5.S = M03;
                            hdVar5.U = k96.M0(2131754346, null);
                            ug8.y(null, 2131747638, alertDialog$Builder3, null);
                            return;
                        }
                        if (launchActivity3.isFinishing()) {
                            return;
                        }
                        final boolean z20 = z4;
                        if (z20 && l5 != null) {
                            g2b M1 = na7.q1(launchActivity3.P).M1();
                            long longValue2 = l5.longValue();
                            vx5 vx5Var = new vx5(launchActivity3, kz5Var6, l5, objArr == true ? 1 : 0);
                            int i18 = M1.a;
                            TL_stories.PeerStories x = M1.x(longValue2);
                            if (x != null) {
                                for (int i19 = 0; i19 < x.stories.size(); i19++) {
                                    if ((x.stories.get(i19).media instanceof TLRPC.TL_messageMediaVideoStream) && !(x.stories.get(i19) instanceof TL_stories.TL_storyItemSkipped)) {
                                        vx5Var.a(x.stories.get(i19));
                                        return;
                                    }
                                }
                            }
                            long j2 = ((-93321425) + longValue2) << 12;
                            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) M1.E.f(j2);
                            if (storyItem != null) {
                                vx5Var.a(storyItem);
                                return;
                            }
                            TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                            tL_stories_getPeerStories.peer = na7.q1(i18).h1(longValue2);
                            ConnectionsManager.getInstance(i18).sendRequest(tL_stories_getPeerStories, new o1b(M1, j2, vx5Var));
                            return;
                        }
                        final int i20 = i4;
                        if (i20 != 0 && l5 != null) {
                            na7.q1(launchActivity3.P).M1().f0(i20, l5.longValue(), new vx5(launchActivity3, kz5Var6, l5, b7));
                            return;
                        }
                        final int i21 = i5;
                        if (i21 != 0 && l5 != null) {
                            g2b M12 = na7.q1(launchActivity3.P).M1();
                            long longValue3 = l5.longValue();
                            go2 go2Var = new go2((Object) launchActivity3, (Object) kz5Var6, (Object) l5, i21, (byte) 3);
                            int i22 = M12.a;
                            u1b A = M12.A(longValue3, false);
                            if (A != null) {
                                z1b b8 = A.b(i21);
                                if (b8 != null) {
                                    TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                                    tL_storyAlbum.album_id = b8.a;
                                    tL_storyAlbum.title = b8.b;
                                    tL_storyAlbum.icon_photo = b8.c;
                                    tL_storyAlbum.icon_video = b8.d;
                                    go2Var.a(tL_storyAlbum);
                                    return;
                                }
                                if (A.f) {
                                    go2Var.a(null);
                                    return;
                                }
                            }
                            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
                            tL_getAlbums.peer = na7.q1(i22).h1(longValue3);
                            ConnectionsManager.getInstance(i22).sendRequest(tL_getAlbums, new l12(i21, go2Var));
                            return;
                        }
                        final String str52 = str;
                        try {
                            if (l5 != null && launchActivity3.p0 != null) {
                                final String str53 = str13;
                                final String str54 = str21;
                                final boolean z21 = z2;
                                final String str55 = str22;
                                if (str53 != null ? l5.longValue() <= 0 : str54 != null) {
                                    if (str54 != null) {
                                    }
                                    if (z21) {
                                    }
                                    if (str55 != null) {
                                    }
                                }
                                final String str56 = str26;
                                boolean isEmpty = TextUtils.isEmpty(str56);
                                final int i23 = i7;
                                final String str57 = str2;
                                String str58 = str3;
                                final String str59 = str4;
                                final String str60 = str5;
                                final String str61 = str6;
                                final String str62 = str7;
                                final String str63 = str8;
                                final String str64 = str9;
                                final String str65 = str10;
                                final String str66 = str11;
                                final String str67 = str12;
                                final boolean z22 = z;
                                final Integer num6 = num;
                                final Long l6 = l;
                                final Long l7 = l2;
                                final Integer num7 = num2;
                                final HashMap hashMap2 = hashMap;
                                final String str68 = str14;
                                final String str69 = str15;
                                final String str70 = str16;
                                final String str71 = str17;
                                final TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
                                final String str72 = str18;
                                final String str73 = str19;
                                final String str74 = str20;
                                boolean z23 = i2;
                                final int i24 = i3;
                                final String str75 = str23;
                                final String str76 = str24;
                                final String str77 = str25;
                                final c01 c01Var4 = c01Var2;
                                final boolean z24 = z3;
                                final int i25 = i6;
                                final String str78 = str28;
                                final String str79 = str29;
                                final boolean z25 = z5;
                                final String str80 = str30;
                                final boolean z26 = z6;
                                final boolean z27 = z7;
                                final boolean z28 = z8;
                                final boolean z29 = z9;
                                final boolean z30 = z10;
                                final String str81 = str31;
                                final Integer num8 = num3;
                                final boolean z31 = z11;
                                final byte[] bArr3 = bArr;
                                final String str82 = str27;
                                if (isEmpty) {
                                    str36 = str82;
                                    str37 = str53;
                                    str38 = str61;
                                    str39 = str63;
                                    str40 = str67;
                                    str41 = str58;
                                    str42 = str64;
                                    launchActivity = launchActivity3;
                                    c01Var3 = c01Var4;
                                    z14 = z22;
                                    str43 = str62;
                                } else {
                                    final TLRPC.User V1 = na7.q1(i23).V1(l5);
                                    if (V1 != null) {
                                        if (V1.bot) {
                                            if (V1.bot_attach_menu) {
                                                str50 = str58;
                                                if (!hq6.d0(i23).l(V1.id)) {
                                                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                                                    na7 q1 = na7.q1(i23);
                                                    tL_messages_getAttachMenuBot.bot = q1.o1(q1.V1(l5));
                                                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i23);
                                                    final int i26 = z23 ? 1 : 0;
                                                    connectionsManager2.sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() { // from class: wx5
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            String str83 = LaunchActivity.C1;
                                                            final LaunchActivity launchActivity4 = LaunchActivity.this;
                                                            final int i27 = i23;
                                                            final String str84 = str52;
                                                            final String str85 = str57;
                                                            final String str86 = str50;
                                                            final String str87 = str59;
                                                            final String str88 = str60;
                                                            final String str89 = str61;
                                                            final String str90 = str62;
                                                            final String str91 = str63;
                                                            final String str92 = str64;
                                                            final String str93 = str65;
                                                            final String str94 = str66;
                                                            final String str95 = str67;
                                                            final boolean z32 = z22;
                                                            final Integer num9 = num6;
                                                            final Long l8 = l6;
                                                            final Long l9 = l7;
                                                            final Integer num10 = num7;
                                                            final String str96 = str53;
                                                            final HashMap hashMap3 = hashMap2;
                                                            final String str97 = str68;
                                                            final String str98 = str69;
                                                            final String str99 = str70;
                                                            final String str100 = str71;
                                                            final TLRPC.TL_wallPaper tL_wallPaper3 = tL_wallPaper2;
                                                            final String str101 = str72;
                                                            final String str102 = str73;
                                                            final String str103 = str74;
                                                            final String str104 = str54;
                                                            final boolean z33 = z21;
                                                            final String str105 = str55;
                                                            boolean z34 = i26;
                                                            final int i28 = i24;
                                                            final String str106 = str75;
                                                            final String str107 = str76;
                                                            final String str108 = str77;
                                                            final c01 c01Var5 = c01Var4;
                                                            final boolean z35 = z24;
                                                            final int i29 = i20;
                                                            final boolean z36 = z20;
                                                            final int i30 = i21;
                                                            final int i31 = i25;
                                                            final String str109 = str78;
                                                            final String str110 = str79;
                                                            final boolean z37 = z25;
                                                            final String str111 = str80;
                                                            final boolean z38 = z26;
                                                            final boolean z39 = z27;
                                                            final boolean z40 = z28;
                                                            final boolean z41 = z29;
                                                            final boolean z42 = z30;
                                                            final String str112 = str81;
                                                            final Integer num11 = num8;
                                                            final boolean z43 = z31;
                                                            final byte[] bArr4 = bArr3;
                                                            final Long l10 = l5;
                                                            final String str113 = str56;
                                                            final String str114 = str82;
                                                            final TLRPC.User user = V1;
                                                            final kz5 kz5Var7 = kz5Var6;
                                                            final int i32 = z34 ? 1 : 0;
                                                            gl.d3(new Runnable() { // from class: ey5
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    c01 c01Var6;
                                                                    TLRPC.User user2;
                                                                    final String str115;
                                                                    final boolean z44;
                                                                    final int i33;
                                                                    final int i34;
                                                                    String str116 = LaunchActivity.C1;
                                                                    final LaunchActivity launchActivity5 = LaunchActivity.this;
                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                    final int i35 = i27;
                                                                    final String str117 = str84;
                                                                    final String str118 = str85;
                                                                    final String str119 = str86;
                                                                    final String str120 = str87;
                                                                    final String str121 = str88;
                                                                    final String str122 = str89;
                                                                    final String str123 = str90;
                                                                    final String str124 = str91;
                                                                    final String str125 = str92;
                                                                    final String str126 = str93;
                                                                    final String str127 = str94;
                                                                    final String str128 = str95;
                                                                    final boolean z45 = z32;
                                                                    final Integer num12 = num9;
                                                                    final Long l11 = l8;
                                                                    final Long l12 = l9;
                                                                    final Integer num13 = num10;
                                                                    final String str129 = str96;
                                                                    final HashMap hashMap4 = hashMap3;
                                                                    final String str130 = str97;
                                                                    final String str131 = str98;
                                                                    final String str132 = str99;
                                                                    final String str133 = str100;
                                                                    final TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper3;
                                                                    final String str134 = str101;
                                                                    final String str135 = str102;
                                                                    final String str136 = str103;
                                                                    final String str137 = str104;
                                                                    final boolean z46 = z33;
                                                                    final String str138 = str105;
                                                                    boolean z47 = i32;
                                                                    final int i36 = i28;
                                                                    final String str139 = str106;
                                                                    final String str140 = str107;
                                                                    final String str141 = str108;
                                                                    final c01 c01Var7 = c01Var5;
                                                                    final boolean z48 = z35;
                                                                    final int i37 = i29;
                                                                    final int i38 = i30;
                                                                    final int i39 = i31;
                                                                    final boolean z49 = z37;
                                                                    final String str142 = str111;
                                                                    final boolean z50 = z38;
                                                                    final boolean z51 = z39;
                                                                    final boolean z52 = z40;
                                                                    final boolean z53 = z41;
                                                                    final boolean z54 = z42;
                                                                    final String str143 = str112;
                                                                    final boolean z55 = z43;
                                                                    if (tL_error2 != null) {
                                                                        final boolean z56 = z36;
                                                                        final String str144 = str109;
                                                                        final String str145 = str110;
                                                                        final Integer num14 = num11;
                                                                        final byte[] bArr5 = bArr4;
                                                                        final int i40 = z47 ? 1 : 0;
                                                                        gl.d3(new Runnable() { // from class: qy5
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                String str146 = LaunchActivity.C1;
                                                                                LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                                int i41 = i35;
                                                                                String str147 = str117;
                                                                                String str148 = str118;
                                                                                String str149 = str119;
                                                                                String str150 = str120;
                                                                                String str151 = str121;
                                                                                String str152 = str122;
                                                                                String str153 = str123;
                                                                                String str154 = str124;
                                                                                String str155 = str125;
                                                                                String str156 = str126;
                                                                                String str157 = str127;
                                                                                String str158 = str128;
                                                                                boolean z57 = z45;
                                                                                Integer num15 = num12;
                                                                                Long l13 = l11;
                                                                                Long l14 = l12;
                                                                                Integer num16 = num13;
                                                                                String str159 = str129;
                                                                                HashMap hashMap5 = hashMap4;
                                                                                String str160 = str130;
                                                                                String str161 = str131;
                                                                                String str162 = str132;
                                                                                String str163 = str133;
                                                                                TLRPC.TL_wallPaper tL_wallPaper5 = tL_wallPaper4;
                                                                                String str164 = str134;
                                                                                String str165 = str135;
                                                                                String str166 = str136;
                                                                                String str167 = str137;
                                                                                boolean z58 = z46;
                                                                                String str168 = str138;
                                                                                boolean z59 = i40;
                                                                                launchActivity6.B0(i41, str147, str148, str149, str150, str151, str152, str153, str154, str155, str156, str157, str158, z57, num15, l13, l14, num16, str159, hashMap5, str160, str161, str162, str163, tL_wallPaper5, str164, str165, str166, str167, z58, str168, z59 ? 1 : 0, i36, str139, str140, str141, null, null, c01Var7, z48, i37, z56, i38, i39, str144, str145, z49, str142, z50, z51, z52, z53, z54, str143, num14, z55, bArr5);
                                                                            }
                                                                        });
                                                                        return;
                                                                    }
                                                                    TLObject tLObject2 = tLObject;
                                                                    if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                                                                        final TLRPC.TL_attachMenuBot tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot;
                                                                        boolean z57 = tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu);
                                                                        boolean z58 = tL_attachMenuBot.inactive;
                                                                        final boolean z59 = z57;
                                                                        final Long l13 = l10;
                                                                        final String str146 = str113;
                                                                        final String str147 = str114;
                                                                        final TLRPC.User user3 = user;
                                                                        final kz5 kz5Var8 = kz5Var7;
                                                                        if ((z58 || tL_attachMenuBot.side_menu_disclaimer_needed) && z59) {
                                                                            final int i41 = z47 ? 1 : 0;
                                                                            psc.a(launchActivity5, new p8c() { // from class: ry5
                                                                                @Override // p8c
                                                                                public final void a(Object obj2) {
                                                                                    String str148 = LaunchActivity.C1;
                                                                                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                                                                    tL_attachMenuBot2.inactive = false;
                                                                                    tL_attachMenuBot2.request_write_access = false;
                                                                                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                    int i42 = i35;
                                                                                    na7 q12 = na7.q1(i42);
                                                                                    tL_messages_toggleBotInAttachMenu.bot = q12.o1(q12.V1(l13));
                                                                                    tL_messages_toggleBotInAttachMenu.enabled = true;
                                                                                    tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                                                                    ConnectionsManager.getInstance(i42).sendRequest(tL_messages_toggleBotInAttachMenu, new vv0(i42, (byte) 1), 66);
                                                                                    LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                                    String str149 = str117;
                                                                                    String str150 = str118;
                                                                                    String str151 = str119;
                                                                                    String str152 = str120;
                                                                                    String str153 = str121;
                                                                                    String str154 = str122;
                                                                                    String str155 = str123;
                                                                                    String str156 = str124;
                                                                                    String str157 = str125;
                                                                                    String str158 = str126;
                                                                                    String str159 = str127;
                                                                                    String str160 = str128;
                                                                                    boolean z60 = z45;
                                                                                    Integer num15 = num12;
                                                                                    Long l14 = l11;
                                                                                    Long l15 = l12;
                                                                                    Integer num16 = num13;
                                                                                    String str161 = str129;
                                                                                    HashMap hashMap5 = hashMap4;
                                                                                    String str162 = str130;
                                                                                    String str163 = str131;
                                                                                    String str164 = str132;
                                                                                    String str165 = str133;
                                                                                    TLRPC.TL_wallPaper tL_wallPaper5 = tL_wallPaper4;
                                                                                    String str166 = str134;
                                                                                    String str167 = str135;
                                                                                    String str168 = str136;
                                                                                    String str169 = str137;
                                                                                    boolean z61 = z46;
                                                                                    String str170 = str138;
                                                                                    boolean z62 = i41;
                                                                                    launchActivity6.x0(i42, str149, str150, str151, str152, str153, str154, str155, str156, str157, str158, str159, str160, z60, num15, l14, l15, num16, str161, hashMap5, str162, str163, str164, str165, tL_wallPaper5, str166, str167, str168, str169, z61, str170, z62 ? 1 : 0, i36, str139, str140, str141, str146, str147, c01Var7, z48, i37, i38, i39, z49, str142, user3, kz5Var8, z59, true, z50, z51, z52, z53, z54, str143, z55);
                                                                                }
                                                                            }, c01Var7 != null ? new tp5(c01Var7, (byte) 7) : null);
                                                                            return;
                                                                        }
                                                                        if (tL_attachMenuBot.request_write_access) {
                                                                            c01Var6 = c01Var7;
                                                                            user2 = user3;
                                                                            str115 = str142;
                                                                            z44 = z49;
                                                                            i33 = i39;
                                                                            i34 = i38;
                                                                        } else {
                                                                            if (!z48) {
                                                                                launchActivity5.x0(i35, str117, str118, str119, str120, str121, str122, str123, str124, str125, str126, str127, str128, z45, num12, l11, l12, num13, str129, hashMap4, str130, str131, str132, str133, tL_wallPaper4, str134, str135, str136, str137, z46, str138, z47 ? 1 : 0, i36, str139, str140, str141, str146, str147, c01Var7, z48, i37, i38, i39, z49, str142, user3, kz5Var8, false, false, z50, z51, z52, z53, z54, str143, z55);
                                                                                return;
                                                                            }
                                                                            c01Var6 = c01Var7;
                                                                            user2 = user3;
                                                                            str115 = str142;
                                                                            z44 = z49;
                                                                            i33 = i39;
                                                                            i34 = i38;
                                                                        }
                                                                        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                                                                        d Q = LaunchActivity.Q();
                                                                        final TLRPC.User user4 = user2;
                                                                        final c01 c01Var8 = c01Var6;
                                                                        final int i42 = z47 ? 1 : 0;
                                                                        ij.m(Q, atomicBoolean, user4, new Runnable() { // from class: sy5
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                String str148 = LaunchActivity.C1;
                                                                                LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                                int i43 = launchActivity6.P;
                                                                                Long l14 = l13;
                                                                                bue.c(i43, l14.longValue());
                                                                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                                                                tL_attachMenuBot2.inactive = false;
                                                                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                tL_attachMenuBot2.request_write_access = !atomicBoolean2.get();
                                                                                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                int i44 = i35;
                                                                                na7 q12 = na7.q1(i44);
                                                                                tL_messages_toggleBotInAttachMenu.bot = q12.o1(q12.V1(l14));
                                                                                tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean2.get();
                                                                                ConnectionsManager.getInstance(i44).sendRequest(tL_messages_toggleBotInAttachMenu, new vv0(i44, (byte) 2), 66);
                                                                                launchActivity6.x0(i44, str117, str118, str119, str120, str121, str122, str123, str124, str125, str126, str127, str128, z45, num12, l11, l12, num13, str129, hashMap4, str130, str131, str132, str133, tL_wallPaper4, str134, str135, str136, str137, z46, str138, i42 ? 1 : 0, i36, str139, str140, str141, str146, str147, c01Var8, z48, i37, i34, i33, z44, str115, user4, kz5Var8, false, false, z50, z51, z52, z53, z54, str143, z55);
                                                                            }
                                                                        });
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    });
                                                    return;
                                                }
                                                str57 = str57;
                                            } else {
                                                str50 = str58;
                                            }
                                            launchActivity3.x0(i23, str52, str57, str50, str59, str60, str61, str62, str63, str64, str65, str66, str67, z22, num6, l6, l7, num7, str53, hashMap2, str68, str69, str70, str71, tL_wallPaper2, str72, str73, str74, str54, z21, str55, z23 ? 1 : 0, i24, str75, str76, str77, str56, str82, c01Var4, z24, i20, i21, i25, z25, str80, V1, kz5Var6, false, false, z26, z27, z28, z29, z30, str81, z31);
                                            return;
                                        }
                                        str38 = str61;
                                        str39 = str63;
                                        str40 = str67;
                                        str41 = str58;
                                        launchActivity = launchActivity3;
                                        str37 = str53;
                                        kz5Var3 = kz5Var6;
                                        z14 = z22;
                                        str36 = str82;
                                        i11 = i25;
                                        str43 = str62;
                                        str42 = str64;
                                        c01Var3 = c01Var4;
                                        str44 = str59;
                                        i10 = i23;
                                        if (z25) {
                                            i12 = i10;
                                            str45 = str60;
                                        } else {
                                            i12 = i10;
                                            str45 = str60;
                                            if (hc2.R(na7.q1(i10).K0(Long.valueOf(-l5.longValue())))) {
                                                launchActivity.w0(l5, kz5Var3, c01Var3, null);
                                                return;
                                            }
                                        }
                                        if (str36 != null) {
                                            if (str75 == null || str76 != null) {
                                                LaunchActivity launchActivity4 = launchActivity;
                                                if (num6 != null) {
                                                    if (num7 == null && l7 == null) {
                                                        launchActivity2 = launchActivity4;
                                                        arrayList3 = arrayList5;
                                                        num4 = num6;
                                                        l3 = l7;
                                                        i13 = i12;
                                                        kz5Var4 = kz5Var3;
                                                        final kz5 kz5Var7 = kz5Var4;
                                                        if (str37 == null) {
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putBoolean("onlySelect", true);
                                                            bundle2.putBoolean("cantSendToChannels", true);
                                                            bundle2.putInt("dialogsType", 1);
                                                            bundle2.putString("selectAlertString", k96.M0(2131745432, null));
                                                            bundle2.putString("selectAlertStringGroup", k96.M0(2131745433, null));
                                                            cj3 cj3Var2 = new cj3(bundle2);
                                                            cj3Var2.E2 = new xx5(launchActivity2, str37, i13, na7.q1(i13).V1(l5));
                                                            if (gl.O1()) {
                                                                z18 = !launchActivity2.q0.getFragmentStack().isEmpty() && (launchActivity2.q0.getFragmentStack().get(launchActivity2.q0.getFragmentStack().size() + (-1)) instanceof ah6);
                                                                z17 = true;
                                                            } else {
                                                                z17 = true;
                                                                z18 = launchActivity2.p0.getFragmentStack().size() > 1 && (launchActivity2.p0.getFragmentStack().get(launchActivity2.p0.getFragmentStack().size() - 1) instanceof ah6);
                                                            }
                                                            ((ActionBarLayout) launchActivity2.N()).U(cj3Var2, z18, z17);
                                                            if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                                                                SecretMediaViewer.d().c(false, false);
                                                            } else if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
                                                                PhotoViewer.r0().B(false, true);
                                                            } else if (o.F() && o.u().W) {
                                                                o.u().l(false, true);
                                                            }
                                                            t7b.v();
                                                            h75 h75Var = h75.s5;
                                                            if (h75Var != null) {
                                                                h75Var.dismiss();
                                                            }
                                                            on9 on9Var = on9.Q0;
                                                            if (on9Var != null) {
                                                                on9Var.dismiss();
                                                            }
                                                            if (gl.O1()) {
                                                                launchActivity2.p0.W(true, true);
                                                                launchActivity2.r0.W(true, true);
                                                            }
                                                            kz5Var2 = kz5Var7;
                                                        } else if (str38 == null && str43 == null) {
                                                            Bundle bundle3 = new Bundle();
                                                            TLRPC.User V12 = na7.q1(i13).V1(l5);
                                                            final String str83 = str37;
                                                            if (l5.longValue() < 0) {
                                                                final LaunchActivity launchActivity5 = launchActivity2;
                                                                i14 = i13;
                                                                final Integer num9 = num4;
                                                                final TLRPC.Chat K03 = na7.q1(i13).K0(Long.valueOf(-l5.longValue()));
                                                                if (!z31 || K03.linked_monoforum_id == 0) {
                                                                    num5 = num9;
                                                                    kz5Var5 = kz5Var7;
                                                                    str46 = str54;
                                                                    str47 = str55;
                                                                    i15 = i24;
                                                                    i16 = i11;
                                                                    str48 = str45;
                                                                    launchActivity2 = launchActivity5;
                                                                    l4 = l5;
                                                                    bArr2 = bArr3;
                                                                    bundle3.putLong("chat_id", -l4.longValue());
                                                                    j = l4.longValue();
                                                                } else {
                                                                    final String str84 = str39;
                                                                    final String str85 = str44;
                                                                    if (na7.q1(i14).K0(Long.valueOf(K03.linked_monoforum_id)) == null) {
                                                                        TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                                                                        tL_channels_getFullChannel.channel = na7.g1(K03);
                                                                        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(i14);
                                                                        final String str86 = str36;
                                                                        final String str87 = str40;
                                                                        final String str88 = str45;
                                                                        final c01 c01Var5 = c01Var3;
                                                                        final String str89 = str41;
                                                                        final int i27 = z23 ? 1 : 0;
                                                                        connectionsManager3.sendRequest(tL_channels_getFullChannel, new RequestDelegate() { // from class: zx5
                                                                            @Override // org.telegram.tgnet.RequestDelegate
                                                                            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                                                String str90 = LaunchActivity.C1;
                                                                                final LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                                final int i28 = i14;
                                                                                final TLRPC.Chat chat2 = K03;
                                                                                final kz5 kz5Var8 = kz5Var7;
                                                                                final String str91 = str52;
                                                                                final String str92 = str57;
                                                                                final String str93 = str89;
                                                                                final String str94 = str85;
                                                                                final String str95 = str88;
                                                                                final String str96 = str38;
                                                                                final String str97 = str43;
                                                                                final String str98 = str84;
                                                                                final String str99 = str42;
                                                                                final String str100 = str65;
                                                                                final String str101 = str66;
                                                                                final String str102 = str87;
                                                                                final boolean z32 = z14;
                                                                                final Integer num10 = num9;
                                                                                final Long l8 = l6;
                                                                                final Long l9 = l3;
                                                                                final Integer num11 = num7;
                                                                                final String str103 = str83;
                                                                                final HashMap hashMap3 = hashMap2;
                                                                                final String str104 = str68;
                                                                                final String str105 = str69;
                                                                                final String str106 = str70;
                                                                                final String str107 = str71;
                                                                                final TLRPC.TL_wallPaper tL_wallPaper3 = tL_wallPaper2;
                                                                                final String str108 = str72;
                                                                                final String str109 = str73;
                                                                                final String str110 = str74;
                                                                                final String str111 = str54;
                                                                                final boolean z33 = z21;
                                                                                final String str112 = str55;
                                                                                boolean z34 = i27;
                                                                                final int i29 = i24;
                                                                                final String str113 = str75;
                                                                                final String str114 = str76;
                                                                                final String str115 = str77;
                                                                                final String str116 = str56;
                                                                                final String str117 = str86;
                                                                                final c01 c01Var6 = c01Var5;
                                                                                final boolean z35 = z24;
                                                                                final int i30 = i20;
                                                                                final boolean z36 = z20;
                                                                                final int i31 = i21;
                                                                                final int i32 = i11;
                                                                                final String str118 = str78;
                                                                                final String str119 = str79;
                                                                                final boolean z37 = z25;
                                                                                final String str120 = str80;
                                                                                final boolean z38 = z26;
                                                                                final boolean z39 = z27;
                                                                                final boolean z40 = z28;
                                                                                final boolean z41 = z29;
                                                                                final boolean z42 = z30;
                                                                                final String str121 = str81;
                                                                                final Integer num12 = num8;
                                                                                final boolean z43 = z31;
                                                                                final byte[] bArr4 = bArr3;
                                                                                final int i33 = z34 ? 1 : 0;
                                                                                gl.d3(new Runnable() { // from class: hy5
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        String str122 = LaunchActivity.C1;
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        boolean z44 = tLObject2 instanceof TLRPC.TL_messages_chatFull;
                                                                                        kz5 kz5Var9 = kz5Var8;
                                                                                        if (!z44) {
                                                                                            try {
                                                                                                kz5Var9.run();
                                                                                                return;
                                                                                            } catch (Exception e3) {
                                                                                                fa4.g(e3, true);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject2;
                                                                                        int i34 = i28;
                                                                                        na7.q1(i34).a4(tL_messages_chatFull.users, false);
                                                                                        na7.q1(i34).U3(tL_messages_chatFull.chats, false);
                                                                                        ad7.Y(i34).j1(tL_messages_chatFull.users, tL_messages_chatFull.chats, false, true);
                                                                                        if (na7.q1(i34).K0(Long.valueOf(chat2.linked_monoforum_id)) == null) {
                                                                                            try {
                                                                                                kz5Var9.run();
                                                                                                return;
                                                                                            } catch (Exception e4) {
                                                                                                fa4.g(e4, true);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        LaunchActivity launchActivity7 = LaunchActivity.this;
                                                                                        String str123 = str91;
                                                                                        String str124 = str92;
                                                                                        String str125 = str93;
                                                                                        String str126 = str94;
                                                                                        String str127 = str95;
                                                                                        String str128 = str96;
                                                                                        String str129 = str97;
                                                                                        String str130 = str98;
                                                                                        String str131 = str99;
                                                                                        String str132 = str100;
                                                                                        String str133 = str101;
                                                                                        String str134 = str102;
                                                                                        boolean z45 = z32;
                                                                                        Integer num13 = num10;
                                                                                        Long l10 = l8;
                                                                                        Long l11 = l9;
                                                                                        Integer num14 = num11;
                                                                                        String str135 = str103;
                                                                                        HashMap hashMap4 = hashMap3;
                                                                                        String str136 = str104;
                                                                                        String str137 = str105;
                                                                                        String str138 = str106;
                                                                                        String str139 = str107;
                                                                                        TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper3;
                                                                                        String str140 = str108;
                                                                                        String str141 = str109;
                                                                                        String str142 = str110;
                                                                                        String str143 = str111;
                                                                                        boolean z46 = z33;
                                                                                        String str144 = str112;
                                                                                        boolean z47 = i33;
                                                                                        launchActivity7.B0(i34, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z45, num13, l10, l11, num14, str135, hashMap4, str136, str137, str138, str139, tL_wallPaper4, str140, str141, str142, str143, z46, str144, z47 ? 1 : 0, i29, str113, str114, str115, str116, str117, c01Var6, z35, i30, z36, i31, i32, str118, str119, z37, str120, z38, z39, z40, z41, z42, str121, num12, z43, bArr4);
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        return;
                                                                    }
                                                                    num5 = num9;
                                                                    kz5Var5 = kz5Var7;
                                                                    str46 = str54;
                                                                    str47 = str55;
                                                                    i15 = i24;
                                                                    i16 = i11;
                                                                    str48 = str45;
                                                                    launchActivity2 = launchActivity5;
                                                                    l4 = l5;
                                                                    bArr2 = bArr3;
                                                                    bundle3.putLong("chat_id", K03.linked_monoforum_id);
                                                                    j = -K03.linked_monoforum_id;
                                                                }
                                                                kz5Var2 = kz5Var5;
                                                            } else {
                                                                i14 = i13;
                                                                num5 = num4;
                                                                String str90 = str40;
                                                                str46 = str54;
                                                                str47 = str55;
                                                                i15 = i24;
                                                                i16 = i11;
                                                                str48 = str45;
                                                                l4 = l5;
                                                                kz5Var2 = kz5Var7;
                                                                bArr2 = bArr3;
                                                                bundle3.putLong("user_id", l4.longValue());
                                                                long longValue4 = l4.longValue();
                                                                if (str90 != null) {
                                                                    if (str90.startsWith("@")) {
                                                                        str90 = " ".concat(str90);
                                                                    }
                                                                    bundle3.putString("start_text", str90);
                                                                }
                                                                j = longValue4;
                                                            }
                                                            if (str48 == null || V12 == null || !V12.bot) {
                                                                z15 = false;
                                                            } else {
                                                                bundle3.putString("botUser", str48);
                                                                z15 = true;
                                                            }
                                                            if (launchActivity2.X0) {
                                                                launchActivity2.X0 = false;
                                                                bundle3.putBoolean("premium_bot", true);
                                                            }
                                                            if (num5 != null) {
                                                                bundle3.putInt("message_id", num5.intValue());
                                                                if (num8 != null) {
                                                                    bundle3.putInt("task_id", num8.intValue());
                                                                }
                                                                if (bArr2 != null) {
                                                                    bundle3.putByteArray("poll_option_id", bArr2);
                                                                }
                                                            }
                                                            if (str46 != null) {
                                                                bundle3.putString("voicechat", str46);
                                                            }
                                                            byte[] bArr4 = bArr2;
                                                            if (z21) {
                                                                bundle3.putBoolean("videochat", true);
                                                            }
                                                            if (str47 != null) {
                                                                bundle3.putString("livestream", str47);
                                                            }
                                                            if (i15 >= 0) {
                                                                bundle3.putInt("video_timestamp", i15);
                                                            }
                                                            if (str76 != null) {
                                                                str49 = str76;
                                                                bundle3.putString("attach_bot", str49);
                                                            } else {
                                                                str49 = str76;
                                                            }
                                                            if (str75 != null) {
                                                                z16 = z15;
                                                                bundle3.putString("attach_bot_start_command", str75);
                                                            } else {
                                                                z16 = z15;
                                                            }
                                                            d dVar4 = (arrayList3.isEmpty() || str46 != null) ? null : (d) b00.f(1, arrayList3);
                                                            if (dVar4 == null || na7.q1(i14).A(bundle3, dVar4, null, null)) {
                                                                boolean z32 = (dVar4 instanceof mu1) && ((mu1) dVar4).a() == j;
                                                                if (z16 && z32) {
                                                                    ArrayList arrayList6 = new ArrayList();
                                                                    ArrayList<zf0> arrayList7 = dVar4.sheetsStack;
                                                                    if (arrayList7 != null) {
                                                                        arrayList6.addAll(arrayList7);
                                                                    }
                                                                    if ((dVar4.getParentLayout() instanceof ActionBarLayout) && (v = ((ActionBarLayout) dVar4.getParentLayout()).v()) != null && v != dVar4 && (arrayList4 = v.sheetsStack) != null) {
                                                                        arrayList6.addAll(arrayList4);
                                                                    }
                                                                    int size = arrayList6.size();
                                                                    int i28 = 0;
                                                                    while (i28 < size) {
                                                                        Object obj2 = arrayList6.get(i28);
                                                                        i28++;
                                                                    }
                                                                    ArrayList arrayList8 = new ArrayList(ow0.b1);
                                                                    int size2 = arrayList8.size();
                                                                    int i29 = 0;
                                                                    while (i29 < size2) {
                                                                        Object obj3 = arrayList8.get(i29);
                                                                        i29++;
                                                                        ow0 ow0Var = (ow0) obj3;
                                                                        if (ow0Var.J == j) {
                                                                            ow0Var.m(true);
                                                                        }
                                                                    }
                                                                    mu1 mu1Var3 = (mu1) dVar4;
                                                                    if (mu1Var3.x8 != 0) {
                                                                        mu1Var3.getMessagesController().D4(str48, mu1Var3.f);
                                                                    } else {
                                                                        mu1Var3.e7 = true;
                                                                        na7 messagesController = mu1Var3.getMessagesController();
                                                                        TLRPC.User user = mu1Var3.f;
                                                                        mu1Var3.w8 = str48;
                                                                        messagesController.D4(str48, user);
                                                                        mu1Var3.Bc(false);
                                                                    }
                                                                } else {
                                                                    if (str49 == null || !z32) {
                                                                        long j3 = -j;
                                                                        TLRPC.Chat K04 = na7.q1(launchActivity2.P).K0(Long.valueOf(j3));
                                                                        if (z29 || i16 > 0) {
                                                                            try {
                                                                                kz5Var2.run();
                                                                            } catch (Exception e3) {
                                                                                fa4.g(e3, true);
                                                                            }
                                                                            if (launchActivity2.isFinishing()) {
                                                                                return;
                                                                            }
                                                                            Bundle bundle4 = new Bundle();
                                                                            if (l4.longValue() < 0) {
                                                                                bundle4.putLong("chat_id", -l4.longValue());
                                                                            } else {
                                                                                bundle4.putLong("user_id", l4.longValue());
                                                                            }
                                                                            if (i16 > 0) {
                                                                                bundle4.putBoolean("open_gifts", true);
                                                                                bundle4.putInt("open_gifts_collection", i16);
                                                                                if (l4.longValue() == y6c.h(launchActivity2.P).e()) {
                                                                                    bundle4.putBoolean("my_profile", true);
                                                                                }
                                                                            }
                                                                            ((ActionBarLayout) launchActivity2.N()).S(new ProfileActivity(bundle4, null));
                                                                            return;
                                                                        }
                                                                        if (K04 == null || !K04.forum) {
                                                                            String str91 = str47;
                                                                            long j4 = j;
                                                                            Integer num10 = num5;
                                                                            na7.q1(i14).p0(j4, num10 == null ? 0 : num10.intValue(), new rz5(launchActivity2, kz5Var2, str91, dVar4, j4, num10, bundle3));
                                                                            return;
                                                                        }
                                                                        Long valueOf = (l3 != null || num5 == null) ? l3 : Long.valueOf(num5.intValue());
                                                                        if (valueOf != null && valueOf.longValue() != 0) {
                                                                            launchActivity2.l0(j, num5, null, num8, bArr4, new ay5(kz5Var2, (byte) 0), 0, -1);
                                                                            return;
                                                                        }
                                                                        kz5 kz5Var8 = kz5Var2;
                                                                        Bundle k = ls6.k(j3, "chat_id");
                                                                        if (str46 != null) {
                                                                            k.putString("voicechat", str46);
                                                                        }
                                                                        if (z21) {
                                                                            k.putBoolean("videochat", true);
                                                                        }
                                                                        launchActivity2.t0(qvb.F0(launchActivity2, k));
                                                                        try {
                                                                            kz5Var8.run();
                                                                            return;
                                                                        } catch (Exception e4) {
                                                                            fa4.g(e4, true);
                                                                            return;
                                                                        }
                                                                    }
                                                                    mu1 mu1Var4 = (mu1) dVar4;
                                                                    mu1Var4.getClass();
                                                                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                                                    tL_contacts_resolveUsername.username = str49;
                                                                    mu1Var4.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new xk1(mu1Var4, (byte) 0));
                                                                }
                                                            }
                                                        } else {
                                                            int i30 = i13;
                                                            kz5Var2 = kz5Var7;
                                                            TLRPC.User V13 = na7.q1(i30).V1(l5);
                                                            if (V13 == null || (V13.bot && V13.bot_nochats)) {
                                                                try {
                                                                    if (arrayList3.isEmpty()) {
                                                                        return;
                                                                    }
                                                                    u21.b0((d) arrayList3.get(arrayList3.size() - 1)).t(k96.M0(2131753105, null), null).j();
                                                                    return;
                                                                } catch (Exception e5) {
                                                                    fa4.g(e5, true);
                                                                    return;
                                                                }
                                                            }
                                                            Bundle j5 = tb4.j(2, "onlySelect", "dialogsType", true);
                                                            j5.putBoolean("resetDelegate", false);
                                                            j5.putBoolean("closeFragment", false);
                                                            j5.putBoolean("allowGroups", str38 != null);
                                                            j5.putBoolean("allowChannels", str43 != null);
                                                            String str92 = TextUtils.isEmpty(str38) ? TextUtils.isEmpty(str43) ? null : str43 : str38;
                                                            cj3 cj3Var3 = new cj3(j5);
                                                            cj3Var3.E2 = new yx5(launchActivity2, i30, V13, str39, str92, cj3Var3);
                                                            launchActivity2.t0(cj3Var3);
                                                        }
                                                    } else if (l5.longValue() < 0) {
                                                        kz5 kz5Var9 = kz5Var3;
                                                        int z0 = launchActivity4.z0(i12, kz5Var9, num6, num7, l7, null, null, na7.q1(i12).K0(Long.valueOf(-l5.longValue())), null, null, 0, -1);
                                                        iArr2[0] = z0;
                                                        if (z0 != 0) {
                                                            return;
                                                        }
                                                        z12 = true;
                                                        kz5Var2 = kz5Var9;
                                                    }
                                                }
                                                kz5Var4 = kz5Var3;
                                                launchActivity2 = launchActivity4;
                                                arrayList3 = arrayList5;
                                                num4 = num6;
                                                l3 = l7;
                                                i13 = i12;
                                                final kz5 kz5Var72 = kz5Var4;
                                                if (str37 == null) {
                                                }
                                            } else {
                                                TLRPC.User V14 = na7.q1(i12).V1(l5);
                                                if (V14 == null || !V14.bot) {
                                                    z19 = true;
                                                    r13 = 0;
                                                    b0 = u21.b0((d) b00.f(1, arrayList5));
                                                    i17 = 2131752974;
                                                } else if (V14.bot_attach_menu) {
                                                    long longValue5 = l5.longValue();
                                                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot2 = new TLRPC.TL_messages_getAttachMenuBot();
                                                    na7 q12 = na7.q1(i12);
                                                    tL_messages_getAttachMenuBot2.bot = q12.o1(q12.V1(l5));
                                                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getAttachMenuBot2, new pr0(launchActivity, i12, str36, str77, V14, str75, longValue5));
                                                    z19 = true;
                                                    kz5Var2 = kz5Var3;
                                                    z12 = z19;
                                                } else {
                                                    z19 = true;
                                                    b0 = u21.b0((d) b00.f(1, arrayList5));
                                                    i17 = 2131753106;
                                                    r13 = 0;
                                                }
                                                yjb.x(r13, i17, b0, r13);
                                                kz5Var2 = kz5Var3;
                                                z12 = z19;
                                            }
                                            kz5Var2.run();
                                            return;
                                        }
                                        TLRPC.User V15 = na7.q1(i12).V1(l5);
                                        if (V15 != null && V15.bot) {
                                            na7.q1(i12).y3(null, V15, str36, 0, c01Var3, z26, z27);
                                        }
                                        kz5Var2 = kz5Var3;
                                        z12 = true;
                                        kz5Var2.run();
                                        return;
                                    }
                                    str38 = str61;
                                    str39 = str63;
                                    str40 = str67;
                                    str41 = str58;
                                    launchActivity = launchActivity3;
                                    str37 = str53;
                                    z14 = z22;
                                    str36 = str82;
                                    str43 = str62;
                                    str42 = str64;
                                    c01Var3 = c01Var4;
                                }
                                str44 = str59;
                                i10 = i23;
                                kz5Var3 = kz5Var6;
                                i11 = i25;
                                if (z25) {
                                }
                                if (str36 != null) {
                                }
                                z12 = true;
                                kz5Var2.run();
                                return;
                            }
                            kz5Var2.run();
                            return;
                        } catch (Exception e6) {
                            fa4.g(e6, z12);
                            return;
                        }
                        kz5Var2 = kz5Var6;
                        d Q = LaunchActivity.Q();
                        if (Q != null) {
                            if (Q instanceof mu1) {
                                ((mu1) Q).Db();
                            }
                            Typeface typeface = gl.a;
                            try {
                                Double.parseDouble(str52);
                                z13 = true;
                            } catch (NumberFormatException unused2) {
                                z13 = false;
                            }
                            if (z13) {
                                u21.b0(Q).t(k96.M0(2131747989, null), null).j();
                            } else {
                                u21.b0(Q).t(k96.M0(2131747942, null), null).j();
                            }
                        }
                        z12 = true;
                    }
                };
                c01Var2 = c01Var2;
                Y1.a(str, str31, p8cVar);
                iArr = iArr2;
                hdVar = hdVar4;
                b = 0;
                hb5Var = null;
                if (iArr[b] != 0) {
                }
            }
        }
        i7 = i;
        b = 0;
        iArr = iArr2;
        hb5Var = null;
        hdVar = hdVar4;
        if (iArr[b] != 0) {
        }
    }

    public final void C() {
        if (Build.VERSION.SDK_INT >= 24) {
            ip4 ip4Var = this.i1;
            if (ip4Var == null && gba.o) {
                ip4Var = ip4.a(this, this.v0);
                this.i1 = ip4Var;
            }
            if (ip4Var == null || gba.o) {
                return;
            }
            ip4Var.b();
            this.i1 = null;
        }
    }

    public final void D(int i) {
        K1 = this;
        Set set = s60.a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - gba.G) >= 86400) {
            gba.G = currentTimeMillis;
            Utilities.f.c(new eg(currentTimeMillis, (Object) ba4.j(4), (byte) 5));
        }
        if (w01.a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - gba.H) >= 3600) {
                gba.H = currentTimeMillis2;
                Utilities.f.c(new xv0(currentTimeMillis2, (byte) 11));
            }
        }
        if ((Build.VERSION.SDK_INT < 26 || i != 0) && !this.w1) {
            Utilities.e.d(new sv1(this, i, (byte) 2), 2000L);
        }
    }

    public final void D0(int i) {
        this.y0.setInternalNavigationBarColor(i);
        qx0 O = O();
        if (O != null) {
            O.setNavigationBarColor(i);
        }
    }

    public final void E0() {
        int indexOfChild = this.y0.indexOfChild(this.y0.indexOfChild(this.s0) != -1 ? this.s0 : this.p0.getView());
        if (indexOfChild != -1) {
            this.y0.removeViewAt(indexOfChild);
        }
        if (gl.O1()) {
            getWindow().setSoftInputMode(16);
            zz5 zz5Var = new zz5(this, this);
            this.s0 = zz5Var;
            mq3 mq3Var = this.y0;
            if (indexOfChild != -1) {
                mq3Var.addView(zz5Var, indexOfChild, nme.c(-1.0f, -1));
            } else {
                mq3Var.addView(zz5Var, nme.c(-1.0f, -1));
            }
            n81 n81Var = new n81(this, null);
            this.u0 = n81Var;
            n81Var.setOccupyStatusBar(false);
            this.u0.U(bkb.r0());
            this.s0.addView(this.u0, nme.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.p0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.p0.getView());
            }
            this.s0.addView(this.p0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.r0 = actionBarLayout;
            actionBarLayout.U0 = true;
            actionBarLayout.setFragmentStack(this.g0);
            this.r0.setDelegate(this);
            this.s0.addView(this.r0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.t0 = frameLayout;
            ArrayList arrayList = this.f0;
            frameLayout.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.t0.setBackgroundColor(1056964608);
            this.s0.addView(this.t0);
            byte b = 9;
            this.t0.setOnTouchListener(new a7(this, b));
            this.t0.setOnClickListener(new x00(b));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.q0 = actionBarLayout2;
            actionBarLayout2.T0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.q0.setBackgroundView(this.t0);
            this.q0.setUseAlphaAnimations(true);
            this.q0.setFragmentStack(arrayList);
            this.q0.setDelegate(this);
            this.q0.setDrawerLayoutContainer(this.y0);
            ViewGroup view = this.q0.getView();
            view.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.s0.addView(view);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.p0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.p0.getView());
            }
            this.p0.setFragmentStack(this.e0);
            mq3 mq3Var2 = this.y0;
            ActionBarLayout actionBarLayout3 = this.p0;
            if (indexOfChild != -1) {
                mq3Var2.addView(actionBarLayout3.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                mq3Var2.addView(actionBarLayout3.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        uge.a(this, gba.u1, false);
    }

    @Override // wi3
    public final boolean F() {
        ArrayList arrayList = this.V;
        return (arrayList != null && arrayList.size() == 1) || this.S != null;
    }

    public final hd F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            hd o = alertDialog$Builder.o();
            o.setCanceledOnTouchOutside(true);
            o.setOnDismissListener(new cf(this, o, (byte) 10));
            this.D0.add(o);
            return o;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public final void G() {
        if (!gl.O1() || this.r0 == null) {
            return;
        }
        Boolean bool = gl.L;
        if (bool != null) {
            if (bool.booleanValue() != (org.telegram.messenger.a.b != null && org.telegram.messenger.a.b.getResources().getBoolean(R.bool.isTablet))) {
                return;
            }
        }
        if (gl.E || (gl.N1() && getResources().getConfiguration().orientation != 2)) {
            this.N0 = true;
            List<org.telegram.ui.ActionBar.d> fragmentStack = this.r0.getFragmentStack();
            if (!fragmentStack.isEmpty()) {
                while (fragmentStack.size() > 0) {
                    org.telegram.ui.ActionBar.d dVar = fragmentStack.get(0);
                    if (dVar instanceof mu1) {
                        mu1 mu1Var = (mu1) dVar;
                        mu1Var.m5 = true;
                        mu1Var.n5 = true;
                    }
                    dVar.onPause();
                    dVar.onFragmentDestroy();
                    dVar.setParentLayout(null);
                    fragmentStack.remove(dVar);
                    this.p0.b(-1, dVar);
                }
                aw7 aw7Var = this.z0;
                if (aw7Var == null || aw7Var.b.getVisibility() != 0) {
                    this.p0.W(true, true);
                }
            }
            this.r0.getView().setVisibility(8);
            this.u0.setVisibility(this.p0.getFragmentStack().isEmpty() ? 0 : 8);
            return;
        }
        this.N0 = false;
        List<org.telegram.ui.ActionBar.d> fragmentStack2 = this.p0.getFragmentStack();
        if (fragmentStack2.size() >= 2) {
            while (1 < fragmentStack2.size()) {
                org.telegram.ui.ActionBar.d dVar2 = fragmentStack2.get(1);
                if (dVar2 instanceof mu1) {
                    mu1 mu1Var2 = (mu1) dVar2;
                    mu1Var2.m5 = true;
                    mu1Var2.n5 = true;
                }
                dVar2.onPause();
                dVar2.onFragmentDestroy();
                dVar2.setParentLayout(null);
                fragmentStack2.remove(dVar2);
                this.r0.b(-1, dVar2);
            }
            aw7 aw7Var2 = this.z0;
            if (aw7Var2 == null || aw7Var2.b.getVisibility() != 0) {
                this.p0.W(true, true);
                this.r0.W(true, true);
            }
        }
        this.r0.getView().setVisibility(this.r0.getFragmentStack().isEmpty() ? 8 : 0);
        this.u0.setVisibility(this.r0.getFragmentStack().isEmpty() ? 0 : 8);
    }

    public final void H(boolean z, boolean z2, boolean z3) {
        ku1 ku1Var;
        boolean z4;
        ArrayList arrayList = this.e0;
        boolean z5 = true;
        org.telegram.ui.ActionBar.d dVar = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.d) b00.f(1, arrayList) : null;
        char c = 2;
        if (dVar != null && (dVar.isRemovingFromStack() || dVar.isInPreviewMode())) {
            dVar = arrayList.size() > 1 ? (org.telegram.ui.ActionBar.d) b00.f(2, arrayList) : null;
        }
        if (dVar != null) {
            dVar.hasForceLightStatusBar();
        }
        if (z2) {
            if (dVar != null) {
                z4 = dVar.isLightStatusBar();
                if (dVar.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) dVar.getParentLayout();
                    if (actionBarLayout.v() == null || actionBarLayout.v().getLastSheet() == null) {
                        ArrayList<zf0> arrayList2 = dVar.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            zf0 zf0Var = (zf0) b00.f(1, dVar.sheetsStack);
                            if (zf0Var.t()) {
                                z4 = zf0Var.f();
                            }
                        }
                    } else {
                        zf0 lastSheet = actionBarLayout.v().getLastSheet();
                        if (lastSheet.t()) {
                            z4 = lastSheet.f();
                        }
                    }
                }
            } else {
                z4 = bm2.h(bkb.w0(null, bkb.r8, true)) > 0.699999988079071d;
            }
            gl.l3(this, z4);
        }
        if (Build.VERSION.SDK_INT >= 26 && z3 && (!z || dVar == null || !dVar.isInPreviewMode())) {
            int w0 = (dVar == null || !z) ? bkb.w0(null, bkb.Z6, true) : dVar.getNavigationBarColor();
            if (dVar instanceof mu1) {
                mu1 mu1Var = (mu1) dVar;
                if (!mu1Var.ic || (mu1Var.w.s != 1 && ((ku1Var = mu1Var.Ba) == null || !ku1Var.q))) {
                    c = 1;
                }
            } else {
                c = 0;
            }
            if (O() != null && O().I > 0) {
                c = 0;
            }
            if (this.p0.v() != null) {
                x14 v = this.p0.v();
                if (v.sheetsStack != null) {
                    for (int i = 0; i < v.sheetsStack.size(); i++) {
                        zf0 zf0Var2 = v.sheetsStack.get(i);
                        if (zf0Var2.z()) {
                            w0 = zf0Var2.e(w0);
                            c = 0;
                        }
                    }
                }
            }
            Iterator it = ow0.b1.iterator();
            while (it.hasNext()) {
                w0 = ((ow0) it.next()).e(w0);
                c = 0;
            }
            D0(w0);
            if ((c != 0 || gl.B(w0) < 0.721f) && c != 1) {
                z5 = false;
            }
            gl.i3(this, z5);
        }
        if (z2) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void H0(nq4 nq4Var) {
        org.telegram.ui.ActionBar.d dVar;
        ArrayList arrayList = this.f0;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.g0;
            if (arrayList2.isEmpty()) {
                ArrayList arrayList3 = this.e0;
                dVar = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.d) b00.f(1, arrayList3) : null;
            } else {
                dVar = (org.telegram.ui.ActionBar.d) b00.f(1, arrayList2);
            }
        } else {
            dVar = (org.telegram.ui.ActionBar.d) b00.f(1, arrayList);
        }
        if (u21.a(dVar)) {
            nq4Var.a(u21.b0(dVar)).j();
        }
    }

    public final void I(boolean z) {
        fc2 fc2Var;
        long j;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = false;
        if (sharedInstance == null || (fc2Var = sharedInstance.groupCall) == null) {
            this.m0 = false;
            return;
        }
        boolean z3 = this.m0;
        TLRPC.InputPeer groupCallPeer = sharedInstance.getGroupCallPeer();
        if (groupCallPeer != null) {
            j = groupCallPeer.user_id;
            if (j == 0) {
                long j2 = groupCallPeer.chat_id;
                if (j2 == 0) {
                    j2 = groupCallPeer.channel_id;
                }
                j = -j2;
            }
        } else {
            j = y6c.h(this.P).n;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(j);
        boolean z4 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted) ? false : true;
        if (z4 && groupCallParticipant.raise_hand_rating != 0) {
            z2 = true;
        }
        this.m0 = z2;
        if (z || !z3 || z2 || z4 || h75.s5 != null) {
            return;
        }
        M0(38);
    }

    public final void I0() {
        byte b;
        i96 i96Var;
        if (y6c.h(this.P).o()) {
            final byte b2 = 1;
            try {
                if (this.H0 || org.telegram.messenger.a.x) {
                    return;
                }
                String string = na7.c1().getString("language_showed2", "");
                final String str = na7.q1(this.P).s3;
                if (string.equals(str)) {
                    if (w01.a) {
                        fa4.b("alert already showed for ".concat(string));
                        return;
                    }
                    return;
                }
                final i96[] i96VarArr = new i96[2];
                byte b3 = 0;
                String str2 = str.contains("-") ? str.split("-")[0] : str;
                String str3 = "in".equals(str2) ? "id" : "iw".equals(str2) ? "he" : "jw".equals(str2) ? "jv" : null;
                int i = 0;
                while (true) {
                    if (i >= k96.D0().J.size()) {
                        b = b3;
                        break;
                    }
                    i96 i96Var2 = (i96) k96.D0().J.get(i);
                    b = b3;
                    if (i96Var2.c.equals("en")) {
                        i96VarArr[b] = i96Var2;
                    }
                    if (i96Var2.c.replace("_", "-").equals(str) || i96Var2.c.equals(str2) || i96Var2.c.equals(str3)) {
                        i96VarArr[1] = i96Var2;
                    }
                    if (i96VarArr[b] != null && i96VarArr[1] != null) {
                        break;
                    }
                    i++;
                    b3 = b;
                }
                i96 i96Var3 = i96VarArr[b];
                if (i96Var3 == null || (i96Var = i96VarArr[1]) == null || i96Var3 == i96Var) {
                    return;
                }
                if (w01.a) {
                    fa4.b("show lang alert for " + i96VarArr[b].b() + " and " + i96VarArr[1].b());
                }
                this.I0 = null;
                this.J0 = null;
                this.H0 = true;
                TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                tL_langpack_getStrings.lang_code = i96VarArr[1].c();
                tL_langpack_getStrings.keys.add("English");
                tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                final byte b4 = b;
                ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) { // from class: dz5
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        int i2 = 0;
                        switch (b4) {
                            case 0:
                                String str4 = LaunchActivity.C1;
                                final HashMap hashMap = new HashMap();
                                if (tLObject instanceof Vector) {
                                    Vector vector = (Vector) tLObject;
                                    while (i2 < vector.objects.size()) {
                                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i2);
                                        hashMap.put(langPackString.key, langPackString.value);
                                        i2++;
                                    }
                                }
                                final byte b5 = 0;
                                final LaunchActivity launchActivity = this.b;
                                final i96[] i96VarArr2 = i96VarArr;
                                final String str5 = str;
                                gl.d3(new Runnable() { // from class: ux5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b6 = b5;
                                        String str6 = str5;
                                        i96[] i96VarArr3 = i96VarArr2;
                                        HashMap hashMap2 = hashMap;
                                        LaunchActivity launchActivity2 = launchActivity;
                                        switch (b6) {
                                            case 0:
                                                String str7 = LaunchActivity.C1;
                                                launchActivity2.I0 = hashMap2;
                                                if (launchActivity2.J0 != null) {
                                                    launchActivity2.J0(i96VarArr3[1], i96VarArr3[0], str6);
                                                    break;
                                                }
                                                break;
                                            default:
                                                String str8 = LaunchActivity.C1;
                                                launchActivity2.J0 = hashMap2;
                                                if (launchActivity2.I0 != null) {
                                                    launchActivity2.J0(i96VarArr3[1], i96VarArr3[0], str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                String str6 = LaunchActivity.C1;
                                final HashMap hashMap2 = new HashMap();
                                if (tLObject instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject;
                                    while (i2 < vector2.objects.size()) {
                                        TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i2);
                                        hashMap2.put(langPackString2.key, langPackString2.value);
                                        i2++;
                                    }
                                }
                                final byte b6 = 1;
                                final LaunchActivity launchActivity2 = this.b;
                                final i96[] i96VarArr3 = i96VarArr;
                                final String str7 = str;
                                gl.d3(new Runnable() { // from class: ux5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b62 = b6;
                                        String str62 = str7;
                                        i96[] i96VarArr32 = i96VarArr3;
                                        HashMap hashMap22 = hashMap2;
                                        LaunchActivity launchActivity22 = launchActivity2;
                                        switch (b62) {
                                            case 0:
                                                String str72 = LaunchActivity.C1;
                                                launchActivity22.I0 = hashMap22;
                                                if (launchActivity22.J0 != null) {
                                                    launchActivity22.J0(i96VarArr32[1], i96VarArr32[0], str62);
                                                    break;
                                                }
                                                break;
                                            default:
                                                String str8 = LaunchActivity.C1;
                                                launchActivity22.J0 = hashMap22;
                                                if (launchActivity22.I0 != null) {
                                                    launchActivity22.J0(i96VarArr32[1], i96VarArr32[0], str62);
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
                tL_langpack_getStrings2.lang_code = i96VarArr[b4].c();
                tL_langpack_getStrings2.keys.add("English");
                tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) { // from class: dz5
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        int i2 = 0;
                        switch (b2) {
                            case 0:
                                String str4 = LaunchActivity.C1;
                                final HashMap hashMap = new HashMap();
                                if (tLObject instanceof Vector) {
                                    Vector vector = (Vector) tLObject;
                                    while (i2 < vector.objects.size()) {
                                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i2);
                                        hashMap.put(langPackString.key, langPackString.value);
                                        i2++;
                                    }
                                }
                                final byte b5 = 0;
                                final LaunchActivity launchActivity = this.b;
                                final i96[] i96VarArr2 = i96VarArr;
                                final String str5 = str;
                                gl.d3(new Runnable() { // from class: ux5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b62 = b5;
                                        String str62 = str5;
                                        i96[] i96VarArr32 = i96VarArr2;
                                        HashMap hashMap22 = hashMap;
                                        LaunchActivity launchActivity22 = launchActivity;
                                        switch (b62) {
                                            case 0:
                                                String str72 = LaunchActivity.C1;
                                                launchActivity22.I0 = hashMap22;
                                                if (launchActivity22.J0 != null) {
                                                    launchActivity22.J0(i96VarArr32[1], i96VarArr32[0], str62);
                                                    break;
                                                }
                                                break;
                                            default:
                                                String str8 = LaunchActivity.C1;
                                                launchActivity22.J0 = hashMap22;
                                                if (launchActivity22.I0 != null) {
                                                    launchActivity22.J0(i96VarArr32[1], i96VarArr32[0], str62);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                String str6 = LaunchActivity.C1;
                                final HashMap hashMap2 = new HashMap();
                                if (tLObject instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject;
                                    while (i2 < vector2.objects.size()) {
                                        TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i2);
                                        hashMap2.put(langPackString2.key, langPackString2.value);
                                        i2++;
                                    }
                                }
                                final byte b6 = 1;
                                final LaunchActivity launchActivity2 = this.b;
                                final i96[] i96VarArr3 = i96VarArr;
                                final String str7 = str;
                                gl.d3(new Runnable() { // from class: ux5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b62 = b6;
                                        String str62 = str7;
                                        i96[] i96VarArr32 = i96VarArr3;
                                        HashMap hashMap22 = hashMap2;
                                        LaunchActivity launchActivity22 = launchActivity2;
                                        switch (b62) {
                                            case 0:
                                                String str72 = LaunchActivity.C1;
                                                launchActivity22.I0 = hashMap22;
                                                if (launchActivity22.J0 != null) {
                                                    launchActivity22.J0(i96VarArr32[1], i96VarArr32[0], str62);
                                                    break;
                                                }
                                                break;
                                            default:
                                                String str8 = LaunchActivity.C1;
                                                launchActivity22.J0 = hashMap22;
                                                if (launchActivity22.I0 != null) {
                                                    launchActivity22.J0(i96VarArr32[1], i96VarArr32[0], str62);
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
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void J() {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((org.telegram.ui.ActionBar.d) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (gl.O1()) {
            ArrayList arrayList2 = this.f0;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ((org.telegram.ui.ActionBar.d) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.g0;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                ((org.telegram.ui.ActionBar.d) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[Catch: Exception -> 0x0162, TryCatch #0 {Exception -> 0x0162, blocks: (B:3:0x0008, B:6:0x0024, B:9:0x005d, B:12:0x0067, B:15:0x006f, B:18:0x0081, B:21:0x008a, B:25:0x00be, B:28:0x0088, B:31:0x00e1), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(i96 i96Var, i96 i96Var2, String str) {
        boolean z;
        boolean z2;
        int i;
        i96 i96Var3;
        i96 i96Var4;
        int i2;
        boolean z3 = true;
        try {
            this.H0 = false;
            i96 i96Var5 = i96Var;
            if (!i96Var5.j) {
                try {
                    if (!k96.D0().B.h()) {
                        z2 = false;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = T(2131752096, "ChooseYourLanguage", this.I0);
                        hdVar.T = T(2131752096, "ChooseYourLanguage", this.J0);
                        LinearLayout linearLayout = new LinearLayout(this);
                        linearLayout.setOrientation(1);
                        xw5[] xw5VarArr = new xw5[2];
                        String T = T(2131751115, "English", this.I0);
                        if (z2) {
                            i96Var3 = i96Var2;
                            i96Var4 = i96Var5;
                        } else {
                            i96Var4 = i96Var2;
                            i96Var3 = i96Var5;
                        }
                        i96[] i96VarArr = {i96Var3, i96Var4};
                        if (!z2) {
                            i96Var5 = i96Var2;
                        }
                        i96[] i96VarArr2 = {i96Var5};
                        i2 = 0;
                        for (i = 2; i2 < i; i = 2) {
                            xw5 xw5Var = new xw5(this);
                            xw5VarArr[i2] = xw5Var;
                            i96 i96Var6 = i96VarArr[i2];
                            String str2 = i96Var6 == i96Var2 ? T : null;
                            xw5Var.b.setText(str2 != null ? str2 : i96Var6.a);
                            xw5Var.c.setText(i96Var6.b);
                            xw5Var.e = i96Var6;
                            xw5Var.d = z3;
                            xw5VarArr[i2].setTag(Integer.valueOf(i2));
                            xw5 xw5Var2 = xw5VarArr[i2];
                            int i3 = bkb.H5;
                            zkb.R(xw5Var2, bkb.f0(bkb.w0(null, i3, false), 2, -1), null, zkb.M(i3), null);
                            xw5VarArr[i2].a.a(i2 == 0, false);
                            linearLayout.addView(xw5VarArr[i2], nme.o(-1, 50));
                            xw5VarArr[i2].setOnClickListener(new xf3((Object) i96VarArr2, (Object) xw5VarArr, (byte) 29));
                            i2++;
                            z3 = true;
                        }
                        xw5 xw5Var3 = new xw5(this);
                        String T2 = T(2131752095, "ChooseYourLanguageOther", this.I0);
                        String T3 = T(2131752095, "ChooseYourLanguageOther", this.J0);
                        xw5Var3.b.setText(T2);
                        xw5Var3.c.setText(T3);
                        xw5Var3.a.a(false, false);
                        xw5Var3.e = null;
                        xw5Var3.d = false;
                        int i4 = bkb.H5;
                        ff0 f0 = bkb.f0(bkb.w0(null, i4, false), 2, -1);
                        vkb M = zkb.M(i4);
                        xw5Var3.setBackground(f0);
                        zkb.j(xw5Var3, f0, null, M, null);
                        xw5Var3.setOnClickListener(new b95(this, (byte) 15));
                        linearLayout.addView(xw5Var3, nme.o(-1, 50));
                        alertDialog$Builder.n(linearLayout);
                        alertDialog$Builder.g(k96.M0(2131747638, null), new h45(this, i96VarArr2, (byte) 7));
                        this.G0 = F0(alertDialog$Builder);
                        na7.c1().edit().putString("language_showed2", str).commit();
                    }
                } catch (Exception e) {
                    e = e;
                    z = true;
                    fa4.g(e, z);
                    return;
                }
            }
            z2 = true;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            hd hdVar2 = alertDialog$Builder2.a;
            hdVar2.S = T(2131752096, "ChooseYourLanguage", this.I0);
            hdVar2.T = T(2131752096, "ChooseYourLanguage", this.J0);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            xw5[] xw5VarArr2 = new xw5[2];
            String T4 = T(2131751115, "English", this.I0);
            if (z2) {
            }
            i96[] i96VarArr3 = {i96Var3, i96Var4};
            if (!z2) {
            }
            i96[] i96VarArr22 = {i96Var5};
            i2 = 0;
            while (i2 < i) {
            }
            xw5 xw5Var32 = new xw5(this);
            String T22 = T(2131752095, "ChooseYourLanguageOther", this.I0);
            String T32 = T(2131752095, "ChooseYourLanguageOther", this.J0);
            xw5Var32.b.setText(T22);
            xw5Var32.c.setText(T32);
            xw5Var32.a.a(false, false);
            xw5Var32.e = null;
            xw5Var32.d = false;
            int i42 = bkb.H5;
            ff0 f02 = bkb.f0(bkb.w0(null, i42, false), 2, -1);
            vkb M2 = zkb.M(i42);
            xw5Var32.setBackground(f02);
            zkb.j(xw5Var32, f02, null, M2, null);
            xw5Var32.setOnClickListener(new b95(this, (byte) 15));
            linearLayout2.addView(xw5Var32, nme.o(-1, 50));
            alertDialog$Builder2.n(linearLayout2);
            alertDialog$Builder2.g(k96.M0(2131747638, null), new h45(this, i96VarArr22, (byte) 7));
            this.G0 = F0(alertDialog$Builder2);
            na7.c1().edit().putString("language_showed2", str).commit();
        } catch (Exception e2) {
            e = e2;
            z = true;
        }
    }

    public final void K0(boolean z, boolean z2, int i, int i2, mk2 mk2Var) {
        if (this.y0 == null || isFinishing()) {
            return;
        }
        if (this.z0 == null) {
            this.z0 = new aw7(this);
        }
        gba.w = true;
        int i3 = 0;
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
            PhotoViewer.r0().B(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        t7b.v();
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && k27Var.g4()) {
            MediaController.w().l(true, true, false, false);
        }
        this.z0.show();
        zv7 zv7Var = this.z0.b;
        ArrayList arrayList = this.A0;
        arrayList.isEmpty();
        zv7Var.m(z2, i, i2, new hb5(this, mk2Var, (byte) 27));
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            yv7 yv7Var = (yv7) arrayList.get(i4);
            if (z) {
                arrayList.size();
            }
            yv7Var.m(z2, i, i2, null);
        }
        gba.B = true;
        he heVar = new he(this, (byte) 3);
        this.z0.b.setDelegate(heVar);
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((yv7) obj).setDelegate(heVar);
        }
        try {
            im7.n(y6c.t0).Y();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Type inference failed for: r13v3, types: [k96] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList L(String str, String str2) {
        String str3;
        String lowerCase;
        TLRPC.User V1;
        na7 q1 = na7.q1(this.P);
        qu2 r = qu2.r(this.P);
        ArrayList arrayList = new ArrayList(r.f0);
        ArrayList arrayList2 = new ArrayList();
        String str4 = null;
        boolean z = false;
        if (str2 != null) {
            String h = p38.h(str2, false);
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) r.l0.get(h);
            if (tL_contact == null) {
                tL_contact = (TLRPC.TL_contact) r.m0.get(h.substring(Math.max(0, h.length() - 7)));
            }
            if (tL_contact != null) {
                TLRPC.User V12 = q1.V1(Long.valueOf(tL_contact.user_id));
                if (V12 == null || V12.self) {
                    str3 = null;
                    if (arrayList2.isEmpty() && str3 != null) {
                        lowerCase = str3.trim().toLowerCase();
                        if (!TextUtils.isEmpty(lowerCase)) {
                            ?? r7 = 1;
                            String S0 = k96.D0().S0(lowerCase, true, false);
                            if (lowerCase.equals(S0) || S0.length() == 0) {
                                S0 = null;
                            }
                            String[] strArr = {lowerCase, S0};
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList.get(i);
                                if (tL_contact2 != null && (V1 = q1.V1(Long.valueOf(tL_contact2.user_id))) != null && !V1.self) {
                                    char c = 3;
                                    String[] strArr2 = new String[3];
                                    strArr2[z ? 1 : 0] = qu2.m(z ? 1 : 0, V1.first_name, V1.last_name).toLowerCase();
                                    String S02 = k96.D0().S0(strArr2[z ? 1 : 0], r7, z);
                                    strArr2[r7] = S02;
                                    if (strArr2[z ? 1 : 0].equals(S02)) {
                                        strArr2[r7] = str4;
                                    }
                                    if (l7c.A(V1)) {
                                        strArr2[2] = k96.M0(2131746073, str4).toLowerCase();
                                    } else if (V1.self) {
                                        strArr2[2] = k96.M0(2131745709, str4).toLowerCase();
                                    }
                                    int i2 = z ? 1 : 0;
                                    int i3 = i2;
                                    boolean z2 = z;
                                    while (true) {
                                        if (i2 < 2) {
                                            String str5 = strArr[i2];
                                            if (str5 != null) {
                                                for (?? r6 = z2; r6 < c; r6++) {
                                                    String str6 = strArr2[r6];
                                                    if (str6 != null && (str6.startsWith(str5) || str6.contains(" ".concat(str5)))) {
                                                        i3 = 1;
                                                        break;
                                                    }
                                                    c = 3;
                                                }
                                                String o = l7c.o(V1);
                                                if (i3 == 0 && o != null && o.startsWith(str5)) {
                                                    i3 = 1;
                                                }
                                                if (i3 != 0) {
                                                    arrayList2.add(tL_contact2);
                                                    break;
                                                }
                                            }
                                            i2++;
                                            z2 = false;
                                            c = 3;
                                        }
                                    }
                                }
                                i++;
                                str4 = null;
                                z = false;
                                r7 = 1;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0(int i, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (this.B0 == null) {
            final sgb sgbVar = new sgb(this);
            zkb.h(bkb.c6, null, sgbVar);
            int i2 = gl.m;
            if (i2 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                sgbVar.addView(view, new FrameLayout.LayoutParams(-1, i2));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            final byte b = 1;
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.logo_middle);
            linearLayout.addView(imageView, nme.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i3 = bkb.F6;
            tb4.w(textView, i3, null, 1, 17.0f);
            textView.setText(k96.M0(2131746591, null));
            linearLayout.addView(textView, nme.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            sgbVar.a = textView2;
            zkb.X(textView2, i3, null);
            zkb.G(textView2, bkb.I6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new cl(objArr2 == true ? 1 : 0));
            textView2.setGravity(51);
            textView2.setLineSpacing(gl.L(2.0f), 1.0f);
            linearLayout.addView(textView2, nme.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f = 4.0f;
            scrollView.setPadding(gl.L(24.0f), i2, gl.L(24.0f), gl.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            sgbVar.addView(scrollView, nme.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(k96.M0(2131751592, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(gl.o());
            int i4 = bkb.x6;
            zkb.X(textView3, i4, null);
            textView3.setTextSize(1, 14.0f);
            ff0 H0 = bkb.H0(gl.L(3.0f), bkb.w0(null, i4, false));
            vkb g = zkb.g(i4, 25);
            textView3.setBackground(H0);
            zkb.j(textView3, H0, null, g, null);
            textView3.setPadding(gl.L(20.0f), gl.L(10.0f), gl.L(20.0f), gl.L(10.0f));
            sgbVar.addView(textView3, nme.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            final Object[] objArr3 = objArr == true ? 1 : 0;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: pgb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b2 = objArr3;
                    byte b3 = 1;
                    sgb sgbVar2 = sgbVar;
                    switch (b2) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = k96.M0(2131743957, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            alertDialog$Builder.j(k96.M0(2131751590, null), new qgb(sgbVar2, b3));
                            alertDialog$Builder.g(k96.M0(2131753753, null), null);
                            hdVar.U = k96.M0(2131743736, null);
                            alertDialog$Builder.o();
                            break;
                        default:
                            if (sgbVar2.c.min_age_confirm == 0) {
                                sgbVar2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = k96.M0(2131743739, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.S = M02;
                                alertDialog$Builder2.j(k96.M0(2131754303, null), new qgb(sgbVar2, (byte) 0));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                hdVar2.U = k96.a0("TosAgeText", null, 2131743740, k96.G(sgbVar2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.o();
                                break;
                            }
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(k96.M0(2131754716, null));
            textView4.setGravity(17);
            textView4.setTypeface(gl.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = gl.L(4.0f);
            textView4.setBackgroundDrawable(bkb.i0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
            sgbVar.addView(textView4, nme.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() { // from class: pgb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b2 = b;
                    byte b3 = 1;
                    sgb sgbVar2 = sgbVar;
                    switch (b2) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = k96.M0(2131743957, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            alertDialog$Builder.j(k96.M0(2131751590, null), new qgb(sgbVar2, b3));
                            alertDialog$Builder.g(k96.M0(2131753753, null), null);
                            hdVar.U = k96.M0(2131743736, null);
                            alertDialog$Builder.o();
                            break;
                        default:
                            if (sgbVar2.c.min_age_confirm == 0) {
                                sgbVar2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = k96.M0(2131743739, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.S = M02;
                                alertDialog$Builder2.j(k96.M0(2131754303, null), new qgb(sgbVar2, (byte) 0));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                hdVar2.U = k96.a0("TosAgeText", null, 2131743740, k96.G(sgbVar2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.o();
                                break;
                            }
                    }
                }
            });
            View view2 = new View(this);
            zkb.h(bkb.c7, null, view2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = gl.L(75.0f);
            layoutParams.gravity = 80;
            sgbVar.addView(view2, layoutParams);
            this.B0 = sgbVar;
            sgbVar.setAlpha(0.0f);
            this.y0.addView(this.B0, nme.c(-1.0f, -1));
            this.B0.setDelegate(new oz5(this));
        } else {
            f = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = y6c.h(i).a0;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            y6c.h(i).a0 = tL_help_termsOfService;
            y6c.h(i).u(false);
        }
        sgb sgbVar2 = this.B0;
        if (sgbVar2.getVisibility() != 0) {
            sgbVar2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        k27.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = gl.L(10.0f);
        int L3 = gl.L(f);
        int length = spannableStringBuilder.length() - 2;
        for (int i5 = 0; i5 < length; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == '-') {
                    int i7 = i5 + 2;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        y01 y01Var = new y01(L2, L3);
                        spannableStringBuilder.replace(i6, i5 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(y01Var, i6, i7, 33);
                    }
                }
            }
        }
        sgbVar2.a.setText(spannableStringBuilder);
        sgbVar2.c = tL_help_termsOfService;
        sgbVar2.d = i;
        this.B0.animate().alpha(1.0f).setDuration(150L).setInterpolator(gl.F).setListener(null).start();
    }

    public final void M0(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || this.e0.isEmpty() || sharedInstance.groupCall == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.ui.ActionBar.d dVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
        if (dVar instanceof ah6) {
            dVar = ((ah6) dVar).b0();
        }
        UndoView undoView = null;
        if (dVar instanceof mu1) {
            mu1 mu1Var = (mu1) dVar;
            if (chat != null && mu1Var.a() == (-chat.id)) {
                chat = null;
            }
            mu1Var.Z5();
            undoView = mu1Var.N3;
        } else if (dVar instanceof cj3) {
            undoView = ((cj3) dVar).u3();
        } else if (dVar instanceof ProfileActivity) {
            undoView = ((ProfileActivity) dVar).M;
        }
        if (undoView != null) {
            undoView.m(chat, i, 0L);
        }
        if (i != 38 || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().playAllowTalkSound();
    }

    public final ui5 N() {
        ActionBarLayout actionBarLayout = this.p0;
        ArrayList arrayList = this.Q;
        return !arrayList.isEmpty() ? (ui5) b00.f(1, arrayList) : actionBarLayout;
    }

    public final void N0(int i) {
        O0(i, new wn4((byte) 26));
    }

    public final qx0 O() {
        ActionBarLayout actionBarLayout = this.r0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.r0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.p0;
        if (actionBarLayout2 == null || actionBarLayout2.getBottomSheetTabs() == null) {
            return null;
        }
        return this.p0.getBottomSheetTabs();
    }

    public final void O0(int i, js4 js4Var) {
        if (i == y6c.t0 || !y6c.q(i)) {
            return;
        }
        this.l1 = true;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        y6c.t0 = i;
        y6c.h(0).u(false);
        B();
        kk7.e().k(kk7.e4, Integer.valueOf(i));
        if (gl.O1()) {
            this.q0.Z();
            this.r0.Z();
            if (!this.N0) {
                if (this.r0.getFragmentStack().isEmpty()) {
                    this.u0.setVisibility(0);
                }
                this.r0.getView().setVisibility(8);
            }
            this.q0.getView().setVisibility(8);
        }
        this.p0.Z();
        this.p0.b(-3, (ah6) js4Var.m(null));
        this.p0.W(true, true);
        if (gl.O1()) {
            this.q0.W(true, true);
            this.r0.W(true, true);
        }
        if (!org.telegram.messenger.a.x) {
            ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        }
        if (y6c.h(i).a0 != null) {
            L0(i, y6c.h(i).a0);
        }
        P0();
        this.l1 = false;
    }

    public final org.telegram.ui.ActionBar.d P() {
        return mf6.w1(this.P, false).getInt("currentViewNum", 0) != 0 ? new mf6() : new wp5();
    }

    public final void P0() {
        int i;
        String str;
        if (this.p0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.P).getConnectionState();
            this.d0 = connectionState;
            if (connectionState == 2) {
                str = "WaitingForNetwork";
                i = 2131742970;
            } else if (connectionState == 5) {
                str = "Updating";
                i = 2131743571;
            } else if (connectionState == 4) {
                str = "ConnectingToProxyWithDots";
                i = 2131751793;
            } else if (connectionState == 1) {
                str = "Connecting";
                i = 2131751797;
            } else {
                i = 0;
                str = null;
            }
            rx5 rx5Var = (connectionState == 1 || connectionState == 4) ? new rx5(this, (byte) 9) : null;
            ActionBarLayout actionBarLayout = this.p0;
            actionBarLayout.N0 = str;
            actionBarLayout.O0 = i;
            actionBarLayout.P0 = rx5Var;
            for (int i2 = 0; i2 < actionBarLayout.V0.size(); i2++) {
                ((org.telegram.ui.ActionBar.d) actionBarLayout.V0.get(i2)).setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, rx5Var);
            }
        }
    }

    public final int R() {
        return this.e0.size();
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v357 ??), method size: 16172
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final boolean V(android.content.Intent r128, boolean r129, boolean r130, boolean r131, c01 r132, boolean r133, boolean r134) {
        /*
            Method dump skipped, instructions count: 16172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.V(android.content.Intent, boolean, boolean, boolean, c01, boolean, boolean):boolean");
    }

    public final void W() {
        ActionMode actionMode = this.l0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void X(int i, TLRPC.User user, String str, c01 c01Var) {
        na7 q1 = na7.q1(i);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = q1.o1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new hc((byte) 0), new u15(this, c01Var, q1, i, user));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        long j;
        long j2;
        long j3;
        Boolean bool = gl.L;
        if (bool != null) {
            gl.L = null;
            if (bool.booleanValue() != gl.O1()) {
                boolean booleanValue = bool.booleanValue();
                ArrayList arrayList = this.f0;
                ArrayList arrayList2 = this.g0;
                ArrayList arrayList3 = this.e0;
                if (booleanValue) {
                    arrayList3.addAll(arrayList2);
                    arrayList3.addAll(arrayList);
                    arrayList2.clear();
                    arrayList.clear();
                    j2 = 0;
                    j = 0;
                } else {
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    arrayList3.clear();
                    arrayList2.clear();
                    arrayList.clear();
                    int size = arrayList4.size();
                    long j4 = 0;
                    j = 0;
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList4.get(i);
                        i++;
                        org.telegram.ui.ActionBar.d dVar = (org.telegram.ui.ActionBar.d) obj;
                        if (!(dVar instanceof ah6)) {
                            if (dVar instanceof cj3) {
                                cj3 cj3Var = (cj3) dVar;
                                if (cj3Var.H3() && !cj3Var.D3()) {
                                    j3 = 0;
                                    if (cj3Var.a3 != 0) {
                                        if (!(dVar instanceof mu1)) {
                                            mu1 mu1Var = (mu1) dVar;
                                            if (!mu1Var.N7()) {
                                                arrayList2.add(dVar);
                                                if (j4 == j3) {
                                                    j4 = mu1Var.a();
                                                    j = mu1Var.d();
                                                }
                                            }
                                        }
                                        arrayList.add(dVar);
                                    }
                                }
                            }
                            j3 = 0;
                            if (!(dVar instanceof mu1)) {
                            }
                            arrayList.add(dVar);
                        }
                        arrayList3.add(dVar);
                    }
                    j2 = j4;
                }
                E0();
                this.p0.W(true, true);
                if (gl.O1()) {
                    this.r0.W(true, true);
                    this.q0.W(true, true);
                    int size2 = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        Object obj3 = (org.telegram.ui.ActionBar.d) obj2;
                        if (obj3 instanceof ah6) {
                            obj3 = ((ah6) obj3).K;
                        }
                        if (obj3 instanceof cj3) {
                            cj3 cj3Var2 = (cj3) obj3;
                            if (cj3Var2.H3()) {
                                zc7 zc7Var = cj3Var2.r2;
                                zc7Var.a = j2;
                                zc7Var.b = j;
                                bj3[] bj3VarArr = cj3Var2.f0;
                                if (bj3VarArr != null) {
                                    for (bj3 bj3Var : bj3VarArr) {
                                        if (bj3Var.a() && gl.O1()) {
                                            bj3Var.d.s = zc7Var.a;
                                        }
                                    }
                                    int i3 = na7.q5;
                                    cj3Var2.C5(512, true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // qi5
    public final void a(float f) {
        if (o.F() && o.u().W) {
            o u = o.u();
            u.Q();
            o.e0(u);
            if (u.g0 != null) {
                u.v0[0].b.h1();
                u.v0[1].b.h1();
                u.g0.invalidate();
                u.r0.invalidate();
                if (f == 1.0f) {
                    u.v0[0].c.f();
                    u.v0[1].c.f();
                }
            }
        }
        if (PhotoViewer.C0()) {
            PhotoViewer.r0().F2();
        }
    }

    @Override // qi5
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
        if (gl.O1() && actionBarLayout == this.q0) {
            this.r0.W(z, z);
            this.p0.W(z, z);
        }
    }

    public final void b0() {
        ui5[] ui5VarArr = {this.p0, this.q0, this.r0};
        for (int i = 0; i < 3; i++) {
            ui5 ui5Var = ui5VarArr[i];
            if (ui5Var instanceof ActionBarLayout) {
                ((ActionBarLayout) ui5Var).C();
            }
        }
    }

    public final boolean d0(boolean z) {
        boolean z2;
        hj4 hj4Var = uge.a;
        if (hj4Var != null) {
            if (hj4Var.s) {
                if (z) {
                    hj4Var.c(false);
                }
            }
            return false;
        }
        aw7 aw7Var = this.z0;
        if (aw7Var == null || aw7Var.b.getVisibility() != 0) {
            yx0 yx0Var = this.x0;
            if (yx0Var == null || !(z2 = yx0Var.V)) {
                hd hdVar = vs9.I;
                if (hdVar != null) {
                    if (z) {
                        hdVar.dismiss();
                        vs9.I = null;
                        return false;
                    }
                } else if (xv2.g0 == null || !xv2.e().E) {
                    if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                        if (z) {
                            SecretMediaViewer.d().c(true, false);
                            return false;
                        }
                    } else if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
                        if (z) {
                            PhotoViewer.r0().B(true, false);
                            return false;
                        }
                    } else {
                        if (!o.F() || !o.u().W) {
                            return true;
                        }
                        if (z) {
                            o.u().l(true, false);
                        }
                    }
                } else if (z) {
                    xv2.e().c();
                    return false;
                }
            } else if (z && z2) {
                yx0Var.a(false);
                return false;
            }
        } else if (z) {
            finish();
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x04c9 A[Catch: all -> 0x0600, TryCatch #1 {all -> 0x0600, blocks: (B:203:0x0464, B:205:0x047b, B:206:0x0482, B:208:0x0494, B:209:0x049a, B:211:0x04a5, B:213:0x04ab, B:214:0x04b5, B:216:0x04b9, B:220:0x04c9, B:225:0x04d9, B:226:0x04d7, B:227:0x04dc, B:229:0x04e0, B:231:0x04e6, B:232:0x04f1, B:234:0x0501, B:235:0x0507), top: B:202:0x0464 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04d7 A[Catch: all -> 0x0600, TryCatch #1 {all -> 0x0600, blocks: (B:203:0x0464, B:205:0x047b, B:206:0x0482, B:208:0x0494, B:209:0x049a, B:211:0x04a5, B:213:0x04ab, B:214:0x04b5, B:216:0x04b9, B:220:0x04c9, B:225:0x04d9, B:226:0x04d7, B:227:0x04dc, B:229:0x04e0, B:231:0x04e6, B:232:0x04f1, B:234:0x0501, B:235:0x0507), top: B:202:0x0464 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0501 A[Catch: all -> 0x0600, TryCatch #1 {all -> 0x0600, blocks: (B:203:0x0464, B:205:0x047b, B:206:0x0482, B:208:0x0494, B:209:0x049a, B:211:0x04a5, B:213:0x04ab, B:214:0x04b5, B:216:0x04b9, B:220:0x04c9, B:225:0x04d9, B:226:0x04d7, B:227:0x04dc, B:229:0x04e0, B:231:0x04e6, B:232:0x04f1, B:234:0x0501, B:235:0x0507), top: B:202:0x0464 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0520 A[Catch: all -> 0x05fe, TryCatch #4 {all -> 0x05fe, blocks: (B:238:0x0510, B:240:0x0520, B:242:0x0524, B:243:0x052a, B:245:0x052e, B:248:0x05a1, B:250:0x05c5, B:251:0x05e1, B:253:0x05e8, B:254:0x05f7), top: B:237:0x0510 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05c5 A[Catch: all -> 0x05fe, TryCatch #4 {all -> 0x05fe, blocks: (B:238:0x0510, B:240:0x0520, B:242:0x0524, B:243:0x052a, B:245:0x052e, B:248:0x05a1, B:250:0x05c5, B:251:0x05e1, B:253:0x05e8, B:254:0x05f7), top: B:237:0x0510 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05e8 A[Catch: all -> 0x05fe, TryCatch #4 {all -> 0x05fe, blocks: (B:238:0x0510, B:240:0x0520, B:242:0x0524, B:243:0x052a, B:245:0x052e, B:248:0x05a1, B:250:0x05c5, B:251:0x05e1, B:253:0x05e8, B:254:0x05f7), top: B:237:0x0510 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0506  */
    @Override // gk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        on9 on9Var;
        h75 h75Var;
        char c;
        char c2;
        ActionBarLayout actionBarLayout;
        Runnable runnable;
        int[] iArr;
        boolean booleanValue;
        ry8 ry8Var;
        int measuredWidth;
        int measuredHeight;
        Bitmap bitmap;
        boolean z;
        View view;
        int i3 = 0;
        byte b = 1;
        if (i == kk7.H2) {
            while (true) {
                if (i3 >= 4) {
                    i3 = -1;
                    break;
                } else if (y6c.h(i3).o()) {
                    break;
                } else {
                    i3++;
                }
            }
            sgb sgbVar = this.B0;
            if (sgbVar != null) {
                sgbVar.setVisibility(8);
            }
            if (i3 != -1) {
                N0(i3);
                return;
            }
            qa9.Y(true);
            J();
            this.p0.Y();
            if (gl.O1()) {
                this.q0.Y();
                this.r0.Y();
            }
            wp5 wp5Var = new wp5();
            wp5Var.O = true;
            t0(wp5Var);
            return;
        }
        if (i == kk7.o3) {
            Long l = (Long) objArr[0];
            l.getClass();
            w0(l, null, null, objArr.length > 1 ? (gb2) objArr[1] : null);
            return;
        }
        if (i == kk7.m4) {
            if (objArr[0] != this) {
                e0();
                finish();
                return;
            }
            return;
        }
        if (i == kk7.S1) {
            int connectionState = ConnectionsManager.getInstance(i2).getConnectionState();
            if (this.d0 != connectionState) {
                if (w01.a) {
                    fa4.b("switch to state " + connectionState);
                }
                this.d0 = connectionState;
                P0();
                return;
            }
            return;
        }
        if (i == kk7.i0 || i == kk7.Y4) {
            return;
        }
        byte b2 = 2;
        if (i == kk7.L0) {
            Integer num = (Integer) objArr[0];
            if (num.intValue() != 6) {
                if (num.intValue() != 3 || this.E0 == null) {
                    if (num.intValue() == 4) {
                        L0(i2, (TLRPC.TL_help_termsOfService) objArr[1]);
                        return;
                    }
                    org.telegram.ui.ActionBar.d dVar = !this.e0.isEmpty() ? (org.telegram.ui.ActionBar.d) b00.f(1, this.e0) : null;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.a.S = k96.M0(R.string.AppName, null);
                    if (dVar != null) {
                        HashMap hashMap = new HashMap();
                        int i4 = bkb.K5;
                        hashMap.put("info1", Integer.valueOf(dVar.getThemedColor(i4)));
                        hashMap.put("info2", Integer.valueOf(dVar.getThemedColor(i4)));
                        alertDialog$Builder.l(R.raw.not_available, 52, dVar.getThemedColor(i4), hashMap);
                        alertDialog$Builder.m(i4, dVar.getResourceProvider());
                        alertDialog$Builder.a.X = true;
                    }
                    if (num.intValue() != 2 && num.intValue() != 3) {
                        alertDialog$Builder.g(k96.M0(2131748139, null), new jh((Object) this, i2, (byte) 9));
                    }
                    if (num.intValue() == 5) {
                        alertDialog$Builder.a.U = k96.M0(2131747933, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                    } else if (num.intValue() == 0) {
                        alertDialog$Builder.a.U = k96.M0(2131747935, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                    } else if (num.intValue() == 1) {
                        alertDialog$Builder.a.U = k96.M0(2131747934, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                    } else if (num.intValue() == 2) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf((String) objArr[1]);
                        String str = (String) objArr[2];
                        if (str.startsWith("PREMIUM_GIFT_SELF_REQUIRED_")) {
                            String str2 = (String) objArr[1];
                            int indexOf = str2.indexOf(42);
                            int i5 = indexOf + 1;
                            int indexOf2 = str2.indexOf(42, i5);
                            if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
                                valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) str2.substring(i5, indexOf2));
                                valueOf.setSpan(new r21(this, (byte) 6), indexOf, indexOf2 - 1, 33);
                            }
                        }
                        alertDialog$Builder.a.U = valueOf;
                        if (str.startsWith("AUTH_KEY_DROP_")) {
                            alertDialog$Builder.j(k96.M0(2131752577, null), null);
                            alertDialog$Builder.g(k96.L0(2131748551), new he(this, (byte) 4));
                        } else if (str.startsWith("PREMIUM_")) {
                            alertDialog$Builder.k(k96.L0(2131743990));
                            alertDialog$Builder.j(k96.L0(2131747638), null);
                        } else {
                            alertDialog$Builder.j(k96.L0(2131747638), null);
                        }
                    } else if (num.intValue() == 3) {
                        alertDialog$Builder.k(k96.L0(2131746418));
                        alertDialog$Builder.f(k96.L0(2131743539));
                        alertDialog$Builder.j(k96.L0(2131747638), null);
                        this.E0 = F0(alertDialog$Builder);
                        return;
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.Q0) {
            HashMap hashMap2 = (HashMap) objArr[0];
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            alertDialog$Builder2.k(k96.L0(R.string.AppName));
            alertDialog$Builder2.j(k96.L0(2131747638), null);
            alertDialog$Builder2.g(k96.L0(2131745229), new zf((Object) this, (Object) hashMap2, i2, (byte) 6));
            alertDialog$Builder2.f(k96.L0(2131745230));
            if (this.e0.isEmpty()) {
                return;
            }
            ((org.telegram.ui.ActionBar.d) b00.f(1, this.e0)).showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i == kk7.B4) {
            n81 n81Var = this.u0;
            if (n81Var != null) {
                n81Var.U(bkb.r0());
                return;
            }
            return;
        }
        if (i == kk7.m0) {
            this.e1.i();
            return;
        }
        if (i == kk7.z4) {
            boolean z2 = this.e0.size() > 1 && (b00.f(1, this.e0) instanceof ProfileActivity);
            y0((!z2 || ((ProfileActivity) b00.f(1, this.e0)).r2()) ? z2 : false);
            return;
        }
        if (i == kk7.A4) {
            I0();
            return;
        }
        if (i == kk7.b1) {
            if (this.e0.isEmpty()) {
                return;
            }
            LaunchActivity launchActivity = H1;
            if (launchActivity == null || launchActivity.O() == null || H1.O().m((TLRPC.TL_webPage) objArr[0]) == null) {
                ((org.telegram.ui.ActionBar.d) b00.f(1, this.e0)).createArticleViewer(false).L(null, (TLRPC.TL_webPage) objArr[0], (String) objArr[1], null);
                return;
            }
            return;
        }
        if (i == kk7.P) {
            ActionBarLayout actionBarLayout2 = this.p0;
            if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                return;
            }
            ((Integer) objArr[0]).getClass();
            HashMap hashMap3 = (HashMap) objArr[1];
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue3 = ((Boolean) objArr[3]).booleanValue();
            org.telegram.ui.ActionBar.d dVar2 = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this);
            int i6 = bkb.K5;
            alertDialog$Builder3.l(R.raw.permission_request_contacts, 72, bkb.u0(i6), null);
            alertDialog$Builder3.m(i6, null);
            alertDialog$Builder3.k(k96.L0(2131743579));
            alertDialog$Builder3.f(k96.L0(2131743580));
            alertDialog$Builder3.j(k96.L0(2131747638), new px5(i2, hashMap3, booleanValue2, booleanValue3, (byte) 1));
            alertDialog$Builder3.g(k96.L0(2131752577), new px5(i2, hashMap3, booleanValue2, booleanValue3, (byte) 2));
            alertDialog$Builder3.a.x0 = new px5(i2, hashMap3, booleanValue2, booleanValue3, (byte) 0);
            hd hdVar = alertDialog$Builder3.a;
            dVar2.showDialog(hdVar);
            hdVar.setCanceledOnTouchOutside(false);
            return;
        }
        if (i == kk7.p4) {
            zkb.b0(null, true);
            b0();
            if (!((Boolean) objArr[0]).booleanValue()) {
                try {
                    setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, bkb.u0(bkb.r8) | (-16777216)));
                } catch (Exception unused) {
                }
            }
            H(objArr.length > 2 && ((Boolean) objArr[2]).booleanValue(), true, (!(objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : true) || this.W0 || this.p0.z()) ? false : true);
            return;
        }
        byte b3 = 26;
        if (i != kk7.v4) {
            if (i == kk7.M0) {
                try {
                    ((Status) objArr[0]).c(this, kk7.V1);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            if (i == kk7.X1) {
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
                        Utilities.e.c(new sx5(this, this.S0, file, b2));
                        return;
                    } else {
                        r0(this.T0, this.R0, this.S0);
                        i0();
                        return;
                    }
                }
                if (str4.equals(str3)) {
                    this.P0 = null;
                    File file2 = new File(org.telegram.messenger.a.h(), ls6.p(new StringBuilder("remote"), this.T0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = this.T0;
                    akb k0 = bkb.k0(file2, tL_theme.title, tL_theme);
                    if (k0 != null) {
                        if (k0.c != null && !new File(k0.c).exists()) {
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = k0.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(k0.F).sendRequest(getwallpaper, new rv3(this, k0, (byte) 13));
                            return;
                        }
                        TLRPC.TL_theme tL_theme2 = this.T0;
                        akb u = bkb.u(file2, tL_theme2.title, tL_theme2, true);
                        if (u != null) {
                            t0(new qmb(u, true, 0, false, false));
                        }
                    }
                    i0();
                    return;
                }
                return;
            }
            if (i == kk7.Y1) {
                String str6 = (String) objArr[0];
                if (str6.equals(this.P0) || str6.equals(this.Q0)) {
                    i0();
                    return;
                }
                return;
            }
            if (i == kk7.M4) {
                if (org.telegram.messenger.a.x) {
                    return;
                }
                if (org.telegram.messenger.a.w) {
                    h0();
                    return;
                } else {
                    g0();
                    return;
                }
            }
            if (i == kk7.t4) {
                H(objArr.length > 0 && ((Boolean) objArr[0]).booleanValue(), true, !this.W0);
                return;
            }
            if (i == kk7.u1) {
                if (objArr.length <= 1 || this.e0.isEmpty()) {
                    return;
                }
                ij.c0(this.P, (TLRPC.TL_error) objArr[2], (org.telegram.ui.ActionBar.d) b00.f(1, this.e0), (TLObject) objArr[1], new Object[0]);
                return;
            }
            if (i == kk7.m5) {
                ij.c0(this.P, (TLRPC.TL_error) objArr[1], (org.telegram.ui.ActionBar.d) b00.f(1, this.e0), (TLObject) objArr[0], new Object[0]);
                return;
            }
            if (i == kk7.w1) {
                hq6.d0(i2).h2(this, (TLObject) objArr[0], 2, !this.e0.isEmpty() ? (org.telegram.ui.ActionBar.d) b00.f(1, this.e0) : null, false, true);
                return;
            }
            if (i == kk7.R4) {
                if (this.e0.isEmpty()) {
                    return;
                }
                int intValue = ((Integer) objArr[0]).intValue();
                FrameLayout frameLayout = (!h75.t5 || (h75Var = h75.s5) == null) ? null : h75Var.c;
                if (h75.t5 && (on9Var = on9.Q0) != null) {
                    frameLayout = on9Var.f;
                }
                FrameLayout frameLayout2 = frameLayout;
                org.telegram.ui.ActionBar.d dVar3 = frameLayout2 == null ? (org.telegram.ui.ActionBar.d) b00.f(1, this.e0) : null;
                switch (intValue) {
                    case 0:
                        TLRPC.Document document = (TLRPC.Document) objArr[1];
                        int intValue2 = ((Integer) objArr[2]).intValue();
                        nza nzaVar = new nza(this, null, 1, intValue2, document, null);
                        int i7 = (intValue2 == 6 || intValue2 == 7) ? 3500 : 1500;
                        if (dVar3 == null) {
                            m21.f(frameLayout2, nzaVar, i7).j();
                            break;
                        } else {
                            m21.g(dVar3, nzaVar, i7).j();
                            break;
                        }
                        break;
                    case 1:
                        if (dVar3 == null) {
                            u21.a0(frameLayout2, null).t((String) objArr[1], null).j();
                            break;
                        } else {
                            u21.b0(dVar3).t((String) objArr[1], null).j();
                            break;
                        }
                    case 2:
                        (frameLayout2 != null ? u21.a0(frameLayout2, null) : u21.b0(dVar3)).t(k96.L0(((Long) objArr[1]).longValue() > 0 ? 2131742565 : 2131752404), null).j();
                        break;
                    case 3:
                        (frameLayout2 != null ? u21.a0(frameLayout2, null) : u21.b0(dVar3)).t(k96.L0(((Long) objArr[1]).longValue() > 0 ? 2131742546 : 2131752273), null).j();
                        break;
                    case 4:
                        if (dVar3 == null) {
                            u21.a0(frameLayout2, null).u((String) objArr[1], (String) objArr[2], null).j();
                            break;
                        } else {
                            u21.b0(dVar3).u((String) objArr[1], (String) objArr[2], dVar3.getResourceProvider()).j();
                            break;
                        }
                    case 5:
                        hr hrVar = new hr(this, (c06) objArr[1]);
                        if (dVar3 == null) {
                            m21.f(frameLayout2, hrVar, 1500).j();
                            break;
                        } else {
                            m21.g(dVar3, hrVar, 1500).j();
                            break;
                        }
                    case 6:
                        if (dVar3 == null) {
                            u21.a0(frameLayout2, null).T((String) objArr[1]).j();
                            break;
                        } else {
                            u21.b0(dVar3).T((String) objArr[1]).j();
                            break;
                        }
                }
                return;
            }
            if (i == kk7.v2) {
                I(false);
                return;
            }
            if (i == kk7.k5) {
                if (this.e0.isEmpty()) {
                    return;
                }
                org.telegram.ui.ActionBar.d dVar4 = (org.telegram.ui.ActionBar.d) b00.f(1, this.e0);
                if (dVar4.getParentActivity() != null) {
                    dVar4.showDialog(new h26(((Integer) objArr[0]).intValue(), this.P, null, dVar4.getParentActivity(), dVar4));
                    return;
                }
                return;
            }
            if (i == kk7.h5) {
                na7.q1(this.P).X3.edit().remove("transcribeButtonPressed").apply();
                return;
            }
            if (i == kk7.p5) {
                int intValue3 = ((Integer) objArr[0]).intValue();
                String[] strArr = (intValue3 != 0 || Build.VERSION.SDK_INT < 31) ? null : new String[]{"android.permission.BLUETOOTH_CONNECT"};
                if (strArr != null) {
                    int i8 = this.c1 + 1;
                    this.c1 = i8;
                    this.b1.put(i8, intValue3);
                    n9.v(this, strArr, this.c1);
                    return;
                }
                return;
            }
            if (i == kk7.t5) {
                long longValue = ((Long) objArr[0]).longValue();
                if (((Boolean) objArr[1]).booleanValue()) {
                    mm4.r(longValue, this.p0);
                    return;
                }
                return;
            }
            if (i == kk7.O5) {
                if (this.u1 == null) {
                    TLParseException tLParseException = (TLParseException) objArr[0];
                    StringBuilder sb = new StringBuilder();
                    sb.append(tLParseException.getMessage());
                    sb.append("\n\n");
                    sb.append(gl.C0());
                    StringBuilder sb2 = new StringBuilder();
                    StringWriter stringWriter = new StringWriter();
                    tLParseException.printStackTrace(new PrintWriter(stringWriter));
                    sb2.append(gl.C0());
                    sb2.append("\n\n");
                    sb2.append(stringWriter);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this, null);
                    alertDialog$Builder4.k("TL Error");
                    alertDialog$Builder4.f(sb);
                    alertDialog$Builder4.g(k96.L0(2131751755), new ry4((Object) sb2, (byte) 21));
                    alertDialog$Builder4.j(k96.L0(2131747638), null);
                    alertDialog$Builder4.i(new ly5(this, b));
                    hd o = alertDialog$Builder4.o();
                    this.u1 = o;
                    o.setCanceledOnTouchOutside(true);
                    return;
                }
                return;
            }
            if (i != kk7.P5) {
                if (i == kk7.S5) {
                    aq0 aq0Var = (aq0) objArr[0];
                    org.telegram.ui.ActionBar.d Q = Q();
                    u21 b0 = Q instanceof mu1 ? u21.b0(Q) : u21.Y();
                    String r = cf3.r(this.P, aq0Var.a);
                    TLRPC.JoinChatBotResult joinChatBotResult = aq0Var.b;
                    gl.e3(new hb5(this, joinChatBotResult instanceof TLRPC.TL_joinChatBotResultApproved ? b0.H(R.raw.contact_check, gl.T2(k96.Z(2131749182, r))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultDeclined ? b0.H(R.raw.e_hand_2, gl.T2(k96.Z(2131749181, r))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultQueued ? b0.Q(R.raw.timer_toast, 24, gl.T2(k96.Z(2131749180, r))) : null, b3), 400L);
                    return;
                }
                return;
            }
            if (this.v1 == null) {
                Class cls = (Class) objArr[0];
                int intValue4 = ((Integer) objArr[1]).intValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cls.toString());
                sb3.append('\n');
                sb3.append(intValue4);
                sb3.append('\n');
                sb3.append(gl.C0());
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(this, null);
                alertDialog$Builder5.k("Memory Leak Found");
                alertDialog$Builder5.f(sb3);
                alertDialog$Builder5.j(k96.L0(2131747638), null);
                alertDialog$Builder5.i(new ly5(this, b2));
                hd o2 = alertDialog$Builder5.o();
                this.v1 = o2;
                o2.setCanceledOnTouchOutside(true);
                return;
            }
            return;
        }
        if (objArr[2] == null || this.n0.getVisibility() == 0) {
            c = 3;
            if (objArr[2] == null) {
                c2 = 0;
                cj3.C4 = false;
                akb akbVar = (akb) objArr[c2];
                boolean booleanValue4 = ((Boolean) objArr[1]).booleanValue();
                int intValue5 = ((Integer) objArr[c]).intValue();
                Runnable runnable2 = objArr.length > 7 ? (Runnable) objArr[7] : null;
                actionBarLayout = this.p0;
                if (actionBarLayout != null) {
                    actionBarLayout.e(new ti5(akbVar, intValue5, booleanValue4, true), runnable2);
                    if (gl.O1()) {
                        ActionBarLayout actionBarLayout3 = this.q0;
                        if (actionBarLayout3 != null) {
                            runnable = null;
                            actionBarLayout3.e(new ti5(akbVar, intValue5, booleanValue4, true), null);
                        } else {
                            runnable = null;
                        }
                        ActionBarLayout actionBarLayout4 = this.r0;
                        if (actionBarLayout4 != null) {
                            actionBarLayout4.e(new ti5(akbVar, intValue5, booleanValue4, true), runnable);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            try {
                iArr = (int[]) objArr[2];
                booleanValue = ((Boolean) objArr[4]).booleanValue();
                ry8Var = (ry8) objArr[5];
                if (objArr.length > 8) {
                    ((Boolean) objArr[8]).getClass();
                }
                measuredWidth = this.y0.getMeasuredWidth();
                measuredHeight = this.y0.getMeasuredHeight();
                this.F0 = null;
                if (objArr.length > 6) {
                    this.F0 = (View) objArr[6];
                }
                this.W0 = true;
                Y(this.y0);
                View view2 = this.F0;
                if (view2 != null && view2.getBackground() != null) {
                    this.F0.getBackground().setAlpha(0);
                }
            } catch (Throwable th) {
                th = th;
                c = 3;
            }
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    bitmap = gl.A0(getWindow());
                    if (bitmap != null) {
                        z = true;
                        if (bitmap == null) {
                            bitmap = gl.I3(this.y0);
                        }
                        if (bitmap != null && ry8Var != null) {
                            umb.a(bitmap, !z ? null : this.y0, ry8Var);
                        }
                        view = this.F0;
                        if (view != null && view.getBackground() != null) {
                            this.F0.getBackground().setAlpha(kk7.d4);
                        }
                        this.v0.removeView(this.n0);
                        this.n0 = new umb(this);
                        oy8 animatedDrawable = ry8Var == null ? ry8Var.getAnimatedDrawable() : null;
                        c = 3;
                        this.v0.addView(this.n0, 1, nme.c(-1.0f, -1));
                        this.o0.setVisibility(8);
                        if (ry8Var != null) {
                            umb umbVar = this.n0;
                            ColorFilter colorFilter = animatedDrawable != null ? animatedDrawable.getColorFilter() : null;
                            umbVar.n = ry8Var;
                            umbVar.r = colorFilter;
                        }
                        this.n0.setImageBitmap(bitmap);
                        this.n0.setVisibility(0);
                        int i9 = measuredWidth - iArr[0];
                        int i10 = measuredHeight - iArr[1];
                        double sqrt = Math.sqrt((i10 * i10) + (i9 * i9));
                        int i11 = iArr[0];
                        int i12 = measuredHeight - iArr[1];
                        float max = (float) Math.max(sqrt, Math.sqrt((i12 * i12) + (i11 * i11)));
                        int i13 = measuredWidth - iArr[0];
                        int i14 = iArr[1];
                        double sqrt2 = Math.sqrt((i14 * i14) + (i13 * i13));
                        int i15 = iArr[0];
                        int i16 = iArr[1];
                        float max2 = Math.max(max, (float) Math.max(sqrt2, Math.sqrt((i16 * i16) + (i15 * i15))));
                        this.n0.b(iArr[0], iArr[1], booleanValue);
                        float f = max2 / 0.6f;
                        umb umbVar2 = this.n0;
                        ax1 ax1Var = umb.x;
                        float f2 = 0.0f;
                        if (!booleanValue) {
                            f2 = f;
                            f = 0.0f;
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(umbVar2, ax1Var, f2, f);
                        ofFloat.setDuration(450L);
                        ofFloat.setInterpolator(ls3.e);
                        ofFloat.addListener(new i8(this, ry8Var, animatedDrawable, (byte) 8));
                        if (this.F0 != null) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat2.addUpdateListener(new tx5(this, (byte) 0));
                            ofFloat2.setDuration(ofFloat.getDuration());
                            ofFloat2.start();
                        }
                        gl.e3(new rx5(this, b), !booleanValue ? (measuredHeight - iArr[1]) / gl.L(2.25f) : 50L);
                        ofFloat.start();
                    }
                } else {
                    bitmap = null;
                }
                this.v0.addView(this.n0, 1, nme.c(-1.0f, -1));
                this.o0.setVisibility(8);
                if (ry8Var != null) {
                }
                this.n0.setImageBitmap(bitmap);
                this.n0.setVisibility(0);
                int i92 = measuredWidth - iArr[0];
                int i102 = measuredHeight - iArr[1];
                double sqrt3 = Math.sqrt((i102 * i102) + (i92 * i92));
                int i112 = iArr[0];
                int i122 = measuredHeight - iArr[1];
                float max3 = (float) Math.max(sqrt3, Math.sqrt((i122 * i122) + (i112 * i112)));
                int i132 = measuredWidth - iArr[0];
                int i142 = iArr[1];
                double sqrt22 = Math.sqrt((i142 * i142) + (i132 * i132));
                int i152 = iArr[0];
                int i162 = iArr[1];
                float max22 = Math.max(max3, (float) Math.max(sqrt22, Math.sqrt((i162 * i162) + (i152 * i152))));
                this.n0.b(iArr[0], iArr[1], booleanValue);
                float f3 = max22 / 0.6f;
                umb umbVar22 = this.n0;
                ax1 ax1Var2 = umb.x;
                float f22 = 0.0f;
                if (!booleanValue) {
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(umbVar22, ax1Var2, f22, f3);
                ofFloat3.setDuration(450L);
                ofFloat3.setInterpolator(ls3.e);
                ofFloat3.addListener(new i8(this, ry8Var, animatedDrawable, (byte) 8));
                if (this.F0 != null) {
                }
                gl.e3(new rx5(this, b), !booleanValue ? (measuredHeight - iArr[1]) / gl.L(2.25f) : 50L);
                ofFloat3.start();
            } catch (Throwable th2) {
                th = th2;
                fa4.f(th);
                try {
                    this.n0.setImageDrawable(null);
                    this.v0.removeView(this.n0);
                    cj3.C4 = false;
                } catch (Exception e) {
                    fa4.f(e);
                }
                c2 = 0;
                akb akbVar2 = (akb) objArr[c2];
                boolean booleanValue42 = ((Boolean) objArr[1]).booleanValue();
                int intValue52 = ((Integer) objArr[c]).intValue();
                if (objArr.length > 7) {
                }
                actionBarLayout = this.p0;
                if (actionBarLayout != null) {
                }
            }
            z = false;
            if (bitmap == null) {
            }
            if (bitmap != null) {
                umb.a(bitmap, !z ? null : this.y0, ry8Var);
            }
            view = this.F0;
            if (view != null) {
                this.F0.getBackground().setAlpha(kk7.d4);
            }
            this.v0.removeView(this.n0);
            this.n0 = new umb(this);
            if (ry8Var == null) {
            }
            c = 3;
        }
        c2 = 0;
        akb akbVar22 = (akb) objArr[c2];
        boolean booleanValue422 = ((Boolean) objArr[1]).booleanValue();
        int intValue522 = ((Integer) objArr[c]).intValue();
        if (objArr.length > 7) {
        }
        actionBarLayout = this.p0;
        if (actionBarLayout != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (((mu1) r0).P9() != false) goto L62;
     */
    @Override // vp2, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.d Q;
        keyEvent.getKeyCode();
        if ((keyEvent.getKeyCode() != 24 && keyEvent.getKeyCode() != 25) || (Q = Q()) == null || Q.getLastStoryViewer() == null) {
            if (keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
                if (VoIPService.getSharedInstance() == null) {
                    ArrayList arrayList = this.e0;
                    if (!arrayList.isEmpty() && ((!PhotoViewer.C0() || !PhotoViewer.r0().U0()) && keyEvent.getRepeatCount() == 0)) {
                        org.telegram.ui.ActionBar.d dVar = (org.telegram.ui.ActionBar.d) b00.f(1, arrayList);
                        if (!(dVar instanceof mu1) || org.telegram.ui.ActionBar.d.hasSheets(dVar) || !((mu1) dVar).P9()) {
                            if (gl.O1()) {
                                ArrayList arrayList2 = this.g0;
                                if (!arrayList2.isEmpty()) {
                                    org.telegram.ui.ActionBar.d dVar2 = (org.telegram.ui.ActionBar.d) b00.f(1, arrayList2);
                                    if (dVar2 instanceof mu1) {
                                        if (!org.telegram.ui.ActionBar.d.hasSheets(dVar2)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 32) {
                    boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
                    AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    boolean z = audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25;
                    WebRtcAudioTrack.setSpeakerMute(z);
                    if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                        M0(z ? 42 : 43);
                    }
                }
            }
            try {
                return super.dispatchKeyEvent(keyEvent);
            } catch (Exception e) {
                fa4.g(e, true);
                return false;
            }
        }
        m8b lastStoryViewer = Q.getLastStoryViewer();
        lastStoryViewer.getClass();
        if (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) {
            lastStoryViewer.r(keyEvent);
            return true;
        }
        return true;
    }

    public final void e0() {
        HashSet hashSet;
        ez3 ez3Var = this.Z0;
        if (ez3Var != null) {
            gl.r(ez3Var);
            this.Z0 = null;
        }
        if (this.R) {
            return;
        }
        this.R = true;
        wtc wtcVar = this.m1;
        if (wtcVar != null) {
            wtcVar.a();
            this.m1 = null;
        }
        wtc wtcVar2 = this.n1;
        if (wtcVar2 != null) {
            wtcVar2.a();
            this.n1 = null;
        }
        bz5 bz5Var = this.p1;
        if (bz5Var == null || (hashSet = e66.n) == null) {
            return;
        }
        hashSet.remove(bz5Var);
    }

    public final void f0(Intent intent, c01 c01Var) {
        super.onNewIntent(intent);
        Z();
        G();
        V(intent, true, false, false, c01Var, true, false);
    }

    public final void g0() {
        if (this.Z0 != null) {
            if (w01.a) {
                fa4.b("cancel lockRunnable onPasscodePause");
            }
            gl.r(this.Z0);
            this.Z0 = null;
        }
        if (gba.r.length() != 0) {
            gba.A = (int) (SystemClock.elapsedRealtime() / 1000);
            ez3 ez3Var = new ez3(this, (byte) 19);
            this.Z0 = ez3Var;
            if (gba.w) {
                gl.e3(ez3Var, 1000L);
                if (w01.a) {
                    fa4.b("schedule app lock in 1000");
                }
            } else if (gba.x != 0) {
                if (w01.a) {
                    fa4.b("schedule app lock in " + ((gba.x * 1000) + 1000));
                }
                gl.e3(this.Z0, (gba.x * 1000) + 1000);
            }
        } else {
            gba.A = 0;
        }
        gba.x();
    }

    @Override // qi5
    public final boolean h(org.telegram.ui.ActionBar.d dVar, ActionBarLayout actionBarLayout) {
        if (gl.O1()) {
            boolean z = dVar instanceof cj3;
            if (z || (dVar instanceof ah6)) {
                boolean z2 = actionBarLayout != this.p0;
                if (z2 && z && !((cj3) dVar).H3()) {
                    z2 = false;
                }
                if (z2) {
                    this.p0.Z();
                    this.p0.b(-1, dVar);
                    this.q0.Z();
                    this.q0.getView().setVisibility(8);
                    if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                        this.u0.setVisibility(0);
                    }
                    return false;
                }
            } else if (!(dVar instanceof mu1) || ((mu1) dVar).N7()) {
                ActionBarLayout actionBarLayout2 = this.q0;
                if (actionBarLayout != actionBarLayout2) {
                    actionBarLayout2.getView().setVisibility(0);
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                            break;
                        }
                        if (y6c.h(i).o()) {
                            break;
                        }
                        i++;
                    }
                    if ((dVar instanceof mf6) && i == -1) {
                        this.u0.setVisibility(0);
                        this.t0.setBackgroundColor(0);
                    } else {
                        this.t0.setBackgroundColor(2130706432);
                    }
                    this.q0.b(-1, dVar);
                    return false;
                }
            } else if (this.N0) {
                ActionBarLayout actionBarLayout3 = this.p0;
                if (actionBarLayout != actionBarLayout3) {
                    actionBarLayout3.b(-1, dVar);
                    if (!this.q0.getFragmentStack().isEmpty()) {
                        while (true) {
                            int size = this.q0.getFragmentStack().size() - 1;
                            ActionBarLayout actionBarLayout4 = this.q0;
                            if (size <= 0) {
                                actionBarLayout4.j(true, false);
                                return false;
                            }
                            actionBarLayout4.c0(actionBarLayout4.getFragmentStack().get(0), false);
                        }
                    }
                    return false;
                }
            } else {
                ActionBarLayout actionBarLayout5 = this.r0;
                if (actionBarLayout != actionBarLayout5) {
                    actionBarLayout5.getView().setVisibility(0);
                    this.u0.setVisibility(8);
                    this.r0.Z();
                    this.r0.b(-1, dVar);
                    if (!this.q0.getFragmentStack().isEmpty()) {
                        while (true) {
                            int size2 = this.q0.getFragmentStack().size() - 1;
                            ActionBarLayout actionBarLayout6 = this.q0;
                            if (size2 <= 0) {
                                actionBarLayout6.j(true, false);
                                return false;
                            }
                            actionBarLayout6.c0(actionBarLayout6.getFragmentStack().get(0), false);
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.Z0 != null) {
            if (w01.a) {
                fa4.b("cancel lockRunnable onPasscodeResume");
            }
            gl.r(this.Z0);
            this.Z0 = null;
        }
        if (gl.n2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (gba.A != 0) {
            gba.A = 0;
            gba.x();
            if (w01.a) {
                fa4.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        hd hdVar = this.V0;
        if (hdVar != null) {
            try {
                hdVar.dismiss();
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

    @Override // qi5
    public final boolean j() {
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(true, false);
            return true;
        }
        if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
            PhotoViewer.r0().B(true, false);
            return true;
        }
        if (!o.F() || !o.u().W) {
            return false;
        }
        o.u().l(true, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(boolean z) {
        ActionBarLayout actionBarLayout;
        ArrayList arrayList;
        String str;
        Matcher matcher;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("canSelectTopics", true);
        bundle.putInt("dialogsType", 3);
        bundle.putBoolean("allowSwitchAccount", true);
        ArrayList arrayList2 = this.b0;
        if (arrayList2 == null) {
            bundle.putString("selectAlertString", k96.M0(2131745401, null));
            bundle.putString("selectAlertStringGroup", k96.M0(2131745402, null));
        } else if (arrayList2.size() != 1) {
            bundle.putString("selectAlertString", k96.M0(2131745401, null));
            bundle.putString("selectAlertStringGroup", k96.M0(2131745439, null));
        }
        cj3 cj3Var = new cj3(bundle);
        cj3Var.E2 = this;
        if (this.S != null || ((arrayList = this.V) != null && !arrayList.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.V;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(mu1.N5(this.V, false, null));
            }
            String str2 = this.S;
            if (str2 != null) {
                arrayList3.add(new jm6(0, str2, 0, true, 0, 0));
            }
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(this.U)) {
                    ((jm6) arrayList3.get(0)).a = this.U;
                }
                CharSequence charSequence = this.U;
                if (arrayList3.isEmpty()) {
                    cj3Var.F2 = null;
                } else {
                    cj3Var.F2 = arrayList3;
                    cj3Var.G2 = null;
                    cj3Var.O2 = false;
                    if (cj3Var.D1 != null) {
                        cj3Var.B2(charSequence);
                    } else {
                        cj3Var.Z3 = charSequence;
                    }
                }
            }
        } else if (!TextUtils.isEmpty(this.U)) {
            CharSequence charSequence2 = this.U;
            int i = bba.J;
            if (charSequence2 != null && charSequence2.length() != 0) {
                try {
                    matcher = gl.S.matcher(charSequence2);
                } catch (Exception unused) {
                }
                if (matcher.find()) {
                    str = charSequence2.subSequence(matcher.start(), matcher.end()).toString();
                    CharSequence charSequence3 = this.U;
                    if (str == null) {
                        cj3Var.U4(charSequence3, str);
                    } else if (charSequence3 == null || charSequence3.length() == 0) {
                        cj3Var.H2 = null;
                    } else {
                        cj3Var.H2 = charSequence3;
                        cj3Var.G2 = null;
                        cj3Var.F2 = null;
                        if (cj3Var.D1 != null) {
                            cj3Var.B2(charSequence3);
                        } else {
                            cj3Var.Z3 = charSequence3;
                        }
                    }
                }
            }
            str = null;
            CharSequence charSequence32 = this.U;
            if (str == null) {
            }
        }
        ((ActionBarLayout) N()).U(cj3Var, !gl.O1() || (actionBarLayout = this.q0) == null ? !(this.p0.getFragmentStack().size() <= 1 || !(this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1) instanceof ah6)) : !(actionBarLayout.getFragmentStack().isEmpty() || !(this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1) instanceof ah6)), !z);
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
            PhotoViewer.r0().B(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        t7b.v();
        h75 h75Var = h75.s5;
        if (h75Var != null) {
            h75Var.dismiss();
        }
        on9 on9Var = on9.Q0;
        if (on9Var != null) {
            on9Var.dismiss();
        }
        if (z || !gl.O1()) {
            return;
        }
        this.p0.W(true, true);
        this.r0.W(true, true);
    }

    @Override // qi5
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (gl.O1()) {
            if (actionBarLayout == this.p0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.l1) {
                e0();
                finish();
                return false;
            }
            if (actionBarLayout == this.r0) {
                if (!this.N0) {
                    this.u0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.q0 && this.p0.getFragmentStack().isEmpty() && this.q0.getFragmentStack().size() == 1) {
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
        mf6 mf6Var = new mf6();
        rx5 rx5Var = new rx5(this, (byte) 0);
        mf6Var.G = (byte) 3;
        mf6Var.a = 12;
        mf6Var.e0 = rx5Var;
        if (password == null || (str = password.login_email_pattern) == null) {
            t0(mf6Var);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        int indexOf = password.login_email_pattern.indexOf(42);
        int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            vib vibVar = new vib();
            vibVar.a |= 256;
            vibVar.b = indexOf;
            int i = lastIndexOf + 1;
            vibVar.c = i;
            valueOf.setSpan(new wib(vibVar, 0), indexOf, i, 0);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = valueOf;
        hdVar.U = k96.M0(2131751189, null);
        alertDialog$Builder.j(k96.M0(2131752536, null), new h45(this, mf6Var, (byte) 6));
        ug8.y(null, 2131752577, alertDialog$Builder, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00ce, code lost:
    
        if (r3.getArguments().getLong("community_id", 0) != 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019d, code lost:
    
        if (r13 == r12.p0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0118 A[SYNTHETIC] */
    @Override // qi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(ActionBarLayout actionBarLayout, ri5 ri5Var) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        ActionBarLayout actionBarLayout4;
        int i;
        ActionBarLayout actionBarLayout5;
        ActionBarLayout actionBarLayout6;
        ActionBarLayout actionBarLayout7;
        ActionBarLayout actionBarLayout8;
        org.telegram.ui.ActionBar.d dVar = ri5Var.a;
        boolean z = ri5Var.b;
        boolean z2 = ri5Var.c;
        if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        if (gl.O1()) {
            if (dVar instanceof ah6) {
                ActionBarLayout actionBarLayout9 = this.p0;
                if (actionBarLayout != actionBarLayout9) {
                    actionBarLayout9.Z();
                    ui5 N = N();
                    ri5Var.b = z;
                    ri5Var.c = z2;
                    ri5Var.d = false;
                    ((ActionBarLayout) N).R(ri5Var);
                    this.q0.Z();
                    this.q0.getView().setVisibility(8);
                    if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                        this.u0.setVisibility(0);
                        return false;
                    }
                    return false;
                }
                if ((!(dVar instanceof mu1) && !((mu1) dVar).N7()) || ri5Var.g || (actionBarLayout == (actionBarLayout3 = this.r0) && (actionBarLayout3.getFragmentStack().size() > 1 || !(this.r0.getLastFragment() instanceof mu1)))) {
                    boolean z3 = this.N0;
                    if (!z3) {
                        ActionBarLayout actionBarLayout10 = this.r0;
                        if (actionBarLayout != actionBarLayout10) {
                            if (actionBarLayout != actionBarLayout10 && actionBarLayout10 != null) {
                                if (actionBarLayout10.getView() != null) {
                                    this.r0.getView().setVisibility(0);
                                }
                                this.u0.setVisibility(8);
                                this.r0.Z();
                                ActionBarLayout actionBarLayout11 = this.r0;
                                ri5Var.c = true;
                                ri5Var.b = z;
                                ri5Var.d = false;
                                actionBarLayout11.R(ri5Var);
                                if (!this.q0.getFragmentStack().isEmpty()) {
                                    while (true) {
                                        int size = this.q0.getFragmentStack().size() - 1;
                                        ActionBarLayout actionBarLayout12 = this.q0;
                                        if (size <= 0) {
                                            actionBarLayout12.j(!z2, false);
                                            return false;
                                        }
                                        actionBarLayout12.c0(actionBarLayout12.getFragmentStack().get(0), false);
                                    }
                                }
                            }
                            if (!z3 || actionBarLayout == this.p0) {
                                ActionBarLayout actionBarLayout13 = this.q0;
                                if (actionBarLayout13 != null && actionBarLayout13.getFragmentStack() != null && !this.q0.getFragmentStack().isEmpty()) {
                                    while (true) {
                                        int size2 = this.q0.getFragmentStack().size() - 1;
                                        actionBarLayout7 = this.q0;
                                        if (size2 <= 0) {
                                            break;
                                        }
                                        actionBarLayout7.c0(actionBarLayout7.getFragmentStack().get(0), false);
                                    }
                                    actionBarLayout7.j(!z2, false);
                                }
                                ui5 N2 = N();
                                ri5Var.b = this.p0.getFragmentStack().size() > 1;
                                ri5Var.c = z2;
                                ri5Var.d = false;
                                ((ActionBarLayout) N2).R(ri5Var);
                                return false;
                            }
                            ui5 N3 = N();
                            ri5Var.b = this.p0.getFragmentStack().size() > 1;
                            ri5Var.c = z2;
                            ri5Var.d = false;
                            ((ActionBarLayout) N3).R(ri5Var);
                            if (!this.q0.getFragmentStack().isEmpty()) {
                                while (true) {
                                    int size3 = this.q0.getFragmentStack().size() - 1;
                                    actionBarLayout8 = this.q0;
                                    if (size3 <= 0) {
                                        break;
                                    }
                                    actionBarLayout8.c0(actionBarLayout8.getFragmentStack().get(0), false);
                                }
                                actionBarLayout8.j(!z2, false);
                            }
                        }
                        ActionBarLayout actionBarLayout14 = this.r0;
                        if (actionBarLayout == actionBarLayout14) {
                            if (actionBarLayout14.getView() != null) {
                                this.r0.getView().setVisibility(0);
                            }
                            this.u0.setVisibility(8);
                        }
                        boolean z4 = (this.N0 && actionBarLayout == (actionBarLayout6 = this.p0) && actionBarLayout6.getFragmentStack().size() == 1) ? false : true;
                        if (!this.q0.getFragmentStack().isEmpty()) {
                            while (true) {
                                int size4 = this.q0.getFragmentStack().size() - 1;
                                actionBarLayout5 = this.q0;
                                if (size4 <= 0) {
                                    break;
                                }
                                actionBarLayout5.c0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            actionBarLayout5.j(!z2, false);
                        }
                        if (!z4) {
                            ui5 N4 = N();
                            ri5Var.c = z2;
                            ri5Var.d = false;
                            ((ActionBarLayout) N4).R(ri5Var);
                        }
                        return z4;
                    }
                    return false;
                }
                actionBarLayout4 = this.q0;
                if (actionBarLayout4 != null && actionBarLayout != actionBarLayout4) {
                    actionBarLayout4.getView().setVisibility(0);
                    i = 0;
                    while (true) {
                        if (i < 4) {
                            i = -1;
                            break;
                        }
                        if (y6c.h(i).o()) {
                            break;
                        }
                        i++;
                    }
                    if ((dVar instanceof mf6) || i != -1) {
                        this.t0.setBackgroundColor(2130706432);
                    } else {
                        this.u0.setVisibility(0);
                        this.t0.setBackgroundColor(0);
                    }
                    ActionBarLayout actionBarLayout15 = this.q0;
                    ri5Var.b = z;
                    ri5Var.c = z2;
                    ri5Var.d = false;
                    actionBarLayout15.R(ri5Var);
                    return false;
                }
            } else {
                if (dVar instanceof cj3) {
                    cj3 cj3Var = (cj3) dVar;
                    if (cj3Var.H3() && actionBarLayout != (actionBarLayout2 = this.p0)) {
                        actionBarLayout2.Z();
                        ui5 N5 = N();
                        ri5Var.b = z;
                        ri5Var.c = z2;
                        ri5Var.d = false;
                        ((ActionBarLayout) N5).R(ri5Var);
                        this.q0.Z();
                        this.q0.getView().setVisibility(8);
                        if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                            this.u0.setVisibility(0);
                            return false;
                        }
                        return false;
                    }
                    if (actionBarLayout == this.p0) {
                        if (cj3Var.getArguments() != null) {
                            if (cj3Var.getArguments().getInt("folderId", 0) != 1) {
                            }
                        }
                    }
                }
                if (!(dVar instanceof mu1)) {
                }
                actionBarLayout4 = this.q0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.getView().setVisibility(0);
                    i = 0;
                    while (true) {
                        if (i < 4) {
                        }
                        i++;
                    }
                    if (dVar instanceof mf6) {
                    }
                    this.t0.setBackgroundColor(2130706432);
                    ActionBarLayout actionBarLayout152 = this.q0;
                    ri5Var.b = z;
                    ri5Var.c = z2;
                    ri5Var.d = false;
                    actionBarLayout152.R(ri5Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void l0(final long j, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i, final int i2) {
        if (num != null) {
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = na7.q1(this.P).f1(-j);
            tL_channels_getMessages.id.add(num);
            ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: nx5
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    String str2 = LaunchActivity.C1;
                    gl.d3(new cy5(LaunchActivity.this, tLObject, num, num2, bArr, j, runnable, str, i, i2));
                }
            });
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j);
        t0(qvb.F0(this, bundle));
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void m0(int i, long j, TLRPC.TL_error tL_error) {
        mu1 mu1Var = new mu1(ls6.k(j, "user_id"));
        t0(mu1Var);
        gl.e3(new jf4((Object) tL_error, (Object) mu1Var, (Object) na7.q1(i).V1(Long.valueOf(j)), (byte) 29), 300L);
    }

    public final void n0(int i, String str, String str2, c01 c01Var) {
        if (c01Var != null) {
            c01Var.d();
        }
        na7 q1 = na7.q1(i);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_contacts_importContactToken, new vt0(this, (Object) c01Var, (Object) q1, i, str2, (byte) 5));
    }

    public final void o0(int i, String str, String str2, c01 c01Var) {
        if (c01Var != null) {
            c01Var.d();
        }
        na7 q1 = na7.q1(i);
        q1.Y1().a(str, null, new hz5(this, q1, c01Var, i, str2, (byte) 0));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.l0 == actionMode) {
            this.l0 = null;
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.p0;
            org.telegram.ui.ActionBar.a aVar = actionBarLayout.E;
            if (aVar != null) {
                aVar.setVisibility(0);
            }
            actionBarLayout.D0 = false;
            if (gl.O1()) {
                ActionBarLayout actionBarLayout2 = this.r0;
                org.telegram.ui.ActionBar.a aVar2 = actionBarLayout2.E;
                if (aVar2 != null) {
                    aVar2.setVisibility(0);
                }
                actionBarLayout2.D0 = false;
                ActionBarLayout actionBarLayout3 = this.q0;
                org.telegram.ui.ActionBar.a aVar3 = actionBarLayout3.E;
                if (aVar3 != null) {
                    aVar3.setVisibility(0);
                }
                actionBarLayout3.D0 = false;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.l0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.p0.q(menu) && gl.O1() && !this.r0.q(menu)) {
                this.q0.q(menu);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.p0;
            org.telegram.ui.ActionBar.a aVar = actionBarLayout.E;
            if (aVar != null) {
                aVar.setVisibility(8);
            }
            actionBarLayout.D0 = true;
            if (gl.O1()) {
                ActionBarLayout actionBarLayout2 = this.r0;
                org.telegram.ui.ActionBar.a aVar2 = actionBarLayout2.E;
                if (aVar2 != null) {
                    aVar2.setVisibility(8);
                }
                actionBarLayout2.D0 = true;
                ActionBarLayout actionBarLayout3 = this.q0;
                org.telegram.ui.ActionBar.a aVar3 = actionBarLayout3.E;
                if (aVar3 != null) {
                    aVar3.setVisibility(8);
                }
                actionBarLayout3.D0 = true;
            }
        }
    }

    @Override // en4, wp2, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        y28 currentPeerView;
        gl2 gl2Var;
        VoIPService sharedInstance;
        if (gba.r.length() != 0 && gba.A != 0) {
            gba.A = 0;
            if (w01.a) {
                fa4.b("reset lastPauseTime onActivityResult");
            }
            y6c.h(this.P).u(false);
        }
        if (i == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.a.G = canDrawOverlays;
            if (canDrawOverlays) {
                h75 h75Var = h75.s5;
                if (h75Var != null) {
                    h75Var.I();
                }
                on9 on9Var = on9.Q0;
                if (on9Var != null) {
                    on9Var.e();
                }
                gl.e3(new rx5(this, (byte) 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i >= 22336 && i <= 22399) {
            l15 l15Var = bje.b;
            if (l15Var != null && l15Var.e == this && l15Var.f && l15Var.g == i) {
                l15Var.c(i2 != -1 ? "AUTH_CANCELED" : null);
                return;
            }
            return;
        }
        if (i == 520) {
            if (i2 != -1 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
            sharedInstance.createCaptureDevice(true);
            return;
        }
        if (i == 140) {
            Utilities.d.c(new x6c((byte) 25, eb6.f(this.P), i2 == -1));
            return;
        }
        if (i == 521) {
            be2 be2Var = this.q1;
            if (be2Var != null) {
                be2Var.a(Boolean.valueOf(i2 == -1));
                this.q1 = null;
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (gl2Var = themeEditorView.m) != null) {
            gl2Var.F(i, i2, intent);
        }
        ActionBarLayout actionBarLayout = this.p0;
        if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
            org.telegram.ui.ActionBar.d dVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
            dVar.onActivityResultFragment(i, i2, intent);
            if (dVar.getLastStoryViewer() != null && (currentPeerView = dVar.getLastStoryViewer().o0.getCurrentPeerView()) != null && i2 == -1) {
                if (i == 0 || i == 2) {
                    currentPeerView.j0();
                    x31 x31Var = currentPeerView.y2;
                    if (x31Var != null) {
                        x31Var.d2.j0(i, intent, null);
                    }
                } else if (i == 21) {
                    if (intent == null) {
                        currentPeerView.U0();
                    } else {
                        if (intent.getData() != null) {
                            currentPeerView.N0(intent.getData());
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                                currentPeerView.N0(clipData.getItemAt(i3).getUri());
                            }
                        } else {
                            currentPeerView.U0();
                        }
                        x31 x31Var2 = currentPeerView.y2;
                        if (x31Var2 != null) {
                            x31Var2.dismiss();
                        }
                        currentPeerView.a0(true);
                    }
                }
            }
        }
        if (gl.O1()) {
            ActionBarLayout actionBarLayout2 = this.r0;
            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
            }
            ActionBarLayout actionBarLayout3 = this.q0;
            if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
            }
        }
        kk7.e().k(kk7.e5, Integer.valueOf(i), Integer.valueOf(i2), intent);
    }

    @Override // wp2, android.app.Activity
    public final void onBackPressed() {
        if (d0(true)) {
            if (!gl.O1()) {
                this.p0.G();
                return;
            }
            ActionBarLayout actionBarLayout = this.q0;
            if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                this.q0.G();
                return;
            }
            ActionBarLayout actionBarLayout2 = this.r0;
            if (actionBarLayout2 == null || actionBarLayout2.getView().getVisibility() != 0 || this.r0.getFragmentStack().isEmpty()) {
                this.p0.G();
                return;
            }
            org.telegram.ui.ActionBar.d dVar = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
            if (dVar.onBackPressed(true)) {
                dVar.finishFragment();
            }
        }
    }

    @Override // wp2, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        gl.v(this, configuration);
        this.t1.a();
        gl.s3(getWindow());
        super.onConfigurationChanged(configuration);
        mb3 c = mb3.c();
        ArrayList arrayList = (ArrayList) c.c;
        LaunchActivity launchActivity = (LaunchActivity) c.f;
        if (launchActivity == null || !gl.F1(launchActivity)) {
            for (int i = 0; i < arrayList.size(); i++) {
                sj4 sj4Var = ((xa8) arrayList.get(i)).e;
                if (sj4Var != null && sj4Var.h != null && !sj4Var.K) {
                    Activity activity = sj4Var.c;
                    gl.v(activity, activity.getResources().getConfiguration());
                    qj4.b = null;
                    Point point = gl.q;
                    sj4Var.A = (Math.min(point.x, point.y) - (sj4.m() * 2.0f)) / sj4Var.h();
                    int h = (int) (sj4Var.h() * sj4Var.z);
                    sa8 sa8Var = sj4Var.b;
                    int Q0 = sa8Var.Q0();
                    int S1 = sa8Var.S1();
                    float f = (Q0 <= 0 || S1 <= 0) ? 0.5625f : S1 / Q0;
                    int i2 = (int) (((int) (sj4.i(f) * f)) * sj4Var.z);
                    if (sj4Var.x != h || sj4Var.y != i2) {
                        WindowManager.LayoutParams layoutParams = sj4Var.e;
                        sj4Var.x = h;
                        layoutParams.width = h;
                        sj4Var.y = i2;
                        layoutParams.height = i2;
                        sj4Var.r();
                    }
                    yla ylaVar = sj4Var.D;
                    ylaVar.b = sj4Var.B;
                    ylaVar.c = true;
                    ylaVar.m.i = sj4.n(r6, sj4Var.x);
                    sj4Var.D.h();
                    yla ylaVar2 = sj4Var.E;
                    ylaVar2.b = sj4Var.C;
                    ylaVar2.c = true;
                    ylaVar2.m.i = sj4.e(r6, sj4Var.y);
                    sj4Var.E.h();
                }
            }
        }
        gl.Z2();
        Z();
        G();
        gl.d3(new rx5(this, (byte) 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            int i3 = pipRoundVideoView.y.getInt("sidex", 1);
            int i4 = pipRoundVideoView.y.getInt("sidey", 0);
            float f2 = pipRoundVideoView.y.getFloat("px", 0.0f);
            float f3 = pipRoundVideoView.y.getFloat("py", 0.0f);
            pipRoundVideoView.w.x = PipRoundVideoView.b(f2, i3, pipRoundVideoView.h, true);
            pipRoundVideoView.w.y = PipRoundVideoView.b(f3, i4, pipRoundVideoView.n, false);
            pipRoundVideoView.x.updateViewLayout(pipRoundVideoView.a, pipRoundVideoView.w);
        }
        ou3 ou3Var = ou3.R1;
        if (ou3Var != null) {
            ou3Var.Z(configuration);
        }
        dn0 dn0Var = dn0.o1;
        if (dn0Var != null) {
            dn0Var.Z(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.f9;
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            int i5 = themeEditorView.l.getInt("sidex", 1);
            int i6 = themeEditorView.l.getInt("sidey", 0);
            float f4 = themeEditorView.l.getFloat("px", 0.0f);
            float f5 = themeEditorView.l.getFloat("py", 0.0f);
            themeEditorView.i.x = ThemeEditorView.b(f4, i5, themeEditorView.g, true);
            themeEditorView.i.y = ThemeEditorView.b(f5, i6, themeEditorView.h, false);
            try {
                if (themeEditorView.c.getParent() != null) {
                    themeEditorView.j.updateViewLayout(themeEditorView.c, themeEditorView.i);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        if (bkb.o == 3) {
            bkb.E(false);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:0|1|(1:3)(1:226)|4|(2:10|(2:29|30)(2:14|(2:18|(1:28))))|32|(2:33|34)|35|(1:37)|38|(1:42)|43|(1:46)|47|(4:49|50|51|(1:53))|57|(1:59)|60|(3:66|(1:68)(1:222)|(3:70|71|(23:73|74|75|85|(1:87)(1:176)|88|89|90|91|(1:93)(1:173)|(1:95)|96|(1:98)|99|(1:171)|103|104|105|(2:107|(1:109))|110|(1:112)|113|(14:115|(1:117)|118|119|(4:127|(1:(1:130)(1:133))(1:134)|131|132)|(1:136)|137|138|139|(3:141|142|143)(1:161)|144|(3:146|(1:148)|149)(2:152|(3:154|(1:156)|157))|150|151)(2:165|166))))|223|85|(0)(0)|88|89|90|91|(0)(0)|(0)|96|(0)|99|(1:101)|169|171|103|104|105|(0)|110|(0)|113|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(44:0|1|(1:3)(1:226)|4|(2:10|(2:29|30)(2:14|(2:18|(1:28))))|32|33|34|35|(1:37)|38|(1:42)|43|(1:46)|47|(4:49|50|51|(1:53))|57|(1:59)|60|(3:66|(1:68)(1:222)|(3:70|71|(23:73|74|75|85|(1:87)(1:176)|88|89|90|91|(1:93)(1:173)|(1:95)|96|(1:98)|99|(1:171)|103|104|105|(2:107|(1:109))|110|(1:112)|113|(14:115|(1:117)|118|119|(4:127|(1:(1:130)(1:133))(1:134)|131|132)|(1:136)|137|138|139|(3:141|142|143)(1:161)|144|(3:146|(1:148)|149)(2:152|(3:154|(1:156)|157))|150|151)(2:165|166))))|223|85|(0)(0)|88|89|90|91|(0)(0)|(0)|96|(0)|99|(1:101)|169|171|103|104|105|(0)|110|(0)|113|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x05d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x05d7, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0503, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0504, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04db A[Catch: Exception -> 0x0503, TryCatch #7 {Exception -> 0x0503, blocks: (B:90:0x04a6, B:93:0x04ae, B:95:0x04b6, B:96:0x04ba, B:98:0x04be, B:99:0x04d5, B:101:0x04db, B:169:0x04e1, B:171:0x04e5), top: B:89:0x04a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0534 A[Catch: all -> 0x05d6, TryCatch #2 {all -> 0x05d6, blocks: (B:105:0x051a, B:107:0x0534, B:109:0x0548, B:110:0x0554, B:112:0x0560, B:113:0x0564, B:115:0x0572, B:117:0x059e, B:118:0x05ae, B:165:0x05ce, B:166:0x05d5), top: B:104:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0560 A[Catch: all -> 0x05d6, TryCatch #2 {all -> 0x05d6, blocks: (B:105:0x051a, B:107:0x0534, B:109:0x0548, B:110:0x0554, B:112:0x0560, B:113:0x0564, B:115:0x0572, B:117:0x059e, B:118:0x05ae, B:165:0x05ce, B:166:0x05d5), top: B:104:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0572 A[Catch: all -> 0x05d6, TryCatch #2 {all -> 0x05d6, blocks: (B:105:0x051a, B:107:0x0534, B:109:0x0548, B:110:0x0554, B:112:0x0560, B:113:0x0564, B:115:0x0572, B:117:0x059e, B:118:0x05ae, B:165:0x05ce, B:166:0x05d5), top: B:104:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ce A[Catch: all -> 0x05d6, TryCatch #2 {all -> 0x05d6, blocks: (B:105:0x051a, B:107:0x0534, B:109:0x0548, B:110:0x0554, B:112:0x0560, B:113:0x0564, B:115:0x0572, B:117:0x059e, B:118:0x05ae, B:165:0x05ce, B:166:0x05d5), top: B:104:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04ae A[Catch: Exception -> 0x0503, TRY_ENTER, TryCatch #7 {Exception -> 0x0503, blocks: (B:90:0x04a6, B:93:0x04ae, B:95:0x04b6, B:96:0x04ba, B:98:0x04be, B:99:0x04d5, B:101:0x04db, B:169:0x04e1, B:171:0x04e5), top: B:89:0x04a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b6 A[Catch: Exception -> 0x0503, TryCatch #7 {Exception -> 0x0503, blocks: (B:90:0x04a6, B:93:0x04ae, B:95:0x04b6, B:96:0x04ba, B:98:0x04be, B:99:0x04d5, B:101:0x04db, B:169:0x04e1, B:171:0x04e5), top: B:89:0x04a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04be A[Catch: Exception -> 0x0503, TryCatch #7 {Exception -> 0x0503, blocks: (B:90:0x04a6, B:93:0x04ae, B:95:0x04b6, B:96:0x04ba, B:98:0x04be, B:99:0x04d5, B:101:0x04db, B:169:0x04e1, B:171:0x04e5), top: B:89:0x04a6 }] */
    /* JADX WARN: Type inference failed for: r5v40, types: [android.app.AppOpsManager$OnOpChangedListener, ua8] */
    @Override // en4, wp2, vp2, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        long j;
        boolean z;
        int i;
        lg4 lg4Var;
        String str;
        String lowerCase;
        ActionBarLayout actionBarLayout;
        String string;
        Intent intent;
        Uri data;
        E1 = true;
        F1++;
        boolean z2 = w01.a;
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        H1 = this;
        org.telegram.messenger.a.v();
        gl.v(this, getResources().getConfiguration());
        this.P = y6c.t0;
        this.f1 = new zj(this, (byte) 6);
        IntentFilter intentFilter = new IntentFilter("org.telegram.messenger.DEBUG_THEME");
        int i2 = Build.VERSION.SDK_INT;
        zj zjVar = this.f1;
        if (i2 >= 33) {
            registerReceiver(zjVar, intentFilter, 2);
        } else {
            registerReceiver(zjVar, intentFilter);
        }
        if (!y6c.h(this.P).o() && (intent = getIntent()) != null && intent.getAction() != null) {
            if ("android.intent.action.SEND".equals(intent.getAction()) || "android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                super.onCreate(bundle);
                finish();
                return;
            } else if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null) {
                String lowerCase2 = data.toString().toLowerCase();
                if (!lowerCase2.startsWith("tg:proxy") && !lowerCase2.startsWith("tg://proxy") && !lowerCase2.startsWith("tg:webproxy") && !lowerCase2.startsWith("tg://webproxy") && !lowerCase2.startsWith("tg:socks")) {
                    lowerCase2.startsWith("tg://socks");
                }
            }
        }
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        byte b = 0;
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, bkb.w0(null, bkb.r8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new x9((byte) 0));
        getWindow().setFormat(-1);
        h24 h24Var = new h24(getWindow(), new wn4((byte) 25));
        this.e1 = h24Var;
        h24Var.a();
        super.onCreate(bundle);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            gl.E = isInMultiWindowMode();
        }
        bkb.O();
        bkb.S(this);
        if (gba.r.length() != 0 && gba.w) {
            gba.A = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = gl.a;
        this.p0 = new ActionBarLayout(this, true);
        yc ycVar = new yc((byte) 29, (Context) this, (Object) this);
        this.v0 = ycVar;
        ycVar.setClipToPadding(false);
        this.v0.setClipChildren(false);
        setContentView(this.v0);
        this.g1 = new twc(this.v0);
        mb3 c = mb3.c();
        a06 a06Var = new a06(this, false);
        LaunchActivity launchActivity = (LaunchActivity) c.f;
        if (launchActivity != null && launchActivity != this) {
            ((ddb) c.e).c();
        }
        c.f = this;
        c.a = false;
        c.b = false;
        ddb ddbVar = (ddb) c.e;
        ddbVar.b = this;
        ddbVar.d = a06Var;
        ddbVar.n = null;
        ddbVar.c = new gdb(this);
        ((ViewGroup) getWindow().getDecorView()).addView(ddbVar.c);
        Context context = org.telegram.messenger.a.b;
        final w88 w88Var = new w88(c, (byte) 8);
        if (wqe.a == null) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            final String packageName = context.getPackageName();
            ?? r5 = new AppOpsManager.OnOpChangedListener() { // from class: ua8
                @Override // android.app.AppOpsManager.OnOpChangedListener
                public final void onOpChanged(String str2, String str3) {
                    if (packageName.equals(str3)) {
                        gl.d3(w88Var);
                    }
                }
            };
            wqe.a = r5;
            try {
                appOpsManager.startWatchingMode("android:system_alert_window", packageName, r5);
                if (i3 >= 26) {
                    appOpsManager.startWatchingMode("android:picture_in_picture", packageName, wqe.a);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        umb umbVar = new umb(this);
        this.n0 = umbVar;
        umbVar.setVisibility(8);
        mq3 mq3Var = new mq3(this);
        this.y0 = mq3Var;
        mq3Var.setActionBarLayout(this.p0);
        this.y0.addOnLayoutChangeListener(new uz5());
        this.y0.setClipChildren(false);
        this.y0.setClipToPadding(false);
        this.v0.addView(this.y0, nme.c(-1.0f, -1));
        byte b2 = 3;
        v31 v31Var = new v31(this, b2);
        this.o0 = v31Var;
        v31Var.setScaleType(ImageView.ScaleType.CENTER);
        this.v0.addView(this.o0, nme.c(48.0f, 48));
        this.o0.setVisibility(8);
        yc ycVar2 = this.v0;
        yx0 yx0Var = new yx0(this);
        this.x0 = yx0Var;
        ycVar2.addView(yx0Var);
        yc ycVar3 = this.v0;
        vz5 vz5Var = new vz5(this);
        vz5Var.setVisibility(8);
        this.w0 = vz5Var;
        ycVar3.addView(vz5Var);
        E0();
        this.y0.setParentActionBarLayout(this.p0);
        this.p0.setDrawerLayoutContainer(this.y0);
        this.p0.setFragmentStack(this.e0);
        this.p0.setFragmentStackChangedListener(new rx5(this, b2));
        this.p0.setDelegate(this);
        bkb.m1(true);
        B();
        P0();
        kk7 e2 = kk7.e();
        int i4 = kk7.m4;
        e2.k(i4, this);
        this.d0 = ConnectionsManager.getInstance(this.P).getConnectionState();
        wtc wtcVar = this.n1;
        if (wtcVar != null) {
            wtcVar.a();
            this.n1 = null;
        }
        wtc wtcVar2 = new wtc(kk7.e(), this);
        wtcVar2.b(kk7.L0);
        wtcVar2.b(kk7.z4);
        wtcVar2.b(kk7.A4);
        wtcVar2.b(kk7.p4);
        wtcVar2.b(kk7.v4);
        wtcVar2.b(kk7.t4);
        wtcVar2.b(i4);
        wtcVar2.b(kk7.m0);
        wtcVar2.b(kk7.B4);
        wtcVar2.b(kk7.M4);
        wtcVar2.b(kk7.R4);
        wtcVar2.b(kk7.p5);
        wtcVar2.b(kk7.m5);
        wtcVar2.b(kk7.O5);
        wtcVar2.b(kk7.P5);
        this.n1 = wtcVar2;
        bz5 bz5Var = new bz5(this, b);
        this.p1 = bz5Var;
        e66.a(bz5Var);
        if (this.p0.getFragmentStack().isEmpty() && ((actionBarLayout = this.q0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (y6c.h(this.P).o()) {
                this.p0.b(-1, new ah6());
            } else {
                this.p0.b(-1, P());
            }
            if (bundle != null) {
                try {
                    string = bundle.getString("fragment");
                } catch (Exception e3) {
                    e = e3;
                    j = 0;
                }
                if (string != null) {
                    Bundle bundle2 = bundle.getBundle("args");
                    try {
                        switch (string.hashCode()) {
                            case -1529105743:
                                j = 0;
                                if (string.equals("wallpapers")) {
                                    WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(0);
                                    this.p0.b(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                j = 0;
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.p0.b(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                j = 0;
                                if (string.equals("chat") && bundle2 != null) {
                                    mu1 mu1Var = new mu1(bundle2);
                                    long j2 = bundle.getLong("topic_id");
                                    long j3 = bundle2.getLong("chat_id");
                                    if (j2 != 0 && j3 != 0) {
                                        TLRPC.Chat K0 = na7.q1(this.P).K0(Long.valueOf(j3));
                                        if (hc2.c0(K0) && !hc2.a(K0) && !hc2.u0(K0)) {
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("chat_id", j3);
                                            org.telegram.ui.ActionBar.d F0 = qvb.F0(this, bundle3);
                                            if (F0 instanceof qvb) {
                                                this.p0.b(-1, F0);
                                            }
                                        }
                                        mm4.a(mu1Var, zc7.a(-j3, j2));
                                    }
                                    if (this.p0.b(-1, mu1Var)) {
                                        mu1Var.n8 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                j = 0;
                                if (string.equals("group") && bundle2 != null) {
                                    wa5 wa5Var = new wa5(bundle2);
                                    if (this.p0.b(-1, wa5Var)) {
                                        wa5Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                j = 0;
                                if (string.equals("channel") && bundle2 != null) {
                                    yh1 yh1Var = new yh1(bundle2);
                                    if (this.p0.b(-1, yh1Var)) {
                                        yh1Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    j = 0;
                                    bundle2.putLong("user_id", y6c.h(this.P).n);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.p0.b(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.p0.b(-1, new d8a(null));
                                    break;
                                }
                                break;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        fa4.g(e, true);
                        G();
                        H(false, true, !this.W0);
                        long j4 = j;
                        byte b3 = 3;
                        V(getIntent(), false, bundle != null, false, null, true, true);
                        String str2 = Build.DISPLAY;
                        String str3 = Build.USER;
                        if (str2 != null) {
                        }
                        if (str3 != null) {
                        }
                        if (w01.a) {
                        }
                        if (!lowerCase.contains("flyme")) {
                        }
                        gl.y = true;
                        View rootView = getWindow().getDecorView().getRootView();
                        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                        c25 c25Var = new c25(rootView, (byte) 2);
                        this.h0 = c25Var;
                        viewTreeObserver.addOnGlobalLayoutListener(c25Var);
                        MediaController.w().K0 = this;
                        ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
                        boolean z3 = w01.a;
                        String valueOf = String.valueOf(y6c.h(y6c.t0).n);
                        if (y6c.h(y6c.t0).f() != null) {
                        }
                        if (ConnectionsManager.getInstance(y6c.t0).isTestBackend()) {
                        }
                        lg4Var = (lg4) jg4.c().b(lg4.class);
                        if (lg4Var == null) {
                        }
                    }
                    G();
                    H(false, true, !this.W0);
                    long j42 = j;
                    byte b32 = 3;
                    V(getIntent(), false, bundle != null, false, null, true, true);
                    String str22 = Build.DISPLAY;
                    String str32 = Build.USER;
                    lowerCase = str22 != null ? str22.toLowerCase() : "";
                    String lowerCase3 = str32 != null ? lowerCase.toLowerCase() : "";
                    if (w01.a) {
                        fa4.b("OS name " + lowerCase + " " + lowerCase3);
                    }
                    if ((!lowerCase.contains("flyme") || lowerCase3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                        gl.y = true;
                        View rootView2 = getWindow().getDecorView().getRootView();
                        ViewTreeObserver viewTreeObserver2 = rootView2.getViewTreeObserver();
                        c25 c25Var2 = new c25(rootView2, (byte) 2);
                        this.h0 = c25Var2;
                        viewTreeObserver2.addOnGlobalLayoutListener(c25Var2);
                    }
                    MediaController.w().K0 = this;
                    ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
                    boolean z32 = w01.a;
                    String valueOf2 = String.valueOf(y6c.h(y6c.t0).n);
                    if (y6c.h(y6c.t0).f() != null) {
                        String o = l7c.o(y6c.h(y6c.t0).f());
                        if (!TextUtils.isEmpty(o)) {
                            valueOf2 = "@" + o;
                        }
                    }
                    if (ConnectionsManager.getInstance(y6c.t0).isTestBackend()) {
                        valueOf2 = valueOf2.concat(" [TEST SERVER]");
                    }
                    lg4Var = (lg4) jg4.c().b(lg4.class);
                    if (lg4Var == null) {
                        throw new NullPointerException("FirebaseCrashlytics component is not present.");
                    }
                    rc1 rc1Var = lg4Var.a;
                    ((pz2) ((mv6) rc1Var.n).b).a(new gu2((Object) rc1Var, (Object) valueOf2, (byte) 7));
                    lg4Var.b("version", "public");
                    lg4Var.b("model", Build.MODEL);
                    lg4Var.b("manufacturer", Build.MANUFACTURER);
                    if (Build.VERSION.SDK_INT >= 31) {
                        str = Build.SOC_MODEL;
                        lg4Var.b("soc_model", str);
                        lg4Var.b("soc_manufacturer", Build.SOC_MANUFACTURER);
                    }
                    lg4Var.b("device", Build.DEVICE);
                    lg4Var.b("product", Build.PRODUCT);
                    lg4Var.b("hardware", Build.HARDWARE);
                    lg4Var.b("user", Build.USER);
                    lg4Var.a();
                    ige.b(true);
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - aue.a.getLong("last_checked", j42) >= 86400000 && aue.a.getInt("dismissed_count", 0) < 3) {
                        Pattern pattern = ij.a;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                        alertDialog$Builder.a.S = k96.M0(2131754280, null);
                        alertDialog$Builder.a.U = gl.T2(k96.M0(fqe.a() ? i5 >= 31 ? 2131754278 : 2131754277 : 2131754279, null));
                        int i6 = bkb.K5;
                        alertDialog$Builder.l(R.raw.permission_request_apk, 72, bkb.w0(null, i6, false), null);
                        alertDialog$Builder.m(i6, null);
                        alertDialog$Builder.j(k96.M0(2131747107, null), new he(this, (byte) 2));
                        alertDialog$Builder.g(k96.M0(2131751760, null), null);
                        alertDialog$Builder.a.setOnDismissListener(new g5(b32));
                        alertDialog$Builder.a.show();
                        aue.a.edit().putLong("last_checked", System.currentTimeMillis()).apply();
                    }
                    if (i5 >= 31) {
                        getWindow().getDecorView().addOnAttachStateChangeListener(new wz5(this));
                    }
                    m21.a(this.v0, new oy((byte) 8));
                    getWindow().getDecorView().setSystemUiVisibility(1792);
                    Window window = getWindow();
                    try {
                        gl.S(window);
                        if (i5 >= 28) {
                            z = false;
                            try {
                                window.setNavigationBarDividerColor(0);
                            } catch (Throwable th) {
                                th = th;
                                fa4.g(th, true);
                                BackupAgent.a();
                                qa9.Y(z);
                                i = Build.VERSION.SDK_INT;
                                if (i < 34) {
                                }
                                C();
                                return;
                            }
                        } else {
                            z = false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                    }
                    BackupAgent.a();
                    qa9.Y(z);
                    i = Build.VERSION.SDK_INT;
                    if (i < 34) {
                        if (this.j1 == null) {
                            this.j1 = new xz5(this);
                        }
                        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.j1);
                    } else if (i >= 33) {
                        if (this.k1 == null) {
                            this.k1 = new yz5(this);
                        }
                        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.k1);
                    }
                    C();
                    return;
                }
            }
        }
        j = 0;
        G();
        H(false, true, !this.W0);
        long j422 = j;
        byte b322 = 3;
        V(getIntent(), false, bundle != null, false, null, true, true);
        String str222 = Build.DISPLAY;
        String str322 = Build.USER;
        if (str222 != null) {
        }
        if (str322 != null) {
        }
        if (w01.a) {
        }
        if (!lowerCase.contains("flyme")) {
        }
        gl.y = true;
        View rootView22 = getWindow().getDecorView().getRootView();
        ViewTreeObserver viewTreeObserver22 = rootView22.getViewTreeObserver();
        c25 c25Var22 = new c25(rootView22, (byte) 2);
        this.h0 = c25Var22;
        viewTreeObserver22.addOnGlobalLayoutListener(c25Var22);
        MediaController.w().K0 = this;
        ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
        boolean z322 = w01.a;
        String valueOf22 = String.valueOf(y6c.h(y6c.t0).n);
        if (y6c.h(y6c.t0).f() != null) {
        }
        if (ConnectionsManager.getInstance(y6c.t0).isTestBackend()) {
        }
        lg4Var = (lg4) jg4.c().b(lg4.class);
        if (lg4Var == null) {
        }
    }

    @Override // en4, android.app.Activity
    public final void onDestroy() {
        ip4 ip4Var;
        ArrayList arrayList;
        oc6 oc6Var;
        l15 l15Var = bje.b;
        if (l15Var != null && l15Var.e == this) {
            l15Var.c("AUTH_CANCELED");
            bje.b.e();
        }
        mb3 c = mb3.c();
        ArrayList arrayList2 = (ArrayList) c.c;
        if (((LaunchActivity) c.f) == this) {
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((xa8) arrayList2.get(size)).b();
            }
            ((ddb) c.e).c();
            c.f = null;
            ((ArrayList) c.d).clear();
        }
        int i = 0;
        E1 = false;
        F1--;
        zj zjVar = this.f1;
        if (zjVar != null) {
            unregisterReceiver(zjVar);
            this.f1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.m9 != null) {
                PhotoViewer.m9.M();
            }
            if (PhotoViewer.C0()) {
                PhotoViewer.r0().M();
            }
            if (SecretMediaViewer.e()) {
                SecretMediaViewer d = SecretMediaViewer.d();
                Runnable runnable = d.o1;
                if (runnable != null) {
                    runnable.run();
                    d.o1 = null;
                }
                a06 a06Var = d.k1;
                if (a06Var != null) {
                    a06Var.a();
                    d.k1 = null;
                }
                kk7.f(d.a).n(d, kk7.v);
                kk7.f(d.a).n(d, kk7.k0);
                kk7.f(d.a).n(d, kk7.h0);
                d.s = false;
                d.M = null;
                jl5 jl5Var = d.h0;
                if (jl5Var != null) {
                    jl5Var.a();
                    d.h0 = null;
                }
                d.j();
                if (d.b != null && (oc6Var = d.d) != null) {
                    try {
                        if (oc6Var.getParent() != null) {
                            ((WindowManager) d.b.getSystemService("window")).removeViewImmediate(d.d);
                        }
                        d.d = null;
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                SecretMediaViewer.w1 = null;
            }
            if (o.F()) {
                o.u().q();
            }
            if (xv2.g0 != null) {
                xv2 e2 = xv2.e();
                e2.E = false;
                e2.l = null;
                e2.W = null;
                e2.Y = null;
                e2.a0 = null;
                if (e2.w != null && e2.y != null) {
                    Bitmap bitmap = e2.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        e2.v = null;
                    }
                    e2.M = 0.0f;
                    e2.K = false;
                    try {
                        if (e2.y.getParent() != null) {
                            ((WindowManager) e2.w.getSystemService("window")).removeViewImmediate(e2.y);
                        }
                        e2.y = null;
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                    xv2.g0 = null;
                    kk7.e().k(kk7.j1, 8);
                }
            }
            h75 h75Var = h75.s5;
            if (h75Var != null) {
                h75Var.I();
            }
            on9 on9Var = on9.Q0;
            if (on9Var != null) {
                on9Var.e();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i2 = bkb.a;
            ou3 ou3Var = ou3.R1;
            if (ou3Var != null) {
                ou3Var.E0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            hj4 hj4Var = uge.a;
            if (hj4Var != null) {
                hj4Var.e.edit().putFloat("x", (float) hj4Var.c.m.i).putFloat("y", (float) hj4Var.d.m.i).commit();
            }
            uge.a = null;
            SparseArray sparseArray = vl.r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController w = MediaController.w();
        if (w.K0 == this) {
            w.K0 = null;
        }
        MediaController w2 = MediaController.w();
        if (w2.L0 == this.s1) {
            w2.L0 = null;
        }
        while (true) {
            try {
                int size2 = this.D0.size();
                arrayList = this.D0;
                if (i >= size2) {
                    break;
                }
                if (((Dialog) arrayList.get(i)).isShowing()) {
                    ((Dialog) this.D0.get(i)).dismiss();
                }
                i++;
            } catch (Exception e4) {
                fa4.g(e4, true);
            }
        }
        arrayList.clear();
        try {
            if (this.h0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.h0);
            }
        } catch (Exception e5) {
            fa4.g(e5, true);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            if (this.j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.j1);
            }
        } else if (i3 >= 33 && this.j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.k1);
        }
        m21.h(this.v0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        e0();
        h24 h24Var = this.e1;
        if (h24Var != null) {
            h24Var.g();
        }
        if (i3 < 24 || (ip4Var = this.i1) == null) {
            return;
        }
        ip4Var.b();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82 && !gba.B) {
            if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
                return super.onKeyUp(i, keyEvent);
            }
            if (o.F() && o.u().W) {
                return super.onKeyUp(i, keyEvent);
            }
            if (!gl.O1()) {
                this.p0.getView().onKeyUp(i, keyEvent);
            } else if (this.q0.getView().getVisibility() == 0 && !this.q0.getFragmentStack().isEmpty()) {
                this.q0.getView().onKeyUp(i, keyEvent);
            } else if (this.r0.getView().getVisibility() != 0 || this.r0.getFragmentStack().isEmpty()) {
                this.p0.getView().onKeyUp(i, keyEvent);
            } else {
                this.r0.getView().onKeyUp(i, keyEvent);
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.p0;
        if (actionBarLayout != null) {
            actionBarLayout.K();
            if (gl.O1()) {
                ActionBarLayout actionBarLayout2 = this.r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.K();
                }
                ActionBarLayout actionBarLayout3 = this.q0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.K();
                }
            }
        }
    }

    @Override // wp2, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        gl.E = z;
        this.t1.a();
        G();
        super.onMultiWindowModeChanged(z);
    }

    @Override // wp2, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Z();
        G();
        V(intent, true, false, false, null, true, true);
    }

    @Override // en4, android.app.Activity
    public final void onPause() {
        VoIPService sharedInstance;
        sj4 sj4Var;
        ya8 ya8Var;
        super.onPause();
        G1 = false;
        vvc.q(true);
        mb3 c = mb3.c();
        ArrayList arrayList = (ArrayList) c.c;
        if (this == ((LaunchActivity) c.f)) {
            c.b = false;
            ddb ddbVar = (ddb) c.e;
            LaunchActivity launchActivity = ddbVar.b;
            if (launchActivity != null && Build.VERSION.SDK_INT >= 31 && ddbVar.f == null && ddbVar.e != null && gl.F1(launchActivity)) {
                ddbVar.i(ddbVar.e);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                xa8 xa8Var = (xa8) arrayList.get(i);
                if (xa8Var.c == 1 && (sj4Var = xa8Var.e) != null && !sj4Var.f && (ya8Var = sj4Var.j) != null && sj4Var.l != null && ya8Var.isAvailable()) {
                    try {
                        Bitmap bitmap = sj4Var.j.getBitmap();
                        if (bitmap != null) {
                            sj4Var.l.setImageBitmap(bitmap);
                            sj4Var.l.setVisibility(0);
                            sj4Var.j.setFirstFrameCallback(null);
                        }
                    } catch (Throwable th) {
                        fa4.g(th, true);
                    }
                }
            }
        }
        kk7.e().k(kk7.i1, Integer.valueOf(TLObject.FLAG_12));
        org.telegram.messenger.a.x = true;
        Utilities.d.c(new xv0(this.P, (byte) 5));
        g0();
        this.p0.M();
        if (gl.O1()) {
            ActionBarLayout actionBarLayout = this.r0;
            if (actionBarLayout != null) {
                actionBarLayout.M();
            }
            ActionBarLayout actionBarLayout2 = this.q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.M();
            }
        }
        aw7 aw7Var = this.z0;
        if (aw7Var != null) {
            aw7Var.b.k();
        }
        ArrayList arrayList2 = this.A0;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((yv7) obj).k();
        }
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
            PhotoViewer r0 = PhotoViewer.r0();
            if (r0.k2 != null) {
                r0.B(false, false);
            } else {
                lbc lbcVar = r0.G2;
                if (lbcVar != null && r0.Z2) {
                    lbcVar.r0(gl.F1(r0.E));
                }
            }
        }
        t7b t7bVar = t7b.G2;
        if (t7bVar != null) {
            t7bVar.t(false);
            j7b j7bVar = t7bVar.d1;
            if (j7bVar != null) {
                j7bVar.f.r();
            }
            i7b i7bVar = t7bVar.Y0;
            if (i7bVar != null) {
                i7bVar.x(0, true);
            }
        }
        xgc.a(this);
        hgc hgcVar = hgc.m1;
        if (hgcVar != null) {
            boolean isInteractive = ((PowerManager) hgcVar.b.getSystemService("power")).isInteractive();
            boolean canDrawOverlays = Settings.canDrawOverlays(hgcVar.b);
            boolean z = canDrawOverlays || wqe.a(hgcVar.b);
            if (hgcVar.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && canDrawOverlays) {
                int measuredHeight = hgc.m1.u0.getMeasuredHeight();
                hgc hgcVar2 = hgc.m1;
                xgc.f(hgcVar2.b, hgcVar2.a, hgcVar2.u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = hgc.m1.r0;
                if (windowInsets != null) {
                    xgc.W = windowInsets.getSystemWindowInsetTop();
                    hgc.m1.r0.getSystemWindowInsetBottom();
                }
            }
            if (hgcVar.n0 && ((!z || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (xgc.d() != null) {
                xgc.d().e();
            }
        } else if (xgc.d() != null) {
            xgc.d().e();
        }
        HashMap hashMap = pla.n;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ola olaVar = ((pla) it.next()).f;
                if (olaVar != null) {
                    olaVar.b = true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r7.f != null) goto L10;
     */
    @Override // wp2, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        xa8 xa8Var;
        View view;
        xa8 xa8Var2;
        super.onPictureInPictureModeChanged(z, configuration);
        ddb ddbVar = (ddb) mb3.c().e;
        if (ddbVar.f == null) {
            if (z && (xa8Var2 = ddbVar.e) != null) {
                ddbVar.i(xa8Var2);
            }
        }
        if (z) {
            mb3.e("system: complete enter");
            ddbVar.i = true;
            if (ddbVar.o && (xa8Var = ddbVar.f) != null && (view = ddbVar.h) != null) {
                xa8Var.a.x0(view);
            }
            if (ddbVar.o) {
                ddbVar.o = false;
                xa8 xa8Var3 = ddbVar.f;
                if (xa8Var3 != null && Build.VERSION.SDK_INT >= 26) {
                    ddbVar.a(xa8Var3);
                }
            }
            a06 a06Var = ddbVar.d;
            if (a06Var != null) {
                a06Var.b(true);
            }
            View view2 = ddbVar.h;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            gdb gdbVar = ddbVar.c;
            if (gdbVar != null) {
                gdbVar.requestLayout();
            }
        } else if (ddbVar.a.a) {
            ddbVar.d();
        } else {
            mb3.e("system: closed by the user");
            ddbVar.i = false;
            ddbVar.o = false;
            a06 a06Var2 = ddbVar.d;
            if (a06Var2 != null) {
                a06Var2.b(false);
            }
            xa8 xa8Var4 = ddbVar.f;
            if (xa8Var4 != null) {
                xa8Var4.b();
            }
        }
        if (z || this.r1) {
            return;
        }
        if (PhotoViewer.m9 != null) {
            PhotoViewer.m9.M();
        }
        if (PhotoViewer.C0()) {
            PhotoViewer.r0().B(false, false);
        }
    }

    @Override // android.app.Activity
    public final boolean onPictureInPictureRequested() {
        ((ddb) mb3.c().e).g();
        return super.onPictureInPictureRequested();
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        ((ddb) mb3.c().e).f(pictureInPictureUiState);
    }

    @Override // en4, wp2, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (w(i, strArr, iArr)) {
            org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
            if (this.p0.getFragmentStack().size() != 0) {
                this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
            if (gl.O1()) {
                if (this.r0.getFragmentStack().size() != 0) {
                    this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                }
                if (this.q0.getFragmentStack().size() != 0) {
                    this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                }
            }
            hgc.h(iArr, i);
            t7b t7bVar = t7b.G2;
            byte b = 2;
            byte b2 = 0;
            if (t7bVar != null) {
                f53 f53Var = t7bVar.a;
                Activity activity = t7bVar.b;
                boolean z = iArr != null && iArr.length == 1 && iArr[0] == 0;
                if (i == 111) {
                    t7bVar.t2 = !z;
                    if (z && t7bVar.g0 == 0) {
                        t7bVar.B0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            t7bVar.p();
                        } else {
                            CameraController.getInstance().initCamera(new d6b(t7bVar, b2));
                        }
                    }
                } else if (i == 114) {
                    if (z) {
                        MediaController.N(0);
                        t7bVar.c(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f53Var, activity);
                        int i2 = bkb.K5;
                        alertDialog$Builder.l(R.raw.permission_request_folder, 72, bkb.w0(null, i2, false), null);
                        alertDialog$Builder.m(i2, null);
                        SpannableStringBuilder T2 = gl.T2(k96.M0(2131747106, null));
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.U = T2;
                        alertDialog$Builder.j(k96.M0(2131747107, null), new k6b(t7bVar, b));
                        alertDialog$Builder.g(k96.M0(2131751760, null), null);
                        hdVar.show();
                    }
                } else if (i == 112) {
                    if (!z) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, f53Var, activity);
                        int i3 = bkb.K5;
                        alertDialog$Builder2.l(R.raw.permission_request_camera, 72, bkb.w0(null, i3, false), null);
                        alertDialog$Builder2.m(i3, null);
                        SpannableStringBuilder T22 = gl.T2(k96.M0(2131747116, null));
                        hd hdVar2 = alertDialog$Builder2.a;
                        hdVar2.U = T22;
                        alertDialog$Builder2.j(k96.M0(2131747107, null), new k6b(t7bVar, (byte) 3));
                        alertDialog$Builder2.g(k96.M0(2131751760, null), null);
                        hdVar2.show();
                    }
                } else if (i == 115) {
                    if (z) {
                        sm3 sm3Var = t7bVar.z2;
                        if (sm3Var != null) {
                            sm3Var.run();
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, f53Var, activity);
                        int i4 = bkb.K5;
                        alertDialog$Builder3.l(R.raw.permission_request_folder, 72, bkb.w0(null, i4, false), null);
                        alertDialog$Builder3.m(i4, null);
                        SpannableStringBuilder T23 = gl.T2(k96.M0(2131747120, null));
                        hd hdVar3 = alertDialog$Builder3.a;
                        hdVar3.U = T23;
                        alertDialog$Builder3.j(k96.M0(2131747107, null), new k6b(t7bVar, (byte) 5));
                        alertDialog$Builder3.g(k96.M0(2131751760, null), null);
                        hdVar3.show();
                    }
                    t7bVar.z2 = null;
                }
            }
            kk7.e().k(kk7.f5, Integer.valueOf(i), strArr, iArr);
            SparseIntArray sparseIntArray = this.b1;
            if (sparseIntArray.get(i, -1) >= 0) {
                int i5 = sparseIntArray.get(i, -1);
                sparseIntArray.delete(i);
                kk7.e().k(kk7.q5, Integer.valueOf(i5));
            }
            kk7.e().k(kk7.r5, Integer.valueOf(i), strArr, iArr);
        }
    }

    @Override // en4, android.app.Activity
    public final void onResume() {
        k27 k27Var;
        a79 a79Var;
        xl6 xl6Var;
        LaunchActivity launchActivity;
        super.onResume();
        byte b = 0;
        vvc.q(false);
        G1 = true;
        mb3 c = mb3.c();
        ArrayList arrayList = (ArrayList) c.c;
        ArrayList arrayList2 = (ArrayList) c.d;
        if (this == ((LaunchActivity) c.f)) {
            c.b = true;
            ddb ddbVar = (ddb) c.e;
            if (ddbVar.f != null && (launchActivity = ddbVar.b) != null && !gl.F1(launchActivity)) {
                ddbVar.d();
            }
            for (int i = 0; i < arrayList.size(); i++) {
                xa8 xa8Var = (xa8) arrayList.get(i);
                sj4 sj4Var = xa8Var.e;
                if (sj4Var != null && xa8Var.c == 1 && sj4Var.g && !sj4Var.K) {
                    if ((sj4Var.b.T() && Settings.canDrawOverlays(sj4Var.c)) != sj4Var.f) {
                        sj4Var.l();
                        sj4Var.a();
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList2.clear();
                int size = arrayList3.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList3.get(i2);
                    i2++;
                    ((Runnable) obj).run();
                }
            }
            c.d();
        }
        byte b2 = 3;
        if (bkb.o == 3) {
            bkb.E(false);
        }
        eb6[] eb6VarArr = eb6.P;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            if (y6c.h(i3).o() && !eb6.f(i3).J.isEmpty()) {
                eb6.q();
                break;
            }
            i3++;
        }
        I(true);
        kk7.e().k(kk7.j1, Integer.valueOf(TLObject.FLAG_12));
        MediaController w = MediaController.w();
        ViewGroup view = this.p0.getView();
        this.s1 = view;
        w.L0 = view;
        org.telegram.messenger.a.x = false;
        na7.q1(this.P).Y4(null);
        I0();
        Utilities.d.c(new ql3((byte) 19));
        D(0);
        if (Build.VERSION.SDK_INT >= 24 && (xl6Var = MediaController.b2) != null) {
            Utilities.e.d(new xv0(xl6Var.e.size(), (byte) 7), 2000L);
        }
        h0();
        aw7 aw7Var = this.z0;
        if (aw7Var == null || aw7Var.b.getVisibility() != 0) {
            this.p0.N();
            if (gl.O1()) {
                ActionBarLayout actionBarLayout = this.r0;
                if (actionBarLayout != null) {
                    actionBarLayout.N();
                }
                ActionBarLayout actionBarLayout2 = this.q0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.N();
                }
            }
        } else {
            this.p0.l();
            if (gl.O1()) {
                ActionBarLayout actionBarLayout3 = this.r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.l();
                }
                ActionBarLayout actionBarLayout4 = this.q0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.l();
                }
            }
            this.z0.b.l();
            ArrayList arrayList4 = this.A0;
            int size2 = arrayList4.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList4.get(i4);
                i4++;
                ((yv7) obj2).l();
            }
        }
        ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        P0();
        if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
            PhotoViewer r0 = PhotoViewer.r0();
            k98 k98Var = r0.f0;
            if (k98Var != null) {
                k98Var.invalidate();
                gl.e3(new on7(r0, b, b2), 100L);
            }
            lbc lbcVar = r0.G2;
            if (lbcVar != null) {
                lbcVar.o0(lbcVar.S() + 1);
                if (r0.Z2) {
                    r0.G2.r0(true);
                }
            }
            q88 q88Var = r0.M1;
            if (q88Var != null && (a79Var = q88Var.M0.d) != null) {
                a79Var.postRunnable(a79Var.x);
            }
        }
        t7b t7bVar = t7b.G2;
        if (t7bVar != null) {
            t7bVar.O();
        }
        if (PipRoundVideoView.G != null && MediaController.w().C() && (k27Var = MediaController.w().v0) != null) {
            MediaController.w().h0(k27Var, k27Var.b0);
        }
        if (y6c.h(y6c.t0).a0 != null) {
            int i5 = y6c.t0;
            L0(i5, y6c.h(i5).a0);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = gba.g1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                int i6 = y6c.t0;
                if (this.C0 == null) {
                    rk0 rk0Var = new rk0(this);
                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    int i7 = bkb.c6;
                    rk0Var.x = new GradientDrawable(orientation, new int[]{bkb.w0(null, i7, false), 0});
                    rk0Var.y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{bkb.w0(null, i7, false), 0});
                    zkb.h(i7, null, rk0Var);
                    int i8 = (int) (gl.m / gl.p);
                    FrameLayout frameLayout = new FrameLayout(this);
                    rk0Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, gl.L(176.0f) + gl.m));
                    ry8 ry8Var = new ry8(this);
                    ry8Var.f(R.raw.qr_code_logo, kk7.s1, kk7.s1, null);
                    ry8Var.d();
                    ry8Var.getAnimatedDrawable().F(1);
                    ry8Var.setScaleType(ImageView.ScaleType.CENTER);
                    ry8Var.setPadding(0, 0, 0, gl.L(14.0f));
                    frameLayout.addView(ry8Var, nme.d(-2, -2.0f, 17, 0.0f, i8, 0.0f, 0.0f));
                    ry8Var.setOnClickListener(new qk0(rk0Var));
                    FrameLayout frameLayout2 = new FrameLayout(this);
                    ScrollView scrollView = new ScrollView(this);
                    rk0Var.f = scrollView;
                    gl.v3(scrollView, bkb.w0(null, bkb.r8, false));
                    scrollView.setPadding(0, gl.L(16.0f), 0, gl.L(16.0f));
                    scrollView.setClipToPadding(false);
                    rk0Var.addView(scrollView, nme.d(-1, -1.0f, 51, 27.0f, i8 + kk7.H2, 27.0f, 130.0f));
                    scrollView.addView(frameLayout2);
                    TextView textView = new TextView(this);
                    int i9 = bkb.F6;
                    zkb.X(textView, i9, null);
                    textView.setTextSize(1, 20.0f);
                    textView.setGravity(49);
                    textView.setTypeface(gl.o());
                    textView.setText(k96.M0(2131743577, null));
                    frameLayout2.addView(textView, nme.e(-2, -2, 49));
                    TextView textView2 = new TextView(this);
                    rk0Var.a = textView2;
                    zkb.X(textView2, i9, null);
                    zkb.G(textView2, bkb.I6, null);
                    textView2.setTextSize(1, 15.0f);
                    textView2.setMovementMethod(new cl(b));
                    textView2.setGravity(49);
                    textView2.setLineSpacing(gl.L(2.0f), 1.0f);
                    frameLayout2.addView(textView2, nme.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                    yc ycVar = new yc(this, b2);
                    rk0Var.d = ycVar;
                    ycVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                    ycVar.setBackgroundDrawable(sjb.f(bkb.Ei, 4.0f));
                    ycVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                    rk0Var.addView(ycVar, nme.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
                    ycVar.setOnClickListener(new qk0(rk0Var, this));
                    TextView textView3 = new TextView(this);
                    rk0Var.b = textView3;
                    textView3.setGravity(17);
                    textView3.setTypeface(gl.o());
                    textView3.setTextColor(-1);
                    textView3.setTextSize(1, 14.0f);
                    ycVar.addView(textView3, nme.e(-2, -2, 17));
                    yc ycVar2 = new yc((byte) 4, (Context) this, (Object) rk0Var);
                    rk0Var.c = ycVar2;
                    ycVar2.setWillNotDraw(false);
                    ycVar2.setAlpha(0.0f);
                    ycVar2.setScaleX(0.1f);
                    ycVar2.setScaleY(0.1f);
                    ycVar2.setVisibility(4);
                    ty8 ty8Var = new ty8(ycVar2);
                    rk0Var.e = ty8Var;
                    ty8Var.d(null, true, false);
                    ty8Var.o = -1;
                    ycVar.addView(ycVar2, nme.e(36, 36, 17));
                    this.C0 = rk0Var;
                    this.y0.addView(rk0Var, nme.c(-1.0f, -1));
                }
                rk0 rk0Var2 = this.C0;
                rk0Var2.w = 0;
                rk0Var2.n = tL_help_appUpdate;
                rk0Var2.s = i6;
                TLRPC.Document document = tL_help_appUpdate.document;
                if (document instanceof TLRPC.TL_document) {
                    rk0Var2.r = ba4.r(null, document);
                }
                if (rk0Var2.getVisibility() != 0) {
                    rk0Var2.setVisibility(0);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
                k27.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
                rk0Var2.a.setText(spannableStringBuilder);
                boolean z = tL_help_appUpdate.document instanceof TLRPC.TL_document;
                TextView textView4 = rk0Var2.b;
                if (z) {
                    textView4.setText(k96.M0(2131743583, null).concat(String.format(Locale.US, " (%1$s)", gl.i0(tL_help_appUpdate.document.size, false, false))));
                } else {
                    textView4.setText(k96.M0(2131743583, null));
                }
                kk7.f(rk0Var2.s).b(rk0Var2, kk7.X1);
                kk7.f(rk0Var2.s).b(rk0Var2, kk7.Y1);
                kk7.f(rk0Var2.s).b(rk0Var2, kk7.W1);
                org.telegram.messenger.a.t();
            }
        }
        A(false);
        org.telegram.messenger.a.G = Settings.canDrawOverlays(this);
        xgc.a(this);
        hgc hgcVar = hgc.m1;
        if (hgcVar != null) {
            if (xgc.d() != null) {
                xgc.b();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                hgcVar.y();
            } else if (VoIPService.getSharedState() == null) {
                hgcVar.u0.b();
            }
            hgcVar.J0 = ((KeyguardManager) hgcVar.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (xgc.d() != null) {
                xgc.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        } else if (xgc.d() != null) {
            xgc.d().getClass();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getVideoState(false) == 1) {
                sharedInstance3.setVideoState(false, 2);
            }
        }
        Z();
        HashMap hashMap = pla.n;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ola olaVar = ((pla) it.next()).f;
                if (olaVar != null) {
                    olaVar.b = false;
                }
            }
        }
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ts tsVar = J1;
        if (tsVar != null) {
            tsVar.run();
            J1 = null;
        }
        na7 q1 = na7.q1(this.P);
        if (q1.u3.contains("SETUP_LOGIN_EMAIL") || q1.u3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            Utilities.d.c(new c87(na7.q1(this.P), (byte) 11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1 A[Catch: Exception -> 0x012f, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x000e, B:9:0x0018, B:11:0x00a1, B:15:0x00af, B:17:0x00be, B:19:0x00c2, B:20:0x012b, B:24:0x00cc, B:27:0x00d2, B:28:0x00db, B:30:0x00df, B:31:0x00e5, B:33:0x00e9, B:35:0x00f2, B:36:0x00f8, B:39:0x0102, B:40:0x010b, B:43:0x0111, B:45:0x0119, B:46:0x0122, B:48:0x0126, B:50:0x0030, B:52:0x0034, B:54:0x003e, B:55:0x0056, B:57:0x0062, B:59:0x007a, B:61:0x0086), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // wp2, vp2, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        org.telegram.ui.ActionBar.d dVar;
        try {
            super.onSaveInstanceState(bundle);
            if (gl.O1()) {
                ActionBarLayout actionBarLayout = this.q0;
                if (actionBarLayout == null || actionBarLayout.getFragmentStack().isEmpty()) {
                    ActionBarLayout actionBarLayout2 = this.r0;
                    if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                        if (!this.p0.getFragmentStack().isEmpty()) {
                            dVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
                        }
                        dVar = null;
                    } else {
                        dVar = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
                    }
                } else {
                    dVar = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
                }
                if (dVar != null) {
                    Bundle arguments = dVar.getArguments();
                    if ((dVar instanceof mu1) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "chat");
                        mu1 mu1Var = (mu1) dVar;
                        if (mu1Var.x4 && mu1Var.g4 == 0) {
                            bundle.putLong("topic_id", mu1Var.d());
                        }
                    } else if ((dVar instanceof wa5) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "group");
                    } else if (dVar instanceof WallpapersListActivity) {
                        bundle.putString("fragment", "wallpapers");
                    } else if (dVar instanceof ProfileActivity) {
                        ProfileActivity profileActivity = (ProfileActivity) dVar;
                        if (profileActivity.r2()) {
                            bundle.putString("fragment", "settings");
                        } else if (profileActivity.f1 != 0 && arguments != null) {
                            bundle.putBundle("args", arguments);
                            bundle.putString("fragment", "chat_profile");
                        }
                    } else if ((dVar instanceof yh1) && arguments != null && arguments.getInt("step") == 0) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "channel");
                    } else if (dVar instanceof d8a) {
                        bundle.putString("fragment", "settings2");
                    }
                    dVar.saveSelfArgs(bundle);
                    return;
                }
                return;
            }
            if (!this.p0.getFragmentStack().isEmpty()) {
                dVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
                if (dVar != null) {
                }
            }
            dVar = null;
            if (dVar != null) {
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r1 != null) goto L31;
     */
    @Override // en4, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        sj4 sj4Var;
        ya8 ya8Var;
        super.onStart();
        this.r1 = true;
        mb3 c = mb3.c();
        ArrayList arrayList = (ArrayList) c.c;
        if (this == ((LaunchActivity) c.f)) {
            c.a = true;
            for (int i = 0; i < arrayList.size(); i++) {
                xa8 xa8Var = (xa8) arrayList.get(i);
                if (xa8Var.c == 1 && (sj4Var = xa8Var.e) != null && !sj4Var.f && (ya8Var = sj4Var.j) != null) {
                    ya8Var.post(new vc4(sj4Var, ya8Var, (byte) 10));
                }
            }
        }
        WeakReference weakReference = d01.e;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (activity != null && activity != this) {
            d01.y(activity);
        }
        if (d01.b == null) {
            d01.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(d01.d)) {
                    String a = cbe.a(this);
                    d01.d = a;
                }
                b01 b01Var = new b01();
                b5a b5aVar = new b5a();
                b5aVar.b = new WeakReference(b01Var);
                d01.c = b5aVar;
                String str = d01.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, b5aVar, 33)) {
                    d01.c = null;
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        org.telegram.messenger.a.y = false;
        o85.k(this);
        h75 h75Var = h75.s5;
        if (h75Var != null) {
            h75Var.n1();
        }
        on9 on9Var = on9.Q0;
        if (on9Var != null) {
            on9Var.I0 = false;
            on9Var.v();
        }
    }

    @Override // en4, android.app.Activity
    public final void onStop() {
        sj4 sj4Var;
        super.onStop();
        l15 l15Var = bje.b;
        if (l15Var != null && l15Var.e == this && Build.VERSION.SDK_INT < 30) {
            l15 l15Var2 = bje.b;
            if (!l15Var2.f) {
                l15Var2.c("AUTH_CANCELED");
                bje.b.e();
            }
        }
        this.r1 = false;
        mb3 c = mb3.c();
        ArrayList arrayList = (ArrayList) c.c;
        if (this == ((LaunchActivity) c.f)) {
            c.a = false;
            ((ddb) c.e).getClass();
            for (int i = 0; i < arrayList.size(); i++) {
                xa8 xa8Var = (xa8) arrayList.get(i);
                if (xa8Var.c == 1 && (sj4Var = xa8Var.e) != null && !sj4Var.f) {
                    xa8Var.a.e();
                    xa8Var.c();
                }
            }
        }
        if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
            PhotoViewer.r0().f1();
        }
        d01.y(this);
        org.telegram.messenger.a.y = true;
        o85.k(this);
        h75 h75Var = h75.s5;
        if (h75Var != null) {
            h75Var.m1();
        }
        on9 on9Var = on9.Q0;
        if (on9Var != null) {
            on9Var.I0 = true;
            on9Var.v();
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.h1 = false;
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        ((ddb) mb3.c().e).g();
        ArrayList arrayList = this.a1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.p0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.V0.isEmpty()) {
                ((org.telegram.ui.ActionBar.d) oo1.m(1, actionBarLayout.V0)).onUserLeaveHint();
            }
            k6 k6Var = actionBarLayout.H;
            if (k6Var != null) {
                k6Var.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z) {
        boolean z2;
        p2b a;
        long[] jArr2 = jArr;
        int i = 0;
        while (true) {
            if (i >= jArr2.length) {
                z2 = true;
                break;
            }
            TLRPC.User V1 = na7.q1(this.P).V1(Long.valueOf(jArr2[i]));
            if (V1 != null && !V1.stories_hidden) {
                z2 = false;
                break;
            }
            i++;
        }
        org.telegram.ui.ActionBar.d Q = Q();
        if (Q != null) {
            g2b M1 = na7.q1(this.P).M1();
            ArrayList arrayList = new ArrayList(z2 ? M1.h : M1.g);
            boolean z3 = z2;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (!z3) {
                ArrayList arrayList4 = new ArrayList();
                for (int i2 = 0; i2 < jArr2.length; i2++) {
                    TLRPC.User V12 = na7.q1(this.P).V1(Long.valueOf(jArr2[i2]));
                    if (V12 == null || !V12.stories_hidden) {
                        arrayList4.add(Long.valueOf(jArr2[i2]));
                    }
                }
                Object[] array = arrayList4.toArray();
                int length = array.length;
                long[] jArr3 = new long[length];
                for (int i3 = 0; i3 < length; i3++) {
                    Object obj = array[i3];
                    obj.getClass();
                    jArr3[i3] = ((Number) obj).longValue();
                }
                jArr2 = jArr3;
            }
            int i4 = 0;
            if (z) {
                while (i4 < jArr2.length) {
                    i4 = mue.c(i4, 1, jArr2[i4], arrayList3);
                }
            } else {
                while (i4 < jArr2.length) {
                    i4 = mue.c(i4, 1, jArr2[i4], arrayList2);
                }
            }
            if (!arrayList3.isEmpty() && z) {
                na7 q1 = na7.q1(this.P);
                int[] iArr = {arrayList3.size()};
                sx5 sx5Var = new sx5((Object) this, (Object) iArr, (Object) jArr2, (byte) 3);
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    long longValue = ((Long) arrayList3.get(i5)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer h1 = q1.h1(longValue);
                    tL_stories_getPeerStories.peer = h1;
                    if (h1 instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getPeerStories, new w47((Object) q1, longValue, (Object) sx5Var, (byte) 3));
                    }
                }
                return;
            }
            long e = y6c.h(this.P).e();
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                long n = cf3.n(((TL_stories.PeerStories) arrayList.get(i6)).peer);
                if (n != e && !arrayList2.contains(Long.valueOf(n)) && M1.K(n)) {
                    arrayList2.add(Long.valueOf(n));
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            if (Q instanceof cj3) {
                try {
                    a = p2b.a(((cj3) Q).F0.h);
                } catch (Exception unused) {
                }
                p2b p2bVar = a;
                Q.getOrCreateStoryViewer().y();
                Q.getOrCreateStoryViewer().K(this, null, arrayList2, 0, null, null, p2bVar, false);
            }
            a = null;
            p2b p2bVar2 = a;
            Q.getOrCreateStoryViewer().y();
            Q.getOrCreateStoryViewer().K(this, null, arrayList2, 0, null, null, p2bVar2, false);
        }
    }

    public final void q0(final int i, final long j, final boolean z) {
        TL_stories.StoryItem storyItem;
        y1b y1bVar;
        y1b z2;
        k27 f;
        k27 f2;
        TL_stories.StoryItem storyItem2;
        g2b M1 = na7.q1(this.P).M1();
        TL_stories.PeerStories x = M1.x(j);
        p2b p2bVar = null;
        if (x != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= x.stories.size()) {
                    storyItem2 = null;
                    break;
                } else {
                    if (x.stories.get(i2).id == i) {
                        storyItem2 = x.stories.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j;
                org.telegram.ui.ActionBar.d Q = Q();
                if (Q != null) {
                    if (Q instanceof cj3) {
                        try {
                            p2bVar = p2b.a(((cj3) Q).F0.h);
                        } catch (Exception unused) {
                        }
                    }
                    p2b p2bVar2 = p2bVar;
                    Q.getOrCreateStoryViewer().y();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z) {
                        Q.getOrCreateStoryViewer().w1 = true;
                    }
                    Q.getOrCreateStoryViewer().K(this, storyItem2, arrayList, 0, null, x, p2bVar2, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            y1b z3 = M1.z(0, -1, j, true);
            if (z3 == null || (f2 = z3.f(i)) == null) {
                z3 = null;
            } else {
                storyItem = f2.l;
            }
            if (storyItem != null || (z2 = M1.z(1, -1, j, true)) == null || (f = z2.f(i)) == null) {
                y1bVar = z3;
            } else {
                storyItem = f.l;
                y1bVar = z2;
            }
            if (storyItem != null && y1bVar != null) {
                storyItem.dialogId = j;
                org.telegram.ui.ActionBar.d Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof cj3) {
                    try {
                        p2bVar = p2b.a(((cj3) Q2).F0.h);
                    } catch (Exception unused2) {
                    }
                }
                p2b p2bVar3 = p2bVar;
                Q2.getOrCreateStoryViewer().y();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z) {
                    Q2.getOrCreateStoryViewer().w1 = true;
                }
                Q2.getOrCreateStoryViewer().K(this, storyItem, arrayList2, 0, y1bVar, null, p2bVar3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = na7.q1(this.P).h1(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: gz5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.C1;
                gl.d3(new tm3(LaunchActivity.this, tLObject, i, j, z));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06d0 A[LOOP:4: B:211:0x06c8->B:213:0x06d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0705 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c5  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v23, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v24 */
    @Override // wi3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(cj3 cj3Var, ArrayList arrayList, final CharSequence charSequence, boolean z, boolean z2, int i, final int i2, qvb qvbVar) {
        mu1 mu1Var;
        final mu1 mu1Var2;
        CharSequence charSequence2;
        boolean z3;
        k27 k27Var;
        mu1 mu1Var3;
        long j;
        long j2;
        j5 j5Var;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        int size;
        ArrayList arrayList2;
        int i4;
        CharSequence charSequence6;
        LaunchActivity launchActivity;
        int i5;
        ArrayList arrayList3;
        LaunchActivity launchActivity2;
        CharSequence charSequence7;
        int i6;
        boolean z7;
        boolean z8;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        boolean z9;
        ArrayList arrayList4;
        TLRPC.Message message;
        String str;
        LaunchActivity launchActivity3;
        ?? r10;
        final LaunchActivity launchActivity4 = this;
        final ArrayList arrayList5 = arrayList;
        final int currentAccount = cj3Var != null ? cj3Var.getCurrentAccount() : launchActivity4.P;
        Uri uri = launchActivity4.Y;
        boolean z10 = true;
        boolean z11 = false;
        if (uri != null) {
            ArrayList arrayList6 = launchActivity4.X != null ? new ArrayList(launchActivity4.X) : null;
            hd hdVar = new hd(3, null, launchActivity4);
            z3a.B(currentAccount).P(((zc7) arrayList5.get(0)).a, launchActivity4.Y, launchActivity4.X, new ez5(launchActivity4, currentAccount, cj3Var, z, arrayList6, uri, hdVar));
            try {
                hdVar.q(300L);
            } catch (Exception unused) {
            }
            launchActivity3 = launchActivity4;
            r10 = 0;
        } else {
            cj3 cj3Var2 = cj3Var;
            final boolean z12 = cj3Var2 == null || cj3Var2.L2 || z2;
            int i7 = i != 0 ? i : cj3Var2 == null ? 0 : cj3Var2.M2;
            boolean z13 = cj3Var2 != null && cj3Var2.O2;
            if (arrayList5.size() <= 1) {
                long j3 = ((zc7) arrayList5.get(0)).a;
                Bundle l = ir2.l("scrollToTopOnResume", true);
                if (!gl.O1()) {
                    kk7.f(currentAccount).k(kk7.s, new Object[0]);
                }
                if (cf3.B(j3)) {
                    l.putInt("enc_id", (int) (j3 & 4294967295L));
                } else if (cf3.D(j3)) {
                    l.putLong("user_id", j3);
                } else {
                    l.putLong("chat_id", -j3);
                }
                if (na7.q1(currentAccount).A(l, cj3Var2, null, null)) {
                    mu1 mu1Var4 = new mu1(l);
                    mm4.a(mu1Var4, (zc7) arrayList5.get(0));
                    mu1Var = mu1Var4;
                }
                return false;
            }
            mu1Var = null;
            ArrayList arrayList7 = launchActivity4.b0;
            int size2 = arrayList7 != null ? arrayList7.size() : 0;
            if (launchActivity4.S != null) {
                size2++;
            }
            if (launchActivity4.T != null) {
                size2++;
            }
            ArrayList arrayList8 = launchActivity4.V;
            if (arrayList8 != null) {
                size2 += arrayList8.size();
            }
            ArrayList arrayList9 = launchActivity4.W;
            if (arrayList9 != null) {
                size2 += arrayList9.size();
            }
            ArrayList arrayList10 = launchActivity4.X;
            if (arrayList10 != null) {
                size2 += arrayList10.size();
            }
            if (launchActivity4.S == null && launchActivity4.T == null && launchActivity4.V == null && launchActivity4.W == null && launchActivity4.X == null && launchActivity4.U != null) {
                size2++;
            }
            for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                if (ij.h(launchActivity4, launchActivity4.P, ((zc7) arrayList5.get(i8)).a, size2 > 1)) {
                    return false;
                }
            }
            if (qvbVar != null) {
                qvbVar.removeSelfFromStack();
            }
            ArrayList arrayList11 = launchActivity4.b0;
            if (arrayList11 != null && arrayList11.size() == 1) {
                ArrayList arrayList12 = launchActivity4.e0;
                if (!arrayList12.isEmpty()) {
                    b48 b48Var = new b48((org.telegram.ui.ActionBar.d) b00.f(1, arrayList12), null, null, launchActivity4.c0, null, null, null, null, null);
                    mu1Var2 = mu1Var;
                    final int i9 = i7;
                    b48Var.E1 = new b22() { // from class: fz5
                        @Override // b22
                        public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z14, int i10, long j4) {
                            k27 k27Var2;
                            TLRPC.TL_forumTopic f;
                            TLRPC.Message message2;
                            String str2 = LaunchActivity.C1;
                            mu1 mu1Var5 = mu1Var2;
                            if (mu1Var5 != null) {
                                ((ActionBarLayout) LaunchActivity.this.N()).U(mu1Var5, true, false);
                            }
                            j5 a = j5.a(y6c.t0);
                            int i11 = a.a;
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList13 = arrayList5;
                                if (i12 >= arrayList13.size()) {
                                    return;
                                }
                                long j5 = ((zc7) arrayList13.get(i12)).a;
                                long j6 = ((zc7) arrayList13.get(i12)).b;
                                if (j6 == 0 || (f = na7.q1(i11).g4.f(-j5, j6)) == null || (message2 = f.topicStartMessage) == null) {
                                    k27Var2 = null;
                                } else {
                                    k27Var2 = new k27(i11, message2, false, false);
                                    k27Var2.p = true;
                                }
                                k27 k27Var3 = k27Var2;
                                int i13 = i9;
                                int i14 = i10 != 0 ? i10 : i13;
                                int i15 = i2;
                                x3a g = x3a.g(tL_userContact_old2, j5, k27Var3, k27Var3, null, null, z14, i14, i15);
                                CharSequence charSequence11 = charSequence;
                                if (TextUtils.isEmpty(charSequence11)) {
                                    g.O = 0L;
                                }
                                g.L = false;
                                z3a.B(currentAccount).q0(g);
                                if (!TextUtils.isEmpty(charSequence11)) {
                                    z3a.Z(a, charSequence11, j5, 0L, z12, i10 != 0 ? i10 : i13, i15);
                                }
                                i12++;
                            }
                        }

                        @Override // b22
                        public final void a(ArrayList arrayList13, String str2, boolean z14, int i10, long j4, boolean z15) {
                        }
                    };
                    ((org.telegram.ui.ActionBar.d) b00.f(1, arrayList12)).showDialog(b48Var);
                    launchActivity3 = launchActivity4;
                    mu1 mu1Var5 = mu1Var2;
                    if (cj3Var != null && mu1Var5 == null && !z10) {
                        cj3Var.finishFragment();
                    }
                    r10 = 0;
                }
            }
            mu1Var2 = mu1Var;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence2 = charSequence;
            } else {
                launchActivity4.U = charSequence;
                charSequence2 = null;
            }
            Object[] objArr = cj3Var2 != null && cj3Var2.x3();
            if (objArr != false) {
                ArrayList arrayList13 = cj3Var2.F2;
                ArrayList arrayList14 = new ArrayList();
                if (arrayList13 != null) {
                    int size3 = arrayList13.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj = arrayList13.get(i10);
                        i10++;
                        jm6 jm6Var = (jm6) obj;
                        y3a y3aVar = new y3a();
                        boolean z14 = jm6Var.b;
                        if (z14 || (str = jm6Var.h) == null) {
                            String str2 = jm6Var.I;
                            if (str2 != null) {
                                y3aVar.c = str2;
                            }
                        } else {
                            y3aVar.c = str;
                        }
                        y3aVar.e = jm6Var.c;
                        y3aVar.f = jm6Var.g;
                        y3aVar.o = z14;
                        y3aVar.p = jm6Var.d();
                        y3aVar.q = jm6Var.j();
                        boolean z15 = z11;
                        y3aVar.z = jm6Var.m;
                        y3aVar.A = jm6Var.P;
                        CharSequence charSequence11 = jm6Var.a;
                        y3aVar.d = charSequence11 != null ? charSequence11.toString() : null;
                        y3aVar.i = jm6Var.n;
                        y3aVar.j = jm6Var.r;
                        y3aVar.h = jm6Var.x;
                        y3aVar.k = jm6Var.s;
                        y3aVar.r = jm6Var.L;
                        y3aVar.x = jm6Var.c();
                        arrayList14.add(y3aVar);
                        z11 = z15;
                    }
                }
                boolean z16 = z11;
                launchActivity4.V = arrayList14;
                if (!arrayList14.isEmpty()) {
                    CharSequence charSequence12 = launchActivity4.U;
                    if (charSequence12 == null) {
                        charSequence12 = "";
                    }
                    CharSequence[] charSequenceArr = new CharSequence[1];
                    charSequenceArr[z16 ? 1 : 0] = charSequence12;
                    ArrayList Y = hq6.d0(launchActivity4.P).Y(charSequenceArr, z16, true);
                    CharSequence charSequence13 = charSequenceArr[z16 ? 1 : 0];
                    String charSequence14 = charSequence13 == null ? null : charSequence13.toString();
                    for (int i11 = 0; i11 < launchActivity4.V.size(); i11++) {
                        y3a y3aVar2 = (y3a) launchActivity4.V.get(i11);
                        if (i11 == 0) {
                            y3aVar2.d = charSequence14;
                            y3aVar2.i = Y;
                        } else {
                            y3aVar2.d = null;
                            y3aVar2.i = null;
                        }
                    }
                }
                launchActivity4.S = null;
                launchActivity4.U = null;
            }
            boolean z17 = false;
            CharSequence charSequence15 = null;
            int i12 = 0;
            while (i12 < arrayList5.size()) {
                long j4 = ((zc7) arrayList5.get(i12)).a;
                long j5 = ((zc7) arrayList5.get(i12)).b;
                j5 a = j5.a(y6c.t0);
                int i13 = a.a;
                if (j5 != 0) {
                    z3 = z17;
                    TLRPC.TL_forumTopic f = na7.q1(i13).g4.f(-j4, j5);
                    if (f != null && (message = f.topicStartMessage) != null) {
                        k27 k27Var2 = new k27(i13, message, false, false);
                        k27Var2.p = true;
                        k27Var = k27Var2;
                        if (mu1Var2 == null) {
                            ((ActionBarLayout) launchActivity4.N()).U(mu1Var2, cj3Var2 != null, cj3Var2 == null || launchActivity4.S != null || ((arrayList4 = launchActivity4.V) != null && arrayList4.size() > 0));
                            boolean z18 = cj3Var2 != null;
                            String str3 = launchActivity4.S;
                            if (str3 == null || j5 != 0 || objArr == true) {
                                ArrayList arrayList15 = launchActivity4.V;
                                if (arrayList15 == null || arrayList15.size() <= 0 || j5 != 0 || objArr == true) {
                                    boolean z19 = z13;
                                    z3 = z18;
                                    CharSequence charSequence16 = charSequence15;
                                    i3 = i13;
                                    mu1Var3 = mu1Var2;
                                    j = j5;
                                    if (launchActivity4.S != null) {
                                        CharSequence charSequence17 = launchActivity4.U;
                                        if (charSequence17 == null || charSequence17.length() > 1024) {
                                            charSequence8 = charSequence16;
                                        } else {
                                            CharSequence charSequence18 = launchActivity4.U;
                                            launchActivity4.U = null;
                                            charSequence8 = charSequence18;
                                        }
                                        ArrayList arrayList16 = new ArrayList();
                                        arrayList16.add(launchActivity4.S);
                                        j2 = j4;
                                        j5Var = a;
                                        z3a.V(j5Var, arrayList16, arrayList16, null, charSequence8, null, j2, k27Var, k27Var, z12, i7);
                                        z13 = z19;
                                        charSequence15 = charSequence8;
                                    } else {
                                        j2 = j4;
                                        j5Var = a;
                                        ArrayList arrayList17 = launchActivity4.V;
                                        if (arrayList17 == null || arrayList17.size() <= 0) {
                                            z13 = z19;
                                        } else {
                                            CharSequence charSequence19 = launchActivity4.U;
                                            if (charSequence19 != null && charSequence19.length() <= 1024 && launchActivity4.V.size() == 1) {
                                                CharSequence[] charSequenceArr2 = {launchActivity4.U};
                                                ((y3a) launchActivity4.V.get(0)).i = hq6.d0(launchActivity4.P).Y(charSequenceArr2, false, true);
                                                ((y3a) launchActivity4.V.get(0)).d = charSequenceArr2[0].toString();
                                                launchActivity4.U = null;
                                            }
                                            ArrayList arrayList18 = launchActivity4.V;
                                            int i14 = i7;
                                            k27 k27Var3 = k27Var;
                                            z3a.W(j5Var, arrayList18, j2, k27Var3, k27Var, null, null, z19, arrayList18.size() > 1, null, null, z12, i14, i2, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                            j2 = j2;
                                            z13 = z19;
                                            i7 = i14;
                                            k27Var = k27Var3;
                                        }
                                        charSequence15 = charSequence16;
                                    }
                                    z7 = false;
                                    z8 = false;
                                } else {
                                    ArrayList arrayList19 = launchActivity4.V;
                                    CharSequence charSequence20 = (charSequence2 == null || charSequence2.length() == 0) ? launchActivity4.U : charSequence2;
                                    boolean z20 = z13;
                                    ArrayList N5 = mu1.N5(arrayList19, mu1Var2.y(), charSequence20);
                                    if (N5.isEmpty()) {
                                        z3 = z18;
                                        charSequence9 = charSequence15;
                                        i3 = i13;
                                        z9 = false;
                                        mu1Var3 = mu1Var2;
                                        j = j5;
                                        charSequence10 = null;
                                    } else {
                                        if (mu1Var2.getParentActivity() != null) {
                                            boolean[] zArr = new boolean[N5.size()];
                                            Arrays.fill(zArr, true);
                                            z3 = z18;
                                            charSequence9 = charSequence15;
                                            PhotoViewer.r0().S1(null, mu1Var2, mu1Var2.Ba);
                                            PhotoViewer r0 = PhotoViewer.r0();
                                            ArrayList arrayList20 = new ArrayList(N5);
                                            int size4 = N5.size() - 1;
                                            hs1 hs1Var = new hs1(mu1Var2, N5, zArr);
                                            i3 = i13;
                                            mu1 mu1Var6 = mu1Var2;
                                            j = j5;
                                            r0.n1(arrayList20, size4, 0, false, hs1Var, mu1Var6);
                                            mu1Var3 = mu1Var6;
                                            charSequence10 = null;
                                        } else {
                                            z3 = z18;
                                            charSequence9 = charSequence15;
                                            i3 = i13;
                                            mu1Var3 = mu1Var2;
                                            j = j5;
                                            charSequence10 = null;
                                            mu1Var3.w6(charSequence20, null);
                                            mu1Var3.pb(0, N5, false, false);
                                            mu1Var3.y4();
                                        }
                                        z9 = true;
                                    }
                                    if (z9) {
                                        launchActivity4.U = charSequence10;
                                    }
                                    charSequence15 = charSequence9;
                                    j2 = j4;
                                    j5Var = a;
                                    z7 = false;
                                    z8 = z9;
                                    z13 = z20;
                                }
                            } else {
                                mu1Var2.ta(launchActivity4.U, str3);
                                launchActivity4.U = null;
                                z3 = z18;
                                j2 = j4;
                                i3 = i13;
                                z7 = true;
                                z8 = false;
                                mu1Var3 = mu1Var2;
                                j5Var = a;
                                j = j5;
                            }
                            z4 = z13;
                            z6 = z7;
                            z5 = z8;
                        } else {
                            mu1Var3 = mu1Var2;
                            j = j5;
                            CharSequence charSequence21 = charSequence15;
                            j2 = j4;
                            j5Var = a;
                            i3 = i13;
                            if (launchActivity4.S != null) {
                                CharSequence charSequence22 = launchActivity4.U;
                                if (charSequence22 == null || charSequence22.length() > 1024) {
                                    charSequence3 = charSequence21;
                                } else {
                                    CharSequence charSequence23 = launchActivity4.U;
                                    launchActivity4.U = null;
                                    charSequence3 = charSequence23;
                                }
                                ArrayList arrayList21 = new ArrayList();
                                arrayList21.add(launchActivity4.S);
                                z3a.V(j5Var, arrayList21, arrayList21, null, charSequence3, null, j2, k27Var, k27Var, z12, i7);
                                charSequence15 = charSequence3;
                            } else {
                                charSequence15 = charSequence21;
                            }
                            if (launchActivity4.V != null) {
                                CharSequence charSequence24 = launchActivity4.U;
                                if (charSequence24 != null && charSequence24.length() <= 1024 && launchActivity4.V.size() == 1) {
                                    CharSequence[] charSequenceArr3 = {launchActivity4.U};
                                    ((y3a) launchActivity4.V.get(0)).i = hq6.d0(launchActivity4.P).Y(charSequenceArr3, false, true);
                                    ((y3a) launchActivity4.V.get(0)).d = charSequenceArr3[0].toString();
                                    launchActivity4.U = null;
                                }
                                ArrayList arrayList22 = launchActivity4.V;
                                int i15 = i7;
                                k27 k27Var4 = k27Var;
                                boolean z21 = z13;
                                z3a.W(j5Var, arrayList22, j2, k27Var4, k27Var, null, null, z21, arrayList22.size() > 1, null, null, z12, i15, i2, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                j2 = j2;
                                z4 = z21;
                                i7 = i15;
                                k27Var = k27Var4;
                            } else {
                                z4 = z13;
                            }
                            z5 = false;
                            z6 = false;
                        }
                        boolean z22 = z3;
                        if (launchActivity4.W == null || launchActivity4.X != null) {
                            charSequence4 = launchActivity4.U;
                            if (charSequence4 != null && charSequence4.length() <= 1024) {
                                ArrayList arrayList23 = launchActivity4.W;
                                size = arrayList23 == null ? arrayList23.size() : 0;
                                arrayList2 = launchActivity4.X;
                                if (size + (arrayList2 == null ? arrayList2.size() : 0) == 1) {
                                    charSequence15 = launchActivity4.U;
                                    launchActivity4.U = null;
                                }
                            }
                            CharSequence charSequence25 = charSequence15;
                            z3a.V(j5Var, launchActivity4.W, launchActivity4.a0, launchActivity4.X, charSequence25, launchActivity4.Z, j2, k27Var, k27Var, z12, i7);
                            charSequence5 = charSequence25;
                        } else {
                            charSequence5 = charSequence15;
                        }
                        j5 j5Var2 = j5Var;
                        if (launchActivity4.T != null) {
                            File file = new File(launchActivity4.T);
                            if (file.exists()) {
                                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                                tL_document.file_reference = new byte[0];
                                tL_document.dc_id = TLObject.FLAG_31;
                                tL_document.id = gba.p();
                                tL_document.user_id = y6c.h(i3).e();
                                tL_document.mime_type = "audio/ogg";
                                tL_document.date = ConnectionsManager.getInstance(i3).getCurrentTime();
                                tL_document.size = (int) file.length();
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.voice = true;
                                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                                tL_documentAttributeAudio.waveform = waveform;
                                if (waveform != null) {
                                    tL_documentAttributeAudio.flags |= 4;
                                }
                                tL_document.attributes.add(tL_documentAttributeAudio);
                                i4 = 0;
                                CharSequence[] charSequenceArr4 = {launchActivity4.U};
                                ArrayList Y2 = hq6.d0(launchActivity4.P).Y(charSequenceArr4, false, true);
                                z3a B = z3a.B(i3);
                                String absolutePath = file.getAbsolutePath();
                                CharSequence charSequence26 = charSequenceArr4[0];
                                long j6 = j2;
                                k27 k27Var5 = k27Var;
                                int i16 = i7;
                                x3a f2 = x3a.f(tL_document, null, absolutePath, j6, k27Var5, k27Var, charSequence26 == null ? null : charSequence26.toString(), Y2, null, null, z12, i16, i2, 0, null, null, false);
                                j2 = j6;
                                k27Var = k27Var5;
                                i7 = i16;
                                B.q0(f2);
                                if (launchActivity4.U != null) {
                                    launchActivity4.U = null;
                                }
                                long j7 = j;
                                charSequence6 = launchActivity4.U;
                                launchActivity = launchActivity4;
                                if (charSequence6 != null) {
                                    i5 = i4;
                                    C0(j5Var2, cj3Var2, charSequence6, j2, k27Var, j7, z12, i7, i2);
                                } else {
                                    i5 = i4;
                                }
                                arrayList3 = launchActivity.b0;
                                if (arrayList3 != null && !arrayList3.isEmpty()) {
                                    i6 = i5;
                                    while (i6 < launchActivity.b0.size()) {
                                        TLRPC.User user = (TLRPC.User) launchActivity.b0.get(i6);
                                        z3a B2 = z3a.B(currentAccount);
                                        long j8 = j2;
                                        k27 k27Var6 = k27Var;
                                        x3a g = x3a.g(user, j8, k27Var6, k27Var, null, null, z12, i7, i2);
                                        j2 = j8;
                                        k27Var = k27Var6;
                                        B2.q0(g);
                                        i6++;
                                        launchActivity = this;
                                    }
                                }
                                if (!TextUtils.isEmpty(charSequence2) || z6 || z5) {
                                    launchActivity2 = this;
                                    charSequence7 = charSequence2;
                                } else {
                                    launchActivity2 = this;
                                    charSequence7 = charSequence2;
                                    C0(j5Var2, cj3Var, charSequence7, j2, k27Var, j7, z12, i7, i2);
                                }
                                i12++;
                                cj3Var2 = cj3Var;
                                arrayList5 = arrayList;
                                charSequence2 = charSequence7;
                                mu1Var2 = mu1Var3;
                                launchActivity4 = launchActivity2;
                                z13 = z4;
                                z17 = z22;
                                charSequence15 = charSequence5;
                            }
                        }
                        i4 = 0;
                        long j72 = j;
                        charSequence6 = launchActivity4.U;
                        launchActivity = launchActivity4;
                        if (charSequence6 != null) {
                        }
                        arrayList3 = launchActivity.b0;
                        if (arrayList3 != null) {
                            i6 = i5;
                            while (i6 < launchActivity.b0.size()) {
                            }
                        }
                        if (TextUtils.isEmpty(charSequence2)) {
                        }
                        launchActivity2 = this;
                        charSequence7 = charSequence2;
                        i12++;
                        cj3Var2 = cj3Var;
                        arrayList5 = arrayList;
                        charSequence2 = charSequence7;
                        mu1Var2 = mu1Var3;
                        launchActivity4 = launchActivity2;
                        z13 = z4;
                        z17 = z22;
                        charSequence15 = charSequence5;
                    }
                } else {
                    z3 = z17;
                }
                k27Var = null;
                if (mu1Var2 == null) {
                }
                boolean z222 = z3;
                if (launchActivity4.W == null) {
                }
                charSequence4 = launchActivity4.U;
                if (charSequence4 != null) {
                    ArrayList arrayList232 = launchActivity4.W;
                    if (arrayList232 == null) {
                    }
                    arrayList2 = launchActivity4.X;
                    if (size + (arrayList2 == null ? arrayList2.size() : 0) == 1) {
                    }
                }
                CharSequence charSequence252 = charSequence15;
                z3a.V(j5Var, launchActivity4.W, launchActivity4.a0, launchActivity4.X, charSequence252, launchActivity4.Z, j2, k27Var, k27Var, z12, i7);
                charSequence5 = charSequence252;
                j5 j5Var22 = j5Var;
                if (launchActivity4.T != null) {
                }
                i4 = 0;
                long j722 = j;
                charSequence6 = launchActivity4.U;
                launchActivity = launchActivity4;
                if (charSequence6 != null) {
                }
                arrayList3 = launchActivity.b0;
                if (arrayList3 != null) {
                }
                if (TextUtils.isEmpty(charSequence2)) {
                }
                launchActivity2 = this;
                charSequence7 = charSequence2;
                i12++;
                cj3Var2 = cj3Var;
                arrayList5 = arrayList;
                charSequence2 = charSequence7;
                mu1Var2 = mu1Var3;
                launchActivity4 = launchActivity2;
                z13 = z4;
                z17 = z222;
                charSequence15 = charSequence5;
            }
            z10 = z17;
            launchActivity3 = launchActivity4;
            mu1 mu1Var52 = mu1Var2;
            if (cj3Var != null) {
                cj3Var.finishFragment();
            }
            r10 = 0;
        }
        launchActivity3.V = r10;
        launchActivity3.S = r10;
        launchActivity3.T = r10;
        launchActivity3.U = r10;
        launchActivity3.W = r10;
        launchActivity3.a0 = r10;
        launchActivity3.b0 = r10;
        launchActivity3.c0 = r10;
        launchActivity3.Y = r10;
        return true;
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, akb akbVar) {
        int i = akbVar.g0;
        zjb d = akbVar.d(tL_theme, this.P, 0);
        akbVar.a0 = akbVar.Z;
        akbVar.u(d.a);
        d.s = tL_wallPaper;
        t0(new qmb(akbVar, i != akbVar.g0, 0, false, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(final int i, int i2, final TLRPC.Chat chat, final int i3, TLRPC.TL_forumTopic tL_forumTopic, final Runnable runnable, final String str, final Integer num, final byte[] bArr, final int i4, final ArrayList arrayList, final int i5) {
        final int i6;
        TLRPC.TL_forumTopic tL_forumTopic2;
        ArrayList arrayList2;
        if (tL_forumTopic == null) {
            i6 = i2;
            tL_forumTopic2 = na7.q1(i).g4.f(chat.id, i6);
        } else {
            i6 = i2;
            tL_forumTopic2 = tL_forumTopic;
        }
        if (tL_forumTopic2 == null) {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
            tL_messages_getForumTopicsByID.peer = na7.q1(this.P).h1(-chat.id);
            tL_messages_getForumTopicsByID.topics.add(Integer.valueOf(i6));
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() { // from class: ty5
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    String str2 = LaunchActivity.C1;
                    final LaunchActivity launchActivity = LaunchActivity.this;
                    final int i7 = i;
                    final TLRPC.Chat chat2 = chat;
                    final int i8 = i6;
                    final int i9 = i3;
                    final Runnable runnable2 = runnable;
                    final String str3 = str;
                    final Integer num2 = num;
                    final byte[] bArr2 = bArr;
                    final int i10 = i4;
                    final ArrayList arrayList3 = arrayList;
                    final int i11 = i5;
                    gl.d3(new Runnable() { // from class: yy5
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str4 = LaunchActivity.C1;
                            if (tL_error == null) {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                vf6 vf6Var = new vf6();
                                for (int i12 = 0; i12 < tL_messages_forumTopics.messages.size(); i12++) {
                                    vf6Var.k(tL_messages_forumTopics.messages.get(i12), tL_messages_forumTopics.messages.get(i12).id);
                                }
                                int i13 = i7;
                                na7.q1(i13).a4(tL_messages_forumTopics.users, false);
                                na7.q1(i13).U3(tL_messages_forumTopics.chats, false);
                                pub pubVar = na7.q1(i13).g4;
                                TLRPC.Chat chat3 = chat2;
                                pubVar.u(chat3.id, tL_messages_forumTopics.topics, vf6Var, false, 2, -1);
                                pub pubVar2 = na7.q1(i13).g4;
                                long j = chat3.id;
                                int i14 = i8;
                                LaunchActivity.this.s0(i13, i14, chat3, i9, pubVar2.f(j, i14), runnable2, str3, num2, bArr2, i10, arrayList3, i11);
                            }
                        }
                    });
                }
            });
            return;
        }
        ArrayList arrayList3 = this.e0;
        org.telegram.ui.ActionBar.d dVar = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.d) b00.f(1, arrayList3) : null;
        if (dVar instanceof mu1) {
            mu1 mu1Var = (mu1) dVar;
            if (mu1Var.a() == (-chat.id) && mu1Var.x4 && mu1Var.d() == tL_forumTopic2.id) {
                if (str != null) {
                    mu1Var.yb(i3, i5, str);
                }
                mu1Var.i8 = num;
                mu1Var.gb(i3, i4, true, 0, true, 0, null, null, null);
                if (runnable == null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i3 != tL_forumTopic2.id) {
            bundle.putInt("message_id", Math.max(1, i3));
        }
        if (num != null) {
            bundle.putInt("task_id", num.intValue());
        }
        mu1 mu1Var2 = new mu1(bundle);
        if (arrayList.isEmpty()) {
            TLRPC.Message message = new TLRPC.Message();
            message.id = 1;
            message.action = new TLRPC.TL_messageActionChannelMigrateFrom();
            arrayList2 = arrayList;
            arrayList2.add(new k27(i, message, false, false));
        } else {
            arrayList2 = arrayList;
        }
        mu1Var2.Bb(arrayList2, chat, i3, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i3 != tL_forumTopic2.id) {
            if (str != null) {
                mu1Var2.yb(i3, i5, str);
            } else {
                mu1Var2.i8 = num;
                mu1Var2.d8 = i3;
            }
            mu1Var2.gb(i3, i4, true, 0, true, 0, null, null, null);
        }
        t0(mu1Var2);
        if (runnable == null) {
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        gl.g = -10;
        gl.h = -10;
        gl.i = null;
        super.setRequestedOrientation(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r7 == null) goto L28;
     */
    @Override // wi3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(cj3 cj3Var) {
        f4b l;
        FileOutputStream fileOutputStream;
        ArrayList arrayList = this.V;
        if (arrayList == null || arrayList.isEmpty()) {
            String str = this.S;
            if (str != null) {
                jm6 jm6Var = new jm6(0, str, 0, true, 0, 0);
                try {
                    Bitmap q = z3a.q(1, str);
                    File file = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            q.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            jm6Var.c = file.getAbsolutePath();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                fa4.g(th, true);
                            } catch (Throwable th2) {
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                l = f4b.l(jm6Var);
            }
            l = null;
        } else {
            ArrayList N5 = mu1.N5(this.V, false, null);
            if (!N5.isEmpty()) {
                l = f4b.l((jm6) N5.get(0));
            }
            l = null;
        }
        if (l == null) {
            return false;
        }
        wx n = na7.q1(this.P).M1().n();
        if (n != null && n.a(this.P, 1)) {
            cj3Var.showDialog(new h26(n.b(), this.P, null, this, cj3Var));
            return false;
        }
        l.o = true;
        l.M = false;
        t7b.C(this, this.P).R(null, l, 0L);
        cj3Var.finishFragment();
        this.V = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.W = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.Y = null;
        return true;
    }

    public final void t0(org.telegram.ui.ActionBar.d dVar) {
        ((ActionBarLayout) N()).S(dVar);
    }

    public final boolean u0(org.telegram.ui.ActionBar.d dVar, boolean z, boolean z2) {
        return ((ActionBarLayout) N()).U(dVar, z, z2);
    }

    public final void v0(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i >= arrayList.size()) {
                org.telegram.ui.ActionBar.d S = S();
                if (S != null && S.sheetsStack != null) {
                    for (int i2 = 0; i2 < S.sheetsStack.size(); i2++) {
                        if (S.sheetsStack.get(i2).t()) {
                            S.sheetsStack.get(i2);
                        }
                    }
                }
                x14 v = this.p0.v();
                if (v != null && v.sheetsStack != null) {
                    for (int i3 = 0; i3 < v.sheetsStack.size(); i3++) {
                        if (v.sheetsStack.get(i3).t()) {
                            v.sheetsStack.get(i3);
                        }
                    }
                }
                bz5 bz5Var = new bz5(this, (byte) 1);
                TLRPC.User V1 = na7.q1(this.P).V1(Long.valueOf(j));
                if (V1 != null) {
                    bz5Var.a(V1);
                    return;
                } else {
                    ad7.Y(this.P).a.c(new de2((Object) this, j, (Object) bz5Var, (byte) 27));
                    return;
                }
            }
            if (arrayList.get(i) instanceof ow0) {
                ow0 ow0Var = (ow0) arrayList.get(i);
                if (ow0Var.isShowing() && ow0Var.J == j) {
                    return;
                }
            }
            i++;
        }
    }

    public final void w0(Long l, kz5 kz5Var, c01 c01Var, gb2 gb2Var) {
        og1 E0 = na7.q1(this.P).E0();
        if (c01Var != null) {
            c01Var.d();
        }
        E0.a(l.longValue(), new f25(this, c01Var, kz5Var, E0, l, gb2Var, (byte) 3));
    }

    public final void x0(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, String str26, final String str27, final c01 c01Var, final boolean z3, final int i4, final int i5, final int i6, final boolean z4, final String str28, final TLRPC.User user, final kz5 kz5Var, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final String str29, final boolean z12) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = na7.q1(i).o1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getBotApp, new RequestDelegate() { // from class: iy5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str30 = LaunchActivity.C1;
                final c01 c01Var2 = c01Var;
                if (c01Var2 != null) {
                    c01Var2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i7 = i;
                final boolean z13 = z3;
                final boolean z14 = z7;
                final boolean z15 = z8;
                final boolean z16 = z9;
                if (tL_error == null) {
                    final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                    final kz5 kz5Var2 = kz5Var;
                    final TLRPC.User user2 = user;
                    final String str31 = str27;
                    final boolean z17 = z6;
                    final boolean z18 = z5;
                    gl.d3(new Runnable() { // from class: py5
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str32 = LaunchActivity.C1;
                            kz5Var2.run();
                            AtomicBoolean atomicBoolean = new AtomicBoolean();
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            ArrayList arrayList = launchActivity2.e0;
                            d dVar = (arrayList == null || arrayList.isEmpty()) ? null : (d) b00.f(1, arrayList);
                            int i8 = i7;
                            TLRPC.User user3 = user2;
                            TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                            String str33 = str31;
                            boolean z19 = z14;
                            boolean z20 = z15;
                            boolean z21 = z16;
                            boolean z22 = z13;
                            wy5 wy5Var = new wy5(launchActivity2, dVar, i8, user3, tL_messages_botApp2, atomicBoolean, str33, z19, z20, z21, z22);
                            if (z17) {
                                wy5Var.run();
                                return;
                            }
                            if (tL_messages_botApp2.inactive && z18) {
                                hj3 hj3Var = new hj3(wy5Var, (byte) 20);
                                c01 c01Var3 = c01Var2;
                                psc.a(launchActivity2, hj3Var, c01Var3 != null ? new tp5(c01Var3, (byte) 7) : null);
                            } else if (tL_messages_botApp2.request_write_access || z22) {
                                ij.m(dVar, atomicBoolean, user3, wy5Var);
                            } else {
                                wy5Var.run();
                            }
                        }
                    });
                    return;
                }
                final String str32 = str;
                final String str33 = str2;
                final String str34 = str3;
                final String str35 = str4;
                final String str36 = str5;
                final String str37 = str6;
                final String str38 = str7;
                final String str39 = str8;
                final String str40 = str9;
                final String str41 = str10;
                final String str42 = str11;
                final String str43 = str12;
                final boolean z19 = z;
                final Integer num3 = num;
                final Long l3 = l;
                final Long l4 = l2;
                final Integer num4 = num2;
                final String str44 = str13;
                final HashMap hashMap2 = hashMap;
                final String str45 = str14;
                final String str46 = str15;
                final String str47 = str16;
                final String str48 = str17;
                final TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
                final String str49 = str18;
                final String str50 = str19;
                final String str51 = str20;
                final String str52 = str21;
                final boolean z20 = z2;
                final String str53 = str22;
                boolean z21 = i2;
                final int i8 = i3;
                final String str54 = str23;
                final String str55 = str24;
                final String str56 = str25;
                final int i9 = i4;
                final int i10 = i5;
                final int i11 = i6;
                final boolean z22 = z4;
                final String str57 = str28;
                final boolean z23 = z10;
                final boolean z24 = z11;
                final String str58 = str29;
                final boolean z25 = z12;
                final int i12 = z21 ? 1 : 0;
                gl.d3(new Runnable() { // from class: oy5
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str59 = LaunchActivity.C1;
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        int i13 = i7;
                        String str60 = str32;
                        String str61 = str33;
                        String str62 = str34;
                        String str63 = str35;
                        String str64 = str36;
                        String str65 = str37;
                        String str66 = str38;
                        String str67 = str39;
                        String str68 = str40;
                        String str69 = str41;
                        String str70 = str42;
                        String str71 = str43;
                        boolean z26 = z19;
                        Integer num5 = num3;
                        Long l5 = l3;
                        Long l6 = l4;
                        Integer num6 = num4;
                        String str72 = str44;
                        HashMap hashMap3 = hashMap2;
                        String str73 = str45;
                        String str74 = str46;
                        String str75 = str47;
                        String str76 = str48;
                        TLRPC.TL_wallPaper tL_wallPaper3 = tL_wallPaper2;
                        String str77 = str49;
                        String str78 = str50;
                        String str79 = str51;
                        String str80 = str52;
                        boolean z27 = z20;
                        String str81 = str53;
                        boolean z28 = i12;
                        launchActivity2.B0(i13, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, z26, num5, l5, l6, num6, str72, hashMap3, str73, str74, str75, str76, tL_wallPaper3, str77, str78, str79, str80, z27, str81, z28 ? 1 : 0, i8, str54, str55, str56, null, null, c01Var2, z13, i9, false, i10, i11, null, null, z22, str57, z14, z15, z16, z23, z24, str58, null, z25, null);
                    }
                });
            }
        });
    }

    public final void y0(boolean z) {
        ActionBarLayout actionBarLayout = this.q0;
        if (actionBarLayout != null) {
            actionBarLayout.W(z, z);
        } else {
            this.p0.W(z, z);
        }
    }

    public final void z(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.z1 = null;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i2 >= 26 ? getWindow().getNavigationBarColor() : 0, i);
        this.z1 = ofArgb;
        ofArgb.addUpdateListener(new tx5(this, (byte) 1));
        this.z1.addListener(new cn(this, i, (byte) 6));
        this.z1.setInterpolator(s33.h);
        this.z1.setDuration(320L);
        this.z1.start();
    }

    public final int z0(final int i, final kz5 kz5Var, final Integer num, final Integer num2, final Long l, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i2, final int i3) {
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = na7.j1(chat);
        tL_messages_getDiscussionMessage.msg_id = num2 != null ? num.intValue() : (int) l.longValue();
        return ConnectionsManager.getInstance(i).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() { // from class: ox5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.C1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i4 = i;
                final TLRPC.Chat chat2 = chat;
                final Long l2 = l;
                final Integer num4 = num2;
                final Integer num5 = num;
                final Runnable runnable2 = runnable;
                final String str3 = str;
                final Integer num6 = num3;
                final byte[] bArr2 = bArr;
                final int i5 = i2;
                final int i6 = i3;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final kz5 kz5Var2 = kz5Var;
                gl.d3(new Runnable() { // from class: ky5
                    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(5:3|(1:5)|6|7|(5:14|(3:16|(1:18)|19)(3:33|(1:(1:36)(1:(1:39)(1:40)))(1:(1:(1:43)(1:(1:45)(1:46))))|37)|20|(2:31|32)|(2:23|29)(1:30)))|47|48|(1:50)|20|(0)|(0)(0)|(1:(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
                    
                        fa4.g(r0, true);
                     */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x014e A[Catch: Exception -> 0x0152, TRY_LEAVE, TryCatch #0 {Exception -> 0x0152, blocks: (B:32:0x0149, B:23:0x014e), top: B:31:0x0149 }] */
                    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        kz5 kz5Var3;
                        String str4 = LaunchActivity.C1;
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.e0;
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TLRPC.TL_messages_discussionMessage;
                        Runnable runnable3 = runnable2;
                        if (z) {
                            TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            int i7 = i4;
                            na7.q1(i7).a4(tL_messages_discussionMessage.users, false);
                            na7.q1(i7).U3(tL_messages_discussionMessage.chats, false);
                            ArrayList arrayList2 = new ArrayList();
                            int size = tL_messages_discussionMessage.messages.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                arrayList2.add(new k27(y6c.t0, tL_messages_discussionMessage.messages.get(i8), true, true));
                            }
                            boolean isEmpty = arrayList2.isEmpty();
                            TLRPC.Chat chat3 = chat2;
                            Long l3 = l2;
                            if (!isEmpty || (chat3.forum && l3 != null && l3.longValue() == 1)) {
                                boolean z2 = chat3.forum;
                                Integer num7 = num4;
                                Integer num8 = num5;
                                String str5 = str3;
                                Integer num9 = num6;
                                byte[] bArr3 = bArr2;
                                int i9 = i6;
                                if (z2) {
                                    int longValue = (int) l3.longValue();
                                    if (num7 == null) {
                                        num7 = num8;
                                    }
                                    launchActivity2.s0(i7, longValue, chat3, num7.intValue(), null, runnable3, str5, num9, bArr3, i5, arrayList2, i9);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -k27.B0(((k27) arrayList2.get(0)).k));
                                    bundle.putInt("message_id", Math.max(1, num8.intValue()));
                                    mu1 mu1Var = new mu1(bundle);
                                    mu1Var.Bb(arrayList2, chat3, tL_messages_getDiscussionMessage2.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
                                    if (num7 != null) {
                                        if (bArr3 != null) {
                                            mu1Var.j8 = bArr3;
                                            mu1Var.d8 = num7.intValue();
                                        } else if (str5 != null) {
                                            mu1Var.yb(num7.intValue(), i9, str5);
                                        } else {
                                            mu1Var.i8 = num9;
                                            mu1Var.d8 = num7.intValue();
                                        }
                                    } else if (l3 != null) {
                                        if (bArr3 != null) {
                                            mu1Var.j8 = bArr3;
                                            mu1Var.d8 = num8.intValue();
                                        } else if (str5 != null) {
                                            mu1Var.yb(num8.intValue(), i9, str5);
                                        } else {
                                            mu1Var.i8 = num9;
                                            mu1Var.d8 = num8.intValue();
                                        }
                                    }
                                    launchActivity2.t0(mu1Var);
                                }
                                kz5Var3 = kz5Var2;
                                if (kz5Var3 != null) {
                                    try {
                                        kz5Var3.run();
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                                }
                                if (runnable3 == null) {
                                    runnable3.run();
                                    return;
                                }
                                return;
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            u21.b0((d) arrayList.get(arrayList.size() - 1)).t(k96.M0(2131752318, null), null).j();
                        }
                        kz5Var3 = kz5Var2;
                        if (kz5Var3 != null) {
                        }
                        if (runnable3 == null) {
                        }
                    }
                });
            }
        });
    }

    @Override // qi5
    public final void e(int[] iArr) {
    }
}
