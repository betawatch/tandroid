package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class jd1 extends org.telegram.ui.ActionBar.p2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public hc1 A0;
    public boolean A1;
    public final int B;
    public hc1 B0;
    public boolean B1;
    public final int C;
    public ImageView C0;
    public boolean C1;
    public final int D;
    public ImageView D0;
    public String D1;
    public final boolean E;
    public AnimatorSet E0;
    public int E1;
    public final long F;
    public AnimatorSet F0;
    public id1 F1;
    public final long G;
    public org.telegram.ui.Components.m81[] G0;
    public long G1;
    public final long H;
    public org.telegram.ui.Components.m81[] H0;
    public boolean H1;
    public final long I;
    public final FrameLayout[] I0;
    public boolean I1;
    public final float J;
    public final TextView[] J0;
    public boolean J1;
    public final String K;
    public final TextView[] K0;
    public org.telegram.ui.Components.gj0 K1;
    public final int L;
    public final FrameLayout[] L0;
    public org.telegram.ui.ActionBar.w0 L1;
    public long M;
    public rb1 M0;
    public ValueAnimator M1;
    public z90 N;
    public hd1 N0;
    public dg.s1 N1;
    public final org.telegram.ui.ActionBar.q5 O;
    public f2.i0 O0;
    public gc1 O1;
    public final org.telegram.ui.ActionBar.q5 P;
    public org.telegram.ui.Cells.l4 P0;
    public final org.telegram.ui.Components.l20 P1;
    public final org.telegram.ui.ActionBar.q5 Q;
    public org.telegram.ui.Cells.j0 Q0;
    public boolean Q1;
    public final org.telegram.ui.ActionBar.q5 R;
    public ArrayList R0;
    public boolean R1;
    public org.telegram.ui.Components.jq S;
    public final HashMap S0;
    public TL_stories.TL_premium_boostsStatus S1;
    public int T;
    public TLRPC.TL_wallPaper T0;
    public float T1;
    public int U;
    public TLRPC.TL_wallPaper U0;
    public float U1;
    public final Runnable V;
    public TLRPC.TL_wallPaper V0;
    public float V1;
    public boolean W;
    public int W0;
    public float W1;
    public eg.i0 X;
    public int X0;
    public boolean X1;
    public FrameLayout Y;
    public int Y0;
    public int Y1;
    public TextView Z;
    public int Z0;
    public ValueAnimator Z1;
    public final jc1 a;
    public TextView a0;
    public int a1;
    public boolean a2;
    public final int b;
    public final org.telegram.ui.ActionBar.i6 b0;
    public int b1;
    public TextView b2;
    public Scroller c;
    public final boolean c0;
    public int c1;
    public WeakReference c2;
    public final boolean d;
    public final boolean d0;
    public int d1;
    public BitmapDrawable d2;
    public org.telegram.ui.Components.ul e;
    public final boolean e0;
    public int e1;
    public mc e2;
    public org.telegram.ui.ActionBar.w0 f;
    public ArrayList f0;
    public int f1;
    public float f2;
    public m2.h g0;
    public int g1;
    public ValueAnimator g2;
    public TextView h;
    public ah.e h0;
    public int h1;
    public UndoView i0;
    public float i1;
    public FrameLayout j0;
    public float j1;
    public org.telegram.ui.Components.rl0 k0;
    public float k1;
    public bd1 l0;
    public float l1;
    public org.telegram.ui.Components.a20 m0;
    public ad1 m1;
    public int n;
    public MessageObject n0;
    public org.telegram.ui.Components.lq n1;
    public boolean o0;
    public AnimatorSet o1;
    public org.telegram.ui.ActionBar.k p0;
    public final PorterDuff.Mode p1;
    public org.telegram.ui.ActionBar.r0 q0;
    public int q1;
    public Drawable r;
    public ec1 r0;
    public org.telegram.ui.Components.j9 r1;
    public final org.telegram.ui.ActionBar.h6 s;
    public fd1 s0;
    public org.telegram.ui.Components.o81 s1;
    public final yc1[] t0;
    public Bitmap t1;
    public yc1 u0;
    public Bitmap u1;
    public boolean v;
    public FrameLayout v0;
    public float v1;
    public final int w;
    public FrameLayout w0;
    public zc1 w1;
    public final int x;
    public org.telegram.ui.Components.l40 x0;
    public zc1 x1;
    public final int y;
    public AnimatorSet y0;
    public Object y1;
    public y4 z0;
    public Bitmap z1;

    public jd1(Object obj, Bitmap bitmap, boolean z4) {
        super(null);
        this.a = new jc1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.O = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.P = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.Q = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.R = q5Var4;
        this.U = -1;
        this.V = new wb1(this, 0);
        this.t0 = new yc1[2];
        this.I0 = new FrameLayout[2];
        this.J0 = new TextView[2];
        this.K0 = new TextView[2];
        this.L0 = new FrameLayout[2];
        this.S0 = new HashMap();
        this.i1 = 0.5f;
        this.k1 = 0.0f;
        this.p1 = PorterDuff.Mode.SRC_IN;
        this.v1 = 1.0f;
        this.D1 = "640_360";
        this.E1 = 1920;
        this.H1 = true;
        this.P1 = new org.telegram.ui.Components.l20(getParentActivity(), new lc1(this));
        this.Q1 = false;
        this.R1 = false;
        this.b = 2;
        this.y1 = obj;
        this.z1 = bitmap;
        this.A1 = z4;
        if (obj instanceof ui1) {
            ui1 ui1Var = (ui1) obj;
            this.B1 = ui1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = ui1Var.g;
            this.T0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = ui1Var.h;
                this.i1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.j6.I.q()) {
                    this.i1 *= -1.0f;
                }
            }
        }
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    public static void U(jd1 jd1Var) {
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.M;
        if (i6Var == null) {
            return;
        }
        int i10 = i6Var.W;
        org.telegram.ui.ActionBar.h6 k10 = i10 >= 0 ? (org.telegram.ui.ActionBar.h6) i6Var.X.get(i10) : i6Var.k(false);
        if (jd1Var.s != null) {
            jd1Var.W0();
            org.telegram.ui.ActionBar.j6.t1(jd1Var.b0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.j6.M != null) {
                org.telegram.ui.ActionBar.j6.O = false;
                org.telegram.ui.ActionBar.j6.P = false;
                org.telegram.ui.ActionBar.j6.M = null;
            }
            org.telegram.ui.ActionBar.j6.t(jd1Var.b0, true, jd1Var.c0);
            ((ActionBarLayout) jd1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) jd1Var.parentLayout).U(false, false);
            File file = new File(jd1Var.b0.b);
            org.telegram.ui.ActionBar.i6 i6Var2 = jd1Var.b0;
            org.telegram.ui.ActionBar.j6.u(file, i6Var2.a, i6Var2.C, false);
            MessagesController.getInstance(jd1Var.b0.B).saveTheme(jd1Var.b0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", jd1Var.b0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) jd1Var.getParentLayout().getFragmentStack().get(Math.max(0, jd1Var.getParentLayout().getFragmentStack().size() - 2));
        jd1Var.finishFragment();
        if (jd1Var.b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, i6Var, k10, Boolean.valueOf(jd1Var.e0));
        }
        org.telegram.ui.ActionBar.j6.F1(p2Var);
    }

    public static /* synthetic */ void V(jd1 jd1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = jd1Var.S0;
        org.telegram.ui.ActionBar.h6 h6Var = jd1Var.s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            jd1Var.R0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z4 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            jd1Var.R0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (h6Var != null && (str = h6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            jd1Var.T0 = tL_wallPaper2;
                            jd1Var.b1(false);
                            jd1Var.j1();
                        } else if (h6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = jd1Var.T0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z4 = true;
                    }
                }
            }
            if (!z4 && (tL_wallPaper = jd1Var.T0) != null) {
                jd1Var.R0.add(0, tL_wallPaper);
            }
            hd1 hd1Var = jd1Var.N0;
            if (hd1Var != null) {
                hd1Var.l();
            }
            MessagesStorage.getInstance(jd1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (jd1Var.T0 != null || h6Var == null || TextUtils.isEmpty(h6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = h6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(jd1Var.currentAccount).bindRequestToGuid(jd1Var.getConnectionsManager().sendRequest(getwallpaper, new cc1(jd1Var, 0)), jd1Var.classGuid);
    }

    public static /* synthetic */ void W(jd1 jd1Var) {
        org.telegram.ui.Components.ul ulVar = jd1Var.e;
        int i10 = 0;
        if (ulVar != null) {
            ulVar.B(jd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            jd1Var.e.G(jd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
        }
        Drawable drawable = jd1Var.r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(jd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6), PorterDuff.Mode.MULTIPLY));
        }
        y4 y4Var = jd1Var.z0;
        if (y4Var != null) {
            y4Var.invalidate();
        }
        if (jd1Var.m1 != null) {
            org.telegram.ui.ActionBar.e5 e5Var = jd1Var.parentLayout;
            if (e5Var == null || e5Var.getBottomSheet() == null) {
                jd1Var.setNavigationBarColor(jd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            } else {
                jd1Var.parentLayout.getBottomSheet().fixNavigationBar(jd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                if (jd1Var.b == 2 && jd1Var.G1 != 0) {
                    jd1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
        }
        if (jd1Var.G0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr = jd1Var.G0;
                if (i11 >= m81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m81 m81Var = m81VarArr[i11];
                if (m81Var != null) {
                    m81Var.invalidate();
                }
                i11++;
            }
        }
        if (jd1Var.H0 != null) {
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr2 = jd1Var.H0;
                if (i10 >= m81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.m81 m81Var2 = m81VarArr2[i10];
                if (m81Var2 != null) {
                    m81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = jd1Var.b2;
        if (textView != null) {
            textView.setTextColor(jd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        }
        org.telegram.ui.Components.jq jqVar = jd1Var.S;
        if (jqVar != null) {
            jqVar.invalidate();
        }
        org.telegram.ui.Components.a20 a20Var = jd1Var.m0;
        if (a20Var != null) {
            a20Var.g();
        }
    }

    public static void X(jd1 jd1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (jd1Var.getParentActivity() == null) {
            return;
        }
        eg.v0 v0Var = new eg.v0(23, jd1Var.currentAccount, jd1Var.getParentActivity(), jd1Var, jd1Var.a);
        v0Var.G1(canApplyBoost);
        v0Var.F1(jd1Var.S1, true);
        v0Var.H1(jd1Var.G1);
        if (!jd1Var.U0()) {
            v0Var.N0 = new wb1(jd1Var, 1);
        }
        jd1Var.showDialog(v0Var);
    }

    public final void M0() {
        AnimatorSet animatorSet = this.y0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y0 = animatorSet2;
        int i10 = 1;
        if (this.B1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.u0, (Property<yc1, Float>) View.SCALE_X, this.v1), ObjectAnimator.ofFloat(this.u0, (Property<yc1, Float>) View.SCALE_Y, this.v1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.u0, (Property<yc1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.u0, (Property<yc1, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.u0, (Property<yc1, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.u0, (Property<yc1, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.y0.setInterpolator(org.telegram.ui.Components.mr.g);
        this.y0.addListener(new nc1(this, i10));
        this.y0.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03fe  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(boolean z4) {
        Object obj;
        boolean z10;
        Object obj2;
        boolean z11;
        File file;
        ?? r11;
        Object obj3;
        boolean z12;
        boolean z13;
        String str;
        int i10;
        TLRPC.TL_wallPaper tL_wallPaper;
        int i11;
        int i12;
        int i13;
        int i14;
        File pathToAttach;
        File file2;
        int i15;
        int i16;
        Object obj4;
        long j10;
        TLRPC.TL_wallPaper tL_wallPaper2;
        boolean z14;
        float f10;
        TLRPC.UserFull userFull;
        int i17 = 1;
        if (this.G1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.S1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                getMessagesController().getBoostsController().userCanBoostChannel(this.G1, this.S1, new bc1(this, i17));
                return;
            } else if (this.S1 == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z4) {
            showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
        String j11 = i6Var.j(null, this.C1);
        int i18 = 0;
        String j12 = this.C1 ? i6Var.j(null, false) : j11;
        File file3 = new File(ApplicationLoader.getFilesDirFixed(), j11);
        Object obj5 = this.y1;
        if (obj5 instanceof TLRPC.TL_wallPaper) {
            if (this.u1 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        this.u1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                        z10 = false;
                        if (!z10) {
                        }
                        obj = null;
                        z11 = false;
                        r11 = obj;
                        if (this.C1) {
                        }
                        obj3 = this.y1;
                        int i19 = 45;
                        if (obj3 instanceof TLRPC.TL_wallPaper) {
                        }
                        i11 = 45;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        org.telegram.ui.ActionBar.c6 c6Var = new org.telegram.ui.ActionBar.c6();
                        c6Var.a = j12;
                        c6Var.b = j11;
                        c6Var.c = str;
                        c6Var.i = this.C1;
                        c6Var.j = this.B1;
                        c6Var.d = i12;
                        c6Var.e = i14;
                        c6Var.f = i13;
                        c6Var.g = i10;
                        c6Var.h = i11;
                        if (this.J1) {
                        }
                        c6Var.k = this.i1;
                        obj4 = this.y1;
                        if (obj4 instanceof ui1) {
                        }
                        j10 = this.G1;
                        c6Var.n = j10;
                        if (j10 != 0) {
                        }
                        c6Var.o = z4;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, c6Var, str == null && this.G1 == 0, 0L);
                        if (z12) {
                        }
                        tL_wallPaper2 = tL_wallPaper;
                        z14 = true;
                        if (z14) {
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } else {
                ImageReceiver imageReceiver = this.u0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    Bitmap bitmap = imageReceiver.getBitmap();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                z10 = false;
                if (!z10) {
                    try {
                        z10 = AndroidUtilities.copyFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(((TLRPC.TL_wallPaper) this.y1).document, true), file3);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        z10 = false;
                    }
                }
                obj = null;
            }
            z10 = true;
            if (!z10) {
            }
            obj = null;
        } else {
            boolean z15 = obj5 instanceof ui1;
            if (z15) {
                if (this.T0 != null) {
                    try {
                        Bitmap bitmap2 = this.u0.getImageReceiver().getBitmap();
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        if (this.Z0 == 0) {
                            if (this.Y0 != 0) {
                                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.o9.d(this.e1), new int[]{this.W0, this.Y0});
                                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                                gradientDrawable.draw(canvas);
                            } else {
                                canvas.drawColor(this.W0);
                            }
                        }
                        Paint paint = new Paint(2);
                        paint.setColorFilter(new PorterDuffColorFilter(this.g1, this.p1));
                        paint.setAlpha((int) (Math.abs(this.i1) * 255.0f));
                        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                        if (this.Z0 != 0) {
                            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                        } else {
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                        }
                        fileOutputStream3.close();
                        z10 = true;
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        z10 = false;
                    }
                    z11 = false;
                    r11 = 0;
                    if (this.C1) {
                        try {
                            FileOutputStream fileOutputStream4 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), j12));
                            this.t1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                            fileOutputStream4.close();
                            z10 = true;
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                            z10 = false;
                        }
                    }
                    obj3 = this.y1;
                    int i192 = 45;
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        if (obj3 instanceof ui1) {
                            if ("d".equals(((ui1) obj3).a)) {
                                str = "d";
                                i15 = 0;
                                i16 = 0;
                                i14 = 0;
                            } else {
                                TLRPC.TL_wallPaper tL_wallPaper3 = this.T0;
                                String str2 = tL_wallPaper3 != null ? tL_wallPaper3.slug : "c";
                                int i20 = this.W0;
                                i14 = this.Y0;
                                i15 = this.Z0;
                                i16 = this.a1;
                                i192 = this.e1;
                                i18 = i20;
                                str = str2;
                            }
                            int i21 = i192;
                            z12 = z10;
                            i10 = i16;
                            i13 = i15;
                            i12 = i18;
                            i11 = i21;
                            z13 = z11;
                            tL_wallPaper = null;
                        } else {
                            if (obj3 instanceof vi1) {
                                vi1 vi1Var = (vi1) obj3;
                                str = vi1Var.a;
                                pathToAttach = vi1Var.d;
                            } else if (obj3 instanceof MediaController.SearchImage) {
                                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj3;
                                TLRPC.Photo photo = searchImage.photo;
                                pathToAttach = photo != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.E1, true), true) : ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                                str = "";
                            } else {
                                z12 = z10;
                                z13 = z11;
                                str = "d";
                                i10 = 0;
                                tL_wallPaper = null;
                                i11 = 45;
                                i12 = 0;
                                i13 = 0;
                                i14 = 0;
                            }
                            z12 = z10;
                            z13 = z11;
                            file2 = pathToAttach;
                            i10 = 0;
                            tL_wallPaper = null;
                        }
                        file2 = null;
                        org.telegram.ui.ActionBar.c6 c6Var2 = new org.telegram.ui.ActionBar.c6();
                        c6Var2.a = j12;
                        c6Var2.b = j11;
                        c6Var2.c = str;
                        c6Var2.i = this.C1;
                        c6Var2.j = this.B1;
                        c6Var2.d = i12;
                        c6Var2.e = i14;
                        c6Var2.f = i13;
                        c6Var2.g = i10;
                        c6Var2.h = i11;
                        if (this.J1) {
                            float f11 = this.k1;
                            if (f11 >= 0.0f) {
                                c6Var2.k = f11;
                                obj4 = this.y1;
                                if (obj4 instanceof ui1) {
                                    ui1 ui1Var = (ui1) obj4;
                                    String str3 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                                    float f12 = ui1Var.h;
                                    if (f12 < 0.0f && !org.telegram.ui.ActionBar.j6.I.q()) {
                                        f12 *= -1.0f;
                                    }
                                    if (ui1Var.l != null && ui1Var.b == i12 && ui1Var.c == i14 && ui1Var.d == i13 && ui1Var.e == i10 && TextUtils.equals(ui1Var.a, str3) && ui1Var.f == i11 && (this.T0 == null || Math.abs(f12 - this.i1) < 0.001f)) {
                                        TLRPC.WallPaper wallPaper = ui1Var.l;
                                        c6Var2.l = wallPaper.id;
                                        c6Var2.m = wallPaper.access_hash;
                                    }
                                }
                                j10 = this.G1;
                                c6Var2.n = j10;
                                if (j10 != 0 && (userFull = getMessagesController().getUserFull(this.G1)) != null) {
                                    c6Var2.t = userFull.wallpaper;
                                }
                                c6Var2.o = z4;
                                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, c6Var2, str == null && this.G1 == 0, 0L);
                                if (z12) {
                                    if (this.G1 != 0) {
                                        if (file2 == null || getMessagesController().uploadingWallpaperInfo != c6Var2) {
                                            ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.G1, null, c6Var2, this.n0, new cg.n0(21));
                                        } else {
                                            tL_wallPaper = new TLRPC.TL_wallPaper();
                                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                            tL_wallPaper.settings = tL_wallPaperSettings;
                                            tL_wallPaperSettings.intensity = (int) (c6Var2.k * 100.0f);
                                            tL_wallPaperSettings.blur = c6Var2.i;
                                            tL_wallPaperSettings.motion = c6Var2.j;
                                            tL_wallPaper.uploadingImage = file2.getAbsolutePath();
                                            Bitmap createBitmap2 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                            Canvas canvas2 = new Canvas(createBitmap2);
                                            float max = Math.max(50.0f / this.u0.getMeasuredWidth(), 50.0f / this.u0.getMeasuredHeight());
                                            canvas2.scale(max, max);
                                            if (this.u0.getMeasuredHeight() > this.u0.getMeasuredWidth()) {
                                                f10 = 0.0f;
                                                canvas2.translate(0.0f, (-(this.u0.getMeasuredHeight() - this.u0.getMeasuredWidth())) / 2.0f);
                                            } else {
                                                f10 = 0.0f;
                                                canvas2.translate((-(this.u0.getMeasuredWidth() - this.u0.getMeasuredHeight())) / 2.0f, 0.0f);
                                            }
                                            float f13 = this.k1;
                                            this.k1 = f10;
                                            this.u0.draw(canvas2);
                                            this.k1 = f13;
                                            Utilities.blurBitmap(createBitmap2, 3);
                                            tL_wallPaper.stripedThumb = createBitmap2;
                                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                            tL_messageService.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
                                            tL_messageService.dialog_id = this.G1;
                                            tL_messageService.unread = true;
                                            tL_messageService.out = true;
                                            int newMessageId = getUserConfig().getNewMessageId();
                                            tL_messageService.id = newMessageId;
                                            tL_messageService.local_id = newMessageId;
                                            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.G1));
                                            if (ChatObject.isChannel(chat)) {
                                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                                tL_messageService.from_id = tL_peerChannel;
                                                tL_peerChannel.channel_id = chat.id;
                                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                                tL_messageService.peer_id = tL_peerChannel2;
                                                tL_peerChannel2.channel_id = chat.id;
                                            } else {
                                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                tL_messageService.from_id = tL_peerUser;
                                                tL_peerUser.user_id = getUserConfig().getClientUserId();
                                                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                tL_messageService.peer_id = tL_peerUser2;
                                                tL_peerUser2.user_id = this.G1;
                                            }
                                            tL_messageService.flags |= 256;
                                            tL_messageService.date = getConnectionsManager().getCurrentTime();
                                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                                            tL_messageService.action = tL_messageActionSetChatWallPaper;
                                            tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper;
                                            tL_messageActionSetChatWallPaper.for_both = z4;
                                            ArrayList<MessageObject> arrayList = new ArrayList<>();
                                            arrayList.add(new MessageObject(this.currentAccount, tL_messageService, false, false));
                                            new ArrayList().add(tL_messageService);
                                            MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.G1, arrayList, 0);
                                            if (this.G1 >= 0) {
                                                TLRPC.UserFull userFull2 = getMessagesController().getUserFull(this.G1);
                                                if (userFull2 != null) {
                                                    userFull2.wallpaper = tL_wallPaper;
                                                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.G1), userFull2);
                                                }
                                            } else {
                                                TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.G1);
                                                if (chatFull != null) {
                                                    chatFull.wallpaper = tL_wallPaper;
                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                                                    int i22 = NotificationCenter.chatInfoDidLoad;
                                                    Boolean bool = Boolean.FALSE;
                                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, chatFull, 0, bool, bool);
                                                }
                                            }
                                        }
                                        this.a2 = true;
                                        id1 id1Var = this.F1;
                                        if (id1Var != null) {
                                            id1Var.a(tL_wallPaper);
                                        }
                                        finishFragment();
                                        tL_wallPaper2 = tL_wallPaper;
                                        z14 = false;
                                        if (z14) {
                                            id1 id1Var2 = this.F1;
                                            if (id1Var2 != null) {
                                                id1Var2.a(tL_wallPaper2);
                                            }
                                            finishFragment();
                                            return;
                                        }
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.j6.c0 = getThemedColor(org.telegram.ui.ActionBar.j6.lc);
                                    org.telegram.ui.ActionBar.j6.I.v("t".equals(c6Var2.c) ? null : c6Var2);
                                    org.telegram.ui.ActionBar.j6.o1(true);
                                    if (!z13) {
                                        ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                                    }
                                }
                                tL_wallPaper2 = tL_wallPaper;
                                z14 = true;
                                if (z14) {
                                }
                            }
                        }
                        c6Var2.k = this.i1;
                        obj4 = this.y1;
                        if (obj4 instanceof ui1) {
                        }
                        j10 = this.G1;
                        c6Var2.n = j10;
                        if (j10 != 0) {
                            c6Var2.t = userFull.wallpaper;
                        }
                        c6Var2.o = z4;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, c6Var2, str == null && this.G1 == 0, 0L);
                        if (z12) {
                        }
                        tL_wallPaper2 = tL_wallPaper;
                        z14 = true;
                        if (z14) {
                        }
                    } else {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        str = tL_wallPaper.slug;
                        z12 = z10;
                        z13 = z11;
                        file2 = r11;
                        i10 = 0;
                    }
                    i11 = 45;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    org.telegram.ui.ActionBar.c6 c6Var22 = new org.telegram.ui.ActionBar.c6();
                    c6Var22.a = j12;
                    c6Var22.b = j11;
                    c6Var22.c = str;
                    c6Var22.i = this.C1;
                    c6Var22.j = this.B1;
                    c6Var22.d = i12;
                    c6Var22.e = i14;
                    c6Var22.f = i13;
                    c6Var22.g = i10;
                    c6Var22.h = i11;
                    if (this.J1) {
                    }
                    c6Var22.k = this.i1;
                    obj4 = this.y1;
                    if (obj4 instanceof ui1) {
                    }
                    j10 = this.G1;
                    c6Var22.n = j10;
                    if (j10 != 0) {
                    }
                    c6Var22.o = z4;
                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, c6Var22, str == null && this.G1 == 0, 0L);
                    if (z12) {
                    }
                    tL_wallPaper2 = tL_wallPaper;
                    z14 = true;
                    if (z14) {
                    }
                } else {
                    obj2 = null;
                    z10 = true;
                    obj = obj2;
                }
            } else if (obj5 instanceof vi1) {
                vi1 vi1Var2 = (vi1) obj5;
                if (vi1Var2.b != 0 || "t".equals(vi1Var2.a)) {
                    obj2 = null;
                    z10 = true;
                    obj = obj2;
                } else {
                    try {
                    } catch (Exception e12) {
                        e = e12;
                        z15 = false;
                    }
                    try {
                        if (!this.X1 || this.U1 == this.V1) {
                            z15 = false;
                            z15 = false;
                            File file4 = vi1Var2.e;
                            file = file4 != null ? file4 : vi1Var2.d;
                        } else {
                            Bitmap createBitmap3 = Bitmap.createBitmap((int) this.W1, this.z1.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas3 = new Canvas(createBitmap3);
                            canvas3.translate(-((this.U1 / this.T1) * (this.z1.getWidth() - createBitmap3.getWidth())), 0.0f);
                            z15 = false;
                            canvas3.drawBitmap(this.z1, 0.0f, 0.0f, (Paint) null);
                            vi1Var2.d = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                            FileOutputStream fileOutputStream5 = new FileOutputStream(vi1Var2.d);
                            createBitmap3.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                            fileOutputStream5.close();
                            createBitmap3.recycle();
                            file = vi1Var2.d;
                        }
                        z11 = file.equals(file3);
                        if (z11) {
                            z10 = true;
                            r11 = z15;
                        } else {
                            try {
                                z10 = AndroidUtilities.copyFile(file, file3);
                                r11 = z15;
                            } catch (Exception e13) {
                                e = e13;
                                FileLog.e(e);
                                z10 = false;
                                r11 = z15;
                                if (this.C1) {
                                }
                                obj3 = this.y1;
                                int i1922 = 45;
                                if (obj3 instanceof TLRPC.TL_wallPaper) {
                                }
                                i11 = 45;
                                i12 = 0;
                                i13 = 0;
                                i14 = 0;
                                org.telegram.ui.ActionBar.c6 c6Var222 = new org.telegram.ui.ActionBar.c6();
                                c6Var222.a = j12;
                                c6Var222.b = j11;
                                c6Var222.c = str;
                                c6Var222.i = this.C1;
                                c6Var222.j = this.B1;
                                c6Var222.d = i12;
                                c6Var222.e = i14;
                                c6Var222.f = i13;
                                c6Var222.g = i10;
                                c6Var222.h = i11;
                                if (this.J1) {
                                }
                                c6Var222.k = this.i1;
                                obj4 = this.y1;
                                if (obj4 instanceof ui1) {
                                }
                                j10 = this.G1;
                                c6Var222.n = j10;
                                if (j10 != 0) {
                                }
                                c6Var222.o = z4;
                                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, c6Var222, str == null && this.G1 == 0, 0L);
                                if (z12) {
                                }
                                tL_wallPaper2 = tL_wallPaper;
                                z14 = true;
                                if (z14) {
                                }
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        z11 = false;
                        FileLog.e(e);
                        z10 = false;
                        r11 = z15;
                        if (this.C1) {
                        }
                        obj3 = this.y1;
                        int i19222 = 45;
                        if (obj3 instanceof TLRPC.TL_wallPaper) {
                        }
                        i11 = 45;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        org.telegram.ui.ActionBar.c6 c6Var2222 = new org.telegram.ui.ActionBar.c6();
                        c6Var2222.a = j12;
                        c6Var2222.b = j11;
                        c6Var2222.c = str;
                        c6Var2222.i = this.C1;
                        c6Var2222.j = this.B1;
                        c6Var2222.d = i12;
                        c6Var2222.e = i14;
                        c6Var2222.f = i13;
                        c6Var2222.g = i10;
                        c6Var2222.h = i11;
                        if (this.J1) {
                        }
                        c6Var2222.k = this.i1;
                        obj4 = this.y1;
                        if (obj4 instanceof ui1) {
                        }
                        j10 = this.G1;
                        c6Var2222.n = j10;
                        if (j10 != 0) {
                        }
                        c6Var2222.o = z4;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, c6Var2222, str == null && this.G1 == 0, 0L);
                        if (z12) {
                        }
                        tL_wallPaper2 = tL_wallPaper;
                        z14 = true;
                        if (z14) {
                        }
                    }
                    if (this.C1) {
                    }
                    obj3 = this.y1;
                    int i192222 = 45;
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                    }
                    i11 = 45;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    org.telegram.ui.ActionBar.c6 c6Var22222 = new org.telegram.ui.ActionBar.c6();
                    c6Var22222.a = j12;
                    c6Var22222.b = j11;
                    c6Var22222.c = str;
                    c6Var22222.i = this.C1;
                    c6Var22222.j = this.B1;
                    c6Var22222.d = i12;
                    c6Var22222.e = i14;
                    c6Var22222.f = i13;
                    c6Var22222.g = i10;
                    c6Var22222.h = i11;
                    if (this.J1) {
                    }
                    c6Var22222.k = this.i1;
                    obj4 = this.y1;
                    if (obj4 instanceof ui1) {
                    }
                    j10 = this.G1;
                    c6Var22222.n = j10;
                    if (j10 != 0) {
                    }
                    c6Var22222.o = z4;
                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, c6Var22222, str == null && this.G1 == 0, 0L);
                    if (z12) {
                    }
                    tL_wallPaper2 = tL_wallPaper;
                    z14 = true;
                    if (z14) {
                    }
                }
            } else {
                obj = null;
                obj = null;
                if (obj5 instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage2 = (MediaController.SearchImage) obj5;
                    TLRPC.Photo photo2 = searchImage2.photo;
                    try {
                        z10 = AndroidUtilities.copyFile(photo2 != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.E1, true), true) : ImageLoader.getHttpFilePath(searchImage2.imageUrl, "jpg"), file3);
                    } catch (Exception e15) {
                        FileLog.e(e15);
                    }
                }
                z10 = false;
            }
        }
        z11 = false;
        r11 = obj;
        if (this.C1) {
        }
        obj3 = this.y1;
        int i1922222 = 45;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
        }
        i11 = 45;
        i12 = 0;
        i13 = 0;
        i14 = 0;
        org.telegram.ui.ActionBar.c6 c6Var222222 = new org.telegram.ui.ActionBar.c6();
        c6Var222222.a = j12;
        c6Var222222.b = j11;
        c6Var222222.c = str;
        c6Var222222.i = this.C1;
        c6Var222222.j = this.B1;
        c6Var222222.d = i12;
        c6Var222222.e = i14;
        c6Var222222.f = i13;
        c6Var222222.g = i10;
        c6Var222222.h = i11;
        if (this.J1) {
        }
        c6Var222222.k = this.i1;
        obj4 = this.y1;
        if (obj4 instanceof ui1) {
        }
        j10 = this.G1;
        c6Var222222.n = j10;
        if (j10 != 0) {
        }
        c6Var222222.o = z4;
        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, c6Var222222, str == null && this.G1 == 0, 0L);
        if (z12) {
        }
        tL_wallPaper2 = tL_wallPaper;
        z14 = true;
        if (z14) {
        }
    }

    public final void O0(boolean z4) {
        int i10 = this.b;
        if (i10 == 2) {
            if (z4) {
                return;
            }
            finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.j6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (i10 == 1) {
            if (this.d0) {
                h6Var.c = this.w;
                h6Var.d = this.x;
                h6Var.e = this.y;
                h6Var.f = this.B;
                h6Var.g = this.C;
                h6Var.h = this.D;
                h6Var.i = this.E;
                h6Var.j = this.F;
                h6Var.k = this.G;
                h6Var.l = this.H;
                h6Var.m = this.I;
                h6Var.n = this.L;
                h6Var.o = this.K;
                h6Var.p = this.J;
            }
            org.telegram.ui.ActionBar.j6.t1(this.b0, false, true, false, false, false);
        } else {
            if (h6Var != null) {
                org.telegram.ui.ActionBar.j6.t1(this.b0, false, this.e0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.e0) {
                org.telegram.ui.ActionBar.i6 i6Var = this.b0;
                if (i6Var.b != null && org.telegram.ui.ActionBar.j6.H.get(i6Var.m()) == null) {
                    new File(i6Var.b).delete();
                }
            }
        }
        if (z4) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.c2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.d2;
        }
        WeakReference weakReference2 = this.c2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.c2 = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.d2 = null;
            return null;
        }
        this.c2 = new WeakReference(drawable);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, 24);
        ColorFilter colorFilter = drawable.getColorFilter();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.3f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        drawable.draw(new Canvas(createBitmap));
        drawable.setColorFilter(colorFilter);
        Utilities.blurBitmap(createBitmap, 3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
        this.d2 = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r0.q == r7.B1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.p == r7.i1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q0(boolean z4) {
        if (this.b == 1) {
            org.telegram.ui.ActionBar.h6 h6Var = this.s;
            if (h6Var.c == this.w && h6Var.d == this.x && h6Var.e == this.y && h6Var.f == this.B && h6Var.g == this.C && h6Var.h == this.D && h6Var.i == this.E && h6Var.j == this.F && h6Var.k == this.G && h6Var.l == this.H && h6Var.m == this.I && Math.abs(h6Var.p - this.J) <= 0.001f && h6Var.n == this.L) {
                String str = h6Var.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.T0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.T0;
                    if (tL_wallPaper2 != null) {
                    }
                    if (tL_wallPaper2 != null) {
                    }
                }
            }
            if (!z4) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.SaveChangesAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.SaveChangesAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new yb1(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new yb1(this, 4));
            showDialog(alertDialog$Builder.a);
            return false;
        }
        return true;
    }

    public final int R0() {
        return ChatObject.isChannelAndNotMegaGroup(-this.G1, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        jy0 jy0Var = new jy0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.j0;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayout, 1, null, null, null, jy0Var, i10));
        m2.h hVar = this.g0;
        int i11 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(hVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.t8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.p0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.p0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.p0, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.p0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.p0, TLObject.FLAG_31, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.p0, TLObject.FLAG_30, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.k0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 1, null, null, null, null, i10));
            TextView textView = this.a0;
            int i14 = org.telegram.ui.ActionBar.j6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.Z, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.jq jqVar = this.S;
        if (jqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = jqVar.F;
            EditTextBoldCursor[] editTextBoldCursorArr = jqVar.B;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.j6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.l6));
            }
            org.telegram.ui.ActionBar.l0 l0Var = jqVar.C;
            int i17 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(l0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.l0 l0Var2 = jqVar.C;
            int i18 = org.telegram.ui.ActionBar.j6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.l6(l0Var2, 32, null, null, null, null, i18));
            if (w0Var != null) {
                org.telegram.ui.Components.t6 t6Var = new org.telegram.ui.Components.t6(jqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, t6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, t6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.I0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i3}, null, org.telegram.ui.ActionBar.j6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.j6.j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.L0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i3}, null, org.telegram.ui.ActionBar.j6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.j6.j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i3}, null, org.telegram.ui.ActionBar.j6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0, 0, null, org.telegram.ui.ActionBar.j6.j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.K0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.J0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q0, 0, new Class[]{org.telegram.ui.Components.jo0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q0, 0, new Class[]{org.telegram.ui.Components.jo0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.P0, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, org.telegram.ui.ActionBar.j6.ra));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n3, org.telegram.ui.ActionBar.j6.r3}, null, org.telegram.ui.ActionBar.j6.dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.m3.y;
            int i23 = org.telegram.ui.ActionBar.j6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.q3.y, null, i23));
            org.telegram.ui.ActionBar.q5 q5Var = this.O;
            org.telegram.ui.ActionBar.q5 q5Var2 = this.Q;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p3, org.telegram.ui.ActionBar.j6.t3}, null, org.telegram.ui.ActionBar.j6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.o3.y;
            int i24 = org.telegram.ui.ActionBar.j6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.s3.y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.z3}, null, org.telegram.ui.ActionBar.j6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.sc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ab));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.db));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ad));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.od));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.r0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.l6) arrayList.get(i25)).o = this.a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j10;
        if (this.d0) {
            return false;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.F;
            if (j11 == 0) {
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int i11 = (int) h6Var.j;
                if (i11 == 0) {
                    i11 = B02;
                }
                if (i11 != B02) {
                    return true;
                }
            } else if (j11 != h6Var.j) {
                return true;
            }
            long j12 = this.I;
            long j13 = this.H;
            long j14 = this.G;
            if (j14 == 0 && j13 == 0 && j12 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        j10 = h6Var.k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        j10 = h6Var.l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        j10 = h6Var.m;
                    }
                    int i13 = (int) j10;
                    if (i13 == 0 && j10 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = B0;
                    }
                    if (i13 != B0) {
                        return true;
                    }
                }
            } else if (j14 != h6Var.k || j13 != h6Var.l || j12 != h6Var.m) {
                return true;
            }
            if (h6Var.n != this.L) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.w != h6Var.d) {
                return true;
            }
            int i14 = this.y;
            if (i14 == 0) {
                int i15 = h6Var.e;
                if (i15 != 0 && i15 != h6Var.c) {
                    return true;
                }
            } else if (i14 != h6Var.e) {
                return true;
            }
            int i16 = this.B;
            if (i16 != 0) {
                if (i16 != h6Var.f) {
                    return true;
                }
            } else if (h6Var.f != 0) {
                return true;
            }
            int i17 = this.C;
            if (i17 != 0) {
                if (i17 != h6Var.g) {
                    return true;
                }
            } else if (h6Var.g != 0) {
                return true;
            }
            int i18 = this.D;
            if (i18 != 0) {
                if (i18 != h6Var.h) {
                    return true;
                }
            } else if (h6Var.h != 0) {
                return true;
            }
            if (this.E != h6Var.i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        return (e5Var == null || e5Var.getBottomSheet() == null) ? false : true;
    }

    public final void V0() {
        dg.s1 s1Var = this.N1;
        if (s1Var != null) {
            s1Var.invalidate();
        }
        FrameLayout frameLayout = this.v0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.v0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.w0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.w0.getChildAt(i11).invalidate();
            }
        }
        if (this.G0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr = this.G0;
                if (i12 >= m81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m81 m81Var = m81VarArr[i12];
                if (m81Var != null) {
                    m81Var.setDimAmount(this.J1 ? this.k1 * this.l1 : 0.0f);
                    this.G0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.k0 != null) {
            for (int i13 = 0; i13 < this.k0.getChildCount(); i13++) {
                View childAt = this.k0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.r0 != null) {
            for (int i14 = 0; i14 < this.r0.getChildCount(); i14++) {
                View childAt2 = this.r0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        zc1 zc1Var = this.w1;
        if (zc1Var != null) {
            zc1Var.invalidate();
        }
        zc1 zc1Var2 = this.x1;
        if (zc1Var2 != null) {
            zc1Var2.invalidate();
        }
        y4 y4Var = this.z0;
        if (y4Var != null) {
            y4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (h6Var == null || TextUtils.isEmpty(h6Var.o)) {
            return;
        }
        try {
            File d = h6Var.d();
            Drawable background = this.u0.getBackground();
            Bitmap bitmap = this.u0.getImageReceiver().getBitmap();
            if (background instanceof org.telegram.ui.Components.ec0) {
                FileOutputStream fileOutputStream = new FileOutputStream(d);
                bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            background.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            background.draw(canvas);
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(this.g1, this.p1));
            paint.setAlpha((int) (this.i1 * 255.0f));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            FileOutputStream fileOutputStream2 = new FileOutputStream(d);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void X0() {
        Y0(2, true);
    }

    public final void Y0(int i10, boolean z4) {
        org.telegram.ui.ActionBar.h6 h6Var;
        int i11;
        int i12;
        if (getParentActivity() == null || this.n == i10 || this.o1 != null || (h6Var = this.s) == null) {
            return;
        }
        if (z4 && i10 == 2 && (org.telegram.ui.ActionBar.j6.Z0() || h6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ChangeChatBackground);
            if (!org.telegram.ui.ActionBar.j6.Z0() || (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.f0.d != 0)) {
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.ChangeColorToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new yb1(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new yb1(this, 6));
            } else {
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.ChangeWallpaperToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new yb1(this, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(alertDialog$Builder.a);
            return;
        }
        int i13 = this.n;
        this.n = i10;
        if (i10 == 1) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            int i14 = h6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.jq jqVar = this.S;
            T0(1);
            jqVar.f(1, 2, i14, false);
            this.S.e(h6Var.c, 0);
            int i15 = h6Var.d;
            if (i15 != 0) {
                this.S.e(i15, 1);
            }
            if (i13 == 2 || (i13 == 3 && h6Var.g != 0)) {
                this.s0.u(0);
            }
        } else if (i10 == 2) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Nd);
            int i16 = org.telegram.ui.ActionBar.j6.Od;
            int themedColor2 = org.telegram.ui.ActionBar.j6.c1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.j6.Pd;
            int themedColor3 = org.telegram.ui.ActionBar.j6.c1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.j6.Qd;
            int themedColor4 = org.telegram.ui.ActionBar.j6.c1(i18) ? getThemedColor(i18) : 0;
            long j10 = h6Var.k;
            int i19 = (int) j10;
            if (i19 == 0 && j10 != 0) {
                themedColor2 = 0;
            }
            long j11 = h6Var.l;
            int i20 = (int) j11;
            if (i20 == 0 && j11 != 0) {
                themedColor3 = 0;
            }
            long j12 = h6Var.m;
            int i21 = (int) j12;
            if (i21 == 0 && j12 != 0) {
                themedColor4 = 0;
            }
            int i22 = (int) h6Var.j;
            if (i19 == 0 && themedColor2 == 0) {
                i11 = i20;
                i12 = 1;
            } else if (i21 != 0 || themedColor4 != 0) {
                i11 = i20;
                i12 = 4;
            } else if (i20 == 0 && themedColor3 == 0) {
                i11 = i20;
                i12 = 2;
            } else {
                i11 = i20;
                i12 = 3;
            }
            org.telegram.ui.Components.jq jqVar2 = this.S;
            T0(2);
            jqVar2.f(2, 4, i12, false);
            org.telegram.ui.Components.jq jqVar3 = this.S;
            if (i21 == 0) {
                i21 = themedColor4;
            }
            jqVar3.e(i21, 3);
            org.telegram.ui.Components.jq jqVar4 = this.S;
            if (i11 != 0) {
                themedColor3 = i11;
            }
            jqVar4.e(themedColor3, 2);
            org.telegram.ui.Components.jq jqVar5 = this.S;
            if (i19 == 0) {
                i19 = themedColor2;
            }
            jqVar5.e(i19, 1);
            org.telegram.ui.Components.jq jqVar6 = this.S;
            if (i22 != 0) {
                themedColor = i22;
            }
            jqVar6.e(themedColor, 0);
            if (i13 == 1 || h6Var.g == 0) {
                this.s0.o(0);
            } else {
                this.s0.m(0);
            }
            this.r0.v0(0, AndroidUtilities.dp(60.0f), null);
        } else if (i10 == 3) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            int i23 = h6Var.f != 0 ? h6Var.h != 0 ? 4 : h6Var.g != 0 ? 3 : 2 : 1;
            org.telegram.ui.Components.jq jqVar7 = this.S;
            T0(3);
            jqVar7.f(2, 4, i23, true);
            this.S.e(h6Var.h, 3);
            this.S.e(h6Var.g, 2);
            this.S.e(h6Var.f, 1);
            org.telegram.ui.Components.jq jqVar8 = this.S;
            int i24 = h6Var.e;
            if (i24 == 0) {
                i24 = h6Var.c;
            }
            jqVar8.e(i24, 0);
            this.H0[1].b(0, h6Var.e);
            this.H0[1].b(1, h6Var.f);
            this.H0[1].b(2, h6Var.g);
            this.H0[1].b(3, h6Var.h);
            if (h6Var.g != 0) {
                if (i13 == 1) {
                    this.s0.o(0);
                } else {
                    this.s0.m(0);
                }
            } else if (i13 == 2) {
                this.s0.u(0);
            }
            this.r0.v0(0, AndroidUtilities.dp(60.0f), null);
            e1();
        }
        if (i10 != 1 && i10 != 3) {
            this.S.setMinBrightness(0.0f);
            this.S.setMaxBrightness(1.0f);
            return;
        }
        if (i13 == 2 && this.I0[1].getVisibility() == 0) {
            f1(0, true, true);
        }
        if (i10 != 1) {
            this.S.setMinBrightness(0.0f);
            this.S.setMaxBrightness(1.0f);
        } else if (this.b0.q()) {
            this.S.setMinBrightness(0.2f);
        } else {
            this.S.setMinBrightness(0.05f);
            this.S.setMaxBrightness(0.8f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper = (i10 < 0 || i10 >= this.R0.size()) ? this.V0 : (TLRPC.TL_wallPaper) this.R0.get(i10);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.Z1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Z1.cancel();
        }
        yc1[] yc1VarArr = this.t0;
        yc1 yc1Var = yc1VarArr[0];
        yc1 yc1Var2 = yc1VarArr[1];
        yc1VarArr[0] = yc1Var2;
        yc1VarArr[1] = yc1Var;
        this.q0.removeView(yc1Var2);
        this.q0.addView(yc1VarArr[0], this.q0.indexOfChild(yc1VarArr[1]) + 1);
        yc1 yc1Var3 = yc1VarArr[0];
        this.u0 = yc1Var3;
        yc1Var3.setBackground(yc1VarArr[1].getBackground());
        k1();
        yc1VarArr[1].setVisibility(0);
        yc1VarArr[1].setAlpha(1.0f);
        this.u0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z1 = ofFloat;
        ofFloat.addUpdateListener(new aj(2, this));
        this.Z1.addListener(new nc1(this, 0));
        this.Z1.setInterpolator(org.telegram.ui.Components.mr.f);
        this.Z1.setDuration(300L);
        this.Z1.start();
        this.u0.getImageReceiver().setCrossfadeDuration(300);
        this.u0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.D1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.u0.d();
        this.T0 = tL_wallPaper;
        this.B1 = this.G0[2].s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z4) {
        org.telegram.ui.Components.ec0 ec0Var;
        if (i11 == 0) {
            this.W0 = i10;
        } else if (i11 == 1) {
            this.Y0 = i10;
        } else if (i11 == 2) {
            this.Z0 = i10;
        } else if (i11 == 3) {
            this.a1 = i10;
        }
        m1(z4);
        if (this.G0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr = this.G0;
                if (i12 >= m81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m81 m81Var = m81VarArr[i12];
                if (m81Var != null) {
                    m81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.Z0 != 0) {
            if (this.Q0 != null && org.telegram.ui.ActionBar.j6.I.q()) {
                this.Q0.setTwoSided(true);
            }
            Drawable background = this.u0.getBackground();
            if (background instanceof org.telegram.ui.Components.ec0) {
                ec0Var = (org.telegram.ui.Components.ec0) background;
            } else {
                ec0Var = new org.telegram.ui.Components.ec0();
                ec0Var.r(this.u0);
                if (this.A1) {
                    ec0Var.m(false);
                }
            }
            ec0Var.n(this.W0, this.Y0, this.Z0, this.a1);
            this.u0.setBackground(ec0Var);
            this.g1 = ec0Var.f();
            this.h1 = 754974720;
        } else if (this.Y0 != 0) {
            this.u0.setBackground(new GradientDrawable(org.telegram.ui.Components.o9.d(this.e1), new int[]{this.W0, this.Y0}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.W0, this.Y0));
            this.h1 = patternColor;
            this.g1 = patternColor;
        } else {
            this.u0.setBackgroundColor(this.W0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.W0);
            this.h1 = patternColor2;
            this.g1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.j6.lc;
        boolean c12 = org.telegram.ui.ActionBar.j6.c1(i13);
        jc1 jc1Var = this.a;
        if (!c12 || (this.u0.getBackground() instanceof org.telegram.ui.Components.ec0)) {
            jc1Var.b(this.u0.getBackground(), this.u0.getBackground(), Float.valueOf(this.i1));
        } else if (org.telegram.ui.ActionBar.j6.s0() instanceof org.telegram.ui.Components.ec0) {
            getThemedColor(i13);
            jc1Var.b(this.u0.getBackground(), this.u0.getBackground(), Float.valueOf(this.i1));
        }
        ImageView imageView = this.C0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.D0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.ic), PorterDuff.Mode.MULTIPLY));
        }
        yc1 yc1Var = this.u0;
        if (yc1Var != null) {
            yc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.g1, this.p1));
            this.u0.getImageReceiver().setAlpha(Math.abs(this.i1));
            this.u0.invalidate();
            if (org.telegram.ui.ActionBar.j6.I.q() && (this.u0.getBackground() instanceof org.telegram.ui.Components.ec0)) {
                org.telegram.ui.Cells.j0 j0Var = this.Q0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.i1 < 0.0f) {
                    this.u0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.ec0) this.u0.getBackground()).k);
                }
            } else {
                this.u0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.Q0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.Q0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.i1);
            }
        }
        ec1 ec1Var = this.r0;
        if (ec1Var != null) {
            ec1Var.e1();
        }
        FrameLayout frameLayout = this.v0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.v0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.w0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.w0.getChildAt(i15).invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(boolean z4) {
        ColorDrawable colorDrawable;
        org.telegram.ui.Components.ec0 ec0Var;
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        int i10 = this.b;
        if (i10 == 0 && h6Var == null) {
            this.u0.setBackground(org.telegram.ui.ActionBar.j6.r0());
        } else {
            if (i10 == 2) {
                Object obj = this.y1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z4 ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    BitmapDrawable bitmapDrawable = closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null;
                    yc1 yc1Var = this.u0;
                    yc1Var.a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.D1, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    yc1Var.d();
                } else if (obj instanceof ui1) {
                    ui1 ui1Var = (ui1) obj;
                    int i11 = ui1Var.f;
                    int i12 = ui1Var.e;
                    int i13 = ui1Var.d;
                    int i14 = ui1Var.c;
                    int i15 = ui1Var.b;
                    this.e1 = i11;
                    a1(i15, 0, false);
                    if (i14 != 0) {
                        a1(i14, 1, false);
                    }
                    a1(i13, 2, false);
                    a1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.T0;
                    if (tL_wallPaper2 != null) {
                        yc1 yc1Var2 = this.u0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.D1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.T0;
                        yc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(ui1Var.a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.u0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.ec0.g(i15, i14, i13, i12)));
                    }
                } else if (obj instanceof vi1) {
                    Bitmap bitmap = this.z1;
                    if (bitmap != null) {
                        this.u0.setImageBitmap(bitmap);
                    } else {
                        vi1 vi1Var = (vi1) obj;
                        File file = vi1Var.e;
                        if (file != null) {
                            this.u0.f(file.getAbsolutePath(), this.D1, null);
                        } else {
                            File file2 = vi1Var.d;
                            if (file2 != null) {
                                this.u0.f(file2.getAbsolutePath(), this.D1, null);
                            } else if ("t".equals(vi1Var.a)) {
                                yc1 yc1Var3 = this.u0;
                                yc1Var3.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(yc1Var3, false));
                            } else {
                                int i16 = vi1Var.b;
                                if (i16 != 0) {
                                    this.u0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.E1, true);
                        TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize3 != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize3 : null;
                        this.u0.k(ImageLocation.getForPhoto(photoSize, searchImage.photo), this.D1, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, searchImage.photo), "100_100_b", photoSize != null ? photoSize.size : 0, "jpg", searchImage, 1);
                    } else {
                        yc1 yc1Var4 = this.u0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.D1;
                        String str4 = searchImage.thumbUrl;
                        yc1Var4.getClass();
                        yc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (h6Var == null) {
                this.u0.setBackground(org.telegram.ui.ActionBar.j6.r0());
            } else {
                org.telegram.ui.Components.j9 j9Var = this.r1;
                if (j9Var != null) {
                    j9Var.dispose();
                    this.r1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int i17 = (int) h6Var.j;
                if (i17 != 0) {
                    B0 = i17;
                }
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                long j10 = h6Var.k;
                int i18 = (int) j10;
                if (i18 == 0 && j10 != 0) {
                    B02 = 0;
                } else if (i18 != 0) {
                    B02 = i18;
                }
                int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j11 = h6Var.l;
                int i19 = (int) j11;
                if (i19 == 0 && j11 != 0) {
                    B03 = 0;
                } else if (i19 != 0) {
                    B03 = i19;
                }
                int B04 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                long j12 = h6Var.m;
                int i20 = (int) j12;
                if (i20 == 0 && j12 != 0) {
                    B04 = 0;
                } else if (i20 != 0) {
                    B04 = i20;
                }
                if (TextUtils.isEmpty(h6Var.o) || org.telegram.ui.ActionBar.j6.Z0()) {
                    Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.ec0) {
                            ((org.telegram.ui.Components.ec0) s02).r(this.u0);
                        }
                        this.u0.setBackground(s02);
                    }
                } else {
                    if (B03 != 0) {
                        Drawable background = this.u0.getBackground();
                        if (background instanceof org.telegram.ui.Components.ec0) {
                            ec0Var = (org.telegram.ui.Components.ec0) background;
                        } else {
                            org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0();
                            ec0Var2.r(this.u0);
                            ec0Var = ec0Var2;
                            if (this.A1) {
                                ec0Var2.m(false);
                                ec0Var = ec0Var2;
                            }
                        }
                        ec0Var.n(B0, B02, B03, B04);
                        colorDrawable = ec0Var;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(org.telegram.ui.Components.o9.d(h6Var.n), new int[]{B0, B02});
                        this.r1 = o9Var.f(ja.c.o(0.5f, 3), new rc1(this, 0), 100L);
                        colorDrawable = o9Var;
                    } else {
                        colorDrawable = new ColorDrawable(B0);
                    }
                    this.u0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.T0;
                    if (tL_wallPaper4 != null) {
                        yc1 yc1Var5 = this.u0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.D1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.T0;
                        yc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.h1 = patternColor;
                    this.g1 = patternColor;
                } else if (B03 != 0) {
                    this.g1 = org.telegram.ui.Components.ec0.g(B0, B02, B03, B04);
                    this.h1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.h1 = patternColor2;
                    this.g1 = patternColor2;
                }
                yc1 yc1Var6 = this.u0;
                if (yc1Var6 != null) {
                    yc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.g1, this.p1));
                    this.u0.getImageReceiver().setAlpha(Math.abs(this.i1));
                    this.u0.invalidate();
                    if (org.telegram.ui.ActionBar.j6.I.q() && (this.u0.getBackground() instanceof org.telegram.ui.Components.ec0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.Q0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.i1 < 0.0f) {
                            this.u0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.ec0) this.u0.getBackground()).k);
                        }
                    } else {
                        this.u0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.Q0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.Q0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.i1);
                    }
                }
                if (this.G0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.m81[] m81VarArr = this.G0;
                        if (i21 >= m81VarArr.length) {
                            break;
                        }
                        m81VarArr[i21].b(0, B0);
                        this.G0[i21].b(1, B02);
                        this.G0[i21].b(2, B03);
                        this.G0[i21].b(3, B04);
                        i21++;
                    }
                }
                ImageView imageView = this.C0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.D0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.A1 = false;
    }

    public final void c1(long j10) {
        this.G1 = j10;
        this.H1 = j10 == 0 || j10 == getUserConfig().getClientUserId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x026d, code lost:
    
        if ("d".equals(((org.telegram.ui.ui1) r8).a) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0273, code lost:
    
        if ((r47.y1 instanceof org.telegram.tgnet.TLRPC.TL_wallPaper) != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0f94  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0e21  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x092e A[EDGE_INSN: B:235:0x092e->B:236:0x092e BREAK  A[LOOP:2: B:185:0x084b->B:211:0x0927], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0dbb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1 A[LOOP:0: B:45:0x019d->B:47:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cc A[EDGE_INSN: B:48:0x01cc->B:49:0x01cc BREAK  A[LOOP:0: B:45:0x019d->B:47:0x01a1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0e1e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0e5a  */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v73 */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z4;
        org.telegram.ui.ActionBar.e5 e5Var;
        final int i10;
        int i11;
        int i12;
        yc1[] yc1VarArr;
        boolean z10;
        int i13;
        org.telegram.ui.ActionBar.i6 i6Var;
        float f10;
        int i14;
        char c3;
        Object obj;
        int i15;
        Rect rect;
        int i16;
        final int i17;
        jc1 jc1Var;
        final int i18;
        float f11;
        ?? r82;
        org.telegram.ui.Components.k01 k01Var;
        final int i19;
        org.telegram.ui.ActionBar.e5 e5Var2;
        int i20;
        this.O.p = (jc1) getResourceProvider();
        this.P.p = (jc1) getResourceProvider();
        this.Q.p = (jc1) getResourceProvider();
        this.R.p = (jc1) getResourceProvider();
        int i21 = 1;
        this.hasOwnBackground = true;
        ad1 ad1Var = this.m1;
        int i22 = 0;
        boolean z11 = (ad1Var == null || this.G1 == 0) ? false : true;
        this.I1 = z11;
        if (z11) {
            Object obj2 = this.y1;
            if (!(obj2 instanceof vi1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z4 = true;
            this.J1 = z4;
            if (z4) {
                this.l1 = ad1Var.a() ? 1.0f : 0.0f;
            }
            e5Var = this.parentLayout;
            if (e5Var != null && ((ActionBarLayout) e5Var).z()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.j0 = new FrameLayout(context);
            i10 = 3;
            if (this.J1 && SharedConfig.dayNightWallpaperSwitchHint < 3) {
                AndroidUtilities.runOnUIThread(new wb1(this, i10), 2000L);
            }
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new uc1();
            a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.f5());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
            n0 n0Var = new n0(this, context, 24);
            this.j0 = n0Var;
            n0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            this.j0.addView(this.actionBar, k7.b6.c(-2.0f, -1));
            org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context);
            this.k0 = rl0Var;
            rl0Var.setVerticalScrollBarEnabled(true);
            this.k0.setItemAnimator(null);
            this.k0.setLayoutAnimation(null);
            this.k0.setLayoutManager(new f2.i0(1, false));
            final int i23 = 2;
            this.k0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            org.telegram.ui.Components.rl0 rl0Var2 = this.k0;
            i11 = this.b;
            rl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
            final int i24 = 4;
            this.k0.setOnItemClickListener(new kh.a(i24));
            this.j0.addView(this.k0, k7.b6.e(-1, -1, 51));
            org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider);
            this.m0 = a20Var;
            a20Var.setImageResource(R.drawable.floating_pencil);
            this.j0.addView(this.m0, org.telegram.ui.Components.a20.b());
            bd1 bd1Var = new bd1(context);
            this.l0 = bd1Var;
            this.k0.setAdapter(bd1Var);
            this.q0 = new org.telegram.ui.ActionBar.r0(this, context, i10);
            this.s0 = new fd1(context, this);
            this.p0 = createActionBar(context);
            if (AndroidUtilities.isTablet()) {
                this.p0.setOccupyStatusBar(false);
            }
            ai.z(false, this.p0);
            this.p0.setActionBarMenuOnItemClick(new xc1(this));
            i12 = 0;
            while (true) {
                yc1VarArr = this.t0;
                if (i12 < 2) {
                    break;
                }
                yc1VarArr[i12] = new yc1(this, (Activity) getContext());
                this.q0.addView(yc1VarArr[i12], k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i12++;
            }
            yc1 yc1Var = yc1VarArr[0];
            this.u0 = yc1Var;
            yc1Var.setVisibility(0);
            yc1VarArr[1].setVisibility(8);
            if (i11 == 2) {
                this.u0.getImageReceiver().setDelegate(new yb1(this, i22));
            }
            z10 = this.s0.e;
            org.telegram.ui.ActionBar.i6 i6Var2 = this.b0;
            if (!z10) {
                this.p0.setTitle("Telegram Beta Chat");
                this.p0.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
            } else if (i11 == 2) {
                if (this.G1 != 0) {
                    this.p0.setTitle(LocaleController.getString(R.string.WallpaperPreview));
                } else {
                    this.p0.setTitle(LocaleController.getString(R.string.BackgroundPreview));
                }
                org.telegram.ui.ActionBar.z n10 = this.p0.n();
                Object obj3 = this.y1;
                if ((obj3 instanceof vi1) && ((vi1) obj3).e != null) {
                    n10.a(7, R.drawable.msg_header_draw);
                }
                if (this.G1 == 0) {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION || org.telegram.ui.ActionBar.j6.m0().k(false) == null) {
                        Object obj4 = this.y1;
                        if (obj4 instanceof ui1) {
                        }
                    }
                    n10.a(5, R.drawable.msg_header_share);
                }
                if (this.G1 != 0 && this.I1) {
                    org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                    this.K1 = gj0Var;
                    this.L1 = n10.d(6, gj0Var);
                    this.K1.h = true;
                    ad1 ad1Var2 = this.m1;
                    if (ad1Var2 == null || ad1Var2.a()) {
                        this.K1.K(35);
                        this.K1.N(36);
                    } else {
                        this.K1.N(0);
                        this.K1.K(0);
                    }
                    this.K1.X = true;
                    int u02 = org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.J9);
                    this.K1.O(u02, "Sunny");
                    this.K1.O(u02, "Path 6");
                    this.K1.O(u02, "Path");
                    this.K1.O(u02, "Path 5");
                    this.K1.m();
                }
            } else if (i11 == 1) {
                org.telegram.ui.ActionBar.z n11 = this.p0.n();
                this.f = n11.e(4, LocaleController.getString(R.string.Save));
                org.telegram.ui.Components.ul ulVar = new org.telegram.ui.Components.ul(this, context, n11);
                this.e = ulVar;
                ulVar.setSubMenuOpenSide(1);
                this.e.g(2, LocaleController.getString(R.string.ColorPickerBackground));
                this.e.g(1, LocaleController.getString(R.string.ColorPickerMainColor));
                this.e.g(3, LocaleController.getString(R.string.ColorPickerMyMessages));
                this.e.D();
                this.e.setForceSmoothKeyboard(true);
                this.p0.addView(this.e, k7.b6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xb1
                    public final /* synthetic */ jd1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                jd1.U(this.b);
                                break;
                            case 2:
                                this.b.e.M(null, null);
                                break;
                            case 3:
                                this.b.N0(false);
                                break;
                            default:
                                this.b.N0(true);
                                break;
                        }
                    }
                });
                TextView textView = new TextView(context);
                this.h = textView;
                textView.setImportantForAccessibility(2);
                this.h.setGravity(3);
                this.h.setSingleLine(true);
                this.h.setLines(1);
                this.h.setMaxLines(1);
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                TextView textView2 = this.h;
                int i25 = org.telegram.ui.ActionBar.j6.A8;
                textView2.setTextColor(getThemedColor(i25));
                this.h.setTypeface(AndroidUtilities.bold());
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), PorterDuff.Mode.MULTIPLY));
                this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                this.h.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                this.h.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                this.e.addView(this.h, k7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
            } else {
                TLRPC.TL_theme tL_theme = i6Var2.C;
                String n12 = tL_theme != null ? tL_theme.title : i6Var2.n();
                int lastIndexOf = n12.lastIndexOf(".attheme");
                if (lastIndexOf >= 0) {
                    n12 = n12.substring(0, lastIndexOf);
                }
                this.p0.setTitle(n12);
                TLRPC.TL_theme tL_theme2 = i6Var2.C;
                if (tL_theme2 == null || (i13 = tL_theme2.installs_count) <= 0) {
                    this.p0.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.p0.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i13, new Object[0]));
                }
            }
            this.r0 = new ec1(context, this);
            fc1 fc1Var = new fc1(this);
            fc1Var.S();
            this.r0.setItemAnimator(fc1Var);
            this.r0.setVerticalScrollBarEnabled(true);
            this.r0.setOverScrollMode(2);
            if (i11 != 2) {
                ec1 ec1Var = this.r0;
                int dp = AndroidUtilities.dp(4.0f);
                if (this.H1) {
                    i6Var = i6Var2;
                    f10 = 16.0f;
                } else {
                    i6Var = i6Var2;
                    f10 = 16.0f;
                    if (this.G1 > 0) {
                        i20 = 58;
                        ec1Var.setPadding(0, dp, 0, (AndroidUtilities.dp(72 + i20) - 12) + (!U0() ? AndroidUtilities.navigationBarHeight : 0));
                    }
                }
                i20 = 0;
                ec1Var.setPadding(0, dp, 0, (AndroidUtilities.dp(72 + i20) - 12) + (!U0() ? AndroidUtilities.navigationBarHeight : 0));
            } else {
                i6Var = i6Var2;
                f10 = 16.0f;
                if (i11 == 1) {
                    this.r0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
                } else {
                    this.r0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                }
            }
            this.r0.setClipToPadding(false);
            this.r0.setLayoutManager(new f2.i0(1, true));
            this.r0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            if (i11 != 1) {
                this.q0.addView(this.r0, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.r0.setOnItemClickListener(new yb1(this, i21));
                i14 = -1;
            } else {
                i14 = -1;
                this.q0.addView(this.r0, k7.b6.e(-1, -1, 51));
            }
            this.r0.setOnScrollListener(new n3(this, 29));
            this.q0.addView(this.p0, k7.b6.c(-2.0f, i14));
            org.telegram.ui.Components.o81 o81Var = new org.telegram.ui.Components.o81(context);
            this.s1 = o81Var;
            o81Var.b(new yb1(this, i23));
            org.telegram.ui.ActionBar.h6 h6Var = this.s;
            if (i11 != 1 || i11 == 2) {
                if (i11 != 2) {
                    y4 y4Var = new y4(this, context, U0());
                    this.z0 = y4Var;
                    y4Var.setWillNotDraw(false);
                    c3 = 2;
                    this.z0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.q0.addView(this.z0, k7.b6.e(-1, 0, 81));
                    zc1 zc1Var = new zc1(context, this);
                    this.w1 = zc1Var;
                    k7.d6.b(zc1Var, 0.033f, 1.2f);
                    h1(false);
                    this.w1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xb1
                        public final /* synthetic */ jd1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    this.b.O0(false);
                                    break;
                                case 1:
                                    jd1.U(this.b);
                                    break;
                                case 2:
                                    this.b.e.M(null, null);
                                    break;
                                case 3:
                                    this.b.N0(false);
                                    break;
                                default:
                                    this.b.N0(true);
                                    break;
                            }
                        }
                    });
                    if (this.G1 <= 0 || this.H1 || this.n0 != null) {
                        this.z0.addView(this.w1, k7.b6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        zc1 zc1Var2 = new zc1(context, this);
                        this.x1 = zc1Var2;
                        k7.d6.b(zc1Var2, 0.033f, 1.2f);
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.G1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().isPremium()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.ApplyWallpaperForMeAndPeer, UserObject.getUserName(user)));
                        this.x1.d(spannableStringBuilder);
                        try {
                            zc1 zc1Var3 = this.x1;
                            CharSequence b10 = zc1Var3.b();
                            k01Var = this.x1.a;
                            zc1Var3.d(Emoji.replaceEmoji(b10, k01Var.i(), false));
                        } catch (Exception unused) {
                        }
                        this.x1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xb1
                            public final /* synthetic */ jd1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i24) {
                                    case 0:
                                        this.b.O0(false);
                                        break;
                                    case 1:
                                        jd1.U(this.b);
                                        break;
                                    case 2:
                                        this.b.e.M(null, null);
                                        break;
                                    case 3:
                                        this.b.N0(false);
                                        break;
                                    default:
                                        this.b.N0(true);
                                        break;
                                }
                            }
                        });
                        this.z0.addView(this.w1, k7.b6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.z0.addView(this.x1, k7.b6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.J1) {
                        dg.s1 s1Var = new dg.s1(this, (Activity) getContext());
                        this.N1 = s1Var;
                        s1Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                        this.q0.addView(this.N1, k7.b6.e(222, 76, 49));
                        gc1 gc1Var = new gc1((Activity) getContext());
                        this.O1 = gc1Var;
                        gc1Var.d(this.k1);
                        this.O1.b();
                        this.O1.c(new y3(this, 21));
                        this.N1.addView(this.O1);
                        ad1 ad1Var3 = this.m1;
                        if (ad1Var3 != null) {
                            this.O1.setVisibility(ad1Var3.a() ? 0 : 8);
                            this.O1.setAlpha(this.m1.a() ? 1.0f : 0.0f);
                            this.O1.d(this.m1.a() ? this.k1 : 0.0f);
                        }
                    }
                } else {
                    c3 = 2;
                }
                Rect rect2 = new Rect();
                Drawable mutate2 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                this.r = mutate2;
                mutate2.getPadding(rect2);
                this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.d6), PorterDuff.Mode.MULTIPLY));
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                obj = this.y1;
                if (i11 != 1 || (obj instanceof ui1)) {
                    if ((obj instanceof ui1) || !"d".equals(((ui1) obj).a)) {
                        i15 = 3;
                        String[] strArr = new String[i15];
                        int[] iArr = new int[i15];
                        this.G0 = new org.telegram.ui.Components.m81[i15];
                        if (i15 != 0) {
                            this.v0 = new FrameLayout(context);
                            if (i11 == 1 || (this.y1 instanceof ui1)) {
                                strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                                strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                                strArr[c3] = LocaleController.getString(R.string.BackgroundMotion);
                            } else {
                                strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                                strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                            }
                            int i26 = 0;
                            i16 = 0;
                            while (i26 < i15) {
                                int ceil = (int) Math.ceil(textPaint.measureText(strArr[i26]));
                                iArr[i26] = ceil;
                                i16 = Math.max(i16, ceil);
                                i26++;
                                rect2 = rect2;
                            }
                            rect = rect2;
                            hc1 hc1Var = new hc1(this, context, 0);
                            this.A0 = hc1Var;
                            hc1Var.setWillNotDraw(false);
                            this.A0.setVisibility(this.Y0 != 0 ? 0 : 4);
                            this.A0.setScaleX(this.Y0 != 0 ? 1.0f : 0.1f);
                            this.A0.setScaleY(this.Y0 != 0 ? 1.0f : 0.1f);
                            this.A0.setAlpha(this.Y0 != 0 ? 1.0f : 0.0f);
                            this.A0.setTag(this.Y0 != 0 ? 1 : null);
                            this.v0.addView(this.A0, k7.b6.e(48, 48, 17));
                            this.A0.setOnClickListener(new ic1(this, i22));
                            ImageView imageView = new ImageView(context);
                            this.C0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.C0.setImageResource(R.drawable.bg_rotate_large);
                            this.A0.addView(this.C0, k7.b6.e(-2, -2, 17));
                        } else {
                            rect = rect2;
                            i16 = 0;
                        }
                        i17 = 0;
                        while (true) {
                            jc1Var = this.a;
                            if (i17 >= i15) {
                                break;
                            }
                            this.G0[i17] = new org.telegram.ui.Components.m81(context, ((i11 == 1 || (this.y1 instanceof ui1)) && i17 == 0) ? false : true, this.u0, jc1Var);
                            this.G0[i17].setBackgroundColor(this.W0);
                            org.telegram.ui.Components.m81 m81Var = this.G0[i17];
                            String str = strArr[i17];
                            int i27 = iArr[i17];
                            m81Var.f = str;
                            m81Var.h = i27;
                            m81Var.n = i16;
                            int i28 = 1;
                            if (i11 != 1) {
                                if (this.y1 instanceof ui1) {
                                    i28 = 1;
                                } else {
                                    m81Var.a(i17 == 0 ? this.C1 : this.B1, false);
                                    int dp2 = AndroidUtilities.dp(56.0f) + i16;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp2, -2);
                                    layoutParams.gravity = 17;
                                    if (i15 != 3) {
                                        if (i17 == 0 || i17 == 2) {
                                            layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp2 / 2);
                                        } else {
                                            layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp2 / 2);
                                        }
                                    } else if (i17 == 1) {
                                        layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp2 / 2);
                                    } else {
                                        layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp2 / 2);
                                    }
                                    this.v0.addView(this.G0[i17], layoutParams);
                                    final org.telegram.ui.Components.m81 m81Var2 = this.G0[i17];
                                    final int i29 = 0;
                                    m81Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zb1
                                        public final /* synthetic */ jd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i29) {
                                                case 0:
                                                    jd1 jd1Var = this.b;
                                                    int i30 = jd1Var.b;
                                                    FrameLayout[] frameLayoutArr = jd1Var.I0;
                                                    if (jd1Var.v0.getAlpha() == 1.0f && jd1Var.o1 == null) {
                                                        int i31 = i17;
                                                        org.telegram.ui.Components.m81 m81Var3 = m81Var2;
                                                        if ((i30 != 1 && !(jd1Var.y1 instanceof ui1)) || i31 != 2) {
                                                            if (i31 != 1 || (i30 != 1 && !(jd1Var.y1 instanceof ui1))) {
                                                                if (!(jd1Var.y1 instanceof ui1)) {
                                                                    if (i30 != 1) {
                                                                        m81Var3.a(!m81Var3.s, true);
                                                                        if (i31 != 0) {
                                                                            boolean z12 = m81Var3.s;
                                                                            jd1Var.B1 = z12;
                                                                            jd1Var.s1.c(z12);
                                                                            jd1Var.M0();
                                                                            break;
                                                                        } else {
                                                                            boolean z13 = m81Var3.s;
                                                                            jd1Var.C1 = z13;
                                                                            if (z13) {
                                                                                jd1Var.u0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            jd1Var.i1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    jd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (jd1Var.G0[1].s) {
                                                                    jd1Var.V0 = jd1Var.T0;
                                                                    jd1Var.u0.setImageDrawable(null);
                                                                    jd1Var.T0 = null;
                                                                    jd1Var.B1 = false;
                                                                    jd1Var.j1();
                                                                    jd1Var.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i30 == 1) {
                                                                            jd1Var.f1(0, true, true);
                                                                        } else {
                                                                            jd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    jd1Var.Z0(jd1Var.V0 != null ? -1 : 0);
                                                                    if (i30 == 1) {
                                                                        jd1Var.f1(1, true, true);
                                                                    } else {
                                                                        jd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                jd1Var.G0[1].a(jd1Var.T0 != null, true);
                                                                jd1Var.n1();
                                                                jd1Var.M0.e1();
                                                                jd1Var.l1();
                                                                break;
                                                            }
                                                        } else {
                                                            m81Var3.a(!m81Var3.s, true);
                                                            boolean z14 = m81Var3.s;
                                                            jd1Var.B1 = z14;
                                                            jd1Var.s1.c(z14);
                                                            jd1Var.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    jd1 jd1Var2 = this.b;
                                                    if (jd1Var2.w0.getAlpha() == 1.0f && i17 == 0) {
                                                        org.telegram.ui.Components.m81 m81Var4 = m81Var2;
                                                        m81Var4.a(!m81Var4.s, true);
                                                        jd1Var2.s.i = m81Var4.s;
                                                        org.telegram.ui.ActionBar.j6.n1(true, true);
                                                        jd1Var2.r0.e1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    if (i17 != 2) {
                                        this.G0[i17].setAlpha(0.0f);
                                        this.G0[i17].setVisibility(4);
                                    }
                                    i17++;
                                }
                            }
                            if (i17 == i28) {
                                m81Var.a((this.T0 == null && (h6Var == null || TextUtils.isEmpty(h6Var.o))) ? false : true, false);
                            } else if (i17 == 2) {
                                m81Var.a(this.B1, false);
                            }
                            int dp22 = AndroidUtilities.dp(56.0f) + i16;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp22, -2);
                            layoutParams2.gravity = 17;
                            if (i15 != 3) {
                            }
                            this.v0.addView(this.G0[i17], layoutParams2);
                            final org.telegram.ui.Components.m81 m81Var22 = this.G0[i17];
                            final int i292 = 0;
                            m81Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zb1
                                public final /* synthetic */ jd1 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i292) {
                                        case 0:
                                            jd1 jd1Var = this.b;
                                            int i30 = jd1Var.b;
                                            FrameLayout[] frameLayoutArr = jd1Var.I0;
                                            if (jd1Var.v0.getAlpha() == 1.0f && jd1Var.o1 == null) {
                                                int i31 = i17;
                                                org.telegram.ui.Components.m81 m81Var3 = m81Var22;
                                                if ((i30 != 1 && !(jd1Var.y1 instanceof ui1)) || i31 != 2) {
                                                    if (i31 != 1 || (i30 != 1 && !(jd1Var.y1 instanceof ui1))) {
                                                        if (!(jd1Var.y1 instanceof ui1)) {
                                                            if (i30 != 1) {
                                                                m81Var3.a(!m81Var3.s, true);
                                                                if (i31 != 0) {
                                                                    boolean z12 = m81Var3.s;
                                                                    jd1Var.B1 = z12;
                                                                    jd1Var.s1.c(z12);
                                                                    jd1Var.M0();
                                                                    break;
                                                                } else {
                                                                    boolean z13 = m81Var3.s;
                                                                    jd1Var.C1 = z13;
                                                                    if (z13) {
                                                                        jd1Var.u0.getImageReceiver().setForceCrossfade(true);
                                                                    }
                                                                    jd1Var.i1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            jd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (jd1Var.G0[1].s) {
                                                            jd1Var.V0 = jd1Var.T0;
                                                            jd1Var.u0.setImageDrawable(null);
                                                            jd1Var.T0 = null;
                                                            jd1Var.B1 = false;
                                                            jd1Var.j1();
                                                            jd1Var.M0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (i30 == 1) {
                                                                    jd1Var.f1(0, true, true);
                                                                } else {
                                                                    jd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            jd1Var.Z0(jd1Var.V0 != null ? -1 : 0);
                                                            if (i30 == 1) {
                                                                jd1Var.f1(1, true, true);
                                                            } else {
                                                                jd1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        jd1Var.G0[1].a(jd1Var.T0 != null, true);
                                                        jd1Var.n1();
                                                        jd1Var.M0.e1();
                                                        jd1Var.l1();
                                                        break;
                                                    }
                                                } else {
                                                    m81Var3.a(!m81Var3.s, true);
                                                    boolean z14 = m81Var3.s;
                                                    jd1Var.B1 = z14;
                                                    jd1Var.s1.c(z14);
                                                    jd1Var.M0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            jd1 jd1Var2 = this.b;
                                            if (jd1Var2.w0.getAlpha() == 1.0f && i17 == 0) {
                                                org.telegram.ui.Components.m81 m81Var4 = m81Var22;
                                                m81Var4.a(!m81Var4.s, true);
                                                jd1Var2.s.i = m81Var4.s;
                                                org.telegram.ui.ActionBar.j6.n1(true, true);
                                                jd1Var2.r0.e1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i17 != 2) {
                            }
                            i17++;
                        }
                        if (i11 == 1) {
                            int[] iArr2 = new int[2];
                            this.H0 = new org.telegram.ui.Components.m81[2];
                            this.w0 = new FrameLayout(context);
                            String[] strArr2 = {LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                            int i30 = 0;
                            int i31 = 0;
                            for (int i32 = 2; i30 < i32; i32 = 2) {
                                int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i30]));
                                iArr2[i30] = ceil2;
                                i31 = Math.max(i31, ceil2);
                                i30++;
                            }
                            if (h6Var != null) {
                                hc1 hc1Var2 = new hc1(this, context, 1);
                                this.B0 = hc1Var2;
                                hc1Var2.setWillNotDraw(false);
                                this.B0.setVisibility(h6Var.f != 0 ? 0 : 4);
                                this.B0.setScaleX(h6Var.f != 0 ? 1.0f : 0.1f);
                                this.B0.setScaleY(h6Var.f != 0 ? 1.0f : 0.1f);
                                this.B0.setAlpha(h6Var.f != 0 ? 1.0f : 0.0f);
                                this.w0.addView(this.B0, k7.b6.e(48, 48, 17));
                                this.B0.setOnClickListener(new ic1(this, 1));
                                ImageView imageView2 = new ImageView(context);
                                this.D0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.D0.setImageResource(R.drawable.bg_rotate_large);
                                this.B0.addView(this.D0, k7.b6.e(-2, -2, 17));
                                final int i33 = 0;
                                while (i33 < 2) {
                                    this.H0[i33] = new org.telegram.ui.Components.m81(context, i33 == 0, this.u0, jc1Var);
                                    org.telegram.ui.Components.m81 m81Var3 = this.H0[i33];
                                    String str2 = strArr2[i33];
                                    int i34 = iArr2[i33];
                                    m81Var3.f = str2;
                                    m81Var3.h = i34;
                                    m81Var3.n = i31;
                                    if (i33 == 0) {
                                        m81Var3.a(h6Var.i, false);
                                    }
                                    int dp3 = AndroidUtilities.dp(56.0f) + i31;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dp3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i33 == 1) {
                                        layoutParams3.leftMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    }
                                    this.w0.addView(this.H0[i33], layoutParams3);
                                    final org.telegram.ui.Components.m81 m81Var4 = this.H0[i33];
                                    final int i35 = 1;
                                    m81Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zb1
                                        public final /* synthetic */ jd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i35) {
                                                case 0:
                                                    jd1 jd1Var = this.b;
                                                    int i302 = jd1Var.b;
                                                    FrameLayout[] frameLayoutArr = jd1Var.I0;
                                                    if (jd1Var.v0.getAlpha() == 1.0f && jd1Var.o1 == null) {
                                                        int i312 = i33;
                                                        org.telegram.ui.Components.m81 m81Var32 = m81Var4;
                                                        if ((i302 != 1 && !(jd1Var.y1 instanceof ui1)) || i312 != 2) {
                                                            if (i312 != 1 || (i302 != 1 && !(jd1Var.y1 instanceof ui1))) {
                                                                if (!(jd1Var.y1 instanceof ui1)) {
                                                                    if (i302 != 1) {
                                                                        m81Var32.a(!m81Var32.s, true);
                                                                        if (i312 != 0) {
                                                                            boolean z12 = m81Var32.s;
                                                                            jd1Var.B1 = z12;
                                                                            jd1Var.s1.c(z12);
                                                                            jd1Var.M0();
                                                                            break;
                                                                        } else {
                                                                            boolean z13 = m81Var32.s;
                                                                            jd1Var.C1 = z13;
                                                                            if (z13) {
                                                                                jd1Var.u0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            jd1Var.i1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    jd1Var.f1(i312, frameLayoutArr[i312].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (jd1Var.G0[1].s) {
                                                                    jd1Var.V0 = jd1Var.T0;
                                                                    jd1Var.u0.setImageDrawable(null);
                                                                    jd1Var.T0 = null;
                                                                    jd1Var.B1 = false;
                                                                    jd1Var.j1();
                                                                    jd1Var.M0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i302 == 1) {
                                                                            jd1Var.f1(0, true, true);
                                                                        } else {
                                                                            jd1Var.f1(i312, frameLayoutArr[i312].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    jd1Var.Z0(jd1Var.V0 != null ? -1 : 0);
                                                                    if (i302 == 1) {
                                                                        jd1Var.f1(1, true, true);
                                                                    } else {
                                                                        jd1Var.f1(i312, frameLayoutArr[i312].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                jd1Var.G0[1].a(jd1Var.T0 != null, true);
                                                                jd1Var.n1();
                                                                jd1Var.M0.e1();
                                                                jd1Var.l1();
                                                                break;
                                                            }
                                                        } else {
                                                            m81Var32.a(!m81Var32.s, true);
                                                            boolean z14 = m81Var32.s;
                                                            jd1Var.B1 = z14;
                                                            jd1Var.s1.c(z14);
                                                            jd1Var.M0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    jd1 jd1Var2 = this.b;
                                                    if (jd1Var2.w0.getAlpha() == 1.0f && i33 == 0) {
                                                        org.telegram.ui.Components.m81 m81Var42 = m81Var4;
                                                        m81Var42.a(!m81Var42.s, true);
                                                        jd1Var2.s.i = m81Var42.s;
                                                        org.telegram.ui.ActionBar.j6.n1(true, true);
                                                        jd1Var2.r0.e1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i33++;
                                }
                            }
                        }
                        if (i11 != 1 || (this.y1 instanceof ui1)) {
                            this.C1 = false;
                            i18 = 0;
                            while (i18 < 2) {
                                Rect rect3 = rect;
                                kc1 kc1Var = new kc1(this, context, i18, rect3);
                                ViewGroup[] viewGroupArr = this.I0;
                                viewGroupArr[i18] = kc1Var;
                                if (i18 == 1 || i11 == 2) {
                                    kc1Var.setVisibility(4);
                                }
                                viewGroupArr[i18].setWillNotDraw(false);
                                FrameLayout.LayoutParams e = i11 == 2 ? k7.b6.e(-1, i18 == 0 ? 321 : 316, 83) : k7.b6.e(-1, i18 == 0 ? 273 : 316, 83);
                                e.height = AndroidUtilities.dp(i18 == 0 ? i11 == 2 ? 321 : 273 : 316.0f);
                                if (U0()) {
                                    e.height += AndroidUtilities.navigationBarHeight;
                                }
                                if (i18 == 0) {
                                    Drawable drawable = this.r;
                                    Rect rect4 = AndroidUtilities.rectTmp2;
                                    drawable.getPadding(rect4);
                                    e.height = AndroidUtilities.dp(12.0f) + rect4.top + e.height;
                                }
                                viewGroupArr[i18].setPadding(0, i18 == 0 ? AndroidUtilities.dp(12.0f) + rect3.top : 0, 0, U0() ? AndroidUtilities.navigationBarHeight : 0);
                                this.q0.addView(viewGroupArr[i18], e);
                                if (i18 == 1 || i11 == 2) {
                                    ah.e eVar = new ah.e(this, context, 28);
                                    ViewGroup[] viewGroupArr2 = this.L0;
                                    viewGroupArr2[i18] = eVar;
                                    eVar.setWillNotDraw(false);
                                    viewGroupArr2[i18].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                                    viewGroupArr2[i18].setClickable(true);
                                    f11 = 21.0f;
                                    viewGroupArr[i18].addView(viewGroupArr2[i18], k7.b6.e(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.J0;
                                    textViewArr[i18] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i18].setTypeface(AndroidUtilities.bold());
                                    TextView textView4 = textViewArr[i18];
                                    int i36 = org.telegram.ui.ActionBar.j6.Ae;
                                    textView4.setTextColor(getThemedColor(i36));
                                    textViewArr[i18].setText(LocaleController.getString(R.string.Cancel));
                                    textViewArr[i18].setGravity(17);
                                    textViewArr[i18].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    TextView textView5 = textViewArr[i18];
                                    int i37 = org.telegram.ui.ActionBar.j6.i6;
                                    textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(getThemedColor(i37), 0));
                                    rect = rect3;
                                    viewGroupArr2[i18].addView(textViewArr[i18], k7.b6.e(-2, -1, 51));
                                    final int i38 = 0;
                                    textViewArr[i18].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.dc1
                                        public final /* synthetic */ jd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i38) {
                                                case 0:
                                                    jd1 jd1Var = this.b;
                                                    if (jd1Var.o1 == null) {
                                                        int i39 = i18;
                                                        if (i39 == 0) {
                                                            jd1Var.e1 = jd1Var.f1;
                                                            jd1Var.a1(jd1Var.d1, 3, true);
                                                            jd1Var.a1(jd1Var.c1, 2, true);
                                                            jd1Var.a1(jd1Var.b1, 1, true);
                                                            jd1Var.a1(jd1Var.X0, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = jd1Var.U0;
                                                            jd1Var.T0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                jd1Var.u0.setImageDrawable(null);
                                                            } else {
                                                                yc1 yc1Var2 = jd1Var.u0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = jd1Var.D1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = jd1Var.T0;
                                                                yc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            jd1Var.G0[1].a(jd1Var.T0 != null, false);
                                                            float f12 = jd1Var.j1;
                                                            jd1Var.i1 = f12;
                                                            jd1Var.Q0.setProgress(f12);
                                                            jd1Var.u0.getImageReceiver().setAlpha(jd1Var.i1);
                                                            jd1Var.j1();
                                                            jd1Var.n1();
                                                        }
                                                        if (jd1Var.b != 2) {
                                                            if (jd1Var.T0 == null) {
                                                                if (jd1Var.B1) {
                                                                    jd1Var.B1 = false;
                                                                    jd1Var.G0[0].a(false, true);
                                                                    jd1Var.M0();
                                                                }
                                                                jd1Var.l1();
                                                            }
                                                            jd1Var.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            jd1Var.f1(i39, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    jd1 jd1Var2 = this.b;
                                                    if (jd1Var2.o1 == null) {
                                                        if (jd1Var2.b != 2) {
                                                            jd1Var2.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            jd1Var2.f1(i18, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView6 = new TextView(context);
                                    TextView[] textViewArr2 = this.K0;
                                    textViewArr2[i18] = textView6;
                                    textView6.setTextSize(1, 15.0f);
                                    textViewArr2[i18].setTypeface(AndroidUtilities.bold());
                                    textViewArr2[i18].setTextColor(getThemedColor(i36));
                                    textViewArr2[i18].setText(LocaleController.getString(R.string.ApplyTheme));
                                    textViewArr2[i18].setGravity(17);
                                    textViewArr2[i18].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    textViewArr2[i18].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(getThemedColor(i37), 0));
                                    viewGroupArr2[i18].addView(textViewArr2[i18], k7.b6.e(-2, -1, 53));
                                    TextView textView7 = textViewArr2[i18];
                                    r82 = 1;
                                    final char c10 = 1 == true ? 1 : 0;
                                    textView7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.dc1
                                        public final /* synthetic */ jd1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (c10) {
                                                case 0:
                                                    jd1 jd1Var = this.b;
                                                    if (jd1Var.o1 == null) {
                                                        int i39 = i18;
                                                        if (i39 == 0) {
                                                            jd1Var.e1 = jd1Var.f1;
                                                            jd1Var.a1(jd1Var.d1, 3, true);
                                                            jd1Var.a1(jd1Var.c1, 2, true);
                                                            jd1Var.a1(jd1Var.b1, 1, true);
                                                            jd1Var.a1(jd1Var.X0, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = jd1Var.U0;
                                                            jd1Var.T0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                jd1Var.u0.setImageDrawable(null);
                                                            } else {
                                                                yc1 yc1Var2 = jd1Var.u0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = jd1Var.D1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = jd1Var.T0;
                                                                yc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            jd1Var.G0[1].a(jd1Var.T0 != null, false);
                                                            float f12 = jd1Var.j1;
                                                            jd1Var.i1 = f12;
                                                            jd1Var.Q0.setProgress(f12);
                                                            jd1Var.u0.getImageReceiver().setAlpha(jd1Var.i1);
                                                            jd1Var.j1();
                                                            jd1Var.n1();
                                                        }
                                                        if (jd1Var.b != 2) {
                                                            if (jd1Var.T0 == null) {
                                                                if (jd1Var.B1) {
                                                                    jd1Var.B1 = false;
                                                                    jd1Var.G0[0].a(false, true);
                                                                    jd1Var.M0();
                                                                }
                                                                jd1Var.l1();
                                                            }
                                                            jd1Var.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            jd1Var.f1(i39, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    jd1 jd1Var2 = this.b;
                                                    if (jd1Var2.o1 == null) {
                                                        if (jd1Var2.b != 2) {
                                                            jd1Var2.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            jd1Var2.f1(i18, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    rect = rect3;
                                    r82 = 1;
                                    f11 = 21.0f;
                                }
                                if (i18 == r82) {
                                    TextView textView8 = new TextView(context);
                                    this.b2 = textView8;
                                    textView8.setLines(r82);
                                    this.b2.setSingleLine(r82);
                                    this.b2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                                    this.b2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                                    this.b2.setTextSize(r82, 20.0f);
                                    this.b2.setTypeface(AndroidUtilities.bold());
                                    this.b2.setPadding(AndroidUtilities.dp(f11), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(8.0f));
                                    this.b2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.b2.setGravity(16);
                                    viewGroupArr[i18].addView(this.b2, k7.b6.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                    rb1 rb1Var = new rb1(context);
                                    this.M0 = rb1Var;
                                    f2.i0 i0Var = new f2.i0(0, false);
                                    this.O0 = i0Var;
                                    rb1Var.setLayoutManager(i0Var);
                                    rb1 rb1Var2 = this.M0;
                                    hd1 hd1Var = new hd1(context, this);
                                    this.N0 = hd1Var;
                                    rb1Var2.setAdapter(hd1Var);
                                    this.M0.i(new nh.k(7));
                                    viewGroupArr[i18].addView(this.M0, k7.b6.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                    this.M0.setOnItemClickListener(new p21(this, 7));
                                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
                                    this.P0 = l4Var;
                                    l4Var.setText(LocaleController.getString(R.string.BackgroundIntensity));
                                    viewGroupArr[i18].addView(this.P0, k7.b6.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                    org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(context, (jc1) getResourceProvider());
                                    this.Q0 = j0Var;
                                    j0Var.setProgress(this.i1);
                                    this.Q0.setReportChanges(true);
                                    this.Q0.setDelegate(new lc1(this));
                                    viewGroupArr[i18].addView(this.Q0, k7.b6.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                } else {
                                    org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(context, this.d0, new mc1(this));
                                    this.S = jqVar;
                                    jqVar.setResourcesProvider(getResourceProvider());
                                    if (i11 == 1) {
                                        viewGroupArr[i18].addView(this.S, k7.b6.e(-1, -1, 1));
                                        if (i6Var.q()) {
                                            this.S.setMinBrightness(0.2f);
                                        } else {
                                            this.S.setMinBrightness(0.05f);
                                            this.S.setMaxBrightness(0.8f);
                                        }
                                        if (h6Var != null) {
                                            int i39 = h6Var.d != 0 ? 2 : 1;
                                            org.telegram.ui.Components.jq jqVar2 = this.S;
                                            T0(1);
                                            jqVar2.f(1, 2, i39, false);
                                            this.S.e(h6Var.c, 0);
                                            int i40 = h6Var.d;
                                            if (i40 != 0) {
                                                this.S.e(i40, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i18].addView(this.S, k7.b6.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                    }
                                }
                                i18++;
                            }
                        }
                        j1();
                        if (!this.u0.getImageReceiver().hasBitmapImage()) {
                            this.q0.setBackgroundColor(-16777216);
                        }
                        if (i11 != 1 && !(this.y1 instanceof ui1)) {
                            this.u0.getImageReceiver().setCrossfadeWithOldImage(true);
                        }
                    }
                    i15 = 0;
                    String[] strArr3 = new String[i15];
                    int[] iArr3 = new int[i15];
                    this.G0 = new org.telegram.ui.Components.m81[i15];
                    if (i15 != 0) {
                    }
                    i17 = 0;
                    while (true) {
                        jc1Var = this.a;
                        if (i17 >= i15) {
                        }
                        i17++;
                    }
                    if (i11 == 1) {
                    }
                    if (i11 != 1) {
                    }
                    this.C1 = false;
                    i18 = 0;
                    while (i18 < 2) {
                    }
                    j1();
                    if (!this.u0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                        this.u0.getImageReceiver().setCrossfadeWithOldImage(true);
                    }
                } else {
                    if (!(obj instanceof vi1) || !"t".equals(((vi1) obj).a)) {
                        i15 = 2;
                        String[] strArr32 = new String[i15];
                        int[] iArr32 = new int[i15];
                        this.G0 = new org.telegram.ui.Components.m81[i15];
                        if (i15 != 0) {
                        }
                        i17 = 0;
                        while (true) {
                            jc1Var = this.a;
                            if (i17 >= i15) {
                            }
                            i17++;
                        }
                        if (i11 == 1) {
                        }
                        if (i11 != 1) {
                        }
                        this.C1 = false;
                        i18 = 0;
                        while (i18 < 2) {
                        }
                        j1();
                        if (!this.u0.getImageReceiver().hasBitmapImage()) {
                        }
                        if (i11 != 1) {
                        }
                    }
                    i15 = 0;
                    String[] strArr322 = new String[i15];
                    int[] iArr322 = new int[i15];
                    this.G0 = new org.telegram.ui.Components.m81[i15];
                    if (i15 != 0) {
                    }
                    i17 = 0;
                    while (true) {
                        jc1Var = this.a;
                        if (i17 >= i15) {
                        }
                        i17++;
                    }
                    if (i11 == 1) {
                    }
                    if (i11 != 1) {
                    }
                    this.C1 = false;
                    i18 = 0;
                    while (i18 < 2) {
                    }
                    j1();
                    if (!this.u0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                    }
                }
            }
            this.r0.setAdapter(this.s0);
            ah.e eVar2 = new ah.e(this, context, 29);
            this.h0 = eVar2;
            eVar2.setWillNotDraw(false);
            ah.e eVar3 = this.h0;
            this.fragmentView = eVar3;
            ViewTreeObserver viewTreeObserver = eVar3.getViewTreeObserver();
            z90 z90Var = new z90(this, 1);
            this.N = z90Var;
            viewTreeObserver.addOnGlobalLayoutListener(z90Var);
            m2.h hVar = new m2.h(context);
            this.g0 = hVar;
            int i41 = 2;
            hVar.b(new q2(this, i41));
            this.g0.setAdapter(new eg.j1(this, i41));
            AndroidUtilities.setViewPagerEdgeEffectColor(this.g0, getThemedColor(org.telegram.ui.ActionBar.j6.s8));
            this.h0.addView(this.g0, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
            UndoView undoView = new UndoView(context, this);
            this.i0 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.h0.addView(this.i0, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (i11 != 0) {
                View view = new View(context);
                view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.V5));
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
                this.h0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.Y = frameLayout;
                int i42 = org.telegram.ui.ActionBar.j6.d6;
                boolean z12 = this.d;
                frameLayout.setBackgroundColor(z12 ? org.telegram.ui.ActionBar.j6.C0(i42) : getThemedColor(i42));
                this.h0.addView(this.Y, k7.b6.e(-1, 48, 83));
                eg.i0 i0Var2 = new eg.i0(context, this);
                this.X = i0Var2;
                this.Y.addView(i0Var2, k7.b6.e(22, 8, 17));
                TextView textView9 = new TextView(context);
                this.a0 = textView9;
                textView9.setTextSize(1, 14.0f);
                TextView textView10 = this.a0;
                int i43 = org.telegram.ui.ActionBar.j6.Ae;
                textView10.setTextColor(z12 ? org.telegram.ui.ActionBar.j6.C0(i43) : getThemedColor(i43));
                this.a0.setGravity(17);
                this.a0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(251658240, 0));
                this.a0.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.a0.setText(LocaleController.getString(R.string.Cancel));
                this.a0.setTypeface(AndroidUtilities.bold());
                this.Y.addView(this.a0, k7.b6.e(-2, -1, 51));
                final int i44 = 0;
                this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xb1
                    public final /* synthetic */ jd1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i44) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                jd1.U(this.b);
                                break;
                            case 2:
                                this.b.e.M(null, null);
                                break;
                            case 3:
                                this.b.N0(false);
                                break;
                            default:
                                this.b.N0(true);
                                break;
                        }
                    }
                });
                TextView textView11 = new TextView(context);
                this.Z = textView11;
                textView11.setTextSize(1, 14.0f);
                this.Z.setTextColor(z12 ? org.telegram.ui.ActionBar.j6.C0(i43) : getThemedColor(i43));
                this.Z.setGravity(17);
                this.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(251658240, 0));
                this.Z.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.Z.setText(LocaleController.getString(R.string.ApplyTheme));
                this.Z.setTypeface(AndroidUtilities.bold());
                this.Y.addView(this.Z, k7.b6.e(-2, -1, 53));
                i19 = 1;
                this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xb1
                    public final /* synthetic */ jd1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i19) {
                            case 0:
                                this.b.O0(false);
                                break;
                            case 1:
                                jd1.U(this.b);
                                break;
                            case 2:
                                this.b.e.M(null, null);
                                break;
                            case 3:
                                this.b.N0(false);
                                break;
                            default:
                                this.b.N0(true);
                                break;
                        }
                    }
                });
            } else {
                i19 = 1;
            }
            if (i11 == i19 && !org.telegram.ui.ActionBar.j6.Z0() && h6Var != null && h6Var.j != 4294967296L) {
                X0();
            }
            this.f0 = S0();
            b1(true);
            m1(false);
            this.c = new Scroller(getContext());
            e5Var2 = this.parentLayout;
            if (e5Var2 != null && e5Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                if (i11 == 2 && this.G1 != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
            return this.fragmentView;
        }
        z4 = false;
        this.J1 = z4;
        if (z4) {
        }
        e5Var = this.parentLayout;
        if (e5Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.j0 = new FrameLayout(context);
        i10 = 3;
        if (this.J1) {
            AndroidUtilities.runOnUIThread(new wb1(this, i10), 2000L);
        }
        org.telegram.ui.ActionBar.w0 a22 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a22.F();
        a22.E = new uc1();
        a22.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.f5());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        n0 n0Var2 = new n0(this, context, 24);
        this.j0 = n0Var2;
        n0Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.j0.addView(this.actionBar, k7.b6.c(-2.0f, -1));
        org.telegram.ui.Components.rl0 rl0Var3 = new org.telegram.ui.Components.rl0(context);
        this.k0 = rl0Var3;
        rl0Var3.setVerticalScrollBarEnabled(true);
        this.k0.setItemAnimator(null);
        this.k0.setLayoutAnimation(null);
        this.k0.setLayoutManager(new f2.i0(1, false));
        final int i232 = 2;
        this.k0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.rl0 rl0Var22 = this.k0;
        i11 = this.b;
        rl0Var22.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
        final int i242 = 4;
        this.k0.setOnItemClickListener(new kh.a(i242));
        this.j0.addView(this.k0, k7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.a20 a20Var2 = new org.telegram.ui.Components.a20(context, this.resourceProvider);
        this.m0 = a20Var2;
        a20Var2.setImageResource(R.drawable.floating_pencil);
        this.j0.addView(this.m0, org.telegram.ui.Components.a20.b());
        bd1 bd1Var2 = new bd1(context);
        this.l0 = bd1Var2;
        this.k0.setAdapter(bd1Var2);
        this.q0 = new org.telegram.ui.ActionBar.r0(this, context, i10);
        this.s0 = new fd1(context, this);
        this.p0 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
        }
        ai.z(false, this.p0);
        this.p0.setActionBarMenuOnItemClick(new xc1(this));
        i12 = 0;
        while (true) {
            yc1VarArr = this.t0;
            if (i12 < 2) {
            }
            yc1VarArr[i12] = new yc1(this, (Activity) getContext());
            this.q0.addView(yc1VarArr[i12], k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i12++;
        }
        yc1 yc1Var2 = yc1VarArr[0];
        this.u0 = yc1Var2;
        yc1Var2.setVisibility(0);
        yc1VarArr[1].setVisibility(8);
        if (i11 == 2) {
        }
        z10 = this.s0.e;
        org.telegram.ui.ActionBar.i6 i6Var22 = this.b0;
        if (!z10) {
        }
        this.r0 = new ec1(context, this);
        fc1 fc1Var2 = new fc1(this);
        fc1Var2.S();
        this.r0.setItemAnimator(fc1Var2);
        this.r0.setVerticalScrollBarEnabled(true);
        this.r0.setOverScrollMode(2);
        if (i11 != 2) {
        }
        this.r0.setClipToPadding(false);
        this.r0.setLayoutManager(new f2.i0(1, true));
        this.r0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        if (i11 != 1) {
        }
        this.r0.setOnScrollListener(new n3(this, 29));
        this.q0.addView(this.p0, k7.b6.c(-2.0f, i14));
        org.telegram.ui.Components.o81 o81Var2 = new org.telegram.ui.Components.o81(context);
        this.s1 = o81Var2;
        o81Var2.b(new yb1(this, i232));
        org.telegram.ui.ActionBar.h6 h6Var2 = this.s;
        if (i11 != 1) {
        }
        if (i11 != 2) {
        }
        Rect rect22 = new Rect();
        Drawable mutate22 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.r = mutate22;
        mutate22.getPadding(rect22);
        this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.d6), PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        obj = this.y1;
        if (i11 != 1) {
        }
        if (obj instanceof ui1) {
        }
        i15 = 3;
        String[] strArr3222 = new String[i15];
        int[] iArr3222 = new int[i15];
        this.G0 = new org.telegram.ui.Components.m81[i15];
        if (i15 != 0) {
        }
        i17 = 0;
        while (true) {
            jc1Var = this.a;
            if (i17 >= i15) {
            }
            i17++;
        }
        if (i11 == 1) {
        }
        if (i11 != 1) {
        }
        this.C1 = false;
        i18 = 0;
        while (i18 < 2) {
        }
        j1();
        if (!this.u0.getImageReceiver().hasBitmapImage()) {
        }
        if (i11 != 1) {
        }
        this.r0.setAdapter(this.s0);
        ah.e eVar22 = new ah.e(this, context, 29);
        this.h0 = eVar22;
        eVar22.setWillNotDraw(false);
        ah.e eVar32 = this.h0;
        this.fragmentView = eVar32;
        ViewTreeObserver viewTreeObserver2 = eVar32.getViewTreeObserver();
        z90 z90Var2 = new z90(this, 1);
        this.N = z90Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(z90Var2);
        m2.h hVar2 = new m2.h(context);
        this.g0 = hVar2;
        int i412 = 2;
        hVar2.b(new q2(this, i412));
        this.g0.setAdapter(new eg.j1(this, i412));
        AndroidUtilities.setViewPagerEdgeEffectColor(this.g0, getThemedColor(org.telegram.ui.ActionBar.j6.s8));
        this.h0.addView(this.g0, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
        UndoView undoView2 = new UndoView(context, this);
        this.i0 = undoView2;
        undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.h0.addView(this.i0, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i11 != 0) {
        }
        if (i11 == i19) {
            X0();
        }
        this.f0 = S0();
        b1(true);
        m1(false);
        this.c = new Scroller(getContext());
        e5Var2 = this.parentLayout;
        if (e5Var2 != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            if (i11 == 2) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(org.telegram.ui.Cells.v0 v0Var) {
        float f10;
        if (this.u0 == null) {
            return;
        }
        Bitmap bitmap = this.a.r;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.u0.getMeasuredWidth() - (Math.max(this.u0.getMeasuredWidth() / width, this.u0.getMeasuredHeight() / r0.r.getHeight()) * width)) / 2.0f) + this.U1 + 0.0f;
        } else {
            f10 = this.U1 + 0.0f;
        }
        float y10 = v0Var.getY() - ((-this.u0.G) + 0.0f);
        int measuredHeight = this.u0.getMeasuredHeight();
        float f11 = this.J1 ? this.k1 * this.l1 : 0.0f;
        v0Var.t0 = true;
        v0Var.s0 = measuredHeight;
        v0Var.q0 = y10;
        v0Var.r0 = f10;
        v0Var.P1 = f11;
        v0Var.Q1.setColor(i0.a.k(-16777216, (int) (f11 * 255.0f)));
        v0Var.invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.G1 == ((Long) objArr[2]).longValue()) {
                this.S1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.rl0 rl0Var = this.k0;
            if (rl0Var == null) {
                return;
            }
            int childCount = rl0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.k0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) childAt).b0(0, true);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            ec1 ec1Var = this.r0;
            if (ec1Var != null) {
                ec1Var.e1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.q0 != null) {
                b1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.y1;
            if (obj instanceof vi1) {
                vi1 vi1Var = (vi1) obj;
                if (vi1Var.a == null) {
                    vi1Var.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j10 = 0;
        if (i10 != NotificationCenter.wallpapersDidLoad) {
            if (i10 != NotificationCenter.wallpaperSettedToUser || this.G1 == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.R0.clear();
        HashMap hashMap = this.S0;
        hashMap.clear();
        int size = arrayList.size();
        boolean z4 = false;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.R0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                org.telegram.ui.ActionBar.h6 h6Var = this.s;
                if (h6Var != null && (str = h6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.T0 = (TLRPC.TL_wallPaper) wallPaper;
                    b1(false);
                    j1();
                } else if (h6Var == null) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.T0;
                    if (tL_wallPaper2 != null) {
                        String str2 = tL_wallPaper2.slug;
                        if (str2 != null) {
                            if (!str2.equals(wallPaper.slug)) {
                            }
                        }
                    }
                }
                z4 = true;
            }
        }
        if (!z4 && (tL_wallPaper = this.T0) != null) {
            this.R0.add(0, tL_wallPaper);
        }
        hd1 hd1Var = this.N0;
        if (hd1Var != null) {
            hd1Var.l();
        }
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j10 = MediaDataController.calcHash(j10, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new cc1(this, 1)), this.classGuid);
    }

    public final void e1() {
        if (this.q0 == null || this.H0 == null || this.s.g == 0) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.x0 == null) {
            org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(getParentActivity(), 8);
            this.x0 = l40Var;
            l40Var.setShowingDuration(5000L);
            this.x0.setAlpha(0.0f);
            this.x0.setVisibility(4);
            this.x0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.x0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.h0.addView(this.x0, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        AndroidUtilities.runOnUIThread(new b11(18, this, globalMainSettings), 500L);
    }

    public final void f1(int i10, boolean z4, boolean z10) {
        int indexOf;
        boolean z11 = z4 && i10 == 1 && this.T0 != null;
        int i11 = this.b;
        if (z4) {
            if (i10 != 0) {
                this.U0 = this.T0;
                this.j1 = this.i1;
                this.N0.l();
                ArrayList arrayList = this.R0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.T0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (i11 == 2 ? 1 : 0);
                    }
                    this.O0.h1(indexOf, (this.M0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            } else if (i11 == 2) {
                this.X0 = this.W0;
                int i12 = this.Y0;
                this.b1 = i12;
                int i13 = this.Z0;
                this.c1 = i13;
                int i14 = this.a1;
                this.d1 = i14;
                this.f1 = this.L;
                this.S.f(0, 4, i14 != 0 ? 4 : i13 != 0 ? 3 : i12 != 0 ? 2 : 1, false);
                this.S.e(this.a1, 3);
                this.S.e(this.Z0, 2);
                this.S.e(this.Y0, 1);
                this.S.e(this.W0, 0);
            }
        }
        if (i11 == 1 || i11 == 2) {
            this.G0[z11 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.Q0;
            if (!j0Var.I) {
                float f10 = this.i1;
                if (f10 < 0.0f) {
                    float f11 = -f10;
                    this.i1 = f11;
                    j0Var.setProgress(f11);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.I0;
        if (!z10) {
            char c3 = i10 == 0 ? (char) 1 : (char) 0;
            if (z4) {
                frameLayoutArr[i10].setVisibility(0);
                if (i11 == 1) {
                    this.r0.setTranslationY(i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f);
                    this.G0[2].setAlpha(z11 ? 1.0f : 0.0f);
                    this.G0[0].setAlpha(z11 ? 0.0f : 1.0f);
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c3].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.S.B[1]);
                } else if (i11 == 2) {
                    this.r0.setTranslationY(AndroidUtilities.dp((this.x1 == null ? 0 : 58) + 72) + (-AndroidUtilities.dp(i10 == 0 ? 343.0f : 316.0f)) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.G0[2].setAlpha(z11 ? 1.0f : 0.0f);
                    this.G0[0].setAlpha(z11 ? 0.0f : 1.0f);
                    if (frameLayoutArr[c3].getVisibility() == 0) {
                        frameLayoutArr[c3].setAlpha(0.0f);
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[i10].setTranslationY(0.0f);
                    } else {
                        frameLayoutArr[i10].setTranslationY(0.0f);
                    }
                } else {
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c3].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.S.B[1]);
                }
            } else {
                this.r0.setTranslationY(0.0f);
                frameLayoutArr[i10].setTranslationY(r9.getMeasuredHeight());
                this.G0[0].setAlpha(1.0f);
                this.G0[2].setAlpha(1.0f);
                this.u0.setAlpha(1.0f);
            }
            if (z4 && frameLayoutArr[c3].getVisibility() == 0) {
                frameLayoutArr[c3].setAlpha(1.0f);
                frameLayoutArr[c3].setVisibility(4);
            } else if (!z4) {
                frameLayoutArr[i10].setVisibility(4);
            }
            if (i11 == 1 || i11 == 2) {
                this.G0[z11 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i10 == 1) {
                    frameLayoutArr[c3].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.o1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i15 = i10 == 0 ? 1 : 0;
        if (z4) {
            frameLayoutArr[i10].setVisibility(0);
            if (i11 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.r0, (Property<ec1, Float>) View.TRANSLATION_Y, i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                org.telegram.ui.Components.m81 m81Var = this.G0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(m81Var, (Property<org.telegram.ui.Components.m81, Float>) property, z11 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.G0[0], (Property<org.telegram.ui.Components.m81, Float>) property, z11 ? 0.0f : 1.0f));
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.S.B[1]);
            } else if (i11 == 2) {
                ec1 ec1Var = this.r0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(ec1Var, (Property<ec1, Float>) property2, AndroidUtilities.dp((this.x1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i10].getMeasuredHeight()) + (U0() ? AndroidUtilities.navigationBarHeight : 0)));
                org.telegram.ui.Components.m81 m81Var2 = this.G0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(m81Var2, (Property<org.telegram.ui.Components.m81, Float>) property3, z11 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.G0[0], (Property<org.telegram.ui.Components.m81, Float>) property3, z11 ? 0.0f : 1.0f));
                if (frameLayoutArr[i15].getVisibility() == 0) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                    frameLayoutArr[i10].setTranslationY(0.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property2, r6.getMeasuredHeight(), 0.0f));
                }
            } else {
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.S.B[1]);
            }
        } else {
            ec1 ec1Var2 = this.r0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(ec1Var2, (Property<ec1, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.m81 m81Var3 = this.G0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(m81Var3, (Property<org.telegram.ui.Components.m81, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.G0[2], (Property<org.telegram.ui.Components.m81, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.u0, (Property<yc1, Float>) property5, 1.0f));
        }
        this.o1.playTogether(arrayList2);
        this.o1.addListener(new qc1(this, z4, i15, i10, z11));
        this.o1.setInterpolator(org.telegram.ui.Components.mr.g);
        this.o1.setDuration(200L);
        this.o1.start();
    }

    public final void g1() {
        if (this.e2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (U0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.L1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.L1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int i10 = 2;
        int[] iArr = new int[2];
        this.L1.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        mc mcVar = new mc(this, getParentActivity(), canvas, (this.L1.getMeasuredWidth() / 2.0f) + f10, (this.L1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.e2 = mcVar;
        mcVar.setOnTouchListener(new oh.d(i10));
        this.f2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g2 = ofFloat;
        ofFloat.addUpdateListener(new nc(this, i10));
        this.g2.addListener(new nc1(this, 4));
        this.g2.setDuration(400L);
        this.g2.setInterpolator(org.telegram.ui.Components.ft.e);
        this.g2.start();
        frameLayout.addView(this.e2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new wb1(this, i10));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.q1;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        return this.I1 ? S0() : super.getThemeDescriptions();
    }

    public final void h1(boolean z4) {
        long j10 = this.G1;
        if (j10 > 0) {
            this.w1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
            return;
        }
        if (j10 >= 0) {
            this.w1.d(LocaleController.getString(R.string.ApplyWallpaper));
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.G1));
        int i10 = 0;
        if (chat == null) {
            this.w1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.w1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.S1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.n1 == null) {
                org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.mini_switch_lock, 0);
                this.n1 = lqVar;
                lqVar.setTopOffset(1);
            }
            spannableStringBuilder.setSpan(this.n1, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
            this.w1.c(spannableStringBuilder, z4);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.S1;
        if (tL_premium_boostsStatus2 != null) {
            this.w1.c(null, z4);
            return;
        }
        if (this.G1 >= 0 || this.Q1 || this.R1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.Q1 = true;
        getMessagesController().getBoostsController().getBoostsStats(this.G1, new bc1(this, i10));
    }

    public final void i1() {
        if (this.C1 && this.t1 == null) {
            Bitmap bitmap = this.z1;
            if (bitmap != null) {
                this.u1 = bitmap;
                this.t1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.u0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.u1 = imageReceiver.getBitmap();
                    this.t1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (!this.C1) {
            b1(false);
            return;
        }
        Bitmap bitmap2 = this.t1;
        if (bitmap2 != null) {
            this.u0.setImageBitmap(bitmap2);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.X1 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight));
    }

    public final void j1() {
        File httpFilePath;
        String name;
        int i10;
        long j10;
        File file;
        String str;
        FrameLayout frameLayout;
        Object obj = this.T0;
        if (obj == null) {
            obj = this.y1;
        }
        boolean z4 = obj instanceof TLRPC.TL_wallPaper;
        if (z4 || (obj instanceof MediaController.SearchImage)) {
            if (z4) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                file = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                j10 = tL_wallPaper.document.size;
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.E1, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i10 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i10 = searchImage.size;
                }
                j10 = i10;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.u0.invalidate();
                if (i11 == 2) {
                    if (j10 == 0 || this.G1 != 0) {
                        this.p0.setSubtitle(null);
                    } else {
                        this.p0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.G1 == 0) {
                    this.p0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.u0.invalidate();
            }
            if (this.T0 == null && (frameLayout = this.v0) != null) {
                frameLayout.setAlpha(exists ? 1.0f : 0.5f);
            }
            if (i11 == 0) {
                this.Z.setEnabled(exists);
                this.Z.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            if (i11 != 2) {
                this.f.setEnabled(exists);
                this.f.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            this.z0.setEnabled(exists);
            zc1 zc1Var = this.w1;
            if (zc1Var != null) {
                zc1Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            zc1 zc1Var2 = this.x1;
            if (zc1Var2 != null) {
                zc1Var2.setAlpha(exists ? 1.0f : 0.5f);
            }
        }
    }

    public final void k1() {
        this.u0.getImageReceiver().setAlpha(Math.abs(this.i1));
        this.u0.invalidate();
        this.M0.e1();
        if (this.i1 >= 0.0f) {
            this.u0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.u0.getImageReceiver().setBlendMode(null);
            }
            if (this.u0.getBackground() instanceof org.telegram.ui.Components.ec0) {
                this.u0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.ec0) this.u0.getBackground()).k);
            }
        }
        this.a.b(this.u0.getBackground(), this.u0.getBackground(), Float.valueOf(this.i1));
        V0();
    }

    public final void l1() {
        int i10 = this.b;
        if (i10 == 1 || i10 == 2) {
            if (this.T0 == null && (this.y1 instanceof ui1)) {
                this.G0[2].a(false, true);
            }
            this.G0[this.T0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.m81 m81Var = this.G0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(m81Var, (Property<org.telegram.ui.Components.m81, Float>) property, this.T0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.G0[0], (Property<org.telegram.ui.Components.m81, Float>) property, this.T0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new oc1(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.mr.g);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean isEnabled = this.G0[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.T0;
        if (isEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.G0[0].a(false, true);
        }
        this.G0[0].setEnabled(this.T0 != null);
        if (this.T0 != null) {
            this.G0[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G0[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int dp = (AndroidUtilities.dp(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.G0[0], (Property<org.telegram.ui.Components.m81, Float>) View.ALPHA, this.T0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.m81 m81Var2 = this.G0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(m81Var2, (Property<org.telegram.ui.Components.m81, Float>) property2, this.T0 != null ? 0.0f : dp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.G0[1], (Property<org.telegram.ui.Components.m81, Float>) property2, this.T0 == null ? -dp : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.mr.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new pc1(this));
        animatorSet2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x008e, code lost:
    
        if (r3 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r23.Y0 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(boolean z4) {
        char c3;
        char c10;
        float f10;
        hc1 hc1Var;
        boolean z10;
        int i10;
        BlendMode blendMode;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = this.b;
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (i11 >= 29) {
            if (i12 == 0) {
                i10 = h6Var != null ? (int) h6Var.l : getThemedColor(org.telegram.ui.ActionBar.j6.Pd);
            } else if (i12 == 1) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j10 = h6Var.l;
                int i13 = (int) j10;
                if (i13 != 0 || j10 == 0) {
                    if (i13 != 0) {
                        B0 = i13;
                    }
                    i10 = B0;
                }
                i10 = 0;
            } else {
                if (this.y1 instanceof ui1) {
                    i10 = this.Z0;
                }
                i10 = 0;
            }
            if (i10 == 0 || this.i1 < 0.0f) {
                this.u0.getImageReceiver().setBlendMode(null);
            } else {
                ImageReceiver imageReceiver = this.u0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
            }
        }
        int i14 = 2;
        if (this.A0 != null) {
            if (i12 != 2) {
                if (i12 == 1) {
                    int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                    long j11 = h6Var.k;
                    int i15 = (int) j11;
                    if (i15 == 0 && j11 != 0) {
                        B02 = 0;
                    } else if (i15 != 0) {
                        B02 = i15;
                    }
                }
                z10 = false;
            }
            boolean z11 = this.A0.getTag() != null;
            this.A0.setTag(z10 ? 1 : null);
            if (z11 != z10) {
                if (z10) {
                    this.A0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.E0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z4) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.E0 = animatorSet2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A0, (Property<hc1, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
                    c10 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0, (Property<hc1, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f);
                    f10 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A0, (Property<hc1, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.m81 m81Var = this.G0[0];
                    Property property = View.TRANSLATION_X;
                    c3 = 3;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(m81Var, (Property<org.telegram.ui.Components.m81, Float>) property, z10 ? AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.G0[1], (Property<org.telegram.ui.Components.m81, Float>) property, z10 ? -AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.G0[2], (Property<org.telegram.ui.Components.m81, Float>) property, z10 ? AndroidUtilities.dp(34.0f) : 0.0f));
                    this.E0.setDuration(180L);
                    this.E0.addListener(new nc1(this, i14));
                    this.E0.setInterpolator(org.telegram.ui.Components.mr.g);
                    this.E0.start();
                } else {
                    c3 = 3;
                    c10 = 4;
                    f10 = 1.0f;
                    this.A0.setAlpha(z10 ? 1.0f : 0.0f);
                    this.A0.setScaleX(z10 ? 1.0f : 0.0f);
                    this.A0.setScaleY(z10 ? 1.0f : 0.0f);
                    this.G0[0].setTranslationX(z10 ? AndroidUtilities.dp(34.0f) : 0.0f);
                    this.G0[1].setTranslationX(z10 ? -AndroidUtilities.dp(34.0f) : 0.0f);
                    this.G0[2].setTranslationX(z10 ? AndroidUtilities.dp(34.0f) : 0.0f);
                }
                hc1Var = this.B0;
                if (hc1Var == null) {
                    boolean z12 = hc1Var.getTag() != null;
                    this.B0.setTag(1);
                    if (!z12) {
                        this.B0.setVisibility(0);
                        AnimatorSet animatorSet3 = this.F0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z4) {
                            this.B0.setAlpha(1.0f);
                            this.B0.setScaleX(1.0f);
                            this.B0.setScaleY(1.0f);
                            this.H0[0].setTranslationX(-AndroidUtilities.dp(34.0f));
                            this.H0[1].setTranslationX(AndroidUtilities.dp(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.F0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.B0, (Property<hc1, Float>) View.ALPHA, f10);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.B0, (Property<hc1, Float>) View.SCALE_X, f10);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.B0, (Property<hc1, Float>) View.SCALE_Y, f10);
                        org.telegram.ui.Components.m81 m81Var2 = this.H0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(m81Var2, (Property<org.telegram.ui.Components.m81, Float>) property2, -AndroidUtilities.dp(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.H0[1], (Property<org.telegram.ui.Components.m81, Float>) property2, AndroidUtilities.dp(34.0f));
                        Animator[] animatorArr = new Animator[5];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[c3] = ofFloat7;
                        animatorArr[c10] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.F0.setDuration(180L);
                        this.F0.addListener(new nc1(this, 3));
                        this.F0.setInterpolator(org.telegram.ui.Components.mr.g);
                        this.F0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        c3 = 3;
        c10 = 4;
        f10 = 1.0f;
        hc1Var = this.B0;
        if (hc1Var == null) {
        }
    }

    public final void n1() {
        int childCount = this.M0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.M0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j5) {
                ((org.telegram.ui.Cells.j5) childAt).u(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (!Q0(z4)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z4);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var == null || e5Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        if (this.b != 2 || this.G1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        j1();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i10 = this.b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.j6.N = true;
        }
        if (i10 == 0 && this.s == null) {
            this.B1 = org.telegram.ui.ActionBar.j6.i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / AndroidUtilities.density));
            sb.append("_");
            this.D1 = android.support.v4.media.a.m((int) (max / AndroidUtilities.density), "_f", sb);
            Point point3 = AndroidUtilities.displaySize;
            this.E1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.q1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.R0 == null) {
                this.R0 = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        ah.e eVar = this.h0;
        if (eVar != null && this.N != null) {
            eVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.N);
        }
        int i10 = this.b;
        if ((i10 == 2 || i10 == 1) && this.m1 == null) {
            AndroidUtilities.runOnUIThread(new j21(4));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.t1;
            if (bitmap != null) {
                bitmap.recycle();
                this.t1 = null;
            }
            this.a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.s != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        if (this.B1) {
            this.s1.c(false);
        }
        org.telegram.ui.ActionBar.j6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        bd1 bd1Var = this.l0;
        if (bd1Var != null) {
            bd1Var.l();
        }
        fd1 fd1Var = this.s0;
        if (fd1Var != null) {
            fd1Var.l();
        }
        if (this.B1) {
            this.s1.c(true);
        }
        org.telegram.ui.ActionBar.j6.b = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        if (z4 || this.b != 2) {
            return;
        }
        this.a.b(null, null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.a.a = f6Var;
    }

    public jd1(org.telegram.ui.ActionBar.i6 i6Var, boolean z4, int i10, boolean z10, boolean z11) {
        super(null);
        this.a = new jc1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.O = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.P = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.Q = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.R = q5Var4;
        this.U = -1;
        this.V = new wb1(this, 0);
        this.t0 = new yc1[2];
        this.I0 = new FrameLayout[2];
        this.J0 = new TextView[2];
        this.K0 = new TextView[2];
        this.L0 = new FrameLayout[2];
        this.S0 = new HashMap();
        this.i1 = 0.5f;
        this.k1 = 0.0f;
        this.p1 = PorterDuff.Mode.SRC_IN;
        this.v1 = 1.0f;
        this.D1 = "640_360";
        this.E1 = 1920;
        this.H1 = true;
        this.P1 = new org.telegram.ui.Components.l20(getParentActivity(), new lc1(this));
        this.Q1 = false;
        this.R1 = false;
        this.b = i10;
        this.c0 = z11;
        this.b0 = i6Var;
        this.e0 = z4;
        this.d0 = z10;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.h6 k10 = i6Var.k(!z10);
            this.s = k10;
            if (k10 != null) {
                this.d = false;
                this.w = k10.c;
                this.x = k10.d;
                this.y = k10.e;
                this.B = k10.f;
                this.C = k10.g;
                this.D = k10.h;
                this.E = k10.i;
                this.F = k10.j;
                this.G = k10.k;
                this.H = k10.l;
                this.I = k10.m;
                this.J = k10.p;
                this.K = k10.o;
                this.L = k10.n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.h6 k11 = i6Var.k(false);
            this.s = k11;
            if (k11 != null) {
                this.T0 = k11.s;
            }
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (h6Var != null) {
            this.B1 = h6Var.q;
            if (!TextUtils.isEmpty(h6Var.o)) {
                this.i1 = this.s.p;
            }
            org.telegram.ui.ActionBar.j6.M = org.telegram.ui.ActionBar.j6.A0();
            org.telegram.ui.ActionBar.j6.O = true;
            org.telegram.ui.ActionBar.j6.P = true;
            org.telegram.ui.ActionBar.j6.t(i6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    public jd1(org.telegram.ui.ActionBar.i6 i6Var) {
        this(i6Var, false, 0, false, false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
