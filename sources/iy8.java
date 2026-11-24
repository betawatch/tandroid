// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class iy8 extends d {
    public boolean E;
    public boolean F;
    public zx8 G;
    public boolean H;
    public final dy8 I;
    public int J;
    public final Paint K;
    public float L;
    public final int[] M;
    public final int[] N;
    public LinearGradient O;
    public final Paint P;
    public final Matrix Q;
    public final Paint R;
    public final RectF S;
    public final float[] T;
    public final int[] U;
    public final int[] V;
    public LinearGradient W;
    public int X;
    public int Y;
    public int Z;
    public long a;
    public ox8 a0;
    public long b;
    public int b0;
    public lj4 c;
    public int c0;
    public wy8 d;
    public int d0;
    public my8 e;
    public float e0;
    public FrameLayout f;
    public boolean f0;
    public LinearGradient g0;
    public gy8 h;
    public final Paint h0;
    public final RectF i0;
    public final int[] j0;
    public final int[] k0;
    public final int[] l0;
    public final Path m0;
    public float n;
    public final RectF n0;
    public Paint o0;
    public final oo4 p0;
    public final RectF q0;
    public float r;
    public boolean r0;
    public float s;
    public Boolean s0;
    public float w;
    public float x;
    public cz3 y;

    public iy8(Bundle bundle) {
        super(bundle);
        this.I = new dy8(this, (byte) 0);
        this.K = new Paint();
        this.L = Float.NaN;
        this.M = new int[2];
        this.N = new int[2];
        this.P = new Paint();
        this.Q = new Matrix();
        this.R = new Paint(1);
        this.S = new RectF();
        this.T = new float[2];
        this.U = new int[2];
        this.V = new int[2];
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.h0 = new Paint();
        this.i0 = new RectF();
        this.j0 = new int[2];
        this.k0 = new int[2];
        this.l0 = new int[2];
        this.m0 = new Path();
        this.n0 = new RectF();
        this.p0 = new oo4();
        this.q0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void a0(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a0(viewGroup.getChildAt(i));
            }
        }
    }

    public static void d0(d dVar) {
        lb1.j0(dVar.getParentActivity(), 1, new de(dVar.getCurrentAccount(), (Object) dVar, (byte) 14));
    }

    public static LinearGradient j0(boolean z) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            float f = i / 8.0f;
            float B = mlb.B(f, 2.0f, 3.0f, f * f);
            if (!z) {
                B = 1.0f - B;
            }
            iArr[i] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i] = f;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void Z() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            gm.h3(parentActivity, false);
            gm.n3(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.s0 == null) {
                    this.s0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void b0(AnimatorSet animatorSet) {
        l0();
        boolean z = !this.E;
        int i = this.currentAccount;
        this.Z = i;
        this.X = nm7.f(i).p(null, -1, z);
        this.Y = nm7.e().p(null, -1, z);
        animatorSet.start();
    }

    public final void c0() {
        wy8 wy8Var;
        if (this.h == null || (wy8Var = this.d) == null || wy8Var.getWidth() == 0) {
            return;
        }
        int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
        this.d.getClass();
        int width = (int) (this.f.getWidth() - (this.d.getWidth() - gm.L(10.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        if (layoutParams.height == max && layoutParams.leftMargin == r2 && layoutParams.rightMargin == width) {
            return;
        }
        layoutParams.height = max;
        layoutParams.leftMargin = r2;
        layoutParams.rightMargin = width;
        this.h.setLayoutParams(layoutParams);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void clearViews() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        zx8 zx8Var = this.G;
        if (zx8Var != null) {
            zx8Var.g();
            this.G = null;
        }
        my8 my8Var = this.e;
        if (my8Var != null) {
            my8Var.l();
            this.e = null;
        }
        super.clearViews();
        wy8 wy8Var = this.d;
        if (wy8Var != null) {
            wy8Var.O0();
            this.d = null;
        }
        this.f = null;
        this.h = null;
        this.y = null;
        this.a0 = null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final a createActionBar(Context context) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ad, code lost:
    
        if (r13 != 1) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bd  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        byte b;
        boolean z;
        ky8 ky8Var;
        ArrayList v;
        byte b2;
        boolean startsWith;
        long j;
        TLRPC.ShareTheme shareTheme;
        int i = this.currentAccount;
        gx8[] gx8VarArr = gx8.f;
        if (gx8VarArr[i] == null) {
            gx8VarArr[i] = new gx8(i);
        }
        gx8 gx8Var = gx8VarArr[i];
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = gx8Var.b;
        le0.a(tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null);
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops2 = gx8Var.b;
        ak8 ak8Var = new ak8((Object) this, (Object) gx8Var, (Object) (tL_shareThemeBackdrops2 != null ? tL_shareThemeBackdrops2.backdrops : null), (byte) 9);
        byte b3 = 6;
        byte b4 = 0;
        if (gx8Var.d) {
            ak8Var.run();
        } else {
            gx8Var.e.add(ak8Var);
            if (!gx8Var.c) {
                gx8Var.c = true;
                TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops3 = gx8Var.b;
                tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops3 != null ? tL_shareThemeBackdrops3.hash : 0;
                ConnectionsManager.getInstance(gx8Var.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new kc(b4), new vh8(gx8Var, b3));
            }
        }
        Activity parentActivity = getParentActivity();
        bt7 bt7Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).t1 : null;
        if (bt7Var != null && this.c == null) {
            lj4 lj4Var = new lj4(bt7Var);
            bt7Var.b.add(lj4Var);
            bt7Var.a();
            this.c = lj4Var;
        }
        int i2 = this.currentAccount;
        long j2 = this.a;
        long j3 = this.b;
        oc7 r1 = oc7.r1(i2);
        String j4 = b10.j(new StringBuilder("https://"), r1.N2, "/");
        if (j2 != 0 || j3 == 0) {
            if (j2 == z8c.h(i2).e()) {
                b = 2;
                z = true;
            } else {
                b = 2;
                z = false;
            }
            TLRPC.User W1 = r1.W1(Long.valueOf(j2));
            String p = W1 != null ? m9c.p(W1) : null;
            if (p != null) {
                ky8Var = new ky8(j4.concat(p), p, true, false, z, j2, z);
            } else if (z) {
                if (W1 != null && W1.phone != null && (v = bw2.r(i2).v(6)) != null) {
                    int size = v.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = v.get(i3);
                        i3++;
                        TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) obj;
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowAll)) {
                            if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                break;
                            }
                            if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                b2 = 1;
                                break;
                            }
                        } else {
                            b2 = 0;
                            break;
                        }
                    }
                    b2 = b;
                    if (b2 == b) {
                        ArrayList v2 = bw2.r(i2).v(7);
                        if (v2 != null && !v2.isEmpty()) {
                            int size2 = v2.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                Object obj2 = v2.get(i4);
                                i4++;
                                TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) obj2;
                                if (!(privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll)) {
                                    if ((privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) || (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        startsWith = W1.phone.startsWith("+");
                        String str = W1.phone;
                        if (!startsWith) {
                            str = b10.h("+", str);
                        }
                        String str2 = str;
                        ky8Var = new ky8(b10.h(j4, str2), str2, false, false, true, j2, true);
                    }
                    if (b2 != 0) {
                    }
                    startsWith = W1.phone.startsWith("+");
                    String str3 = W1.phone;
                    if (!startsWith) {
                    }
                    String str22 = str3;
                    ky8Var = new ky8(b10.h(j4, str22), str22, false, false, true, j2, true);
                }
                TLRPC.TL_exportedContactToken tL_exportedContactToken = r1.N4;
                TLRPC.TL_exportedContactToken tL_exportedContactToken2 = (tL_exportedContactToken == null || ((long) tL_exportedContactToken.expires) <= System.currentTimeMillis() / 1000) ? null : r1.N4;
                ky8Var = new ky8(tL_exportedContactToken2 != null ? tL_exportedContactToken2.url : null, W1 != null ? m9c.r(W1) : "", false, true, true, j2, true);
            } else {
                ky8Var = new ky8(j4, W1 != null ? m9c.r(W1) : "", false, false, false, j2, false);
            }
        } else {
            TLRPC.Chat L0 = r1.L0(Long.valueOf(j3));
            String K = sd2.K(L0, false);
            if (K != null) {
                ky8 ky8Var2 = new ky8(j4.concat(K), K, true, false, false, -j3, sd2.w(1, L0));
                b = 2;
                ky8Var = ky8Var2;
            } else {
                ky8 ky8Var3 = new ky8(j4, L0 != null ? L0.title : "", false, false, false, -j3, false);
                b = 2;
                ky8Var = ky8Var3;
            }
        }
        this.f = new FrameLayout(context);
        wy8 wy8Var = new wy8(context, this.currentAccount, ky8Var.a, ky8Var.b, ky8Var.c, new oo8(this, b));
        this.d = wy8Var;
        this.f.addView(wy8Var, qoe.c(-1.0f, -1));
        this.d.setImmediateOnOpen(this.E);
        this.d.setRevealOpening(true);
        if (this.H) {
            this.d.setReveal(1.0f);
            this.f.postDelayed(this.I, 680L);
        } else {
            boolean O1 = gm.O1();
            wy8 wy8Var2 = this.d;
            if (O1) {
                wy8Var2.setReveal(1.0f);
                wy8Var2.S4 = false;
            } else {
                wy8Var2.setReveal(0.0f);
            }
        }
        this.fragmentView = this.f;
        my8 my8Var = this.e;
        if (my8Var != null) {
            my8Var.l();
        }
        int i5 = this.currentAccount;
        wy8 wy8Var3 = this.d;
        my8 my8Var2 = new my8(i5, wy8Var3, ky8Var);
        this.e = my8Var2;
        boolean z2 = ky8Var.d;
        wy8Var3.setTimerOnly(z2);
        wy8Var3.setTemporaryLink(z2);
        LongSparseArray h = my8.h(i5);
        long j5 = ky8Var.f;
        ly8 ly8Var = (ly8) h.get(j5);
        if (ly8Var != null) {
            shareTheme = ly8Var.a;
            j = 0;
        } else {
            oc7 r12 = oc7.r1(i5);
            j = 0;
            if (j5 > 0) {
                TLRPC.UserFull X1 = r12.X1(j5);
                if (X1 != null) {
                    shareTheme = X1.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            } else {
                TLRPC.ChatFull M0 = r12.M0(-j5);
                if (M0 != null) {
                    shareTheme = M0.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            }
        }
        if (shareTheme != null) {
            wy8Var3.setInstantTheme(true);
            my8Var2.a(shareTheme);
            wy8Var3.setInstantTheme(false);
        }
        boolean z3 = ky8Var.g;
        wy8Var3.setThemeEditable(z3);
        if (z3) {
            wy8Var3.setGiftsOwner(j5);
        }
        if (ky8Var.e) {
            nm7.f(i5).b(my8Var2, nm7.k0);
            if (z2) {
                oc7 r13 = oc7.r1(i5);
                TLRPC.TL_exportedContactToken tL_exportedContactToken3 = r13.N4;
                TLRPC.TL_exportedContactToken tL_exportedContactToken4 = (tL_exportedContactToken3 == null || ((long) tL_exportedContactToken3.expires) <= System.currentTimeMillis() / 1000) ? null : r13.N4;
                my8Var2.r = tL_exportedContactToken4;
                if (tL_exportedContactToken4 == null) {
                    my8Var2.m();
                } else {
                    wy8Var3.setLinkExpires(tL_exportedContactToken4.expires);
                }
            }
            my8Var2.r();
            my8Var2.g();
            my8Var2.p();
        } else {
            wy8Var3.setFeeStars(j);
            my8Var2.g();
        }
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        if (getParentActivity() == null) {
            return;
        }
        ux4 ux4Var = new ux4(getParentActivity(), this.currentAccount, getUserConfig().e(), null, null);
        if (!ux4Var.n2) {
            ux4Var.n2 = true;
            uwa uwaVar = ux4Var.p2;
            if (uwaVar != null && (uwaVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) ux4Var.p2.getParent();
                int indexOfChild = viewGroup.indexOfChild(ux4Var.p2);
                viewGroup.removeView(ux4Var.p2);
                uwa uwaVar2 = new uwa(ux4Var.getContext(), nm7.Y3, 2);
                ux4Var.p2 = uwaVar2;
                viewGroup.addView(uwaVar2, indexOfChild, qoe.c(-1.0f, -1));
            }
            l66 l66Var = ux4Var.q2;
            if (l66Var != null) {
                String M0 = jb6.M0(2131750221, null);
                a31 a31Var = ux4Var.e2;
                a31Var.setText(M0);
                a31Var.setBreakStrategy(2);
                l66Var.setVisibility(8);
            }
            ux4Var.T1.O(false);
        }
        ux4Var.show();
    }

    public final void f0() {
        if (this.G != null || this.d == null || this.f == null || getParentActivity() == null) {
            return;
        }
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        rectF.set(this.d.j7);
        rectF2.set(this.d.g7);
        if (rectF.isEmpty()) {
            rectF.set((this.f.getWidth() / 2.0f) - gm.L(20.0f), (this.f.getHeight() / 2.0f) - gm.L(20.0f), (this.f.getWidth() / 2.0f) + gm.L(20.0f), (this.f.getHeight() / 2.0f) + gm.L(20.0f));
        }
        this.d.setScanHidden(true);
        zx8 zx8Var = new zx8(getParentActivity(), rectF, rectF2, new et8((Object) this, (byte) 1));
        this.G = zx8Var;
        zx8Var.setButtonLabel(jb6.M0(2131746203, null));
        zx8 zx8Var2 = this.G;
        zx8Var2.setOnGallery(new ey8(this, zx8Var2, (byte) 0));
        this.f.addView(this.G, qoe.c(-1.0f, -1));
    }

    public final void g0(float f, float f2, boolean z) {
        gy8 gy8Var = this.h;
        if (!z) {
            if (gy8Var != null && gy8Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            cz3 cz3Var = this.y;
            if (cz3Var == null || cz3Var.getVisibility() != 0) {
                return;
            }
            this.y.setVisibility(4);
            return;
        }
        if (gy8Var == null) {
            if (getParentActivity() == null) {
                return;
            }
            gy8 gy8Var2 = new gy8(this, getParentActivity(), this.currentAccount, new fy8(this));
            this.h = gy8Var2;
            gy8Var2.setOutlineProvider(new hy8(this, (byte) 0));
            this.h.setClipToOutline(true);
            cz3 cz3Var2 = new cz3(getParentActivity(), new lj4(this));
            this.y = cz3Var2;
            cz3Var2.b = this.h;
            this.d.setOnPicksChanged(new dy8(this, (byte) 1));
            this.y.setOutlineProvider(this.h.getOutlineProvider());
            this.y.setClipToOutline(true);
            this.f.addView(this.h, qoe.e(-1, -1, 48));
            c0();
            this.f.post(new dy8(this, (byte) 2));
        }
        c0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i = layoutParams.height;
        int i2 = layoutParams.leftMargin;
        int i3 = layoutParams.rightMargin;
        if (this.y.getParent() == null) {
            this.f.addView(this.y, qoe.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.y.getLayoutParams();
        if (layoutParams2.height != i || layoutParams2.leftMargin != i2 || layoutParams2.rightMargin != i3) {
            layoutParams2.height = i;
            layoutParams2.leftMargin = i2;
            layoutParams2.rightMargin = i3;
            this.y.setLayoutParams(layoutParams2);
        }
        this.y.setTranslationY(f);
        this.y.setAlpha(f2);
        this.y.invalidateOutline();
        this.y.invalidate();
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        int t0 = this.d.t0();
        uy8 uy8Var = this.d.n;
        int i4 = t0 ^ (uy8Var != null ? uy8Var.h : 872415231);
        if (this.h.getTranslationY() != f || i4 != this.J) {
            this.h.setTranslationY(f);
            this.J = i4;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f2);
        gy8 gy8Var3 = this.h;
        wy8 wy8Var = this.d;
        uy8 uy8Var2 = wy8Var.n;
        int i5 = uy8Var2 != null ? uy8Var2.b : -16777216;
        if (i5 != wy8Var.b2) {
            wy8Var.b2 = i5;
            wy8Var.c2 = (on2.f(0.13f, -1, wy8.D0(0.75f, 1.3f, 0.16f, i5)) & 16777215) | (-1728053248);
        }
        gy8Var3.setHeaderColor(wy8Var.c2);
        if (this.h.getVisibility() != 0) {
            gy8 gy8Var4 = this.h;
            if (gy8Var4.K) {
                gy8Var4.K = false;
                gy8Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (this.r0) {
            return;
        }
        k0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        wy8 wy8Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || (wy8Var = this.d) == null || wy8Var.getCurrentLink() == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 28 || e21.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.F = true;
            parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        } else {
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.e.c(new mn8(this, T0, (byte) 29));
            }
        }
    }

    public final void i0(String str) {
        wy8 wy8Var;
        if (getParentActivity() == null || (wy8Var = this.d) == null || wy8Var.getCurrentLink() == null) {
            return;
        }
        Bitmap T0 = this.d.T0();
        Uri B0 = T0 != null ? gm.B0(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG) : null;
        Intent intent = new Intent("android.intent.action.SEND");
        if (B0 != null) {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", B0);
            intent.addFlags(1);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        try {
            getParentActivity().startActivity(Intent.createChooser(intent, jb6.M0(2131748927, null)));
        } catch (ActivityNotFoundException e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void k0() {
        gy8 gy8Var;
        if (this.r0 || (gy8Var = this.h) == null) {
            return;
        }
        sx8 tabs = gy8Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(gm.L(20.0f));
        float[] fArr = ned.a[0];
        int ceil = (int) Math.ceil(gm.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i = ceil - 3;
        this.b0 = Math.max(0, i);
        this.c0 = Math.max(0, i);
        this.d0 = Math.max(0, ceil - 4);
        tabs.a = new xr8(this, tabs, (byte) 4);
        tabs.b = new ay8(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i2 = this.b0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i2, this.c0, i2, this.d0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new hy8(this, (byte) 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int L = gm.L(10.0f);
            int L2 = gm.L(2.0f);
            if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L || marginLayoutParams.topMargin != L2) {
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.topMargin = L2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        ox8 grid = this.h.getGrid();
        this.r0 = true;
        grid.g3 = new by8(this, grid, tabs);
        grid.f3 = new kz2(this, grid, (byte) 2);
        cz3 cz3Var = this.y;
        if (cz3Var.U != grid) {
            cz3Var.U = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new ip2(cz3Var, (byte) 10));
        }
        int L3 = gm.L(44.0f);
        this.a0 = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, gm.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        m0();
        grid.setClipToPadding(false);
        grid.j(new bk1(this, tabs, (byte) 9));
        tabs.bringToFront();
    }

    public final void l0() {
        if (this.X >= 0) {
            nm7.f(this.Z).j(this.X);
        }
        if (this.Y >= 0) {
            nm7.e().j(this.Y);
        }
        this.Y = -1;
        this.X = -1;
    }

    public final void m0() {
        wy8 wy8Var;
        ox8 ox8Var = this.a0;
        if (ox8Var == null || (wy8Var = this.d) == null) {
            return;
        }
        int L = gm.L(wy8Var.J.isEmpty() ? 12.0f : 73.0f);
        if (ox8Var.getPaddingBottom() != L) {
            ox8Var.setPadding(ox8Var.getPaddingLeft(), ox8Var.getPaddingTop(), ox8Var.getPaddingRight(), L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        zx8 zx8Var = this.G;
        if (zx8Var != null) {
            if (z) {
                zx8Var.e();
            }
            return false;
        }
        wy8 wy8Var = this.d;
        if (wy8Var != null) {
            float f = wy8Var.l1;
            if (f > 0.5f || wy8Var.g1 > 0.5f) {
                if (z) {
                    if (f > 0.5f) {
                        wy8Var.m1 = 0.0f;
                    } else if (wy8Var.g1 > 0.5f) {
                        wy8Var.h1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (this.d == null || gm.O1()) {
            return null;
        }
        this.d.setRevealOpening(z);
        float f = 1.0f;
        float f2 = 0.0f;
        this.d.setReveal(z ? 0.0f : 1.0f);
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.addUpdateListener(new fx7(this, (byte) 24));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(z ? 860L : 200L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new qx((Object) this, z, (Object) runnable, (byte) 9));
        gm.c3(new mn8(this, animatorSet, (byte) 28));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        Bundle bundle = this.arguments;
        this.a = bundle != null ? bundle.getLong("user_id") : 0L;
        Bundle bundle2 = this.arguments;
        this.b = bundle2 != null ? bundle2.getLong("chat_id") : 0L;
        Bundle bundle3 = this.arguments;
        this.E = bundle3 != null && bundle3.getBoolean("immediate") && gda.o() == 2;
        if (this.a == 0 && this.b == 0) {
            this.a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0();
        lj4 lj4Var = this.c;
        if (lj4Var != null) {
            bt7 bt7Var = (bt7) lj4Var.a;
            if (bt7Var.b.remove(lj4Var)) {
                bt7Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        zx8 zx8Var = this.G;
        if (zx8Var != null) {
            zx8Var.g();
            this.G = null;
        }
        my8 my8Var = this.e;
        if (my8Var != null) {
            my8Var.l();
            this.e = null;
        }
        wy8 wy8Var = this.d;
        if (wy8Var != null) {
            wy8Var.O0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        zx8 zx8Var = this.G;
        if (zx8Var != null) {
            zx8Var.g();
            zx8 zx8Var2 = this.G;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(zx8Var2);
            }
            if (this.G == zx8Var2) {
                this.G = null;
            }
            wy8 wy8Var = this.d;
            if (wy8Var != null) {
                wy8Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || Build.VERSION.SDK_INT < 29 || this.s0 == null) {
            return;
        }
        parentActivity.getWindow().setNavigationBarContrastEnforced(this.s0.booleanValue());
        this.s0 = null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 4) {
            boolean z = iArr.length > 0 && iArr[0] == 0;
            if (this.F && z) {
                this.F = false;
                h0();
            }
            this.F = false;
            return;
        }
        if (getParentActivity() == null || i != 34) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            f0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = gm.S2(jb6.M0(2131746236, null));
        alertDialog$Builder.j(jb6.M0(2131747033, null), new ay8(this));
        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
        int i2 = cmb.K5;
        alertDialog$Builder.l(R.raw.permission_request_camera, 72, cmb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        Z();
        if (getParentActivity() != null) {
            gm.h3(getParentActivity(), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            this.H = true;
            wy8 wy8Var = this.d;
            if (wy8Var != null) {
                wy8Var.setReveal(1.0f);
            }
        }
        if (!z || z2 || this.f == null) {
            return;
        }
        float f = ix8.S;
        long j = 0;
        if (Build.VERSION.SDK_INT >= 29 && gda.o() == 2) {
            j = Math.max(0L, Math.round(ned.b[51]) - 860);
        }
        FrameLayout frameLayout = this.f;
        dy8 dy8Var = this.I;
        frameLayout.removeCallbacks(dy8Var);
        this.f.postDelayed(dy8Var, j + 680);
    }
}
