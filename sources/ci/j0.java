package ci;

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
import bi.h6;
import bi.n3;
import bi.u1;
import bi.u2;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.ua;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.s2;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hi0;
import org.telegram.ui.t9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class j0 extends g2 {
    public boolean E;
    public boolean F;
    public b0 G;
    public boolean H;
    public final f0 I;
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
    public m a0;
    public long b;
    public int b0;
    public org.telegram.ui.f c;
    public int c0;
    public z0 d;
    public int d0;
    public o0 e;
    public float e0;
    public FrameLayout f;
    public boolean f0;
    public LinearGradient g0;
    public h0 h;
    public final Paint h0;
    public final RectF i0;
    public final int[] j0;
    public final int[] k0;
    public final int[] l0;
    public final Path m0;
    public float n;
    public final RectF n0;
    public Paint o0;
    public final b1 p0;
    public final RectF q0;
    public float r;
    public boolean r0;
    public float s;
    public Boolean s0;
    public float w;
    public float x;
    public c y;

    public j0(Bundle bundle) {
        super(bundle);
        this.I = new f0(this, 0);
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
        this.p0 = new b1(0);
        this.q0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Z(j0 j0Var, AnimatorSet animatorSet) {
        j0Var.l0();
        boolean z10 = !j0Var.E;
        int i7 = j0Var.currentAccount;
        j0Var.Z = i7;
        j0Var.X = ks.f(i7).q(null, -1, z10);
        j0Var.Y = ks.e().q(null, -1, z10);
        animatorSet.start();
    }

    public static void a0(j0 j0Var) {
        if (j0Var.getParentActivity() == null) {
            return;
        }
        n3 n3Var = new n3(j0Var.getParentActivity(), j0Var.currentAccount, j0Var.getUserConfig().e(), null, null);
        if (!n3Var.o2) {
            n3Var.o2 = true;
            ua uaVar = n3Var.q2;
            if (uaVar != null && (uaVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) n3Var.q2.getParent();
                int indexOfChild = viewGroup.indexOfChild(n3Var.q2);
                viewGroup.removeView(n3Var.q2);
                ua uaVar2 = new ua(n3Var.getContext(), ks.Z3, 2, 0);
                n3Var.q2 = uaVar2;
                viewGroup.addView(uaVar2, indexOfChild, ma.c(-1.0f, -1));
            }
            m80 m80Var = n3Var.r2;
            if (m80Var != null) {
                String N0 = gd.N0(2131750271, null);
                u2 u2Var = n3Var.f2;
                u2Var.setText(N0);
                u2Var.setBreakStrategy(2);
                m80Var.setVisibility(8);
            }
            n3Var.U1.O(false);
        }
        n3Var.show();
    }

    public static void c0(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                c0(viewGroup.getChildAt(i7));
            }
        }
    }

    public static void e0(g2 g2Var) {
        t9.j0(g2Var.getParentActivity(), 1, new b3.j(g2Var.getCurrentAccount(), g2Var, 1));
    }

    public static LinearGradient j0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            float f10 = i7 / 8.0f;
            float C = e2.C(f10, 2.0f, 3.0f, f10 * f10);
            if (!z10) {
                C = 1.0f - C;
            }
            iArr[i7] = ((int) ((C * 255.0f) + 0.5f)) << 24;
            fArr[i7] = f10;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void b0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        Window window = parentActivity.getWindow();
        org.telegram.messenger.g0.l3(parentActivity, false);
        org.telegram.messenger.g0.r3(window, false);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.s0 == null) {
                this.s0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
            }
            window.setNavigationBarContrastEnforced(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean canBeginSlide() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void clearViews() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        b0 b0Var = this.G;
        if (b0Var != null) {
            b0Var.g();
            this.G = null;
        }
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.l();
            this.e = null;
        }
        super.clearViews();
        z0 z0Var = this.d;
        if (z0Var != null) {
            z0Var.O0();
            this.d = null;
        }
        this.f = null;
        this.h = null;
        this.y = null;
        this.a0 = null;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01b1, code lost:
    
        if (r3 != 1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c1  */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        boolean z10;
        m0 m0Var;
        long j3;
        ArrayList v;
        char c10;
        String str2;
        m0 m0Var2;
        TLRPC.ShareTheme shareTheme;
        int i7 = this.currentAccount;
        d[] dVarArr = d.f;
        if (dVarArr[i7] == null) {
            dVarArr[i7] = new d(i7);
        }
        d dVar = dVarArr[i7];
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = dVar.b;
        a.a(tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null);
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops2 = dVar.b;
        aa.r rVar = new aa.r(this, dVar, tL_shareThemeBackdrops2 != null ? tL_shareThemeBackdrops2.backdrops : null, 15);
        if (dVar.d) {
            rVar.run();
        } else {
            dVar.e.add(rVar);
            if (!dVar.c) {
                dVar.c = true;
                TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops3 = dVar.b;
                tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops3 != null ? tL_shareThemeBackdrops3.hash : 0;
                ConnectionsManager.getInstance(dVar.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new d3.b(1), new bi.b(dVar, 13));
            }
        }
        Activity parentActivity = getParentActivity();
        hi0 hi0Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).t1 : null;
        if (hi0Var != null && this.c == null) {
            org.telegram.ui.f fVar = new org.telegram.ui.f(hi0Var, 27);
            hi0Var.b.add(fVar);
            hi0Var.a();
            this.c = fVar;
        }
        int i10 = this.currentAccount;
        long j10 = this.a;
        long j11 = this.b;
        mp u12 = mp.u1(i10);
        String s5 = a8.p0.s(new StringBuilder("https://"), u12.X2, "/");
        if (j10 != 0 || j11 == 0) {
            if (j10 == j10.i(i10).e()) {
                str = "";
                z10 = true;
            } else {
                str = "";
                z10 = false;
            }
            TLRPC.User c22 = u12.c2(Long.valueOf(j10));
            String o4 = c22 != null ? o10.o(c22) : null;
            if (o4 != null) {
                j3 = 0;
                m0Var = new m0(p5.c.v(s5, o4), o4, true, false, z10, j10, z10);
            } else if (z10) {
                if (c22 != null && c22.phone != null && (v = i5.r(i10).v(6)) != null) {
                    int size = v.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = v.get(i11);
                        i11++;
                        TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) obj;
                        if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                            c10 = 0;
                            break;
                        }
                        if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                            break;
                        }
                        if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                            c10 = 1;
                            break;
                        }
                    }
                    c10 = 2;
                    if (c10 == 2) {
                        ArrayList v10 = i5.r(i10).v(7);
                        if (v10 != null && !v10.isEmpty()) {
                            int size2 = v10.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj2 = v10.get(i12);
                                i12++;
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
                        if (c22.phone.startsWith("+")) {
                            str2 = "+" + c22.phone;
                        } else {
                            str2 = c22.phone;
                        }
                        String str3 = str2;
                        j3 = 0;
                        m0Var = new m0(p5.c.v(s5, str3), str3, false, false, true, j10, true);
                    }
                    if (c10 != 0) {
                    }
                    if (c22.phone.startsWith("+")) {
                    }
                    String str32 = str2;
                    j3 = 0;
                    m0Var = new m0(p5.c.v(s5, str32), str32, false, false, true, j10, true);
                }
                TLRPC.TL_exportedContactToken tL_exportedContactToken = u12.d8;
                TLRPC.TL_exportedContactToken tL_exportedContactToken2 = (tL_exportedContactToken == null || ((long) tL_exportedContactToken.expires) <= System.currentTimeMillis() / 1000) ? null : u12.d8;
                String str4 = tL_exportedContactToken2 != null ? tL_exportedContactToken2.url : null;
                j3 = 0;
                m0Var = new m0(str4, c22 != null ? o10.q(c22) : str, false, true, true, j10, true);
            } else {
                j3 = 0;
                m0Var = new m0(s5, c22 != null ? o10.q(c22) : str, false, false, false, j10, false);
            }
            m0Var2 = m0Var;
        } else {
            TLRPC.Chat O0 = u12.O0(Long.valueOf(j11));
            String K = v3.K(O0, false);
            if (K != null) {
                m0Var2 = new m0(p5.c.v(s5, K), K, true, false, false, -j11, v3.w(1, O0));
                j3 = 0;
            } else {
                String str5 = O0 != null ? O0.title : "";
                j3 = 0;
                m0Var2 = new m0(s5, str5, false, false, false, -j11, false);
            }
        }
        this.f = new FrameLayout(context);
        z0 z0Var = new z0(context, this.currentAccount, m0Var2.a, m0Var2.b, m0Var2.c, new d6.i(this, 7));
        this.d = z0Var;
        this.f.addView(z0Var, ma.c(-1.0f, -1));
        this.d.setImmediateOnOpen(this.E);
        this.d.setRevealOpening(true);
        if (this.H) {
            this.d.setReveal(1.0f);
            this.f.postDelayed(this.I, 680L);
        } else if (org.telegram.messenger.g0.Q1()) {
            z0 z0Var2 = this.d;
            z0Var2.setReveal(1.0f);
            z0Var2.T4 = false;
        } else {
            this.d.setReveal(0.0f);
        }
        this.fragmentView = this.f;
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.l();
        }
        int i13 = this.currentAccount;
        z0 z0Var3 = this.d;
        o0 o0Var2 = new o0(i13, z0Var3, m0Var2);
        this.e = o0Var2;
        boolean z11 = m0Var2.d;
        z0Var3.setTimerOnly(z11);
        z0Var3.setTemporaryLink(z11);
        LongSparseArray h = o0.h(i13);
        long j12 = m0Var2.f;
        n0 n0Var = (n0) h.get(j12);
        if (n0Var != null) {
            shareTheme = n0Var.a;
        } else {
            mp u13 = mp.u1(i13);
            if (j12 > j3) {
                TLRPC.UserFull d2 = u13.d2(j12);
                if (d2 != null) {
                    shareTheme = d2.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            } else {
                TLRPC.ChatFull P0 = u13.P0(-j12);
                if (P0 != null) {
                    shareTheme = P0.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            }
        }
        if (shareTheme != null) {
            z0Var3.setInstantTheme(true);
            o0Var2.a(shareTheme);
            z0Var3.setInstantTheme(false);
        }
        boolean z12 = m0Var2.g;
        z0Var3.setThemeEditable(z12);
        if (z12) {
            z0Var3.setGiftsOwner(j12);
        }
        if (m0Var2.e) {
            ks.f(i13).c(o0Var2, ks.k0);
            if (z11) {
                mp u14 = mp.u1(i13);
                TLRPC.TL_exportedContactToken tL_exportedContactToken3 = u14.d8;
                TLRPC.TL_exportedContactToken tL_exportedContactToken4 = (tL_exportedContactToken3 == null || ((long) tL_exportedContactToken3.expires) <= System.currentTimeMillis() / 1000) ? null : u14.d8;
                o0Var2.r = tL_exportedContactToken4;
                if (tL_exportedContactToken4 == null) {
                    o0Var2.m();
                } else {
                    z0Var3.setLinkExpires(tL_exportedContactToken4.expires);
                }
            }
            o0Var2.r();
            o0Var2.g();
            o0Var2.p();
        } else {
            z0Var3.setFeeStars(j3);
            o0Var2.g();
        }
        return this.f;
    }

    public final void d0() {
        z0 z0Var;
        if (this.h == null || (z0Var = this.d) == null || z0Var.getWidth() == 0) {
            return;
        }
        int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
        this.d.getClass();
        int width = (int) (this.f.getWidth() - (this.d.getWidth() - org.telegram.messenger.g0.L(10.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        if (layoutParams.height == max && layoutParams.leftMargin == r2 && layoutParams.rightMargin == width) {
            return;
        }
        layoutParams.height = max;
        layoutParams.leftMargin = r2;
        layoutParams.rightMargin = width;
        this.h.setLayoutParams(layoutParams);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
        if (this.G != null || this.d == null || this.f == null || getParentActivity() == null) {
            return;
        }
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        rectF.set(this.d.k7);
        rectF2.set(this.d.h7);
        if (rectF.isEmpty()) {
            rectF.set((this.f.getWidth() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f.getHeight() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f.getWidth() / 2.0f) + org.telegram.messenger.g0.L(20.0f), (this.f.getHeight() / 2.0f) + org.telegram.messenger.g0.L(20.0f));
        }
        this.d.setScanHidden(true);
        b0 b0Var = new b0(getParentActivity(), rectF, rectF2, new ob.c(this, 11));
        this.G = b0Var;
        b0Var.setButtonLabel(gd.N0(2131746274, null));
        b0 b0Var2 = this.G;
        b0Var2.setOnGallery(new c1.a(16, this, b0Var2));
        this.f.addView(this.G, ma.c(-1.0f, -1));
    }

    public final void g0(float f10, float f11, boolean z10) {
        if (!z10) {
            h0 h0Var = this.h;
            if (h0Var != null && h0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            c cVar = this.y;
            if (cVar == null || cVar.getVisibility() != 0) {
                return;
            }
            this.y.setVisibility(4);
            return;
        }
        if (this.h == null) {
            if (getParentActivity() == null) {
                return;
            }
            h0 h0Var2 = new h0(this, getParentActivity(), this.currentAccount, new g0(this));
            this.h = h0Var2;
            h0Var2.setOutlineProvider(new i0(this, 0));
            this.h.setClipToOutline(true);
            c cVar2 = new c(getParentActivity(), new cb.c(this, 12));
            this.y = cVar2;
            cVar2.b = this.h;
            this.d.setOnPicksChanged(new f0(this, 1));
            this.y.setOutlineProvider(this.h.getOutlineProvider());
            this.y.setClipToOutline(true);
            this.f.addView(this.h, ma.e(-1, -1, 48));
            d0();
            this.f.post(new f0(this, 2));
        }
        d0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i7 = layoutParams.height;
        int i10 = layoutParams.leftMargin;
        int i11 = layoutParams.rightMargin;
        if (this.y.getParent() == null) {
            this.f.addView(this.y, ma.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.y.getLayoutParams();
        if (layoutParams2.height != i7 || layoutParams2.leftMargin != i10 || layoutParams2.rightMargin != i11) {
            layoutParams2.height = i7;
            layoutParams2.leftMargin = i10;
            layoutParams2.rightMargin = i11;
            this.y.setLayoutParams(layoutParams2);
        }
        this.y.setTranslationY(f10);
        this.y.setAlpha(f11);
        this.y.invalidateOutline();
        this.y.invalidate();
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        int t02 = this.d.t0();
        x0 x0Var = this.d.n;
        int i12 = t02 ^ (x0Var != null ? x0Var.h : 872415231);
        if (this.h.getTranslationY() != f10 || i12 != this.J) {
            this.h.setTranslationY(f10);
            this.J = i12;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f11);
        h0 h0Var3 = this.h;
        z0 z0Var = this.d;
        x0 x0Var2 = z0Var.n;
        int i13 = x0Var2 != null ? x0Var2.b : -16777216;
        if (i13 != z0Var.b2) {
            z0Var.b2 = i13;
            z0Var.c2 = (i0.a.f(0.13f, -1, z0.D0(0.75f, 1.3f, 0.16f, i13)) & 16777215) | (-1728053248);
        }
        h0Var3.setHeaderColor(z0Var.c2);
        if (this.h.getVisibility() != 0) {
            h0 h0Var4 = this.h;
            if (h0Var4.K) {
                h0Var4.K = false;
                h0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (this.r0) {
            return;
        }
        k0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        z0 z0Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || (z0Var = this.d) == null || z0Var.getCurrentLink() == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 28 || s2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.F = true;
            parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        } else {
            Bitmap T0 = this.d.T0();
            if (T0 == null) {
                return;
            }
            Utilities.e.c(new c1.a(15, this, T0));
        }
    }

    public final void i0(String str) {
        z0 z0Var;
        if (getParentActivity() == null || (z0Var = this.d) == null || z0Var.getCurrentLink() == null) {
            return;
        }
        Bitmap T0 = this.d.T0();
        Uri C0 = T0 != null ? org.telegram.messenger.g0.C0(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG) : null;
        Intent intent = new Intent("android.intent.action.SEND");
        if (C0 != null) {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", C0);
            intent.addFlags(1);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        try {
            getParentActivity().startActivity(Intent.createChooser(intent, gd.N0(2131748977, null)));
        } catch (ActivityNotFoundException e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void k0() {
        h0 h0Var;
        if (this.r0 || (h0Var = this.h) == null) {
            return;
        }
        r tabs = h0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(20.0f));
        float[] fArr = c1.a[0];
        int ceil = (int) Math.ceil(org.telegram.messenger.g0.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i7 = ceil - 3;
        this.b0 = Math.max(0, i7);
        this.c0 = Math.max(0, i7);
        this.d0 = Math.max(0, ceil - 4);
        tabs.a = new ab.g(11, this, tabs);
        tabs.b = new c0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i10 = this.b0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i10, this.c0, i10, this.d0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new i0(this, 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            int L2 = org.telegram.messenger.g0.L(2.0f);
            if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L || marginLayoutParams.topMargin != L2) {
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.topMargin = L2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        m grid = this.h.getGrid();
        this.r0 = true;
        grid.g3 = new d0(this, grid, tabs);
        grid.f3 = new aa.k(2, this, grid);
        c cVar = this.y;
        if (cVar.U != grid) {
            cVar.U = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new u1(cVar, 5));
        }
        int L3 = org.telegram.messenger.g0.L(44.0f);
        this.a0 = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, org.telegram.messenger.g0.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        m0();
        grid.setClipToPadding(false);
        grid.j(new h6(1, this, tabs));
        tabs.bringToFront();
    }

    public final void l0() {
        if (this.X >= 0) {
            ks.f(this.Z).j(this.X);
        }
        if (this.Y >= 0) {
            ks.e().j(this.Y);
        }
        this.Y = -1;
        this.X = -1;
    }

    public final void m0() {
        z0 z0Var;
        m mVar = this.a0;
        if (mVar == null || (z0Var = this.d) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(z0Var.J.isEmpty() ? 12.0f : 73.0f);
        if (mVar.getPaddingBottom() != L) {
            mVar.setPadding(mVar.getPaddingLeft(), mVar.getPaddingTop(), mVar.getPaddingRight(), L);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        b0 b0Var = this.G;
        if (b0Var != null) {
            if (z10) {
                b0Var.e();
            }
            return false;
        }
        z0 z0Var = this.d;
        if (z0Var != null) {
            float f10 = z0Var.l1;
            if (f10 > 0.5f || z0Var.g1 > 0.5f) {
                if (z10) {
                    if (f10 > 0.5f) {
                        z0Var.m1 = 0.0f;
                    } else if (z0Var.g1 > 0.5f) {
                        z0Var.h1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (this.d == null || org.telegram.messenger.g0.Q1()) {
            return null;
        }
        this.d.setRevealOpening(z10);
        this.d.setReveal(z10 ? 0.0f : 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ah.g(this, 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(z10 ? 860L : 200L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new androidx.fragment.app.g(this, z10, runnable, 3));
        org.telegram.messenger.g0.g3(new c1.a(14, this, animatorSet));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        Bundle bundle = this.arguments;
        this.a = bundle != null ? bundle.getLong("user_id") : 0L;
        Bundle bundle2 = this.arguments;
        this.b = bundle2 != null ? bundle2.getLong("chat_id") : 0L;
        Bundle bundle3 = this.arguments;
        this.E = bundle3 != null && bundle3.getBoolean("immediate") && bz.o() == 2;
        if (this.a == 0 && this.b == 0) {
            this.a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0();
        org.telegram.ui.f fVar = this.c;
        if (fVar != null) {
            hi0 hi0Var = (hi0) fVar.b;
            if (hi0Var.b.remove(fVar)) {
                hi0Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        b0 b0Var = this.G;
        if (b0Var != null) {
            b0Var.g();
            this.G = null;
        }
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.l();
            this.e = null;
        }
        z0 z0Var = this.d;
        if (z0Var != null) {
            z0Var.O0();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        b0 b0Var = this.G;
        if (b0Var != null) {
            b0Var.g();
            b0 b0Var2 = this.G;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(b0Var2);
            }
            if (this.G == b0Var2) {
                this.G = null;
            }
            z0 z0Var = this.d;
            if (z0Var != null) {
                z0Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || Build.VERSION.SDK_INT < 29 || this.s0 == null) {
            return;
        }
        parentActivity.getWindow().setNavigationBarContrastEnforced(this.s0.booleanValue());
        this.s0 = null;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 == 4) {
            boolean z10 = iArr.length > 0 && iArr[0] == 0;
            if (this.F && z10) {
                this.F = false;
                h0();
            }
            this.F = false;
            return;
        }
        if (getParentActivity() == null || i7 != 34) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            f0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(gd.N0(2131746307, null));
        alertDialog$Builder.k(gd.N0(2131747106, null), new c0(this));
        alertDialog$Builder.h(gd.N0(2131751760, null), null);
        int i10 = m6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, m6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        b0();
        if (getParentActivity() != null) {
            org.telegram.messenger.g0.l3(getParentActivity(), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        z0 z0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.H = true;
        }
        if (z10 && (z0Var = this.d) != null) {
            z0Var.setReveal(1.0f);
        }
        if (!z10 || z11 || this.f == null) {
            return;
        }
        float f10 = f.S;
        long j3 = 0;
        if (Build.VERSION.SDK_INT >= 29 && bz.o() == 2) {
            j3 = Math.max(0L, Math.round(c1.b[51]) - 860);
        }
        FrameLayout frameLayout = this.f;
        f0 f0Var = this.I;
        frameLayout.removeCallbacks(f0Var);
        this.f.postDelayed(f0Var, j3 + 680);
    }
}
