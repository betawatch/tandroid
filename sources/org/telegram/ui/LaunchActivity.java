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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class LaunchActivity extends f5 implements org.telegram.ui.ActionBar.v4, org.telegram.messenger.us, ux, kf.a {
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static org.telegram.ui.Components.zt H1;
    public static LaunchActivity I1;
    public static Pattern J1;
    public static y K1;
    public static LaunchActivity L1;
    public org.telegram.ui.Components.bd0 A0;
    public ValueAnimator A1;
    public final ArrayList B0;
    public rh.a9 B1;
    public org.telegram.ui.Components.pz0 C0;
    public int C1;
    public org.telegram.ui.Components.o9 D0;
    public final ArrayList E0;
    public org.telegram.ui.ActionBar.x1 F0;
    public View G0;
    public org.telegram.ui.ActionBar.x1 H0;
    public boolean I0;
    public HashMap J0;
    public HashMap K0;
    public Intent L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q;
    public String Q0;
    public String R;
    public String R0;
    public String S;
    public TLRPC.TL_wallPaper S0;
    public CharSequence T;
    public org.telegram.ui.ActionBar.s6 T0;
    public ArrayList U;
    public TLRPC.TL_theme U0;
    public ArrayList V;
    public boolean V0;
    public ArrayList W;
    public org.telegram.ui.ActionBar.x1 W0;
    public Uri X;
    public boolean X0;
    public String Y;
    public boolean Y0;
    public ArrayList Z;
    public ph.w3 Z0;
    public ArrayList a0;
    public m4 a1;
    public Uri b0;
    public final ArrayList b1;
    public int c0;
    public final SparseIntArray c1;
    public int d1;
    public final t90 e1;
    public org.telegram.messenger.o6 f1;
    public z80 g0;
    public androidx.mediarouter.app.f g1;
    public ArrayList h0;
    public hh.e h1;
    public ArrayList i0;
    public boolean i1;
    public String j0;
    public rf.v j1;
    public ActionMode k0;
    public y90 k1;
    public boolean l0;
    public z90 l1;
    public final j2.f m0;
    public boolean m1;
    public final jf.c n0;
    public xa.n n1;
    public org.telegram.ui.Components.b11 o0;
    public xa.n o1;
    public ag.r p0;
    public boolean p1;
    public ActionBarLayout q0;
    public v80 q1;
    public ActionBarLayout r0;
    public ag.l r1;
    public ActionBarLayout s0;
    public boolean s1;
    public n90 t0;
    public ViewGroup t1;
    public FrameLayout u0;
    public final kj0 u1;
    public w8 v0;
    public org.telegram.ui.ActionBar.x1 v1;
    public l0 w0;
    public org.telegram.ui.ActionBar.x1 w1;
    public w90 x0;
    public boolean x1;
    public org.telegram.ui.ActionBar.q3 y0;
    public long y1;
    public org.telegram.ui.ActionBar.s3 z0;
    public int[] z1;
    public final ArrayList P = new ArrayList();
    public final ArrayList d0 = new ArrayList();
    public final ArrayList e0 = new ArrayList();
    public final ArrayList f0 = new ArrayList();

    public LaunchActivity() {
        j2.f fVar = new j2.f();
        fVar.a = new HashMap();
        fVar.d = this;
        fVar.b = new jf.c(this);
        this.m0 = fVar;
        this.n0 = (jf.c) fVar.b;
        this.B0 = new ArrayList();
        this.E0 = new ArrayList();
        this.X0 = false;
        this.b1 = new ArrayList();
        this.c1 = new SparseIntArray();
        this.d1 = 5934;
        this.e1 = new t90();
        this.p1 = true;
        System.identityHashCode(this);
        this.u1 = new kj0(this);
        this.C1 = 0;
    }

    public static void C0(org.telegram.messenger.c cVar, ay ayVar, CharSequence charSequence, long j10, org.telegram.messenger.jj jjVar, long j11, boolean z10, int i10, int i11) {
        org.telegram.ui.Components.sp0 sp0Var;
        org.telegram.ui.Components.sp0 sp0Var2;
        int i12 = cVar.a;
        boolean z11 = ayVar == null || (sp0Var2 = ayVar.G2) == null || sp0Var2.n;
        TLRPC.WebPage webPage = null;
        if (z11 && ayVar != null && (sp0Var = ayVar.G2) != null) {
            webPage = sp0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (webPage2 == null && z11) {
            org.telegram.messenger.qz.a0(cVar, charSequence, j10, j11, z10, i10, i11);
            return;
        }
        CharSequence H = org.telegram.messenger.qz.H(charSequence);
        if (H == null || H.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = {H};
        org.telegram.messenger.qz.C(i12).r0(org.telegram.messenger.oz.b(charSequenceArr[0].toString(), j10, jjVar, jjVar, webPage2, z11, org.telegram.messenger.ui.b0(i12).W(charSequenceArr, true, true), null, null, z10, i10, i11, null, false));
    }

    public static void D(int i10) {
        LaunchActivity launchActivity = L1;
        if (launchActivity != null) {
            launchActivity.C(i10);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i10, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        org.telegram.ui.ActionBar.k2 Q = Q();
        if (Q == null) {
            return;
        }
        long j10 = tL_attachMenuBot.bot_id;
        xh.s3 b10 = xh.s3.b(i10, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
        if (launchActivity.O() == null || launchActivity.O().m(b10) == null) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(tL_attachMenuBot.bot_id));
            String E12 = Z1 == null ? null : org.telegram.messenger.vp.r1(i10).E1(Z1.restriction_reason);
            if (!TextUtils.isEmpty(E12)) {
                org.telegram.messenger.vp.r1(i10);
                org.telegram.messenger.vp.O4(E12, Q);
                return;
            }
            xh.m2 m2Var = new xh.m2(launchActivity, Q.getResourceProvider());
            m2Var.B0 = false;
            m2Var.B(z10);
            m2Var.l0 = launchActivity;
            m2Var.x(Q, b10);
            m2Var.show();
        }
    }

    public static void J() {
        ArrayList<org.telegram.ui.ActionBar.g2> arrayList;
        org.telegram.ui.ActionBar.k2 T = T();
        if (T == null) {
            return;
        }
        my w9 = T.getParentLayout() instanceof ActionBarLayout ? ((ActionBarLayout) T.getParentLayout()).w() : null;
        if (w9 != null && (arrayList = w9.sheetsStack) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                w9.sheetsStack.get(size).a(true);
            }
        }
        ArrayList<org.telegram.ui.ActionBar.g2> arrayList2 = T.sheetsStack;
        if (arrayList2 != null) {
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                T.sheetsStack.get(size2).a(true);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = xh.m2.a1.iterator();
        while (it.hasNext()) {
            arrayList3.add((xh.m2) it.next());
        }
        int size3 = arrayList3.size();
        int i10 = 0;
        while (i10 < size3) {
            Object obj = arrayList3.get(i10);
            i10++;
            ((xh.m2) obj).o(true);
        }
    }

    public static org.telegram.ui.ActionBar.k2 L() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.z4) i0.a.g(1, I1.P))).t();
        }
        LaunchActivity launchActivity2 = I1;
        if (launchActivity2 == null || launchActivity2.M() == null) {
            return null;
        }
        return ((ActionBarLayout) I1.M()).t();
    }

    public static org.telegram.ui.ActionBar.k2 Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.z4) i0.a.g(1, I1.P)).getLastFragment();
        }
        LaunchActivity launchActivity2 = I1;
        if (launchActivity2 == null || launchActivity2.M() == null) {
            return null;
        }
        return I1.M().getLastFragment();
    }

    public static org.telegram.ui.ActionBar.k2 T() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.z4) i0.a.g(1, I1.P)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = I1;
        if (launchActivity2 == null || launchActivity2.M() == null) {
            return null;
        }
        return I1.M().getSafeLastFragment();
    }

    public static String U(int i10, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        return str2 == null ? org.telegram.messenger.cd.L0(i10, str) : str2;
    }

    public static int V(Uri uri) {
        String query = uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND) ? uri.getQuery() : uri.getQueryParameter("t") != null ? uri.getQueryParameter("t") : null;
        if (TextUtils.isEmpty(query)) {
            return -1;
        }
        if (J1 == null) {
            J1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
        }
        try {
            Matcher matcher = J1.matcher(query);
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
                org.telegram.messenger.f8.g(e, true);
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
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                Z(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void b0(float f7, float f10, float f11) {
        View decorView;
        rh.a9 a9Var;
        LaunchActivity launchActivity = I1;
        if (launchActivity == null || (decorView = launchActivity.getWindow().getDecorView()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && ((a9Var = launchActivity.B1) == null || ((View) a9Var.a) != decorView)) {
            launchActivity.B1 = new rh.a9(decorView);
        }
        rh.a9 a9Var2 = launchActivity.B1;
        if (a9Var2 != null) {
            View view = (View) a9Var2.a;
            ArrayList arrayList = a9Var2.b;
            if (arrayList.size() >= 7) {
                return;
            }
            float max = (Math.max(Math.max(w7.z8.a(0.0f, 0.0f, f7, f10), w7.z8.a(view.getWidth(), 0.0f, f7, f10)), Math.max(w7.z8.a(0.0f, view.getHeight(), f7, f10), w7.z8.a(view.getWidth(), view.getHeight(), f7, f10))) * 2.0f) / (org.telegram.messenger.i0.p * 1200.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
            rh.z8 z8Var = new rh.z8(f7, f10, f11);
            ofFloat.addUpdateListener(new ag.p2(26, a9Var2, z8Var));
            ofFloat.addListener(new org.telegram.ui.Components.iw0(16, a9Var2, z8Var));
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.g);
            ofFloat.setDuration((long) (max * 1000.0f));
            arrayList.add(z8Var);
            a9Var2.f1();
            ofFloat.start();
        }
    }

    public final void A() {
        if (this.O != org.telegram.messenger.d20.s0 || this.n1 == null) {
            xa.n nVar = this.n1;
            if (nVar != null) {
                nVar.a();
                this.n1 = null;
            }
            int i10 = org.telegram.messenger.d20.s0;
            this.O = i10;
            xa.n nVar2 = new xa.n(org.telegram.messenger.zs.f(i10), this);
            nVar2.e(org.telegram.messenger.zs.n3);
            nVar2.e(org.telegram.messenger.zs.I2);
            nVar2.e(org.telegram.messenger.zs.j0);
            nVar2.e(org.telegram.messenger.zs.W4);
            nVar2.e(org.telegram.messenger.zs.T1);
            nVar2.e(org.telegram.messenger.zs.M0);
            nVar2.e(org.telegram.messenger.zs.R0);
            nVar2.e(org.telegram.messenger.zs.c1);
            nVar2.e(org.telegram.messenger.zs.Q);
            nVar2.e(org.telegram.messenger.zs.N0);
            nVar2.e(org.telegram.messenger.zs.Y1);
            nVar2.e(org.telegram.messenger.zs.Z1);
            nVar2.e(org.telegram.messenger.zs.v1);
            nVar2.e(org.telegram.messenger.zs.w2);
            nVar2.e(org.telegram.messenger.zs.x1);
            nVar2.e(org.telegram.messenger.zs.i5);
            nVar2.e(org.telegram.messenger.zs.f5);
            nVar2.e(org.telegram.messenger.zs.r5);
            nVar2.e(org.telegram.messenger.zs.Q5);
            this.n1 = nVar2;
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
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(Uri uri) {
        Throwable th2;
        InputStream inputStream;
        int i10 = org.telegram.messenger.d20.s0;
        InputStream inputStream2 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        String str = null;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, this, null);
        int[] iArr = {0};
        String q6 = org.telegram.messenger.b8.q(MediaController.A(uri));
        if (q6 == null || !q6.endsWith(".zip")) {
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
                            org.telegram.messenger.f8.g(e, true);
                            throw th2;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    org.telegram.messenger.f8.g(e, true);
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
                                    org.telegram.messenger.f8.g(e11, true);
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
                            org.telegram.messenger.f8.g(e, true);
                        } catch (Exception e13) {
                            org.telegram.messenger.f8.g(e13, true);
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
        iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkHistoryImport, new b0(this, uri, i10, x1Var, 4));
        x1Var.setOnCancelListener(new sy(i10, 1, iArr));
        try {
            x1Var.r(300L);
        } catch (Exception unused) {
        }
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.j1 == null && org.telegram.messenger.tz.p) {
                this.j1 = rf.v.b(this, this.w0);
            }
            rf.v vVar = this.j1;
            if (vVar == null || org.telegram.messenger.tz.p) {
                return;
            }
            vVar.c();
            this.j1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l4, final Long l10, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, final String str26, final String str27, final gf.e eVar, final boolean z12, final int i13, final boolean z13, final int i14, final int i15, final String str28, final String str29, final boolean z14, final String str30, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final String str31, final Integer num3, final boolean z20, final byte[] bArr) {
        final LaunchActivity launchActivity;
        f70 f70Var;
        final int i16;
        org.telegram.ui.ActionBar.x1 x1Var;
        final int i17;
        int[] iArr;
        org.telegram.ui.Components.cv cvVar;
        org.telegram.ui.Components.cx0 cx0Var;
        TLRPC.Chat chat;
        if (i11 == 0 && org.telegram.messenger.d20.c() >= 2 && hashMap != null) {
            org.telegram.ui.Components.s4.i(this, new org.telegram.ui.Components.o4() { // from class: org.telegram.ui.h90
                @Override // org.telegram.ui.Components.o4
                public final void a(int i18) {
                    Pattern pattern = LaunchActivity.D1;
                    LaunchActivity launchActivity2 = LaunchActivity.this;
                    if (i18 != i10) {
                        launchActivity2.O0(i18);
                    }
                    launchActivity2.B0(i18, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z10, num, l4, l10, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z11, str22, 1, i12, str23, str24, str25, str26, str27, eVar, z12, i13, z13, i14, i15, str28, str29, z14, str30, z15, z16, z17, z18, z19, str31, num3, z20, bArr);
                }
            }).show();
            return;
        }
        final gf.e eVar2 = eVar;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        char c15 = 1;
        char c16 = 1;
        final int i18 = 0;
        if (str16 != null) {
            SparseArray sparseArray = org.telegram.messenger.zs.e().a;
            int i19 = org.telegram.messenger.zs.g4;
            if (sparseArray.indexOfKey(i19) >= 0) {
                org.telegram.messenger.zs.e().k(i19, str16);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
            x1Var2.R = L0;
            x1Var2.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131747783, str16));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
            F0(alertDialog$Builder);
            return;
        }
        if (str17 != null) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            String L02 = org.telegram.messenger.cd.L0(2131753894, null);
            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.a;
            x1Var3.R = L02;
            x1Var3.T = org.telegram.messenger.cd.L0(2131753884, null);
            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
            F0(alertDialog$Builder2);
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var4 = new org.telegram.ui.ActionBar.x1(3, this, null);
        final f70 f70Var2 = new f70(11, eVar2, x1Var4);
        final int[] iArr2 = {0};
        if (str10 != null) {
            TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
            tL_contacts_importContactToken.token = str10;
            final int i20 = 0;
            iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_importContactToken, new RequestDelegate(this) { // from class: org.telegram.ui.j90
                public final /* synthetic */ LaunchActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i20) {
                        case 0:
                            Pattern pattern = LaunchActivity.D1;
                            org.telegram.messenger.i0.g3(new o70(this.b, tLObject, i10, str10, tL_error, f70Var2));
                            break;
                        case 1:
                            Pattern pattern2 = LaunchActivity.D1;
                            org.telegram.messenger.i0.g3(new i2.g1(this.b, tLObject, i10, str10, f70Var2, 16));
                            break;
                        default:
                            Pattern pattern3 = LaunchActivity.D1;
                            org.telegram.messenger.i0.g3(new o70(this.b, tL_error, tLObject, i10, str10, f70Var2));
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
                iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_chatlists_checkChatlistInvite, new RequestDelegate(this) { // from class: org.telegram.ui.j90
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i21) {
                            case 0:
                                Pattern pattern = LaunchActivity.D1;
                                org.telegram.messenger.i0.g3(new o70(this.b, tLObject, i10, str11, tL_error, f70Var2));
                                break;
                            case 1:
                                Pattern pattern2 = LaunchActivity.D1;
                                org.telegram.messenger.i0.g3(new i2.g1(this.b, tLObject, i10, str11, f70Var2, 16));
                                break;
                            default:
                                Pattern pattern3 = LaunchActivity.D1;
                                org.telegram.messenger.i0.g3(new o70(this.b, tL_error, tLObject, i10, str11, f70Var2));
                                break;
                        }
                    }
                });
            } else {
                launchActivity = this;
                if (str29 != null) {
                    org.telegram.messenger.x9 c17 = org.telegram.messenger.x9.c(launchActivity.O);
                    org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20(launchActivity) { // from class: org.telegram.ui.k90
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.messenger.j20
                        public final void a(Object obj, Object obj2) {
                            org.telegram.messenger.t9 b10;
                            int i22 = i18;
                            f70 f70Var3 = f70Var2;
                            switch (i22) {
                                case 0:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity2 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.m5.n(null, 2131749825, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity2.d0)), R.raw.error, 36);
                                    } else {
                                        Pattern pattern = LaunchActivity.D1;
                                        if (tL_StarGiftAuctionState != null && (b10 = org.telegram.messenger.x9.c(launchActivity2.O).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                            new rh.t0(launchActivity2, null, launchActivity2.O, b10.d.title, b10.h, false).show();
                                        }
                                    }
                                    try {
                                        f70Var3.run();
                                        break;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                    break;
                                default:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity3 = this.b;
                                    if (tL_error2 != null) {
                                        org.telegram.messenger.m5.n(null, 2131749825, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity3.d0)), R.raw.error, 36);
                                    } else {
                                        Pattern pattern2 = LaunchActivity.D1;
                                        if (tL_StarGiftAuctionState2 != null) {
                                            ph.w.e1(launchActivity3, null, launchActivity3.O, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                        }
                                    }
                                    try {
                                        f70Var3.run();
                                        break;
                                    } catch (Exception e7) {
                                        org.telegram.messenger.f8.g(e7, true);
                                    }
                            }
                        }
                    };
                    TL_stars.TL_inputStarGiftAuctionSlug tL_inputStarGiftAuctionSlug = new TL_stars.TL_inputStarGiftAuctionSlug();
                    tL_inputStarGiftAuctionSlug.slug = str29;
                    TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
                    tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuctionSlug;
                    tL_getStarGiftAuctionState.version = 0;
                    iArr2[0] = c17.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new a3.b(c16 == true ? 1 : 0), new org.telegram.messenger.a4(c15 == true ? 1 : 0, c17, j20Var));
                } else if (str28 != null) {
                    org.telegram.messenger.x9 c18 = org.telegram.messenger.x9.c(launchActivity.O);
                    final char c19 = c14 == true ? 1 : 0;
                    org.telegram.messenger.j20 j20Var2 = new org.telegram.messenger.j20(launchActivity) { // from class: org.telegram.ui.k90
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.messenger.j20
                        public final void a(Object obj, Object obj2) {
                            org.telegram.messenger.t9 b10;
                            int i22 = c19;
                            f70 f70Var3 = f70Var2;
                            switch (i22) {
                                case 0:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity2 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.m5.n(null, 2131749825, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity2.d0)), R.raw.error, 36);
                                    } else {
                                        Pattern pattern = LaunchActivity.D1;
                                        if (tL_StarGiftAuctionState != null && (b10 = org.telegram.messenger.x9.c(launchActivity2.O).b(tL_StarGiftAuctionState.gift.id)) != null) {
                                            new rh.t0(launchActivity2, null, launchActivity2.O, b10.d.title, b10.h, false).show();
                                        }
                                    }
                                    try {
                                        f70Var3.run();
                                        break;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                    break;
                                default:
                                    TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = (TL_payments.TL_StarGiftAuctionState) obj;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                    LaunchActivity launchActivity3 = this.b;
                                    if (tL_error2 != null) {
                                        org.telegram.messenger.m5.n(null, 2131749825, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity3.d0)), R.raw.error, 36);
                                    } else {
                                        Pattern pattern2 = LaunchActivity.D1;
                                        if (tL_StarGiftAuctionState2 != null) {
                                            ph.w.e1(launchActivity3, null, launchActivity3.O, 0L, tL_StarGiftAuctionState2.gift.id, null);
                                        }
                                    }
                                    try {
                                        f70Var3.run();
                                        break;
                                    } catch (Exception e7) {
                                        org.telegram.messenger.f8.g(e7, true);
                                    }
                            }
                        }
                    };
                    TL_stars.TL_inputStarGiftAuctionSlug tL_inputStarGiftAuctionSlug2 = new TL_stars.TL_inputStarGiftAuctionSlug();
                    tL_inputStarGiftAuctionSlug2.slug = str28;
                    TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState2 = new TL_payments.TL_getStarGiftAuctionState();
                    tL_getStarGiftAuctionState2.auction = tL_inputStarGiftAuctionSlug2;
                    tL_getStarGiftAuctionState2.version = 0;
                    iArr2[0] = c18.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState2, new a3.b(c13 == true ? 1 : 0), new org.telegram.messenger.a4(c12 == true ? 1 : 0, c18, j20Var2));
                } else if (str19 != null) {
                    TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                    getuniquestargift.slug = str19;
                    final int i22 = 2;
                    iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(getuniquestargift, new RequestDelegate(launchActivity) { // from class: org.telegram.ui.j90
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i22) {
                                case 0:
                                    Pattern pattern = LaunchActivity.D1;
                                    org.telegram.messenger.i0.g3(new o70(this.b, tLObject, i10, str19, tL_error, f70Var2));
                                    break;
                                case 1:
                                    Pattern pattern2 = LaunchActivity.D1;
                                    org.telegram.messenger.i0.g3(new i2.g1(this.b, tLObject, i10, str19, f70Var2, 16));
                                    break;
                                default:
                                    Pattern pattern3 = LaunchActivity.D1;
                                    org.telegram.messenger.i0.g3(new o70(this.b, tL_error, tLObject, i10, str19, f70Var2));
                                    break;
                            }
                        }
                    });
                } else if (str18 != null) {
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                    tL_inputInvoiceSlug.slug = str18;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                    iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new q8(this, tL_inputInvoiceSlug, f70Var2, i10, str18, 7));
                } else {
                    if (str == null) {
                        String str32 = str3;
                        if (str2 == null) {
                            f70Var = null;
                            ArrayList arrayList = this.d0;
                            if (str32 != null) {
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = str32;
                                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
                                if (k2Var instanceof un) {
                                    un unVar = (un) k2Var;
                                    cx0Var = new org.telegram.ui.Components.cx0(this, k2Var, tL_inputStickerSetShortName, null, (unVar.c1.getVisibility() == 0 || !((chat = unVar.e) == null || org.telegram.messenger.w3.t(chat))) ? null : unVar.Z, unVar.getResourceProvider());
                                    boolean J9 = unVar.J9();
                                    cx0Var.h0 = J9;
                                    cx0Var.n = J9;
                                } else {
                                    cx0Var = new org.telegram.ui.Components.cx0(this, k2Var, tL_inputStickerSetShortName, null, null, null);
                                }
                                cx0Var.H1 = str4 != null;
                                k2Var.showDialog(cx0Var);
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
                                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
                                if (k2Var2 instanceof un) {
                                    un unVar2 = (un) k2Var2;
                                    cvVar = new org.telegram.ui.Components.cv(k2Var2, this, unVar2.getResourceProvider(), arrayList2);
                                    boolean J92 = unVar2.J9();
                                    cvVar.h0 = J92;
                                    cvVar.n = J92;
                                } else {
                                    cvVar = new org.telegram.ui.Components.cv(k2Var2, this, null, arrayList2);
                                }
                                k2Var2.showDialog(cvVar);
                                return;
                            }
                            if (str9 != null) {
                                ay ayVar = new ay(org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true));
                                i17 = i10;
                                ayVar.C2 = new qg(this, z10, i17, str9);
                                i16 = 0;
                                u0(ayVar, false, true);
                            } else {
                                i16 = 0;
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
                                    iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new z70(this, iArr2, i10, f70Var2, getauthorizationform, str33, str34, str35, 1));
                                } else if (str15 != null) {
                                    TLRPC.TL_help_getDeepLinkInfo tL_help_getDeepLinkInfo = new TLRPC.TL_help_getDeepLinkInfo();
                                    tL_help_getDeepLinkInfo.path = str15;
                                    iArr2[0] = ConnectionsManager.getInstance(this.O).sendRequest(tL_help_getDeepLinkInfo, new RequestDelegate(this) { // from class: org.telegram.ui.i90
                                        public final /* synthetic */ LaunchActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i16) {
                                                case 0:
                                                    Pattern pattern = LaunchActivity.D1;
                                                    org.telegram.messenger.i0.g3(new qq(this.b, f70Var2, tLObject, 14));
                                                    break;
                                                default:
                                                    Pattern pattern2 = LaunchActivity.D1;
                                                    org.telegram.messenger.i0.g3(new w50(this.b, f70Var2, tLObject, tL_error, 2));
                                                    break;
                                            }
                                        }
                                    });
                                } else if (str14 != null) {
                                    TLRPC.TL_langpack_getLanguage tL_langpack_getLanguage = new TLRPC.TL_langpack_getLanguage();
                                    tL_langpack_getLanguage.lang_code = str14;
                                    tL_langpack_getLanguage.lang_pack = "android";
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.O);
                                    final char c20 = c11 == true ? 1 : 0;
                                    iArr2[0] = connectionsManager.sendRequest(tL_langpack_getLanguage, new RequestDelegate(this) { // from class: org.telegram.ui.i90
                                        public final /* synthetic */ LaunchActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (c20) {
                                                case 0:
                                                    Pattern pattern = LaunchActivity.D1;
                                                    org.telegram.messenger.i0.g3(new qq(this.b, f70Var2, tLObject, 14));
                                                    break;
                                                default:
                                                    Pattern pattern2 = LaunchActivity.D1;
                                                    org.telegram.messenger.i0.g3(new w50(this.b, f70Var2, tLObject, tL_error, 2));
                                                    break;
                                            }
                                        }
                                    });
                                } else if (tL_wallPaper != null) {
                                    if (TextUtils.isEmpty(tL_wallPaper.slug)) {
                                        try {
                                            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                                            int i23 = wallPaperSettings.third_background_color;
                                            org.telegram.messenger.i0.g3(new f70(9, this, new m91(i23 != 0 ? new me1("c", wallPaperSettings.background_color, wallPaperSettings.second_background_color, i23, wallPaperSettings.fourth_background_color) : new me1(wallPaperSettings.background_color, wallPaperSettings.second_background_color, "c", org.telegram.messenger.i0.s1(wallPaperSettings.rotation, false)), null, true)));
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                        }
                                    }
                                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                    tL_inputWallPaperSlug.slug = tL_wallPaper.slug;
                                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                    iArr2[0] = ConnectionsManager.getInstance(this.O).sendRequest(getwallpaper, new aa(this, f70Var2, tL_wallPaper, 16));
                                } else {
                                    if (str20 != null) {
                                        f70 f70Var3 = new f70(10, this, eVar2);
                                        TL_account.getTheme gettheme = new TL_account.getTheme();
                                        gettheme.format = "android";
                                        TLRPC.TL_inputThemeSlug tL_inputThemeSlug = new TLRPC.TL_inputThemeSlug();
                                        tL_inputThemeSlug.slug = str20;
                                        gettheme.theme = tL_inputThemeSlug;
                                        x1Var = x1Var4;
                                        iArr2[0] = ConnectionsManager.getInstance(this.O).sendRequest(gettheme, new aa(this, x1Var, f70Var2, 17));
                                        i17 = i10;
                                        f70Var = f70Var3;
                                    } else {
                                        x1Var = x1Var4;
                                        if (l4 == null || (num == null && !z14)) {
                                            i17 = i10;
                                            iArr = iArr2;
                                            if (str30 != null) {
                                                TL_account.resolveBusinessChatLink resolvebusinesschatlink = new TL_account.resolveBusinessChatLink();
                                                resolvebusinesschatlink.slug = str30;
                                                ConnectionsManager.getInstance(this.O).sendRequest(resolvebusinesschatlink, new a90(this, c10 == true ? 1 : 0));
                                            }
                                        } else {
                                            if (l10 != null) {
                                                TLRPC.Chat L03 = org.telegram.messenger.vp.r1(i10).L0(l4);
                                                if (L03 != null) {
                                                    iArr2[0] = z0(i10, f70Var2, num, num2, l10, num3, null, L03, null, null, 0, -1);
                                                } else {
                                                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                                                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                                                    tL_inputChannel.channel_id = l4.longValue();
                                                    tL_channels_getChannels.id.add(tL_inputChannel);
                                                    iArr2[0] = ConnectionsManager.getInstance(this.O).sendRequest(tL_channels_getChannels, new z70(this, iArr2, i10, f70Var2, num, num2, l10, num3, 2));
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
                                                TLRPC.Chat L04 = org.telegram.messenger.vp.r1(this.O).L0(l4);
                                                if (L04 != null && org.telegram.messenger.w3.R(L04) && z14) {
                                                    w0(Long.valueOf(-l4.longValue()), f70Var2, eVar2, null);
                                                } else if (L04 == null || !L04.forum) {
                                                    org.telegram.ui.ActionBar.k2 k2Var3 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList) : null;
                                                    if (k2Var3 == null || org.telegram.messenger.vp.r1(i10).E(bundle, k2Var3, null, null)) {
                                                        iArr = iArr2;
                                                        i17 = i10;
                                                        org.telegram.messenger.i0.g3(new i80(this, bundle, l4, iArr2, f70Var2, z14, eVar2, l10, num, num3, bArr, k2Var3, i10));
                                                    }
                                                } else {
                                                    l0(-l4.longValue(), num, null, num3, bArr, new y70(f70Var2, 2), 0, -1);
                                                }
                                            }
                                            i17 = i10;
                                        }
                                    }
                                    iArr = iArr2;
                                }
                                i17 = i10;
                            }
                            iArr = iArr2;
                            x1Var = x1Var4;
                        } else if (i11 == 0) {
                            TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                            tL_messages_checkChatInvite.hash = str2;
                            iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new q8(this, i10, x1Var4, f70Var2, str2), 2);
                            i17 = i10;
                            iArr = iArr2;
                            x1Var = x1Var4;
                            i16 = 0;
                        } else {
                            if (i11 == 1) {
                                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                tL_messages_importChatInvite.hash = str2;
                                f70Var = null;
                                ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_importChatInvite, null, new ng(this, f70Var2, i10), 2);
                            } else {
                                f70Var = null;
                            }
                            i17 = i10;
                            iArr = iArr2;
                            x1Var = x1Var4;
                            i16 = 0;
                        }
                        if (iArr[i16] == 0) {
                            x1Var.setOnCancelListener(new org.telegram.ui.Components.n1(i17, iArr, f70Var));
                            if (eVar2 != null) {
                                eVar2.b = new org.telegram.ui.Components.w2(i17, iArr, f70Var);
                            }
                            try {
                                if (eVar2 != null) {
                                    eVar2.d();
                                } else {
                                    x1Var.r(300L);
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (eVar2 != null) {
                        eVar2.d();
                    }
                    org.telegram.messenger.g20 c22 = org.telegram.messenger.vp.r1(i10).c2();
                    i17 = i10;
                    org.telegram.messenger.q20 q20Var = new org.telegram.messenger.q20() { // from class: org.telegram.ui.l90
                        /* JADX WARN: Can't wrap try/catch for region: R(6:59|(4:(2:63|(9:66|(3:68|(2:70|(4:72|(2:74|(2:76|77)(1:78))|79|80)(1:81))(1:359)|82)(1:360)|83|(2:85|(2:87|88))(1:358)|(3:90|(1:94)|95)(4:(2:117|(4:127|128|(8:130|(3:132|(1:160)(1:136)|137)(2:161|(1:166)(1:165))|138|(2:150|(2:155|(1:159))(1:154))(1:142)|143|(1:145)|146|(1:148))(1:(3:324|325|(4:347|348|349|(2:351|352)(1:354))(7:331|(1:333)(1:346)|334|(1:336)(1:345)|337|(2:339|(1:341)(1:343))(1:344)|342))(17:169|(3:171|(2:173|(2:175|(2:177|178)(1:179))(1:315))|316)(3:317|(3:319|(1:321)|322)|323)|(1:314)(1:184)|185|(1:187)(1:313)|(3:189|(1:191)|(1:193))|194|(1:196)|197|(1:199)|(1:201)|(1:203)|(1:205)(1:312)|(1:207)(1:311)|208|(1:310)(1:211)|(3:215|(1:309)(1:219)|(1:(2:254|(5:290|291|292|293|(1:305)(5:295|(1:297)(1:304)|(2:299|(1:301))|302|303))(1:(5:283|(1:285)(1:289)|286|287|288)(2:(1:282)(1:262)|(8:268|(1:270)|271|(1:273)|274|275|276|278)(2:266|267))))(1:253))(12:222|(1:224)|225|(1:232)|233|(1:235)|236|237|(3:239|(3:241|242|243)(1:245)|244)|246|247|(1:249)(1:250)))))|149)(2:123|(1:126)(1:125)))(4:106|(1:116)(2:110|(2:112|113)(1:114))|115|113)|97|98|100)|96|97|98|100))|97|98|100)|373|374|375|(7:377|(1:379)|380|381|382|383|(1:385)(1:386))) */
                        /* JADX WARN: Code restructure failed: missing block: B:389:0x0a16, code lost:
                        
                            r0 = move-exception;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:391:0x0a4a, code lost:
                        
                            org.telegram.messenger.f8.g(r0, true);
                         */
                        /* JADX WARN: Type inference failed for: r15v14 */
                        /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.String, org.telegram.ui.ActionBar.p6] */
                        /* JADX WARN: Type inference failed for: r15v16 */
                        @Override // org.telegram.messenger.q20
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void a(Object obj) {
                            boolean z21;
                            boolean z22;
                            Long l11;
                            final int i24;
                            String str36;
                            String str37;
                            boolean z23;
                            final Long l12;
                            final Long l13;
                            final HashMap hashMap2;
                            String str38;
                            final String str39;
                            TLRPC.TL_wallPaper tL_wallPaper2;
                            int i25;
                            int i26;
                            final String str40;
                            final String str41;
                            gf.e eVar3;
                            boolean z24;
                            final boolean z25;
                            final boolean z26;
                            final String str42;
                            f70 f70Var4;
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
                            Long l14;
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
                            long j10;
                            boolean z28;
                            boolean z29;
                            String str55;
                            String str56;
                            my w9;
                            ArrayList<org.telegram.ui.ActionBar.g2> arrayList3;
                            boolean z30;
                            boolean z31;
                            boolean z32;
                            ?? r15;
                            org.telegram.ui.Components.cc a02;
                            int i30;
                            final Long l15 = (Long) obj;
                            final LaunchActivity launchActivity4 = LaunchActivity.this;
                            ArrayList arrayList4 = launchActivity4.d0;
                            f70 f70Var5 = f70Var2;
                            if (l15 != null && l15.longValue() == Long.MAX_VALUE) {
                                try {
                                    f70Var5.run();
                                } catch (Exception e7) {
                                    org.telegram.messenger.f8.g(e7, true);
                                }
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, launchActivity4, null);
                                String L05 = org.telegram.messenger.cd.L0(2131754348, null);
                                org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder3.a;
                                x1Var5.R = L05;
                                x1Var5.T = org.telegram.messenger.cd.L0(2131754349, null);
                                i0.a.s(null, 2131747847, alertDialog$Builder3, null);
                                return;
                            }
                            if (launchActivity4.isFinishing()) {
                                return;
                            }
                            final boolean z33 = z13;
                            if (z33 && l15 != null) {
                                th.e5 O1 = org.telegram.messenger.vp.r1(launchActivity4.O).O1();
                                long longValue2 = l15.longValue();
                                u70 u70Var = new u70(launchActivity4, f70Var5, l15, 0);
                                int i31 = O1.a;
                                TL_stories.PeerStories y3 = O1.y(longValue2);
                                if (y3 != null) {
                                    for (int i32 = 0; i32 < y3.stories.size(); i32++) {
                                        if ((y3.stories.get(i32).media instanceof TLRPC.TL_messageMediaVideoStream) && !(y3.stories.get(i32) instanceof TL_stories.TL_storyItemSkipped)) {
                                            u70Var.a(y3.stories.get(i32));
                                            return;
                                        }
                                    }
                                }
                                long j11 = ((-93321425) + longValue2) << 12;
                                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) O1.E.f(j11);
                                if (storyItem != null) {
                                    u70Var.a(storyItem);
                                    return;
                                }
                                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                                tL_stories_getPeerStories.peer = org.telegram.messenger.vp.r1(i31).i1(longValue2);
                                ConnectionsManager.getInstance(i31).sendRequest(tL_stories_getPeerStories, new th.n4(O1, j11, u70Var));
                                return;
                            }
                            final int i33 = i13;
                            if (i33 != 0 && l15 != null) {
                                org.telegram.messenger.vp.r1(launchActivity4.O).O1().g0(i33, l15.longValue(), new u70(launchActivity4, f70Var5, l15, 1));
                                return;
                            }
                            final int i34 = i14;
                            if (i34 != 0 && l15 != null) {
                                th.e5 O12 = org.telegram.messenger.vp.r1(launchActivity4.O).O1();
                                long longValue3 = l15.longValue();
                                bi.i6 i6Var = new bi.i6(launchActivity4, f70Var5, l15, i34);
                                int i35 = O12.a;
                                th.t4 B = O12.B(longValue3, false);
                                if (B != null) {
                                    th.y4 b10 = B.b(i34);
                                    if (b10 != null) {
                                        TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                                        tL_storyAlbum.album_id = b10.a;
                                        tL_storyAlbum.title = b10.b;
                                        tL_storyAlbum.icon_photo = b10.c;
                                        tL_storyAlbum.icon_video = b10.d;
                                        i6Var.a(tL_storyAlbum);
                                        return;
                                    }
                                    if (B.f) {
                                        i6Var.a(null);
                                        return;
                                    }
                                }
                                TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
                                tL_getAlbums.peer = org.telegram.messenger.vp.r1(i35).i1(longValue3);
                                ConnectionsManager.getInstance(i35).sendRequest(tL_getAlbums, new org.telegram.messenger.voip.g0(i34, i6Var));
                                return;
                            }
                            final f70 f70Var6 = f70Var5;
                            final String str57 = str;
                            try {
                                if (l15 != null && launchActivity4.q0 != null) {
                                    final String str58 = str13;
                                    final String str59 = str21;
                                    final boolean z34 = z11;
                                    final String str60 = str22;
                                    if ((str58 == null && str59 == null) || ((str58 != null && l15.longValue() > 0) || ((str59 != null && l15.longValue() > 0) || ((z34 && l15.longValue() < 0) || (str60 != null && l15.longValue() < 0))))) {
                                        final String str61 = str26;
                                        boolean isEmpty = TextUtils.isEmpty(str61);
                                        int i36 = i17;
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
                                        final Long l16 = l4;
                                        final Long l17 = l10;
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
                                        final int i37 = i11;
                                        final int i38 = i12;
                                        final String str80 = str23;
                                        final String str81 = str24;
                                        final String str82 = str25;
                                        final gf.e eVar4 = eVar2;
                                        final boolean z36 = z12;
                                        final int i39 = i15;
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
                                            l11 = l15;
                                            i24 = i36;
                                            str36 = str57;
                                            str37 = str58;
                                            z23 = z35;
                                            l12 = l16;
                                            l13 = l17;
                                            hashMap2 = hashMap3;
                                            str38 = str74;
                                            str39 = str76;
                                            tL_wallPaper2 = tL_wallPaper3;
                                            i25 = i37;
                                            i26 = i38;
                                            str40 = str81;
                                            str41 = str82;
                                            eVar3 = eVar4;
                                            z24 = z40;
                                            z25 = z41;
                                            z26 = z42;
                                            str42 = str86;
                                            f70Var4 = f70Var6;
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
                                            final TLRPC.User Z1 = org.telegram.messenger.vp.r1(i36).Z1(l15);
                                            if (Z1 != null) {
                                                i24 = i36;
                                                if (Z1.bot) {
                                                    if (Z1.bot_attach_menu) {
                                                        if (!org.telegram.messenger.ui.b0(i24).j(Z1.id)) {
                                                            TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                                                            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i24);
                                                            tL_messages_getAttachMenuBot.bot = r12.p1(r12.Z1(l15));
                                                            ConnectionsManager.getInstance(i24).sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() { // from class: org.telegram.ui.v70
                                                                @Override // org.telegram.tgnet.RequestDelegate
                                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                                    Pattern pattern = LaunchActivity.D1;
                                                                    final LaunchActivity launchActivity5 = LaunchActivity.this;
                                                                    final int i40 = i24;
                                                                    final String str88 = str57;
                                                                    final String str89 = str62;
                                                                    final String str90 = str63;
                                                                    final String str91 = str64;
                                                                    final String str92 = str65;
                                                                    final String str93 = str66;
                                                                    final String str94 = str67;
                                                                    final String str95 = str68;
                                                                    final String str96 = str69;
                                                                    final String str97 = str70;
                                                                    final String str98 = str71;
                                                                    final String str99 = str72;
                                                                    final boolean z44 = z35;
                                                                    final Integer num9 = num6;
                                                                    final Long l18 = l16;
                                                                    final Long l19 = l17;
                                                                    final Integer num10 = num7;
                                                                    final String str100 = str58;
                                                                    final HashMap hashMap4 = hashMap3;
                                                                    final String str101 = str73;
                                                                    final String str102 = str74;
                                                                    final String str103 = str75;
                                                                    final String str104 = str76;
                                                                    final TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper3;
                                                                    final String str105 = str77;
                                                                    final String str106 = str78;
                                                                    final String str107 = str79;
                                                                    final String str108 = str59;
                                                                    final boolean z45 = z34;
                                                                    final String str109 = str60;
                                                                    final int i41 = i37;
                                                                    final int i42 = i38;
                                                                    final String str110 = str80;
                                                                    final String str111 = str81;
                                                                    final String str112 = str82;
                                                                    final gf.e eVar5 = eVar4;
                                                                    final boolean z46 = z36;
                                                                    final int i43 = i33;
                                                                    final boolean z47 = z33;
                                                                    final int i44 = i34;
                                                                    final int i45 = i39;
                                                                    final String str113 = str83;
                                                                    final String str114 = str84;
                                                                    final boolean z48 = z37;
                                                                    final String str115 = str85;
                                                                    final boolean z49 = z38;
                                                                    final boolean z50 = z39;
                                                                    final boolean z51 = z40;
                                                                    final boolean z52 = z41;
                                                                    final boolean z53 = z42;
                                                                    final String str116 = str86;
                                                                    final Integer num11 = num8;
                                                                    final boolean z54 = z43;
                                                                    final byte[] bArr5 = bArr4;
                                                                    final Long l20 = l15;
                                                                    final String str117 = str61;
                                                                    final String str118 = str87;
                                                                    final TLRPC.User user = Z1;
                                                                    final f70 f70Var7 = f70Var6;
                                                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.d80
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            final String str119;
                                                                            f70 f70Var8;
                                                                            gf.e eVar6;
                                                                            TLRPC.User user2;
                                                                            final String str120;
                                                                            final boolean z55;
                                                                            final int i46;
                                                                            final int i47;
                                                                            final TLRPC.TL_attachMenuBot tL_attachMenuBot;
                                                                            int i48;
                                                                            Pattern pattern2 = LaunchActivity.D1;
                                                                            final LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            final int i49 = i40;
                                                                            final String str121 = str88;
                                                                            final String str122 = str89;
                                                                            final String str123 = str90;
                                                                            final String str124 = str91;
                                                                            final String str125 = str92;
                                                                            final String str126 = str93;
                                                                            final String str127 = str94;
                                                                            final String str128 = str95;
                                                                            final String str129 = str96;
                                                                            final String str130 = str97;
                                                                            final String str131 = str98;
                                                                            final String str132 = str99;
                                                                            final boolean z56 = z44;
                                                                            final Integer num12 = num9;
                                                                            final Long l21 = l18;
                                                                            final Long l22 = l19;
                                                                            final Integer num13 = num10;
                                                                            final String str133 = str100;
                                                                            final HashMap hashMap5 = hashMap4;
                                                                            final String str134 = str101;
                                                                            final String str135 = str102;
                                                                            final String str136 = str103;
                                                                            final String str137 = str104;
                                                                            final TLRPC.TL_wallPaper tL_wallPaper5 = tL_wallPaper4;
                                                                            final String str138 = str105;
                                                                            final String str139 = str106;
                                                                            final String str140 = str107;
                                                                            final String str141 = str108;
                                                                            final boolean z57 = z45;
                                                                            final String str142 = str109;
                                                                            final int i50 = i41;
                                                                            final int i51 = i42;
                                                                            final String str143 = str110;
                                                                            final String str144 = str111;
                                                                            final String str145 = str112;
                                                                            final gf.e eVar7 = eVar5;
                                                                            final boolean z58 = z46;
                                                                            final int i52 = i43;
                                                                            final int i53 = i44;
                                                                            final int i54 = i45;
                                                                            final boolean z59 = z48;
                                                                            final String str146 = str115;
                                                                            final boolean z60 = z49;
                                                                            final boolean z61 = z50;
                                                                            final boolean z62 = z51;
                                                                            final boolean z63 = z52;
                                                                            final boolean z64 = z53;
                                                                            final String str147 = str116;
                                                                            final boolean z65 = z54;
                                                                            if (tL_error2 != null) {
                                                                                final boolean z66 = z47;
                                                                                final String str148 = str113;
                                                                                final String str149 = str114;
                                                                                final Integer num14 = num11;
                                                                                final byte[] bArr6 = bArr5;
                                                                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.o80
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        Pattern pattern3 = LaunchActivity.D1;
                                                                                        LaunchActivity.this.B0(i49, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, z56, num12, l21, l22, num13, str133, hashMap5, str134, str135, str136, str137, tL_wallPaper5, str138, str139, str140, str141, z57, str142, i50, i51, str143, str144, str145, null, null, eVar7, z58, i52, z66, i53, i54, str148, str149, z59, str146, z60, z61, z62, z63, z64, str147, num14, z65, bArr6);
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
                                                                                final Long l23 = l20;
                                                                                final String str150 = str117;
                                                                                final String str151 = str118;
                                                                                final TLRPC.User user3 = user;
                                                                                final f70 f70Var9 = f70Var7;
                                                                                if (!z68 && !tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                                                                    str119 = str150;
                                                                                    f70Var8 = f70Var9;
                                                                                } else if (z69) {
                                                                                    te1.a(launchActivity6, new org.telegram.messenger.q20() { // from class: org.telegram.ui.p80
                                                                                        @Override // org.telegram.messenger.q20
                                                                                        public final void a(Object obj2) {
                                                                                            Pattern pattern3 = LaunchActivity.D1;
                                                                                            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                                                                                            tL_attachMenuBot3.inactive = false;
                                                                                            tL_attachMenuBot3.request_write_access = false;
                                                                                            TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                            int i55 = i49;
                                                                                            org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i55);
                                                                                            Long l24 = l23;
                                                                                            l24.getClass();
                                                                                            tL_messages_toggleBotInAttachMenu.bot = r13.p1(r13.Z1(l24));
                                                                                            tL_messages_toggleBotInAttachMenu.enabled = true;
                                                                                            tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                                                                            ConnectionsManager.getInstance(i55).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.voip.q(i55, 4), 66);
                                                                                            LaunchActivity.this.x0(i55, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, z56, num12, l21, l22, num13, str133, hashMap5, str134, str135, str136, str137, tL_wallPaper5, str138, str139, str140, str141, z57, str142, i50, i51, str143, str144, str145, str150, str151, eVar7, z58, i52, i53, i54, z59, str146, user3, f70Var9, z69, true, z60, z61, z62, z63, z64, str147, z65);
                                                                                        }
                                                                                    }, eVar7 != null ? new zy(eVar7, 16) : null);
                                                                                    return;
                                                                                } else {
                                                                                    str119 = str150;
                                                                                    f70Var8 = f70Var9;
                                                                                }
                                                                                if (tL_attachMenuBot2.request_write_access) {
                                                                                    eVar6 = eVar7;
                                                                                    user2 = user3;
                                                                                    str120 = str146;
                                                                                    z55 = z59;
                                                                                    i46 = i54;
                                                                                    i47 = i53;
                                                                                    tL_attachMenuBot = tL_attachMenuBot2;
                                                                                    i48 = i49;
                                                                                } else {
                                                                                    if (!z58) {
                                                                                        launchActivity6.x0(i49, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, z56, num12, l21, l22, num13, str133, hashMap5, str134, str135, str136, str137, tL_wallPaper5, str138, str139, str140, str141, z57, str142, i50, i51, str143, str144, str145, str119, str151, eVar7, z58, i52, i53, i54, z59, str146, user3, f70Var8, false, false, z60, z61, z62, z63, z64, str147, z65);
                                                                                        return;
                                                                                    }
                                                                                    eVar6 = eVar7;
                                                                                    user2 = user3;
                                                                                    str120 = str146;
                                                                                    z55 = z59;
                                                                                    i46 = i54;
                                                                                    i47 = i53;
                                                                                    tL_attachMenuBot = tL_attachMenuBot2;
                                                                                    i48 = i49;
                                                                                }
                                                                                final f70 f70Var10 = f70Var8;
                                                                                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                                                                                final TLRPC.User user4 = user2;
                                                                                final int i55 = i48;
                                                                                final gf.e eVar8 = eVar6;
                                                                                org.telegram.ui.Components.s4.m(LaunchActivity.Q(), atomicBoolean, user4, new Runnable() { // from class: org.telegram.ui.q80
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        Pattern pattern3 = LaunchActivity.D1;
                                                                                        LaunchActivity launchActivity7 = LaunchActivity.this;
                                                                                        int i56 = launchActivity7.O;
                                                                                        Long l24 = l23;
                                                                                        org.telegram.messenger.js.o(i56, l24.longValue());
                                                                                        TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot;
                                                                                        tL_attachMenuBot3.inactive = false;
                                                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                        tL_attachMenuBot3.request_write_access = !atomicBoolean2.get();
                                                                                        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                        int i57 = i55;
                                                                                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i57);
                                                                                        tL_messages_toggleBotInAttachMenu.bot = r13.p1(r13.Z1(l24));
                                                                                        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean2.get();
                                                                                        ConnectionsManager.getInstance(i57).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.voip.q(i57, 5), 66);
                                                                                        launchActivity7.x0(i57, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, z56, num12, l21, l22, num13, str133, hashMap5, str134, str135, str136, str137, tL_wallPaper5, str138, str139, str140, str141, z57, str142, i50, i51, str143, str144, str145, str119, str151, eVar8, z58, i52, i47, i46, z55, str120, user4, f70Var10, false, false, z60, z61, z62, z63, z64, str147, z65);
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
                                                    launchActivity4.x0(i24, str57, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, z35, num6, l16, l17, num7, str58, hashMap3, str73, str74, str75, str76, tL_wallPaper3, str77, str78, str79, str59, z34, str60, i37, i38, str80, str81, str82, str61, str87, eVar4, z36, i33, i34, i39, z37, str85, Z1, f70Var6, false, false, z38, z39, z40, z41, z42, str86, z43);
                                                    return;
                                                }
                                                l11 = l15;
                                            } else {
                                                l11 = l15;
                                                i24 = i36;
                                            }
                                            str36 = str57;
                                            launchActivity2 = launchActivity4;
                                            str44 = str72;
                                            str37 = str58;
                                            num4 = num6;
                                            l12 = l16;
                                            num5 = num7;
                                            str45 = str73;
                                            str38 = str74;
                                            str39 = str76;
                                            str46 = str77;
                                            i25 = i37;
                                            str47 = str80;
                                            str40 = str81;
                                            eVar3 = eVar4;
                                            z24 = z40;
                                            z25 = z41;
                                            z26 = z42;
                                            str42 = str86;
                                            f70Var4 = f70Var6;
                                            bArr2 = bArr4;
                                            str43 = str87;
                                            z23 = z35;
                                            l13 = l17;
                                            hashMap2 = hashMap3;
                                            tL_wallPaper2 = tL_wallPaper3;
                                            i26 = i38;
                                            str41 = str82;
                                        }
                                        if (z37) {
                                            str48 = str63;
                                            str49 = str64;
                                            if (org.telegram.messenger.w3.R(org.telegram.messenger.vp.r1(i24).L0(Long.valueOf(-l11.longValue())))) {
                                                launchActivity2.w0(l11, f70Var4, eVar3, null);
                                                return;
                                            }
                                        } else {
                                            str48 = str63;
                                            str49 = str64;
                                        }
                                        if (str43 == null) {
                                            if (str47 != null && str40 == null) {
                                                TLRPC.User Z12 = org.telegram.messenger.vp.r1(i24).Z1(l11);
                                                if (Z12 == null || !Z12.bot) {
                                                    z32 = true;
                                                    r15 = 0;
                                                    a02 = org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList4));
                                                    i30 = 2131752986;
                                                } else if (Z12.bot_attach_menu) {
                                                    long longValue4 = l11.longValue();
                                                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot2 = new TLRPC.TL_messages_getAttachMenuBot();
                                                    org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i24);
                                                    tL_messages_getAttachMenuBot2.bot = r13.p1(r13.Z1(l11));
                                                    ConnectionsManager.getInstance(i24).sendRequest(tL_messages_getAttachMenuBot2, new b20(launchActivity2, i24, str43, str41, Z12, str47, longValue4));
                                                    z32 = true;
                                                    f70Var6 = f70Var4;
                                                    z21 = z32;
                                                } else {
                                                    z32 = true;
                                                    a02 = org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList4));
                                                    i30 = 2131753109;
                                                    r15 = 0;
                                                }
                                                org.telegram.messenger.m5.o(r15, i30, a02, r15);
                                                f70Var6 = f70Var4;
                                                z21 = z32;
                                            } else if (num4 == null || ((num5 == null && l13 == null) || l11.longValue() >= 0)) {
                                                final String str88 = str48;
                                                final gf.e eVar5 = eVar3;
                                                int i40 = i24;
                                                final String str89 = str44;
                                                final f70 f70Var7 = f70Var4;
                                                final LaunchActivity launchActivity5 = launchActivity2;
                                                if (str37 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putBoolean("onlySelect", true);
                                                    bundle2.putBoolean("cantSendToChannels", true);
                                                    bundle2.putInt("dialogsType", 1);
                                                    bundle2.putString("selectAlertString", org.telegram.messenger.cd.L0(2131745641, null));
                                                    bundle2.putString("selectAlertStringGroup", org.telegram.messenger.cd.L0(2131745642, null));
                                                    ay ayVar2 = new ay(bundle2);
                                                    ayVar2.C2 = new w70(launchActivity5, str37, i40, org.telegram.messenger.vp.r1(i40).Z1(l11));
                                                    if (org.telegram.messenger.i0.Q1()) {
                                                        z31 = !launchActivity5.r0.getFragmentStack().isEmpty() && (launchActivity5.r0.getFragmentStack().get(launchActivity5.r0.getFragmentStack().size() + (-1)) instanceof pf0);
                                                        z30 = true;
                                                    } else {
                                                        z30 = true;
                                                        z31 = launchActivity5.q0.getFragmentStack().size() > 1 && (launchActivity5.q0.getFragmentStack().get(launchActivity5.q0.getFragmentStack().size() - 1) instanceof pf0);
                                                    }
                                                    ((ActionBarLayout) launchActivity5.M()).U(ayVar2, z31, z30);
                                                    if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                                                        SecretMediaViewer.f().e(false, false);
                                                    } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                                                        PhotoViewer.v1().H0(false, true);
                                                    } else if (h4.G() && h4.v().V) {
                                                        h4.v().m(false, true);
                                                    }
                                                    vh.o8.w();
                                                    b50 b50Var = b50.u5;
                                                    if (b50Var != null) {
                                                        b50Var.dismiss();
                                                    }
                                                    if (org.telegram.messenger.i0.Q1()) {
                                                        launchActivity5.q0.W(true, true);
                                                        launchActivity5.s0.W(true, true);
                                                    }
                                                } else if (str66 == null && str67 == null) {
                                                    final boolean z44 = z23;
                                                    Bundle bundle3 = new Bundle();
                                                    TLRPC.User Z13 = org.telegram.messenger.vp.r1(i40).Z1(l11);
                                                    final String str90 = str37;
                                                    if (l11.longValue() < 0) {
                                                        i27 = i40;
                                                        final TLRPC.Chat L06 = org.telegram.messenger.vp.r1(i40).L0(Long.valueOf(-l11.longValue()));
                                                        if (z43) {
                                                            if (L06.linked_monoforum_id == 0) {
                                                                f70Var7 = f70Var7;
                                                            } else {
                                                                if (org.telegram.messenger.vp.r1(i27).L0(Long.valueOf(L06.linked_monoforum_id)) == null) {
                                                                    TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                                                                    tL_channels_getFullChannel.channel = org.telegram.messenger.vp.h1(L06);
                                                                    final boolean z45 = z24;
                                                                    final String str91 = str49;
                                                                    final String str92 = str36;
                                                                    final String str93 = str47;
                                                                    final int i41 = i26;
                                                                    final int i42 = i25;
                                                                    final String str94 = str46;
                                                                    final TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper2;
                                                                    final String str95 = str38;
                                                                    ConnectionsManager.getInstance(i27).sendRequest(tL_channels_getFullChannel, new RequestDelegate() { // from class: org.telegram.ui.x70
                                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                                            Pattern pattern = LaunchActivity.D1;
                                                                            final LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                            final int i43 = i27;
                                                                            final TLRPC.Chat chat2 = L06;
                                                                            final f70 f70Var8 = f70Var7;
                                                                            final String str96 = str92;
                                                                            final String str97 = str62;
                                                                            final String str98 = str88;
                                                                            final String str99 = str91;
                                                                            final String str100 = str65;
                                                                            final String str101 = str66;
                                                                            final String str102 = str67;
                                                                            final String str103 = str68;
                                                                            final String str104 = str69;
                                                                            final String str105 = str70;
                                                                            final String str106 = str71;
                                                                            final String str107 = str89;
                                                                            final boolean z46 = z44;
                                                                            final Integer num9 = num4;
                                                                            final Long l18 = l12;
                                                                            final Long l19 = l13;
                                                                            final Integer num10 = num5;
                                                                            final String str108 = str90;
                                                                            final HashMap hashMap4 = hashMap2;
                                                                            final String str109 = str45;
                                                                            final String str110 = str95;
                                                                            final String str111 = str75;
                                                                            final String str112 = str39;
                                                                            final TLRPC.TL_wallPaper tL_wallPaper5 = tL_wallPaper4;
                                                                            final String str113 = str94;
                                                                            final String str114 = str78;
                                                                            final String str115 = str79;
                                                                            final String str116 = str59;
                                                                            final boolean z47 = z34;
                                                                            final String str117 = str60;
                                                                            final int i44 = i42;
                                                                            final int i45 = i41;
                                                                            final String str118 = str93;
                                                                            final String str119 = str40;
                                                                            final String str120 = str41;
                                                                            final String str121 = str61;
                                                                            final String str122 = str43;
                                                                            final gf.e eVar6 = eVar5;
                                                                            final boolean z48 = z36;
                                                                            final int i46 = i33;
                                                                            final boolean z49 = z33;
                                                                            final int i47 = i34;
                                                                            final int i48 = i39;
                                                                            final String str123 = str83;
                                                                            final String str124 = str84;
                                                                            final boolean z50 = z37;
                                                                            final String str125 = str85;
                                                                            final boolean z51 = z38;
                                                                            final boolean z52 = z39;
                                                                            final boolean z53 = z45;
                                                                            final boolean z54 = z25;
                                                                            final boolean z55 = z26;
                                                                            final String str126 = str42;
                                                                            final Integer num11 = num8;
                                                                            final boolean z56 = z43;
                                                                            final byte[] bArr5 = bArr2;
                                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.g80
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    Pattern pattern2 = LaunchActivity.D1;
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    boolean z57 = tLObject2 instanceof TLRPC.TL_messages_chatFull;
                                                                                    f70 f70Var9 = f70Var8;
                                                                                    if (!z57) {
                                                                                        try {
                                                                                            f70Var9.run();
                                                                                            return;
                                                                                        } catch (Exception e10) {
                                                                                            org.telegram.messenger.f8.g(e10, true);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject2;
                                                                                    int i49 = i43;
                                                                                    org.telegram.messenger.vp.r1(i49).V3(tL_messages_chatFull.users, false);
                                                                                    org.telegram.messenger.vp.r1(i49).P3(tL_messages_chatFull.chats, false);
                                                                                    org.telegram.messenger.hs.a0(i49).m1(tL_messages_chatFull.users, tL_messages_chatFull.chats, false, true);
                                                                                    if (org.telegram.messenger.vp.r1(i49).L0(Long.valueOf(chat2.linked_monoforum_id)) != null) {
                                                                                        LaunchActivity.this.B0(i49, str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, z46, num9, l18, l19, num10, str108, hashMap4, str109, str110, str111, str112, tL_wallPaper5, str113, str114, str115, str116, z47, str117, i44, i45, str118, str119, str120, str121, str122, eVar6, z48, i46, z49, i47, i48, str123, str124, z50, str125, z51, z52, z53, z54, z55, str126, num11, z56, bArr5);
                                                                                        return;
                                                                                    }
                                                                                    try {
                                                                                        f70Var9.run();
                                                                                    } catch (Exception e11) {
                                                                                        org.telegram.messenger.f8.g(e11, true);
                                                                                    }
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                    return;
                                                                }
                                                                l14 = l11;
                                                                f70Var7 = f70Var7;
                                                                str51 = str59;
                                                                str52 = str60;
                                                                i28 = i26;
                                                                str53 = str47;
                                                                str54 = str40;
                                                                i29 = i39;
                                                                z27 = z25;
                                                                bArr3 = bArr2;
                                                                launchActivity3 = launchActivity5;
                                                                str50 = str65;
                                                                bundle3.putLong("chat_id", L06.linked_monoforum_id);
                                                                j10 = -L06.linked_monoforum_id;
                                                            }
                                                        }
                                                        l14 = l11;
                                                        str50 = str65;
                                                        str51 = str59;
                                                        str52 = str60;
                                                        i28 = i26;
                                                        str53 = str47;
                                                        str54 = str40;
                                                        i29 = i39;
                                                        z27 = z25;
                                                        bArr3 = bArr2;
                                                        launchActivity3 = launchActivity5;
                                                        bundle3.putLong("chat_id", -l14.longValue());
                                                        j10 = l14.longValue();
                                                    } else {
                                                        l14 = l11;
                                                        i27 = i40;
                                                        launchActivity3 = launchActivity5;
                                                        str50 = str65;
                                                        String str96 = str89;
                                                        str51 = str59;
                                                        str52 = str60;
                                                        i28 = i26;
                                                        str53 = str47;
                                                        str54 = str40;
                                                        i29 = i39;
                                                        z27 = z25;
                                                        bArr3 = bArr2;
                                                        bundle3.putLong("user_id", l14.longValue());
                                                        long longValue5 = l14.longValue();
                                                        if (str96 != null) {
                                                            if (str96.startsWith("@")) {
                                                                str96 = " ".concat(str96);
                                                            }
                                                            bundle3.putString("start_text", str96);
                                                        }
                                                        j10 = longValue5;
                                                    }
                                                    if (str50 == null || Z13 == null || !Z13.bot) {
                                                        z28 = false;
                                                    } else {
                                                        bundle3.putString("botUser", str50);
                                                        z28 = true;
                                                    }
                                                    if (launchActivity3.Y0) {
                                                        launchActivity3.Y0 = false;
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
                                                    org.telegram.ui.ActionBar.k2 k2Var4 = (arrayList4.isEmpty() || str51 != null) ? null : (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList4);
                                                    if (k2Var4 == null || org.telegram.messenger.vp.r1(i27).E(bundle3, k2Var4, null, null)) {
                                                        boolean z46 = (k2Var4 instanceof un) && ((un) k2Var4).a() == j10;
                                                        if (z29 && z46) {
                                                            ArrayList arrayList5 = new ArrayList();
                                                            ArrayList<org.telegram.ui.ActionBar.g2> arrayList6 = k2Var4.sheetsStack;
                                                            if (arrayList6 != null) {
                                                                arrayList5.addAll(arrayList6);
                                                            }
                                                            if ((k2Var4.getParentLayout() instanceof ActionBarLayout) && (w9 = ((ActionBarLayout) k2Var4.getParentLayout()).w()) != null && w9 != k2Var4 && (arrayList3 = w9.sheetsStack) != null) {
                                                                arrayList5.addAll(arrayList3);
                                                            }
                                                            int size = arrayList5.size();
                                                            int i43 = 0;
                                                            while (i43 < size) {
                                                                Object obj2 = arrayList5.get(i43);
                                                                i43++;
                                                            }
                                                            ArrayList arrayList7 = new ArrayList(xh.m2.a1);
                                                            int size2 = arrayList7.size();
                                                            int i44 = 0;
                                                            while (i44 < size2) {
                                                                Object obj3 = arrayList7.get(i44);
                                                                i44++;
                                                                xh.m2 m2Var = (xh.m2) obj3;
                                                                if (m2Var.I == j10) {
                                                                    m2Var.o(true);
                                                                }
                                                            }
                                                            un unVar3 = (un) k2Var4;
                                                            if (unVar3.v8 != 0) {
                                                                unVar3.getMessagesController().x4(str50, unVar3.f);
                                                            } else {
                                                                unVar3.c7 = true;
                                                                org.telegram.messenger.vp messagesController = unVar3.getMessagesController();
                                                                TLRPC.User user = unVar3.f;
                                                                unVar3.u8 = str50;
                                                                messagesController.x4(str50, user);
                                                                unVar3.Bc(false);
                                                            }
                                                        } else {
                                                            if (str55 == null || !z46) {
                                                                long j12 = -j10;
                                                                TLRPC.Chat L07 = org.telegram.messenger.vp.r1(launchActivity3.O).L0(Long.valueOf(j12));
                                                                if (z27 || i29 > 0) {
                                                                    try {
                                                                        f70Var7.run();
                                                                    } catch (Exception e10) {
                                                                        org.telegram.messenger.f8.g(e10, true);
                                                                    }
                                                                    if (launchActivity3.isFinishing()) {
                                                                        return;
                                                                    }
                                                                    Bundle bundle4 = new Bundle();
                                                                    if (l14.longValue() < 0) {
                                                                        bundle4.putLong("chat_id", -l14.longValue());
                                                                    } else {
                                                                        bundle4.putLong("user_id", l14.longValue());
                                                                    }
                                                                    if (i29 > 0) {
                                                                        bundle4.putBoolean("open_gifts", true);
                                                                        bundle4.putInt("open_gifts_collection", i29);
                                                                        if (l14.longValue() == org.telegram.messenger.d20.i(launchActivity3.O).e()) {
                                                                            bundle4.putBoolean("my_profile", true);
                                                                        }
                                                                    }
                                                                    ((ActionBarLayout) launchActivity3.M()).R(new ProfileActivity(bundle4, null));
                                                                    return;
                                                                }
                                                                if (L07 == null || !L07.forum) {
                                                                    long j13 = j10;
                                                                    Integer num9 = num4;
                                                                    org.telegram.messenger.vp.r1(i27).s0(j13, num9 == null ? 0 : num9.intValue(), new r90(launchActivity3, f70Var7, str56, k2Var4, j13, num9, bundle3));
                                                                    return;
                                                                }
                                                                Long valueOf = (l13 != null || num4 == null) ? l13 : Long.valueOf(num4.intValue());
                                                                if (valueOf != null && valueOf.longValue() != 0) {
                                                                    launchActivity3.l0(j10, num4, null, num8, bArr5, new y70(f70Var7, 0), 0, -1);
                                                                    return;
                                                                }
                                                                LaunchActivity launchActivity6 = launchActivity3;
                                                                Bundle k10 = org.telegram.ui.Cells.f1.k(j12, "chat_id");
                                                                if (str51 != null) {
                                                                    k10.putString("voicechat", str51);
                                                                }
                                                                if (z34) {
                                                                    k10.putBoolean("videochat", true);
                                                                }
                                                                launchActivity6.t0(pb1.I0(launchActivity6, k10));
                                                                try {
                                                                    f70Var7.run();
                                                                    return;
                                                                } catch (Exception e11) {
                                                                    org.telegram.messenger.f8.g(e11, true);
                                                                    return;
                                                                }
                                                            }
                                                            un unVar4 = (un) k2Var4;
                                                            unVar4.getClass();
                                                            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                                            tL_contacts_resolveUsername.username = str55;
                                                            unVar4.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new pe(unVar4, 0));
                                                        }
                                                    }
                                                } else {
                                                    f70Var6 = f70Var7;
                                                    TLRPC.User Z14 = org.telegram.messenger.vp.r1(i40).Z1(l11);
                                                    if (Z14 == null || (Z14.bot && Z14.bot_nochats)) {
                                                        try {
                                                            if (arrayList4.isEmpty()) {
                                                                return;
                                                            }
                                                            org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) arrayList4.get(arrayList4.size() - 1)).t(org.telegram.messenger.cd.L0(2131753108, null), null).j();
                                                            return;
                                                        } catch (Exception e12) {
                                                            org.telegram.messenger.f8.g(e12, true);
                                                            return;
                                                        }
                                                    }
                                                    z21 = true;
                                                    Bundle j14 = org.telegram.ui.Cells.f1.j(2, "onlySelect", "dialogsType", true);
                                                    j14.putBoolean("resetDelegate", false);
                                                    j14.putBoolean("closeFragment", false);
                                                    j14.putBoolean("allowGroups", str66 != null);
                                                    j14.putBoolean("allowChannels", str67 != null);
                                                    String str97 = TextUtils.isEmpty(str66) ? TextUtils.isEmpty(str67) ? null : str67 : str66;
                                                    ay ayVar3 = new ay(j14);
                                                    ayVar3.C2 = new ag.q2(launchActivity5, i40, Z14, str68, str97, ayVar3);
                                                    launchActivity5.t0(ayVar3);
                                                }
                                                f70Var6 = f70Var7;
                                            } else {
                                                f70 f70Var8 = f70Var4;
                                                int z02 = launchActivity2.z0(i24, f70Var8, num4, num5, l13, null, null, org.telegram.messenger.vp.r1(i24).L0(Long.valueOf(-l11.longValue())), null, null, 0, -1);
                                                iArr2[0] = z02;
                                                if (z02 != 0) {
                                                    return;
                                                }
                                                f70Var6 = f70Var8;
                                                z21 = true;
                                            }
                                            f70Var6.run();
                                            return;
                                        }
                                        TLRPC.User Z15 = org.telegram.messenger.vp.r1(i24).Z1(l11);
                                        if (Z15 != null && Z15.bot) {
                                            org.telegram.messenger.vp.r1(i24).u3(null, Z15, str43, 0, eVar3, z38, z39);
                                        }
                                        f70Var6 = f70Var4;
                                        z21 = true;
                                        f70Var6.run();
                                        return;
                                    }
                                }
                                f70Var6.run();
                                return;
                            } catch (Exception e13) {
                                org.telegram.messenger.f8.g(e13, z21);
                                return;
                            }
                            z21 = true;
                            org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                            if (Q != null) {
                                if (Q instanceof un) {
                                    ((un) Q).Jb();
                                }
                                Typeface typeface = org.telegram.messenger.i0.a;
                                try {
                                    Double.parseDouble(str57);
                                    z22 = true;
                                } catch (NumberFormatException unused2) {
                                    z22 = false;
                                }
                                if (z22) {
                                    org.telegram.ui.Components.cc.a0(Q).t(org.telegram.messenger.cd.L0(2131748198, null), null).j();
                                } else {
                                    org.telegram.ui.Components.cc.a0(Q).t(org.telegram.messenger.cd.L0(2131748150, null), null).j();
                                }
                            }
                        }
                    };
                    eVar2 = eVar2;
                    c22.a(str, str31, q20Var);
                    iArr = iArr2;
                    x1Var = x1Var4;
                    i16 = 0;
                    f70Var = null;
                    if (iArr[i16] == 0) {
                    }
                }
            }
            i17 = i10;
            i16 = 0;
            iArr = iArr2;
            f70Var = null;
            x1Var = x1Var4;
            if (iArr[i16] == 0) {
            }
        }
        i17 = i10;
        i16 = 0;
        iArr = iArr2;
        f70Var = null;
        x1Var = x1Var4;
        if (iArr[i16] == 0) {
        }
    }

    public final void C(int i10) {
        L1 = this;
        Set set = org.telegram.messenger.c1.a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - org.telegram.messenger.tz.H) >= 86400) {
            org.telegram.messenger.tz.H = currentTimeMillis;
            Utilities.f.c(new org.telegram.messenger.a1(currentTimeMillis, org.telegram.messenger.b8.j(4), 0));
        }
        if (org.telegram.messenger.v2.a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - org.telegram.messenger.tz.I) >= 3600) {
                org.telegram.messenger.tz.I = currentTimeMillis2;
                Utilities.f.c(new org.telegram.messenger.wd(currentTimeMillis2, 5));
            }
        }
        if ((Build.VERSION.SDK_INT < 26 || i10 != 0) && !this.x1) {
            Utilities.e.d(new t80(this, i10, 1), 2000L);
        }
    }

    public final void D0(int i10) {
        this.z0.setInternalNavigationBarColor(i10);
        org.telegram.ui.ActionBar.i3 O = O();
        if (O != null) {
            O.setNavigationBarColor(i10);
        }
    }

    public final void E() {
        if (!org.telegram.messenger.i0.Q1() || this.s0 == null) {
            return;
        }
        Boolean bool = org.telegram.messenger.i0.L;
        if (bool != null) {
            if (bool.booleanValue() != (org.telegram.messenger.w0.b != null && org.telegram.messenger.w0.b.getResources().getBoolean(R.bool.isTablet))) {
                return;
            }
        }
        if (org.telegram.messenger.i0.E || (org.telegram.messenger.i0.P1() && getResources().getConfiguration().orientation != 2)) {
            this.O0 = true;
            List<org.telegram.ui.ActionBar.k2> fragmentStack = this.s0.getFragmentStack();
            if (!fragmentStack.isEmpty()) {
                while (fragmentStack.size() > 0) {
                    org.telegram.ui.ActionBar.k2 k2Var = fragmentStack.get(0);
                    if (k2Var instanceof un) {
                        un unVar = (un) k2Var;
                        unVar.k5 = true;
                        unVar.l5 = true;
                    }
                    k2Var.onPause();
                    k2Var.onFragmentDestroy();
                    k2Var.setParentLayout(null);
                    fragmentStack.remove(k2Var);
                    this.q0.c(-1, k2Var);
                }
                org.telegram.ui.Components.bd0 bd0Var = this.A0;
                if (bd0Var == null || bd0Var.b.getVisibility() != 0) {
                    this.q0.W(true, true);
                }
            }
            this.s0.getView().setVisibility(8);
            this.v0.setVisibility(this.q0.getFragmentStack().isEmpty() ? 0 : 8);
            return;
        }
        this.O0 = false;
        List<org.telegram.ui.ActionBar.k2> fragmentStack2 = this.q0.getFragmentStack();
        if (fragmentStack2.size() >= 2) {
            while (1 < fragmentStack2.size()) {
                org.telegram.ui.ActionBar.k2 k2Var2 = fragmentStack2.get(1);
                if (k2Var2 instanceof un) {
                    un unVar2 = (un) k2Var2;
                    unVar2.k5 = true;
                    unVar2.l5 = true;
                }
                k2Var2.onPause();
                k2Var2.onFragmentDestroy();
                k2Var2.setParentLayout(null);
                fragmentStack2.remove(k2Var2);
                this.s0.c(-1, k2Var2);
            }
            org.telegram.ui.Components.bd0 bd0Var2 = this.A0;
            if (bd0Var2 == null || bd0Var2.b.getVisibility() != 0) {
                this.q0.W(true, true);
                this.s0.W(true, true);
            }
        }
        this.s0.getView().setVisibility(this.s0.getFragmentStack().isEmpty() ? 8 : 0);
        this.v0.setVisibility(this.s0.getFragmentStack().isEmpty() ? 0 : 8);
    }

    public final void E0() {
        org.telegram.ui.ActionBar.s3 s3Var;
        ViewGroup view;
        if (this.z0.indexOfChild(this.t0) != -1) {
            s3Var = this.z0;
            view = this.t0;
        } else {
            s3Var = this.z0;
            view = this.q0.getView();
        }
        int indexOfChild = s3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.z0.removeViewAt(indexOfChild);
        }
        if (org.telegram.messenger.i0.Q1()) {
            getWindow().setSoftInputMode(16);
            n90 n90Var = new n90(this, this);
            this.t0 = n90Var;
            if (indexOfChild != -1) {
                this.z0.addView(n90Var, indexOfChild, w7.b6.c(-1.0f, -1));
            } else {
                this.z0.addView(n90Var, w7.b6.c(-1.0f, -1));
            }
            w8 w8Var = new w8(this, null);
            this.v0 = w8Var;
            w8Var.setOccupyStatusBar(false);
            this.v0.U(org.telegram.ui.ActionBar.t6.s0());
            this.t0.addView(this.v0, w7.b6.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.q0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.q0.getView());
            }
            this.t0.addView(this.q0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.s0 = actionBarLayout;
            actionBarLayout.T0 = true;
            actionBarLayout.setFragmentStack(this.f0);
            this.s0.setDelegate(this);
            this.t0.addView(this.s0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.u0 = frameLayout;
            ArrayList arrayList = this.e0;
            frameLayout.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.u0.setBackgroundColor(1056964608);
            this.t0.addView(this.u0);
            this.u0.setOnTouchListener(new d0(this, 3));
            this.u0.setOnClickListener(new bh.c(16));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.r0 = actionBarLayout2;
            actionBarLayout2.S0 = true;
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
        v7.h7.a(this, org.telegram.messenger.tz.x1, false);
    }

    public final void F(boolean z10, boolean z11, boolean z12) {
        sn snVar;
        boolean z13;
        ArrayList arrayList = this.d0;
        boolean z14 = true;
        org.telegram.ui.ActionBar.k2 k2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList) : null;
        char c10 = 2;
        if (k2Var != null && (k2Var.isRemovingFromStack() || k2Var.isInPreviewMode())) {
            k2Var = arrayList.size() > 1 ? (org.telegram.ui.ActionBar.k2) i0.a.g(2, arrayList) : null;
        }
        if (k2Var != null) {
            k2Var.hasForceLightStatusBar();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (z11) {
            if (k2Var != null) {
                z13 = k2Var.isLightStatusBar();
                if (k2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) k2Var.getParentLayout();
                    if (actionBarLayout.w() == null || actionBarLayout.w().getLastSheet() == null) {
                        ArrayList<org.telegram.ui.ActionBar.g2> arrayList2 = k2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) i0.a.g(1, k2Var.sheetsStack);
                            if (g2Var.s()) {
                                z13 = g2Var.f();
                            }
                        }
                    } else {
                        org.telegram.ui.ActionBar.g2 lastSheet = actionBarLayout.w().getLastSheet();
                        if (lastSheet.s()) {
                            z13 = lastSheet.f();
                        }
                    }
                }
            } else {
                z13 = i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.s8, true)) > 0.699999988079071d;
            }
            org.telegram.messenger.i0.o3(this, z13);
        }
        if (i10 >= 26 && z12 && (!z10 || k2Var == null || !k2Var.isInPreviewMode())) {
            int x02 = (k2Var == null || !z10) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, true) : k2Var.getNavigationBarColor();
            if (k2Var instanceof un) {
                un unVar = (un) k2Var;
                if (!unVar.Zb || (unVar.w.s != 1 && ((snVar = unVar.xa) == null || !snVar.q))) {
                    c10 = 1;
                }
            } else {
                c10 = 0;
            }
            if (O() != null && O().H > 0) {
                c10 = 0;
            }
            if (this.q0.w() != null) {
                my w9 = this.q0.w();
                if (w9.sheetsStack != null) {
                    for (int i11 = 0; i11 < w9.sheetsStack.size(); i11++) {
                        org.telegram.ui.ActionBar.g2 g2Var2 = w9.sheetsStack.get(i11);
                        if (g2Var2.z()) {
                            x02 = g2Var2.e(x02);
                            c10 = 0;
                        }
                    }
                }
            }
            Iterator it = xh.m2.a1.iterator();
            while (it.hasNext()) {
                x02 = ((xh.m2) it.next()).e(x02);
                c10 = 0;
            }
            D0(x02);
            if ((c10 != 0 || org.telegram.messenger.i0.B(x02) < 0.721f) && c10 != 1) {
                z14 = false;
            }
            org.telegram.messenger.i0.l3(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final org.telegram.ui.ActionBar.x1 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.x1 p5 = alertDialog$Builder.p();
            p5.setCanceledOnTouchOutside(true);
            p5.setOnDismissListener(new mg.g(7, this, p5));
            this.E0.add(p5);
            return p5;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }

    @Override // org.telegram.ui.ux
    public final boolean G() {
        ArrayList arrayList = this.U;
        return (arrayList != null && arrayList.size() == 1) || this.R != null;
    }

    public final void H(boolean z10) {
        org.telegram.messenger.u3 u3Var;
        long j10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = false;
        if (sharedInstance == null || (u3Var = sharedInstance.groupCall) == null) {
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
            j10 = org.telegram.messenger.d20.i(this.O).n;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(j10);
        boolean z13 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted) ? false : true;
        if (z13 && groupCallParticipant.raise_hand_rating != 0) {
            z11 = true;
        }
        this.l0 = z11;
        if (z10 || !z12 || z11 || z13 || b50.u5 != null) {
            return;
        }
        N0(38);
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.k2 k2Var;
        ArrayList arrayList = this.e0;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f0;
            if (arrayList2.isEmpty()) {
                ArrayList arrayList3 = this.d0;
                k2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList3) : null;
            } else {
                k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList2);
            }
        } else {
            k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
        }
        if (org.telegram.ui.Components.cc.a(k2Var)) {
            aVar.c(org.telegram.ui.Components.cc.a0(k2Var)).j();
        }
    }

    public final void I() {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.k2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (org.telegram.messenger.i0.Q1()) {
            ArrayList arrayList2 = this.e0;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((org.telegram.ui.ActionBar.k2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f0;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                ((org.telegram.ui.ActionBar.k2) obj3).onFragmentDestroy();
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
        org.telegram.messenger.zc zcVar;
        if (org.telegram.messenger.d20.i(this.O).p()) {
            try {
                if (!this.I0 && !org.telegram.messenger.w0.x) {
                    String string = org.telegram.messenger.vp.d1().getString("language_showed2", "");
                    final String str = org.telegram.messenger.vp.r1(this.O).Q3;
                    if (string.equals(str)) {
                        if (org.telegram.messenger.v2.a) {
                            org.telegram.messenger.f8.b("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final org.telegram.messenger.zc[] zcVarArr = new org.telegram.messenger.zc[2];
                    boolean z10 = false;
                    String str2 = str.contains("-") ? str.split("-")[0] : str;
                    String str3 = "in".equals(str2) ? "id" : "iw".equals(str2) ? "he" : "jw".equals(str2) ? "jv" : null;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= org.telegram.messenger.cd.D0().J.size()) {
                            r16 = z10;
                            break;
                        }
                        org.telegram.messenger.zc zcVar2 = (org.telegram.messenger.zc) org.telegram.messenger.cd.D0().J.get(i10);
                        boolean z11 = z10;
                        if (zcVar2.c.equals("en")) {
                            zcVarArr[z11 ? 1 : 0] = zcVar2;
                        }
                        if (zcVar2.c.replace("_", "-").equals(str) || zcVar2.c.equals(str2) || zcVar2.c.equals(str3)) {
                            zcVarArr[1] = zcVar2;
                        }
                        if (zcVarArr[z11 ? 1 : 0] != null && zcVarArr[1] != null) {
                            r16 = z11;
                            break;
                        } else {
                            i10++;
                            z10 = z11 ? 1 : 0;
                        }
                    }
                    org.telegram.messenger.zc zcVar3 = zcVarArr[r16];
                    if (zcVar3 != null && (zcVar = zcVarArr[1]) != null && zcVar3 != zcVar) {
                        if (org.telegram.messenger.v2.a) {
                            org.telegram.messenger.f8.b("show lang alert for " + zcVarArr[r16].b() + " and " + zcVarArr[1].b());
                        }
                        this.J0 = null;
                        this.K0 = null;
                        this.I0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = zcVarArr[1].c();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        final int i11 = 0;
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) { // from class: org.telegram.ui.b90
                            public final /* synthetic */ LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i12 = 0;
                                switch (i11) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.D1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i12 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i12);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i12++;
                                            }
                                        }
                                        final int i13 = 0;
                                        final LaunchActivity launchActivity = this.b;
                                        final org.telegram.messenger.zc[] zcVarArr2 = zcVarArr;
                                        final String str4 = str;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.s70
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.J0 = hashMap2;
                                                        if (launchActivity2.K0 != null && hashMap2 != null) {
                                                            org.telegram.messenger.zc[] zcVarArr3 = zcVarArr2;
                                                            launchActivity2.J0(zcVarArr3[1], zcVarArr3[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
                                                            org.telegram.messenger.zc[] zcVarArr4 = zcVarArr2;
                                                            launchActivity3.J0(zcVarArr4[1], zcVarArr4[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        Pattern pattern2 = LaunchActivity.D1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i12 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i12);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i12++;
                                            }
                                        }
                                        final int i14 = 1;
                                        final LaunchActivity launchActivity2 = this.b;
                                        final org.telegram.messenger.zc[] zcVarArr3 = zcVarArr;
                                        final String str5 = str;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.s70
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i14) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.K0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.zc[] zcVarArr32 = zcVarArr3;
                                                            launchActivity22.J0(zcVarArr32[1], zcVarArr32[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
                                                            org.telegram.messenger.zc[] zcVarArr4 = zcVarArr3;
                                                            launchActivity3.J0(zcVarArr4[1], zcVarArr4[0], str5);
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
                        tL_langpack_getStrings2.lang_code = zcVarArr[r16].c();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        final int i12 = 1;
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) { // from class: org.telegram.ui.b90
                            public final /* synthetic */ LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i122 = 0;
                                switch (i12) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.D1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i122 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i122);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i122++;
                                            }
                                        }
                                        final int i13 = 0;
                                        final LaunchActivity launchActivity = this.b;
                                        final org.telegram.messenger.zc[] zcVarArr2 = zcVarArr;
                                        final String str4 = str;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.s70
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.K0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.zc[] zcVarArr32 = zcVarArr2;
                                                            launchActivity22.J0(zcVarArr32[1], zcVarArr32[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
                                                            org.telegram.messenger.zc[] zcVarArr4 = zcVarArr2;
                                                            launchActivity3.J0(zcVarArr4[1], zcVarArr4[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        Pattern pattern2 = LaunchActivity.D1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i122 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i122);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i122++;
                                            }
                                        }
                                        final int i14 = 1;
                                        final LaunchActivity launchActivity2 = this.b;
                                        final org.telegram.messenger.zc[] zcVarArr3 = zcVarArr;
                                        final String str5 = str;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.s70
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i14) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.K0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.zc[] zcVarArr32 = zcVarArr3;
                                                            launchActivity22.J0(zcVarArr32[1], zcVarArr32[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
                                                            org.telegram.messenger.zc[] zcVarArr4 = zcVarArr3;
                                                            launchActivity3.J0(zcVarArr4[1], zcVarArr4[0], str5);
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
                org.telegram.messenger.f8.g(e, true);
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
    public final void J0(org.telegram.messenger.zc zcVar, org.telegram.messenger.zc zcVar2, String str) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12 = true;
        try {
            this.I0 = false;
            org.telegram.messenger.zc zcVar3 = zcVar;
            if (!zcVar3.j) {
                try {
                    if (!org.telegram.messenger.cd.D0().B.h()) {
                        z11 = false;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = U(2131752108, "ChooseYourLanguage", this.J0);
                        x1Var.S = U(2131752108, "ChooseYourLanguage", this.K0);
                        LinearLayout linearLayout = new LinearLayout(this);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.t4[] t4VarArr = new org.telegram.ui.Cells.t4[2];
                        String U = U(2131751128, "English", this.J0);
                        org.telegram.messenger.zc[] zcVarArr = {!z11 ? zcVar3 : zcVar2, !z11 ? zcVar2 : zcVar3};
                        if (z11) {
                            zcVar3 = zcVar2;
                        }
                        org.telegram.messenger.zc[] zcVarArr2 = {zcVar3};
                        i11 = 0;
                        for (i10 = 2; i11 < i10; i10 = 2) {
                            org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(this);
                            t4VarArr[i11] = t4Var;
                            org.telegram.messenger.zc zcVar4 = zcVarArr[i11];
                            String str2 = zcVar4 == zcVar2 ? U : null;
                            t4Var.b.setText(str2 != null ? str2 : zcVar4.a);
                            t4Var.c.setText(zcVar4.b);
                            t4Var.e = zcVar4;
                            t4Var.d = z12;
                            t4VarArr[i11].setTag(Integer.valueOf(i11));
                            org.telegram.ui.Cells.t4 t4Var2 = t4VarArr[i11];
                            int i12 = org.telegram.ui.ActionBar.t6.I5;
                            org.telegram.ui.ActionBar.a7.R(t4Var2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 2, -1), null, org.telegram.ui.ActionBar.a7.N(i12), null);
                            t4VarArr[i11].a.a(i11 == 0, false);
                            linearLayout.addView(t4VarArr[i11], w7.b6.o(-1, 50));
                            t4VarArr[i11].setOnClickListener(new wu(13, zcVarArr2, t4VarArr));
                            i11++;
                            z12 = true;
                        }
                        org.telegram.ui.Cells.t4 t4Var3 = new org.telegram.ui.Cells.t4(this);
                        String U2 = U(2131752107, "ChooseYourLanguageOther", this.J0);
                        String U3 = U(2131752107, "ChooseYourLanguageOther", this.K0);
                        t4Var3.b.setText(U2);
                        t4Var3.c.setText(U3);
                        t4Var3.a.a(false, false);
                        t4Var3.e = null;
                        t4Var3.d = false;
                        int i13 = org.telegram.ui.ActionBar.t6.I5;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i13, false), 2, -1);
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
                        t4Var3.setBackground(h02);
                        org.telegram.ui.ActionBar.a7.k(t4Var3, h02, null, N, null);
                        t4Var3.setOnClickListener(new f50(this, 4));
                        linearLayout.addView(t4Var3, w7.b6.o(-1, 50));
                        alertDialog$Builder.o(linearLayout);
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747847, null), new rv(12, this, zcVarArr2));
                        this.H0 = F0(alertDialog$Builder);
                        org.telegram.messenger.vp.d1().edit().putString("language_showed2", str).commit();
                    }
                } catch (Exception e) {
                    e = e;
                    z10 = true;
                    org.telegram.messenger.f8.g(e, z10);
                    return;
                }
            }
            z11 = true;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            x1Var2.R = U(2131752108, "ChooseYourLanguage", this.J0);
            x1Var2.S = U(2131752108, "ChooseYourLanguage", this.K0);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            org.telegram.ui.Cells.t4[] t4VarArr2 = new org.telegram.ui.Cells.t4[2];
            String U4 = U(2131751128, "English", this.J0);
            org.telegram.messenger.zc[] zcVarArr3 = {!z11 ? zcVar3 : zcVar2, !z11 ? zcVar2 : zcVar3};
            if (z11) {
            }
            org.telegram.messenger.zc[] zcVarArr22 = {zcVar3};
            i11 = 0;
            while (i11 < i10) {
            }
            org.telegram.ui.Cells.t4 t4Var32 = new org.telegram.ui.Cells.t4(this);
            String U22 = U(2131752107, "ChooseYourLanguageOther", this.J0);
            String U32 = U(2131752107, "ChooseYourLanguageOther", this.K0);
            t4Var32.b.setText(U22);
            t4Var32.c.setText(U32);
            t4Var32.a.a(false, false);
            t4Var32.e = null;
            t4Var32.d = false;
            int i132 = org.telegram.ui.ActionBar.t6.I5;
            org.telegram.ui.Cells.y h022 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i132, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i132);
            t4Var32.setBackground(h022);
            org.telegram.ui.ActionBar.a7.k(t4Var32, h022, null, N2, null);
            t4Var32.setOnClickListener(new f50(this, 4));
            linearLayout2.addView(t4Var32, w7.b6.o(-1, 50));
            alertDialog$Builder2.o(linearLayout2);
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131747847, null), new rv(12, this, zcVarArr22));
            this.H0 = F0(alertDialog$Builder2);
            org.telegram.messenger.vp.d1().edit().putString("language_showed2", str).commit();
        } catch (Exception e7) {
            e = e7;
            z10 = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Type inference failed for: r14v3, types: [org.telegram.messenger.cd] */
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
        TLRPC.User Z1;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.O);
        org.telegram.messenger.i5 r10 = org.telegram.messenger.i5.r(this.O);
        ArrayList arrayList = new ArrayList(r10.e0);
        ArrayList arrayList2 = new ArrayList();
        String str4 = null;
        boolean z10 = false;
        if (str2 != null) {
            String d = af.b.d(str2, false);
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) r10.k0.get(d);
            if (tL_contact == null) {
                tL_contact = (TLRPC.TL_contact) r10.l0.get(d.substring(Math.max(0, d.length() - 7)));
            }
            if (tL_contact != null) {
                TLRPC.User Z12 = r12.Z1(Long.valueOf(tL_contact.user_id));
                if (Z12 == null || Z12.self) {
                    str3 = null;
                    if (arrayList2.isEmpty() && str3 != null) {
                        lowerCase = str3.trim().toLowerCase();
                        if (!TextUtils.isEmpty(lowerCase)) {
                            ?? r82 = 1;
                            String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                            if (lowerCase.equals(R0) || R0.length() == 0) {
                                R0 = null;
                            }
                            String[] strArr = {lowerCase, R0};
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList.get(i10);
                                if (tL_contact2 != null && (Z1 = r12.Z1(Long.valueOf(tL_contact2.user_id))) != null && !Z1.self) {
                                    char c10 = 3;
                                    String[] strArr2 = new String[3];
                                    strArr2[z10 ? 1 : 0] = org.telegram.messenger.i5.m(z10 ? 1 : 0, Z1.first_name, Z1.last_name).toLowerCase();
                                    String R02 = org.telegram.messenger.cd.D0().R0(strArr2[z10 ? 1 : 0], r82, z10);
                                    strArr2[r82] = R02;
                                    if (strArr2[z10 ? 1 : 0].equals(R02)) {
                                        strArr2[r82] = str4;
                                    }
                                    if (org.telegram.messenger.h20.z(Z1)) {
                                        strArr2[2] = org.telegram.messenger.cd.L0(2131746281, str4).toLowerCase();
                                    } else if (Z1.self) {
                                        strArr2[2] = org.telegram.messenger.cd.L0(2131745918, str4).toLowerCase();
                                    }
                                    int i11 = z10 ? 1 : 0;
                                    int i12 = i11;
                                    boolean z11 = z10;
                                    while (true) {
                                        if (i11 < 2) {
                                            String str5 = strArr[i11];
                                            if (str5 != null) {
                                                for (?? r72 = z11; r72 < c10; r72++) {
                                                    String str6 = strArr2[r72];
                                                    if (str6 != null && (str6.startsWith(str5) || str6.contains(" ".concat(str5)))) {
                                                        i12 = 1;
                                                        break;
                                                    }
                                                    c10 = 3;
                                                }
                                                String n10 = org.telegram.messenger.h20.n(Z1);
                                                if (i12 == 0 && n10 != null && n10.startsWith(str5)) {
                                                    i12 = 1;
                                                }
                                                if (i12 != 0) {
                                                    arrayList2.add(tL_contact2);
                                                    break;
                                                }
                                            }
                                            i11++;
                                            z11 = false;
                                            c10 = 3;
                                        }
                                    }
                                }
                                i10++;
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

    public final void K0(boolean z10, boolean z11, int i10, int i11, rh rhVar) {
        if (this.z0 == null || isFinishing()) {
            return;
        }
        if (this.A0 == null) {
            this.A0 = new org.telegram.ui.Components.bd0(this);
        }
        org.telegram.messenger.tz.x = true;
        int i12 = 0;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(false, true);
        } else if (h4.G() && h4.v().V) {
            h4.v().m(false, true);
        }
        vh.o8.w();
        org.telegram.messenger.jj jjVar = MediaController.B().u0;
        if (jjVar != null && jjVar.h4()) {
            MediaController.B().q(true, true, false, false);
        }
        this.A0.show();
        org.telegram.ui.Components.ad0 ad0Var = this.A0.b;
        ArrayList arrayList = this.B0;
        arrayList.isEmpty();
        ad0Var.m(z11, i10, i11, new f70(8, this, rhVar));
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.ui.Components.zc0 zc0Var = (org.telegram.ui.Components.zc0) arrayList.get(i13);
            if (z10) {
                int size = arrayList.size() - 1;
            }
            zc0Var.m(z11, i10, i11, null);
        }
        org.telegram.messenger.tz.C = true;
        f90 f90Var = new f90(this);
        this.A0.b.setDelegate(f90Var);
        int size2 = arrayList.size();
        while (i12 < size2) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.Components.zc0) obj).setDelegate(f90Var);
        }
        try {
            org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).Y();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0(int i10, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f7;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (this.C0 == null) {
            final org.telegram.ui.Components.pz0 pz0Var = new org.telegram.ui.Components.pz0(this);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, pz0Var, null);
            int i11 = org.telegram.messenger.i0.m;
            if (i11 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                pz0Var.addView(view, new FrameLayout.LayoutParams(-1, i11));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            final int i12 = 1;
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.logo_middle);
            linearLayout.addView(imageView, w7.b6.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i13 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.messenger.m5.m(textView, i13, null, 1, 17.0f);
            textView.setText(org.telegram.messenger.cd.L0(2131746797, null));
            linearLayout.addView(textView, w7.b6.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            pz0Var.a = textView2;
            org.telegram.ui.ActionBar.a7.V(textView2, i13, null);
            org.telegram.ui.ActionBar.a7.H(textView2, org.telegram.ui.ActionBar.t6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.e0((boolean) (objArr2 == true ? 1 : 0)));
            textView2.setGravity(51);
            textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
            linearLayout.addView(textView2, w7.b6.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f7 = 4.0f;
            scrollView.setPadding(org.telegram.messenger.i0.L(24.0f), i11, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            pz0Var.addView(scrollView, w7.b6.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(org.telegram.messenger.cd.L0(2131751605, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            int i14 = org.telegram.ui.ActionBar.t6.y6;
            org.telegram.ui.ActionBar.a7.V(textView3, i14, null);
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.y J0 = org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.x0(null, i14, false));
            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i14, 25);
            textView3.setBackground(J0);
            org.telegram.ui.ActionBar.a7.k(textView3, J0, null, h, null);
            textView3.setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(10.0f));
            pz0Var.addView(textView3, w7.b6.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            final Object[] objArr3 = objArr == true ? 1 : 0;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.mz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = objArr3;
                    pz0 pz0Var2 = pz0Var;
                    switch (i15) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String L0 = org.telegram.messenger.cd.L0(2131744223, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751603, null), new nz0(pz0Var2, 1));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131753756, null), null);
                            x1Var.T = org.telegram.messenger.cd.L0(2131744000, null);
                            alertDialog$Builder.p();
                            break;
                        default:
                            if (pz0Var2.c.min_age_confirm == 0) {
                                pz0Var2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String L02 = org.telegram.messenger.cd.L0(2131744003, null);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                x1Var2.R = L02;
                                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131754306, null), new nz0(pz0Var2, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                x1Var2.T = org.telegram.messenger.cd.a0("TosAgeText", null, 2131744004, org.telegram.messenger.cd.G(pz0Var2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                break;
                            }
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(org.telegram.messenger.cd.L0(2131754717, null));
            textView4.setGravity(17);
            textView4.setTypeface(org.telegram.messenger.i0.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = org.telegram.messenger.i0.L(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            pz0Var.addView(textView4, w7.b6.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.mz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = i12;
                    pz0 pz0Var2 = pz0Var;
                    switch (i15) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String L0 = org.telegram.messenger.cd.L0(2131744223, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751603, null), new nz0(pz0Var2, 1));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131753756, null), null);
                            x1Var.T = org.telegram.messenger.cd.L0(2131744000, null);
                            alertDialog$Builder.p();
                            break;
                        default:
                            if (pz0Var2.c.min_age_confirm == 0) {
                                pz0Var2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String L02 = org.telegram.messenger.cd.L0(2131744003, null);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                x1Var2.R = L02;
                                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131754306, null), new nz0(pz0Var2, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                x1Var2.T = org.telegram.messenger.cd.a0("TosAgeText", null, 2131744004, org.telegram.messenger.cd.G(pz0Var2.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                break;
                            }
                    }
                }
            });
            View view2 = new View(this);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view2, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(75.0f);
            layoutParams.gravity = 80;
            pz0Var.addView(view2, layoutParams);
            this.C0 = pz0Var;
            pz0Var.setAlpha(0.0f);
            this.z0.addView(this.C0, w7.b6.c(-1.0f, -1));
            this.C0.setDelegate(new o90(this));
        } else {
            f7 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = org.telegram.messenger.d20.i(i10).Z;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            org.telegram.messenger.d20.i(i10).Z = tL_help_termsOfService;
            org.telegram.messenger.d20.i(i10).v(false);
        }
        org.telegram.ui.Components.pz0 pz0Var2 = this.C0;
        if (pz0Var2.getVisibility() != 0) {
            pz0Var2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        org.telegram.messenger.jj.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = org.telegram.messenger.i0.L(10.0f);
        int L3 = org.telegram.messenger.i0.L(f7);
        int length = spannableStringBuilder.length() - 2;
        for (int i15 = 0; i15 < length; i15++) {
            if (spannableStringBuilder.charAt(i15) == '\n') {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i16) == '-') {
                    int i17 = i15 + 2;
                    if (spannableStringBuilder.charAt(i17) == ' ') {
                        org.telegram.ui.Components.ia iaVar = new org.telegram.ui.Components.ia(L2, L3);
                        spannableStringBuilder.replace(i16, i15 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(iaVar, i16, i17, 33);
                    }
                }
            }
        }
        pz0Var2.a.setText(spannableStringBuilder);
        pz0Var2.c = tL_help_termsOfService;
        pz0Var2.d = i10;
        this.C0.animate().alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.messenger.i0.F).setListener(null).start();
    }

    public final org.telegram.ui.ActionBar.z4 M() {
        ActionBarLayout actionBarLayout = this.q0;
        ArrayList arrayList = this.P;
        return !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.z4) i0.a.g(1, arrayList) : actionBarLayout;
    }

    public final void M0(int i10, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        boolean z11 = false;
        if (this.D0 == null) {
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i11 = org.telegram.ui.ActionBar.t6.d6;
            o9Var.x = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.x0(null, i11, false), 0});
            o9Var.y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.t6.x0(null, i11, false), 0});
            org.telegram.ui.ActionBar.a7.i(i11, o9Var, null);
            int i12 = (int) (org.telegram.messenger.i0.m / org.telegram.messenger.i0.p);
            FrameLayout frameLayout = new FrameLayout(this);
            o9Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.L(176.0f) + org.telegram.messenger.i0.m));
            org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(this);
            ei0Var.f(R.raw.qr_code_logo, org.telegram.messenger.zs.t1, org.telegram.messenger.zs.t1, null);
            ei0Var.d();
            ei0Var.getAnimatedDrawable().K(1);
            ei0Var.setScaleType(ImageView.ScaleType.CENTER);
            ei0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(14.0f));
            frameLayout.addView(ei0Var, w7.b6.d(-2, -2.0f, 17, 0.0f, i12, 0.0f, 0.0f));
            ei0Var.setOnClickListener(new org.telegram.ui.Components.n9(o9Var));
            FrameLayout frameLayout2 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            o9Var.f = scrollView;
            org.telegram.messenger.i0.y3(scrollView, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.s8, false));
            scrollView.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f));
            scrollView.setClipToPadding(false);
            o9Var.addView(scrollView, w7.b6.d(-1, -1.0f, 51, 27.0f, i12 + org.telegram.messenger.zs.I2, 27.0f, 130.0f));
            scrollView.addView(frameLayout2);
            TextView textView = new TextView(this);
            int i13 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(textView, i13, null);
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(org.telegram.messenger.cd.L0(2131743842, null));
            frameLayout2.addView(textView, w7.b6.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            o9Var.a = textView2;
            org.telegram.ui.ActionBar.a7.V(textView2, i13, null);
            org.telegram.ui.ActionBar.a7.H(textView2, org.telegram.ui.ActionBar.t6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.e0(z11));
            textView2.setGravity(49);
            textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
            frameLayout2.addView(textView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            jg.l0 l0Var = new jg.l0(this, 11);
            o9Var.d = l0Var;
            l0Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            l0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
            l0Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            o9Var.addView(l0Var, w7.b6.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            l0Var.setOnClickListener(new org.telegram.ui.Components.n9(o9Var, this));
            TextView textView3 = new TextView(this);
            o9Var.b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            l0Var.addView(textView3, w7.b6.e(-2, -2, 17));
            jg.l0 l0Var2 = new jg.l0(o9Var, this, 12);
            o9Var.c = l0Var2;
            l0Var2.setWillNotDraw(false);
            l0Var2.setAlpha(0.0f);
            l0Var2.setScaleX(0.1f);
            l0Var2.setScaleY(0.1f);
            l0Var2.setVisibility(4);
            org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(l0Var2);
            o9Var.e = fi0Var;
            fi0Var.d(null, true, false);
            fi0Var.o = -1;
            l0Var.addView(l0Var2, w7.b6.e(36, 36, 17));
            this.D0 = o9Var;
            this.z0.addView(o9Var, w7.b6.c(-1.0f, -1));
        }
        org.telegram.ui.Components.o9 o9Var2 = this.D0;
        TextView textView4 = o9Var2.b;
        o9Var2.w = 0;
        o9Var2.n = tL_help_appUpdate;
        o9Var2.s = i10;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            o9Var2.r = org.telegram.messenger.b8.r(null, document);
        }
        if (o9Var2.getVisibility() != 0) {
            o9Var2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        org.telegram.messenger.jj.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
        o9Var2.a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            textView4.setText(org.telegram.messenger.cd.L0(2131743848, null) + String.format(Locale.US, " (%1$s)", org.telegram.messenger.i0.i0(tL_help_appUpdate.document.size, false, false)));
        } else {
            textView4.setText(org.telegram.messenger.cd.L0(2131743848, null));
        }
        org.telegram.messenger.zs.f(o9Var2.s).c(o9Var2, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs.f(o9Var2.s).c(o9Var2, org.telegram.messenger.zs.Z1);
        org.telegram.messenger.zs.f(o9Var2.s).c(o9Var2, org.telegram.messenger.zs.X1);
        if (z10) {
            org.telegram.messenger.w0.u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r7 == null) goto L29;
     */
    @Override // org.telegram.ui.ux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N(ay ayVar) {
        vh.n5 l4;
        FileOutputStream fileOutputStream;
        ArrayList arrayList = this.U;
        if (arrayList == null || arrayList.isEmpty()) {
            String str = this.R;
            if (str != null) {
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, str, 0, true, 0, 0);
                try {
                    Bitmap r10 = org.telegram.messenger.qz.r(1, str);
                    File file = new File(org.telegram.messenger.b8.z(4), "-2147483648_" + org.telegram.messenger.tz.p() + ".jpg");
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
                            org.telegram.messenger.f8.g(th, true);
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
                l4 = vh.n5.l(efVar);
            }
            l4 = null;
        } else {
            ArrayList P7 = un.P7(this.U, false, null);
            if (!P7.isEmpty()) {
                l4 = vh.n5.l((org.telegram.messenger.ef) P7.get(0));
            }
            l4 = null;
        }
        if (l4 == null) {
            return false;
        }
        j4.w o10 = org.telegram.messenger.vp.r1(this.O).O1().o();
        if (o10 != null && o10.a(this.O, 1)) {
            ayVar.showDialog(new kg.q0(o10.b(), this.O, this, ayVar, null));
            return false;
        }
        l4.o = true;
        l4.M = false;
        vh.o8.D(this, this.O).R(null, l4, 0L);
        ayVar.finishFragment();
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

    public final void N0(int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || this.d0.isEmpty() || sharedInstance.groupCall == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.ui.ActionBar.k2 k2Var = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
        if (k2Var instanceof pf0) {
            k2Var = ((pf0) k2Var).b0();
        }
        UndoView undoView = null;
        if (k2Var instanceof un) {
            un unVar = (un) k2Var;
            if (chat != null && unVar.a() == (-chat.id)) {
                chat = null;
            }
            unVar.Y7();
            undoView = unVar.M3;
        } else if (k2Var instanceof ay) {
            undoView = ((ay) k2Var).j4();
        } else if (k2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) k2Var).L;
        }
        if (undoView != null) {
            undoView.m(0L, chat, i10);
        }
        if (i10 != 38 || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().playAllowTalkSound();
    }

    public final org.telegram.ui.ActionBar.i3 O() {
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

    public final void O0(int i10) {
        P0(i10, new org.telegram.ui.Components.z11(16));
    }

    public final org.telegram.ui.ActionBar.k2 P() {
        return hf0.r1(this.O, false).getInt("currentViewNum", 0) != 0 ? new hf0() : new s60();
    }

    public final void P0(int i10, org.telegram.messenger.l9 l9Var) {
        if (i10 == org.telegram.messenger.d20.s0 || !org.telegram.messenger.d20.r(i10)) {
            return;
        }
        this.m1 = true;
        ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
        org.telegram.messenger.d20.s0 = i10;
        org.telegram.messenger.d20.i(0).v(false);
        A();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.c4, Integer.valueOf(i10));
        if (org.telegram.messenger.i0.Q1()) {
            this.r0.Z();
            this.s0.Z();
            if (!this.O0) {
                if (this.s0.getFragmentStack().isEmpty()) {
                    this.v0.setVisibility(0);
                }
                this.s0.getView().setVisibility(8);
            }
            this.r0.getView().setVisibility(8);
        }
        this.q0.Z();
        this.q0.c(-3, (pf0) l9Var.l(null));
        this.q0.W(true, true);
        if (org.telegram.messenger.i0.Q1()) {
            this.r0.W(true, true);
            this.s0.W(true, true);
        }
        if (!org.telegram.messenger.w0.x) {
            ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
        }
        if (org.telegram.messenger.d20.i(i10).Z != null) {
            L0(i10, org.telegram.messenger.d20.i(i10).Z);
        }
        Q0();
        this.m1 = false;
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
            str = "WaitingForNetwork";
            i10 = 2131743238;
        } else if (connectionState == 5) {
            str = "Updating";
            i10 = 2131743836;
        } else if (connectionState == 4) {
            str = "ConnectingToProxyWithDots";
            i10 = 2131751805;
        } else if (connectionState == 1) {
            str = "Connecting";
            i10 = 2131751809;
        } else {
            i10 = 0;
            str = null;
        }
        q70 q70Var = (connectionState == 1 || connectionState == 4) ? new q70(this, 9) : null;
        ActionBarLayout actionBarLayout = this.q0;
        actionBarLayout.M0 = str;
        actionBarLayout.N0 = i10;
        actionBarLayout.O0 = q70Var;
        for (int i11 = 0; i11 < actionBarLayout.U0.size(); i11++) {
            ((org.telegram.ui.ActionBar.k2) actionBarLayout.U0.get(i11)).setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, q70Var);
        }
    }

    public final int R() {
        return this.d0.size();
    }

    public final hh.e S() {
        return this.h1;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r35v45 ??), method size: 16278
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final boolean W(android.content.Intent r123, boolean r124, boolean r125, boolean r126, gf.e r127, boolean r128, boolean r129) {
        /*
            Method dump skipped, instructions count: 16278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.W(android.content.Intent, boolean, boolean, boolean, gf.e, boolean, boolean):boolean");
    }

    public final void X() {
        ActionMode actionMode = this.k0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Y(int i10, TLRPC.User user, String str, gf.e eVar) {
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = r12.p1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new a3.b(1), new j70(this, eVar, r12, i10, user));
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final void a(float f7) {
        if (h4.G() && h4.v().V) {
            h4 v = h4.v();
            v.Q();
            h4.e0(v);
            if (v.f0 != null) {
                v.u0[0].b.g1();
                v.u0[1].b.g1();
                v.f0.invalidate();
                v.q0.invalidate();
                if (f7 == 1.0f) {
                    v.u0[0].c.f();
                    v.u0[1].c.f();
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
        Boolean bool = org.telegram.messenger.i0.L;
        if (bool == null) {
            return;
        }
        org.telegram.messenger.i0.L = null;
        if (bool.booleanValue() != org.telegram.messenger.i0.Q1()) {
            boolean booleanValue = bool.booleanValue();
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
                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                    if (!(k2Var instanceof pf0)) {
                        if (k2Var instanceof ay) {
                            ay ayVar = (ay) k2Var;
                            if (ayVar.s4() && !ayVar.p4()) {
                                j12 = 0;
                                if (ayVar.Y2 != 0) {
                                    if (!(k2Var instanceof un)) {
                                        un unVar = (un) k2Var;
                                        if (!unVar.c()) {
                                            arrayList2.add(k2Var);
                                            if (j13 == j12) {
                                                j13 = unVar.a();
                                                j10 = unVar.b();
                                            }
                                        }
                                    }
                                    arrayList.add(k2Var);
                                }
                            }
                        }
                        j12 = 0;
                        if (!(k2Var instanceof un)) {
                        }
                        arrayList.add(k2Var);
                    }
                    arrayList3.add(k2Var);
                }
                j11 = j13;
            }
            E0();
            this.q0.W(true, true);
            if (org.telegram.messenger.i0.Q1()) {
                this.s0.W(true, true);
                this.r0.W(true, true);
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    Object obj3 = (org.telegram.ui.ActionBar.k2) obj2;
                    if (obj3 instanceof pf0) {
                        obj3 = ((pf0) obj3).J;
                    }
                    if (obj3 instanceof ay) {
                        ay ayVar2 = (ay) obj3;
                        if (ayVar2.s4()) {
                            org.telegram.messenger.gs gsVar = ayVar2.p2;
                            gsVar.a = j11;
                            gsVar.b = j10;
                            zx[] zxVarArr = ayVar2.e0;
                            if (zxVarArr != null) {
                                for (zx zxVar : zxVarArr) {
                                    if (zxVar.p() && org.telegram.messenger.i0.Q1()) {
                                        zxVar.d.s = gsVar.a;
                                    }
                                }
                                int i12 = org.telegram.messenger.vp.D8;
                                ayVar2.t5(512, true);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.i0.Q1() && actionBarLayout == this.r0) {
            this.s0.W(z10, z10);
            this.q0.W(z10, z10);
        }
    }

    public final void c0() {
        org.telegram.ui.ActionBar.z4[] z4VarArr = {this.q0, this.r0, this.s0};
        for (int i10 = 0; i10 < 3; i10++) {
            org.telegram.ui.ActionBar.z4 z4Var = z4VarArr[i10];
            if (z4Var instanceof ActionBarLayout) {
                ((ActionBarLayout) z4Var).D();
            }
        }
    }

    public final boolean d0(boolean z10) {
        boolean z11;
        fg.l lVar = v7.h7.a;
        if (lVar != null) {
            if (lVar.s) {
                if (z10) {
                    lVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.bd0 bd0Var = this.A0;
        if (bd0Var == null || bd0Var.b.getVisibility() != 0) {
            org.telegram.ui.ActionBar.q3 q3Var = this.y0;
            if (q3Var == null || !(z11 = q3Var.U)) {
                org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.rm0.H;
                if (x1Var != null) {
                    if (z10) {
                        x1Var.dismiss();
                        org.telegram.ui.Components.rm0.H = null;
                        return false;
                    }
                } else if (lt.g0 == null || !lt.p().E) {
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
                        if (!h4.G() || !h4.v().V) {
                            return true;
                        }
                        if (z10) {
                            h4.v().m(true, false);
                        }
                    }
                } else if (z10) {
                    lt.p().n();
                    return false;
                }
            } else if (z10 && z11) {
                q3Var.a(false);
                return false;
            }
        } else if (z10) {
            finish();
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x04d7 A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:203:0x046b, B:205:0x0480, B:206:0x048d, B:208:0x049e, B:209:0x04a4, B:211:0x04af, B:213:0x04b5, B:214:0x04bf, B:216:0x04c5, B:220:0x04d7, B:225:0x04e7, B:226:0x04e5, B:227:0x04ea, B:229:0x04ee, B:231:0x04f4, B:232:0x04ff, B:234:0x050f, B:235:0x0515), top: B:202:0x046b }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e5 A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:203:0x046b, B:205:0x0480, B:206:0x048d, B:208:0x049e, B:209:0x04a4, B:211:0x04af, B:213:0x04b5, B:214:0x04bf, B:216:0x04c5, B:220:0x04d7, B:225:0x04e7, B:226:0x04e5, B:227:0x04ea, B:229:0x04ee, B:231:0x04f4, B:232:0x04ff, B:234:0x050f, B:235:0x0515), top: B:202:0x046b }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050f A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:203:0x046b, B:205:0x0480, B:206:0x048d, B:208:0x049e, B:209:0x04a4, B:211:0x04af, B:213:0x04b5, B:214:0x04bf, B:216:0x04c5, B:220:0x04d7, B:225:0x04e7, B:226:0x04e5, B:227:0x04ea, B:229:0x04ee, B:231:0x04f4, B:232:0x04ff, B:234:0x050f, B:235:0x0515), top: B:202:0x046b }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x052e A[Catch: all -> 0x0537, TryCatch #1 {all -> 0x0537, blocks: (B:238:0x051e, B:240:0x052e, B:242:0x0532, B:243:0x053b, B:245:0x053f, B:250:0x05b4, B:252:0x05d8, B:253:0x05f5, B:255:0x05fc, B:256:0x060a), top: B:237:0x051e }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05d8 A[Catch: all -> 0x0537, TryCatch #1 {all -> 0x0537, blocks: (B:238:0x051e, B:240:0x052e, B:242:0x0532, B:243:0x053b, B:245:0x053f, B:250:0x05b4, B:252:0x05d8, B:253:0x05f5, B:255:0x05fc, B:256:0x060a), top: B:237:0x051e }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05fc A[Catch: all -> 0x0537, TryCatch #1 {all -> 0x0537, blocks: (B:238:0x051e, B:240:0x052e, B:242:0x0532, B:243:0x053b, B:245:0x053f, B:250:0x05b4, B:252:0x05d8, B:253:0x05f5, B:255:0x05fc, B:256:0x060a), top: B:237:0x051e }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0514  */
    @Override // org.telegram.messenger.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.Components.cc a02;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.Components.cc a03;
        b50 b50Var;
        char c10;
        char c11;
        ActionBarLayout actionBarLayout;
        Runnable runnable;
        Bitmap bitmap;
        boolean z10;
        View view;
        int i12 = 0;
        int i13 = 1;
        if (i10 == org.telegram.messenger.zs.I2) {
            while (true) {
                if (i12 >= 4) {
                    i12 = -1;
                    break;
                } else if (org.telegram.messenger.d20.i(i12).p()) {
                    break;
                } else {
                    i12++;
                }
            }
            org.telegram.ui.Components.pz0 pz0Var = this.C0;
            if (pz0Var != null) {
                pz0Var.setVisibility(8);
            }
            if (i12 != -1) {
                O0(i12);
                return;
            }
            e01.Z(true);
            I();
            this.q0.Y();
            if (org.telegram.messenger.i0.Q1()) {
                this.r0.Y();
                this.s0.Y();
            }
            s60 s60Var = new s60();
            s60Var.N = true;
            t0(s60Var);
            return;
        }
        if (i10 == org.telegram.messenger.zs.n3) {
            Long l4 = (Long) objArr[0];
            l4.getClass();
            w0(l4, null, null, objArr.length > 1 ? (org.telegram.ui.Cells.q1) objArr[1] : null);
            return;
        }
        if (i10 == org.telegram.messenger.zs.k4) {
            if (objArr[0] != this) {
                e0();
                finish();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.T1) {
            int connectionState = ConnectionsManager.getInstance(i11).getConnectionState();
            if (this.c0 != connectionState) {
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("switch to state " + connectionState);
                }
                this.c0 = connectionState;
                Q0();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.j0 || i10 == org.telegram.messenger.zs.W4) {
            return;
        }
        if (i10 == org.telegram.messenger.zs.M0) {
            Integer num = (Integer) objArr[0];
            if (num.intValue() != 6) {
                if (num.intValue() != 3 || this.F0 == null) {
                    if (num.intValue() == 4) {
                        L0(i11, (TLRPC.TL_help_termsOfService) objArr[1]);
                        return;
                    }
                    org.telegram.ui.ActionBar.k2 k2Var = !this.d0.isEmpty() ? (org.telegram.ui.ActionBar.k2) i0.a.g(1, this.d0) : null;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                    if (k2Var != null) {
                        HashMap hashMap = new HashMap();
                        int i14 = org.telegram.ui.ActionBar.t6.L5;
                        hashMap.put("info1", Integer.valueOf(k2Var.getThemedColor(i14)));
                        hashMap.put("info2", Integer.valueOf(k2Var.getThemedColor(i14)));
                        alertDialog$Builder.m(R.raw.not_available, 52, k2Var.getThemedColor(i14), hashMap);
                        alertDialog$Builder.n(i14, k2Var.getResourceProvider());
                        alertDialog$Builder.a.W = true;
                    }
                    if (num.intValue() != 2 && num.intValue() != 3) {
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131748346, null), new i2.q(this, i11, 12));
                    }
                    if (num.intValue() == 5) {
                        alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131748141, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                    } else if (num.intValue() == 0) {
                        alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131748143, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                    } else if (num.intValue() == 1) {
                        alertDialog$Builder.g(org.telegram.messenger.cd.K0(2131748142));
                        alertDialog$Builder.k(org.telegram.messenger.cd.K0(2131747847), null);
                    } else if (num.intValue() == 2) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf((String) objArr[1]);
                        String str = (String) objArr[2];
                        if (str.startsWith("PREMIUM_GIFT_SELF_REQUIRED_")) {
                            String str2 = (String) objArr[1];
                            int indexOf = str2.indexOf(42);
                            int i15 = indexOf + 1;
                            int indexOf2 = str2.indexOf(42, i15);
                            if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
                                valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) str2.substring(i15, indexOf2));
                                valueOf.setSpan(new dh.a(this, 8), indexOf, indexOf2 - 1, 33);
                            }
                        }
                        alertDialog$Builder.g(valueOf);
                        if (str.startsWith("AUTH_KEY_DROP_")) {
                            alertDialog$Builder.k(org.telegram.messenger.cd.K0(2131752589), null);
                            alertDialog$Builder.h(org.telegram.messenger.cd.K0(2131748754), new f90(this));
                        } else if (str.startsWith("PREMIUM_")) {
                            alertDialog$Builder.l(org.telegram.messenger.cd.K0(2131744256));
                            alertDialog$Builder.k(org.telegram.messenger.cd.K0(2131747847), null);
                        } else {
                            alertDialog$Builder.k(org.telegram.messenger.cd.K0(2131747847), null);
                        }
                    } else if (num.intValue() == 3) {
                        alertDialog$Builder.l(org.telegram.messenger.cd.K0(2131746626));
                        alertDialog$Builder.g(org.telegram.messenger.cd.K0(2131743804));
                        alertDialog$Builder.k(org.telegram.messenger.cd.K0(2131747847), null);
                        this.F0 = F0(alertDialog$Builder);
                        return;
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.R0) {
            HashMap hashMap2 = (HashMap) objArr[0];
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            alertDialog$Builder2.l(org.telegram.messenger.cd.K0(R.string.AppName));
            alertDialog$Builder2.k(org.telegram.messenger.cd.K0(2131747847), null);
            alertDialog$Builder2.h(org.telegram.messenger.cd.K0(2131745439), new ag.b0(this, hashMap2, i11, 11));
            alertDialog$Builder2.g(org.telegram.messenger.cd.K0(2131745440));
            if (this.d0.isEmpty()) {
                return;
            }
            ((org.telegram.ui.ActionBar.k2) i0.a.g(1, this.d0)).showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i10 == org.telegram.messenger.zs.z4) {
            w8 w8Var = this.v0;
            if (w8Var != null) {
                w8Var.U(org.telegram.ui.ActionBar.t6.s0());
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.n0) {
            this.f1.g();
            return;
        }
        if (i10 == org.telegram.messenger.zs.x4) {
            boolean z11 = this.d0.size() > 1 && (i0.a.g(1, this.d0) instanceof ProfileActivity);
            y0((!z11 || ((ProfileActivity) i0.a.g(1, this.d0)).u4()) ? z11 : false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.y4) {
            I0();
            return;
        }
        if (i10 == org.telegram.messenger.zs.c1) {
            if (this.d0.isEmpty()) {
                return;
            }
            LaunchActivity launchActivity = I1;
            if (launchActivity == null || launchActivity.O() == null || I1.O().l((TLRPC.TL_webPage) objArr[0]) == null) {
                ((org.telegram.ui.ActionBar.k2) i0.a.g(1, this.d0)).createArticleViewer(false).L(null, (TLRPC.TL_webPage) objArr[0], (String) objArr[1], null);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.Q) {
            ActionBarLayout actionBarLayout2 = this.q0;
            if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                return;
            }
            ((Integer) objArr[0]).getClass();
            HashMap hashMap3 = (HashMap) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            org.telegram.ui.ActionBar.k2 k2Var2 = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this);
            int i16 = org.telegram.ui.ActionBar.t6.L5;
            alertDialog$Builder3.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.t6.v0(i16), null);
            alertDialog$Builder3.n(i16, null);
            alertDialog$Builder3.l(org.telegram.messenger.cd.K0(2131743844));
            alertDialog$Builder3.g(org.telegram.messenger.cd.K0(2131743845));
            alertDialog$Builder3.k(org.telegram.messenger.cd.K0(2131747847), new m70(i11, hashMap3, booleanValue, booleanValue2, 1));
            alertDialog$Builder3.h(org.telegram.messenger.cd.K0(2131752589), new m70(i11, hashMap3, booleanValue, booleanValue2, 2));
            alertDialog$Builder3.a.y0 = new m70(i11, hashMap3, booleanValue, booleanValue2, 0);
            org.telegram.ui.ActionBar.x1 a2 = alertDialog$Builder3.a();
            k2Var2.showDialog(a2);
            a2.setCanceledOnTouchOutside(false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.n4) {
            org.telegram.ui.ActionBar.a7.c0(null, true);
            c0();
            if (!((Boolean) objArr[0]).booleanValue()) {
                try {
                    setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.s8) | (-16777216)));
                } catch (Exception unused) {
                }
            }
            F(objArr.length > 2 && ((Boolean) objArr[2]).booleanValue(), true, (!(objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : true) || this.X0 || this.q0.A()) ? false : true);
            return;
        }
        if (i10 != org.telegram.messenger.zs.t4) {
            if (i10 == org.telegram.messenger.zs.N0) {
                try {
                    ((Status) objArr[0]).c(this, org.telegram.messenger.zs.W1);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            if (i10 == org.telegram.messenger.zs.Y1) {
                String str3 = (String) objArr[0];
                String str4 = this.Q0;
                int i17 = 16;
                if (str4 == null) {
                    String str5 = this.R0;
                    if (str5 == null || !str5.equals(str3)) {
                        return;
                    }
                    this.R0 = null;
                    File file = (File) objArr[1];
                    if (!this.V0) {
                        Utilities.e.c(new qq(this, this.T0, file, i17));
                        return;
                    } else {
                        r0(this.U0, this.S0, this.T0);
                        i0();
                        return;
                    }
                }
                if (str4.equals(str3)) {
                    this.Q0 = null;
                    File file2 = new File(org.telegram.messenger.w0.h(), a1.g.q(new StringBuilder("remote"), this.U0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = this.U0;
                    org.telegram.ui.ActionBar.s6 m0 = org.telegram.ui.ActionBar.t6.m0(file2, tL_theme.title, tL_theme);
                    if (m0 != null) {
                        if (m0.c != null && !new File(m0.c).exists()) {
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = m0.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(m0.E).sendRequest(getwallpaper, new org.telegram.ui.Components.t20(i17, this, m0));
                            return;
                        }
                        TLRPC.TL_theme tL_theme2 = this.U0;
                        org.telegram.ui.ActionBar.s6 v = org.telegram.ui.ActionBar.t6.v(file2, tL_theme2.title, tL_theme2, true);
                        if (v != null) {
                            t0(new m91(v, true, 0, false, false));
                        }
                    }
                    i0();
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.Z1) {
                String str6 = (String) objArr[0];
                if (str6.equals(this.Q0) || str6.equals(this.R0)) {
                    i0();
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.K4) {
                if (org.telegram.messenger.w0.x) {
                    return;
                }
                if (org.telegram.messenger.w0.w) {
                    h0();
                    return;
                } else {
                    g0();
                    return;
                }
            }
            if (i10 == org.telegram.messenger.zs.r4) {
                F(objArr.length > 0 && ((Boolean) objArr[0]).booleanValue(), true, !this.X0);
                return;
            }
            if (i10 == org.telegram.messenger.zs.v1) {
                if (objArr.length <= 1 || this.d0.isEmpty()) {
                    return;
                }
                org.telegram.ui.Components.s4.e0(this.O, (TLRPC.TL_error) objArr[2], (org.telegram.ui.ActionBar.k2) i0.a.g(1, this.d0), (TLObject) objArr[1], new Object[0]);
                return;
            }
            if (i10 == org.telegram.messenger.zs.k5) {
                org.telegram.ui.Components.s4.e0(this.O, (TLRPC.TL_error) objArr[1], (org.telegram.ui.ActionBar.k2) i0.a.g(1, this.d0), (TLObject) objArr[0], new Object[0]);
                return;
            }
            if (i10 == org.telegram.messenger.zs.x1) {
                org.telegram.messenger.ui.b0(i11).f2(this, (TLObject) objArr[0], 2, !this.d0.isEmpty() ? (org.telegram.ui.ActionBar.k2) i0.a.g(1, this.d0) : null, false, true);
                return;
            }
            if (i10 == org.telegram.messenger.zs.P4) {
                if (this.d0.isEmpty()) {
                    return;
                }
                int intValue = ((Integer) objArr[0]).intValue();
                org.telegram.ui.ActionBar.p2 p2Var = (!b50.v5 || (b50Var = b50.u5) == null) ? null : b50Var.c;
                org.telegram.ui.ActionBar.k2 k2Var3 = p2Var == null ? (org.telegram.ui.ActionBar.k2) i0.a.g(1, this.d0) : null;
                switch (intValue) {
                    case 0:
                        TLRPC.Document document = (TLRPC.Document) objArr[1];
                        int intValue2 = ((Integer) objArr[2]).intValue();
                        org.telegram.ui.Components.fw0 fw0Var = new org.telegram.ui.Components.fw0(this, null, 1, intValue2, document, null);
                        int i18 = (intValue2 == 6 || intValue2 == 7) ? 3500 : 1500;
                        if (k2Var3 == null) {
                            org.telegram.ui.Components.wb.f(p2Var, fw0Var, i18).j();
                            break;
                        } else {
                            org.telegram.ui.Components.wb.g(k2Var3, fw0Var, i18).j();
                            break;
                        }
                        break;
                    case 1:
                        if (k2Var3 == null) {
                            org.telegram.ui.Components.cc.Z(p2Var, null).t((String) objArr[1], null).j();
                            break;
                        } else {
                            org.telegram.ui.Components.cc.a0(k2Var3).t((String) objArr[1], null).j();
                            break;
                        }
                    case 2:
                        String K0 = org.telegram.messenger.cd.K0(((Long) objArr[1]).longValue() > 0 ? 2131742853 : 2131752416);
                        if (p2Var != null) {
                            p6Var = null;
                            a02 = org.telegram.ui.Components.cc.Z(p2Var, null);
                        } else {
                            p6Var = null;
                            a02 = org.telegram.ui.Components.cc.a0(k2Var3);
                        }
                        a02.t(K0, p6Var).j();
                        break;
                    case 3:
                        String K02 = org.telegram.messenger.cd.K0(((Long) objArr[1]).longValue() > 0 ? 2131742834 : 2131752285);
                        if (p2Var != null) {
                            p6Var2 = null;
                            a03 = org.telegram.ui.Components.cc.Z(p2Var, null);
                        } else {
                            p6Var2 = null;
                            a03 = org.telegram.ui.Components.cc.a0(k2Var3);
                        }
                        a03.t(K02, p6Var2).j();
                        break;
                    case 4:
                        if (k2Var3 == null) {
                            org.telegram.ui.Components.cc.Z(p2Var, null).u((String) objArr[1], (String) objArr[2], null).j();
                            break;
                        } else {
                            org.telegram.ui.Components.cc.a0(k2Var3).u((String) objArr[1], (String) objArr[2], k2Var3.getResourceProvider()).j();
                            break;
                        }
                    case 5:
                        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(this, (ba0) objArr[1]);
                        if (k2Var3 == null) {
                            org.telegram.ui.Components.wb.f(p2Var, j6Var, 1500).j();
                            break;
                        } else {
                            org.telegram.ui.Components.wb.g(k2Var3, j6Var, 1500).j();
                            break;
                        }
                    case 6:
                        if (k2Var3 == null) {
                            org.telegram.ui.Components.cc.Z(p2Var, null).T((String) objArr[1]).j();
                            break;
                        } else {
                            org.telegram.ui.Components.cc.a0(k2Var3).T((String) objArr[1]).j();
                            break;
                        }
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.w2) {
                H(false);
                return;
            }
            if (i10 == org.telegram.messenger.zs.i5) {
                if (this.d0.isEmpty()) {
                    return;
                }
                org.telegram.ui.ActionBar.k2 k2Var4 = (org.telegram.ui.ActionBar.k2) i0.a.g(1, this.d0);
                if (k2Var4.getParentActivity() != null) {
                    k2Var4.showDialog(new kg.q0(((Integer) objArr[0]).intValue(), this.O, k2Var4.getParentActivity(), k2Var4, null));
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.f5) {
                org.telegram.messenger.vp.r1(this.O).f7.edit().remove("transcribeButtonPressed").apply();
                return;
            }
            if (i10 == org.telegram.messenger.zs.n5) {
                int intValue3 = ((Integer) objArr[0]).intValue();
                String[] strArr = (intValue3 != 0 || Build.VERSION.SDK_INT < 31) ? null : new String[]{"android.permission.BLUETOOTH_CONNECT"};
                if (strArr != null) {
                    int i19 = this.d1 + 1;
                    this.d1 = i19;
                    this.c1.put(i19, intValue3);
                    e0.c.e(this, strArr, this.d1);
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.r5) {
                long longValue = ((Long) objArr[0]).longValue();
                if (((Boolean) objArr[1]).booleanValue()) {
                    gg.e.q(longValue, this.q0);
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.M5) {
                if (this.v1 == null) {
                    TLParseException tLParseException = (TLParseException) objArr[0];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tLParseException.getMessage());
                    sb2.append("\n\n");
                    sb2.append(org.telegram.messenger.i0.D0());
                    StringBuilder sb3 = new StringBuilder();
                    StringWriter stringWriter = new StringWriter();
                    tLParseException.printStackTrace(new PrintWriter(stringWriter));
                    sb3.append(org.telegram.messenger.i0.D0());
                    sb3.append("\n\n");
                    sb3.append(stringWriter);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this, null);
                    alertDialog$Builder4.l("TL Error");
                    alertDialog$Builder4.g(sb2);
                    alertDialog$Builder4.h(org.telegram.messenger.cd.K0(2131751767), new tt(sb3, 15));
                    alertDialog$Builder4.k(org.telegram.messenger.cd.K0(2131747847), null);
                    alertDialog$Builder4.j(new k80(this, i13));
                    org.telegram.ui.ActionBar.x1 p5 = alertDialog$Builder4.p();
                    this.v1 = p5;
                    p5.setCanceledOnTouchOutside(true);
                    return;
                }
                return;
            }
            if (i10 != org.telegram.messenger.zs.N5) {
                if (i10 == org.telegram.messenger.zs.Q5) {
                    org.telegram.messenger.n2 n2Var = (org.telegram.messenger.n2) objArr[0];
                    org.telegram.ui.ActionBar.k2 Q = Q();
                    org.telegram.ui.Components.cc a04 = Q instanceof un ? org.telegram.ui.Components.cc.a0(Q) : org.telegram.ui.Components.cc.X();
                    String s10 = org.telegram.messenger.o5.s(this.O, n2Var.a);
                    TLRPC.JoinChatBotResult joinChatBotResult = n2Var.b;
                    org.telegram.messenger.i0.h3(new f70(7, this, joinChatBotResult instanceof TLRPC.TL_joinChatBotResultApproved ? a04.H(R.raw.contact_check, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Z(2131749383, s10))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultDeclined ? a04.H(R.raw.e_hand_2, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Z(2131749382, s10))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultQueued ? a04.Q(R.raw.timer_toast, 24, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Z(2131749381, s10))) : null), 400L);
                    return;
                }
                return;
            }
            if (this.w1 == null) {
                Class cls = (Class) objArr[0];
                int intValue4 = ((Integer) objArr[1]).intValue();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(cls.toString());
                sb4.append('\n');
                sb4.append(intValue4);
                sb4.append('\n');
                sb4.append(org.telegram.messenger.i0.D0());
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(this, null);
                alertDialog$Builder5.l("Memory Leak Found");
                alertDialog$Builder5.g(sb4);
                alertDialog$Builder5.k(org.telegram.messenger.cd.K0(2131747847), null);
                alertDialog$Builder5.j(new k80(this, 2));
                org.telegram.ui.ActionBar.x1 p9 = alertDialog$Builder5.p();
                this.w1 = p9;
                p9.setCanceledOnTouchOutside(true);
                return;
            }
            return;
        }
        if (objArr[2] == null || this.o0.getVisibility() == 0) {
            c10 = 3;
            if (objArr[2] == null) {
                c11 = 0;
                ay.x4 = false;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) objArr[c11];
                boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int intValue5 = ((Integer) objArr[c10]).intValue();
                Runnable runnable2 = objArr.length > 7 ? (Runnable) objArr[7] : null;
                actionBarLayout = this.q0;
                if (actionBarLayout == null) {
                    return;
                }
                actionBarLayout.getClass();
                actionBarLayout.f(new org.telegram.ui.ActionBar.y4(s6Var, intValue5, booleanValue3, true), runnable2);
                if (org.telegram.messenger.i0.Q1()) {
                    ActionBarLayout actionBarLayout3 = this.r0;
                    if (actionBarLayout3 != null) {
                        runnable = null;
                        actionBarLayout3.f(new org.telegram.ui.ActionBar.y4(s6Var, intValue5, booleanValue3, true), null);
                    } else {
                        runnable = null;
                    }
                    ActionBarLayout actionBarLayout4 = this.s0;
                    if (actionBarLayout4 != null) {
                        actionBarLayout4.f(new org.telegram.ui.ActionBar.y4(s6Var, intValue5, booleanValue3, true), runnable);
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
                org.telegram.ui.Components.ei0 ei0Var = (org.telegram.ui.Components.ei0) objArr[5];
                if (objArr.length > 8) {
                    ((Boolean) objArr[8]).getClass();
                }
                int measuredWidth = this.z0.getMeasuredWidth();
                int measuredHeight = this.z0.getMeasuredHeight();
                this.G0 = null;
                if (objArr.length > 6) {
                    this.G0 = (View) objArr[6];
                }
                this.X0 = true;
                Z(this.z0);
                View view2 = this.G0;
                if (view2 != null && view2.getBackground() != null) {
                    this.G0.getBackground().setAlpha(0);
                }
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        bitmap = org.telegram.messenger.i0.B0(getWindow());
                        if (bitmap != null) {
                            z10 = true;
                            if (bitmap == null) {
                                bitmap = org.telegram.messenger.i0.M3(this.z0);
                            }
                            if (bitmap != null && ei0Var != null) {
                                org.telegram.ui.Components.b11.a(bitmap, !z10 ? null : this.z0, ei0Var);
                            }
                            view = this.G0;
                            if (view != null && view.getBackground() != null) {
                                this.G0.getBackground().setAlpha(org.telegram.messenger.zs.e4);
                            }
                            this.w0.removeView(this.o0);
                            this.o0 = new org.telegram.ui.Components.b11(this);
                            org.telegram.ui.Components.bi0 animatedDrawable = ei0Var == null ? ei0Var.getAnimatedDrawable() : null;
                            c10 = 3;
                            this.w0.addView(this.o0, 1, w7.b6.c(-1.0f, -1));
                            this.p0.setVisibility(8);
                            if (ei0Var != null) {
                                org.telegram.ui.Components.b11 b11Var = this.o0;
                                ColorFilter colorFilter = animatedDrawable != null ? animatedDrawable.getColorFilter() : null;
                                b11Var.n = ei0Var;
                                b11Var.r = colorFilter;
                            }
                            this.o0.setImageBitmap(bitmap);
                            this.o0.setVisibility(0);
                            int i20 = measuredWidth - iArr[0];
                            int i21 = measuredHeight - iArr[1];
                            double sqrt = Math.sqrt((i21 * i21) + (i20 * i20));
                            int i22 = iArr[0];
                            int i23 = measuredHeight - iArr[1];
                            float max = (float) Math.max(sqrt, Math.sqrt((i23 * i23) + (i22 * i22)));
                            int i24 = measuredWidth - iArr[0];
                            int i25 = iArr[1];
                            double sqrt2 = Math.sqrt((i25 * i25) + (i24 * i24));
                            int i26 = iArr[0];
                            int i27 = iArr[1];
                            float max2 = Math.max(max, (float) Math.max(sqrt2, Math.sqrt((i27 * i27) + (i26 * i26))));
                            this.o0.b(iArr[0], iArr[1], booleanValue4);
                            float f7 = max2 / 0.6f;
                            org.telegram.ui.Components.b11 b11Var2 = this.o0;
                            org.telegram.ui.Cells.g1 g1Var = org.telegram.ui.Components.b11.x;
                            float f10 = !booleanValue4 ? 0.0f : f7;
                            if (!booleanValue4) {
                                f7 = 0.0f;
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b11Var2, g1Var, f10, f7);
                            ofFloat.setDuration(450L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.vs.e);
                            ofFloat.addListener(new org.telegram.ui.ActionBar.g1(this, ei0Var, animatedDrawable, 9));
                            if (this.G0 != null) {
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new p70(this, 0));
                                ofFloat2.setDuration(ofFloat.getDuration());
                                ofFloat2.start();
                            }
                            org.telegram.messenger.i0.h3(new q70(this, i13), !booleanValue4 ? (measuredHeight - iArr[1]) / org.telegram.messenger.i0.L(2.25f) : 50L);
                            ofFloat.start();
                        }
                    } else {
                        bitmap = null;
                    }
                    this.w0.addView(this.o0, 1, w7.b6.c(-1.0f, -1));
                    this.p0.setVisibility(8);
                    if (ei0Var != null) {
                    }
                    this.o0.setImageBitmap(bitmap);
                    this.o0.setVisibility(0);
                    int i202 = measuredWidth - iArr[0];
                    int i212 = measuredHeight - iArr[1];
                    double sqrt3 = Math.sqrt((i212 * i212) + (i202 * i202));
                    int i222 = iArr[0];
                    int i232 = measuredHeight - iArr[1];
                    float max3 = (float) Math.max(sqrt3, Math.sqrt((i232 * i232) + (i222 * i222)));
                    int i242 = measuredWidth - iArr[0];
                    int i252 = iArr[1];
                    double sqrt22 = Math.sqrt((i252 * i252) + (i242 * i242));
                    int i262 = iArr[0];
                    int i272 = iArr[1];
                    float max22 = Math.max(max3, (float) Math.max(sqrt22, Math.sqrt((i272 * i272) + (i262 * i262))));
                    this.o0.b(iArr[0], iArr[1], booleanValue4);
                    float f72 = max22 / 0.6f;
                    org.telegram.ui.Components.b11 b11Var22 = this.o0;
                    org.telegram.ui.Cells.g1 g1Var2 = org.telegram.ui.Components.b11.x;
                    if (!booleanValue4) {
                    }
                    if (!booleanValue4) {
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b11Var22, g1Var2, f10, f72);
                    ofFloat3.setDuration(450L);
                    ofFloat3.setInterpolator(org.telegram.ui.Components.vs.e);
                    ofFloat3.addListener(new org.telegram.ui.ActionBar.g1(this, ei0Var, animatedDrawable, 9));
                    if (this.G0 != null) {
                    }
                    org.telegram.messenger.i0.h3(new q70(this, i13), !booleanValue4 ? (measuredHeight - iArr[1]) / org.telegram.messenger.i0.L(2.25f) : 50L);
                    ofFloat3.start();
                } catch (Throwable th2) {
                    th = th2;
                    org.telegram.messenger.f8.f(th);
                    try {
                        this.o0.setImageDrawable(null);
                        this.w0.removeView(this.o0);
                        ay.x4 = false;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.f(e);
                    }
                    c11 = 0;
                    org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) objArr[c11];
                    boolean booleanValue32 = ((Boolean) objArr[1]).booleanValue();
                    int intValue52 = ((Integer) objArr[c10]).intValue();
                    if (objArr.length > 7) {
                    }
                    actionBarLayout = this.q0;
                    if (actionBarLayout == null) {
                    }
                }
                z10 = false;
                if (bitmap == null) {
                }
                if (bitmap != null) {
                    org.telegram.ui.Components.b11.a(bitmap, !z10 ? null : this.z0, ei0Var);
                }
                view = this.G0;
                if (view != null) {
                    this.G0.getBackground().setAlpha(org.telegram.messenger.zs.e4);
                }
                this.w0.removeView(this.o0);
                this.o0 = new org.telegram.ui.Components.b11(this);
                if (ei0Var == null) {
                }
                c10 = 3;
            } catch (Throwable th3) {
                th = th3;
                c10 = 3;
            }
        }
        c11 = 0;
        org.telegram.ui.ActionBar.s6 s6Var22 = (org.telegram.ui.ActionBar.s6) objArr[c11];
        boolean booleanValue322 = ((Boolean) objArr[1]).booleanValue();
        int intValue522 = ((Integer) objArr[c10]).intValue();
        if (objArr.length > 7) {
        }
        actionBarLayout = this.q0;
        if (actionBarLayout == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        if (((org.telegram.ui.un) r0).ca() != false) goto L63;
     */
    @Override // e0.f, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k2 Q;
        keyEvent.getKeyCode();
        if ((keyEvent.getKeyCode() != 24 && keyEvent.getKeyCode() != 25) || (Q = Q()) == null || Q.getLastStoryViewer() == null) {
            if (keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
                if (VoIPService.getSharedInstance() == null) {
                    ArrayList arrayList = this.d0;
                    if (!arrayList.isEmpty() && ((!PhotoViewer.F1() || !PhotoViewer.v1().U1()) && keyEvent.getRepeatCount() == 0)) {
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
                        if (!(k2Var instanceof un) || org.telegram.ui.ActionBar.k2.hasSheets(k2Var) || !((un) k2Var).ca()) {
                            if (org.telegram.messenger.i0.Q1()) {
                                ArrayList arrayList2 = this.f0;
                                if (!arrayList2.isEmpty()) {
                                    org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList2);
                                    if (k2Var2 instanceof un) {
                                        if (!org.telegram.ui.ActionBar.k2.hasSheets(k2Var2)) {
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
                org.telegram.messenger.f8.g(e, true);
                return false;
            }
        }
        th.o7 lastStoryViewer = Q.getLastStoryViewer();
        lastStoryViewer.getClass();
        if (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) {
            lastStoryViewer.F(keyEvent);
            return true;
        }
        return true;
    }

    public final void e0() {
        HashSet hashSet;
        m4 m4Var = this.a1;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.a1 = null;
        }
        if (this.Q) {
            return;
        }
        this.Q = true;
        xa.n nVar = this.n1;
        if (nVar != null) {
            nVar.a();
            this.n1 = null;
        }
        xa.n nVar2 = this.o1;
        if (nVar2 != null) {
            nVar2.a();
            this.o1 = null;
        }
        v80 v80Var = this.q1;
        if (v80Var == null || (hashSet = org.telegram.messenger.sc.n) == null) {
            return;
        }
        hashSet.remove(v80Var);
    }

    public final void f0(Intent intent, gf.e eVar) {
        super.onNewIntent(intent);
        W(intent, true, false, false, eVar, true, false);
    }

    public final void g0() {
        if (this.a1 != null) {
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.f8.b("cancel lockRunnable onPasscodePause");
            }
            org.telegram.messenger.i0.r(this.a1);
            this.a1 = null;
        }
        if (org.telegram.messenger.tz.s.length() != 0) {
            org.telegram.messenger.tz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var = new m4(this, 10);
            this.a1 = m4Var;
            if (org.telegram.messenger.tz.x) {
                org.telegram.messenger.i0.h3(m4Var, 1000L);
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("schedule app lock in 1000");
                }
            } else if (org.telegram.messenger.tz.y != 0) {
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("schedule app lock in " + ((org.telegram.messenger.tz.y * 1000) + 1000));
                }
                org.telegram.messenger.i0.h3(this.a1, (org.telegram.messenger.tz.y * 1000) + 1000);
            }
        } else {
            org.telegram.messenger.tz.B = 0;
        }
        org.telegram.messenger.tz.y();
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final boolean h(org.telegram.ui.ActionBar.k2 k2Var, ActionBarLayout actionBarLayout) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (org.telegram.messenger.i0.Q1()) {
            boolean z10 = k2Var instanceof ay;
            if (z10 || (k2Var instanceof pf0)) {
                boolean z11 = actionBarLayout != this.q0;
                if (z11 && z10 && !((ay) k2Var).s4()) {
                    z11 = false;
                }
                if (z11) {
                    this.q0.Z();
                    this.q0.c(-1, k2Var);
                    this.r0.Z();
                    this.r0.getView().setVisibility(8);
                    if (!this.O0 && this.s0.getFragmentStack().isEmpty()) {
                        this.v0.setVisibility(0);
                    }
                    return false;
                }
            } else {
                if ((k2Var instanceof un) && !((un) k2Var).c()) {
                    boolean z12 = this.O0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.s0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.v0.setVisibility(8);
                        this.s0.Z();
                        this.s0.c(-1, k2Var);
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            while (this.r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.r0;
                                actionBarLayout4.c0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.r0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.q0)) {
                        actionBarLayout2.c(-1, k2Var);
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            while (this.r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.r0;
                                actionBarLayout5.c0(actionBarLayout5.getFragmentStack().get(0), false);
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
                        if (org.telegram.messenger.d20.i(i10).p()) {
                            break;
                        }
                        i10++;
                    }
                    if ((k2Var instanceof hf0) && i10 == -1) {
                        this.v0.setVisibility(0);
                        this.u0.setBackgroundColor(0);
                    } else {
                        this.u0.setBackgroundColor(2130706432);
                    }
                    this.r0.c(-1, k2Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.a1 != null) {
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.f8.b("cancel lockRunnable onPasscodeResume");
            }
            org.telegram.messenger.i0.r(this.a1);
            this.a1 = null;
        }
        if (org.telegram.messenger.i0.p2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (org.telegram.messenger.tz.B != 0) {
            org.telegram.messenger.tz.B = 0;
            org.telegram.messenger.tz.y();
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.f8.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        org.telegram.ui.ActionBar.x1 x1Var = this.W0;
        if (x1Var != null) {
            try {
                x1Var.dismiss();
            } finally {
                this.W0 = null;
            }
        }
        this.R0 = null;
        this.S0 = null;
        this.T0 = null;
        this.Q0 = null;
        this.U0 = null;
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        }
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
            return true;
        }
        if (!h4.G() || !h4.v().V) {
            return false;
        }
        h4.v().m(true, false);
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
        ArrayList arrayList2 = this.a0;
        if (arrayList2 == null) {
            bundle.putString("selectAlertString", org.telegram.messenger.cd.L0(2131745610, null));
            bundle.putString("selectAlertStringGroup", org.telegram.messenger.cd.L0(2131745611, null));
        } else if (arrayList2.size() != 1) {
            bundle.putString("selectAlertString", org.telegram.messenger.cd.L0(2131745610, null));
            bundle.putString("selectAlertStringGroup", org.telegram.messenger.cd.L0(2131745648, null));
        }
        ay ayVar = new ay(bundle);
        ayVar.C2 = this;
        if (this.R != null || ((arrayList = this.U) != null && !arrayList.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.U;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(un.P7(this.U, false, null));
            }
            String str2 = this.R;
            if (str2 != null) {
                arrayList3.add(new org.telegram.messenger.ef(0, str2, 0, true, 0, 0));
            }
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(this.T)) {
                    ((org.telegram.messenger.ef) arrayList3.get(0)).a = this.T;
                }
                CharSequence charSequence = this.T;
                if (arrayList3.isEmpty()) {
                    ayVar.D2 = null;
                } else {
                    ayVar.D2 = arrayList3;
                    ayVar.E2 = null;
                    ayVar.M2 = false;
                    if (ayVar.B1 != null) {
                        ayVar.u3(charSequence);
                    } else {
                        ayVar.U3 = charSequence;
                    }
                }
            }
        } else if (!TextUtils.isEmpty(this.T)) {
            CharSequence charSequence2 = this.T;
            int i10 = org.telegram.ui.Components.sp0.I;
            if (charSequence2 != null && charSequence2.length() != 0) {
                try {
                    matcher = org.telegram.messenger.i0.S.matcher(charSequence2);
                } catch (Exception unused) {
                }
                if (matcher.find()) {
                    str = charSequence2.subSequence(matcher.start(), matcher.end()).toString();
                    if (str == null) {
                        ayVar.P4(this.T, str);
                    } else {
                        CharSequence charSequence3 = this.T;
                        if (charSequence3 == null || charSequence3.length() == 0) {
                            ayVar.F2 = null;
                        } else {
                            ayVar.F2 = charSequence3;
                            ayVar.E2 = null;
                            ayVar.D2 = null;
                            if (ayVar.B1 != null) {
                                ayVar.u3(charSequence3);
                            } else {
                                ayVar.U3 = charSequence3;
                            }
                        }
                    }
                }
            }
            str = null;
            if (str == null) {
            }
        }
        ((ActionBarLayout) M()).U(ayVar, !org.telegram.messenger.i0.Q1() || (actionBarLayout = this.r0) == null ? !(this.q0.getFragmentStack().size() <= 1 || !(this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1) instanceof pf0)) : !(actionBarLayout.getFragmentStack().isEmpty() || !(this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1) instanceof pf0)), !z10);
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(false, true);
        } else if (h4.G() && h4.v().V) {
            h4.v().m(false, true);
        }
        vh.o8.w();
        b50 b50Var = b50.u5;
        if (b50Var != null) {
            b50Var.dismiss();
        }
        if (z10 || !org.telegram.messenger.i0.Q1()) {
            return;
        }
        this.q0.W(true, true);
        this.s0.W(true, true);
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.i0.Q1()) {
            if (actionBarLayout == this.q0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.m1) {
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
        hf0 hf0Var = new hf0();
        q70 q70Var = new q70(this, 0);
        hf0Var.F = 3;
        hf0Var.a = 12;
        hf0Var.d0 = q70Var;
        if (password == null || (str = password.login_email_pattern) == null) {
            t0(hf0Var);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        int indexOf = password.login_email_pattern.indexOf(42);
        int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
            yz0Var.a |= 256;
            yz0Var.b = indexOf;
            int i10 = lastIndexOf + 1;
            yz0Var.c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i10, 0);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = valueOf;
        x1Var.T = org.telegram.messenger.cd.L0(2131751202, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752548, null), new rv(11, this, hf0Var));
        i0.a.s(null, 2131752589, alertDialog$Builder, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00ce, code lost:
    
        if (r3.getArguments().getLong("community_id", 0) != 0) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x011c A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.v4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.w4 w4Var) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        ActionBarLayout actionBarLayout4;
        int i10;
        ActionBarLayout actionBarLayout5;
        ActionBarLayout actionBarLayout6;
        org.telegram.ui.ActionBar.k2 k2Var = w4Var.a;
        boolean z10 = w4Var.b;
        boolean z11 = w4Var.c;
        if (h4.G() && h4.v().V) {
            h4.v().m(false, true);
        }
        if (org.telegram.messenger.i0.Q1()) {
            if (k2Var instanceof pf0) {
                ActionBarLayout actionBarLayout7 = this.q0;
                if (actionBarLayout != actionBarLayout7) {
                    actionBarLayout7.Z();
                    org.telegram.ui.ActionBar.z4 M = M();
                    w4Var.b = z10;
                    w4Var.c = z11;
                    w4Var.d = false;
                    ((ActionBarLayout) M).T(w4Var);
                    this.r0.Z();
                    this.r0.getView().setVisibility(8);
                    if (!this.O0 && this.s0.getFragmentStack().isEmpty()) {
                        this.v0.setVisibility(0);
                        return false;
                    }
                    return false;
                }
                if ((!(k2Var instanceof un) && !((un) k2Var).c()) || w4Var.g || (actionBarLayout == (actionBarLayout3 = this.s0) && (actionBarLayout3.getFragmentStack().size() > 1 || !(this.s0.getLastFragment() instanceof un)))) {
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
                                actionBarLayout9.c0(actionBarLayout9.getFragmentStack().get(0), false);
                            }
                            this.r0.l(!z11, false);
                        }
                        if (!z13) {
                            org.telegram.ui.ActionBar.z4 M2 = M();
                            w4Var.c = z11;
                            w4Var.d = false;
                            ((ActionBarLayout) M2).T(w4Var);
                        }
                        return z13;
                    }
                    if (!z12 && actionBarLayout != (actionBarLayout5 = this.s0) && actionBarLayout5 != null) {
                        if (actionBarLayout5.getView() != null) {
                            this.s0.getView().setVisibility(0);
                        }
                        this.v0.setVisibility(8);
                        this.s0.Z();
                        ActionBarLayout actionBarLayout10 = this.s0;
                        w4Var.c = true;
                        w4Var.b = z10;
                        w4Var.d = false;
                        actionBarLayout10.T(w4Var);
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            while (this.r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout11 = this.r0;
                                actionBarLayout11.c0(actionBarLayout11.getFragmentStack().get(0), false);
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
                                    actionBarLayout13.c0(actionBarLayout13.getFragmentStack().get(0), false);
                                }
                                this.r0.l(!z11, false);
                            }
                            org.telegram.ui.ActionBar.z4 M3 = M();
                            w4Var.b = this.q0.getFragmentStack().size() > 1;
                            w4Var.c = z11;
                            w4Var.d = false;
                            ((ActionBarLayout) M3).T(w4Var);
                            return false;
                        }
                        org.telegram.ui.ActionBar.z4 M4 = M();
                        w4Var.b = this.q0.getFragmentStack().size() > 1;
                        w4Var.c = z11;
                        w4Var.d = false;
                        ((ActionBarLayout) M4).T(w4Var);
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            while (this.r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout14 = this.r0;
                                actionBarLayout14.c0(actionBarLayout14.getFragmentStack().get(0), false);
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
                        if (org.telegram.messenger.d20.i(i10).p()) {
                            break;
                        }
                        i10++;
                    }
                    if ((k2Var instanceof hf0) || i10 != -1) {
                        this.u0.setBackgroundColor(2130706432);
                    } else {
                        this.v0.setVisibility(0);
                        this.u0.setBackgroundColor(0);
                    }
                    ActionBarLayout actionBarLayout15 = this.r0;
                    w4Var.b = z10;
                    w4Var.c = z11;
                    w4Var.d = false;
                    actionBarLayout15.T(w4Var);
                    return false;
                }
            } else {
                if (k2Var instanceof ay) {
                    ay ayVar = (ay) k2Var;
                    if (ayVar.s4() && actionBarLayout != (actionBarLayout2 = this.q0)) {
                        actionBarLayout2.Z();
                        org.telegram.ui.ActionBar.z4 M5 = M();
                        w4Var.b = z10;
                        w4Var.c = z11;
                        w4Var.d = false;
                        ((ActionBarLayout) M5).T(w4Var);
                        this.r0.Z();
                        this.r0.getView().setVisibility(8);
                        if (!this.O0 && this.s0.getFragmentStack().isEmpty()) {
                            this.v0.setVisibility(0);
                            return false;
                        }
                        return false;
                    }
                    if (actionBarLayout == this.q0) {
                        if (ayVar.getArguments() != null) {
                            if (ayVar.getArguments().getInt("folderId", 0) != 1) {
                            }
                        }
                    }
                }
                if (!(k2Var instanceof un)) {
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
                    if (k2Var instanceof hf0) {
                    }
                    this.u0.setBackgroundColor(2130706432);
                    ActionBarLayout actionBarLayout152 = this.r0;
                    w4Var.b = z10;
                    w4Var.c = z11;
                    w4Var.d = false;
                    actionBarLayout152.T(w4Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void l0(final long j10, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i10, final int i11) {
        if (num != null) {
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = org.telegram.messenger.vp.r1(this.O).g1(-j10);
            tL_channels_getMessages.id.add(num);
            ConnectionsManager.getInstance(this.O).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.l70
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    Pattern pattern = LaunchActivity.D1;
                    org.telegram.messenger.i0.g3(new b80(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i10, i11));
                }
            });
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j10);
        t0(pb1.I0(this, bundle));
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void m0(int i10, long j10, TLRPC.TL_error tL_error) {
        un unVar = new un(org.telegram.ui.Cells.f1.k(j10, "user_id"));
        t0(unVar);
        org.telegram.messenger.i0.h3(new qq(tL_error, unVar, org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10)), 13), 300L);
    }

    public final void n0(int i10, String str, String str2, gf.e eVar) {
        if (eVar != null) {
            eVar.d();
        }
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_importContactToken, new q8(this, eVar, r12, i10, str2, 6));
    }

    public final void o0(int i10, String str, String str2, gf.e eVar) {
        if (eVar != null) {
            eVar.d();
        }
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        r12.c2().a(str, null, new g90(this, r12, eVar, i10, str2, 0));
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
        org.telegram.ui.ActionBar.l lVar = actionBarLayout.D;
        if (lVar != null) {
            lVar.setVisibility(0);
        }
        actionBarLayout.C0 = false;
        if (org.telegram.messenger.i0.Q1()) {
            ActionBarLayout actionBarLayout2 = this.s0;
            org.telegram.ui.ActionBar.l lVar2 = actionBarLayout2.D;
            if (lVar2 != null) {
                lVar2.setVisibility(0);
            }
            actionBarLayout2.C0 = false;
            ActionBarLayout actionBarLayout3 = this.r0;
            org.telegram.ui.ActionBar.l lVar3 = actionBarLayout3.D;
            if (lVar3 != null) {
                lVar3.setVisibility(0);
            }
            actionBarLayout3.C0 = false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.k0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.q0.s(menu) && org.telegram.messenger.i0.Q1() && !this.s0.s(menu)) {
                this.r0.s(menu);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (actionMode.getType() == 1) {
            return;
        }
        ActionBarLayout actionBarLayout = this.q0;
        org.telegram.ui.ActionBar.l lVar = actionBarLayout.D;
        if (lVar != null) {
            lVar.setVisibility(8);
        }
        actionBarLayout.C0 = true;
        if (org.telegram.messenger.i0.Q1()) {
            ActionBarLayout actionBarLayout2 = this.s0;
            org.telegram.ui.ActionBar.l lVar2 = actionBarLayout2.D;
            if (lVar2 != null) {
                lVar2.setVisibility(8);
            }
            actionBarLayout2.C0 = true;
            ActionBarLayout actionBarLayout3 = this.r0;
            org.telegram.ui.ActionBar.l lVar3 = actionBarLayout3.D;
            if (lVar3 != null) {
                lVar3.setVisibility(8);
            }
            actionBarLayout3.C0 = true;
        }
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        th.z2 currentPeerView;
        bh.d dVar;
        VoIPService sharedInstance;
        if (org.telegram.messenger.tz.s.length() != 0 && org.telegram.messenger.tz.B != 0) {
            org.telegram.messenger.tz.B = 0;
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.f8.b("reset lastPauseTime onActivityResult");
            }
            org.telegram.messenger.d20.i(this.O).v(false);
        }
        if (i10 == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.w0.F = canDrawOverlays;
            if (canDrawOverlays) {
                b50 b50Var = b50.u5;
                if (b50Var != null) {
                    b50Var.L();
                }
                org.telegram.messenger.i0.h3(new q70(this, 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 >= 22336 && i10 <= 22399) {
            org.telegram.ui.Wallet.u0 u0Var = w7.k6.b;
            if (u0Var != null && u0Var.e == this && u0Var.f && u0Var.g == i10) {
                u0Var.c(i11 != -1 ? "AUTH_CANCELED" : null);
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
        int i12 = 3;
        if (i10 == 140) {
            Utilities.d.c(new org.telegram.messenger.c20(i12, org.telegram.messenger.nd.f(this.O), i11 == -1));
            return;
        }
        if (i10 == 521) {
            ag.l lVar = this.r1;
            if (lVar != null) {
                lVar.a(Boolean.valueOf(i11 == -1));
                this.r1 = null;
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (dVar = themeEditorView.m) != null) {
            dVar.y(i10, i11, intent);
        }
        ActionBarLayout actionBarLayout = this.q0;
        if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
            org.telegram.ui.ActionBar.k2 k2Var = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
            k2Var.onActivityResultFragment(i10, i11, intent);
            if (k2Var.getLastStoryViewer() != null && (currentPeerView = k2Var.getLastStoryViewer().n0.getCurrentPeerView()) != null && i11 == -1) {
                if (i10 == 0 || i10 == 2) {
                    currentPeerView.r0();
                    ag.v vVar = currentPeerView.r2;
                    if (vVar != null) {
                        vVar.a2.h0(i10, intent, null);
                    }
                } else if (i10 == 21) {
                    if (intent == null) {
                        currentPeerView.X0();
                    } else {
                        if (intent.getData() != null) {
                            currentPeerView.Q0(intent.getData());
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i13 = 0; i13 < clipData.getItemCount(); i13++) {
                                currentPeerView.Q0(clipData.getItemAt(i13).getUri());
                            }
                        } else {
                            currentPeerView.X0();
                        }
                        ag.v vVar2 = currentPeerView.r2;
                        if (vVar2 != null) {
                            vVar2.dismiss();
                        }
                        currentPeerView.i0(true);
                    }
                }
            }
        }
        if (org.telegram.messenger.i0.Q1()) {
            ActionBarLayout actionBarLayout2 = this.s0;
            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
            }
            ActionBarLayout actionBarLayout3 = this.r0;
            if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
            }
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.c5, Integer.valueOf(i10), Integer.valueOf(i11), intent);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (d0(true)) {
            if (!org.telegram.messenger.i0.Q1()) {
                this.q0.H();
                return;
            }
            ActionBarLayout actionBarLayout = this.r0;
            if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                this.r0.H();
                return;
            }
            ActionBarLayout actionBarLayout2 = this.s0;
            if (actionBarLayout2 == null || actionBarLayout2.getView().getVisibility() != 0 || this.s0.getFragmentStack().isEmpty()) {
                this.q0.H();
                return;
            }
            org.telegram.ui.ActionBar.k2 k2Var = this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1);
            if (k2Var.onBackPressed(true)) {
                k2Var.finishFragment();
            }
        }
    }

    @Override // androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.i0.v(this, configuration);
        this.u1.a();
        org.telegram.messenger.i0.w3(getWindow());
        super.onConfigurationChanged(configuration);
        this.n0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        org.telegram.messenger.i0.c3();
        a0();
        E();
        org.telegram.messenger.i0.g3(new q70(this, 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            int i10 = pipRoundVideoView.y.getInt("sidex", 1);
            int i11 = pipRoundVideoView.y.getInt("sidey", 0);
            float f7 = pipRoundVideoView.y.getFloat("px", 0.0f);
            float f10 = pipRoundVideoView.y.getFloat("py", 0.0f);
            pipRoundVideoView.w.x = PipRoundVideoView.b(f7, i10, pipRoundVideoView.h, true);
            pipRoundVideoView.w.y = PipRoundVideoView.b(f10, i11, pipRoundVideoView.n, false);
            pipRoundVideoView.x.updateViewLayout(pipRoundVideoView.a, pipRoundVideoView.w);
        }
        org.telegram.ui.Components.hu huVar = org.telegram.ui.Components.hu.J1;
        if (huVar != null) {
            huVar.c0(configuration);
        }
        mg.v vVar = mg.v.l1;
        if (vVar != null) {
            vVar.c0(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            int i12 = themeEditorView.l.getInt("sidex", 1);
            int i13 = themeEditorView.l.getInt("sidey", 0);
            float f11 = themeEditorView.l.getFloat("px", 0.0f);
            float f12 = themeEditorView.l.getFloat("py", 0.0f);
            themeEditorView.i.x = ThemeEditorView.c(f11, i12, themeEditorView.g, true);
            themeEditorView.i.y = ThemeEditorView.c(f12, i13, themeEditorView.h, false);
            try {
                if (themeEditorView.c.getParent() != null) {
                    themeEditorView.j.updateViewLayout(themeEditorView.c, themeEditorView.i);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        if (org.telegram.ui.ActionBar.t6.o == 3) {
            org.telegram.ui.ActionBar.t6.F(false);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.v, androidx.activity.m, e0.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        t9.c cVar;
        String str2;
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        E1 = true;
        F1++;
        boolean z10 = org.telegram.messenger.v2.a;
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        I1 = this;
        org.telegram.messenger.w0.w();
        org.telegram.messenger.i0.v(this, getResources().getConfiguration());
        this.O = org.telegram.messenger.d20.s0;
        int i10 = 12;
        this.g1 = new androidx.mediarouter.app.f(this, i10);
        IntentFilter intentFilter = new IntentFilter("org.telegram.messenger.DEBUG_THEME");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.g1, intentFilter, 2);
        } else {
            registerReceiver(this.g1, intentFilter);
        }
        if (!org.telegram.messenger.d20.i(this.O).p() && (intent = getIntent()) != null && intent.getAction() != null) {
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
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.v6(1));
        getWindow().setFormat(-1);
        org.telegram.messenger.o6 o6Var = new org.telegram.messenger.o6(getWindow(), new org.telegram.ui.Components.z11(15));
        this.f1 = o6Var;
        o6Var.a();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            org.telegram.messenger.i0.E = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.t6.P();
        org.telegram.ui.ActionBar.t6.T(this);
        if (org.telegram.messenger.tz.s.length() != 0 && org.telegram.messenger.tz.x) {
            org.telegram.messenger.tz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.i0.a;
        this.q0 = new ActionBarLayout(this, true);
        l0 l0Var = new l0(this, this, i10);
        this.w0 = l0Var;
        l0Var.setClipToPadding(false);
        this.w0.setClipChildren(false);
        setContentView(this.w0);
        this.h1 = new hh.e(this.w0);
        u90 u90Var = new u90(this);
        j2.f fVar = this.m0;
        ((jf.c) fVar.b).a.add(u90Var);
        ((ViewGroup) getWindow().getDecorView()).addView(fVar.p());
        fVar.p().bringToFront();
        org.telegram.ui.Components.b11 b11Var = new org.telegram.ui.Components.b11(this);
        this.o0 = b11Var;
        b11Var.setVisibility(8);
        org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(this);
        this.z0 = s3Var;
        s3Var.setActionBarLayout(this.q0);
        this.z0.addOnLayoutChangeListener(new v90());
        this.z0.setClipChildren(false);
        this.z0.setClipToPadding(false);
        this.w0.addView(this.z0, w7.b6.c(-1.0f, -1));
        ag.r rVar = new ag.r(this, 5);
        this.p0 = rVar;
        rVar.setScaleType(ImageView.ScaleType.CENTER);
        this.w0.addView(this.p0, w7.b6.c(48.0f, 48));
        this.p0.setVisibility(8);
        l0 l0Var2 = this.w0;
        org.telegram.ui.ActionBar.q3 q3Var = new org.telegram.ui.ActionBar.q3(this);
        this.y0 = q3Var;
        l0Var2.addView(q3Var);
        l0 l0Var3 = this.w0;
        w90 w90Var = new w90(this);
        w90Var.setVisibility(8);
        this.x0 = w90Var;
        l0Var3.addView(w90Var);
        E0();
        this.z0.setParentActionBarLayout(this.q0);
        this.q0.setDrawerLayoutContainer(this.z0);
        this.q0.setFragmentStack(this.d0);
        int i11 = 3;
        this.q0.setFragmentStackChangedListener(new q70(this, i11));
        this.q0.setDelegate(this);
        org.telegram.ui.ActionBar.t6.o1(true);
        A();
        Q0();
        int i12 = org.telegram.messenger.zs.k4;
        org.telegram.messenger.zs.e().k(i12, this);
        this.c0 = ConnectionsManager.getInstance(this.O).getConnectionState();
        xa.n nVar = this.o1;
        if (nVar != null) {
            nVar.a();
            this.o1 = null;
        }
        xa.n nVar2 = new xa.n(org.telegram.messenger.zs.e(), this);
        nVar2.e(org.telegram.messenger.zs.M0);
        nVar2.e(org.telegram.messenger.zs.x4);
        nVar2.e(org.telegram.messenger.zs.y4);
        nVar2.e(org.telegram.messenger.zs.n4);
        nVar2.e(org.telegram.messenger.zs.t4);
        nVar2.e(org.telegram.messenger.zs.r4);
        nVar2.e(i12);
        nVar2.e(org.telegram.messenger.zs.n0);
        nVar2.e(org.telegram.messenger.zs.z4);
        nVar2.e(org.telegram.messenger.zs.K4);
        nVar2.e(org.telegram.messenger.zs.P4);
        nVar2.e(org.telegram.messenger.zs.n5);
        nVar2.e(org.telegram.messenger.zs.k5);
        nVar2.e(org.telegram.messenger.zs.M5);
        nVar2.e(org.telegram.messenger.zs.N5);
        this.o1 = nVar2;
        v80 v80Var = new v80(this, objArr2 == true ? 1 : 0);
        this.q1 = v80Var;
        org.telegram.messenger.sc.a(v80Var);
        if (this.q0.getFragmentStack().isEmpty() && ((actionBarLayout = this.r0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (org.telegram.messenger.d20.i(this.O).p()) {
                this.q0.c(-1, new pf0());
            } else {
                this.q0.c(-1, P());
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
                                    un unVar = new un(bundle2);
                                    if (this.q0.c(-1, unVar)) {
                                        unVar.l8 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    c60 c60Var = new c60(bundle2);
                                    if (this.q0.c(-1, c60Var)) {
                                        c60Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    kd kdVar = new kd(bundle2);
                                    if (this.q0.c(-1, kdVar)) {
                                        kdVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", org.telegram.messenger.d20.i(this.O).n);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.q0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.q0.c(-1, new e51(null));
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        E();
        F(false, true, !this.X0);
        W(getIntent(), false, bundle != null, false, null, true, true);
        try {
            String str3 = Build.DISPLAY;
            String str4 = Build.USER;
            String lowerCase2 = str3 != null ? str3.toLowerCase() : "";
            String lowerCase3 = str4 != null ? lowerCase2.toLowerCase() : "";
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.f8.b("OS name " + lowerCase2 + " " + lowerCase3);
            }
            if ((lowerCase2.contains("flyme") || lowerCase3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                org.telegram.messenger.i0.y = true;
                View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                z80 z80Var = new z80(rootView, objArr == true ? 1 : 0);
                this.g0 = z80Var;
                viewTreeObserver.addOnGlobalLayoutListener(z80Var);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        MediaController.B().J0 = this;
        ((ApplicationLoaderImpl) org.telegram.messenger.w0.a).getClass();
        try {
            boolean z11 = org.telegram.messenger.v2.a;
            str = "" + org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n;
            if (org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f() != null) {
                String n10 = org.telegram.messenger.h20.n(org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f());
                if (!TextUtils.isEmpty(n10)) {
                    str = "@" + n10;
                }
            }
            if (ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).isTestBackend()) {
                str = str + " [TEST SERVER]";
            }
            cVar = (t9.c) l9.h.c().b(t9.c.class);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        if (cVar == null) {
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        }
        cVar.d(str);
        cVar.c("version", "public");
        cVar.c("model", Build.MODEL);
        cVar.c("manufacturer", Build.MANUFACTURER);
        if (Build.VERSION.SDK_INT >= 31) {
            str2 = Build.SOC_MODEL;
            cVar.c("soc_model", str2);
            cVar.c("soc_manufacturer", Build.SOC_MANUFACTURER);
        }
        cVar.c("device", Build.DEVICE);
        cVar.c("product", Build.PRODUCT);
        cVar.c("hardware", Build.HARDWARE);
        cVar.c("user", Build.USER);
        cVar.b();
        int i13 = Build.VERSION.SDK_INT;
        org.telegram.messenger.d6.b(true);
        if (i13 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - org.telegram.messenger.d6.i.getLong("last_checked", 0L) >= 86400000 && org.telegram.messenger.d6.i.getInt("dismissed_count", 0) < 3) {
            Pattern pattern = org.telegram.ui.Components.s4.a;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String L0 = org.telegram.messenger.cd.L0(2131754283, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(org.telegram.messenger.d6.j() ? i13 >= 31 ? 2131754281 : 2131754280 : 2131754282, null));
            int i14 = org.telegram.ui.ActionBar.t6.L5;
            alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.t6.x0(null, i14, false), null);
            alertDialog$Builder.n(i14, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new org.telegram.ui.Components.y0(this, 2));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
            x1Var.setOnDismissListener(new jg.z(i11));
            x1Var.show();
            org.telegram.messenger.d6.i.edit().putLong("last_checked", System.currentTimeMillis()).apply();
        }
        if (i13 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new x90(this));
        }
        org.telegram.ui.Components.wb.a(this.w0, new mg.u(7));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        Window window = getWindow();
        try {
            org.telegram.messenger.i0.S(window);
            if (i13 >= 28) {
                window.setNavigationBarDividerColor(0);
            }
        } catch (Throwable th3) {
            org.telegram.messenger.f8.g(th3, true);
        }
        BackupAgent.a();
        e01.Z(false);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 34) {
            if (this.k1 == null) {
                this.k1 = new y90(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.k1);
        } else if (i15 >= 33) {
            if (this.l1 == null) {
                this.l1 = new z90(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.l1);
        }
        B();
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        rf.v vVar;
        l0 l0Var;
        org.telegram.ui.Wallet.u0 u0Var = w7.k6.b;
        if (u0Var != null && u0Var.e == this) {
            u0Var.c("AUTH_CANCELED");
            w7.k6.b.e();
        }
        E1 = false;
        F1--;
        androidx.mediarouter.app.f fVar = this.g1;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.g1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.b9 != null) {
                PhotoViewer.b9.Q0();
            }
            if (PhotoViewer.F1()) {
                PhotoViewer.v1().Q0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f7 = SecretMediaViewer.f();
                Runnable runnable = f7.n1;
                if (runnable != null) {
                    runnable.run();
                    f7.n1 = null;
                }
                aa0 aa0Var = f7.j1;
                if (aa0Var != null) {
                    aa0Var.b();
                    f7.j1 = null;
                }
                org.telegram.messenger.zs.f(f7.a).n(f7, org.telegram.messenger.zs.w);
                org.telegram.messenger.zs.f(f7.a).n(f7, org.telegram.messenger.zs.l0);
                org.telegram.messenger.zs.f(f7.a).n(f7, org.telegram.messenger.zs.i0);
                f7.s = false;
                f7.L = null;
                org.telegram.messenger.kc kcVar = f7.g0;
                if (kcVar != null) {
                    kcVar.a();
                    f7.g0 = null;
                }
                f7.j();
                if (f7.b != null && (l0Var = f7.d) != null) {
                    try {
                        if (l0Var.getParent() != null) {
                            ((WindowManager) f7.b.getSystemService("window")).removeViewImmediate(f7.d);
                        }
                        f7.d = null;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                SecretMediaViewer.v1 = null;
            }
            if (h4.G()) {
                h4.v().r();
            }
            if (lt.g0 != null) {
                lt p5 = lt.p();
                p5.E = false;
                p5.l = null;
                p5.W = null;
                p5.Y = null;
                p5.a0 = null;
                if (p5.w != null && p5.y != null) {
                    Bitmap bitmap = p5.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        p5.v = null;
                    }
                    p5.M = 0.0f;
                    p5.K = false;
                    try {
                        if (p5.y.getParent() != null) {
                            ((WindowManager) p5.w.getSystemService("window")).removeViewImmediate(p5.y);
                        }
                        p5.y = null;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                    lt.g0 = null;
                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, 8);
                }
            }
            b50 b50Var = b50.u5;
            if (b50Var != null) {
                b50Var.L();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i10 = org.telegram.ui.ActionBar.t6.a;
            org.telegram.ui.Components.hu huVar = org.telegram.ui.Components.hu.J1;
            if (huVar != null) {
                huVar.I0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.b();
            }
            fg.l lVar = v7.h7.a;
            if (lVar != null) {
                lVar.e.edit().putFloat("x", (float) lVar.c.m.i).putFloat("y", (float) lVar.d.m.i).commit();
            }
            v7.h7.a = null;
            SparseArray sparseArray = org.telegram.ui.Components.f5.r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController B = MediaController.B();
        if (B.J0 == this) {
            B.J0 = null;
        }
        MediaController B2 = MediaController.B();
        if (B2.K0 == this.t1) {
            B2.K0 = null;
        }
        for (int i11 = 0; i11 < this.E0.size(); i11++) {
            try {
                if (((Dialog) this.E0.get(i11)).isShowing()) {
                    ((Dialog) this.E0.get(i11)).dismiss();
                }
            } catch (Exception e10) {
                org.telegram.messenger.f8.g(e10, true);
            }
        }
        this.E0.clear();
        try {
            if (this.g0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.g0);
            }
        } catch (Exception e11) {
            org.telegram.messenger.f8.g(e11, true);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (this.k1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.k1);
            }
        } else if (i12 >= 33 && this.k1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.l1);
        }
        org.telegram.ui.Components.wb.h(this.w0);
        VideoAds.dropCache();
        I();
        super.onDestroy();
        e0();
        org.telegram.messenger.o6 o6Var = this.f1;
        if (o6Var != null) {
            o6Var.e();
        }
        if (i12 < 24 || (vVar = this.j1) == null) {
            return;
        }
        vVar.c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 82 && !org.telegram.messenger.tz.C) {
            if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (h4.G() && h4.v().V) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (!org.telegram.messenger.i0.Q1()) {
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
            actionBarLayout.L();
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.s0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.L();
                }
                ActionBarLayout actionBarLayout3 = this.r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.L();
                }
            }
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        org.telegram.messenger.i0.E = z10;
        this.u1.a();
        E();
        super.onMultiWindowModeChanged(z10);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        W(intent, true, false, false, null, true, true);
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onPause() {
        VoIPService sharedInstance;
        super.onPause();
        G1 = false;
        org.telegram.utils.twidget.p.q(true);
        jf.c cVar = this.n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (org.telegram.messenger.i0.H1(cVar.d) && cVar.e() && Build.VERSION.SDK_INT >= 31) {
            cVar.b();
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, Integer.valueOf(TLObject.FLAG_12));
        org.telegram.messenger.w0.x = true;
        Utilities.d.c(new org.telegram.messenger.wd(this.O, 10));
        g0();
        this.q0.N();
        if (org.telegram.messenger.i0.Q1()) {
            ActionBarLayout actionBarLayout = this.s0;
            if (actionBarLayout != null) {
                actionBarLayout.N();
            }
            ActionBarLayout actionBarLayout2 = this.r0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.N();
            }
        }
        org.telegram.ui.Components.bd0 bd0Var = this.A0;
        if (bd0Var != null) {
            bd0Var.b.k();
        }
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.zc0) obj).k();
        }
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.a;
        ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            if (v12.j2 != null) {
                v12.H0(false, false);
            } else {
                org.telegram.ui.Components.u61 u61Var = v12.F2;
                if (u61Var != null && v12.Z2) {
                    u61Var.s0(org.telegram.messenger.i0.H1(v12.D));
                }
            }
        }
        vh.o8 o8Var = vh.o8.F2;
        if (o8Var != null) {
            o8Var.u(false);
            vh.e8 e8Var = o8Var.c1;
            if (e8Var != null) {
                e8Var.f.r();
            }
            vh.d8 d8Var = o8Var.X0;
            if (d8Var != null) {
                d8Var.x(0, true);
            }
        }
        be1 be1Var = be1.n1;
        if (be1Var != null) {
            boolean isInteractive = ((PowerManager) be1Var.b.getSystemService("power")).isInteractive();
            int a2 = mf.b.a(be1Var.b);
            boolean z10 = a2 > 0;
            if (be1Var.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a2 == 2) {
                int measuredHeight = be1.n1.u0.getMeasuredHeight();
                be1 be1Var2 = be1.n1;
                org.telegram.ui.Components.voip.t1.e(be1Var2.b, be1Var2.a, be1Var2.u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = be1.n1.r0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.t1.X = windowInsets.getSystemWindowInsetTop();
                    be1.n1.r0.getSystemWindowInsetBottom();
                }
            }
            if (be1Var.n0 && ((!z10 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.t1.d() != null) {
                org.telegram.ui.Components.voip.t1 d = org.telegram.ui.Components.voip.t1.d();
                if (d.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (d.G) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = nh.h.n;
        if (hashMap == null) {
            return;
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            nh.g gVar = ((nh.h) it.next()).f;
            if (gVar != null) {
                gVar.b = true;
            }
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        jf.c cVar = this.n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (cVar.f) {
            if (z10) {
                cVar.d(1.0f);
                cVar.j.a();
                ArrayList arrayList = cVar.b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((lf.e) obj).getClass();
                }
                if (cVar.n) {
                    cVar.n = false;
                    cVar.l.removeFrameCallback(cVar.m);
                }
                ArrayList arrayList2 = cVar.a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((kf.b) obj2).f();
                }
            } else if (cVar.e) {
                cVar.c(false);
            } else {
                cVar.a(true);
            }
        }
        if (z10 || this.s1) {
            return;
        }
        if (org.telegram.ui.Components.voip.s0.d0.V) {
            org.telegram.ui.Components.voip.s0.b();
        }
        if (th.w0.Z.S) {
            th.w0.b();
        }
        if (org.telegram.ui.Components.jf0.p0.P) {
            org.telegram.ui.Components.jf0.b(false);
        }
        b50.v1(this, null, false, true);
        if (PhotoViewer.b9 != null) {
            PhotoViewer.b9.Q0();
        }
        if (PhotoViewer.F1()) {
            PhotoViewer.v1().H0(false, false);
        }
    }

    @Override // android.app.Activity
    public final boolean onPictureInPictureRequested() {
        jf.c cVar = this.n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        cVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.n0.g(pictureInPictureUiState);
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        org.telegram.utils.twidget.v vVar;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (u(i10, strArr, iArr)) {
            org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.a;
            if (this.q0.getFragmentStack().size() != 0) {
                this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
            }
            if (org.telegram.messenger.i0.Q1()) {
                if (this.s0.getFragmentStack().size() != 0) {
                    this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
                if (this.r0.getFragmentStack().size() != 0) {
                    this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
            }
            be1.k(iArr, i10);
            vh.o8 o8Var = vh.o8.F2;
            int i11 = 2;
            int i12 = 0;
            if (o8Var != null) {
                th.b bVar = o8Var.a;
                Activity activity = o8Var.b;
                boolean z10 = iArr != null && iArr.length == 1 && iArr[0] == 0;
                if (i10 == 111) {
                    o8Var.s2 = !z10;
                    if (z10 && o8Var.f0 == 0) {
                        o8Var.A0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            o8Var.q();
                        } else {
                            CameraController.getInstance().initCamera(new vh.y6(o8Var, i12));
                        }
                    }
                } else if (i10 == 114) {
                    if (z10) {
                        MediaController.O(0);
                        o8Var.e(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                        int i13 = org.telegram.ui.ActionBar.t6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.t6.x0(null, i13, false), null);
                        alertDialog$Builder.n(i13, null);
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747315, null));
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.T = W2;
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new vh.f7(o8Var, i11));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
                        x1Var.show();
                    }
                } else if (i10 == 112) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, activity, bVar);
                        int i14 = org.telegram.ui.ActionBar.t6.L5;
                        alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.t6.x0(null, i14, false), null);
                        alertDialog$Builder2.n(i14, null);
                        SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747325, null));
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        x1Var2.T = W22;
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747316, null), new vh.f7(o8Var, 3));
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131751772, null), null);
                        x1Var2.show();
                    }
                } else if (i10 == 115) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, activity, bVar);
                        int i15 = org.telegram.ui.ActionBar.t6.L5;
                        alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.t6.x0(null, i15, false), null);
                        alertDialog$Builder3.n(i15, null);
                        SpannableStringBuilder W23 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747329, null));
                        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                        x1Var3.T = W23;
                        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131747316, null), new vh.f7(o8Var, 5));
                        alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131751772, null), null);
                        x1Var3.show();
                    }
                    if (z10 && (vVar = o8Var.y2) != null) {
                        vVar.run();
                    }
                    o8Var.y2 = null;
                }
            }
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.d5, Integer.valueOf(i10), strArr, iArr);
            SparseIntArray sparseIntArray = this.c1;
            if (sparseIntArray.get(i10, -1) >= 0) {
                int i16 = sparseIntArray.get(i10, -1);
                sparseIntArray.delete(i10);
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.o5, Integer.valueOf(i16));
            }
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.p5, Integer.valueOf(i10), strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onResume() {
        org.telegram.messenger.jj jjVar;
        ig.a1 a1Var;
        org.telegram.messenger.we weVar;
        super.onResume();
        int i10 = 0;
        org.telegram.utils.twidget.p.q(false);
        int i11 = 1;
        G1 = true;
        jf.c cVar = this.n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (cVar.f) {
            cVar.a(false);
        }
        org.telegram.ui.Components.zt ztVar = H1;
        if (ztVar != null) {
            ztVar.run();
            H1 = null;
        }
        if (org.telegram.ui.ActionBar.t6.o == 3) {
            org.telegram.ui.ActionBar.t6.F(false);
        }
        org.telegram.messenger.nd[] ndVarArr = org.telegram.messenger.nd.O;
        int i12 = 0;
        while (true) {
            if (i12 >= 4) {
                break;
            }
            if (org.telegram.messenger.d20.i(i12).p() && !org.telegram.messenger.nd.f(i12).I.isEmpty()) {
                org.telegram.messenger.nd.q();
                break;
            }
            i12++;
        }
        H(true);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, Integer.valueOf(TLObject.FLAG_12));
        MediaController B = MediaController.B();
        ViewGroup view = this.q0.getView();
        this.t1 = view;
        B.K0 = view;
        org.telegram.messenger.w0.x = false;
        org.telegram.messenger.vp.r1(this.O).Q4(null);
        I0();
        Utilities.d.c(new org.telegram.ui.Components.voip.m0(7));
        C(0);
        if (Build.VERSION.SDK_INT >= 24 && (weVar = MediaController.Z1) != null) {
            Utilities.e.d(new org.telegram.messenger.wd(weVar.e.size(), i11), 2000L);
        }
        h0();
        org.telegram.ui.Components.bd0 bd0Var = this.A0;
        if (bd0Var == null || bd0Var.b.getVisibility() != 0) {
            this.q0.O();
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout = this.s0;
                if (actionBarLayout != null) {
                    actionBarLayout.O();
                }
                ActionBarLayout actionBarLayout2 = this.r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.O();
                }
            }
        } else {
            this.q0.n();
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout3 = this.s0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.n();
                }
                ActionBarLayout actionBarLayout4 = this.r0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.n();
                }
            }
            this.A0.b.l();
            ArrayList arrayList = this.B0;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                ((org.telegram.ui.Components.zc0) obj).l();
            }
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
        Q0();
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            as0 as0Var = v12.e0;
            if (as0Var != null) {
                as0Var.invalidate();
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.qq(v12, i10, 17), 100L);
            }
            org.telegram.ui.Components.u61 u61Var = v12.F2;
            if (u61Var != null) {
                u61Var.p0(u61Var.S() + 1);
                if (v12.Z2) {
                    v12.F2.s0(true);
                }
            }
            er0 er0Var = v12.L1;
            if (er0Var != null && (a1Var = er0Var.F0.d) != null) {
                a1Var.postRunnable(a1Var.x);
            }
        }
        vh.o8 o8Var = vh.o8.F2;
        if (o8Var != null) {
            o8Var.O();
        }
        if (PipRoundVideoView.F != null && MediaController.B().H() && (jjVar = MediaController.B().u0) != null) {
            MediaController.B().i0(jjVar, jjVar.b0);
        }
        if (org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).Z != null) {
            int i14 = org.telegram.messenger.d20.s0;
            L0(i14, org.telegram.messenger.d20.i(i14).Z);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.tz.j1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(org.telegram.messenger.d20.s0, tL_help_appUpdate, true);
            }
        }
        z(false);
        org.telegram.messenger.w0.F = Settings.canDrawOverlays(this);
        be1 be1Var = be1.n1;
        if (be1Var != null) {
            if (org.telegram.ui.Components.voip.t1.d() != null) {
                org.telegram.ui.Components.voip.t1.a();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                be1Var.G();
            } else if (VoIPService.getSharedState() == null) {
                be1Var.u0.b();
            }
            be1Var.J0 = ((KeyguardManager) be1Var.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.t1.d() != null) {
                org.telegram.ui.Components.voip.t1.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        a0();
        HashMap hashMap = nh.h.n;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                nh.g gVar = ((nh.h) it.next()).f;
                if (gVar != null) {
                    gVar.b = false;
                }
            }
        }
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.a;
        y yVar = K1;
        if (yVar != null) {
            yVar.run();
            K1 = null;
        }
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.O);
        if (r12.U3.contains("SETUP_LOGIN_EMAIL") || r12.U3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            Utilities.d.c(new org.telegram.messenger.zj(org.telegram.messenger.vp.r1(this.O), 25));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x000e, B:9:0x0018, B:11:0x00a5, B:15:0x00b3, B:16:0x011b, B:20:0x00bc, B:23:0x00c2, B:24:0x00cb, B:26:0x00cf, B:27:0x00d5, B:29:0x00d9, B:31:0x00e2, B:32:0x00e8, B:35:0x00f2, B:36:0x00fb, B:39:0x0101, B:41:0x0109, B:42:0x0112, B:44:0x0116, B:46:0x0034, B:48:0x0038, B:50:0x0042, B:51:0x005a, B:53:0x0066, B:55:0x007e, B:57:0x008a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.m, e0.f, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        org.telegram.ui.ActionBar.k2 k2Var;
        try {
            super.onSaveInstanceState(bundle);
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout = this.r0;
                if (actionBarLayout == null || actionBarLayout.getFragmentStack().isEmpty()) {
                    ActionBarLayout actionBarLayout2 = this.s0;
                    if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                        if (!this.q0.getFragmentStack().isEmpty()) {
                            k2Var = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
                        }
                        k2Var = null;
                    } else {
                        k2Var = this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1);
                    }
                } else {
                    k2Var = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
                }
                if (k2Var != null) {
                    Bundle arguments = k2Var.getArguments();
                    if ((k2Var instanceof un) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "chat");
                    } else if ((k2Var instanceof c60) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "group");
                    } else if (k2Var instanceof WallpapersListActivity) {
                        bundle.putString("fragment", "wallpapers");
                    } else if (k2Var instanceof ProfileActivity) {
                        ProfileActivity profileActivity = (ProfileActivity) k2Var;
                        if (profileActivity.u4()) {
                            bundle.putString("fragment", "settings");
                        } else if (profileActivity.e1 != 0 && arguments != null) {
                            bundle.putBundle("args", arguments);
                            bundle.putString("fragment", "chat_profile");
                        }
                    } else if ((k2Var instanceof kd) && arguments != null && arguments.getInt("step") == 0) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "channel");
                    } else if (k2Var instanceof e51) {
                        bundle.putString("fragment", "settings2");
                    }
                    k2Var.saveSelfArgs(bundle);
                    return;
                }
                return;
            }
            if (!this.q0.getFragmentStack().isEmpty()) {
                k2Var = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
                if (k2Var != null) {
                }
            }
            k2Var = null;
            if (k2Var != null) {
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.s1 = true;
        this.n0.h();
        WeakReference weakReference = gf.f.e;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (activity != null && activity != this) {
            gf.f.w(activity);
        }
        if (gf.f.b == null) {
            gf.f.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(gf.f.d)) {
                    String a2 = w7.u6.a(this);
                    gf.f.d = a2;
                    if (a2 == null) {
                    }
                }
                gf.d dVar = new gf.d();
                a9.d dVar2 = new a9.d();
                dVar2.b = new WeakReference(dVar);
                gf.f.c = dVar2;
                String str = gf.f.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, dVar2, 33)) {
                    gf.f.c = null;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        org.telegram.messenger.w0.y = false;
        org.telegram.ui.Components.g20.j(this);
        b50 b50Var = b50.u5;
        if (b50Var != null) {
            ArrayList arrayList = b50Var.Q3;
            b50.z5 = false;
            b50Var.G1.f();
            u20 u20Var = b50Var.d4;
            if (u20Var.getVisibility() == 0) {
                b50Var.g4.G(u20Var, false);
            }
            if (b50.x5) {
                b50Var.f4.I(b50Var.e4, false);
            }
            arrayList.clear();
            arrayList.addAll(b50Var.P3);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
            }
            g40 g40Var = b50Var.C1;
            org.telegram.ui.Components.z71 z71Var = g40Var.w;
            if (z71Var != null) {
                z71Var.c(true);
            }
            g40Var.F = false;
            b50Var.y1.s();
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onStop() {
        mr0 mr0Var;
        super.onStop();
        org.telegram.ui.Wallet.u0 u0Var = w7.k6.b;
        if (u0Var != null && u0Var.e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.u0 u0Var2 = w7.k6.b;
            if (!u0Var2.f) {
                u0Var2.c("AUTH_CANCELED");
                w7.k6.b.e();
            }
        }
        this.s1 = false;
        jf.c cVar = this.n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        cVar.e = false;
        if (cVar.f) {
            cVar.c(true);
        }
        cVar.d.unregisterReceiver(cVar.o);
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            if (!org.telegram.messenger.i0.H1(v12.D) && (v12.F2 == null ? !((mr0Var = v12.f0) == null || !mr0Var.y || !mr0Var.G) : v12.P3)) {
                v12.k2();
            }
        }
        gf.f.w(this);
        org.telegram.messenger.w0.y = true;
        org.telegram.ui.Components.g20.j(this);
        b50 b50Var = b50.u5;
        if (b50Var != null) {
            b50.z5 = true;
            ArrayList arrayList = b50Var.Q3;
            arrayList.clear();
            arrayList.addAll(b50Var.P3);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(false);
            }
            g40 g40Var = b50Var.C1;
            org.telegram.ui.Components.z71 z71Var = g40Var.w;
            if (z71Var != null) {
                z71Var.c(false);
            }
            g40Var.F = true;
            b50Var.y1.r();
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.i1 = false;
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        jf.c cVar = this.n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        cVar.f();
        ArrayList arrayList = this.b1;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.q0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.U0.isEmpty()) {
                ((org.telegram.ui.ActionBar.k2) sc.e.g(1, actionBarLayout.U0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.s sVar = actionBarLayout.G;
            if (sVar != null) {
                sVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z10) {
        boolean z11;
        th.n5 a2;
        long[] jArr2 = jArr;
        int i10 = 0;
        while (true) {
            if (i10 >= jArr2.length) {
                z11 = true;
                break;
            }
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.O).Z1(Long.valueOf(jArr2[i10]));
            if (Z1 != null && !Z1.stories_hidden) {
                z11 = false;
                break;
            }
            i10++;
        }
        org.telegram.ui.ActionBar.k2 Q = Q();
        if (Q == null) {
            return;
        }
        th.e5 O1 = org.telegram.messenger.vp.r1(this.O).O1();
        ArrayList arrayList = new ArrayList(z11 ? O1.h : O1.g);
        boolean z12 = z11;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!z12) {
            ArrayList arrayList4 = new ArrayList();
            for (int i11 = 0; i11 < jArr2.length; i11++) {
                TLRPC.User Z12 = org.telegram.messenger.vp.r1(this.O).Z1(Long.valueOf(jArr2[i11]));
                if (Z12 == null || !Z12.stories_hidden) {
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
            for (int i13 = 0; i13 < jArr2.length; i13 = c3.i0.k(i13, 1, jArr2[i13], arrayList3)) {
            }
        } else {
            for (int i14 = 0; i14 < jArr2.length; i14 = c3.i0.k(i14, 1, jArr2[i14], arrayList2)) {
            }
        }
        if (!arrayList3.isEmpty() && z10) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.O);
            int[] iArr = {arrayList3.size()};
            qq qqVar = new qq(this, iArr, jArr2, 17);
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                long longValue = ((Long) arrayList3.get(i15)).longValue();
                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                TLRPC.InputPeer i16 = r12.i1(longValue);
                tL_stories_getPeerStories.peer = i16;
                if (i16 instanceof TLRPC.TL_inputPeerEmpty) {
                    iArr[0] = iArr[0] - 1;
                } else {
                    ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getPeerStories, new mg.x(r12, longValue, qqVar, 3));
                }
            }
            return;
        }
        long e = org.telegram.messenger.d20.i(this.O).e();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            long o10 = org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i17)).peer);
            if (o10 != e && !arrayList2.contains(Long.valueOf(o10)) && O1.L(o10)) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (Q instanceof ay) {
            try {
                a2 = th.n5.a(((ay) Q).E0.h);
            } catch (Exception unused) {
            }
            th.n5 n5Var = a2;
            Q.getOrCreateStoryViewer().J();
            Q.getOrCreateStoryViewer().T(this, null, arrayList2, 0, null, null, n5Var, false);
        }
        a2 = null;
        th.n5 n5Var2 = a2;
        Q.getOrCreateStoryViewer().J();
        Q.getOrCreateStoryViewer().T(this, null, arrayList2, 0, null, null, n5Var2, false);
    }

    public final void q0(final int i10, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        th.x4 x4Var;
        th.x4 A;
        org.telegram.messenger.jj f7;
        org.telegram.messenger.jj f10;
        TL_stories.StoryItem storyItem2;
        th.e5 O1 = org.telegram.messenger.vp.r1(this.O).O1();
        TL_stories.PeerStories y3 = O1.y(j10);
        th.n5 n5Var = null;
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
                org.telegram.ui.ActionBar.k2 Q = Q();
                if (Q == null) {
                    return;
                }
                if (Q instanceof ay) {
                    try {
                        n5Var = th.n5.a(((ay) Q).E0.h);
                    } catch (Exception unused) {
                    }
                }
                th.n5 n5Var2 = n5Var;
                Q.getOrCreateStoryViewer().J();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem2.dialogId));
                if (z10) {
                    Q.getOrCreateStoryViewer().w1 = true;
                }
                Q.getOrCreateStoryViewer().T(this, storyItem2, arrayList, 0, null, y3, n5Var2, false);
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            th.x4 A2 = O1.A(0, -1, j10, true);
            if (A2 == null || (f10 = A2.f(i10)) == null) {
                A2 = null;
            } else {
                storyItem = f10.l;
            }
            if (storyItem != null || (A = O1.A(1, -1, j10, true)) == null || (f7 = A.f(i10)) == null) {
                x4Var = A2;
            } else {
                storyItem = f7.l;
                x4Var = A;
            }
            if (storyItem != null && x4Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.k2 Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof ay) {
                    try {
                        n5Var = th.n5.a(((ay) Q2).E0.h);
                    } catch (Exception unused2) {
                    }
                }
                th.n5 n5Var3 = n5Var;
                Q2.getOrCreateStoryViewer().J();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    Q2.getOrCreateStoryViewer().w1 = true;
                }
                Q2.getOrCreateStoryViewer().T(this, storyItem, arrayList2, 0, x4Var, null, n5Var3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = org.telegram.messenger.vp.r1(this.O).i1(j10);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: org.telegram.ui.e90
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.D1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i12 = i10;
                final long j11 = j10;
                final boolean z11 = z10;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.k70
                    @Override // java.lang.Runnable
                    public final void run() {
                        TL_stories.StoryItem storyItem3;
                        Pattern pattern2 = LaunchActivity.D1;
                        TLObject tLObject2 = tLObject;
                        th.n5 n5Var4 = null;
                        if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= tL_stories_stories.stories.size()) {
                                    storyItem3 = null;
                                    break;
                                } else {
                                    if (tL_stories_stories.stories.get(i13).id == i12) {
                                        storyItem3 = tL_stories_stories.stories.get(i13);
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            if (storyItem3 != null) {
                                long j12 = j11;
                                storyItem3.dialogId = j12;
                                org.telegram.ui.ActionBar.k2 Q3 = LaunchActivity.Q();
                                if (Q3 == null) {
                                    return;
                                }
                                if (Q3 instanceof ay) {
                                    try {
                                        n5Var4 = th.n5.a(((ay) Q3).E0.h);
                                    } catch (Exception unused3) {
                                    }
                                }
                                th.n5 n5Var5 = n5Var4;
                                Q3.getOrCreateStoryViewer().J();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(Long.valueOf(j12));
                                if (z11) {
                                    Q3.getOrCreateStoryViewer().w1 = true;
                                }
                                Q3.getOrCreateStoryViewer().T(LaunchActivity.this, storyItem3, arrayList3, 0, null, null, n5Var5, false);
                                return;
                            }
                        }
                        org.telegram.ui.Components.cc.X().Q(R.raw.error, 36, org.telegram.messenger.cd.L0(2131744625, null)).k(false);
                    }
                });
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.s6 s6Var) {
        int i10 = s6Var.f0;
        org.telegram.ui.ActionBar.r6 f7 = s6Var.f(tL_theme, this.O, 0);
        s6Var.Z = s6Var.Y;
        s6Var.u(f7.a);
        f7.s = tL_wallPaper;
        t0(new m91(s6Var, i10 != s6Var.f0, 0, false, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
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
            tL_forumTopic2 = org.telegram.messenger.vp.r1(i10).r7.f(chat.id, i15);
        } else {
            i15 = i11;
            tL_forumTopic2 = tL_forumTopic;
        }
        if (tL_forumTopic2 == null) {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
            tL_messages_getForumTopicsByID.peer = org.telegram.messenger.vp.r1(this.O).i1(-chat.id);
            tL_messages_getForumTopicsByID.topics.add(Integer.valueOf(i15));
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() { // from class: org.telegram.ui.r80
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    Pattern pattern = LaunchActivity.D1;
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
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.x80
                        @Override // java.lang.Runnable
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.D1;
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            launchActivity2.getClass();
                            if (tL_error == null) {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                a0.h hVar = new a0.h();
                                for (int i21 = 0; i21 < tL_messages_forumTopics.messages.size(); i21++) {
                                    hVar.k(tL_messages_forumTopics.messages.get(i21), tL_messages_forumTopics.messages.get(i21).id);
                                }
                                int i22 = i16;
                                org.telegram.messenger.vp.r1(i22).V3(tL_messages_forumTopics.users, false);
                                org.telegram.messenger.vp.r1(i22).P3(tL_messages_forumTopics.chats, false);
                                org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(i22).r7;
                                TLRPC.Chat chat3 = chat2;
                                x00Var.u(chat3.id, tL_messages_forumTopics.topics, hVar, false, 2, -1);
                                org.telegram.messenger.x00 x00Var2 = org.telegram.messenger.vp.r1(i22).r7;
                                long j10 = chat3.id;
                                int i23 = i17;
                                launchActivity2.s0(i22, i23, chat3, i18, x00Var2.f(j10, i23), runnable2, str2, num2, bArr2, i19, arrayList3, i20);
                            }
                        }
                    });
                }
            });
            return;
        }
        ArrayList arrayList3 = this.d0;
        org.telegram.ui.ActionBar.k2 k2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList3) : null;
        if (k2Var instanceof un) {
            un unVar = (un) k2Var;
            if (unVar.a() == (-chat.id) && unVar.v4 && unVar.b() == tL_forumTopic2.id) {
                if (str != null) {
                    unVar.Eb(i12, i14, str);
                }
                unVar.g8 = num;
                unVar.nb(i12, i13, true, 0, true, 0, null, null, null);
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
        un unVar2 = new un(bundle);
        if (arrayList.isEmpty()) {
            TLRPC.Message message = new TLRPC.Message();
            message.id = 1;
            message.action = new TLRPC.TL_messageActionChannelMigrateFrom();
            arrayList2 = arrayList;
            arrayList2.add(new org.telegram.messenger.jj(i10, message, false, false));
        } else {
            arrayList2 = arrayList;
        }
        unVar2.Hb(arrayList2, chat, i12, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i12 != tL_forumTopic2.id) {
            if (str != null) {
                unVar2.Eb(i12, i14, str);
            } else {
                unVar2.g8 = num;
                unVar2.b8 = i12;
            }
            unVar2.nb(i12, i13, true, 0, true, 0, null, null, null);
        }
        t0(unVar2);
        if (runnable == null) {
        }
    }

    @Override // android.app.Activity
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        jf.c cVar = this.n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        cVar.h = pictureInPictureParams;
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i10) {
        org.telegram.messenger.i0.g = -10;
        org.telegram.messenger.i0.h = -10;
        org.telegram.messenger.i0.i = null;
        super.setRequestedOrientation(i10);
    }

    public final void t0(org.telegram.ui.ActionBar.k2 k2Var) {
        ((ActionBarLayout) M()).R(k2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) M()).U(k2Var, z10, z11);
    }

    public final void v0(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E0;
            if (i10 >= arrayList.size()) {
                org.telegram.ui.ActionBar.k2 T = T();
                if (T != null && T.sheetsStack != null) {
                    for (int i11 = 0; i11 < T.sheetsStack.size(); i11++) {
                        if (T.sheetsStack.get(i11).s()) {
                            T.sheetsStack.get(i11);
                        }
                    }
                }
                my w9 = this.q0.w();
                if (w9 != null && w9.sheetsStack != null) {
                    for (int i12 = 0; i12 < w9.sheetsStack.size(); i12++) {
                        if (w9.sheetsStack.get(i12).s()) {
                            w9.sheetsStack.get(i12);
                        }
                    }
                }
                v80 v80Var = new v80(this, 1);
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.O).Z1(Long.valueOf(j10));
                if (Z1 != null) {
                    v80Var.a(Z1);
                    return;
                } else {
                    org.telegram.messenger.hs.a0(this.O).a.c(new a3.i0(this, j10, v80Var, 20));
                    return;
                }
            }
            if (arrayList.get(i10) instanceof xh.m2) {
                xh.m2 m2Var = (xh.m2) arrayList.get(i10);
                if (m2Var.isShowing() && m2Var.I == j10) {
                    return;
                }
            }
            i10++;
        }
    }

    public final void w0(Long l4, f70 f70Var, gf.e eVar, org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.i3 G0 = org.telegram.messenger.vp.r1(this.O).G0();
        if (eVar != null) {
            eVar.d();
        }
        G0.a(l4.longValue(), new r70(this, eVar, f70Var, G0, l4, q1Var));
    }

    public final void x(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.A1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A1 = null;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i11 >= 26 ? getWindow().getNavigationBarColor() : 0, i10);
        this.A1 = ofArgb;
        ofArgb.addUpdateListener(new p70(this, 1));
        this.A1.addListener(new t0(this, i10, 2));
        this.A1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.A1.setDuration(320L);
        this.A1.start();
    }

    public final void x0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l4, final Long l10, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, String str26, final String str27, final gf.e eVar, final boolean z12, final int i13, final int i14, final int i15, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = org.telegram.messenger.vp.r1(i10).p1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getBotApp, new RequestDelegate() { // from class: org.telegram.ui.h80
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.D1;
                final gf.e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.b();
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
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.n80
                        @Override // java.lang.Runnable
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.D1;
                            runnable2.run();
                            AtomicBoolean atomicBoolean = new AtomicBoolean();
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            ArrayList arrayList = launchActivity2.d0;
                            org.telegram.ui.ActionBar.k2 k2Var = (arrayList == null || arrayList.isEmpty()) ? null : (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
                            int i17 = i16;
                            TLRPC.User user3 = user2;
                            TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                            String str31 = str30;
                            boolean z28 = z23;
                            boolean z29 = z24;
                            boolean z30 = z25;
                            boolean z31 = z22;
                            u80 u80Var = new u80(launchActivity2, k2Var, i17, user3, tL_messages_botApp2, atomicBoolean, str31, z28, z29, z30, z31);
                            if (z26) {
                                u80Var.run();
                                return;
                            }
                            if (tL_messages_botApp2.inactive && z27) {
                                s3 s3Var = new s3(u80Var, 9);
                                gf.e eVar3 = eVar2;
                                te1.a(launchActivity2, s3Var, eVar3 != null ? new zy(eVar3, 16) : null);
                            } else if (tL_messages_botApp2.request_write_access || z31) {
                                org.telegram.ui.Components.s4.m(k2Var, atomicBoolean, user3, u80Var);
                            } else {
                                u80Var.run();
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
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.m80
                    @Override // java.lang.Runnable
                    public final void run() {
                        Pattern pattern2 = LaunchActivity.D1;
                        LaunchActivity.this.B0(i16, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, z28, num3, l11, l12, num4, str43, hashMap2, str44, str45, str46, str47, tL_wallPaper2, str48, str49, str50, str51, z29, str52, i17, i18, str53, str54, str55, null, null, eVar2, z22, i19, false, i20, i21, null, null, z30, str56, z23, z24, z25, z31, z32, str57, null, z33, null);
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
    @Override // org.telegram.ui.ux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(ay ayVar, ArrayList arrayList, final CharSequence charSequence, boolean z10, boolean z11, int i10, final int i11, pb1 pb1Var) {
        un unVar;
        final un unVar2;
        CharSequence charSequence2;
        boolean z12;
        org.telegram.messenger.jj jjVar;
        un unVar3;
        long j10;
        long j11;
        org.telegram.messenger.c cVar;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        int size;
        ArrayList arrayList2;
        int i13;
        CharSequence charSequence6;
        LaunchActivity launchActivity;
        int i14;
        ArrayList arrayList3;
        LaunchActivity launchActivity2;
        CharSequence charSequence7;
        int i15;
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
        final int currentAccount = ayVar != null ? ayVar.getCurrentAccount() : launchActivity4.O;
        Uri uri = launchActivity4.X;
        boolean z19 = true;
        boolean z20 = false;
        if (uri != null) {
            ArrayList arrayList6 = launchActivity4.W != null ? new ArrayList(launchActivity4.W) : null;
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, launchActivity4, null);
            org.telegram.messenger.qz.C(currentAccount).Q(((org.telegram.messenger.gs) arrayList5.get(0)).a, launchActivity4.X, launchActivity4.W, new c90(launchActivity4, currentAccount, ayVar, z10, arrayList6, uri, x1Var));
            try {
                x1Var.r(300L);
            } catch (Exception unused) {
            }
            launchActivity3 = launchActivity4;
            r10 = 0;
        } else {
            ay ayVar2 = ayVar;
            final boolean z21 = ayVar2 == null || ayVar2.J2 || z11;
            int i16 = i10 != 0 ? i10 : ayVar2 == null ? 0 : ayVar2.K2;
            boolean z22 = ayVar2 != null && ayVar2.M2;
            if (arrayList5.size() <= 1) {
                long j12 = ((org.telegram.messenger.gs) arrayList5.get(0)).a;
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                if (!org.telegram.messenger.i0.Q1()) {
                    org.telegram.messenger.zs.f(currentAccount).k(org.telegram.messenger.zs.t, new Object[0]);
                }
                if (org.telegram.messenger.o5.C(j12)) {
                    g10.putInt("enc_id", (int) (j12 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(j12)) {
                    g10.putLong("user_id", j12);
                } else {
                    g10.putLong("chat_id", -j12);
                }
                if (org.telegram.messenger.vp.r1(currentAccount).E(g10, ayVar2, null, null)) {
                    un unVar4 = new un(g10);
                    gg.e.a(unVar4, (org.telegram.messenger.gs) arrayList5.get(0));
                    unVar = unVar4;
                }
                return false;
            }
            unVar = null;
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
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                if (org.telegram.ui.Components.s4.h(launchActivity4, launchActivity4.O, ((org.telegram.messenger.gs) arrayList5.get(i17)).a, size2 > 1)) {
                    return false;
                }
            }
            if (pb1Var != null) {
                pb1Var.removeSelfFromStack();
            }
            ArrayList arrayList11 = launchActivity4.a0;
            if (arrayList11 != null && arrayList11.size() == 1) {
                ArrayList arrayList12 = launchActivity4.d0;
                if (!arrayList12.isEmpty()) {
                    org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList12), null, null, launchActivity4.b0, null, null, null, null, null);
                    unVar2 = unVar;
                    final int i18 = i16;
                    vd0Var.B1 = new org.telegram.ui.Components.vi() { // from class: org.telegram.ui.d90
                        @Override // org.telegram.ui.Components.vi
                        public final void a(TLRPC.User user, boolean z23, int i19, long j13) {
                            org.telegram.messenger.jj jjVar2;
                            TLRPC.TL_forumTopic f7;
                            TLRPC.Message message2;
                            Pattern pattern = LaunchActivity.D1;
                            un unVar5 = unVar2;
                            if (unVar5 != null) {
                                ((ActionBarLayout) LaunchActivity.this.M()).U(unVar5, true, false);
                            }
                            org.telegram.messenger.c a2 = org.telegram.messenger.c.a(org.telegram.messenger.d20.s0);
                            int i20 = a2.a;
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList13 = arrayList5;
                                if (i21 >= arrayList13.size()) {
                                    return;
                                }
                                long j14 = ((org.telegram.messenger.gs) arrayList13.get(i21)).a;
                                long j15 = ((org.telegram.messenger.gs) arrayList13.get(i21)).b;
                                if (j15 == 0 || (f7 = org.telegram.messenger.vp.r1(i20).r7.f(-j14, j15)) == null || (message2 = f7.topicStartMessage) == null) {
                                    jjVar2 = null;
                                } else {
                                    jjVar2 = new org.telegram.messenger.jj(i20, message2, false, false);
                                    jjVar2.p = true;
                                }
                                org.telegram.messenger.jj jjVar3 = jjVar2;
                                int i22 = i18;
                                int i23 = i19 != 0 ? i19 : i22;
                                int i24 = i11;
                                org.telegram.messenger.oz g11 = org.telegram.messenger.oz.g(user, j14, jjVar3, jjVar3, null, null, z23, i23, i24);
                                CharSequence charSequence11 = charSequence;
                                if (TextUtils.isEmpty(charSequence11)) {
                                    g11.O = 0L;
                                }
                                g11.L = false;
                                org.telegram.messenger.qz.C(currentAccount).r0(g11);
                                if (!TextUtils.isEmpty(charSequence11)) {
                                    org.telegram.messenger.qz.a0(a2, charSequence11, j14, 0L, z21, i19 != 0 ? i19 : i22, i24);
                                }
                                i21++;
                            }
                        }

                        @Override // org.telegram.ui.Components.vi
                        public final /* synthetic */ void b(ArrayList arrayList13, String str2, boolean z23, int i19, long j13, boolean z24) {
                        }
                    };
                    ((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList12)).showDialog(vd0Var);
                    launchActivity3 = launchActivity4;
                    un unVar5 = unVar2;
                    if (ayVar != null && unVar5 == null && !z19) {
                        ayVar.finishFragment();
                    }
                    r10 = 0;
                }
            }
            unVar2 = unVar;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence2 = charSequence;
            } else {
                launchActivity4.T = charSequence;
                charSequence2 = null;
            }
            Object[] objArr = ayVar2 != null && ayVar2.l4();
            if (objArr != false) {
                ArrayList arrayList13 = ayVar2.D2;
                ArrayList arrayList14 = new ArrayList();
                if (arrayList13 != null) {
                    int size3 = arrayList13.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj = arrayList13.get(i19);
                        i19++;
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                        org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
                        boolean z23 = efVar.b;
                        if (z23 || (str = efVar.h) == null) {
                            String str2 = efVar.I;
                            if (str2 != null) {
                                pzVar.c = str2;
                            }
                        } else {
                            pzVar.c = str;
                        }
                        pzVar.e = efVar.c;
                        pzVar.f = efVar.g;
                        pzVar.o = z23;
                        pzVar.p = efVar.d();
                        pzVar.q = efVar.i();
                        boolean z24 = z20;
                        pzVar.z = efVar.m;
                        pzVar.A = efVar.P;
                        CharSequence charSequence11 = efVar.a;
                        pzVar.d = charSequence11 != null ? charSequence11.toString() : null;
                        pzVar.i = efVar.n;
                        pzVar.j = efVar.r;
                        pzVar.h = efVar.x;
                        pzVar.k = efVar.s;
                        pzVar.r = efVar.L;
                        pzVar.x = efVar.c();
                        arrayList14.add(pzVar);
                        z20 = z24;
                    }
                }
                boolean z25 = z20;
                launchActivity4.U = arrayList14;
                if (!arrayList14.isEmpty()) {
                    CharSequence charSequence12 = launchActivity4.T;
                    if (charSequence12 == null) {
                        charSequence12 = "";
                    }
                    CharSequence[] charSequenceArr = new CharSequence[1];
                    charSequenceArr[z25 ? 1 : 0] = charSequence12;
                    ArrayList W = org.telegram.messenger.ui.b0(launchActivity4.O).W(charSequenceArr, z25, true);
                    CharSequence charSequence13 = charSequenceArr[z25 ? 1 : 0];
                    String charSequence14 = charSequence13 == null ? null : charSequence13.toString();
                    for (int i20 = 0; i20 < launchActivity4.U.size(); i20++) {
                        org.telegram.messenger.pz pzVar2 = (org.telegram.messenger.pz) launchActivity4.U.get(i20);
                        if (i20 == 0) {
                            pzVar2.d = charSequence14;
                            pzVar2.i = W;
                        } else {
                            pzVar2.d = null;
                            pzVar2.i = null;
                        }
                    }
                }
                launchActivity4.R = null;
                launchActivity4.T = null;
            }
            boolean z26 = false;
            CharSequence charSequence15 = null;
            int i21 = 0;
            while (i21 < arrayList5.size()) {
                long j13 = ((org.telegram.messenger.gs) arrayList5.get(i21)).a;
                long j14 = ((org.telegram.messenger.gs) arrayList5.get(i21)).b;
                org.telegram.messenger.c a2 = org.telegram.messenger.c.a(org.telegram.messenger.d20.s0);
                int i22 = a2.a;
                if (j14 != 0) {
                    z12 = z26;
                    TLRPC.TL_forumTopic f7 = org.telegram.messenger.vp.r1(i22).r7.f(-j13, j14);
                    if (f7 != null && (message = f7.topicStartMessage) != null) {
                        org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(i22, message, false, false);
                        jjVar2.p = true;
                        jjVar = jjVar2;
                        if (unVar2 == null) {
                            ((ActionBarLayout) launchActivity4.M()).U(unVar2, ayVar2 != null, ayVar2 == null || launchActivity4.R != null || ((arrayList4 = launchActivity4.U) != null && arrayList4.size() > 0));
                            boolean z27 = ayVar2 != null;
                            String str3 = launchActivity4.R;
                            if (str3 == null || j14 != 0 || objArr == true) {
                                ArrayList arrayList15 = launchActivity4.U;
                                if (arrayList15 == null || arrayList15.size() <= 0 || j14 != 0 || objArr == true) {
                                    boolean z28 = z22;
                                    z12 = z27;
                                    CharSequence charSequence16 = charSequence15;
                                    i12 = i22;
                                    unVar3 = unVar2;
                                    j10 = j14;
                                    if (launchActivity4.R != null) {
                                        CharSequence charSequence17 = launchActivity4.T;
                                        if (charSequence17 == null || charSequence17.length() > 1024) {
                                            charSequence8 = charSequence16;
                                        } else {
                                            CharSequence charSequence18 = launchActivity4.T;
                                            launchActivity4.T = null;
                                            charSequence8 = charSequence18;
                                        }
                                        ArrayList arrayList16 = new ArrayList();
                                        arrayList16.add(launchActivity4.R);
                                        j11 = j13;
                                        cVar = a2;
                                        org.telegram.messenger.qz.W(cVar, arrayList16, arrayList16, null, charSequence8, null, j11, jjVar, jjVar, z21, i16);
                                        z22 = z28;
                                        charSequence15 = charSequence8;
                                    } else {
                                        j11 = j13;
                                        cVar = a2;
                                        ArrayList arrayList17 = launchActivity4.U;
                                        if (arrayList17 == null || arrayList17.size() <= 0) {
                                            z22 = z28;
                                        } else {
                                            CharSequence charSequence19 = launchActivity4.T;
                                            if (charSequence19 != null && charSequence19.length() <= 1024 && launchActivity4.U.size() == 1) {
                                                CharSequence[] charSequenceArr2 = {launchActivity4.T};
                                                ((org.telegram.messenger.pz) launchActivity4.U.get(0)).i = org.telegram.messenger.ui.b0(launchActivity4.O).W(charSequenceArr2, false, true);
                                                ((org.telegram.messenger.pz) launchActivity4.U.get(0)).d = charSequenceArr2[0].toString();
                                                launchActivity4.T = null;
                                            }
                                            ArrayList arrayList18 = launchActivity4.U;
                                            int i23 = i16;
                                            org.telegram.messenger.jj jjVar3 = jjVar;
                                            org.telegram.messenger.qz.X(cVar, arrayList18, j11, jjVar3, jjVar, null, null, z28, arrayList18.size() > 1, null, null, z21, i23, i11, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                            j11 = j11;
                                            z22 = z28;
                                            i16 = i23;
                                            jjVar = jjVar3;
                                        }
                                        charSequence15 = charSequence16;
                                    }
                                    z16 = false;
                                    z17 = false;
                                } else {
                                    ArrayList arrayList19 = launchActivity4.U;
                                    CharSequence charSequence20 = (charSequence2 == null || charSequence2.length() == 0) ? launchActivity4.T : charSequence2;
                                    boolean z29 = z22;
                                    ArrayList P7 = un.P7(arrayList19, unVar2.z(), charSequence20);
                                    if (P7.isEmpty()) {
                                        z12 = z27;
                                        charSequence9 = charSequence15;
                                        i12 = i22;
                                        z18 = false;
                                        unVar3 = unVar2;
                                        j10 = j14;
                                        charSequence10 = null;
                                    } else {
                                        if (unVar2.getParentActivity() != null) {
                                            boolean[] zArr = new boolean[P7.size()];
                                            Arrays.fill(zArr, true);
                                            z12 = z27;
                                            charSequence9 = charSequence15;
                                            PhotoViewer.v1().N2(null, unVar2, unVar2.xa);
                                            PhotoViewer v12 = PhotoViewer.v1();
                                            ArrayList arrayList20 = new ArrayList(P7);
                                            int size4 = P7.size() - 1;
                                            tl tlVar = new tl(unVar2, P7, zArr);
                                            i12 = i22;
                                            un unVar6 = unVar2;
                                            j10 = j14;
                                            v12.j2(arrayList20, size4, 0, false, tlVar, unVar6);
                                            unVar3 = unVar6;
                                            charSequence10 = null;
                                        } else {
                                            z12 = z27;
                                            charSequence9 = charSequence15;
                                            i12 = i22;
                                            unVar3 = unVar2;
                                            j10 = j14;
                                            charSequence10 = null;
                                            unVar3.u8(charSequence20, null);
                                            unVar3.wb(0, P7, false, false);
                                            unVar3.F6();
                                        }
                                        z18 = true;
                                    }
                                    if (z18) {
                                        launchActivity4.T = charSequence10;
                                    }
                                    charSequence15 = charSequence9;
                                    j11 = j13;
                                    cVar = a2;
                                    z16 = false;
                                    z17 = z18;
                                    z22 = z29;
                                }
                            } else {
                                unVar2.Ea(launchActivity4.T, str3);
                                launchActivity4.T = null;
                                z12 = z27;
                                j11 = j13;
                                i12 = i22;
                                z16 = true;
                                z17 = false;
                                unVar3 = unVar2;
                                cVar = a2;
                                j10 = j14;
                            }
                            z13 = z22;
                            z15 = z16;
                            z14 = z17;
                        } else {
                            unVar3 = unVar2;
                            j10 = j14;
                            CharSequence charSequence21 = charSequence15;
                            j11 = j13;
                            cVar = a2;
                            i12 = i22;
                            if (launchActivity4.R != null) {
                                CharSequence charSequence22 = launchActivity4.T;
                                if (charSequence22 == null || charSequence22.length() > 1024) {
                                    charSequence3 = charSequence21;
                                } else {
                                    CharSequence charSequence23 = launchActivity4.T;
                                    launchActivity4.T = null;
                                    charSequence3 = charSequence23;
                                }
                                ArrayList arrayList21 = new ArrayList();
                                arrayList21.add(launchActivity4.R);
                                org.telegram.messenger.qz.W(cVar, arrayList21, arrayList21, null, charSequence3, null, j11, jjVar, jjVar, z21, i16);
                                charSequence15 = charSequence3;
                            } else {
                                charSequence15 = charSequence21;
                            }
                            if (launchActivity4.U != null) {
                                CharSequence charSequence24 = launchActivity4.T;
                                if (charSequence24 != null && charSequence24.length() <= 1024 && launchActivity4.U.size() == 1) {
                                    CharSequence[] charSequenceArr3 = {launchActivity4.T};
                                    ((org.telegram.messenger.pz) launchActivity4.U.get(0)).i = org.telegram.messenger.ui.b0(launchActivity4.O).W(charSequenceArr3, false, true);
                                    ((org.telegram.messenger.pz) launchActivity4.U.get(0)).d = charSequenceArr3[0].toString();
                                    launchActivity4.T = null;
                                }
                                ArrayList arrayList22 = launchActivity4.U;
                                int i24 = i16;
                                org.telegram.messenger.jj jjVar4 = jjVar;
                                boolean z30 = z22;
                                org.telegram.messenger.qz.X(cVar, arrayList22, j11, jjVar4, jjVar, null, null, z30, arrayList22.size() > 1, null, null, z21, i24, i11, false, null, null, 0L, false, 0L, 0L, null, null, false);
                                j11 = j11;
                                z13 = z30;
                                i16 = i24;
                                jjVar = jjVar4;
                            } else {
                                z13 = z22;
                            }
                            z14 = false;
                            z15 = false;
                        }
                        boolean z31 = z12;
                        if (launchActivity4.V == null || launchActivity4.W != null) {
                            charSequence4 = launchActivity4.T;
                            if (charSequence4 != null && charSequence4.length() <= 1024) {
                                ArrayList arrayList23 = launchActivity4.V;
                                size = arrayList23 == null ? arrayList23.size() : 0;
                                arrayList2 = launchActivity4.W;
                                if (size + (arrayList2 == null ? arrayList2.size() : 0) == 1) {
                                    charSequence15 = launchActivity4.T;
                                    launchActivity4.T = null;
                                }
                            }
                            CharSequence charSequence25 = charSequence15;
                            org.telegram.messenger.qz.W(cVar, launchActivity4.V, launchActivity4.Z, launchActivity4.W, charSequence25, launchActivity4.Y, j11, jjVar, jjVar, z21, i16);
                            charSequence5 = charSequence25;
                        } else {
                            charSequence5 = charSequence15;
                        }
                        org.telegram.messenger.c cVar2 = cVar;
                        if (launchActivity4.S != null) {
                            File file = new File(launchActivity4.S);
                            if (file.exists()) {
                                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                                tL_document.file_reference = new byte[0];
                                tL_document.dc_id = TLObject.FLAG_31;
                                tL_document.id = org.telegram.messenger.tz.p();
                                tL_document.user_id = org.telegram.messenger.d20.i(i12).e();
                                tL_document.mime_type = "audio/ogg";
                                tL_document.date = ConnectionsManager.getInstance(i12).getCurrentTime();
                                tL_document.size = (int) file.length();
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.voice = true;
                                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                                tL_documentAttributeAudio.waveform = waveform;
                                if (waveform != null) {
                                    tL_documentAttributeAudio.flags |= 4;
                                }
                                tL_document.attributes.add(tL_documentAttributeAudio);
                                i13 = 0;
                                CharSequence[] charSequenceArr4 = {launchActivity4.T};
                                ArrayList W2 = org.telegram.messenger.ui.b0(launchActivity4.O).W(charSequenceArr4, false, true);
                                org.telegram.messenger.qz C = org.telegram.messenger.qz.C(i12);
                                String absolutePath = file.getAbsolutePath();
                                CharSequence charSequence26 = charSequenceArr4[0];
                                long j15 = j11;
                                org.telegram.messenger.jj jjVar5 = jjVar;
                                int i25 = i16;
                                org.telegram.messenger.oz f10 = org.telegram.messenger.oz.f(tL_document, null, absolutePath, j15, jjVar5, jjVar, charSequence26 == null ? null : charSequence26.toString(), W2, null, null, z21, i25, i11, 0, null, null, false);
                                j11 = j15;
                                jjVar = jjVar5;
                                i16 = i25;
                                C.r0(f10);
                                if (launchActivity4.T != null) {
                                    launchActivity4.T = null;
                                }
                                long j16 = j10;
                                charSequence6 = launchActivity4.T;
                                launchActivity = launchActivity4;
                                if (charSequence6 != null) {
                                    i14 = i13;
                                    C0(cVar2, ayVar2, charSequence6, j11, jjVar, j16, z21, i16, i11);
                                } else {
                                    i14 = i13;
                                }
                                arrayList3 = launchActivity.a0;
                                if (arrayList3 != null && !arrayList3.isEmpty()) {
                                    i15 = i14;
                                    while (i15 < launchActivity.a0.size()) {
                                        TLRPC.User user = (TLRPC.User) launchActivity.a0.get(i15);
                                        org.telegram.messenger.qz C2 = org.telegram.messenger.qz.C(currentAccount);
                                        long j17 = j11;
                                        org.telegram.messenger.jj jjVar6 = jjVar;
                                        org.telegram.messenger.oz g11 = org.telegram.messenger.oz.g(user, j17, jjVar6, jjVar, null, null, z21, i16, i11);
                                        j11 = j17;
                                        jjVar = jjVar6;
                                        C2.r0(g11);
                                        i15++;
                                        launchActivity = this;
                                    }
                                }
                                if (!TextUtils.isEmpty(charSequence2) || z15 || z14) {
                                    launchActivity2 = this;
                                    charSequence7 = charSequence2;
                                } else {
                                    launchActivity2 = this;
                                    charSequence7 = charSequence2;
                                    C0(cVar2, ayVar, charSequence7, j11, jjVar, j16, z21, i16, i11);
                                }
                                i21++;
                                ayVar2 = ayVar;
                                arrayList5 = arrayList;
                                charSequence2 = charSequence7;
                                unVar2 = unVar3;
                                launchActivity4 = launchActivity2;
                                z22 = z13;
                                z26 = z31;
                                charSequence15 = charSequence5;
                            }
                        }
                        i13 = 0;
                        long j162 = j10;
                        charSequence6 = launchActivity4.T;
                        launchActivity = launchActivity4;
                        if (charSequence6 != null) {
                        }
                        arrayList3 = launchActivity.a0;
                        if (arrayList3 != null) {
                            i15 = i14;
                            while (i15 < launchActivity.a0.size()) {
                            }
                        }
                        if (TextUtils.isEmpty(charSequence2)) {
                        }
                        launchActivity2 = this;
                        charSequence7 = charSequence2;
                        i21++;
                        ayVar2 = ayVar;
                        arrayList5 = arrayList;
                        charSequence2 = charSequence7;
                        unVar2 = unVar3;
                        launchActivity4 = launchActivity2;
                        z22 = z13;
                        z26 = z31;
                        charSequence15 = charSequence5;
                    }
                } else {
                    z12 = z26;
                }
                jjVar = null;
                if (unVar2 == null) {
                }
                boolean z312 = z12;
                if (launchActivity4.V == null) {
                }
                charSequence4 = launchActivity4.T;
                if (charSequence4 != null) {
                    ArrayList arrayList232 = launchActivity4.V;
                    if (arrayList232 == null) {
                    }
                    arrayList2 = launchActivity4.W;
                    if (size + (arrayList2 == null ? arrayList2.size() : 0) == 1) {
                    }
                }
                CharSequence charSequence252 = charSequence15;
                org.telegram.messenger.qz.W(cVar, launchActivity4.V, launchActivity4.Z, launchActivity4.W, charSequence252, launchActivity4.Y, j11, jjVar, jjVar, z21, i16);
                charSequence5 = charSequence252;
                org.telegram.messenger.c cVar22 = cVar;
                if (launchActivity4.S != null) {
                }
                i13 = 0;
                long j1622 = j10;
                charSequence6 = launchActivity4.T;
                launchActivity = launchActivity4;
                if (charSequence6 != null) {
                }
                arrayList3 = launchActivity.a0;
                if (arrayList3 != null) {
                }
                if (TextUtils.isEmpty(charSequence2)) {
                }
                launchActivity2 = this;
                charSequence7 = charSequence2;
                i21++;
                ayVar2 = ayVar;
                arrayList5 = arrayList;
                charSequence2 = charSequence7;
                unVar2 = unVar3;
                launchActivity4 = launchActivity2;
                z22 = z13;
                z26 = z312;
                charSequence15 = charSequence5;
            }
            z19 = z26;
            launchActivity3 = launchActivity4;
            un unVar52 = unVar2;
            if (ayVar != null) {
                ayVar.finishFragment();
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

    public final void y0(boolean z10) {
        ActionBarLayout actionBarLayout = this.r0;
        if (actionBarLayout != null) {
            actionBarLayout.W(z10, z10);
        } else {
            this.q0.W(z10, z10);
        }
    }

    public final void z(boolean z10) {
        org.telegram.messenger.k1 e;
        String str;
        int i10;
        org.telegram.messenger.w0.u();
        org.telegram.messenger.w0.n();
        if (!z10) {
            boolean z11 = org.telegram.messenger.v2.a;
        }
        if (!org.telegram.messenger.w0.a.q()) {
            if (z10 || Math.abs(System.currentTimeMillis() - org.telegram.messenger.tz.l1) >= org.telegram.messenger.vp.r1(0).o3 * 1000) {
                TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                try {
                    tL_help_getAppUpdate.source = org.telegram.messenger.w0.b.getPackageManager().getInstallerPackageName(org.telegram.messenger.w0.b.getPackageName());
                } catch (Exception unused) {
                }
                if (tL_help_getAppUpdate.source == null) {
                    tL_help_getAppUpdate.source = "";
                }
                int i11 = this.O;
                ConnectionsManager.getInstance(i11).sendRequest(tL_help_getAppUpdate, new org.telegram.messenger.voip.g0(this, i11, 2));
                return;
            }
            return;
        }
        org.telegram.messenger.g1 g1Var = null;
        if (((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q() && (str = (e = org.telegram.messenger.k1.e()).a) != null && (i10 = e.b) != 0) {
            g1Var = new org.telegram.messenger.g1(str, i10, e.c);
        }
        boolean z12 = this.p1;
        this.p1 = false;
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.a;
        ag.j0 j0Var = new ag.j0(this, z12, g1Var, 29);
        if (((ApplicationLoaderImpl) w0Var).q()) {
            org.telegram.messenger.k1.e().a(j0Var, z10);
        }
    }

    public final int z0(final int i10, final f70 f70Var, final Integer num, final Integer num2, final Long l4, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i11, final int i12) {
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.vp.k1(chat);
        tL_messages_getDiscussionMessage.msg_id = num2 != null ? num.intValue() : (int) l4.longValue();
        return ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() { // from class: org.telegram.ui.n70
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.D1;
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
                final Runnable runnable3 = f70Var;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.j80
                    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(5:3|(1:5)|6|7|(5:14|(3:16|(1:18)|19)(3:34|(1:(1:37)(1:(1:40)(1:41)))(1:(1:(1:44)(1:(1:46)(1:47))))|38)|20|(2:32|33)|(2:23|30)(1:31)))|48|49|(1:51)|20|(0)|(0)(0)|(1:(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
                    
                        org.telegram.messenger.f8.g(r0, true);
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
                        ArrayList arrayList = launchActivity2.d0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.TL_messages_discussionMessage;
                        Runnable runnable5 = runnable2;
                        if (z10) {
                            TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            int i16 = i13;
                            org.telegram.messenger.vp.r1(i16).V3(tL_messages_discussionMessage.users, false);
                            org.telegram.messenger.vp.r1(i16).P3(tL_messages_discussionMessage.chats, false);
                            ArrayList arrayList2 = new ArrayList();
                            int size = tL_messages_discussionMessage.messages.size();
                            for (int i17 = 0; i17 < size; i17++) {
                                arrayList2.add(new org.telegram.messenger.jj(org.telegram.messenger.d20.s0, tL_messages_discussionMessage.messages.get(i17), true, true));
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
                                    bundle.putLong("chat_id", -org.telegram.messenger.jj.B0(((org.telegram.messenger.jj) arrayList2.get(0)).k));
                                    bundle.putInt("message_id", Math.max(1, num8.intValue()));
                                    un unVar = new un(bundle);
                                    unVar.Hb(arrayList2, chat3, tL_messages_getDiscussionMessage2.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
                                    if (num7 != null) {
                                        if (bArr3 != null) {
                                            unVar.h8 = bArr3;
                                            unVar.b8 = num7.intValue();
                                        } else if (str3 != null) {
                                            unVar.Eb(num7.intValue(), i18, str3);
                                        } else {
                                            unVar.g8 = num9;
                                            unVar.b8 = num7.intValue();
                                        }
                                    } else if (l11 != null) {
                                        if (bArr3 != null) {
                                            unVar.h8 = bArr3;
                                            unVar.b8 = num8.intValue();
                                        } else if (str3 != null) {
                                            unVar.Eb(num8.intValue(), i18, str3);
                                        } else {
                                            unVar.g8 = num9;
                                            unVar.b8 = num8.intValue();
                                        }
                                    }
                                    launchActivity2.t0(unVar);
                                }
                                runnable4 = runnable3;
                                if (runnable4 != null) {
                                    try {
                                        runnable4.run();
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
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
                            org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) arrayList.get(arrayList.size() - 1)).t(org.telegram.messenger.cd.L0(2131752330, null), null).j();
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

    @Override // org.telegram.ui.ActionBar.v4
    public final /* synthetic */ void e(int[] iArr) {
    }
}
