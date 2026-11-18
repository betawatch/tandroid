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
import org.telegram.messenger.g0;
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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class LaunchActivity extends g5 implements org.telegram.ui.ActionBar.p4, org.telegram.messenger.fs, ww {
    public static final String C1 = UUID.randomUUID().toString();
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static LaunchActivity H1;
    public static Pattern I1;
    public static z J1;
    public static LaunchActivity K1;
    public di.oc A1;
    public org.telegram.ui.Components.uy0 B0;
    public int B1;
    public org.telegram.ui.Components.y9 C0;
    public org.telegram.ui.ActionBar.u1 E0;
    public View F0;
    public org.telegram.ui.ActionBar.u1 G0;
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
    public org.telegram.ui.ActionBar.m6 S0;
    public String T;
    public TLRPC.TL_theme T0;
    public CharSequence U;
    public boolean U0;
    public ArrayList V;
    public org.telegram.ui.ActionBar.u1 V0;
    public ArrayList W;
    public ArrayList X;
    public boolean X0;
    public Uri Y;
    public bi.n8 Y0;
    public String Z;
    public m4 Z0;
    public ArrayList a0;
    public ArrayList b0;
    public Uri c0;
    public int d0;
    public org.telegram.messenger.n6 e1;
    public androidx.mediarouter.app.f f1;
    public rh.d g1;
    public z70 h0;
    public boolean h1;
    public ArrayList i0;
    public bg.c0 i1;
    public ArrayList j0;
    public w80 j1;
    public String k0;
    public x80 k1;
    public ActionMode l0;
    public boolean l1;
    public boolean m0;
    public xi.e m1;
    public org.telegram.ui.Components.g01 n0;
    public xi.e n1;
    public kg.k o0;
    public ActionBarLayout p0;
    public y70 p1;
    public ActionBarLayout q0;
    public hi.t6 q1;
    public ActionBarLayout r0;
    public boolean r1;
    public y80 s0;
    public ViewGroup s1;
    public FrameLayout t0;
    public final hi0 t1;
    public v8 u0;
    public org.telegram.ui.ActionBar.u1 u1;
    public k0 v0;
    public org.telegram.ui.ActionBar.u1 v1;
    public u80 w0;
    public boolean w1;
    public org.telegram.ui.ActionBar.n3 x0;
    public long x1;
    public org.telegram.ui.ActionBar.p3 y0;
    public int[] y1;
    public org.telegram.ui.Components.rc0 z0;
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
    public final s80 d1 = new s80();
    public boolean o1 = true;

    public LaunchActivity() {
        System.identityHashCode(this);
        this.t1 = new hi0(this);
        this.B1 = 0;
    }

    public static void C0(org.telegram.messenger.c cVar, cx cxVar, CharSequence charSequence, long j3, org.telegram.messenger.fj fjVar, long j10, boolean z10, int i7, int i10) {
        org.telegram.ui.Components.cp0 cp0Var;
        org.telegram.ui.Components.cp0 cp0Var2;
        int i11 = cVar.a;
        boolean z11 = cxVar == null || (cp0Var2 = cxVar.I2) == null || cp0Var2.n;
        TLRPC.WebPage webPage = null;
        if (z11 && cxVar != null && (cp0Var = cxVar.I2) != null) {
            webPage = cp0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (webPage2 == null && z11) {
            org.telegram.messenger.zy.a0(cVar, charSequence, j3, j10, z10, i7, i10);
            return;
        }
        CharSequence H = org.telegram.messenger.zy.H(charSequence);
        if (H == null || H.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = {H};
        org.telegram.messenger.zy.C(i11).r0(org.telegram.messenger.xy.b(charSequenceArr[0].toString(), j3, fjVar, fjVar, webPage2, z11, org.telegram.messenger.ri.d0(i11).Y(charSequenceArr, true, true), null, null, z10, i7, i10, null, false));
    }

    public static void D(int i7) {
        LaunchActivity launchActivity = K1;
        if (launchActivity != null) {
            launchActivity.C(i7);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i7, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        org.telegram.ui.ActionBar.h2 Q = Q();
        if (Q == null) {
            return;
        }
        long j3 = tL_attachMenuBot.bot_id;
        ki.f4 b10 = ki.f4.b(i7, j3, j3, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
        if (launchActivity.N() == null || launchActivity.N().k(b10) == null) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(tL_attachMenuBot.bot_id));
            String H12 = c22 == null ? null : org.telegram.messenger.mp.u1(i7).H1(c22.restriction_reason);
            if (!TextUtils.isEmpty(H12)) {
                org.telegram.messenger.mp.u1(i7);
                org.telegram.messenger.mp.d5(H12, Q);
                return;
            }
            ki.t2 t2Var = new ki.t2(launchActivity, Q.getResourceProvider());
            t2Var.C0 = false;
            t2Var.B(z10);
            t2Var.m0 = launchActivity;
            t2Var.x(Q, b10);
            t2Var.show();
        }
    }

    public static void J() {
        ArrayList<org.telegram.ui.ActionBar.d2> arrayList;
        org.telegram.ui.ActionBar.h2 T = T();
        if (T == null) {
            return;
        }
        ox x10 = T.getParentLayout() instanceof ActionBarLayout ? ((ActionBarLayout) T.getParentLayout()).x() : null;
        if (x10 != null && (arrayList = x10.sheetsStack) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                x10.sheetsStack.get(size).a(true);
            }
        }
        ArrayList<org.telegram.ui.ActionBar.d2> arrayList2 = T.sheetsStack;
        if (arrayList2 != null) {
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                T.sheetsStack.get(size2).a(true);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ki.t2.b1.iterator();
        while (it.hasNext()) {
            arrayList3.add((ki.t2) it.next());
        }
        int size3 = arrayList3.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj = arrayList3.get(i7);
            i7++;
            ((ki.t2) obj).o(true);
        }
    }

    public static org.telegram.ui.ActionBar.h2 L() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.s4) i5.c.h(1, H1.Q))).t();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.M() == null) {
            return null;
        }
        return ((ActionBarLayout) H1.M()).t();
    }

    public static org.telegram.ui.ActionBar.h2 Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.s4) i5.c.h(1, H1.Q)).getLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.M() == null) {
            return null;
        }
        return H1.M().getLastFragment();
    }

    public static org.telegram.ui.ActionBar.h2 T() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.s4) i5.c.h(1, H1.Q)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.M() == null) {
            return null;
        }
        return H1.M().getSafeLastFragment();
    }

    public static String U(int i7, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        return str2 == null ? org.telegram.messenger.gd.M0(i7, str) : str2;
    }

    public static int V(Uri uri) {
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
                int i7 = 0;
                int parseInt = TextUtils.isEmpty(group) ? 0 : Integer.parseInt(group);
                int parseInt2 = TextUtils.isEmpty(group2) ? 0 : Integer.parseInt(group2);
                int parseInt3 = TextUtils.isEmpty(group3) ? 0 : Integer.parseInt(group3);
                if (!TextUtils.isEmpty(group4)) {
                    i7 = Integer.parseInt(group4);
                }
                return (parseInt * 86400) + (parseInt2 * 3600) + (parseInt3 * 60) + i7;
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return -1;
            }
        }
    }

    public static void Z(View view) {
        if (view.getLayerType() != 0) {
            view.invalidate();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                Z(viewGroup.getChildAt(i7));
            }
        }
    }

    public static void b0(float f10, float f11, float f12) {
        View decorView;
        di.oc ocVar;
        LaunchActivity launchActivity = H1;
        if (launchActivity == null || (decorView = launchActivity.getWindow().getDecorView()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && ((ocVar = launchActivity.A1) == null || ((View) ocVar.a) != decorView)) {
            launchActivity.A1 = new di.oc(decorView);
        }
        di.oc ocVar2 = launchActivity.A1;
        if (ocVar2 != null) {
            View view = (View) ocVar2.a;
            ArrayList arrayList = ocVar2.b;
            if (arrayList.size() >= 7) {
                return;
            }
            float max = (Math.max(Math.max(a8.w9.a(0.0f, 0.0f, f10, f11), a8.w9.a(view.getWidth(), 0.0f, f10, f11)), Math.max(a8.w9.a(0.0f, view.getHeight(), f10, f11), a8.w9.a(view.getWidth(), view.getHeight(), f10, f11))) * 2.0f) / (org.telegram.messenger.g0.p * 1200.0f);
            int i7 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
            di.nc ncVar = new di.nc(f10, f11, f12);
            ofFloat.addUpdateListener(new ch.w(i7, ocVar2, ncVar));
            ofFloat.addListener(new ah.l(i7, ocVar2, ncVar));
            ofFloat.setInterpolator(org.telegram.ui.Components.lr.g);
            ofFloat.setDuration((long) (max * 1000.0f));
            arrayList.add(ncVar);
            ocVar2.f1();
            ofFloat.start();
        }
    }

    public final void A() {
        if (this.P != org.telegram.messenger.j10.t0 || this.m1 == null) {
            xi.e eVar = this.m1;
            if (eVar != null) {
                eVar.b();
                this.m1 = null;
            }
            int i7 = org.telegram.messenger.j10.t0;
            this.P = i7;
            xi.e eVar2 = new xi.e(org.telegram.messenger.ks.f(i7), this);
            eVar2.c(org.telegram.messenger.ks.p3);
            eVar2.c(org.telegram.messenger.ks.I2);
            eVar2.c(org.telegram.messenger.ks.j0);
            eVar2.c(org.telegram.messenger.ks.Z4);
            eVar2.c(org.telegram.messenger.ks.T1);
            eVar2.c(org.telegram.messenger.ks.M0);
            eVar2.c(org.telegram.messenger.ks.R0);
            eVar2.c(org.telegram.messenger.ks.c1);
            eVar2.c(org.telegram.messenger.ks.Q);
            eVar2.c(org.telegram.messenger.ks.N0);
            eVar2.c(org.telegram.messenger.ks.Y1);
            eVar2.c(org.telegram.messenger.ks.Z1);
            eVar2.c(org.telegram.messenger.ks.v1);
            eVar2.c(org.telegram.messenger.ks.w2);
            eVar2.c(org.telegram.messenger.ks.x1);
            eVar2.c(org.telegram.messenger.ks.l5);
            eVar2.c(org.telegram.messenger.ks.i5);
            eVar2.c(org.telegram.messenger.ks.u5);
            eVar2.c(org.telegram.messenger.ks.T5);
            this.m1 = eVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f2, code lost:
    
        if (r9 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r0 = new java.io.BufferedReader(new java.io.InputStreamReader(r9));
        r10 = new java.lang.StringBuilder();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r12 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r12 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r11 >= 100) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        r10.append(r12);
        r10.append('\n');
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        r1 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        r9.closeEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00df, code lost:
    
        if (r9 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e1, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e6, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(Uri uri) {
        Throwable th2;
        InputStream inputStream;
        int i7 = org.telegram.messenger.j10.t0;
        InputStream inputStream2 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        String str = null;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, this, null);
        int[] iArr = {0};
        String q10 = org.telegram.messenger.w7.q(MediaController.A(uri));
        if (q10 == null || !q10.endsWith(".zip")) {
            try {
                inputStream = getContentResolver().openInputStream(uri);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = 0;
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null || i10 >= 100) {
                                break;
                            }
                            sb2.append(readLine);
                            sb2.append('\n');
                            i10++;
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
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            throw th2;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    org.telegram.messenger.a8.g(e, true);
                }
            } catch (Exception e12) {
                e = e12;
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
                                } catch (Exception e13) {
                                    org.telegram.messenger.a8.g(e13, true);
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
                    } catch (Exception e14) {
                        e = e14;
                        str = null;
                        try {
                            org.telegram.messenger.a8.g(e, true);
                        } catch (Exception e15) {
                            org.telegram.messenger.a8.g(e15, true);
                        }
                        if (str != null) {
                        }
                    }
                }
            } catch (Exception e16) {
                e = e16;
            }
        }
        if (str != null) {
            return;
        }
        TLRPC.TL_messages_checkHistoryImport tL_messages_checkHistoryImport = new TLRPC.TL_messages_checkHistoryImport();
        tL_messages_checkHistoryImport.import_head = str;
        iArr[0] = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_checkHistoryImport, new fi.y7(this, uri, i7, u1Var, 6));
        u1Var.setOnCancelListener(new tx(i7, 1, iArr));
        try {
            u1Var.r(300L);
        } catch (Exception unused) {
        }
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.i1 == null && org.telegram.messenger.bz.p) {
                this.i1 = bg.c0.b(this, this.v0);
            }
            bg.c0 c0Var = this.i1;
            if (c0Var == null || org.telegram.messenger.bz.p) {
                return;
            }
            c0Var.c();
            this.i1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(final int i7, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i10, final int i11, final String str23, final String str24, final String str25, final String str26, final String str27, final vf.b bVar, final boolean z12, final int i12, final boolean z13, final int i13, final int i14, final String str28, final String str29, final boolean z14, final String str30, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final String str31, final Integer num3, final boolean z20, final byte[] bArr) {
        final LaunchActivity launchActivity;
        o60 o60Var;
        final int i15;
        org.telegram.ui.ActionBar.u1 u1Var;
        final int i16;
        int[] iArr;
        org.telegram.ui.Components.bv bvVar;
        org.telegram.ui.Components.iw0 iw0Var;
        TLRPC.Chat chat;
        int i17 = 2;
        if (i10 == 0 && org.telegram.messenger.j10.c() >= 2 && hashMap != null) {
            org.telegram.ui.Components.b5.i(this, new org.telegram.ui.Components.x4() { // from class: org.telegram.ui.i80
                @Override // org.telegram.ui.Components.x4
                public final void a(int i18) {
                    String str32 = LaunchActivity.C1;
                    LaunchActivity launchActivity2 = LaunchActivity.this;
                    if (i18 != i7) {
                        launchActivity2.O0(i18);
                    }
                    launchActivity2.B0(i18, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z10, num, l10, l11, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z11, str22, 1, i11, str23, str24, str25, str26, str27, bVar, z12, i12, z13, i13, i14, str28, str29, z14, str30, z15, z16, z17, z18, z19, str31, num3, z20, bArr);
                }
            }).show();
            return;
        }
        final vf.b bVar2 = bVar;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        final int i18 = 0;
        if (str16 != null) {
            SparseArray sparseArray = org.telegram.messenger.ks.e().a;
            int i19 = org.telegram.messenger.ks.j4;
            if (sparseArray.indexOfKey(i19) >= 0) {
                org.telegram.messenger.ks.e().k(i19, str16);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
            u1Var2.S = M0;
            u1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131747574, str16));
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
            F0(alertDialog$Builder);
            return;
        }
        if (str17 != null) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            String M02 = org.telegram.messenger.gd.M0(2131753892, null);
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
            u1Var3.S = M02;
            u1Var3.U = org.telegram.messenger.gd.M0(2131753882, null);
            alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131747638, null), null);
            F0(alertDialog$Builder2);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var4 = new org.telegram.ui.ActionBar.u1(3, this, null);
        final o60 o60Var2 = new o60(9, bVar2, u1Var4);
        final int[] iArr2 = {0};
        if (str10 != null) {
            TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
            tL_contacts_importContactToken.token = str10;
            final int i20 = 0;
            iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_importContactToken, new RequestDelegate(this) { // from class: org.telegram.ui.k80
                public final /* synthetic */ LaunchActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i20) {
                        case 0:
                            String str32 = LaunchActivity.C1;
                            org.telegram.messenger.g0.g3(new r60(this.b, tLObject, i7, str10, tL_error, o60Var2));
                            break;
                        case 1:
                            String str33 = LaunchActivity.C1;
                            org.telegram.messenger.g0.g3(new ai.g1(this.b, tLObject, i7, str10, o60Var2, 22));
                            break;
                        default:
                            String str34 = LaunchActivity.C1;
                            org.telegram.messenger.g0.g3(new r60(this.b, tL_error, tLObject, i7, str10, o60Var2));
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
                iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(tL_chatlists_checkChatlistInvite, new RequestDelegate(this) { // from class: org.telegram.ui.k80
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i21) {
                            case 0:
                                String str32 = LaunchActivity.C1;
                                org.telegram.messenger.g0.g3(new r60(this.b, tLObject, i7, str11, tL_error, o60Var2));
                                break;
                            case 1:
                                String str33 = LaunchActivity.C1;
                                org.telegram.messenger.g0.g3(new ai.g1(this.b, tLObject, i7, str11, o60Var2, 22));
                                break;
                            default:
                                String str34 = LaunchActivity.C1;
                                org.telegram.messenger.g0.g3(new r60(this.b, tL_error, tLObject, i7, str11, o60Var2));
                                break;
                        }
                    }
                });
            } else {
                launchActivity = this;
                if (str29 != null) {
                    org.telegram.messenger.u9 c15 = org.telegram.messenger.u9.c(launchActivity.P);
                    org.telegram.messenger.q10 q10Var = new org.telegram.messenger.q10(launchActivity) { // from class: org.telegram.ui.l80
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.messenger.q10
                        public final void a(Object obj, Object obj2) {
                            org.telegram.messenger.q9 b10;
                            int i22 = i18;
                            o60 o60Var3 = o60Var2;
                            switch (i22) {
                                case 0:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity2 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.f3.n(null, 2131749800, org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity2.e0)), R.raw.error, 36);
                                    } else {
                                        String str32 = LaunchActivity.C1;
                                        if (tL_StarGiftAuctionState != null && (b10 = org.telegram.messenger.u9.c(launchActivity2.P).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                            new di.h1(launchActivity2, null, launchActivity2.P, b10.d.title, b10.h, false).show();
                                        }
                                    }
                                    try {
                                        o60Var3.run();
                                        break;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                    break;
                                default:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity3 = this.b;
                                    if (tL_error2 != null) {
                                        org.telegram.messenger.f3.n(null, 2131749800, org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity3.e0)), R.raw.error, 36);
                                    } else {
                                        String str33 = LaunchActivity.C1;
                                        if (tL_StarGiftAuctionState2 != null) {
                                            bi.m0.f1(launchActivity3, null, launchActivity3.P, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                        }
                                    }
                                    try {
                                        o60Var3.run();
                                        break;
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                            }
                        }
                    };
                    TL_stars.TL_inputStarGiftAuctionSlug tL_inputStarGiftAuctionSlug = new TL_stars.TL_inputStarGiftAuctionSlug();
                    tL_inputStarGiftAuctionSlug.slug = str29;
                    TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
                    tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuctionSlug;
                    tL_getStarGiftAuctionState.version = 0;
                    iArr2[0] = c15.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(c14 == true ? 1 : 0), new org.telegram.messenger.z3(i17, c15, q10Var));
                } else if (str28 != null) {
                    org.telegram.messenger.u9 c16 = org.telegram.messenger.u9.c(launchActivity.P);
                    final char c17 = c13 == true ? 1 : 0;
                    org.telegram.messenger.q10 q10Var2 = new org.telegram.messenger.q10(launchActivity) { // from class: org.telegram.ui.l80
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.messenger.q10
                        public final void a(Object obj, Object obj2) {
                            org.telegram.messenger.q9 b10;
                            int i22 = c17;
                            o60 o60Var3 = o60Var2;
                            switch (i22) {
                                case 0:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity2 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.f3.n(null, 2131749800, org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity2.e0)), R.raw.error, 36);
                                    } else {
                                        String str32 = LaunchActivity.C1;
                                        if (tL_StarGiftAuctionState != null && (b10 = org.telegram.messenger.u9.c(launchActivity2.P).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                            new di.h1(launchActivity2, null, launchActivity2.P, b10.d.title, b10.h, false).show();
                                        }
                                    }
                                    try {
                                        o60Var3.run();
                                        break;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                    break;
                                default:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity3 = this.b;
                                    if (tL_error2 != null) {
                                        org.telegram.messenger.f3.n(null, 2131749800, org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity3.e0)), R.raw.error, 36);
                                    } else {
                                        String str33 = LaunchActivity.C1;
                                        if (tL_StarGiftAuctionState2 != null) {
                                            bi.m0.f1(launchActivity3, null, launchActivity3.P, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                        }
                                    }
                                    try {
                                        o60Var3.run();
                                        break;
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                            }
                        }
                    };
                    TL_stars.TL_inputStarGiftAuctionSlug tL_inputStarGiftAuctionSlug2 = new TL_stars.TL_inputStarGiftAuctionSlug();
                    tL_inputStarGiftAuctionSlug2.slug = str28;
                    TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState2 = new TL_payments.TL_getStarGiftAuctionState();
                    tL_getStarGiftAuctionState2.auction = tL_inputStarGiftAuctionSlug2;
                    tL_getStarGiftAuctionState2.version = 0;
                    iArr2[0] = c16.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState2, new d3.b(c12 == true ? 1 : 0), new org.telegram.messenger.z3(i17, c16, q10Var2));
                } else if (str19 != null) {
                    TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                    getuniquestargift.slug = str19;
                    final int i22 = 2;
                    iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(getuniquestargift, new RequestDelegate(launchActivity) { // from class: org.telegram.ui.k80
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i22) {
                                case 0:
                                    String str32 = LaunchActivity.C1;
                                    org.telegram.messenger.g0.g3(new r60(this.b, tLObject, i7, str19, tL_error, o60Var2));
                                    break;
                                case 1:
                                    String str33 = LaunchActivity.C1;
                                    org.telegram.messenger.g0.g3(new ai.g1(this.b, tLObject, i7, str19, o60Var2, 22));
                                    break;
                                default:
                                    String str34 = LaunchActivity.C1;
                                    org.telegram.messenger.g0.g3(new r60(this.b, tL_error, tLObject, i7, str19, o60Var2));
                                    break;
                            }
                        }
                    });
                } else if (str18 != null) {
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                    tL_inputInvoiceSlug.slug = str18;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                    iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getPaymentForm, new bg.l0(this, tL_inputInvoiceSlug, o60Var2, i7, str18, 12));
                } else {
                    if (str == null) {
                        String str32 = str3;
                        if (str2 == null) {
                            o60Var = null;
                            ArrayList arrayList = this.e0;
                            if (str32 != null) {
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = str32;
                                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList);
                                if (h2Var instanceof bn) {
                                    bn bnVar = (bn) h2Var;
                                    iw0Var = new org.telegram.ui.Components.iw0(this, h2Var, tL_inputStickerSetShortName, null, (bnVar.d1.getVisibility() == 0 || !((chat = bnVar.e) == null || org.telegram.messenger.v3.t(chat))) ? null : bnVar.a0, bnVar.getResourceProvider());
                                    boolean V9 = bnVar.V9();
                                    iw0Var.i0 = V9;
                                    iw0Var.n = V9;
                                } else {
                                    iw0Var = new org.telegram.ui.Components.iw0(this, h2Var, tL_inputStickerSetShortName, null, null, null);
                                }
                                iw0Var.L1 = str4 != null;
                                h2Var.showDialog(iw0Var);
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
                                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList);
                                if (h2Var2 instanceof bn) {
                                    bn bnVar2 = (bn) h2Var2;
                                    bvVar = new org.telegram.ui.Components.bv(h2Var2, this, bnVar2.getResourceProvider(), arrayList2);
                                    boolean V92 = bnVar2.V9();
                                    bvVar.i0 = V92;
                                    bvVar.n = V92;
                                } else {
                                    bvVar = new org.telegram.ui.Components.bv(h2Var2, this, null, arrayList2);
                                }
                                h2Var2.showDialog(bvVar);
                                return;
                            }
                            if (str9 != null) {
                                cx cxVar = new cx(org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true));
                                i16 = i7;
                                cxVar.E2 = new ag(this, z10, i16, str9);
                                i15 = 0;
                                u0(cxVar, false, true);
                            } else {
                                i15 = 0;
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
                                    iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(getauthorizationform, new b70(this, iArr2, i7, o60Var2, getauthorizationform, str33, str34, str35, 1));
                                } else if (str15 != null) {
                                    TLRPC.TL_help_getDeepLinkInfo tL_help_getDeepLinkInfo = new TLRPC.TL_help_getDeepLinkInfo();
                                    tL_help_getDeepLinkInfo.path = str15;
                                    iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(tL_help_getDeepLinkInfo, new RequestDelegate(this) { // from class: org.telegram.ui.j80
                                        public final /* synthetic */ LaunchActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i15) {
                                                case 0:
                                                    String str36 = LaunchActivity.C1;
                                                    org.telegram.messenger.g0.g3(new up(this.b, o60Var2, tLObject, 14));
                                                    break;
                                                default:
                                                    String str37 = LaunchActivity.C1;
                                                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((KeyEvent.Callback) this.b, (Object) o60Var2, tLObject, tL_error, 19));
                                                    break;
                                            }
                                        }
                                    });
                                } else if (str14 != null) {
                                    TLRPC.TL_langpack_getLanguage tL_langpack_getLanguage = new TLRPC.TL_langpack_getLanguage();
                                    tL_langpack_getLanguage.lang_code = str14;
                                    tL_langpack_getLanguage.lang_pack = "android";
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.P);
                                    final char c18 = c11 == true ? 1 : 0;
                                    iArr2[0] = connectionsManager.sendRequest(tL_langpack_getLanguage, new RequestDelegate(this) { // from class: org.telegram.ui.j80
                                        public final /* synthetic */ LaunchActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (c18) {
                                                case 0:
                                                    String str36 = LaunchActivity.C1;
                                                    org.telegram.messenger.g0.g3(new up(this.b, o60Var2, tLObject, 14));
                                                    break;
                                                default:
                                                    String str37 = LaunchActivity.C1;
                                                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((KeyEvent.Callback) this.b, (Object) o60Var2, tLObject, tL_error, 19));
                                                    break;
                                            }
                                        }
                                    });
                                } else if (tL_wallPaper != null) {
                                    if (TextUtils.isEmpty(tL_wallPaper.slug)) {
                                        try {
                                            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                                            int i23 = wallPaperSettings.third_background_color;
                                            org.telegram.messenger.g0.g3(new o60(7, this, new x71(i23 != 0 ? new rc1("c", wallPaperSettings.background_color, wallPaperSettings.second_background_color, i23, wallPaperSettings.fourth_background_color) : new rc1(wallPaperSettings.background_color, wallPaperSettings.second_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), "c"), null, true)));
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                    }
                                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                    tL_inputWallPaperSlug.slug = tL_wallPaper.slug;
                                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                    iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(getwallpaper, new z9(this, o60Var2, tL_wallPaper, 16));
                                } else {
                                    if (str20 != null) {
                                        o60 o60Var3 = new o60(8, this, bVar2);
                                        TL_account.getTheme gettheme = new TL_account.getTheme();
                                        gettheme.format = "android";
                                        TLRPC.TL_inputThemeSlug tL_inputThemeSlug = new TLRPC.TL_inputThemeSlug();
                                        tL_inputThemeSlug.slug = str20;
                                        gettheme.theme = tL_inputThemeSlug;
                                        u1Var = u1Var4;
                                        iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(gettheme, new z9(this, u1Var, o60Var2, 17));
                                        i16 = i7;
                                        o60Var = o60Var3;
                                    } else {
                                        u1Var = u1Var4;
                                        if (l10 == null || (num == null && !z14)) {
                                            i16 = i7;
                                            iArr = iArr2;
                                            if (str30 != null) {
                                                TL_account.resolveBusinessChatLink resolvebusinesschatlink = new TL_account.resolveBusinessChatLink();
                                                resolvebusinesschatlink.slug = str30;
                                                ConnectionsManager.getInstance(this.P).sendRequest(resolvebusinesschatlink, new a80(this, c10 == true ? 1 : 0));
                                            }
                                        } else {
                                            if (l11 != null) {
                                                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(l10);
                                                if (O0 != null) {
                                                    iArr2[0] = z0(i7, o60Var2, num, num2, l11, num3, null, O0, null, null, 0, -1);
                                                } else {
                                                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                                                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                                                    tL_inputChannel.channel_id = l10.longValue();
                                                    tL_channels_getChannels.id.add(tL_inputChannel);
                                                    iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getChannels, new b70(this, iArr2, i7, o60Var2, num, num2, l11, num3, 2));
                                                }
                                            } else {
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", l10.longValue());
                                                if (num != null) {
                                                    bundle.putInt("message_id", num.intValue());
                                                }
                                                if (num3 != null) {
                                                    bundle.putInt("task_id", num3.intValue());
                                                }
                                                if (bArr != null) {
                                                    bundle.putByteArray("poll_option_id", bArr);
                                                }
                                                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(this.P).O0(l10);
                                                if (O02 != null && org.telegram.messenger.v3.R(O02) && z14) {
                                                    w0(Long.valueOf(-l10.longValue()), o60Var2, bVar2, null);
                                                } else if (O02 == null || !O02.forum) {
                                                    org.telegram.ui.ActionBar.h2 h2Var3 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList) : null;
                                                    if (h2Var3 == null || org.telegram.messenger.mp.u1(i7).E(bundle, h2Var3, null, null)) {
                                                        iArr = iArr2;
                                                        i16 = i7;
                                                        org.telegram.messenger.g0.g3(new j70(this, bundle, l10, iArr2, o60Var2, z14, bVar2, l11, num, num3, bArr, h2Var3, i7));
                                                    }
                                                } else {
                                                    l0(-l10.longValue(), num, null, num3, bArr, new a70(o60Var2, 2), 0, -1);
                                                }
                                            }
                                            i16 = i7;
                                        }
                                    }
                                    iArr = iArr2;
                                }
                                i16 = i7;
                            }
                            iArr = iArr2;
                            u1Var = u1Var4;
                        } else if (i10 == 0) {
                            TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                            tL_messages_checkChatInvite.hash = str2;
                            iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_checkChatInvite, new bg.l0(this, i7, u1Var4, o60Var2, str2, 13), 2);
                            i16 = i7;
                            iArr = iArr2;
                            u1Var = u1Var4;
                            i15 = 0;
                        } else {
                            if (i10 == 1) {
                                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                tL_messages_importChatInvite.hash = str2;
                                o60Var = null;
                                ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_importChatInvite, null, new xf(this, o60Var2, i7), 2);
                            } else {
                                o60Var = null;
                            }
                            i16 = i7;
                            iArr = iArr2;
                            u1Var = u1Var4;
                            i15 = 0;
                        }
                        if (iArr[i15] == 0) {
                            u1Var.setOnCancelListener(new org.telegram.ui.Components.w1(i16, iArr, o60Var));
                            if (bVar2 != null) {
                                bVar2.b = new org.telegram.ui.Components.c3(i16, iArr, o60Var);
                            }
                            try {
                                if (bVar2 != null) {
                                    bVar2.d();
                                } else {
                                    u1Var.r(300L);
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (bVar2 != null) {
                        bVar2.d();
                    }
                    org.telegram.messenger.m10 f22 = org.telegram.messenger.mp.u1(i7).f2();
                    i16 = i7;
                    org.telegram.messenger.x10 x10Var = new org.telegram.messenger.x10() { // from class: org.telegram.ui.m80
                        /* JADX WARN: Can't wrap try/catch for region: R(6:59|(4:(2:63|(9:66|(3:68|(2:70|(4:72|(2:74|(2:76|77)(1:78))|79|80)(1:81))(1:359)|82)(1:360)|83|(2:85|(2:87|88))(1:358)|(3:90|(1:94)|95)(4:(2:117|(4:127|128|(8:130|(3:132|(1:160)(1:136)|137)(2:161|(1:166)(1:165))|138|(2:150|(2:155|(1:159))(1:154))(1:142)|143|(1:145)|146|(1:148))(1:(3:324|325|(4:347|348|349|(2:351|352)(1:354))(7:331|(1:333)(1:346)|334|(1:336)(1:345)|337|(2:339|(1:341)(1:343))(1:344)|342))(17:169|(3:171|(2:173|(2:175|(2:177|178)(1:179))(1:315))|316)(3:317|(3:319|(1:321)|322)|323)|(1:314)(1:184)|185|(1:187)(1:313)|(3:189|(1:191)|(1:193))|194|(1:196)|197|(1:199)|(1:201)|(1:203)|(1:205)(1:312)|(1:207)(1:311)|208|(1:310)(1:211)|(3:215|(1:309)(1:219)|(1:(2:254|(5:290|291|292|293|(1:305)(5:295|(1:297)(1:304)|(2:299|(1:301))|302|303))(1:(5:283|(1:285)(1:289)|286|287|288)(2:(1:282)(1:262)|(8:268|(1:270)|271|(1:273)|274|275|276|278)(2:266|267))))(1:253))(12:222|(1:224)|225|(1:232)|233|(1:235)|236|237|(3:239|(3:241|242|243)(1:245)|244)|246|247|(1:249)(1:250)))))|149)(2:123|(1:126)(1:125)))(4:106|(1:116)(2:110|(2:112|113)(1:114))|115|113)|97|98|100)|96|97|98|100))|97|98|100)|373|374|375|(7:377|(1:379)|380|381|382|383|(1:385)(1:386))) */
                        /* JADX WARN: Code restructure failed: missing block: B:389:0x0a16, code lost:
                        
                            r0 = move-exception;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:391:0x0a4a, code lost:
                        
                            org.telegram.messenger.a8.g(r0, true);
                         */
                        /* JADX WARN: Type inference failed for: r15v14 */
                        /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.String, org.telegram.ui.ActionBar.i6] */
                        /* JADX WARN: Type inference failed for: r15v16 */
                        @Override // org.telegram.messenger.x10
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void a(Object obj) {
                            boolean z21;
                            boolean z22;
                            Long l12;
                            final int i24;
                            String str36;
                            String str37;
                            boolean z23;
                            final Long l13;
                            final Long l14;
                            final HashMap hashMap2;
                            String str38;
                            final String str39;
                            TLRPC.TL_wallPaper tL_wallPaper2;
                            int i25;
                            int i26;
                            final String str40;
                            final String str41;
                            vf.b bVar3;
                            boolean z24;
                            final boolean z25;
                            final boolean z26;
                            final String str42;
                            o60 o60Var4;
                            final byte[] bArr2;
                            final String str43;
                            LaunchActivity launchActivity2;
                            String str44;
                            final Integer num4;
                            final Integer num5;
                            final String str45;
                            String str46;
                            String str47;
                            String str48;
                            String str49;
                            Long l15;
                            final int i27;
                            LaunchActivity launchActivity3;
                            String str50;
                            String str51;
                            String str52;
                            int i28;
                            String str53;
                            String str54;
                            int i29;
                            boolean z27;
                            byte[] bArr3;
                            long j3;
                            boolean z28;
                            boolean z29;
                            String str55;
                            String str56;
                            ox x10;
                            ArrayList<org.telegram.ui.ActionBar.d2> arrayList3;
                            boolean z30;
                            boolean z31;
                            boolean z32;
                            ?? r15;
                            org.telegram.ui.Components.lc b02;
                            int i30;
                            final Long l16 = (Long) obj;
                            final LaunchActivity launchActivity4 = LaunchActivity.this;
                            ArrayList arrayList4 = launchActivity4.e0;
                            o60 o60Var5 = o60Var2;
                            int i31 = 0;
                            int i32 = 1;
                            if (l16 != null && l16.longValue() == Long.MAX_VALUE) {
                                try {
                                    o60Var5.run();
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, launchActivity4, null);
                                String M03 = org.telegram.messenger.gd.M0(2131754346, null);
                                org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder3.a;
                                u1Var5.S = M03;
                                u1Var5.U = org.telegram.messenger.gd.M0(2131754347, null);
                                i5.c.y(null, 2131747638, alertDialog$Builder3, null);
                                return;
                            }
                            if (launchActivity4.isFinishing()) {
                                return;
                            }
                            final boolean z33 = z13;
                            if (z33 && l16 != null) {
                                fi.p6 R1 = org.telegram.messenger.mp.u1(launchActivity4.P).R1();
                                long longValue2 = l16.longValue();
                                w60 w60Var = new w60(launchActivity4, o60Var5, l16, i31);
                                int i33 = R1.a;
                                TL_stories.PeerStories y10 = R1.y(longValue2);
                                if (y10 != null) {
                                    while (i31 < y10.stories.size()) {
                                        if ((y10.stories.get(i31).media instanceof TLRPC.TL_messageMediaVideoStream) && !(y10.stories.get(i31) instanceof TL_stories.TL_storyItemSkipped)) {
                                            w60Var.a(y10.stories.get(i31));
                                            return;
                                        }
                                        i31++;
                                    }
                                }
                                long j10 = ((-93321425) + longValue2) << 12;
                                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) R1.E.f(j10);
                                if (storyItem != null) {
                                    w60Var.a(storyItem);
                                    return;
                                }
                                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                                tL_stories_getPeerStories.peer = org.telegram.messenger.mp.u1(i33).l1(longValue2);
                                ConnectionsManager.getInstance(i33).sendRequest(tL_stories_getPeerStories, new fi.w5(R1, j10, w60Var));
                                return;
                            }
                            final int i34 = i12;
                            if (i34 != 0 && l16 != null) {
                                org.telegram.messenger.mp.u1(launchActivity4.P).R1().g0(i34, l16.longValue(), new w60(launchActivity4, o60Var5, l16, i32));
                                return;
                            }
                            final int i35 = i13;
                            if (i35 != 0 && l16 != null) {
                                fi.p6 R12 = org.telegram.messenger.mp.u1(launchActivity4.P).R1();
                                long longValue3 = l16.longValue();
                                di.o9 o9Var = new di.o9(launchActivity4, o60Var5, l16, i35);
                                int i36 = R12.a;
                                fi.d6 B = R12.B(longValue3, false);
                                if (B != null) {
                                    fi.i6 b10 = B.b(i35);
                                    if (b10 != null) {
                                        TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                                        tL_storyAlbum.album_id = b10.a;
                                        tL_storyAlbum.title = b10.b;
                                        tL_storyAlbum.icon_photo = b10.c;
                                        tL_storyAlbum.icon_video = b10.d;
                                        o9Var.a(tL_storyAlbum);
                                        return;
                                    }
                                    if (B.f) {
                                        o9Var.a(null);
                                        return;
                                    }
                                }
                                TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
                                tL_getAlbums.peer = org.telegram.messenger.mp.u1(i36).l1(longValue3);
                                ConnectionsManager.getInstance(i36).sendRequest(tL_getAlbums, new di.w1(i35, o9Var));
                                return;
                            }
                            final o60 o60Var6 = o60Var5;
                            final String str57 = str;
                            try {
                                if (l16 != null && launchActivity4.p0 != null) {
                                    final String str58 = str13;
                                    final String str59 = str21;
                                    final boolean z34 = z11;
                                    final String str60 = str22;
                                    if ((str58 == null && str59 == null) || ((str58 != null && l16.longValue() > 0) || ((str59 != null && l16.longValue() > 0) || ((z34 && l16.longValue() < 0) || (str60 != null && l16.longValue() < 0))))) {
                                        final String str61 = str26;
                                        boolean isEmpty = TextUtils.isEmpty(str61);
                                        int i37 = i16;
                                        final String str62 = str2;
                                        final String str63 = str3;
                                        final String str64 = str4;
                                        final String str65 = str5;
                                        final String str66 = str6;
                                        final String str67 = str7;
                                        final String str68 = str8;
                                        final String str69 = str9;
                                        final String str70 = str10;
                                        final String str71 = str11;
                                        final String str72 = str12;
                                        final boolean z35 = z10;
                                        final Integer num6 = num;
                                        final Long l17 = l10;
                                        final Long l18 = l11;
                                        final Integer num7 = num2;
                                        final HashMap hashMap3 = hashMap;
                                        final String str73 = str14;
                                        final String str74 = str15;
                                        final String str75 = str16;
                                        final String str76 = str17;
                                        final TLRPC.TL_wallPaper tL_wallPaper3 = tL_wallPaper;
                                        final String str77 = str18;
                                        final String str78 = str19;
                                        final String str79 = str20;
                                        final int i38 = i10;
                                        final int i39 = i11;
                                        final String str80 = str23;
                                        final String str81 = str24;
                                        final String str82 = str25;
                                        final vf.b bVar4 = bVar2;
                                        final boolean z36 = z12;
                                        final int i40 = i14;
                                        final String str83 = str28;
                                        final String str84 = str29;
                                        final boolean z37 = z14;
                                        final String str85 = str30;
                                        final boolean z38 = z15;
                                        final boolean z39 = z16;
                                        final boolean z40 = z17;
                                        final boolean z41 = z18;
                                        final boolean z42 = z19;
                                        final String str86 = str31;
                                        final Integer num8 = num3;
                                        final boolean z43 = z20;
                                        final byte[] bArr4 = bArr;
                                        final String str87 = str27;
                                        if (isEmpty) {
                                            l12 = l16;
                                            i24 = i37;
                                            str36 = str57;
                                            str37 = str58;
                                            z23 = z35;
                                            l13 = l17;
                                            l14 = l18;
                                            hashMap2 = hashMap3;
                                            str38 = str74;
                                            str39 = str76;
                                            tL_wallPaper2 = tL_wallPaper3;
                                            i25 = i38;
                                            i26 = i39;
                                            str40 = str81;
                                            str41 = str82;
                                            bVar3 = bVar4;
                                            z24 = z40;
                                            z25 = z41;
                                            z26 = z42;
                                            str42 = str86;
                                            o60Var4 = o60Var6;
                                            bArr2 = bArr4;
                                            str43 = str87;
                                            launchActivity2 = launchActivity4;
                                            str44 = str72;
                                            num4 = num6;
                                            num5 = num7;
                                            str45 = str73;
                                            str46 = str77;
                                            str47 = str80;
                                        } else {
                                            final TLRPC.User c22 = org.telegram.messenger.mp.u1(i37).c2(l16);
                                            if (c22 != null) {
                                                i24 = i37;
                                                if (c22.bot) {
                                                    if (c22.bot_attach_menu) {
                                                        if (!org.telegram.messenger.ri.d0(i24).l(c22.id)) {
                                                            TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                                                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i24);
                                                            tL_messages_getAttachMenuBot.bot = u12.s1(u12.c2(l16));
                                                            ConnectionsManager.getInstance(i24).sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() { // from class: org.telegram.ui.x60
                                                                @Override // org.telegram.tgnet.RequestDelegate
                                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                                    String str88 = LaunchActivity.C1;
                                                                    final LaunchActivity launchActivity5 = LaunchActivity.this;
                                                                    final int i41 = i24;
                                                                    final String str89 = str57;
                                                                    final String str90 = str62;
                                                                    final String str91 = str63;
                                                                    final String str92 = str64;
                                                                    final String str93 = str65;
                                                                    final String str94 = str66;
                                                                    final String str95 = str67;
                                                                    final String str96 = str68;
                                                                    final String str97 = str69;
                                                                    final String str98 = str70;
                                                                    final String str99 = str71;
                                                                    final String str100 = str72;
                                                                    final boolean z44 = z35;
                                                                    final Integer num9 = num6;
                                                                    final Long l19 = l17;
                                                                    final Long l20 = l18;
                                                                    final Integer num10 = num7;
                                                                    final String str101 = str58;
                                                                    final HashMap hashMap4 = hashMap3;
                                                                    final String str102 = str73;
                                                                    final String str103 = str74;
                                                                    final String str104 = str75;
                                                                    final String str105 = str76;
                                                                    final TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper3;
                                                                    final String str106 = str77;
                                                                    final String str107 = str78;
                                                                    final String str108 = str79;
                                                                    final String str109 = str59;
                                                                    final boolean z45 = z34;
                                                                    final String str110 = str60;
                                                                    final int i42 = i38;
                                                                    final int i43 = i39;
                                                                    final String str111 = str80;
                                                                    final String str112 = str81;
                                                                    final String str113 = str82;
                                                                    final vf.b bVar5 = bVar4;
                                                                    final boolean z46 = z36;
                                                                    final int i44 = i34;
                                                                    final boolean z47 = z33;
                                                                    final int i45 = i35;
                                                                    final int i46 = i40;
                                                                    final String str114 = str83;
                                                                    final String str115 = str84;
                                                                    final boolean z48 = z37;
                                                                    final String str116 = str85;
                                                                    final boolean z49 = z38;
                                                                    final boolean z50 = z39;
                                                                    final boolean z51 = z40;
                                                                    final boolean z52 = z41;
                                                                    final boolean z53 = z42;
                                                                    final String str117 = str86;
                                                                    final Integer num11 = num8;
                                                                    final boolean z54 = z43;
                                                                    final byte[] bArr5 = bArr4;
                                                                    final Long l21 = l16;
                                                                    final String str118 = str61;
                                                                    final String str119 = str87;
                                                                    final TLRPC.User user = c22;
                                                                    final o60 o60Var7 = o60Var6;
                                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.e70
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            final String str120;
                                                                            o60 o60Var8;
                                                                            vf.b bVar6;
                                                                            TLRPC.User user2;
                                                                            final String str121;
                                                                            final boolean z55;
                                                                            final int i47;
                                                                            final int i48;
                                                                            final TLRPC.TL_attachMenuBot tL_attachMenuBot;
                                                                            int i49;
                                                                            String str122 = LaunchActivity.C1;
                                                                            final LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            final int i50 = i41;
                                                                            final String str123 = str89;
                                                                            final String str124 = str90;
                                                                            final String str125 = str91;
                                                                            final String str126 = str92;
                                                                            final String str127 = str93;
                                                                            final String str128 = str94;
                                                                            final String str129 = str95;
                                                                            final String str130 = str96;
                                                                            final String str131 = str97;
                                                                            final String str132 = str98;
                                                                            final String str133 = str99;
                                                                            final String str134 = str100;
                                                                            final boolean z56 = z44;
                                                                            final Integer num12 = num9;
                                                                            final Long l22 = l19;
                                                                            final Long l23 = l20;
                                                                            final Integer num13 = num10;
                                                                            final String str135 = str101;
                                                                            final HashMap hashMap5 = hashMap4;
                                                                            final String str136 = str102;
                                                                            final String str137 = str103;
                                                                            final String str138 = str104;
                                                                            final String str139 = str105;
                                                                            final TLRPC.TL_wallPaper tL_wallPaper5 = tL_wallPaper4;
                                                                            final String str140 = str106;
                                                                            final String str141 = str107;
                                                                            final String str142 = str108;
                                                                            final String str143 = str109;
                                                                            final boolean z57 = z45;
                                                                            final String str144 = str110;
                                                                            final int i51 = i42;
                                                                            final int i52 = i43;
                                                                            final String str145 = str111;
                                                                            final String str146 = str112;
                                                                            final String str147 = str113;
                                                                            final vf.b bVar7 = bVar5;
                                                                            final boolean z58 = z46;
                                                                            final int i53 = i44;
                                                                            final int i54 = i45;
                                                                            final int i55 = i46;
                                                                            final boolean z59 = z48;
                                                                            final String str148 = str116;
                                                                            final boolean z60 = z49;
                                                                            final boolean z61 = z50;
                                                                            final boolean z62 = z51;
                                                                            final boolean z63 = z52;
                                                                            final boolean z64 = z53;
                                                                            final String str149 = str117;
                                                                            final boolean z65 = z54;
                                                                            if (tL_error2 != null) {
                                                                                final boolean z66 = z47;
                                                                                final String str150 = str114;
                                                                                final String str151 = str115;
                                                                                final Integer num14 = num11;
                                                                                final byte[] bArr6 = bArr5;
                                                                                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.p70
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        String str152 = LaunchActivity.C1;
                                                                                        LaunchActivity.this.B0(i50, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z56, num12, l22, l23, num13, str135, hashMap5, str136, str137, str138, str139, tL_wallPaper5, str140, str141, str142, str143, z57, str144, i51, i52, str145, str146, str147, null, null, bVar7, z58, i53, z66, i54, i55, str150, str151, z59, str148, z60, z61, z62, z63, z64, str149, num14, z65, bArr6);
                                                                                    }
                                                                                });
                                                                                return;
                                                                            }
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                                                                                final TLRPC.TL_attachMenuBot tL_attachMenuBot2 = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot;
                                                                                boolean z67 = tL_attachMenuBot2 != null && (tL_attachMenuBot2.show_in_side_menu || tL_attachMenuBot2.show_in_attach_menu);
                                                                                boolean z68 = tL_attachMenuBot2.inactive;
                                                                                final boolean z69 = z67;
                                                                                final Long l24 = l21;
                                                                                final String str152 = str118;
                                                                                final String str153 = str119;
                                                                                final TLRPC.User user3 = user;
                                                                                final o60 o60Var9 = o60Var7;
                                                                                if (!z68 && !tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                                                                    str120 = str152;
                                                                                    o60Var8 = o60Var9;
                                                                                } else if (z69) {
                                                                                    zc1.a(launchActivity6, new org.telegram.messenger.x10() { // from class: org.telegram.ui.q70
                                                                                        @Override // org.telegram.messenger.x10
                                                                                        public final void a(Object obj2) {
                                                                                            String str154 = LaunchActivity.C1;
                                                                                            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                                                                                            tL_attachMenuBot3.inactive = false;
                                                                                            tL_attachMenuBot3.request_write_access = false;
                                                                                            TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                            int i56 = i50;
                                                                                            org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i56);
                                                                                            Long l25 = l24;
                                                                                            l25.getClass();
                                                                                            tL_messages_toggleBotInAttachMenu.bot = u13.s1(u13.c2(l25));
                                                                                            tL_messages_toggleBotInAttachMenu.enabled = true;
                                                                                            tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                                                                            ConnectionsManager.getInstance(i56).sendRequest(tL_messages_toggleBotInAttachMenu, new ki.c2(i56, 5), 66);
                                                                                            LaunchActivity.this.x0(i56, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z56, num12, l22, l23, num13, str135, hashMap5, str136, str137, str138, str139, tL_wallPaper5, str140, str141, str142, str143, z57, str144, i51, i52, str145, str146, str147, str152, str153, bVar7, z58, i53, i54, i55, z59, str148, user3, o60Var9, z69, true, z60, z61, z62, z63, z64, str149, z65);
                                                                                        }
                                                                                    }, bVar7 != null ? new lz(bVar7, 16) : null);
                                                                                    return;
                                                                                } else {
                                                                                    str120 = str152;
                                                                                    o60Var8 = o60Var9;
                                                                                }
                                                                                if (tL_attachMenuBot2.request_write_access) {
                                                                                    bVar6 = bVar7;
                                                                                    user2 = user3;
                                                                                    str121 = str148;
                                                                                    z55 = z59;
                                                                                    i47 = i55;
                                                                                    i48 = i54;
                                                                                    tL_attachMenuBot = tL_attachMenuBot2;
                                                                                    i49 = i50;
                                                                                } else {
                                                                                    if (!z58) {
                                                                                        launchActivity6.x0(i50, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z56, num12, l22, l23, num13, str135, hashMap5, str136, str137, str138, str139, tL_wallPaper5, str140, str141, str142, str143, z57, str144, i51, i52, str145, str146, str147, str120, str153, bVar7, z58, i53, i54, i55, z59, str148, user3, o60Var8, false, false, z60, z61, z62, z63, z64, str149, z65);
                                                                                        return;
                                                                                    }
                                                                                    bVar6 = bVar7;
                                                                                    user2 = user3;
                                                                                    str121 = str148;
                                                                                    z55 = z59;
                                                                                    i47 = i55;
                                                                                    i48 = i54;
                                                                                    tL_attachMenuBot = tL_attachMenuBot2;
                                                                                    i49 = i50;
                                                                                }
                                                                                final o60 o60Var10 = o60Var8;
                                                                                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                                                                                final TLRPC.User user4 = user2;
                                                                                final int i56 = i49;
                                                                                final vf.b bVar8 = bVar6;
                                                                                org.telegram.ui.Components.b5.m(LaunchActivity.Q(), atomicBoolean, user4, new Runnable() { // from class: org.telegram.ui.r70
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        String str154 = LaunchActivity.C1;
                                                                                        LaunchActivity launchActivity7 = LaunchActivity.this;
                                                                                        int i57 = launchActivity7.P;
                                                                                        Long l25 = l24;
                                                                                        org.telegram.messenger.c6.p(i57, l25.longValue());
                                                                                        TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot;
                                                                                        tL_attachMenuBot3.inactive = false;
                                                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                        tL_attachMenuBot3.request_write_access = !atomicBoolean2.get();
                                                                                        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                        int i58 = i56;
                                                                                        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i58);
                                                                                        tL_messages_toggleBotInAttachMenu.bot = u13.s1(u13.c2(l25));
                                                                                        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean2.get();
                                                                                        ConnectionsManager.getInstance(i58).sendRequest(tL_messages_toggleBotInAttachMenu, new ki.c2(i58, 6), 66);
                                                                                        launchActivity7.x0(i58, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z56, num12, l22, l23, num13, str135, hashMap5, str136, str137, str138, str139, tL_wallPaper5, str140, str141, str142, str143, z57, str144, i51, i52, str145, str146, str147, str120, str153, bVar8, z58, i53, i48, i47, z55, str121, user4, o60Var10, false, false, z60, z61, z62, z63, z64, str149, z65);
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
                                                    }
                                                    launchActivity4.x0(i24, str57, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, z35, num6, l17, l18, num7, str58, hashMap3, str73, str74, str75, str76, tL_wallPaper3, str77, str78, str79, str59, z34, str60, i38, i39, str80, str81, str82, str61, str87, bVar4, z36, i34, i35, i40, z37, str85, c22, o60Var6, false, false, z38, z39, z40, z41, z42, str86, z43);
                                                    return;
                                                }
                                                l12 = l16;
                                            } else {
                                                l12 = l16;
                                                i24 = i37;
                                            }
                                            str36 = str57;
                                            launchActivity2 = launchActivity4;
                                            str44 = str72;
                                            str37 = str58;
                                            num4 = num6;
                                            l13 = l17;
                                            num5 = num7;
                                            str45 = str73;
                                            str38 = str74;
                                            str39 = str76;
                                            str46 = str77;
                                            i25 = i38;
                                            str47 = str80;
                                            str40 = str81;
                                            bVar3 = bVar4;
                                            z24 = z40;
                                            z25 = z41;
                                            z26 = z42;
                                            str42 = str86;
                                            o60Var4 = o60Var6;
                                            bArr2 = bArr4;
                                            str43 = str87;
                                            z23 = z35;
                                            l14 = l18;
                                            hashMap2 = hashMap3;
                                            tL_wallPaper2 = tL_wallPaper3;
                                            i26 = i39;
                                            str41 = str82;
                                        }
                                        if (z37) {
                                            str48 = str63;
                                            str49 = str64;
                                            if (org.telegram.messenger.v3.R(org.telegram.messenger.mp.u1(i24).O0(Long.valueOf(-l12.longValue())))) {
                                                launchActivity2.w0(l12, o60Var4, bVar3, null);
                                                return;
                                            }
                                        } else {
                                            str48 = str63;
                                            str49 = str64;
                                        }
                                        if (str43 == null) {
                                            if (str47 != null && str40 == null) {
                                                TLRPC.User c23 = org.telegram.messenger.mp.u1(i24).c2(l12);
                                                if (c23 == null || !c23.bot) {
                                                    z32 = true;
                                                    r15 = 0;
                                                    b02 = org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList4));
                                                    i30 = 2131752975;
                                                } else if (c23.bot_attach_menu) {
                                                    long longValue4 = l12.longValue();
                                                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot2 = new TLRPC.TL_messages_getAttachMenuBot();
                                                    org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i24);
                                                    tL_messages_getAttachMenuBot2.bot = u13.s1(u13.c2(l12));
                                                    ConnectionsManager.getInstance(i24).sendRequest(tL_messages_getAttachMenuBot2, new ii.f(launchActivity2, i24, str43, str41, c23, str47, longValue4));
                                                    z32 = true;
                                                    o60Var6 = o60Var4;
                                                    z21 = z32;
                                                } else {
                                                    z32 = true;
                                                    b02 = org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList4));
                                                    i30 = 2131753107;
                                                    r15 = 0;
                                                }
                                                org.telegram.messenger.f3.o(r15, i30, b02, r15);
                                                o60Var6 = o60Var4;
                                                z21 = z32;
                                            } else if (num4 == null || ((num5 == null && l14 == null) || l12.longValue() >= 0)) {
                                                final String str88 = str48;
                                                final vf.b bVar5 = bVar3;
                                                int i41 = i24;
                                                final String str89 = str44;
                                                final o60 o60Var7 = o60Var4;
                                                final LaunchActivity launchActivity5 = launchActivity2;
                                                if (str37 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putBoolean("onlySelect", true);
                                                    bundle2.putBoolean("cantSendToChannels", true);
                                                    bundle2.putInt("dialogsType", 1);
                                                    bundle2.putString("selectAlertString", org.telegram.messenger.gd.M0(2131745429, null));
                                                    bundle2.putString("selectAlertStringGroup", org.telegram.messenger.gd.M0(2131745430, null));
                                                    cx cxVar2 = new cx(bundle2);
                                                    cxVar2.E2 = new y60(launchActivity5, str37, i41, org.telegram.messenger.mp.u1(i41).c2(l12));
                                                    if (org.telegram.messenger.g0.Q1()) {
                                                        z31 = !launchActivity5.q0.getFragmentStack().isEmpty() && (launchActivity5.q0.getFragmentStack().get(launchActivity5.q0.getFragmentStack().size() + (-1)) instanceof me0);
                                                        z30 = true;
                                                    } else {
                                                        z30 = true;
                                                        z31 = launchActivity5.p0.getFragmentStack().size() > 1 && (launchActivity5.p0.getFragmentStack().get(launchActivity5.p0.getFragmentStack().size() - 1) instanceof me0);
                                                    }
                                                    ((ActionBarLayout) launchActivity5.M()).V(cxVar2, z31, z30);
                                                    if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                                                        SecretMediaViewer.f().e(false, false);
                                                    } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                                                        PhotoViewer.p1().z0(false, true);
                                                    } else if (g4.G() && g4.v().W) {
                                                        g4.v().m(false, true);
                                                    }
                                                    hi.ta.w();
                                                    f40 f40Var = f40.C5;
                                                    if (f40Var != null) {
                                                        f40Var.dismiss();
                                                    }
                                                    if (org.telegram.messenger.g0.Q1()) {
                                                        launchActivity5.p0.X(true, true);
                                                        launchActivity5.r0.X(true, true);
                                                    }
                                                } else if (str66 == null && str67 == null) {
                                                    final boolean z44 = z23;
                                                    Bundle bundle3 = new Bundle();
                                                    TLRPC.User c24 = org.telegram.messenger.mp.u1(i41).c2(l12);
                                                    final String str90 = str37;
                                                    if (l12.longValue() < 0) {
                                                        i27 = i41;
                                                        final TLRPC.Chat O03 = org.telegram.messenger.mp.u1(i41).O0(Long.valueOf(-l12.longValue()));
                                                        if (z43) {
                                                            if (O03.linked_monoforum_id == 0) {
                                                                o60Var7 = o60Var7;
                                                            } else {
                                                                if (org.telegram.messenger.mp.u1(i27).O0(Long.valueOf(O03.linked_monoforum_id)) == null) {
                                                                    TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                                                                    tL_channels_getFullChannel.channel = org.telegram.messenger.mp.k1(O03);
                                                                    final boolean z45 = z24;
                                                                    final String str91 = str49;
                                                                    final String str92 = str36;
                                                                    final String str93 = str47;
                                                                    final int i42 = i26;
                                                                    final int i43 = i25;
                                                                    final String str94 = str46;
                                                                    final TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper2;
                                                                    final String str95 = str38;
                                                                    ConnectionsManager.getInstance(i27).sendRequest(tL_channels_getFullChannel, new RequestDelegate() { // from class: org.telegram.ui.z60
                                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                                            String str96 = LaunchActivity.C1;
                                                                            final LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                            final int i44 = i27;
                                                                            final TLRPC.Chat chat2 = O03;
                                                                            final o60 o60Var8 = o60Var7;
                                                                            final String str97 = str92;
                                                                            final String str98 = str62;
                                                                            final String str99 = str88;
                                                                            final String str100 = str91;
                                                                            final String str101 = str65;
                                                                            final String str102 = str66;
                                                                            final String str103 = str67;
                                                                            final String str104 = str68;
                                                                            final String str105 = str69;
                                                                            final String str106 = str70;
                                                                            final String str107 = str71;
                                                                            final String str108 = str89;
                                                                            final boolean z46 = z44;
                                                                            final Integer num9 = num4;
                                                                            final Long l19 = l13;
                                                                            final Long l20 = l14;
                                                                            final Integer num10 = num5;
                                                                            final String str109 = str90;
                                                                            final HashMap hashMap4 = hashMap2;
                                                                            final String str110 = str45;
                                                                            final String str111 = str95;
                                                                            final String str112 = str75;
                                                                            final String str113 = str39;
                                                                            final TLRPC.TL_wallPaper tL_wallPaper5 = tL_wallPaper4;
                                                                            final String str114 = str94;
                                                                            final String str115 = str78;
                                                                            final String str116 = str79;
                                                                            final String str117 = str59;
                                                                            final boolean z47 = z34;
                                                                            final String str118 = str60;
                                                                            final int i45 = i43;
                                                                            final int i46 = i42;
                                                                            final String str119 = str93;
                                                                            final String str120 = str40;
                                                                            final String str121 = str41;
                                                                            final String str122 = str61;
                                                                            final String str123 = str43;
                                                                            final vf.b bVar6 = bVar5;
                                                                            final boolean z48 = z36;
                                                                            final int i47 = i34;
                                                                            final boolean z49 = z33;
                                                                            final int i48 = i35;
                                                                            final int i49 = i40;
                                                                            final String str124 = str83;
                                                                            final String str125 = str84;
                                                                            final boolean z50 = z37;
                                                                            final String str126 = str85;
                                                                            final boolean z51 = z38;
                                                                            final boolean z52 = z39;
                                                                            final boolean z53 = z45;
                                                                            final boolean z54 = z25;
                                                                            final boolean z55 = z26;
                                                                            final String str127 = str42;
                                                                            final Integer num11 = num8;
                                                                            final boolean z56 = z43;
                                                                            final byte[] bArr5 = bArr2;
                                                                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.h70
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    String str128 = LaunchActivity.C1;
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    boolean z57 = tLObject2 instanceof TLRPC.TL_messages_chatFull;
                                                                                    o60 o60Var9 = o60Var8;
                                                                                    if (!z57) {
                                                                                        try {
                                                                                            o60Var9.run();
                                                                                            return;
                                                                                        } catch (Exception e12) {
                                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject2;
                                                                                    int i50 = i44;
                                                                                    org.telegram.messenger.mp.u1(i50).f4(tL_messages_chatFull.users, false);
                                                                                    org.telegram.messenger.mp.u1(i50).Z3(tL_messages_chatFull.chats, false);
                                                                                    org.telegram.messenger.tr.a0(i50).m1(tL_messages_chatFull.users, tL_messages_chatFull.chats, false, true);
                                                                                    if (org.telegram.messenger.mp.u1(i50).O0(Long.valueOf(chat2.linked_monoforum_id)) != null) {
                                                                                        LaunchActivity.this.B0(i50, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, str108, z46, num9, l19, l20, num10, str109, hashMap4, str110, str111, str112, str113, tL_wallPaper5, str114, str115, str116, str117, z47, str118, i45, i46, str119, str120, str121, str122, str123, bVar6, z48, i47, z49, i48, i49, str124, str125, z50, str126, z51, z52, z53, z54, z55, str127, num11, z56, bArr5);
                                                                                        return;
                                                                                    }
                                                                                    try {
                                                                                        o60Var9.run();
                                                                                    } catch (Exception e13) {
                                                                                        org.telegram.messenger.a8.g(e13, true);
                                                                                    }
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                    return;
                                                                }
                                                                l15 = l12;
                                                                o60Var7 = o60Var7;
                                                                str51 = str59;
                                                                str52 = str60;
                                                                i28 = i26;
                                                                str53 = str47;
                                                                str54 = str40;
                                                                i29 = i40;
                                                                z27 = z25;
                                                                bArr3 = bArr2;
                                                                launchActivity3 = launchActivity5;
                                                                str50 = str65;
                                                                bundle3.putLong("chat_id", O03.linked_monoforum_id);
                                                                j3 = -O03.linked_monoforum_id;
                                                            }
                                                        }
                                                        l15 = l12;
                                                        str50 = str65;
                                                        str51 = str59;
                                                        str52 = str60;
                                                        i28 = i26;
                                                        str53 = str47;
                                                        str54 = str40;
                                                        i29 = i40;
                                                        z27 = z25;
                                                        bArr3 = bArr2;
                                                        launchActivity3 = launchActivity5;
                                                        bundle3.putLong("chat_id", -l15.longValue());
                                                        j3 = l15.longValue();
                                                    } else {
                                                        l15 = l12;
                                                        i27 = i41;
                                                        launchActivity3 = launchActivity5;
                                                        str50 = str65;
                                                        String str96 = str89;
                                                        str51 = str59;
                                                        str52 = str60;
                                                        i28 = i26;
                                                        str53 = str47;
                                                        str54 = str40;
                                                        i29 = i40;
                                                        z27 = z25;
                                                        bArr3 = bArr2;
                                                        bundle3.putLong("user_id", l15.longValue());
                                                        long longValue5 = l15.longValue();
                                                        if (str96 != null) {
                                                            if (str96.startsWith("@")) {
                                                                str96 = " ".concat(str96);
                                                            }
                                                            bundle3.putString("start_text", str96);
                                                        }
                                                        j3 = longValue5;
                                                    }
                                                    if (str50 == null || c24 == null || !c24.bot) {
                                                        z28 = false;
                                                    } else {
                                                        bundle3.putString("botUser", str50);
                                                        z28 = true;
                                                    }
                                                    if (launchActivity3.X0) {
                                                        launchActivity3.X0 = false;
                                                        z29 = z28;
                                                        bundle3.putBoolean("premium_bot", true);
                                                    } else {
                                                        z29 = z28;
                                                    }
                                                    if (num4 != null) {
                                                        bundle3.putInt("message_id", num4.intValue());
                                                        if (num8 != null) {
                                                            bundle3.putInt("task_id", num8.intValue());
                                                        }
                                                        if (bArr3 != null) {
                                                            bundle3.putByteArray("poll_option_id", bArr3);
                                                        }
                                                    }
                                                    if (str51 != null) {
                                                        bundle3.putString("voicechat", str51);
                                                    }
                                                    byte[] bArr5 = bArr3;
                                                    if (z34) {
                                                        bundle3.putBoolean("videochat", true);
                                                    }
                                                    if (str52 != null) {
                                                        bundle3.putString("livestream", str52);
                                                    }
                                                    if (i28 >= 0) {
                                                        bundle3.putInt("video_timestamp", i28);
                                                    }
                                                    if (str54 != null) {
                                                        str55 = str54;
                                                        bundle3.putString("attach_bot", str55);
                                                    } else {
                                                        str55 = str54;
                                                    }
                                                    if (str53 != null) {
                                                        str56 = str52;
                                                        bundle3.putString("attach_bot_start_command", str53);
                                                    } else {
                                                        str56 = str52;
                                                    }
                                                    org.telegram.ui.ActionBar.h2 h2Var4 = (arrayList4.isEmpty() || str51 != null) ? null : (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList4);
                                                    if (h2Var4 == null || org.telegram.messenger.mp.u1(i27).E(bundle3, h2Var4, null, null)) {
                                                        boolean z46 = (h2Var4 instanceof bn) && ((bn) h2Var4).a() == j3;
                                                        if (z29 && z46) {
                                                            ArrayList arrayList5 = new ArrayList();
                                                            ArrayList<org.telegram.ui.ActionBar.d2> arrayList6 = h2Var4.sheetsStack;
                                                            if (arrayList6 != null) {
                                                                arrayList5.addAll(arrayList6);
                                                            }
                                                            if ((h2Var4.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) h2Var4.getParentLayout()).x()) != null && x10 != h2Var4 && (arrayList3 = x10.sheetsStack) != null) {
                                                                arrayList5.addAll(arrayList3);
                                                            }
                                                            int size = arrayList5.size();
                                                            int i44 = 0;
                                                            while (i44 < size) {
                                                                Object obj2 = arrayList5.get(i44);
                                                                i44++;
                                                            }
                                                            ArrayList arrayList7 = new ArrayList(ki.t2.b1);
                                                            int size2 = arrayList7.size();
                                                            int i45 = 0;
                                                            while (i45 < size2) {
                                                                Object obj3 = arrayList7.get(i45);
                                                                i45++;
                                                                ki.t2 t2Var = (ki.t2) obj3;
                                                                if (t2Var.J == j3) {
                                                                    t2Var.o(true);
                                                                }
                                                            }
                                                            bn bnVar3 = (bn) h2Var4;
                                                            if (bnVar3.x8 != 0) {
                                                                bnVar3.getMessagesController().K4(str50, bnVar3.f);
                                                            } else {
                                                                bnVar3.e7 = true;
                                                                org.telegram.messenger.mp messagesController = bnVar3.getMessagesController();
                                                                TLRPC.User user = bnVar3.f;
                                                                bnVar3.w8 = str50;
                                                                messagesController.K4(str50, user);
                                                                bnVar3.Pc(false);
                                                            }
                                                        } else {
                                                            if (str55 == null || !z46) {
                                                                long j11 = -j3;
                                                                TLRPC.Chat O04 = org.telegram.messenger.mp.u1(launchActivity3.P).O0(Long.valueOf(j11));
                                                                if (z27 || i29 > 0) {
                                                                    try {
                                                                        o60Var7.run();
                                                                    } catch (Exception e12) {
                                                                        org.telegram.messenger.a8.g(e12, true);
                                                                    }
                                                                    if (launchActivity3.isFinishing()) {
                                                                        return;
                                                                    }
                                                                    Bundle bundle4 = new Bundle();
                                                                    if (l15.longValue() < 0) {
                                                                        bundle4.putLong("chat_id", -l15.longValue());
                                                                    } else {
                                                                        bundle4.putLong("user_id", l15.longValue());
                                                                    }
                                                                    if (i29 > 0) {
                                                                        bundle4.putBoolean("open_gifts", true);
                                                                        bundle4.putInt("open_gifts_collection", i29);
                                                                        if (l15.longValue() == org.telegram.messenger.j10.i(launchActivity3.P).e()) {
                                                                            bundle4.putBoolean("my_profile", true);
                                                                        }
                                                                    }
                                                                    ((ActionBarLayout) launchActivity3.M()).S(new ProfileActivity(bundle4, null));
                                                                    return;
                                                                }
                                                                if (O04 == null || !O04.forum) {
                                                                    long j12 = j3;
                                                                    Integer num9 = num4;
                                                                    org.telegram.messenger.mp.u1(i27).t0(j12, num9 == null ? 0 : num9.intValue(), new q80(launchActivity3, o60Var7, str56, h2Var4, j12, num9, bundle3));
                                                                    return;
                                                                }
                                                                Long valueOf = (l14 != null || num4 == null) ? l14 : Long.valueOf(num4.intValue());
                                                                if (valueOf != null && valueOf.longValue() != 0) {
                                                                    launchActivity3.l0(j3, num4, null, num8, bArr5, new a70(o60Var7, 0), 0, -1);
                                                                    return;
                                                                }
                                                                LaunchActivity launchActivity6 = launchActivity3;
                                                                Bundle j13 = a8.p0.j(j11, "chat_id");
                                                                if (str51 != null) {
                                                                    j13.putString("voicechat", str51);
                                                                }
                                                                if (z34) {
                                                                    j13.putBoolean("videochat", true);
                                                                }
                                                                launchActivity6.t0(y91.J0(launchActivity6, j13));
                                                                try {
                                                                    o60Var7.run();
                                                                    return;
                                                                } catch (Exception e13) {
                                                                    org.telegram.messenger.a8.g(e13, true);
                                                                    return;
                                                                }
                                                            }
                                                            bn bnVar4 = (bn) h2Var4;
                                                            bnVar4.getClass();
                                                            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                                            tL_contacts_resolveUsername.username = str55;
                                                            bnVar4.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new ce(bnVar4, 0));
                                                        }
                                                    }
                                                } else {
                                                    o60Var6 = o60Var7;
                                                    TLRPC.User c25 = org.telegram.messenger.mp.u1(i41).c2(l12);
                                                    if (c25 == null || (c25.bot && c25.bot_nochats)) {
                                                        try {
                                                            if (arrayList4.isEmpty()) {
                                                                return;
                                                            }
                                                            org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) arrayList4.get(arrayList4.size() - 1)).t(org.telegram.messenger.gd.M0(2131753106, null), null).j();
                                                            return;
                                                        } catch (Exception e14) {
                                                            org.telegram.messenger.a8.g(e14, true);
                                                            return;
                                                        }
                                                    }
                                                    z21 = true;
                                                    Bundle l19 = org.telegram.ui.Cells.c0.l(2, "onlySelect", "dialogsType", true);
                                                    l19.putBoolean("resetDelegate", false);
                                                    l19.putBoolean("closeFragment", false);
                                                    l19.putBoolean("allowGroups", str66 != null);
                                                    l19.putBoolean("allowChannels", str67 != null);
                                                    String str97 = TextUtils.isEmpty(str66) ? TextUtils.isEmpty(str67) ? null : str67 : str66;
                                                    cx cxVar3 = new cx(l19);
                                                    cxVar3.E2 = new kg.m1(launchActivity5, i41, c25, str68, str97, cxVar3);
                                                    launchActivity5.t0(cxVar3);
                                                }
                                                o60Var6 = o60Var7;
                                            } else {
                                                o60 o60Var8 = o60Var4;
                                                int z02 = launchActivity2.z0(i24, o60Var8, num4, num5, l14, null, null, org.telegram.messenger.mp.u1(i24).O0(Long.valueOf(-l12.longValue())), null, null, 0, -1);
                                                iArr2[0] = z02;
                                                if (z02 != 0) {
                                                    return;
                                                }
                                                o60Var6 = o60Var8;
                                                z21 = true;
                                            }
                                            o60Var6.run();
                                            return;
                                        }
                                        TLRPC.User c26 = org.telegram.messenger.mp.u1(i24).c2(l12);
                                        if (c26 != null && c26.bot) {
                                            org.telegram.messenger.mp.u1(i24).E3(null, c26, str43, 0, bVar3, z38, z39);
                                        }
                                        o60Var6 = o60Var4;
                                        z21 = true;
                                        o60Var6.run();
                                        return;
                                    }
                                }
                                o60Var6.run();
                                return;
                            } catch (Exception e15) {
                                org.telegram.messenger.a8.g(e15, z21);
                                return;
                            }
                            z21 = true;
                            org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                            if (Q != null) {
                                if (Q instanceof bn) {
                                    ((bn) Q).Xb();
                                }
                                Typeface typeface = org.telegram.messenger.g0.a;
                                try {
                                    Double.parseDouble(str57);
                                    z22 = true;
                                } catch (NumberFormatException unused2) {
                                    z22 = false;
                                }
                                if (z22) {
                                    org.telegram.ui.Components.lc.b0(Q).t(org.telegram.messenger.gd.M0(2131747989, null), null).j();
                                } else {
                                    org.telegram.ui.Components.lc.b0(Q).t(org.telegram.messenger.gd.M0(2131747942, null), null).j();
                                }
                            }
                        }
                    };
                    bVar2 = bVar2;
                    f22.a(str, str31, x10Var);
                    iArr = iArr2;
                    u1Var = u1Var4;
                    i15 = 0;
                    o60Var = null;
                    if (iArr[i15] == 0) {
                    }
                }
            }
            i16 = i7;
            i15 = 0;
            iArr = iArr2;
            o60Var = null;
            u1Var = u1Var4;
            if (iArr[i15] == 0) {
            }
        }
        i16 = i7;
        i15 = 0;
        iArr = iArr2;
        o60Var = null;
        u1Var = u1Var4;
        if (iArr[i15] == 0) {
        }
    }

    public final void C(int i7) {
        K1 = this;
        Set set = org.telegram.messenger.z0.a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - org.telegram.messenger.bz.H) >= 86400) {
            org.telegram.messenger.bz.H = currentTimeMillis;
            Utilities.f.c(new org.telegram.messenger.x0(currentTimeMillis, org.telegram.messenger.w7.j(4), 0));
        }
        if (org.telegram.messenger.s2.a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - org.telegram.messenger.bz.I) >= 3600) {
                org.telegram.messenger.bz.I = currentTimeMillis2;
                Utilities.f.c(new jg.x(currentTimeMillis2, 7));
            }
        }
        if ((Build.VERSION.SDK_INT < 26 || i7 != 0) && !this.w1) {
            Utilities.e.d(new u70(this, i7, 1), 2000L);
        }
    }

    public final void D0(int i7) {
        this.y0.setInternalNavigationBarColor(i7);
        org.telegram.ui.ActionBar.g3 N = N();
        if (N != null) {
            N.setNavigationBarColor(i7);
        }
    }

    public final void E() {
        if (!org.telegram.messenger.g0.Q1() || this.r0 == null) {
            return;
        }
        Boolean bool = org.telegram.messenger.g0.L;
        if (bool != null) {
            if (bool.booleanValue() != (org.telegram.messenger.t0.b != null && org.telegram.messenger.t0.b.getResources().getBoolean(R.bool.isTablet))) {
                return;
            }
        }
        if (org.telegram.messenger.g0.E || (org.telegram.messenger.g0.P1() && getResources().getConfiguration().orientation != 2)) {
            this.N0 = true;
            List<org.telegram.ui.ActionBar.h2> fragmentStack = this.r0.getFragmentStack();
            if (!fragmentStack.isEmpty()) {
                while (fragmentStack.size() > 0) {
                    org.telegram.ui.ActionBar.h2 h2Var = fragmentStack.get(0);
                    if (h2Var instanceof bn) {
                        bn bnVar = (bn) h2Var;
                        bnVar.m5 = true;
                        bnVar.n5 = true;
                    }
                    h2Var.onPause();
                    h2Var.onFragmentDestroy();
                    h2Var.setParentLayout(null);
                    fragmentStack.remove(h2Var);
                    this.p0.c(-1, h2Var);
                }
                org.telegram.ui.Components.rc0 rc0Var = this.z0;
                if (rc0Var == null || rc0Var.b.getVisibility() != 0) {
                    this.p0.X(true, true);
                }
            }
            this.r0.getView().setVisibility(8);
            this.u0.setVisibility(this.p0.getFragmentStack().isEmpty() ? 0 : 8);
            return;
        }
        this.N0 = false;
        List<org.telegram.ui.ActionBar.h2> fragmentStack2 = this.p0.getFragmentStack();
        if (fragmentStack2.size() >= 2) {
            while (1 < fragmentStack2.size()) {
                org.telegram.ui.ActionBar.h2 h2Var2 = fragmentStack2.get(1);
                if (h2Var2 instanceof bn) {
                    bn bnVar2 = (bn) h2Var2;
                    bnVar2.m5 = true;
                    bnVar2.n5 = true;
                }
                h2Var2.onPause();
                h2Var2.onFragmentDestroy();
                h2Var2.setParentLayout(null);
                fragmentStack2.remove(h2Var2);
                this.r0.c(-1, h2Var2);
            }
            org.telegram.ui.Components.rc0 rc0Var2 = this.z0;
            if (rc0Var2 == null || rc0Var2.b.getVisibility() != 0) {
                this.p0.X(true, true);
                this.r0.X(true, true);
            }
        }
        this.r0.getView().setVisibility(this.r0.getFragmentStack().isEmpty() ? 8 : 0);
        this.u0.setVisibility(this.r0.getFragmentStack().isEmpty() ? 0 : 8);
    }

    public final void E0() {
        org.telegram.ui.ActionBar.p3 p3Var;
        ViewGroup view;
        if (this.y0.indexOfChild(this.s0) != -1) {
            p3Var = this.y0;
            view = this.s0;
        } else {
            p3Var = this.y0;
            view = this.p0.getView();
        }
        int indexOfChild = p3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.y0.removeViewAt(indexOfChild);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            y80 y80Var = new y80(this, this);
            this.s0 = y80Var;
            if (indexOfChild != -1) {
                this.y0.addView(y80Var, indexOfChild, c8.ma.c(-1.0f, -1));
            } else {
                this.y0.addView(y80Var, c8.ma.c(-1.0f, -1));
            }
            v8 v8Var = new v8(this, null);
            this.u0 = v8Var;
            v8Var.setOccupyStatusBar(false);
            this.u0.U(org.telegram.ui.ActionBar.n6.s0());
            this.s0.addView(this.u0, c8.ma.w(-1, -1));
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
            this.t0.setOnTouchListener(new d0(this, 3));
            this.t0.setOnClickListener(new bi.o(23));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.q0 = actionBarLayout2;
            actionBarLayout2.T0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.q0.setBackgroundView(this.t0);
            this.q0.setUseAlphaAnimations(true);
            this.q0.setFragmentStack(arrayList);
            this.q0.setDelegate(this);
            this.q0.setDrawerLayoutContainer(this.y0);
            ViewGroup view2 = this.q0.getView();
            view2.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.s0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.p0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.p0.getView());
            }
            this.p0.setFragmentStack(this.e0);
            if (indexOfChild != -1) {
                this.y0.addView(this.p0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.y0.addView(this.p0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        c8.sb.a(this, org.telegram.messenger.bz.x1, false);
    }

    public final void F(boolean z10, boolean z11, boolean z12) {
        zm zmVar;
        boolean z13;
        ArrayList arrayList = this.e0;
        boolean z14 = true;
        org.telegram.ui.ActionBar.h2 h2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList) : null;
        char c10 = 2;
        if (h2Var != null && (h2Var.isRemovingFromStack() || h2Var.isInPreviewMode())) {
            h2Var = arrayList.size() > 1 ? (org.telegram.ui.ActionBar.h2) i5.c.h(2, arrayList) : null;
        }
        if (h2Var != null) {
            h2Var.hasForceLightStatusBar();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (z11) {
            if (h2Var != null) {
                z13 = h2Var.isLightStatusBar();
                if (h2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) h2Var.getParentLayout();
                    if (actionBarLayout.x() == null || actionBarLayout.x().getLastSheet() == null) {
                        ArrayList<org.telegram.ui.ActionBar.d2> arrayList2 = h2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) i5.c.h(1, h2Var.sheetsStack);
                            if (d2Var.s()) {
                                z13 = d2Var.f();
                            }
                        }
                    } else {
                        org.telegram.ui.ActionBar.d2 lastSheet = actionBarLayout.x().getLastSheet();
                        if (lastSheet.s()) {
                            z13 = lastSheet.f();
                        }
                    }
                }
            } else {
                z13 = i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.s8, true)) > 0.699999988079071d;
            }
            org.telegram.messenger.g0.o3(this, z13);
        }
        if (i7 >= 26 && z12 && (!z10 || h2Var == null || !h2Var.isInPreviewMode())) {
            int x02 = (h2Var == null || !z10) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, true) : h2Var.getNavigationBarColor();
            if (h2Var instanceof bn) {
                bn bnVar = (bn) h2Var;
                if (!bnVar.ic || (bnVar.w.s != 1 && ((zmVar = bnVar.Ba) == null || !zmVar.q))) {
                    c10 = 1;
                }
            } else {
                c10 = 0;
            }
            if (N() != null && N().I > 0) {
                c10 = 0;
            }
            if (this.p0.x() != null) {
                ox x10 = this.p0.x();
                if (x10.sheetsStack != null) {
                    for (int i10 = 0; i10 < x10.sheetsStack.size(); i10++) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = x10.sheetsStack.get(i10);
                        if (d2Var2.y()) {
                            x02 = d2Var2.e(x02);
                            c10 = 0;
                        }
                    }
                }
            }
            Iterator it = ki.t2.b1.iterator();
            while (it.hasNext()) {
                x02 = ((ki.t2) it.next()).e(x02);
                c10 = 0;
            }
            D0(x02);
            if ((c10 != 0 || org.telegram.messenger.g0.B(x02) < 0.721f) && c10 != 1) {
                z14 = false;
            }
            org.telegram.messenger.g0.l3(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final org.telegram.ui.ActionBar.u1 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
            p10.setCanceledOnTouchOutside(true);
            p10.setOnDismissListener(new di.u1(9, this, p10));
            this.D0.add(p10);
            return p10;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    @Override // org.telegram.ui.ww
    public final boolean G() {
        ArrayList arrayList = this.V;
        return (arrayList != null && arrayList.size() == 1) || this.S != null;
    }

    public final void H(boolean z10) {
        org.telegram.messenger.t3 t3Var;
        long j3;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = false;
        if (sharedInstance == null || (t3Var = sharedInstance.groupCall) == null) {
            this.m0 = false;
            return;
        }
        boolean z12 = this.m0;
        TLRPC.InputPeer groupCallPeer = sharedInstance.getGroupCallPeer();
        if (groupCallPeer != null) {
            j3 = groupCallPeer.user_id;
            if (j3 == 0) {
                long j10 = groupCallPeer.chat_id;
                if (j10 == 0) {
                    j10 = groupCallPeer.channel_id;
                }
                j3 = -j10;
            }
        } else {
            j3 = org.telegram.messenger.j10.i(this.P).n;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(j3);
        boolean z13 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted) ? false : true;
        if (z13 && groupCallParticipant.raise_hand_rating != 0) {
            z11 = true;
        }
        this.m0 = z11;
        if (z10 || !z12 || z11 || z13 || f40.C5 != null) {
            return;
        }
        N0(38);
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.h2 h2Var;
        ArrayList arrayList = this.f0;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.g0;
            if (arrayList2.isEmpty()) {
                ArrayList arrayList3 = this.e0;
                h2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList3) : null;
            } else {
                h2Var = (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList2);
            }
        } else {
            h2Var = (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList);
        }
        if (org.telegram.ui.Components.lc.a(h2Var)) {
            aVar.a(org.telegram.ui.Components.lc.b0(h2Var)).j();
        }
    }

    public final void I() {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.h2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (org.telegram.messenger.g0.Q1()) {
            ArrayList arrayList2 = this.f0;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((org.telegram.ui.ActionBar.h2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.g0;
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                ((org.telegram.ui.ActionBar.h2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void I0() {
        ?? r16;
        org.telegram.messenger.cd cdVar;
        if (org.telegram.messenger.j10.i(this.P).p()) {
            try {
                if (!this.H0 && !org.telegram.messenger.t0.x) {
                    String string = org.telegram.messenger.mp.g1().getString("language_showed2", "");
                    final String str = org.telegram.messenger.mp.u1(this.P).R3;
                    if (string.equals(str)) {
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.a8.b("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final org.telegram.messenger.cd[] cdVarArr = new org.telegram.messenger.cd[2];
                    boolean z10 = false;
                    String str2 = str.contains("-") ? str.split("-")[0] : str;
                    String str3 = "in".equals(str2) ? "id" : "iw".equals(str2) ? "he" : "jw".equals(str2) ? "jv" : null;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= org.telegram.messenger.gd.E0().J.size()) {
                            r16 = z10;
                            break;
                        }
                        org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) org.telegram.messenger.gd.E0().J.get(i7);
                        boolean z11 = z10;
                        if (cdVar2.c.equals("en")) {
                            cdVarArr[z11 ? 1 : 0] = cdVar2;
                        }
                        if (cdVar2.c.replace("_", "-").equals(str) || cdVar2.c.equals(str2) || cdVar2.c.equals(str3)) {
                            cdVarArr[1] = cdVar2;
                        }
                        if (cdVarArr[z11 ? 1 : 0] != null && cdVarArr[1] != null) {
                            r16 = z11;
                            break;
                        } else {
                            i7++;
                            z10 = z11 ? 1 : 0;
                        }
                    }
                    org.telegram.messenger.cd cdVar3 = cdVarArr[r16];
                    if (cdVar3 != null && (cdVar = cdVarArr[1]) != null && cdVar3 != cdVar) {
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.a8.b("show lang alert for " + cdVarArr[r16].b() + " and " + cdVarArr[1].b());
                        }
                        this.I0 = null;
                        this.J0 = null;
                        this.H0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = cdVarArr[1].c();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        final int i10 = 0;
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) { // from class: org.telegram.ui.c80
                            public final /* synthetic */ LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (i10) {
                                    case 0:
                                        String str4 = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final int i12 = 0;
                                        final LaunchActivity launchActivity = this.b;
                                        final org.telegram.messenger.cd[] cdVarArr2 = cdVarArr;
                                        final String str5 = str;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.v60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.I0 = hashMap2;
                                                        if (launchActivity2.J0 != null && hashMap2 != null) {
                                                            org.telegram.messenger.cd[] cdVarArr3 = cdVarArr2;
                                                            launchActivity2.J0(cdVarArr3[1], cdVarArr3[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.I0 != null) {
                                                            org.telegram.messenger.cd[] cdVarArr4 = cdVarArr2;
                                                            launchActivity3.J0(cdVarArr4[1], cdVarArr4[0], str5);
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
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final int i13 = 1;
                                        final LaunchActivity launchActivity2 = this.b;
                                        final org.telegram.messenger.cd[] cdVarArr3 = cdVarArr;
                                        final String str7 = str;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.v60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.cd[] cdVarArr32 = cdVarArr3;
                                                            launchActivity22.J0(cdVarArr32[1], cdVarArr32[0], str7);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.I0 != null) {
                                                            org.telegram.messenger.cd[] cdVarArr4 = cdVarArr3;
                                                            launchActivity3.J0(cdVarArr4[1], cdVarArr4[0], str7);
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
                        tL_langpack_getStrings2.lang_code = cdVarArr[r16].c();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        final int i11 = 1;
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) { // from class: org.telegram.ui.c80
                            public final /* synthetic */ LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i112 = 0;
                                switch (i11) {
                                    case 0:
                                        String str4 = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i112 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i112);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i112++;
                                            }
                                        }
                                        final int i12 = 0;
                                        final LaunchActivity launchActivity = this.b;
                                        final org.telegram.messenger.cd[] cdVarArr2 = cdVarArr;
                                        final String str5 = str;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.v60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.cd[] cdVarArr32 = cdVarArr2;
                                                            launchActivity22.J0(cdVarArr32[1], cdVarArr32[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.I0 != null) {
                                                            org.telegram.messenger.cd[] cdVarArr4 = cdVarArr2;
                                                            launchActivity3.J0(cdVarArr4[1], cdVarArr4[0], str5);
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
                                            while (i112 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i112);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i112++;
                                            }
                                        }
                                        final int i13 = 1;
                                        final LaunchActivity launchActivity2 = this.b;
                                        final org.telegram.messenger.cd[] cdVarArr3 = cdVarArr;
                                        final String str7 = str;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.v60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.cd[] cdVarArr32 = cdVarArr3;
                                                            launchActivity22.J0(cdVarArr32[1], cdVarArr32[0], str7);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.I0 != null) {
                                                            org.telegram.messenger.cd[] cdVarArr4 = cdVarArr3;
                                                            launchActivity3.J0(cdVarArr4[1], cdVarArr4[0], str7);
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[Catch: Exception -> 0x00e7, TryCatch #0 {Exception -> 0x00e7, blocks: (B:3:0x0008, B:6:0x0025, B:11:0x0061, B:14:0x006c, B:17:0x0074, B:20:0x0086, B:23:0x008f, B:27:0x00c3, B:30:0x008d, B:33:0x00eb), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(org.telegram.messenger.cd cdVar, org.telegram.messenger.cd cdVar2, String str) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        boolean z12 = true;
        try {
            this.H0 = false;
            org.telegram.messenger.cd cdVar3 = cdVar;
            if (!cdVar3.j) {
                try {
                    if (!org.telegram.messenger.gd.E0().B.h()) {
                        z11 = false;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = U(2131752097, "ChooseYourLanguage", this.I0);
                        u1Var.T = U(2131752097, "ChooseYourLanguage", this.J0);
                        LinearLayout linearLayout = new LinearLayout(this);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.s4[] s4VarArr = new org.telegram.ui.Cells.s4[2];
                        String U = U(2131751116, "English", this.I0);
                        org.telegram.messenger.cd[] cdVarArr = {!z11 ? cdVar3 : cdVar2, !z11 ? cdVar2 : cdVar3};
                        if (z11) {
                            cdVar3 = cdVar2;
                        }
                        org.telegram.messenger.cd[] cdVarArr2 = {cdVar3};
                        i10 = 0;
                        for (i7 = 2; i10 < i7; i7 = 2) {
                            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(this);
                            s4VarArr[i10] = s4Var;
                            org.telegram.messenger.cd cdVar4 = cdVarArr[i10];
                            String str2 = cdVar4 == cdVar2 ? U : null;
                            s4Var.b.setText(str2 != null ? str2 : cdVar4.a);
                            s4Var.c.setText(cdVar4.b);
                            s4Var.e = cdVar4;
                            s4Var.d = z12;
                            s4VarArr[i10].setTag(Integer.valueOf(i10));
                            org.telegram.ui.Cells.s4 s4Var2 = s4VarArr[i10];
                            int i11 = org.telegram.ui.ActionBar.n6.I5;
                            org.telegram.ui.ActionBar.u6.Q(s4Var2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 2, -1), null, org.telegram.ui.ActionBar.u6.M(i11), null);
                            s4VarArr[i10].a.a(i10 == 0, false);
                            linearLayout.addView(s4VarArr[i10], c8.ma.o(-1, 50));
                            s4VarArr[i10].setOnClickListener(new org.telegram.ui.Components.c31(24, cdVarArr2, s4VarArr));
                            i10++;
                            z12 = true;
                        }
                        org.telegram.ui.Cells.s4 s4Var3 = new org.telegram.ui.Cells.s4(this);
                        String U2 = U(2131752096, "ChooseYourLanguageOther", this.I0);
                        String U3 = U(2131752096, "ChooseYourLanguageOther", this.J0);
                        s4Var3.b.setText(U2);
                        s4Var3.c.setText(U3);
                        s4Var3.a.a(false, false);
                        s4Var3.e = null;
                        s4Var3.d = false;
                        int i12 = org.telegram.ui.ActionBar.n6.I5;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 2, -1);
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
                        s4Var3.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(s4Var3, h02, null, M, null);
                        s4Var3.setOnClickListener(new j40(this, 4));
                        linearLayout.addView(s4Var3, c8.ma.o(-1, 50));
                        alertDialog$Builder.o(linearLayout);
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131747638, null), new at(14, this, cdVarArr2));
                        this.G0 = F0(alertDialog$Builder);
                        org.telegram.messenger.mp.g1().edit().putString("language_showed2", str).commit();
                    }
                } catch (Exception e10) {
                    e = e10;
                    z10 = true;
                    org.telegram.messenger.a8.g(e, z10);
                    return;
                }
            }
            z11 = true;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.S = U(2131752097, "ChooseYourLanguage", this.I0);
            u1Var2.T = U(2131752097, "ChooseYourLanguage", this.J0);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            org.telegram.ui.Cells.s4[] s4VarArr2 = new org.telegram.ui.Cells.s4[2];
            String U4 = U(2131751116, "English", this.I0);
            org.telegram.messenger.cd[] cdVarArr3 = {!z11 ? cdVar3 : cdVar2, !z11 ? cdVar2 : cdVar3};
            if (z11) {
            }
            org.telegram.messenger.cd[] cdVarArr22 = {cdVar3};
            i10 = 0;
            while (i10 < i7) {
            }
            org.telegram.ui.Cells.s4 s4Var32 = new org.telegram.ui.Cells.s4(this);
            String U22 = U(2131752096, "ChooseYourLanguageOther", this.I0);
            String U32 = U(2131752096, "ChooseYourLanguageOther", this.J0);
            s4Var32.b.setText(U22);
            s4Var32.c.setText(U32);
            s4Var32.a.a(false, false);
            s4Var32.e = null;
            s4Var32.d = false;
            int i122 = org.telegram.ui.ActionBar.n6.I5;
            org.telegram.ui.Cells.y h022 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i122, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i122);
            s4Var32.setBackground(h022);
            org.telegram.ui.ActionBar.u6.j(s4Var32, h022, null, M2, null);
            s4Var32.setOnClickListener(new j40(this, 4));
            linearLayout2.addView(s4Var32, c8.ma.o(-1, 50));
            alertDialog$Builder2.o(linearLayout2);
            alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131747638, null), new at(14, this, cdVarArr22));
            this.G0 = F0(alertDialog$Builder2);
            org.telegram.messenger.mp.g1().edit().putString("language_showed2", str).commit();
        } catch (Exception e11) {
            e = e11;
            z10 = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Type inference failed for: r14v3, types: [org.telegram.messenger.gd] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList K(String str, String str2) {
        String str3;
        String lowerCase;
        TLRPC.User c22;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.P);
        org.telegram.messenger.i5 r10 = org.telegram.messenger.i5.r(this.P);
        ArrayList arrayList = new ArrayList(r10.f0);
        ArrayList arrayList2 = new ArrayList();
        String str4 = null;
        boolean z10 = false;
        if (str2 != null) {
            String d = pf.b.d(str2, false);
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) r10.l0.get(d);
            if (tL_contact == null) {
                tL_contact = (TLRPC.TL_contact) r10.m0.get(d.substring(Math.max(0, d.length() - 7)));
            }
            if (tL_contact != null) {
                TLRPC.User c23 = u12.c2(Long.valueOf(tL_contact.user_id));
                if (c23 == null || c23.self) {
                    str3 = null;
                    if (arrayList2.isEmpty() && str3 != null) {
                        lowerCase = str3.trim().toLowerCase();
                        if (!TextUtils.isEmpty(lowerCase)) {
                            ?? r82 = 1;
                            String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
                            if (lowerCase.equals(S0) || S0.length() == 0) {
                                S0 = null;
                            }
                            String[] strArr = {lowerCase, S0};
                            int size = arrayList.size();
                            int i7 = 0;
                            while (i7 < size) {
                                TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList.get(i7);
                                if (tL_contact2 != null && (c22 = u12.c2(Long.valueOf(tL_contact2.user_id))) != null && !c22.self) {
                                    char c10 = 3;
                                    String[] strArr2 = new String[3];
                                    strArr2[z10 ? 1 : 0] = org.telegram.messenger.i5.m(z10 ? 1 : 0, c22.first_name, c22.last_name).toLowerCase();
                                    String S02 = org.telegram.messenger.gd.E0().S0(strArr2[z10 ? 1 : 0], r82, z10);
                                    strArr2[r82] = S02;
                                    if (strArr2[z10 ? 1 : 0].equals(S02)) {
                                        strArr2[r82] = str4;
                                    }
                                    if (org.telegram.messenger.o10.A(c22)) {
                                        strArr2[2] = org.telegram.messenger.gd.M0(2131746071, str4).toLowerCase();
                                    } else if (c22.self) {
                                        strArr2[2] = org.telegram.messenger.gd.M0(2131745706, str4).toLowerCase();
                                    }
                                    int i10 = z10 ? 1 : 0;
                                    int i11 = i10;
                                    boolean z11 = z10;
                                    while (true) {
                                        if (i10 < 2) {
                                            String str5 = strArr[i10];
                                            if (str5 != null) {
                                                for (?? r72 = z11; r72 < c10; r72++) {
                                                    String str6 = strArr2[r72];
                                                    if (str6 != null && (str6.startsWith(str5) || str6.contains(" ".concat(str5)))) {
                                                        i11 = 1;
                                                        break;
                                                    }
                                                    c10 = 3;
                                                }
                                                String o4 = org.telegram.messenger.o10.o(c22);
                                                if (i11 == 0 && o4 != null && o4.startsWith(str5)) {
                                                    i11 = 1;
                                                }
                                                if (i11 != 0) {
                                                    arrayList2.add(tL_contact2);
                                                    break;
                                                }
                                            }
                                            i10++;
                                            z11 = false;
                                            c10 = 3;
                                        }
                                    }
                                }
                                i7++;
                                str4 = null;
                                z10 = false;
                                r82 = 1;
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

    public final void K0(boolean z10, boolean z11, int i7, int i10, bh bhVar) {
        if (this.y0 == null || isFinishing()) {
            return;
        }
        if (this.z0 == null) {
            this.z0 = new org.telegram.ui.Components.rc0(this);
        }
        org.telegram.messenger.bz.x = true;
        int i11 = 0;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().W) {
            g4.v().m(false, true);
        }
        hi.ta.w();
        org.telegram.messenger.fj fjVar = MediaController.B().v0;
        if (fjVar != null && fjVar.h4()) {
            MediaController.B().q(true, true, false, false);
        }
        this.z0.show();
        org.telegram.ui.Components.qc0 qc0Var = this.z0.b;
        ArrayList arrayList = this.A0;
        arrayList.isEmpty();
        qc0Var.m(z11, i7, i10, new o60(6, this, bhVar));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) arrayList.get(i12);
            if (z10) {
                int size = arrayList.size() - 1;
            }
            pc0Var.m(z11, i7, i10, null);
        }
        org.telegram.messenger.bz.C = true;
        h80 h80Var = new h80(this);
        this.z0.b.setDelegate(h80Var);
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.Components.pc0) obj).setDelegate(h80Var);
        }
        try {
            org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0(int i7, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f10;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (this.B0 == null) {
            final org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0(this);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, uy0Var, null);
            int i10 = org.telegram.messenger.g0.m;
            if (i10 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                uy0Var.addView(view, new FrameLayout.LayoutParams(-1, i10));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            final int i11 = 1;
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.logo_middle);
            linearLayout.addView(imageView, c8.ma.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.messenger.f3.l(textView, i12, null, 1, 17.0f);
            textView.setText(org.telegram.messenger.gd.M0(2131746589, null));
            linearLayout.addView(textView, c8.ma.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            uy0Var.a = textView2;
            org.telegram.ui.ActionBar.u6.U(textView2, i12, null);
            org.telegram.ui.ActionBar.u6.G(textView2, org.telegram.ui.ActionBar.n6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0((boolean) (objArr2 == true ? 1 : 0)));
            textView2.setGravity(51);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            linearLayout.addView(textView2, c8.ma.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f10 = 4.0f;
            scrollView.setPadding(org.telegram.messenger.g0.L(24.0f), i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            uy0Var.addView(scrollView, c8.ma.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(org.telegram.messenger.gd.M0(2131751593, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i13 = org.telegram.ui.ActionBar.n6.y6;
            org.telegram.ui.ActionBar.u6.U(textView3, i13, null);
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.y J0 = org.telegram.ui.ActionBar.n6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.x0(null, i13, false));
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i13, 25);
            textView3.setBackground(J0);
            org.telegram.ui.ActionBar.u6.j(textView3, J0, null, g10, null);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f));
            uy0Var.addView(textView3, c8.ma.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            final Object[] objArr3 = objArr == true ? 1 : 0;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ry0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = objArr3;
                    int i15 = 1;
                    uy0 uy0Var2 = uy0Var;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.gd.M0(2131743963, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = M0;
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751591, null), new sy0(uy0Var2, i15));
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131753754, null), null);
                            u1Var.U = org.telegram.messenger.gd.M0(2131743738, null);
                            alertDialog$Builder.p();
                            break;
                        default:
                            if (uy0Var2.c.min_age_confirm == 0) {
                                uy0Var2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.gd.M0(2131743741, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                u1Var2.S = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131754304, null), new sy0(uy0Var2, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                u1Var2.U = org.telegram.messenger.gd.a0("TosAgeText", null, 2131743742, org.telegram.messenger.gd.G(uy0Var2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                break;
                            }
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(org.telegram.messenger.gd.M0(2131754717, null));
            textView4.setGravity(17);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = org.telegram.messenger.g0.L(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            uy0Var.addView(textView4, c8.ma.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ry0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = i11;
                    int i15 = 1;
                    uy0 uy0Var2 = uy0Var;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.gd.M0(2131743963, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = M0;
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751591, null), new sy0(uy0Var2, i15));
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131753754, null), null);
                            u1Var.U = org.telegram.messenger.gd.M0(2131743738, null);
                            alertDialog$Builder.p();
                            break;
                        default:
                            if (uy0Var2.c.min_age_confirm == 0) {
                                uy0Var2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.gd.M0(2131743741, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                u1Var2.S = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131754304, null), new sy0(uy0Var2, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                u1Var2.U = org.telegram.messenger.gd.a0("TosAgeText", null, 2131743742, org.telegram.messenger.gd.G(uy0Var2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                break;
                            }
                    }
                }
            });
            View view2 = new View(this);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view2, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(75.0f);
            layoutParams.gravity = 80;
            uy0Var.addView(view2, layoutParams);
            this.B0 = uy0Var;
            uy0Var.setAlpha(0.0f);
            this.y0.addView(this.B0, c8.ma.c(-1.0f, -1));
            this.B0.setDelegate(new n80(this));
        } else {
            f10 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = org.telegram.messenger.j10.i(i7).a0;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            org.telegram.messenger.j10.i(i7).a0 = tL_help_termsOfService;
            org.telegram.messenger.j10.i(i7).v(false);
        }
        org.telegram.ui.Components.uy0 uy0Var2 = this.B0;
        if (uy0Var2.getVisibility() != 0) {
            uy0Var2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        org.telegram.messenger.fj.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i14 = 0; i14 < length; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == '-') {
                    int i16 = i14 + 2;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        org.telegram.ui.Components.ta taVar = new org.telegram.ui.Components.ta(L2, L3);
                        spannableStringBuilder.replace(i15, i14 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(taVar, i15, i16, 33);
                    }
                }
            }
        }
        uy0Var2.a.setText(spannableStringBuilder);
        uy0Var2.c = tL_help_termsOfService;
        uy0Var2.d = i7;
        this.B0.animate().alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.F).setListener(null).start();
    }

    public final org.telegram.ui.ActionBar.s4 M() {
        ActionBarLayout actionBarLayout = this.p0;
        ArrayList arrayList = this.Q;
        return !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.s4) i5.c.h(1, arrayList) : actionBarLayout;
    }

    public final void M0(int i7, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        boolean z11 = false;
        if (this.C0 == null) {
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i10 = org.telegram.ui.ActionBar.n6.d6;
            y9Var.x = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.n6.x0(null, i10, false), 0});
            y9Var.y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.n6.x0(null, i10, false), 0});
            org.telegram.ui.ActionBar.u6.h(i10, y9Var, null);
            int i11 = (int) (org.telegram.messenger.g0.m / org.telegram.messenger.g0.p);
            FrameLayout frameLayout = new FrameLayout(this);
            y9Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.m));
            org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(this);
            ph0Var.f(R.raw.qr_code_logo, org.telegram.messenger.ks.t1, org.telegram.messenger.ks.t1, null);
            ph0Var.d();
            ph0Var.getAnimatedDrawable().K(1);
            ph0Var.setScaleType(ImageView.ScaleType.CENTER);
            ph0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(14.0f));
            frameLayout.addView(ph0Var, c8.ma.d(-2, -2.0f, 17, 0.0f, i11, 0.0f, 0.0f));
            ph0Var.setOnClickListener(new org.telegram.ui.Components.x9(y9Var));
            FrameLayout frameLayout2 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            y9Var.f = scrollView;
            org.telegram.messenger.g0.x3(scrollView, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.s8, false));
            scrollView.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
            scrollView.setClipToPadding(false);
            y9Var.addView(scrollView, c8.ma.d(-1, -1.0f, 51, 27.0f, i11 + org.telegram.messenger.ks.I2, 27.0f, 130.0f));
            scrollView.addView(frameLayout2);
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(textView, i12, null);
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.gd.M0(2131743579, null));
            frameLayout2.addView(textView, c8.ma.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            y9Var.a = textView2;
            org.telegram.ui.ActionBar.u6.U(textView2, i12, null);
            org.telegram.ui.ActionBar.u6.G(textView2, org.telegram.ui.ActionBar.n6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(z11));
            textView2.setGravity(49);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            frameLayout2.addView(textView2, c8.ma.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            bi.a3 a3Var = new bi.a3(this, 13);
            y9Var.d = a3Var;
            a3Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            a3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 4.0f));
            a3Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            y9Var.addView(a3Var, c8.ma.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            a3Var.setOnClickListener(new org.telegram.ui.Components.x9(y9Var, this));
            TextView textView3 = new TextView(this);
            y9Var.b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            a3Var.addView(textView3, c8.ma.e(-2, -2, 17));
            bi.a3 a3Var2 = new bi.a3(14, this, y9Var);
            y9Var.c = a3Var2;
            a3Var2.setWillNotDraw(false);
            a3Var2.setAlpha(0.0f);
            a3Var2.setScaleX(0.1f);
            a3Var2.setScaleY(0.1f);
            a3Var2.setVisibility(4);
            org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(a3Var2);
            y9Var.e = qh0Var;
            qh0Var.d(null, true, false);
            qh0Var.o = -1;
            a3Var.addView(a3Var2, c8.ma.e(36, 36, 17));
            this.C0 = y9Var;
            this.y0.addView(y9Var, c8.ma.c(-1.0f, -1));
        }
        org.telegram.ui.Components.y9 y9Var2 = this.C0;
        TextView textView4 = y9Var2.b;
        y9Var2.w = 0;
        y9Var2.n = tL_help_appUpdate;
        y9Var2.s = i7;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            y9Var2.r = org.telegram.messenger.w7.r(null, document);
        }
        if (y9Var2.getVisibility() != 0) {
            y9Var2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        org.telegram.messenger.fj.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
        y9Var2.a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            textView4.setText(org.telegram.messenger.gd.M0(2131743585, null) + String.format(Locale.US, " (%1$s)", org.telegram.messenger.g0.i0(tL_help_appUpdate.document.size, false, false)));
        } else {
            textView4.setText(org.telegram.messenger.gd.M0(2131743585, null));
        }
        org.telegram.messenger.ks.f(y9Var2.s).c(y9Var2, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks.f(y9Var2.s).c(y9Var2, org.telegram.messenger.ks.Z1);
        org.telegram.messenger.ks.f(y9Var2.s).c(y9Var2, org.telegram.messenger.ks.X1);
        if (z10) {
            org.telegram.messenger.t0.u();
        }
    }

    public final org.telegram.ui.ActionBar.g3 N() {
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

    public final void N0(int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || this.e0.isEmpty() || sharedInstance.groupCall == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.ui.ActionBar.h2 h2Var = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
        if (h2Var instanceof me0) {
            h2Var = ((me0) h2Var).c0();
        }
        UndoView undoView = null;
        if (h2Var instanceof bn) {
            bn bnVar = (bn) h2Var;
            if (chat != null && bnVar.a() == (-chat.id)) {
                chat = null;
            }
            bnVar.h8();
            undoView = bnVar.N3;
        } else if (h2Var instanceof cx) {
            undoView = ((cx) h2Var).l4();
        } else if (h2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) h2Var).M;
        }
        if (undoView != null) {
            undoView.m(0L, chat, i7);
        }
        if (i7 != 38 || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().playAllowTalkSound();
    }

    public final org.telegram.ui.ActionBar.h2 O() {
        return ee0.B1(this.P, false).getInt("currentViewNum", 0) != 0 ? new ee0() : new v50();
    }

    public final void O0(int i7) {
        P0(i7, new l60(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r7 == null) goto L29;
     */
    @Override // org.telegram.ui.ww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P(cx cxVar) {
        hi.d7 l10;
        FileOutputStream fileOutputStream;
        ArrayList arrayList = this.V;
        if (arrayList == null || arrayList.isEmpty()) {
            String str = this.S;
            if (str != null) {
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, str, 0, true, 0, 0);
                try {
                    Bitmap r10 = org.telegram.messenger.zy.r(1, str);
                    File file = new File(org.telegram.messenger.w7.z(4), "-2147483648_" + org.telegram.messenger.bz.p() + ".jpg");
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                    try {
                        r10.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        efVar.c = file.getAbsolutePath();
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            org.telegram.messenger.a8.g(th, true);
                        } catch (Throwable th4) {
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th4;
                        }
                    }
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                l10 = hi.d7.l(efVar);
            }
            l10 = null;
        } else {
            ArrayList X7 = bn.X7(this.V, false, null);
            if (!X7.isEmpty()) {
                l10 = hi.d7.l((org.telegram.messenger.ef) X7.get(0));
            }
            l10 = null;
        }
        if (l10 == null) {
            return false;
        }
        fi.j6 o4 = org.telegram.messenger.mp.u1(this.P).R1().o();
        if (o4 != null && o4.a(this.P, 1)) {
            cxVar.showDialog(new ug.l0(o4.b(), this.P, this, cxVar, null));
            return false;
        }
        l10.o = true;
        l10.M = false;
        hi.ta.D(this, this.P).R(null, l10, 0L);
        cxVar.finishFragment();
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

    public final void P0(int i7, org.telegram.messenger.i9 i9Var) {
        if (i7 == org.telegram.messenger.j10.t0 || !org.telegram.messenger.j10.r(i7)) {
            return;
        }
        this.l1 = true;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        org.telegram.messenger.j10.t0 = i7;
        org.telegram.messenger.j10.i(0).v(false);
        A();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f4, Integer.valueOf(i7));
        if (org.telegram.messenger.g0.Q1()) {
            this.q0.a0();
            this.r0.a0();
            if (!this.N0) {
                if (this.r0.getFragmentStack().isEmpty()) {
                    this.u0.setVisibility(0);
                }
                this.r0.getView().setVisibility(8);
            }
            this.q0.getView().setVisibility(8);
        }
        this.p0.a0();
        this.p0.c(-3, (me0) i9Var.m(null));
        this.p0.X(true, true);
        if (org.telegram.messenger.g0.Q1()) {
            this.q0.X(true, true);
            this.r0.X(true, true);
        }
        if (!org.telegram.messenger.t0.x) {
            ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        }
        if (org.telegram.messenger.j10.i(i7).a0 != null) {
            L0(i7, org.telegram.messenger.j10.i(i7).a0);
        }
        Q0();
        this.l1 = false;
    }

    public final void Q0() {
        int i7;
        String str;
        if (this.p0 == null) {
            return;
        }
        int connectionState = ConnectionsManager.getInstance(this.P).getConnectionState();
        this.d0 = connectionState;
        if (connectionState == 2) {
            str = "WaitingForNetwork";
            i7 = 2131742975;
        } else if (connectionState == 5) {
            str = "Updating";
            i7 = 2131743573;
        } else if (connectionState == 4) {
            str = "ConnectingToProxyWithDots";
            i7 = 2131751794;
        } else if (connectionState == 1) {
            str = "Connecting";
            i7 = 2131751798;
        } else {
            i7 = 0;
            str = null;
        }
        t60 t60Var = (connectionState == 1 || connectionState == 4) ? new t60(this, 9) : null;
        ActionBarLayout actionBarLayout = this.p0;
        actionBarLayout.N0 = str;
        actionBarLayout.O0 = i7;
        actionBarLayout.P0 = t60Var;
        for (int i10 = 0; i10 < actionBarLayout.V0.size(); i10++) {
            ((org.telegram.ui.ActionBar.h2) actionBarLayout.V0.get(i10)).setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, t60Var);
        }
    }

    public final int R() {
        return this.e0.size();
    }

    public final rh.d S() {
        return this.g1;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final boolean W(android.content.Intent r122, boolean r123, boolean r124, boolean r125, vf.b r126, boolean r127, boolean r128) {
        /*
            Method dump skipped, instructions count: 15996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.W(android.content.Intent, boolean, boolean, boolean, vf.b, boolean, boolean):boolean");
    }

    public final void X() {
        ActionMode actionMode = this.l0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Y(int i7, TLRPC.User user, String str, vf.b bVar) {
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = u12.s1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new d3.b(1), new m60(this, bVar, u12, i7, user));
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final void a(float f10) {
        if (g4.G() && g4.v().W) {
            g4 v = g4.v();
            v.Q();
            g4.e0(v);
            if (v.g0 != null) {
                v.v0[0].b.g1();
                v.v0[1].b.g1();
                v.g0.invalidate();
                v.r0.invalidate();
                if (f10 == 1.0f) {
                    v.v0[0].c.f();
                    v.v0[1].c.f();
                }
            }
        }
        if (PhotoViewer.A1()) {
            PhotoViewer.p1().s3();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        long j3;
        long j10;
        long j11;
        Boolean bool = org.telegram.messenger.g0.L;
        if (bool == null) {
            return;
        }
        org.telegram.messenger.g0.L = null;
        if (bool.booleanValue() != org.telegram.messenger.g0.Q1()) {
            boolean booleanValue = bool.booleanValue();
            ArrayList arrayList = this.f0;
            ArrayList arrayList2 = this.g0;
            ArrayList arrayList3 = this.e0;
            if (booleanValue) {
                arrayList3.addAll(arrayList2);
                arrayList3.addAll(arrayList);
                arrayList2.clear();
                arrayList.clear();
                j10 = 0;
                j3 = 0;
            } else {
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList2.clear();
                arrayList.clear();
                int size = arrayList4.size();
                long j12 = 0;
                j3 = 0;
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                    if (!(h2Var instanceof me0)) {
                        if (h2Var instanceof cx) {
                            cx cxVar = (cx) h2Var;
                            if (cxVar.x4() && !cxVar.t4()) {
                                j11 = 0;
                                if (cxVar.a3 != 0) {
                                    if (!(h2Var instanceof bn)) {
                                        bn bnVar = (bn) h2Var;
                                        if (!bnVar.c()) {
                                            arrayList2.add(h2Var);
                                            if (j12 == j11) {
                                                j12 = bnVar.a();
                                                j3 = bnVar.d();
                                            }
                                        }
                                    }
                                    arrayList.add(h2Var);
                                }
                            }
                        }
                        j11 = 0;
                        if (!(h2Var instanceof bn)) {
                        }
                        arrayList.add(h2Var);
                    }
                    arrayList3.add(h2Var);
                }
                j10 = j12;
            }
            E0();
            this.p0.X(true, true);
            if (org.telegram.messenger.g0.Q1()) {
                this.r0.X(true, true);
                this.q0.X(true, true);
                int size2 = arrayList3.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Object obj3 = (org.telegram.ui.ActionBar.h2) obj2;
                    if (obj3 instanceof me0) {
                        obj3 = ((me0) obj3).K;
                    }
                    if (obj3 instanceof cx) {
                        cx cxVar2 = (cx) obj3;
                        if (cxVar2.x4()) {
                            org.telegram.messenger.sr srVar = cxVar2.r2;
                            srVar.a = j10;
                            srVar.b = j3;
                            bx[] bxVarArr = cxVar2.f0;
                            if (bxVarArr != null) {
                                for (bx bxVar : bxVarArr) {
                                    if (bxVar.p() && org.telegram.messenger.g0.Q1()) {
                                        bxVar.d.s = srVar.a;
                                    }
                                }
                                int i11 = org.telegram.messenger.mp.I8;
                                cxVar2.D5(512, true);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.q0) {
            this.r0.X(z10, z10);
            this.p0.X(z10, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final boolean c(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.h2 h2Var) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (org.telegram.messenger.g0.Q1()) {
            boolean z10 = h2Var instanceof cx;
            if (z10 || (h2Var instanceof me0)) {
                boolean z11 = actionBarLayout != this.p0;
                if (z11 && z10 && !((cx) h2Var).x4()) {
                    z11 = false;
                }
                if (z11) {
                    this.p0.a0();
                    this.p0.c(-1, h2Var);
                    this.q0.a0();
                    this.q0.getView().setVisibility(8);
                    if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                        this.u0.setVisibility(0);
                    }
                    return false;
                }
            } else {
                if ((h2Var instanceof bn) && !((bn) h2Var).c()) {
                    boolean z12 = this.N0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.r0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.u0.setVisibility(8);
                        this.r0.a0();
                        this.r0.c(-1, h2Var);
                        if (!this.q0.getFragmentStack().isEmpty()) {
                            while (this.q0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.q0;
                                actionBarLayout4.d0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.q0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.p0)) {
                        actionBarLayout2.c(-1, h2Var);
                        if (!this.q0.getFragmentStack().isEmpty()) {
                            while (this.q0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.q0;
                                actionBarLayout5.d0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.q0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.q0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= 4) {
                            i7 = -1;
                            break;
                        }
                        if (org.telegram.messenger.j10.i(i7).p()) {
                            break;
                        }
                        i7++;
                    }
                    if ((h2Var instanceof ee0) && i7 == -1) {
                        this.u0.setVisibility(0);
                        this.t0.setBackgroundColor(0);
                    } else {
                        this.t0.setBackgroundColor(2130706432);
                    }
                    this.q0.c(-1, h2Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void c0() {
        org.telegram.ui.ActionBar.s4[] s4VarArr = {this.p0, this.q0, this.r0};
        for (int i7 = 0; i7 < 3; i7++) {
            org.telegram.ui.ActionBar.s4 s4Var = s4VarArr[i7];
            if (s4Var instanceof ActionBarLayout) {
                ((ActionBarLayout) s4Var).E();
            }
        }
    }

    public final boolean d0(boolean z10) {
        boolean z11;
        pg.i iVar = c8.sb.a;
        if (iVar != null) {
            if (iVar.s) {
                if (z10) {
                    iVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.rc0 rc0Var = this.z0;
        if (rc0Var == null || rc0Var.b.getVisibility() != 0) {
            org.telegram.ui.ActionBar.n3 n3Var = this.x0;
            if (n3Var == null || !(z11 = n3Var.V)) {
                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.cm0.I;
                if (u1Var != null) {
                    if (z10) {
                        u1Var.dismiss();
                        org.telegram.ui.Components.cm0.I = null;
                        return false;
                    }
                } else if (ns.g0 == null || !ns.p().E) {
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                        if (z10) {
                            SecretMediaViewer.f().e(true, false);
                            return false;
                        }
                    } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                        if (z10) {
                            PhotoViewer.p1().z0(true, false);
                            return false;
                        }
                    } else {
                        if (!g4.G() || !g4.v().W) {
                            return true;
                        }
                        if (z10) {
                            g4.v().m(true, false);
                        }
                    }
                } else if (z10) {
                    ns.p().n();
                    return false;
                }
            } else if (z10 && z11) {
                n3Var.a(false);
                return false;
            }
        } else if (z10) {
            finish();
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x04d8 A[Catch: all -> 0x0489, TryCatch #2 {all -> 0x0489, blocks: (B:203:0x046c, B:205:0x0481, B:206:0x048e, B:208:0x049f, B:209:0x04a5, B:211:0x04b0, B:213:0x04b6, B:214:0x04c0, B:216:0x04c6, B:220:0x04d8, B:225:0x04e8, B:226:0x04e6, B:227:0x04eb, B:229:0x04ef, B:231:0x04f5, B:232:0x0500, B:234:0x0510, B:235:0x0516), top: B:202:0x046c }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e6 A[Catch: all -> 0x0489, TryCatch #2 {all -> 0x0489, blocks: (B:203:0x046c, B:205:0x0481, B:206:0x048e, B:208:0x049f, B:209:0x04a5, B:211:0x04b0, B:213:0x04b6, B:214:0x04c0, B:216:0x04c6, B:220:0x04d8, B:225:0x04e8, B:226:0x04e6, B:227:0x04eb, B:229:0x04ef, B:231:0x04f5, B:232:0x0500, B:234:0x0510, B:235:0x0516), top: B:202:0x046c }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0510 A[Catch: all -> 0x0489, TryCatch #2 {all -> 0x0489, blocks: (B:203:0x046c, B:205:0x0481, B:206:0x048e, B:208:0x049f, B:209:0x04a5, B:211:0x04b0, B:213:0x04b6, B:214:0x04c0, B:216:0x04c6, B:220:0x04d8, B:225:0x04e8, B:226:0x04e6, B:227:0x04eb, B:229:0x04ef, B:231:0x04f5, B:232:0x0500, B:234:0x0510, B:235:0x0516), top: B:202:0x046c }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x052f A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, blocks: (B:238:0x051f, B:240:0x052f, B:242:0x0533, B:243:0x053c, B:245:0x0540, B:250:0x05b3, B:252:0x05d5, B:253:0x05f1, B:255:0x05f8, B:256:0x0606), top: B:237:0x051f }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05d5 A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, blocks: (B:238:0x051f, B:240:0x052f, B:242:0x0533, B:243:0x053c, B:245:0x0540, B:250:0x05b3, B:252:0x05d5, B:253:0x05f1, B:255:0x05f8, B:256:0x0606), top: B:237:0x051f }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05f8 A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, blocks: (B:238:0x051f, B:240:0x052f, B:242:0x0533, B:243:0x053c, B:245:0x0540, B:250:0x05b3, B:252:0x05d5, B:253:0x05f1, B:255:0x05f8, B:256:0x0606), top: B:237:0x051f }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0515  */
    @Override // org.telegram.messenger.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.Components.lc b02;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.Components.lc b03;
        f40 f40Var;
        char c10;
        char c11;
        ActionBarLayout actionBarLayout;
        Runnable runnable;
        Bitmap bitmap;
        boolean z10;
        View view;
        int i11 = 4;
        int i12 = 0;
        int i13 = 1;
        if (i7 == org.telegram.messenger.ks.I2) {
            while (true) {
                if (i12 >= 4) {
                    i12 = -1;
                    break;
                } else if (org.telegram.messenger.j10.i(i12).p()) {
                    break;
                } else {
                    i12++;
                }
            }
            org.telegram.ui.Components.uy0 uy0Var = this.B0;
            if (uy0Var != null) {
                uy0Var.setVisibility(8);
            }
            if (i12 != -1) {
                O0(i12);
                return;
            }
            sy0.a0(true);
            I();
            this.p0.Z();
            if (org.telegram.messenger.g0.Q1()) {
                this.q0.Z();
                this.r0.Z();
            }
            v50 v50Var = new v50();
            v50Var.O = true;
            t0(v50Var);
            return;
        }
        if (i7 == org.telegram.messenger.ks.p3) {
            Long l10 = (Long) objArr[0];
            l10.getClass();
            w0(l10, null, null, objArr.length > 1 ? (org.telegram.ui.Cells.r1) objArr[1] : null);
            return;
        }
        if (i7 == org.telegram.messenger.ks.n4) {
            if (objArr[0] != this) {
                e0();
                finish();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.T1) {
            int connectionState = ConnectionsManager.getInstance(i10).getConnectionState();
            if (this.d0 != connectionState) {
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("switch to state " + connectionState);
                }
                this.d0 = connectionState;
                Q0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.j0 || i7 == org.telegram.messenger.ks.Z4) {
            return;
        }
        int i14 = 5;
        int i15 = 2;
        if (i7 == org.telegram.messenger.ks.M0) {
            Integer num = (Integer) objArr[0];
            if (num.intValue() != 6) {
                if (num.intValue() != 3 || this.E0 == null) {
                    if (num.intValue() == 4) {
                        L0(i10, (TLRPC.TL_help_termsOfService) objArr[1]);
                        return;
                    }
                    org.telegram.ui.ActionBar.h2 h2Var = !this.e0.isEmpty() ? (org.telegram.ui.ActionBar.h2) i5.c.h(1, this.e0) : null;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(R.string.AppName, null);
                    if (h2Var != null) {
                        HashMap hashMap = new HashMap();
                        int i16 = org.telegram.ui.ActionBar.n6.L5;
                        hashMap.put("info1", Integer.valueOf(h2Var.getThemedColor(i16)));
                        hashMap.put("info2", Integer.valueOf(h2Var.getThemedColor(i16)));
                        alertDialog$Builder.m(R.raw.not_available, 52, h2Var.getThemedColor(i16), hashMap);
                        alertDialog$Builder.n(i16, h2Var.getResourceProvider());
                        alertDialog$Builder.a.X = true;
                    }
                    if (num.intValue() != 2 && num.intValue() != 3) {
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131748139, null), new ai.s1(this, i10, 13));
                    }
                    if (num.intValue() == 5) {
                        alertDialog$Builder.a.U = org.telegram.messenger.gd.M0(2131747933, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                    } else if (num.intValue() == 0) {
                        alertDialog$Builder.a.U = org.telegram.messenger.gd.M0(2131747935, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                    } else if (num.intValue() == 1) {
                        alertDialog$Builder.g(org.telegram.messenger.gd.L0(2131747934));
                        alertDialog$Builder.k(org.telegram.messenger.gd.L0(2131747638), null);
                    } else if (num.intValue() == 2) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf((String) objArr[1]);
                        String str = (String) objArr[2];
                        if (str.startsWith("PREMIUM_GIFT_SELF_REQUIRED_")) {
                            String str2 = (String) objArr[1];
                            int indexOf = str2.indexOf(42);
                            int i17 = indexOf + 1;
                            int indexOf2 = str2.indexOf(42, i17);
                            if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
                                valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) str2.substring(i17, indexOf2));
                                valueOf.setSpan(new hi.ia(this, 7), indexOf, indexOf2 - 1, 33);
                            }
                        }
                        alertDialog$Builder.g(valueOf);
                        if (str.startsWith("AUTH_KEY_DROP_")) {
                            alertDialog$Builder.k(org.telegram.messenger.gd.L0(2131752578), null);
                            alertDialog$Builder.h(org.telegram.messenger.gd.L0(2131748551), new h80(this));
                        } else if (str.startsWith("PREMIUM_")) {
                            alertDialog$Builder.l(org.telegram.messenger.gd.L0(2131743996));
                            alertDialog$Builder.k(org.telegram.messenger.gd.L0(2131747638), null);
                        } else {
                            alertDialog$Builder.k(org.telegram.messenger.gd.L0(2131747638), null);
                        }
                    } else if (num.intValue() == 3) {
                        alertDialog$Builder.l(org.telegram.messenger.gd.L0(2131746416));
                        alertDialog$Builder.g(org.telegram.messenger.gd.L0(2131743541));
                        alertDialog$Builder.k(org.telegram.messenger.gd.L0(2131747638), null);
                        this.E0 = F0(alertDialog$Builder);
                        return;
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.R0) {
            HashMap hashMap2 = (HashMap) objArr[0];
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            alertDialog$Builder2.l(org.telegram.messenger.gd.L0(R.string.AppName));
            alertDialog$Builder2.k(org.telegram.messenger.gd.L0(2131747638), null);
            alertDialog$Builder2.h(org.telegram.messenger.gd.L0(2131745226), new ai.r1(this, hashMap2, i10, 12));
            alertDialog$Builder2.g(org.telegram.messenger.gd.L0(2131745227));
            if (this.e0.isEmpty()) {
                return;
            }
            ((org.telegram.ui.ActionBar.h2) i5.c.h(1, this.e0)).showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i7 == org.telegram.messenger.ks.C4) {
            v8 v8Var = this.u0;
            if (v8Var != null) {
                v8Var.U(org.telegram.ui.ActionBar.n6.s0());
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.n0) {
            this.e1.g();
            return;
        }
        if (i7 == org.telegram.messenger.ks.A4) {
            boolean z11 = this.e0.size() > 1 && (i5.c.h(1, this.e0) instanceof ProfileActivity);
            y0((!z11 || ((ProfileActivity) i5.c.h(1, this.e0)).y4()) ? z11 : false);
            return;
        }
        if (i7 == org.telegram.messenger.ks.B4) {
            I0();
            return;
        }
        if (i7 == org.telegram.messenger.ks.c1) {
            if (this.e0.isEmpty()) {
                return;
            }
            LaunchActivity launchActivity = H1;
            if (launchActivity == null || launchActivity.N() == null || H1.N().m((TLRPC.TL_webPage) objArr[0]) == null) {
                ((org.telegram.ui.ActionBar.h2) i5.c.h(1, this.e0)).createArticleViewer(false).L(null, (TLRPC.TL_webPage) objArr[0], (String) objArr[1], null);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.Q) {
            ActionBarLayout actionBarLayout2 = this.p0;
            if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                return;
            }
            ((Integer) objArr[0]).getClass();
            HashMap hashMap3 = (HashMap) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            org.telegram.ui.ActionBar.h2 h2Var2 = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this);
            int i18 = org.telegram.ui.ActionBar.n6.L5;
            alertDialog$Builder3.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.n6.v0(i18), null);
            alertDialog$Builder3.n(i18, null);
            alertDialog$Builder3.l(org.telegram.messenger.gd.L0(2131743581));
            alertDialog$Builder3.g(org.telegram.messenger.gd.L0(2131743582));
            alertDialog$Builder3.k(org.telegram.messenger.gd.L0(2131747638), new p60(i10, hashMap3, booleanValue, booleanValue2, 1));
            alertDialog$Builder3.h(org.telegram.messenger.gd.L0(2131752578), new p60(i10, hashMap3, booleanValue, booleanValue2, 2));
            alertDialog$Builder3.a.x0 = new p60(i10, hashMap3, booleanValue, booleanValue2, 0);
            org.telegram.ui.ActionBar.u1 a10 = alertDialog$Builder3.a();
            h2Var2.showDialog(a10);
            a10.setCanceledOnTouchOutside(false);
            return;
        }
        if (i7 == org.telegram.messenger.ks.q4) {
            org.telegram.ui.ActionBar.u6.b0(null, true);
            c0();
            if (!((Boolean) objArr[0]).booleanValue()) {
                try {
                    setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.s8) | (-16777216)));
                } catch (Exception unused) {
                }
            }
            F(objArr.length > 2 && ((Boolean) objArr[2]).booleanValue(), true, (!(objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : true) || this.W0 || this.p0.B()) ? false : true);
            return;
        }
        int i19 = 10;
        if (i7 != org.telegram.messenger.ks.w4) {
            if (i7 == org.telegram.messenger.ks.N0) {
                try {
                    ((Status) objArr[0]).c(this, org.telegram.messenger.ks.W1);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            int i20 = 16;
            if (i7 == org.telegram.messenger.ks.Y1) {
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
                        Utilities.e.c(new up(this, this.S0, file, i20));
                        return;
                    } else {
                        r0(this.T0, this.R0, this.S0);
                        i0();
                        return;
                    }
                }
                if (str4.equals(str3)) {
                    this.P0 = null;
                    File file2 = new File(org.telegram.messenger.t0.h(), a8.p0.r(new StringBuilder("remote"), this.T0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = this.T0;
                    org.telegram.ui.ActionBar.m6 m0 = org.telegram.ui.ActionBar.n6.m0(file2, tL_theme.title, tL_theme);
                    if (m0 != null) {
                        if (m0.c != null && !new File(m0.c).exists()) {
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(m0.F).sendRequest(getwallpaper, new e00(i11, this, m0));
                            return;
                        }
                        TLRPC.TL_theme tL_theme2 = this.T0;
                        org.telegram.ui.ActionBar.m6 v = org.telegram.ui.ActionBar.n6.v(file2, tL_theme2.title, tL_theme2, true);
                        if (v != null) {
                            t0(new x71(v, true, 0, false, false));
                        }
                    }
                    i0();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.Z1) {
                String str6 = (String) objArr[0];
                if (str6.equals(this.P0) || str6.equals(this.Q0)) {
                    i0();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.N4) {
                if (org.telegram.messenger.t0.x) {
                    return;
                }
                if (org.telegram.messenger.t0.w) {
                    h0();
                    return;
                } else {
                    g0();
                    return;
                }
            }
            if (i7 == org.telegram.messenger.ks.u4) {
                F(objArr.length > 0 && ((Boolean) objArr[0]).booleanValue(), true, !this.W0);
                return;
            }
            if (i7 == org.telegram.messenger.ks.v1) {
                if (objArr.length <= 1 || this.e0.isEmpty()) {
                    return;
                }
                org.telegram.ui.Components.b5.c0(this.P, (TLRPC.TL_error) objArr[2], (org.telegram.ui.ActionBar.h2) i5.c.h(1, this.e0), (TLObject) objArr[1], new Object[0]);
                return;
            }
            if (i7 == org.telegram.messenger.ks.n5) {
                org.telegram.ui.Components.b5.c0(this.P, (TLRPC.TL_error) objArr[1], (org.telegram.ui.ActionBar.h2) i5.c.h(1, this.e0), (TLObject) objArr[0], new Object[0]);
                return;
            }
            if (i7 == org.telegram.messenger.ks.x1) {
                org.telegram.messenger.ri.d0(i10).k2(this, (TLObject) objArr[0], 2, !this.e0.isEmpty() ? (org.telegram.ui.ActionBar.h2) i5.c.h(1, this.e0) : null, false, true);
                return;
            }
            if (i7 == org.telegram.messenger.ks.S4) {
                if (this.e0.isEmpty()) {
                    return;
                }
                int intValue = ((Integer) objArr[0]).intValue();
                org.telegram.ui.ActionBar.n2 n2Var = (!f40.D5 || (f40Var = f40.C5) == null) ? null : f40Var.c;
                org.telegram.ui.ActionBar.h2 h2Var3 = n2Var == null ? (org.telegram.ui.ActionBar.h2) i5.c.h(1, this.e0) : null;
                switch (intValue) {
                    case 0:
                        TLRPC.Document document = (TLRPC.Document) objArr[1];
                        int intValue2 = ((Integer) objArr[2]).intValue();
                        org.telegram.ui.Components.mv0 mv0Var = new org.telegram.ui.Components.mv0(this, null, 1, intValue2, document, null);
                        int i21 = (intValue2 == 6 || intValue2 == 7) ? 3500 : 1500;
                        if (h2Var3 == null) {
                            org.telegram.ui.Components.gc.f(n2Var, mv0Var, i21).j();
                            break;
                        } else {
                            org.telegram.ui.Components.gc.g(h2Var3, mv0Var, i21).j();
                            break;
                        }
                        break;
                    case 1:
                        if (h2Var3 == null) {
                            org.telegram.ui.Components.lc.a0(n2Var, null).t((String) objArr[1], null).j();
                            break;
                        } else {
                            org.telegram.ui.Components.lc.b0(h2Var3).t((String) objArr[1], null).j();
                            break;
                        }
                    case 2:
                        String L0 = org.telegram.messenger.gd.L0(((Long) objArr[1]).longValue() > 0 ? 2131742570 : 2131752405);
                        if (n2Var != null) {
                            i6Var = null;
                            b02 = org.telegram.ui.Components.lc.a0(n2Var, null);
                        } else {
                            i6Var = null;
                            b02 = org.telegram.ui.Components.lc.b0(h2Var3);
                        }
                        b02.t(L0, i6Var).j();
                        break;
                    case 3:
                        String L02 = org.telegram.messenger.gd.L0(((Long) objArr[1]).longValue() > 0 ? 2131742551 : 2131752274);
                        if (n2Var != null) {
                            i6Var2 = null;
                            b03 = org.telegram.ui.Components.lc.a0(n2Var, null);
                        } else {
                            i6Var2 = null;
                            b03 = org.telegram.ui.Components.lc.b0(h2Var3);
                        }
                        b03.t(L02, i6Var2).j();
                        break;
                    case 4:
                        if (h2Var3 == null) {
                            org.telegram.ui.Components.lc.a0(n2Var, null).u((String) objArr[1], (String) objArr[2], null).j();
                            break;
                        } else {
                            org.telegram.ui.Components.lc.b0(h2Var3).u((String) objArr[1], (String) objArr[2], h2Var3.getResourceProvider()).j();
                            break;
                        }
                    case 5:
                        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(this, (z80) objArr[1]);
                        if (h2Var3 == null) {
                            org.telegram.ui.Components.gc.f(n2Var, r6Var, 1500).j();
                            break;
                        } else {
                            org.telegram.ui.Components.gc.g(h2Var3, r6Var, 1500).j();
                            break;
                        }
                    case 6:
                        if (h2Var3 == null) {
                            org.telegram.ui.Components.lc.a0(n2Var, null).T((String) objArr[1]).j();
                            break;
                        } else {
                            org.telegram.ui.Components.lc.b0(h2Var3).T((String) objArr[1]).j();
                            break;
                        }
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.w2) {
                H(false);
                return;
            }
            if (i7 == org.telegram.messenger.ks.l5) {
                if (this.e0.isEmpty()) {
                    return;
                }
                org.telegram.ui.ActionBar.h2 h2Var4 = (org.telegram.ui.ActionBar.h2) i5.c.h(1, this.e0);
                if (h2Var4.getParentActivity() != null) {
                    h2Var4.showDialog(new ug.l0(((Integer) objArr[0]).intValue(), this.P, h2Var4.getParentActivity(), h2Var4, null));
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.i5) {
                org.telegram.messenger.mp.u1(this.P).h7.edit().remove("transcribeButtonPressed").apply();
                return;
            }
            if (i7 == org.telegram.messenger.ks.q5) {
                int intValue3 = ((Integer) objArr[0]).intValue();
                String[] strArr = (intValue3 != 0 || Build.VERSION.SDK_INT < 31) ? null : new String[]{"android.permission.BLUETOOTH_CONNECT"};
                if (strArr != null) {
                    int i22 = this.c1 + 1;
                    this.c1 = i22;
                    this.b1.put(i22, intValue3);
                    e0.b.f(this, strArr, this.c1);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.u5) {
                long longValue = ((Long) objArr[0]).longValue();
                if (((Boolean) objArr[1]).booleanValue()) {
                    qg.c.r(longValue, this.p0);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.P5) {
                if (this.u1 == null) {
                    TLParseException tLParseException = (TLParseException) objArr[0];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tLParseException.getMessage());
                    sb2.append("\n\n");
                    sb2.append(org.telegram.messenger.g0.D0());
                    StringBuilder sb3 = new StringBuilder();
                    StringWriter stringWriter = new StringWriter();
                    tLParseException.printStackTrace(new PrintWriter(stringWriter));
                    sb3.append(org.telegram.messenger.g0.D0());
                    sb3.append("\n\n");
                    sb3.append(stringWriter);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this, null);
                    alertDialog$Builder4.l("TL Error");
                    alertDialog$Builder4.g(sb2);
                    alertDialog$Builder4.h(org.telegram.messenger.gd.L0(2131751756), new zr(sb3, i20));
                    alertDialog$Builder4.k(org.telegram.messenger.gd.L0(2131747638), null);
                    alertDialog$Builder4.j(new l70(this, i13));
                    org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder4.p();
                    this.u1 = p10;
                    p10.setCanceledOnTouchOutside(true);
                    return;
                }
                return;
            }
            if (i7 != org.telegram.messenger.ks.Q5) {
                if (i7 == org.telegram.messenger.ks.T5) {
                    org.telegram.messenger.k2 k2Var = (org.telegram.messenger.k2) objArr[0];
                    org.telegram.ui.ActionBar.h2 Q = Q();
                    org.telegram.ui.Components.lc b04 = Q instanceof bn ? org.telegram.ui.Components.lc.b0(Q) : org.telegram.ui.Components.lc.Y();
                    String s5 = org.telegram.messenger.n5.s(this.P, k2Var.a);
                    TLRPC.JoinChatBotResult joinChatBotResult = k2Var.b;
                    org.telegram.messenger.g0.h3(new o60(i14, this, joinChatBotResult instanceof TLRPC.TL_joinChatBotResultApproved ? b04.H(R.raw.contact_check, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Z(2131749182, s5))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultDeclined ? b04.H(R.raw.e_hand_2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Z(2131749181, s5))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultQueued ? b04.Q(R.raw.timer_toast, 24, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Z(2131749180, s5))) : null), 400L);
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
                sb4.append(org.telegram.messenger.g0.D0());
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(this, null);
                alertDialog$Builder5.l("Memory Leak Found");
                alertDialog$Builder5.g(sb4);
                alertDialog$Builder5.k(org.telegram.messenger.gd.L0(2131747638), null);
                alertDialog$Builder5.j(new l70(this, i15));
                org.telegram.ui.ActionBar.u1 p11 = alertDialog$Builder5.p();
                this.v1 = p11;
                p11.setCanceledOnTouchOutside(true);
                return;
            }
            return;
        }
        if (objArr[2] == null || this.n0.getVisibility() == 0) {
            c10 = 3;
            if (objArr[2] == null) {
                c11 = 0;
                cx.C4 = false;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) objArr[c11];
                boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int intValue5 = ((Integer) objArr[c10]).intValue();
                Runnable runnable2 = objArr.length > 7 ? (Runnable) objArr[7] : null;
                actionBarLayout = this.p0;
                if (actionBarLayout == null) {
                    return;
                }
                actionBarLayout.getClass();
                actionBarLayout.f(new org.telegram.ui.ActionBar.r4(m6Var, intValue5, booleanValue3, true), runnable2);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout3 = this.q0;
                    if (actionBarLayout3 != null) {
                        runnable = null;
                        actionBarLayout3.f(new org.telegram.ui.ActionBar.r4(m6Var, intValue5, booleanValue3, true), null);
                    } else {
                        runnable = null;
                    }
                    ActionBarLayout actionBarLayout4 = this.r0;
                    if (actionBarLayout4 != null) {
                        actionBarLayout4.f(new org.telegram.ui.ActionBar.r4(m6Var, intValue5, booleanValue3, true), runnable);
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
                org.telegram.ui.Components.ph0 ph0Var = (org.telegram.ui.Components.ph0) objArr[5];
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
                Z(this.y0);
                View view2 = this.F0;
                if (view2 != null && view2.getBackground() != null) {
                    this.F0.getBackground().setAlpha(0);
                }
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        bitmap = org.telegram.messenger.g0.B0(getWindow());
                        if (bitmap != null) {
                            z10 = true;
                            if (bitmap == null) {
                                bitmap = org.telegram.messenger.g0.L3(this.y0);
                            }
                            if (bitmap != null && ph0Var != null) {
                                org.telegram.ui.Components.g01.a(bitmap, !z10 ? null : this.y0, ph0Var);
                            }
                            view = this.F0;
                            if (view != null && view.getBackground() != null) {
                                this.F0.getBackground().setAlpha(org.telegram.messenger.ks.e4);
                            }
                            this.v0.removeView(this.n0);
                            this.n0 = new org.telegram.ui.Components.g01(this);
                            org.telegram.ui.Components.mh0 animatedDrawable = ph0Var == null ? ph0Var.getAnimatedDrawable() : null;
                            c10 = 3;
                            this.v0.addView(this.n0, 1, c8.ma.c(-1.0f, -1));
                            this.o0.setVisibility(8);
                            if (ph0Var != null) {
                                org.telegram.ui.Components.g01 g01Var = this.n0;
                                ColorFilter colorFilter = animatedDrawable != null ? animatedDrawable.getColorFilter() : null;
                                g01Var.n = ph0Var;
                                g01Var.r = colorFilter;
                            }
                            this.n0.setImageBitmap(bitmap);
                            this.n0.setVisibility(0);
                            int i23 = measuredWidth - iArr[0];
                            int i24 = measuredHeight - iArr[1];
                            double sqrt = Math.sqrt((i24 * i24) + (i23 * i23));
                            int i25 = iArr[0];
                            int i26 = measuredHeight - iArr[1];
                            float max = (float) Math.max(sqrt, Math.sqrt((i26 * i26) + (i25 * i25)));
                            int i27 = measuredWidth - iArr[0];
                            int i28 = iArr[1];
                            double sqrt2 = Math.sqrt((i28 * i28) + (i27 * i27));
                            int i29 = iArr[0];
                            int i30 = iArr[1];
                            float max2 = Math.max(max, (float) Math.max(sqrt2, Math.sqrt((i30 * i30) + (i29 * i29))));
                            this.n0.b(iArr[0], iArr[1], booleanValue4);
                            float f10 = max2 / 0.6f;
                            org.telegram.ui.Components.g01 g01Var2 = this.n0;
                            org.telegram.ui.Cells.h1 h1Var = org.telegram.ui.Components.g01.x;
                            float f11 = !booleanValue4 ? 0.0f : f10;
                            if (booleanValue4) {
                                f10 = 0.0f;
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g01Var2, h1Var, f11, f10);
                            ofFloat.setDuration(450L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.xs.e);
                            ofFloat.addListener(new fi.a3(this, ph0Var, animatedDrawable, i19));
                            if (this.F0 != null) {
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new s60(this, 0));
                                ofFloat2.setDuration(ofFloat.getDuration());
                                ofFloat2.start();
                            }
                            org.telegram.messenger.g0.h3(new t60(this, i13), !booleanValue4 ? (measuredHeight - iArr[1]) / org.telegram.messenger.g0.L(2.25f) : 50L);
                            ofFloat.start();
                        }
                    } else {
                        bitmap = null;
                    }
                    this.v0.addView(this.n0, 1, c8.ma.c(-1.0f, -1));
                    this.o0.setVisibility(8);
                    if (ph0Var != null) {
                    }
                    this.n0.setImageBitmap(bitmap);
                    this.n0.setVisibility(0);
                    int i232 = measuredWidth - iArr[0];
                    int i242 = measuredHeight - iArr[1];
                    double sqrt3 = Math.sqrt((i242 * i242) + (i232 * i232));
                    int i252 = iArr[0];
                    int i262 = measuredHeight - iArr[1];
                    float max3 = (float) Math.max(sqrt3, Math.sqrt((i262 * i262) + (i252 * i252)));
                    int i272 = measuredWidth - iArr[0];
                    int i282 = iArr[1];
                    double sqrt22 = Math.sqrt((i282 * i282) + (i272 * i272));
                    int i292 = iArr[0];
                    int i302 = iArr[1];
                    float max22 = Math.max(max3, (float) Math.max(sqrt22, Math.sqrt((i302 * i302) + (i292 * i292))));
                    this.n0.b(iArr[0], iArr[1], booleanValue4);
                    float f102 = max22 / 0.6f;
                    org.telegram.ui.Components.g01 g01Var22 = this.n0;
                    org.telegram.ui.Cells.h1 h1Var2 = org.telegram.ui.Components.g01.x;
                    if (!booleanValue4) {
                    }
                    if (booleanValue4) {
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(g01Var22, h1Var2, f11, f102);
                    ofFloat3.setDuration(450L);
                    ofFloat3.setInterpolator(org.telegram.ui.Components.xs.e);
                    ofFloat3.addListener(new fi.a3(this, ph0Var, animatedDrawable, i19));
                    if (this.F0 != null) {
                    }
                    org.telegram.messenger.g0.h3(new t60(this, i13), !booleanValue4 ? (measuredHeight - iArr[1]) / org.telegram.messenger.g0.L(2.25f) : 50L);
                    ofFloat3.start();
                } catch (Throwable th2) {
                    th = th2;
                    org.telegram.messenger.a8.f(th);
                    try {
                        this.n0.setImageDrawable(null);
                        this.v0.removeView(this.n0);
                        cx.C4 = false;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.f(e10);
                    }
                    c11 = 0;
                    org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) objArr[c11];
                    boolean booleanValue32 = ((Boolean) objArr[1]).booleanValue();
                    int intValue52 = ((Integer) objArr[c10]).intValue();
                    if (objArr.length > 7) {
                    }
                    actionBarLayout = this.p0;
                    if (actionBarLayout == null) {
                    }
                }
                z10 = false;
                if (bitmap == null) {
                }
                if (bitmap != null) {
                    org.telegram.ui.Components.g01.a(bitmap, !z10 ? null : this.y0, ph0Var);
                }
                view = this.F0;
                if (view != null) {
                    this.F0.getBackground().setAlpha(org.telegram.messenger.ks.e4);
                }
                this.v0.removeView(this.n0);
                this.n0 = new org.telegram.ui.Components.g01(this);
                if (ph0Var == null) {
                }
                c10 = 3;
            } catch (Throwable th3) {
                th = th3;
                c10 = 3;
            }
        }
        c11 = 0;
        org.telegram.ui.ActionBar.m6 m6Var22 = (org.telegram.ui.ActionBar.m6) objArr[c11];
        boolean booleanValue322 = ((Boolean) objArr[1]).booleanValue();
        int intValue522 = ((Integer) objArr[c10]).intValue();
        if (objArr.length > 7) {
        }
        actionBarLayout = this.p0;
        if (actionBarLayout == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        if (((org.telegram.ui.bn) r0).pa() != false) goto L63;
     */
    @Override // e0.e, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h2 Q;
        keyEvent.getKeyCode();
        if ((keyEvent.getKeyCode() != 24 && keyEvent.getKeyCode() != 25) || (Q = Q()) == null || Q.getLastStoryViewer() == null) {
            if (keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
                if (VoIPService.getSharedInstance() == null) {
                    ArrayList arrayList = this.e0;
                    if (!arrayList.isEmpty() && ((!PhotoViewer.A1() || !PhotoViewer.p1().P1()) && keyEvent.getRepeatCount() == 0)) {
                        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList);
                        if (!(h2Var instanceof bn) || org.telegram.ui.ActionBar.h2.hasSheets(h2Var) || !((bn) h2Var).pa()) {
                            if (org.telegram.messenger.g0.Q1()) {
                                ArrayList arrayList2 = this.g0;
                                if (!arrayList2.isEmpty()) {
                                    org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList2);
                                    if (h2Var2 instanceof bn) {
                                        if (!org.telegram.ui.ActionBar.h2.hasSheets(h2Var2)) {
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return false;
            }
        }
        fi.f9 lastStoryViewer = Q.getLastStoryViewer();
        lastStoryViewer.getClass();
        if (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) {
            lastStoryViewer.w(keyEvent);
            return true;
        }
        return true;
    }

    public final void e0() {
        HashSet hashSet;
        m4 m4Var = this.Z0;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Z0 = null;
        }
        if (this.R) {
            return;
        }
        this.R = true;
        xi.e eVar = this.m1;
        if (eVar != null) {
            eVar.b();
            this.m1 = null;
        }
        xi.e eVar2 = this.n1;
        if (eVar2 != null) {
            eVar2.b();
            this.n1 = null;
        }
        y70 y70Var = this.p1;
        if (y70Var == null || (hashSet = org.telegram.messenger.pc.n) == null) {
            return;
        }
        hashSet.remove(y70Var);
    }

    public final void f0(Intent intent, vf.b bVar) {
        super.onNewIntent(intent);
        a0();
        E();
        W(intent, true, false, false, bVar, true, false);
    }

    public final void g0() {
        if (this.Z0 != null) {
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodePause");
            }
            org.telegram.messenger.g0.r(this.Z0);
            this.Z0 = null;
        }
        if (org.telegram.messenger.bz.s.length() != 0) {
            org.telegram.messenger.bz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var = new m4(this, 10);
            this.Z0 = m4Var;
            if (org.telegram.messenger.bz.x) {
                org.telegram.messenger.g0.h3(m4Var, 1000L);
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("schedule app lock in 1000");
                }
            } else if (org.telegram.messenger.bz.y != 0) {
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("schedule app lock in " + ((org.telegram.messenger.bz.y * 1000) + 1000));
                }
                org.telegram.messenger.g0.h3(this.Z0, (org.telegram.messenger.bz.y * 1000) + 1000);
            }
        } else {
            org.telegram.messenger.bz.B = 0;
        }
        org.telegram.messenger.bz.y();
    }

    public final void h0() {
        if (this.Z0 != null) {
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodeResume");
            }
            org.telegram.messenger.g0.r(this.Z0);
            this.Z0 = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (org.telegram.messenger.bz.B != 0) {
            org.telegram.messenger.bz.B = 0;
            org.telegram.messenger.bz.y();
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        org.telegram.ui.ActionBar.u1 u1Var = this.V0;
        if (u1Var != null) {
            try {
                u1Var.dismiss();
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

    @Override // org.telegram.ui.ActionBar.p4
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        }
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
            return true;
        }
        if (!g4.G() || !g4.v().W) {
            return false;
        }
        g4.v().m(true, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(boolean z10) {
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
            bundle.putString("selectAlertString", org.telegram.messenger.gd.M0(2131745398, null));
            bundle.putString("selectAlertStringGroup", org.telegram.messenger.gd.M0(2131745399, null));
        } else if (arrayList2.size() != 1) {
            bundle.putString("selectAlertString", org.telegram.messenger.gd.M0(2131745398, null));
            bundle.putString("selectAlertStringGroup", org.telegram.messenger.gd.M0(2131745436, null));
        }
        cx cxVar = new cx(bundle);
        cxVar.E2 = this;
        if (this.S != null || ((arrayList = this.V) != null && !arrayList.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.V;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(bn.X7(this.V, false, null));
            }
            String str2 = this.S;
            if (str2 != null) {
                arrayList3.add(new org.telegram.messenger.ef(0, str2, 0, true, 0, 0));
            }
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(this.U)) {
                    ((org.telegram.messenger.ef) arrayList3.get(0)).a = this.U;
                }
                CharSequence charSequence = this.U;
                if (arrayList3.isEmpty()) {
                    cxVar.F2 = null;
                } else {
                    cxVar.F2 = arrayList3;
                    cxVar.G2 = null;
                    cxVar.O2 = false;
                    if (cxVar.D1 != null) {
                        cxVar.v3(charSequence);
                    } else {
                        cxVar.Z3 = charSequence;
                    }
                }
            }
        } else if (!TextUtils.isEmpty(this.U)) {
            CharSequence charSequence2 = this.U;
            int i7 = org.telegram.ui.Components.cp0.J;
            if (charSequence2 != null && charSequence2.length() != 0) {
                try {
                    matcher = org.telegram.messenger.g0.S.matcher(charSequence2);
                } catch (Exception unused) {
                }
                if (matcher.find()) {
                    str = charSequence2.subSequence(matcher.start(), matcher.end()).toString();
                    if (str == null) {
                        cxVar.Y4(this.U, str);
                    } else {
                        CharSequence charSequence3 = this.U;
                        if (charSequence3 == null || charSequence3.length() == 0) {
                            cxVar.H2 = null;
                        } else {
                            cxVar.H2 = charSequence3;
                            cxVar.G2 = null;
                            cxVar.F2 = null;
                            if (cxVar.D1 != null) {
                                cxVar.v3(charSequence3);
                            } else {
                                cxVar.Z3 = charSequence3;
                            }
                        }
                    }
                }
            }
            str = null;
            if (str == null) {
            }
        }
        ((ActionBarLayout) M()).V(cxVar, !org.telegram.messenger.g0.Q1() || (actionBarLayout = this.q0) == null ? !(this.p0.getFragmentStack().size() <= 1 || !(this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1) instanceof me0)) : !(actionBarLayout.getFragmentStack().isEmpty() || !(this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1) instanceof me0)), !z10);
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().W) {
            g4.v().m(false, true);
        }
        hi.ta.w();
        f40 f40Var = f40.C5;
        if (f40Var != null) {
            f40Var.dismiss();
        }
        if (z10 || !org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.p0.X(true, true);
        this.r0.X(true, true);
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
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
        ee0 ee0Var = new ee0();
        t60 t60Var = new t60(this, 0);
        ee0Var.G = 3;
        ee0Var.a = 12;
        ee0Var.e0 = t60Var;
        if (password == null || (str = password.login_email_pattern) == null) {
            t0(ee0Var);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        int indexOf = password.login_email_pattern.indexOf(42);
        int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0();
            dz0Var.a |= 256;
            dz0Var.b = indexOf;
            int i7 = lastIndexOf + 1;
            dz0Var.c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.ez0(dz0Var, 0), indexOf, i7, 0);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = valueOf;
        u1Var.U = org.telegram.messenger.gd.M0(2131751190, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752537, null), new at(13, this, ee0Var));
        i5.c.y(null, 2131752578, alertDialog$Builder, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00ce, code lost:
    
        if (r3.getArguments().getLong("community_id", 0) != 0) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x011c A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.p4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.q4 q4Var) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        ActionBarLayout actionBarLayout4;
        int i7;
        ActionBarLayout actionBarLayout5;
        ActionBarLayout actionBarLayout6;
        org.telegram.ui.ActionBar.h2 h2Var = q4Var.a;
        boolean z10 = q4Var.b;
        boolean z11 = q4Var.c;
        if (g4.G() && g4.v().W) {
            g4.v().m(false, true);
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (h2Var instanceof me0) {
                ActionBarLayout actionBarLayout7 = this.p0;
                if (actionBarLayout != actionBarLayout7) {
                    actionBarLayout7.a0();
                    org.telegram.ui.ActionBar.s4 M = M();
                    q4Var.b = z10;
                    q4Var.c = z11;
                    q4Var.d = false;
                    ((ActionBarLayout) M).U(q4Var);
                    this.q0.a0();
                    this.q0.getView().setVisibility(8);
                    if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                        this.u0.setVisibility(0);
                        return false;
                    }
                    return false;
                }
                if ((!(h2Var instanceof bn) && !((bn) h2Var).c()) || q4Var.g || (actionBarLayout == (actionBarLayout3 = this.r0) && (actionBarLayout3.getFragmentStack().size() > 1 || !(this.r0.getLastFragment() instanceof bn)))) {
                    boolean z12 = this.N0;
                    if ((!z12 && actionBarLayout == this.r0) || (z12 && actionBarLayout == this.p0)) {
                        ActionBarLayout actionBarLayout8 = this.r0;
                        if (actionBarLayout == actionBarLayout8) {
                            if (actionBarLayout8.getView() != null) {
                                this.r0.getView().setVisibility(0);
                            }
                            this.u0.setVisibility(8);
                        }
                        boolean z13 = (this.N0 && actionBarLayout == (actionBarLayout6 = this.p0) && actionBarLayout6.getFragmentStack().size() == 1) ? false : true;
                        if (!this.q0.getFragmentStack().isEmpty()) {
                            while (this.q0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout9 = this.q0;
                                actionBarLayout9.d0(actionBarLayout9.getFragmentStack().get(0), false);
                            }
                            this.q0.l(!z11, false);
                        }
                        if (!z13) {
                            org.telegram.ui.ActionBar.s4 M2 = M();
                            q4Var.c = z11;
                            q4Var.d = false;
                            ((ActionBarLayout) M2).U(q4Var);
                        }
                        return z13;
                    }
                    if (!z12 && actionBarLayout != (actionBarLayout5 = this.r0) && actionBarLayout5 != null) {
                        if (actionBarLayout5.getView() != null) {
                            this.r0.getView().setVisibility(0);
                        }
                        this.u0.setVisibility(8);
                        this.r0.a0();
                        ActionBarLayout actionBarLayout10 = this.r0;
                        q4Var.c = true;
                        q4Var.b = z10;
                        q4Var.d = false;
                        actionBarLayout10.U(q4Var);
                        if (!this.q0.getFragmentStack().isEmpty()) {
                            while (this.q0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout11 = this.q0;
                                actionBarLayout11.d0(actionBarLayout11.getFragmentStack().get(0), false);
                            }
                            this.q0.l(!z11, false);
                            return false;
                        }
                    } else {
                        if (!z12 || actionBarLayout == this.p0) {
                            ActionBarLayout actionBarLayout12 = this.q0;
                            if (actionBarLayout12 != null && actionBarLayout12.getFragmentStack() != null && !this.q0.getFragmentStack().isEmpty()) {
                                while (this.q0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout13 = this.q0;
                                    actionBarLayout13.d0(actionBarLayout13.getFragmentStack().get(0), false);
                                }
                                this.q0.l(!z11, false);
                            }
                            org.telegram.ui.ActionBar.s4 M3 = M();
                            q4Var.b = this.p0.getFragmentStack().size() > 1;
                            q4Var.c = z11;
                            q4Var.d = false;
                            ((ActionBarLayout) M3).U(q4Var);
                            return false;
                        }
                        org.telegram.ui.ActionBar.s4 M4 = M();
                        q4Var.b = this.p0.getFragmentStack().size() > 1;
                        q4Var.c = z11;
                        q4Var.d = false;
                        ((ActionBarLayout) M4).U(q4Var);
                        if (!this.q0.getFragmentStack().isEmpty()) {
                            while (this.q0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout14 = this.q0;
                                actionBarLayout14.d0(actionBarLayout14.getFragmentStack().get(0), false);
                            }
                            this.q0.l(!z11, false);
                        }
                    }
                    return false;
                }
                actionBarLayout4 = this.q0;
                if (actionBarLayout4 != null && actionBarLayout != actionBarLayout4) {
                    actionBarLayout4.getView().setVisibility(0);
                    i7 = 0;
                    while (true) {
                        if (i7 < 4) {
                            i7 = -1;
                            break;
                        }
                        if (org.telegram.messenger.j10.i(i7).p()) {
                            break;
                        }
                        i7++;
                    }
                    if ((h2Var instanceof ee0) || i7 != -1) {
                        this.t0.setBackgroundColor(2130706432);
                    } else {
                        this.u0.setVisibility(0);
                        this.t0.setBackgroundColor(0);
                    }
                    ActionBarLayout actionBarLayout15 = this.q0;
                    q4Var.b = z10;
                    q4Var.c = z11;
                    q4Var.d = false;
                    actionBarLayout15.U(q4Var);
                    return false;
                }
            } else {
                if (h2Var instanceof cx) {
                    cx cxVar = (cx) h2Var;
                    if (cxVar.x4() && actionBarLayout != (actionBarLayout2 = this.p0)) {
                        actionBarLayout2.a0();
                        org.telegram.ui.ActionBar.s4 M5 = M();
                        q4Var.b = z10;
                        q4Var.c = z11;
                        q4Var.d = false;
                        ((ActionBarLayout) M5).U(q4Var);
                        this.q0.a0();
                        this.q0.getView().setVisibility(8);
                        if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                            this.u0.setVisibility(0);
                            return false;
                        }
                        return false;
                    }
                    if (actionBarLayout == this.p0) {
                        if (cxVar.getArguments() != null) {
                            if (cxVar.getArguments().getInt("folderId", 0) != 1) {
                            }
                        }
                    }
                }
                if (!(h2Var instanceof bn)) {
                }
                actionBarLayout4 = this.q0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.getView().setVisibility(0);
                    i7 = 0;
                    while (true) {
                        if (i7 < 4) {
                        }
                        i7++;
                    }
                    if (h2Var instanceof ee0) {
                    }
                    this.t0.setBackgroundColor(2130706432);
                    ActionBarLayout actionBarLayout152 = this.q0;
                    q4Var.b = z10;
                    q4Var.c = z11;
                    q4Var.d = false;
                    actionBarLayout152.U(q4Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void l0(final long j3, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i7, final int i10) {
        if (num != null) {
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = org.telegram.messenger.mp.u1(this.P).j1(-j3);
            tL_channels_getMessages.id.add(num);
            ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.n60
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    String str2 = LaunchActivity.C1;
                    org.telegram.messenger.g0.g3(new c70(LaunchActivity.this, tLObject, num, num2, bArr, j3, runnable, str, i7, i10));
                }
            });
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j3);
        t0(y91.J0(this, bundle));
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void m0(int i7, long j3, TLRPC.TL_error tL_error) {
        bn bnVar = new bn(a8.p0.j(j3, "user_id"));
        t0(bnVar);
        org.telegram.messenger.g0.h3(new up(tL_error, bnVar, org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3)), 13), 300L);
    }

    public final void n0(int i7, String str, String str2, vf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_importContactToken, new bg.l0(this, bVar, u12, i7, str2, 11));
    }

    public final void o0(int i7, String str, String str2, vf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        u12.f2().a(str, null, new di.b4(this, u12, bVar, i7, str2, 1));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.l0 == actionMode) {
            this.l0 = null;
        }
        if (actionMode.getType() == 1) {
            return;
        }
        ActionBarLayout actionBarLayout = this.p0;
        org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
        if (kVar != null) {
            kVar.setVisibility(0);
        }
        actionBarLayout.D0 = false;
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = this.r0;
            org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
            if (kVar2 != null) {
                kVar2.setVisibility(0);
            }
            actionBarLayout2.D0 = false;
            ActionBarLayout actionBarLayout3 = this.q0;
            org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.E;
            if (kVar3 != null) {
                kVar3.setVisibility(0);
            }
            actionBarLayout3.D0 = false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.l0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.p0.s(menu) && org.telegram.messenger.g0.Q1() && !this.r0.s(menu)) {
                this.q0.s(menu);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (actionMode.getType() == 1) {
            return;
        }
        ActionBarLayout actionBarLayout = this.p0;
        org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
        if (kVar != null) {
            kVar.setVisibility(8);
        }
        actionBarLayout.D0 = true;
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = this.r0;
            org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
            if (kVar2 != null) {
                kVar2.setVisibility(8);
            }
            actionBarLayout2.D0 = true;
            ActionBarLayout actionBarLayout3 = this.q0;
            org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.E;
            if (kVar3 != null) {
                kVar3.setVisibility(8);
            }
            actionBarLayout3.D0 = true;
        }
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        fi.z3 currentPeerView;
        a8.r7 r7Var;
        VoIPService sharedInstance;
        if (org.telegram.messenger.bz.s.length() != 0 && org.telegram.messenger.bz.B != 0) {
            org.telegram.messenger.bz.B = 0;
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onActivityResult");
            }
            org.telegram.messenger.j10.i(this.P).v(false);
        }
        if (i7 == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.t0.G = canDrawOverlays;
            if (canDrawOverlays) {
                f40 f40Var = f40.C5;
                if (f40Var != null) {
                    f40Var.L();
                }
                org.telegram.messenger.g0.h3(new t60(this, 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i7, i10, intent);
        if (i7 >= 22336 && i7 <= 22399) {
            org.telegram.ui.Wallet.e1 e1Var = c8.za.b;
            if (e1Var != null && e1Var.e == this && e1Var.f && e1Var.g == i7) {
                e1Var.c(i10 != -1 ? "AUTH_CANCELED" : null);
                return;
            }
            return;
        }
        if (i7 == 520) {
            if (i10 != -1 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
            sharedInstance.createCaptureDevice(true);
            return;
        }
        int i11 = 3;
        if (i7 == 140) {
            Utilities.d.c(new org.telegram.messenger.i10(i11, org.telegram.messenger.qd.f(this.P), i10 == -1));
            return;
        }
        if (i7 == 521) {
            hi.t6 t6Var = this.q1;
            if (t6Var != null) {
                t6Var.a(Boolean.valueOf(i10 == -1));
                this.q1 = null;
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (r7Var = themeEditorView.m) != null) {
            r7Var.w(i7, i10, intent);
        }
        ActionBarLayout actionBarLayout = this.p0;
        if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
            org.telegram.ui.ActionBar.h2 h2Var = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
            h2Var.onActivityResultFragment(i7, i10, intent);
            if (h2Var.getLastStoryViewer() != null && (currentPeerView = h2Var.getLastStoryViewer().o0.getCurrentPeerView()) != null && i10 == -1) {
                if (i7 == 0 || i7 == 2) {
                    currentPeerView.r0();
                    fi.n2 n2Var = currentPeerView.s2;
                    if (n2Var != null) {
                        n2Var.e2.j0(i7, intent, null);
                    }
                } else if (i7 == 21) {
                    if (intent == null) {
                        currentPeerView.X0();
                    } else {
                        if (intent.getData() != null) {
                            currentPeerView.Q0(intent.getData());
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                currentPeerView.Q0(clipData.getItemAt(i12).getUri());
                            }
                        } else {
                            currentPeerView.X0();
                        }
                        fi.n2 n2Var2 = currentPeerView.s2;
                        if (n2Var2 != null) {
                            n2Var2.dismiss();
                        }
                        currentPeerView.i0(true);
                    }
                }
            }
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = this.r0;
            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onActivityResultFragment(i7, i10, intent);
            }
            ActionBarLayout actionBarLayout3 = this.q0;
            if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onActivityResultFragment(i7, i10, intent);
            }
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f5, Integer.valueOf(i7), Integer.valueOf(i10), intent);
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        if (d0(true)) {
            if (!org.telegram.messenger.g0.Q1()) {
                this.p0.I();
                return;
            }
            ActionBarLayout actionBarLayout = this.q0;
            if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                this.q0.I();
                return;
            }
            ActionBarLayout actionBarLayout2 = this.r0;
            if (actionBarLayout2 == null || actionBarLayout2.getView().getVisibility() != 0 || this.r0.getFragmentStack().isEmpty()) {
                this.p0.I();
                return;
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
            if (h2Var.onBackPressed(true)) {
                h2Var.finishFragment();
            }
        }
    }

    @Override // androidx.activity.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.g0.v(this, configuration);
        this.t1.a();
        org.telegram.messenger.g0.v3(getWindow());
        super.onConfigurationChanged(configuration);
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.c;
        LaunchActivity launchActivity = (LaunchActivity) d.f;
        if (launchActivity == null || !org.telegram.messenger.g0.H1(launchActivity)) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.h hVar = ((wi.n) arrayList.get(i7)).e;
                if (hVar != null && hVar.h != null && !hVar.K) {
                    Activity activity = hVar.c;
                    org.telegram.messenger.g0.v(activity, activity.getResources().getConfiguration());
                    org.telegram.ui.Components.hn.c = null;
                    Point point = org.telegram.messenger.g0.q;
                    hVar.A = (Math.min(point.x, point.y) - (wi.h.m() * 2.0f)) / hVar.h();
                    int h = (int) (hVar.h() * hVar.z);
                    wi.l lVar = hVar.b;
                    int J = lVar.J();
                    int a02 = lVar.a0();
                    float f10 = (J <= 0 || a02 <= 0) ? 0.5625f : a02 / J;
                    int i10 = (int) (((int) (wi.h.i(f10) * f10)) * hVar.z);
                    if (hVar.x != h || hVar.y != i10) {
                        WindowManager.LayoutParams layoutParams = hVar.e;
                        hVar.x = h;
                        layoutParams.width = h;
                        hVar.y = i10;
                        layoutParams.height = i10;
                        hVar.r();
                    }
                    r1.g gVar = hVar.D;
                    gVar.b = hVar.B;
                    gVar.c = true;
                    gVar.m.i = wi.h.n(r6, hVar.x);
                    hVar.D.h();
                    r1.g gVar2 = hVar.E;
                    gVar2.b = hVar.C;
                    gVar2.c = true;
                    gVar2.m.i = wi.h.e(r6, hVar.y);
                    hVar.E.h();
                }
            }
        }
        org.telegram.messenger.g0.c3();
        a0();
        E();
        org.telegram.messenger.g0.g3(new t60(this, 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            int i11 = pipRoundVideoView.y.getInt("sidex", 1);
            int i12 = pipRoundVideoView.y.getInt("sidey", 0);
            float f11 = pipRoundVideoView.y.getFloat("px", 0.0f);
            float f12 = pipRoundVideoView.y.getFloat("py", 0.0f);
            pipRoundVideoView.w.x = PipRoundVideoView.b(f11, i11, pipRoundVideoView.h, true);
            pipRoundVideoView.w.y = PipRoundVideoView.b(f12, i12, pipRoundVideoView.n, false);
            pipRoundVideoView.x.updateViewLayout(pipRoundVideoView.a, pipRoundVideoView.w);
        }
        org.telegram.ui.Components.gu guVar = org.telegram.ui.Components.gu.S1;
        if (guVar != null) {
            guVar.c0(configuration);
        }
        wg.l lVar2 = wg.l.p1;
        if (lVar2 != null) {
            lVar2.c0(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.Z8;
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            int i13 = themeEditorView.l.getInt("sidex", 1);
            int i14 = themeEditorView.l.getInt("sidey", 0);
            float f13 = themeEditorView.l.getFloat("px", 0.0f);
            float f14 = themeEditorView.l.getFloat("py", 0.0f);
            themeEditorView.i.x = ThemeEditorView.c(f13, i13, themeEditorView.g, true);
            themeEditorView.i.y = ThemeEditorView.c(f14, i14, themeEditorView.h, false);
            try {
                if (themeEditorView.c.getParent() != null) {
                    themeEditorView.j.updateViewLayout(themeEditorView.c, themeEditorView.i);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (org.telegram.ui.ActionBar.n6.o == 3) {
            org.telegram.ui.ActionBar.n6.F(false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(41:0|1|(1:3)(1:239)|4|(2:10|(2:29|30)(2:14|(2:18|(1:28))))|32|(2:33|34)|35|(1:37)|38|(1:42)|43|(1:46)|47|(4:49|50|51|(1:53))|57|(1:59)|60|(3:66|(1:68)(1:235)|(25:70|71|(22:73|74|75|78|(1:80)|81|82|83|(1:85)(1:161)|(1:87)(1:160)|88|(1:90)|91|(1:158)|95|96|97|(2:99|(1:101))|102|(1:104)|105|(14:107|(1:109)|110|111|(4:119|(1:(1:122)(1:125))(1:126)|123|124)|(1:128)|129|130|131|(1:133)|135|(3:137|(1:139)|140)(2:143|(3:145|(1:147)|148))|141|142)(2:151|152))(1:232)|172|78|(0)|81|82|83|(0)(0)|(0)(0)|88|(0)|91|(1:93)|156|158|95|96|97|(0)|102|(0)|105|(0)(0)))|236|78|(0)|81|82|83|(0)(0)|(0)(0)|88|(0)|91|(0)|156|158|95|96|97|(0)|102|(0)|105|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(42:0|1|(1:3)(1:239)|4|(2:10|(2:29|30)(2:14|(2:18|(1:28))))|32|33|34|35|(1:37)|38|(1:42)|43|(1:46)|47|(4:49|50|51|(1:53))|57|(1:59)|60|(3:66|(1:68)(1:235)|(25:70|71|(22:73|74|75|78|(1:80)|81|82|83|(1:85)(1:161)|(1:87)(1:160)|88|(1:90)|91|(1:158)|95|96|97|(2:99|(1:101))|102|(1:104)|105|(14:107|(1:109)|110|111|(4:119|(1:(1:122)(1:125))(1:126)|123|124)|(1:128)|129|130|131|(1:133)|135|(3:137|(1:139)|140)(2:143|(3:145|(1:147)|148))|141|142)(2:151|152))(1:232)|172|78|(0)|81|82|83|(0)(0)|(0)(0)|88|(0)|91|(1:93)|156|158|95|96|97|(0)|102|(0)|105|(0)(0)))|236|78|(0)|81|82|83|(0)(0)|(0)(0)|88|(0)|91|(0)|156|158|95|96|97|(0)|102|(0)|105|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0581, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0582, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0611, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x052a, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0369. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0591 A[Catch: all -> 0x0581, TryCatch #1 {all -> 0x0581, blocks: (B:97:0x053e, B:99:0x0560, B:101:0x0574, B:102:0x0585, B:104:0x0591, B:105:0x05a2, B:107:0x05b0, B:109:0x05d8, B:110:0x05e8, B:151:0x0609, B:152:0x0610), top: B:96:0x053e }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05b0 A[Catch: all -> 0x0581, TryCatch #1 {all -> 0x0581, blocks: (B:97:0x053e, B:99:0x0560, B:101:0x0574, B:102:0x0585, B:104:0x0591, B:105:0x05a2, B:107:0x05b0, B:109:0x05d8, B:110:0x05e8, B:151:0x0609, B:152:0x0610), top: B:96:0x053e }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0609 A[Catch: all -> 0x0581, TryCatch #1 {all -> 0x0581, blocks: (B:97:0x053e, B:99:0x0560, B:101:0x0574, B:102:0x0585, B:104:0x0591, B:105:0x05a2, B:107:0x05b0, B:109:0x05d8, B:110:0x05e8, B:151:0x0609, B:152:0x0610), top: B:96:0x053e }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04cf A[Catch: Exception -> 0x04d4, TryCatch #8 {Exception -> 0x04d4, blocks: (B:83:0x04c9, B:85:0x04cf, B:87:0x04da, B:88:0x04e0, B:90:0x04e4, B:91:0x04fb, B:93:0x0501, B:156:0x0507, B:158:0x050b), top: B:82:0x04c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04da A[Catch: Exception -> 0x04d4, TryCatch #8 {Exception -> 0x04d4, blocks: (B:83:0x04c9, B:85:0x04cf, B:87:0x04da, B:88:0x04e0, B:90:0x04e4, B:91:0x04fb, B:93:0x0501, B:156:0x0507, B:158:0x050b), top: B:82:0x04c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04e4 A[Catch: Exception -> 0x04d4, TryCatch #8 {Exception -> 0x04d4, blocks: (B:83:0x04c9, B:85:0x04cf, B:87:0x04da, B:88:0x04e0, B:90:0x04e4, B:91:0x04fb, B:93:0x0501, B:156:0x0507, B:158:0x050b), top: B:82:0x04c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0501 A[Catch: Exception -> 0x04d4, TryCatch #8 {Exception -> 0x04d4, blocks: (B:83:0x04c9, B:85:0x04cf, B:87:0x04da, B:88:0x04e0, B:90:0x04e4, B:91:0x04fb, B:93:0x0501, B:156:0x0507, B:158:0x050b), top: B:82:0x04c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0560 A[Catch: all -> 0x0581, TryCatch #1 {all -> 0x0581, blocks: (B:97:0x053e, B:99:0x0560, B:101:0x0574, B:102:0x0585, B:104:0x0591, B:105:0x05a2, B:107:0x05b0, B:109:0x05d8, B:110:0x05e8, B:151:0x0609, B:152:0x0610), top: B:96:0x053e }] */
    /* JADX WARN: Type inference failed for: r14v4, types: [android.app.AppOpsManager$OnOpChangedListener, wi.m] */
    @Override // androidx.fragment.app.v, androidx.activity.l, e0.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        long j3;
        w9.b bVar;
        String str;
        String lowerCase;
        ActionBarLayout actionBarLayout;
        String string;
        Intent intent;
        Uri data;
        int i7 = 1;
        E1 = true;
        F1++;
        boolean z11 = org.telegram.messenger.s2.a;
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        H1 = this;
        org.telegram.messenger.t0.w();
        org.telegram.messenger.g0.v(this, getResources().getConfiguration());
        this.P = org.telegram.messenger.j10.t0;
        this.f1 = new androidx.mediarouter.app.f(this, 9);
        IntentFilter intentFilter = new IntentFilter("org.telegram.messenger.DEBUG_THEME");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.f1, intentFilter, 2);
        } else {
            registerReceiver(this.f1, intentFilter);
        }
        if (!org.telegram.messenger.j10.i(this.P).p() && (intent = getIntent()) != null && intent.getAction() != null) {
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
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.s6(1));
        getWindow().setFormat(-1);
        org.telegram.messenger.n6 n6Var = new org.telegram.messenger.n6(getWindow(), new l60(i7));
        this.e1 = n6Var;
        n6Var.a();
        super.onCreate(bundle);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            org.telegram.messenger.g0.E = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.n6.P();
        org.telegram.ui.ActionBar.n6.T(this);
        if (org.telegram.messenger.bz.s.length() != 0 && org.telegram.messenger.bz.x) {
            org.telegram.messenger.bz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        this.p0 = new ActionBarLayout(this, true);
        k0 k0Var = new k0(12, this, this);
        this.v0 = k0Var;
        k0Var.setClipToPadding(false);
        this.v0.setClipChildren(false);
        setContentView(this.v0);
        this.g1 = new rh.d(this.v0);
        l2.i d = l2.i.d();
        bg.v0 v0Var = new bg.v0(this, false);
        LaunchActivity launchActivity = (LaunchActivity) d.f;
        if (launchActivity != null && launchActivity != this) {
            ((wi.p) d.e).c();
        }
        d.f = this;
        d.a = false;
        d.b = false;
        wi.p pVar = (wi.p) d.e;
        pVar.b = this;
        pVar.d = v0Var;
        pVar.n = null;
        pVar.c = new wi.q(this);
        ((ViewGroup) getWindow().getDecorView()).addView(pVar.c);
        Context context = org.telegram.messenger.t0.b;
        final v4.p pVar2 = new v4.p(d, 11);
        if (c8.nd.a == null) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            final String packageName = context.getPackageName();
            ?? r14 = new AppOpsManager.OnOpChangedListener() { // from class: wi.m
                @Override // android.app.AppOpsManager.OnOpChangedListener
                public final void onOpChanged(String str2, String str3) {
                    if (packageName.equals(str3)) {
                        g0.g3(pVar2);
                    }
                }
            };
            c8.nd.a = r14;
            try {
                appOpsManager.startWatchingMode("android:system_alert_window", packageName, r14);
                if (i10 >= 26) {
                    appOpsManager.startWatchingMode("android:picture_in_picture", packageName, c8.nd.a);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.ui.Components.g01 g01Var = new org.telegram.ui.Components.g01(this);
        this.n0 = g01Var;
        g01Var.setVisibility(8);
        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(this);
        this.y0 = p3Var;
        p3Var.setActionBarLayout(this.p0);
        this.y0.addOnLayoutChangeListener(new t80());
        this.y0.setClipChildren(false);
        this.y0.setClipToPadding(false);
        this.v0.addView(this.y0, c8.ma.c(-1.0f, -1));
        kg.k kVar = new kg.k(this, 4);
        this.o0 = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER);
        this.v0.addView(this.o0, c8.ma.c(48.0f, 48));
        this.o0.setVisibility(8);
        k0 k0Var2 = this.v0;
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3(this);
        this.x0 = n3Var;
        k0Var2.addView(n3Var);
        k0 k0Var3 = this.v0;
        u80 u80Var = new u80(this);
        u80Var.setVisibility(8);
        this.w0 = u80Var;
        k0Var3.addView(u80Var);
        E0();
        this.y0.setParentActionBarLayout(this.p0);
        this.p0.setDrawerLayoutContainer(this.y0);
        this.p0.setFragmentStack(this.e0);
        this.p0.setFragmentStackChangedListener(new t60(this, 3));
        this.p0.setDelegate(this);
        org.telegram.ui.ActionBar.n6.o1(true);
        A();
        Q0();
        org.telegram.messenger.ks e11 = org.telegram.messenger.ks.e();
        int i11 = org.telegram.messenger.ks.n4;
        e11.k(i11, this);
        this.d0 = ConnectionsManager.getInstance(this.P).getConnectionState();
        xi.e eVar = this.n1;
        if (eVar != null) {
            eVar.b();
            this.n1 = null;
        }
        xi.e eVar2 = new xi.e(org.telegram.messenger.ks.e(), this);
        eVar2.c(org.telegram.messenger.ks.M0);
        eVar2.c(org.telegram.messenger.ks.A4);
        eVar2.c(org.telegram.messenger.ks.B4);
        eVar2.c(org.telegram.messenger.ks.q4);
        eVar2.c(org.telegram.messenger.ks.w4);
        eVar2.c(org.telegram.messenger.ks.u4);
        eVar2.c(i11);
        eVar2.c(org.telegram.messenger.ks.n0);
        eVar2.c(org.telegram.messenger.ks.C4);
        eVar2.c(org.telegram.messenger.ks.N4);
        eVar2.c(org.telegram.messenger.ks.S4);
        eVar2.c(org.telegram.messenger.ks.q5);
        eVar2.c(org.telegram.messenger.ks.n5);
        eVar2.c(org.telegram.messenger.ks.P5);
        eVar2.c(org.telegram.messenger.ks.Q5);
        this.n1 = eVar2;
        y70 y70Var = new y70(this, objArr2 == true ? 1 : 0);
        this.p1 = y70Var;
        org.telegram.messenger.pc.a(y70Var);
        if (this.p0.getFragmentStack().isEmpty() && ((actionBarLayout = this.q0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (org.telegram.messenger.j10.i(this.P).p()) {
                this.p0.c(-1, new me0());
            } else {
                this.p0.c(-1, O());
            }
            if (bundle != null) {
                try {
                    string = bundle.getString("fragment");
                } catch (Exception e12) {
                    e = e12;
                    j3 = 0;
                }
                if (string != null) {
                    Bundle bundle2 = bundle.getBundle("args");
                    j3 = string.hashCode();
                    try {
                        try {
                            switch (j3) {
                                case -1529105743:
                                    j3 = 0;
                                    if (string.equals("wallpapers")) {
                                        WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(0);
                                        this.p0.c(-1, wallpapersListActivity);
                                        wallpapersListActivity.restoreSelfArgs(bundle);
                                    }
                                    z10 = true;
                                    break;
                                case -1349522494:
                                    j3 = 0;
                                    if (string.equals("chat_profile") && bundle2 != null) {
                                        ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                        if (this.p0.c(-1, profileActivity)) {
                                            profileActivity.restoreSelfArgs(bundle);
                                        }
                                    }
                                    z10 = true;
                                    break;
                                case 3052376:
                                    j3 = 0;
                                    if (string.equals("chat")) {
                                        if (bundle2 != null) {
                                            bn bnVar = new bn(bundle2);
                                            long j10 = bundle.getLong("topic_id");
                                            long j11 = bundle2.getLong("chat_id");
                                            if (j10 != 0 && j11 != 0) {
                                                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.P).O0(Long.valueOf(j11));
                                                if (org.telegram.messenger.v3.c0(O0) && !org.telegram.messenger.v3.a(O0) && !org.telegram.messenger.v3.u0(O0)) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("chat_id", j11);
                                                    org.telegram.ui.ActionBar.h2 J0 = y91.J0(this, bundle3);
                                                    if (J0 instanceof y91) {
                                                        this.p0.c(-1, J0);
                                                    }
                                                }
                                                qg.c.a(bnVar, org.telegram.messenger.sr.a(-j11, j10));
                                            }
                                            if (this.p0.c(-1, bnVar)) {
                                                bnVar.n8 = bundle.getString("path");
                                            }
                                        }
                                    }
                                    z10 = true;
                                    break;
                                case 98629247:
                                    j3 = 0;
                                    if (string.equals("group")) {
                                        if (bundle2 != null) {
                                            f50 f50Var = new f50(bundle2);
                                            if (this.p0.c(-1, f50Var)) {
                                                f50Var.restoreSelfArgs(bundle);
                                            }
                                        }
                                        break;
                                    }
                                    z10 = true;
                                    break;
                                case 738950403:
                                    j3 = 0;
                                    if (string.equals("channel")) {
                                        if (bundle2 != null) {
                                            ad adVar = new ad(bundle2);
                                            if (this.p0.c(-1, adVar)) {
                                                adVar.restoreSelfArgs(bundle);
                                            }
                                        }
                                        break;
                                    }
                                    z10 = true;
                                    break;
                                case 1434631203:
                                    try {
                                        if (string.equals("settings")) {
                                            j3 = 0;
                                            bundle2.putLong("user_id", org.telegram.messenger.j10.i(this.P).n);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                            this.p0.c(-1, profileActivity2);
                                            profileActivity2.restoreSelfArgs(bundle);
                                            break;
                                        }
                                        j3 = 0;
                                        z10 = true;
                                    } catch (Exception e13) {
                                        e = e13;
                                        j3 = 0;
                                        z10 = true;
                                        org.telegram.messenger.a8.g(e, z10);
                                        E();
                                        F(false, z10, this.W0 ^ z10);
                                        long j12 = j3;
                                        W(getIntent(), false, bundle != null, false, null, true, true);
                                        String str2 = Build.DISPLAY;
                                        String str3 = Build.USER;
                                        if (str2 == null) {
                                        }
                                        if (str3 == null) {
                                        }
                                        if (org.telegram.messenger.s2.a) {
                                        }
                                        if (!lowerCase.contains("flyme")) {
                                        }
                                        org.telegram.messenger.g0.y = true;
                                        View rootView = getWindow().getDecorView().getRootView();
                                        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                                        z70 z70Var = new z70(rootView, objArr == true ? 1 : 0);
                                        this.h0 = z70Var;
                                        viewTreeObserver.addOnGlobalLayoutListener(z70Var);
                                        MediaController.B().K0 = this;
                                        ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
                                        boolean z12 = org.telegram.messenger.s2.a;
                                        String str4 = "" + org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n;
                                        if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f() != null) {
                                        }
                                        if (ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).isTestBackend()) {
                                        }
                                        bVar = (w9.b) o9.g.c().b(w9.b.class);
                                        if (bVar != null) {
                                        }
                                        break;
                                    }
                                    break;
                                case 1523894383:
                                    try {
                                        if (string.equals("settings2")) {
                                            this.p0.c(-1, new o31(null));
                                            break;
                                        }
                                        j3 = 0;
                                        z10 = true;
                                    } catch (Exception e14) {
                                        e = e14;
                                        z10 = true;
                                        j3 = 0;
                                        org.telegram.messenger.a8.g(e, z10);
                                        E();
                                        F(false, z10, this.W0 ^ z10);
                                        long j122 = j3;
                                        W(getIntent(), false, bundle != null, false, null, true, true);
                                        String str22 = Build.DISPLAY;
                                        String str32 = Build.USER;
                                        if (str22 == null) {
                                        }
                                        if (str32 == null) {
                                        }
                                        if (org.telegram.messenger.s2.a) {
                                        }
                                        if (!lowerCase.contains("flyme")) {
                                        }
                                        org.telegram.messenger.g0.y = true;
                                        View rootView2 = getWindow().getDecorView().getRootView();
                                        ViewTreeObserver viewTreeObserver2 = rootView2.getViewTreeObserver();
                                        z70 z70Var2 = new z70(rootView2, objArr == true ? 1 : 0);
                                        this.h0 = z70Var2;
                                        viewTreeObserver2.addOnGlobalLayoutListener(z70Var2);
                                        MediaController.B().K0 = this;
                                        ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
                                        boolean z122 = org.telegram.messenger.s2.a;
                                        String str42 = "" + org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n;
                                        if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f() != null) {
                                        }
                                        if (ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).isTestBackend()) {
                                        }
                                        bVar = (w9.b) o9.g.c().b(w9.b.class);
                                        if (bVar != null) {
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    j3 = 0;
                                    z10 = true;
                                    break;
                            }
                        } catch (Exception e15) {
                            e = e15;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        z10 = true;
                        org.telegram.messenger.a8.g(e, z10);
                        E();
                        F(false, z10, this.W0 ^ z10);
                        long j1222 = j3;
                        W(getIntent(), false, bundle != null, false, null, true, true);
                        String str222 = Build.DISPLAY;
                        String str322 = Build.USER;
                        if (str222 == null) {
                        }
                        if (str322 == null) {
                        }
                        if (org.telegram.messenger.s2.a) {
                        }
                        if (!lowerCase.contains("flyme")) {
                        }
                        org.telegram.messenger.g0.y = true;
                        View rootView22 = getWindow().getDecorView().getRootView();
                        ViewTreeObserver viewTreeObserver22 = rootView22.getViewTreeObserver();
                        z70 z70Var22 = new z70(rootView22, objArr == true ? 1 : 0);
                        this.h0 = z70Var22;
                        viewTreeObserver22.addOnGlobalLayoutListener(z70Var22);
                        MediaController.B().K0 = this;
                        ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
                        boolean z1222 = org.telegram.messenger.s2.a;
                        String str422 = "" + org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n;
                        if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f() != null) {
                        }
                        if (ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).isTestBackend()) {
                        }
                        bVar = (w9.b) o9.g.c().b(w9.b.class);
                        if (bVar != null) {
                        }
                    }
                    E();
                    F(false, z10, this.W0 ^ z10);
                    long j12222 = j3;
                    W(getIntent(), false, bundle != null, false, null, true, true);
                    String str2222 = Build.DISPLAY;
                    String str3222 = Build.USER;
                    lowerCase = str2222 == null ? str2222.toLowerCase() : "";
                    String lowerCase3 = str3222 == null ? lowerCase.toLowerCase() : "";
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("OS name " + lowerCase + " " + lowerCase3);
                    }
                    if ((!lowerCase.contains("flyme") || lowerCase3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                        org.telegram.messenger.g0.y = true;
                        View rootView222 = getWindow().getDecorView().getRootView();
                        ViewTreeObserver viewTreeObserver222 = rootView222.getViewTreeObserver();
                        z70 z70Var222 = new z70(rootView222, objArr == true ? 1 : 0);
                        this.h0 = z70Var222;
                        viewTreeObserver222.addOnGlobalLayoutListener(z70Var222);
                    }
                    MediaController.B().K0 = this;
                    ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
                    boolean z12222 = org.telegram.messenger.s2.a;
                    String str4222 = "" + org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n;
                    if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f() != null) {
                        String o4 = org.telegram.messenger.o10.o(org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f());
                        if (!TextUtils.isEmpty(o4)) {
                            str4222 = "@" + o4;
                        }
                    }
                    if (ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).isTestBackend()) {
                        str4222 = str4222 + " [TEST SERVER]";
                    }
                    bVar = (w9.b) o9.g.c().b(w9.b.class);
                    if (bVar != null) {
                        throw new NullPointerException("FirebaseCrashlytics component is not present.");
                    }
                    aa.t tVar = bVar.a;
                    tVar.n.a.a(new a1.e(3, tVar, str4222));
                    bVar.b("version", "public");
                    bVar.b("model", Build.MODEL);
                    bVar.b("manufacturer", Build.MANUFACTURER);
                    if (Build.VERSION.SDK_INT >= 31) {
                        str = Build.SOC_MODEL;
                        bVar.b("soc_model", str);
                        bVar.b("soc_manufacturer", Build.SOC_MANUFACTURER);
                    }
                    bVar.b("device", Build.DEVICE);
                    bVar.b("product", Build.PRODUCT);
                    bVar.b("hardware", Build.HARDWARE);
                    bVar.b("user", Build.USER);
                    bVar.a();
                    boolean z13 = true;
                    int i12 = Build.VERSION.SDK_INT;
                    org.telegram.messenger.vr.b(z13);
                    if (i12 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - org.telegram.messenger.vr.j.getLong("last_checked", j12222) >= 86400000 && org.telegram.messenger.vr.j.getInt("dismissed_count", 0) < 3) {
                        Pattern pattern = org.telegram.ui.Components.b5.a;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                        alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131754281, null);
                        alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(org.telegram.messenger.vr.h() ? i12 >= 31 ? 2131754279 : 2131754278 : 2131754280, null));
                        int i13 = org.telegram.ui.ActionBar.n6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.n6.x0(null, i13, false), null);
                        alertDialog$Builder.n(i13, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747107, null), new org.telegram.ui.Components.g1(this, 2));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), null);
                        alertDialog$Builder.a.setOnDismissListener(new hi.f1(3));
                        alertDialog$Builder.a.show();
                        org.telegram.messenger.vr.j.edit().putLong("last_checked", System.currentTimeMillis()).apply();
                    }
                    if (i12 >= 31) {
                        getWindow().getDecorView().addOnAttachStateChangeListener(new v80(this));
                    }
                    org.telegram.ui.Components.gc.a(this.v0, new bi.t(11));
                    getWindow().getDecorView().setSystemUiVisibility(1792);
                    Window window = getWindow();
                    try {
                        org.telegram.messenger.g0.S(window);
                        if (i12 >= 28) {
                            window.setNavigationBarDividerColor(0);
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    BackupAgent.a();
                    sy0.a0(false);
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 34) {
                        if (this.j1 == null) {
                            this.j1 = new w80(this);
                        }
                        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.j1);
                    } else if (i14 >= 33) {
                        if (this.k1 == null) {
                            this.k1 = new x80(this);
                        }
                        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.k1);
                    }
                    B();
                    return;
                }
                j3 = 0;
                z10 = true;
                E();
                F(false, z10, this.W0 ^ z10);
                long j122222 = j3;
                W(getIntent(), false, bundle != null, false, null, true, true);
                String str22222 = Build.DISPLAY;
                String str32222 = Build.USER;
                if (str22222 == null) {
                }
                if (str32222 == null) {
                }
                if (org.telegram.messenger.s2.a) {
                }
                if (!lowerCase.contains("flyme")) {
                }
                org.telegram.messenger.g0.y = true;
                View rootView2222 = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver2222 = rootView2222.getViewTreeObserver();
                z70 z70Var2222 = new z70(rootView2222, objArr == true ? 1 : 0);
                this.h0 = z70Var2222;
                viewTreeObserver2222.addOnGlobalLayoutListener(z70Var2222);
                MediaController.B().K0 = this;
                ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
                boolean z122222 = org.telegram.messenger.s2.a;
                String str42222 = "" + org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n;
                if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f() != null) {
                }
                if (ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).isTestBackend()) {
                }
                bVar = (w9.b) o9.g.c().b(w9.b.class);
                if (bVar != null) {
                }
            }
        }
        z10 = true;
        j3 = 0;
        E();
        F(false, z10, this.W0 ^ z10);
        long j1222222 = j3;
        W(getIntent(), false, bundle != null, false, null, true, true);
        String str222222 = Build.DISPLAY;
        String str322222 = Build.USER;
        if (str222222 == null) {
        }
        if (str322222 == null) {
        }
        if (org.telegram.messenger.s2.a) {
        }
        if (!lowerCase.contains("flyme")) {
        }
        org.telegram.messenger.g0.y = true;
        View rootView22222 = getWindow().getDecorView().getRootView();
        ViewTreeObserver viewTreeObserver22222 = rootView22222.getViewTreeObserver();
        z70 z70Var22222 = new z70(rootView22222, objArr == true ? 1 : 0);
        this.h0 = z70Var22222;
        viewTreeObserver22222.addOnGlobalLayoutListener(z70Var22222);
        MediaController.B().K0 = this;
        ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
        boolean z1222222 = org.telegram.messenger.s2.a;
        String str422222 = "" + org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n;
        if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).f() != null) {
        }
        if (ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).isTestBackend()) {
        }
        bVar = (w9.b) o9.g.c().b(w9.b.class);
        if (bVar != null) {
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        bg.c0 c0Var;
        k0 k0Var;
        org.telegram.ui.Wallet.e1 e1Var = c8.za.b;
        if (e1Var != null && e1Var.e == this) {
            e1Var.c("AUTH_CANCELED");
            c8.za.b.e();
        }
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.c;
        if (((LaunchActivity) d.f) == this) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((wi.n) arrayList.get(size)).b();
            }
            ((wi.p) d.e).c();
            d.f = null;
            ((ArrayList) d.d).clear();
        }
        E1 = false;
        F1--;
        androidx.mediarouter.app.f fVar = this.f1;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.f1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.g9 != null) {
                PhotoViewer.g9.J0();
            }
            if (PhotoViewer.A1()) {
                PhotoViewer.p1().J0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f10 = SecretMediaViewer.f();
                Runnable runnable = f10.o1;
                if (runnable != null) {
                    runnable.run();
                    f10.o1 = null;
                }
                bg.v0 v0Var = f10.k1;
                if (v0Var != null) {
                    v0Var.a();
                    f10.k1 = null;
                }
                org.telegram.messenger.ks.f(f10.a).n(f10, org.telegram.messenger.ks.w);
                org.telegram.messenger.ks.f(f10.a).n(f10, org.telegram.messenger.ks.l0);
                org.telegram.messenger.ks.f(f10.a).n(f10, org.telegram.messenger.ks.i0);
                f10.s = false;
                f10.M = null;
                org.telegram.messenger.hc hcVar = f10.h0;
                if (hcVar != null) {
                    hcVar.a();
                    f10.h0 = null;
                }
                f10.j();
                if (f10.b != null && (k0Var = f10.d) != null) {
                    try {
                        if (k0Var.getParent() != null) {
                            ((WindowManager) f10.b.getSystemService("window")).removeViewImmediate(f10.d);
                        }
                        f10.d = null;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                SecretMediaViewer.w1 = null;
            }
            if (g4.G()) {
                g4.v().r();
            }
            if (ns.g0 != null) {
                ns p10 = ns.p();
                p10.E = false;
                p10.l = null;
                p10.W = null;
                p10.Y = null;
                p10.a0 = null;
                if (p10.w != null && p10.y != null) {
                    Bitmap bitmap = p10.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        p10.v = null;
                    }
                    p10.M = 0.0f;
                    p10.K = false;
                    try {
                        if (p10.y.getParent() != null) {
                            ((WindowManager) p10.w.getSystemService("window")).removeViewImmediate(p10.y);
                        }
                        p10.y = null;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    ns.g0 = null;
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, 8);
                }
            }
            f40 f40Var = f40.C5;
            if (f40Var != null) {
                f40Var.L();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i7 = org.telegram.ui.ActionBar.n6.a;
            org.telegram.ui.Components.gu guVar = org.telegram.ui.Components.gu.S1;
            if (guVar != null) {
                guVar.L0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.b();
            }
            pg.i iVar = c8.sb.a;
            if (iVar != null) {
                iVar.e.edit().putFloat("x", (float) iVar.c.m.i).putFloat("y", (float) iVar.d.m.i).commit();
            }
            c8.sb.a = null;
            SparseArray sparseArray = org.telegram.ui.Components.o5.r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController B = MediaController.B();
        if (B.K0 == this) {
            B.K0 = null;
        }
        MediaController B2 = MediaController.B();
        if (B2.L0 == this.s1) {
            B2.L0 = null;
        }
        for (int i10 = 0; i10 < this.D0.size(); i10++) {
            try {
                if (((Dialog) this.D0.get(i10)).isShowing()) {
                    ((Dialog) this.D0.get(i10)).dismiss();
                }
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        this.D0.clear();
        try {
            if (this.h0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.h0);
            }
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (this.j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.j1);
            }
        } else if (i11 >= 33 && this.j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.k1);
        }
        org.telegram.ui.Components.gc.h(this.v0);
        VideoAds.dropCache();
        I();
        super.onDestroy();
        e0();
        org.telegram.messenger.n6 n6Var = this.e1;
        if (n6Var != null) {
            n6Var.e();
        }
        if (i11 < 24 || (c0Var = this.i1) == null) {
            return;
        }
        c0Var.c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 == 82 && !org.telegram.messenger.bz.C) {
            if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                return super.onKeyUp(i7, keyEvent);
            }
            if (g4.G() && g4.v().W) {
                return super.onKeyUp(i7, keyEvent);
            }
            if (!org.telegram.messenger.g0.Q1()) {
                this.p0.getView().onKeyUp(i7, keyEvent);
            } else if (this.q0.getView().getVisibility() == 0 && !this.q0.getFragmentStack().isEmpty()) {
                this.q0.getView().onKeyUp(i7, keyEvent);
            } else if (this.r0.getView().getVisibility() != 0 || this.r0.getFragmentStack().isEmpty()) {
                this.p0.getView().onKeyUp(i7, keyEvent);
            } else {
                this.r0.getView().onKeyUp(i7, keyEvent);
            }
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.p0;
        if (actionBarLayout != null) {
            actionBarLayout.M();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.M();
                }
                ActionBarLayout actionBarLayout3 = this.q0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
            }
        }
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        org.telegram.messenger.g0.E = z10;
        this.t1.a();
        E();
        super.onMultiWindowModeChanged(z10);
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a0();
        E();
        W(intent, true, false, false, null, true, true);
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onPause() {
        VoIPService sharedInstance;
        wi.h hVar;
        wi.o oVar;
        super.onPause();
        G1 = false;
        org.telegram.utils.twidget.n0.r(true);
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.c;
        if (this == ((LaunchActivity) d.f)) {
            d.b = false;
            wi.p pVar = (wi.p) d.e;
            LaunchActivity launchActivity = pVar.b;
            if (launchActivity != null && Build.VERSION.SDK_INT >= 31 && pVar.f == null && pVar.e != null && org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.i(pVar.e);
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                if (nVar.c == 1 && (hVar = nVar.e) != null && !hVar.f && (oVar = hVar.j) != null && hVar.l != null && oVar.isAvailable()) {
                    try {
                        Bitmap bitmap = hVar.j.getBitmap();
                        if (bitmap != null) {
                            hVar.l.setImageBitmap(bitmap);
                            hVar.l.setVisibility(0);
                            hVar.j.setFirstFrameCallback(null);
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
            }
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.j1, Integer.valueOf(TLObject.FLAG_12));
        org.telegram.messenger.t0.x = true;
        Utilities.d.c(new jg.x(this.P, 12));
        g0();
        this.p0.O();
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout = this.r0;
            if (actionBarLayout != null) {
                actionBarLayout.O();
            }
            ActionBarLayout actionBarLayout2 = this.q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.O();
            }
        }
        org.telegram.ui.Components.rc0 rc0Var = this.z0;
        if (rc0Var != null) {
            rc0Var.b.k();
        }
        ArrayList arrayList2 = this.A0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((org.telegram.ui.Components.pc0) obj).k();
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer p12 = PhotoViewer.p1();
            if (p12.k2 != null) {
                p12.z0(false, false);
            } else {
                org.telegram.ui.Components.f61 f61Var = p12.G2;
                if (f61Var != null && p12.Z2) {
                    f61Var.s0(org.telegram.messenger.g0.H1(p12.E));
                }
            }
        }
        hi.ta taVar = hi.ta.G2;
        if (taVar != null) {
            taVar.u(false);
            hi.ja jaVar = taVar.d1;
            if (jaVar != null) {
                jaVar.f.r();
            }
            hi.ha haVar = taVar.Y0;
            if (haVar != null) {
                haVar.x(0, true);
            }
        }
        org.telegram.ui.Components.voip.h2.a(this);
        hc1 hc1Var = hc1.m1;
        if (hc1Var != null) {
            boolean isInteractive = ((PowerManager) hc1Var.b.getSystemService("power")).isInteractive();
            boolean a10 = c8.nd.a(hc1Var.b);
            boolean z10 = a10 || c8.nd.b(hc1Var.b);
            if (hc1Var.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a10) {
                int measuredHeight = hc1.m1.u0.getMeasuredHeight();
                hc1 hc1Var2 = hc1.m1;
                org.telegram.ui.Components.voip.h2.f(hc1Var2.b, hc1Var2.a, hc1Var2.u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = hc1.m1.r0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.h2.W = windowInsets.getSystemWindowInsetTop();
                    hc1.m1.r0.getSystemWindowInsetBottom();
                }
            }
            if (hc1Var.n0 && ((!z10 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.h2.d() != null) {
                org.telegram.ui.Components.voip.h2.d().e();
            }
        } else if (org.telegram.ui.Components.voip.h2.d() != null) {
            org.telegram.ui.Components.voip.h2.d().e();
        }
        HashMap hashMap = xh.e.n;
        if (hashMap == null) {
            return;
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            xh.d dVar = ((xh.e) it.next()).f;
            if (dVar != null) {
                dVar.b = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r7.f == null) goto L44;
     */
    @Override // androidx.activity.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        wi.n nVar;
        View view;
        wi.n nVar2;
        super.onPictureInPictureModeChanged(z10, configuration);
        wi.p pVar = (wi.p) l2.i.d().e;
        if (pVar.f == null) {
            if (z10 && (nVar2 = pVar.e) != null) {
                pVar.i(nVar2);
            }
        }
        if (z10) {
            l2.i.g("system: complete enter");
            pVar.i = true;
            if (pVar.o && (nVar = pVar.f) != null && (view = pVar.h) != null) {
                nVar.a.B(view);
            }
            if (pVar.o) {
                pVar.o = false;
                wi.n nVar3 = pVar.f;
                if (nVar3 != null && Build.VERSION.SDK_INT >= 26) {
                    pVar.a(nVar3);
                }
            }
            bg.v0 v0Var = pVar.d;
            if (v0Var != null) {
                v0Var.b(true);
            }
            View view2 = pVar.h;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            wi.q qVar = pVar.c;
            if (qVar != null) {
                qVar.requestLayout();
            }
        } else if (pVar.a.a) {
            pVar.d();
        } else {
            l2.i.g("system: closed by the user");
            pVar.i = false;
            pVar.o = false;
            bg.v0 v0Var2 = pVar.d;
            if (v0Var2 != null) {
                v0Var2.b(false);
            }
            wi.n nVar4 = pVar.f;
            if (nVar4 != null) {
                nVar4.b();
            }
        }
        if (z10 || this.r1) {
            return;
        }
        if (PhotoViewer.g9 != null) {
            PhotoViewer.g9.J0();
        }
        if (PhotoViewer.A1()) {
            PhotoViewer.p1().z0(false, false);
        }
    }

    @Override // android.app.Activity
    public final boolean onPictureInPictureRequested() {
        ((wi.p) l2.i.d().e).g();
        return super.onPictureInPictureRequested();
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        ((wi.p) l2.i.d().e).f(pictureInPictureUiState);
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        ai.w0 w0Var;
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (u(i7, strArr, iArr)) {
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
            if (this.p0.getFragmentStack().size() != 0) {
                this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
            }
            if (org.telegram.messenger.g0.Q1()) {
                if (this.r0.getFragmentStack().size() != 0) {
                    this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
                }
                if (this.q0.getFragmentStack().size() != 0) {
                    this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
                }
            }
            hc1.h(iArr, i7);
            hi.ta taVar = hi.ta.G2;
            int i10 = 2;
            int i11 = 0;
            if (taVar != null) {
                fi.b bVar = taVar.a;
                Activity activity = taVar.b;
                boolean z10 = iArr != null && iArr.length == 1 && iArr[0] == 0;
                if (i7 == 111) {
                    taVar.t2 = !z10;
                    if (z10 && taVar.g0 == 0) {
                        taVar.B0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            taVar.q();
                        } else {
                            CameraController.getInstance().initCamera(new hi.s8(taVar, i11));
                        }
                    }
                } else if (i7 == 114) {
                    if (z10) {
                        MediaController.O(0);
                        taVar.e(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                        int i12 = org.telegram.ui.ActionBar.n6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.n6.x0(null, i12, false), null);
                        alertDialog$Builder.n(i12, null);
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131747106, null));
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.U = W2;
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747107, null), new hi.b9(taVar, i10));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), null);
                        u1Var.show();
                    }
                } else if (i7 == 112) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, activity, bVar);
                        int i13 = org.telegram.ui.ActionBar.n6.L5;
                        alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.n6.x0(null, i13, false), null);
                        alertDialog$Builder2.n(i13, null);
                        SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131747116, null));
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        u1Var2.U = W22;
                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131747107, null), new hi.b9(taVar, 3));
                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131751761, null), null);
                        u1Var2.show();
                    }
                } else if (i7 == 115) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, activity, bVar);
                        int i14 = org.telegram.ui.ActionBar.n6.L5;
                        alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.n6.x0(null, i14, false), null);
                        alertDialog$Builder3.n(i14, null);
                        SpannableStringBuilder W23 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131747120, null));
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                        u1Var3.U = W23;
                        alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131747107, null), new hi.b9(taVar, 5));
                        alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131751761, null), null);
                        u1Var3.show();
                    }
                    if (z10 && (w0Var = taVar.z2) != null) {
                        w0Var.run();
                    }
                    taVar.z2 = null;
                }
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.g5, Integer.valueOf(i7), strArr, iArr);
            SparseIntArray sparseIntArray = this.b1;
            if (sparseIntArray.get(i7, -1) >= 0) {
                int i15 = sparseIntArray.get(i7, -1);
                sparseIntArray.delete(i7);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.r5, Integer.valueOf(i15));
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.s5, Integer.valueOf(i7), strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onResume() {
        org.telegram.messenger.fj fjVar;
        sg.s0 s0Var;
        org.telegram.messenger.ue ueVar;
        LaunchActivity launchActivity;
        super.onResume();
        int i7 = 0;
        org.telegram.utils.twidget.n0.r(false);
        G1 = true;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.c;
        ArrayList arrayList2 = (ArrayList) d.d;
        if (this == ((LaunchActivity) d.f)) {
            d.b = true;
            wi.p pVar = (wi.p) d.e;
            if (pVar.f != null && (launchActivity = pVar.b) != null && !org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.d();
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                wi.n nVar = (wi.n) arrayList.get(i10);
                wi.h hVar = nVar.e;
                if (hVar != null && nVar.c == 1 && hVar.g && !hVar.K) {
                    if ((hVar.b.p() && c8.nd.a(hVar.c)) != hVar.f) {
                        hVar.l();
                        hVar.a();
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList2.clear();
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList3.get(i11);
                    i11++;
                    ((Runnable) obj).run();
                }
            }
            d.f();
        }
        int i12 = 3;
        if (org.telegram.ui.ActionBar.n6.o == 3) {
            org.telegram.ui.ActionBar.n6.F(false);
        }
        org.telegram.messenger.qd[] qdVarArr = org.telegram.messenger.qd.P;
        int i13 = 0;
        while (true) {
            if (i13 >= 4) {
                break;
            }
            if (org.telegram.messenger.j10.i(i13).p() && !org.telegram.messenger.qd.f(i13).J.isEmpty()) {
                org.telegram.messenger.qd.q();
                break;
            }
            i13++;
        }
        H(true);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, Integer.valueOf(TLObject.FLAG_12));
        MediaController B = MediaController.B();
        ViewGroup view = this.p0.getView();
        this.s1 = view;
        B.L0 = view;
        org.telegram.messenger.t0.x = false;
        org.telegram.messenger.mp.u1(this.P).f5(null);
        I0();
        Utilities.d.c(new org.telegram.ui.Components.me(27));
        C(0);
        if (Build.VERSION.SDK_INT >= 24 && (ueVar = MediaController.b2) != null) {
            Utilities.e.d(new jg.x(ueVar.e.size(), i12), 2000L);
        }
        h0();
        org.telegram.ui.Components.rc0 rc0Var = this.z0;
        if (rc0Var == null || rc0Var.b.getVisibility() != 0) {
            this.p0.P();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.r0;
                if (actionBarLayout != null) {
                    actionBarLayout.P();
                }
                ActionBarLayout actionBarLayout2 = this.q0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.P();
                }
            }
        } else {
            this.p0.n();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout3 = this.r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.n();
                }
                ActionBarLayout actionBarLayout4 = this.q0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.n();
                }
            }
            this.z0.b.l();
            ArrayList arrayList4 = this.A0;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                ((org.telegram.ui.Components.pc0) obj2).l();
            }
        }
        ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        Q0();
        int i15 = 28;
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer p12 = PhotoViewer.p1();
            qq0 qq0Var = p12.f0;
            if (qq0Var != null) {
                qq0Var.invalidate();
                org.telegram.messenger.g0.h3(new ii(p12, i7, i15), 100L);
            }
            org.telegram.ui.Components.f61 f61Var = p12.G2;
            if (f61Var != null) {
                f61Var.p0(f61Var.S() + 1);
                if (p12.Z2) {
                    p12.G2.s0(true);
                }
            }
            vp0 vp0Var = p12.M1;
            if (vp0Var != null && (s0Var = vp0Var.G0.d) != null) {
                s0Var.postRunnable(s0Var.x);
            }
        }
        hi.ta taVar = hi.ta.G2;
        if (taVar != null) {
            taVar.O();
        }
        if (PipRoundVideoView.G != null && MediaController.B().H() && (fjVar = MediaController.B().v0) != null) {
            MediaController.B().i0(fjVar, fjVar.b0);
        }
        if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).a0 != null) {
            int i16 = org.telegram.messenger.j10.t0;
            L0(i16, org.telegram.messenger.j10.i(i16).a0);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.bz.j1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(org.telegram.messenger.j10.t0, tL_help_appUpdate, true);
            }
        }
        z(false);
        org.telegram.messenger.t0.G = Settings.canDrawOverlays(this);
        org.telegram.ui.Components.voip.h2.a(this);
        hc1 hc1Var = hc1.m1;
        if (hc1Var != null) {
            if (org.telegram.ui.Components.voip.h2.d() != null) {
                org.telegram.ui.Components.voip.h2.b();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                hc1Var.y();
            } else if (VoIPService.getSharedState() == null) {
                hc1Var.u0.b();
            }
            hc1Var.J0 = ((KeyguardManager) hc1Var.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.h2.d() != null) {
                org.telegram.ui.Components.voip.h2.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        } else if (org.telegram.ui.Components.voip.h2.d() != null) {
            org.telegram.ui.Components.voip.h2.d().getClass();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getVideoState(false) == 1) {
                sharedInstance3.setVideoState(false, 2);
            }
        }
        a0();
        HashMap hashMap = xh.e.n;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                xh.d dVar = ((xh.e) it.next()).f;
                if (dVar != null) {
                    dVar.b = false;
                }
            }
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        z zVar = J1;
        if (zVar != null) {
            zVar.run();
            J1 = null;
        }
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.P);
        if (u12.V3.contains("SETUP_LOGIN_EMAIL") || u12.V3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            Utilities.d.c(new org.telegram.messenger.rj(org.telegram.messenger.mp.u1(this.P), i15));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x000e, B:9:0x0018, B:11:0x00a5, B:15:0x00b3, B:17:0x00c2, B:19:0x00c6, B:20:0x012f, B:24:0x00d0, B:27:0x00d6, B:28:0x00df, B:30:0x00e3, B:31:0x00e9, B:33:0x00ed, B:35:0x00f6, B:36:0x00fc, B:39:0x0106, B:40:0x010f, B:43:0x0115, B:45:0x011d, B:46:0x0126, B:48:0x012a, B:50:0x0034, B:52:0x0038, B:54:0x0042, B:55:0x005a, B:57:0x0066, B:59:0x007e, B:61:0x008a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.l, e0.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        org.telegram.ui.ActionBar.h2 h2Var;
        try {
            super.onSaveInstanceState(bundle);
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.q0;
                if (actionBarLayout == null || actionBarLayout.getFragmentStack().isEmpty()) {
                    ActionBarLayout actionBarLayout2 = this.r0;
                    if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                        if (!this.p0.getFragmentStack().isEmpty()) {
                            h2Var = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
                        }
                        h2Var = null;
                    } else {
                        h2Var = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
                    }
                } else {
                    h2Var = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
                }
                if (h2Var != null) {
                    Bundle arguments = h2Var.getArguments();
                    if ((h2Var instanceof bn) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "chat");
                        bn bnVar = (bn) h2Var;
                        if (bnVar.x4 && bnVar.g4 == 0) {
                            bundle.putLong("topic_id", bnVar.d());
                        }
                    } else if ((h2Var instanceof f50) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "group");
                    } else if (h2Var instanceof WallpapersListActivity) {
                        bundle.putString("fragment", "wallpapers");
                    } else if (h2Var instanceof ProfileActivity) {
                        ProfileActivity profileActivity = (ProfileActivity) h2Var;
                        if (profileActivity.y4()) {
                            bundle.putString("fragment", "settings");
                        } else if (profileActivity.f1 != 0 && arguments != null) {
                            bundle.putBundle("args", arguments);
                            bundle.putString("fragment", "chat_profile");
                        }
                    } else if ((h2Var instanceof ad) && arguments != null && arguments.getInt("step") == 0) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "channel");
                    } else if (h2Var instanceof o31) {
                        bundle.putString("fragment", "settings2");
                    }
                    h2Var.saveSelfArgs(bundle);
                    return;
                }
                return;
            }
            if (!this.p0.getFragmentStack().isEmpty()) {
                h2Var = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
                if (h2Var != null) {
                }
            }
            h2Var = null;
            if (h2Var != null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onStart() {
        wi.h hVar;
        wi.o oVar;
        super.onStart();
        this.r1 = true;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.c;
        if (this == ((LaunchActivity) d.f)) {
            d.a = true;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                if (nVar.c == 1 && (hVar = nVar.e) != null && !hVar.f && (oVar = hVar.j) != null) {
                    oVar.post(new wg.r(5, hVar, oVar));
                }
            }
        }
        WeakReference weakReference = vf.c.e;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (activity != null && activity != this) {
            vf.c.y(activity);
        }
        if (vf.c.b == null) {
            vf.c.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(vf.c.d)) {
                    String a10 = a8.h1.a(this);
                    vf.c.d = a10;
                    if (a10 == null) {
                    }
                }
                vf.a aVar = new vf.a();
                ag.a aVar2 = new ag.a();
                aVar2.b = new WeakReference(aVar);
                vf.c.c = aVar2;
                String str = vf.c.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, aVar2, 33)) {
                    vf.c.c = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.t0.y = false;
        org.telegram.ui.Components.z10.k(this);
        f40 f40Var = f40.C5;
        if (f40Var != null) {
            f40Var.z1();
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onStop() {
        wi.h hVar;
        super.onStop();
        org.telegram.ui.Wallet.e1 e1Var = c8.za.b;
        if (e1Var != null && e1Var.e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.e1 e1Var2 = c8.za.b;
            if (!e1Var2.f) {
                e1Var2.c("AUTH_CANCELED");
                c8.za.b.e();
            }
        }
        this.r1 = false;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.c;
        if (this == ((LaunchActivity) d.f)) {
            d.a = false;
            ((wi.p) d.e).getClass();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                if (nVar.c == 1 && (hVar = nVar.e) != null && !hVar.f) {
                    nVar.a.b();
                    nVar.c();
                }
            }
        }
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().Z1();
        }
        vf.c.y(this);
        org.telegram.messenger.t0.y = true;
        org.telegram.ui.Components.z10.k(this);
        f40 f40Var = f40.C5;
        if (f40Var != null) {
            f40Var.y1();
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.h1 = false;
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        ((wi.p) l2.i.d().e).g();
        ArrayList arrayList = this.a1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.p0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.V0.isEmpty()) {
                ((org.telegram.ui.ActionBar.h2) p5.c.h(1, actionBarLayout.V0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.s sVar = actionBarLayout.H;
            if (sVar != null) {
                sVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z10) {
        boolean z11;
        fi.y6 a10;
        long[] jArr2 = jArr;
        int i7 = 0;
        while (true) {
            if (i7 >= jArr2.length) {
                z11 = true;
                break;
            }
            TLRPC.User c22 = org.telegram.messenger.mp.u1(this.P).c2(Long.valueOf(jArr2[i7]));
            if (c22 != null && !c22.stories_hidden) {
                z11 = false;
                break;
            }
            i7++;
        }
        org.telegram.ui.ActionBar.h2 Q = Q();
        if (Q == null) {
            return;
        }
        fi.p6 R1 = org.telegram.messenger.mp.u1(this.P).R1();
        ArrayList arrayList = new ArrayList(z11 ? R1.h : R1.g);
        boolean z12 = z11;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!z12) {
            ArrayList arrayList4 = new ArrayList();
            for (int i10 = 0; i10 < jArr2.length; i10++) {
                TLRPC.User c23 = org.telegram.messenger.mp.u1(this.P).c2(Long.valueOf(jArr2[i10]));
                if (c23 == null || !c23.stories_hidden) {
                    arrayList4.add(Long.valueOf(jArr2[i10]));
                }
            }
            Object[] array = arrayList4.toArray();
            int length = array.length;
            long[] jArr3 = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = array[i11];
                obj.getClass();
                jArr3[i11] = ((Number) obj).longValue();
            }
            jArr2 = jArr3;
        }
        if (z10) {
            for (int i12 = 0; i12 < jArr2.length; i12 = com.google.android.gms.internal.vision.e2.g(i12, 1, jArr2[i12], arrayList3)) {
            }
        } else {
            for (int i13 = 0; i13 < jArr2.length; i13 = com.google.android.gms.internal.vision.e2.g(i13, 1, jArr2[i13], arrayList2)) {
            }
        }
        if (!arrayList3.isEmpty() && z10) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.P);
            int[] iArr = {arrayList3.size()};
            up upVar = new up(this, iArr, jArr2, 17);
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                long longValue = ((Long) arrayList3.get(i14)).longValue();
                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                TLRPC.InputPeer l1 = u12.l1(longValue);
                tL_stories_getPeerStories.peer = l1;
                if (l1 instanceof TLRPC.TL_inputPeerEmpty) {
                    iArr[0] = iArr[0] - 1;
                } else {
                    ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getPeerStories, new di.p2(u12, longValue, upVar, 6));
                }
            }
            return;
        }
        long e10 = org.telegram.messenger.j10.i(this.P).e();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            long o4 = org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer);
            if (o4 != e10 && !arrayList2.contains(Long.valueOf(o4)) && R1.L(o4)) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (Q instanceof cx) {
            try {
                a10 = fi.y6.a(((cx) Q).F0.h);
            } catch (Exception unused) {
            }
            fi.y6 y6Var = a10;
            Q.getOrCreateStoryViewer().B();
            Q.getOrCreateStoryViewer().M(this, null, arrayList2, 0, null, null, y6Var, false);
        }
        a10 = null;
        fi.y6 y6Var2 = a10;
        Q.getOrCreateStoryViewer().B();
        Q.getOrCreateStoryViewer().M(this, null, arrayList2, 0, null, null, y6Var2, false);
    }

    public final void q0(final int i7, final long j3, final boolean z10) {
        TL_stories.StoryItem storyItem;
        fi.h6 h6Var;
        fi.h6 A;
        org.telegram.messenger.fj f10;
        org.telegram.messenger.fj f11;
        TL_stories.StoryItem storyItem2;
        fi.p6 R1 = org.telegram.messenger.mp.u1(this.P).R1();
        TL_stories.PeerStories y10 = R1.y(j3);
        fi.y6 y6Var = null;
        if (y10 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= y10.stories.size()) {
                    storyItem2 = null;
                    break;
                } else {
                    if (y10.stories.get(i10).id == i7) {
                        storyItem2 = y10.stories.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j3;
                org.telegram.ui.ActionBar.h2 Q = Q();
                if (Q == null) {
                    return;
                }
                if (Q instanceof cx) {
                    try {
                        y6Var = fi.y6.a(((cx) Q).F0.h);
                    } catch (Exception unused) {
                    }
                }
                fi.y6 y6Var2 = y6Var;
                Q.getOrCreateStoryViewer().B();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem2.dialogId));
                if (z10) {
                    Q.getOrCreateStoryViewer().w1 = true;
                }
                Q.getOrCreateStoryViewer().M(this, storyItem2, arrayList, 0, null, y10, y6Var2, false);
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            fi.h6 A2 = R1.A(0, -1, j3, true);
            if (A2 == null || (f11 = A2.f(i7)) == null) {
                A2 = null;
            } else {
                storyItem = f11.l;
            }
            if (storyItem != null || (A = R1.A(1, -1, j3, true)) == null || (f10 = A.f(i7)) == null) {
                h6Var = A2;
            } else {
                storyItem = f10.l;
                h6Var = A;
            }
            if (storyItem != null && h6Var != null) {
                storyItem.dialogId = j3;
                org.telegram.ui.ActionBar.h2 Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof cx) {
                    try {
                        y6Var = fi.y6.a(((cx) Q2).F0.h);
                    } catch (Exception unused2) {
                    }
                }
                fi.y6 y6Var3 = y6Var;
                Q2.getOrCreateStoryViewer().B();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    Q2.getOrCreateStoryViewer().w1 = true;
                }
                Q2.getOrCreateStoryViewer().M(this, storyItem, arrayList2, 0, h6Var, null, y6Var3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = org.telegram.messenger.mp.u1(this.P).l1(j3);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: org.telegram.ui.f80
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new ai.x0(LaunchActivity.this, tLObject, i7, j3, z10));
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.m6 m6Var) {
        int i7 = m6Var.g0;
        org.telegram.ui.ActionBar.k6 f10 = m6Var.f(tL_theme, this.P, 0);
        m6Var.a0 = m6Var.Z;
        m6Var.u(f10.a);
        f10.s = tL_wallPaper;
        t0(new x71(m6Var, i7 != m6Var.g0, 0, false, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(final int i7, int i10, final TLRPC.Chat chat, final int i11, TLRPC.TL_forumTopic tL_forumTopic, final Runnable runnable, final String str, final Integer num, final byte[] bArr, final int i12, final ArrayList arrayList, final int i13) {
        final int i14;
        TLRPC.TL_forumTopic tL_forumTopic2;
        ArrayList arrayList2;
        if (tL_forumTopic == null) {
            i14 = i10;
            tL_forumTopic2 = org.telegram.messenger.mp.u1(i7).t7.f(chat.id, i14);
        } else {
            i14 = i10;
            tL_forumTopic2 = tL_forumTopic;
        }
        if (tL_forumTopic2 == null) {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
            tL_messages_getForumTopicsByID.peer = org.telegram.messenger.mp.u1(this.P).l1(-chat.id);
            tL_messages_getForumTopicsByID.topics.add(Integer.valueOf(i14));
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() { // from class: org.telegram.ui.s70
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    String str2 = LaunchActivity.C1;
                    final LaunchActivity launchActivity = LaunchActivity.this;
                    final int i15 = i7;
                    final TLRPC.Chat chat2 = chat;
                    final int i16 = i14;
                    final int i17 = i11;
                    final Runnable runnable2 = runnable;
                    final String str3 = str;
                    final Integer num2 = num;
                    final byte[] bArr2 = bArr;
                    final int i18 = i12;
                    final ArrayList arrayList3 = arrayList;
                    final int i19 = i13;
                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.x70
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str4 = LaunchActivity.C1;
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            launchActivity2.getClass();
                            if (tL_error == null) {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                a0.h hVar = new a0.h();
                                for (int i20 = 0; i20 < tL_messages_forumTopics.messages.size(); i20++) {
                                    hVar.k(tL_messages_forumTopics.messages.get(i20), tL_messages_forumTopics.messages.get(i20).id);
                                }
                                int i21 = i15;
                                org.telegram.messenger.mp.u1(i21).f4(tL_messages_forumTopics.users, false);
                                org.telegram.messenger.mp.u1(i21).Z3(tL_messages_forumTopics.chats, false);
                                org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(i21).t7;
                                TLRPC.Chat chat3 = chat2;
                                e00Var.u(chat3.id, tL_messages_forumTopics.topics, hVar, false, 2, -1);
                                org.telegram.messenger.e00 e00Var2 = org.telegram.messenger.mp.u1(i21).t7;
                                long j3 = chat3.id;
                                int i22 = i16;
                                launchActivity2.s0(i21, i22, chat3, i17, e00Var2.f(j3, i22), runnable2, str3, num2, bArr2, i18, arrayList3, i19);
                            }
                        }
                    });
                }
            });
            return;
        }
        ArrayList arrayList3 = this.e0;
        org.telegram.ui.ActionBar.h2 h2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList3) : null;
        if (h2Var instanceof bn) {
            bn bnVar = (bn) h2Var;
            if (bnVar.a() == (-chat.id) && bnVar.x4 && bnVar.d() == tL_forumTopic2.id) {
                if (str != null) {
                    bnVar.Sb(i11, i13, str);
                }
                bnVar.i8 = num;
                bnVar.Bb(i11, i12, true, 0, true, 0, null, null, null);
                if (runnable == null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i11 != tL_forumTopic2.id) {
            bundle.putInt("message_id", Math.max(1, i11));
        }
        if (num != null) {
            bundle.putInt("task_id", num.intValue());
        }
        bn bnVar2 = new bn(bundle);
        if (arrayList.isEmpty()) {
            TLRPC.Message message = new TLRPC.Message();
            message.id = 1;
            message.action = new TLRPC.TL_messageActionChannelMigrateFrom();
            arrayList2 = arrayList;
            arrayList2.add(new org.telegram.messenger.fj(i7, message, false, false));
        } else {
            arrayList2 = arrayList;
        }
        bnVar2.Vb(arrayList2, chat, i11, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i11 != tL_forumTopic2.id) {
            if (str != null) {
                bnVar2.Sb(i11, i13, str);
            } else {
                bnVar2.i8 = num;
                bnVar2.d8 = i11;
            }
            bnVar2.Bb(i11, i12, true, 0, true, 0, null, null, null);
        }
        t0(bnVar2);
        if (runnable == null) {
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i7) {
        org.telegram.messenger.g0.g = -10;
        org.telegram.messenger.g0.h = -10;
        org.telegram.messenger.g0.i = null;
        super.setRequestedOrientation(i7);
    }

    public final void t0(org.telegram.ui.ActionBar.h2 h2Var) {
        ((ActionBarLayout) M()).S(h2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) M()).V(h2Var, z10, z11);
    }

    public final void v0(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i7 >= arrayList.size()) {
                org.telegram.ui.ActionBar.h2 T = T();
                if (T != null && T.sheetsStack != null) {
                    for (int i10 = 0; i10 < T.sheetsStack.size(); i10++) {
                        if (T.sheetsStack.get(i10).s()) {
                            T.sheetsStack.get(i10);
                        }
                    }
                }
                ox x10 = this.p0.x();
                if (x10 != null && x10.sheetsStack != null) {
                    for (int i11 = 0; i11 < x10.sheetsStack.size(); i11++) {
                        if (x10.sheetsStack.get(i11).s()) {
                            x10.sheetsStack.get(i11);
                        }
                    }
                }
                y70 y70Var = new y70(this, 1);
                TLRPC.User c22 = org.telegram.messenger.mp.u1(this.P).c2(Long.valueOf(j3));
                if (c22 != null) {
                    y70Var.a(c22);
                    return;
                } else {
                    org.telegram.messenger.tr.a0(this.P).a.c(new g80(this, j3, y70Var, 0));
                    return;
                }
            }
            if (arrayList.get(i7) instanceof ki.t2) {
                ki.t2 t2Var = (ki.t2) arrayList.get(i7);
                if (t2Var.isShowing() && t2Var.J == j3) {
                    return;
                }
            }
            i7++;
        }
    }

    public final void w0(Long l10, o60 o60Var, vf.b bVar, org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.h3 I0 = org.telegram.messenger.mp.u1(this.P).I0();
        if (bVar != null) {
            bVar.d();
        }
        I0.a(l10.longValue(), new u60(this, bVar, o60Var, I0, l10, r1Var));
    }

    public final void x(int i7) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.z1 = null;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10 >= 26 ? getWindow().getNavigationBarColor() : 0, i7);
        this.z1 = ofArgb;
        int i11 = 1;
        ofArgb.addUpdateListener(new s60(this, i11));
        this.z1.addListener(new r0(this, i7, i11));
        this.z1.setInterpolator(org.telegram.ui.Components.lr.h);
        this.z1.setDuration(320L);
        this.z1.start();
    }

    public final void x0(final int i7, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i10, final int i11, final String str23, final String str24, final String str25, String str26, final String str27, final vf.b bVar, final boolean z12, final int i12, final int i13, final int i14, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = org.telegram.messenger.mp.u1(i7).s1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getBotApp, new RequestDelegate() { // from class: org.telegram.ui.i70
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str30 = LaunchActivity.C1;
                final vf.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i15 = i7;
                final boolean z22 = z12;
                final boolean z23 = z16;
                final boolean z24 = z17;
                final boolean z25 = z18;
                if (tL_error == null) {
                    final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                    final Runnable runnable2 = runnable;
                    final TLRPC.User user2 = user;
                    final String str31 = str27;
                    final boolean z26 = z15;
                    final boolean z27 = z14;
                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.o70
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str32 = LaunchActivity.C1;
                            runnable2.run();
                            AtomicBoolean atomicBoolean = new AtomicBoolean();
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            ArrayList arrayList = launchActivity2.e0;
                            org.telegram.ui.ActionBar.h2 h2Var = (arrayList == null || arrayList.isEmpty()) ? null : (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList);
                            int i16 = i15;
                            TLRPC.User user3 = user2;
                            TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                            String str33 = str31;
                            boolean z28 = z23;
                            boolean z29 = z24;
                            boolean z30 = z25;
                            boolean z31 = z22;
                            v70 v70Var = new v70(launchActivity2, h2Var, i16, user3, tL_messages_botApp2, atomicBoolean, str33, z28, z29, z30, z31);
                            if (z26) {
                                v70Var.run();
                                return;
                            }
                            if (tL_messages_botApp2.inactive && z27) {
                                r3 r3Var = new r3(v70Var, 9);
                                vf.b bVar3 = bVar2;
                                zc1.a(launchActivity2, r3Var, bVar3 != null ? new lz(bVar3, 16) : null);
                            } else if (tL_messages_botApp2.request_write_access || z31) {
                                org.telegram.ui.Components.b5.m(h2Var, atomicBoolean, user3, v70Var);
                            } else {
                                v70Var.run();
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
                final boolean z28 = z10;
                final Integer num3 = num;
                final Long l12 = l10;
                final Long l13 = l11;
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
                final boolean z29 = z11;
                final String str53 = str22;
                final int i16 = i10;
                final int i17 = i11;
                final String str54 = str23;
                final String str55 = str24;
                final String str56 = str25;
                final int i18 = i12;
                final int i19 = i13;
                final int i20 = i14;
                final boolean z30 = z13;
                final String str57 = str28;
                final boolean z31 = z19;
                final boolean z32 = z20;
                final String str58 = str29;
                final boolean z33 = z21;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.n70
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str59 = LaunchActivity.C1;
                        LaunchActivity.this.B0(i15, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, z28, num3, l12, l13, num4, str44, hashMap2, str45, str46, str47, str48, tL_wallPaper2, str49, str50, str51, str52, z29, str53, i16, i17, str54, str55, str56, null, null, bVar2, z22, i18, false, i19, i20, null, null, z30, str57, z23, z24, z25, z31, z32, str58, null, z33, null);
                    }
                });
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06db A[LOOP:4: B:212:0x06d3->B:214:0x06db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0710 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04cf  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v24, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v25 */
    @Override // org.telegram.ui.ww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(cx cxVar, ArrayList arrayList, final CharSequence charSequence, boolean z10, boolean z11, int i7, final int i10, y91 y91Var) {
        bn bnVar;
        final bn bnVar2;
        CharSequence charSequence2;
        boolean z12;
        org.telegram.messenger.fj fjVar;
        bn bnVar3;
        long j3;
        long j10;
        org.telegram.messenger.c cVar;
        int i11;
        boolean z13;
        boolean z14;
        boolean z15;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        int size;
        ArrayList arrayList2;
        int i12;
        CharSequence charSequence6;
        LaunchActivity launchActivity;
        int i13;
        ArrayList arrayList3;
        LaunchActivity launchActivity2;
        CharSequence charSequence7;
        int i14;
        boolean z16;
        boolean z17;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        boolean z18;
        ArrayList arrayList4;
        TLRPC.Message message;
        String str;
        LaunchActivity launchActivity3;
        ?? r10;
        final LaunchActivity launchActivity4 = this;
        final ArrayList arrayList5 = arrayList;
        final int currentAccount = cxVar != null ? cxVar.getCurrentAccount() : launchActivity4.P;
        Uri uri = launchActivity4.Y;
        boolean z19 = true;
        boolean z20 = false;
        if (uri != null) {
            ArrayList arrayList6 = launchActivity4.X != null ? new ArrayList(launchActivity4.X) : null;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, launchActivity4, null);
            org.telegram.messenger.zy.C(currentAccount).Q(((org.telegram.messenger.sr) arrayList5.get(0)).a, launchActivity4.Y, launchActivity4.X, new d80(launchActivity4, currentAccount, cxVar, z10, arrayList6, uri, u1Var));
            try {
                u1Var.r(300L);
            } catch (Exception unused) {
            }
            launchActivity3 = launchActivity4;
            r10 = 0;
        } else {
            cx cxVar2 = cxVar;
            final boolean z21 = cxVar2 == null || cxVar2.L2 || z11;
            int i15 = i7 != 0 ? i7 : cxVar2 == null ? 0 : cxVar2.M2;
            boolean z22 = cxVar2 != null && cxVar2.O2;
            if (arrayList5.size() <= 1) {
                long j11 = ((org.telegram.messenger.sr) arrayList5.get(0)).a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (!org.telegram.messenger.g0.Q1()) {
                    org.telegram.messenger.ks.f(currentAccount).k(org.telegram.messenger.ks.t, new Object[0]);
                }
                if (org.telegram.messenger.n5.C(j11)) {
                    k10.putInt("enc_id", (int) (j11 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(j11)) {
                    k10.putLong("user_id", j11);
                } else {
                    k10.putLong("chat_id", -j11);
                }
                if (org.telegram.messenger.mp.u1(currentAccount).E(k10, cxVar2, null, null)) {
                    bn bnVar4 = new bn(k10);
                    qg.c.a(bnVar4, (org.telegram.messenger.sr) arrayList5.get(0));
                    bnVar = bnVar4;
                }
                return false;
            }
            bnVar = null;
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
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (org.telegram.ui.Components.b5.h(launchActivity4, launchActivity4.P, ((org.telegram.messenger.sr) arrayList5.get(i16)).a, size2 > 1)) {
                    return false;
                }
            }
            if (y91Var != null) {
                y91Var.removeSelfFromStack();
            }
            ArrayList arrayList11 = launchActivity4.b0;
            if (arrayList11 != null && arrayList11.size() == 1) {
                ArrayList arrayList12 = launchActivity4.e0;
                if (!arrayList12.isEmpty()) {
                    org.telegram.ui.Components.ld0 ld0Var = new org.telegram.ui.Components.ld0((org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList12), null, null, launchActivity4.c0, null, null, null, null, null);
                    bnVar2 = bnVar;
                    final int i17 = i15;
                    ld0Var.F1 = new org.telegram.ui.Components.kj() { // from class: org.telegram.ui.e80
                        @Override // org.telegram.ui.Components.kj
                        public final void a(TLRPC.User user, boolean z23, int i18, long j12) {
                            org.telegram.messenger.fj fjVar2;
                            TLRPC.TL_forumTopic f10;
                            TLRPC.Message message2;
                            String str2 = LaunchActivity.C1;
                            bn bnVar5 = bnVar2;
                            if (bnVar5 != null) {
                                ((ActionBarLayout) LaunchActivity.this.M()).V(bnVar5, true, false);
                            }
                            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.j10.t0);
                            int i19 = a10.a;
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList13 = arrayList5;
                                if (i20 >= arrayList13.size()) {
                                    return;
                                }
                                long j13 = ((org.telegram.messenger.sr) arrayList13.get(i20)).a;
                                long j14 = ((org.telegram.messenger.sr) arrayList13.get(i20)).b;
                                if (j14 == 0 || (f10 = org.telegram.messenger.mp.u1(i19).t7.f(-j13, j14)) == null || (message2 = f10.topicStartMessage) == null) {
                                    fjVar2 = null;
                                } else {
                                    fjVar2 = new org.telegram.messenger.fj(i19, message2, false, false);
                                    fjVar2.p = true;
                                }
                                org.telegram.messenger.fj fjVar3 = fjVar2;
                                int i21 = i17;
                                int i22 = i18 != 0 ? i18 : i21;
                                int i23 = i10;
                                org.telegram.messenger.xy g10 = org.telegram.messenger.xy.g(user, j13, fjVar3, fjVar3, null, null, z23, i22, i23);
                                CharSequence charSequence11 = charSequence;
                                if (TextUtils.isEmpty(charSequence11)) {
                                    g10.O = 0L;
                                }
                                g10.L = false;
                                org.telegram.messenger.zy.C(currentAccount).r0(g10);
                                if (!TextUtils.isEmpty(charSequence11)) {
                                    org.telegram.messenger.zy.a0(a10, charSequence11, j13, 0L, z21, i18 != 0 ? i18 : i21, i23);
                                }
                                i20++;
                            }
                        }

                        @Override // org.telegram.ui.Components.kj
                        public final /* synthetic */ void b(ArrayList arrayList13, String str2, boolean z23, int i18, long j12, boolean z24) {
                        }
                    };
                    ((org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList12)).showDialog(ld0Var);
                    launchActivity3 = launchActivity4;
                    bn bnVar5 = bnVar2;
                    if (cxVar != null && bnVar5 == null && !z19) {
                        cxVar.finishFragment();
                    }
                    r10 = 0;
                }
            }
            bnVar2 = bnVar;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence2 = charSequence;
            } else {
                launchActivity4.U = charSequence;
                charSequence2 = null;
            }
            Object[] objArr = cxVar2 != null && cxVar2.o4();
            if (objArr != false) {
                ArrayList arrayList13 = cxVar2.F2;
                ArrayList arrayList14 = new ArrayList();
                if (arrayList13 != null) {
                    int size3 = arrayList13.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj = arrayList13.get(i18);
                        i18++;
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                        org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
                        boolean z23 = efVar.b;
                        if (z23 || (str = efVar.h) == null) {
                            String str2 = efVar.I;
                            if (str2 != null) {
                                yyVar.c = str2;
                            }
                        } else {
                            yyVar.c = str;
                        }
                        yyVar.e = efVar.c;
                        yyVar.f = efVar.g;
                        yyVar.o = z23;
                        yyVar.p = efVar.d();
                        yyVar.q = efVar.j();
                        boolean z24 = z20;
                        yyVar.z = efVar.m;
                        yyVar.A = efVar.P;
                        CharSequence charSequence11 = efVar.a;
                        yyVar.d = charSequence11 != null ? charSequence11.toString() : null;
                        yyVar.i = efVar.n;
                        yyVar.j = efVar.r;
                        yyVar.h = efVar.x;
                        yyVar.k = efVar.s;
                        yyVar.r = efVar.L;
                        yyVar.x = efVar.c();
                        arrayList14.add(yyVar);
                        z20 = z24;
                    }
                }
                boolean z25 = z20;
                launchActivity4.V = arrayList14;
                if (!arrayList14.isEmpty()) {
                    CharSequence charSequence12 = launchActivity4.U;
                    if (charSequence12 == null) {
                        charSequence12 = "";
                    }
                    CharSequence[] charSequenceArr = new CharSequence[1];
                    charSequenceArr[z25 ? 1 : 0] = charSequence12;
                    ArrayList Y = org.telegram.messenger.ri.d0(launchActivity4.P).Y(charSequenceArr, z25, true);
                    CharSequence charSequence13 = charSequenceArr[z25 ? 1 : 0];
                    String charSequence14 = charSequence13 == null ? null : charSequence13.toString();
                    for (int i19 = 0; i19 < launchActivity4.V.size(); i19++) {
                        org.telegram.messenger.yy yyVar2 = (org.telegram.messenger.yy) launchActivity4.V.get(i19);
                        if (i19 == 0) {
                            yyVar2.d = charSequence14;
                            yyVar2.i = Y;
                        } else {
                            yyVar2.d = null;
                            yyVar2.i = null;
                        }
                    }
                }
                launchActivity4.S = null;
                launchActivity4.U = null;
            }
            boolean z26 = false;
            CharSequence charSequence15 = null;
            int i20 = 0;
            while (i20 < arrayList5.size()) {
                long j12 = ((org.telegram.messenger.sr) arrayList5.get(i20)).a;
                long j13 = ((org.telegram.messenger.sr) arrayList5.get(i20)).b;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.j10.t0);
                int i21 = a10.a;
                if (j13 != 0) {
                    z12 = z26;
                    TLRPC.TL_forumTopic f10 = org.telegram.messenger.mp.u1(i21).t7.f(-j12, j13);
                    if (f10 != null && (message = f10.topicStartMessage) != null) {
                        org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i21, message, false, false);
                        fjVar2.p = true;
                        fjVar = fjVar2;
                        if (bnVar2 == null) {
                            ((ActionBarLayout) launchActivity4.M()).V(bnVar2, cxVar2 != null, cxVar2 == null || launchActivity4.S != null || ((arrayList4 = launchActivity4.V) != null && arrayList4.size() > 0));
                            boolean z27 = cxVar2 != null;
                            String str3 = launchActivity4.S;
                            if (str3 == null || j13 != 0 || objArr == true) {
                                ArrayList arrayList15 = launchActivity4.V;
                                if (arrayList15 == null || arrayList15.size() <= 0 || j13 != 0 || objArr == true) {
                                    boolean z28 = z22;
                                    z12 = z27;
                                    CharSequence charSequence16 = charSequence15;
                                    i11 = i21;
                                    bnVar3 = bnVar2;
                                    j3 = j13;
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
                                        j10 = j12;
                                        cVar = a10;
                                        org.telegram.messenger.zy.W(cVar, arrayList16, arrayList16, null, charSequence8, null, j10, fjVar, fjVar, z21, i15);
                                        z22 = z28;
                                        charSequence15 = charSequence8;
                                    } else {
                                        j10 = j12;
                                        cVar = a10;
                                        ArrayList arrayList17 = launchActivity4.V;
                                        if (arrayList17 == null || arrayList17.size() <= 0) {
                                            z22 = z28;
                                        } else {
                                            CharSequence charSequence19 = launchActivity4.U;
                                            if (charSequence19 != null && charSequence19.length() <= 1024 && launchActivity4.V.size() == 1) {
                                                CharSequence[] charSequenceArr2 = {launchActivity4.U};
                                                ((org.telegram.messenger.yy) launchActivity4.V.get(0)).i = org.telegram.messenger.ri.d0(launchActivity4.P).Y(charSequenceArr2, false, true);
                                                ((org.telegram.messenger.yy) launchActivity4.V.get(0)).d = charSequenceArr2[0].toString();
                                                launchActivity4.U = null;
                                            }
                                            ArrayList arrayList18 = launchActivity4.V;
                                            int i22 = i15;
                                            org.telegram.messenger.fj fjVar3 = fjVar;
                                            org.telegram.messenger.zy.X(cVar, arrayList18, j10, fjVar3, fjVar, null, null, z28, arrayList18.size() > 1, null, null, z21, i22, i10, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                            j10 = j10;
                                            z22 = z28;
                                            i15 = i22;
                                            fjVar = fjVar3;
                                        }
                                        charSequence15 = charSequence16;
                                    }
                                    z16 = false;
                                    z17 = false;
                                } else {
                                    ArrayList arrayList19 = launchActivity4.V;
                                    CharSequence charSequence20 = (charSequence2 == null || charSequence2.length() == 0) ? launchActivity4.U : charSequence2;
                                    boolean z29 = z22;
                                    ArrayList X7 = bn.X7(arrayList19, bnVar2.z(), charSequence20);
                                    if (X7.isEmpty()) {
                                        z12 = z27;
                                        charSequence9 = charSequence15;
                                        i11 = i21;
                                        z18 = false;
                                        bnVar3 = bnVar2;
                                        j3 = j13;
                                        charSequence10 = null;
                                    } else {
                                        if (bnVar2.getParentActivity() != null) {
                                            boolean[] zArr = new boolean[X7.size()];
                                            Arrays.fill(zArr, true);
                                            z12 = z27;
                                            charSequence9 = charSequence15;
                                            PhotoViewer.p1().I2(null, bnVar2, bnVar2.Ba);
                                            PhotoViewer p12 = PhotoViewer.p1();
                                            ArrayList arrayList20 = new ArrayList(X7);
                                            int size4 = X7.size() - 1;
                                            xk xkVar = new xk(bnVar2, X7, zArr);
                                            i11 = i21;
                                            bn bnVar6 = bnVar2;
                                            j3 = j13;
                                            p12.f2(arrayList20, size4, 0, false, xkVar, bnVar6);
                                            bnVar3 = bnVar6;
                                            charSequence10 = null;
                                        } else {
                                            z12 = z27;
                                            charSequence9 = charSequence15;
                                            i11 = i21;
                                            bnVar3 = bnVar2;
                                            j3 = j13;
                                            charSequence10 = null;
                                            bnVar3.D8(charSequence20, null);
                                            bnVar3.Kb(0, X7, false, false);
                                            bnVar3.L6();
                                        }
                                        z18 = true;
                                    }
                                    if (z18) {
                                        launchActivity4.U = charSequence10;
                                    }
                                    charSequence15 = charSequence9;
                                    j10 = j12;
                                    cVar = a10;
                                    z16 = false;
                                    z17 = z18;
                                    z22 = z29;
                                }
                            } else {
                                bnVar2.Ra(launchActivity4.U, str3);
                                launchActivity4.U = null;
                                z12 = z27;
                                j10 = j12;
                                i11 = i21;
                                z16 = true;
                                z17 = false;
                                bnVar3 = bnVar2;
                                cVar = a10;
                                j3 = j13;
                            }
                            z13 = z22;
                            z15 = z16;
                            z14 = z17;
                        } else {
                            bnVar3 = bnVar2;
                            j3 = j13;
                            CharSequence charSequence21 = charSequence15;
                            j10 = j12;
                            cVar = a10;
                            i11 = i21;
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
                                org.telegram.messenger.zy.W(cVar, arrayList21, arrayList21, null, charSequence3, null, j10, fjVar, fjVar, z21, i15);
                                charSequence15 = charSequence3;
                            } else {
                                charSequence15 = charSequence21;
                            }
                            if (launchActivity4.V != null) {
                                CharSequence charSequence24 = launchActivity4.U;
                                if (charSequence24 != null && charSequence24.length() <= 1024 && launchActivity4.V.size() == 1) {
                                    CharSequence[] charSequenceArr3 = {launchActivity4.U};
                                    ((org.telegram.messenger.yy) launchActivity4.V.get(0)).i = org.telegram.messenger.ri.d0(launchActivity4.P).Y(charSequenceArr3, false, true);
                                    ((org.telegram.messenger.yy) launchActivity4.V.get(0)).d = charSequenceArr3[0].toString();
                                    launchActivity4.U = null;
                                }
                                ArrayList arrayList22 = launchActivity4.V;
                                int i23 = i15;
                                org.telegram.messenger.fj fjVar4 = fjVar;
                                boolean z30 = z22;
                                org.telegram.messenger.zy.X(cVar, arrayList22, j10, fjVar4, fjVar, null, null, z30, arrayList22.size() > 1, null, null, z21, i23, i10, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                j10 = j10;
                                z13 = z30;
                                i15 = i23;
                                fjVar = fjVar4;
                            } else {
                                z13 = z22;
                            }
                            z14 = false;
                            z15 = false;
                        }
                        boolean z31 = z12;
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
                            org.telegram.messenger.zy.W(cVar, launchActivity4.W, launchActivity4.a0, launchActivity4.X, charSequence25, launchActivity4.Z, j10, fjVar, fjVar, z21, i15);
                            charSequence5 = charSequence25;
                        } else {
                            charSequence5 = charSequence15;
                        }
                        org.telegram.messenger.c cVar2 = cVar;
                        if (launchActivity4.T != null) {
                            File file = new File(launchActivity4.T);
                            if (file.exists()) {
                                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                                tL_document.file_reference = new byte[0];
                                tL_document.dc_id = TLObject.FLAG_31;
                                tL_document.id = org.telegram.messenger.bz.p();
                                tL_document.user_id = org.telegram.messenger.j10.i(i11).e();
                                tL_document.mime_type = "audio/ogg";
                                tL_document.date = ConnectionsManager.getInstance(i11).getCurrentTime();
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
                                CharSequence[] charSequenceArr4 = {launchActivity4.U};
                                ArrayList Y2 = org.telegram.messenger.ri.d0(launchActivity4.P).Y(charSequenceArr4, false, true);
                                org.telegram.messenger.zy C = org.telegram.messenger.zy.C(i11);
                                String absolutePath = file.getAbsolutePath();
                                CharSequence charSequence26 = charSequenceArr4[0];
                                long j14 = j10;
                                org.telegram.messenger.fj fjVar5 = fjVar;
                                int i24 = i15;
                                org.telegram.messenger.xy f11 = org.telegram.messenger.xy.f(tL_document, null, absolutePath, j14, fjVar5, fjVar, charSequence26 == null ? null : charSequence26.toString(), Y2, null, null, z21, i24, i10, 0, null, null, false);
                                j10 = j14;
                                fjVar = fjVar5;
                                i15 = i24;
                                C.r0(f11);
                                if (launchActivity4.U != null) {
                                    launchActivity4.U = null;
                                }
                                long j15 = j3;
                                charSequence6 = launchActivity4.U;
                                launchActivity = launchActivity4;
                                if (charSequence6 != null) {
                                    i13 = i12;
                                    C0(cVar2, cxVar2, charSequence6, j10, fjVar, j15, z21, i15, i10);
                                } else {
                                    i13 = i12;
                                }
                                arrayList3 = launchActivity.b0;
                                if (arrayList3 != null && !arrayList3.isEmpty()) {
                                    i14 = i13;
                                    while (i14 < launchActivity.b0.size()) {
                                        TLRPC.User user = (TLRPC.User) launchActivity.b0.get(i14);
                                        org.telegram.messenger.zy C2 = org.telegram.messenger.zy.C(currentAccount);
                                        long j16 = j10;
                                        org.telegram.messenger.fj fjVar6 = fjVar;
                                        org.telegram.messenger.xy g10 = org.telegram.messenger.xy.g(user, j16, fjVar6, fjVar, null, null, z21, i15, i10);
                                        j10 = j16;
                                        fjVar = fjVar6;
                                        C2.r0(g10);
                                        i14++;
                                        launchActivity = this;
                                    }
                                }
                                if (!TextUtils.isEmpty(charSequence2) || z15 || z14) {
                                    launchActivity2 = this;
                                    charSequence7 = charSequence2;
                                } else {
                                    launchActivity2 = this;
                                    charSequence7 = charSequence2;
                                    C0(cVar2, cxVar, charSequence7, j10, fjVar, j15, z21, i15, i10);
                                }
                                i20++;
                                cxVar2 = cxVar;
                                arrayList5 = arrayList;
                                charSequence2 = charSequence7;
                                bnVar2 = bnVar3;
                                launchActivity4 = launchActivity2;
                                z22 = z13;
                                z26 = z31;
                                charSequence15 = charSequence5;
                            }
                        }
                        i12 = 0;
                        long j152 = j3;
                        charSequence6 = launchActivity4.U;
                        launchActivity = launchActivity4;
                        if (charSequence6 != null) {
                        }
                        arrayList3 = launchActivity.b0;
                        if (arrayList3 != null) {
                            i14 = i13;
                            while (i14 < launchActivity.b0.size()) {
                            }
                        }
                        if (TextUtils.isEmpty(charSequence2)) {
                        }
                        launchActivity2 = this;
                        charSequence7 = charSequence2;
                        i20++;
                        cxVar2 = cxVar;
                        arrayList5 = arrayList;
                        charSequence2 = charSequence7;
                        bnVar2 = bnVar3;
                        launchActivity4 = launchActivity2;
                        z22 = z13;
                        z26 = z31;
                        charSequence15 = charSequence5;
                    }
                } else {
                    z12 = z26;
                }
                fjVar = null;
                if (bnVar2 == null) {
                }
                boolean z312 = z12;
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
                org.telegram.messenger.zy.W(cVar, launchActivity4.W, launchActivity4.a0, launchActivity4.X, charSequence252, launchActivity4.Z, j10, fjVar, fjVar, z21, i15);
                charSequence5 = charSequence252;
                org.telegram.messenger.c cVar22 = cVar;
                if (launchActivity4.T != null) {
                }
                i12 = 0;
                long j1522 = j3;
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
                i20++;
                cxVar2 = cxVar;
                arrayList5 = arrayList;
                charSequence2 = charSequence7;
                bnVar2 = bnVar3;
                launchActivity4 = launchActivity2;
                z22 = z13;
                z26 = z312;
                charSequence15 = charSequence5;
            }
            z19 = z26;
            launchActivity3 = launchActivity4;
            bn bnVar52 = bnVar2;
            if (cxVar != null) {
                cxVar.finishFragment();
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

    public final void y0(boolean z10) {
        ActionBarLayout actionBarLayout = this.q0;
        if (actionBarLayout != null) {
            actionBarLayout.X(z10, z10);
        } else {
            this.p0.X(z10, z10);
        }
    }

    public final void z(boolean z10) {
        org.telegram.messenger.h1 e10;
        String str;
        int i7;
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        if (!z10) {
            boolean z11 = org.telegram.messenger.s2.a;
        }
        if (!org.telegram.messenger.t0.a.q()) {
            if (z10 || Math.abs(System.currentTimeMillis() - org.telegram.messenger.bz.l1) >= org.telegram.messenger.mp.u1(0).r3 * 1000) {
                TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                try {
                    tL_help_getAppUpdate.source = org.telegram.messenger.t0.b.getPackageManager().getInstallerPackageName(org.telegram.messenger.t0.b.getPackageName());
                } catch (Exception unused) {
                }
                if (tL_help_getAppUpdate.source == null) {
                    tL_help_getAppUpdate.source = "";
                }
                int i10 = this.P;
                ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new di.w1(this, i10, 8));
                return;
            }
            return;
        }
        org.telegram.messenger.d1 d1Var = null;
        if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() && (str = (e10 = org.telegram.messenger.h1.e()).a) != null && (i7 = e10.b) != 0) {
            d1Var = new org.telegram.messenger.d1(str, i7, e10.c);
        }
        boolean z12 = this.o1;
        this.o1 = false;
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        b80 b80Var = new b80(this, z12, d1Var, 1);
        if (((ApplicationLoaderImpl) t0Var).q()) {
            org.telegram.messenger.h1.e().a(b80Var, z10);
        }
    }

    public final int z0(final int i7, final o60 o60Var, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i10, final int i11) {
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.mp.n1(chat);
        tL_messages_getDiscussionMessage.msg_id = num2 != null ? num.intValue() : (int) l10.longValue();
        return ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() { // from class: org.telegram.ui.q60
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.C1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i12 = i7;
                final TLRPC.Chat chat2 = chat;
                final Long l11 = l10;
                final Integer num4 = num2;
                final Integer num5 = num;
                final Runnable runnable2 = runnable;
                final String str3 = str;
                final Integer num6 = num3;
                final byte[] bArr2 = bArr;
                final int i13 = i10;
                final int i14 = i11;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final Runnable runnable3 = o60Var;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.k70
                    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(5:3|(1:5)|6|7|(5:14|(3:16|(1:18)|19)(3:34|(1:(1:37)(1:(1:40)(1:41)))(1:(1:(1:44)(1:(1:46)(1:47))))|38)|20|(2:32|33)|(2:23|30)(1:31)))|48|49|(1:51)|20|(0)|(0)(0)|(1:(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
                    
                        org.telegram.messenger.a8.g(r0, true);
                     */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0150 A[Catch: Exception -> 0x014c, TRY_LEAVE, TryCatch #1 {Exception -> 0x014c, blocks: (B:33:0x0148, B:23:0x0150), top: B:32:0x0148 }] */
                    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        Runnable runnable4;
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.e0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.TL_messages_discussionMessage;
                        Runnable runnable5 = runnable2;
                        if (z10) {
                            TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            int i15 = i12;
                            org.telegram.messenger.mp.u1(i15).f4(tL_messages_discussionMessage.users, false);
                            org.telegram.messenger.mp.u1(i15).Z3(tL_messages_discussionMessage.chats, false);
                            ArrayList arrayList2 = new ArrayList();
                            int size = tL_messages_discussionMessage.messages.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                arrayList2.add(new org.telegram.messenger.fj(org.telegram.messenger.j10.t0, tL_messages_discussionMessage.messages.get(i16), true, true));
                            }
                            boolean isEmpty = arrayList2.isEmpty();
                            TLRPC.Chat chat3 = chat2;
                            Long l12 = l11;
                            if (!isEmpty || (chat3.forum && l12 != null && l12.longValue() == 1)) {
                                boolean z11 = chat3.forum;
                                Integer num7 = num4;
                                Integer num8 = num5;
                                String str4 = str3;
                                Integer num9 = num6;
                                byte[] bArr3 = bArr2;
                                int i17 = i14;
                                if (z11) {
                                    int longValue = (int) l12.longValue();
                                    if (num7 == null) {
                                        num7 = num8;
                                    }
                                    launchActivity2.s0(i15, longValue, chat3, num7.intValue(), null, runnable5, str4, num9, bArr3, i13, arrayList2, i17);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -org.telegram.messenger.fj.B0(((org.telegram.messenger.fj) arrayList2.get(0)).k));
                                    bundle.putInt("message_id", Math.max(1, num8.intValue()));
                                    bn bnVar = new bn(bundle);
                                    bnVar.Vb(arrayList2, chat3, tL_messages_getDiscussionMessage2.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
                                    if (num7 != null) {
                                        if (bArr3 != null) {
                                            bnVar.j8 = bArr3;
                                            bnVar.d8 = num7.intValue();
                                        } else if (str4 != null) {
                                            bnVar.Sb(num7.intValue(), i17, str4);
                                        } else {
                                            bnVar.i8 = num9;
                                            bnVar.d8 = num7.intValue();
                                        }
                                    } else if (l12 != null) {
                                        if (bArr3 != null) {
                                            bnVar.j8 = bArr3;
                                            bnVar.d8 = num8.intValue();
                                        } else if (str4 != null) {
                                            bnVar.Sb(num8.intValue(), i17, str4);
                                        } else {
                                            bnVar.i8 = num9;
                                            bnVar.d8 = num8.intValue();
                                        }
                                    }
                                    launchActivity2.t0(bnVar);
                                }
                                runnable4 = runnable3;
                                if (runnable4 != null) {
                                    try {
                                        runnable4.run();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
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
                            org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) arrayList.get(arrayList.size() - 1)).t(org.telegram.messenger.gd.M0(2131752319, null), null).j();
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

    @Override // org.telegram.ui.ActionBar.p4
    public final /* synthetic */ void f(int[] iArr) {
    }
}
