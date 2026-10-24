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
import java.util.HashSet;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class qc1 extends org.telegram.ui.ActionBar.o2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public FrameLayout A0;
    public gc1 A1;
    public org.telegram.ui.Components.r40 B0;
    public gc1 B1;
    public AnimatorSet C0;
    public Object C1;
    public y4 D0;
    public Bitmap D1;
    public final int E;
    public ob1 E0;
    public boolean E1;
    public final int F;
    public ob1 F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public String H1;
    public final boolean I;
    public AnimatorSet I0;
    public int I1;
    public final long J;
    public AnimatorSet J0;
    public pc1 J1;
    public final long K;
    public org.telegram.ui.Components.m91[] K0;
    public long K1;
    public final long L;
    public org.telegram.ui.Components.m91[] L0;
    public boolean L1;
    public final long M;
    public final FrameLayout[] M0;
    public boolean M1;
    public final float N;
    public final TextView[] N0;
    public boolean N1;
    public final String O;
    public final TextView[] O0;
    public org.telegram.ui.Components.yj0 O1;
    public final int P;
    public final FrameLayout[] P0;
    public org.telegram.ui.ActionBar.u0 P1;
    public long Q;
    public xa1 Q0;
    public ValueAnimator Q1;
    public t90 R;
    public oc1 R0;
    public ai.o5 R1;
    public final org.telegram.ui.ActionBar.s5 S;
    public s4.b0 S0;
    public nb1 S1;
    public final org.telegram.ui.ActionBar.s5 T;
    public org.telegram.ui.Cells.l4 T0;
    public final org.telegram.ui.Components.s20 T1;
    public final org.telegram.ui.ActionBar.s5 U;
    public org.telegram.ui.Cells.i0 U0;
    public boolean U1;
    public final org.telegram.ui.ActionBar.s5 V;
    public ArrayList V0;
    public boolean V1;
    public org.telegram.ui.Components.wq W;
    public final HashMap W0;
    public TL_stories.TL_premium_boostsStatus W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public final Runnable Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final qb1 a;
    public boolean a0;
    public int a1;
    public float a2;
    public final int b;
    public ei.g6 b0;
    public int b1;
    public boolean b2;
    public Scroller c;
    public FrameLayout c0;
    public int c1;
    public int c2;
    public final boolean d;
    public TextView d0;
    public int d1;
    public ValueAnimator d2;
    public org.telegram.ui.Components.jm e;
    public TextView e0;
    public int e1;
    public boolean e2;
    public org.telegram.ui.ActionBar.u0 f;
    public final org.telegram.ui.ActionBar.j6 f0;
    public int f1;
    public TextView f2;
    public final boolean g0;
    public int g1;
    public WeakReference g2;
    public TextView h;
    public final boolean h0;
    public int h1;
    public BitmapDrawable h2;
    public final boolean i0;
    public int i1;
    public lc i2;
    public ArrayList j0;
    public int j1;
    public float j2;
    public z4.h k0;
    public int k1;
    public ValueAnimator k2;
    public ah.v l0;
    public int l1;
    public UndoView m0;
    public float m1;
    public int n;
    public FrameLayout n0;
    public float n1;
    public org.telegram.ui.Components.mm0 o0;
    public float o1;
    public ic1 p0;
    public float p1;
    public org.telegram.ui.Components.h20 q0;
    public hc1 q1;
    public Drawable r;
    public MessageObject r0;
    public org.telegram.ui.Components.xq r1;
    public int s;
    public boolean s0;
    public AnimatorSet s1;
    public org.telegram.ui.ActionBar.k t0;
    public final PorterDuff.Mode t1;
    public org.telegram.ui.ActionBar.p0 u0;
    public int u1;
    public final org.telegram.ui.ActionBar.i6 v;
    public lb1 v0;
    public org.telegram.ui.Components.q9 v1;
    public boolean w;
    public mc1 w0;
    public org.telegram.ui.Components.o91 w1;
    public final int x;
    public final fc1[] x0;
    public Bitmap x1;
    public final int y;
    public fc1 y0;
    public Bitmap y1;
    public FrameLayout z0;
    public float z1;

    public qc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.a = new qb1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.s5 s5Var = new org.telegram.ui.ActionBar.s5(this, 0, false);
        this.S = s5Var;
        org.telegram.ui.ActionBar.s5 s5Var2 = new org.telegram.ui.ActionBar.s5(this, 0, true);
        this.T = s5Var2;
        org.telegram.ui.ActionBar.s5 s5Var3 = new org.telegram.ui.ActionBar.s5(this, 1, false);
        this.U = s5Var3;
        org.telegram.ui.ActionBar.s5 s5Var4 = new org.telegram.ui.ActionBar.s5(this, 1, true);
        this.V = s5Var4;
        this.Y = -1;
        this.Z = new db1(this, 0);
        this.x0 = new fc1[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.m1 = 0.5f;
        this.o1 = 0.0f;
        this.t1 = PorterDuff.Mode.SRC_IN;
        this.z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.s20(getParentActivity(), new sb1(this));
        this.U1 = false;
        this.V1 = false;
        this.b = 2;
        this.C1 = obj;
        this.D1 = bitmap;
        this.E1 = z10;
        if (obj instanceof zh1) {
            zh1 zh1Var = (zh1) obj;
            this.F1 = zh1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = zh1Var.g;
            this.X0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = zh1Var.h;
                this.m1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.k6.I.q()) {
                    this.m1 *= -1.0f;
                }
            }
        }
        s5Var.v = true;
        s5Var3.v = true;
        s5Var2.v = true;
        s5Var4.v = true;
    }

    public static void U(qc1 qc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (qc1Var.getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(23, qc1Var.currentAccount, qc1Var.getParentActivity(), qc1Var, qc1Var.a);
        j0Var.K1(canApplyBoost);
        j0Var.J1(qc1Var.W1, true);
        j0Var.L1(qc1Var.K1);
        if (!qc1Var.U0()) {
            j0Var.Q0 = new db1(qc1Var, 1);
        }
        qc1Var.showDialog(j0Var);
    }

    public static void V(qc1 qc1Var) {
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.M;
        if (j6Var == null) {
            return;
        }
        int i10 = j6Var.Z;
        org.telegram.ui.ActionBar.i6 k10 = i10 >= 0 ? (org.telegram.ui.ActionBar.i6) j6Var.a0.get(i10) : j6Var.k(false);
        if (qc1Var.v != null) {
            qc1Var.W0();
            org.telegram.ui.ActionBar.k6.w1(qc1Var.f0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.k6.M != null) {
                org.telegram.ui.ActionBar.k6.O = false;
                org.telegram.ui.ActionBar.k6.P = false;
                org.telegram.ui.ActionBar.k6.M = null;
            }
            org.telegram.ui.ActionBar.k6.t(qc1Var.f0, true, qc1Var.g0);
            ((ActionBarLayout) qc1Var.parentLayout).V(false, false);
        } else {
            ((ActionBarLayout) qc1Var.parentLayout).V(false, false);
            File file = new File(qc1Var.f0.b);
            org.telegram.ui.ActionBar.j6 j6Var2 = qc1Var.f0;
            org.telegram.ui.ActionBar.k6.u(file, j6Var2.a, j6Var2.F, false);
            MessagesController.getInstance(qc1Var.f0.E).saveTheme(qc1Var.f0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", qc1Var.f0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) qc1Var.getParentLayout().getFragmentStack().get(Math.max(0, qc1Var.getParentLayout().getFragmentStack().size() - 2));
        qc1Var.finishFragment();
        if (qc1Var.b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, j6Var, k10, Boolean.valueOf(qc1Var.i0));
        }
        org.telegram.ui.ActionBar.k6.J1(o2Var);
    }

    public static /* synthetic */ void W(qc1 qc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = qc1Var.W0;
        org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            qc1Var.V0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            qc1Var.V0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (i6Var != null && (str = i6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            qc1Var.X0 = tL_wallPaper2;
                            qc1Var.b1(false);
                            qc1Var.j1();
                        } else if (i6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = qc1Var.X0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (tL_wallPaper = qc1Var.X0) != null) {
                qc1Var.V0.add(0, tL_wallPaper);
            }
            oc1 oc1Var = qc1Var.R0;
            if (oc1Var != null) {
                oc1Var.l();
            }
            MessagesStorage.getInstance(qc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (qc1Var.X0 != null || i6Var == null || TextUtils.isEmpty(i6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = i6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(qc1Var.currentAccount).bindRequestToGuid(qc1Var.getConnectionsManager().sendRequest(getwallpaper, new jb1(qc1Var, 0)), qc1Var.classGuid);
    }

    public final void L0() {
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.C0 = animatorSet2;
        int i10 = 1;
        if (this.F1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<fc1, Float>) View.SCALE_X, this.z1), ObjectAnimator.ofFloat(this.y0, (Property<fc1, Float>) View.SCALE_Y, this.z1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<fc1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.y0, (Property<fc1, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.y0, (Property<fc1, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.y0, (Property<fc1, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.C0.setInterpolator(org.telegram.ui.Components.bs.g);
        this.C0.addListener(new ub1(this, i10));
        this.C0.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0400  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(boolean z10) {
        int i10;
        ?? r12;
        boolean z11;
        boolean z12;
        ?? r122;
        File file;
        boolean z13;
        Object obj;
        boolean z14;
        String str;
        int i11;
        TLRPC.TL_wallPaper tL_wallPaper;
        int i12;
        int i13;
        File file2;
        File pathToAttach;
        boolean z15;
        int i14;
        int i15;
        Object obj2;
        long j10;
        boolean z16;
        boolean z17;
        boolean z18;
        float f7;
        TLRPC.UserFull userFull;
        Object obj3;
        int i16 = 2;
        if (this.K1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                getMessagesController().getBoostsController().userCanBoostChannel(this.K1, this.W1, new gb1(this, i16));
                return;
            } else if (this.W1 == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z10) {
            showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
        String j11 = j6Var.j(null, this.G1);
        int i17 = 0;
        String j12 = this.G1 ? j6Var.j(null, false) : j11;
        File file3 = new File(ApplicationLoader.getFilesDirFixed(), j11);
        Object obj4 = this.C1;
        if (obj4 instanceof TLRPC.TL_wallPaper) {
            if (this.y1 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    i10 = 4;
                    try {
                        this.y1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                        z11 = false;
                        if (!z11) {
                        }
                        obj3 = null;
                        z12 = false;
                        r12 = obj3;
                        if (this.G1) {
                        }
                        obj = this.C1;
                        int i18 = 45;
                        if (obj instanceof TLRPC.TL_wallPaper) {
                        }
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.a = j12;
                        d6Var.b = j11;
                        d6Var.c = str;
                        d6Var.i = this.G1;
                        d6Var.j = this.F1;
                        d6Var.d = i17;
                        d6Var.e = i13;
                        d6Var.f = i12;
                        d6Var.g = i14;
                        d6Var.h = i11;
                        if (this.N1) {
                        }
                        d6Var.k = this.m1;
                        obj2 = this.C1;
                        if (obj2 instanceof zh1) {
                        }
                        j10 = this.K1;
                        d6Var.n = j10;
                        if (j10 != 0) {
                        }
                        d6Var.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, d6Var, str == null && this.K1 == 0, 0L);
                        if (z15) {
                        }
                        z17 = z16;
                        if (z17) {
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    i10 = 4;
                }
            } else {
                i10 = 4;
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
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
                z11 = false;
                if (!z11) {
                    try {
                        z11 = AndroidUtilities.copyFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(((TLRPC.TL_wallPaper) this.C1).document, true), file3);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        z11 = false;
                    }
                }
                obj3 = null;
            }
            z11 = true;
            if (!z11) {
            }
            obj3 = null;
        } else {
            i10 = 4;
            boolean z19 = obj4 instanceof zh1;
            if (!z19) {
                if (obj4 instanceof ai1) {
                    ai1 ai1Var = (ai1) obj4;
                    if (ai1Var.b != 0 || "t".equals(ai1Var.a)) {
                        r122 = 0;
                        z12 = false;
                        z13 = r122;
                    } else {
                        try {
                        } catch (Exception e12) {
                            e = e12;
                            z19 = false;
                        }
                        try {
                            if (!this.b2 || this.Y1 == this.Z1) {
                                z19 = false;
                                z19 = false;
                                File file4 = ai1Var.e;
                                file = file4 != null ? file4 : ai1Var.d;
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap((int) this.a2, this.D1.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.translate(-((this.Y1 / this.X1) * (this.D1.getWidth() - createBitmap.getWidth())), 0.0f);
                                z19 = false;
                                canvas.drawBitmap(this.D1, 0.0f, 0.0f, (Paint) null);
                                ai1Var.d = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                                FileOutputStream fileOutputStream3 = new FileOutputStream(ai1Var.d);
                                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                                fileOutputStream3.close();
                                createBitmap.recycle();
                                file = ai1Var.d;
                            }
                            z12 = file.equals(file3);
                            z13 = z19;
                            if (!z12) {
                                try {
                                    z11 = AndroidUtilities.copyFile(file, file3);
                                    r12 = z19;
                                } catch (Exception e13) {
                                    e = e13;
                                    FileLog.e(e);
                                    z11 = false;
                                    r12 = z19;
                                    if (this.G1) {
                                    }
                                    obj = this.C1;
                                    int i182 = 45;
                                    if (obj instanceof TLRPC.TL_wallPaper) {
                                    }
                                    org.telegram.ui.ActionBar.d6 d6Var2 = new org.telegram.ui.ActionBar.d6();
                                    d6Var2.a = j12;
                                    d6Var2.b = j11;
                                    d6Var2.c = str;
                                    d6Var2.i = this.G1;
                                    d6Var2.j = this.F1;
                                    d6Var2.d = i17;
                                    d6Var2.e = i13;
                                    d6Var2.f = i12;
                                    d6Var2.g = i14;
                                    d6Var2.h = i11;
                                    if (this.N1) {
                                    }
                                    d6Var2.k = this.m1;
                                    obj2 = this.C1;
                                    if (obj2 instanceof zh1) {
                                    }
                                    j10 = this.K1;
                                    d6Var2.n = j10;
                                    if (j10 != 0) {
                                    }
                                    d6Var2.o = z10;
                                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, d6Var2, str == null && this.K1 == 0, 0L);
                                    if (z15) {
                                    }
                                    z17 = z16;
                                    if (z17) {
                                    }
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            z12 = false;
                            FileLog.e(e);
                            z11 = false;
                            r12 = z19;
                            if (this.G1) {
                            }
                            obj = this.C1;
                            int i1822 = 45;
                            if (obj instanceof TLRPC.TL_wallPaper) {
                            }
                            org.telegram.ui.ActionBar.d6 d6Var22 = new org.telegram.ui.ActionBar.d6();
                            d6Var22.a = j12;
                            d6Var22.b = j11;
                            d6Var22.c = str;
                            d6Var22.i = this.G1;
                            d6Var22.j = this.F1;
                            d6Var22.d = i17;
                            d6Var22.e = i13;
                            d6Var22.f = i12;
                            d6Var22.g = i14;
                            d6Var22.h = i11;
                            if (this.N1) {
                            }
                            d6Var22.k = this.m1;
                            obj2 = this.C1;
                            if (obj2 instanceof zh1) {
                            }
                            j10 = this.K1;
                            d6Var22.n = j10;
                            if (j10 != 0) {
                            }
                            d6Var22.o = z10;
                            MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, d6Var22, str == null && this.K1 == 0, 0L);
                            if (z15) {
                            }
                            z17 = z16;
                            if (z17) {
                            }
                        }
                    }
                } else {
                    r12 = 0;
                    obj3 = null;
                    obj3 = null;
                    if (obj4 instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) obj4;
                        TLRPC.Photo photo = searchImage.photo;
                        try {
                            z11 = AndroidUtilities.copyFile(photo != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.I1, true), true) : ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg"), file3);
                        } catch (Exception e15) {
                            FileLog.e(e15);
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                }
                if (this.G1) {
                }
                obj = this.C1;
                int i18222 = 45;
                if (obj instanceof TLRPC.TL_wallPaper) {
                }
                org.telegram.ui.ActionBar.d6 d6Var222 = new org.telegram.ui.ActionBar.d6();
                d6Var222.a = j12;
                d6Var222.b = j11;
                d6Var222.c = str;
                d6Var222.i = this.G1;
                d6Var222.j = this.F1;
                d6Var222.d = i17;
                d6Var222.e = i13;
                d6Var222.f = i12;
                d6Var222.g = i14;
                d6Var222.h = i11;
                if (this.N1) {
                }
                d6Var222.k = this.m1;
                obj2 = this.C1;
                if (obj2 instanceof zh1) {
                }
                j10 = this.K1;
                d6Var222.n = j10;
                if (j10 != 0) {
                }
                d6Var222.o = z10;
                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, d6Var222, str == null && this.K1 == 0, 0L);
                if (z15) {
                }
                z17 = z16;
                if (z17) {
                }
            } else if (this.X0 != null) {
                try {
                    Bitmap bitmap2 = this.y0.getImageReceiver().getBitmap();
                    Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    if (this.d1 == 0) {
                        if (this.c1 != 0) {
                            GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.v9.d(this.i1), new int[]{this.a1, this.c1});
                            gradientDrawable.setBounds(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
                            gradientDrawable.draw(canvas2);
                        } else {
                            canvas2.drawColor(this.a1);
                        }
                    }
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
                    paint.setAlpha((int) (Math.abs(this.m1) * 255.0f));
                    canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    FileOutputStream fileOutputStream4 = new FileOutputStream(file3);
                    if (this.d1 != 0) {
                        createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream4);
                    } else {
                        createBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                    }
                    fileOutputStream4.close();
                    z12 = false;
                    z11 = true;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    z11 = false;
                    z12 = false;
                }
                r12 = 0;
                if (this.G1) {
                    try {
                        FileOutputStream fileOutputStream5 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), j12));
                        this.x1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                        fileOutputStream5.close();
                        z11 = true;
                    } catch (Throwable th3) {
                        FileLog.e(th3);
                        z11 = false;
                    }
                }
                obj = this.C1;
                int i182222 = 45;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    str = tL_wallPaper.slug;
                    z14 = z12;
                    i13 = 0;
                    file2 = r12;
                    i11 = 45;
                    z15 = z11;
                    i14 = 0;
                    i12 = 0;
                } else if (obj instanceof zh1) {
                    if ("d".equals(((zh1) obj).a)) {
                        i15 = 0;
                        i12 = 0;
                        i13 = 0;
                        str = "d";
                    } else {
                        TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                        String str2 = tL_wallPaper2 != null ? tL_wallPaper2.slug : "c";
                        int i19 = this.a1;
                        i13 = this.c1;
                        i12 = this.d1;
                        i15 = this.e1;
                        i182222 = this.i1;
                        i17 = i19;
                        str = str2;
                    }
                    int i20 = i182222;
                    z15 = z11;
                    i14 = i15;
                    i11 = i20;
                    z14 = z12;
                    tL_wallPaper = null;
                    file2 = null;
                } else {
                    if (obj instanceof ai1) {
                        ai1 ai1Var2 = (ai1) obj;
                        str = ai1Var2.a;
                        pathToAttach = ai1Var2.d;
                    } else if (obj instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage2 = (MediaController.SearchImage) obj;
                        TLRPC.Photo photo2 = searchImage2.photo;
                        pathToAttach = photo2 != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.I1, true), true) : ImageLoader.getHttpFilePath(searchImage2.imageUrl, "jpg");
                        str = "";
                    } else {
                        z14 = z12;
                        str = "d";
                        i11 = 45;
                        tL_wallPaper = null;
                        i17 = 0;
                        i12 = 0;
                        i13 = 0;
                        file2 = null;
                        z15 = z11;
                        i14 = 0;
                    }
                    file2 = pathToAttach;
                    z14 = z12;
                    i11 = 45;
                    tL_wallPaper = null;
                    i17 = 0;
                    i12 = 0;
                    i13 = 0;
                    z15 = z11;
                    i14 = 0;
                }
                org.telegram.ui.ActionBar.d6 d6Var2222 = new org.telegram.ui.ActionBar.d6();
                d6Var2222.a = j12;
                d6Var2222.b = j11;
                d6Var2222.c = str;
                d6Var2222.i = this.G1;
                d6Var2222.j = this.F1;
                d6Var2222.d = i17;
                d6Var2222.e = i13;
                d6Var2222.f = i12;
                d6Var2222.g = i14;
                d6Var2222.h = i11;
                if (this.N1) {
                    float f10 = this.o1;
                    if (f10 >= 0.0f) {
                        d6Var2222.k = f10;
                        obj2 = this.C1;
                        if (obj2 instanceof zh1) {
                            zh1 zh1Var = (zh1) obj2;
                            String str3 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                            float f11 = zh1Var.h;
                            if (f11 < 0.0f && !org.telegram.ui.ActionBar.k6.I.q()) {
                                f11 *= -1.0f;
                            }
                            if (zh1Var.l != null && zh1Var.b == i17 && zh1Var.c == i13 && zh1Var.d == i12 && zh1Var.e == i14 && TextUtils.equals(zh1Var.a, str3) && zh1Var.f == i11 && (this.X0 == null || Math.abs(f11 - this.m1) < 0.001f)) {
                                TLRPC.WallPaper wallPaper = zh1Var.l;
                                d6Var2222.l = wallPaper.id;
                                d6Var2222.m = wallPaper.access_hash;
                            }
                        }
                        j10 = this.K1;
                        d6Var2222.n = j10;
                        if (j10 != 0 && (userFull = getMessagesController().getUserFull(this.K1)) != null) {
                            d6Var2222.t = userFull.wallpaper;
                        }
                        d6Var2222.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, d6Var2222, str == null && this.K1 == 0, 0L);
                        if (z15) {
                            z16 = true;
                        } else {
                            if (this.K1 != 0) {
                                if (file2 == null || getMessagesController().uploadingWallpaperInfo != d6Var2222) {
                                    z18 = false;
                                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.K1, null, d6Var2222, this.r0, new ah.j(23));
                                } else {
                                    tL_wallPaper = new TLRPC.TL_wallPaper();
                                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                    tL_wallPaper.settings = tL_wallPaperSettings;
                                    tL_wallPaperSettings.intensity = (int) (d6Var2222.k * 100.0f);
                                    tL_wallPaperSettings.blur = d6Var2222.i;
                                    tL_wallPaperSettings.motion = d6Var2222.j;
                                    tL_wallPaper.uploadingImage = file2.getAbsolutePath();
                                    Bitmap createBitmap3 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                    Canvas canvas3 = new Canvas(createBitmap3);
                                    float max = Math.max(50.0f / this.y0.getMeasuredWidth(), 50.0f / this.y0.getMeasuredHeight());
                                    canvas3.scale(max, max);
                                    if (this.y0.getMeasuredHeight() > this.y0.getMeasuredWidth()) {
                                        f7 = 0.0f;
                                        canvas3.translate(0.0f, (-(this.y0.getMeasuredHeight() - this.y0.getMeasuredWidth())) / 2.0f);
                                    } else {
                                        f7 = 0.0f;
                                        canvas3.translate((-(this.y0.getMeasuredWidth() - this.y0.getMeasuredHeight())) / 2.0f, 0.0f);
                                    }
                                    float f12 = this.o1;
                                    this.o1 = f7;
                                    this.y0.draw(canvas3);
                                    this.o1 = f12;
                                    Utilities.blurBitmap(createBitmap3, 3);
                                    tL_wallPaper.stripedThumb = createBitmap3;
                                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                    tL_messageService.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
                                    tL_messageService.dialog_id = this.K1;
                                    tL_messageService.unread = true;
                                    tL_messageService.out = true;
                                    int newMessageId = getUserConfig().getNewMessageId();
                                    tL_messageService.id = newMessageId;
                                    tL_messageService.local_id = newMessageId;
                                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.K1));
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
                                        tL_peerUser2.user_id = this.K1;
                                    }
                                    tL_messageService.flags |= 256;
                                    tL_messageService.date = getConnectionsManager().getCurrentTime();
                                    TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                                    tL_messageService.action = tL_messageActionSetChatWallPaper;
                                    tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper;
                                    tL_messageActionSetChatWallPaper.for_both = z10;
                                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                                    arrayList.add(new MessageObject(this.currentAccount, tL_messageService, false, false));
                                    new ArrayList().add(tL_messageService);
                                    MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.K1, arrayList, 0);
                                    if (this.K1 >= 0) {
                                        TLRPC.UserFull userFull2 = getMessagesController().getUserFull(this.K1);
                                        if (userFull2 != null) {
                                            userFull2.wallpaper = tL_wallPaper;
                                            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.K1), userFull2);
                                        }
                                    } else {
                                        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.K1);
                                        if (chatFull != null) {
                                            chatFull.wallpaper = tL_wallPaper;
                                            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                                            int i21 = NotificationCenter.chatInfoDidLoad;
                                            z18 = false;
                                            Object[] objArr = new Object[i10];
                                            objArr[0] = chatFull;
                                            objArr[1] = 0;
                                            Boolean bool = Boolean.FALSE;
                                            objArr[2] = bool;
                                            objArr[3] = bool;
                                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i21, objArr);
                                        }
                                    }
                                    z18 = false;
                                }
                                this.e2 = true;
                                pc1 pc1Var = this.J1;
                                if (pc1Var != null) {
                                    pc1Var.a(tL_wallPaper);
                                }
                                finishFragment();
                                z17 = z18;
                                if (z17) {
                                    pc1 pc1Var2 = this.J1;
                                    if (pc1Var2 != null) {
                                        pc1Var2.a(tL_wallPaper);
                                    }
                                    finishFragment();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.ActionBar.k6.c0 = getThemedColor(org.telegram.ui.ActionBar.k6.lc);
                            org.telegram.ui.ActionBar.k6.I.v("t".equals(d6Var2222.c) ? null : d6Var2222);
                            z16 = true;
                            org.telegram.ui.ActionBar.k6.r1(true);
                            if (!z14) {
                                ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                            }
                        }
                        z17 = z16;
                        if (z17) {
                        }
                    }
                }
                d6Var2222.k = this.m1;
                obj2 = this.C1;
                if (obj2 instanceof zh1) {
                }
                j10 = this.K1;
                d6Var2222.n = j10;
                if (j10 != 0) {
                    d6Var2222.t = userFull.wallpaper;
                }
                d6Var2222.o = z10;
                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, d6Var2222, str == null && this.K1 == 0, 0L);
                if (z15) {
                }
                z17 = z16;
                if (z17) {
                }
            } else {
                r122 = 0;
                z12 = false;
                z13 = r122;
            }
            z11 = true;
            r12 = z13;
            if (this.G1) {
            }
            obj = this.C1;
            int i1822222 = 45;
            if (obj instanceof TLRPC.TL_wallPaper) {
            }
            org.telegram.ui.ActionBar.d6 d6Var22222 = new org.telegram.ui.ActionBar.d6();
            d6Var22222.a = j12;
            d6Var22222.b = j11;
            d6Var22222.c = str;
            d6Var22222.i = this.G1;
            d6Var22222.j = this.F1;
            d6Var22222.d = i17;
            d6Var22222.e = i13;
            d6Var22222.f = i12;
            d6Var22222.g = i14;
            d6Var22222.h = i11;
            if (this.N1) {
            }
            d6Var22222.k = this.m1;
            obj2 = this.C1;
            if (obj2 instanceof zh1) {
            }
            j10 = this.K1;
            d6Var22222.n = j10;
            if (j10 != 0) {
            }
            d6Var22222.o = z10;
            MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, d6Var22222, str == null && this.K1 == 0, 0L);
            if (z15) {
            }
            z17 = z16;
            if (z17) {
            }
        }
        z12 = false;
        r12 = obj3;
        if (this.G1) {
        }
        obj = this.C1;
        int i18222222 = 45;
        if (obj instanceof TLRPC.TL_wallPaper) {
        }
        org.telegram.ui.ActionBar.d6 d6Var222222 = new org.telegram.ui.ActionBar.d6();
        d6Var222222.a = j12;
        d6Var222222.b = j11;
        d6Var222222.c = str;
        d6Var222222.i = this.G1;
        d6Var222222.j = this.F1;
        d6Var222222.d = i17;
        d6Var222222.e = i13;
        d6Var222222.f = i12;
        d6Var222222.g = i14;
        d6Var222222.h = i11;
        if (this.N1) {
        }
        d6Var222222.k = this.m1;
        obj2 = this.C1;
        if (obj2 instanceof zh1) {
        }
        j10 = this.K1;
        d6Var222222.n = j10;
        if (j10 != 0) {
        }
        d6Var222222.o = z10;
        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, d6Var222222, str == null && this.K1 == 0, 0L);
        if (z15) {
        }
        z17 = z16;
        if (z17) {
        }
    }

    public final void N0(boolean z10) {
        int i10 = this.b;
        if (i10 == 2) {
            if (z10) {
                return;
            }
            finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.k6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        if (i10 == 1) {
            if (this.h0) {
                i6Var.c = this.x;
                i6Var.d = this.y;
                i6Var.e = this.E;
                i6Var.f = this.F;
                i6Var.g = this.G;
                i6Var.h = this.H;
                i6Var.i = this.I;
                i6Var.j = this.J;
                i6Var.k = this.K;
                i6Var.l = this.L;
                i6Var.m = this.M;
                i6Var.n = this.P;
                i6Var.o = this.O;
                i6Var.p = this.N;
            }
            org.telegram.ui.ActionBar.k6.w1(this.f0, false, true, false, false, false);
        } else {
            if (i6Var != null) {
                org.telegram.ui.ActionBar.k6.w1(this.f0, false, this.i0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).V(false, false);
            if (this.i0) {
                org.telegram.ui.ActionBar.j6 j6Var = this.f0;
                if (j6Var.b != null && org.telegram.ui.ActionBar.k6.H.get(j6Var.m()) == null) {
                    new File(j6Var.b).delete();
                }
            }
        }
        if (z10) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable O0(Drawable drawable) {
        WeakReference weakReference = this.g2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.h2;
        }
        WeakReference weakReference2 = this.g2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.g2 = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.h2 = null;
            return null;
        }
        this.g2 = new WeakReference(drawable);
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
        this.h2 = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.h2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r0.q == r6.F1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.p == r6.m1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P0(boolean z10) {
        if (this.b == 1) {
            org.telegram.ui.ActionBar.i6 i6Var = this.v;
            if (i6Var.c == this.x && i6Var.d == this.y && i6Var.e == this.E && i6Var.f == this.F && i6Var.g == this.G && i6Var.h == this.H && i6Var.i == this.I && i6Var.j == this.J && i6Var.k == this.K && i6Var.l == this.L && i6Var.m == this.M && Math.abs(i6Var.p - this.N) <= 0.001f && i6Var.n == this.P) {
                String str = i6Var.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                    }
                    if (tL_wallPaper2 != null) {
                    }
                }
            }
            if (!z10) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.SaveChangesAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.SaveChangesAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new fb1(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new fb1(this, 4));
            showDialog(alertDialog$Builder.a);
            return false;
        }
        return true;
    }

    public final void Q0() {
        int themedColor;
        org.telegram.ui.Components.jm jmVar = this.e;
        int i10 = 0;
        if (jmVar != null) {
            jmVar.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
            this.e.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        y4 y4Var = this.D0;
        if (y4Var != null) {
            y4Var.invalidate();
        }
        if (this.q1 != null) {
            org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
            if (h5Var == null || h5Var.getBottomSheet() == null) {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
            } else {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
                if (this.b == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
        }
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr = this.K0;
                if (i11 >= m91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m91 m91Var = m91VarArr[i11];
                if (m91Var != null) {
                    m91Var.invalidate();
                }
                i11++;
            }
        }
        if (this.L0 != null) {
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr2 = this.L0;
                if (i10 >= m91VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.m91 m91Var2 = m91VarArr2[i10];
                if (m91Var2 != null) {
                    m91Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = this.f2;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, this.a);
        }
        org.telegram.ui.Components.wq wqVar = this.W;
        if (wqVar != null) {
            wqVar.invalidate();
        }
        org.telegram.ui.Components.h20 h20Var = this.q0;
        if (h20Var != null) {
            h20Var.updateColors();
        }
    }

    public final int R0() {
        return ChatObject.isChannelAndNotMegaGroup(-this.K1, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        i6 i6Var = new i6(24, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.k0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.t0, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.t0, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.E8));
        org.telegram.ui.Components.wq wqVar = this.W;
        int i10 = 2;
        if (wqVar != null) {
            org.telegram.ui.ActionBar.u0 u0Var = wqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = wqVar.E;
            for (int i11 = 0; i11 < editTextBoldCursorArr.length; i11++) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i11], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i11], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i11], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(wqVar.F, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
            if (u0Var != null) {
                org.telegram.ui.Components.z6 z6Var = new org.telegram.ui.Components.z6(wqVar, i10);
                arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, org.telegram.ui.ActionBar.k6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, org.telegram.ui.ActionBar.k6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, org.telegram.ui.ActionBar.k6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (frameLayoutArr != null) {
            for (int i12 = 0; i12 < frameLayoutArr.length; i12++) {
            }
            for (int i13 = 0; i13 < this.P0.length; i13++) {
            }
            for (int i14 = 0; i14 < this.O0.length; i14++) {
            }
            for (int i15 = 0; i15 < this.N0.length; i15++) {
            }
            org.telegram.ui.ActionBar.s5 s5Var = this.S;
            org.telegram.ui.ActionBar.s5 s5Var2 = this.U;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{s5Var, s5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{s5Var, s5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{s5Var, s5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.cb));
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.ActionBar.t6) arrayList.get(i16)).n = this.a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int D0;
        long j10;
        if (this.h0) {
            return false;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.J;
            if (j11 == 0) {
                int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Nd);
                int i11 = (int) i6Var.j;
                if (i11 == 0) {
                    i11 = D02;
                }
                if (i11 != D02) {
                    return true;
                }
            } else if (j11 != i6Var.j) {
                return true;
            }
            long j12 = this.K;
            long j13 = this.M;
            long j14 = this.L;
            if (j12 == 0 && j14 == 0 && j13 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                        j10 = i6Var.k;
                    } else if (i12 == 1) {
                        D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                        j10 = i6Var.l;
                    } else {
                        D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                        j10 = i6Var.m;
                    }
                    int i13 = (int) j10;
                    if (i13 == 0 && j10 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = D0;
                    }
                    if (i13 != D0) {
                        return true;
                    }
                }
            } else if (j12 != i6Var.k || j14 != i6Var.l || j13 != i6Var.m) {
                return true;
            }
            if (i6Var.n != this.P) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.x != i6Var.d) {
                return true;
            }
            int i14 = this.E;
            if (i14 == 0) {
                int i15 = i6Var.e;
                if (i15 != 0 && i15 != i6Var.c) {
                    return true;
                }
            } else if (i14 != i6Var.e) {
                return true;
            }
            int i16 = this.F;
            if (i16 != 0) {
                if (i16 != i6Var.f) {
                    return true;
                }
            } else if (i6Var.f != 0) {
                return true;
            }
            int i17 = this.G;
            if (i17 != 0) {
                if (i17 != i6Var.g) {
                    return true;
                }
            } else if (i6Var.g != 0) {
                return true;
            }
            int i18 = this.H;
            if (i18 != 0) {
                if (i18 != i6Var.h) {
                    return true;
                }
            } else if (i6Var.h != 0) {
                return true;
            }
            if (this.I != i6Var.i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        return (h5Var == null || h5Var.getBottomSheet() == null) ? false : true;
    }

    public final void V0() {
        ai.o5 o5Var = this.R1;
        if (o5Var != null) {
            o5Var.invalidate();
        }
        FrameLayout frameLayout = this.z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.z0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.A0.getChildAt(i11).invalidate();
            }
        }
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr = this.K0;
                if (i12 >= m91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m91 m91Var = m91VarArr[i12];
                if (m91Var != null) {
                    m91Var.setDimAmount(this.N1 ? this.o1 * this.p1 : 0.0f);
                    this.K0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.o0 != null) {
            for (int i13 = 0; i13 < this.o0.getChildCount(); i13++) {
                View childAt = this.o0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.v0 != null) {
            for (int i14 = 0; i14 < this.v0.getChildCount(); i14++) {
                View childAt2 = this.v0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        gc1 gc1Var = this.A1;
        if (gc1Var != null) {
            gc1Var.invalidate();
        }
        gc1 gc1Var2 = this.B1;
        if (gc1Var2 != null) {
            gc1Var2.invalidate();
        }
        y4 y4Var = this.D0;
        if (y4Var != null) {
            y4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        if (i6Var == null || TextUtils.isEmpty(i6Var.o)) {
            return;
        }
        try {
            File d = i6Var.d();
            Drawable background = this.y0.getBackground();
            Bitmap bitmap = this.y0.getImageReceiver().getBitmap();
            if (background instanceof org.telegram.ui.Components.yc0) {
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
            paint.setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
            paint.setAlpha((int) (this.m1 * 255.0f));
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

    public final void Y0(int i10, boolean z10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        int i11;
        int i12;
        if (getParentActivity() == null || this.n == i10 || this.s1 != null || (i6Var = this.v) == null) {
            return;
        }
        if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.k6.b1() || i6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChangeChatBackground);
            if (!org.telegram.ui.ActionBar.k6.b1() || (org.telegram.ui.ActionBar.k6.b1() && org.telegram.ui.ActionBar.k6.I.i0.d != 0)) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ChangeColorToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fb1(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new fb1(this, 6));
            } else {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new fb1(this, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(alertDialog$Builder.a);
            return;
        }
        int i13 = this.n;
        this.n = i10;
        if (i10 == 1) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            int i14 = i6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.wq wqVar = this.W;
            T0(1);
            wqVar.f(1, 2, i14, false);
            this.W.e(i6Var.c, 0);
            int i15 = i6Var.d;
            if (i15 != 0) {
                this.W.e(i15, 1);
            }
            if (i13 == 2 || (i13 == 3 && i6Var.g != 0)) {
                this.w0.u(0);
            }
        } else if (i10 == 2) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Nd);
            int i16 = org.telegram.ui.ActionBar.k6.Od;
            int themedColor2 = org.telegram.ui.ActionBar.k6.e1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.k6.Pd;
            int themedColor3 = org.telegram.ui.ActionBar.k6.e1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.k6.Qd;
            int themedColor4 = org.telegram.ui.ActionBar.k6.e1(i18) ? getThemedColor(i18) : 0;
            long j10 = i6Var.k;
            int i19 = (int) j10;
            if (i19 == 0 && j10 != 0) {
                themedColor2 = 0;
            }
            long j11 = i6Var.l;
            int i20 = (int) j11;
            if (i20 == 0 && j11 != 0) {
                themedColor3 = 0;
            }
            long j12 = i6Var.m;
            int i21 = (int) j12;
            if (i21 == 0 && j12 != 0) {
                themedColor4 = 0;
            }
            int i22 = (int) i6Var.j;
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
            org.telegram.ui.Components.wq wqVar2 = this.W;
            T0(2);
            wqVar2.f(2, 4, i12, false);
            org.telegram.ui.Components.wq wqVar3 = this.W;
            if (i21 == 0) {
                i21 = themedColor4;
            }
            wqVar3.e(i21, 3);
            org.telegram.ui.Components.wq wqVar4 = this.W;
            if (i11 != 0) {
                themedColor3 = i11;
            }
            wqVar4.e(themedColor3, 2);
            org.telegram.ui.Components.wq wqVar5 = this.W;
            if (i19 == 0) {
                i19 = themedColor2;
            }
            wqVar5.e(i19, 1);
            org.telegram.ui.Components.wq wqVar6 = this.W;
            if (i22 != 0) {
                themedColor = i22;
            }
            wqVar6.e(themedColor, 0);
            if (i13 == 1 || i6Var.g == 0) {
                this.w0.o(0);
            } else {
                this.w0.m(0);
            }
            this.v0.v0(0, AndroidUtilities.dp(60.0f), null);
        } else if (i10 == 3) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            int i23 = i6Var.f != 0 ? i6Var.h != 0 ? 4 : i6Var.g != 0 ? 3 : 2 : 1;
            org.telegram.ui.Components.wq wqVar7 = this.W;
            T0(3);
            wqVar7.f(2, 4, i23, true);
            this.W.e(i6Var.h, 3);
            this.W.e(i6Var.g, 2);
            this.W.e(i6Var.f, 1);
            org.telegram.ui.Components.wq wqVar8 = this.W;
            int i24 = i6Var.e;
            if (i24 == 0) {
                i24 = i6Var.c;
            }
            wqVar8.e(i24, 0);
            this.L0[1].b(0, i6Var.e);
            this.L0[1].b(1, i6Var.f);
            this.L0[1].b(2, i6Var.g);
            this.L0[1].b(3, i6Var.h);
            if (i6Var.g != 0) {
                if (i13 == 1) {
                    this.w0.o(0);
                } else {
                    this.w0.m(0);
                }
            } else if (i13 == 2) {
                this.w0.u(0);
            }
            this.v0.v0(0, AndroidUtilities.dp(60.0f), null);
            e1();
        }
        if (i10 != 1 && i10 != 3) {
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
            return;
        }
        if (i13 == 2 && this.M0[1].getVisibility() == 0) {
            f1(0, true, true);
        }
        if (i10 != 1) {
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
        } else if (this.f0.q()) {
            this.W.setMinBrightness(0.2f);
        } else {
            this.W.setMinBrightness(0.05f);
            this.W.setMaxBrightness(0.8f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper = (i10 < 0 || i10 >= this.V0.size()) ? this.Z0 : (TLRPC.TL_wallPaper) this.V0.get(i10);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.d2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d2.cancel();
        }
        fc1[] fc1VarArr = this.x0;
        fc1 fc1Var = fc1VarArr[0];
        fc1 fc1Var2 = fc1VarArr[1];
        fc1VarArr[0] = fc1Var2;
        fc1VarArr[1] = fc1Var;
        this.u0.removeView(fc1Var2);
        this.u0.addView(fc1VarArr[0], this.u0.indexOfChild(fc1VarArr[1]) + 1);
        fc1 fc1Var3 = fc1VarArr[0];
        this.y0 = fc1Var3;
        fc1Var3.setBackground(fc1VarArr[1].getBackground());
        k1();
        fc1VarArr[1].setVisibility(0);
        fc1VarArr[1].setAlpha(1.0f);
        this.y0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d2 = ofFloat;
        ofFloat.addUpdateListener(new ui(2, this));
        this.d2.addListener(new ub1(this, 0));
        this.d2.setInterpolator(org.telegram.ui.Components.bs.f);
        this.d2.setDuration(300L);
        this.d2.start();
        this.y0.getImageReceiver().setCrossfadeDuration(300);
        this.y0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.H1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.y0.d();
        this.X0 = tL_wallPaper;
        this.F1 = this.K0[2].s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.yc0 yc0Var;
        if (i11 == 0) {
            this.a1 = i10;
        } else if (i11 == 1) {
            this.c1 = i10;
        } else if (i11 == 2) {
            this.d1 = i10;
        } else if (i11 == 3) {
            this.e1 = i10;
        }
        m1(z10);
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr = this.K0;
                if (i12 >= m91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m91 m91Var = m91VarArr[i12];
                if (m91Var != null) {
                    m91Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.d1 != 0) {
            if (this.U0 != null && org.telegram.ui.ActionBar.k6.I.q()) {
                this.U0.setTwoSided(true);
            }
            Drawable background = this.y0.getBackground();
            if (background instanceof org.telegram.ui.Components.yc0) {
                yc0Var = (org.telegram.ui.Components.yc0) background;
            } else {
                yc0Var = new org.telegram.ui.Components.yc0();
                yc0Var.q(this.y0);
                if (this.E1) {
                    yc0Var.m(false);
                }
            }
            yc0Var.n(this.a1, this.c1, this.d1, this.e1);
            this.y0.setBackground(yc0Var);
            this.k1 = yc0Var.f();
            this.l1 = 754974720;
        } else if (this.c1 != 0) {
            this.y0.setBackground(new GradientDrawable(org.telegram.ui.Components.v9.d(this.i1), new int[]{this.a1, this.c1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.a1, this.c1));
            this.l1 = patternColor;
            this.k1 = patternColor;
        } else {
            this.y0.setBackgroundColor(this.a1);
            int patternColor2 = AndroidUtilities.getPatternColor(this.a1);
            this.l1 = patternColor2;
            this.k1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.k6.lc;
        boolean e12 = org.telegram.ui.ActionBar.k6.e1(i13);
        qb1 qb1Var = this.a;
        if (!e12 || (this.y0.getBackground() instanceof org.telegram.ui.Components.yc0)) {
            qb1Var.j(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        } else if (org.telegram.ui.ActionBar.k6.t0() instanceof org.telegram.ui.Components.yc0) {
            getThemedColor(i13);
            qb1Var.j(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        }
        ImageView imageView = this.G0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.ic, qb1Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.H0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.ic, qb1Var, PorterDuff.Mode.MULTIPLY);
        }
        fc1 fc1Var = this.y0;
        if (fc1Var != null) {
            fc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
            this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
            this.y0.invalidate();
            if (org.telegram.ui.ActionBar.k6.I.q() && (this.y0.getBackground() instanceof org.telegram.ui.Components.yc0)) {
                org.telegram.ui.Cells.i0 i0Var = this.U0;
                if (i0Var != null) {
                    i0Var.setTwoSided(true);
                }
                if (this.m1 < 0.0f) {
                    this.y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.yc0) this.y0.getBackground()).k);
                }
            } else {
                this.y0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.i0 i0Var2 = this.U0;
                if (i0Var2 != null) {
                    i0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.i0 i0Var3 = this.U0;
            if (i0Var3 != null) {
                i0Var3.setProgress(this.m1);
            }
        }
        lb1 lb1Var = this.v0;
        if (lb1Var != null) {
            lb1Var.g1();
        }
        FrameLayout frameLayout = this.z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.z0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.A0.getChildAt(i15).invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(boolean z10) {
        ColorDrawable colorDrawable;
        org.telegram.ui.Components.yc0 yc0Var;
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        int i10 = this.b;
        if (i10 == 0 && i6Var == null) {
            this.y0.setBackground(org.telegram.ui.ActionBar.k6.s0());
        } else {
            if (i10 == 2) {
                Object obj = this.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z10 ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    BitmapDrawable bitmapDrawable = closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null;
                    fc1 fc1Var = this.y0;
                    fc1Var.a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.H1, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    fc1Var.d();
                } else if (obj instanceof zh1) {
                    zh1 zh1Var = (zh1) obj;
                    int i11 = zh1Var.f;
                    int i12 = zh1Var.e;
                    int i13 = zh1Var.d;
                    int i14 = zh1Var.c;
                    int i15 = zh1Var.b;
                    this.i1 = i11;
                    a1(i15, 0, false);
                    if (i14 != 0) {
                        a1(i14, 1, false);
                    }
                    a1(i13, 2, false);
                    a1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        fc1 fc1Var2 = this.y0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.X0;
                        fc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(zh1Var.a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.y0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.yc0.g(i15, i14, i13, i12)));
                    }
                } else if (obj instanceof ai1) {
                    Bitmap bitmap = this.D1;
                    if (bitmap != null) {
                        this.y0.setImageBitmap(bitmap);
                    } else {
                        ai1 ai1Var = (ai1) obj;
                        File file = ai1Var.e;
                        if (file != null) {
                            this.y0.g(file.getAbsolutePath(), this.H1, null);
                        } else {
                            File file2 = ai1Var.d;
                            if (file2 != null) {
                                this.y0.g(file2.getAbsolutePath(), this.H1, null);
                            } else if ("t".equals(ai1Var.a)) {
                                fc1 fc1Var3 = this.y0;
                                fc1Var3.setImageDrawable(org.telegram.ui.ActionBar.k6.Y0(fc1Var3, false));
                            } else {
                                int i16 = ai1Var.b;
                                if (i16 != 0) {
                                    this.y0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.I1, true);
                        TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize3 != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize3 : null;
                        this.y0.k(ImageLocation.getForPhoto(photoSize, searchImage.photo), this.H1, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, searchImage.photo), "100_100_b", photoSize != null ? photoSize.size : 0, "jpg", searchImage, 1);
                    } else {
                        fc1 fc1Var4 = this.y0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.H1;
                        String str4 = searchImage.thumbUrl;
                        fc1Var4.getClass();
                        fc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (i6Var == null) {
                this.y0.setBackground(org.telegram.ui.ActionBar.k6.s0());
            } else {
                org.telegram.ui.Components.q9 q9Var = this.v1;
                if (q9Var != null) {
                    q9Var.dispose();
                    this.v1 = null;
                }
                int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Nd);
                int i17 = (int) i6Var.j;
                if (i17 != 0) {
                    D0 = i17;
                }
                int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                long j10 = i6Var.k;
                int i18 = (int) j10;
                if (i18 == 0 && j10 != 0) {
                    D02 = 0;
                } else if (i18 != 0) {
                    D02 = i18;
                }
                int D03 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                long j11 = i6Var.l;
                int i19 = (int) j11;
                if (i19 == 0 && j11 != 0) {
                    D03 = 0;
                } else if (i19 != 0) {
                    D03 = i19;
                }
                int D04 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                long j12 = i6Var.m;
                int i20 = (int) j12;
                if (i20 == 0 && j12 != 0) {
                    D04 = 0;
                } else if (i20 != 0) {
                    D04 = i20;
                }
                if (TextUtils.isEmpty(i6Var.o) || org.telegram.ui.ActionBar.k6.b1()) {
                    Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.yc0) {
                            ((org.telegram.ui.Components.yc0) t02).q(this.y0);
                        }
                        this.y0.setBackground(t02);
                    }
                } else {
                    if (D03 != 0) {
                        Drawable background = this.y0.getBackground();
                        if (background instanceof org.telegram.ui.Components.yc0) {
                            yc0Var = (org.telegram.ui.Components.yc0) background;
                        } else {
                            org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0();
                            yc0Var2.q(this.y0);
                            yc0Var = yc0Var2;
                            if (this.E1) {
                                yc0Var2.m(false);
                                yc0Var = yc0Var2;
                            }
                        }
                        yc0Var.n(D0, D02, D03, D04);
                        colorDrawable = yc0Var;
                    } else if (D02 != 0) {
                        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(org.telegram.ui.Components.v9.d(i6Var.n), new int[]{D0, D02});
                        this.v1 = v9Var.f(ki.t1.Q(0.5f, 3), new yb1(this, 0), 100L);
                        colorDrawable = v9Var;
                    } else {
                        colorDrawable = new ColorDrawable(D0);
                    }
                    this.y0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.X0;
                    if (tL_wallPaper4 != null) {
                        fc1 fc1Var5 = this.y0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.X0;
                        fc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                }
                if (D02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(D0);
                    this.l1 = patternColor;
                    this.k1 = patternColor;
                } else if (D03 != 0) {
                    this.k1 = org.telegram.ui.Components.yc0.g(D0, D02, D03, D04);
                    this.l1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(D0, D02));
                    this.l1 = patternColor2;
                    this.k1 = patternColor2;
                }
                fc1 fc1Var6 = this.y0;
                if (fc1Var6 != null) {
                    fc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
                    this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
                    this.y0.invalidate();
                    if (org.telegram.ui.ActionBar.k6.I.q() && (this.y0.getBackground() instanceof org.telegram.ui.Components.yc0)) {
                        org.telegram.ui.Cells.i0 i0Var = this.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                        if (this.m1 < 0.0f) {
                            this.y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.yc0) this.y0.getBackground()).k);
                        }
                    } else {
                        this.y0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.i0 i0Var2 = this.U0;
                        if (i0Var2 != null) {
                            i0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.i0 i0Var3 = this.U0;
                    if (i0Var3 != null) {
                        i0Var3.setProgress(this.m1);
                    }
                }
                if (this.K0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.m91[] m91VarArr = this.K0;
                        if (i21 >= m91VarArr.length) {
                            break;
                        }
                        m91VarArr[i21].b(0, D0);
                        this.K0[i21].b(1, D02);
                        this.K0[i21].b(2, D03);
                        this.K0[i21].b(3, D04);
                        i21++;
                    }
                }
                ImageView imageView = this.G0;
                qb1 qb1Var = this.a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.ic, qb1Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.H0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.ic, qb1Var, PorterDuff.Mode.MULTIPLY);
                }
                V0();
            }
        }
        this.E1 = false;
    }

    public final void c1(long j10) {
        this.K1 = j10;
        this.L1 = j10 == 0 || j10 == getUserConfig().getClientUserId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0271, code lost:
    
        if ("d".equals(((org.telegram.ui.zh1) r11).a) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0277, code lost:
    
        if ((r47.C1 instanceof org.telegram.tgnet.TLRPC.TL_wallPaper) != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0e46  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x093b A[EDGE_INSN: B:247:0x093b->B:248:0x093b BREAK  A[LOOP:2: B:197:0x0852->B:223:0x0930], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0dd6  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0de0  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e A[LOOP:0: B:45:0x019a->B:47:0x019e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cb A[EDGE_INSN: B:48:0x01cb->B:49:0x01cb BREAK  A[LOOP:0: B:45:0x019a->B:47:0x019e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0e43  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0e83  */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v79 */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        org.telegram.ui.ActionBar.h5 h5Var;
        final int i10;
        int i11;
        int i12;
        fc1[] fc1VarArr;
        boolean z11;
        org.telegram.ui.ActionBar.j6 j6Var;
        int i13;
        float f7;
        int i14;
        int i15;
        Object obj;
        int i16;
        int i17;
        Rect rect;
        int i18;
        final int i19;
        qb1 qb1Var;
        int i20;
        int i21;
        final int i22;
        float f10;
        org.telegram.ui.ActionBar.j6 j6Var2;
        ?? r11;
        org.telegram.ui.Components.i11 i11Var;
        final int i23;
        org.telegram.ui.ActionBar.h5 h5Var2;
        this.S.p = (qb1) getResourceProvider();
        this.T.p = (qb1) getResourceProvider();
        this.U.p = (qb1) getResourceProvider();
        this.V.p = (qb1) getResourceProvider();
        int i24 = 1;
        this.hasOwnBackground = true;
        hc1 hc1Var = this.q1;
        int i25 = 0;
        boolean z12 = (hc1Var == null || this.K1 == 0) ? false : true;
        this.M1 = z12;
        if (z12) {
            Object obj2 = this.C1;
            if (!(obj2 instanceof ai1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z10 = true;
            this.N1 = z10;
            if (z10) {
                this.p1 = hc1Var.a() ? 1.0f : 0.0f;
            }
            h5Var = this.parentLayout;
            if (h5Var != null && ((ActionBarLayout) h5Var).z()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.n0 = new FrameLayout(context);
            i10 = 3;
            if (this.N1 && SharedConfig.dayNightWallpaperSwitchHint < 3) {
                AndroidUtilities.runOnUIThread(new db1(this, i10), 2000L);
            }
            org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new bc1();
            a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i5());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
            l0 l0Var = new l0(this, context, 24);
            this.n0 = l0Var;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l0Var, getResourceProvider());
            this.n0.addView(this.actionBar, w7.z5.c(-2.0f, -1));
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context);
            this.o0 = mm0Var;
            mm0Var.setVerticalScrollBarEnabled(true);
            this.o0.setItemAnimator(null);
            this.o0.setLayoutAnimation(null);
            this.o0.setLayoutManager(new s4.b0(1, false));
            final int i26 = 2;
            this.o0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            org.telegram.ui.Components.mm0 mm0Var2 = this.o0;
            i11 = this.b;
            mm0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
            this.o0.setOnItemClickListener(new org.telegram.ui.Components.n7(i26));
            this.n0.addView(this.o0, w7.z5.e(-1, -1, 51));
            org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider);
            this.q0 = h20Var;
            h20Var.setImageResource(R.drawable.floating_pencil);
            this.n0.addView(this.q0, org.telegram.ui.Components.h20.b());
            ic1 ic1Var = new ic1(context);
            this.p0 = ic1Var;
            this.o0.setAdapter(ic1Var);
            this.u0 = new org.telegram.ui.ActionBar.p0(this, context, i26);
            this.w0 = new mc1(context, this);
            this.t0 = createActionBar(context);
            if (AndroidUtilities.isTablet()) {
                this.t0.setOccupyStatusBar(false);
            }
            i2.o1.y(false, this.t0);
            this.t0.setActionBarMenuOnItemClick(new ec1(this));
            i12 = 0;
            while (true) {
                fc1VarArr = this.x0;
                if (i12 < 2) {
                    break;
                }
                fc1VarArr[i12] = new fc1(this, (Activity) getContext());
                this.u0.addView(fc1VarArr[i12], w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i12++;
            }
            fc1 fc1Var = fc1VarArr[0];
            this.y0 = fc1Var;
            fc1Var.setVisibility(0);
            fc1VarArr[1].setVisibility(8);
            if (i11 == 2) {
                this.y0.getImageReceiver().setDelegate(new fb1(this, i25));
            }
            z11 = this.w0.e;
            org.telegram.ui.ActionBar.j6 j6Var3 = this.f0;
            final int i27 = 4;
            if (!z11) {
                this.t0.setTitle("Telegram Beta Chat");
                this.t0.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
                j6Var = j6Var3;
            } else if (i11 == 2) {
                j6Var = j6Var3;
                if (this.K1 != 0) {
                    this.t0.setTitle(LocaleController.getString(R.string.WallpaperPreview));
                } else {
                    this.t0.setTitle(LocaleController.getString(R.string.BackgroundPreview));
                }
                org.telegram.ui.ActionBar.y m10 = this.t0.m();
                Object obj3 = this.C1;
                if ((obj3 instanceof ai1) && ((ai1) obj3).e != null) {
                    m10.a(7, R.drawable.msg_header_draw);
                }
                if (this.K1 == 0) {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION || org.telegram.ui.ActionBar.k6.n0().k(false) == null) {
                        Object obj4 = this.C1;
                        if (obj4 instanceof zh1) {
                        }
                    }
                    m10.a(5, R.drawable.msg_header_share);
                }
                if (this.K1 != 0 && this.M1) {
                    org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                    this.O1 = yj0Var;
                    this.P1 = m10.d(6, yj0Var);
                    this.O1.h = true;
                    hc1 hc1Var2 = this.q1;
                    if (hc1Var2 == null || hc1Var2.a()) {
                        this.O1.M(35);
                        this.O1.P(36);
                    } else {
                        this.O1.P(0);
                        this.O1.M(0);
                    }
                    this.O1.Z = true;
                    int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J9);
                    this.O1.Q(v02, "Sunny");
                    this.O1.Q(v02, "Path 6");
                    this.O1.Q(v02, "Path");
                    this.O1.Q(v02, "Path 5");
                    this.O1.o();
                }
            } else {
                j6Var = j6Var3;
                if (i11 == 1) {
                    org.telegram.ui.ActionBar.y m11 = this.t0.m();
                    this.f = m11.e(4, LocaleController.getString(R.string.Save));
                    org.telegram.ui.Components.jm jmVar = new org.telegram.ui.Components.jm(this, context, m11);
                    this.e = jmVar;
                    jmVar.setSubMenuOpenSide(1);
                    this.e.g(2, LocaleController.getString(R.string.ColorPickerBackground));
                    this.e.g(1, LocaleController.getString(R.string.ColorPickerMainColor));
                    this.e.g(3, LocaleController.getString(R.string.ColorPickerMyMessages));
                    this.e.D();
                    this.e.setForceSmoothKeyboard(true);
                    this.t0.addView(this.e, w7.z5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                    this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eb1
                        public final /* synthetic */ qc1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    this.b.N0(false);
                                    break;
                                case 1:
                                    qc1.V(this.b);
                                    break;
                                case 2:
                                    this.b.e.M(null, null);
                                    break;
                                case 3:
                                    this.b.M0(false);
                                    break;
                                default:
                                    this.b.M0(true);
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
                    int i28 = org.telegram.ui.ActionBar.k6.A8;
                    org.telegram.ui.ActionBar.r6.W(textView2, i28, getResourceProvider());
                    this.h.setTypeface(AndroidUtilities.bold());
                    this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                    org.telegram.ui.ActionBar.r6.z(this.h, mutate, i28, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                    this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                    this.h.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                    this.h.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                    this.e.addView(this.h, w7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
                } else {
                    TLRPC.TL_theme tL_theme = j6Var.F;
                    String n10 = tL_theme != null ? tL_theme.title : j6Var.n();
                    int lastIndexOf = n10.lastIndexOf(".attheme");
                    if (lastIndexOf >= 0) {
                        n10 = n10.substring(0, lastIndexOf);
                    }
                    this.t0.setTitle(n10);
                    TLRPC.TL_theme tL_theme2 = j6Var.F;
                    if (tL_theme2 == null || (i13 = tL_theme2.installs_count) <= 0) {
                        this.t0.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                    } else {
                        this.t0.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i13, new Object[0]));
                    }
                }
            }
            this.v0 = new lb1(context, this);
            mb1 mb1Var = new mb1(this);
            mb1Var.S();
            this.v0.setItemAnimator(mb1Var);
            this.v0.setVerticalScrollBarEnabled(true);
            this.v0.setOverScrollMode(2);
            if (i11 != 2) {
                this.v0.setPadding(0, AndroidUtilities.dp(4.0f), 0, (AndroidUtilities.dp(72 + ((this.L1 || this.K1 <= 0) ? 0 : 58)) - 12) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
            } else if (i11 == 1) {
                this.v0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
            } else {
                this.v0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            }
            this.v0.setClipToPadding(false);
            this.v0.setLayoutManager(new s4.b0(1, true));
            this.v0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            if (i11 != 1) {
                this.u0.addView(this.v0, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.v0.setOnItemClickListener(new fb1(this, i24));
                f7 = 16.0f;
                i14 = -1;
            } else {
                f7 = 16.0f;
                i14 = -1;
                this.u0.addView(this.v0, w7.z5.e(-1, -1, 51));
            }
            this.v0.setOnScrollListener(new j3(this, 29));
            this.u0.addView(this.t0, w7.z5.c(-2.0f, i14));
            org.telegram.ui.Components.o91 o91Var = new org.telegram.ui.Components.o91(context);
            this.w1 = o91Var;
            o91Var.b(new fb1(this, i26));
            org.telegram.ui.ActionBar.i6 i6Var = this.v;
            if (i11 != 1 || i11 == 2) {
                if (i11 != 2) {
                    y4 y4Var = new y4(this, context, U0());
                    this.D0 = y4Var;
                    y4Var.setWillNotDraw(false);
                    i15 = 2;
                    this.D0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.u0.addView(this.D0, w7.z5.e(-1, 0, 81));
                    gc1 gc1Var = new gc1(context, this);
                    this.A1 = gc1Var;
                    w7.b6.b(gc1Var, 0.033f, 1.2f);
                    h1(false);
                    this.A1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eb1
                        public final /* synthetic */ qc1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    this.b.N0(false);
                                    break;
                                case 1:
                                    qc1.V(this.b);
                                    break;
                                case 2:
                                    this.b.e.M(null, null);
                                    break;
                                case 3:
                                    this.b.M0(false);
                                    break;
                                default:
                                    this.b.M0(true);
                                    break;
                            }
                        }
                    });
                    if (this.K1 <= 0 || this.L1 || this.r0 != null) {
                        this.D0.addView(this.A1, w7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        gc1 gc1Var2 = new gc1(context, this);
                        this.B1 = gc1Var2;
                        w7.b6.b(gc1Var2, 0.033f, 1.2f);
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.K1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().isPremium()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.ApplyWallpaperForMeAndPeer, UserObject.getUserName(user)));
                        this.B1.d(spannableStringBuilder);
                        try {
                            gc1 gc1Var3 = this.B1;
                            CharSequence b10 = gc1Var3.b();
                            i11Var = this.B1.a;
                            gc1Var3.d(Emoji.replaceEmoji(b10, i11Var.i(), false));
                        } catch (Exception unused) {
                        }
                        this.B1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eb1
                            public final /* synthetic */ qc1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i27) {
                                    case 0:
                                        this.b.N0(false);
                                        break;
                                    case 1:
                                        qc1.V(this.b);
                                        break;
                                    case 2:
                                        this.b.e.M(null, null);
                                        break;
                                    case 3:
                                        this.b.M0(false);
                                        break;
                                    default:
                                        this.b.M0(true);
                                        break;
                                }
                            }
                        });
                        this.D0.addView(this.A1, w7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.D0.addView(this.B1, w7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.N1) {
                        ai.o5 o5Var = new ai.o5(this, (Activity) getContext());
                        this.R1 = o5Var;
                        o5Var.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
                        this.u0.addView(this.R1, w7.z5.e(222, 76, 49));
                        nb1 nb1Var = new nb1((Activity) getContext());
                        this.S1 = nb1Var;
                        nb1Var.d(this.o1);
                        this.S1.b();
                        this.S1.c(new gb1(this, i25));
                        this.R1.addView(this.S1);
                        hc1 hc1Var3 = this.q1;
                        if (hc1Var3 != null) {
                            this.S1.setVisibility(hc1Var3.a() ? 0 : 8);
                            this.S1.setAlpha(this.q1.a() ? 1.0f : 0.0f);
                            this.S1.d(this.q1.a() ? this.o1 : 0.0f);
                        }
                    }
                } else {
                    i15 = 2;
                }
                Rect rect2 = new Rect();
                Drawable mutate2 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                this.r = mutate2;
                mutate2.getPadding(rect2);
                Drawable drawable = this.r;
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
                this.s = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                obj = this.C1;
                if (i11 != 1 || (obj instanceof zh1)) {
                    if ((obj instanceof zh1) || !"d".equals(((zh1) obj).a)) {
                        i16 = 3;
                        String[] strArr = new String[i16];
                        int[] iArr = new int[i16];
                        this.K0 = new org.telegram.ui.Components.m91[i16];
                        if (i16 != 0) {
                            this.z0 = new FrameLayout(context);
                            if (i11 == 1 || (this.C1 instanceof zh1)) {
                                strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                                strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                                strArr[i15] = LocaleController.getString(R.string.BackgroundMotion);
                            } else {
                                strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                                strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                            }
                            i18 = 0;
                            int i29 = 0;
                            while (i29 < i16) {
                                int i30 = i24;
                                int ceil = (int) Math.ceil(textPaint.measureText(strArr[i29]));
                                iArr[i29] = ceil;
                                i18 = Math.max(i18, ceil);
                                i29++;
                                i24 = i30;
                                rect2 = rect2;
                            }
                            i17 = i24;
                            rect = rect2;
                            ob1 ob1Var = new ob1(this, context, 0);
                            this.E0 = ob1Var;
                            ob1Var.setWillNotDraw(false);
                            this.E0.setVisibility(this.c1 != 0 ? 0 : 4);
                            this.E0.setScaleX(this.c1 != 0 ? 1.0f : 0.1f);
                            this.E0.setScaleY(this.c1 != 0 ? 1.0f : 0.1f);
                            this.E0.setAlpha(this.c1 != 0 ? 1.0f : 0.0f);
                            this.E0.setTag(this.c1 != 0 ? Integer.valueOf(i17) : null);
                            this.z0.addView(this.E0, w7.z5.e(48, 48, 17));
                            this.E0.setOnClickListener(new pb1(this, i25));
                            ImageView imageView = new ImageView(context);
                            this.G0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.G0.setImageResource(R.drawable.bg_rotate_large);
                            this.E0.addView(this.G0, w7.z5.e(-2, -2, 17));
                        } else {
                            i17 = 1;
                            rect = rect2;
                            i18 = 0;
                        }
                        i19 = 0;
                        while (true) {
                            qb1Var = this.a;
                            if (i19 >= i16) {
                                break;
                            }
                            this.K0[i19] = new org.telegram.ui.Components.m91(context, ((i11 == i17 || (this.C1 instanceof zh1)) && i19 == 0) ? i25 : 1, this.y0, qb1Var);
                            this.K0[i19].setBackgroundColor(this.a1);
                            org.telegram.ui.Components.m91 m91Var = this.K0[i19];
                            String str = strArr[i19];
                            int i31 = iArr[i19];
                            m91Var.f = str;
                            m91Var.h = i31;
                            m91Var.n = i18;
                            int i32 = 1;
                            if (i11 != 1) {
                                if (this.C1 instanceof zh1) {
                                    i32 = 1;
                                } else {
                                    m91Var.a(i19 == 0 ? this.G1 : this.F1, false);
                                    int dp = AndroidUtilities.dp(56.0f) + i18;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, -2);
                                    layoutParams.gravity = 17;
                                    if (i16 != 3) {
                                        if (i19 == 0 || i19 == 2) {
                                            layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                        } else {
                                            layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                        }
                                    } else if (i19 == 1) {
                                        layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                    } else {
                                        layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                    }
                                    this.z0.addView(this.K0[i19], layoutParams);
                                    final org.telegram.ui.Components.m91 m91Var2 = this.K0[i19];
                                    final int i33 = 0;
                                    m91Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hb1
                                        public final /* synthetic */ qc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i33) {
                                                case 0:
                                                    qc1 qc1Var = this.b;
                                                    int i34 = qc1Var.b;
                                                    FrameLayout[] frameLayoutArr = qc1Var.M0;
                                                    if (qc1Var.z0.getAlpha() == 1.0f && qc1Var.s1 == null) {
                                                        int i35 = i19;
                                                        org.telegram.ui.Components.m91 m91Var3 = m91Var2;
                                                        if ((i34 != 1 && !(qc1Var.C1 instanceof zh1)) || i35 != 2) {
                                                            if (i35 != 1 || (i34 != 1 && !(qc1Var.C1 instanceof zh1))) {
                                                                if (!(qc1Var.C1 instanceof zh1)) {
                                                                    if (i34 != 1) {
                                                                        m91Var3.a(!m91Var3.s, true);
                                                                        if (i35 != 0) {
                                                                            boolean z13 = m91Var3.s;
                                                                            qc1Var.F1 = z13;
                                                                            qc1Var.w1.c(z13);
                                                                            qc1Var.L0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = m91Var3.s;
                                                                            qc1Var.G1 = z14;
                                                                            if (z14) {
                                                                                qc1Var.y0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            qc1Var.i1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    qc1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (qc1Var.K0[1].s) {
                                                                    qc1Var.Z0 = qc1Var.X0;
                                                                    qc1Var.y0.setImageDrawable(null);
                                                                    qc1Var.X0 = null;
                                                                    qc1Var.F1 = false;
                                                                    qc1Var.j1();
                                                                    qc1Var.L0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i34 == 1) {
                                                                            qc1Var.f1(0, true, true);
                                                                        } else {
                                                                            qc1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    qc1Var.Z0(qc1Var.Z0 != null ? -1 : 0);
                                                                    if (i34 == 1) {
                                                                        qc1Var.f1(1, true, true);
                                                                    } else {
                                                                        qc1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                qc1Var.K0[1].a(qc1Var.X0 != null, true);
                                                                qc1Var.n1();
                                                                qc1Var.Q0.g1();
                                                                qc1Var.l1();
                                                                break;
                                                            }
                                                        } else {
                                                            m91Var3.a(!m91Var3.s, true);
                                                            boolean z15 = m91Var3.s;
                                                            qc1Var.F1 = z15;
                                                            qc1Var.w1.c(z15);
                                                            qc1Var.L0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    qc1 qc1Var2 = this.b;
                                                    if (qc1Var2.A0.getAlpha() == 1.0f && i19 == 0) {
                                                        org.telegram.ui.Components.m91 m91Var4 = m91Var2;
                                                        m91Var4.a(!m91Var4.s, true);
                                                        qc1Var2.v.i = m91Var4.s;
                                                        org.telegram.ui.ActionBar.k6.q1(true, true);
                                                        qc1Var2.v0.g1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    if (i19 != 2) {
                                        this.K0[i19].setAlpha(0.0f);
                                        this.K0[i19].setVisibility(4);
                                    }
                                    i19++;
                                    i25 = 0;
                                    i15 = 2;
                                    i17 = 1;
                                }
                            }
                            if (i19 == i32) {
                                m91Var.a((this.X0 == null && (i6Var == null || TextUtils.isEmpty(i6Var.o))) ? false : true, false);
                            } else if (i19 == i15) {
                                m91Var.a(this.F1, false);
                            }
                            int dp2 = AndroidUtilities.dp(56.0f) + i18;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp2, -2);
                            layoutParams2.gravity = 17;
                            if (i16 != 3) {
                            }
                            this.z0.addView(this.K0[i19], layoutParams2);
                            final org.telegram.ui.Components.m91 m91Var22 = this.K0[i19];
                            final int i332 = 0;
                            m91Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hb1
                                public final /* synthetic */ qc1 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i332) {
                                        case 0:
                                            qc1 qc1Var = this.b;
                                            int i34 = qc1Var.b;
                                            FrameLayout[] frameLayoutArr = qc1Var.M0;
                                            if (qc1Var.z0.getAlpha() == 1.0f && qc1Var.s1 == null) {
                                                int i35 = i19;
                                                org.telegram.ui.Components.m91 m91Var3 = m91Var22;
                                                if ((i34 != 1 && !(qc1Var.C1 instanceof zh1)) || i35 != 2) {
                                                    if (i35 != 1 || (i34 != 1 && !(qc1Var.C1 instanceof zh1))) {
                                                        if (!(qc1Var.C1 instanceof zh1)) {
                                                            if (i34 != 1) {
                                                                m91Var3.a(!m91Var3.s, true);
                                                                if (i35 != 0) {
                                                                    boolean z13 = m91Var3.s;
                                                                    qc1Var.F1 = z13;
                                                                    qc1Var.w1.c(z13);
                                                                    qc1Var.L0();
                                                                    break;
                                                                } else {
                                                                    boolean z14 = m91Var3.s;
                                                                    qc1Var.G1 = z14;
                                                                    if (z14) {
                                                                        qc1Var.y0.getImageReceiver().setForceCrossfade(true);
                                                                    }
                                                                    qc1Var.i1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            qc1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (qc1Var.K0[1].s) {
                                                            qc1Var.Z0 = qc1Var.X0;
                                                            qc1Var.y0.setImageDrawable(null);
                                                            qc1Var.X0 = null;
                                                            qc1Var.F1 = false;
                                                            qc1Var.j1();
                                                            qc1Var.L0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (i34 == 1) {
                                                                    qc1Var.f1(0, true, true);
                                                                } else {
                                                                    qc1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            qc1Var.Z0(qc1Var.Z0 != null ? -1 : 0);
                                                            if (i34 == 1) {
                                                                qc1Var.f1(1, true, true);
                                                            } else {
                                                                qc1Var.f1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        qc1Var.K0[1].a(qc1Var.X0 != null, true);
                                                        qc1Var.n1();
                                                        qc1Var.Q0.g1();
                                                        qc1Var.l1();
                                                        break;
                                                    }
                                                } else {
                                                    m91Var3.a(!m91Var3.s, true);
                                                    boolean z15 = m91Var3.s;
                                                    qc1Var.F1 = z15;
                                                    qc1Var.w1.c(z15);
                                                    qc1Var.L0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            qc1 qc1Var2 = this.b;
                                            if (qc1Var2.A0.getAlpha() == 1.0f && i19 == 0) {
                                                org.telegram.ui.Components.m91 m91Var4 = m91Var22;
                                                m91Var4.a(!m91Var4.s, true);
                                                qc1Var2.v.i = m91Var4.s;
                                                org.telegram.ui.ActionBar.k6.q1(true, true);
                                                qc1Var2.v0.g1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i19 != 2) {
                            }
                            i19++;
                            i25 = 0;
                            i15 = 2;
                            i17 = 1;
                        }
                        i20 = i17;
                        if (i11 == i20) {
                            int[] iArr2 = new int[2];
                            this.L0 = new org.telegram.ui.Components.m91[2];
                            this.A0 = new FrameLayout(context);
                            String[] strArr2 = {LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                            int i34 = 0;
                            int i35 = 0;
                            for (int i36 = 2; i34 < i36; i36 = 2) {
                                int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i34]));
                                iArr2[i34] = ceil2;
                                i35 = Math.max(i35, ceil2);
                                i34++;
                            }
                            if (i6Var != null) {
                                ob1 ob1Var2 = new ob1(this, context, 1);
                                this.F0 = ob1Var2;
                                ob1Var2.setWillNotDraw(false);
                                this.F0.setVisibility(i6Var.f != 0 ? 0 : 4);
                                this.F0.setScaleX(i6Var.f != 0 ? 1.0f : 0.1f);
                                this.F0.setScaleY(i6Var.f != 0 ? 1.0f : 0.1f);
                                this.F0.setAlpha(i6Var.f != 0 ? 1.0f : 0.0f);
                                this.A0.addView(this.F0, w7.z5.e(48, 48, 17));
                                this.F0.setOnClickListener(new pb1(this, 1));
                                ImageView imageView2 = new ImageView(context);
                                this.H0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.H0.setImageResource(R.drawable.bg_rotate_large);
                                this.F0.addView(this.H0, w7.z5.e(-2, -2, 17));
                                final int i37 = 0;
                                while (i37 < 2) {
                                    this.L0[i37] = new org.telegram.ui.Components.m91(context, i37 == 0, this.y0, qb1Var);
                                    org.telegram.ui.Components.m91 m91Var3 = this.L0[i37];
                                    String str2 = strArr2[i37];
                                    int i38 = iArr2[i37];
                                    m91Var3.f = str2;
                                    m91Var3.h = i38;
                                    m91Var3.n = i35;
                                    if (i37 == 0) {
                                        m91Var3.a(i6Var.i, false);
                                    }
                                    int dp3 = AndroidUtilities.dp(56.0f) + i35;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dp3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i37 == 1) {
                                        layoutParams3.leftMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                    }
                                    this.A0.addView(this.L0[i37], layoutParams3);
                                    final org.telegram.ui.Components.m91 m91Var4 = this.L0[i37];
                                    final int i39 = 1;
                                    m91Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hb1
                                        public final /* synthetic */ qc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i39) {
                                                case 0:
                                                    qc1 qc1Var = this.b;
                                                    int i342 = qc1Var.b;
                                                    FrameLayout[] frameLayoutArr = qc1Var.M0;
                                                    if (qc1Var.z0.getAlpha() == 1.0f && qc1Var.s1 == null) {
                                                        int i352 = i37;
                                                        org.telegram.ui.Components.m91 m91Var32 = m91Var4;
                                                        if ((i342 != 1 && !(qc1Var.C1 instanceof zh1)) || i352 != 2) {
                                                            if (i352 != 1 || (i342 != 1 && !(qc1Var.C1 instanceof zh1))) {
                                                                if (!(qc1Var.C1 instanceof zh1)) {
                                                                    if (i342 != 1) {
                                                                        m91Var32.a(!m91Var32.s, true);
                                                                        if (i352 != 0) {
                                                                            boolean z13 = m91Var32.s;
                                                                            qc1Var.F1 = z13;
                                                                            qc1Var.w1.c(z13);
                                                                            qc1Var.L0();
                                                                            break;
                                                                        } else {
                                                                            boolean z14 = m91Var32.s;
                                                                            qc1Var.G1 = z14;
                                                                            if (z14) {
                                                                                qc1Var.y0.getImageReceiver().setForceCrossfade(true);
                                                                            }
                                                                            qc1Var.i1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    qc1Var.f1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (qc1Var.K0[1].s) {
                                                                    qc1Var.Z0 = qc1Var.X0;
                                                                    qc1Var.y0.setImageDrawable(null);
                                                                    qc1Var.X0 = null;
                                                                    qc1Var.F1 = false;
                                                                    qc1Var.j1();
                                                                    qc1Var.L0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i342 == 1) {
                                                                            qc1Var.f1(0, true, true);
                                                                        } else {
                                                                            qc1Var.f1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    qc1Var.Z0(qc1Var.Z0 != null ? -1 : 0);
                                                                    if (i342 == 1) {
                                                                        qc1Var.f1(1, true, true);
                                                                    } else {
                                                                        qc1Var.f1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                qc1Var.K0[1].a(qc1Var.X0 != null, true);
                                                                qc1Var.n1();
                                                                qc1Var.Q0.g1();
                                                                qc1Var.l1();
                                                                break;
                                                            }
                                                        } else {
                                                            m91Var32.a(!m91Var32.s, true);
                                                            boolean z15 = m91Var32.s;
                                                            qc1Var.F1 = z15;
                                                            qc1Var.w1.c(z15);
                                                            qc1Var.L0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    qc1 qc1Var2 = this.b;
                                                    if (qc1Var2.A0.getAlpha() == 1.0f && i37 == 0) {
                                                        org.telegram.ui.Components.m91 m91Var42 = m91Var4;
                                                        m91Var42.a(!m91Var42.s, true);
                                                        qc1Var2.v.i = m91Var42.s;
                                                        org.telegram.ui.ActionBar.k6.q1(true, true);
                                                        qc1Var2.v0.g1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i37++;
                                }
                            }
                            i21 = 1;
                        } else {
                            i21 = i20;
                        }
                        if (i11 != i21 || (this.C1 instanceof zh1)) {
                            this.G1 = false;
                            i22 = 0;
                            while (i22 < 2) {
                                Rect rect3 = rect;
                                rb1 rb1Var = new rb1(this, context, i22, rect3);
                                ViewGroup[] viewGroupArr = this.M0;
                                viewGroupArr[i22] = rb1Var;
                                if (i22 == 1 || i11 == 2) {
                                    rb1Var.setVisibility(4);
                                }
                                viewGroupArr[i22].setWillNotDraw(false);
                                FrameLayout.LayoutParams e = i11 == 2 ? w7.z5.e(-1, i22 == 0 ? 321 : 316, 83) : w7.z5.e(-1, i22 == 0 ? 273 : 316, 83);
                                e.height = AndroidUtilities.dp(i22 == 0 ? i11 == 2 ? 321 : 273 : 316.0f);
                                if (U0()) {
                                    e.height += AndroidUtilities.navigationBarHeight;
                                }
                                if (i22 == 0) {
                                    Drawable drawable2 = this.r;
                                    Rect rect4 = AndroidUtilities.rectTmp2;
                                    drawable2.getPadding(rect4);
                                    e.height = AndroidUtilities.dp(12.0f) + rect4.top + e.height;
                                }
                                viewGroupArr[i22].setPadding(0, i22 == 0 ? AndroidUtilities.dp(12.0f) + rect3.top : 0, 0, U0() ? AndroidUtilities.navigationBarHeight : 0);
                                this.u0.addView(viewGroupArr[i22], e);
                                if (i22 == 1 || i11 == 2) {
                                    ah.v vVar = new ah.v(this, context, 26);
                                    ViewGroup[] viewGroupArr2 = this.P0;
                                    viewGroupArr2[i22] = vVar;
                                    vVar.setWillNotDraw(false);
                                    viewGroupArr2[i22].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                                    viewGroupArr2[i22].setClickable(true);
                                    f10 = 21.0f;
                                    viewGroupArr[i22].addView(viewGroupArr2[i22], w7.z5.e(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.N0;
                                    textViewArr[i22] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i22].setTypeface(AndroidUtilities.bold());
                                    TextView textView4 = textViewArr[i22];
                                    int i40 = org.telegram.ui.ActionBar.k6.Ae;
                                    org.telegram.ui.ActionBar.r6.W(textView4, i40, getResourceProvider());
                                    textViewArr[i22].setText(LocaleController.getString(R.string.Cancel));
                                    textViewArr[i22].setGravity(17);
                                    textViewArr[i22].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    TextView textView5 = textViewArr[i22];
                                    int i41 = org.telegram.ui.ActionBar.k6.i6;
                                    rect = rect3;
                                    org.telegram.ui.ActionBar.r6.S(textView5, org.telegram.ui.ActionBar.k6.f0(getThemedColor(i41), 0), null, org.telegram.ui.ActionBar.r6.O(i41), getResourceProvider());
                                    j6Var2 = j6Var;
                                    viewGroupArr2[i22].addView(textViewArr[i22], w7.z5.e(-2, -1, 51));
                                    final int i42 = 0;
                                    textViewArr[i22].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kb1
                                        public final /* synthetic */ qc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i42) {
                                                case 0:
                                                    qc1 qc1Var = this.b;
                                                    if (qc1Var.s1 == null) {
                                                        int i43 = i22;
                                                        if (i43 == 0) {
                                                            qc1Var.i1 = qc1Var.j1;
                                                            qc1Var.a1(qc1Var.h1, 3, true);
                                                            qc1Var.a1(qc1Var.g1, 2, true);
                                                            qc1Var.a1(qc1Var.f1, 1, true);
                                                            qc1Var.a1(qc1Var.b1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = qc1Var.Y0;
                                                            qc1Var.X0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                qc1Var.y0.setImageDrawable(null);
                                                            } else {
                                                                fc1 fc1Var2 = qc1Var.y0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = qc1Var.H1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = qc1Var.X0;
                                                                fc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            qc1Var.K0[1].a(qc1Var.X0 != null, false);
                                                            float f11 = qc1Var.n1;
                                                            qc1Var.m1 = f11;
                                                            qc1Var.U0.setProgress(f11);
                                                            qc1Var.y0.getImageReceiver().setAlpha(qc1Var.m1);
                                                            qc1Var.j1();
                                                            qc1Var.n1();
                                                        }
                                                        if (qc1Var.b != 2) {
                                                            if (qc1Var.X0 == null) {
                                                                if (qc1Var.F1) {
                                                                    qc1Var.F1 = false;
                                                                    qc1Var.K0[0].a(false, true);
                                                                    qc1Var.L0();
                                                                }
                                                                qc1Var.l1();
                                                            }
                                                            qc1Var.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            qc1Var.f1(i43, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    qc1 qc1Var2 = this.b;
                                                    if (qc1Var2.s1 == null) {
                                                        if (qc1Var2.b != 2) {
                                                            qc1Var2.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            qc1Var2.f1(i22, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView6 = new TextView(context);
                                    TextView[] textViewArr2 = this.O0;
                                    textViewArr2[i22] = textView6;
                                    textView6.setTextSize(1, 15.0f);
                                    textViewArr2[i22].setTypeface(AndroidUtilities.bold());
                                    org.telegram.ui.ActionBar.r6.W(textViewArr2[i22], i40, getResourceProvider());
                                    textViewArr2[i22].setText(LocaleController.getString(R.string.ApplyTheme));
                                    textViewArr2[i22].setGravity(17);
                                    textViewArr2[i22].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                    org.telegram.ui.ActionBar.r6.S(textViewArr2[i22], org.telegram.ui.ActionBar.k6.f0(getThemedColor(i41), 0), null, org.telegram.ui.ActionBar.r6.O(i41), getResourceProvider());
                                    viewGroupArr2[i22].addView(textViewArr2[i22], w7.z5.e(-2, -1, 53));
                                    TextView textView7 = textViewArr2[i22];
                                    r11 = 1;
                                    final char c10 = 1 == true ? 1 : 0;
                                    textView7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kb1
                                        public final /* synthetic */ qc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (c10) {
                                                case 0:
                                                    qc1 qc1Var = this.b;
                                                    if (qc1Var.s1 == null) {
                                                        int i43 = i22;
                                                        if (i43 == 0) {
                                                            qc1Var.i1 = qc1Var.j1;
                                                            qc1Var.a1(qc1Var.h1, 3, true);
                                                            qc1Var.a1(qc1Var.g1, 2, true);
                                                            qc1Var.a1(qc1Var.f1, 1, true);
                                                            qc1Var.a1(qc1Var.b1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = qc1Var.Y0;
                                                            qc1Var.X0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                qc1Var.y0.setImageDrawable(null);
                                                            } else {
                                                                fc1 fc1Var2 = qc1Var.y0;
                                                                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                String str3 = qc1Var.H1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = qc1Var.X0;
                                                                fc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            }
                                                            qc1Var.K0[1].a(qc1Var.X0 != null, false);
                                                            float f11 = qc1Var.n1;
                                                            qc1Var.m1 = f11;
                                                            qc1Var.U0.setProgress(f11);
                                                            qc1Var.y0.getImageReceiver().setAlpha(qc1Var.m1);
                                                            qc1Var.j1();
                                                            qc1Var.n1();
                                                        }
                                                        if (qc1Var.b != 2) {
                                                            if (qc1Var.X0 == null) {
                                                                if (qc1Var.F1) {
                                                                    qc1Var.F1 = false;
                                                                    qc1Var.K0[0].a(false, true);
                                                                    qc1Var.L0();
                                                                }
                                                                qc1Var.l1();
                                                            }
                                                            qc1Var.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            qc1Var.f1(i43, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    qc1 qc1Var2 = this.b;
                                                    if (qc1Var2.s1 == null) {
                                                        if (qc1Var2.b != 2) {
                                                            qc1Var2.f1(0, true, true);
                                                            break;
                                                        } else {
                                                            qc1Var2.f1(i22, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    rect = rect3;
                                    j6Var2 = j6Var;
                                    r11 = 1;
                                    f10 = 21.0f;
                                }
                                if (i22 == r11) {
                                    TextView textView8 = new TextView(context);
                                    this.f2 = textView8;
                                    textView8.setLines(r11);
                                    this.f2.setSingleLine(r11);
                                    this.f2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                                    org.telegram.ui.ActionBar.r6.W(this.f2, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
                                    this.f2.setTextSize(r11, 20.0f);
                                    this.f2.setTypeface(AndroidUtilities.bold());
                                    this.f2.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                                    this.f2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.f2.setGravity(16);
                                    viewGroupArr[i22].addView(this.f2, w7.z5.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                    xa1 xa1Var = new xa1(context);
                                    this.Q0 = xa1Var;
                                    s4.b0 b0Var = new s4.b0(0, false);
                                    this.S0 = b0Var;
                                    xa1Var.setLayoutManager(b0Var);
                                    xa1 xa1Var2 = this.Q0;
                                    oc1 oc1Var = new oc1(context, this);
                                    this.R0 = oc1Var;
                                    xa1Var2.setAdapter(oc1Var);
                                    this.Q0.i(new ci.l(9));
                                    viewGroupArr[i22].addView(this.Q0, w7.z5.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                    this.Q0.setOnItemClickListener(new j11(this, 8));
                                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
                                    this.T0 = l4Var;
                                    l4Var.setText(LocaleController.getString(R.string.BackgroundIntensity));
                                    viewGroupArr[i22].addView(this.T0, w7.z5.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                    org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(context, (qb1) getResourceProvider());
                                    this.U0 = i0Var;
                                    i0Var.setProgress(this.m1);
                                    this.U0.setReportChanges(true);
                                    this.U0.setDelegate(new sb1(this));
                                    viewGroupArr[i22].addView(this.U0, w7.z5.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                } else {
                                    org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(context, this.h0, new tb1(this));
                                    this.W = wqVar;
                                    wqVar.setResourcesProvider(getResourceProvider());
                                    if (i11 == 1) {
                                        viewGroupArr[i22].addView(this.W, w7.z5.e(-1, -1, 1));
                                        if (j6Var2.q()) {
                                            this.W.setMinBrightness(0.2f);
                                        } else {
                                            this.W.setMinBrightness(0.05f);
                                            this.W.setMaxBrightness(0.8f);
                                        }
                                        if (i6Var != null) {
                                            int i43 = i6Var.d != 0 ? 2 : 1;
                                            org.telegram.ui.Components.wq wqVar2 = this.W;
                                            T0(1);
                                            wqVar2.f(1, 2, i43, false);
                                            this.W.e(i6Var.c, 0);
                                            int i44 = i6Var.d;
                                            if (i44 != 0) {
                                                this.W.e(i44, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i22].addView(this.W, w7.z5.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                    }
                                }
                                i22++;
                                j6Var = j6Var2;
                            }
                        }
                        j1();
                        if (!this.y0.getImageReceiver().hasBitmapImage()) {
                            this.u0.setBackgroundColor(-16777216);
                        }
                        if (i11 != 1 && !(this.C1 instanceof zh1)) {
                            this.y0.getImageReceiver().setCrossfadeWithOldImage(true);
                        }
                    }
                    i16 = 0;
                    String[] strArr3 = new String[i16];
                    int[] iArr3 = new int[i16];
                    this.K0 = new org.telegram.ui.Components.m91[i16];
                    if (i16 != 0) {
                    }
                    i19 = 0;
                    while (true) {
                        qb1Var = this.a;
                        if (i19 >= i16) {
                        }
                        i19++;
                        i25 = 0;
                        i15 = 2;
                        i17 = 1;
                    }
                    i20 = i17;
                    if (i11 == i20) {
                    }
                    if (i11 != i21) {
                    }
                    this.G1 = false;
                    i22 = 0;
                    while (i22 < 2) {
                    }
                    j1();
                    if (!this.y0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                        this.y0.getImageReceiver().setCrossfadeWithOldImage(true);
                    }
                } else {
                    if (!(obj instanceof ai1) || !"t".equals(((ai1) obj).a)) {
                        i16 = i15;
                        String[] strArr32 = new String[i16];
                        int[] iArr32 = new int[i16];
                        this.K0 = new org.telegram.ui.Components.m91[i16];
                        if (i16 != 0) {
                        }
                        i19 = 0;
                        while (true) {
                            qb1Var = this.a;
                            if (i19 >= i16) {
                            }
                            i19++;
                            i25 = 0;
                            i15 = 2;
                            i17 = 1;
                        }
                        i20 = i17;
                        if (i11 == i20) {
                        }
                        if (i11 != i21) {
                        }
                        this.G1 = false;
                        i22 = 0;
                        while (i22 < 2) {
                        }
                        j1();
                        if (!this.y0.getImageReceiver().hasBitmapImage()) {
                        }
                        if (i11 != 1) {
                        }
                    }
                    i16 = 0;
                    String[] strArr322 = new String[i16];
                    int[] iArr322 = new int[i16];
                    this.K0 = new org.telegram.ui.Components.m91[i16];
                    if (i16 != 0) {
                    }
                    i19 = 0;
                    while (true) {
                        qb1Var = this.a;
                        if (i19 >= i16) {
                        }
                        i19++;
                        i25 = 0;
                        i15 = 2;
                        i17 = 1;
                    }
                    i20 = i17;
                    if (i11 == i20) {
                    }
                    if (i11 != i21) {
                    }
                    this.G1 = false;
                    i22 = 0;
                    while (i22 < 2) {
                    }
                    j1();
                    if (!this.y0.getImageReceiver().hasBitmapImage()) {
                    }
                    if (i11 != 1) {
                    }
                }
            }
            this.v0.setAdapter(this.w0);
            ah.v vVar2 = new ah.v(this, context, 27);
            this.l0 = vVar2;
            vVar2.setWillNotDraw(false);
            ah.v vVar3 = this.l0;
            this.fragmentView = vVar3;
            ViewTreeObserver viewTreeObserver = vVar3.getViewTreeObserver();
            int i45 = 1;
            t90 t90Var = new t90(this, i45);
            this.R = t90Var;
            viewTreeObserver.addOnGlobalLayoutListener(t90Var);
            z4.h hVar = new z4.h(context);
            this.k0 = hVar;
            hVar.b(new n2(this, 2));
            this.k0.setAdapter(new m70(this, i45));
            AndroidUtilities.setViewPagerEdgeEffectColor(this.k0, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
            this.l0.addView(this.k0, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
            UndoView undoView = new UndoView(context, this);
            this.m0 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.l0.addView(this.m0, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (i11 != 0) {
                View view = new View(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, getResourceProvider());
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
                this.l0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.c0 = frameLayout;
                boolean z13 = this.d;
                if (z13) {
                    int i46 = org.telegram.ui.ActionBar.k6.d6;
                    frameLayout.setBackgroundColor(z13 ? org.telegram.ui.ActionBar.k6.E0(i46) : getThemedColor(i46));
                } else {
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, getResourceProvider());
                }
                this.l0.addView(this.c0, w7.z5.e(-1, 48, 83));
                ei.g6 g6Var = new ei.g6(context, this);
                this.b0 = g6Var;
                this.c0.addView(g6Var, w7.z5.e(22, 8, 17));
                TextView textView9 = new TextView(context);
                this.e0 = textView9;
                textView9.setTextSize(1, 14.0f);
                if (z13) {
                    TextView textView10 = this.e0;
                    int i47 = org.telegram.ui.ActionBar.k6.Ae;
                    textView10.setTextColor(z13 ? org.telegram.ui.ActionBar.k6.E0(i47) : getThemedColor(i47));
                } else {
                    org.telegram.ui.ActionBar.r6.W(this.e0, org.telegram.ui.ActionBar.k6.Ae, getResourceProvider());
                }
                this.e0.setGravity(17);
                this.e0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(251658240, 0));
                this.e0.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.e0.setText(LocaleController.getString(R.string.Cancel));
                this.e0.setTypeface(AndroidUtilities.bold());
                this.c0.addView(this.e0, w7.z5.e(-2, -1, 51));
                final int i48 = 0;
                this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eb1
                    public final /* synthetic */ qc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i48) {
                            case 0:
                                this.b.N0(false);
                                break;
                            case 1:
                                qc1.V(this.b);
                                break;
                            case 2:
                                this.b.e.M(null, null);
                                break;
                            case 3:
                                this.b.M0(false);
                                break;
                            default:
                                this.b.M0(true);
                                break;
                        }
                    }
                });
                TextView textView11 = new TextView(context);
                this.d0 = textView11;
                textView11.setTextSize(1, 14.0f);
                if (z13) {
                    TextView textView12 = this.d0;
                    int i49 = org.telegram.ui.ActionBar.k6.Ae;
                    textView12.setTextColor(z13 ? org.telegram.ui.ActionBar.k6.E0(i49) : getThemedColor(i49));
                } else {
                    org.telegram.ui.ActionBar.r6.W(this.d0, org.telegram.ui.ActionBar.k6.Ae, getResourceProvider());
                }
                this.d0.setGravity(17);
                this.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(251658240, 0));
                this.d0.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.d0.setText(LocaleController.getString(R.string.ApplyTheme));
                this.d0.setTypeface(AndroidUtilities.bold());
                this.c0.addView(this.d0, w7.z5.e(-2, -1, 53));
                i23 = 1;
                this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eb1
                    public final /* synthetic */ qc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i23) {
                            case 0:
                                this.b.N0(false);
                                break;
                            case 1:
                                qc1.V(this.b);
                                break;
                            case 2:
                                this.b.e.M(null, null);
                                break;
                            case 3:
                                this.b.M0(false);
                                break;
                            default:
                                this.b.M0(true);
                                break;
                        }
                    }
                });
            } else {
                i23 = 1;
            }
            if (i11 == i23 && !org.telegram.ui.ActionBar.k6.b1() && i6Var != null && i6Var.j != 4294967296L) {
                X0();
            }
            this.j0 = S0();
            b1(true);
            m1(false);
            this.c = new Scroller(getContext());
            h5Var2 = this.parentLayout;
            if (h5Var2 != null && h5Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
                if (i11 == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
            return this.fragmentView;
        }
        z10 = false;
        this.N1 = z10;
        if (z10) {
        }
        h5Var = this.parentLayout;
        if (h5Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.n0 = new FrameLayout(context);
        i10 = 3;
        if (this.N1) {
            AndroidUtilities.runOnUIThread(new db1(this, i10), 2000L);
        }
        org.telegram.ui.ActionBar.u0 a22 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a22.F();
        a22.H = new bc1();
        a22.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i5());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        l0 l0Var2 = new l0(this, context, 24);
        this.n0 = l0Var2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l0Var2, getResourceProvider());
        this.n0.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var3 = new org.telegram.ui.Components.mm0(context);
        this.o0 = mm0Var3;
        mm0Var3.setVerticalScrollBarEnabled(true);
        this.o0.setItemAnimator(null);
        this.o0.setLayoutAnimation(null);
        this.o0.setLayoutManager(new s4.b0(1, false));
        final int i262 = 2;
        this.o0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.mm0 mm0Var22 = this.o0;
        i11 = this.b;
        mm0Var22.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
        this.o0.setOnItemClickListener(new org.telegram.ui.Components.n7(i262));
        this.n0.addView(this.o0, w7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.h20 h20Var2 = new org.telegram.ui.Components.h20(context, this.resourceProvider);
        this.q0 = h20Var2;
        h20Var2.setImageResource(R.drawable.floating_pencil);
        this.n0.addView(this.q0, org.telegram.ui.Components.h20.b());
        ic1 ic1Var2 = new ic1(context);
        this.p0 = ic1Var2;
        this.o0.setAdapter(ic1Var2);
        this.u0 = new org.telegram.ui.ActionBar.p0(this, context, i262);
        this.w0 = new mc1(context, this);
        this.t0 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
        }
        i2.o1.y(false, this.t0);
        this.t0.setActionBarMenuOnItemClick(new ec1(this));
        i12 = 0;
        while (true) {
            fc1VarArr = this.x0;
            if (i12 < 2) {
            }
            fc1VarArr[i12] = new fc1(this, (Activity) getContext());
            this.u0.addView(fc1VarArr[i12], w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i12++;
        }
        fc1 fc1Var2 = fc1VarArr[0];
        this.y0 = fc1Var2;
        fc1Var2.setVisibility(0);
        fc1VarArr[1].setVisibility(8);
        if (i11 == 2) {
        }
        z11 = this.w0.e;
        org.telegram.ui.ActionBar.j6 j6Var32 = this.f0;
        final int i272 = 4;
        if (!z11) {
        }
        this.v0 = new lb1(context, this);
        mb1 mb1Var2 = new mb1(this);
        mb1Var2.S();
        this.v0.setItemAnimator(mb1Var2);
        this.v0.setVerticalScrollBarEnabled(true);
        this.v0.setOverScrollMode(2);
        if (i11 != 2) {
        }
        this.v0.setClipToPadding(false);
        this.v0.setLayoutManager(new s4.b0(1, true));
        this.v0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        if (i11 != 1) {
        }
        this.v0.setOnScrollListener(new j3(this, 29));
        this.u0.addView(this.t0, w7.z5.c(-2.0f, i14));
        org.telegram.ui.Components.o91 o91Var2 = new org.telegram.ui.Components.o91(context);
        this.w1 = o91Var2;
        o91Var2.b(new fb1(this, i262));
        org.telegram.ui.ActionBar.i6 i6Var2 = this.v;
        if (i11 != 1) {
        }
        if (i11 != 2) {
        }
        Rect rect22 = new Rect();
        Drawable mutate22 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.r = mutate22;
        mutate22.getPadding(rect22);
        Drawable drawable3 = this.r;
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
        this.s = themedColor2;
        drawable3.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        obj = this.C1;
        if (i11 != 1) {
        }
        if (obj instanceof zh1) {
        }
        i16 = 3;
        String[] strArr3222 = new String[i16];
        int[] iArr3222 = new int[i16];
        this.K0 = new org.telegram.ui.Components.m91[i16];
        if (i16 != 0) {
        }
        i19 = 0;
        while (true) {
            qb1Var = this.a;
            if (i19 >= i16) {
            }
            i19++;
            i25 = 0;
            i15 = 2;
            i17 = 1;
        }
        i20 = i17;
        if (i11 == i20) {
        }
        if (i11 != i21) {
        }
        this.G1 = false;
        i22 = 0;
        while (i22 < 2) {
        }
        j1();
        if (!this.y0.getImageReceiver().hasBitmapImage()) {
        }
        if (i11 != 1) {
        }
        this.v0.setAdapter(this.w0);
        ah.v vVar22 = new ah.v(this, context, 27);
        this.l0 = vVar22;
        vVar22.setWillNotDraw(false);
        ah.v vVar32 = this.l0;
        this.fragmentView = vVar32;
        ViewTreeObserver viewTreeObserver2 = vVar32.getViewTreeObserver();
        int i452 = 1;
        t90 t90Var2 = new t90(this, i452);
        this.R = t90Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(t90Var2);
        z4.h hVar2 = new z4.h(context);
        this.k0 = hVar2;
        hVar2.b(new n2(this, 2));
        this.k0.setAdapter(new m70(this, i452));
        AndroidUtilities.setViewPagerEdgeEffectColor(this.k0, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        this.l0.addView(this.k0, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
        UndoView undoView2 = new UndoView(context, this);
        this.m0 = undoView2;
        undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.l0.addView(this.m0, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i11 != 0) {
        }
        if (i11 == i23) {
            X0();
        }
        this.j0 = S0();
        b1(true);
        m1(false);
        this.c = new Scroller(getContext());
        h5Var2 = this.parentLayout;
        if (h5Var2 != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
            if (i11 == 2) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(org.telegram.ui.Cells.v0 v0Var) {
        float f7;
        if (this.y0 == null) {
            return;
        }
        Bitmap bitmap = this.a.i;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.y0.getMeasuredWidth() - (Math.max(this.y0.getMeasuredWidth() / width, this.y0.getMeasuredHeight() / r0.i.getHeight()) * width)) / 2.0f) + this.Y1 + 0.0f;
        } else {
            f7 = this.Y1 + 0.0f;
        }
        float y3 = v0Var.getY() - ((-this.y0.J) + 0.0f);
        int measuredHeight = this.y0.getMeasuredHeight();
        float f10 = this.N1 ? this.o1 * this.p1 : 0.0f;
        v0Var.w0 = true;
        v0Var.v0 = measuredHeight;
        v0Var.t0 = y3;
        v0Var.u0 = f7;
        v0Var.b2 = f10;
        v0Var.c2.setColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        v0Var.invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.K1 == ((Long) objArr[2]).longValue()) {
                this.W1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.mm0 mm0Var = this.o0;
            if (mm0Var == null) {
                return;
            }
            int childCount = mm0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.o0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) childAt).a0(0, true);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            lb1 lb1Var = this.v0;
            if (lb1Var != null) {
                lb1Var.g1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.u0 != null) {
                b1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.C1;
            if (obj instanceof ai1) {
                ai1 ai1Var = (ai1) obj;
                if (ai1Var.a == null) {
                    ai1Var.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j10 = 0;
        if (i10 != NotificationCenter.wallpapersDidLoad) {
            if (i10 != NotificationCenter.wallpaperSettedToUser || this.K1 == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.V0.clear();
        HashMap hashMap = this.W0;
        hashMap.clear();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.V0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                org.telegram.ui.ActionBar.i6 i6Var = this.v;
                if (i6Var != null && (str = i6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.X0 = (TLRPC.TL_wallPaper) wallPaper;
                    b1(false);
                    j1();
                } else if (i6Var == null) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        String str2 = tL_wallPaper2.slug;
                        if (str2 != null) {
                            if (!str2.equals(wallPaper.slug)) {
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        if (!z10 && (tL_wallPaper = this.X0) != null) {
            this.V0.add(0, tL_wallPaper);
        }
        oc1 oc1Var = this.R0;
        if (oc1Var != null) {
            oc1Var.l();
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new jb1(this, 1)), this.classGuid);
    }

    public final void e1() {
        if (this.u0 == null || this.L0 == null || this.v.g == 0) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.B0 == null) {
            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(getParentActivity(), 8);
            this.B0 = r40Var;
            r40Var.setShowingDuration(5000L);
            this.B0.setAlpha(0.0f);
            this.B0.setVisibility(4);
            this.B0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.B0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.l0.addView(this.B0, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        AndroidUtilities.runOnUIThread(new o71(7, this, globalMainSettings), 500L);
    }

    public final void f1(int i10, boolean z10, boolean z11) {
        int indexOf;
        boolean z12 = z10 && i10 == 1 && this.X0 != null;
        int i11 = this.b;
        if (z10) {
            if (i10 != 0) {
                this.Y0 = this.X0;
                this.n1 = this.m1;
                this.R0.l();
                ArrayList arrayList = this.V0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (i11 == 2 ? 1 : 0);
                    }
                    this.S0.h1(indexOf, (this.Q0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            } else if (i11 == 2) {
                this.b1 = this.a1;
                int i12 = this.c1;
                this.f1 = i12;
                int i13 = this.d1;
                this.g1 = i13;
                int i14 = this.e1;
                this.h1 = i14;
                this.j1 = this.P;
                this.W.f(0, 4, i14 != 0 ? 4 : i13 != 0 ? 3 : i12 != 0 ? 2 : 1, false);
                this.W.e(this.e1, 3);
                this.W.e(this.d1, 2);
                this.W.e(this.c1, 1);
                this.W.e(this.a1, 0);
            }
        }
        if (i11 == 1 || i11 == 2) {
            this.K0[z12 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.i0 i0Var = this.U0;
            if (!i0Var.M) {
                float f7 = this.m1;
                if (f7 < 0.0f) {
                    float f10 = -f7;
                    this.m1 = f10;
                    i0Var.setProgress(f10);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (!z11) {
            char c10 = i10 == 0 ? (char) 1 : (char) 0;
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i11 == 1) {
                    this.v0.setTranslationY(i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f);
                    this.K0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.K0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.W.E[1]);
                } else if (i11 == 2) {
                    this.v0.setTranslationY(AndroidUtilities.dp((this.B1 == null ? 0 : 58) + 72) + (-AndroidUtilities.dp(i10 == 0 ? 343.0f : 316.0f)) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.K0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.K0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (frameLayoutArr[c10].getVisibility() == 0) {
                        frameLayoutArr[c10].setAlpha(0.0f);
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
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.W.E[1]);
                }
            } else {
                this.v0.setTranslationY(0.0f);
                frameLayoutArr[i10].setTranslationY(r9.getMeasuredHeight());
                this.K0[0].setAlpha(1.0f);
                this.K0[2].setAlpha(1.0f);
                this.y0.setAlpha(1.0f);
            }
            if (z10 && frameLayoutArr[c10].getVisibility() == 0) {
                frameLayoutArr[c10].setAlpha(1.0f);
                frameLayoutArr[c10].setVisibility(4);
            } else if (!z10) {
                frameLayoutArr[i10].setVisibility(4);
            }
            if (i11 == 1 || i11 == 2) {
                this.K0[z12 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i10 == 1) {
                    frameLayoutArr[c10].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.s1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i15 = i10 == 0 ? 1 : 0;
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i11 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.v0, (Property<lb1, Float>) View.TRANSLATION_Y, i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                org.telegram.ui.Components.m91 m91Var = this.K0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(m91Var, (Property<org.telegram.ui.Components.m91, Float>) property, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.m91, Float>) property, z12 ? 0.0f : 1.0f));
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.W.E[1]);
            } else if (i11 == 2) {
                lb1 lb1Var = this.v0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(lb1Var, (Property<lb1, Float>) property2, AndroidUtilities.dp((this.B1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i10].getMeasuredHeight()) + (U0() ? AndroidUtilities.navigationBarHeight : 0)));
                org.telegram.ui.Components.m91 m91Var2 = this.K0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(m91Var2, (Property<org.telegram.ui.Components.m91, Float>) property3, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.m91, Float>) property3, z12 ? 0.0f : 1.0f));
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
                AndroidUtilities.hideKeyboard(this.W.E[1]);
            }
        } else {
            lb1 lb1Var2 = this.v0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(lb1Var2, (Property<lb1, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.m91 m91Var3 = this.K0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(m91Var3, (Property<org.telegram.ui.Components.m91, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.K0[2], (Property<org.telegram.ui.Components.m91, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.y0, (Property<fc1, Float>) property5, 1.0f));
        }
        this.s1.playTogether(arrayList2);
        this.s1.addListener(new xb1(this, z10, i15, i10, z12));
        this.s1.setInterpolator(org.telegram.ui.Components.bs.g);
        this.s1.setDuration(200L);
        this.s1.start();
    }

    public final void g1() {
        if (this.i2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (U0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.P1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.P1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int i10 = 2;
        int[] iArr = new int[2];
        this.P1.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        lc lcVar = new lc(this, getParentActivity(), canvas, (this.P1.getMeasuredWidth() / 2.0f) + f7, (this.P1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.i2 = lcVar;
        lcVar.setOnTouchListener(new di.d(i10));
        this.j2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new ei.eb(this, 3));
        this.k2.addListener(new ub1(this, 4));
        this.k2.setDuration(400L);
        this.k2.setInterpolator(org.telegram.ui.Components.st.e);
        this.k2.start();
        frameLayout.addView(this.i2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new db1(this, i10));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.u1;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return this.M1 ? S0() : super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        long j10 = this.K1;
        if (j10 > 0) {
            this.A1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
            return;
        }
        if (j10 >= 0) {
            this.A1.d(LocaleController.getString(R.string.ApplyWallpaper));
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.K1));
        int i10 = 1;
        if (chat == null) {
            this.A1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.A1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.r1 == null) {
                org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.mini_switch_lock, 0);
                this.r1 = xqVar;
                xqVar.setTopOffset(1);
            }
            spannableStringBuilder.setSpan(this.r1, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
            this.A1.c(spannableStringBuilder, z10);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
        if (tL_premium_boostsStatus2 != null) {
            this.A1.c(null, z10);
            return;
        }
        if (this.K1 >= 0 || this.U1 || this.V1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.U1 = true;
        getMessagesController().getBoostsController().getBoostsStats(this.K1, new gb1(this, i10));
    }

    public final void i1() {
        if (this.G1 && this.x1 == null) {
            Bitmap bitmap = this.D1;
            if (bitmap != null) {
                this.y1 = bitmap;
                this.x1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.y1 = imageReceiver.getBitmap();
                    this.x1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (!this.G1) {
            b1(false);
            return;
        }
        Bitmap bitmap2 = this.x1;
        if (bitmap2 != null) {
            this.y0.setImageBitmap(bitmap2);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.b2 || motionEvent == null) {
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
        Object obj = this.X0;
        if (obj == null) {
            obj = this.C1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof MediaController.SearchImage)) {
            if (z10) {
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
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.I1, true);
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
                this.y0.invalidate();
                if (i11 == 2) {
                    if (j10 == 0 || this.K1 != 0) {
                        this.t0.setSubtitle(null);
                    } else {
                        this.t0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.K1 == 0) {
                    this.t0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.y0.invalidate();
            }
            if (this.X0 == null && (frameLayout = this.z0) != null) {
                frameLayout.setAlpha(exists ? 1.0f : 0.5f);
            }
            if (i11 == 0) {
                this.d0.setEnabled(exists);
                this.d0.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            if (i11 != 2) {
                this.f.setEnabled(exists);
                this.f.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            this.D0.setEnabled(exists);
            gc1 gc1Var = this.A1;
            if (gc1Var != null) {
                gc1Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            gc1 gc1Var2 = this.B1;
            if (gc1Var2 != null) {
                gc1Var2.setAlpha(exists ? 1.0f : 0.5f);
            }
        }
    }

    public final void k1() {
        this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
        this.y0.invalidate();
        this.Q0.g1();
        if (this.m1 >= 0.0f) {
            this.y0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.y0.getImageReceiver().setBlendMode(null);
            }
            if (this.y0.getBackground() instanceof org.telegram.ui.Components.yc0) {
                this.y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.yc0) this.y0.getBackground()).k);
            }
        }
        this.a.j(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        V0();
    }

    public final void l1() {
        int i10 = this.b;
        if (i10 == 1 || i10 == 2) {
            if (this.X0 == null && (this.C1 instanceof zh1)) {
                this.K0[2].a(false, true);
            }
            this.K0[this.X0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.m91 m91Var = this.K0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(m91Var, (Property<org.telegram.ui.Components.m91, Float>) property, this.X0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.m91, Float>) property, this.X0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new vb1(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.bs.g);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean isEnabled = this.K0[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.X0;
        if (isEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.K0[0].a(false, true);
        }
        this.K0[0].setEnabled(this.X0 != null);
        if (this.X0 != null) {
            this.K0[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.K0[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int dp = (AndroidUtilities.dp(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.m91, Float>) View.ALPHA, this.X0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.m91 m91Var2 = this.K0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(m91Var2, (Property<org.telegram.ui.Components.m91, Float>) property2, this.X0 != null ? 0.0f : dp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.m91, Float>) property2, this.X0 == null ? -dp : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.bs.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new wb1(this));
        animatorSet2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x008d, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r23.c1 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(boolean z10) {
        int i10;
        int i11;
        char c10;
        float f7;
        int i12;
        ob1 ob1Var;
        boolean z11;
        int i13;
        BlendMode blendMode;
        int i14 = Build.VERSION.SDK_INT;
        int i15 = this.b;
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        if (i14 >= 29) {
            if (i15 == 0) {
                i13 = i6Var != null ? (int) i6Var.l : getThemedColor(org.telegram.ui.ActionBar.k6.Pd);
            } else if (i15 == 1) {
                i13 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                long j10 = i6Var.l;
                int i16 = (int) j10;
                if (i16 != 0 || j10 == 0) {
                    if (i16 != 0) {
                        i13 = i16;
                    }
                }
                i13 = 0;
            } else {
                if (this.C1 instanceof zh1) {
                    i13 = this.d1;
                }
                i13 = 0;
            }
            if (i13 == 0 || this.m1 < 0.0f) {
                this.y0.getImageReceiver().setBlendMode(null);
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
            }
        }
        int i17 = 2;
        if (this.E0 != null) {
            if (i15 != 2) {
                if (i15 == 1) {
                    int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                    long j11 = i6Var.k;
                    int i18 = (int) j11;
                    if (i18 == 0 && j11 != 0) {
                        D0 = 0;
                    } else if (i18 != 0) {
                        D0 = i18;
                    }
                }
                z11 = false;
            }
            boolean z12 = this.E0.getTag() != null;
            this.E0.setTag(z11 ? 1 : null);
            if (z12 != z11) {
                if (z11) {
                    this.E0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.I0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I0 = animatorSet2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, (Property<ob1, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                    c10 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, (Property<ob1, Float>) View.SCALE_X, z11 ? 1.0f : 0.0f);
                    f7 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.E0, (Property<ob1, Float>) View.SCALE_Y, z11 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.m91 m91Var = this.K0[0];
                    Property property = View.TRANSLATION_X;
                    i11 = 3;
                    i12 = 5;
                    i10 = 0;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(m91Var, (Property<org.telegram.ui.Components.m91, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.m91, Float>) property, z11 ? -AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.K0[2], (Property<org.telegram.ui.Components.m91, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f));
                    this.I0.setDuration(180L);
                    this.I0.addListener(new ub1(this, i17));
                    this.I0.setInterpolator(org.telegram.ui.Components.bs.g);
                    this.I0.start();
                } else {
                    i10 = 0;
                    i11 = 3;
                    c10 = 4;
                    f7 = 1.0f;
                    i12 = 5;
                    this.E0.setAlpha(z11 ? 1.0f : 0.0f);
                    this.E0.setScaleX(z11 ? 1.0f : 0.0f);
                    this.E0.setScaleY(z11 ? 1.0f : 0.0f);
                    this.K0[0].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                    this.K0[1].setTranslationX(z11 ? -AndroidUtilities.dp(34.0f) : 0.0f);
                    this.K0[2].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                }
                ob1Var = this.F0;
                if (ob1Var == null) {
                    int i19 = ob1Var.getTag() != null ? 1 : i10;
                    this.F0.setTag(1);
                    if (i19 != 1) {
                        this.F0.setVisibility(i10);
                        AnimatorSet animatorSet3 = this.J0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z10) {
                            float f10 = f7;
                            this.F0.setAlpha(f10);
                            this.F0.setScaleX(f10);
                            this.F0.setScaleY(f10);
                            this.L0[0].setTranslationX(-AndroidUtilities.dp(34.0f));
                            this.L0[1].setTranslationX(AndroidUtilities.dp(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.J0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.F0, (Property<ob1, Float>) View.ALPHA, f7);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.F0, (Property<ob1, Float>) View.SCALE_X, f7);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.F0, (Property<ob1, Float>) View.SCALE_Y, f7);
                        org.telegram.ui.Components.m91 m91Var2 = this.L0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(m91Var2, (Property<org.telegram.ui.Components.m91, Float>) property2, -AndroidUtilities.dp(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.L0[1], (Property<org.telegram.ui.Components.m91, Float>) property2, AndroidUtilities.dp(34.0f));
                        Animator[] animatorArr = new Animator[i12];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[i11] = ofFloat7;
                        animatorArr[c10] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.J0.setDuration(180L);
                        this.J0.addListener(new ub1(this, i11));
                        this.J0.setInterpolator(org.telegram.ui.Components.bs.g);
                        this.J0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        i10 = 0;
        i11 = 3;
        c10 = 4;
        f7 = 1.0f;
        i12 = 5;
        ob1Var = this.F0;
        if (ob1Var == null) {
        }
    }

    public final void n1() {
        int childCount = this.Q0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.Q0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j5) {
                ((org.telegram.ui.Cells.j5) childAt).u(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!P0(z10)) {
            return false;
        }
        N0(true);
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var == null || h5Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
        if (this.b != 2 || this.K1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        j1();
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            org.telegram.ui.ActionBar.k6.N = true;
        }
        if (i10 == 0 && this.v == null) {
            this.F1 = org.telegram.ui.ActionBar.k6.i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.H1 = a1.g.n((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.I1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.u1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.V0 == null) {
                this.V0 = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        ah.v vVar = this.l0;
        if (vVar != null && this.R != null) {
            vVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
        int i10 = this.b;
        if ((i10 == 2 || i10 == 1) && this.q1 == null) {
            AndroidUtilities.runOnUIThread(new if0(6));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.x1;
            if (bitmap != null) {
                bitmap.recycle();
                this.x1 = null;
            }
            this.a.j(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.v != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        O0(null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        if (this.F1) {
            this.w1.c(false);
        }
        org.telegram.ui.ActionBar.k6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        ic1 ic1Var = this.p0;
        if (ic1Var != null) {
            ic1Var.l();
        }
        mc1 mc1Var = this.w0;
        if (mc1Var != null) {
            mc1Var.l();
        }
        if (this.F1) {
            this.w1.c(true);
        }
        org.telegram.ui.ActionBar.k6.b = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Q0();
            try {
                z4.h hVar = this.k0;
                if (hVar != null) {
                    AndroidUtilities.setViewPagerEdgeEffectColor(hVar, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
                }
                org.telegram.ui.Cells.i0 i0Var = this.U0;
                if (i0Var != null) {
                    i0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
                    this.U0.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10 || this.b != 2) {
            return;
        }
        this.a.j(null, null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.a.a = g6Var;
    }

    public qc1(org.telegram.ui.ActionBar.j6 j6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.a = new qb1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.s5 s5Var = new org.telegram.ui.ActionBar.s5(this, 0, false);
        this.S = s5Var;
        org.telegram.ui.ActionBar.s5 s5Var2 = new org.telegram.ui.ActionBar.s5(this, 0, true);
        this.T = s5Var2;
        org.telegram.ui.ActionBar.s5 s5Var3 = new org.telegram.ui.ActionBar.s5(this, 1, false);
        this.U = s5Var3;
        org.telegram.ui.ActionBar.s5 s5Var4 = new org.telegram.ui.ActionBar.s5(this, 1, true);
        this.V = s5Var4;
        this.Y = -1;
        this.Z = new db1(this, 0);
        this.x0 = new fc1[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.m1 = 0.5f;
        this.o1 = 0.0f;
        this.t1 = PorterDuff.Mode.SRC_IN;
        this.z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.s20(getParentActivity(), new sb1(this));
        this.U1 = false;
        this.V1 = false;
        this.b = i10;
        this.g0 = z12;
        this.f0 = j6Var;
        this.i0 = z10;
        this.h0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.i6 k10 = j6Var.k(!z11);
            this.v = k10;
            if (k10 != null) {
                this.d = false;
                this.x = k10.c;
                this.y = k10.d;
                this.E = k10.e;
                this.F = k10.f;
                this.G = k10.g;
                this.H = k10.h;
                this.I = k10.i;
                this.J = k10.j;
                this.K = k10.k;
                this.L = k10.l;
                this.M = k10.m;
                this.N = k10.p;
                this.O = k10.o;
                this.P = k10.n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.i6 k11 = j6Var.k(false);
            this.v = k11;
            if (k11 != null) {
                this.X0 = k11.s;
            }
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        if (i6Var != null) {
            this.F1 = i6Var.q;
            if (!TextUtils.isEmpty(i6Var.o)) {
                this.m1 = this.v.p;
            }
            org.telegram.ui.ActionBar.k6.M = org.telegram.ui.ActionBar.k6.C0();
            org.telegram.ui.ActionBar.k6.O = true;
            org.telegram.ui.ActionBar.k6.P = true;
            org.telegram.ui.ActionBar.k6.t(j6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        s5Var.v = true;
        s5Var3.v = true;
        s5Var2.v = true;
        s5Var4.v = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    public qc1(org.telegram.ui.ActionBar.j6 j6Var) {
        this(j6Var, false, 0, false, false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
