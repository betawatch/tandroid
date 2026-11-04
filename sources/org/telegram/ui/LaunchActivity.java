package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.ClipData;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
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
import android.util.Log;
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
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class LaunchActivity extends i5 implements org.telegram.ui.ActionBar.n4, org.telegram.messenger.cs, nw, vf.a {
    public static final String E1 = UUID.randomUUID().toString();
    public static final Pattern F1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean G1;
    public static int H1;
    public static boolean I1;
    public static org.telegram.ui.Components.nt J1;
    public static LaunchActivity K1;
    public static Pattern L1;
    public static b0 M1;
    public static LaunchActivity N1;
    public org.telegram.ui.ActionBar.l3 A0;
    public int[] A1;
    public org.telegram.ui.Components.bc0 B0;
    public ValueAnimator B1;
    public final ArrayList C0;
    public ci.wc C1;
    public org.telegram.ui.Components.ky0 D0;
    public int D1;
    public org.telegram.ui.Components.t9 E0;
    public final ArrayList F0;
    public org.telegram.ui.ActionBar.s1 G0;
    public View H0;
    public org.telegram.ui.ActionBar.s1 I0;
    public boolean J0;
    public HashMap K0;
    public HashMap L0;
    public Intent M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R;
    public String R0;
    public String S;
    public String S0;
    public String T;
    public TLRPC.TL_wallPaper T0;
    public CharSequence U;
    public org.telegram.ui.ActionBar.j6 U0;
    public ArrayList V;
    public TLRPC.TL_theme V0;
    public ArrayList W;
    public boolean W0;
    public ArrayList X;
    public org.telegram.ui.ActionBar.s1 X0;
    public Uri Y;
    public boolean Y0;
    public String Z;
    public boolean Z0;
    public ArrayList a0;
    public ai.p6 a1;
    public ArrayList b0;
    public o4 b1;
    public Uri c0;
    public final ArrayList c1;
    public int d0;
    public final SparseIntArray d1;
    public int e1;
    public final m80 f1;
    public org.telegram.messenger.n6 g1;
    public s70 h0;
    public androidx.mediarouter.app.f h1;
    public ArrayList i0;
    public sh.d i1;
    public ArrayList j0;
    public boolean j1;
    public String k0;
    public cg.a0 k1;
    public ActionMode l0;
    public r80 l1;
    public boolean m0;
    public s80 m1;
    public final l2.e n0;
    public boolean n1;
    public final uf.b o0;
    public za.p o1;
    public org.telegram.ui.Components.wz0 p0;
    public za.p p1;
    public lg.k q0;
    public boolean q1;
    public ActionBarLayout r0;
    public p70 r1;
    public ActionBarLayout s0;
    public gi.j8 s1;
    public ActionBarLayout t0;
    public boolean t1;
    public g80 u0;
    public ViewGroup u1;
    public FrameLayout v0;
    public final zh0 v1;
    public ai.h5 w0;
    public org.telegram.ui.ActionBar.s1 w1;
    public l0 x0;
    public org.telegram.ui.ActionBar.s1 x1;
    public p80 y0;
    public boolean y1;
    public org.telegram.ui.ActionBar.j3 z0;
    public long z1;
    public final ArrayList Q = new ArrayList();
    public final ArrayList e0 = new ArrayList();
    public final ArrayList f0 = new ArrayList();
    public final ArrayList g0 = new ArrayList();

    public LaunchActivity() {
        l2.e eVar = new l2.e();
        eVar.a = new HashMap();
        eVar.d = this;
        eVar.b = new uf.b(this);
        this.n0 = eVar;
        this.o0 = (uf.b) eVar.b;
        this.C0 = new ArrayList();
        this.F0 = new ArrayList();
        this.Y0 = false;
        this.c1 = new ArrayList();
        this.d1 = new SparseIntArray();
        this.e1 = 5934;
        this.f1 = new m80();
        this.q1 = true;
        System.identityHashCode(this);
        this.v1 = new zh0(this);
        this.D1 = 0;
    }

    public static void C0(org.telegram.messenger.c cVar, uw uwVar, CharSequence charSequence, long j10, org.telegram.messenger.zi ziVar, long j11, boolean z10, int i3, int i10) {
        org.telegram.ui.Components.ro0 ro0Var;
        org.telegram.ui.Components.ro0 ro0Var2;
        int i11 = cVar.a;
        boolean z11 = uwVar == null || (ro0Var2 = uwVar.H2) == null || ro0Var2.n;
        TLRPC.WebPage webPage = null;
        if (z11 && uwVar != null && (ro0Var = uwVar.H2) != null) {
            webPage = ro0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (webPage2 == null && z11) {
            org.telegram.messenger.yy.a0(cVar, charSequence, j10, j11, z10, i3, i10);
            return;
        }
        CharSequence H = org.telegram.messenger.yy.H(charSequence);
        if (H == null || H.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = {H};
        org.telegram.messenger.yy.C(i11).r0(org.telegram.messenger.wy.b(charSequenceArr[0].toString(), j10, ziVar, ziVar, webPage2, z11, org.telegram.messenger.li.b0(i11).W(charSequenceArr, true, true), null, null, z10, i3, i10, null, false));
    }

    public static void D(int i3) {
        LaunchActivity launchActivity = N1;
        if (launchActivity != null) {
            launchActivity.C(i3);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i3, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        org.telegram.ui.ActionBar.d2 Q = Q();
        if (Q == null) {
            return;
        }
        long j10 = tL_attachMenuBot.bot_id;
        ii.q4 b10 = ii.q4.b(i3, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
        if (launchActivity.O() == null || launchActivity.O().k(b10) == null) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(tL_attachMenuBot.bot_id));
            String F12 = a22 == null ? null : org.telegram.messenger.hp.s1(i3).F1(a22.restriction_reason);
            if (!TextUtils.isEmpty(F12)) {
                org.telegram.messenger.hp.s1(i3);
                org.telegram.messenger.hp.R4(F12, Q);
                return;
            }
            ii.a3 a3Var = new ii.a3(launchActivity, Q.getResourceProvider());
            a3Var.C0 = false;
            a3Var.B(z10);
            a3Var.m0 = launchActivity;
            a3Var.x(Q, b10);
            a3Var.show();
        }
    }

    public static void J() {
        ArrayList<org.telegram.ui.ActionBar.z1> arrayList;
        org.telegram.ui.ActionBar.d2 T = T();
        if (T == null) {
            return;
        }
        gx x10 = T.getParentLayout() instanceof ActionBarLayout ? ((ActionBarLayout) T.getParentLayout()).x() : null;
        if (x10 != null && (arrayList = x10.sheetsStack) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                x10.sheetsStack.get(size).a(true);
            }
        }
        ArrayList<org.telegram.ui.ActionBar.z1> arrayList2 = T.sheetsStack;
        if (arrayList2 != null) {
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                T.sheetsStack.get(size2).a(true);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ii.a3.b1.iterator();
        while (it.hasNext()) {
            arrayList3.add((ii.a3) it.next());
        }
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj = arrayList3.get(i3);
            i3++;
            ((ii.a3) obj).o(true);
        }
    }

    public static org.telegram.ui.ActionBar.d2 L() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = K1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.q4) k2.p1.h(1, K1.Q))).t();
        }
        LaunchActivity launchActivity2 = K1;
        if (launchActivity2 == null || launchActivity2.M() == null) {
            return null;
        }
        return ((ActionBarLayout) K1.M()).t();
    }

    public static org.telegram.ui.ActionBar.d2 Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = K1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.q4) k2.p1.h(1, K1.Q)).getLastFragment();
        }
        LaunchActivity launchActivity2 = K1;
        if (launchActivity2 == null || launchActivity2.M() == null) {
            return null;
        }
        return K1.M().getLastFragment();
    }

    public static org.telegram.ui.ActionBar.d2 T() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = K1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.q4) k2.p1.h(1, K1.Q)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = K1;
        if (launchActivity2 == null || launchActivity2.M() == null) {
            return null;
        }
        return K1.M().getSafeLastFragment();
    }

    public static String U(int i3, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        return str2 == null ? org.telegram.messenger.bd.M0(i3, str) : str2;
    }

    public static int V(Uri uri) {
        String query = uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND) ? uri.getQuery() : uri.getQueryParameter("t") != null ? uri.getQueryParameter("t") : null;
        if (TextUtils.isEmpty(query)) {
            return -1;
        }
        if (L1 == null) {
            L1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
        }
        try {
            Matcher matcher = L1.matcher(query);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                int i3 = 0;
                int parseInt = TextUtils.isEmpty(group) ? 0 : Integer.parseInt(group);
                int parseInt2 = TextUtils.isEmpty(group2) ? 0 : Integer.parseInt(group2);
                int parseInt3 = TextUtils.isEmpty(group3) ? 0 : Integer.parseInt(group3);
                if (!TextUtils.isEmpty(group4)) {
                    i3 = Integer.parseInt(group4);
                }
                return (parseInt * 86400) + (parseInt2 * 3600) + (parseInt3 * 60) + i3;
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
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                Z(viewGroup.getChildAt(i3));
            }
        }
    }

    public static void b0(float f10, float f11, float f12) {
        View decorView;
        ci.wc wcVar;
        LaunchActivity launchActivity = K1;
        if (launchActivity == null || (decorView = launchActivity.getWindow().getDecorView()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && ((wcVar = launchActivity.C1) == null || ((View) wcVar.a) != decorView)) {
            launchActivity.C1 = new ci.wc(decorView);
        }
        ci.wc wcVar2 = launchActivity.C1;
        if (wcVar2 != null) {
            View view = (View) wcVar2.a;
            ArrayList arrayList = wcVar2.b;
            if (arrayList.size() >= 7) {
                return;
            }
            float max = (Math.max(Math.max(a7.h.a(0.0f, 0.0f, f10, f11), a7.h.a(view.getWidth(), 0.0f, f10, f11)), Math.max(a7.h.a(0.0f, view.getHeight(), f10, f11), a7.h.a(view.getWidth(), view.getHeight(), f10, f11))) * 2.0f) / (org.telegram.messenger.g0.p * 1200.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
            ci.vc vcVar = new ci.vc(f10, f11, f12);
            ofFloat.addUpdateListener(new ci.uc(0, wcVar2, vcVar));
            ofFloat.addListener(new bh.j(1, wcVar2, vcVar));
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.g);
            ofFloat.setDuration((long) (max * 1000.0f));
            arrayList.add(vcVar);
            wcVar2.f1();
            ofFloat.start();
        }
    }

    public final void A() {
        if (this.P != org.telegram.messenger.h10.t0 || this.o1 == null) {
            za.p pVar = this.o1;
            if (pVar != null) {
                pVar.a();
                this.o1 = null;
            }
            int i3 = org.telegram.messenger.h10.t0;
            this.P = i3;
            za.p pVar2 = new za.p(org.telegram.messenger.hs.f(i3), this);
            pVar2.b(org.telegram.messenger.hs.n3);
            pVar2.b(org.telegram.messenger.hs.I2);
            pVar2.b(org.telegram.messenger.hs.j0);
            pVar2.b(org.telegram.messenger.hs.W4);
            pVar2.b(org.telegram.messenger.hs.T1);
            pVar2.b(org.telegram.messenger.hs.M0);
            pVar2.b(org.telegram.messenger.hs.R0);
            pVar2.b(org.telegram.messenger.hs.c1);
            pVar2.b(org.telegram.messenger.hs.Q);
            pVar2.b(org.telegram.messenger.hs.N0);
            pVar2.b(org.telegram.messenger.hs.Y1);
            pVar2.b(org.telegram.messenger.hs.Z1);
            pVar2.b(org.telegram.messenger.hs.v1);
            pVar2.b(org.telegram.messenger.hs.w2);
            pVar2.b(org.telegram.messenger.hs.x1);
            pVar2.b(org.telegram.messenger.hs.i5);
            pVar2.b(org.telegram.messenger.hs.f5);
            pVar2.b(org.telegram.messenger.hs.r5);
            pVar2.b(org.telegram.messenger.hs.Q5);
            this.o1 = pVar2;
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
        int i3 = org.telegram.messenger.h10.t0;
        InputStream inputStream2 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        String str = null;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, this, null);
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
        iArr[0] = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_checkHistoryImport, new ei.i8(this, uri, i3, s1Var, 6));
        s1Var.setOnCancelListener(new mx(i3, 1, iArr));
        try {
            s1Var.r(300L);
        } catch (Exception unused) {
        }
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.k1 == null && org.telegram.messenger.az.p) {
                this.k1 = cg.a0.b(this, this.x0);
            }
            cg.a0 a0Var = this.k1;
            if (a0Var == null || org.telegram.messenger.az.p) {
                return;
            }
            a0Var.c();
            this.k1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(final int i3, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i10, final int i11, final String str23, final String str24, final String str25, final String str26, final String str27, final sf.b bVar, final boolean z12, final int i12, final boolean z13, final int i13, final int i14, final String str28, final String str29, final boolean z14, final String str30, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final String str31, final Integer num3, final boolean z20, final byte[] bArr) {
        final LaunchActivity launchActivity;
        ly lyVar;
        final int i15;
        org.telegram.ui.ActionBar.s1 s1Var;
        final int i16;
        int[] iArr;
        org.telegram.ui.Components.pu puVar;
        org.telegram.ui.Components.xv0 xv0Var;
        TLRPC.Chat chat;
        if (i10 == 0 && org.telegram.messenger.h10.c() >= 2 && hashMap != null) {
            org.telegram.ui.Components.t4.i(this, new org.telegram.ui.Components.p4() { // from class: org.telegram.ui.b80
                @Override // org.telegram.ui.Components.p4
                public final void a(int i17) {
                    String str32 = LaunchActivity.E1;
                    LaunchActivity launchActivity2 = LaunchActivity.this;
                    if (i17 != i3) {
                        launchActivity2.O0(i17);
                    }
                    launchActivity2.B0(i17, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z10, num, l10, l11, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z11, str22, 1, i11, str23, str24, str25, str26, str27, bVar, z12, i12, z13, i13, i14, str28, str29, z14, str30, z15, z16, z17, z18, z19, str31, num3, z20, bArr);
                }
            }).show();
            return;
        }
        final sf.b bVar2 = bVar;
        char c2 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        char c15 = 1;
        final int i17 = 0;
        if (str16 != null) {
            SparseArray sparseArray = org.telegram.messenger.hs.e().a;
            int i18 = org.telegram.messenger.hs.g4;
            if (sparseArray.indexOfKey(i18) >= 0) {
                org.telegram.messenger.hs.e().k(i18, str16);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
            s1Var2.S = M0;
            s1Var2.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131747775, str16));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            F0(alertDialog$Builder);
            return;
        }
        if (str17 != null) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            String M02 = org.telegram.messenger.bd.M0(2131753894, null);
            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder2.a;
            s1Var3.S = M02;
            s1Var3.U = org.telegram.messenger.bd.M0(2131753884, null);
            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            F0(alertDialog$Builder2);
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var4 = new org.telegram.ui.ActionBar.s1(3, this, null);
        final ly lyVar2 = new ly(23, bVar2, s1Var4);
        final int[] iArr2 = {0};
        if (str10 != null) {
            TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
            tL_contacts_importContactToken.token = str10;
            final int i19 = 0;
            iArr2[0] = ConnectionsManager.getInstance(i3).sendRequest(tL_contacts_importContactToken, new RequestDelegate(this) { // from class: org.telegram.ui.d80
                public final /* synthetic */ LaunchActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i19) {
                        case 0:
                            String str32 = LaunchActivity.E1;
                            org.telegram.messenger.g0.h3(new k60(this.b, tLObject, i3, str10, tL_error, lyVar2));
                            break;
                        case 1:
                            String str33 = LaunchActivity.E1;
                            org.telegram.messenger.g0.h3(new ai.p1(this.b, tLObject, i3, str10, lyVar2, 22));
                            break;
                        default:
                            String str34 = LaunchActivity.E1;
                            org.telegram.messenger.g0.h3(new k60(this.b, tL_error, tLObject, i3, str10, lyVar2));
                            break;
                    }
                }
            });
        } else {
            if (str11 != null) {
                TL_chatlists.TL_chatlists_checkChatlistInvite tL_chatlists_checkChatlistInvite = new TL_chatlists.TL_chatlists_checkChatlistInvite();
                tL_chatlists_checkChatlistInvite.slug = str11;
                final int i20 = 1;
                launchActivity = this;
                iArr2[0] = ConnectionsManager.getInstance(i3).sendRequest(tL_chatlists_checkChatlistInvite, new RequestDelegate(this) { // from class: org.telegram.ui.d80
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i20) {
                            case 0:
                                String str32 = LaunchActivity.E1;
                                org.telegram.messenger.g0.h3(new k60(this.b, tLObject, i3, str11, tL_error, lyVar2));
                                break;
                            case 1:
                                String str33 = LaunchActivity.E1;
                                org.telegram.messenger.g0.h3(new ai.p1(this.b, tLObject, i3, str11, lyVar2, 22));
                                break;
                            default:
                                String str34 = LaunchActivity.E1;
                                org.telegram.messenger.g0.h3(new k60(this.b, tL_error, tLObject, i3, str11, lyVar2));
                                break;
                        }
                    }
                });
            } else {
                launchActivity = this;
                if (str29 != null) {
                    org.telegram.messenger.q9 c16 = org.telegram.messenger.q9.c(launchActivity.P);
                    org.telegram.messenger.n10 n10Var = new org.telegram.messenger.n10(launchActivity) { // from class: org.telegram.ui.e80
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.messenger.n10
                        public final void a(Object obj, Object obj2) {
                            org.telegram.messenger.m9 b10;
                            int i21 = i17;
                            ly lyVar3 = lyVar2;
                            switch (i21) {
                                case 0:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity2 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.k5.o(null, 2131749824, org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity2.e0)), R.raw.error, 36);
                                    } else {
                                        String str32 = LaunchActivity.E1;
                                        if (tL_StarGiftAuctionState != null && (b10 = org.telegram.messenger.q9.c(launchActivity2.P).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                            new ci.p1(launchActivity2, null, launchActivity2.P, b10.d.title, b10.h, false).show();
                                        }
                                    }
                                    try {
                                        lyVar3.run();
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
                                        org.telegram.messenger.k5.o(null, 2131749824, org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity3.e0)), R.raw.error, 36);
                                    } else {
                                        String str33 = LaunchActivity.E1;
                                        if (tL_StarGiftAuctionState2 != null) {
                                            ai.s0.e1(launchActivity3, null, launchActivity3.P, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                        }
                                    }
                                    try {
                                        lyVar3.run();
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
                    iArr2[0] = c16.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new c3.b(c15 == true ? 1 : 0), new org.telegram.messenger.x3(c14 == true ? 1 : 0, c16, n10Var));
                } else if (str28 != null) {
                    org.telegram.messenger.q9 c17 = org.telegram.messenger.q9.c(launchActivity.P);
                    final char c18 = c13 == true ? 1 : 0;
                    org.telegram.messenger.n10 n10Var2 = new org.telegram.messenger.n10(launchActivity) { // from class: org.telegram.ui.e80
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.messenger.n10
                        public final void a(Object obj, Object obj2) {
                            org.telegram.messenger.m9 b10;
                            int i21 = c18;
                            ly lyVar3 = lyVar2;
                            switch (i21) {
                                case 0:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity2 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.k5.o(null, 2131749824, org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity2.e0)), R.raw.error, 36);
                                    } else {
                                        String str32 = LaunchActivity.E1;
                                        if (tL_StarGiftAuctionState != null && (b10 = org.telegram.messenger.q9.c(launchActivity2.P).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                            new ci.p1(launchActivity2, null, launchActivity2.P, b10.d.title, b10.h, false).show();
                                        }
                                    }
                                    try {
                                        lyVar3.run();
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
                                        org.telegram.messenger.k5.o(null, 2131749824, org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity3.e0)), R.raw.error, 36);
                                    } else {
                                        String str33 = LaunchActivity.E1;
                                        if (tL_StarGiftAuctionState2 != null) {
                                            ai.s0.e1(launchActivity3, null, launchActivity3.P, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                        }
                                    }
                                    try {
                                        lyVar3.run();
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
                    iArr2[0] = c17.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState2, new c3.b(c12 == true ? 1 : 0), new org.telegram.messenger.x3(c11 == true ? 1 : 0, c17, n10Var2));
                } else if (str19 != null) {
                    TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                    getuniquestargift.slug = str19;
                    final int i21 = 2;
                    iArr2[0] = ConnectionsManager.getInstance(i3).sendRequest(getuniquestargift, new RequestDelegate(launchActivity) { // from class: org.telegram.ui.d80
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i21) {
                                case 0:
                                    String str32 = LaunchActivity.E1;
                                    org.telegram.messenger.g0.h3(new k60(this.b, tLObject, i3, str19, tL_error, lyVar2));
                                    break;
                                case 1:
                                    String str33 = LaunchActivity.E1;
                                    org.telegram.messenger.g0.h3(new ai.p1(this.b, tLObject, i3, str19, lyVar2, 22));
                                    break;
                                default:
                                    String str34 = LaunchActivity.E1;
                                    org.telegram.messenger.g0.h3(new k60(this.b, tL_error, tLObject, i3, str19, lyVar2));
                                    break;
                            }
                        }
                    });
                } else if (str18 != null) {
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                    tL_inputInvoiceSlug.slug = str18;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                    iArr2[0] = ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getPaymentForm, new cg.j0(this, tL_inputInvoiceSlug, lyVar2, i3, str18, 12));
                } else {
                    if (str == null) {
                        String str32 = str3;
                        if (str2 == null) {
                            lyVar = null;
                            ArrayList arrayList = this.e0;
                            if (str32 != null) {
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = str32;
                                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
                                if (d2Var instanceof wm) {
                                    wm wmVar = (wm) d2Var;
                                    xv0Var = new org.telegram.ui.Components.xv0(this, d2Var, tL_inputStickerSetShortName, null, (wmVar.d1.getVisibility() == 0 || !((chat = wmVar.e) == null || org.telegram.messenger.t3.t(chat))) ? null : wmVar.a0, wmVar.getResourceProvider());
                                    boolean T9 = wmVar.T9();
                                    xv0Var.i0 = T9;
                                    xv0Var.n = T9;
                                } else {
                                    xv0Var = new org.telegram.ui.Components.xv0(this, d2Var, tL_inputStickerSetShortName, null, null, null);
                                }
                                xv0Var.I1 = str4 != null;
                                d2Var.showDialog(xv0Var);
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
                                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
                                if (d2Var2 instanceof wm) {
                                    wm wmVar2 = (wm) d2Var2;
                                    puVar = new org.telegram.ui.Components.pu(d2Var2, this, wmVar2.getResourceProvider(), arrayList2);
                                    boolean T92 = wmVar2.T9();
                                    puVar.i0 = T92;
                                    puVar.n = T92;
                                } else {
                                    puVar = new org.telegram.ui.Components.pu(d2Var2, this, null, arrayList2);
                                }
                                d2Var2.showDialog(puVar);
                                return;
                            }
                            if (str9 != null) {
                                uw uwVar = new uw(org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true));
                                i16 = i3;
                                uwVar.D2 = new zf(this, z10, i16, str9);
                                i15 = 0;
                                u0(uwVar, false, true);
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
                                    iArr2[0] = ConnectionsManager.getInstance(i3).sendRequest(getauthorizationform, new u60(this, iArr2, i3, lyVar2, getauthorizationform, str33, str34, str35, 1));
                                } else if (str15 != null) {
                                    TLRPC.TL_help_getDeepLinkInfo tL_help_getDeepLinkInfo = new TLRPC.TL_help_getDeepLinkInfo();
                                    tL_help_getDeepLinkInfo.path = str15;
                                    iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(tL_help_getDeepLinkInfo, new RequestDelegate(this) { // from class: org.telegram.ui.c80
                                        public final /* synthetic */ LaunchActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i15) {
                                                case 0:
                                                    String str36 = LaunchActivity.E1;
                                                    org.telegram.messenger.g0.h3(new pp(this.b, lyVar2, tLObject, 14));
                                                    break;
                                                default:
                                                    String str37 = LaunchActivity.E1;
                                                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60((Object) this.b, (Object) lyVar2, (Object) tLObject, tL_error, 18));
                                                    break;
                                            }
                                        }
                                    });
                                } else if (str14 != null) {
                                    TLRPC.TL_langpack_getLanguage tL_langpack_getLanguage = new TLRPC.TL_langpack_getLanguage();
                                    tL_langpack_getLanguage.lang_code = str14;
                                    tL_langpack_getLanguage.lang_pack = "android";
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.P);
                                    final char c19 = c10 == true ? 1 : 0;
                                    iArr2[0] = connectionsManager.sendRequest(tL_langpack_getLanguage, new RequestDelegate(this) { // from class: org.telegram.ui.c80
                                        public final /* synthetic */ LaunchActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (c19) {
                                                case 0:
                                                    String str36 = LaunchActivity.E1;
                                                    org.telegram.messenger.g0.h3(new pp(this.b, lyVar2, tLObject, 14));
                                                    break;
                                                default:
                                                    String str37 = LaunchActivity.E1;
                                                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60((Object) this.b, (Object) lyVar2, (Object) tLObject, tL_error, 18));
                                                    break;
                                            }
                                        }
                                    });
                                } else if (tL_wallPaper != null) {
                                    if (TextUtils.isEmpty(tL_wallPaper.slug)) {
                                        try {
                                            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                                            int i22 = wallPaperSettings.third_background_color;
                                            org.telegram.messenger.g0.h3(new ly(21, this, new l71(i22 != 0 ? new kc1("c", wallPaperSettings.background_color, wallPaperSettings.second_background_color, i22, wallPaperSettings.fourth_background_color) : new kc1(wallPaperSettings.background_color, wallPaperSettings.second_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), "c"), null, true)));
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                    }
                                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                    tL_inputWallPaperSlug.slug = tL_wallPaper.slug;
                                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                    iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(getwallpaper, new y9(this, lyVar2, tL_wallPaper, 16));
                                } else {
                                    if (str20 != null) {
                                        ly lyVar3 = new ly(22, this, bVar2);
                                        TL_account.getTheme gettheme = new TL_account.getTheme();
                                        gettheme.format = "android";
                                        TLRPC.TL_inputThemeSlug tL_inputThemeSlug = new TLRPC.TL_inputThemeSlug();
                                        tL_inputThemeSlug.slug = str20;
                                        gettheme.theme = tL_inputThemeSlug;
                                        s1Var = s1Var4;
                                        iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(gettheme, new y9(this, s1Var, lyVar2, 17));
                                        i16 = i3;
                                        lyVar = lyVar3;
                                    } else {
                                        s1Var = s1Var4;
                                        if (l10 == null || (num == null && !z14)) {
                                            i16 = i3;
                                            iArr = iArr2;
                                            if (str30 != null) {
                                                TL_account.resolveBusinessChatLink resolvebusinesschatlink = new TL_account.resolveBusinessChatLink();
                                                resolvebusinesschatlink.slug = str30;
                                                ConnectionsManager.getInstance(this.P).sendRequest(resolvebusinesschatlink, new t70(this, c2 == true ? 1 : 0));
                                            }
                                        } else {
                                            if (l11 != null) {
                                                TLRPC.Chat M03 = org.telegram.messenger.hp.s1(i3).M0(l10);
                                                if (M03 != null) {
                                                    iArr2[0] = z0(i3, lyVar2, num, num2, l11, num3, null, M03, null, null, 0, -1);
                                                } else {
                                                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                                                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                                                    tL_inputChannel.channel_id = l10.longValue();
                                                    tL_channels_getChannels.id.add(tL_inputChannel);
                                                    iArr2[0] = ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getChannels, new u60(this, iArr2, i3, lyVar2, num, num2, l11, num3, 2));
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
                                                TLRPC.Chat M04 = org.telegram.messenger.hp.s1(this.P).M0(l10);
                                                if (M04 != null && org.telegram.messenger.t3.R(M04) && z14) {
                                                    w0(Long.valueOf(-l10.longValue()), lyVar2, bVar2, null);
                                                } else if (M04 == null || !M04.forum) {
                                                    org.telegram.ui.ActionBar.d2 d2Var3 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList) : null;
                                                    if (d2Var3 == null || org.telegram.messenger.hp.s1(i3).E(bundle, d2Var3, null, null)) {
                                                        iArr = iArr2;
                                                        i16 = i3;
                                                        org.telegram.messenger.g0.h3(new c70(this, bundle, l10, iArr2, lyVar2, z14, bVar2, l11, num, num3, bArr, d2Var3, i3));
                                                    }
                                                } else {
                                                    l0(-l10.longValue(), num, null, num3, bArr, new t60(lyVar2, 2), 0, -1);
                                                }
                                            }
                                            i16 = i3;
                                        }
                                    }
                                    iArr = iArr2;
                                }
                                i16 = i3;
                            }
                            iArr = iArr2;
                            s1Var = s1Var4;
                        } else if (i10 == 0) {
                            TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                            tL_messages_checkChatInvite.hash = str2;
                            iArr2[0] = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_checkChatInvite, new cg.j0(this, i3, s1Var4, lyVar2, str2, 13), 2);
                            i16 = i3;
                            iArr = iArr2;
                            s1Var = s1Var4;
                            i15 = 0;
                        } else {
                            if (i10 == 1) {
                                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                tL_messages_importChatInvite.hash = str2;
                                lyVar = null;
                                ConnectionsManager.getInstance(i3).sendRequestTyped(tL_messages_importChatInvite, null, new wf(this, lyVar2, i3), 2);
                            } else {
                                lyVar = null;
                            }
                            i16 = i3;
                            iArr = iArr2;
                            s1Var = s1Var4;
                            i15 = 0;
                        }
                        if (iArr[i15] == 0) {
                            s1Var.setOnCancelListener(new org.telegram.ui.Components.n1(i16, iArr, lyVar));
                            if (bVar2 != null) {
                                bVar2.b = new org.telegram.ui.Components.u2(i16, iArr, lyVar);
                            }
                            try {
                                if (bVar2 != null) {
                                    bVar2.d();
                                } else {
                                    s1Var.r(300L);
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
                    org.telegram.messenger.k10 d22 = org.telegram.messenger.hp.s1(i3).d2();
                    i16 = i3;
                    org.telegram.messenger.u10 u10Var = new org.telegram.messenger.u10() { // from class: org.telegram.ui.f80
                        /* JADX WARN: Can't wrap try/catch for region: R(6:59|(4:(2:63|(9:66|(3:68|(2:70|(4:72|(2:74|(2:76|77)(1:78))|79|80)(1:81))(1:359)|82)(1:360)|83|(2:85|(2:87|88))(1:358)|(3:90|(1:94)|95)(4:(2:117|(4:127|128|(8:130|(3:132|(1:160)(1:136)|137)(2:161|(1:166)(1:165))|138|(2:150|(2:155|(1:159))(1:154))(1:142)|143|(1:145)|146|(1:148))(1:(3:324|325|(4:347|348|349|(2:351|352)(1:354))(7:331|(1:333)(1:346)|334|(1:336)(1:345)|337|(2:339|(1:341)(1:343))(1:344)|342))(17:169|(3:171|(2:173|(2:175|(2:177|178)(1:179))(1:315))|316)(3:317|(3:319|(1:321)|322)|323)|(1:314)(1:184)|185|(1:187)(1:313)|(3:189|(1:191)|(1:193))|194|(1:196)|197|(1:199)|(1:201)|(1:203)|(1:205)(1:312)|(1:207)(1:311)|208|(1:310)(1:211)|(3:215|(1:309)(1:219)|(1:(2:254|(5:290|291|292|293|(1:305)(5:295|(1:297)(1:304)|(2:299|(1:301))|302|303))(1:(5:283|(1:285)(1:289)|286|287|288)(2:(1:282)(1:262)|(8:268|(1:270)|271|(1:273)|274|275|276|278)(2:266|267))))(1:253))(12:222|(1:224)|225|(1:232)|233|(1:235)|236|237|(3:239|(3:241|242|243)(1:245)|244)|246|247|(1:249)(1:250)))))|149)(2:123|(1:126)(1:125)))(4:106|(1:116)(2:110|(2:112|113)(1:114))|115|113)|97|98|100)|96|97|98|100))|97|98|100)|373|374|375|(7:377|(1:379)|380|381|382|383|(1:385)(1:386))) */
                        /* JADX WARN: Code restructure failed: missing block: B:389:0x0a16, code lost:
                        
                            r0 = move-exception;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:391:0x0a4a, code lost:
                        
                            org.telegram.messenger.a8.g(r0, true);
                         */
                        /* JADX WARN: Type inference failed for: r15v14 */
                        /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.String, org.telegram.ui.ActionBar.e6] */
                        /* JADX WARN: Type inference failed for: r15v16 */
                        @Override // org.telegram.messenger.u10
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void a(Object obj) {
                            boolean z21;
                            boolean z22;
                            Long l12;
                            final int i23;
                            String str36;
                            String str37;
                            boolean z23;
                            final Long l13;
                            final Long l14;
                            final HashMap hashMap2;
                            String str38;
                            final String str39;
                            TLRPC.TL_wallPaper tL_wallPaper2;
                            int i24;
                            int i25;
                            final String str40;
                            final String str41;
                            sf.b bVar3;
                            boolean z24;
                            final boolean z25;
                            final boolean z26;
                            final String str42;
                            ly lyVar4;
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
                            final int i26;
                            LaunchActivity launchActivity3;
                            String str50;
                            String str51;
                            String str52;
                            int i27;
                            String str53;
                            String str54;
                            int i28;
                            boolean z27;
                            byte[] bArr3;
                            long j10;
                            boolean z28;
                            boolean z29;
                            String str55;
                            String str56;
                            gx x10;
                            ArrayList<org.telegram.ui.ActionBar.z1> arrayList3;
                            boolean z30;
                            boolean z31;
                            boolean z32;
                            ?? r15;
                            org.telegram.ui.Components.fc a02;
                            int i29;
                            final Long l16 = (Long) obj;
                            final LaunchActivity launchActivity4 = LaunchActivity.this;
                            ArrayList arrayList4 = launchActivity4.e0;
                            ly lyVar5 = lyVar2;
                            if (l16 != null && l16.longValue() == Long.MAX_VALUE) {
                                try {
                                    lyVar5.run();
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, launchActivity4, null);
                                String M05 = org.telegram.messenger.bd.M0(2131754348, null);
                                org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder3.a;
                                s1Var5.S = M05;
                                s1Var5.U = org.telegram.messenger.bd.M0(2131754349, null);
                                k2.p1.v(null, 2131747839, alertDialog$Builder3, null);
                                return;
                            }
                            if (launchActivity4.isFinishing()) {
                                return;
                            }
                            final boolean z33 = z13;
                            if (z33 && l16 != null) {
                                ei.z6 P1 = org.telegram.messenger.hp.s1(launchActivity4.P).P1();
                                long longValue2 = l16.longValue();
                                p60 p60Var = new p60(launchActivity4, lyVar5, l16, 0);
                                int i30 = P1.a;
                                TL_stories.PeerStories y9 = P1.y(longValue2);
                                if (y9 != null) {
                                    for (int i31 = 0; i31 < y9.stories.size(); i31++) {
                                        if ((y9.stories.get(i31).media instanceof TLRPC.TL_messageMediaVideoStream) && !(y9.stories.get(i31) instanceof TL_stories.TL_storyItemSkipped)) {
                                            p60Var.a(y9.stories.get(i31));
                                            return;
                                        }
                                    }
                                }
                                long j11 = ((-93321425) + longValue2) << 12;
                                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) P1.E.f(j11);
                                if (storyItem != null) {
                                    p60Var.a(storyItem);
                                    return;
                                }
                                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                                tL_stories_getPeerStories.peer = org.telegram.messenger.hp.s1(i30).j1(longValue2);
                                ConnectionsManager.getInstance(i30).sendRequest(tL_stories_getPeerStories, new ei.h6(P1, j11, p60Var));
                                return;
                            }
                            final int i32 = i12;
                            if (i32 != 0 && l16 != null) {
                                org.telegram.messenger.hp.s1(launchActivity4.P).P1().g0(i32, l16.longValue(), new p60(launchActivity4, lyVar5, l16, 1));
                                return;
                            }
                            final int i33 = i13;
                            if (i33 != 0 && l16 != null) {
                                ei.z6 P12 = org.telegram.messenger.hp.s1(launchActivity4.P).P1();
                                long longValue3 = l16.longValue();
                                ci.w9 w9Var = new ci.w9(launchActivity4, lyVar5, l16, i33);
                                int i34 = P12.a;
                                ei.n6 B = P12.B(longValue3, false);
                                if (B != null) {
                                    ei.s6 b10 = B.b(i33);
                                    if (b10 != null) {
                                        TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                                        tL_storyAlbum.album_id = b10.a;
                                        tL_storyAlbum.title = b10.b;
                                        tL_storyAlbum.icon_photo = b10.c;
                                        tL_storyAlbum.icon_video = b10.d;
                                        w9Var.a(tL_storyAlbum);
                                        return;
                                    }
                                    if (B.f) {
                                        w9Var.a(null);
                                        return;
                                    }
                                }
                                TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
                                tL_getAlbums.peer = org.telegram.messenger.hp.s1(i34).j1(longValue3);
                                ConnectionsManager.getInstance(i34).sendRequest(tL_getAlbums, new ci.a2(i33, w9Var));
                                return;
                            }
                            final ly lyVar6 = lyVar5;
                            final String str57 = str;
                            try {
                                if (l16 != null && launchActivity4.r0 != null) {
                                    final String str58 = str13;
                                    final String str59 = str21;
                                    final boolean z34 = z11;
                                    final String str60 = str22;
                                    if ((str58 == null && str59 == null) || ((str58 != null && l16.longValue() > 0) || ((str59 != null && l16.longValue() > 0) || ((z34 && l16.longValue() < 0) || (str60 != null && l16.longValue() < 0))))) {
                                        final String str61 = str26;
                                        boolean isEmpty = TextUtils.isEmpty(str61);
                                        int i35 = i16;
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
                                        final int i36 = i10;
                                        final int i37 = i11;
                                        final String str80 = str23;
                                        final String str81 = str24;
                                        final String str82 = str25;
                                        final sf.b bVar4 = bVar2;
                                        final boolean z36 = z12;
                                        final int i38 = i14;
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
                                            i23 = i35;
                                            str36 = str57;
                                            str37 = str58;
                                            z23 = z35;
                                            l13 = l17;
                                            l14 = l18;
                                            hashMap2 = hashMap3;
                                            str38 = str74;
                                            str39 = str76;
                                            tL_wallPaper2 = tL_wallPaper3;
                                            i24 = i36;
                                            i25 = i37;
                                            str40 = str81;
                                            str41 = str82;
                                            bVar3 = bVar4;
                                            z24 = z40;
                                            z25 = z41;
                                            z26 = z42;
                                            str42 = str86;
                                            lyVar4 = lyVar6;
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
                                            final TLRPC.User a22 = org.telegram.messenger.hp.s1(i35).a2(l16);
                                            if (a22 != null) {
                                                i23 = i35;
                                                if (a22.bot) {
                                                    if (a22.bot_attach_menu) {
                                                        if (!org.telegram.messenger.li.b0(i23).j(a22.id)) {
                                                            TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                                                            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i23);
                                                            tL_messages_getAttachMenuBot.bot = s12.q1(s12.a2(l16));
                                                            ConnectionsManager.getInstance(i23).sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() { // from class: org.telegram.ui.q60
                                                                @Override // org.telegram.tgnet.RequestDelegate
                                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                                    String str88 = LaunchActivity.E1;
                                                                    final LaunchActivity launchActivity5 = LaunchActivity.this;
                                                                    final int i39 = i23;
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
                                                                    final int i40 = i36;
                                                                    final int i41 = i37;
                                                                    final String str111 = str80;
                                                                    final String str112 = str81;
                                                                    final String str113 = str82;
                                                                    final sf.b bVar5 = bVar4;
                                                                    final boolean z46 = z36;
                                                                    final int i42 = i32;
                                                                    final boolean z47 = z33;
                                                                    final int i43 = i33;
                                                                    final int i44 = i38;
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
                                                                    final TLRPC.User user = a22;
                                                                    final ly lyVar7 = lyVar6;
                                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.x60
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            final String str120;
                                                                            ly lyVar8;
                                                                            sf.b bVar6;
                                                                            TLRPC.User user2;
                                                                            final String str121;
                                                                            final boolean z55;
                                                                            final int i45;
                                                                            final int i46;
                                                                            final TLRPC.TL_attachMenuBot tL_attachMenuBot;
                                                                            int i47;
                                                                            String str122 = LaunchActivity.E1;
                                                                            final LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            final int i48 = i39;
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
                                                                            final int i49 = i40;
                                                                            final int i50 = i41;
                                                                            final String str145 = str111;
                                                                            final String str146 = str112;
                                                                            final String str147 = str113;
                                                                            final sf.b bVar7 = bVar5;
                                                                            final boolean z58 = z46;
                                                                            final int i51 = i42;
                                                                            final int i52 = i43;
                                                                            final int i53 = i44;
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
                                                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.i70
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        String str152 = LaunchActivity.E1;
                                                                                        LaunchActivity.this.B0(i48, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z56, num12, l22, l23, num13, str135, hashMap5, str136, str137, str138, str139, tL_wallPaper5, str140, str141, str142, str143, z57, str144, i49, i50, str145, str146, str147, null, null, bVar7, z58, i51, z66, i52, i53, str150, str151, z59, str148, z60, z61, z62, z63, z64, str149, num14, z65, bArr6);
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
                                                                                final ly lyVar9 = lyVar7;
                                                                                if (!z68 && !tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                                                                    str120 = str152;
                                                                                    lyVar8 = lyVar9;
                                                                                } else if (z69) {
                                                                                    rc1.a(launchActivity6, new org.telegram.messenger.u10() { // from class: org.telegram.ui.j70
                                                                                        @Override // org.telegram.messenger.u10
                                                                                        public final void a(Object obj2) {
                                                                                            String str154 = LaunchActivity.E1;
                                                                                            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                                                                                            tL_attachMenuBot3.inactive = false;
                                                                                            tL_attachMenuBot3.request_write_access = false;
                                                                                            TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                            int i54 = i48;
                                                                                            org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i54);
                                                                                            Long l25 = l24;
                                                                                            l25.getClass();
                                                                                            tL_messages_toggleBotInAttachMenu.bot = s13.q1(s13.a2(l25));
                                                                                            tL_messages_toggleBotInAttachMenu.enabled = true;
                                                                                            tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                                                                            ConnectionsManager.getInstance(i54).sendRequest(tL_messages_toggleBotInAttachMenu, new ii.g2(i54, 5), 66);
                                                                                            LaunchActivity.this.x0(i54, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z56, num12, l22, l23, num13, str135, hashMap5, str136, str137, str138, str139, tL_wallPaper5, str140, str141, str142, str143, z57, str144, i49, i50, str145, str146, str147, str152, str153, bVar7, z58, i51, i52, i53, z59, str148, user3, lyVar9, z69, true, z60, z61, z62, z63, z64, str149, z65);
                                                                                        }
                                                                                    }, bVar7 != null ? new fz(bVar7, 15) : null);
                                                                                    return;
                                                                                } else {
                                                                                    str120 = str152;
                                                                                    lyVar8 = lyVar9;
                                                                                }
                                                                                if (tL_attachMenuBot2.request_write_access) {
                                                                                    bVar6 = bVar7;
                                                                                    user2 = user3;
                                                                                    str121 = str148;
                                                                                    z55 = z59;
                                                                                    i45 = i53;
                                                                                    i46 = i52;
                                                                                    tL_attachMenuBot = tL_attachMenuBot2;
                                                                                    i47 = i48;
                                                                                } else {
                                                                                    if (!z58) {
                                                                                        launchActivity6.x0(i48, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z56, num12, l22, l23, num13, str135, hashMap5, str136, str137, str138, str139, tL_wallPaper5, str140, str141, str142, str143, z57, str144, i49, i50, str145, str146, str147, str120, str153, bVar7, z58, i51, i52, i53, z59, str148, user3, lyVar8, false, false, z60, z61, z62, z63, z64, str149, z65);
                                                                                        return;
                                                                                    }
                                                                                    bVar6 = bVar7;
                                                                                    user2 = user3;
                                                                                    str121 = str148;
                                                                                    z55 = z59;
                                                                                    i45 = i53;
                                                                                    i46 = i52;
                                                                                    tL_attachMenuBot = tL_attachMenuBot2;
                                                                                    i47 = i48;
                                                                                }
                                                                                final ly lyVar10 = lyVar8;
                                                                                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                                                                                final TLRPC.User user4 = user2;
                                                                                final int i54 = i47;
                                                                                final sf.b bVar8 = bVar6;
                                                                                org.telegram.ui.Components.t4.m(LaunchActivity.Q(), atomicBoolean, user4, new Runnable() { // from class: org.telegram.ui.k70
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        String str154 = LaunchActivity.E1;
                                                                                        LaunchActivity launchActivity7 = LaunchActivity.this;
                                                                                        int i55 = launchActivity7.P;
                                                                                        Long l25 = l24;
                                                                                        org.telegram.messenger.b6.n(i55, l25.longValue());
                                                                                        TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot;
                                                                                        tL_attachMenuBot3.inactive = false;
                                                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                        tL_attachMenuBot3.request_write_access = !atomicBoolean2.get();
                                                                                        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                        int i56 = i54;
                                                                                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i56);
                                                                                        tL_messages_toggleBotInAttachMenu.bot = s13.q1(s13.a2(l25));
                                                                                        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean2.get();
                                                                                        ConnectionsManager.getInstance(i56).sendRequest(tL_messages_toggleBotInAttachMenu, new ii.g2(i56, 6), 66);
                                                                                        launchActivity7.x0(i56, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, z56, num12, l22, l23, num13, str135, hashMap5, str136, str137, str138, str139, tL_wallPaper5, str140, str141, str142, str143, z57, str144, i49, i50, str145, str146, str147, str120, str153, bVar8, z58, i51, i46, i45, z55, str121, user4, lyVar10, false, false, z60, z61, z62, z63, z64, str149, z65);
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
                                                    launchActivity4.x0(i23, str57, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, z35, num6, l17, l18, num7, str58, hashMap3, str73, str74, str75, str76, tL_wallPaper3, str77, str78, str79, str59, z34, str60, i36, i37, str80, str81, str82, str61, str87, bVar4, z36, i32, i33, i38, z37, str85, a22, lyVar6, false, false, z38, z39, z40, z41, z42, str86, z43);
                                                    return;
                                                }
                                                l12 = l16;
                                            } else {
                                                l12 = l16;
                                                i23 = i35;
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
                                            i24 = i36;
                                            str47 = str80;
                                            str40 = str81;
                                            bVar3 = bVar4;
                                            z24 = z40;
                                            z25 = z41;
                                            z26 = z42;
                                            str42 = str86;
                                            lyVar4 = lyVar6;
                                            bArr2 = bArr4;
                                            str43 = str87;
                                            z23 = z35;
                                            l14 = l18;
                                            hashMap2 = hashMap3;
                                            tL_wallPaper2 = tL_wallPaper3;
                                            i25 = i37;
                                            str41 = str82;
                                        }
                                        if (z37) {
                                            str48 = str63;
                                            str49 = str64;
                                            if (org.telegram.messenger.t3.R(org.telegram.messenger.hp.s1(i23).M0(Long.valueOf(-l12.longValue())))) {
                                                launchActivity2.w0(l12, lyVar4, bVar3, null);
                                                return;
                                            }
                                        } else {
                                            str48 = str63;
                                            str49 = str64;
                                        }
                                        if (str43 == null) {
                                            if (str47 != null && str40 == null) {
                                                TLRPC.User a23 = org.telegram.messenger.hp.s1(i23).a2(l12);
                                                if (a23 == null || !a23.bot) {
                                                    z32 = true;
                                                    r15 = 0;
                                                    a02 = org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList4));
                                                    i29 = 2131752986;
                                                } else if (a23.bot_attach_menu) {
                                                    long longValue4 = l12.longValue();
                                                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot2 = new TLRPC.TL_messages_getAttachMenuBot();
                                                    org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i23);
                                                    tL_messages_getAttachMenuBot2.bot = s13.q1(s13.a2(l12));
                                                    ConnectionsManager.getInstance(i23).sendRequest(tL_messages_getAttachMenuBot2, new ii.x0(launchActivity2, i23, str43, str41, a23, str47, longValue4));
                                                    z32 = true;
                                                    lyVar6 = lyVar4;
                                                    z21 = z32;
                                                } else {
                                                    z32 = true;
                                                    a02 = org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList4));
                                                    i29 = 2131753109;
                                                    r15 = 0;
                                                }
                                                org.telegram.messenger.k5.p(r15, i29, a02, r15);
                                                lyVar6 = lyVar4;
                                                z21 = z32;
                                            } else if (num4 == null || ((num5 == null && l14 == null) || l12.longValue() >= 0)) {
                                                final String str88 = str48;
                                                final sf.b bVar5 = bVar3;
                                                int i39 = i23;
                                                final String str89 = str44;
                                                final ly lyVar7 = lyVar4;
                                                final LaunchActivity launchActivity5 = launchActivity2;
                                                if (str37 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putBoolean("onlySelect", true);
                                                    bundle2.putBoolean("cantSendToChannels", true);
                                                    bundle2.putInt("dialogsType", 1);
                                                    bundle2.putString("selectAlertString", org.telegram.messenger.bd.M0(2131745634, null));
                                                    bundle2.putString("selectAlertStringGroup", org.telegram.messenger.bd.M0(2131745635, null));
                                                    uw uwVar2 = new uw(bundle2);
                                                    uwVar2.D2 = new r60(launchActivity5, str37, i39, org.telegram.messenger.hp.s1(i39).a2(l12));
                                                    if (org.telegram.messenger.g0.Q1()) {
                                                        z31 = !launchActivity5.s0.getFragmentStack().isEmpty() && (launchActivity5.s0.getFragmentStack().get(launchActivity5.s0.getFragmentStack().size() + (-1)) instanceof ee0);
                                                        z30 = true;
                                                    } else {
                                                        z30 = true;
                                                        z31 = launchActivity5.r0.getFragmentStack().size() > 1 && (launchActivity5.r0.getFragmentStack().get(launchActivity5.r0.getFragmentStack().size() - 1) instanceof ee0);
                                                    }
                                                    ((ActionBarLayout) launchActivity5.M()).V(uwVar2, z31, z30);
                                                    if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                                                        SecretMediaViewer.f().e(false, false);
                                                    } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                                                        PhotoViewer.v1().H0(false, true);
                                                    } else if (i4.G() && i4.v().W) {
                                                        i4.v().m(false, true);
                                                    }
                                                    gi.va.w();
                                                    x30 x30Var = x30.v5;
                                                    if (x30Var != null) {
                                                        x30Var.dismiss();
                                                    }
                                                    if (org.telegram.messenger.g0.Q1()) {
                                                        launchActivity5.r0.X(true, true);
                                                        launchActivity5.t0.X(true, true);
                                                    }
                                                } else if (str66 == null && str67 == null) {
                                                    final boolean z44 = z23;
                                                    Bundle bundle3 = new Bundle();
                                                    TLRPC.User a24 = org.telegram.messenger.hp.s1(i39).a2(l12);
                                                    final String str90 = str37;
                                                    if (l12.longValue() < 0) {
                                                        i26 = i39;
                                                        final TLRPC.Chat M06 = org.telegram.messenger.hp.s1(i39).M0(Long.valueOf(-l12.longValue()));
                                                        if (z43) {
                                                            if (M06.linked_monoforum_id == 0) {
                                                                lyVar7 = lyVar7;
                                                            } else {
                                                                if (org.telegram.messenger.hp.s1(i26).M0(Long.valueOf(M06.linked_monoforum_id)) == null) {
                                                                    TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                                                                    tL_channels_getFullChannel.channel = org.telegram.messenger.hp.i1(M06);
                                                                    final boolean z45 = z24;
                                                                    final String str91 = str49;
                                                                    final String str92 = str36;
                                                                    final String str93 = str47;
                                                                    final int i40 = i25;
                                                                    final int i41 = i24;
                                                                    final String str94 = str46;
                                                                    final TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper2;
                                                                    final String str95 = str38;
                                                                    ConnectionsManager.getInstance(i26).sendRequest(tL_channels_getFullChannel, new RequestDelegate() { // from class: org.telegram.ui.s60
                                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                                            String str96 = LaunchActivity.E1;
                                                                            final LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                            final int i42 = i26;
                                                                            final TLRPC.Chat chat2 = M06;
                                                                            final ly lyVar8 = lyVar7;
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
                                                                            final int i43 = i41;
                                                                            final int i44 = i40;
                                                                            final String str119 = str93;
                                                                            final String str120 = str40;
                                                                            final String str121 = str41;
                                                                            final String str122 = str61;
                                                                            final String str123 = str43;
                                                                            final sf.b bVar6 = bVar5;
                                                                            final boolean z48 = z36;
                                                                            final int i45 = i32;
                                                                            final boolean z49 = z33;
                                                                            final int i46 = i33;
                                                                            final int i47 = i38;
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
                                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.a70
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    String str128 = LaunchActivity.E1;
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    boolean z57 = tLObject2 instanceof TLRPC.TL_messages_chatFull;
                                                                                    ly lyVar9 = lyVar8;
                                                                                    if (!z57) {
                                                                                        try {
                                                                                            lyVar9.run();
                                                                                            return;
                                                                                        } catch (Exception e12) {
                                                                                            org.telegram.messenger.a8.g(e12, true);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject2;
                                                                                    int i48 = i42;
                                                                                    org.telegram.messenger.hp.s1(i48).Y3(tL_messages_chatFull.users, false);
                                                                                    org.telegram.messenger.hp.s1(i48).S3(tL_messages_chatFull.chats, false);
                                                                                    org.telegram.messenger.qr.a0(i48).m1(tL_messages_chatFull.users, tL_messages_chatFull.chats, false, true);
                                                                                    if (org.telegram.messenger.hp.s1(i48).M0(Long.valueOf(chat2.linked_monoforum_id)) != null) {
                                                                                        LaunchActivity.this.B0(i48, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, str108, z46, num9, l19, l20, num10, str109, hashMap4, str110, str111, str112, str113, tL_wallPaper5, str114, str115, str116, str117, z47, str118, i43, i44, str119, str120, str121, str122, str123, bVar6, z48, i45, z49, i46, i47, str124, str125, z50, str126, z51, z52, z53, z54, z55, str127, num11, z56, bArr5);
                                                                                        return;
                                                                                    }
                                                                                    try {
                                                                                        lyVar9.run();
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
                                                                lyVar7 = lyVar7;
                                                                str51 = str59;
                                                                str52 = str60;
                                                                i27 = i25;
                                                                str53 = str47;
                                                                str54 = str40;
                                                                i28 = i38;
                                                                z27 = z25;
                                                                bArr3 = bArr2;
                                                                launchActivity3 = launchActivity5;
                                                                str50 = str65;
                                                                bundle3.putLong("chat_id", M06.linked_monoforum_id);
                                                                j10 = -M06.linked_monoforum_id;
                                                            }
                                                        }
                                                        l15 = l12;
                                                        str50 = str65;
                                                        str51 = str59;
                                                        str52 = str60;
                                                        i27 = i25;
                                                        str53 = str47;
                                                        str54 = str40;
                                                        i28 = i38;
                                                        z27 = z25;
                                                        bArr3 = bArr2;
                                                        launchActivity3 = launchActivity5;
                                                        bundle3.putLong("chat_id", -l15.longValue());
                                                        j10 = l15.longValue();
                                                    } else {
                                                        l15 = l12;
                                                        i26 = i39;
                                                        launchActivity3 = launchActivity5;
                                                        str50 = str65;
                                                        String str96 = str89;
                                                        str51 = str59;
                                                        str52 = str60;
                                                        i27 = i25;
                                                        str53 = str47;
                                                        str54 = str40;
                                                        i28 = i38;
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
                                                        j10 = longValue5;
                                                    }
                                                    if (str50 == null || a24 == null || !a24.bot) {
                                                        z28 = false;
                                                    } else {
                                                        bundle3.putString("botUser", str50);
                                                        z28 = true;
                                                    }
                                                    if (launchActivity3.Z0) {
                                                        launchActivity3.Z0 = false;
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
                                                    if (i27 >= 0) {
                                                        bundle3.putInt("video_timestamp", i27);
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
                                                    org.telegram.ui.ActionBar.d2 d2Var4 = (arrayList4.isEmpty() || str51 != null) ? null : (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList4);
                                                    if (d2Var4 == null || org.telegram.messenger.hp.s1(i26).E(bundle3, d2Var4, null, null)) {
                                                        boolean z46 = (d2Var4 instanceof wm) && ((wm) d2Var4).a() == j10;
                                                        if (z29 && z46) {
                                                            ArrayList arrayList5 = new ArrayList();
                                                            ArrayList<org.telegram.ui.ActionBar.z1> arrayList6 = d2Var4.sheetsStack;
                                                            if (arrayList6 != null) {
                                                                arrayList5.addAll(arrayList6);
                                                            }
                                                            if ((d2Var4.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) d2Var4.getParentLayout()).x()) != null && x10 != d2Var4 && (arrayList3 = x10.sheetsStack) != null) {
                                                                arrayList5.addAll(arrayList3);
                                                            }
                                                            int size = arrayList5.size();
                                                            int i42 = 0;
                                                            while (i42 < size) {
                                                                Object obj2 = arrayList5.get(i42);
                                                                i42++;
                                                            }
                                                            ArrayList arrayList7 = new ArrayList(ii.a3.b1);
                                                            int size2 = arrayList7.size();
                                                            int i43 = 0;
                                                            while (i43 < size2) {
                                                                Object obj3 = arrayList7.get(i43);
                                                                i43++;
                                                                ii.a3 a3Var = (ii.a3) obj3;
                                                                if (a3Var.J == j10) {
                                                                    a3Var.o(true);
                                                                }
                                                            }
                                                            wm wmVar3 = (wm) d2Var4;
                                                            if (wmVar3.w8 != 0) {
                                                                wmVar3.getMessagesController().A4(str50, wmVar3.f);
                                                            } else {
                                                                wmVar3.d7 = true;
                                                                org.telegram.messenger.hp messagesController = wmVar3.getMessagesController();
                                                                TLRPC.User user = wmVar3.f;
                                                                wmVar3.v8 = str50;
                                                                messagesController.A4(str50, user);
                                                                wmVar3.Lc(false);
                                                            }
                                                        } else {
                                                            if (str55 == null || !z46) {
                                                                long j12 = -j10;
                                                                TLRPC.Chat M07 = org.telegram.messenger.hp.s1(launchActivity3.P).M0(Long.valueOf(j12));
                                                                if (z27 || i28 > 0) {
                                                                    try {
                                                                        lyVar7.run();
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
                                                                    if (i28 > 0) {
                                                                        bundle4.putBoolean("open_gifts", true);
                                                                        bundle4.putInt("open_gifts_collection", i28);
                                                                        if (l15.longValue() == org.telegram.messenger.h10.i(launchActivity3.P).e()) {
                                                                            bundle4.putBoolean("my_profile", true);
                                                                        }
                                                                    }
                                                                    ((ActionBarLayout) launchActivity3.M()).S(new ProfileActivity(bundle4, null));
                                                                    return;
                                                                }
                                                                if (M07 == null || !M07.forum) {
                                                                    long j13 = j10;
                                                                    Integer num9 = num4;
                                                                    org.telegram.messenger.hp.s1(i26).s0(j13, num9 == null ? 0 : num9.intValue(), new k80(launchActivity3, lyVar7, str56, d2Var4, j13, num9, bundle3));
                                                                    return;
                                                                }
                                                                Long valueOf = (l14 != null || num4 == null) ? l14 : Long.valueOf(num4.intValue());
                                                                if (valueOf != null && valueOf.longValue() != 0) {
                                                                    launchActivity3.l0(j10, num4, null, num8, bArr5, new t60(lyVar7, 0), 0, -1);
                                                                    return;
                                                                }
                                                                LaunchActivity launchActivity6 = launchActivity3;
                                                                Bundle j14 = a1.g.j(j12, "chat_id");
                                                                if (str51 != null) {
                                                                    j14.putString("voicechat", str51);
                                                                }
                                                                if (z34) {
                                                                    j14.putBoolean("videochat", true);
                                                                }
                                                                launchActivity6.t0(m91.J0(launchActivity6, j14));
                                                                try {
                                                                    lyVar7.run();
                                                                    return;
                                                                } catch (Exception e13) {
                                                                    org.telegram.messenger.a8.g(e13, true);
                                                                    return;
                                                                }
                                                            }
                                                            wm wmVar4 = (wm) d2Var4;
                                                            wmVar4.getClass();
                                                            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                                            tL_contacts_resolveUsername.username = str55;
                                                            wmVar4.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new be(wmVar4, 0));
                                                        }
                                                    }
                                                } else {
                                                    lyVar6 = lyVar7;
                                                    TLRPC.User a25 = org.telegram.messenger.hp.s1(i39).a2(l12);
                                                    if (a25 == null || (a25.bot && a25.bot_nochats)) {
                                                        try {
                                                            if (arrayList4.isEmpty()) {
                                                                return;
                                                            }
                                                            org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) arrayList4.get(arrayList4.size() - 1)).t(org.telegram.messenger.bd.M0(2131753108, null), null).j();
                                                            return;
                                                        } catch (Exception e14) {
                                                            org.telegram.messenger.a8.g(e14, true);
                                                            return;
                                                        }
                                                    }
                                                    z21 = true;
                                                    Bundle l19 = org.telegram.ui.Cells.f1.l(2, "onlySelect", "dialogsType", true);
                                                    l19.putBoolean("resetDelegate", false);
                                                    l19.putBoolean("closeFragment", false);
                                                    l19.putBoolean("allowGroups", str66 != null);
                                                    l19.putBoolean("allowChannels", str67 != null);
                                                    String str97 = TextUtils.isEmpty(str66) ? TextUtils.isEmpty(str67) ? null : str67 : str66;
                                                    uw uwVar3 = new uw(l19);
                                                    uwVar3.D2 = new lg.k1(launchActivity5, i39, a25, str68, str97, uwVar3);
                                                    launchActivity5.t0(uwVar3);
                                                }
                                                lyVar6 = lyVar7;
                                            } else {
                                                ly lyVar8 = lyVar4;
                                                int z02 = launchActivity2.z0(i23, lyVar8, num4, num5, l14, null, null, org.telegram.messenger.hp.s1(i23).M0(Long.valueOf(-l12.longValue())), null, null, 0, -1);
                                                iArr2[0] = z02;
                                                if (z02 != 0) {
                                                    return;
                                                }
                                                lyVar6 = lyVar8;
                                                z21 = true;
                                            }
                                            lyVar6.run();
                                            return;
                                        }
                                        TLRPC.User a26 = org.telegram.messenger.hp.s1(i23).a2(l12);
                                        if (a26 != null && a26.bot) {
                                            org.telegram.messenger.hp.s1(i23).x3(null, a26, str43, 0, bVar3, z38, z39);
                                        }
                                        lyVar6 = lyVar4;
                                        z21 = true;
                                        lyVar6.run();
                                        return;
                                    }
                                }
                                lyVar6.run();
                                return;
                            } catch (Exception e15) {
                                org.telegram.messenger.a8.g(e15, z21);
                                return;
                            }
                            z21 = true;
                            org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                            if (Q != null) {
                                if (Q instanceof wm) {
                                    ((wm) Q).Tb();
                                }
                                Typeface typeface = org.telegram.messenger.g0.a;
                                try {
                                    Double.parseDouble(str57);
                                    z22 = true;
                                } catch (NumberFormatException unused2) {
                                    z22 = false;
                                }
                                if (z22) {
                                    org.telegram.ui.Components.fc.a0(Q).t(org.telegram.messenger.bd.M0(2131748189, null), null).j();
                                } else {
                                    org.telegram.ui.Components.fc.a0(Q).t(org.telegram.messenger.bd.M0(2131748142, null), null).j();
                                }
                            }
                        }
                    };
                    bVar2 = bVar2;
                    d22.a(str, str31, u10Var);
                    iArr = iArr2;
                    s1Var = s1Var4;
                    i15 = 0;
                    lyVar = null;
                    if (iArr[i15] == 0) {
                    }
                }
            }
            i16 = i3;
            i15 = 0;
            iArr = iArr2;
            lyVar = null;
            s1Var = s1Var4;
            if (iArr[i15] == 0) {
            }
        }
        i16 = i3;
        i15 = 0;
        iArr = iArr2;
        lyVar = null;
        s1Var = s1Var4;
        if (iArr[i15] == 0) {
        }
    }

    public final void C(int i3) {
        N1 = this;
        Set set = org.telegram.messenger.z0.a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - org.telegram.messenger.az.H) >= 86400) {
            org.telegram.messenger.az.H = currentTimeMillis;
            Utilities.f.c(new org.telegram.messenger.x0(currentTimeMillis, org.telegram.messenger.w7.j(4), 0));
        }
        if (org.telegram.messenger.r2.a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - org.telegram.messenger.az.I) >= 3600) {
                org.telegram.messenger.az.I = currentTimeMillis2;
                Utilities.f.c(new ii.i2(currentTimeMillis2, 7));
            }
        }
        if ((Build.VERSION.SDK_INT < 26 || i3 != 0) && !this.y1) {
            Utilities.e.e(new n70(this, i3, 1), 2000L);
        }
    }

    public final void D0(int i3) {
        this.A0.setInternalNavigationBarColor(i3);
        org.telegram.ui.ActionBar.b3 O = O();
        if (O != null) {
            O.setNavigationBarColor(i3);
        }
    }

    public final void E() {
        if (!org.telegram.messenger.g0.Q1() || this.t0 == null) {
            return;
        }
        Boolean bool = org.telegram.messenger.g0.L;
        if (bool != null) {
            if (bool.booleanValue() != (org.telegram.messenger.t0.b != null && org.telegram.messenger.t0.b.getResources().getBoolean(R.bool.isTablet))) {
                return;
            }
        }
        if (org.telegram.messenger.g0.E || (org.telegram.messenger.g0.P1() && getResources().getConfiguration().orientation != 2)) {
            this.P0 = true;
            List<org.telegram.ui.ActionBar.d2> fragmentStack = this.t0.getFragmentStack();
            if (!fragmentStack.isEmpty()) {
                while (fragmentStack.size() > 0) {
                    org.telegram.ui.ActionBar.d2 d2Var = fragmentStack.get(0);
                    if (d2Var instanceof wm) {
                        wm wmVar = (wm) d2Var;
                        wmVar.l5 = true;
                        wmVar.m5 = true;
                    }
                    d2Var.onPause();
                    d2Var.onFragmentDestroy();
                    d2Var.setParentLayout(null);
                    fragmentStack.remove(d2Var);
                    this.r0.c(-1, d2Var);
                }
                org.telegram.ui.Components.bc0 bc0Var = this.B0;
                if (bc0Var == null || bc0Var.b.getVisibility() != 0) {
                    this.r0.X(true, true);
                }
            }
            this.t0.getView().setVisibility(8);
            this.w0.setVisibility(this.r0.getFragmentStack().isEmpty() ? 0 : 8);
            return;
        }
        this.P0 = false;
        List<org.telegram.ui.ActionBar.d2> fragmentStack2 = this.r0.getFragmentStack();
        if (fragmentStack2.size() >= 2) {
            while (1 < fragmentStack2.size()) {
                org.telegram.ui.ActionBar.d2 d2Var2 = fragmentStack2.get(1);
                if (d2Var2 instanceof wm) {
                    wm wmVar2 = (wm) d2Var2;
                    wmVar2.l5 = true;
                    wmVar2.m5 = true;
                }
                d2Var2.onPause();
                d2Var2.onFragmentDestroy();
                d2Var2.setParentLayout(null);
                fragmentStack2.remove(d2Var2);
                this.t0.c(-1, d2Var2);
            }
            org.telegram.ui.Components.bc0 bc0Var2 = this.B0;
            if (bc0Var2 == null || bc0Var2.b.getVisibility() != 0) {
                this.r0.X(true, true);
                this.t0.X(true, true);
            }
        }
        this.t0.getView().setVisibility(this.t0.getFragmentStack().isEmpty() ? 8 : 0);
        this.w0.setVisibility(this.t0.getFragmentStack().isEmpty() ? 0 : 8);
    }

    public final void E0() {
        org.telegram.ui.ActionBar.l3 l3Var;
        ViewGroup view;
        if (this.A0.indexOfChild(this.u0) != -1) {
            l3Var = this.A0;
            view = this.u0;
        } else {
            l3Var = this.A0;
            view = this.r0.getView();
        }
        int indexOfChild = l3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.A0.removeViewAt(indexOfChild);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            g80 g80Var = new g80(this, this);
            this.u0 = g80Var;
            if (indexOfChild != -1) {
                this.A0.addView(g80Var, indexOfChild, b8.mf.c(-1.0f, -1));
            } else {
                this.A0.addView(g80Var, b8.mf.c(-1.0f, -1));
            }
            ai.h5 h5Var = new ai.h5(this, null);
            this.w0 = h5Var;
            h5Var.setOccupyStatusBar(false);
            this.w0.U(org.telegram.ui.ActionBar.k6.s0());
            this.u0.addView(this.w0, b8.mf.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.r0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.r0.getView());
            }
            this.u0.addView(this.r0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.t0 = actionBarLayout;
            actionBarLayout.U0 = true;
            actionBarLayout.setFragmentStack(this.g0);
            this.t0.setDelegate(this);
            this.u0.addView(this.t0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.v0 = frameLayout;
            ArrayList arrayList = this.f0;
            frameLayout.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.v0.setBackgroundColor(1056964608);
            this.u0.addView(this.v0);
            this.v0.setOnTouchListener(new e0(this, 3));
            this.v0.setOnClickListener(new ai.t(24));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.s0 = actionBarLayout2;
            actionBarLayout2.T0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.s0.setBackgroundView(this.v0);
            this.s0.setUseAlphaAnimations(true);
            this.s0.setFragmentStack(arrayList);
            this.s0.setDelegate(this);
            this.s0.setDrawerLayoutContainer(this.A0);
            ViewGroup view2 = this.s0.getView();
            view2.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.u0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.r0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.r0.getView());
            }
            this.r0.setFragmentStack(this.e0);
            if (indexOfChild != -1) {
                this.A0.addView(this.r0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.A0.addView(this.r0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        n9.b.a(this, org.telegram.messenger.az.x1, false);
    }

    public final void F(boolean z10, boolean z11, boolean z12) {
        um umVar;
        boolean z13;
        ArrayList arrayList = this.e0;
        boolean z14 = true;
        org.telegram.ui.ActionBar.d2 d2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList) : null;
        char c2 = 2;
        if (d2Var != null && (d2Var.isRemovingFromStack() || d2Var.isInPreviewMode())) {
            d2Var = arrayList.size() > 1 ? (org.telegram.ui.ActionBar.d2) k2.p1.h(2, arrayList) : null;
        }
        if (d2Var != null) {
            d2Var.hasForceLightStatusBar();
        }
        int i3 = Build.VERSION.SDK_INT;
        if (z11) {
            if (d2Var != null) {
                z13 = d2Var.isLightStatusBar();
                if (d2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) d2Var.getParentLayout();
                    if (actionBarLayout.x() == null || actionBarLayout.x().getLastSheet() == null) {
                        ArrayList<org.telegram.ui.ActionBar.z1> arrayList2 = d2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.z1 z1Var = (org.telegram.ui.ActionBar.z1) k2.p1.h(1, d2Var.sheetsStack);
                            if (z1Var.s()) {
                                z13 = z1Var.f();
                            }
                        }
                    } else {
                        org.telegram.ui.ActionBar.z1 lastSheet = actionBarLayout.x().getLastSheet();
                        if (lastSheet.s()) {
                            z13 = lastSheet.f();
                        }
                    }
                }
            } else {
                z13 = i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, true)) > 0.699999988079071d;
            }
            org.telegram.messenger.g0.p3(this, z13);
        }
        if (i3 >= 26 && z12 && (!z10 || d2Var == null || !d2Var.isInPreviewMode())) {
            int x02 = (d2Var == null || !z10) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, true) : d2Var.getNavigationBarColor();
            if (d2Var instanceof wm) {
                wm wmVar = (wm) d2Var;
                if (!wmVar.fc || (wmVar.w.s != 1 && ((umVar = wmVar.ya) == null || !umVar.q))) {
                    c2 = 1;
                }
            } else {
                c2 = 0;
            }
            if (O() != null && O().I > 0) {
                c2 = 0;
            }
            if (this.r0.x() != null) {
                gx x10 = this.r0.x();
                if (x10.sheetsStack != null) {
                    for (int i10 = 0; i10 < x10.sheetsStack.size(); i10++) {
                        org.telegram.ui.ActionBar.z1 z1Var2 = x10.sheetsStack.get(i10);
                        if (z1Var2.y()) {
                            x02 = z1Var2.e(x02);
                            c2 = 0;
                        }
                    }
                }
            }
            Iterator it = ii.a3.b1.iterator();
            while (it.hasNext()) {
                x02 = ((ii.a3) it.next()).e(x02);
                c2 = 0;
            }
            D0(x02);
            if ((c2 != 0 || org.telegram.messenger.g0.B(x02) < 0.721f) && c2 != 1) {
                z14 = false;
            }
            org.telegram.messenger.g0.m3(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final org.telegram.ui.ActionBar.s1 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.s1 p10 = alertDialog$Builder.p();
            p10.setCanceledOnTouchOutside(true);
            p10.setOnDismissListener(new ci.h3(11, this, p10));
            this.F0.add(p10);
            return p10;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    @Override // org.telegram.ui.nw
    public final boolean G() {
        ArrayList arrayList = this.V;
        return (arrayList != null && arrayList.size() == 1) || this.S != null;
    }

    public final void H(boolean z10) {
        org.telegram.messenger.r3 r3Var;
        long j10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = false;
        if (sharedInstance == null || (r3Var = sharedInstance.groupCall) == null) {
            this.m0 = false;
            return;
        }
        boolean z12 = this.m0;
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
            j10 = org.telegram.messenger.h10.i(this.P).n;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j10);
        boolean z13 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted) ? false : true;
        if (z13 && groupCallParticipant.raise_hand_rating != 0) {
            z11 = true;
        }
        this.m0 = z11;
        if (z10 || !z12 || z11 || z13 || x30.v5 != null) {
            return;
        }
        N0(38);
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.d2 d2Var;
        ArrayList arrayList = this.f0;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.g0;
            if (arrayList2.isEmpty()) {
                ArrayList arrayList3 = this.e0;
                d2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList3) : null;
            } else {
                d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList2);
            }
        } else {
            d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
        }
        if (org.telegram.ui.Components.fc.a(d2Var)) {
            aVar.a(org.telegram.ui.Components.fc.a0(d2Var)).j();
        }
    }

    public final void I() {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.d2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (org.telegram.messenger.g0.Q1()) {
            ArrayList arrayList2 = this.f0;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((org.telegram.ui.ActionBar.d2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.g0;
            int size3 = arrayList3.size();
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                ((org.telegram.ui.ActionBar.d2) obj3).onFragmentDestroy();
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
        org.telegram.messenger.yc ycVar;
        if (org.telegram.messenger.h10.i(this.P).p()) {
            try {
                if (!this.J0 && !org.telegram.messenger.t0.x) {
                    String string = org.telegram.messenger.hp.e1().getString("language_showed2", "");
                    final String str = org.telegram.messenger.hp.s1(this.P).P3;
                    if (string.equals(str)) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final org.telegram.messenger.yc[] ycVarArr = new org.telegram.messenger.yc[2];
                    boolean z10 = false;
                    String str2 = str.contains("-") ? str.split("-")[0] : str;
                    String str3 = "in".equals(str2) ? "id" : "iw".equals(str2) ? "he" : "jw".equals(str2) ? "jv" : null;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= org.telegram.messenger.bd.E0().J.size()) {
                            r16 = z10;
                            break;
                        }
                        org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) org.telegram.messenger.bd.E0().J.get(i3);
                        boolean z11 = z10;
                        if (ycVar2.c.equals("en")) {
                            ycVarArr[z11 ? 1 : 0] = ycVar2;
                        }
                        if (ycVar2.c.replace("_", "-").equals(str) || ycVar2.c.equals(str2) || ycVar2.c.equals(str3)) {
                            ycVarArr[1] = ycVar2;
                        }
                        if (ycVarArr[z11 ? 1 : 0] != null && ycVarArr[1] != null) {
                            r16 = z11;
                            break;
                        } else {
                            i3++;
                            z10 = z11 ? 1 : 0;
                        }
                    }
                    org.telegram.messenger.yc ycVar3 = ycVarArr[r16];
                    if (ycVar3 != null && (ycVar = ycVarArr[1]) != null && ycVar3 != ycVar) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("show lang alert for " + ycVarArr[r16].b() + " and " + ycVarArr[1].b());
                        }
                        this.K0 = null;
                        this.L0 = null;
                        this.J0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = ycVarArr[1].c();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        final int i10 = 0;
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) { // from class: org.telegram.ui.v70
                            public final /* synthetic */ LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (i10) {
                                    case 0:
                                        String str4 = LaunchActivity.E1;
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
                                        final org.telegram.messenger.yc[] ycVarArr2 = ycVarArr;
                                        final String str5 = str;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.o60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.K0 = hashMap2;
                                                        if (launchActivity2.L0 != null && hashMap2 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr3 = ycVarArr2;
                                                            launchActivity2.J0(ycVarArr3[1], ycVarArr3[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.L0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.K0 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr4 = ycVarArr2;
                                                            launchActivity3.J0(ycVarArr4[1], ycVarArr4[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        String str6 = LaunchActivity.E1;
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
                                        final org.telegram.messenger.yc[] ycVarArr3 = ycVarArr;
                                        final String str7 = str;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.o60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (launchActivity22.L0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr32 = ycVarArr3;
                                                            launchActivity22.J0(ycVarArr32[1], ycVarArr32[0], str7);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.L0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.K0 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr4 = ycVarArr3;
                                                            launchActivity3.J0(ycVarArr4[1], ycVarArr4[0], str7);
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
                        tL_langpack_getStrings2.lang_code = ycVarArr[r16].c();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        final int i11 = 1;
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) { // from class: org.telegram.ui.v70
                            public final /* synthetic */ LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i112 = 0;
                                switch (i11) {
                                    case 0:
                                        String str4 = LaunchActivity.E1;
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
                                        final org.telegram.messenger.yc[] ycVarArr2 = ycVarArr;
                                        final String str5 = str;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.o60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (launchActivity22.L0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr32 = ycVarArr2;
                                                            launchActivity22.J0(ycVarArr32[1], ycVarArr32[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.L0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.K0 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr4 = ycVarArr2;
                                                            launchActivity3.J0(ycVarArr4[1], ycVarArr4[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        String str6 = LaunchActivity.E1;
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
                                        final org.telegram.messenger.yc[] ycVarArr3 = ycVarArr;
                                        final String str7 = str;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.o60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (launchActivity22.L0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr32 = ycVarArr3;
                                                            launchActivity22.J0(ycVarArr32[1], ycVarArr32[0], str7);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.L0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.K0 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr4 = ycVarArr3;
                                                            launchActivity3.J0(ycVarArr4[1], ycVarArr4[0], str7);
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
    public final void J0(org.telegram.messenger.yc ycVar, org.telegram.messenger.yc ycVar2, String str) {
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        boolean z12 = true;
        try {
            this.J0 = false;
            org.telegram.messenger.yc ycVar3 = ycVar;
            if (!ycVar3.j) {
                try {
                    if (!org.telegram.messenger.bd.E0().B.h()) {
                        z11 = false;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = U(2131752108, "ChooseYourLanguage", this.K0);
                        s1Var.T = U(2131752108, "ChooseYourLanguage", this.L0);
                        LinearLayout linearLayout = new LinearLayout(this);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.r4[] r4VarArr = new org.telegram.ui.Cells.r4[2];
                        String U = U(2131751128, "English", this.K0);
                        org.telegram.messenger.yc[] ycVarArr = {!z11 ? ycVar3 : ycVar2, !z11 ? ycVar2 : ycVar3};
                        if (z11) {
                            ycVar3 = ycVar2;
                        }
                        org.telegram.messenger.yc[] ycVarArr2 = {ycVar3};
                        i10 = 0;
                        for (i3 = 2; i10 < i3; i3 = 2) {
                            org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(this);
                            r4VarArr[i10] = r4Var;
                            org.telegram.messenger.yc ycVar4 = ycVarArr[i10];
                            String str2 = ycVar4 == ycVar2 ? U : null;
                            r4Var.b.setText(str2 != null ? str2 : ycVar4.a);
                            r4Var.c.setText(ycVar4.b);
                            r4Var.e = ycVar4;
                            r4Var.d = z12;
                            r4VarArr[i10].setTag(Integer.valueOf(i10));
                            org.telegram.ui.Cells.r4 r4Var2 = r4VarArr[i10];
                            int i11 = org.telegram.ui.ActionBar.k6.I5;
                            org.telegram.ui.ActionBar.r6.R(r4Var2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 2, -1), null, org.telegram.ui.ActionBar.r6.N(i11), null);
                            r4VarArr[i10].a.a(i10 == 0, false);
                            linearLayout.addView(r4VarArr[i10], b8.mf.o(-1, 50));
                            r4VarArr[i10].setOnClickListener(new org.telegram.ui.Components.ux0(26, ycVarArr2, r4VarArr));
                            i10++;
                            z12 = true;
                        }
                        org.telegram.ui.Cells.r4 r4Var3 = new org.telegram.ui.Cells.r4(this);
                        String U2 = U(2131752107, "ChooseYourLanguageOther", this.K0);
                        String U3 = U(2131752107, "ChooseYourLanguageOther", this.L0);
                        r4Var3.b.setText(U2);
                        r4Var3.c.setText(U3);
                        r4Var3.a.a(false, false);
                        r4Var3.e = null;
                        r4Var3.d = false;
                        int i12 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                        r4Var3.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(r4Var3, h02, null, N, null);
                        r4Var3.setOnClickListener(new b40(this, 4));
                        linearLayout.addView(r4Var3, b8.mf.o(-1, 50));
                        alertDialog$Builder.o(linearLayout);
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747839, null), new org.telegram.ui.Components.i41(21, this, ycVarArr2));
                        this.I0 = F0(alertDialog$Builder);
                        org.telegram.messenger.hp.e1().edit().putString("language_showed2", str).commit();
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
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
            s1Var2.S = U(2131752108, "ChooseYourLanguage", this.K0);
            s1Var2.T = U(2131752108, "ChooseYourLanguage", this.L0);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            org.telegram.ui.Cells.r4[] r4VarArr2 = new org.telegram.ui.Cells.r4[2];
            String U4 = U(2131751128, "English", this.K0);
            org.telegram.messenger.yc[] ycVarArr3 = {!z11 ? ycVar3 : ycVar2, !z11 ? ycVar2 : ycVar3};
            if (z11) {
            }
            org.telegram.messenger.yc[] ycVarArr22 = {ycVar3};
            i10 = 0;
            while (i10 < i3) {
            }
            org.telegram.ui.Cells.r4 r4Var32 = new org.telegram.ui.Cells.r4(this);
            String U22 = U(2131752107, "ChooseYourLanguageOther", this.K0);
            String U32 = U(2131752107, "ChooseYourLanguageOther", this.L0);
            r4Var32.b.setText(U22);
            r4Var32.c.setText(U32);
            r4Var32.a.a(false, false);
            r4Var32.e = null;
            r4Var32.d = false;
            int i122 = org.telegram.ui.ActionBar.k6.I5;
            org.telegram.ui.Cells.y h022 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i122, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i122);
            r4Var32.setBackground(h022);
            org.telegram.ui.ActionBar.r6.k(r4Var32, h022, null, N2, null);
            r4Var32.setOnClickListener(new b40(this, 4));
            linearLayout2.addView(r4Var32, b8.mf.o(-1, 50));
            alertDialog$Builder2.o(linearLayout2);
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, null), new org.telegram.ui.Components.i41(21, this, ycVarArr22));
            this.I0 = F0(alertDialog$Builder2);
            org.telegram.messenger.hp.e1().edit().putString("language_showed2", str).commit();
        } catch (Exception e11) {
            e = e11;
            z10 = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Type inference failed for: r14v3, types: [org.telegram.messenger.bd] */
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
        TLRPC.User a22;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.P);
        org.telegram.messenger.g5 r5 = org.telegram.messenger.g5.r(this.P);
        ArrayList arrayList = new ArrayList(r5.f0);
        ArrayList arrayList2 = new ArrayList();
        String str4 = null;
        boolean z10 = false;
        if (str2 != null) {
            String d = mf.b.d(str2, false);
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) r5.l0.get(d);
            if (tL_contact == null) {
                tL_contact = (TLRPC.TL_contact) r5.m0.get(d.substring(Math.max(0, d.length() - 7)));
            }
            if (tL_contact != null) {
                TLRPC.User a23 = s12.a2(Long.valueOf(tL_contact.user_id));
                if (a23 == null || a23.self) {
                    str3 = null;
                    if (arrayList2.isEmpty() && str3 != null) {
                        lowerCase = str3.trim().toLowerCase();
                        if (!TextUtils.isEmpty(lowerCase)) {
                            ?? r82 = 1;
                            String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                            if (lowerCase.equals(S0) || S0.length() == 0) {
                                S0 = null;
                            }
                            String[] strArr = {lowerCase, S0};
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList.get(i3);
                                if (tL_contact2 != null && (a22 = s12.a2(Long.valueOf(tL_contact2.user_id))) != null && !a22.self) {
                                    char c2 = 3;
                                    String[] strArr2 = new String[3];
                                    strArr2[z10 ? 1 : 0] = org.telegram.messenger.g5.m(z10 ? 1 : 0, a22.first_name, a22.last_name).toLowerCase();
                                    String S02 = org.telegram.messenger.bd.E0().S0(strArr2[z10 ? 1 : 0], r82, z10);
                                    strArr2[r82] = S02;
                                    if (strArr2[z10 ? 1 : 0].equals(S02)) {
                                        strArr2[r82] = str4;
                                    }
                                    if (org.telegram.messenger.l10.z(a22)) {
                                        strArr2[2] = org.telegram.messenger.bd.M0(2131746274, str4).toLowerCase();
                                    } else if (a22.self) {
                                        strArr2[2] = org.telegram.messenger.bd.M0(2131745911, str4).toLowerCase();
                                    }
                                    int i10 = z10 ? 1 : 0;
                                    int i11 = i10;
                                    boolean z11 = z10;
                                    while (true) {
                                        if (i10 < 2) {
                                            String str5 = strArr[i10];
                                            if (str5 != null) {
                                                for (?? r72 = z11; r72 < c2; r72++) {
                                                    String str6 = strArr2[r72];
                                                    if (str6 != null && (str6.startsWith(str5) || str6.contains(" ".concat(str5)))) {
                                                        i11 = 1;
                                                        break;
                                                    }
                                                    c2 = 3;
                                                }
                                                String n4 = org.telegram.messenger.l10.n(a22);
                                                if (i11 == 0 && n4 != null && n4.startsWith(str5)) {
                                                    i11 = 1;
                                                }
                                                if (i11 != 0) {
                                                    arrayList2.add(tL_contact2);
                                                    break;
                                                }
                                            }
                                            i10++;
                                            z11 = false;
                                            c2 = 3;
                                        }
                                    }
                                }
                                i3++;
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

    public final void K0(boolean z10, boolean z11, int i3, int i10, xg xgVar) {
        if (this.A0 == null || isFinishing()) {
            return;
        }
        if (this.B0 == null) {
            this.B0 = new org.telegram.ui.Components.bc0(this);
        }
        org.telegram.messenger.az.x = true;
        int i11 = 0;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(false, true);
        } else if (i4.G() && i4.v().W) {
            i4.v().m(false, true);
        }
        gi.va.w();
        org.telegram.messenger.zi ziVar = MediaController.B().v0;
        if (ziVar != null && ziVar.i4()) {
            MediaController.B().q(true, true, false, false);
        }
        this.B0.show();
        org.telegram.ui.Components.ac0 ac0Var = this.B0.b;
        ArrayList arrayList = this.C0;
        arrayList.isEmpty();
        ac0Var.m(z11, i3, i10, new ly(20, this, xgVar));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Components.zb0 zb0Var = (org.telegram.ui.Components.zb0) arrayList.get(i12);
            if (z10) {
                int size = arrayList.size() - 1;
            }
            zb0Var.m(z11, i3, i10, null);
        }
        org.telegram.messenger.az.C = true;
        a80 a80Var = new a80(this);
        this.B0.b.setDelegate(a80Var);
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.Components.zb0) obj).setDelegate(a80Var);
        }
        try {
            org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0(int i3, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f10;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (this.D0 == null) {
            final org.telegram.ui.Components.ky0 ky0Var = new org.telegram.ui.Components.ky0(this);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ky0Var, null);
            int i10 = org.telegram.messenger.g0.m;
            if (i10 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                ky0Var.addView(view, new FrameLayout.LayoutParams(-1, i10));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            final int i11 = 1;
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.logo_middle);
            linearLayout.addView(imageView, b8.mf.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.messenger.k5.n(textView, i12, null, 1, 17.0f);
            textView.setText(org.telegram.messenger.bd.M0(2131746790, null));
            linearLayout.addView(textView, b8.mf.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            ky0Var.a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
            org.telegram.ui.ActionBar.r6.H(textView2, org.telegram.ui.ActionBar.k6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0((boolean) (objArr2 == true ? 1 : 0)));
            textView2.setGravity(51);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            linearLayout.addView(textView2, b8.mf.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f10 = 4.0f;
            scrollView.setPadding(org.telegram.messenger.g0.L(24.0f), i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            ky0Var.addView(scrollView, b8.mf.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(org.telegram.messenger.bd.M0(2131751605, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i13 = org.telegram.ui.ActionBar.k6.y6;
            org.telegram.ui.ActionBar.r6.V(textView3, i13, null);
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.y J0 = org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.x0(null, i13, false));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i13, 25);
            textView3.setBackground(J0);
            org.telegram.ui.ActionBar.r6.k(textView3, J0, null, h, null);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f));
            ky0Var.addView(textView3, b8.mf.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            final Object[] objArr3 = objArr == true ? 1 : 0;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.hy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = objArr3;
                    ky0 ky0Var2 = ky0Var;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.bd.M0(2131744208, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751603, null), new iy0(ky0Var2, 1));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131753756, null), null);
                            s1Var.U = org.telegram.messenger.bd.M0(2131743985, null);
                            alertDialog$Builder.p();
                            break;
                        default:
                            if (ky0Var2.c.min_age_confirm == 0) {
                                ky0Var2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.bd.M0(2131743988, null);
                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                s1Var2.S = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754306, null), new iy0(ky0Var2, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                s1Var2.U = org.telegram.messenger.bd.a0("TosAgeText", null, 2131743989, org.telegram.messenger.bd.G(ky0Var2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                break;
                            }
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(org.telegram.messenger.bd.M0(2131754717, null));
            textView4.setGravity(17);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = org.telegram.messenger.g0.L(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            ky0Var.addView(textView4, b8.mf.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.hy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = i11;
                    ky0 ky0Var2 = ky0Var;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.bd.M0(2131744208, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751603, null), new iy0(ky0Var2, 1));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131753756, null), null);
                            s1Var.U = org.telegram.messenger.bd.M0(2131743985, null);
                            alertDialog$Builder.p();
                            break;
                        default:
                            if (ky0Var2.c.min_age_confirm == 0) {
                                ky0Var2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.bd.M0(2131743988, null);
                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                s1Var2.S = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754306, null), new iy0(ky0Var2, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                s1Var2.U = org.telegram.messenger.bd.a0("TosAgeText", null, 2131743989, org.telegram.messenger.bd.G(ky0Var2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                break;
                            }
                    }
                }
            });
            View view2 = new View(this);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view2, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(75.0f);
            layoutParams.gravity = 80;
            ky0Var.addView(view2, layoutParams);
            this.D0 = ky0Var;
            ky0Var.setAlpha(0.0f);
            this.A0.addView(this.D0, b8.mf.c(-1.0f, -1));
            this.D0.setDelegate(new h80(this));
        } else {
            f10 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = org.telegram.messenger.h10.i(i3).a0;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            org.telegram.messenger.h10.i(i3).a0 = tL_help_termsOfService;
            org.telegram.messenger.h10.i(i3).v(false);
        }
        org.telegram.ui.Components.ky0 ky0Var2 = this.D0;
        if (ky0Var2.getVisibility() != 0) {
            ky0Var2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        org.telegram.messenger.zi.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i14 = 0; i14 < length; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == '-') {
                    int i16 = i14 + 2;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        org.telegram.ui.Components.na naVar = new org.telegram.ui.Components.na(L2, L3);
                        spannableStringBuilder.replace(i15, i14 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(naVar, i15, i16, 33);
                    }
                }
            }
        }
        ky0Var2.a.setText(spannableStringBuilder);
        ky0Var2.c = tL_help_termsOfService;
        ky0Var2.d = i3;
        this.D0.animate().alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.F).setListener(null).start();
    }

    public final org.telegram.ui.ActionBar.q4 M() {
        ActionBarLayout actionBarLayout = this.r0;
        ArrayList arrayList = this.Q;
        return !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.q4) k2.p1.h(1, arrayList) : actionBarLayout;
    }

    public final void M0(int i3, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        boolean z11 = false;
        if (this.E0 == null) {
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i10 = org.telegram.ui.ActionBar.k6.d6;
            t9Var.x = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0});
            t9Var.y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0});
            org.telegram.ui.ActionBar.r6.i(i10, t9Var, null);
            int i11 = (int) (org.telegram.messenger.g0.m / org.telegram.messenger.g0.p);
            FrameLayout frameLayout = new FrameLayout(this);
            t9Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.m));
            org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(this);
            fh0Var.f(R.raw.qr_code_logo, org.telegram.messenger.hs.t1, org.telegram.messenger.hs.t1, null);
            fh0Var.d();
            fh0Var.getAnimatedDrawable().K(1);
            fh0Var.setScaleType(ImageView.ScaleType.CENTER);
            fh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(14.0f));
            frameLayout.addView(fh0Var, b8.mf.d(-2, -2.0f, 17, 0.0f, i11, 0.0f, 0.0f));
            fh0Var.setOnClickListener(new org.telegram.ui.Components.r9(t9Var));
            FrameLayout frameLayout2 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            t9Var.f = scrollView;
            org.telegram.messenger.g0.z3(scrollView, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false));
            scrollView.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
            scrollView.setClipToPadding(false);
            t9Var.addView(scrollView, b8.mf.d(-1, -1.0f, 51, 27.0f, i11 + org.telegram.messenger.hs.I2, 27.0f, 130.0f));
            scrollView.addView(frameLayout2);
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(textView, i12, null);
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.bd.M0(2131743826, null));
            frameLayout2.addView(textView, b8.mf.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            t9Var.a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
            org.telegram.ui.ActionBar.r6.H(textView2, org.telegram.ui.ActionBar.k6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(z11));
            textView2.setGravity(49);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            frameLayout2.addView(textView2, b8.mf.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            ai.o2 o2Var = new ai.o2(this, 14);
            t9Var.d = o2Var;
            o2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            o2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
            o2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            t9Var.addView(o2Var, b8.mf.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            o2Var.setOnClickListener(new org.telegram.ui.Components.r9(t9Var, this));
            TextView textView3 = new TextView(this);
            t9Var.b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            o2Var.addView(textView3, b8.mf.e(-2, -2, 17));
            ai.o2 o2Var2 = new ai.o2(15, this, t9Var);
            t9Var.c = o2Var2;
            o2Var2.setWillNotDraw(false);
            o2Var2.setAlpha(0.0f);
            o2Var2.setScaleX(0.1f);
            o2Var2.setScaleY(0.1f);
            o2Var2.setVisibility(4);
            org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(o2Var2);
            t9Var.e = gh0Var;
            gh0Var.d(null, true, false);
            gh0Var.o = -1;
            o2Var.addView(o2Var2, b8.mf.e(36, 36, 17));
            this.E0 = t9Var;
            this.A0.addView(t9Var, b8.mf.c(-1.0f, -1));
        }
        org.telegram.ui.Components.t9 t9Var2 = this.E0;
        TextView textView4 = t9Var2.b;
        t9Var2.w = 0;
        t9Var2.n = tL_help_appUpdate;
        t9Var2.s = i3;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            t9Var2.r = org.telegram.messenger.w7.r(null, document);
        }
        if (t9Var2.getVisibility() != 0) {
            t9Var2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        org.telegram.messenger.zi.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
        t9Var2.a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            textView4.setText(org.telegram.messenger.bd.M0(2131743832, null) + String.format(Locale.US, " (%1$s)", org.telegram.messenger.g0.i0(tL_help_appUpdate.document.size, false, false)));
        } else {
            textView4.setText(org.telegram.messenger.bd.M0(2131743832, null));
        }
        org.telegram.messenger.hs.f(t9Var2.s).c(t9Var2, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(t9Var2.s).c(t9Var2, org.telegram.messenger.hs.Z1);
        org.telegram.messenger.hs.f(t9Var2.s).c(t9Var2, org.telegram.messenger.hs.X1);
        if (z10) {
            org.telegram.messenger.t0.u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r7 == null) goto L29;
     */
    @Override // org.telegram.ui.nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N(uw uwVar) {
        gi.f7 l10;
        FileOutputStream fileOutputStream;
        ArrayList arrayList = this.V;
        if (arrayList == null || arrayList.isEmpty()) {
            String str = this.S;
            if (str != null) {
                org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, str, 0, true, 0, 0);
                try {
                    Bitmap r5 = org.telegram.messenger.yy.r(1, str);
                    File file = new File(org.telegram.messenger.w7.z(4), "-2147483648_" + org.telegram.messenger.az.p() + ".jpg");
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                    try {
                        r5.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        yeVar.c = file.getAbsolutePath();
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
                l10 = gi.f7.l(yeVar);
            }
            l10 = null;
        } else {
            ArrayList W7 = wm.W7(this.V, false, null);
            if (!W7.isEmpty()) {
                l10 = gi.f7.l((org.telegram.messenger.ye) W7.get(0));
            }
            l10 = null;
        }
        if (l10 == null) {
            return false;
        }
        ei.t6 o10 = org.telegram.messenger.hp.s1(this.P).P1().o();
        if (o10 != null && o10.a(this.P, 1)) {
            uwVar.showDialog(new vg.i0(o10.b(), this.P, this, uwVar, null));
            return false;
        }
        l10.o = true;
        l10.M = false;
        gi.va.D(this, this.P).R(null, l10, 0L);
        uwVar.finishFragment();
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

    public final void N0(int i3) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || this.e0.isEmpty() || sharedInstance.groupCall == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.ui.ActionBar.d2 d2Var = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
        if (d2Var instanceof ee0) {
            d2Var = ((ee0) d2Var).c0();
        }
        UndoView undoView = null;
        if (d2Var instanceof wm) {
            wm wmVar = (wm) d2Var;
            if (chat != null && wmVar.a() == (-chat.id)) {
                chat = null;
            }
            wmVar.f8();
            undoView = wmVar.N3;
        } else if (d2Var instanceof uw) {
            undoView = ((uw) d2Var).k4();
        } else if (d2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) d2Var).M;
        }
        if (undoView != null) {
            undoView.m(0L, chat, i3);
        }
        if (i3 != 38 || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().playAllowTalkSound();
    }

    public final org.telegram.ui.ActionBar.b3 O() {
        ActionBarLayout actionBarLayout = this.t0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.t0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.r0;
        if (actionBarLayout2 == null || actionBarLayout2.getBottomSheetTabs() == null) {
            return null;
        }
        return this.r0.getBottomSheetTabs();
    }

    public final void O0(int i3) {
        P0(i3, new u70(0));
    }

    public final org.telegram.ui.ActionBar.d2 P() {
        return xd0.s1(this.P, false).getInt("currentViewNum", 0) != 0 ? new xd0() : new o50();
    }

    public final void P0(int i3, org.telegram.messenger.e9 e9Var) {
        if (i3 == org.telegram.messenger.h10.t0 || !org.telegram.messenger.h10.r(i3)) {
            return;
        }
        this.n1 = true;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        org.telegram.messenger.h10.t0 = i3;
        org.telegram.messenger.h10.i(0).v(false);
        A();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.c4, Integer.valueOf(i3));
        if (org.telegram.messenger.g0.Q1()) {
            this.s0.a0();
            this.t0.a0();
            if (!this.P0) {
                if (this.t0.getFragmentStack().isEmpty()) {
                    this.w0.setVisibility(0);
                }
                this.t0.getView().setVisibility(8);
            }
            this.s0.getView().setVisibility(8);
        }
        this.r0.a0();
        this.r0.c(-3, (ee0) e9Var.k(null));
        this.r0.X(true, true);
        if (org.telegram.messenger.g0.Q1()) {
            this.s0.X(true, true);
            this.t0.X(true, true);
        }
        if (!org.telegram.messenger.t0.x) {
            ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        }
        if (org.telegram.messenger.h10.i(i3).a0 != null) {
            L0(i3, org.telegram.messenger.h10.i(i3).a0);
        }
        Q0();
        this.n1 = false;
    }

    public final void Q0() {
        int i3;
        String str;
        if (this.r0 == null) {
            return;
        }
        int connectionState = ConnectionsManager.getInstance(this.P).getConnectionState();
        this.d0 = connectionState;
        if (connectionState == 2) {
            str = "WaitingForNetwork";
            i3 = 2131743222;
        } else if (connectionState == 5) {
            str = "Updating";
            i3 = 2131743820;
        } else if (connectionState == 4) {
            str = "ConnectingToProxyWithDots";
            i3 = 2131751805;
        } else if (connectionState == 1) {
            str = "Connecting";
            i3 = 2131751809;
        } else {
            i3 = 0;
            str = null;
        }
        m60 m60Var = (connectionState == 1 || connectionState == 4) ? new m60(this, 9) : null;
        ActionBarLayout actionBarLayout = this.r0;
        actionBarLayout.N0 = str;
        actionBarLayout.O0 = i3;
        actionBarLayout.P0 = m60Var;
        for (int i10 = 0; i10 < actionBarLayout.V0.size(); i10++) {
            ((org.telegram.ui.ActionBar.d2) actionBarLayout.V0.get(i10)).setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, m60Var);
        }
    }

    public final int R() {
        return this.e0.size();
    }

    public final sh.d S() {
        return this.i1;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r0v301 int), method size: 16238
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final boolean W(android.content.Intent r126, boolean r127, boolean r128, boolean r129, sf.b r130, boolean r131, boolean r132) {
        /*
            Method dump skipped, instructions count: 16238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.W(android.content.Intent, boolean, boolean, boolean, sf.b, boolean, boolean):boolean");
    }

    public final void X() {
        ActionMode actionMode = this.l0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Y(int i3, TLRPC.User user, String str, sf.b bVar) {
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = s12.q1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new c3.b(1), new f60(this, bVar, s12, i3, user));
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final void a(float f10) {
        if (i4.G() && i4.v().W) {
            i4 v = i4.v();
            v.Q();
            i4.e0(v);
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
        if (PhotoViewer.F1()) {
            PhotoViewer.v1().x3();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        long j10;
        long j11;
        long j12;
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
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList4.get(i3);
                    i3++;
                    org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                    if (!(d2Var instanceof ee0)) {
                        if (d2Var instanceof uw) {
                            uw uwVar = (uw) d2Var;
                            if (uwVar.t4() && !uwVar.q4()) {
                                j12 = 0;
                                if (uwVar.Z2 != 0) {
                                    if (!(d2Var instanceof wm)) {
                                        wm wmVar = (wm) d2Var;
                                        if (!wmVar.c()) {
                                            arrayList2.add(d2Var);
                                            if (j13 == j12) {
                                                j13 = wmVar.a();
                                                j10 = wmVar.b();
                                            }
                                        }
                                    }
                                    arrayList.add(d2Var);
                                }
                            }
                        }
                        j12 = 0;
                        if (!(d2Var instanceof wm)) {
                        }
                        arrayList.add(d2Var);
                    }
                    arrayList3.add(d2Var);
                }
                j11 = j13;
            }
            E0();
            this.r0.X(true, true);
            if (org.telegram.messenger.g0.Q1()) {
                this.t0.X(true, true);
                this.s0.X(true, true);
                int size2 = arrayList3.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Object obj3 = (org.telegram.ui.ActionBar.d2) obj2;
                    if (obj3 instanceof ee0) {
                        obj3 = ((ee0) obj3).K;
                    }
                    if (obj3 instanceof uw) {
                        uw uwVar2 = (uw) obj3;
                        if (uwVar2.t4()) {
                            org.telegram.messenger.pr prVar = uwVar2.q2;
                            prVar.a = j11;
                            prVar.b = j10;
                            tw[] twVarArr = uwVar2.f0;
                            if (twVarArr != null) {
                                for (tw twVar : twVarArr) {
                                    if (twVar.p() && org.telegram.messenger.g0.Q1()) {
                                        twVar.d.s = prVar.a;
                                    }
                                }
                                int i11 = org.telegram.messenger.hp.C8;
                                uwVar2.u5(512, true);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.s0) {
            this.t0.X(z10, z10);
            this.r0.X(z10, z10);
        }
    }

    public final void c0() {
        org.telegram.ui.ActionBar.q4[] q4VarArr = {this.r0, this.s0, this.t0};
        for (int i3 = 0; i3 < 3; i3++) {
            org.telegram.ui.ActionBar.q4 q4Var = q4VarArr[i3];
            if (q4Var instanceof ActionBarLayout) {
                ((ActionBarLayout) q4Var).F();
            }
        }
    }

    public final boolean d0(boolean z10) {
        boolean z11;
        qg.h hVar = n9.b.a;
        if (hVar != null) {
            if (hVar.s) {
                if (z10) {
                    hVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.bc0 bc0Var = this.B0;
        if (bc0Var == null || bc0Var.b.getVisibility() != 0) {
            org.telegram.ui.ActionBar.j3 j3Var = this.z0;
            if (j3Var == null || !(z11 = j3Var.V)) {
                org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.tl0.I;
                if (s1Var != null) {
                    if (z10) {
                        s1Var.dismiss();
                        org.telegram.ui.Components.tl0.I = null;
                        return false;
                    }
                } else if (is.g0 == null || !is.p().E) {
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                        if (z10) {
                            SecretMediaViewer.f().e(true, false);
                            return false;
                        }
                    } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                        if (z10) {
                            PhotoViewer.v1().H0(true, false);
                            return false;
                        }
                    } else {
                        if (!i4.G() || !i4.v().W) {
                            return true;
                        }
                        if (z10) {
                            i4.v().m(true, false);
                        }
                    }
                } else if (z10) {
                    is.p().n();
                    return false;
                }
            } else if (z10 && z11) {
                j3Var.a(false);
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
    @Override // org.telegram.messenger.cs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.fc a02;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.Components.fc a03;
        x30 x30Var;
        char c2;
        char c10;
        ActionBarLayout actionBarLayout;
        Runnable runnable;
        Bitmap bitmap;
        boolean z10;
        View view;
        int i11 = 0;
        int i12 = 1;
        if (i3 == org.telegram.messenger.hs.I2) {
            while (true) {
                if (i11 >= 4) {
                    i11 = -1;
                    break;
                } else if (org.telegram.messenger.h10.i(i11).p()) {
                    break;
                } else {
                    i11++;
                }
            }
            org.telegram.ui.Components.ky0 ky0Var = this.D0;
            if (ky0Var != null) {
                ky0Var.setVisibility(8);
            }
            if (i11 != -1) {
                O0(i11);
                return;
            }
            gy0.a0(true);
            I();
            this.r0.Z();
            if (org.telegram.messenger.g0.Q1()) {
                this.s0.Z();
                this.t0.Z();
            }
            o50 o50Var = new o50();
            o50Var.O = true;
            t0(o50Var);
            return;
        }
        if (i3 == org.telegram.messenger.hs.n3) {
            Long l10 = (Long) objArr[0];
            l10.getClass();
            w0(l10, null, null, objArr.length > 1 ? (org.telegram.ui.Cells.q1) objArr[1] : null);
            return;
        }
        if (i3 == org.telegram.messenger.hs.k4) {
            if (objArr[0] != this) {
                e0();
                finish();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.T1) {
            int connectionState = ConnectionsManager.getInstance(i10).getConnectionState();
            if (this.d0 != connectionState) {
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("switch to state " + connectionState);
                }
                this.d0 = connectionState;
                Q0();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.j0 || i3 == org.telegram.messenger.hs.W4) {
            return;
        }
        int i13 = 5;
        int i14 = 2;
        if (i3 == org.telegram.messenger.hs.M0) {
            Integer num = (Integer) objArr[0];
            if (num.intValue() != 6) {
                if (num.intValue() != 3 || this.G0 == null) {
                    if (num.intValue() == 4) {
                        L0(i10, (TLRPC.TL_help_termsOfService) objArr[1]);
                        return;
                    }
                    org.telegram.ui.ActionBar.d2 d2Var = !this.e0.isEmpty() ? (org.telegram.ui.ActionBar.d2) k2.p1.h(1, this.e0) : null;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                    if (d2Var != null) {
                        HashMap hashMap = new HashMap();
                        int i15 = org.telegram.ui.ActionBar.k6.L5;
                        hashMap.put("info1", Integer.valueOf(d2Var.getThemedColor(i15)));
                        hashMap.put("info2", Integer.valueOf(d2Var.getThemedColor(i15)));
                        alertDialog$Builder.m(R.raw.not_available, 52, d2Var.getThemedColor(i15), hashMap);
                        alertDialog$Builder.n(i15, d2Var.getResourceProvider());
                        alertDialog$Builder.a.X = true;
                    }
                    if (num.intValue() != 2 && num.intValue() != 3) {
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131748339, null), new k2.q(this, i10, 11));
                    }
                    if (num.intValue() == 5) {
                        alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131748133, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                    } else if (num.intValue() == 0) {
                        alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131748135, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                    } else if (num.intValue() == 1) {
                        alertDialog$Builder.g(org.telegram.messenger.bd.L0(2131748134));
                        alertDialog$Builder.k(org.telegram.messenger.bd.L0(2131747839), null);
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
                                valueOf.setSpan(new gi.ka(this, 7), indexOf, indexOf2 - 1, 33);
                            }
                        }
                        alertDialog$Builder.g(valueOf);
                        if (str.startsWith("AUTH_KEY_DROP_")) {
                            alertDialog$Builder.k(org.telegram.messenger.bd.L0(2131752589), null);
                            alertDialog$Builder.h(org.telegram.messenger.bd.L0(2131748751), new a80(this));
                        } else if (str.startsWith("PREMIUM_")) {
                            alertDialog$Builder.l(org.telegram.messenger.bd.L0(2131744241));
                            alertDialog$Builder.k(org.telegram.messenger.bd.L0(2131747839), null);
                        } else {
                            alertDialog$Builder.k(org.telegram.messenger.bd.L0(2131747839), null);
                        }
                    } else if (num.intValue() == 3) {
                        alertDialog$Builder.l(org.telegram.messenger.bd.L0(2131746619));
                        alertDialog$Builder.g(org.telegram.messenger.bd.L0(2131743788));
                        alertDialog$Builder.k(org.telegram.messenger.bd.L0(2131747839), null);
                        this.G0 = F0(alertDialog$Builder);
                        return;
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.R0) {
            HashMap hashMap2 = (HashMap) objArr[0];
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            alertDialog$Builder2.l(org.telegram.messenger.bd.L0(R.string.AppName));
            alertDialog$Builder2.k(org.telegram.messenger.bd.L0(2131747839), null);
            alertDialog$Builder2.h(org.telegram.messenger.bd.L0(2131745431), new k2.y(this, hashMap2, i10, 12));
            alertDialog$Builder2.g(org.telegram.messenger.bd.L0(2131745432));
            if (this.e0.isEmpty()) {
                return;
            }
            ((org.telegram.ui.ActionBar.d2) k2.p1.h(1, this.e0)).showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i3 == org.telegram.messenger.hs.z4) {
            ai.h5 h5Var = this.w0;
            if (h5Var != null) {
                h5Var.U(org.telegram.ui.ActionBar.k6.s0());
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.n0) {
            this.g1.g();
            return;
        }
        if (i3 == org.telegram.messenger.hs.x4) {
            boolean z11 = this.e0.size() > 1 && (k2.p1.h(1, this.e0) instanceof ProfileActivity);
            y0((!z11 || ((ProfileActivity) k2.p1.h(1, this.e0)).v4()) ? z11 : false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.y4) {
            I0();
            return;
        }
        if (i3 == org.telegram.messenger.hs.c1) {
            if (this.e0.isEmpty()) {
                return;
            }
            LaunchActivity launchActivity = K1;
            if (launchActivity == null || launchActivity.O() == null || K1.O().m((TLRPC.TL_webPage) objArr[0]) == null) {
                ((org.telegram.ui.ActionBar.d2) k2.p1.h(1, this.e0)).createArticleViewer(false).L(null, (TLRPC.TL_webPage) objArr[0], (String) objArr[1], null);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.Q) {
            ActionBarLayout actionBarLayout2 = this.r0;
            if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                return;
            }
            ((Integer) objArr[0]).getClass();
            HashMap hashMap3 = (HashMap) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            org.telegram.ui.ActionBar.d2 d2Var2 = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this);
            int i17 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder3.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.k6.v0(i17), null);
            alertDialog$Builder3.n(i17, null);
            alertDialog$Builder3.l(org.telegram.messenger.bd.L0(2131743828));
            alertDialog$Builder3.g(org.telegram.messenger.bd.L0(2131743829));
            alertDialog$Builder3.k(org.telegram.messenger.bd.L0(2131747839), new i60(i10, hashMap3, booleanValue, booleanValue2, 1));
            alertDialog$Builder3.h(org.telegram.messenger.bd.L0(2131752589), new i60(i10, hashMap3, booleanValue, booleanValue2, 2));
            alertDialog$Builder3.a.z0 = new i60(i10, hashMap3, booleanValue, booleanValue2, 0);
            org.telegram.ui.ActionBar.s1 a10 = alertDialog$Builder3.a();
            d2Var2.showDialog(a10);
            a10.setCanceledOnTouchOutside(false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.n4) {
            org.telegram.ui.ActionBar.r6.c0(null, true);
            c0();
            if (!((Boolean) objArr[0]).booleanValue()) {
                try {
                    setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s8) | (-16777216)));
                } catch (Exception unused) {
                }
            }
            F(objArr.length > 2 && ((Boolean) objArr[2]).booleanValue(), true, (!(objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : true) || this.Y0 || this.r0.B()) ? false : true);
            return;
        }
        int i18 = 10;
        if (i3 != org.telegram.messenger.hs.t4) {
            if (i3 == org.telegram.messenger.hs.N0) {
                try {
                    ((Status) objArr[0]).c(this, org.telegram.messenger.hs.W1);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            int i19 = 16;
            if (i3 == org.telegram.messenger.hs.Y1) {
                String str3 = (String) objArr[0];
                String str4 = this.R0;
                if (str4 == null) {
                    String str5 = this.S0;
                    if (str5 == null || !str5.equals(str3)) {
                        return;
                    }
                    this.S0 = null;
                    File file = (File) objArr[1];
                    if (!this.W0) {
                        Utilities.e.c(new pp(this, this.U0, file, i19));
                        return;
                    } else {
                        r0(this.V0, this.T0, this.U0);
                        i0();
                        return;
                    }
                }
                if (str4.equals(str3)) {
                    this.R0 = null;
                    File file2 = new File(org.telegram.messenger.t0.h(), a1.g.r(new StringBuilder("remote"), this.V0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = this.V0;
                    org.telegram.ui.ActionBar.j6 m0 = org.telegram.ui.ActionBar.k6.m0(file2, tL_theme.title, tL_theme);
                    if (m0 != null) {
                        if (m0.c != null && !new File(m0.c).exists()) {
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(m0.F).sendRequest(getwallpaper, new xy(i13, this, m0));
                            return;
                        }
                        TLRPC.TL_theme tL_theme2 = this.V0;
                        org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file2, tL_theme2.title, tL_theme2, true);
                        if (v != null) {
                            t0(new l71(v, true, 0, false, false));
                        }
                    }
                    i0();
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.Z1) {
                String str6 = (String) objArr[0];
                if (str6.equals(this.R0) || str6.equals(this.S0)) {
                    i0();
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.K4) {
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
            if (i3 == org.telegram.messenger.hs.r4) {
                F(objArr.length > 0 && ((Boolean) objArr[0]).booleanValue(), true, !this.Y0);
                return;
            }
            if (i3 == org.telegram.messenger.hs.v1) {
                if (objArr.length <= 1 || this.e0.isEmpty()) {
                    return;
                }
                org.telegram.ui.Components.t4.e0(this.P, (TLRPC.TL_error) objArr[2], (org.telegram.ui.ActionBar.d2) k2.p1.h(1, this.e0), (TLObject) objArr[1], new Object[0]);
                return;
            }
            if (i3 == org.telegram.messenger.hs.k5) {
                org.telegram.ui.Components.t4.e0(this.P, (TLRPC.TL_error) objArr[1], (org.telegram.ui.ActionBar.d2) k2.p1.h(1, this.e0), (TLObject) objArr[0], new Object[0]);
                return;
            }
            if (i3 == org.telegram.messenger.hs.x1) {
                org.telegram.messenger.li.b0(i10).f2(this, (TLObject) objArr[0], 2, !this.e0.isEmpty() ? (org.telegram.ui.ActionBar.d2) k2.p1.h(1, this.e0) : null, false, true);
                return;
            }
            if (i3 == org.telegram.messenger.hs.P4) {
                if (this.e0.isEmpty()) {
                    return;
                }
                int intValue = ((Integer) objArr[0]).intValue();
                org.telegram.ui.ActionBar.j2 j2Var = (!x30.w5 || (x30Var = x30.v5) == null) ? null : x30Var.c;
                org.telegram.ui.ActionBar.d2 d2Var3 = j2Var == null ? (org.telegram.ui.ActionBar.d2) k2.p1.h(1, this.e0) : null;
                switch (intValue) {
                    case 0:
                        TLRPC.Document document = (TLRPC.Document) objArr[1];
                        int intValue2 = ((Integer) objArr[2]).intValue();
                        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(this, null, 1, intValue2, document, null);
                        int i20 = (intValue2 == 6 || intValue2 == 7) ? 3500 : 1500;
                        if (d2Var3 == null) {
                            org.telegram.ui.Components.ac.f(j2Var, bv0Var, i20).j();
                            break;
                        } else {
                            org.telegram.ui.Components.ac.g(d2Var3, bv0Var, i20).j();
                            break;
                        }
                        break;
                    case 1:
                        if (d2Var3 == null) {
                            org.telegram.ui.Components.fc.Z(j2Var, null).t((String) objArr[1], null).j();
                            break;
                        } else {
                            org.telegram.ui.Components.fc.a0(d2Var3).t((String) objArr[1], null).j();
                            break;
                        }
                    case 2:
                        String L0 = org.telegram.messenger.bd.L0(((Long) objArr[1]).longValue() > 0 ? 2131742838 : 2131752416);
                        if (j2Var != null) {
                            e6Var = null;
                            a02 = org.telegram.ui.Components.fc.Z(j2Var, null);
                        } else {
                            e6Var = null;
                            a02 = org.telegram.ui.Components.fc.a0(d2Var3);
                        }
                        a02.t(L0, e6Var).j();
                        break;
                    case 3:
                        String L02 = org.telegram.messenger.bd.L0(((Long) objArr[1]).longValue() > 0 ? 2131742819 : 2131752285);
                        if (j2Var != null) {
                            e6Var2 = null;
                            a03 = org.telegram.ui.Components.fc.Z(j2Var, null);
                        } else {
                            e6Var2 = null;
                            a03 = org.telegram.ui.Components.fc.a0(d2Var3);
                        }
                        a03.t(L02, e6Var2).j();
                        break;
                    case 4:
                        if (d2Var3 == null) {
                            org.telegram.ui.Components.fc.Z(j2Var, null).u((String) objArr[1], (String) objArr[2], null).j();
                            break;
                        } else {
                            org.telegram.ui.Components.fc.a0(d2Var3).u((String) objArr[1], (String) objArr[2], d2Var3.getResourceProvider()).j();
                            break;
                        }
                    case 5:
                        org.telegram.ui.Components.l6 l6Var = new org.telegram.ui.Components.l6(this, (t80) objArr[1]);
                        if (d2Var3 == null) {
                            org.telegram.ui.Components.ac.f(j2Var, l6Var, 1500).j();
                            break;
                        } else {
                            org.telegram.ui.Components.ac.g(d2Var3, l6Var, 1500).j();
                            break;
                        }
                    case 6:
                        if (d2Var3 == null) {
                            org.telegram.ui.Components.fc.Z(j2Var, null).T((String) objArr[1]).j();
                            break;
                        } else {
                            org.telegram.ui.Components.fc.a0(d2Var3).T((String) objArr[1]).j();
                            break;
                        }
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.w2) {
                H(false);
                return;
            }
            if (i3 == org.telegram.messenger.hs.i5) {
                if (this.e0.isEmpty()) {
                    return;
                }
                org.telegram.ui.ActionBar.d2 d2Var4 = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, this.e0);
                if (d2Var4.getParentActivity() != null) {
                    d2Var4.showDialog(new vg.i0(((Integer) objArr[0]).intValue(), this.P, d2Var4.getParentActivity(), d2Var4, null));
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.f5) {
                org.telegram.messenger.hp.s1(this.P).e7.edit().remove("transcribeButtonPressed").apply();
                return;
            }
            if (i3 == org.telegram.messenger.hs.n5) {
                int intValue3 = ((Integer) objArr[0]).intValue();
                String[] strArr = (intValue3 != 0 || Build.VERSION.SDK_INT < 31) ? null : new String[]{"android.permission.BLUETOOTH_CONNECT"};
                if (strArr != null) {
                    int i21 = this.e1 + 1;
                    this.e1 = i21;
                    this.d1.put(i21, intValue3);
                    e0.b.f(this, strArr, this.e1);
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.r5) {
                long longValue = ((Long) objArr[0]).longValue();
                if (((Boolean) objArr[1]).booleanValue()) {
                    rg.c.q(longValue, this.r0);
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.M5) {
                if (this.w1 == null) {
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
                    alertDialog$Builder4.h(org.telegram.messenger.bd.L0(2131751767), new ur(sb3, i19));
                    alertDialog$Builder4.k(org.telegram.messenger.bd.L0(2131747839), null);
                    alertDialog$Builder4.j(new e70(this, i12));
                    org.telegram.ui.ActionBar.s1 p10 = alertDialog$Builder4.p();
                    this.w1 = p10;
                    p10.setCanceledOnTouchOutside(true);
                    return;
                }
                return;
            }
            if (i3 != org.telegram.messenger.hs.N5) {
                if (i3 == org.telegram.messenger.hs.Q5) {
                    org.telegram.messenger.j2 j2Var2 = (org.telegram.messenger.j2) objArr[0];
                    org.telegram.ui.ActionBar.d2 Q = Q();
                    org.telegram.ui.Components.fc a04 = Q instanceof wm ? org.telegram.ui.Components.fc.a0(Q) : org.telegram.ui.Components.fc.X();
                    String s6 = org.telegram.messenger.m5.s(this.P, j2Var2.a);
                    TLRPC.JoinChatBotResult joinChatBotResult = j2Var2.b;
                    org.telegram.messenger.g0.i3(new ly(19, this, joinChatBotResult instanceof TLRPC.TL_joinChatBotResultApproved ? a04.H(R.raw.contact_check, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Z(2131749382, s6))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultDeclined ? a04.H(R.raw.e_hand_2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Z(2131749381, s6))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultQueued ? a04.Q(R.raw.timer_toast, 24, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Z(2131749380, s6))) : null), 400L);
                    return;
                }
                return;
            }
            if (this.x1 == null) {
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
                alertDialog$Builder5.k(org.telegram.messenger.bd.L0(2131747839), null);
                alertDialog$Builder5.j(new e70(this, i14));
                org.telegram.ui.ActionBar.s1 p11 = alertDialog$Builder5.p();
                this.x1 = p11;
                p11.setCanceledOnTouchOutside(true);
                return;
            }
            return;
        }
        if (objArr[2] == null || this.p0.getVisibility() == 0) {
            c2 = 3;
            if (objArr[2] == null) {
                c10 = 0;
                uw.y4 = false;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) objArr[c10];
                boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int intValue5 = ((Integer) objArr[c2]).intValue();
                Runnable runnable2 = objArr.length > 7 ? (Runnable) objArr[7] : null;
                actionBarLayout = this.r0;
                if (actionBarLayout == null) {
                    return;
                }
                actionBarLayout.getClass();
                actionBarLayout.f(new org.telegram.ui.ActionBar.p4(j6Var, intValue5, booleanValue3, true), runnable2);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout3 = this.s0;
                    if (actionBarLayout3 != null) {
                        runnable = null;
                        actionBarLayout3.f(new org.telegram.ui.ActionBar.p4(j6Var, intValue5, booleanValue3, true), null);
                    } else {
                        runnable = null;
                    }
                    ActionBarLayout actionBarLayout4 = this.t0;
                    if (actionBarLayout4 != null) {
                        actionBarLayout4.f(new org.telegram.ui.ActionBar.p4(j6Var, intValue5, booleanValue3, true), runnable);
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
                org.telegram.ui.Components.fh0 fh0Var = (org.telegram.ui.Components.fh0) objArr[5];
                if (objArr.length > 8) {
                    ((Boolean) objArr[8]).getClass();
                }
                int measuredWidth = this.A0.getMeasuredWidth();
                int measuredHeight = this.A0.getMeasuredHeight();
                this.H0 = null;
                if (objArr.length > 6) {
                    this.H0 = (View) objArr[6];
                }
                this.Y0 = true;
                Z(this.A0);
                View view2 = this.H0;
                if (view2 != null && view2.getBackground() != null) {
                    this.H0.getBackground().setAlpha(0);
                }
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        bitmap = org.telegram.messenger.g0.B0(getWindow());
                        if (bitmap != null) {
                            z10 = true;
                            if (bitmap == null) {
                                bitmap = org.telegram.messenger.g0.N3(this.A0);
                            }
                            if (bitmap != null && fh0Var != null) {
                                org.telegram.ui.Components.wz0.a(bitmap, !z10 ? null : this.A0, fh0Var);
                            }
                            view = this.H0;
                            if (view != null && view.getBackground() != null) {
                                this.H0.getBackground().setAlpha(org.telegram.messenger.hs.e4);
                            }
                            this.x0.removeView(this.p0);
                            this.p0 = new org.telegram.ui.Components.wz0(this);
                            org.telegram.ui.Components.ch0 animatedDrawable = fh0Var == null ? fh0Var.getAnimatedDrawable() : null;
                            c2 = 3;
                            this.x0.addView(this.p0, 1, b8.mf.c(-1.0f, -1));
                            this.q0.setVisibility(8);
                            if (fh0Var != null) {
                                org.telegram.ui.Components.wz0 wz0Var = this.p0;
                                ColorFilter colorFilter = animatedDrawable != null ? animatedDrawable.getColorFilter() : null;
                                wz0Var.n = fh0Var;
                                wz0Var.r = colorFilter;
                            }
                            this.p0.setImageBitmap(bitmap);
                            this.p0.setVisibility(0);
                            int i22 = measuredWidth - iArr[0];
                            int i23 = measuredHeight - iArr[1];
                            double sqrt = Math.sqrt((i23 * i23) + (i22 * i22));
                            int i24 = iArr[0];
                            int i25 = measuredHeight - iArr[1];
                            float max = (float) Math.max(sqrt, Math.sqrt((i25 * i25) + (i24 * i24)));
                            int i26 = measuredWidth - iArr[0];
                            int i27 = iArr[1];
                            double sqrt2 = Math.sqrt((i27 * i27) + (i26 * i26));
                            int i28 = iArr[0];
                            int i29 = iArr[1];
                            float max2 = Math.max(max, (float) Math.max(sqrt2, Math.sqrt((i29 * i29) + (i28 * i28))));
                            this.p0.b(iArr[0], iArr[1], booleanValue4);
                            float f10 = max2 / 0.6f;
                            org.telegram.ui.Components.wz0 wz0Var2 = this.p0;
                            org.telegram.ui.Cells.g1 g1Var = org.telegram.ui.Components.wz0.x;
                            float f11 = !booleanValue4 ? 0.0f : f10;
                            if (booleanValue4) {
                                f10 = 0.0f;
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wz0Var2, g1Var, f11, f10);
                            ofFloat.setDuration(450L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.ks.e);
                            ofFloat.addListener(new ei.k3(this, fh0Var, animatedDrawable, i18));
                            if (this.H0 != null) {
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new l60(this, 0));
                                ofFloat2.setDuration(ofFloat.getDuration());
                                ofFloat2.start();
                            }
                            org.telegram.messenger.g0.i3(new m60(this, i12), !booleanValue4 ? (measuredHeight - iArr[1]) / org.telegram.messenger.g0.L(2.25f) : 50L);
                            ofFloat.start();
                        }
                    } else {
                        bitmap = null;
                    }
                    this.x0.addView(this.p0, 1, b8.mf.c(-1.0f, -1));
                    this.q0.setVisibility(8);
                    if (fh0Var != null) {
                    }
                    this.p0.setImageBitmap(bitmap);
                    this.p0.setVisibility(0);
                    int i222 = measuredWidth - iArr[0];
                    int i232 = measuredHeight - iArr[1];
                    double sqrt3 = Math.sqrt((i232 * i232) + (i222 * i222));
                    int i242 = iArr[0];
                    int i252 = measuredHeight - iArr[1];
                    float max3 = (float) Math.max(sqrt3, Math.sqrt((i252 * i252) + (i242 * i242)));
                    int i262 = measuredWidth - iArr[0];
                    int i272 = iArr[1];
                    double sqrt22 = Math.sqrt((i272 * i272) + (i262 * i262));
                    int i282 = iArr[0];
                    int i292 = iArr[1];
                    float max22 = Math.max(max3, (float) Math.max(sqrt22, Math.sqrt((i292 * i292) + (i282 * i282))));
                    this.p0.b(iArr[0], iArr[1], booleanValue4);
                    float f102 = max22 / 0.6f;
                    org.telegram.ui.Components.wz0 wz0Var22 = this.p0;
                    org.telegram.ui.Cells.g1 g1Var2 = org.telegram.ui.Components.wz0.x;
                    if (!booleanValue4) {
                    }
                    if (booleanValue4) {
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(wz0Var22, g1Var2, f11, f102);
                    ofFloat3.setDuration(450L);
                    ofFloat3.setInterpolator(org.telegram.ui.Components.ks.e);
                    ofFloat3.addListener(new ei.k3(this, fh0Var, animatedDrawable, i18));
                    if (this.H0 != null) {
                    }
                    org.telegram.messenger.g0.i3(new m60(this, i12), !booleanValue4 ? (measuredHeight - iArr[1]) / org.telegram.messenger.g0.L(2.25f) : 50L);
                    ofFloat3.start();
                } catch (Throwable th2) {
                    th = th2;
                    org.telegram.messenger.a8.f(th);
                    try {
                        this.p0.setImageDrawable(null);
                        this.x0.removeView(this.p0);
                        uw.y4 = false;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.f(e10);
                    }
                    c10 = 0;
                    org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[c10];
                    boolean booleanValue32 = ((Boolean) objArr[1]).booleanValue();
                    int intValue52 = ((Integer) objArr[c2]).intValue();
                    if (objArr.length > 7) {
                    }
                    actionBarLayout = this.r0;
                    if (actionBarLayout == null) {
                    }
                }
                z10 = false;
                if (bitmap == null) {
                }
                if (bitmap != null) {
                    org.telegram.ui.Components.wz0.a(bitmap, !z10 ? null : this.A0, fh0Var);
                }
                view = this.H0;
                if (view != null) {
                    this.H0.getBackground().setAlpha(org.telegram.messenger.hs.e4);
                }
                this.x0.removeView(this.p0);
                this.p0 = new org.telegram.ui.Components.wz0(this);
                if (fh0Var == null) {
                }
                c2 = 3;
            } catch (Throwable th3) {
                th = th3;
                c2 = 3;
            }
        }
        c10 = 0;
        org.telegram.ui.ActionBar.j6 j6Var22 = (org.telegram.ui.ActionBar.j6) objArr[c10];
        boolean booleanValue322 = ((Boolean) objArr[1]).booleanValue();
        int intValue522 = ((Integer) objArr[c2]).intValue();
        if (objArr.length > 7) {
        }
        actionBarLayout = this.r0;
        if (actionBarLayout == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        if (((org.telegram.ui.wm) r0).ma() != false) goto L63;
     */
    @Override // e0.e, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.d2 Q;
        keyEvent.getKeyCode();
        if ((keyEvent.getKeyCode() != 24 && keyEvent.getKeyCode() != 25) || (Q = Q()) == null || Q.getLastStoryViewer() == null) {
            if (keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
                if (VoIPService.getSharedInstance() == null) {
                    ArrayList arrayList = this.e0;
                    if (!arrayList.isEmpty() && ((!PhotoViewer.F1() || !PhotoViewer.v1().U1()) && keyEvent.getRepeatCount() == 0)) {
                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
                        if (!(d2Var instanceof wm) || org.telegram.ui.ActionBar.d2.hasSheets(d2Var) || !((wm) d2Var).ma()) {
                            if (org.telegram.messenger.g0.Q1()) {
                                ArrayList arrayList2 = this.g0;
                                if (!arrayList2.isEmpty()) {
                                    org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList2);
                                    if (d2Var2 instanceof wm) {
                                        if (!org.telegram.ui.ActionBar.d2.hasSheets(d2Var2)) {
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
        ei.r9 lastStoryViewer = Q.getLastStoryViewer();
        lastStoryViewer.getClass();
        if (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) {
            lastStoryViewer.F(keyEvent);
            return true;
        }
        return true;
    }

    public final void e0() {
        HashSet hashSet;
        o4 o4Var = this.b1;
        if (o4Var != null) {
            org.telegram.messenger.g0.r(o4Var);
            this.b1 = null;
        }
        if (this.R) {
            return;
        }
        this.R = true;
        za.p pVar = this.o1;
        if (pVar != null) {
            pVar.a();
            this.o1 = null;
        }
        za.p pVar2 = this.p1;
        if (pVar2 != null) {
            pVar2.a();
            this.p1 = null;
        }
        p70 p70Var = this.r1;
        if (p70Var == null || (hashSet = org.telegram.messenger.lc.n) == null) {
            return;
        }
        hashSet.remove(p70Var);
    }

    public final void f0(Intent intent, sf.b bVar) {
        super.onNewIntent(intent);
        W(intent, true, false, false, bVar, true, false);
    }

    public final void g0() {
        if (this.b1 != null) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodePause");
            }
            org.telegram.messenger.g0.r(this.b1);
            this.b1 = null;
        }
        if (org.telegram.messenger.az.s.length() != 0) {
            org.telegram.messenger.az.B = (int) (SystemClock.elapsedRealtime() / 1000);
            o4 o4Var = new o4(this, 10);
            this.b1 = o4Var;
            if (org.telegram.messenger.az.x) {
                org.telegram.messenger.g0.i3(o4Var, 1000L);
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("schedule app lock in 1000");
                }
            } else if (org.telegram.messenger.az.y != 0) {
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("schedule app lock in " + ((org.telegram.messenger.az.y * 1000) + 1000));
                }
                org.telegram.messenger.g0.i3(this.b1, (org.telegram.messenger.az.y * 1000) + 1000);
            }
        } else {
            org.telegram.messenger.az.B = 0;
        }
        org.telegram.messenger.az.y();
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final boolean h(org.telegram.ui.ActionBar.d2 d2Var, ActionBarLayout actionBarLayout) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (org.telegram.messenger.g0.Q1()) {
            boolean z10 = d2Var instanceof uw;
            if (z10 || (d2Var instanceof ee0)) {
                boolean z11 = actionBarLayout != this.r0;
                if (z11 && z10 && !((uw) d2Var).t4()) {
                    z11 = false;
                }
                if (z11) {
                    this.r0.a0();
                    this.r0.c(-1, d2Var);
                    this.s0.a0();
                    this.s0.getView().setVisibility(8);
                    if (!this.P0 && this.t0.getFragmentStack().isEmpty()) {
                        this.w0.setVisibility(0);
                    }
                    return false;
                }
            } else {
                if ((d2Var instanceof wm) && !((wm) d2Var).c()) {
                    boolean z12 = this.P0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.t0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.w0.setVisibility(8);
                        this.t0.a0();
                        this.t0.c(-1, d2Var);
                        if (!this.s0.getFragmentStack().isEmpty()) {
                            while (this.s0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.s0;
                                actionBarLayout4.d0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.s0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.r0)) {
                        actionBarLayout2.c(-1, d2Var);
                        if (!this.s0.getFragmentStack().isEmpty()) {
                            while (this.s0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.s0;
                                actionBarLayout5.d0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.s0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.s0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 4) {
                            i3 = -1;
                            break;
                        }
                        if (org.telegram.messenger.h10.i(i3).p()) {
                            break;
                        }
                        i3++;
                    }
                    if ((d2Var instanceof xd0) && i3 == -1) {
                        this.w0.setVisibility(0);
                        this.v0.setBackgroundColor(0);
                    } else {
                        this.v0.setBackgroundColor(2130706432);
                    }
                    this.s0.c(-1, d2Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.b1 != null) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodeResume");
            }
            org.telegram.messenger.g0.r(this.b1);
            this.b1 = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (org.telegram.messenger.az.B != 0) {
            org.telegram.messenger.az.B = 0;
            org.telegram.messenger.az.y();
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        org.telegram.ui.ActionBar.s1 s1Var = this.X0;
        if (s1Var != null) {
            try {
                s1Var.dismiss();
            } finally {
                this.X0 = null;
            }
        }
        this.S0 = null;
        this.T0 = null;
        this.U0 = null;
        this.R0 = null;
        this.V0 = null;
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        }
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
            return true;
        }
        if (!i4.G() || !i4.v().W) {
            return false;
        }
        i4.v().m(true, false);
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
            bundle.putString("selectAlertString", org.telegram.messenger.bd.M0(2131745603, null));
            bundle.putString("selectAlertStringGroup", org.telegram.messenger.bd.M0(2131745604, null));
        } else if (arrayList2.size() != 1) {
            bundle.putString("selectAlertString", org.telegram.messenger.bd.M0(2131745603, null));
            bundle.putString("selectAlertStringGroup", org.telegram.messenger.bd.M0(2131745641, null));
        }
        uw uwVar = new uw(bundle);
        uwVar.D2 = this;
        if (this.S != null || ((arrayList = this.V) != null && !arrayList.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.V;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(wm.W7(this.V, false, null));
            }
            String str2 = this.S;
            if (str2 != null) {
                arrayList3.add(new org.telegram.messenger.ye(0, str2, 0, true, 0, 0));
            }
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(this.U)) {
                    ((org.telegram.messenger.ye) arrayList3.get(0)).a = this.U;
                }
                CharSequence charSequence = this.U;
                if (arrayList3.isEmpty()) {
                    uwVar.E2 = null;
                } else {
                    uwVar.E2 = arrayList3;
                    uwVar.F2 = null;
                    uwVar.N2 = false;
                    if (uwVar.C1 != null) {
                        uwVar.v3(charSequence);
                    } else {
                        uwVar.V3 = charSequence;
                    }
                }
            }
        } else if (!TextUtils.isEmpty(this.U)) {
            CharSequence charSequence2 = this.U;
            int i3 = org.telegram.ui.Components.ro0.J;
            if (charSequence2 != null && charSequence2.length() != 0) {
                try {
                    matcher = org.telegram.messenger.g0.S.matcher(charSequence2);
                } catch (Exception unused) {
                }
                if (matcher.find()) {
                    str = charSequence2.subSequence(matcher.start(), matcher.end()).toString();
                    if (str == null) {
                        uwVar.Q4(this.U, str);
                    } else {
                        CharSequence charSequence3 = this.U;
                        if (charSequence3 == null || charSequence3.length() == 0) {
                            uwVar.G2 = null;
                        } else {
                            uwVar.G2 = charSequence3;
                            uwVar.F2 = null;
                            uwVar.E2 = null;
                            if (uwVar.C1 != null) {
                                uwVar.v3(charSequence3);
                            } else {
                                uwVar.V3 = charSequence3;
                            }
                        }
                    }
                }
            }
            str = null;
            if (str == null) {
            }
        }
        ((ActionBarLayout) M()).V(uwVar, !org.telegram.messenger.g0.Q1() || (actionBarLayout = this.s0) == null ? !(this.r0.getFragmentStack().size() <= 1 || !(this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1) instanceof ee0)) : !(actionBarLayout.getFragmentStack().isEmpty() || !(this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1) instanceof ee0)), !z10);
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(false, true);
        } else if (i4.G() && i4.v().W) {
            i4.v().m(false, true);
        }
        gi.va.w();
        x30 x30Var = x30.v5;
        if (x30Var != null) {
            x30Var.dismiss();
        }
        if (z10 || !org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.r0.X(true, true);
        this.t0.X(true, true);
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
            if (actionBarLayout == this.r0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.n1) {
                e0();
                finish();
                return false;
            }
            if (actionBarLayout == this.t0) {
                if (!this.P0) {
                    this.w0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.s0 && this.r0.getFragmentStack().isEmpty() && this.s0.getFragmentStack().size() == 1) {
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
        xd0 xd0Var = new xd0();
        m60 m60Var = new m60(this, 0);
        xd0Var.G = 3;
        xd0Var.a = 12;
        xd0Var.e0 = m60Var;
        if (password == null || (str = password.login_email_pattern) == null) {
            t0(xd0Var);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        int indexOf = password.login_email_pattern.indexOf(42);
        int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
            ty0Var.a |= 256;
            ty0Var.b = indexOf;
            int i3 = lastIndexOf + 1;
            ty0Var.c = i3;
            valueOf.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), indexOf, i3, 0);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = valueOf;
        s1Var.U = org.telegram.messenger.bd.M0(2131751202, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752548, null), new org.telegram.ui.Components.i41(20, this, xd0Var));
        k2.p1.v(null, 2131752589, alertDialog$Builder, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00ce, code lost:
    
        if (r3.getArguments().getLong("community_id", 0) != 0) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x011c A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.n4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.o4 o4Var) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        ActionBarLayout actionBarLayout4;
        int i3;
        ActionBarLayout actionBarLayout5;
        ActionBarLayout actionBarLayout6;
        org.telegram.ui.ActionBar.d2 d2Var = o4Var.a;
        boolean z10 = o4Var.b;
        boolean z11 = o4Var.c;
        if (i4.G() && i4.v().W) {
            i4.v().m(false, true);
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (d2Var instanceof ee0) {
                ActionBarLayout actionBarLayout7 = this.r0;
                if (actionBarLayout != actionBarLayout7) {
                    actionBarLayout7.a0();
                    org.telegram.ui.ActionBar.q4 M = M();
                    o4Var.b = z10;
                    o4Var.c = z11;
                    o4Var.d = false;
                    ((ActionBarLayout) M).U(o4Var);
                    this.s0.a0();
                    this.s0.getView().setVisibility(8);
                    if (!this.P0 && this.t0.getFragmentStack().isEmpty()) {
                        this.w0.setVisibility(0);
                        return false;
                    }
                    return false;
                }
                if ((!(d2Var instanceof wm) && !((wm) d2Var).c()) || o4Var.g || (actionBarLayout == (actionBarLayout3 = this.t0) && (actionBarLayout3.getFragmentStack().size() > 1 || !(this.t0.getLastFragment() instanceof wm)))) {
                    boolean z12 = this.P0;
                    if ((!z12 && actionBarLayout == this.t0) || (z12 && actionBarLayout == this.r0)) {
                        ActionBarLayout actionBarLayout8 = this.t0;
                        if (actionBarLayout == actionBarLayout8) {
                            if (actionBarLayout8.getView() != null) {
                                this.t0.getView().setVisibility(0);
                            }
                            this.w0.setVisibility(8);
                        }
                        boolean z13 = (this.P0 && actionBarLayout == (actionBarLayout6 = this.r0) && actionBarLayout6.getFragmentStack().size() == 1) ? false : true;
                        if (!this.s0.getFragmentStack().isEmpty()) {
                            while (this.s0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout9 = this.s0;
                                actionBarLayout9.d0(actionBarLayout9.getFragmentStack().get(0), false);
                            }
                            this.s0.l(!z11, false);
                        }
                        if (!z13) {
                            org.telegram.ui.ActionBar.q4 M2 = M();
                            o4Var.c = z11;
                            o4Var.d = false;
                            ((ActionBarLayout) M2).U(o4Var);
                        }
                        return z13;
                    }
                    if (!z12 && actionBarLayout != (actionBarLayout5 = this.t0) && actionBarLayout5 != null) {
                        if (actionBarLayout5.getView() != null) {
                            this.t0.getView().setVisibility(0);
                        }
                        this.w0.setVisibility(8);
                        this.t0.a0();
                        ActionBarLayout actionBarLayout10 = this.t0;
                        o4Var.c = true;
                        o4Var.b = z10;
                        o4Var.d = false;
                        actionBarLayout10.U(o4Var);
                        if (!this.s0.getFragmentStack().isEmpty()) {
                            while (this.s0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout11 = this.s0;
                                actionBarLayout11.d0(actionBarLayout11.getFragmentStack().get(0), false);
                            }
                            this.s0.l(!z11, false);
                            return false;
                        }
                    } else {
                        if (!z12 || actionBarLayout == this.r0) {
                            ActionBarLayout actionBarLayout12 = this.s0;
                            if (actionBarLayout12 != null && actionBarLayout12.getFragmentStack() != null && !this.s0.getFragmentStack().isEmpty()) {
                                while (this.s0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout13 = this.s0;
                                    actionBarLayout13.d0(actionBarLayout13.getFragmentStack().get(0), false);
                                }
                                this.s0.l(!z11, false);
                            }
                            org.telegram.ui.ActionBar.q4 M3 = M();
                            o4Var.b = this.r0.getFragmentStack().size() > 1;
                            o4Var.c = z11;
                            o4Var.d = false;
                            ((ActionBarLayout) M3).U(o4Var);
                            return false;
                        }
                        org.telegram.ui.ActionBar.q4 M4 = M();
                        o4Var.b = this.r0.getFragmentStack().size() > 1;
                        o4Var.c = z11;
                        o4Var.d = false;
                        ((ActionBarLayout) M4).U(o4Var);
                        if (!this.s0.getFragmentStack().isEmpty()) {
                            while (this.s0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout14 = this.s0;
                                actionBarLayout14.d0(actionBarLayout14.getFragmentStack().get(0), false);
                            }
                            this.s0.l(!z11, false);
                        }
                    }
                    return false;
                }
                actionBarLayout4 = this.s0;
                if (actionBarLayout4 != null && actionBarLayout != actionBarLayout4) {
                    actionBarLayout4.getView().setVisibility(0);
                    i3 = 0;
                    while (true) {
                        if (i3 < 4) {
                            i3 = -1;
                            break;
                        }
                        if (org.telegram.messenger.h10.i(i3).p()) {
                            break;
                        }
                        i3++;
                    }
                    if ((d2Var instanceof xd0) || i3 != -1) {
                        this.v0.setBackgroundColor(2130706432);
                    } else {
                        this.w0.setVisibility(0);
                        this.v0.setBackgroundColor(0);
                    }
                    ActionBarLayout actionBarLayout15 = this.s0;
                    o4Var.b = z10;
                    o4Var.c = z11;
                    o4Var.d = false;
                    actionBarLayout15.U(o4Var);
                    return false;
                }
            } else {
                if (d2Var instanceof uw) {
                    uw uwVar = (uw) d2Var;
                    if (uwVar.t4() && actionBarLayout != (actionBarLayout2 = this.r0)) {
                        actionBarLayout2.a0();
                        org.telegram.ui.ActionBar.q4 M5 = M();
                        o4Var.b = z10;
                        o4Var.c = z11;
                        o4Var.d = false;
                        ((ActionBarLayout) M5).U(o4Var);
                        this.s0.a0();
                        this.s0.getView().setVisibility(8);
                        if (!this.P0 && this.t0.getFragmentStack().isEmpty()) {
                            this.w0.setVisibility(0);
                            return false;
                        }
                        return false;
                    }
                    if (actionBarLayout == this.r0) {
                        if (uwVar.getArguments() != null) {
                            if (uwVar.getArguments().getInt("folderId", 0) != 1) {
                            }
                        }
                    }
                }
                if (!(d2Var instanceof wm)) {
                }
                actionBarLayout4 = this.s0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.getView().setVisibility(0);
                    i3 = 0;
                    while (true) {
                        if (i3 < 4) {
                        }
                        i3++;
                    }
                    if (d2Var instanceof xd0) {
                    }
                    this.v0.setBackgroundColor(2130706432);
                    ActionBarLayout actionBarLayout152 = this.s0;
                    o4Var.b = z10;
                    o4Var.c = z11;
                    o4Var.d = false;
                    actionBarLayout152.U(o4Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void l0(final long j10, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i3, final int i10) {
        if (num != null) {
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = org.telegram.messenger.hp.s1(this.P).h1(-j10);
            tL_channels_getMessages.id.add(num);
            ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.h60
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    String str2 = LaunchActivity.E1;
                    org.telegram.messenger.g0.h3(new v60(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i3, i10));
                }
            });
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j10);
        t0(m91.J0(this, bundle));
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void m0(int i3, long j10, TLRPC.TL_error tL_error) {
        wm wmVar = new wm(a1.g.j(j10, "user_id"));
        t0(wmVar);
        org.telegram.messenger.g0.i3(new pp(tL_error, wmVar, org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10)), 13), 300L);
    }

    public final void n0(int i3, String str, String str2, sf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i3).sendRequest(tL_contacts_importContactToken, new cg.j0(this, bVar, s12, i3, str2, 11));
    }

    public final void o0(int i3, String str, String str2, sf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        s12.d2().a(str, null, new ci.i4(this, s12, bVar, i3, str2, 1));
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
        ActionBarLayout actionBarLayout = this.r0;
        org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
        if (kVar != null) {
            kVar.setVisibility(0);
        }
        actionBarLayout.D0 = false;
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = this.t0;
            org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
            if (kVar2 != null) {
                kVar2.setVisibility(0);
            }
            actionBarLayout2.D0 = false;
            ActionBarLayout actionBarLayout3 = this.s0;
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
            if (menu != null && !this.r0.s(menu) && org.telegram.messenger.g0.Q1() && !this.t0.s(menu)) {
                this.s0.s(menu);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (actionMode.getType() == 1) {
            return;
        }
        ActionBarLayout actionBarLayout = this.r0;
        org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
        if (kVar != null) {
            kVar.setVisibility(8);
        }
        actionBarLayout.D0 = true;
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = this.t0;
            org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
            if (kVar2 != null) {
                kVar2.setVisibility(8);
            }
            actionBarLayout2.D0 = true;
            ActionBarLayout actionBarLayout3 = this.s0;
            org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.E;
            if (kVar3 != null) {
                kVar3.setVisibility(8);
            }
            actionBarLayout3.D0 = true;
        }
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, android.app.Activity
    public final void onActivityResult(int i3, int i10, Intent intent) {
        ei.j4 currentPeerView;
        b8.ke keVar;
        VoIPService sharedInstance;
        if (org.telegram.messenger.az.s.length() != 0 && org.telegram.messenger.az.B != 0) {
            org.telegram.messenger.az.B = 0;
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onActivityResult");
            }
            org.telegram.messenger.h10.i(this.P).v(false);
        }
        if (i3 == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.t0.G = canDrawOverlays;
            if (canDrawOverlays) {
                x30 x30Var = x30.v5;
                if (x30Var != null) {
                    x30Var.K();
                }
                org.telegram.messenger.g0.i3(new m60(this, 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i3, i10, intent);
        if (i3 >= 22336 && i3 <= 22399) {
            org.telegram.ui.Wallet.t0 t0Var = b8.vf.b;
            if (t0Var != null && t0Var.e == this && t0Var.f && t0Var.g == i3) {
                t0Var.c(i10 != -1 ? "AUTH_CANCELED" : null);
                return;
            }
            return;
        }
        if (i3 == 520) {
            if (i10 != -1 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
            sharedInstance.createCaptureDevice(true);
            return;
        }
        int i11 = 3;
        if (i3 == 140) {
            Utilities.d.c(new org.telegram.messenger.g10(i11, org.telegram.messenger.ld.f(this.P), i10 == -1));
            return;
        }
        if (i3 == 521) {
            gi.j8 j8Var = this.s1;
            if (j8Var != null) {
                j8Var.a(Boolean.valueOf(i10 == -1));
                this.s1 = null;
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (keVar = themeEditorView.m) != null) {
            keVar.u(i3, i10, intent);
        }
        ActionBarLayout actionBarLayout = this.r0;
        if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
            org.telegram.ui.ActionBar.d2 d2Var = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
            d2Var.onActivityResultFragment(i3, i10, intent);
            if (d2Var.getLastStoryViewer() != null && (currentPeerView = d2Var.getLastStoryViewer().o0.getCurrentPeerView()) != null && i10 == -1) {
                if (i3 == 0 || i3 == 2) {
                    currentPeerView.r0();
                    ei.x2 x2Var = currentPeerView.s2;
                    if (x2Var != null) {
                        x2Var.b2.j0(i3, intent, null);
                    }
                } else if (i3 == 21) {
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
                        ei.x2 x2Var2 = currentPeerView.s2;
                        if (x2Var2 != null) {
                            x2Var2.dismiss();
                        }
                        currentPeerView.i0(true);
                    }
                }
            }
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = this.t0;
            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                this.t0.getFragmentStack().get(this.t0.getFragmentStack().size() - 1).onActivityResultFragment(i3, i10, intent);
            }
            ActionBarLayout actionBarLayout3 = this.s0;
            if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1).onActivityResultFragment(i3, i10, intent);
            }
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.c5, Integer.valueOf(i3), Integer.valueOf(i10), intent);
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        if (d0(true)) {
            if (!org.telegram.messenger.g0.Q1()) {
                this.r0.I();
                return;
            }
            ActionBarLayout actionBarLayout = this.s0;
            if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                this.s0.I();
                return;
            }
            ActionBarLayout actionBarLayout2 = this.t0;
            if (actionBarLayout2 == null || actionBarLayout2.getView().getVisibility() != 0 || this.t0.getFragmentStack().isEmpty()) {
                this.r0.I();
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = this.t0.getFragmentStack().get(this.t0.getFragmentStack().size() - 1);
            if (d2Var.onBackPressed(true)) {
                d2Var.finishFragment();
            }
        }
    }

    @Override // androidx.activity.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.g0.v(this, configuration);
        this.v1.a();
        org.telegram.messenger.g0.x3(getWindow());
        super.onConfigurationChanged(configuration);
        this.o0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        org.telegram.messenger.g0.d3();
        a0();
        E();
        org.telegram.messenger.g0.h3(new m60(this, 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            int i3 = pipRoundVideoView.y.getInt("sidex", 1);
            int i10 = pipRoundVideoView.y.getInt("sidey", 0);
            float f10 = pipRoundVideoView.y.getFloat("px", 0.0f);
            float f11 = pipRoundVideoView.y.getFloat("py", 0.0f);
            pipRoundVideoView.w.x = PipRoundVideoView.b(f10, i3, pipRoundVideoView.h, true);
            pipRoundVideoView.w.y = PipRoundVideoView.b(f11, i10, pipRoundVideoView.n, false);
            pipRoundVideoView.x.updateViewLayout(pipRoundVideoView.a, pipRoundVideoView.w);
        }
        org.telegram.ui.Components.ut utVar = org.telegram.ui.Components.ut.K1;
        if (utVar != null) {
            utVar.c0(configuration);
        }
        xg.n nVar = xg.n.m1;
        if (nVar != null) {
            nVar.c0(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.V8;
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            int i11 = themeEditorView.l.getInt("sidex", 1);
            int i12 = themeEditorView.l.getInt("sidey", 0);
            float f12 = themeEditorView.l.getFloat("px", 0.0f);
            float f13 = themeEditorView.l.getFloat("py", 0.0f);
            themeEditorView.i.x = ThemeEditorView.c(f12, i11, themeEditorView.g, true);
            themeEditorView.i.y = ThemeEditorView.c(f13, i12, themeEditorView.h, false);
            try {
                if (themeEditorView.c.getParent() != null) {
                    themeEditorView.j.updateViewLayout(themeEditorView.c, themeEditorView.i);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (org.telegram.ui.ActionBar.k6.o == 3) {
            org.telegram.ui.ActionBar.k6.F(false);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.v, androidx.activity.l, e0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        v9.b bVar;
        String str2;
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        G1 = true;
        H1++;
        boolean z10 = org.telegram.messenger.r2.a;
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        K1 = this;
        org.telegram.messenger.t0.w();
        org.telegram.messenger.g0.v(this, getResources().getConfiguration());
        this.P = org.telegram.messenger.h10.t0;
        this.h1 = new androidx.mediarouter.app.f(this, 11);
        IntentFilter intentFilter = new IntentFilter("org.telegram.messenger.DEBUG_THEME");
        int i3 = 2;
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.h1, intentFilter, 2);
        } else {
            registerReceiver(this.h1, intentFilter);
        }
        if (!org.telegram.messenger.h10.i(this.P).p() && (intent = getIntent()) != null && intent.getAction() != null) {
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
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.q6(1));
        getWindow().setFormat(-1);
        org.telegram.messenger.n6 n6Var = new org.telegram.messenger.n6(getWindow(), new org.telegram.ui.Components.lf0(29));
        this.g1 = n6Var;
        n6Var.a();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            org.telegram.messenger.g0.E = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.k6.P();
        org.telegram.ui.ActionBar.k6.T(this);
        if (org.telegram.messenger.az.s.length() != 0 && org.telegram.messenger.az.x) {
            org.telegram.messenger.az.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        this.r0 = new ActionBarLayout(this, true);
        l0 l0Var = new l0(12, this, this);
        this.x0 = l0Var;
        l0Var.setClipToPadding(false);
        this.x0.setClipChildren(false);
        setContentView(this.x0);
        this.i1 = new sh.d(this.x0);
        n80 n80Var = new n80(this);
        l2.e eVar = this.n0;
        ((uf.b) eVar.b).a.add(n80Var);
        ((ViewGroup) getWindow().getDecorView()).addView(eVar.h());
        eVar.h().bringToFront();
        org.telegram.ui.Components.wz0 wz0Var = new org.telegram.ui.Components.wz0(this);
        this.p0 = wz0Var;
        wz0Var.setVisibility(8);
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3(this);
        this.A0 = l3Var;
        l3Var.setActionBarLayout(this.r0);
        this.A0.addOnLayoutChangeListener(new o80());
        this.A0.setClipChildren(false);
        this.A0.setClipToPadding(false);
        this.x0.addView(this.A0, b8.mf.c(-1.0f, -1));
        lg.k kVar = new lg.k(this, 5);
        this.q0 = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER);
        this.x0.addView(this.q0, b8.mf.c(48.0f, 48));
        this.q0.setVisibility(8);
        l0 l0Var2 = this.x0;
        org.telegram.ui.ActionBar.j3 j3Var = new org.telegram.ui.ActionBar.j3(this);
        this.z0 = j3Var;
        l0Var2.addView(j3Var);
        l0 l0Var3 = this.x0;
        p80 p80Var = new p80(this);
        p80Var.setVisibility(8);
        this.y0 = p80Var;
        l0Var3.addView(p80Var);
        E0();
        this.A0.setParentActionBarLayout(this.r0);
        this.r0.setDrawerLayoutContainer(this.A0);
        this.r0.setFragmentStack(this.e0);
        this.r0.setFragmentStackChangedListener(new m60(this, 3));
        this.r0.setDelegate(this);
        org.telegram.ui.ActionBar.k6.o1(true);
        A();
        Q0();
        int i10 = org.telegram.messenger.hs.k4;
        org.telegram.messenger.hs.e().k(i10, this);
        this.d0 = ConnectionsManager.getInstance(this.P).getConnectionState();
        za.p pVar = this.p1;
        if (pVar != null) {
            pVar.a();
            this.p1 = null;
        }
        za.p pVar2 = new za.p(org.telegram.messenger.hs.e(), this);
        pVar2.b(org.telegram.messenger.hs.M0);
        pVar2.b(org.telegram.messenger.hs.x4);
        pVar2.b(org.telegram.messenger.hs.y4);
        pVar2.b(org.telegram.messenger.hs.n4);
        pVar2.b(org.telegram.messenger.hs.t4);
        pVar2.b(org.telegram.messenger.hs.r4);
        pVar2.b(i10);
        pVar2.b(org.telegram.messenger.hs.n0);
        pVar2.b(org.telegram.messenger.hs.z4);
        pVar2.b(org.telegram.messenger.hs.K4);
        pVar2.b(org.telegram.messenger.hs.P4);
        pVar2.b(org.telegram.messenger.hs.n5);
        pVar2.b(org.telegram.messenger.hs.k5);
        pVar2.b(org.telegram.messenger.hs.M5);
        pVar2.b(org.telegram.messenger.hs.N5);
        this.p1 = pVar2;
        p70 p70Var = new p70(this, objArr2 == true ? 1 : 0);
        this.r1 = p70Var;
        org.telegram.messenger.lc.a(p70Var);
        if (this.r0.getFragmentStack().isEmpty() && ((actionBarLayout = this.s0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (org.telegram.messenger.h10.i(this.P).p()) {
                this.r0.c(-1, new ee0());
            } else {
                this.r0.c(-1, P());
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
                                    this.r0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.r0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    wm wmVar = new wm(bundle2);
                                    if (this.r0.c(-1, wmVar)) {
                                        wmVar.m8 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    y40 y40Var = new y40(bundle2);
                                    if (this.r0.c(-1, y40Var)) {
                                        y40Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    ad adVar = new ad(bundle2);
                                    if (this.r0.c(-1, adVar)) {
                                        adVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", org.telegram.messenger.h10.i(this.P).n);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.r0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.r0.c(-1, new c31(null));
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        E();
        F(false, true, !this.Y0);
        W(getIntent(), false, bundle != null, false, null, true, true);
        try {
            String str3 = Build.DISPLAY;
            String str4 = Build.USER;
            String lowerCase2 = str3 != null ? str3.toLowerCase() : "";
            String lowerCase3 = str4 != null ? lowerCase2.toLowerCase() : "";
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("OS name " + lowerCase2 + " " + lowerCase3);
            }
            if ((lowerCase2.contains("flyme") || lowerCase3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                org.telegram.messenger.g0.y = true;
                View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                s70 s70Var = new s70(rootView, objArr == true ? 1 : 0);
                this.h0 = s70Var;
                viewTreeObserver.addOnGlobalLayoutListener(s70Var);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        MediaController.B().K0 = this;
        ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).getClass();
        try {
            boolean z11 = org.telegram.messenger.r2.a;
            str = "" + org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n;
            if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f() != null) {
                String n4 = org.telegram.messenger.l10.n(org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f());
                if (!TextUtils.isEmpty(n4)) {
                    str = "@" + n4;
                }
            }
            if (ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).isTestBackend()) {
                str = str + " [TEST SERVER]";
            }
            bVar = (v9.b) n9.h.c().b(v9.b.class);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        if (bVar == null) {
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        }
        z9.p pVar3 = bVar.a;
        pVar3.n.a.a(new xh.i(i3, pVar3, str));
        bVar.b("version", "public");
        bVar.b("model", Build.MODEL);
        bVar.b("manufacturer", Build.MANUFACTURER);
        if (Build.VERSION.SDK_INT >= 31) {
            str2 = Build.SOC_MODEL;
            bVar.b("soc_model", str2);
            bVar.b("soc_manufacturer", Build.SOC_MANUFACTURER);
        }
        bVar.b("device", Build.DEVICE);
        bVar.b("product", Build.PRODUCT);
        bVar.b("hardware", Build.HARDWARE);
        bVar.b("user", Build.USER);
        bVar.a();
        int i11 = Build.VERSION.SDK_INT;
        org.telegram.messenger.sr.b(true);
        if (i11 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - org.telegram.messenger.sr.j.getLong("last_checked", 0L) >= 86400000 && org.telegram.messenger.sr.j.getInt("dismissed_count", 0) < 3) {
            Pattern pattern = org.telegram.ui.Components.t4.a;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String M0 = org.telegram.messenger.bd.M0(2131754283, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(org.telegram.messenger.sr.j() ? i11 >= 31 ? 2131754281 : 2131754280 : 2131754282, null));
            int i12 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new org.telegram.ui.Components.x0(this, i3));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
            s1Var.setOnDismissListener(new gi.d1(3));
            s1Var.show();
            org.telegram.messenger.sr.j.edit().putLong("last_checked", System.currentTimeMillis()).apply();
        }
        if (i11 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new q80(this));
        }
        org.telegram.ui.Components.ac.a(this.x0, new ai.y(11));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        Window window = getWindow();
        try {
            org.telegram.messenger.g0.S(window);
            if (i11 >= 28) {
                window.setNavigationBarDividerColor(0);
            }
        } catch (Throwable th3) {
            org.telegram.messenger.a8.g(th3, true);
        }
        BackupAgent.a();
        gy0.a0(false);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            if (this.l1 == null) {
                this.l1 = new r80(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.l1);
        } else if (i13 >= 33) {
            if (this.m1 == null) {
                this.m1 = new s80(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.m1);
        }
        B();
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        cg.a0 a0Var;
        l0 l0Var;
        org.telegram.ui.Wallet.t0 t0Var = b8.vf.b;
        if (t0Var != null && t0Var.e == this) {
            t0Var.c("AUTH_CANCELED");
            b8.vf.b.e();
        }
        G1 = false;
        H1--;
        androidx.mediarouter.app.f fVar = this.h1;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.h1 = null;
        }
        if (H1 == 0) {
            if (PhotoViewer.c9 != null) {
                PhotoViewer.c9.Q0();
            }
            if (PhotoViewer.F1()) {
                PhotoViewer.v1().Q0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f10 = SecretMediaViewer.f();
                Runnable runnable = f10.o1;
                if (runnable != null) {
                    runnable.run();
                    f10.o1 = null;
                }
                cg.u0 u0Var = f10.k1;
                if (u0Var != null) {
                    u0Var.b();
                    f10.k1 = null;
                }
                org.telegram.messenger.hs.f(f10.a).n(f10, org.telegram.messenger.hs.w);
                org.telegram.messenger.hs.f(f10.a).n(f10, org.telegram.messenger.hs.l0);
                org.telegram.messenger.hs.f(f10.a).n(f10, org.telegram.messenger.hs.i0);
                f10.s = false;
                f10.M = null;
                org.telegram.messenger.cc ccVar = f10.h0;
                if (ccVar != null) {
                    ccVar.a();
                    f10.h0 = null;
                }
                f10.j();
                if (f10.b != null && (l0Var = f10.d) != null) {
                    try {
                        if (l0Var.getParent() != null) {
                            ((WindowManager) f10.b.getSystemService("window")).removeViewImmediate(f10.d);
                        }
                        f10.d = null;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                SecretMediaViewer.w1 = null;
            }
            if (i4.G()) {
                i4.v().r();
            }
            if (is.g0 != null) {
                is p10 = is.p();
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
                    is.g0 = null;
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 8);
                }
            }
            x30 x30Var = x30.v5;
            if (x30Var != null) {
                x30Var.K();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i3 = org.telegram.ui.ActionBar.k6.a;
            org.telegram.ui.Components.ut utVar = org.telegram.ui.Components.ut.K1;
            if (utVar != null) {
                utVar.I0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.b();
            }
            qg.h hVar = n9.b.a;
            if (hVar != null) {
                hVar.e.edit().putFloat("x", (float) hVar.c.m.i).putFloat("y", (float) hVar.d.m.i).commit();
            }
            n9.b.a = null;
            SparseArray sparseArray = org.telegram.ui.Components.g5.r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController B = MediaController.B();
        if (B.K0 == this) {
            B.K0 = null;
        }
        MediaController B2 = MediaController.B();
        if (B2.L0 == this.u1) {
            B2.L0 = null;
        }
        for (int i10 = 0; i10 < this.F0.size(); i10++) {
            try {
                if (((Dialog) this.F0.get(i10)).isShowing()) {
                    ((Dialog) this.F0.get(i10)).dismiss();
                }
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        this.F0.clear();
        try {
            if (this.h0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.h0);
            }
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (this.l1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.l1);
            }
        } else if (i11 >= 33 && this.l1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.m1);
        }
        org.telegram.ui.Components.ac.h(this.x0);
        VideoAds.dropCache();
        I();
        super.onDestroy();
        e0();
        org.telegram.messenger.n6 n6Var = this.g1;
        if (n6Var != null) {
            n6Var.e();
        }
        if (i11 < 24 || (a0Var = this.k1) == null) {
            return;
        }
        a0Var.c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (i3 == 82 && !org.telegram.messenger.az.C) {
            if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                return super.onKeyUp(i3, keyEvent);
            }
            if (i4.G() && i4.v().W) {
                return super.onKeyUp(i3, keyEvent);
            }
            if (!org.telegram.messenger.g0.Q1()) {
                this.r0.getView().onKeyUp(i3, keyEvent);
            } else if (this.s0.getView().getVisibility() == 0 && !this.s0.getFragmentStack().isEmpty()) {
                this.s0.getView().onKeyUp(i3, keyEvent);
            } else if (this.t0.getView().getVisibility() != 0 || this.t0.getFragmentStack().isEmpty()) {
                this.r0.getView().onKeyUp(i3, keyEvent);
            } else {
                this.t0.getView().onKeyUp(i3, keyEvent);
            }
        }
        return super.onKeyUp(i3, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.r0;
        if (actionBarLayout != null) {
            actionBarLayout.M();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.t0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.M();
                }
                ActionBarLayout actionBarLayout3 = this.s0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
            }
        }
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        org.telegram.messenger.g0.E = z10;
        this.v1.a();
        E();
        super.onMultiWindowModeChanged(z10);
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        W(intent, true, false, false, null, true, true);
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onPause() {
        VoIPService sharedInstance;
        super.onPause();
        I1 = false;
        org.telegram.utils.twidget.p.q(true);
        uf.b bVar = this.o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (org.telegram.messenger.g0.H1(bVar.d) && bVar.e() && Build.VERSION.SDK_INT >= 31) {
            bVar.b();
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, Integer.valueOf(TLObject.FLAG_12));
        org.telegram.messenger.t0.x = true;
        Utilities.d.c(new ii.i2(this.P, 12));
        g0();
        this.r0.O();
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout = this.t0;
            if (actionBarLayout != null) {
                actionBarLayout.O();
            }
            ActionBarLayout actionBarLayout2 = this.s0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.O();
            }
        }
        org.telegram.ui.Components.bc0 bc0Var = this.B0;
        if (bc0Var != null) {
            bc0Var.b.k();
        }
        ArrayList arrayList = this.C0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((org.telegram.ui.Components.zb0) obj).k();
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            if (v12.k2 != null) {
                v12.H0(false, false);
            } else {
                org.telegram.ui.Components.m51 m51Var = v12.G2;
                if (m51Var != null && v12.a3) {
                    m51Var.s0(org.telegram.messenger.g0.H1(v12.E));
                }
            }
        }
        gi.va vaVar = gi.va.G2;
        if (vaVar != null) {
            vaVar.u(false);
            gi.la laVar = vaVar.d1;
            if (laVar != null) {
                laVar.f.r();
            }
            gi.ja jaVar = vaVar.Y0;
            if (jaVar != null) {
                jaVar.x(0, true);
            }
        }
        zb1 zb1Var = zb1.o1;
        if (zb1Var != null) {
            boolean isInteractive = ((PowerManager) zb1Var.b.getSystemService("power")).isInteractive();
            int a10 = xf.b.a(zb1Var.b);
            boolean z10 = a10 > 0;
            if (zb1Var.E0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a10 == 2) {
                int measuredHeight = zb1.o1.v0.getMeasuredHeight();
                zb1 zb1Var2 = zb1.o1;
                org.telegram.ui.Components.voip.u1.e(zb1Var2.b, zb1Var2.a, zb1Var2.v0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = zb1.o1.s0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.u1.Y = windowInsets.getSystemWindowInsetTop();
                    zb1.o1.s0.getSystemWindowInsetBottom();
                }
            }
            if (zb1Var.o0 && ((!z10 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                org.telegram.ui.Components.voip.u1 d = org.telegram.ui.Components.voip.u1.d();
                if (d.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (d.H) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = yh.e.n;
        if (hashMap == null) {
            return;
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            yh.d dVar = ((yh.e) it.next()).f;
            if (dVar != null) {
                dVar.b = true;
            }
        }
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        uf.b bVar = this.o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (bVar.f) {
            if (z10) {
                bVar.d(1.0f);
                bVar.j.a();
                ArrayList arrayList = bVar.b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((wf.e) obj).getClass();
                }
                if (bVar.n) {
                    bVar.n = false;
                    bVar.l.removeFrameCallback(bVar.m);
                }
                ArrayList arrayList2 = bVar.a;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    ((vf.b) obj2).f();
                }
            } else if (bVar.e) {
                bVar.c(false);
            } else {
                bVar.a(true);
            }
        }
        if (z10 || this.t1) {
            return;
        }
        if (org.telegram.ui.Components.voip.s0.e0.W) {
            org.telegram.ui.Components.voip.s0.b();
        }
        if (ei.n1.a0.T) {
            ei.n1.b();
        }
        if (org.telegram.ui.Components.ie0.q0.Q) {
            org.telegram.ui.Components.ie0.b(false);
        }
        x30.v1(this, null, false, true);
        if (PhotoViewer.c9 != null) {
            PhotoViewer.c9.Q0();
        }
        if (PhotoViewer.F1()) {
            PhotoViewer.v1().H0(false, false);
        }
    }

    @Override // android.app.Activity
    public final boolean onPictureInPictureRequested() {
        uf.b bVar = this.o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        bVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.o0.g(pictureInPictureUiState);
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        cg.l0 l0Var;
        super.onRequestPermissionsResult(i3, strArr, iArr);
        if (u(i3, strArr, iArr)) {
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
            if (this.r0.getFragmentStack().size() != 0) {
                this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i3, strArr, iArr);
            }
            if (org.telegram.messenger.g0.Q1()) {
                if (this.t0.getFragmentStack().size() != 0) {
                    this.t0.getFragmentStack().get(this.t0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i3, strArr, iArr);
                }
                if (this.s0.getFragmentStack().size() != 0) {
                    this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i3, strArr, iArr);
                }
            }
            zb1.k(iArr, i3);
            gi.va vaVar = gi.va.G2;
            int i10 = 2;
            int i11 = 0;
            if (vaVar != null) {
                ei.b bVar = vaVar.a;
                Activity activity = vaVar.b;
                boolean z10 = iArr != null && iArr.length == 1 && iArr[0] == 0;
                if (i3 == 111) {
                    vaVar.t2 = !z10;
                    if (z10 && vaVar.g0 == 0) {
                        vaVar.B0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            vaVar.q();
                        } else {
                            CameraController.getInstance().initCamera(new gi.v8(vaVar, i11));
                        }
                    }
                } else if (i3 == 114) {
                    if (z10) {
                        MediaController.O(0);
                        vaVar.e(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                        int i12 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
                        alertDialog$Builder.n(i12, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747307, null));
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.U = X2;
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new gi.e9(vaVar, i10));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                        s1Var.show();
                    }
                } else if (i3 == 112) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, activity, bVar);
                        int i13 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.x0(null, i13, false), null);
                        alertDialog$Builder2.n(i13, null);
                        SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747317, null));
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                        s1Var2.U = X22;
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747308, null), new gi.e9(vaVar, 3));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                        s1Var2.show();
                    }
                } else if (i3 == 115) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, activity, bVar);
                        int i14 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.k6.x0(null, i14, false), null);
                        alertDialog$Builder3.n(i14, null);
                        SpannableStringBuilder X23 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747321, null));
                        org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
                        s1Var3.U = X23;
                        alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131747308, null), new gi.e9(vaVar, 5));
                        alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                        s1Var3.show();
                    }
                    if (z10 && (l0Var = vaVar.z2) != null) {
                        l0Var.run();
                    }
                    vaVar.z2 = null;
                }
            }
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.d5, Integer.valueOf(i3), strArr, iArr);
            SparseIntArray sparseIntArray = this.d1;
            if (sparseIntArray.get(i3, -1) >= 0) {
                int i15 = sparseIntArray.get(i3, -1);
                sparseIntArray.delete(i3);
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.o5, Integer.valueOf(i15));
            }
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.p5, Integer.valueOf(i3), strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onResume() {
        org.telegram.messenger.zi ziVar;
        tg.s0 s0Var;
        org.telegram.messenger.pe peVar;
        super.onResume();
        int i3 = 0;
        org.telegram.utils.twidget.p.q(false);
        I1 = true;
        uf.b bVar = this.o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (bVar.f) {
            bVar.a(false);
        }
        org.telegram.ui.Components.nt ntVar = J1;
        if (ntVar != null) {
            ntVar.run();
            J1 = null;
        }
        int i10 = 3;
        if (org.telegram.ui.ActionBar.k6.o == 3) {
            org.telegram.ui.ActionBar.k6.F(false);
        }
        org.telegram.messenger.ld[] ldVarArr = org.telegram.messenger.ld.P;
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            }
            if (org.telegram.messenger.h10.i(i11).p() && !org.telegram.messenger.ld.f(i11).J.isEmpty()) {
                org.telegram.messenger.ld.q();
                break;
            }
            i11++;
        }
        H(true);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, Integer.valueOf(TLObject.FLAG_12));
        MediaController B = MediaController.B();
        ViewGroup view = this.r0.getView();
        this.u1 = view;
        B.L0 = view;
        org.telegram.messenger.t0.x = false;
        org.telegram.messenger.hp.s1(this.P).T4(null);
        I0();
        Utilities.d.c(new org.telegram.ui.Components.go(20));
        C(0);
        if (Build.VERSION.SDK_INT >= 24 && (peVar = MediaController.b2) != null) {
            Utilities.e.e(new ii.i2(peVar.e.size(), i10), 2000L);
        }
        h0();
        org.telegram.ui.Components.bc0 bc0Var = this.B0;
        if (bc0Var == null || bc0Var.b.getVisibility() != 0) {
            this.r0.P();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.t0;
                if (actionBarLayout != null) {
                    actionBarLayout.P();
                }
                ActionBarLayout actionBarLayout2 = this.s0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.P();
                }
            }
        } else {
            this.r0.n();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout3 = this.t0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.n();
                }
                ActionBarLayout actionBarLayout4 = this.s0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.n();
                }
            }
            this.B0.b.l();
            ArrayList arrayList = this.C0;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                ((org.telegram.ui.Components.zb0) obj).l();
            }
        }
        ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        Q0();
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            gq0 gq0Var = v12.f0;
            if (gq0Var != null) {
                gq0Var.invalidate();
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.o2(v12, i3, 22), 100L);
            }
            org.telegram.ui.Components.m51 m51Var = v12.G2;
            if (m51Var != null) {
                m51Var.p0(m51Var.S() + 1);
                if (v12.a3) {
                    v12.G2.s0(true);
                }
            }
            lp0 lp0Var = v12.M1;
            if (lp0Var != null && (s0Var = lp0Var.G0.d) != null) {
                s0Var.postRunnable(s0Var.x);
            }
        }
        gi.va vaVar = gi.va.G2;
        if (vaVar != null) {
            vaVar.O();
        }
        if (PipRoundVideoView.G != null && MediaController.B().H() && (ziVar = MediaController.B().v0) != null) {
            MediaController.B().i0(ziVar, ziVar.b0);
        }
        if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).a0 != null) {
            int i13 = org.telegram.messenger.h10.t0;
            L0(i13, org.telegram.messenger.h10.i(i13).a0);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.az.j1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(org.telegram.messenger.h10.t0, tL_help_appUpdate, true);
            }
        }
        z(false);
        org.telegram.messenger.t0.G = Settings.canDrawOverlays(this);
        zb1 zb1Var = zb1.o1;
        if (zb1Var != null) {
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                org.telegram.ui.Components.voip.u1.a();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                zb1Var.G();
            } else if (VoIPService.getSharedState() == null) {
                zb1Var.v0.b();
            }
            zb1Var.K0 = ((KeyguardManager) zb1Var.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                org.telegram.ui.Components.voip.u1.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        a0();
        HashMap hashMap = yh.e.n;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                yh.d dVar = ((yh.e) it.next()).f;
                if (dVar != null) {
                    dVar.b = false;
                }
            }
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        b0 b0Var = M1;
        if (b0Var != null) {
            b0Var.run();
            M1 = null;
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.P);
        if (s12.T3.contains("SETUP_LOGIN_EMAIL") || s12.T3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            Utilities.d.c(new org.telegram.messenger.mj(org.telegram.messenger.hp.s1(this.P), 26));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x000e, B:9:0x0018, B:11:0x00a5, B:15:0x00b3, B:16:0x011b, B:20:0x00bc, B:23:0x00c2, B:24:0x00cb, B:26:0x00cf, B:27:0x00d5, B:29:0x00d9, B:31:0x00e2, B:32:0x00e8, B:35:0x00f2, B:36:0x00fb, B:39:0x0101, B:41:0x0109, B:42:0x0112, B:44:0x0116, B:46:0x0034, B:48:0x0038, B:50:0x0042, B:51:0x005a, B:53:0x0066, B:55:0x007e, B:57:0x008a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.l, e0.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        org.telegram.ui.ActionBar.d2 d2Var;
        try {
            super.onSaveInstanceState(bundle);
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.s0;
                if (actionBarLayout == null || actionBarLayout.getFragmentStack().isEmpty()) {
                    ActionBarLayout actionBarLayout2 = this.t0;
                    if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            d2Var = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
                        }
                        d2Var = null;
                    } else {
                        d2Var = this.t0.getFragmentStack().get(this.t0.getFragmentStack().size() - 1);
                    }
                } else {
                    d2Var = this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1);
                }
                if (d2Var != null) {
                    Bundle arguments = d2Var.getArguments();
                    if ((d2Var instanceof wm) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "chat");
                    } else if ((d2Var instanceof y40) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "group");
                    } else if (d2Var instanceof WallpapersListActivity) {
                        bundle.putString("fragment", "wallpapers");
                    } else if (d2Var instanceof ProfileActivity) {
                        ProfileActivity profileActivity = (ProfileActivity) d2Var;
                        if (profileActivity.v4()) {
                            bundle.putString("fragment", "settings");
                        } else if (profileActivity.f1 != 0 && arguments != null) {
                            bundle.putBundle("args", arguments);
                            bundle.putString("fragment", "chat_profile");
                        }
                    } else if ((d2Var instanceof ad) && arguments != null && arguments.getInt("step") == 0) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "channel");
                    } else if (d2Var instanceof c31) {
                        bundle.putString("fragment", "settings2");
                    }
                    d2Var.saveSelfArgs(bundle);
                    return;
                }
                return;
            }
            if (!this.r0.getFragmentStack().isEmpty()) {
                d2Var = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
                if (d2Var != null) {
                }
            }
            d2Var = null;
            if (d2Var != null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.t1 = true;
        this.o0.h();
        WeakReference weakReference = sf.c.e;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (activity != null && activity != this) {
            sf.c.y(activity);
        }
        if (sf.c.b == null) {
            sf.c.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(sf.c.d)) {
                    String a10 = b8.t1.a(this);
                    sf.c.d = a10;
                    if (a10 == null) {
                    }
                }
                sf.a aVar = new sf.a();
                bg.a aVar2 = new bg.a();
                aVar2.b = new WeakReference(aVar);
                sf.c.c = aVar2;
                String str = sf.c.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, aVar2, 33)) {
                    sf.c.c = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.t0.y = false;
        org.telegram.ui.Components.l10.j(this);
        x30 x30Var = x30.v5;
        if (x30Var != null) {
            ArrayList arrayList = x30Var.R3;
            x30.A5 = false;
            x30Var.H1.f();
            q10 q10Var = x30Var.e4;
            if (q10Var.getVisibility() == 0) {
                x30Var.h4.G(q10Var, false);
            }
            if (x30.y5) {
                x30Var.g4.I(x30Var.f4, false);
            }
            arrayList.clear();
            arrayList.addAll(x30Var.Q3);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(true);
            }
            d30 d30Var = x30Var.D1;
            org.telegram.ui.Components.q61 q61Var = d30Var.w;
            if (q61Var != null) {
                q61Var.c(true);
            }
            d30Var.G = false;
            x30Var.z1.s();
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onStop() {
        tp0 tp0Var;
        super.onStop();
        org.telegram.ui.Wallet.t0 t0Var = b8.vf.b;
        if (t0Var != null && t0Var.e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.t0 t0Var2 = b8.vf.b;
            if (!t0Var2.f) {
                t0Var2.c("AUTH_CANCELED");
                b8.vf.b.e();
            }
        }
        this.t1 = false;
        uf.b bVar = this.o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        bVar.e = false;
        if (bVar.f) {
            bVar.c(true);
        }
        bVar.d.unregisterReceiver(bVar.o);
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            if (!org.telegram.messenger.g0.H1(v12.E) && (v12.G2 == null ? !((tp0Var = v12.g0) == null || !tp0Var.y || !tp0Var.H) : v12.Q3)) {
                v12.k2();
            }
        }
        sf.c.y(this);
        org.telegram.messenger.t0.y = true;
        org.telegram.ui.Components.l10.j(this);
        x30 x30Var = x30.v5;
        if (x30Var != null) {
            x30.A5 = true;
            ArrayList arrayList = x30Var.R3;
            arrayList.clear();
            arrayList.addAll(x30Var.Q3);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(false);
            }
            d30 d30Var = x30Var.D1;
            org.telegram.ui.Components.q61 q61Var = d30Var.w;
            if (q61Var != null) {
                q61Var.c(false);
            }
            d30Var.G = true;
            x30Var.z1.r();
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.j1 = false;
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        uf.b bVar = this.o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        bVar.f();
        ArrayList arrayList = this.c1;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.r0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.V0.isEmpty()) {
                ((org.telegram.ui.ActionBar.d2) t4.c.d(1, actionBarLayout.V0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.r rVar = actionBarLayout.H;
            if (rVar != null) {
                rVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z10) {
        boolean z11;
        ei.i7 a10;
        long[] jArr2 = jArr;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr2.length) {
                z11 = true;
                break;
            }
            TLRPC.User a22 = org.telegram.messenger.hp.s1(this.P).a2(Long.valueOf(jArr2[i3]));
            if (a22 != null && !a22.stories_hidden) {
                z11 = false;
                break;
            }
            i3++;
        }
        org.telegram.ui.ActionBar.d2 Q = Q();
        if (Q == null) {
            return;
        }
        ei.z6 P1 = org.telegram.messenger.hp.s1(this.P).P1();
        ArrayList arrayList = new ArrayList(z11 ? P1.h : P1.g);
        boolean z12 = z11;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!z12) {
            ArrayList arrayList4 = new ArrayList();
            for (int i10 = 0; i10 < jArr2.length; i10++) {
                TLRPC.User a23 = org.telegram.messenger.hp.s1(this.P).a2(Long.valueOf(jArr2[i10]));
                if (a23 == null || !a23.stories_hidden) {
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
            for (int i12 = 0; i12 < jArr2.length; i12 = a1.g.h(i12, 1, jArr2[i12], arrayList3)) {
            }
        } else {
            for (int i13 = 0; i13 < jArr2.length; i13 = a1.g.h(i13, 1, jArr2[i13], arrayList2)) {
            }
        }
        if (!arrayList3.isEmpty() && z10) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.P);
            int[] iArr = {arrayList3.size()};
            pp ppVar = new pp(this, iArr, jArr2, 17);
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                long longValue = ((Long) arrayList3.get(i14)).longValue();
                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                TLRPC.InputPeer j12 = s12.j1(longValue);
                tL_stories_getPeerStories.peer = j12;
                if (j12 instanceof TLRPC.TL_inputPeerEmpty) {
                    iArr[0] = iArr[0] - 1;
                } else {
                    ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getPeerStories, new ci.u2(s12, longValue, ppVar, 6));
                }
            }
            return;
        }
        long e10 = org.telegram.messenger.h10.i(this.P).e();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            long o10 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer);
            if (o10 != e10 && !arrayList2.contains(Long.valueOf(o10)) && P1.L(o10)) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (Q instanceof uw) {
            try {
                a10 = ei.i7.a(((uw) Q).F0.h);
            } catch (Exception unused) {
            }
            ei.i7 i7Var = a10;
            Q.getOrCreateStoryViewer().J();
            Q.getOrCreateStoryViewer().U(this, null, arrayList2, 0, null, null, i7Var, false);
        }
        a10 = null;
        ei.i7 i7Var2 = a10;
        Q.getOrCreateStoryViewer().J();
        Q.getOrCreateStoryViewer().U(this, null, arrayList2, 0, null, null, i7Var2, false);
    }

    public final void q0(final int i3, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        ei.r6 r6Var;
        ei.r6 A;
        org.telegram.messenger.zi f10;
        org.telegram.messenger.zi f11;
        TL_stories.StoryItem storyItem2;
        ei.z6 P1 = org.telegram.messenger.hp.s1(this.P).P1();
        TL_stories.PeerStories y9 = P1.y(j10);
        ei.i7 i7Var = null;
        if (y9 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= y9.stories.size()) {
                    storyItem2 = null;
                    break;
                } else {
                    if (y9.stories.get(i10).id == i3) {
                        storyItem2 = y9.stories.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j10;
                org.telegram.ui.ActionBar.d2 Q = Q();
                if (Q == null) {
                    return;
                }
                if (Q instanceof uw) {
                    try {
                        i7Var = ei.i7.a(((uw) Q).F0.h);
                    } catch (Exception unused) {
                    }
                }
                ei.i7 i7Var2 = i7Var;
                Q.getOrCreateStoryViewer().J();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem2.dialogId));
                if (z10) {
                    Q.getOrCreateStoryViewer().x1 = true;
                }
                Q.getOrCreateStoryViewer().U(this, storyItem2, arrayList, 0, null, y9, i7Var2, false);
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            ei.r6 A2 = P1.A(0, -1, j10, true);
            if (A2 == null || (f11 = A2.f(i3)) == null) {
                A2 = null;
            } else {
                storyItem = f11.l;
            }
            if (storyItem != null || (A = P1.A(1, -1, j10, true)) == null || (f10 = A.f(i3)) == null) {
                r6Var = A2;
            } else {
                storyItem = f10.l;
                r6Var = A;
            }
            if (storyItem != null && r6Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.d2 Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof uw) {
                    try {
                        i7Var = ei.i7.a(((uw) Q2).F0.h);
                    } catch (Exception unused2) {
                    }
                }
                ei.i7 i7Var3 = i7Var;
                Q2.getOrCreateStoryViewer().J();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    Q2.getOrCreateStoryViewer().x1 = true;
                }
                Q2.getOrCreateStoryViewer().U(this, storyItem, arrayList2, 0, r6Var, null, i7Var3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = org.telegram.messenger.hp.s1(this.P).j1(j10);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i3));
        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: org.telegram.ui.y70
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.E1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i11 = i3;
                final long j11 = j10;
                final boolean z11 = z10;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.g60
                    @Override // java.lang.Runnable
                    public final void run() {
                        TL_stories.StoryItem storyItem3;
                        String str2 = LaunchActivity.E1;
                        TLObject tLObject2 = tLObject;
                        ei.i7 i7Var4 = null;
                        if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= tL_stories_stories.stories.size()) {
                                    storyItem3 = null;
                                    break;
                                } else {
                                    if (tL_stories_stories.stories.get(i12).id == i11) {
                                        storyItem3 = tL_stories_stories.stories.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            if (storyItem3 != null) {
                                long j12 = j11;
                                storyItem3.dialogId = j12;
                                org.telegram.ui.ActionBar.d2 Q3 = LaunchActivity.Q();
                                if (Q3 == null) {
                                    return;
                                }
                                if (Q3 instanceof uw) {
                                    try {
                                        i7Var4 = ei.i7.a(((uw) Q3).F0.h);
                                    } catch (Exception unused3) {
                                    }
                                }
                                ei.i7 i7Var5 = i7Var4;
                                Q3.getOrCreateStoryViewer().J();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(Long.valueOf(j12));
                                if (z11) {
                                    Q3.getOrCreateStoryViewer().x1 = true;
                                }
                                Q3.getOrCreateStoryViewer().U(LaunchActivity.this, storyItem3, arrayList3, 0, null, null, i7Var5, false);
                                return;
                            }
                        }
                        org.telegram.ui.Components.fc.X().Q(R.raw.error, 36, org.telegram.messenger.bd.M0(2131744616, null)).k(false);
                    }
                });
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.j6 j6Var) {
        int i3 = j6Var.g0;
        org.telegram.ui.ActionBar.g6 f10 = j6Var.f(tL_theme, this.P, 0);
        j6Var.a0 = j6Var.Z;
        j6Var.u(f10.a);
        f10.s = tL_wallPaper;
        t0(new l71(j6Var, i3 != j6Var.g0, 0, false, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(final int i3, int i10, final TLRPC.Chat chat, final int i11, TLRPC.TL_forumTopic tL_forumTopic, final Runnable runnable, final String str, final Integer num, final byte[] bArr, final int i12, final ArrayList arrayList, final int i13) {
        final int i14;
        TLRPC.TL_forumTopic tL_forumTopic2;
        ArrayList arrayList2;
        if (tL_forumTopic == null) {
            i14 = i10;
            tL_forumTopic2 = org.telegram.messenger.hp.s1(i3).q7.f(chat.id, i14);
        } else {
            i14 = i10;
            tL_forumTopic2 = tL_forumTopic;
        }
        if (tL_forumTopic2 == null) {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
            tL_messages_getForumTopicsByID.peer = org.telegram.messenger.hp.s1(this.P).j1(-chat.id);
            tL_messages_getForumTopicsByID.topics.add(Integer.valueOf(i14));
            ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() { // from class: org.telegram.ui.l70
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    String str2 = LaunchActivity.E1;
                    final LaunchActivity launchActivity = LaunchActivity.this;
                    final int i15 = i3;
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
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.r70
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str4 = LaunchActivity.E1;
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            launchActivity2.getClass();
                            if (tL_error == null) {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                a0.h hVar = new a0.h();
                                for (int i20 = 0; i20 < tL_messages_forumTopics.messages.size(); i20++) {
                                    hVar.k(tL_messages_forumTopics.messages.get(i20), tL_messages_forumTopics.messages.get(i20).id);
                                }
                                int i21 = i15;
                                org.telegram.messenger.hp.s1(i21).Y3(tL_messages_forumTopics.users, false);
                                org.telegram.messenger.hp.s1(i21).S3(tL_messages_forumTopics.chats, false);
                                org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(i21).q7;
                                TLRPC.Chat chat3 = chat2;
                                c00Var.u(chat3.id, tL_messages_forumTopics.topics, hVar, false, 2, -1);
                                org.telegram.messenger.c00 c00Var2 = org.telegram.messenger.hp.s1(i21).q7;
                                long j10 = chat3.id;
                                int i22 = i16;
                                launchActivity2.s0(i21, i22, chat3, i17, c00Var2.f(j10, i22), runnable2, str3, num2, bArr2, i18, arrayList3, i19);
                            }
                        }
                    });
                }
            });
            return;
        }
        ArrayList arrayList3 = this.e0;
        org.telegram.ui.ActionBar.d2 d2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList3) : null;
        if (d2Var instanceof wm) {
            wm wmVar = (wm) d2Var;
            if (wmVar.a() == (-chat.id) && wmVar.w4 && wmVar.b() == tL_forumTopic2.id) {
                if (str != null) {
                    wmVar.Ob(i11, i13, str);
                }
                wmVar.h8 = num;
                wmVar.xb(i11, i12, true, 0, true, 0, null, null, null);
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
        wm wmVar2 = new wm(bundle);
        if (arrayList.isEmpty()) {
            TLRPC.Message message = new TLRPC.Message();
            message.id = 1;
            message.action = new TLRPC.TL_messageActionChannelMigrateFrom();
            arrayList2 = arrayList;
            arrayList2.add(new org.telegram.messenger.zi(i3, message, false, false));
        } else {
            arrayList2 = arrayList;
        }
        wmVar2.Rb(arrayList2, chat, i11, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i11 != tL_forumTopic2.id) {
            if (str != null) {
                wmVar2.Ob(i11, i13, str);
            } else {
                wmVar2.h8 = num;
                wmVar2.c8 = i11;
            }
            wmVar2.xb(i11, i12, true, 0, true, 0, null, null, null);
        }
        t0(wmVar2);
        if (runnable == null) {
        }
    }

    @Override // android.app.Activity
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        uf.b bVar = this.o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        bVar.h = pictureInPictureParams;
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i3) {
        org.telegram.messenger.g0.g = -10;
        org.telegram.messenger.g0.h = -10;
        org.telegram.messenger.g0.i = null;
        super.setRequestedOrientation(i3);
    }

    public final void t0(org.telegram.ui.ActionBar.d2 d2Var) {
        ((ActionBarLayout) M()).S(d2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) M()).V(d2Var, z10, z11);
    }

    public final void v0(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.F0;
            if (i3 >= arrayList.size()) {
                org.telegram.ui.ActionBar.d2 T = T();
                if (T != null && T.sheetsStack != null) {
                    for (int i10 = 0; i10 < T.sheetsStack.size(); i10++) {
                        if (T.sheetsStack.get(i10).s()) {
                            T.sheetsStack.get(i10);
                        }
                    }
                }
                gx x10 = this.r0.x();
                if (x10 != null && x10.sheetsStack != null) {
                    for (int i11 = 0; i11 < x10.sheetsStack.size(); i11++) {
                        if (x10.sheetsStack.get(i11).s()) {
                            x10.sheetsStack.get(i11);
                        }
                    }
                }
                p70 p70Var = new p70(this, 1);
                TLRPC.User a22 = org.telegram.messenger.hp.s1(this.P).a2(Long.valueOf(j10));
                if (a22 != null) {
                    p70Var.a(a22);
                    return;
                } else {
                    org.telegram.messenger.qr.a0(this.P).a.c(new z70(this, j10, p70Var, 0));
                    return;
                }
            }
            if (arrayList.get(i3) instanceof ii.a3) {
                ii.a3 a3Var = (ii.a3) arrayList.get(i3);
                if (a3Var.isShowing() && a3Var.J == j10) {
                    return;
                }
            }
            i3++;
        }
    }

    public final void w0(Long l10, ly lyVar, sf.b bVar, org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.f3 G0 = org.telegram.messenger.hp.s1(this.P).G0();
        if (bVar != null) {
            bVar.d();
        }
        G0.a(l10.longValue(), new n60(this, bVar, lyVar, G0, l10, q1Var));
    }

    public final void x(int i3) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.B1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B1 = null;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10 >= 26 ? getWindow().getNavigationBarColor() : 0, i3);
        this.B1 = ofArgb;
        ofArgb.addUpdateListener(new l60(this, 1));
        this.B1.addListener(new s0(this, i3, 2));
        this.B1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.B1.setDuration(320L);
        this.B1.start();
    }

    public final void x0(final int i3, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i10, final int i11, final String str23, final String str24, final String str25, String str26, final String str27, final sf.b bVar, final boolean z12, final int i12, final int i13, final int i14, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = org.telegram.messenger.hp.s1(i3).q1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getBotApp, new RequestDelegate() { // from class: org.telegram.ui.b70
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str30 = LaunchActivity.E1;
                final sf.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i15 = i3;
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
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.h70
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str32 = LaunchActivity.E1;
                            runnable2.run();
                            AtomicBoolean atomicBoolean = new AtomicBoolean();
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            ArrayList arrayList = launchActivity2.e0;
                            org.telegram.ui.ActionBar.d2 d2Var = (arrayList == null || arrayList.isEmpty()) ? null : (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
                            int i16 = i15;
                            TLRPC.User user3 = user2;
                            TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                            String str33 = str31;
                            boolean z28 = z23;
                            boolean z29 = z24;
                            boolean z30 = z25;
                            boolean z31 = z22;
                            o70 o70Var = new o70(launchActivity2, d2Var, i16, user3, tL_messages_botApp2, atomicBoolean, str33, z28, z29, z30, z31);
                            if (z26) {
                                o70Var.run();
                                return;
                            }
                            if (tL_messages_botApp2.inactive && z27) {
                                s3 s3Var = new s3(o70Var, 9);
                                sf.b bVar3 = bVar2;
                                rc1.a(launchActivity2, s3Var, bVar3 != null ? new fz(bVar3, 15) : null);
                            } else if (tL_messages_botApp2.request_write_access || z31) {
                                org.telegram.ui.Components.t4.m(d2Var, atomicBoolean, user3, o70Var);
                            } else {
                                o70Var.run();
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
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.g70
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str59 = LaunchActivity.E1;
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
    @Override // org.telegram.ui.nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(uw uwVar, ArrayList arrayList, final CharSequence charSequence, boolean z10, boolean z11, int i3, final int i10, m91 m91Var) {
        wm wmVar;
        final wm wmVar2;
        CharSequence charSequence2;
        boolean z12;
        org.telegram.messenger.zi ziVar;
        wm wmVar3;
        long j10;
        long j11;
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
        final int currentAccount = uwVar != null ? uwVar.getCurrentAccount() : launchActivity4.P;
        Uri uri = launchActivity4.Y;
        boolean z19 = true;
        boolean z20 = false;
        if (uri != null) {
            ArrayList arrayList6 = launchActivity4.X != null ? new ArrayList(launchActivity4.X) : null;
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, launchActivity4, null);
            org.telegram.messenger.yy.C(currentAccount).Q(((org.telegram.messenger.pr) arrayList5.get(0)).a, launchActivity4.Y, launchActivity4.X, new w70(launchActivity4, currentAccount, uwVar, z10, arrayList6, uri, s1Var));
            try {
                s1Var.r(300L);
            } catch (Exception unused) {
            }
            launchActivity3 = launchActivity4;
            r10 = 0;
        } else {
            uw uwVar2 = uwVar;
            final boolean z21 = uwVar2 == null || uwVar2.K2 || z11;
            int i15 = i3 != 0 ? i3 : uwVar2 == null ? 0 : uwVar2.L2;
            boolean z22 = uwVar2 != null && uwVar2.N2;
            if (arrayList5.size() <= 1) {
                long j12 = ((org.telegram.messenger.pr) arrayList5.get(0)).a;
                Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                if (!org.telegram.messenger.g0.Q1()) {
                    org.telegram.messenger.hs.f(currentAccount).k(org.telegram.messenger.hs.t, new Object[0]);
                }
                if (org.telegram.messenger.m5.C(j12)) {
                    k10.putInt("enc_id", (int) (j12 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(j12)) {
                    k10.putLong("user_id", j12);
                } else {
                    k10.putLong("chat_id", -j12);
                }
                if (org.telegram.messenger.hp.s1(currentAccount).E(k10, uwVar2, null, null)) {
                    wm wmVar4 = new wm(k10);
                    rg.c.a(wmVar4, (org.telegram.messenger.pr) arrayList5.get(0));
                    wmVar = wmVar4;
                }
                return false;
            }
            wmVar = null;
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
                if (org.telegram.ui.Components.t4.h(launchActivity4, launchActivity4.P, ((org.telegram.messenger.pr) arrayList5.get(i16)).a, size2 > 1)) {
                    return false;
                }
            }
            if (m91Var != null) {
                m91Var.removeSelfFromStack();
            }
            ArrayList arrayList11 = launchActivity4.b0;
            if (arrayList11 != null && arrayList11.size() == 1) {
                ArrayList arrayList12 = launchActivity4.e0;
                if (!arrayList12.isEmpty()) {
                    org.telegram.ui.Components.vc0 vc0Var = new org.telegram.ui.Components.vc0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList12), null, null, launchActivity4.c0, null, null, null, null, null);
                    wmVar2 = wmVar;
                    final int i17 = i15;
                    vc0Var.C1 = new org.telegram.ui.Components.vi() { // from class: org.telegram.ui.x70
                        @Override // org.telegram.ui.Components.vi
                        public final void a(TLRPC.User user, boolean z23, int i18, long j13) {
                            org.telegram.messenger.zi ziVar2;
                            TLRPC.TL_forumTopic f10;
                            TLRPC.Message message2;
                            String str2 = LaunchActivity.E1;
                            wm wmVar5 = wmVar2;
                            if (wmVar5 != null) {
                                ((ActionBarLayout) LaunchActivity.this.M()).V(wmVar5, true, false);
                            }
                            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.h10.t0);
                            int i19 = a10.a;
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList13 = arrayList5;
                                if (i20 >= arrayList13.size()) {
                                    return;
                                }
                                long j14 = ((org.telegram.messenger.pr) arrayList13.get(i20)).a;
                                long j15 = ((org.telegram.messenger.pr) arrayList13.get(i20)).b;
                                if (j15 == 0 || (f10 = org.telegram.messenger.hp.s1(i19).q7.f(-j14, j15)) == null || (message2 = f10.topicStartMessage) == null) {
                                    ziVar2 = null;
                                } else {
                                    ziVar2 = new org.telegram.messenger.zi(i19, message2, false, false);
                                    ziVar2.p = true;
                                }
                                org.telegram.messenger.zi ziVar3 = ziVar2;
                                int i21 = i17;
                                int i22 = i18 != 0 ? i18 : i21;
                                int i23 = i10;
                                org.telegram.messenger.wy g7 = org.telegram.messenger.wy.g(user, j14, ziVar3, ziVar3, null, null, z23, i22, i23);
                                CharSequence charSequence11 = charSequence;
                                if (TextUtils.isEmpty(charSequence11)) {
                                    g7.O = 0L;
                                }
                                g7.L = false;
                                org.telegram.messenger.yy.C(currentAccount).r0(g7);
                                if (!TextUtils.isEmpty(charSequence11)) {
                                    org.telegram.messenger.yy.a0(a10, charSequence11, j14, 0L, z21, i18 != 0 ? i18 : i21, i23);
                                }
                                i20++;
                            }
                        }

                        @Override // org.telegram.ui.Components.vi
                        public final /* synthetic */ void b(ArrayList arrayList13, String str2, boolean z23, int i18, long j13, boolean z24) {
                        }
                    };
                    ((org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList12)).showDialog(vc0Var);
                    launchActivity3 = launchActivity4;
                    wm wmVar5 = wmVar2;
                    if (uwVar != null && wmVar5 == null && !z19) {
                        uwVar.finishFragment();
                    }
                    r10 = 0;
                }
            }
            wmVar2 = wmVar;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence2 = charSequence;
            } else {
                launchActivity4.U = charSequence;
                charSequence2 = null;
            }
            Object[] objArr = uwVar2 != null && uwVar2.m4();
            if (objArr != false) {
                ArrayList arrayList13 = uwVar2.E2;
                ArrayList arrayList14 = new ArrayList();
                if (arrayList13 != null) {
                    int size3 = arrayList13.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj = arrayList13.get(i18);
                        i18++;
                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                        org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
                        boolean z23 = yeVar.b;
                        if (z23 || (str = yeVar.h) == null) {
                            String str2 = yeVar.I;
                            if (str2 != null) {
                                xyVar.c = str2;
                            }
                        } else {
                            xyVar.c = str;
                        }
                        xyVar.e = yeVar.c;
                        xyVar.f = yeVar.g;
                        xyVar.o = z23;
                        xyVar.p = yeVar.d();
                        xyVar.q = yeVar.j();
                        boolean z24 = z20;
                        xyVar.z = yeVar.m;
                        xyVar.A = yeVar.P;
                        CharSequence charSequence11 = yeVar.a;
                        xyVar.d = charSequence11 != null ? charSequence11.toString() : null;
                        xyVar.i = yeVar.n;
                        xyVar.j = yeVar.r;
                        xyVar.h = yeVar.x;
                        xyVar.k = yeVar.s;
                        xyVar.r = yeVar.L;
                        xyVar.x = yeVar.c();
                        arrayList14.add(xyVar);
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
                    ArrayList W = org.telegram.messenger.li.b0(launchActivity4.P).W(charSequenceArr, z25, true);
                    CharSequence charSequence13 = charSequenceArr[z25 ? 1 : 0];
                    String charSequence14 = charSequence13 == null ? null : charSequence13.toString();
                    for (int i19 = 0; i19 < launchActivity4.V.size(); i19++) {
                        org.telegram.messenger.xy xyVar2 = (org.telegram.messenger.xy) launchActivity4.V.get(i19);
                        if (i19 == 0) {
                            xyVar2.d = charSequence14;
                            xyVar2.i = W;
                        } else {
                            xyVar2.d = null;
                            xyVar2.i = null;
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
                long j13 = ((org.telegram.messenger.pr) arrayList5.get(i20)).a;
                long j14 = ((org.telegram.messenger.pr) arrayList5.get(i20)).b;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.h10.t0);
                int i21 = a10.a;
                if (j14 != 0) {
                    z12 = z26;
                    TLRPC.TL_forumTopic f10 = org.telegram.messenger.hp.s1(i21).q7.f(-j13, j14);
                    if (f10 != null && (message = f10.topicStartMessage) != null) {
                        org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i21, message, false, false);
                        ziVar2.p = true;
                        ziVar = ziVar2;
                        if (wmVar2 == null) {
                            ((ActionBarLayout) launchActivity4.M()).V(wmVar2, uwVar2 != null, uwVar2 == null || launchActivity4.S != null || ((arrayList4 = launchActivity4.V) != null && arrayList4.size() > 0));
                            boolean z27 = uwVar2 != null;
                            String str3 = launchActivity4.S;
                            if (str3 == null || j14 != 0 || objArr == true) {
                                ArrayList arrayList15 = launchActivity4.V;
                                if (arrayList15 == null || arrayList15.size() <= 0 || j14 != 0 || objArr == true) {
                                    boolean z28 = z22;
                                    z12 = z27;
                                    CharSequence charSequence16 = charSequence15;
                                    i11 = i21;
                                    wmVar3 = wmVar2;
                                    j10 = j14;
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
                                        j11 = j13;
                                        cVar = a10;
                                        org.telegram.messenger.yy.W(cVar, arrayList16, arrayList16, null, charSequence8, null, j11, ziVar, ziVar, z21, i15);
                                        z22 = z28;
                                        charSequence15 = charSequence8;
                                    } else {
                                        j11 = j13;
                                        cVar = a10;
                                        ArrayList arrayList17 = launchActivity4.V;
                                        if (arrayList17 == null || arrayList17.size() <= 0) {
                                            z22 = z28;
                                        } else {
                                            CharSequence charSequence19 = launchActivity4.U;
                                            if (charSequence19 != null && charSequence19.length() <= 1024 && launchActivity4.V.size() == 1) {
                                                CharSequence[] charSequenceArr2 = {launchActivity4.U};
                                                ((org.telegram.messenger.xy) launchActivity4.V.get(0)).i = org.telegram.messenger.li.b0(launchActivity4.P).W(charSequenceArr2, false, true);
                                                ((org.telegram.messenger.xy) launchActivity4.V.get(0)).d = charSequenceArr2[0].toString();
                                                launchActivity4.U = null;
                                            }
                                            ArrayList arrayList18 = launchActivity4.V;
                                            int i22 = i15;
                                            org.telegram.messenger.zi ziVar3 = ziVar;
                                            org.telegram.messenger.yy.X(cVar, arrayList18, j11, ziVar3, ziVar, null, null, z28, arrayList18.size() > 1, null, null, z21, i22, i10, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                            j11 = j11;
                                            z22 = z28;
                                            i15 = i22;
                                            ziVar = ziVar3;
                                        }
                                        charSequence15 = charSequence16;
                                    }
                                    z16 = false;
                                    z17 = false;
                                } else {
                                    ArrayList arrayList19 = launchActivity4.V;
                                    CharSequence charSequence20 = (charSequence2 == null || charSequence2.length() == 0) ? launchActivity4.U : charSequence2;
                                    boolean z29 = z22;
                                    ArrayList W7 = wm.W7(arrayList19, wmVar2.z(), charSequence20);
                                    if (W7.isEmpty()) {
                                        z12 = z27;
                                        charSequence9 = charSequence15;
                                        i11 = i21;
                                        z18 = false;
                                        wmVar3 = wmVar2;
                                        j10 = j14;
                                        charSequence10 = null;
                                    } else {
                                        if (wmVar2.getParentActivity() != null) {
                                            boolean[] zArr = new boolean[W7.size()];
                                            Arrays.fill(zArr, true);
                                            z12 = z27;
                                            charSequence9 = charSequence15;
                                            PhotoViewer.v1().N2(null, wmVar2, wmVar2.ya);
                                            PhotoViewer v12 = PhotoViewer.v1();
                                            ArrayList arrayList20 = new ArrayList(W7);
                                            int size4 = W7.size() - 1;
                                            sk skVar = new sk(wmVar2, W7, zArr);
                                            i11 = i21;
                                            wm wmVar6 = wmVar2;
                                            j10 = j14;
                                            v12.j2(arrayList20, size4, 0, false, skVar, wmVar6);
                                            wmVar3 = wmVar6;
                                            charSequence10 = null;
                                        } else {
                                            z12 = z27;
                                            charSequence9 = charSequence15;
                                            i11 = i21;
                                            wmVar3 = wmVar2;
                                            j10 = j14;
                                            charSequence10 = null;
                                            wmVar3.B8(charSequence20, null);
                                            wmVar3.Gb(0, W7, false, false);
                                            wmVar3.K6();
                                        }
                                        z18 = true;
                                    }
                                    if (z18) {
                                        launchActivity4.U = charSequence10;
                                    }
                                    charSequence15 = charSequence9;
                                    j11 = j13;
                                    cVar = a10;
                                    z16 = false;
                                    z17 = z18;
                                    z22 = z29;
                                }
                            } else {
                                wmVar2.Oa(launchActivity4.U, str3);
                                launchActivity4.U = null;
                                z12 = z27;
                                j11 = j13;
                                i11 = i21;
                                z16 = true;
                                z17 = false;
                                wmVar3 = wmVar2;
                                cVar = a10;
                                j10 = j14;
                            }
                            z13 = z22;
                            z15 = z16;
                            z14 = z17;
                        } else {
                            wmVar3 = wmVar2;
                            j10 = j14;
                            CharSequence charSequence21 = charSequence15;
                            j11 = j13;
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
                                org.telegram.messenger.yy.W(cVar, arrayList21, arrayList21, null, charSequence3, null, j11, ziVar, ziVar, z21, i15);
                                charSequence15 = charSequence3;
                            } else {
                                charSequence15 = charSequence21;
                            }
                            if (launchActivity4.V != null) {
                                CharSequence charSequence24 = launchActivity4.U;
                                if (charSequence24 != null && charSequence24.length() <= 1024 && launchActivity4.V.size() == 1) {
                                    CharSequence[] charSequenceArr3 = {launchActivity4.U};
                                    ((org.telegram.messenger.xy) launchActivity4.V.get(0)).i = org.telegram.messenger.li.b0(launchActivity4.P).W(charSequenceArr3, false, true);
                                    ((org.telegram.messenger.xy) launchActivity4.V.get(0)).d = charSequenceArr3[0].toString();
                                    launchActivity4.U = null;
                                }
                                ArrayList arrayList22 = launchActivity4.V;
                                int i23 = i15;
                                org.telegram.messenger.zi ziVar4 = ziVar;
                                boolean z30 = z22;
                                org.telegram.messenger.yy.X(cVar, arrayList22, j11, ziVar4, ziVar, null, null, z30, arrayList22.size() > 1, null, null, z21, i23, i10, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                j11 = j11;
                                z13 = z30;
                                i15 = i23;
                                ziVar = ziVar4;
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
                            org.telegram.messenger.yy.W(cVar, launchActivity4.W, launchActivity4.a0, launchActivity4.X, charSequence25, launchActivity4.Z, j11, ziVar, ziVar, z21, i15);
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
                                tL_document.id = org.telegram.messenger.az.p();
                                tL_document.user_id = org.telegram.messenger.h10.i(i11).e();
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
                                ArrayList W2 = org.telegram.messenger.li.b0(launchActivity4.P).W(charSequenceArr4, false, true);
                                org.telegram.messenger.yy C = org.telegram.messenger.yy.C(i11);
                                String absolutePath = file.getAbsolutePath();
                                CharSequence charSequence26 = charSequenceArr4[0];
                                long j15 = j11;
                                org.telegram.messenger.zi ziVar5 = ziVar;
                                int i24 = i15;
                                org.telegram.messenger.wy f11 = org.telegram.messenger.wy.f(tL_document, null, absolutePath, j15, ziVar5, ziVar, charSequence26 == null ? null : charSequence26.toString(), W2, null, null, z21, i24, i10, 0, null, null, false);
                                j11 = j15;
                                ziVar = ziVar5;
                                i15 = i24;
                                C.r0(f11);
                                if (launchActivity4.U != null) {
                                    launchActivity4.U = null;
                                }
                                long j16 = j10;
                                charSequence6 = launchActivity4.U;
                                launchActivity = launchActivity4;
                                if (charSequence6 != null) {
                                    i13 = i12;
                                    C0(cVar2, uwVar2, charSequence6, j11, ziVar, j16, z21, i15, i10);
                                } else {
                                    i13 = i12;
                                }
                                arrayList3 = launchActivity.b0;
                                if (arrayList3 != null && !arrayList3.isEmpty()) {
                                    i14 = i13;
                                    while (i14 < launchActivity.b0.size()) {
                                        TLRPC.User user = (TLRPC.User) launchActivity.b0.get(i14);
                                        org.telegram.messenger.yy C2 = org.telegram.messenger.yy.C(currentAccount);
                                        long j17 = j11;
                                        org.telegram.messenger.zi ziVar6 = ziVar;
                                        org.telegram.messenger.wy g7 = org.telegram.messenger.wy.g(user, j17, ziVar6, ziVar, null, null, z21, i15, i10);
                                        j11 = j17;
                                        ziVar = ziVar6;
                                        C2.r0(g7);
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
                                    C0(cVar2, uwVar, charSequence7, j11, ziVar, j16, z21, i15, i10);
                                }
                                i20++;
                                uwVar2 = uwVar;
                                arrayList5 = arrayList;
                                charSequence2 = charSequence7;
                                wmVar2 = wmVar3;
                                launchActivity4 = launchActivity2;
                                z22 = z13;
                                z26 = z31;
                                charSequence15 = charSequence5;
                            }
                        }
                        i12 = 0;
                        long j162 = j10;
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
                        uwVar2 = uwVar;
                        arrayList5 = arrayList;
                        charSequence2 = charSequence7;
                        wmVar2 = wmVar3;
                        launchActivity4 = launchActivity2;
                        z22 = z13;
                        z26 = z31;
                        charSequence15 = charSequence5;
                    }
                } else {
                    z12 = z26;
                }
                ziVar = null;
                if (wmVar2 == null) {
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
                org.telegram.messenger.yy.W(cVar, launchActivity4.W, launchActivity4.a0, launchActivity4.X, charSequence252, launchActivity4.Z, j11, ziVar, ziVar, z21, i15);
                charSequence5 = charSequence252;
                org.telegram.messenger.c cVar22 = cVar;
                if (launchActivity4.T != null) {
                }
                i12 = 0;
                long j1622 = j10;
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
                uwVar2 = uwVar;
                arrayList5 = arrayList;
                charSequence2 = charSequence7;
                wmVar2 = wmVar3;
                launchActivity4 = launchActivity2;
                z22 = z13;
                z26 = z312;
                charSequence15 = charSequence5;
            }
            z19 = z26;
            launchActivity3 = launchActivity4;
            wm wmVar52 = wmVar2;
            if (uwVar != null) {
                uwVar.finishFragment();
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
        ActionBarLayout actionBarLayout = this.s0;
        if (actionBarLayout != null) {
            actionBarLayout.X(z10, z10);
        } else {
            this.r0.X(z10, z10);
        }
    }

    public final void z(boolean z10) {
        org.telegram.messenger.h1 e10;
        String str;
        int i3;
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        if (!z10) {
            boolean z11 = org.telegram.messenger.r2.a;
        }
        if (!org.telegram.messenger.t0.a.q()) {
            if (z10 || Math.abs(System.currentTimeMillis() - org.telegram.messenger.az.l1) >= org.telegram.messenger.hp.s1(0).p3 * 1000) {
                TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                try {
                    tL_help_getAppUpdate.source = org.telegram.messenger.t0.b.getPackageManager().getInstallerPackageName(org.telegram.messenger.t0.b.getPackageName());
                } catch (Exception unused) {
                }
                if (tL_help_getAppUpdate.source == null) {
                    tL_help_getAppUpdate.source = "";
                }
                int i10 = this.P;
                ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new ci.a2(this, i10, 7));
                return;
            }
            return;
        }
        org.telegram.messenger.d1 d1Var = null;
        if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() && (str = (e10 = org.telegram.messenger.h1.e()).a) != null && (i3 = e10.b) != 0) {
            d1Var = new org.telegram.messenger.d1(str, i3, e10.c);
        }
        boolean z12 = this.q1;
        this.q1 = false;
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        a60 a60Var = new a60(this, z12, d1Var, 2);
        if (((ApplicationLoaderImpl) t0Var).q()) {
            org.telegram.messenger.h1.e().a(a60Var, z10);
        }
    }

    public final int z0(final int i3, final ly lyVar, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i10, final int i11) {
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.hp.l1(chat);
        tL_messages_getDiscussionMessage.msg_id = num2 != null ? num.intValue() : (int) l10.longValue();
        return ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() { // from class: org.telegram.ui.j60
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.E1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i12 = i3;
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
                final Runnable runnable3 = lyVar;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.d70
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
                            org.telegram.messenger.hp.s1(i15).Y3(tL_messages_discussionMessage.users, false);
                            org.telegram.messenger.hp.s1(i15).S3(tL_messages_discussionMessage.chats, false);
                            ArrayList arrayList2 = new ArrayList();
                            int size = tL_messages_discussionMessage.messages.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                arrayList2.add(new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, tL_messages_discussionMessage.messages.get(i16), true, true));
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
                                    bundle.putLong("chat_id", -org.telegram.messenger.zi.B0(((org.telegram.messenger.zi) arrayList2.get(0)).k));
                                    bundle.putInt("message_id", Math.max(1, num8.intValue()));
                                    wm wmVar = new wm(bundle);
                                    wmVar.Rb(arrayList2, chat3, tL_messages_getDiscussionMessage2.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
                                    if (num7 != null) {
                                        if (bArr3 != null) {
                                            wmVar.i8 = bArr3;
                                            wmVar.c8 = num7.intValue();
                                        } else if (str4 != null) {
                                            wmVar.Ob(num7.intValue(), i17, str4);
                                        } else {
                                            wmVar.h8 = num9;
                                            wmVar.c8 = num7.intValue();
                                        }
                                    } else if (l12 != null) {
                                        if (bArr3 != null) {
                                            wmVar.i8 = bArr3;
                                            wmVar.c8 = num8.intValue();
                                        } else if (str4 != null) {
                                            wmVar.Ob(num8.intValue(), i17, str4);
                                        } else {
                                            wmVar.h8 = num9;
                                            wmVar.c8 = num8.intValue();
                                        }
                                    }
                                    launchActivity2.t0(wmVar);
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
                            org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) arrayList.get(arrayList.size() - 1)).t(org.telegram.messenger.bd.M0(2131752330, null), null).j();
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

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ void e(int[] iArr) {
    }
}
