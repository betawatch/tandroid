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
import org.telegram.messenger.voip.CallAudioDevice;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class LaunchActivity extends ug0 implements sk5, fn7, oj3 {
    public static final String C1 = UUID.randomUUID().toString();
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static LaunchActivity H1;
    public static Pattern I1;
    public static ys J1;
    public static LaunchActivity K1;
    public kfb A1;
    public okb B0;
    public int B1;
    public sk0 C0;
    public id E0;
    public View F0;
    public id G0;
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
    public znb S0;
    public String T;
    public TLRPC.TL_theme T0;
    public CharSequence U;
    public boolean U0;
    public ArrayList V;
    public id V0;
    public ArrayList W;
    public ArrayList X;
    public boolean X0;
    public Uri Y;
    public r4a Y0;
    public String Z;
    public zz3 Z0;
    public ArrayList a0;
    public ArrayList b0;
    public Uri c0;
    public int d0;
    public c34 e1;
    public ak f1;
    public j1d g1;
    public l45 h0;
    public boolean h1;
    public ArrayList i0;
    public mr4 i1;
    public ArrayList j0;
    public a26 j1;
    public String k0;
    public b26 k1;
    public ActionMode l0;
    public boolean l1;
    public boolean m0;
    public u8a m1;
    public tqb n0;
    public u8a n1;
    public d41 o0;
    public ActionBarLayout p0;
    public j16 p1;
    public ActionBarLayout q0;
    public te2 q1;
    public ActionBarLayout r0;
    public boolean r1;
    public c26 s0;
    public ViewGroup s1;
    public FrameLayout t0;
    public final fu7 t1;
    public w81 u0;
    public id u1;
    public d26 v0;
    public id v1;
    public y16 w0;
    public boolean w1;
    public gy0 x0;
    public long x1;
    public dr3 y0;
    public int[] y1;
    public hz7 z0;
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
    public final w16 d1 = new w16();
    public boolean o1 = true;

    public LaunchActivity() {
        System.identityHashCode(this);
        this.t1 = new fu7(this);
        this.B1 = 0;
    }

    public static void C0(k5 k5Var, uj3 uj3Var, CharSequence charSequence, long j, r47 r47Var, long j2, boolean z, int i, int i2) {
        sea seaVar;
        sea seaVar2;
        int i3 = k5Var.a;
        boolean z2 = uj3Var == null || (seaVar2 = uj3Var.I2) == null || seaVar2.n;
        TLRPC.WebPage webPage = null;
        if (z2 && uj3Var != null && (seaVar = uj3Var.I2) != null) {
            webPage = seaVar.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (webPage2 == null && z2) {
            r7a.Z(k5Var, charSequence, j, j2, z, i, i2);
            return;
        }
        CharSequence G = r7a.G(charSequence);
        if (G == null || G.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = {G};
        r7a.B(i3).q0(p7a.b(charSequenceArr[0].toString(), j, r47Var, r47Var, webPage2, z2, ls6.d0(i3).Y(charSequenceArr, true, true), null, null, z, i, i2, null, false));
    }

    public static void F(int i) {
        LaunchActivity launchActivity = K1;
        if (launchActivity != null) {
            launchActivity.D(i);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z) {
        org.telegram.ui.ActionBar.e Q = Q();
        if (Q != null) {
            long j = tL_attachMenuBot.bot_id;
            gzc b = gzc.b(i, j, j, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.O() == null || launchActivity.O().l(b) == null) {
                TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(tL_attachMenuBot.bot_id));
                String E12 = X1 == null ? null : uc7.s1(i).E1(X1.restriction_reason);
                if (!TextUtils.isEmpty(E12)) {
                    uc7.s1(i);
                    uc7.f5(E12, Q);
                    return;
                }
                xw0 xw0Var = new xw0(launchActivity, Q.getResourceProvider());
                xw0Var.C0 = false;
                xw0Var.B(z);
                xw0Var.m0 = launchActivity;
                xw0Var.x(Q, b);
                xw0Var.show();
            }
        }
    }

    public static void K() {
        ArrayList<ag0> arrayList;
        org.telegram.ui.ActionBar.e S = S();
        if (S != null) {
            s24 v = S.getParentLayout() instanceof ActionBarLayout ? ((ActionBarLayout) S.getParentLayout()).v() : null;
            if (v != null && (arrayList = v.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    v.sheetsStack.get(size).a(true);
                }
            }
            ArrayList<ag0> arrayList2 = S.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    S.sheetsStack.get(size2).a(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = xw0.b1.iterator();
            while (it.hasNext()) {
                arrayList3.add((xw0) it.next());
            }
            int size3 = arrayList3.size();
            int i = 0;
            while (i < size3) {
                Object obj = arrayList3.get(i);
                i++;
                ((xw0) obj).m(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.e M() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.r();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ActionBarLayout) ((wk5) c00.g(1, H1.Q))).r();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.N() == null) {
            return null;
        }
        return ((ActionBarLayout) H1.N()).r();
    }

    public static org.telegram.ui.ActionBar.e Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((wk5) c00.g(1, H1.Q)).getLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.N() == null) {
            return null;
        }
        return H1.N().getLastFragment();
    }

    public static org.telegram.ui.ActionBar.e S() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((wk5) c00.g(1, H1.Q)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.N() == null) {
            return null;
        }
        return H1.N().getSafeLastFragment();
    }

    public static String T(int i, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        return str2 == null ? ob6.M0(i, str) : str2;
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
                cc4.g(e, true);
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
        kfb kfbVar;
        LaunchActivity launchActivity = H1;
        if (launchActivity == null || (decorView = launchActivity.getWindow().getDecorView()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && ((kfbVar = launchActivity.A1) == null || ((View) kfbVar.a) != decorView)) {
            launchActivity.A1 = new kfb(decorView);
        }
        kfb kfbVar2 = launchActivity.A1;
        if (kfbVar2 != null) {
            View view = (View) kfbVar2.a;
            ArrayList arrayList = kfbVar2.b;
            if (arrayList.size() < 7) {
                float max = (Math.max(Math.max(dte.a(0.0f, 0.0f, f, f2), dte.a(view.getWidth(), 0.0f, f, f2)), Math.max(dte.a(0.0f, view.getHeight(), f, f2), dte.a(view.getWidth(), view.getHeight(), f, f2))) * 2.0f) / (hl.p * 1200.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                jfb jfbVar = new jfb(f, f2, f3);
                ofFloat.addUpdateListener(new lk(kfbVar2, jfbVar, (byte) 28));
                ofFloat.addListener(new wd8((Object) kfbVar2, (Object) jfbVar, (byte) 19));
                ofFloat.setInterpolator(k43.g);
                ofFloat.setDuration((long) (max * 1000.0f));
                arrayList.add(jfbVar);
                kfbVar2.i();
                ofFloat.start();
            }
        }
    }

    public static e26 c0() {
        LaunchActivity launchActivity = H1;
        if (launchActivity != null) {
            return new e26(launchActivity, true);
        }
        return null;
    }

    public final void A(boolean z) {
        int i;
        org.telegram.messenger.a.t();
        org.telegram.messenger.a.m();
        if (!z) {
            boolean z2 = f11.a;
        }
        org.telegram.messenger.a.a.getClass();
        ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
        ph0 e = ph0.e();
        String str = e.a;
        mh0 mh0Var = (str == null || (i = e.b) == 0) ? null : new mh0(str, i, e.c);
        boolean z3 = this.o1;
        this.o1 = false;
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ds6 ds6Var = new ds6((Object) this, z3, (Object) mh0Var, (byte) 28);
        ((ApplicationLoaderImpl) aVar).getClass();
        ph0.e().a(ds6Var, z);
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
    
        cc4.g(r6, true);
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
        int i = yac.t0;
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
        id idVar = new id(3, null, this);
        byte b = 1;
        int[] iArr = {0};
        String q = xb4.q(MediaController.y(uri));
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
                        cc4.g(e, true);
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
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
                                    cc4.g(e4, true);
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
                    cc4.g(e5, true);
                } catch (Exception e6) {
                    cc4.g(e6, true);
                }
            }
        }
        if (str != null) {
            TLRPC.TL_messages_checkHistoryImport tL_messages_checkHistoryImport = new TLRPC.TL_messages_checkHistoryImport();
            tL_messages_checkHistoryImport.import_head = str;
            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(tL_messages_checkHistoryImport, new lh(this, uri, i, idVar));
            idVar.setOnCancelListener(new z74(b, i, iArr));
            try {
                idVar.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void B() {
        if (this.P != yac.t0 || this.m1 == null) {
            u8a u8aVar = this.m1;
            if (u8aVar != null) {
                u8aVar.a();
                this.m1 = null;
            }
            int i = yac.t0;
            this.P = i;
            u8a u8aVar2 = new u8a(jn7.f(i), this);
            u8aVar2.b(jn7.p3);
            u8aVar2.b(jn7.I2);
            u8aVar2.b(jn7.j0);
            u8aVar2.b(jn7.Z4);
            u8aVar2.b(jn7.T1);
            u8aVar2.b(jn7.M0);
            u8aVar2.b(jn7.R0);
            u8aVar2.b(jn7.c1);
            u8aVar2.b(jn7.P);
            u8aVar2.b(jn7.N0);
            u8aVar2.b(jn7.Y1);
            u8aVar2.b(jn7.Z1);
            u8aVar2.b(jn7.v1);
            u8aVar2.b(jn7.w2);
            u8aVar2.b(jn7.x1);
            u8aVar2.b(jn7.l5);
            u8aVar2.b(jn7.i5);
            u8aVar2.b(jn7.u5);
            u8aVar2.b(jn7.T5);
            this.m1 = u8aVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final String str26, final String str27, final l01 l01Var, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final String str28, final String str29, final boolean z5, final String str30, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str31, final Integer num3, final boolean z11, final byte[] bArr) {
        tg5 tg5Var;
        final byte b;
        id idVar;
        int[] iArr;
        final int i7;
        ly3 ly3Var;
        s4b s4bVar;
        TLRPC.Chat chat;
        if (i2 == 0 && yac.c() >= 2 && hashMap != null) {
            jj.i(this, new fj() { // from class: l16
                @Override // fj
                public final void a(int i8) {
                    String str32 = LaunchActivity.C1;
                    LaunchActivity launchActivity = LaunchActivity.this;
                    if (i8 != i) {
                        launchActivity.N0(i8);
                    }
                    launchActivity.B0(i8, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, 1, i3, str23, str24, str25, str26, str27, l01Var, z3, i4, z4, i5, i6, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr);
                }
            }).show();
            return;
        }
        final l01 l01Var2 = l01Var;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        final byte b2 = 0;
        if (str16 != null) {
            SparseArray sparseArray = jn7.e().a;
            int i8 = jn7.j4;
            if (sparseArray.indexOfKey(i8) >= 0) {
                jn7.e().k(i8, str16);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String M0 = ob6.M0(R.string.AppName, null);
            id idVar2 = alertDialog$Builder.a;
            idVar2.S = M0;
            idVar2.U = hl.S2(ob6.a0(null, null, 2131747494, str16));
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            F0(alertDialog$Builder);
            return;
        }
        if (str17 != null) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            String M02 = ob6.M0(2131753887, null);
            id idVar3 = alertDialog$Builder2.a;
            idVar3.S = M02;
            idVar3.U = ob6.M0(2131753877, null);
            alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
            F0(alertDialog$Builder2);
            return;
        }
        id idVar4 = new id(3, null, this);
        final tg5 tg5Var2 = new tg5(l01Var2, idVar4, (byte) 25);
        final int[] iArr2 = {0};
        if (str10 != null) {
            TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
            tL_contacts_importContactToken.token = str10;
            final byte b3 = 0;
            iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(tL_contacts_importContactToken, new RequestDelegate(this) { // from class: n16
                public final /* synthetic */ LaunchActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (b3) {
                        case 0:
                            String str32 = LaunchActivity.C1;
                            hl.c3(new uz5(this.b, tLObject, i, str10, tL_error, tg5Var2));
                            break;
                        case 1:
                            String str33 = LaunchActivity.C1;
                            hl.c3(new l77((Object) this.b, (Object) tLObject, i, (Object) str10, (Object) tg5Var2, (byte) 18));
                            break;
                        default:
                            String str34 = LaunchActivity.C1;
                            hl.c3(new uz5(this.b, tL_error, tLObject, i, str10, tg5Var2));
                            break;
                    }
                }
            });
        } else if (str11 != null) {
            TL_chatlists.TL_chatlists_checkChatlistInvite tL_chatlists_checkChatlistInvite = new TL_chatlists.TL_chatlists_checkChatlistInvite();
            tL_chatlists_checkChatlistInvite.slug = str11;
            final byte b4 = 1;
            iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(tL_chatlists_checkChatlistInvite, new RequestDelegate(this) { // from class: n16
                public final /* synthetic */ LaunchActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (b4) {
                        case 0:
                            String str32 = LaunchActivity.C1;
                            hl.c3(new uz5(this.b, tLObject, i, str11, tL_error, tg5Var2));
                            break;
                        case 1:
                            String str33 = LaunchActivity.C1;
                            hl.c3(new l77((Object) this.b, (Object) tLObject, i, (Object) str11, (Object) tg5Var2, (byte) 18));
                            break;
                        default:
                            String str34 = LaunchActivity.C1;
                            hl.c3(new uz5(this.b, tL_error, tLObject, i, str11, tg5Var2));
                            break;
                    }
                }
            });
        } else {
            byte b5 = 14;
            if (str29 != null) {
                ov4 c5 = ov4.c(this.P);
                icc iccVar = new icc(this) { // from class: o16
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // icc
                    public final void a(Object obj, Object obj2) {
                        kv4 b6;
                        byte b7 = b2;
                        tg5 tg5Var3 = tg5Var2;
                        switch (b7) {
                            case 0:
                                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                String str32 = LaunchActivity.C1;
                                LaunchActivity launchActivity = this.b;
                                if (tL_error != null) {
                                    bs2.v(null, 2131749762, d31.b0((e) c00.g(1, launchActivity.e0)), R.raw.error, 36);
                                } else if (tL_StarGiftAuctionState != null && (b6 = ov4.c(launchActivity.P).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                    new gra(launchActivity, null, launchActivity.P, b6.d.title, b6.h, false).show();
                                }
                                try {
                                    tg5Var3.run();
                                    break;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                                break;
                            default:
                                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = (TL_payments.TL_StarGiftAuctionState) obj;
                                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                String str33 = LaunchActivity.C1;
                                LaunchActivity launchActivity2 = this.b;
                                if (tL_error2 != null) {
                                    bs2.v(null, 2131749762, d31.b0((e) c00.g(1, launchActivity2.e0)), R.raw.error, 36);
                                } else if (tL_StarGiftAuctionState2 != null) {
                                    fz.a1(launchActivity2, null, launchActivity2.P, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                }
                                try {
                                    tg5Var3.run();
                                    break;
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                        }
                    }
                };
                TL_stars.TL_inputStarGiftAuctionSlug tL_inputStarGiftAuctionSlug = new TL_stars.TL_inputStarGiftAuctionSlug();
                tL_inputStarGiftAuctionSlug.slug = str29;
                TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
                tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuctionSlug;
                tL_getStarGiftAuctionState.version = 0;
                iArr2[0] = c5.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new ic(b2), new qe2(c5, iccVar, b5));
            } else if (str28 != null) {
                ov4 c6 = ov4.c(this.P);
                final char c7 = c4 == true ? 1 : 0;
                icc iccVar2 = new icc(this) { // from class: o16
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // icc
                    public final void a(Object obj, Object obj2) {
                        kv4 b6;
                        byte b7 = c7;
                        tg5 tg5Var3 = tg5Var2;
                        switch (b7) {
                            case 0:
                                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                String str32 = LaunchActivity.C1;
                                LaunchActivity launchActivity = this.b;
                                if (tL_error != null) {
                                    bs2.v(null, 2131749762, d31.b0((e) c00.g(1, launchActivity.e0)), R.raw.error, 36);
                                } else if (tL_StarGiftAuctionState != null && (b6 = ov4.c(launchActivity.P).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                    new gra(launchActivity, null, launchActivity.P, b6.d.title, b6.h, false).show();
                                }
                                try {
                                    tg5Var3.run();
                                    break;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                                break;
                            default:
                                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = (TL_payments.TL_StarGiftAuctionState) obj;
                                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                String str33 = LaunchActivity.C1;
                                LaunchActivity launchActivity2 = this.b;
                                if (tL_error2 != null) {
                                    bs2.v(null, 2131749762, d31.b0((e) c00.g(1, launchActivity2.e0)), R.raw.error, 36);
                                } else if (tL_StarGiftAuctionState2 != null) {
                                    fz.a1(launchActivity2, null, launchActivity2.P, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                }
                                try {
                                    tg5Var3.run();
                                    break;
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                        }
                    }
                };
                TL_stars.TL_inputStarGiftAuctionSlug tL_inputStarGiftAuctionSlug2 = new TL_stars.TL_inputStarGiftAuctionSlug();
                tL_inputStarGiftAuctionSlug2.slug = str28;
                TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState2 = new TL_payments.TL_getStarGiftAuctionState();
                tL_getStarGiftAuctionState2.auction = tL_inputStarGiftAuctionSlug2;
                tL_getStarGiftAuctionState2.version = 0;
                iArr2[0] = c6.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState2, new ic(b2), new qe2(c6, iccVar2, b5));
            } else if (str19 != null) {
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str19;
                final byte b6 = 2;
                iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(getuniquestargift, new RequestDelegate(this) { // from class: n16
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (b6) {
                            case 0:
                                String str32 = LaunchActivity.C1;
                                hl.c3(new uz5(this.b, tLObject, i, str19, tL_error, tg5Var2));
                                break;
                            case 1:
                                String str33 = LaunchActivity.C1;
                                hl.c3(new l77((Object) this.b, (Object) tLObject, i, (Object) str19, (Object) tg5Var2, (byte) 18));
                                break;
                            default:
                                String str34 = LaunchActivity.C1;
                                hl.c3(new uz5(this.b, tL_error, tLObject, i, str19, tg5Var2));
                                break;
                        }
                    }
                });
            } else if (str18 != null) {
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = str18;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(tL_payments_getPaymentForm, new eu0(this, (Object) tL_inputInvoiceSlug, (Object) tg5Var2, i, str18, (byte) 6));
            } else {
                if (str == null) {
                    String str32 = str3;
                    if (str2 == null) {
                        tg5Var = null;
                        ArrayList arrayList = this.e0;
                        if (str32 != null) {
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = str32;
                            org.telegram.ui.ActionBar.e eVar = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList);
                            if (eVar instanceof zu1) {
                                zu1 zu1Var = (zu1) eVar;
                                s4bVar = new s4b(this, eVar, tL_inputStickerSetShortName, null, (zu1Var.d1.getVisibility() == 0 || !((chat = zu1Var.e) == null || xc2.t(chat))) ? null : zu1Var.a0, zu1Var.getResourceProvider());
                                boolean Y7 = zu1Var.Y7();
                                s4bVar.i0 = Y7;
                                s4bVar.n = Y7;
                            } else {
                                s4bVar = new s4b(this, eVar, tL_inputStickerSetShortName, null, null, null);
                            }
                            s4bVar.K1 = str4 != null;
                            eVar.showDialog(s4bVar);
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
                            org.telegram.ui.ActionBar.e eVar2 = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList);
                            if (eVar2 instanceof zu1) {
                                zu1 zu1Var2 = (zu1) eVar2;
                                ly3Var = new ly3(eVar2, this, zu1Var2.getResourceProvider(), arrayList2);
                                boolean Y72 = zu1Var2.Y7();
                                ly3Var.i0 = Y72;
                                ly3Var.n = Y72;
                            } else {
                                ly3Var = new ly3(eVar2, this, null, arrayList2);
                            }
                            eVar2.showDialog(ly3Var);
                            return;
                        }
                        if (str9 != null) {
                            uj3 uj3Var = new uj3(qd4.j(3, "onlySelect", "dialogsType", true));
                            uj3Var.E2 = new an1(this, z, i, str9);
                            b = 0;
                            u0(uj3Var, false, true);
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
                                iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(getauthorizationform, new c06(this, iArr2, i, tg5Var2, getauthorizationform, str33, str34, str35, (byte) 1));
                            } else if (str15 != null) {
                                TLRPC.TL_help_getDeepLinkInfo tL_help_getDeepLinkInfo = new TLRPC.TL_help_getDeepLinkInfo();
                                tL_help_getDeepLinkInfo.path = str15;
                                iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(tL_help_getDeepLinkInfo, new RequestDelegate(this) { // from class: m16
                                    public final /* synthetic */ LaunchActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.tgnet.RequestDelegate
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        switch (b) {
                                            case 0:
                                                String str36 = LaunchActivity.C1;
                                                hl.c3(new ls5((Object) this.b, (Object) tg5Var2, (Object) tLObject, (byte) 5));
                                                break;
                                            default:
                                                String str37 = LaunchActivity.C1;
                                                hl.c3(new g65(this.b, tg5Var2, tLObject, tL_error, (byte) 9));
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
                                iArr2[0] = connectionsManager.sendRequest(tL_langpack_getLanguage, new RequestDelegate(this) { // from class: m16
                                    public final /* synthetic */ LaunchActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.tgnet.RequestDelegate
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        switch (c8) {
                                            case 0:
                                                String str36 = LaunchActivity.C1;
                                                hl.c3(new ls5((Object) this.b, (Object) tg5Var2, (Object) tLObject, (byte) 5));
                                                break;
                                            default:
                                                String str37 = LaunchActivity.C1;
                                                hl.c3(new g65(this.b, tg5Var2, tLObject, tL_error, (byte) 9));
                                                break;
                                        }
                                    }
                                });
                            } else if (tL_wallPaper != null) {
                                if (TextUtils.isEmpty(tL_wallPaper.slug)) {
                                    try {
                                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                                        int i9 = wallPaperSettings.third_background_color;
                                        hl.c3(new tg5(this, new pqb(i9 != 0 ? new yvc(wallPaperSettings.background_color, wallPaperSettings.second_background_color, i9, wallPaperSettings.fourth_background_color, "c") : new yvc(wallPaperSettings.background_color, wallPaperSettings.second_background_color, hl.q1(wallPaperSettings.rotation, false), "c"), null, true), (byte) 23));
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                }
                                TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = tL_wallPaper.slug;
                                getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(getwallpaper, new m65(this, tg5Var2, tL_wallPaper, (byte) 3));
                            } else {
                                if (str20 != null) {
                                    tg5 tg5Var3 = new tg5(this, l01Var2, (byte) 24);
                                    TL_account.getTheme gettheme = new TL_account.getTheme();
                                    gettheme.format = "android";
                                    TLRPC.TL_inputThemeSlug tL_inputThemeSlug = new TLRPC.TL_inputThemeSlug();
                                    tL_inputThemeSlug.slug = str20;
                                    gettheme.theme = tL_inputThemeSlug;
                                    idVar = idVar4;
                                    iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(gettheme, new m65(this, idVar, tg5Var2, (byte) 4));
                                    i7 = i;
                                    tg5Var = tg5Var3;
                                } else {
                                    idVar = idVar4;
                                    if (l == null || (num == null && !z5)) {
                                        iArr = iArr2;
                                        i7 = i;
                                        if (str30 != null) {
                                            TL_account.resolveBusinessChatLink resolvebusinesschatlink = new TL_account.resolveBusinessChatLink();
                                            resolvebusinesschatlink.slug = str30;
                                            ConnectionsManager.getInstance(this.P).sendRequest(resolvebusinesschatlink, new c16(this, c == true ? 1 : 0));
                                        }
                                    } else {
                                        if (l2 != null) {
                                            TLRPC.Chat M03 = uc7.s1(i).M0(l);
                                            if (M03 != null) {
                                                iArr2[0] = z0(i, tg5Var2, num, num2, l2, num3, null, M03, null, null, 0, -1);
                                            } else {
                                                TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                                                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                                                tL_inputChannel.channel_id = l.longValue();
                                                tL_channels_getChannels.id.add(tL_inputChannel);
                                                iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getChannels, new c06(this, iArr2, i, tg5Var2, num, num2, l2, num3, (byte) 2));
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
                                            TLRPC.Chat M04 = uc7.s1(this.P).M0(l);
                                            if (M04 != null && xc2.R(M04) && z5) {
                                                w0(Long.valueOf(-l.longValue()), tg5Var2, l01Var2, null);
                                            } else if (M04 == null || !M04.forum) {
                                                org.telegram.ui.ActionBar.e eVar3 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.e) c00.g(1, arrayList) : null;
                                                if (eVar3 == null || uc7.s1(i).C(bundle, eVar3, null, null)) {
                                                    iArr = iArr2;
                                                    i7 = i;
                                                    hl.c3(new j06(this, bundle, l, iArr2, tg5Var2, z5, l01Var2, l2, num, num3, bArr, eVar3, i));
                                                }
                                            } else {
                                                l0(-l.longValue(), num, null, num3, bArr, new b06(tg5Var2, (byte) 2), 0, -1);
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
                        idVar = idVar4;
                    } else if (i2 == 0) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = str2;
                        iArr2[0] = ConnectionsManager.getInstance(i).sendRequest(tL_messages_checkChatInvite, new eu0(this, i, idVar4, tg5Var2, str2), 2);
                        i7 = i;
                        iArr = iArr2;
                        idVar = idVar4;
                        b = 0;
                    } else {
                        if (i2 == 1) {
                            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                            tL_messages_importChatInvite.hash = str2;
                            tg5Var = null;
                            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_importChatInvite, null, new pn1((Object) this, (Object) tg5Var2, i, (byte) (c3 == true ? 1 : 0)), 2);
                        } else {
                            tg5Var = null;
                        }
                        i7 = i;
                        iArr = iArr2;
                        idVar = idVar4;
                        b = 0;
                    }
                    if (iArr[b] != 0) {
                        idVar.setOnCancelListener(new ef(i7, iArr, tg5Var));
                        try {
                            if (l01Var2 != null) {
                                l01Var2.b = new l65(i7, iArr, tg5Var);
                                l01Var2.d();
                            } else {
                                idVar.q(300L);
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                if (l01Var2 != null) {
                    l01Var2.d();
                }
                kbc a2 = uc7.s1(i).a2();
                i7 = i;
                pcc pccVar = new pcc() { // from class: p16
                    /* JADX WARN: Can't wrap try/catch for region: R(10:59|(12:63|(3:(1:368)|(1:371)|(1:374))|66|(2:68|(2:70|(5:72|(2:74|(2:76|77)(1:78))(1:82)|79|80|81)(8:83|84|(2:86|(2:88|89))(1:363)|(3:91|(1:95)|96)(4:(5:118|(1:(2:356|(2:358|(1:360)(1:361)))(3:122|123|(11:125|(3:127|(1:158)(1:131)|132)(2:159|(1:164)(1:163))|133|(2:148|(2:153|(1:157))(1:152))(1:137)|138|(1:140)|141|(1:143)|144|(1:146)|147)(1:(2:325|(3:346|347|(2:349|350)(1:352))(7:331|(1:333)(1:345)|334|(1:336)|337|(2:339|(1:341)(1:343))(1:344)|342))(17:167|(3:169|(1:317)(2:173|(2:175|176)(1:177))|178)(3:318|(3:320|(1:322)|323)|324)|(1:316)(1:183)|184|(1:186)|(3:188|(1:190)|(1:192))|193|(1:195)|196|(1:198)|(1:200)|(1:202)|(1:204)(1:315)|(1:206)(1:314)|207|(1:313)(1:210)|(3:214|(1:312)(1:218)|(1:(2:253|(4:288|289|290|(8:292|(1:294)(1:307)|(2:296|(1:298))|(1:300)(1:306)|301|(1:303)|304|305)(1:308))(1:(4:282|(1:284)(1:287)|285|286)(2:(1:281)(1:261)|(8:267|(1:269)|270|(1:272)|273|274|275|277)(2:265|266))))(1:252))(12:221|(1:223)|224|(1:231)|232|(1:234)|235|236|(3:238|(3:240|241|242)(1:244)|243)|245|246|(1:248)(1:249)))))))|362|123|(0)(0))(4:107|(1:117)(2:111|(2:113|114)(1:115))|116|114)|98|99|101)|97|98|99|101))(1:364))(1:366)|365|84|(0)(0)|(0)(0)|97|98|99|101)|378|379|380|(7:382|(1:384)|385|386|387|388|(1:390)(1:391))|97|98|99|101) */
                    /* JADX WARN: Code restructure failed: missing block: B:369:0x0184, code lost:
                    
                        if (r3.longValue() > 0) goto L65;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:372:0x018e, code lost:
                    
                        if (r3.longValue() < 0) goto L65;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:375:0x0198, code lost:
                    
                        if (r3.longValue() < 0) goto L65;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:394:0x0a84, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:395:0x0a82, code lost:
                    
                        r13 = true;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:396:0x0a86, code lost:
                    
                        cc4.g(r0, true);
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:105:0x043e  */
                    /* JADX WARN: Removed duplicated region for block: B:125:0x050e  */
                    /* JADX WARN: Removed duplicated region for block: B:165:0x061e  */
                    /* JADX WARN: Removed duplicated region for block: B:363:0x0414  */
                    /* JADX WARN: Removed duplicated region for block: B:86:0x03f4  */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x041a  */
                    /* JADX WARN: Type inference failed for: r13v40 */
                    /* JADX WARN: Type inference failed for: r13v41, types: [java.lang.String, vnb] */
                    /* JADX WARN: Type inference failed for: r13v43 */
                    @Override // pcc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void a(Object obj) {
                        tg5 tg5Var4;
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
                        l01 l01Var3;
                        final boolean z14;
                        final String str43;
                        String str44;
                        int i10;
                        tg5 tg5Var5;
                        final int i11;
                        int i12;
                        String str45;
                        tg5 tg5Var6;
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
                        s24 v;
                        ArrayList<ag0> arrayList4;
                        tg5 tg5Var7;
                        boolean z17;
                        boolean z18;
                        boolean z19;
                        ?? r13;
                        d31 b0;
                        int i17;
                        final String str50;
                        final Long l5 = (Long) obj;
                        String str51 = LaunchActivity.C1;
                        final LaunchActivity launchActivity3 = LaunchActivity.this;
                        ArrayList arrayList5 = launchActivity3.e0;
                        final tg5 tg5Var8 = tg5Var2;
                        Object[] objArr = 0;
                        byte b7 = 1;
                        if (l5 != null && l5.longValue() == Long.MAX_VALUE) {
                            try {
                                tg5Var8.run();
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, null, launchActivity3);
                            String M05 = ob6.M0(2131754341, null);
                            id idVar5 = alertDialog$Builder3.a;
                            idVar5.S = M05;
                            idVar5.U = ob6.M0(2131754342, null);
                            ik8.y(null, 2131747558, alertDialog$Builder3, null);
                            return;
                        }
                        if (launchActivity3.isFinishing()) {
                            return;
                        }
                        final boolean z20 = z4;
                        if (z20 && l5 != null) {
                            c6b O1 = uc7.s1(launchActivity3.P).O1();
                            long longValue2 = l5.longValue();
                            wz5 wz5Var = new wz5(launchActivity3, tg5Var8, l5, objArr == true ? 1 : 0);
                            int i18 = O1.a;
                            TL_stories.PeerStories x = O1.x(longValue2);
                            if (x != null) {
                                for (int i19 = 0; i19 < x.stories.size(); i19++) {
                                    if ((x.stories.get(i19).media instanceof TLRPC.TL_messageMediaVideoStream) && !(x.stories.get(i19) instanceof TL_stories.TL_storyItemSkipped)) {
                                        wz5Var.a(x.stories.get(i19));
                                        return;
                                    }
                                }
                            }
                            long j2 = ((-93321425) + longValue2) << 12;
                            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) O1.E.f(j2);
                            if (storyItem != null) {
                                wz5Var.a(storyItem);
                                return;
                            }
                            TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                            tL_stories_getPeerStories.peer = uc7.s1(i18).j1(longValue2);
                            ConnectionsManager.getInstance(i18).sendRequest(tL_stories_getPeerStories, new l5b(O1, j2, wz5Var));
                            return;
                        }
                        final int i20 = i4;
                        if (i20 != 0 && l5 != null) {
                            uc7.s1(launchActivity3.P).O1().f0(i20, l5.longValue(), new wz5(launchActivity3, tg5Var8, l5, b7));
                            return;
                        }
                        final int i21 = i5;
                        if (i21 != 0 && l5 != null) {
                            c6b O12 = uc7.s1(launchActivity3.P).O1();
                            long longValue3 = l5.longValue();
                            zo2 zo2Var = new zo2((Object) launchActivity3, (Object) tg5Var8, (Object) l5, i21, (byte) 3);
                            int i22 = O12.a;
                            q5b A = O12.A(longValue3, false);
                            if (A != null) {
                                v5b b8 = A.b(i21);
                                if (b8 != null) {
                                    TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                                    tL_storyAlbum.album_id = b8.a;
                                    tL_storyAlbum.title = b8.b;
                                    tL_storyAlbum.icon_photo = b8.c;
                                    tL_storyAlbum.icon_video = b8.d;
                                    zo2Var.a(tL_storyAlbum);
                                    return;
                                }
                                if (A.f) {
                                    zo2Var.a(null);
                                    return;
                                }
                            }
                            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
                            tL_getAlbums.peer = uc7.s1(i22).j1(longValue3);
                            ConnectionsManager.getInstance(i22).sendRequest(tL_getAlbums, new b22(i21, zo2Var));
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
                                final l01 l01Var4 = l01Var2;
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
                                    l01Var3 = l01Var4;
                                    z14 = z22;
                                    str43 = str62;
                                } else {
                                    final TLRPC.User X1 = uc7.s1(i23).X1(l5);
                                    if (X1 != null) {
                                        if (X1.bot) {
                                            if (X1.bot_attach_menu) {
                                                str50 = str58;
                                                if (!ls6.d0(i23).l(X1.id)) {
                                                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                                                    uc7 s1 = uc7.s1(i23);
                                                    tL_messages_getAttachMenuBot.bot = s1.q1(s1.X1(l5));
                                                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i23);
                                                    final int i26 = z23 ? 1 : 0;
                                                    connectionsManager2.sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() { // from class: xz5
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
                                                            final l01 l01Var5 = l01Var4;
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
                                                            final TLRPC.User user = X1;
                                                            final tg5 tg5Var9 = tg5Var8;
                                                            final int i32 = z34 ? 1 : 0;
                                                            hl.c3(new Runnable() { // from class: e06
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    l01 l01Var6;
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
                                                                    final l01 l01Var7 = l01Var5;
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
                                                                        hl.c3(new Runnable() { // from class: r06
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
                                                                                launchActivity6.B0(i41, str147, str148, str149, str150, str151, str152, str153, str154, str155, str156, str157, str158, z57, num15, l13, l14, num16, str159, hashMap5, str160, str161, str162, str163, tL_wallPaper5, str164, str165, str166, str167, z58, str168, z59 ? 1 : 0, i36, str139, str140, str141, null, null, l01Var7, z48, i37, z56, i38, i39, str144, str145, z49, str142, z50, z51, z52, z53, z54, str143, num14, z55, bArr5);
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
                                                                        final tg5 tg5Var10 = tg5Var9;
                                                                        if ((z58 || tL_attachMenuBot.side_menu_disclaimer_needed) && z59) {
                                                                            final int i41 = z47 ? 1 : 0;
                                                                            exc.a(launchActivity5, new pcc() { // from class: s06
                                                                                @Override // pcc
                                                                                public final void a(Object obj2) {
                                                                                    String str148 = LaunchActivity.C1;
                                                                                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                                                                    tL_attachMenuBot2.inactive = false;
                                                                                    tL_attachMenuBot2.request_write_access = false;
                                                                                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                    int i42 = i35;
                                                                                    uc7 s12 = uc7.s1(i42);
                                                                                    tL_messages_toggleBotInAttachMenu.bot = s12.q1(s12.X1(l13));
                                                                                    tL_messages_toggleBotInAttachMenu.enabled = true;
                                                                                    tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                                                                    ConnectionsManager.getInstance(i42).sendRequest(tL_messages_toggleBotInAttachMenu, new fw0(i42, (byte) 1), 66);
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
                                                                                    launchActivity6.x0(i42, str149, str150, str151, str152, str153, str154, str155, str156, str157, str158, str159, str160, z60, num15, l14, l15, num16, str161, hashMap5, str162, str163, str164, str165, tL_wallPaper5, str166, str167, str168, str169, z61, str170, z62 ? 1 : 0, i36, str139, str140, str141, str146, str147, l01Var7, z48, i37, i38, i39, z49, str142, user3, tg5Var10, z59, true, z50, z51, z52, z53, z54, str143, z55);
                                                                                }
                                                                            }, l01Var7 != null ? new ea5(l01Var7, (byte) 22) : null);
                                                                            return;
                                                                        }
                                                                        if (tL_attachMenuBot.request_write_access) {
                                                                            l01Var6 = l01Var7;
                                                                            user2 = user3;
                                                                            str115 = str142;
                                                                            z44 = z49;
                                                                            i33 = i39;
                                                                            i34 = i38;
                                                                        } else {
                                                                            if (!z48) {
                                                                                launchActivity5.x0(i35, str117, str118, str119, str120, str121, str122, str123, str124, str125, str126, str127, str128, z45, num12, l11, l12, num13, str129, hashMap4, str130, str131, str132, str133, tL_wallPaper4, str134, str135, str136, str137, z46, str138, z47 ? 1 : 0, i36, str139, str140, str141, str146, str147, l01Var7, z48, i37, i38, i39, z49, str142, user3, tg5Var10, false, false, z50, z51, z52, z53, z54, str143, z55);
                                                                                return;
                                                                            }
                                                                            l01Var6 = l01Var7;
                                                                            user2 = user3;
                                                                            str115 = str142;
                                                                            z44 = z49;
                                                                            i33 = i39;
                                                                            i34 = i38;
                                                                        }
                                                                        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                                                                        e Q = LaunchActivity.Q();
                                                                        final TLRPC.User user4 = user2;
                                                                        final l01 l01Var8 = l01Var6;
                                                                        final int i42 = z47 ? 1 : 0;
                                                                        jj.m(Q, atomicBoolean, user4, new Runnable() { // from class: t06
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                String str148 = LaunchActivity.C1;
                                                                                LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                                int i43 = launchActivity6.P;
                                                                                Long l14 = l13;
                                                                                vye.c(i43, l14.longValue());
                                                                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                                                                tL_attachMenuBot2.inactive = false;
                                                                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                tL_attachMenuBot2.request_write_access = !atomicBoolean2.get();
                                                                                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                int i44 = i35;
                                                                                uc7 s12 = uc7.s1(i44);
                                                                                tL_messages_toggleBotInAttachMenu.bot = s12.q1(s12.X1(l14));
                                                                                tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean2.get();
                                                                                ConnectionsManager.getInstance(i44).sendRequest(tL_messages_toggleBotInAttachMenu, new fw0(i44, (byte) 2), 66);
                                                                                launchActivity6.x0(i44, str117, str118, str119, str120, str121, str122, str123, str124, str125, str126, str127, str128, z45, num12, l11, l12, num13, str129, hashMap4, str130, str131, str132, str133, tL_wallPaper4, str134, str135, str136, str137, z46, str138, i42 ? 1 : 0, i36, str139, str140, str141, str146, str147, l01Var8, z48, i37, i34, i33, z44, str115, user4, tg5Var10, false, false, z50, z51, z52, z53, z54, str143, z55);
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
                                            launchActivity3.x0(i23, str52, str57, str50, str59, str60, str61, str62, str63, str64, str65, str66, str67, z22, num6, l6, l7, num7, str53, hashMap2, str68, str69, str70, str71, tL_wallPaper2, str72, str73, str74, str54, z21, str55, z23 ? 1 : 0, i24, str75, str76, str77, str56, str82, l01Var4, z24, i20, i21, i25, z25, str80, X1, tg5Var8, false, false, z26, z27, z28, z29, z30, str81, z31);
                                            return;
                                        }
                                        str38 = str61;
                                        str39 = str63;
                                        str40 = str67;
                                        str41 = str58;
                                        launchActivity = launchActivity3;
                                        str37 = str53;
                                        tg5Var5 = tg5Var8;
                                        z14 = z22;
                                        str36 = str82;
                                        i11 = i25;
                                        str43 = str62;
                                        str42 = str64;
                                        l01Var3 = l01Var4;
                                        str44 = str59;
                                        i10 = i23;
                                        if (z25) {
                                            i12 = i10;
                                            str45 = str60;
                                        } else {
                                            i12 = i10;
                                            str45 = str60;
                                            if (xc2.R(uc7.s1(i10).M0(Long.valueOf(-l5.longValue())))) {
                                                launchActivity.w0(l5, tg5Var5, l01Var3, null);
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
                                                        tg5Var6 = tg5Var5;
                                                        final tg5 tg5Var9 = tg5Var6;
                                                        if (str37 == null) {
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putBoolean("onlySelect", true);
                                                            bundle2.putBoolean("cantSendToChannels", true);
                                                            bundle2.putInt("dialogsType", 1);
                                                            bundle2.putString("selectAlertString", ob6.M0(2131745352, null));
                                                            bundle2.putString("selectAlertStringGroup", ob6.M0(2131745353, null));
                                                            uj3 uj3Var2 = new uj3(bundle2);
                                                            uj3Var2.E2 = new yz5(launchActivity2, str37, i13, uc7.s1(i13).X1(l5));
                                                            if (hl.O1()) {
                                                                z18 = !launchActivity2.q0.getFragmentStack().isEmpty() && (launchActivity2.q0.getFragmentStack().get(launchActivity2.q0.getFragmentStack().size() + (-1)) instanceof fj6);
                                                                z17 = true;
                                                            } else {
                                                                z17 = true;
                                                                z18 = launchActivity2.p0.getFragmentStack().size() > 1 && (launchActivity2.p0.getFragmentStack().get(launchActivity2.p0.getFragmentStack().size() - 1) instanceof fj6);
                                                            }
                                                            ((ActionBarLayout) launchActivity2.N()).U(uj3Var2, z18, z17);
                                                            if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                                                                SecretMediaViewer.d().c(false, false);
                                                            } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
                                                                PhotoViewer.q0().A(false, true);
                                                            } else if (o.F() && o.u().W) {
                                                                o.u().l(false, true);
                                                            }
                                                            rbb.v();
                                                            j95 j95Var = j95.s5;
                                                            if (j95Var != null) {
                                                                j95Var.dismiss();
                                                            }
                                                            er9 er9Var = er9.Q0;
                                                            if (er9Var != null) {
                                                                er9Var.dismiss();
                                                            }
                                                            if (hl.O1()) {
                                                                launchActivity2.p0.W(true, true);
                                                                launchActivity2.r0.W(true, true);
                                                            }
                                                            tg5Var4 = tg5Var9;
                                                        } else if (str38 == null && str43 == null) {
                                                            Bundle bundle3 = new Bundle();
                                                            TLRPC.User X12 = uc7.s1(i13).X1(l5);
                                                            final String str83 = str37;
                                                            if (l5.longValue() < 0) {
                                                                final LaunchActivity launchActivity5 = launchActivity2;
                                                                i14 = i13;
                                                                final Integer num9 = num4;
                                                                final TLRPC.Chat M06 = uc7.s1(i13).M0(Long.valueOf(-l5.longValue()));
                                                                if (!z31 || M06.linked_monoforum_id == 0) {
                                                                    num5 = num9;
                                                                    tg5Var7 = tg5Var9;
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
                                                                    if (uc7.s1(i14).M0(Long.valueOf(M06.linked_monoforum_id)) == null) {
                                                                        TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                                                                        tL_channels_getFullChannel.channel = uc7.i1(M06);
                                                                        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(i14);
                                                                        final String str86 = str36;
                                                                        final String str87 = str40;
                                                                        final String str88 = str45;
                                                                        final l01 l01Var5 = l01Var3;
                                                                        final String str89 = str41;
                                                                        final int i27 = z23 ? 1 : 0;
                                                                        connectionsManager3.sendRequest(tL_channels_getFullChannel, new RequestDelegate() { // from class: a06
                                                                            @Override // org.telegram.tgnet.RequestDelegate
                                                                            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                                                String str90 = LaunchActivity.C1;
                                                                                final LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                                final int i28 = i14;
                                                                                final TLRPC.Chat chat2 = M06;
                                                                                final tg5 tg5Var10 = tg5Var9;
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
                                                                                final l01 l01Var6 = l01Var5;
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
                                                                                hl.c3(new Runnable() { // from class: h06
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        String str122 = LaunchActivity.C1;
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        boolean z44 = tLObject2 instanceof TLRPC.TL_messages_chatFull;
                                                                                        tg5 tg5Var11 = tg5Var10;
                                                                                        if (!z44) {
                                                                                            try {
                                                                                                tg5Var11.run();
                                                                                                return;
                                                                                            } catch (Exception e3) {
                                                                                                cc4.g(e3, true);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject2;
                                                                                        int i34 = i28;
                                                                                        uc7.s1(i34).j4(tL_messages_chatFull.users, false);
                                                                                        uc7.s1(i34).c4(tL_messages_chatFull.chats, false);
                                                                                        jf7.Y(i34).j1(tL_messages_chatFull.users, tL_messages_chatFull.chats, false, true);
                                                                                        if (uc7.s1(i34).M0(Long.valueOf(chat2.linked_monoforum_id)) == null) {
                                                                                            try {
                                                                                                tg5Var11.run();
                                                                                                return;
                                                                                            } catch (Exception e4) {
                                                                                                cc4.g(e4, true);
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
                                                                                        launchActivity7.B0(i34, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z45, num13, l10, l11, num14, str135, hashMap4, str136, str137, str138, str139, tL_wallPaper4, str140, str141, str142, str143, z46, str144, z47 ? 1 : 0, i29, str113, str114, str115, str116, str117, l01Var6, z35, i30, z36, i31, i32, str118, str119, z37, str120, z38, z39, z40, z41, z42, str121, num12, z43, bArr4);
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        return;
                                                                    }
                                                                    num5 = num9;
                                                                    tg5Var7 = tg5Var9;
                                                                    str46 = str54;
                                                                    str47 = str55;
                                                                    i15 = i24;
                                                                    i16 = i11;
                                                                    str48 = str45;
                                                                    launchActivity2 = launchActivity5;
                                                                    l4 = l5;
                                                                    bArr2 = bArr3;
                                                                    bundle3.putLong("chat_id", M06.linked_monoforum_id);
                                                                    j = -M06.linked_monoforum_id;
                                                                }
                                                                tg5Var4 = tg5Var7;
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
                                                                tg5Var4 = tg5Var9;
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
                                                            if (str48 == null || X12 == null || !X12.bot) {
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
                                                            e eVar4 = (arrayList3.isEmpty() || str46 != null) ? null : (e) c00.g(1, arrayList3);
                                                            if (eVar4 == null || uc7.s1(i14).C(bundle3, eVar4, null, null)) {
                                                                boolean z32 = (eVar4 instanceof zu1) && ((zu1) eVar4).a() == j;
                                                                if (z16 && z32) {
                                                                    ArrayList arrayList6 = new ArrayList();
                                                                    ArrayList<ag0> arrayList7 = eVar4.sheetsStack;
                                                                    if (arrayList7 != null) {
                                                                        arrayList6.addAll(arrayList7);
                                                                    }
                                                                    if ((eVar4.getParentLayout() instanceof ActionBarLayout) && (v = ((ActionBarLayout) eVar4.getParentLayout()).v()) != null && v != eVar4 && (arrayList4 = v.sheetsStack) != null) {
                                                                        arrayList6.addAll(arrayList4);
                                                                    }
                                                                    int size = arrayList6.size();
                                                                    int i28 = 0;
                                                                    while (i28 < size) {
                                                                        Object obj2 = arrayList6.get(i28);
                                                                        i28++;
                                                                    }
                                                                    ArrayList arrayList8 = new ArrayList(xw0.b1);
                                                                    int size2 = arrayList8.size();
                                                                    int i29 = 0;
                                                                    while (i29 < size2) {
                                                                        Object obj3 = arrayList8.get(i29);
                                                                        i29++;
                                                                        xw0 xw0Var = (xw0) obj3;
                                                                        if (xw0Var.J == j) {
                                                                            xw0Var.m(true);
                                                                        }
                                                                    }
                                                                    zu1 zu1Var3 = (zu1) eVar4;
                                                                    if (zu1Var3.x8 != 0) {
                                                                        zu1Var3.getMessagesController().M4(str48, zu1Var3.f);
                                                                    } else {
                                                                        zu1Var3.e7 = true;
                                                                        uc7 messagesController = zu1Var3.getMessagesController();
                                                                        TLRPC.User user = zu1Var3.f;
                                                                        zu1Var3.w8 = str48;
                                                                        messagesController.M4(str48, user);
                                                                        zu1Var3.Pc(false);
                                                                    }
                                                                } else {
                                                                    if (str49 == null || !z32) {
                                                                        long j3 = -j;
                                                                        TLRPC.Chat M07 = uc7.s1(launchActivity2.P).M0(Long.valueOf(j3));
                                                                        if (z29 || i16 > 0) {
                                                                            try {
                                                                                tg5Var4.run();
                                                                            } catch (Exception e3) {
                                                                                cc4.g(e3, true);
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
                                                                                if (l4.longValue() == yac.h(launchActivity2.P).e()) {
                                                                                    bundle4.putBoolean("my_profile", true);
                                                                                }
                                                                            }
                                                                            e e0 = i16 > 0 ? null : rr0.e0(launchActivity2.P, l4.longValue());
                                                                            wk5 N = launchActivity2.N();
                                                                            if (e0 == null) {
                                                                                e0 = new ProfileActivity(bundle4, null);
                                                                            }
                                                                            ((ActionBarLayout) N).S(e0);
                                                                            return;
                                                                        }
                                                                        if (M07 == null || !M07.forum) {
                                                                            String str91 = str47;
                                                                            long j4 = j;
                                                                            Integer num10 = num5;
                                                                            uc7.s1(i14).r0(j4, num10 == null ? 0 : num10.intValue(), new u16(launchActivity2, tg5Var4, str91, eVar4, j4, num10, bundle3));
                                                                            return;
                                                                        }
                                                                        Long valueOf = (l3 != null || num5 == null) ? l3 : Long.valueOf(num5.intValue());
                                                                        if (valueOf != null && valueOf.longValue() != 0) {
                                                                            launchActivity2.l0(j, num5, null, num8, bArr4, new b06(tg5Var4, (byte) 0), 0, -1);
                                                                            return;
                                                                        }
                                                                        tg5 tg5Var10 = tg5Var4;
                                                                        Bundle k = qu6.k(j3, "chat_id");
                                                                        if (str46 != null) {
                                                                            k.putString("voicechat", str46);
                                                                        }
                                                                        if (z21) {
                                                                            k.putBoolean("videochat", true);
                                                                        }
                                                                        launchActivity2.t0(tzb.G0(launchActivity2, k));
                                                                        try {
                                                                            tg5Var10.run();
                                                                            return;
                                                                        } catch (Exception e4) {
                                                                            cc4.g(e4, true);
                                                                            return;
                                                                        }
                                                                    }
                                                                    zu1 zu1Var4 = (zu1) eVar4;
                                                                    zu1Var4.getClass();
                                                                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                                                    tL_contacts_resolveUsername.username = str49;
                                                                    zu1Var4.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new ym1(zu1Var4, (byte) 5));
                                                                }
                                                            }
                                                        } else {
                                                            int i30 = i13;
                                                            tg5Var4 = tg5Var9;
                                                            TLRPC.User X13 = uc7.s1(i30).X1(l5);
                                                            if (X13 == null || (X13.bot && X13.bot_nochats)) {
                                                                try {
                                                                    if (arrayList3.isEmpty()) {
                                                                        return;
                                                                    }
                                                                    d31.b0((e) arrayList3.get(arrayList3.size() - 1)).t(ob6.M0(2131753101, null), null).j();
                                                                    return;
                                                                } catch (Exception e5) {
                                                                    cc4.g(e5, true);
                                                                    return;
                                                                }
                                                            }
                                                            Bundle j5 = qd4.j(2, "onlySelect", "dialogsType", true);
                                                            j5.putBoolean("resetDelegate", false);
                                                            j5.putBoolean("closeFragment", false);
                                                            j5.putBoolean("allowGroups", str38 != null);
                                                            j5.putBoolean("allowChannels", str43 != null);
                                                            String str92 = TextUtils.isEmpty(str38) ? TextUtils.isEmpty(str43) ? null : str43 : str38;
                                                            uj3 uj3Var3 = new uj3(j5);
                                                            uj3Var3.E2 = new zz5(launchActivity2, i30, X13, str39, str92, uj3Var3);
                                                            launchActivity2.t0(uj3Var3);
                                                        }
                                                    } else if (l5.longValue() < 0) {
                                                        tg5 tg5Var11 = tg5Var5;
                                                        int z0 = launchActivity4.z0(i12, tg5Var11, num6, num7, l7, null, null, uc7.s1(i12).M0(Long.valueOf(-l5.longValue())), null, null, 0, -1);
                                                        iArr2[0] = z0;
                                                        if (z0 != 0) {
                                                            return;
                                                        }
                                                        z12 = true;
                                                        tg5Var4 = tg5Var11;
                                                    }
                                                }
                                                tg5Var6 = tg5Var5;
                                                launchActivity2 = launchActivity4;
                                                arrayList3 = arrayList5;
                                                num4 = num6;
                                                l3 = l7;
                                                i13 = i12;
                                                final tg5 tg5Var92 = tg5Var6;
                                                if (str37 == null) {
                                                }
                                            } else {
                                                TLRPC.User X14 = uc7.s1(i12).X1(l5);
                                                if (X14 == null || !X14.bot) {
                                                    z19 = true;
                                                    r13 = 0;
                                                    b0 = d31.b0((e) c00.g(1, arrayList5));
                                                    i17 = 2131752967;
                                                } else if (X14.bot_attach_menu) {
                                                    long longValue5 = l5.longValue();
                                                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot2 = new TLRPC.TL_messages_getAttachMenuBot();
                                                    uc7 s12 = uc7.s1(i12);
                                                    tL_messages_getAttachMenuBot2.bot = s12.q1(s12.X1(l5));
                                                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getAttachMenuBot2, new xr0(launchActivity, i12, str36, str77, X14, str75, longValue5));
                                                    z19 = true;
                                                    tg5Var4 = tg5Var5;
                                                    z12 = z19;
                                                } else {
                                                    z19 = true;
                                                    b0 = d31.b0((e) c00.g(1, arrayList5));
                                                    i17 = 2131753102;
                                                    r13 = 0;
                                                }
                                                xnb.x(r13, i17, b0, r13);
                                                tg5Var4 = tg5Var5;
                                                z12 = z19;
                                            }
                                            tg5Var4.run();
                                            return;
                                        }
                                        TLRPC.User X15 = uc7.s1(i12).X1(l5);
                                        if (X15 != null && X15.bot) {
                                            uc7.s1(i12).G3(null, X15, str36, 0, l01Var3, z26, z27);
                                        }
                                        tg5Var4 = tg5Var5;
                                        z12 = true;
                                        tg5Var4.run();
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
                                    l01Var3 = l01Var4;
                                }
                                str44 = str59;
                                i10 = i23;
                                tg5Var5 = tg5Var8;
                                i11 = i25;
                                if (z25) {
                                }
                                if (str36 != null) {
                                }
                                z12 = true;
                                tg5Var4.run();
                                return;
                            }
                            tg5Var4.run();
                            return;
                        } catch (Exception e6) {
                            cc4.g(e6, z12);
                            return;
                        }
                        tg5Var4 = tg5Var8;
                        e Q = LaunchActivity.Q();
                        if (Q != null) {
                            if (Q instanceof zu1) {
                                ((zu1) Q).Qb();
                            }
                            Typeface typeface = hl.a;
                            try {
                                Double.parseDouble(str52);
                                z13 = true;
                            } catch (NumberFormatException unused2) {
                                z13 = false;
                            }
                            if (z13) {
                                d31.b0(Q).t(ob6.M0(2131747912, null), null).j();
                            } else {
                                d31.b0(Q).t(ob6.M0(2131747865, null), null).j();
                            }
                        }
                        z12 = true;
                    }
                };
                l01Var2 = l01Var2;
                a2.a(str, str31, pccVar);
                iArr = iArr2;
                idVar = idVar4;
                b = 0;
                tg5Var = null;
                if (iArr[b] != 0) {
                }
            }
        }
        i7 = i;
        b = 0;
        iArr = iArr2;
        tg5Var = null;
        idVar = idVar4;
        if (iArr[b] != 0) {
        }
    }

    public final void C() {
        if (Build.VERSION.SDK_INT >= 24) {
            mr4 mr4Var = this.i1;
            if (mr4Var == null && xea.o) {
                mr4Var = mr4.a(this, this.v0);
                this.i1 = mr4Var;
            }
            if (mr4Var == null || xea.o) {
                return;
            }
            mr4Var.b();
            this.i1 = null;
        }
    }

    public final void D(int i) {
        K1 = this;
        Set set = u60.a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - xea.G) >= 86400) {
            xea.G = currentTimeMillis;
            Utilities.f.c(new zd(currentTimeMillis, (Object) xb4.j(4), (byte) 5));
        }
        if (f11.a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - xea.H) >= 3600) {
                xea.H = currentTimeMillis2;
                Utilities.f.c(new gw0(currentTimeMillis2, (byte) 15));
            }
        }
        if ((Build.VERSION.SDK_INT < 26 || i != 0) && !this.w1) {
            Utilities.e.d(new gw1(this, i, (byte) 2), 2000L);
        }
    }

    public final void D0(int i) {
        this.y0.setInternalNavigationBarColor(i);
        yx0 O = O();
        if (O != null) {
            O.setNavigationBarColor(i);
        }
    }

    @Override // oj3
    public final boolean E() {
        ArrayList arrayList = this.V;
        return (arrayList != null && arrayList.size() == 1) || this.S != null;
    }

    public final void E0() {
        int indexOfChild = this.y0.indexOfChild(this.y0.indexOfChild(this.s0) != -1 ? this.s0 : this.p0.getView());
        if (indexOfChild != -1) {
            this.y0.removeViewAt(indexOfChild);
        }
        if (hl.O1()) {
            getWindow().setSoftInputMode(16);
            c26 c26Var = new c26(this, this);
            this.s0 = c26Var;
            dr3 dr3Var = this.y0;
            if (indexOfChild != -1) {
                dr3Var.addView(c26Var, indexOfChild, tre.c(-1.0f, -1));
            } else {
                dr3Var.addView(c26Var, tre.c(-1.0f, -1));
            }
            w81 w81Var = new w81(this, null);
            this.u0 = w81Var;
            w81Var.setOccupyStatusBar(false);
            this.u0.U(aob.r0());
            this.s0.addView(this.u0, tre.w(-1, -1));
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
            this.t0.setOnTouchListener(new b7(this, b));
            this.t0.setOnClickListener(new y00(b));
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
            dr3 dr3Var2 = this.y0;
            ActionBarLayout actionBarLayout3 = this.p0;
            if (indexOfChild != -1) {
                dr3Var2.addView(actionBarLayout3.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                dr3Var2.addView(actionBarLayout3.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        nle.a(this, xea.t1, false);
    }

    public final id F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            id o = alertDialog$Builder.o();
            o.setCanceledOnTouchOutside(true);
            o.setOnDismissListener(new gf(this, o, (byte) 10));
            this.D0.add(o);
            return o;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final void G() {
        if (!hl.O1() || this.r0 == null) {
            return;
        }
        Boolean bool = hl.L;
        if (bool != null) {
            if (bool.booleanValue() != (org.telegram.messenger.a.b != null && org.telegram.messenger.a.b.getResources().getBoolean(R.bool.isTablet))) {
                return;
            }
        }
        if (hl.E || (hl.N1() && getResources().getConfiguration().orientation != 2)) {
            this.N0 = true;
            List<org.telegram.ui.ActionBar.e> fragmentStack = this.r0.getFragmentStack();
            if (!fragmentStack.isEmpty()) {
                while (fragmentStack.size() > 0) {
                    org.telegram.ui.ActionBar.e eVar = fragmentStack.get(0);
                    if (eVar instanceof zu1) {
                        zu1 zu1Var = (zu1) eVar;
                        zu1Var.m5 = true;
                        zu1Var.n5 = true;
                    }
                    eVar.onPause();
                    eVar.onFragmentDestroy();
                    eVar.setParentLayout(null);
                    fragmentStack.remove(eVar);
                    this.p0.b(-1, eVar);
                }
                hz7 hz7Var = this.z0;
                if (hz7Var == null || hz7Var.b.getVisibility() != 0) {
                    this.p0.W(true, true);
                }
            }
            this.r0.getView().setVisibility(8);
            this.u0.setVisibility(this.p0.getFragmentStack().isEmpty() ? 0 : 8);
            return;
        }
        this.N0 = false;
        List<org.telegram.ui.ActionBar.e> fragmentStack2 = this.p0.getFragmentStack();
        if (fragmentStack2.size() >= 2) {
            while (1 < fragmentStack2.size()) {
                org.telegram.ui.ActionBar.e eVar2 = fragmentStack2.get(1);
                if (eVar2 instanceof zu1) {
                    zu1 zu1Var2 = (zu1) eVar2;
                    zu1Var2.m5 = true;
                    zu1Var2.n5 = true;
                }
                eVar2.onPause();
                eVar2.onFragmentDestroy();
                eVar2.setParentLayout(null);
                fragmentStack2.remove(eVar2);
                this.r0.b(-1, eVar2);
            }
            hz7 hz7Var2 = this.z0;
            if (hz7Var2 == null || hz7Var2.b.getVisibility() != 0) {
                this.p0.W(true, true);
                this.r0.W(true, true);
            }
        }
        this.r0.getView().setVisibility(this.r0.getFragmentStack().isEmpty() ? 8 : 0);
        this.u0.setVisibility(this.r0.getFragmentStack().isEmpty() ? 0 : 8);
    }

    public final void H(boolean z, boolean z2, boolean z3) {
        xu1 xu1Var;
        boolean z4;
        ArrayList arrayList = this.e0;
        boolean z5 = true;
        org.telegram.ui.ActionBar.e eVar = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.e) c00.g(1, arrayList) : null;
        char c = 2;
        if (eVar != null && (eVar.isRemovingFromStack() || eVar.isInPreviewMode())) {
            eVar = arrayList.size() > 1 ? (org.telegram.ui.ActionBar.e) c00.g(2, arrayList) : null;
        }
        if (eVar != null) {
            eVar.hasForceLightStatusBar();
        }
        if (z2) {
            if (eVar != null) {
                z4 = eVar.isLightStatusBar();
                if (eVar.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) eVar.getParentLayout();
                    if (actionBarLayout.v() == null || actionBarLayout.v().getLastSheet() == null) {
                        ArrayList<ag0> arrayList2 = eVar.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            ag0 ag0Var = (ag0) c00.g(1, eVar.sheetsStack);
                            if (ag0Var.s()) {
                                z4 = ag0Var.f();
                            }
                        }
                    } else {
                        ag0 lastSheet = actionBarLayout.v().getLastSheet();
                        if (lastSheet.s()) {
                            z4 = lastSheet.f();
                        }
                    }
                }
            } else {
                z4 = vm2.h(aob.w0(null, aob.s8, true)) > 0.699999988079071d;
            }
            hl.k3(this, z4);
        }
        if (Build.VERSION.SDK_INT >= 26 && z3 && (!z || eVar == null || !eVar.isInPreviewMode())) {
            int w0 = (eVar == null || !z) ? aob.w0(null, aob.a7, true) : eVar.getNavigationBarColor();
            if (eVar instanceof zu1) {
                zu1 zu1Var = (zu1) eVar;
                if (!zu1Var.tc || (zu1Var.w.s != 1 && ((xu1Var = zu1Var.Ba) == null || !xu1Var.q))) {
                    c = 1;
                }
            } else {
                c = 0;
            }
            if (O() != null && O().I > 0) {
                c = 0;
            }
            if (this.p0.v() != null) {
                s24 v = this.p0.v();
                if (v.sheetsStack != null) {
                    for (int i = 0; i < v.sheetsStack.size(); i++) {
                        ag0 ag0Var2 = v.sheetsStack.get(i);
                        if (ag0Var2.z()) {
                            w0 = ag0Var2.e(w0);
                            c = 0;
                        }
                    }
                }
            }
            Iterator it = xw0.b1.iterator();
            while (it.hasNext()) {
                w0 = ((xw0) it.next()).e(w0);
                c = 0;
            }
            D0(w0);
            if ((c != 0 || hl.B(w0) < 0.721f) && c != 1) {
                z5 = false;
            }
            hl.h3(this, z5);
        }
        if (z2) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void H0(rs4 rs4Var) {
        org.telegram.ui.ActionBar.e eVar;
        ArrayList arrayList = this.f0;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.g0;
            if (arrayList2.isEmpty()) {
                ArrayList arrayList3 = this.e0;
                eVar = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.e) c00.g(1, arrayList3) : null;
            } else {
                eVar = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList2);
            }
        } else {
            eVar = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList);
        }
        if (d31.a(eVar)) {
            rs4Var.b(d31.b0(eVar)).j();
        }
    }

    public final void I(boolean z) {
        vc2 vc2Var;
        long j;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = false;
        if (sharedInstance == null || (vc2Var = sharedInstance.groupCall) == null) {
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
            j = yac.h(this.P).n;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(j);
        boolean z4 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted) ? false : true;
        if (z4 && groupCallParticipant.raise_hand_rating != 0) {
            z2 = true;
        }
        this.m0 = z2;
        if (z || !z3 || z2 || z4 || j95.s5 != null) {
            return;
        }
        M0(38);
    }

    public final void I0() {
        byte b;
        mb6 mb6Var;
        if (yac.h(this.P).o()) {
            final byte b2 = 1;
            try {
                if (this.H0 || org.telegram.messenger.a.x) {
                    return;
                }
                String string = uc7.e1().getString("language_showed2", "");
                final String str = uc7.s1(this.P).s3;
                if (string.equals(str)) {
                    if (f11.a) {
                        cc4.b("alert already showed for ".concat(string));
                        return;
                    }
                    return;
                }
                final mb6[] mb6VarArr = new mb6[2];
                byte b3 = 0;
                String str2 = str.contains("-") ? str.split("-")[0] : str;
                String str3 = "in".equals(str2) ? "id" : "iw".equals(str2) ? "he" : "jw".equals(str2) ? "jv" : null;
                int i = 0;
                while (true) {
                    if (i >= ob6.D0().J.size()) {
                        b = b3;
                        break;
                    }
                    mb6 mb6Var2 = (mb6) ob6.D0().J.get(i);
                    b = b3;
                    if (mb6Var2.c.equals("en")) {
                        mb6VarArr[b] = mb6Var2;
                    }
                    if (mb6Var2.c.replace("_", "-").equals(str) || mb6Var2.c.equals(str2) || mb6Var2.c.equals(str3)) {
                        mb6VarArr[1] = mb6Var2;
                    }
                    if (mb6VarArr[b] != null && mb6VarArr[1] != null) {
                        break;
                    }
                    i++;
                    b3 = b;
                }
                mb6 mb6Var3 = mb6VarArr[b];
                if (mb6Var3 == null || (mb6Var = mb6VarArr[1]) == null || mb6Var3 == mb6Var) {
                    return;
                }
                if (f11.a) {
                    cc4.b("show lang alert for " + mb6VarArr[b].b() + " and " + mb6VarArr[1].b());
                }
                this.I0 = null;
                this.J0 = null;
                this.H0 = true;
                TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                tL_langpack_getStrings.lang_code = mb6VarArr[1].c();
                tL_langpack_getStrings.keys.add("English");
                tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                final byte b4 = b;
                ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) { // from class: d16
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
                                final mb6[] mb6VarArr2 = mb6VarArr;
                                final String str5 = str;
                                hl.c3(new Runnable() { // from class: vz5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b6 = b5;
                                        String str6 = str5;
                                        mb6[] mb6VarArr3 = mb6VarArr2;
                                        HashMap hashMap2 = hashMap;
                                        LaunchActivity launchActivity2 = launchActivity;
                                        switch (b6) {
                                            case 0:
                                                String str7 = LaunchActivity.C1;
                                                launchActivity2.I0 = hashMap2;
                                                if (launchActivity2.J0 != null) {
                                                    launchActivity2.J0(mb6VarArr3[1], mb6VarArr3[0], str6);
                                                    break;
                                                }
                                                break;
                                            default:
                                                String str8 = LaunchActivity.C1;
                                                launchActivity2.J0 = hashMap2;
                                                if (launchActivity2.I0 != null) {
                                                    launchActivity2.J0(mb6VarArr3[1], mb6VarArr3[0], str6);
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
                                final mb6[] mb6VarArr3 = mb6VarArr;
                                final String str7 = str;
                                hl.c3(new Runnable() { // from class: vz5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b62 = b6;
                                        String str62 = str7;
                                        mb6[] mb6VarArr32 = mb6VarArr3;
                                        HashMap hashMap22 = hashMap2;
                                        LaunchActivity launchActivity22 = launchActivity2;
                                        switch (b62) {
                                            case 0:
                                                String str72 = LaunchActivity.C1;
                                                launchActivity22.I0 = hashMap22;
                                                if (launchActivity22.J0 != null) {
                                                    launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
                                                    break;
                                                }
                                                break;
                                            default:
                                                String str8 = LaunchActivity.C1;
                                                launchActivity22.J0 = hashMap22;
                                                if (launchActivity22.I0 != null) {
                                                    launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
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
                tL_langpack_getStrings2.lang_code = mb6VarArr[b4].c();
                tL_langpack_getStrings2.keys.add("English");
                tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) { // from class: d16
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
                                final mb6[] mb6VarArr2 = mb6VarArr;
                                final String str5 = str;
                                hl.c3(new Runnable() { // from class: vz5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b62 = b5;
                                        String str62 = str5;
                                        mb6[] mb6VarArr32 = mb6VarArr2;
                                        HashMap hashMap22 = hashMap;
                                        LaunchActivity launchActivity22 = launchActivity;
                                        switch (b62) {
                                            case 0:
                                                String str72 = LaunchActivity.C1;
                                                launchActivity22.I0 = hashMap22;
                                                if (launchActivity22.J0 != null) {
                                                    launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
                                                    break;
                                                }
                                                break;
                                            default:
                                                String str8 = LaunchActivity.C1;
                                                launchActivity22.J0 = hashMap22;
                                                if (launchActivity22.I0 != null) {
                                                    launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
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
                                final mb6[] mb6VarArr3 = mb6VarArr;
                                final String str7 = str;
                                hl.c3(new Runnable() { // from class: vz5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b62 = b6;
                                        String str62 = str7;
                                        mb6[] mb6VarArr32 = mb6VarArr3;
                                        HashMap hashMap22 = hashMap2;
                                        LaunchActivity launchActivity22 = launchActivity2;
                                        switch (b62) {
                                            case 0:
                                                String str72 = LaunchActivity.C1;
                                                launchActivity22.I0 = hashMap22;
                                                if (launchActivity22.J0 != null) {
                                                    launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
                                                    break;
                                                }
                                                break;
                                            default:
                                                String str8 = LaunchActivity.C1;
                                                launchActivity22.J0 = hashMap22;
                                                if (launchActivity22.I0 != null) {
                                                    launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
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
                cc4.g(e, true);
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
            ((org.telegram.ui.ActionBar.e) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (hl.O1()) {
            ArrayList arrayList2 = this.f0;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ((org.telegram.ui.ActionBar.e) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.g0;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                ((org.telegram.ui.ActionBar.e) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[Catch: Exception -> 0x0162, TryCatch #0 {Exception -> 0x0162, blocks: (B:3:0x0008, B:6:0x0024, B:9:0x005d, B:12:0x0067, B:15:0x006f, B:18:0x0081, B:21:0x008a, B:25:0x00be, B:28:0x0088, B:31:0x00e0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(mb6 mb6Var, mb6 mb6Var2, String str) {
        boolean z;
        boolean z2;
        int i;
        mb6 mb6Var3;
        mb6 mb6Var4;
        int i2;
        boolean z3 = true;
        try {
            this.H0 = false;
            mb6 mb6Var5 = mb6Var;
            if (!mb6Var5.j) {
                try {
                    if (!ob6.D0().B.h()) {
                        z2 = false;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = T(2131752073, "ChooseYourLanguage", this.I0);
                        idVar.T = T(2131752073, "ChooseYourLanguage", this.J0);
                        LinearLayout linearLayout = new LinearLayout(this);
                        linearLayout.setOrientation(1);
                        cz5[] cz5VarArr = new cz5[2];
                        String T = T(2131751092, "English", this.I0);
                        if (z2) {
                            mb6Var3 = mb6Var2;
                            mb6Var4 = mb6Var5;
                        } else {
                            mb6Var4 = mb6Var2;
                            mb6Var3 = mb6Var5;
                        }
                        mb6[] mb6VarArr = {mb6Var3, mb6Var4};
                        if (!z2) {
                            mb6Var5 = mb6Var2;
                        }
                        mb6[] mb6VarArr2 = {mb6Var5};
                        i2 = 0;
                        for (i = 2; i2 < i; i = 2) {
                            cz5 cz5Var = new cz5(this);
                            cz5VarArr[i2] = cz5Var;
                            mb6 mb6Var6 = mb6VarArr[i2];
                            String str2 = mb6Var6 == mb6Var2 ? T : null;
                            cz5Var.b.setText(str2 != null ? str2 : mb6Var6.a);
                            cz5Var.c.setText(mb6Var6.b);
                            cz5Var.e = mb6Var6;
                            cz5Var.d = z3;
                            cz5VarArr[i2].setTag(Integer.valueOf(i2));
                            cz5 cz5Var2 = cz5VarArr[i2];
                            int i3 = aob.I5;
                            yob.R(cz5Var2, aob.f0(aob.w0(null, i3, false), 2, -1), null, yob.M(i3), null);
                            cz5VarArr[i2].a.a(i2 == 0, false);
                            linearLayout.addView(cz5VarArr[i2], tre.o(-1, 50));
                            cz5VarArr[i2].setOnClickListener(new uv5(mb6VarArr2, cz5VarArr, (byte) 2));
                            i2++;
                            z3 = true;
                        }
                        cz5 cz5Var3 = new cz5(this);
                        String T2 = T(2131752072, "ChooseYourLanguageOther", this.I0);
                        String T3 = T(2131752072, "ChooseYourLanguageOther", this.J0);
                        cz5Var3.b.setText(T2);
                        cz5Var3.c.setText(T3);
                        cz5Var3.a.a(false, false);
                        cz5Var3.e = null;
                        cz5Var3.d = false;
                        int i4 = aob.I5;
                        hf0 f0 = aob.f0(aob.w0(null, i4, false), 2, -1);
                        uob M = yob.M(i4);
                        cz5Var3.setBackground(f0);
                        yob.j(cz5Var3, f0, null, M, null);
                        cz5Var3.setOnClickListener(new sa5(this, (byte) 16));
                        linearLayout.addView(cz5Var3, tre.o(-1, 50));
                        alertDialog$Builder.n(linearLayout);
                        alertDialog$Builder.g(ob6.M0(2131747558, null), new u34(this, mb6VarArr2, (byte) 13));
                        this.G0 = F0(alertDialog$Builder);
                        uc7.e1().edit().putString("language_showed2", str).commit();
                    }
                } catch (Exception e) {
                    e = e;
                    z = true;
                    cc4.g(e, z);
                    return;
                }
            }
            z2 = true;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            id idVar2 = alertDialog$Builder2.a;
            idVar2.S = T(2131752073, "ChooseYourLanguage", this.I0);
            idVar2.T = T(2131752073, "ChooseYourLanguage", this.J0);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            cz5[] cz5VarArr2 = new cz5[2];
            String T4 = T(2131751092, "English", this.I0);
            if (z2) {
            }
            mb6[] mb6VarArr3 = {mb6Var3, mb6Var4};
            if (!z2) {
            }
            mb6[] mb6VarArr22 = {mb6Var5};
            i2 = 0;
            while (i2 < i) {
            }
            cz5 cz5Var32 = new cz5(this);
            String T22 = T(2131752072, "ChooseYourLanguageOther", this.I0);
            String T32 = T(2131752072, "ChooseYourLanguageOther", this.J0);
            cz5Var32.b.setText(T22);
            cz5Var32.c.setText(T32);
            cz5Var32.a.a(false, false);
            cz5Var32.e = null;
            cz5Var32.d = false;
            int i42 = aob.I5;
            hf0 f02 = aob.f0(aob.w0(null, i42, false), 2, -1);
            uob M2 = yob.M(i42);
            cz5Var32.setBackground(f02);
            yob.j(cz5Var32, f02, null, M2, null);
            cz5Var32.setOnClickListener(new sa5(this, (byte) 16));
            linearLayout2.addView(cz5Var32, tre.o(-1, 50));
            alertDialog$Builder2.n(linearLayout2);
            alertDialog$Builder2.g(ob6.M0(2131747558, null), new u34(this, mb6VarArr22, (byte) 13));
            this.G0 = F0(alertDialog$Builder2);
            uc7.e1().edit().putString("language_showed2", str).commit();
        } catch (Exception e2) {
            e = e2;
            z = true;
        }
    }

    public final void K0(boolean z, boolean z2, int i, int i2, zg3 zg3Var) {
        if (this.y0 == null || isFinishing()) {
            return;
        }
        if (this.z0 == null) {
            this.z0 = new hz7(this);
        }
        xea.w = true;
        int i3 = 0;
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer.q0().A(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        rbb.v();
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && r47Var.g4()) {
            MediaController.z().m(true, true, false, false);
        }
        this.z0.show();
        gz7 gz7Var = this.z0.b;
        ArrayList arrayList = this.A0;
        arrayList.isEmpty();
        gz7Var.m(z2, i, i2, new tg5(this, zg3Var, (byte) 22));
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            fz7 fz7Var = (fz7) arrayList.get(i4);
            if (z) {
                arrayList.size();
            }
            fz7Var.m(z2, i, i2, null);
        }
        xea.B = true;
        pd pdVar = new pd(this, (byte) 4);
        this.z0.b.setDelegate(pdVar);
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((fz7) obj).setDelegate(pdVar);
        }
        try {
            ip7.n(yac.t0).Y();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Type inference failed for: r13v3, types: [ob6] */
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
        TLRPC.User X1;
        uc7 s1 = uc7.s1(this.P);
        lv2 r = lv2.r(this.P);
        ArrayList arrayList = new ArrayList(r.f0);
        ArrayList arrayList2 = new ArrayList();
        String str4 = null;
        boolean z = false;
        if (str2 != null) {
            String h = f78.h(str2, false);
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) r.l0.get(h);
            if (tL_contact == null) {
                tL_contact = (TLRPC.TL_contact) r.m0.get(h.substring(Math.max(0, h.length() - 7)));
            }
            if (tL_contact != null) {
                TLRPC.User X12 = s1.X1(Long.valueOf(tL_contact.user_id));
                if (X12 == null || X12.self) {
                    str3 = null;
                    if (arrayList2.isEmpty() && str3 != null) {
                        lowerCase = str3.trim().toLowerCase();
                        if (!TextUtils.isEmpty(lowerCase)) {
                            ?? r7 = 1;
                            String S0 = ob6.D0().S0(lowerCase, true, false);
                            if (lowerCase.equals(S0) || S0.length() == 0) {
                                S0 = null;
                            }
                            String[] strArr = {lowerCase, S0};
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList.get(i);
                                if (tL_contact2 != null && (X1 = s1.X1(Long.valueOf(tL_contact2.user_id))) != null && !X1.self) {
                                    char c = 3;
                                    String[] strArr2 = new String[3];
                                    strArr2[z ? 1 : 0] = lv2.m(z ? 1 : 0, X1.first_name, X1.last_name).toLowerCase();
                                    String S02 = ob6.D0().S0(strArr2[z ? 1 : 0], r7, z);
                                    strArr2[r7] = S02;
                                    if (strArr2[z ? 1 : 0].equals(S02)) {
                                        strArr2[r7] = str4;
                                    }
                                    if (lbc.B(X1)) {
                                        strArr2[2] = ob6.M0(2131745993, str4).toLowerCase();
                                    } else if (X1.self) {
                                        strArr2[2] = ob6.M0(2131745629, str4).toLowerCase();
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
                                                String p = lbc.p(X1);
                                                if (i3 == 0 && p != null && p.startsWith(str5)) {
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
            final okb okbVar = new okb(this);
            yob.h(aob.d6, null, okbVar);
            int i2 = hl.m;
            if (i2 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                okbVar.addView(view, new FrameLayout.LayoutParams(-1, i2));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            final byte b = 1;
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.logo_middle);
            linearLayout.addView(imageView, tre.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i3 = aob.G6;
            qd4.w(textView, i3, null, 1, 17.0f);
            textView.setText(ob6.M0(2131746511, null));
            linearLayout.addView(textView, tre.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            okbVar.a = textView2;
            yob.X(textView2, i3, null);
            yob.G(textView2, aob.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new dl(objArr2 == true ? 1 : 0));
            textView2.setGravity(51);
            textView2.setLineSpacing(hl.L(2.0f), 1.0f);
            linearLayout.addView(textView2, tre.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f = 4.0f;
            scrollView.setPadding(hl.L(24.0f), i2, hl.L(24.0f), hl.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            okbVar.addView(scrollView, tre.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(ob6.M0(2131751569, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(hl.o());
            int i4 = aob.y6;
            yob.X(textView3, i4, null);
            textView3.setTextSize(1, 14.0f);
            hf0 H0 = aob.H0(hl.L(3.0f), aob.w0(null, i4, false));
            uob g = yob.g(i4, 25);
            textView3.setBackground(H0);
            yob.j(textView3, H0, null, g, null);
            textView3.setPadding(hl.L(20.0f), hl.L(10.0f), hl.L(20.0f), hl.L(10.0f));
            okbVar.addView(textView3, tre.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            final Object[] objArr3 = objArr == true ? 1 : 0;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: lkb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b2 = objArr3;
                    byte b3 = 1;
                    okb okbVar2 = okbVar;
                    switch (b2) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = ob6.M0(2131743851, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            alertDialog$Builder.j(ob6.M0(2131751567, null), new mkb(okbVar2, b3));
                            alertDialog$Builder.g(ob6.M0(2131753749, null), null);
                            idVar.U = ob6.M0(2131743630, null);
                            alertDialog$Builder.o();
                            break;
                        default:
                            if (okbVar2.c.min_age_confirm == 0) {
                                okbVar2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = ob6.M0(2131743633, null);
                                id idVar2 = alertDialog$Builder2.a;
                                idVar2.S = M02;
                                alertDialog$Builder2.j(ob6.M0(2131754299, null), new mkb(okbVar2, (byte) 0));
                                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                idVar2.U = ob6.a0("TosAgeText", null, 2131743634, ob6.G(okbVar2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.o();
                                break;
                            }
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(ob6.M0(2131754712, null));
            textView4.setGravity(17);
            textView4.setTypeface(hl.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = hl.L(4.0f);
            textView4.setBackgroundDrawable(aob.i0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
            okbVar.addView(textView4, tre.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() { // from class: lkb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b2 = b;
                    byte b3 = 1;
                    okb okbVar2 = okbVar;
                    switch (b2) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = ob6.M0(2131743851, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            alertDialog$Builder.j(ob6.M0(2131751567, null), new mkb(okbVar2, b3));
                            alertDialog$Builder.g(ob6.M0(2131753749, null), null);
                            idVar.U = ob6.M0(2131743630, null);
                            alertDialog$Builder.o();
                            break;
                        default:
                            if (okbVar2.c.min_age_confirm == 0) {
                                okbVar2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = ob6.M0(2131743633, null);
                                id idVar2 = alertDialog$Builder2.a;
                                idVar2.S = M02;
                                alertDialog$Builder2.j(ob6.M0(2131754299, null), new mkb(okbVar2, (byte) 0));
                                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                idVar2.U = ob6.a0("TosAgeText", null, 2131743634, ob6.G(okbVar2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.o();
                                break;
                            }
                    }
                }
            });
            View view2 = new View(this);
            yob.h(aob.d7, null, view2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = hl.L(75.0f);
            layoutParams.gravity = 80;
            okbVar.addView(view2, layoutParams);
            this.B0 = okbVar;
            okbVar.setAlpha(0.0f);
            this.y0.addView(this.B0, tre.c(-1.0f, -1));
            this.B0.setDelegate(new r16(this));
        } else {
            f = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = yac.h(i).a0;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            yac.h(i).a0 = tL_help_termsOfService;
            yac.h(i).u(false);
        }
        okb okbVar2 = this.B0;
        if (okbVar2.getVisibility() != 0) {
            okbVar2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        r47.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = hl.L(10.0f);
        int L3 = hl.L(f);
        int length = spannableStringBuilder.length() - 2;
        for (int i5 = 0; i5 < length; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == '-') {
                    int i7 = i5 + 2;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        h11 h11Var = new h11(L2, L3);
                        spannableStringBuilder.replace(i6, i5 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(h11Var, i6, i7, 33);
                    }
                }
            }
        }
        okbVar2.a.setText(spannableStringBuilder);
        okbVar2.c = tL_help_termsOfService;
        okbVar2.d = i;
        this.B0.animate().alpha(1.0f).setDuration(150L).setInterpolator(hl.F).setListener(null).start();
    }

    public final void M0(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || this.e0.isEmpty() || sharedInstance.groupCall == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.ui.ActionBar.e eVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
        if (eVar instanceof fj6) {
            eVar = ((fj6) eVar).b0();
        }
        UndoView undoView = null;
        if (eVar instanceof zu1) {
            zu1 zu1Var = (zu1) eVar;
            if (chat != null && zu1Var.a() == (-chat.id)) {
                chat = null;
            }
            zu1Var.i6();
            undoView = zu1Var.N3;
        } else if (eVar instanceof uj3) {
            undoView = ((uj3) eVar).w3();
        } else if (eVar instanceof ProfileActivity) {
            undoView = ((ProfileActivity) eVar).M;
        }
        if (undoView != null) {
            undoView.m(0L, chat, i);
        }
        if (i != 38 || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().playAllowTalkSound();
    }

    public final wk5 N() {
        ActionBarLayout actionBarLayout = this.p0;
        ArrayList arrayList = this.Q;
        return !arrayList.isEmpty() ? (wk5) c00.g(1, arrayList) : actionBarLayout;
    }

    public final void N0(int i) {
        O0(i, new lq5((byte) 7));
    }

    public final yx0 O() {
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

    public final void O0(int i, nu4 nu4Var) {
        if (i == yac.t0 || !yac.q(i)) {
            return;
        }
        this.l1 = true;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        yac.t0 = i;
        yac.h(0).u(false);
        B();
        jn7.e().k(jn7.f4, Integer.valueOf(i));
        if (hl.O1()) {
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
        this.p0.b(-3, (fj6) nu4Var.h(null));
        this.p0.W(true, true);
        if (hl.O1()) {
            this.q0.W(true, true);
            this.r0.W(true, true);
        }
        if (!org.telegram.messenger.a.x) {
            ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        }
        if (yac.h(i).a0 != null) {
            L0(i, yac.h(i).a0);
        }
        P0();
        this.l1 = false;
    }

    public final org.telegram.ui.ActionBar.e P() {
        return qh6.x1(this.P, false).getInt("currentViewNum", 0) != 0 ? new qh6() : new yr5();
    }

    public final void P0() {
        int i;
        String str;
        if (this.p0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.P).getConnectionState();
            this.d0 = connectionState;
            if (connectionState == 2) {
                str = "WaitingForNetwork";
                i = 2131742864;
            } else if (connectionState == 5) {
                str = "Updating";
                i = 2131743465;
            } else if (connectionState == 4) {
                str = "ConnectingToProxyWithDots";
                i = 2131751770;
            } else if (connectionState == 1) {
                str = "Connecting";
                i = 2131751774;
            } else {
                i = 0;
                str = null;
            }
            sz5 sz5Var = (connectionState == 1 || connectionState == 4) ? new sz5(this, (byte) 7) : null;
            ActionBarLayout actionBarLayout = this.p0;
            actionBarLayout.N0 = str;
            actionBarLayout.O0 = i;
            actionBarLayout.P0 = sz5Var;
            for (int i2 = 0; i2 < actionBarLayout.V0.size(); i2++) {
                ((org.telegram.ui.ActionBar.e) actionBarLayout.V0.get(i2)).setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, sz5Var);
            }
        }
    }

    public final int R() {
        return this.e0.size();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean V(android.content.Intent r128, boolean r129, boolean r130, boolean r131, l01 r132, boolean r133, boolean r134) {
        /*
            Method dump skipped, instructions count: 16224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.V(android.content.Intent, boolean, boolean, boolean, l01, boolean, boolean):boolean");
    }

    public final void W() {
        ActionMode actionMode = this.l0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void X(int i, TLRPC.User user, String str, l01 l01Var) {
        uc7 s1 = uc7.s1(i);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = s1.q1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new ic((byte) 0), new g45(this, l01Var, s1, i, user));
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
        Boolean bool = hl.L;
        if (bool != null) {
            hl.L = null;
            if (bool.booleanValue() != hl.O1()) {
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
                        org.telegram.ui.ActionBar.e eVar = (org.telegram.ui.ActionBar.e) obj;
                        if (!(eVar instanceof fj6)) {
                            if (eVar instanceof uj3) {
                                uj3 uj3Var = (uj3) eVar;
                                if (uj3Var.J3() && !uj3Var.F3()) {
                                    j3 = 0;
                                    if (uj3Var.a3 != 0) {
                                        if (!(eVar instanceof zu1)) {
                                            zu1 zu1Var = (zu1) eVar;
                                            if (!zu1Var.X7()) {
                                                arrayList2.add(eVar);
                                                if (j4 == j3) {
                                                    j4 = zu1Var.a();
                                                    j = zu1Var.c();
                                                }
                                            }
                                        }
                                        arrayList.add(eVar);
                                    }
                                }
                            }
                            j3 = 0;
                            if (!(eVar instanceof zu1)) {
                            }
                            arrayList.add(eVar);
                        }
                        arrayList3.add(eVar);
                    }
                    j2 = j4;
                }
                E0();
                this.p0.W(true, true);
                if (hl.O1()) {
                    this.r0.W(true, true);
                    this.q0.W(true, true);
                    int size2 = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        Object obj3 = (org.telegram.ui.ActionBar.e) obj2;
                        if (obj3 instanceof fj6) {
                            obj3 = ((fj6) obj3).M;
                        }
                        if (obj3 instanceof uj3) {
                            uj3 uj3Var2 = (uj3) obj3;
                            if (uj3Var2.J3()) {
                                if7 if7Var = uj3Var2.r2;
                                if7Var.a = j2;
                                if7Var.b = j;
                                tj3[] tj3VarArr = uj3Var2.f0;
                                if (tj3VarArr != null) {
                                    for (tj3 tj3Var : tj3VarArr) {
                                        if (tj3Var.a() && hl.O1()) {
                                            tj3Var.d.s = if7Var.a;
                                        }
                                    }
                                    int i3 = uc7.r5;
                                    uj3Var2.G5(512, true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // sk5
    public final void a(float f) {
        if (o.F() && o.u().W) {
            o u = o.u();
            u.Q();
            o.e0(u);
            if (u.g0 != null) {
                u.v0[0].b.i1();
                u.v0[1].b.i1();
                u.g0.invalidate();
                u.r0.invalidate();
                if (f == 1.0f) {
                    u.v0[0].c.f();
                    u.v0[1].c.f();
                }
            }
        }
        if (PhotoViewer.C0()) {
            PhotoViewer.q0().G2();
        }
    }

    @Override // sk5
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
        if (hl.O1() && actionBarLayout == this.q0) {
            this.r0.W(z, z);
            this.p0.W(z, z);
        }
    }

    public final void b0() {
        wk5[] wk5VarArr = {this.p0, this.q0, this.r0};
        for (int i = 0; i < 3; i++) {
            wk5 wk5Var = wk5VarArr[i];
            if (wk5Var instanceof ActionBarLayout) {
                ((ActionBarLayout) wk5Var).C();
            }
        }
    }

    public final boolean d0(boolean z) {
        boolean z2;
        ll4 ll4Var = nle.a;
        if (ll4Var != null) {
            if (ll4Var.s) {
                if (z) {
                    ll4Var.c(false);
                }
            }
            return false;
        }
        hz7 hz7Var = this.z0;
        if (hz7Var == null || hz7Var.b.getVisibility() != 0) {
            gy0 gy0Var = this.x0;
            if (gy0Var == null || !(z2 = gy0Var.V)) {
                id idVar = ow9.I;
                if (idVar != null) {
                    if (z) {
                        idVar.dismiss();
                        ow9.I = null;
                        return false;
                    }
                } else if (rw2.g0 == null || !rw2.e().E) {
                    if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                        if (z) {
                            SecretMediaViewer.d().c(true, false);
                            return false;
                        }
                    } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
                        if (z) {
                            PhotoViewer.q0().A(true, false);
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
                    rw2.e().c();
                    return false;
                }
            } else if (z && z2) {
                gy0Var.a(false);
                return false;
            }
        } else if (z) {
            finish();
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x04ca A[Catch: all -> 0x0605, TryCatch #4 {all -> 0x0605, blocks: (B:203:0x0463, B:205:0x047a, B:206:0x0481, B:208:0x0493, B:209:0x0499, B:211:0x04a4, B:213:0x04aa, B:214:0x04b4, B:216:0x04ba, B:220:0x04ca, B:225:0x04da, B:226:0x04d8, B:227:0x04dd, B:229:0x04e1, B:231:0x04e7, B:232:0x04f2, B:234:0x0502, B:235:0x0508), top: B:202:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04d8 A[Catch: all -> 0x0605, TryCatch #4 {all -> 0x0605, blocks: (B:203:0x0463, B:205:0x047a, B:206:0x0481, B:208:0x0493, B:209:0x0499, B:211:0x04a4, B:213:0x04aa, B:214:0x04b4, B:216:0x04ba, B:220:0x04ca, B:225:0x04da, B:226:0x04d8, B:227:0x04dd, B:229:0x04e1, B:231:0x04e7, B:232:0x04f2, B:234:0x0502, B:235:0x0508), top: B:202:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0502 A[Catch: all -> 0x0605, TryCatch #4 {all -> 0x0605, blocks: (B:203:0x0463, B:205:0x047a, B:206:0x0481, B:208:0x0493, B:209:0x0499, B:211:0x04a4, B:213:0x04aa, B:214:0x04b4, B:216:0x04ba, B:220:0x04ca, B:225:0x04da, B:226:0x04d8, B:227:0x04dd, B:229:0x04e1, B:231:0x04e7, B:232:0x04f2, B:234:0x0502, B:235:0x0508), top: B:202:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0521 A[Catch: all -> 0x0602, TryCatch #2 {all -> 0x0602, blocks: (B:238:0x050c, B:240:0x0521, B:242:0x0525, B:243:0x052b, B:245:0x0533), top: B:237:0x050c }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05c7 A[Catch: all -> 0x0600, TryCatch #0 {all -> 0x0600, blocks: (B:248:0x055b, B:251:0x05a5, B:253:0x05c7, B:254:0x05e3, B:256:0x05eb, B:257:0x05f9), top: B:247:0x055b }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05eb A[Catch: all -> 0x0600, TryCatch #0 {all -> 0x0600, blocks: (B:248:0x055b, B:251:0x05a5, B:253:0x05c7, B:254:0x05e3, B:256:0x05eb, B:257:0x05f9), top: B:247:0x055b }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0507  */
    /* JADX WARN: Type inference failed for: r15v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    @Override // fn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        String[] strArr;
        char c;
        org.telegram.ui.ActionBar.e eVar;
        er9 er9Var;
        j95 j95Var;
        char c2;
        char c3;
        ?? r15;
        ActionBarLayout actionBarLayout;
        Runnable runnable;
        boolean z;
        boolean z2;
        Bitmap bitmap;
        boolean z3;
        View view;
        int i4 = 0;
        if (i == jn7.I2) {
            while (true) {
                if (i4 >= 4) {
                    i4 = -1;
                    break;
                } else if (yac.h(i4).o()) {
                    break;
                } else {
                    i4++;
                }
            }
            okb okbVar = this.B0;
            if (okbVar != null) {
                okbVar.setVisibility(8);
            }
            if (i4 != -1) {
                N0(i4);
                return;
            }
            ee9.Y(true);
            J();
            this.p0.Y();
            if (hl.O1()) {
                this.q0.Y();
                this.r0.Y();
            }
            yr5 yr5Var = new yr5();
            yr5Var.O = true;
            t0(yr5Var);
            return;
        }
        if (i == jn7.p3) {
            Long l = (Long) objArr[0];
            l.getClass();
            w0(l, null, null, objArr.length > 1 ? (wb2) objArr[1] : null);
            return;
        }
        if (i == jn7.n4) {
            if (objArr[0] != this) {
                e0();
                finish();
                return;
            }
            return;
        }
        if (i == jn7.T1) {
            int connectionState = ConnectionsManager.getInstance(i2).getConnectionState();
            if (this.d0 != connectionState) {
                if (f11.a) {
                    cc4.b("switch to state " + connectionState);
                }
                this.d0 = connectionState;
                P0();
                return;
            }
            return;
        }
        if (i == jn7.j0 || i == jn7.Z4) {
            return;
        }
        byte b = 10;
        byte b2 = 3;
        byte b3 = 2;
        if (i == jn7.M0) {
            Integer num = (Integer) objArr[0];
            if (num.intValue() != 6) {
                if (num.intValue() != 3 || this.E0 == null) {
                    if (num.intValue() == 4) {
                        L0(i2, (TLRPC.TL_help_termsOfService) objArr[1]);
                        return;
                    }
                    org.telegram.ui.ActionBar.e eVar2 = !this.e0.isEmpty() ? (org.telegram.ui.ActionBar.e) c00.g(1, this.e0) : null;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.a.S = ob6.M0(R.string.AppName, null);
                    if (eVar2 != null) {
                        HashMap hashMap = new HashMap();
                        int i5 = aob.L5;
                        hashMap.put("info1", Integer.valueOf(eVar2.getThemedColor(i5)));
                        hashMap.put("info2", Integer.valueOf(eVar2.getThemedColor(i5)));
                        alertDialog$Builder.l(R.raw.not_available, 52, eVar2.getThemedColor(i5), hashMap);
                        alertDialog$Builder.m(i5, eVar2.getResourceProvider());
                        alertDialog$Builder.a.X = true;
                    }
                    if (num.intValue() != 2 && num.intValue() != 3) {
                        alertDialog$Builder.g(ob6.M0(2131748085, null), new wg(this, i2, b));
                    }
                    if (num.intValue() == 5) {
                        alertDialog$Builder.a.U = ob6.M0(2131747856, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                    } else if (num.intValue() == 0) {
                        alertDialog$Builder.a.U = ob6.M0(2131747858, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                    } else if (num.intValue() == 1) {
                        alertDialog$Builder.a.U = ob6.M0(2131747857, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                    } else if (num.intValue() == 2) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf((String) objArr[1]);
                        String str = (String) objArr[2];
                        if (str.startsWith("PREMIUM_GIFT_SELF_REQUIRED_")) {
                            String str2 = (String) objArr[1];
                            int indexOf = str2.indexOf(42);
                            int i6 = indexOf + 1;
                            int indexOf2 = str2.indexOf(42, i6);
                            if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
                                valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) str2.substring(i6, indexOf2));
                                valueOf.setSpan(new a31(this, (byte) 6), indexOf, indexOf2 - 1, 33);
                            }
                        }
                        alertDialog$Builder.a.U = valueOf;
                        if (str.startsWith("AUTH_KEY_DROP_")) {
                            alertDialog$Builder.j(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.g(ob6.M0(2131748497, null), new pd(this, b2));
                        } else if (str.startsWith("PREMIUM_")) {
                            alertDialog$Builder.k(ob6.L0(2131743884));
                            alertDialog$Builder.j(ob6.L0(2131747558), null);
                        } else {
                            alertDialog$Builder.j(ob6.L0(2131747558), null);
                        }
                    } else if (num.intValue() == 3) {
                        alertDialog$Builder.k(ob6.L0(2131746338));
                        alertDialog$Builder.f(ob6.L0(2131743433));
                        alertDialog$Builder.j(ob6.L0(2131747558), null);
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
        byte b4 = 7;
        if (i == jn7.R0) {
            HashMap hashMap2 = (HashMap) objArr[0];
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            alertDialog$Builder2.k(ob6.L0(R.string.AppName));
            alertDialog$Builder2.j(ob6.L0(2131747558), null);
            alertDialog$Builder2.g(ob6.L0(2131745149), new bf(this, hashMap2, i2, b4));
            alertDialog$Builder2.f(ob6.L0(2131745150));
            if (this.e0.isEmpty()) {
                return;
            }
            ((org.telegram.ui.ActionBar.e) c00.g(1, this.e0)).showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i == jn7.C4) {
            w81 w81Var = this.u0;
            if (w81Var != null) {
                w81Var.U(aob.r0());
                return;
            }
            return;
        }
        if (i == jn7.n0) {
            this.e1.i();
            return;
        }
        if (i == jn7.A4) {
            boolean z4 = this.e0.size() > 1 && (c00.g(1, this.e0) instanceof ProfileActivity);
            y0((!z4 || ((ProfileActivity) c00.g(1, this.e0)).s2()) ? z4 : false);
            return;
        }
        if (i == jn7.B4) {
            I0();
            return;
        }
        if (i == jn7.c1) {
            if (this.e0.isEmpty()) {
                return;
            }
            LaunchActivity launchActivity = H1;
            if (launchActivity == null || launchActivity.O() == null || H1.O().m((TLRPC.TL_webPage) objArr[0]) == null) {
                ((org.telegram.ui.ActionBar.e) c00.g(1, this.e0)).createArticleViewer(false).L(null, (TLRPC.TL_webPage) objArr[0], (String) objArr[1], null);
                return;
            }
            return;
        }
        if (i == jn7.P) {
            ActionBarLayout actionBarLayout2 = this.p0;
            if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                return;
            }
            ((Integer) objArr[0]).getClass();
            HashMap hashMap3 = (HashMap) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            org.telegram.ui.ActionBar.e eVar3 = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this);
            int i7 = aob.L5;
            alertDialog$Builder3.l(R.raw.permission_request_contacts, 72, aob.u0(i7), null);
            alertDialog$Builder3.m(i7, null);
            alertDialog$Builder3.k(ob6.L0(2131743473));
            alertDialog$Builder3.f(ob6.L0(2131743474));
            alertDialog$Builder3.j(ob6.L0(2131747558), new g16(i2, hashMap3, booleanValue, booleanValue2, (byte) 0));
            alertDialog$Builder3.g(ob6.L0(2131752570), new g16(i2, hashMap3, booleanValue, booleanValue2, (byte) 1));
            alertDialog$Builder3.a.x0 = new g16(i2, hashMap3, booleanValue, booleanValue2, (byte) 2);
            id idVar = alertDialog$Builder3.a;
            eVar3.showDialog(idVar);
            idVar.setCanceledOnTouchOutside(false);
            return;
        }
        if (i == jn7.q4) {
            yob.b0(null, true);
            b0();
            if (!((Boolean) objArr[0]).booleanValue()) {
                try {
                    setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, aob.u0(aob.s8) | (-16777216)));
                } catch (Exception unused) {
                }
            }
            H(objArr.length > 2 && ((Boolean) objArr[2]).booleanValue(), true, (!(objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : true) || this.W0 || this.p0.z()) ? false : true);
            return;
        }
        byte b5 = 9;
        if (i != jn7.w4) {
            if (i == jn7.N0) {
                try {
                    ((Status) objArr[0]).c(this, jn7.V1);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            if (i == jn7.Y1) {
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
                        Utilities.e.c(new ls5(this, this.S0, file, b5));
                        return;
                    } else {
                        r0(this.T0, this.R0, this.S0);
                        i0();
                        return;
                    }
                }
                if (str4.equals(str3)) {
                    this.P0 = null;
                    File file2 = new File(org.telegram.messenger.a.h(), qu6.p(new StringBuilder("remote"), this.T0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = this.T0;
                    znb k0 = aob.k0(file2, tL_theme.title, tL_theme);
                    if (k0 != null) {
                        if (k0.c != null && !new File(k0.c).exists()) {
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = k0.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(k0.F).sendRequest(getwallpaper, new mw3(this, k0, (byte) 14));
                            return;
                        }
                        TLRPC.TL_theme tL_theme2 = this.T0;
                        znb u = aob.u(file2, tL_theme2.title, tL_theme2, true);
                        if (u != null) {
                            t0(new pqb(u, true, 0, false, false));
                        }
                    }
                    i0();
                    return;
                }
                return;
            }
            if (i == jn7.Z1) {
                String str6 = (String) objArr[0];
                if (str6.equals(this.P0) || str6.equals(this.Q0)) {
                    i0();
                    return;
                }
                return;
            }
            if (i == jn7.N4) {
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
            if (i == jn7.u4) {
                H(objArr.length > 0 && ((Boolean) objArr[0]).booleanValue(), true, !this.W0);
                return;
            }
            if (i == jn7.v1) {
                if (objArr.length <= 1 || this.e0.isEmpty()) {
                    return;
                }
                jj.c0(this.P, (TLRPC.TL_error) objArr[2], (org.telegram.ui.ActionBar.e) c00.g(1, this.e0), (TLObject) objArr[1], new Object[0]);
                return;
            }
            if (i == jn7.n5) {
                jj.c0(this.P, (TLRPC.TL_error) objArr[1], (org.telegram.ui.ActionBar.e) c00.g(1, this.e0), (TLObject) objArr[0], new Object[0]);
                return;
            }
            if (i == jn7.x1) {
                ls6.d0(i2).h2(this, (TLObject) objArr[0], 2, !this.e0.isEmpty() ? (org.telegram.ui.ActionBar.e) c00.g(1, this.e0) : null, false, true);
                return;
            }
            if (i == jn7.S4) {
                if (this.e0.isEmpty()) {
                    return;
                }
                int intValue = ((Integer) objArr[0]).intValue();
                FrameLayout frameLayout = (!j95.t5 || (j95Var = j95.s5) == null) ? null : j95Var.c;
                if (j95.t5 && (er9Var = er9.Q0) != null) {
                    frameLayout = er9Var.f;
                }
                FrameLayout frameLayout2 = frameLayout;
                if (frameLayout2 == null) {
                    c = 1;
                    eVar = (org.telegram.ui.ActionBar.e) c00.g(1, this.e0);
                } else {
                    c = 1;
                    eVar = null;
                }
                switch (intValue) {
                    case 0:
                        TLRPC.Document document = (TLRPC.Document) objArr[c];
                        int intValue2 = ((Integer) objArr[2]).intValue();
                        l3b l3bVar = new l3b(this, null, 1, intValue2, document, null);
                        int i8 = (intValue2 == 6 || intValue2 == 7) ? 3500 : 1500;
                        if (eVar == null) {
                            v21.f(frameLayout2, l3bVar, i8).j();
                            break;
                        } else {
                            v21.g(eVar, l3bVar, i8).j();
                            break;
                        }
                        break;
                    case 1:
                        if (eVar == null) {
                            d31.a0(frameLayout2, null).t((String) objArr[1], null).j();
                            break;
                        } else {
                            d31.b0(eVar).t((String) objArr[1], null).j();
                            break;
                        }
                    case 2:
                        (frameLayout2 != null ? d31.a0(frameLayout2, null) : d31.b0(eVar)).t(ob6.L0(((Long) objArr[c]).longValue() > 0 ? 2131742459 : 2131752390), null).j();
                        break;
                    case 3:
                        (frameLayout2 != null ? d31.a0(frameLayout2, null) : d31.b0(eVar)).t(ob6.L0(((Long) objArr[c]).longValue() > 0 ? 2131742440 : 2131752251), null).j();
                        break;
                    case 4:
                        if (eVar == null) {
                            d31.a0(frameLayout2, null).u((String) objArr[1], (String) objArr[2], null).j();
                            break;
                        } else {
                            d31.b0(eVar).u((String) objArr[1], (String) objArr[2], eVar.getResourceProvider()).j();
                            break;
                        }
                    case 5:
                        ir irVar = new ir(this, (g26) objArr[c]);
                        if (eVar == null) {
                            v21.f(frameLayout2, irVar, 1500).j();
                            break;
                        } else {
                            v21.g(eVar, irVar, 1500).j();
                            break;
                        }
                    case 6:
                        if (eVar == null) {
                            d31.a0(frameLayout2, null).T((String) objArr[c]).j();
                            break;
                        } else {
                            d31.b0(eVar).T((String) objArr[c]).j();
                            break;
                        }
                }
                return;
            }
            if (i == jn7.w2) {
                I(false);
                return;
            }
            if (i == jn7.l5) {
                if (this.e0.isEmpty()) {
                    return;
                }
                org.telegram.ui.ActionBar.e eVar4 = (org.telegram.ui.ActionBar.e) c00.g(1, this.e0);
                if (eVar4.getParentActivity() != null) {
                    eVar4.showDialog(new l46(((Integer) objArr[0]).intValue(), this.P, null, eVar4.getParentActivity(), eVar4));
                    return;
                }
                return;
            }
            if (i == jn7.i5) {
                uc7.s1(this.P).X3.edit().remove("transcribeButtonPressed").apply();
                return;
            }
            if (i == jn7.q5) {
                int intValue3 = ((Integer) objArr[0]).intValue();
                if (intValue3 != 0 || Build.VERSION.SDK_INT < 31) {
                    i3 = 1;
                    strArr = null;
                } else {
                    i3 = 1;
                    strArr = new String[]{"android.permission.BLUETOOTH_CONNECT"};
                }
                if (strArr != null) {
                    int i9 = this.c1 + i3;
                    this.c1 = i9;
                    this.b1.put(i9, intValue3);
                    o9.v(this, strArr, this.c1);
                    return;
                }
                return;
            }
            if (i == jn7.u5) {
                long longValue = ((Long) objArr[0]).longValue();
                if (((Boolean) objArr[1]).booleanValue()) {
                    ro4.r(longValue, this.p0);
                    return;
                }
                return;
            }
            if (i == jn7.P5) {
                if (this.u1 == null) {
                    TLParseException tLParseException = (TLParseException) objArr[0];
                    StringBuilder sb = new StringBuilder();
                    sb.append(tLParseException.getMessage());
                    sb.append("\n\n");
                    sb.append(hl.C0());
                    StringBuilder sb2 = new StringBuilder();
                    StringWriter stringWriter = new StringWriter();
                    tLParseException.printStackTrace(new PrintWriter(stringWriter));
                    sb2.append(hl.C0());
                    sb2.append("\n\n");
                    sb2.append(stringWriter);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this, null);
                    alertDialog$Builder4.k("TL Error");
                    alertDialog$Builder4.f(sb);
                    alertDialog$Builder4.g(ob6.L0(2131751732), new e05((Object) sb2, (byte) 23));
                    alertDialog$Builder4.j(ob6.L0(2131747558), null);
                    alertDialog$Builder4.i(new l06(this, (byte) 1));
                    id o = alertDialog$Builder4.o();
                    this.u1 = o;
                    o.setCanceledOnTouchOutside(true);
                    return;
                }
                return;
            }
            if (i != jn7.Q5) {
                if (i == jn7.T5) {
                    aq0 aq0Var = (aq0) objArr[0];
                    org.telegram.ui.ActionBar.e Q = Q();
                    d31 b0 = Q instanceof zu1 ? d31.b0(Q) : d31.Y();
                    String r = wf3.r(this.P, aq0Var.a);
                    TLRPC.JoinChatBotResult joinChatBotResult = aq0Var.b;
                    hl.d3(new tg5(this, joinChatBotResult instanceof TLRPC.TL_joinChatBotResultApproved ? b0.H(R.raw.contact_check, hl.S2(ob6.Z(2131749128, r))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultDeclined ? b0.H(R.raw.e_hand_2, hl.S2(ob6.Z(2131749127, r))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultQueued ? b0.Q(R.raw.timer_toast, 24, hl.S2(ob6.Z(2131749126, r))) : null, (byte) 20), 400L);
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
                sb3.append(hl.C0());
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(this, null);
                alertDialog$Builder5.k("Memory Leak Found");
                alertDialog$Builder5.f(sb3);
                alertDialog$Builder5.j(ob6.L0(2131747558), null);
                alertDialog$Builder5.i(new l06(this, b3));
                id o2 = alertDialog$Builder5.o();
                this.v1 = o2;
                o2.setCanceledOnTouchOutside(true);
                return;
            }
            return;
        }
        if (objArr[2] == null || this.n0.getVisibility() == 0) {
            c2 = 3;
            boolean z5 = true;
            z = z5;
            if (objArr[2] == null) {
                c3 = 0;
                uj3.E4 = false;
                r15 = z5;
                znb znbVar = (znb) objArr[c3];
                boolean booleanValue3 = ((Boolean) objArr[r15]).booleanValue();
                int intValue5 = ((Integer) objArr[c2]).intValue();
                Runnable runnable2 = objArr.length <= 7 ? (Runnable) objArr[7] : null;
                actionBarLayout = this.p0;
                if (actionBarLayout == null) {
                    actionBarLayout.e(new vk5(znbVar, intValue5, booleanValue3, r15), runnable2);
                    if (hl.O1()) {
                        ActionBarLayout actionBarLayout3 = this.q0;
                        if (actionBarLayout3 != null) {
                            runnable = null;
                            actionBarLayout3.e(new vk5(znbVar, intValue5, booleanValue3, r15), null);
                        } else {
                            runnable = null;
                        }
                        ActionBarLayout actionBarLayout4 = this.r0;
                        if (actionBarLayout4 != null) {
                            actionBarLayout4.e(new vk5(znbVar, intValue5, booleanValue3, r15), runnable);
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
                int[] iArr = (int[]) objArr[2];
                boolean booleanValue4 = ((Boolean) objArr[4]).booleanValue();
                e29 e29Var = (e29) objArr[5];
                if (objArr.length > 8) {
                    ((Boolean) objArr[8]).getClass();
                }
                int measuredWidth = this.y0.getMeasuredWidth();
                int measuredHeight = this.y0.getMeasuredHeight();
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
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            bitmap = hl.A0(getWindow());
                            if (bitmap != null) {
                                z3 = true;
                                if (bitmap == null) {
                                    bitmap = hl.H3(this.y0);
                                }
                                if (bitmap != null && e29Var != null) {
                                    tqb.a(bitmap, !z3 ? null : this.y0, e29Var);
                                }
                                view = this.F0;
                                if (view != null && view.getBackground() != null) {
                                    this.F0.getBackground().setAlpha(jn7.d4);
                                }
                                this.v0.removeView(this.n0);
                                this.n0 = new tqb(this);
                                b29 animatedDrawable = e29Var == null ? e29Var.getAnimatedDrawable() : null;
                                c2 = 3;
                                this.v0.addView(this.n0, 1, tre.c(-1.0f, -1));
                                this.o0.setVisibility(8);
                                if (e29Var != null) {
                                    tqb tqbVar = this.n0;
                                    ColorFilter colorFilter = animatedDrawable != null ? animatedDrawable.getColorFilter() : null;
                                    tqbVar.n = e29Var;
                                    tqbVar.r = colorFilter;
                                }
                                this.n0.setImageBitmap(bitmap);
                                this.n0.setVisibility(0);
                                int i10 = measuredWidth - iArr[0];
                                int i11 = measuredHeight - iArr[1];
                                double sqrt = Math.sqrt((i11 * i11) + (i10 * i10));
                                int i12 = iArr[0];
                                int i13 = i12 * i12;
                                int i14 = measuredHeight - iArr[1];
                                z2 = true;
                                float max = (float) Math.max(sqrt, Math.sqrt((i14 * i14) + i13));
                                int i15 = measuredWidth - iArr[0];
                                int i16 = iArr[1];
                                double sqrt2 = Math.sqrt((i16 * i16) + (i15 * i15));
                                int i17 = iArr[0];
                                int i18 = iArr[1];
                                float max2 = Math.max(max, (float) Math.max(sqrt2, Math.sqrt((i18 * i18) + (i17 * i17))));
                                this.n0.b(iArr[0], iArr[1], booleanValue4);
                                float f = max2 / 0.6f;
                                tqb tqbVar2 = this.n0;
                                px1 px1Var = tqb.x;
                                float f2 = 0.0f;
                                if (!booleanValue4) {
                                    f2 = f;
                                    f = 0.0f;
                                }
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tqbVar2, px1Var, f2, f);
                                ofFloat.setDuration(450L);
                                ofFloat.setInterpolator(dt3.e);
                                ofFloat.addListener(new j8(this, e29Var, animatedDrawable, b5));
                                if (this.F0 != null) {
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new h16(this, (byte) 0));
                                    ofFloat2.setDuration(ofFloat.getDuration());
                                    ofFloat2.start();
                                }
                                hl.d3(new sz5(this, (byte) 6), !booleanValue4 ? (measuredHeight - iArr[1]) / hl.L(2.25f) : 50L);
                                ofFloat.start();
                                z = z2;
                            }
                        } else {
                            bitmap = null;
                        }
                        float max3 = (float) Math.max(sqrt, Math.sqrt((i14 * i14) + i13));
                        int i152 = measuredWidth - iArr[0];
                        int i162 = iArr[1];
                        double sqrt22 = Math.sqrt((i162 * i162) + (i152 * i152));
                        int i172 = iArr[0];
                        int i182 = iArr[1];
                        float max22 = Math.max(max3, (float) Math.max(sqrt22, Math.sqrt((i182 * i182) + (i172 * i172))));
                        this.n0.b(iArr[0], iArr[1], booleanValue4);
                        float f3 = max22 / 0.6f;
                        tqb tqbVar22 = this.n0;
                        px1 px1Var2 = tqb.x;
                        float f22 = 0.0f;
                        if (!booleanValue4) {
                        }
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tqbVar22, px1Var2, f22, f3);
                        ofFloat3.setDuration(450L);
                        ofFloat3.setInterpolator(dt3.e);
                        ofFloat3.addListener(new j8(this, e29Var, animatedDrawable, b5));
                        if (this.F0 != null) {
                        }
                        hl.d3(new sz5(this, (byte) 6), !booleanValue4 ? (measuredHeight - iArr[1]) / hl.L(2.25f) : 50L);
                        ofFloat3.start();
                        z = z2;
                    } catch (Throwable th) {
                        th = th;
                        cc4.f(th);
                        try {
                            this.n0.setImageDrawable(null);
                            this.v0.removeView(this.n0);
                            uj3.E4 = false;
                            z = z2;
                        } catch (Exception e) {
                            cc4.f(e);
                            z = z2;
                        }
                        c3 = 0;
                        r15 = z;
                        znb znbVar2 = (znb) objArr[c3];
                        boolean booleanValue32 = ((Boolean) objArr[r15]).booleanValue();
                        int intValue52 = ((Integer) objArr[c2]).intValue();
                        if (objArr.length <= 7) {
                        }
                        actionBarLayout = this.p0;
                        if (actionBarLayout == null) {
                        }
                    }
                    this.v0.addView(this.n0, 1, tre.c(-1.0f, -1));
                    this.o0.setVisibility(8);
                    if (e29Var != null) {
                    }
                    this.n0.setImageBitmap(bitmap);
                    this.n0.setVisibility(0);
                    int i102 = measuredWidth - iArr[0];
                    int i112 = measuredHeight - iArr[1];
                    double sqrt3 = Math.sqrt((i112 * i112) + (i102 * i102));
                    int i122 = iArr[0];
                    int i132 = i122 * i122;
                    int i142 = measuredHeight - iArr[1];
                    z2 = true;
                } catch (Throwable th2) {
                    th = th2;
                    z2 = true;
                    cc4.f(th);
                    this.n0.setImageDrawable(null);
                    this.v0.removeView(this.n0);
                    uj3.E4 = false;
                    z = z2;
                    c3 = 0;
                    r15 = z;
                    znb znbVar22 = (znb) objArr[c3];
                    boolean booleanValue322 = ((Boolean) objArr[r15]).booleanValue();
                    int intValue522 = ((Integer) objArr[c2]).intValue();
                    if (objArr.length <= 7) {
                    }
                    actionBarLayout = this.p0;
                    if (actionBarLayout == null) {
                    }
                }
                z3 = false;
                if (bitmap == null) {
                }
                if (bitmap != null) {
                    tqb.a(bitmap, !z3 ? null : this.y0, e29Var);
                }
                view = this.F0;
                if (view != null) {
                    this.F0.getBackground().setAlpha(jn7.d4);
                }
                this.v0.removeView(this.n0);
                this.n0 = new tqb(this);
                if (e29Var == null) {
                }
                c2 = 3;
            } catch (Throwable th3) {
                th = th3;
                c2 = 3;
            }
        }
        c3 = 0;
        r15 = z;
        znb znbVar222 = (znb) objArr[c3];
        boolean booleanValue3222 = ((Boolean) objArr[r15]).booleanValue();
        int intValue5222 = ((Integer) objArr[c2]).intValue();
        if (objArr.length <= 7) {
        }
        actionBarLayout = this.p0;
        if (actionBarLayout == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (((zu1) r0).ca() != false) goto L62;
     */
    @Override // oq2, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.e Q;
        keyEvent.getKeyCode();
        if ((keyEvent.getKeyCode() != 24 && keyEvent.getKeyCode() != 25) || (Q = Q()) == null || Q.getLastStoryViewer() == null) {
            if (keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
                if (VoIPService.getSharedInstance() == null) {
                    ArrayList arrayList = this.e0;
                    if (!arrayList.isEmpty() && ((!PhotoViewer.C0() || !PhotoViewer.q0().V0()) && keyEvent.getRepeatCount() == 0)) {
                        org.telegram.ui.ActionBar.e eVar = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList);
                        if (!(eVar instanceof zu1) || org.telegram.ui.ActionBar.e.hasSheets(eVar) || !((zu1) eVar).ca()) {
                            if (hl.O1()) {
                                ArrayList arrayList2 = this.g0;
                                if (!arrayList2.isEmpty()) {
                                    org.telegram.ui.ActionBar.e eVar2 = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList2);
                                    if (eVar2 instanceof zu1) {
                                        if (!org.telegram.ui.ActionBar.e.hasSheets(eVar2)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 32) {
                    boolean isSpeakerMuted = CallAudioDevice.isSpeakerMuted();
                    AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    boolean z = audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25;
                    CallAudioDevice.setSpeakerMute(z);
                    if (isSpeakerMuted != CallAudioDevice.isSpeakerMuted()) {
                        M0(z ? 42 : 43);
                    }
                }
            }
            try {
                return super.dispatchKeyEvent(keyEvent);
            } catch (Exception e) {
                cc4.g(e, true);
                return false;
            }
        }
        lcb lastStoryViewer = Q.getLastStoryViewer();
        lastStoryViewer.getClass();
        if (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) {
            lastStoryViewer.r(keyEvent);
            return true;
        }
        return true;
    }

    public final void e0() {
        HashSet hashSet;
        zz3 zz3Var = this.Z0;
        if (zz3Var != null) {
            hl.r(zz3Var);
            this.Z0 = null;
        }
        if (this.R) {
            return;
        }
        this.R = true;
        u8a u8aVar = this.m1;
        if (u8aVar != null) {
            u8aVar.a();
            this.m1 = null;
        }
        u8a u8aVar2 = this.n1;
        if (u8aVar2 != null) {
            u8aVar2.a();
            this.n1 = null;
        }
        j16 j16Var = this.p1;
        if (j16Var == null || (hashSet = i86.n) == null) {
            return;
        }
        hashSet.remove(j16Var);
    }

    public final void f0(Intent intent, l01 l01Var) {
        super.onNewIntent(intent);
        Z();
        G();
        V(intent, true, false, false, l01Var, true, false);
    }

    public final void g0() {
        if (this.Z0 != null) {
            if (f11.a) {
                cc4.b("cancel lockRunnable onPasscodePause");
            }
            hl.r(this.Z0);
            this.Z0 = null;
        }
        if (xea.r.length() != 0) {
            xea.A = (int) (SystemClock.elapsedRealtime() / 1000);
            zz3 zz3Var = new zz3(this, (byte) 19);
            this.Z0 = zz3Var;
            if (xea.w) {
                hl.d3(zz3Var, 1000L);
                if (f11.a) {
                    cc4.b("schedule app lock in 1000");
                }
            } else if (xea.x != 0) {
                if (f11.a) {
                    cc4.b("schedule app lock in " + ((xea.x * 1000) + 1000));
                }
                hl.d3(this.Z0, (xea.x * 1000) + 1000);
            }
        } else {
            xea.A = 0;
        }
        xea.x();
    }

    @Override // sk5
    public final boolean h(org.telegram.ui.ActionBar.e eVar, ActionBarLayout actionBarLayout) {
        if (hl.O1()) {
            boolean z = eVar instanceof uj3;
            if (z || (eVar instanceof fj6)) {
                boolean z2 = actionBarLayout != this.p0;
                if (z2 && z && !((uj3) eVar).J3()) {
                    z2 = false;
                }
                if (z2) {
                    this.p0.Z();
                    this.p0.b(-1, eVar);
                    this.q0.Z();
                    this.q0.getView().setVisibility(8);
                    if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                        this.u0.setVisibility(0);
                    }
                    return false;
                }
            } else if (!(eVar instanceof zu1) || ((zu1) eVar).X7()) {
                ActionBarLayout actionBarLayout2 = this.q0;
                if (actionBarLayout != actionBarLayout2) {
                    actionBarLayout2.getView().setVisibility(0);
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                            break;
                        }
                        if (yac.h(i).o()) {
                            break;
                        }
                        i++;
                    }
                    if ((eVar instanceof qh6) && i == -1) {
                        this.u0.setVisibility(0);
                        this.t0.setBackgroundColor(0);
                    } else {
                        this.t0.setBackgroundColor(2130706432);
                    }
                    this.q0.b(-1, eVar);
                    return false;
                }
            } else if (this.N0) {
                ActionBarLayout actionBarLayout3 = this.p0;
                if (actionBarLayout != actionBarLayout3) {
                    actionBarLayout3.b(-1, eVar);
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
                    this.r0.b(-1, eVar);
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
            if (f11.a) {
                cc4.b("cancel lockRunnable onPasscodeResume");
            }
            hl.r(this.Z0);
            this.Z0 = null;
        }
        if (hl.n2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (xea.A != 0) {
            xea.A = 0;
            xea.x();
            if (f11.a) {
                cc4.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        id idVar = this.V0;
        if (idVar != null) {
            try {
                idVar.dismiss();
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

    @Override // sk5
    public final boolean j() {
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(true, false);
            return true;
        }
        if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer.q0().A(true, false);
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
            bundle.putString("selectAlertString", ob6.M0(2131745321, null));
            bundle.putString("selectAlertStringGroup", ob6.M0(2131745322, null));
        } else if (arrayList2.size() != 1) {
            bundle.putString("selectAlertString", ob6.M0(2131745321, null));
            bundle.putString("selectAlertStringGroup", ob6.M0(2131745359, null));
        }
        uj3 uj3Var = new uj3(bundle);
        uj3Var.E2 = this;
        if (this.S != null || ((arrayList = this.V) != null && !arrayList.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.V;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(zu1.V5(this.V, false, null));
            }
            String str2 = this.S;
            if (str2 != null) {
                arrayList3.add(new no6(0, str2, 0, true, 0, 0));
            }
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(this.U)) {
                    ((no6) arrayList3.get(0)).a = this.U;
                }
                CharSequence charSequence = this.U;
                if (arrayList3.isEmpty()) {
                    uj3Var.F2 = null;
                } else {
                    uj3Var.F2 = arrayList3;
                    uj3Var.G2 = null;
                    uj3Var.O2 = false;
                    if (uj3Var.D1 != null) {
                        uj3Var.D2(charSequence);
                    } else {
                        uj3Var.b4 = charSequence;
                    }
                }
            }
        } else if (!TextUtils.isEmpty(this.U)) {
            CharSequence charSequence2 = this.U;
            int i = sea.J;
            if (charSequence2 != null && charSequence2.length() != 0) {
                try {
                    matcher = hl.S.matcher(charSequence2);
                } catch (Exception unused) {
                }
                if (matcher.find()) {
                    str = charSequence2.subSequence(matcher.start(), matcher.end()).toString();
                    CharSequence charSequence3 = this.U;
                    if (str == null) {
                        uj3Var.Y4(charSequence3, str);
                    } else if (charSequence3 == null || charSequence3.length() == 0) {
                        uj3Var.H2 = null;
                    } else {
                        uj3Var.H2 = charSequence3;
                        uj3Var.G2 = null;
                        uj3Var.F2 = null;
                        if (uj3Var.D1 != null) {
                            uj3Var.D2(charSequence3);
                        } else {
                            uj3Var.b4 = charSequence3;
                        }
                    }
                }
            }
            str = null;
            CharSequence charSequence32 = this.U;
            if (str == null) {
            }
        }
        ((ActionBarLayout) N()).U(uj3Var, !hl.O1() || (actionBarLayout = this.q0) == null ? !(this.p0.getFragmentStack().size() <= 1 || !(this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1) instanceof fj6)) : !(actionBarLayout.getFragmentStack().isEmpty() || !(this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1) instanceof fj6)), !z);
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer.q0().A(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        rbb.v();
        j95 j95Var = j95.s5;
        if (j95Var != null) {
            j95Var.dismiss();
        }
        er9 er9Var = er9.Q0;
        if (er9Var != null) {
            er9Var.dismiss();
        }
        if (z || !hl.O1()) {
            return;
        }
        this.p0.W(true, true);
        this.r0.W(true, true);
    }

    @Override // sk5
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (hl.O1()) {
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
        qh6 qh6Var = new qh6();
        sz5 sz5Var = new sz5(this, (byte) 1);
        qh6Var.G = (byte) 3;
        qh6Var.a = 12;
        qh6Var.e0 = sz5Var;
        if (password == null || (str = password.login_email_pattern) == null) {
            t0(qh6Var);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        int indexOf = password.login_email_pattern.indexOf(42);
        int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            rmb rmbVar = new rmb();
            rmbVar.a |= 256;
            rmbVar.b = indexOf;
            int i = lastIndexOf + 1;
            rmbVar.c = i;
            valueOf.setSpan(new smb(rmbVar, 0), indexOf, i, 0);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        id idVar = alertDialog$Builder.a;
        idVar.S = valueOf;
        idVar.U = ob6.M0(2131751166, null);
        alertDialog$Builder.j(ob6.M0(2131752529, null), new u34(this, qh6Var, (byte) 11));
        ik8.y(null, 2131752570, alertDialog$Builder, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00ce, code lost:
    
        if (r3.getArguments().getLong("community_id", 0) != 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019d, code lost:
    
        if (r13 == r12.p0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0118 A[SYNTHETIC] */
    @Override // sk5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(ActionBarLayout actionBarLayout, tk5 tk5Var) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        ActionBarLayout actionBarLayout4;
        int i;
        ActionBarLayout actionBarLayout5;
        ActionBarLayout actionBarLayout6;
        ActionBarLayout actionBarLayout7;
        ActionBarLayout actionBarLayout8;
        org.telegram.ui.ActionBar.e eVar = tk5Var.a;
        boolean z = tk5Var.b;
        boolean z2 = tk5Var.c;
        if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        if (hl.O1()) {
            if (eVar instanceof fj6) {
                ActionBarLayout actionBarLayout9 = this.p0;
                if (actionBarLayout != actionBarLayout9) {
                    actionBarLayout9.Z();
                    wk5 N = N();
                    tk5Var.b = z;
                    tk5Var.c = z2;
                    tk5Var.d = false;
                    ((ActionBarLayout) N).R(tk5Var);
                    this.q0.Z();
                    this.q0.getView().setVisibility(8);
                    if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                        this.u0.setVisibility(0);
                        return false;
                    }
                    return false;
                }
                if ((!(eVar instanceof zu1) && !((zu1) eVar).X7()) || tk5Var.g || (actionBarLayout == (actionBarLayout3 = this.r0) && (actionBarLayout3.getFragmentStack().size() > 1 || !(this.r0.getLastFragment() instanceof zu1)))) {
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
                                tk5Var.c = true;
                                tk5Var.b = z;
                                tk5Var.d = false;
                                actionBarLayout11.R(tk5Var);
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
                                wk5 N2 = N();
                                tk5Var.b = this.p0.getFragmentStack().size() > 1;
                                tk5Var.c = z2;
                                tk5Var.d = false;
                                ((ActionBarLayout) N2).R(tk5Var);
                                return false;
                            }
                            wk5 N3 = N();
                            tk5Var.b = this.p0.getFragmentStack().size() > 1;
                            tk5Var.c = z2;
                            tk5Var.d = false;
                            ((ActionBarLayout) N3).R(tk5Var);
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
                            wk5 N4 = N();
                            tk5Var.c = z2;
                            tk5Var.d = false;
                            ((ActionBarLayout) N4).R(tk5Var);
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
                        if (yac.h(i).o()) {
                            break;
                        }
                        i++;
                    }
                    if ((eVar instanceof qh6) || i != -1) {
                        this.t0.setBackgroundColor(2130706432);
                    } else {
                        this.u0.setVisibility(0);
                        this.t0.setBackgroundColor(0);
                    }
                    ActionBarLayout actionBarLayout15 = this.q0;
                    tk5Var.b = z;
                    tk5Var.c = z2;
                    tk5Var.d = false;
                    actionBarLayout15.R(tk5Var);
                    return false;
                }
            } else {
                if (eVar instanceof uj3) {
                    uj3 uj3Var = (uj3) eVar;
                    if (uj3Var.J3() && actionBarLayout != (actionBarLayout2 = this.p0)) {
                        actionBarLayout2.Z();
                        wk5 N5 = N();
                        tk5Var.b = z;
                        tk5Var.c = z2;
                        tk5Var.d = false;
                        ((ActionBarLayout) N5).R(tk5Var);
                        this.q0.Z();
                        this.q0.getView().setVisibility(8);
                        if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                            this.u0.setVisibility(0);
                            return false;
                        }
                        return false;
                    }
                    if (actionBarLayout == this.p0) {
                        if (uj3Var.getArguments() != null) {
                            if (uj3Var.getArguments().getInt("folderId", 0) != 1) {
                            }
                        }
                    }
                }
                if (!(eVar instanceof zu1)) {
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
                    if (eVar instanceof qh6) {
                    }
                    this.t0.setBackgroundColor(2130706432);
                    ActionBarLayout actionBarLayout152 = this.q0;
                    tk5Var.b = z;
                    tk5Var.c = z2;
                    tk5Var.d = false;
                    actionBarLayout152.R(tk5Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void l0(final long j, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i, final int i2) {
        if (num != null) {
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = uc7.s1(this.P).h1(-j);
            tL_channels_getMessages.id.add(num);
            ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: q16
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    String str2 = LaunchActivity.C1;
                    hl.c3(new d06(LaunchActivity.this, tLObject, num, num2, bArr, j, runnable, str, i, i2));
                }
            });
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j);
        t0(tzb.G0(this, bundle));
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void m0(int i, long j, TLRPC.TL_error tL_error) {
        zu1 zu1Var = new zu1(qu6.k(j, "user_id"));
        t0(zu1Var);
        hl.d3(new ls5((Object) tL_error, (Object) zu1Var, uc7.s1(i).X1(Long.valueOf(j)), (byte) 4), 300L);
    }

    public final void n0(int i, String str, String str2, l01 l01Var) {
        if (l01Var != null) {
            l01Var.d();
        }
        uc7 s1 = uc7.s1(i);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_contacts_importContactToken, new eu0(this, (Object) l01Var, (Object) s1, i, str2, (byte) 5));
    }

    public final void o0(int i, String str, String str2, l01 l01Var) {
        if (l01Var != null) {
            l01Var.d();
        }
        uc7 s1 = uc7.s1(i);
        s1.a2().a(str, null, new k16(this, s1, l01Var, i, str2, (byte) 0));
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
            if (hl.O1()) {
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
            if (menu != null && !this.p0.q(menu) && hl.O1() && !this.r0.q(menu)) {
                this.q0.q(menu);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.p0;
            org.telegram.ui.ActionBar.a aVar = actionBarLayout.E;
            if (aVar != null) {
                aVar.setVisibility(8);
            }
            actionBarLayout.D0 = true;
            if (hl.O1()) {
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

    @Override // jp4, pq2, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        o68 currentPeerView;
        am2 am2Var;
        VoIPService sharedInstance;
        if (xea.r.length() != 0 && xea.A != 0) {
            xea.A = 0;
            if (f11.a) {
                cc4.b("reset lastPauseTime onActivityResult");
            }
            yac.h(this.P).u(false);
        }
        if (i == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.a.G = canDrawOverlays;
            if (canDrawOverlays) {
                j95 j95Var = j95.s5;
                if (j95Var != null) {
                    j95Var.H();
                }
                er9 er9Var = er9.Q0;
                if (er9Var != null) {
                    er9Var.e();
                }
                hl.d3(new sz5(this, (byte) 4), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i >= 22336 && i <= 22399) {
            p35 p35Var = tne.b;
            if (p35Var != null && p35Var.e == this && p35Var.f && p35Var.g == i) {
                p35Var.c(i2 != -1 ? "AUTH_CANCELED" : null);
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
            Utilities.d.c(new xac((byte) 25, id6.f(this.P), i2 == -1));
            return;
        }
        if (i == 521) {
            te2 te2Var = this.q1;
            if (te2Var != null) {
                te2Var.a(Boolean.valueOf(i2 == -1));
                this.q1 = null;
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (am2Var = themeEditorView.m) != null) {
            am2Var.E(i, i2, intent);
        }
        ActionBarLayout actionBarLayout = this.p0;
        if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
            org.telegram.ui.ActionBar.e eVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
            eVar.onActivityResultFragment(i, i2, intent);
            if (eVar.getLastStoryViewer() != null && (currentPeerView = eVar.getLastStoryViewer().o0.getCurrentPeerView()) != null && i2 == -1) {
                if (i == 0 || i == 2) {
                    currentPeerView.j0();
                    f41 f41Var = currentPeerView.s2;
                    if (f41Var != null) {
                        f41Var.d2.i0(i, intent, null);
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
                        f41 f41Var2 = currentPeerView.s2;
                        if (f41Var2 != null) {
                            f41Var2.dismiss();
                        }
                        currentPeerView.a0(true);
                    }
                }
            }
        }
        if (hl.O1()) {
            ActionBarLayout actionBarLayout2 = this.r0;
            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
            }
            ActionBarLayout actionBarLayout3 = this.q0;
            if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
            }
        }
        jn7.e().k(jn7.f5, Integer.valueOf(i), Integer.valueOf(i2), intent);
    }

    @Override // pq2, android.app.Activity
    public final void onBackPressed() {
        if (d0(true)) {
            if (!hl.O1()) {
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
            org.telegram.ui.ActionBar.e eVar = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
            if (eVar.onBackPressed(true)) {
                eVar.finishFragment();
            }
        }
    }

    @Override // pq2, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        int j;
        hl.v(this, configuration);
        this.t1.a();
        hl.r3(getWindow());
        super.onConfigurationChanged(configuration);
        fc3 b = fc3.b();
        ArrayList arrayList = (ArrayList) b.c;
        LaunchActivity launchActivity = (LaunchActivity) b.f;
        if (launchActivity == null || !hl.F1(launchActivity)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                xl4 xl4Var = ((me8) arrayList.get(i2)).e;
                if (xl4Var != null) {
                    boolean z = xl4Var.d;
                    if (xl4Var.j != null && !xl4Var.N) {
                        Activity activity = xl4Var.c;
                        hl.v(activity, activity.getResources().getConfiguration());
                        kj4.c = null;
                        kj4.d = null;
                        if (z) {
                            xl4Var.D = 1.0f;
                            i = xl4Var.A;
                            j = xl4Var.B;
                        } else {
                            Point point = hl.q;
                            xl4Var.D = (Math.min(point.x, point.y) - (xl4.n() * 2.0f)) / xl4Var.i();
                            i = (int) (xl4Var.i() * xl4Var.C);
                            je8 je8Var = xl4Var.b;
                            int U = je8Var.U();
                            int q0 = je8Var.q0();
                            float f = (U <= 0 || q0 <= 0) ? 0.5625f : q0 / U;
                            j = (int) (((int) (xl4.j(f) * f)) * xl4Var.C);
                        }
                        if (xl4Var.A != i || xl4Var.B != j) {
                            WindowManager.LayoutParams layoutParams = xl4Var.f;
                            xl4Var.A = i;
                            layoutParams.width = i;
                            xl4Var.B = j;
                            layoutParams.height = j;
                            xl4Var.v();
                        }
                        vpa vpaVar = xl4Var.G;
                        vpaVar.b = xl4Var.E;
                        vpaVar.c = true;
                        vpaVar.m.i = xl4.p(r6, xl4Var.A);
                        xl4Var.G.h();
                        vpa vpaVar2 = xl4Var.H;
                        vpaVar2.b = xl4Var.F;
                        vpaVar2.c = true;
                        vpaVar2.m.i = xl4.e(r6, xl4Var.B);
                        xl4Var.H.h();
                    }
                }
            }
        }
        hl.Y2();
        Z();
        G();
        hl.c3(new sz5(this, (byte) 5));
        iv3 iv3Var = iv3.R1;
        if (iv3Var != null) {
            iv3Var.Z(configuration);
        }
        dn0 dn0Var = dn0.o1;
        if (dn0Var != null) {
            dn0Var.Z(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            int i3 = themeEditorView.l.getInt("sidex", 1);
            int i4 = themeEditorView.l.getInt("sidey", 0);
            float f2 = themeEditorView.l.getFloat("px", 0.0f);
            float f3 = themeEditorView.l.getFloat("py", 0.0f);
            themeEditorView.i.x = ThemeEditorView.b(f2, i3, themeEditorView.g, true);
            themeEditorView.i.y = ThemeEditorView.b(f3, i4, themeEditorView.h, false);
            try {
                if (themeEditorView.c.getParent() != null) {
                    themeEditorView.j.updateViewLayout(themeEditorView.c, themeEditorView.i);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (aob.o == 3) {
            aob.E(false);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:0|1|(1:3)(1:219)|4|(2:10|(2:29|30)(2:14|(2:18|(1:28))))|32|(2:33|34)|35|(1:37)|38|(1:42)|43|(1:46)|47|(4:49|50|51|(1:53))|57|(1:59)|60|(3:66|(1:68)(1:215)|(3:70|71|(23:73|74|75|85|(1:87)|88|89|90|91|(1:93)(1:167)|(1:95)|96|(1:98)|99|(1:165)|103|104|105|(2:107|(1:109))|110|(1:112)|113|(14:115|(1:117)|118|119|(4:127|(1:(1:130)(1:133))(1:134)|131|132)|(1:136)|137|138|139|(1:141)|143|(3:145|(1:147)|148)(2:151|(3:153|(1:155)|156))|149|150)(2:159|160))))|216|85|(0)|88|89|90|91|(0)(0)|(0)|96|(0)|99|(1:101)|163|165|103|104|105|(0)|110|(0)|113|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(43:0|1|(1:3)(1:219)|4|(2:10|(2:29|30)(2:14|(2:18|(1:28))))|32|33|34|35|(1:37)|38|(1:42)|43|(1:46)|47|(4:49|50|51|(1:53))|57|(1:59)|60|(3:66|(1:68)(1:215)|(3:70|71|(23:73|74|75|85|(1:87)|88|89|90|91|(1:93)(1:167)|(1:95)|96|(1:98)|99|(1:165)|103|104|105|(2:107|(1:109))|110|(1:112)|113|(14:115|(1:117)|118|119|(4:127|(1:(1:130)(1:133))(1:134)|131|132)|(1:136)|137|138|139|(1:141)|143|(3:145|(1:147)|148)(2:151|(3:153|(1:155)|156))|149|150)(2:159|160))))|216|85|(0)|88|89|90|91|(0)(0)|(0)|96|(0)|99|(1:101)|163|165|103|104|105|(0)|110|(0)|113|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x05d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x05d7, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0503, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0504, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04db A[Catch: Exception -> 0x0503, TryCatch #6 {Exception -> 0x0503, blocks: (B:90:0x04a6, B:93:0x04ae, B:95:0x04b6, B:96:0x04ba, B:98:0x04be, B:99:0x04d5, B:101:0x04db, B:163:0x04e1, B:165:0x04e5), top: B:89:0x04a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0534 A[Catch: all -> 0x05d6, TryCatch #1 {all -> 0x05d6, blocks: (B:105:0x051a, B:107:0x0534, B:109:0x0548, B:110:0x0554, B:112:0x0560, B:113:0x0564, B:115:0x0572, B:117:0x059e, B:118:0x05ae, B:159:0x05ce, B:160:0x05d5), top: B:104:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0560 A[Catch: all -> 0x05d6, TryCatch #1 {all -> 0x05d6, blocks: (B:105:0x051a, B:107:0x0534, B:109:0x0548, B:110:0x0554, B:112:0x0560, B:113:0x0564, B:115:0x0572, B:117:0x059e, B:118:0x05ae, B:159:0x05ce, B:160:0x05d5), top: B:104:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0572 A[Catch: all -> 0x05d6, TryCatch #1 {all -> 0x05d6, blocks: (B:105:0x051a, B:107:0x0534, B:109:0x0548, B:110:0x0554, B:112:0x0560, B:113:0x0564, B:115:0x0572, B:117:0x059e, B:118:0x05ae, B:159:0x05ce, B:160:0x05d5), top: B:104:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05ce A[Catch: all -> 0x05d6, TryCatch #1 {all -> 0x05d6, blocks: (B:105:0x051a, B:107:0x0534, B:109:0x0548, B:110:0x0554, B:112:0x0560, B:113:0x0564, B:115:0x0572, B:117:0x059e, B:118:0x05ae, B:159:0x05ce, B:160:0x05d5), top: B:104:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04ae A[Catch: Exception -> 0x0503, TRY_ENTER, TryCatch #6 {Exception -> 0x0503, blocks: (B:90:0x04a6, B:93:0x04ae, B:95:0x04b6, B:96:0x04ba, B:98:0x04be, B:99:0x04d5, B:101:0x04db, B:163:0x04e1, B:165:0x04e5), top: B:89:0x04a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b6 A[Catch: Exception -> 0x0503, TryCatch #6 {Exception -> 0x0503, blocks: (B:90:0x04a6, B:93:0x04ae, B:95:0x04b6, B:96:0x04ba, B:98:0x04be, B:99:0x04d5, B:101:0x04db, B:163:0x04e1, B:165:0x04e5), top: B:89:0x04a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04be A[Catch: Exception -> 0x0503, TryCatch #6 {Exception -> 0x0503, blocks: (B:90:0x04a6, B:93:0x04ae, B:95:0x04b6, B:96:0x04ba, B:98:0x04be, B:99:0x04d5, B:101:0x04db, B:163:0x04e1, B:165:0x04e5), top: B:89:0x04a6 }] */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.app.AppOpsManager$OnOpChangedListener, le8] */
    @Override // jp4, pq2, oq2, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        long j;
        li4 li4Var;
        String str;
        String lowerCase;
        ActionBarLayout actionBarLayout;
        String string;
        Intent intent;
        Uri data;
        byte b = 1;
        E1 = true;
        F1++;
        boolean z = f11.a;
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        H1 = this;
        org.telegram.messenger.a.v();
        hl.v(this, getResources().getConfiguration());
        this.P = yac.t0;
        this.f1 = new ak(this, (byte) 6);
        IntentFilter intentFilter = new IntentFilter("org.telegram.messenger.DEBUG_THEME");
        int i = Build.VERSION.SDK_INT;
        ak akVar = this.f1;
        if (i >= 33) {
            registerReceiver(akVar, intentFilter, 2);
        } else {
            registerReceiver(akVar, intentFilter);
        }
        if (!yac.h(this.P).o() && (intent = getIntent()) != null && intent.getAction() != null) {
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
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, aob.w0(null, aob.s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new y9((byte) 0));
        getWindow().setFormat(-1);
        byte b2 = 8;
        c34 c34Var = new c34(getWindow(), new lq5(b2));
        this.e1 = c34Var;
        c34Var.a();
        super.onCreate(bundle);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            hl.E = isInMultiWindowMode();
        }
        aob.O();
        aob.S(this);
        if (xea.r.length() != 0 && xea.w) {
            xea.A = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = hl.a;
        this.p0 = new ActionBarLayout(this, true);
        d26 d26Var = new d26(objArr2 == true ? 1 : 0, this, this);
        this.v0 = d26Var;
        d26Var.setClipToPadding(false);
        this.v0.setClipChildren(false);
        setContentView(this.v0);
        this.g1 = new j1d(this.v0);
        fc3 b3 = fc3.b();
        e26 e26Var = new e26(this, false);
        LaunchActivity launchActivity = (LaunchActivity) b3.f;
        if (launchActivity != null && launchActivity != this) {
            ((ygb) b3.e).c();
        }
        b3.f = this;
        b3.a = false;
        b3.b = false;
        ygb ygbVar = (ygb) b3.e;
        ygbVar.b = this;
        ygbVar.d = e26Var;
        ygbVar.n = null;
        ygbVar.c = new bhb(this);
        ((ViewGroup) getWindow().getDecorView()).addView(ygbVar.c);
        Context context = org.telegram.messenger.a.b;
        final x38 x38Var = new x38(b3, (byte) 23);
        if (ove.a == null) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            final String packageName = context.getPackageName();
            ?? r12 = new AppOpsManager.OnOpChangedListener() { // from class: le8
                @Override // android.app.AppOpsManager.OnOpChangedListener
                public final void onOpChanged(String str2, String str3) {
                    if (packageName.equals(str3)) {
                        hl.c3(x38Var);
                    }
                }
            };
            ove.a = r12;
            try {
                appOpsManager.startWatchingMode("android:system_alert_window", packageName, r12);
                if (i2 >= 26) {
                    appOpsManager.startWatchingMode("android:picture_in_picture", packageName, ove.a);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        tqb tqbVar = new tqb(this);
        this.n0 = tqbVar;
        tqbVar.setVisibility(8);
        dr3 dr3Var = new dr3(this);
        this.y0 = dr3Var;
        dr3Var.setActionBarLayout(this.p0);
        this.y0.addOnLayoutChangeListener(new x16());
        this.y0.setClipChildren(false);
        this.y0.setClipToPadding(false);
        this.v0.addView(this.y0, tre.c(-1.0f, -1));
        d41 d41Var = new d41((Context) this, (byte) 3);
        this.o0 = d41Var;
        d41Var.setScaleType(ImageView.ScaleType.CENTER);
        this.v0.addView(this.o0, tre.c(48.0f, 48));
        this.o0.setVisibility(8);
        d26 d26Var2 = this.v0;
        gy0 gy0Var = new gy0(this);
        this.x0 = gy0Var;
        d26Var2.addView(gy0Var);
        d26 d26Var3 = this.v0;
        y16 y16Var = new y16(this);
        y16Var.setVisibility(8);
        this.w0 = y16Var;
        d26Var3.addView(y16Var);
        E0();
        this.y0.setParentActionBarLayout(this.p0);
        this.p0.setDrawerLayoutContainer(this.y0);
        this.p0.setFragmentStack(this.e0);
        this.p0.setFragmentStackChangedListener(new sz5(this, b2));
        this.p0.setDelegate(this);
        aob.m1(true);
        B();
        P0();
        jn7 e2 = jn7.e();
        int i3 = jn7.n4;
        e2.k(i3, this);
        this.d0 = ConnectionsManager.getInstance(this.P).getConnectionState();
        u8a u8aVar = this.n1;
        if (u8aVar != null) {
            u8aVar.a();
            this.n1 = null;
        }
        u8a u8aVar2 = new u8a(jn7.e(), this);
        u8aVar2.b(jn7.M0);
        u8aVar2.b(jn7.A4);
        u8aVar2.b(jn7.B4);
        u8aVar2.b(jn7.q4);
        u8aVar2.b(jn7.w4);
        u8aVar2.b(jn7.u4);
        u8aVar2.b(i3);
        u8aVar2.b(jn7.n0);
        u8aVar2.b(jn7.C4);
        u8aVar2.b(jn7.N4);
        u8aVar2.b(jn7.S4);
        u8aVar2.b(jn7.q5);
        u8aVar2.b(jn7.n5);
        u8aVar2.b(jn7.P5);
        u8aVar2.b(jn7.Q5);
        this.n1 = u8aVar2;
        j16 j16Var = new j16(this, b);
        this.p1 = j16Var;
        i86.a(j16Var);
        if (this.p0.getFragmentStack().isEmpty() && ((actionBarLayout = this.q0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (yac.h(this.P).o()) {
                this.p0.b(-1, new fj6());
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
                    j = string.hashCode();
                    try {
                        switch (j) {
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
                                    zu1 zu1Var = new zu1(bundle2);
                                    long j2 = bundle.getLong("topic_id");
                                    long j3 = bundle2.getLong("chat_id");
                                    if (j2 != 0 && j3 != 0) {
                                        TLRPC.Chat M0 = uc7.s1(this.P).M0(Long.valueOf(j3));
                                        if (xc2.c0(M0) && !xc2.a(M0) && !xc2.u0(M0)) {
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("chat_id", j3);
                                            org.telegram.ui.ActionBar.e G0 = tzb.G0(this, bundle3);
                                            if (G0 instanceof tzb) {
                                                this.p0.b(-1, G0);
                                            }
                                        }
                                        ro4.a(zu1Var, if7.a(-j3, j2));
                                    }
                                    if (this.p0.b(-1, zu1Var)) {
                                        zu1Var.n8 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                j = 0;
                                if (string.equals("group") && bundle2 != null) {
                                    xc5 xc5Var = new xc5(bundle2);
                                    if (this.p0.b(-1, xc5Var)) {
                                        xc5Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                j = 0;
                                if (string.equals("channel") && bundle2 != null) {
                                    gi1 gi1Var = new gi1(bundle2);
                                    if (this.p0.b(-1, gi1Var)) {
                                        gi1Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    j = 0;
                                    bundle2.putLong("user_id", yac.h(this.P).n);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.p0.b(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.p0.b(-1, new tba(null));
                                    break;
                                }
                                break;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        cc4.g(e, true);
                        G();
                        H(false, true, !this.W0);
                        long j4 = j;
                        V(getIntent(), false, bundle != null, false, null, true, true);
                        String str2 = Build.DISPLAY;
                        String str3 = Build.USER;
                        if (str2 != null) {
                        }
                        if (str3 != null) {
                        }
                        if (f11.a) {
                        }
                        if (!lowerCase.contains("flyme")) {
                        }
                        hl.y = true;
                        View rootView = getWindow().getDecorView().getRootView();
                        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                        l45 l45Var = new l45(rootView, (byte) 2);
                        this.h0 = l45Var;
                        viewTreeObserver.addOnGlobalLayoutListener(l45Var);
                        MediaController.z().K0 = this;
                        ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
                        boolean z2 = f11.a;
                        String valueOf = String.valueOf(yac.h(yac.t0).n);
                        if (yac.h(yac.t0).f() != null) {
                        }
                        if (ConnectionsManager.getInstance(yac.t0).isTestBackend()) {
                        }
                        li4Var = (li4) ji4.c().b(li4.class);
                        if (li4Var == null) {
                        }
                    }
                    G();
                    H(false, true, !this.W0);
                    long j42 = j;
                    V(getIntent(), false, bundle != null, false, null, true, true);
                    String str22 = Build.DISPLAY;
                    String str32 = Build.USER;
                    lowerCase = str22 != null ? str22.toLowerCase() : "";
                    String lowerCase3 = str32 != null ? lowerCase.toLowerCase() : "";
                    if (f11.a) {
                        cc4.b("OS name " + lowerCase + " " + lowerCase3);
                    }
                    if ((!lowerCase.contains("flyme") || lowerCase3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                        hl.y = true;
                        View rootView2 = getWindow().getDecorView().getRootView();
                        ViewTreeObserver viewTreeObserver2 = rootView2.getViewTreeObserver();
                        l45 l45Var2 = new l45(rootView2, (byte) 2);
                        this.h0 = l45Var2;
                        viewTreeObserver2.addOnGlobalLayoutListener(l45Var2);
                    }
                    MediaController.z().K0 = this;
                    ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
                    boolean z22 = f11.a;
                    String valueOf2 = String.valueOf(yac.h(yac.t0).n);
                    if (yac.h(yac.t0).f() != null) {
                        String p = lbc.p(yac.h(yac.t0).f());
                        if (!TextUtils.isEmpty(p)) {
                            valueOf2 = "@" + p;
                        }
                    }
                    if (ConnectionsManager.getInstance(yac.t0).isTestBackend()) {
                        valueOf2 = valueOf2.concat(" [TEST SERVER]");
                    }
                    li4Var = (li4) ji4.c().b(li4.class);
                    if (li4Var == null) {
                        throw new NullPointerException("FirebaseCrashlytics component is not present.");
                    }
                    zc1 zc1Var = li4Var.a;
                    ((i03) ((rx6) zc1Var.n).b).a(new bv2((Object) zc1Var, (Object) valueOf2, (byte) 6));
                    li4Var.b("version", "public");
                    li4Var.b("model", Build.MODEL);
                    li4Var.b("manufacturer", Build.MANUFACTURER);
                    if (Build.VERSION.SDK_INT >= 31) {
                        str = Build.SOC_MODEL;
                        li4Var.b("soc_model", str);
                        li4Var.b("soc_manufacturer", Build.SOC_MANUFACTURER);
                    }
                    li4Var.b("device", Build.DEVICE);
                    li4Var.b("product", Build.PRODUCT);
                    li4Var.b("hardware", Build.HARDWARE);
                    li4Var.b("user", Build.USER);
                    li4Var.a();
                    ele.b(true);
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - sye.a.getLong("last_checked", j42) >= 86400000 && sye.a.getInt("dismissed_count", 0) < 3) {
                        Pattern pattern = jj.a;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                        alertDialog$Builder.a.S = ob6.M0(2131754276, null);
                        alertDialog$Builder.a.U = hl.S2(ob6.M0(xue.a() ? i4 >= 31 ? 2131754274 : 2131754273 : 2131754275, null));
                        int i5 = aob.L5;
                        alertDialog$Builder.l(R.raw.permission_request_apk, 72, aob.w0(null, i5, false), null);
                        alertDialog$Builder.m(i5, null);
                        alertDialog$Builder.j(ob6.M0(2131747027, null), new pd(this, objArr == true ? 1 : 0));
                        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
                        alertDialog$Builder.a.setOnDismissListener(new h5((byte) 2));
                        alertDialog$Builder.a.show();
                        sye.a.edit().putLong("last_checked", System.currentTimeMillis()).apply();
                    }
                    if (i4 >= 31) {
                        getWindow().getDecorView().addOnAttachStateChangeListener(new z16(this));
                    }
                    v21.a(this.v0, new py((byte) 8));
                    getWindow().getDecorView().setSystemUiVisibility(1792);
                    Window window = getWindow();
                    try {
                        hl.S(window);
                        if (i4 >= 28) {
                            window.setNavigationBarDividerColor(0);
                        }
                    } catch (Throwable th) {
                        cc4.g(th, true);
                    }
                    BackupAgent.a();
                    ee9.Y(false);
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 34) {
                        if (this.j1 == null) {
                            this.j1 = new a26(this);
                        }
                        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.j1);
                    } else if (i6 >= 33) {
                        if (this.k1 == null) {
                            this.k1 = new b26(this);
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
        V(getIntent(), false, bundle != null, false, null, true, true);
        String str222 = Build.DISPLAY;
        String str322 = Build.USER;
        if (str222 != null) {
        }
        if (str322 != null) {
        }
        if (f11.a) {
        }
        if (!lowerCase.contains("flyme")) {
        }
        hl.y = true;
        View rootView22 = getWindow().getDecorView().getRootView();
        ViewTreeObserver viewTreeObserver22 = rootView22.getViewTreeObserver();
        l45 l45Var22 = new l45(rootView22, (byte) 2);
        this.h0 = l45Var22;
        viewTreeObserver22.addOnGlobalLayoutListener(l45Var22);
        MediaController.z().K0 = this;
        ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
        boolean z222 = f11.a;
        String valueOf22 = String.valueOf(yac.h(yac.t0).n);
        if (yac.h(yac.t0).f() != null) {
        }
        if (ConnectionsManager.getInstance(yac.t0).isTestBackend()) {
        }
        li4Var = (li4) ji4.c().b(li4.class);
        if (li4Var == null) {
        }
    }

    @Override // jp4, android.app.Activity
    public final void onDestroy() {
        mr4 mr4Var;
        ArrayList arrayList;
        d26 d26Var;
        p35 p35Var = tne.b;
        if (p35Var != null && p35Var.e == this) {
            p35Var.c("AUTH_CANCELED");
            tne.b.e();
        }
        fc3 b = fc3.b();
        ArrayList arrayList2 = (ArrayList) b.c;
        if (((LaunchActivity) b.f) == this) {
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((me8) arrayList2.get(size)).b();
            }
            ((ygb) b.e).c();
            b.f = null;
            ((ArrayList) b.d).clear();
        }
        int i = 0;
        E1 = false;
        F1--;
        ak akVar = this.f1;
        if (akVar != null) {
            unregisterReceiver(akVar);
            this.f1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.k9 != null) {
                PhotoViewer.k9.L();
            }
            if (PhotoViewer.C0()) {
                PhotoViewer.q0().L();
            }
            if (SecretMediaViewer.e()) {
                SecretMediaViewer d = SecretMediaViewer.d();
                Runnable runnable = d.o1;
                if (runnable != null) {
                    runnable.run();
                    d.o1 = null;
                }
                e26 e26Var = d.k1;
                if (e26Var != null) {
                    e26Var.a();
                    d.k1 = null;
                }
                jn7.f(d.a).n(d, jn7.v);
                jn7.f(d.a).n(d, jn7.l0);
                jn7.f(d.a).n(d, jn7.i0);
                d.s = false;
                d.M = null;
                mn5 mn5Var = d.h0;
                if (mn5Var != null) {
                    mn5Var.a();
                    d.h0 = null;
                }
                d.j();
                if (d.b != null && (d26Var = d.d) != null) {
                    try {
                        if (d26Var.getParent() != null) {
                            ((WindowManager) d.b.getSystemService("window")).removeViewImmediate(d.d);
                        }
                        d.d = null;
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                SecretMediaViewer.w1 = null;
            }
            if (o.F()) {
                o.u().q();
            }
            if (rw2.g0 != null) {
                rw2 e2 = rw2.e();
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
                        cc4.g(e3, true);
                    }
                    rw2.g0 = null;
                    jn7.e().k(jn7.k1, 8);
                }
            }
            j95 j95Var = j95.s5;
            if (j95Var != null) {
                j95Var.H();
            }
            er9 er9Var = er9.Q0;
            if (er9Var != null) {
                er9Var.e();
            }
            int i2 = aob.a;
            iv3 iv3Var = iv3.R1;
            if (iv3Var != null) {
                iv3Var.F0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            ll4 ll4Var = nle.a;
            if (ll4Var != null) {
                ll4Var.e.edit().putFloat("x", (float) ll4Var.c.m.i).putFloat("y", (float) ll4Var.d.m.i).commit();
            }
            nle.a = null;
            SparseArray sparseArray = wl.r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController z = MediaController.z();
        if (z.K0 == this) {
            z.K0 = null;
        }
        MediaController z2 = MediaController.z();
        if (z2.L0 == this.s1) {
            z2.L0 = null;
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
                cc4.g(e4, true);
            }
        }
        arrayList.clear();
        try {
            if (this.h0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.h0);
            }
        } catch (Exception e5) {
            cc4.g(e5, true);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            if (this.j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.j1);
            }
        } else if (i3 >= 33 && this.j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.k1);
        }
        v21.h(this.v0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        e0();
        c34 c34Var = this.e1;
        if (c34Var != null) {
            c34Var.g();
        }
        if (i3 < 24 || (mr4Var = this.i1) == null) {
            return;
        }
        mr4Var.b();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82 && !xea.B) {
            if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
                return super.onKeyUp(i, keyEvent);
            }
            if (o.F() && o.u().W) {
                return super.onKeyUp(i, keyEvent);
            }
            if (!hl.O1()) {
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
            if (hl.O1()) {
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

    @Override // pq2, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        hl.E = z;
        this.t1.a();
        G();
        super.onMultiWindowModeChanged(z);
    }

    @Override // pq2, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Z();
        G();
        V(intent, true, false, false, null, true, true);
    }

    @Override // jp4, android.app.Activity
    public final void onPause() {
        VoIPService sharedInstance;
        xl4 xl4Var;
        ne8 ne8Var;
        super.onPause();
        G1 = false;
        k0d.q(true);
        fc3 b = fc3.b();
        ArrayList arrayList = (ArrayList) b.c;
        if (this == ((LaunchActivity) b.f)) {
            b.b = false;
            ygb ygbVar = (ygb) b.e;
            LaunchActivity launchActivity = ygbVar.b;
            if (launchActivity != null && Build.VERSION.SDK_INT >= 31 && ygbVar.f == null && ygbVar.e != null && hl.F1(launchActivity)) {
                ygbVar.i(ygbVar.e);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                me8 me8Var = (me8) arrayList.get(i);
                if (me8Var.c == 1 && (xl4Var = me8Var.e) != null && !xl4Var.g && (ne8Var = xl4Var.l) != null && xl4Var.n != null && ne8Var.isAvailable()) {
                    try {
                        Bitmap bitmap = xl4Var.l.getBitmap();
                        if (bitmap != null) {
                            xl4Var.n.setImageBitmap(bitmap);
                            xl4Var.n.setVisibility(0);
                            xl4Var.l.setFirstFrameCallback(null);
                        }
                    } catch (Throwable th) {
                        cc4.g(th, true);
                    }
                }
            }
        }
        jn7.e().k(jn7.j1, Integer.valueOf(TLObject.FLAG_12));
        org.telegram.messenger.a.x = true;
        Utilities.d.c(new gw0(this.P, (byte) 5));
        g0();
        this.p0.M();
        if (hl.O1()) {
            ActionBarLayout actionBarLayout = this.r0;
            if (actionBarLayout != null) {
                actionBarLayout.M();
            }
            ActionBarLayout actionBarLayout2 = this.q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.M();
            }
        }
        hz7 hz7Var = this.z0;
        if (hz7Var != null) {
            hz7Var.b.k();
        }
        ArrayList arrayList2 = this.A0;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((fz7) obj).k();
        }
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer q0 = PhotoViewer.q0();
            if (q0.k2 != null) {
                q0.A(false, false);
            } else {
                kfc kfcVar = q0.G2;
                if (kfcVar != null && q0.Z2) {
                    kfcVar.r0(hl.F1(q0.E));
                }
            }
        }
        rbb rbbVar = rbb.G2;
        if (rbbVar != null) {
            rbbVar.t(false);
            hbb hbbVar = rbbVar.d1;
            if (hbbVar != null) {
                hbbVar.f.r();
            }
            gbb gbbVar = rbbVar.Y0;
            if (gbbVar != null) {
                gbbVar.x(0, true);
            }
        }
        dlc.a(this);
        mkc mkcVar = mkc.m1;
        if (mkcVar != null) {
            boolean isInteractive = ((PowerManager) mkcVar.b.getSystemService("power")).isInteractive();
            boolean canDrawOverlays = Settings.canDrawOverlays(mkcVar.b);
            boolean z = canDrawOverlays || ove.a(mkcVar.b);
            if (mkcVar.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && canDrawOverlays) {
                int measuredHeight = mkc.m1.u0.getMeasuredHeight();
                mkc mkcVar2 = mkc.m1;
                dlc.f(mkcVar2.b, mkcVar2.a, mkcVar2.u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = mkc.m1.r0;
                if (windowInsets != null) {
                    dlc.W = windowInsets.getSystemWindowInsetTop();
                    mkc.m1.r0.getSystemWindowInsetBottom();
                }
            }
            if (mkcVar.n0 && ((!z || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (dlc.d() != null) {
                dlc.d().e();
            }
        } else if (dlc.d() != null) {
            dlc.d().e();
        }
        HashMap hashMap = mpa.n;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                lpa lpaVar = ((mpa) it.next()).f;
                if (lpaVar != null) {
                    lpaVar.b = true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r7.f != null) goto L10;
     */
    @Override // pq2, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        me8 me8Var;
        View view;
        me8 me8Var2;
        super.onPictureInPictureModeChanged(z, configuration);
        ygb ygbVar = (ygb) fc3.b().e;
        if (ygbVar.f == null) {
            if (z && (me8Var2 = ygbVar.e) != null) {
                ygbVar.i(me8Var2);
            }
        }
        if (z) {
            fc3.e("system: complete enter");
            ygbVar.i = true;
            if (ygbVar.o && (me8Var = ygbVar.f) != null && (view = ygbVar.h) != null) {
                me8Var.a.N(view);
            }
            if (ygbVar.o) {
                ygbVar.o = false;
                me8 me8Var3 = ygbVar.f;
                if (me8Var3 != null && Build.VERSION.SDK_INT >= 26) {
                    ygbVar.a(me8Var3);
                }
            }
            e26 e26Var = ygbVar.d;
            if (e26Var != null) {
                e26Var.b(true);
            }
            View view2 = ygbVar.h;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            bhb bhbVar = ygbVar.c;
            if (bhbVar != null) {
                bhbVar.requestLayout();
            }
        } else if (ygbVar.a.a) {
            ygbVar.d();
        } else {
            fc3.e("system: closed by the user");
            ygbVar.i = false;
            ygbVar.o = false;
            e26 e26Var2 = ygbVar.d;
            if (e26Var2 != null) {
                e26Var2.b(false);
            }
            me8 me8Var4 = ygbVar.f;
            if (me8Var4 != null) {
                me8Var4.b();
            }
        }
        if (z || this.r1) {
            return;
        }
        if (PhotoViewer.k9 != null) {
            PhotoViewer.k9.L();
        }
        if (PhotoViewer.C0()) {
            PhotoViewer.q0().A(false, false);
        }
    }

    @Override // android.app.Activity
    public final boolean onPictureInPictureRequested() {
        ((ygb) fc3.b().e).g();
        return super.onPictureInPictureRequested();
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        ((ygb) fc3.b().e).f(pictureInPictureUiState);
    }

    @Override // jp4, pq2, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (w(i, strArr, iArr)) {
            org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
            if (this.p0.getFragmentStack().size() != 0) {
                this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
            if (hl.O1()) {
                if (this.r0.getFragmentStack().size() != 0) {
                    this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                }
                if (this.q0.getFragmentStack().size() != 0) {
                    this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                }
            }
            mkc.h(iArr, i);
            rbb rbbVar = rbb.G2;
            byte b = 2;
            byte b2 = 0;
            if (rbbVar != null) {
                x53 x53Var = rbbVar.a;
                Activity activity = rbbVar.b;
                boolean z = iArr != null && iArr.length == 1 && iArr[0] == 0;
                if (i == 111) {
                    rbbVar.t2 = !z;
                    if (z && rbbVar.g0 == 0) {
                        rbbVar.B0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            rbbVar.p();
                        } else {
                            CameraController.getInstance().initCamera(new bab(rbbVar, b2));
                        }
                    }
                } else if (i == 114) {
                    if (z) {
                        MediaController.R(0);
                        rbbVar.c(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, x53Var, activity);
                        int i2 = aob.L5;
                        alertDialog$Builder.l(R.raw.permission_request_folder, 72, aob.w0(null, i2, false), null);
                        alertDialog$Builder.m(i2, null);
                        SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747026, null));
                        id idVar = alertDialog$Builder.a;
                        idVar.U = S2;
                        alertDialog$Builder.j(ob6.M0(2131747027, null), new jab(rbbVar, b));
                        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
                        idVar.show();
                    }
                } else if (i == 112) {
                    if (!z) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, x53Var, activity);
                        int i3 = aob.L5;
                        alertDialog$Builder2.l(R.raw.permission_request_camera, 72, aob.w0(null, i3, false), null);
                        alertDialog$Builder2.m(i3, null);
                        SpannableStringBuilder S22 = hl.S2(ob6.M0(2131747036, null));
                        id idVar2 = alertDialog$Builder2.a;
                        idVar2.U = S22;
                        alertDialog$Builder2.j(ob6.M0(2131747027, null), new jab(rbbVar, (byte) 3));
                        alertDialog$Builder2.g(ob6.M0(2131751737, null), null);
                        idVar2.show();
                    }
                } else if (i == 115) {
                    if (z) {
                        hl3 hl3Var = rbbVar.z2;
                        if (hl3Var != null) {
                            hl3Var.run();
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, x53Var, activity);
                        int i4 = aob.L5;
                        alertDialog$Builder3.l(R.raw.permission_request_folder, 72, aob.w0(null, i4, false), null);
                        alertDialog$Builder3.m(i4, null);
                        SpannableStringBuilder S23 = hl.S2(ob6.M0(2131747040, null));
                        id idVar3 = alertDialog$Builder3.a;
                        idVar3.U = S23;
                        alertDialog$Builder3.j(ob6.M0(2131747027, null), new jab(rbbVar, (byte) 5));
                        alertDialog$Builder3.g(ob6.M0(2131751737, null), null);
                        idVar3.show();
                    }
                    rbbVar.z2 = null;
                }
            }
            jn7.e().k(jn7.g5, Integer.valueOf(i), strArr, iArr);
            SparseIntArray sparseIntArray = this.b1;
            if (sparseIntArray.get(i, -1) >= 0) {
                int i5 = sparseIntArray.get(i, -1);
                sparseIntArray.delete(i);
                jn7.e().k(jn7.r5, Integer.valueOf(i5));
            }
            jn7.e().k(jn7.s5, Integer.valueOf(i), strArr, iArr);
        }
    }

    @Override // jp4, android.app.Activity
    public final void onResume() {
        na9 na9Var;
        do6 do6Var;
        LaunchActivity launchActivity;
        super.onResume();
        byte b = 0;
        k0d.q(false);
        G1 = true;
        fc3 b2 = fc3.b();
        ArrayList arrayList = (ArrayList) b2.c;
        ArrayList arrayList2 = (ArrayList) b2.d;
        if (this == ((LaunchActivity) b2.f)) {
            b2.b = true;
            ygb ygbVar = (ygb) b2.e;
            if (ygbVar.f != null && (launchActivity = ygbVar.b) != null && !hl.F1(launchActivity)) {
                ygbVar.d();
            }
            for (int i = 0; i < arrayList.size(); i++) {
                me8 me8Var = (me8) arrayList.get(i);
                xl4 xl4Var = me8Var.e;
                if (xl4Var != null && me8Var.c == 1 && xl4Var.h && !xl4Var.N) {
                    if ((!xl4Var.d && xl4Var.b.E() && Settings.canDrawOverlays(xl4Var.c)) != xl4Var.g) {
                        xl4Var.m();
                        xl4Var.a();
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
            b2.d();
        }
        byte b3 = 3;
        if (aob.o == 3) {
            aob.E(false);
        }
        id6[] id6VarArr = id6.P;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            if (yac.h(i3).o() && !id6.f(i3).J.isEmpty()) {
                id6.q();
                break;
            }
            i3++;
        }
        I(true);
        jn7.e().k(jn7.k1, Integer.valueOf(TLObject.FLAG_12));
        MediaController z = MediaController.z();
        ViewGroup view = this.p0.getView();
        this.s1 = view;
        z.L0 = view;
        org.telegram.messenger.a.x = false;
        uc7.s1(this.P).h5(null);
        I0();
        Utilities.d.c(new jm3((byte) 21));
        D(0);
        if (Build.VERSION.SDK_INT >= 24 && (do6Var = MediaController.b2) != null) {
            Utilities.e.d(new gw0(do6Var.e.size(), (byte) 7), 2000L);
        }
        h0();
        hz7 hz7Var = this.z0;
        if (hz7Var == null || hz7Var.b.getVisibility() != 0) {
            this.p0.N();
            if (hl.O1()) {
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
            if (hl.O1()) {
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
                ((fz7) obj2).l();
            }
        }
        ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        P0();
        if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer q0 = PhotoViewer.q0();
            ad8 ad8Var = q0.f0;
            if (ad8Var != null) {
                ad8Var.invalidate();
                hl.d3(new me7((Object) q0, (int) b, (byte) 6), 100L);
            }
            kfc kfcVar = q0.G2;
            if (kfcVar != null) {
                kfcVar.o0(kfcVar.S() + 1);
                if (q0.Z2) {
                    q0.G2.r0(true);
                }
            }
            hc8 hc8Var = q0.M1;
            if (hc8Var != null && (na9Var = hc8Var.G0.d) != null) {
                na9Var.postRunnable(na9Var.x);
            }
        }
        rbb rbbVar = rbb.G2;
        if (rbbVar != null) {
            rbbVar.O();
        }
        if (yac.h(yac.t0).a0 != null) {
            int i5 = yac.t0;
            L0(i5, yac.h(i5).a0);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = xea.f1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                int i6 = yac.t0;
                if (this.C0 == null) {
                    sk0 sk0Var = new sk0(this);
                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    int i7 = aob.d6;
                    sk0Var.x = new GradientDrawable(orientation, new int[]{aob.w0(null, i7, false), 0});
                    sk0Var.y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{aob.w0(null, i7, false), 0});
                    yob.h(i7, null, sk0Var);
                    int i8 = (int) (hl.m / hl.p);
                    FrameLayout frameLayout = new FrameLayout(this);
                    sk0Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, hl.L(176.0f) + hl.m));
                    e29 e29Var = new e29(this);
                    e29Var.f(R.raw.qr_code_logo, jn7.s1, jn7.s1, null);
                    e29Var.d();
                    e29Var.getAnimatedDrawable().F(1);
                    e29Var.setScaleType(ImageView.ScaleType.CENTER);
                    e29Var.setPadding(0, 0, 0, hl.L(14.0f));
                    frameLayout.addView(e29Var, tre.d(-2, -2.0f, 17, 0.0f, i8, 0.0f, 0.0f));
                    e29Var.setOnClickListener(new rk0(sk0Var));
                    FrameLayout frameLayout2 = new FrameLayout(this);
                    ScrollView scrollView = new ScrollView(this);
                    sk0Var.f = scrollView;
                    hl.u3(scrollView, aob.w0(null, aob.s8, false));
                    scrollView.setPadding(0, hl.L(16.0f), 0, hl.L(16.0f));
                    scrollView.setClipToPadding(false);
                    sk0Var.addView(scrollView, tre.d(-1, -1.0f, 51, 27.0f, i8 + jn7.H2, 27.0f, 130.0f));
                    scrollView.addView(frameLayout2);
                    TextView textView = new TextView(this);
                    int i9 = aob.G6;
                    yob.X(textView, i9, null);
                    textView.setTextSize(1, 20.0f);
                    textView.setGravity(49);
                    textView.setTypeface(hl.o());
                    textView.setText(ob6.M0(2131743471, null));
                    frameLayout2.addView(textView, tre.e(-2, -2, 49));
                    TextView textView2 = new TextView(this);
                    sk0Var.a = textView2;
                    yob.X(textView2, i9, null);
                    yob.G(textView2, aob.J6, null);
                    textView2.setTextSize(1, 15.0f);
                    textView2.setMovementMethod(new dl(b));
                    textView2.setGravity(49);
                    textView2.setLineSpacing(hl.L(2.0f), 1.0f);
                    frameLayout2.addView(textView2, tre.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                    zc zcVar = new zc(this, b3);
                    sk0Var.d = zcVar;
                    zcVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                    zcVar.setBackgroundDrawable(rnb.f(aob.Fi, 4.0f));
                    zcVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                    sk0Var.addView(zcVar, tre.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
                    zcVar.setOnClickListener(new rk0(sk0Var, this));
                    TextView textView3 = new TextView(this);
                    sk0Var.b = textView3;
                    textView3.setGravity(17);
                    textView3.setTypeface(hl.o());
                    textView3.setTextColor(-1);
                    textView3.setTextSize(1, 14.0f);
                    zcVar.addView(textView3, tre.e(-2, -2, 17));
                    zc zcVar2 = new zc((byte) 4, (Context) this, (Object) sk0Var);
                    sk0Var.c = zcVar2;
                    zcVar2.setWillNotDraw(false);
                    zcVar2.setAlpha(0.0f);
                    zcVar2.setScaleX(0.1f);
                    zcVar2.setScaleY(0.1f);
                    zcVar2.setVisibility(4);
                    g29 g29Var = new g29(zcVar2);
                    sk0Var.e = g29Var;
                    g29Var.d(null, true, false);
                    g29Var.o = -1;
                    zcVar.addView(zcVar2, tre.e(36, 36, 17));
                    this.C0 = sk0Var;
                    this.y0.addView(sk0Var, tre.c(-1.0f, -1));
                }
                sk0 sk0Var2 = this.C0;
                sk0Var2.w = 0;
                sk0Var2.n = tL_help_appUpdate;
                sk0Var2.s = i6;
                TLRPC.Document document = tL_help_appUpdate.document;
                if (document instanceof TLRPC.TL_document) {
                    sk0Var2.r = xb4.r(null, document);
                }
                if (sk0Var2.getVisibility() != 0) {
                    sk0Var2.setVisibility(0);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
                r47.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
                sk0Var2.a.setText(spannableStringBuilder);
                boolean z2 = tL_help_appUpdate.document instanceof TLRPC.TL_document;
                TextView textView4 = sk0Var2.b;
                if (z2) {
                    textView4.setText(ob6.M0(2131743477, null).concat(String.format(Locale.US, " (%1$s)", hl.i0(tL_help_appUpdate.document.size, false, false))));
                } else {
                    textView4.setText(ob6.M0(2131743477, null));
                }
                jn7.f(sk0Var2.s).b(sk0Var2, jn7.Y1);
                jn7.f(sk0Var2.s).b(sk0Var2, jn7.Z1);
                jn7.f(sk0Var2.s).b(sk0Var2, jn7.X1);
                org.telegram.messenger.a.t();
            }
        }
        A(false);
        org.telegram.messenger.a.G = Settings.canDrawOverlays(this);
        dlc.a(this);
        mkc mkcVar = mkc.m1;
        if (mkcVar != null) {
            if (dlc.d() != null) {
                dlc.b();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                mkcVar.y();
            } else if (VoIPService.getSharedState() == null) {
                mkcVar.u0.b();
            }
            mkcVar.J0 = ((KeyguardManager) mkcVar.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (dlc.d() != null) {
                dlc.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        } else if (dlc.d() != null) {
            dlc.d().getClass();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getVideoState(false) == 1) {
                sharedInstance3.setVideoState(false, 2);
            }
        }
        Z();
        HashMap hashMap = mpa.n;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                lpa lpaVar = ((mpa) it.next()).f;
                if (lpaVar != null) {
                    lpaVar.b = false;
                }
            }
        }
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ys ysVar = J1;
        if (ysVar != null) {
            ysVar.run();
            J1 = null;
        }
        uc7 s1 = uc7.s1(this.P);
        if (s1.u3.contains("SETUP_LOGIN_EMAIL") || s1.u3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            Utilities.d.c(new pa7(uc7.s1(this.P), (byte) 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1 A[Catch: Exception -> 0x012f, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x000e, B:9:0x0018, B:11:0x00a1, B:15:0x00af, B:17:0x00be, B:19:0x00c2, B:20:0x012b, B:24:0x00cc, B:27:0x00d2, B:28:0x00db, B:30:0x00df, B:31:0x00e5, B:33:0x00e9, B:35:0x00f2, B:36:0x00f8, B:39:0x0102, B:40:0x010b, B:43:0x0111, B:45:0x0119, B:46:0x0122, B:48:0x0126, B:50:0x0030, B:52:0x0034, B:54:0x003e, B:55:0x0056, B:57:0x0062, B:59:0x007a, B:61:0x0086), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // pq2, oq2, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        org.telegram.ui.ActionBar.e eVar;
        try {
            super.onSaveInstanceState(bundle);
            if (hl.O1()) {
                ActionBarLayout actionBarLayout = this.q0;
                if (actionBarLayout == null || actionBarLayout.getFragmentStack().isEmpty()) {
                    ActionBarLayout actionBarLayout2 = this.r0;
                    if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                        if (!this.p0.getFragmentStack().isEmpty()) {
                            eVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
                        }
                        eVar = null;
                    } else {
                        eVar = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
                    }
                } else {
                    eVar = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
                }
                if (eVar != null) {
                    Bundle arguments = eVar.getArguments();
                    if ((eVar instanceof zu1) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "chat");
                        zu1 zu1Var = (zu1) eVar;
                        if (zu1Var.x4 && zu1Var.g4 == 0) {
                            bundle.putLong("topic_id", zu1Var.c());
                        }
                    } else if ((eVar instanceof xc5) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "group");
                    } else if (eVar instanceof WallpapersListActivity) {
                        bundle.putString("fragment", "wallpapers");
                    } else if (eVar instanceof ProfileActivity) {
                        ProfileActivity profileActivity = (ProfileActivity) eVar;
                        if (profileActivity.s2()) {
                            bundle.putString("fragment", "settings");
                        } else if (profileActivity.f1 != 0 && arguments != null) {
                            bundle.putBundle("args", arguments);
                            bundle.putString("fragment", "chat_profile");
                        }
                    } else if ((eVar instanceof gi1) && arguments != null && arguments.getInt("step") == 0) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "channel");
                    } else if (eVar instanceof tba) {
                        bundle.putString("fragment", "settings2");
                    }
                    eVar.saveSelfArgs(bundle);
                    return;
                }
                return;
            }
            if (!this.p0.getFragmentStack().isEmpty()) {
                eVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
                if (eVar != null) {
                }
            }
            eVar = null;
            if (eVar != null) {
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r1 != null) goto L31;
     */
    @Override // jp4, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        xl4 xl4Var;
        ne8 ne8Var;
        super.onStart();
        this.r1 = true;
        fc3 b = fc3.b();
        ArrayList arrayList = (ArrayList) b.c;
        if (this == ((LaunchActivity) b.f)) {
            b.a = true;
            for (int i = 0; i < arrayList.size(); i++) {
                me8 me8Var = (me8) arrayList.get(i);
                if (me8Var.c == 1 && (xl4Var = me8Var.e) != null && !xl4Var.g && (ne8Var = xl4Var.l) != null) {
                    ne8Var.post(new se4(xl4Var, ne8Var, (byte) 7));
                }
            }
        }
        WeakReference weakReference = m01.e;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (activity != null && activity != this) {
            m01.z(activity);
        }
        if (m01.b == null) {
            m01.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(m01.d)) {
                    String a = sfe.a(this);
                    m01.d = a;
                }
                k01 k01Var = new k01();
                t8a t8aVar = new t8a();
                t8aVar.b = new WeakReference(k01Var);
                m01.c = t8aVar;
                String str = m01.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, t8aVar, 33)) {
                    m01.c = null;
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        org.telegram.messenger.a.y = false;
        ra5.k(this);
        j95 j95Var = j95.s5;
        if (j95Var != null) {
            j95Var.o1();
        }
        er9 er9Var = er9.Q0;
        if (er9Var != null) {
            er9Var.I0 = false;
            er9Var.v();
        }
    }

    @Override // jp4, android.app.Activity
    public final void onStop() {
        xl4 xl4Var;
        super.onStop();
        p35 p35Var = tne.b;
        if (p35Var != null && p35Var.e == this && Build.VERSION.SDK_INT < 30) {
            p35 p35Var2 = tne.b;
            if (!p35Var2.f) {
                p35Var2.c("AUTH_CANCELED");
                tne.b.e();
            }
        }
        this.r1 = false;
        fc3 b = fc3.b();
        ArrayList arrayList = (ArrayList) b.c;
        if (this == ((LaunchActivity) b.f)) {
            b.a = false;
            ((ygb) b.e).getClass();
            for (int i = 0; i < arrayList.size(); i++) {
                me8 me8Var = (me8) arrayList.get(i);
                byte b2 = me8Var.c;
                je8 je8Var = me8Var.a;
                if (b2 == 1 && (xl4Var = me8Var.e) != null && !xl4Var.g && je8Var.A0()) {
                    je8Var.b();
                    me8Var.e();
                }
            }
        }
        if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer.q0().g1();
        }
        m01.z(this);
        org.telegram.messenger.a.y = true;
        ra5.k(this);
        j95 j95Var = j95.s5;
        if (j95Var != null) {
            j95Var.n1();
        }
        er9 er9Var = er9.Q0;
        if (er9Var != null) {
            er9Var.I0 = true;
            er9Var.v();
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.h1 = false;
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        ((ygb) fc3.b().e).g();
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
                ((org.telegram.ui.ActionBar.e) bp1.m(1, actionBarLayout.V0)).onUserLeaveHint();
            }
            l6 l6Var = actionBarLayout.H;
            if (l6Var != null) {
                l6Var.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z) {
        boolean z2;
        l6b a;
        long[] jArr2 = jArr;
        int i = 0;
        while (true) {
            if (i >= jArr2.length) {
                z2 = true;
                break;
            }
            TLRPC.User X1 = uc7.s1(this.P).X1(Long.valueOf(jArr2[i]));
            if (X1 != null && !X1.stories_hidden) {
                z2 = false;
                break;
            }
            i++;
        }
        org.telegram.ui.ActionBar.e Q = Q();
        if (Q != null) {
            c6b O1 = uc7.s1(this.P).O1();
            ArrayList arrayList = new ArrayList(z2 ? O1.h : O1.g);
            boolean z3 = z2;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (!z3) {
                ArrayList arrayList4 = new ArrayList();
                for (int i2 = 0; i2 < jArr2.length; i2++) {
                    TLRPC.User X12 = uc7.s1(this.P).X1(Long.valueOf(jArr2[i2]));
                    if (X12 == null || !X12.stories_hidden) {
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
                    i4 = dze.c(i4, 1, jArr2[i4], arrayList3);
                }
            } else {
                while (i4 < jArr2.length) {
                    i4 = dze.c(i4, 1, jArr2[i4], arrayList2);
                }
            }
            if (!arrayList3.isEmpty() && z) {
                uc7 s1 = uc7.s1(this.P);
                int[] iArr = {arrayList3.size()};
                ls5 ls5Var = new ls5((Object) this, (Object) iArr, (Object) jArr2, (byte) 8);
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    long longValue = ((Long) arrayList3.get(i5)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer j1 = s1.j1(longValue);
                    tL_stories_getPeerStories.peer = j1;
                    if (j1 instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getPeerStories, new p87((Object) s1, longValue, (Object) ls5Var, (byte) 3));
                    }
                }
                return;
            }
            long e = yac.h(this.P).e();
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                long n = wf3.n(((TL_stories.PeerStories) arrayList.get(i6)).peer);
                if (n != e && !arrayList2.contains(Long.valueOf(n)) && O1.K(n)) {
                    arrayList2.add(Long.valueOf(n));
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            if (Q instanceof uj3) {
                try {
                    a = l6b.a(((uj3) Q).F0.h);
                } catch (Exception unused) {
                }
                l6b l6bVar = a;
                Q.getOrCreateStoryViewer().y();
                Q.getOrCreateStoryViewer().K(this, null, arrayList2, 0, null, null, l6bVar, false);
            }
            a = null;
            l6b l6bVar2 = a;
            Q.getOrCreateStoryViewer().y();
            Q.getOrCreateStoryViewer().K(this, null, arrayList2, 0, null, null, l6bVar2, false);
        }
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
    @Override // oj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(uj3 uj3Var, ArrayList arrayList, final CharSequence charSequence, boolean z, boolean z2, int i, final int i2, tzb tzbVar) {
        zu1 zu1Var;
        final zu1 zu1Var2;
        CharSequence charSequence2;
        boolean z3;
        r47 r47Var;
        zu1 zu1Var3;
        long j;
        long j2;
        k5 k5Var;
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
        final int currentAccount = uj3Var != null ? uj3Var.getCurrentAccount() : launchActivity4.P;
        Uri uri = launchActivity4.Y;
        boolean z10 = true;
        boolean z11 = false;
        if (uri != null) {
            ArrayList arrayList6 = launchActivity4.X != null ? new ArrayList(launchActivity4.X) : null;
            id idVar = new id(3, null, launchActivity4);
            r7a.B(currentAccount).P(((if7) arrayList5.get(0)).a, launchActivity4.Y, launchActivity4.X, new e16(launchActivity4, currentAccount, uj3Var, z, arrayList6, uri, idVar));
            try {
                idVar.q(300L);
            } catch (Exception unused) {
            }
            launchActivity3 = launchActivity4;
            r10 = 0;
        } else {
            uj3 uj3Var2 = uj3Var;
            final boolean z12 = uj3Var2 == null || uj3Var2.L2 || z2;
            int i7 = i != 0 ? i : uj3Var2 == null ? 0 : uj3Var2.M2;
            boolean z13 = uj3Var2 != null && uj3Var2.O2;
            if (arrayList5.size() <= 1) {
                long j3 = ((if7) arrayList5.get(0)).a;
                Bundle l = bs2.l("scrollToTopOnResume", true);
                if (!hl.O1()) {
                    jn7.f(currentAccount).k(jn7.s, new Object[0]);
                }
                if (wf3.B(j3)) {
                    l.putInt("enc_id", (int) (j3 & 4294967295L));
                } else if (wf3.D(j3)) {
                    l.putLong("user_id", j3);
                } else {
                    l.putLong("chat_id", -j3);
                }
                if (uc7.s1(currentAccount).C(l, uj3Var2, null, null)) {
                    zu1 zu1Var4 = new zu1(l);
                    ro4.a(zu1Var4, (if7) arrayList5.get(0));
                    zu1Var = zu1Var4;
                }
                return false;
            }
            zu1Var = null;
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
                if (jj.h(launchActivity4, launchActivity4.P, ((if7) arrayList5.get(i8)).a, size2 > 1)) {
                    return false;
                }
            }
            if (tzbVar != null) {
                tzbVar.removeSelfFromStack();
            }
            ArrayList arrayList11 = launchActivity4.b0;
            if (arrayList11 != null && arrayList11.size() == 1) {
                ArrayList arrayList12 = launchActivity4.e0;
                if (!arrayList12.isEmpty()) {
                    r78 r78Var = new r78((org.telegram.ui.ActionBar.e) c00.g(1, arrayList12), null, null, launchActivity4.c0, null, null, null, null, null);
                    zu1Var2 = zu1Var;
                    final int i9 = i7;
                    r78Var.E1 = new s22() { // from class: f16
                        @Override // s22
                        public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z14, int i10, long j4) {
                            r47 r47Var2;
                            TLRPC.TL_forumTopic f;
                            TLRPC.Message message2;
                            String str2 = LaunchActivity.C1;
                            zu1 zu1Var5 = zu1Var2;
                            if (zu1Var5 != null) {
                                ((ActionBarLayout) LaunchActivity.this.N()).U(zu1Var5, true, false);
                            }
                            k5 a = k5.a(yac.t0);
                            int i11 = a.a;
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList13 = arrayList5;
                                if (i12 >= arrayList13.size()) {
                                    return;
                                }
                                long j5 = ((if7) arrayList13.get(i12)).a;
                                long j6 = ((if7) arrayList13.get(i12)).b;
                                if (j6 == 0 || (f = uc7.s1(i11).g4.f(-j5, j6)) == null || (message2 = f.topicStartMessage) == null) {
                                    r47Var2 = null;
                                } else {
                                    r47Var2 = new r47(i11, message2, false, false);
                                    r47Var2.p = true;
                                }
                                r47 r47Var3 = r47Var2;
                                int i13 = i9;
                                int i14 = i10 != 0 ? i10 : i13;
                                int i15 = i2;
                                p7a g = p7a.g(tL_userContact_old2, j5, r47Var3, r47Var3, null, null, z14, i14, i15);
                                CharSequence charSequence11 = charSequence;
                                if (TextUtils.isEmpty(charSequence11)) {
                                    g.O = 0L;
                                }
                                g.L = false;
                                r7a.B(currentAccount).q0(g);
                                if (!TextUtils.isEmpty(charSequence11)) {
                                    r7a.Z(a, charSequence11, j5, 0L, z12, i10 != 0 ? i10 : i13, i15);
                                }
                                i12++;
                            }
                        }

                        @Override // s22
                        public final void a(ArrayList arrayList13, String str2, boolean z14, int i10, long j4, boolean z15) {
                        }
                    };
                    ((org.telegram.ui.ActionBar.e) c00.g(1, arrayList12)).showDialog(r78Var);
                    launchActivity3 = launchActivity4;
                    zu1 zu1Var5 = zu1Var2;
                    if (uj3Var != null && zu1Var5 == null && !z10) {
                        uj3Var.finishFragment();
                    }
                    r10 = 0;
                }
            }
            zu1Var2 = zu1Var;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence2 = charSequence;
            } else {
                launchActivity4.U = charSequence;
                charSequence2 = null;
            }
            Object[] objArr = uj3Var2 != null && uj3Var2.z3();
            if (objArr != false) {
                ArrayList arrayList13 = uj3Var2.F2;
                ArrayList arrayList14 = new ArrayList();
                if (arrayList13 != null) {
                    int size3 = arrayList13.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj = arrayList13.get(i10);
                        i10++;
                        no6 no6Var = (no6) obj;
                        q7a q7aVar = new q7a();
                        boolean z14 = no6Var.b;
                        if (z14 || (str = no6Var.h) == null) {
                            String str2 = no6Var.I;
                            if (str2 != null) {
                                q7aVar.c = str2;
                            }
                        } else {
                            q7aVar.c = str;
                        }
                        q7aVar.e = no6Var.c;
                        q7aVar.f = no6Var.g;
                        q7aVar.o = z14;
                        q7aVar.p = no6Var.d();
                        q7aVar.q = no6Var.j();
                        boolean z15 = z11;
                        q7aVar.z = no6Var.m;
                        q7aVar.A = no6Var.P;
                        CharSequence charSequence11 = no6Var.a;
                        q7aVar.d = charSequence11 != null ? charSequence11.toString() : null;
                        q7aVar.i = no6Var.n;
                        q7aVar.j = no6Var.r;
                        q7aVar.h = no6Var.x;
                        q7aVar.k = no6Var.s;
                        q7aVar.r = no6Var.L;
                        q7aVar.x = no6Var.c();
                        arrayList14.add(q7aVar);
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
                    ArrayList Y = ls6.d0(launchActivity4.P).Y(charSequenceArr, z16, true);
                    CharSequence charSequence13 = charSequenceArr[z16 ? 1 : 0];
                    String charSequence14 = charSequence13 == null ? null : charSequence13.toString();
                    for (int i11 = 0; i11 < launchActivity4.V.size(); i11++) {
                        q7a q7aVar2 = (q7a) launchActivity4.V.get(i11);
                        if (i11 == 0) {
                            q7aVar2.d = charSequence14;
                            q7aVar2.i = Y;
                        } else {
                            q7aVar2.d = null;
                            q7aVar2.i = null;
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
                long j4 = ((if7) arrayList5.get(i12)).a;
                long j5 = ((if7) arrayList5.get(i12)).b;
                k5 a = k5.a(yac.t0);
                int i13 = a.a;
                if (j5 != 0) {
                    z3 = z17;
                    TLRPC.TL_forumTopic f = uc7.s1(i13).g4.f(-j4, j5);
                    if (f != null && (message = f.topicStartMessage) != null) {
                        r47 r47Var2 = new r47(i13, message, false, false);
                        r47Var2.p = true;
                        r47Var = r47Var2;
                        if (zu1Var2 == null) {
                            ((ActionBarLayout) launchActivity4.N()).U(zu1Var2, uj3Var2 != null, uj3Var2 == null || launchActivity4.S != null || ((arrayList4 = launchActivity4.V) != null && arrayList4.size() > 0));
                            boolean z18 = uj3Var2 != null;
                            String str3 = launchActivity4.S;
                            if (str3 == null || j5 != 0 || objArr == true) {
                                ArrayList arrayList15 = launchActivity4.V;
                                if (arrayList15 == null || arrayList15.size() <= 0 || j5 != 0 || objArr == true) {
                                    boolean z19 = z13;
                                    z3 = z18;
                                    CharSequence charSequence16 = charSequence15;
                                    i3 = i13;
                                    zu1Var3 = zu1Var2;
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
                                        k5Var = a;
                                        r7a.V(k5Var, arrayList16, arrayList16, null, charSequence8, null, j2, r47Var, r47Var, z12, i7);
                                        z13 = z19;
                                        charSequence15 = charSequence8;
                                    } else {
                                        j2 = j4;
                                        k5Var = a;
                                        ArrayList arrayList17 = launchActivity4.V;
                                        if (arrayList17 == null || arrayList17.size() <= 0) {
                                            z13 = z19;
                                        } else {
                                            CharSequence charSequence19 = launchActivity4.U;
                                            if (charSequence19 != null && charSequence19.length() <= 1024 && launchActivity4.V.size() == 1) {
                                                CharSequence[] charSequenceArr2 = {launchActivity4.U};
                                                ((q7a) launchActivity4.V.get(0)).i = ls6.d0(launchActivity4.P).Y(charSequenceArr2, false, true);
                                                ((q7a) launchActivity4.V.get(0)).d = charSequenceArr2[0].toString();
                                                launchActivity4.U = null;
                                            }
                                            ArrayList arrayList18 = launchActivity4.V;
                                            int i14 = i7;
                                            r47 r47Var3 = r47Var;
                                            r7a.W(k5Var, arrayList18, j2, r47Var3, r47Var, null, null, z19, arrayList18.size() > 1, null, null, z12, i14, i2, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                            j2 = j2;
                                            z13 = z19;
                                            i7 = i14;
                                            r47Var = r47Var3;
                                        }
                                        charSequence15 = charSequence16;
                                    }
                                    z7 = false;
                                    z8 = false;
                                } else {
                                    ArrayList arrayList19 = launchActivity4.V;
                                    CharSequence charSequence20 = (charSequence2 == null || charSequence2.length() == 0) ? launchActivity4.U : charSequence2;
                                    boolean z20 = z13;
                                    ArrayList V5 = zu1.V5(arrayList19, zu1Var2.y(), charSequence20);
                                    if (V5.isEmpty()) {
                                        z3 = z18;
                                        charSequence9 = charSequence15;
                                        i3 = i13;
                                        z9 = false;
                                        zu1Var3 = zu1Var2;
                                        j = j5;
                                        charSequence10 = null;
                                    } else {
                                        if (zu1Var2.getParentActivity() != null) {
                                            boolean[] zArr = new boolean[V5.size()];
                                            Arrays.fill(zArr, true);
                                            z3 = z18;
                                            charSequence9 = charSequence15;
                                            PhotoViewer.q0().T1(null, zu1Var2, zu1Var2.Ba);
                                            PhotoViewer q0 = PhotoViewer.q0();
                                            ArrayList arrayList20 = new ArrayList(V5);
                                            int size4 = V5.size() - 1;
                                            vs1 vs1Var = new vs1(zu1Var2, V5, zArr);
                                            i3 = i13;
                                            zu1 zu1Var6 = zu1Var2;
                                            j = j5;
                                            q0.o1(arrayList20, size4, 0, false, vs1Var, zu1Var6);
                                            zu1Var3 = zu1Var6;
                                            charSequence10 = null;
                                        } else {
                                            z3 = z18;
                                            charSequence9 = charSequence15;
                                            i3 = i13;
                                            zu1Var3 = zu1Var2;
                                            j = j5;
                                            charSequence10 = null;
                                            zu1Var3.F6(charSequence20, null);
                                            zu1Var3.Cb(0, V5, false, false);
                                            zu1Var3.E4();
                                        }
                                        z9 = true;
                                    }
                                    if (z9) {
                                        launchActivity4.U = charSequence10;
                                    }
                                    charSequence15 = charSequence9;
                                    j2 = j4;
                                    k5Var = a;
                                    z7 = false;
                                    z8 = z9;
                                    z13 = z20;
                                }
                            } else {
                                zu1Var2.Ga(launchActivity4.U, str3);
                                launchActivity4.U = null;
                                z3 = z18;
                                j2 = j4;
                                i3 = i13;
                                z7 = true;
                                z8 = false;
                                zu1Var3 = zu1Var2;
                                k5Var = a;
                                j = j5;
                            }
                            z4 = z13;
                            z6 = z7;
                            z5 = z8;
                        } else {
                            zu1Var3 = zu1Var2;
                            j = j5;
                            CharSequence charSequence21 = charSequence15;
                            j2 = j4;
                            k5Var = a;
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
                                r7a.V(k5Var, arrayList21, arrayList21, null, charSequence3, null, j2, r47Var, r47Var, z12, i7);
                                charSequence15 = charSequence3;
                            } else {
                                charSequence15 = charSequence21;
                            }
                            if (launchActivity4.V != null) {
                                CharSequence charSequence24 = launchActivity4.U;
                                if (charSequence24 != null && charSequence24.length() <= 1024 && launchActivity4.V.size() == 1) {
                                    CharSequence[] charSequenceArr3 = {launchActivity4.U};
                                    ((q7a) launchActivity4.V.get(0)).i = ls6.d0(launchActivity4.P).Y(charSequenceArr3, false, true);
                                    ((q7a) launchActivity4.V.get(0)).d = charSequenceArr3[0].toString();
                                    launchActivity4.U = null;
                                }
                                ArrayList arrayList22 = launchActivity4.V;
                                int i15 = i7;
                                r47 r47Var4 = r47Var;
                                boolean z21 = z13;
                                r7a.W(k5Var, arrayList22, j2, r47Var4, r47Var, null, null, z21, arrayList22.size() > 1, null, null, z12, i15, i2, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                j2 = j2;
                                z4 = z21;
                                i7 = i15;
                                r47Var = r47Var4;
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
                            r7a.V(k5Var, launchActivity4.W, launchActivity4.a0, launchActivity4.X, charSequence25, launchActivity4.Z, j2, r47Var, r47Var, z12, i7);
                            charSequence5 = charSequence25;
                        } else {
                            charSequence5 = charSequence15;
                        }
                        k5 k5Var2 = k5Var;
                        if (launchActivity4.T != null) {
                            File file = new File(launchActivity4.T);
                            if (file.exists()) {
                                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                                tL_document.file_reference = new byte[0];
                                tL_document.dc_id = TLObject.FLAG_31;
                                tL_document.id = xea.p();
                                tL_document.user_id = yac.h(i3).e();
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
                                ArrayList Y2 = ls6.d0(launchActivity4.P).Y(charSequenceArr4, false, true);
                                r7a B = r7a.B(i3);
                                String absolutePath = file.getAbsolutePath();
                                CharSequence charSequence26 = charSequenceArr4[0];
                                long j6 = j2;
                                r47 r47Var5 = r47Var;
                                int i16 = i7;
                                p7a f2 = p7a.f(tL_document, null, absolutePath, j6, r47Var5, r47Var, charSequence26 == null ? null : charSequence26.toString(), Y2, null, null, z12, i16, i2, 0, null, null, false);
                                j2 = j6;
                                r47Var = r47Var5;
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
                                    C0(k5Var2, uj3Var2, charSequence6, j2, r47Var, j7, z12, i7, i2);
                                } else {
                                    i5 = i4;
                                }
                                arrayList3 = launchActivity.b0;
                                if (arrayList3 != null && !arrayList3.isEmpty()) {
                                    i6 = i5;
                                    while (i6 < launchActivity.b0.size()) {
                                        TLRPC.User user = (TLRPC.User) launchActivity.b0.get(i6);
                                        r7a B2 = r7a.B(currentAccount);
                                        long j8 = j2;
                                        r47 r47Var6 = r47Var;
                                        p7a g = p7a.g(user, j8, r47Var6, r47Var, null, null, z12, i7, i2);
                                        j2 = j8;
                                        r47Var = r47Var6;
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
                                    C0(k5Var2, uj3Var, charSequence7, j2, r47Var, j7, z12, i7, i2);
                                }
                                i12++;
                                uj3Var2 = uj3Var;
                                arrayList5 = arrayList;
                                charSequence2 = charSequence7;
                                zu1Var2 = zu1Var3;
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
                        uj3Var2 = uj3Var;
                        arrayList5 = arrayList;
                        charSequence2 = charSequence7;
                        zu1Var2 = zu1Var3;
                        launchActivity4 = launchActivity2;
                        z13 = z4;
                        z17 = z22;
                        charSequence15 = charSequence5;
                    }
                } else {
                    z3 = z17;
                }
                r47Var = null;
                if (zu1Var2 == null) {
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
                r7a.V(k5Var, launchActivity4.W, launchActivity4.a0, launchActivity4.X, charSequence252, launchActivity4.Z, j2, r47Var, r47Var, z12, i7);
                charSequence5 = charSequence252;
                k5 k5Var22 = k5Var;
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
                uj3Var2 = uj3Var;
                arrayList5 = arrayList;
                charSequence2 = charSequence7;
                zu1Var2 = zu1Var3;
                launchActivity4 = launchActivity2;
                z13 = z4;
                z17 = z222;
                charSequence15 = charSequence5;
            }
            z10 = z17;
            launchActivity3 = launchActivity4;
            zu1 zu1Var52 = zu1Var2;
            if (uj3Var != null) {
                uj3Var.finishFragment();
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

    public final void q0(final int i, final long j, final boolean z) {
        TL_stories.StoryItem storyItem;
        u5b u5bVar;
        u5b z2;
        r47 f;
        r47 f2;
        TL_stories.StoryItem storyItem2;
        c6b O1 = uc7.s1(this.P).O1();
        TL_stories.PeerStories x = O1.x(j);
        l6b l6bVar = null;
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
                org.telegram.ui.ActionBar.e Q = Q();
                if (Q != null) {
                    if (Q instanceof uj3) {
                        try {
                            l6bVar = l6b.a(((uj3) Q).F0.h);
                        } catch (Exception unused) {
                        }
                    }
                    l6b l6bVar2 = l6bVar;
                    Q.getOrCreateStoryViewer().y();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z) {
                        Q.getOrCreateStoryViewer().w1 = true;
                    }
                    Q.getOrCreateStoryViewer().K(this, storyItem2, arrayList, 0, null, x, l6bVar2, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            u5b z3 = O1.z(0, -1, j, true);
            if (z3 == null || (f2 = z3.f(i)) == null) {
                z3 = null;
            } else {
                storyItem = f2.l;
            }
            if (storyItem != null || (z2 = O1.z(1, -1, j, true)) == null || (f = z2.f(i)) == null) {
                u5bVar = z3;
            } else {
                storyItem = f.l;
                u5bVar = z2;
            }
            if (storyItem != null && u5bVar != null) {
                storyItem.dialogId = j;
                org.telegram.ui.ActionBar.e Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof uj3) {
                    try {
                        l6bVar = l6b.a(((uj3) Q2).F0.h);
                    } catch (Exception unused2) {
                    }
                }
                l6b l6bVar3 = l6bVar;
                Q2.getOrCreateStoryViewer().y();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z) {
                    Q2.getOrCreateStoryViewer().w1 = true;
                }
                Q2.getOrCreateStoryViewer().K(this, storyItem, arrayList2, 0, u5bVar, null, l6bVar3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = uc7.s1(this.P).j1(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: i16
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.C1;
                hl.c3(new kn3(LaunchActivity.this, tLObject, i, j, z));
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, znb znbVar) {
        int i = znbVar.g0;
        ynb d = znbVar.d(tL_theme, this.P, 0);
        znbVar.a0 = znbVar.Z;
        znbVar.u(d.a);
        d.s = tL_wallPaper;
        t0(new pqb(znbVar, i != znbVar.g0, 0, false, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r7 == null) goto L28;
     */
    @Override // oj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(uj3 uj3Var) {
        c8b l;
        FileOutputStream fileOutputStream;
        ArrayList arrayList = this.V;
        if (arrayList == null || arrayList.isEmpty()) {
            String str = this.S;
            if (str != null) {
                no6 no6Var = new no6(0, str, 0, true, 0, 0);
                try {
                    Bitmap q = r7a.q(1, str);
                    File file = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            q.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            no6Var.c = file.getAbsolutePath();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                cc4.g(th, true);
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
                l = c8b.l(no6Var);
            }
            l = null;
        } else {
            ArrayList V5 = zu1.V5(this.V, false, null);
            if (!V5.isEmpty()) {
                l = c8b.l((no6) V5.get(0));
            }
            l = null;
        }
        if (l == null) {
            return false;
        }
        xx n = uc7.s1(this.P).O1().n();
        if (n != null && n.a(this.P, 1)) {
            uj3Var.showDialog(new l46(n.b(), this.P, null, this, uj3Var));
            return false;
        }
        l.o = true;
        l.M = false;
        rbb.C(this, this.P).R(null, l, 0L);
        uj3Var.finishFragment();
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
            tL_forumTopic2 = uc7.s1(i).g4.f(chat.id, i6);
        } else {
            i6 = i2;
            tL_forumTopic2 = tL_forumTopic;
        }
        if (tL_forumTopic2 == null) {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
            tL_messages_getForumTopicsByID.peer = uc7.s1(this.P).j1(-chat.id);
            tL_messages_getForumTopicsByID.topics.add(Integer.valueOf(i6));
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() { // from class: u06
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
                    hl.c3(new Runnable() { // from class: x06
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str4 = LaunchActivity.C1;
                            if (tL_error == null) {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                zh6 zh6Var = new zh6();
                                for (int i12 = 0; i12 < tL_messages_forumTopics.messages.size(); i12++) {
                                    zh6Var.k(tL_messages_forumTopics.messages.get(i12).id, tL_messages_forumTopics.messages.get(i12));
                                }
                                int i13 = i7;
                                uc7.s1(i13).j4(tL_messages_forumTopics.users, false);
                                uc7.s1(i13).c4(tL_messages_forumTopics.chats, false);
                                qyb qybVar = uc7.s1(i13).g4;
                                TLRPC.Chat chat3 = chat2;
                                qybVar.u(chat3.id, tL_messages_forumTopics.topics, zh6Var, false, 2, -1);
                                qyb qybVar2 = uc7.s1(i13).g4;
                                long j = chat3.id;
                                int i14 = i8;
                                LaunchActivity.this.s0(i13, i14, chat3, i9, qybVar2.f(j, i14), runnable2, str3, num2, bArr2, i10, arrayList3, i11);
                            }
                        }
                    });
                }
            });
            return;
        }
        ArrayList arrayList3 = this.e0;
        org.telegram.ui.ActionBar.e eVar = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.e) c00.g(1, arrayList3) : null;
        if (eVar instanceof zu1) {
            zu1 zu1Var = (zu1) eVar;
            if (zu1Var.a() == (-chat.id) && zu1Var.x4 && zu1Var.c() == tL_forumTopic2.id) {
                if (str != null) {
                    zu1Var.Lb(i3, i5, str);
                }
                zu1Var.i8 = num;
                zu1Var.tb(i3, i4, true, 0, true, 0, null, null, null);
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
        zu1 zu1Var2 = new zu1(bundle);
        if (arrayList.isEmpty()) {
            TLRPC.Message message = new TLRPC.Message();
            message.id = 1;
            message.action = new TLRPC.TL_messageActionChannelMigrateFrom();
            arrayList2 = arrayList;
            arrayList2.add(new r47(i, message, false, false));
        } else {
            arrayList2 = arrayList;
        }
        zu1Var2.Ob(arrayList2, chat, i3, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i3 != tL_forumTopic2.id) {
            if (str != null) {
                zu1Var2.Lb(i3, i5, str);
            } else {
                zu1Var2.i8 = num;
                zu1Var2.d8 = i3;
            }
            zu1Var2.tb(i3, i4, true, 0, true, 0, null, null, null);
        }
        t0(zu1Var2);
        if (runnable == null) {
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        hl.g = -10;
        hl.h = -10;
        hl.i = null;
        super.setRequestedOrientation(i);
    }

    public final void t0(org.telegram.ui.ActionBar.e eVar) {
        ((ActionBarLayout) N()).S(eVar);
    }

    public final boolean u0(org.telegram.ui.ActionBar.e eVar, boolean z, boolean z2) {
        return ((ActionBarLayout) N()).U(eVar, z, z2);
    }

    public final void v0(long j) {
        byte b = 0;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i >= arrayList.size()) {
                org.telegram.ui.ActionBar.e S = S();
                if (S != null && S.sheetsStack != null) {
                    for (int i2 = 0; i2 < S.sheetsStack.size(); i2++) {
                        if (S.sheetsStack.get(i2).s()) {
                            S.sheetsStack.get(i2);
                        }
                    }
                }
                s24 v = this.p0.v();
                if (v != null && v.sheetsStack != null) {
                    for (int i3 = 0; i3 < v.sheetsStack.size(); i3++) {
                        if (v.sheetsStack.get(i3).s()) {
                            v.sheetsStack.get(i3);
                        }
                    }
                }
                j16 j16Var = new j16(this, b);
                TLRPC.User X1 = uc7.s1(this.P).X1(Long.valueOf(j));
                if (X1 != null) {
                    j16Var.a(X1);
                    return;
                } else {
                    jf7.Y(this.P).a.c(new ue2((Object) this, j, (Object) j16Var, (byte) 27));
                    return;
                }
            }
            if (arrayList.get(i) instanceof xw0) {
                xw0 xw0Var = (xw0) arrayList.get(i);
                if (xw0Var.isShowing() && xw0Var.J == j) {
                    return;
                }
            }
            i++;
        }
    }

    public final void w0(Long l, tg5 tg5Var, l01 l01Var, wb2 wb2Var) {
        xg1 G0 = uc7.s1(this.P).G0();
        if (l01Var != null) {
            l01Var.d();
        }
        G0.a(l.longValue(), new o45(this, l01Var, tg5Var, G0, l, wb2Var, (byte) 2));
    }

    public final void x0(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, String str26, final String str27, final l01 l01Var, final boolean z3, final int i4, final int i5, final int i6, final boolean z4, final String str28, final TLRPC.User user, final tg5 tg5Var, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final String str29, final boolean z12) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = uc7.s1(i).q1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getBotApp, new RequestDelegate() { // from class: i06
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str30 = LaunchActivity.C1;
                final l01 l01Var2 = l01Var;
                if (l01Var2 != null) {
                    l01Var2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i7 = i;
                final boolean z13 = z3;
                final boolean z14 = z7;
                final boolean z15 = z8;
                final boolean z16 = z9;
                if (tL_error == null) {
                    final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                    final tg5 tg5Var2 = tg5Var;
                    final TLRPC.User user2 = user;
                    final String str31 = str27;
                    final boolean z17 = z6;
                    final boolean z18 = z5;
                    hl.c3(new Runnable() { // from class: p06
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str32 = LaunchActivity.C1;
                            tg5Var2.run();
                            AtomicBoolean atomicBoolean = new AtomicBoolean();
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            ArrayList arrayList = launchActivity2.e0;
                            e eVar = (arrayList == null || arrayList.isEmpty()) ? null : (e) c00.g(1, arrayList);
                            int i8 = i7;
                            TLRPC.User user3 = user2;
                            TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                            String str33 = str31;
                            boolean z19 = z14;
                            boolean z20 = z15;
                            boolean z21 = z16;
                            boolean z22 = z13;
                            w06 w06Var = new w06(launchActivity2, eVar, i8, user3, tL_messages_botApp2, atomicBoolean, str33, z19, z20, z21, z22);
                            if (z17) {
                                w06Var.run();
                                return;
                            }
                            if (tL_messages_botApp2.inactive && z18) {
                                zj3 zj3Var = new zj3(w06Var, (byte) 20);
                                l01 l01Var3 = l01Var2;
                                exc.a(launchActivity2, zj3Var, l01Var3 != null ? new ea5(l01Var3, (byte) 22) : null);
                            } else if (tL_messages_botApp2.request_write_access || z22) {
                                jj.m(eVar, atomicBoolean, user3, w06Var);
                            } else {
                                w06Var.run();
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
                hl.c3(new Runnable() { // from class: o06
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
                        launchActivity2.B0(i13, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, z26, num5, l5, l6, num6, str72, hashMap3, str73, str74, str75, str76, tL_wallPaper3, str77, str78, str79, str80, z27, str81, z28 ? 1 : 0, i8, str54, str55, str56, null, null, l01Var2, z13, i9, false, i10, i11, null, null, z22, str57, z14, z15, z16, z23, z24, str58, null, z25, null);
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
        ofArgb.addUpdateListener(new h16(this, (byte) 1));
        this.z1.addListener(new dn(this, i, (byte) 6));
        this.z1.setInterpolator(k43.h);
        this.z1.setDuration(320L);
        this.z1.start();
    }

    public final int z0(final int i, final tg5 tg5Var, final Integer num, final Integer num2, final Long l, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i2, final int i3) {
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = uc7.l1(chat);
        tL_messages_getDiscussionMessage.msg_id = num2 != null ? num.intValue() : (int) l.longValue();
        return ConnectionsManager.getInstance(i).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() { // from class: tz5
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
                final tg5 tg5Var2 = tg5Var;
                hl.c3(new Runnable() { // from class: k06
                    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(5:3|(1:5)|6|7|(5:14|(3:16|(1:18)|19)(3:33|(1:(1:36)(1:(1:39)(1:40)))(1:(1:(1:43)(1:(1:45)(1:46))))|37)|20|(2:31|32)|(2:23|29)(1:30)))|47|48|(1:50)|20|(0)|(0)(0)|(1:(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
                    
                        cc4.g(r0, true);
                     */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x014e A[Catch: Exception -> 0x0152, TRY_LEAVE, TryCatch #0 {Exception -> 0x0152, blocks: (B:32:0x0149, B:23:0x014e), top: B:31:0x0149 }] */
                    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        tg5 tg5Var3;
                        String str4 = LaunchActivity.C1;
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.e0;
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TLRPC.TL_messages_discussionMessage;
                        Runnable runnable3 = runnable2;
                        if (z) {
                            TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            int i7 = i4;
                            uc7.s1(i7).j4(tL_messages_discussionMessage.users, false);
                            uc7.s1(i7).c4(tL_messages_discussionMessage.chats, false);
                            ArrayList arrayList2 = new ArrayList();
                            int size = tL_messages_discussionMessage.messages.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                arrayList2.add(new r47(yac.t0, tL_messages_discussionMessage.messages.get(i8), true, true));
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
                                    bundle.putLong("chat_id", -r47.B0(((r47) arrayList2.get(0)).k));
                                    bundle.putInt("message_id", Math.max(1, num8.intValue()));
                                    zu1 zu1Var = new zu1(bundle);
                                    zu1Var.Ob(arrayList2, chat3, tL_messages_getDiscussionMessage2.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
                                    if (num7 != null) {
                                        if (bArr3 != null) {
                                            zu1Var.j8 = bArr3;
                                            zu1Var.d8 = num7.intValue();
                                        } else if (str5 != null) {
                                            zu1Var.Lb(num7.intValue(), i9, str5);
                                        } else {
                                            zu1Var.i8 = num9;
                                            zu1Var.d8 = num7.intValue();
                                        }
                                    } else if (l3 != null) {
                                        if (bArr3 != null) {
                                            zu1Var.j8 = bArr3;
                                            zu1Var.d8 = num8.intValue();
                                        } else if (str5 != null) {
                                            zu1Var.Lb(num8.intValue(), i9, str5);
                                        } else {
                                            zu1Var.i8 = num9;
                                            zu1Var.d8 = num8.intValue();
                                        }
                                    }
                                    launchActivity2.t0(zu1Var);
                                }
                                tg5Var3 = tg5Var2;
                                if (tg5Var3 != null) {
                                    try {
                                        tg5Var3.run();
                                    } catch (Exception e) {
                                        cc4.g(e, true);
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
                            d31.b0((e) arrayList.get(arrayList.size() - 1)).t(ob6.M0(2131752300, null), null).j();
                        }
                        tg5Var3 = tg5Var2;
                        if (tg5Var3 != null) {
                        }
                        if (runnable3 == null) {
                        }
                    }
                });
            }
        });
    }

    @Override // sk5
    public final void e(int[] iArr) {
    }
}
