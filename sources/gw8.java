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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class gw8 extends d {
    public boolean E;
    public boolean F;
    public yv8 G;
    public boolean H;
    public final cw8 I;
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
    public nv8 a0;
    public long b;
    public int b0;
    public gi3 c;
    public int c0;
    public vw8 d;
    public int d0;
    public kw8 e;
    public float e0;
    public FrameLayout f;
    public boolean f0;
    public LinearGradient g0;
    public ew8 h;
    public final Paint h0;
    public final RectF i0;
    public final int[] j0;
    public final int[] k0;
    public final int[] l0;
    public final Path m0;
    public float n;
    public final RectF n0;
    public Paint o0;
    public final nm4 p0;
    public final RectF q0;
    public float r;
    public boolean r0;
    public float s;
    public Boolean s0;
    public float w;
    public float x;
    public sx3 y;

    public gw8(Bundle bundle) {
        super(bundle);
        this.I = new cw8(this, (byte) 0);
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
        this.p0 = new nm4();
        this.q0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Z(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                Z(viewGroup.getChildAt(i));
            }
        }
    }

    public static void c0(d dVar) {
        da1.i0(dVar.getParentActivity(), 1, new dd(dVar.getCurrentAccount(), (Object) dVar, (byte) 14));
    }

    public static LinearGradient i0(boolean z) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            float f = i / 8.0f;
            float B = yjb.B(f, 2.0f, 3.0f, f * f);
            if (!z) {
                B = 1.0f - B;
            }
            iArr[i] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i] = f;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void Y() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            gl.h3(parentActivity, false);
            gl.n3(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.s0 == null) {
                    this.s0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void a0(AnimatorSet animatorSet) {
        k0();
        boolean z = !this.E;
        int i = this.currentAccount;
        this.Z = i;
        this.X = kk7.f(i).q(null, -1, z);
        this.Y = kk7.e().q(null, -1, z);
        animatorSet.start();
    }

    public final void b0() {
        vw8 vw8Var;
        if (this.h == null || (vw8Var = this.d) == null || vw8Var.getWidth() == 0) {
            return;
        }
        int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
        this.d.getClass();
        int width = (int) (this.f.getWidth() - (this.d.getWidth() - gl.L(10.0f)));
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
        yv8 yv8Var = this.G;
        if (yv8Var != null) {
            yv8Var.g();
            this.G = null;
        }
        kw8 kw8Var = this.e;
        if (kw8Var != null) {
            kw8Var.l();
            this.e = null;
        }
        super.clearViews();
        vw8 vw8Var = this.d;
        if (vw8Var != null) {
            vw8Var.O0();
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

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01a7, code lost:
    
        if (r5 != 1) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ba  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        boolean z;
        iw8 iw8Var;
        long j;
        char c;
        boolean startsWith;
        iw8 iw8Var2;
        TLRPC.ShareTheme shareTheme;
        int i = this.currentAccount;
        fv8[] fv8VarArr = fv8.f;
        if (fv8VarArr[i] == null) {
            fv8VarArr[i] = new fv8(i);
        }
        fv8 fv8Var = fv8VarArr[i];
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = fv8Var.b;
        ld0.a(tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null);
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops2 = fv8Var.b;
        byte b = 6;
        gm8 gm8Var = new gm8(this, fv8Var, tL_shareThemeBackdrops2 != null ? tL_shareThemeBackdrops2.backdrops : null, b);
        byte b2 = 0;
        if (fv8Var.d) {
            gm8Var.run();
        } else {
            fv8Var.e.add(gm8Var);
            if (!fv8Var.c) {
                fv8Var.c = true;
                TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops3 = fv8Var.b;
                tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops3 != null ? tL_shareThemeBackdrops3.hash : 0;
                ConnectionsManager.getInstance(fv8Var.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new hc(b2), new tf8(fv8Var, b));
            }
        }
        Activity parentActivity = getParentActivity();
        zq7 zq7Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).t1 : null;
        if (zq7Var != null && this.c == null) {
            gi3 gi3Var = new gi3(zq7Var);
            zq7Var.b.add(gi3Var);
            zq7Var.a();
            this.c = gi3Var;
        }
        int i2 = this.currentAccount;
        long j2 = this.a;
        long j3 = this.b;
        na7 q1 = na7.q1(i2);
        String j4 = b00.j(new StringBuilder("https://"), q1.N2, "/");
        long j5 = 0;
        if (j2 != 0 || j3 == 0) {
            if (j2 == y6c.h(i2).e()) {
                str = "";
                z = true;
            } else {
                str = "";
                z = false;
            }
            TLRPC.User V1 = q1.V1(Long.valueOf(j2));
            String p = V1 != null ? l7c.p(V1) : null;
            if (p != null) {
                j = 0;
                iw8Var = new iw8(j4.concat(p), p, true, false, z, j2, z);
            } else if (z) {
                if (V1 != null && V1.phone != null) {
                    ArrayList v = qu2.r(i2).v(6);
                    if (v != null) {
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
                                    c = 1;
                                    break;
                                }
                            } else {
                                c = 0;
                                break;
                            }
                        }
                        c = 2;
                        if (c == 2) {
                            ArrayList v2 = qu2.r(i2).v(7);
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
                            startsWith = V1.phone.startsWith("+");
                            String str2 = V1.phone;
                            if (!startsWith) {
                                str2 = b00.h("+", str2);
                            }
                            String str3 = str2;
                            j = 0;
                            iw8Var = new iw8(b00.h(j4, str3), str3, false, false, true, j2, true);
                        }
                        if (c != 0) {
                        }
                        startsWith = V1.phone.startsWith("+");
                        String str22 = V1.phone;
                        if (!startsWith) {
                        }
                        String str32 = str22;
                        j = 0;
                        iw8Var = new iw8(b00.h(j4, str32), str32, false, false, true, j2, true);
                    }
                    j5 = 0;
                }
                TLRPC.TL_exportedContactToken tL_exportedContactToken = q1.L4;
                TLRPC.TL_exportedContactToken tL_exportedContactToken2 = (tL_exportedContactToken == null || ((long) tL_exportedContactToken.expires) <= System.currentTimeMillis() / 1000) ? null : q1.L4;
                String str4 = tL_exportedContactToken2 != null ? tL_exportedContactToken2.url : null;
                j = j5;
                iw8Var = new iw8(str4, V1 != null ? l7c.r(V1) : str, false, true, true, j2, true);
            } else {
                j = 0;
                iw8Var = new iw8(j4, V1 != null ? l7c.r(V1) : str, false, false, false, j2, false);
            }
            iw8Var2 = iw8Var;
        } else {
            TLRPC.Chat K0 = q1.K0(Long.valueOf(j3));
            String K = hc2.K(K0, false);
            if (K != null) {
                iw8Var2 = new iw8(j4.concat(K), K, true, false, false, -j3, hc2.w(1, K0));
                j = 0;
            } else {
                j = 0;
                iw8Var2 = new iw8(j4, K0 != null ? K0.title : "", false, false, false, -j3, false);
            }
        }
        this.f = new FrameLayout(context);
        vw8 vw8Var = new vw8(context, this.currentAccount, iw8Var2.a, iw8Var2.b, iw8Var2.c, new z24((Object) this, (byte) 28));
        this.d = vw8Var;
        this.f.addView(vw8Var, nme.c(-1.0f, -1));
        this.d.setImmediateOnOpen(this.E);
        this.d.setRevealOpening(true);
        if (this.H) {
            this.d.setReveal(1.0f);
            this.f.postDelayed(this.I, 680L);
        } else {
            boolean O1 = gl.O1();
            vw8 vw8Var2 = this.d;
            if (O1) {
                vw8Var2.setReveal(1.0f);
                vw8Var2.S4 = false;
            } else {
                vw8Var2.setReveal(0.0f);
            }
        }
        this.fragmentView = this.f;
        kw8 kw8Var = this.e;
        if (kw8Var != null) {
            kw8Var.l();
        }
        int i5 = this.currentAccount;
        vw8 vw8Var3 = this.d;
        kw8 kw8Var2 = new kw8(i5, vw8Var3, iw8Var2);
        this.e = kw8Var2;
        boolean z2 = iw8Var2.d;
        vw8Var3.setTimerOnly(z2);
        vw8Var3.setTemporaryLink(z2);
        LongSparseArray h = kw8.h(i5);
        long j6 = iw8Var2.f;
        jw8 jw8Var = (jw8) h.get(j6);
        if (jw8Var != null) {
            shareTheme = jw8Var.a;
        } else {
            na7 q12 = na7.q1(i5);
            if (j6 > j) {
                TLRPC.UserFull W1 = q12.W1(j6);
                if (W1 != null) {
                    shareTheme = W1.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            } else {
                TLRPC.ChatFull L0 = q12.L0(-j6);
                if (L0 != null) {
                    shareTheme = L0.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            }
        }
        if (shareTheme != null) {
            vw8Var3.setInstantTheme(true);
            kw8Var2.a(shareTheme);
            vw8Var3.setInstantTheme(false);
        }
        boolean z3 = iw8Var2.g;
        vw8Var3.setThemeEditable(z3);
        if (z3) {
            vw8Var3.setGiftsOwner(j6);
        }
        if (iw8Var2.e) {
            kk7.f(i5).b(kw8Var2, kk7.j0);
            if (z2) {
                na7 q13 = na7.q1(i5);
                TLRPC.TL_exportedContactToken tL_exportedContactToken3 = q13.L4;
                TLRPC.TL_exportedContactToken tL_exportedContactToken4 = (tL_exportedContactToken3 == null || ((long) tL_exportedContactToken3.expires) <= System.currentTimeMillis() / 1000) ? null : q13.L4;
                kw8Var2.r = tL_exportedContactToken4;
                if (tL_exportedContactToken4 == null) {
                    kw8Var2.m();
                } else {
                    vw8Var3.setLinkExpires(tL_exportedContactToken4.expires);
                }
            }
            kw8Var2.r();
            kw8Var2.g();
            kw8Var2.p();
        } else {
            vw8Var3.setFeeStars(j);
            kw8Var2.g();
        }
        return this.f;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        tv4 tv4Var = new tv4(getParentActivity(), this.currentAccount, getUserConfig().e(), null, null);
        if (!tv4Var.n2) {
            tv4Var.n2 = true;
            qua quaVar = tv4Var.p2;
            if (quaVar != null && (quaVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) tv4Var.p2.getParent();
                int indexOfChild = viewGroup.indexOfChild(tv4Var.p2);
                viewGroup.removeView(tv4Var.p2);
                qua quaVar2 = new qua(tv4Var.getContext(), kk7.Y3, 2);
                tv4Var.p2 = quaVar2;
                viewGroup.addView(quaVar2, indexOfChild, nme.c(-1.0f, -1));
            }
            l46 l46Var = tv4Var.q2;
            if (l46Var != null) {
                String M0 = k96.M0(2131750272, null);
                s11 s11Var = tv4Var.e2;
                s11Var.setText(M0);
                s11Var.setBreakStrategy(2);
                l46Var.setVisibility(8);
            }
            tv4Var.T1.O(false);
        }
        tv4Var.show();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        if (this.G != null || this.d == null || this.f == null || getParentActivity() == null) {
            return;
        }
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        rectF.set(this.d.j7);
        rectF2.set(this.d.g7);
        if (rectF.isEmpty()) {
            rectF.set((this.f.getWidth() / 2.0f) - gl.L(20.0f), (this.f.getHeight() / 2.0f) - gl.L(20.0f), (this.f.getWidth() / 2.0f) + gl.L(20.0f), (this.f.getHeight() / 2.0f) + gl.L(20.0f));
        }
        this.d.setScanHidden(true);
        yv8 yv8Var = new yv8(getParentActivity(), rectF, rectF2, new s34((Object) this, (byte) 29));
        this.G = yv8Var;
        yv8Var.setButtonLabel(k96.M0(2131746277, null));
        yv8 yv8Var2 = this.G;
        yv8Var2.setOnGallery(new ll8(this, yv8Var2, (byte) 28));
        this.f.addView(this.G, nme.c(-1.0f, -1));
    }

    public final void f0(float f, float f2, boolean z) {
        ew8 ew8Var = this.h;
        if (!z) {
            if (ew8Var != null && ew8Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            sx3 sx3Var = this.y;
            if (sx3Var == null || sx3Var.getVisibility() != 0) {
                return;
            }
            this.y.setVisibility(4);
            return;
        }
        if (ew8Var == null) {
            if (getParentActivity() == null) {
                return;
            }
            ew8 ew8Var2 = new ew8(this, getParentActivity(), this.currentAccount, new dw8(this));
            this.h = ew8Var2;
            ew8Var2.setOutlineProvider(new fw8(this, (byte) 0));
            this.h.setClipToOutline(true);
            sx3 sx3Var2 = new sx3(getParentActivity(), new pj4((Object) this, (byte) 29));
            this.y = sx3Var2;
            sx3Var2.b = this.h;
            this.d.setOnPicksChanged(new cw8(this, (byte) 1));
            this.y.setOutlineProvider(this.h.getOutlineProvider());
            this.y.setClipToOutline(true);
            this.f.addView(this.h, nme.e(-1, -1, 48));
            b0();
            this.f.post(new cw8(this, (byte) 2));
        }
        b0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i = layoutParams.height;
        int i2 = layoutParams.leftMargin;
        int i3 = layoutParams.rightMargin;
        if (this.y.getParent() == null) {
            this.f.addView(this.y, nme.e(-1, -1, 48));
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
        tw8 tw8Var = this.d.n;
        int i4 = t0 ^ (tw8Var != null ? tw8Var.h : 872415231);
        if (this.h.getTranslationY() != f || i4 != this.J) {
            this.h.setTranslationY(f);
            this.J = i4;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f2);
        ew8 ew8Var3 = this.h;
        vw8 vw8Var = this.d;
        tw8 tw8Var2 = vw8Var.n;
        int i5 = tw8Var2 != null ? tw8Var2.b : -16777216;
        if (i5 != vw8Var.b2) {
            vw8Var.b2 = i5;
            vw8Var.c2 = (bm2.f(0.13f, -1, vw8.D0(0.75f, 1.3f, 0.16f, i5)) & 16777215) | (-1728053248);
        }
        ew8Var3.setHeaderColor(vw8Var.c2);
        if (this.h.getVisibility() != 0) {
            ew8 ew8Var4 = this.h;
            if (ew8Var4.K) {
                ew8Var4.K = false;
                ew8Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (this.r0) {
            return;
        }
        j0();
    }

    public final void g0() {
        vw8 vw8Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || (vw8Var = this.d) == null || vw8Var.getCurrentLink() == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 28 || w01.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.F = true;
            parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        } else {
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.e.c(new ll8(this, T0, (byte) 27));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0(String str) {
        vw8 vw8Var;
        if (getParentActivity() == null || (vw8Var = this.d) == null || vw8Var.getCurrentLink() == null) {
            return;
        }
        Bitmap T0 = this.d.T0();
        Uri B0 = T0 != null ? gl.B0(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG) : null;
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
            getParentActivity().startActivity(Intent.createChooser(intent, k96.M0(2131748978, null)));
        } catch (ActivityNotFoundException e) {
            fa4.g(e, true);
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

    public final void j0() {
        ew8 ew8Var;
        if (this.r0 || (ew8Var = this.h) == null) {
            return;
        }
        rv8 tabs = ew8Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(gl.L(20.0f));
        float[] fArr = lcd.a[0];
        int ceil = (int) Math.ceil(gl.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i = ceil - 3;
        this.b0 = Math.max(0, i);
        this.c0 = Math.max(0, i);
        this.d0 = Math.max(0, ceil - 4);
        tabs.a = new kq8(this, tabs, (byte) 3);
        tabs.b = new zv8(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i2 = this.b0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i2, this.c0, i2, this.d0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new fw8(this, (byte) 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int L = gl.L(10.0f);
            int L2 = gl.L(2.0f);
            if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L || marginLayoutParams.topMargin != L2) {
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.topMargin = L2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        nv8 grid = this.h.getGrid();
        this.r0 = true;
        grid.g3 = new aw8(this, grid, tabs);
        grid.f3 = new ay2(this, grid, (byte) 2);
        sx3 sx3Var = this.y;
        byte b = 9;
        if (sx3Var.U != grid) {
            sx3Var.U = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new ao2(sx3Var, b));
        }
        int L3 = gl.L(44.0f);
        this.a0 = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, gl.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        l0();
        grid.setClipToPadding(false);
        grid.j(new si1(this, tabs, b));
        tabs.bringToFront();
    }

    public final void k0() {
        if (this.X >= 0) {
            kk7.f(this.Z).j(this.X);
        }
        if (this.Y >= 0) {
            kk7.e().j(this.Y);
        }
        this.Y = -1;
        this.X = -1;
    }

    public final void l0() {
        vw8 vw8Var;
        nv8 nv8Var = this.a0;
        if (nv8Var == null || (vw8Var = this.d) == null) {
            return;
        }
        int L = gl.L(vw8Var.J.isEmpty() ? 12.0f : 73.0f);
        if (nv8Var.getPaddingBottom() != L) {
            nv8Var.setPadding(nv8Var.getPaddingLeft(), nv8Var.getPaddingTop(), nv8Var.getPaddingRight(), L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        yv8 yv8Var = this.G;
        if (yv8Var != null) {
            if (z) {
                yv8Var.e();
            }
            return false;
        }
        vw8 vw8Var = this.d;
        if (vw8Var != null) {
            float f = vw8Var.l1;
            if (f > 0.5f || vw8Var.g1 > 0.5f) {
                if (z) {
                    if (f > 0.5f) {
                        vw8Var.m1 = 0.0f;
                    } else if (vw8Var.g1 > 0.5f) {
                        vw8Var.h1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (this.d == null || gl.O1()) {
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
        ofFloat.addUpdateListener(new u28(this, (byte) 22));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(z ? 860L : 200L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new qw((Object) this, z, (Object) runnable, (byte) 9));
        gl.c3(new ll8(this, animatorSet, (byte) 26));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        Bundle bundle = this.arguments;
        this.a = bundle != null ? bundle.getLong("user_id") : 0L;
        Bundle bundle2 = this.arguments;
        this.b = bundle2 != null ? bundle2.getLong("chat_id") : 0L;
        Bundle bundle3 = this.arguments;
        this.E = bundle3 != null && bundle3.getBoolean("immediate") && gba.o() == 2;
        if (this.a == 0 && this.b == 0) {
            this.a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0();
        gi3 gi3Var = this.c;
        if (gi3Var != null) {
            zq7 zq7Var = (zq7) gi3Var.a;
            if (zq7Var.b.remove(gi3Var)) {
                zq7Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        yv8 yv8Var = this.G;
        if (yv8Var != null) {
            yv8Var.g();
            this.G = null;
        }
        kw8 kw8Var = this.e;
        if (kw8Var != null) {
            kw8Var.l();
            this.e = null;
        }
        vw8 vw8Var = this.d;
        if (vw8Var != null) {
            vw8Var.O0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        yv8 yv8Var = this.G;
        if (yv8Var != null) {
            yv8Var.g();
            yv8 yv8Var2 = this.G;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(yv8Var2);
            }
            if (this.G == yv8Var2) {
                this.G = null;
            }
            vw8 vw8Var = this.d;
            if (vw8Var != null) {
                vw8Var.setScanHidden(false);
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
                g0();
            }
            this.F = false;
            return;
        }
        if (getParentActivity() == null || i != 34) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            e0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = gl.S2(k96.M0(2131746310, null));
        alertDialog$Builder.j(k96.M0(2131747107, null), new zv8(this));
        alertDialog$Builder.g(k96.M0(2131751760, null), null);
        int i2 = bkb.K5;
        alertDialog$Builder.l(R.raw.permission_request_camera, 72, bkb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        Y();
        if (getParentActivity() != null) {
            gl.h3(getParentActivity(), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            this.H = true;
            vw8 vw8Var = this.d;
            if (vw8Var != null) {
                vw8Var.setReveal(1.0f);
            }
        }
        if (!z || z2 || this.f == null) {
            return;
        }
        float f = hv8.S;
        long j = 0;
        if (Build.VERSION.SDK_INT >= 29 && gba.o() == 2) {
            j = Math.max(0L, Math.round(lcd.b[51]) - 860);
        }
        FrameLayout frameLayout = this.f;
        cw8 cw8Var = this.I;
        frameLayout.removeCallbacks(cw8Var);
        this.f.postDelayed(cw8Var, j + 680);
    }
}
