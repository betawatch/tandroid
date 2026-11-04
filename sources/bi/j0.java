package bi;

import ai.b3;
import ai.e2;
import ai.i4;
import ai.j5;
import ai.k3;
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
import b8.mf;
import ci.bb;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.r2;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s9;
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class j0 extends d2 {
    public boolean E;
    public boolean F;
    public a0 G;
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
    public a1 d;
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
    public final c1 p0;
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
        this.p0 = new c1(0);
        this.q0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Z(j0 j0Var, AnimatorSet animatorSet) {
        j0Var.l0();
        boolean z10 = !j0Var.E;
        int i3 = j0Var.currentAccount;
        j0Var.Z = i3;
        j0Var.X = hs.f(i3).q(null, -1, z10);
        j0Var.Y = hs.e().q(null, -1, z10);
        animatorSet.start();
    }

    public static void a0(j0 j0Var) {
        if (j0Var.getParentActivity() == null) {
            return;
        }
        b3 b3Var = new b3(j0Var.getParentActivity(), j0Var.currentAccount, j0Var.getUserConfig().e(), null, null);
        if (!b3Var.m2) {
            b3Var.m2 = true;
            bb bbVar = b3Var.o2;
            if (bbVar != null && (bbVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) b3Var.o2.getParent();
                int indexOfChild = viewGroup.indexOfChild(b3Var.o2);
                viewGroup.removeView(b3Var.o2);
                bb bbVar2 = new bb(b3Var.getContext(), hs.Z3, 2, 0);
                b3Var.o2 = bbVar2;
                viewGroup.addView(bbVar2, indexOfChild, mf.c(-1.0f, -1));
            }
            s70 s70Var = b3Var.p2;
            if (s70Var != null) {
                String M0 = bd.M0(2131750296, null);
                e2 e2Var = b3Var.d2;
                e2Var.setText(M0);
                e2Var.setBreakStrategy(2);
                s70Var.setVisibility(8);
            }
            b3Var.R1.O(false);
        }
        b3Var.show();
    }

    public static void c0(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                c0(viewGroup.getChildAt(i3));
            }
        }
    }

    public static void e0(d2 d2Var) {
        s9.j0(d2Var.getParentActivity(), 1, new e5.u(d2Var.getCurrentAccount(), d2Var, 3));
    }

    public static LinearGradient j0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i3 = 0; i3 < 9; i3++) {
            float f10 = i3 / 8.0f;
            float B = com.google.android.recaptcha.internal.a.B(f10, 2.0f, 3.0f, f10 * f10);
            if (!z10) {
                B = 1.0f - B;
            }
            iArr[i3] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i3] = f10;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void b0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        Window window = parentActivity.getWindow();
        org.telegram.messenger.g0.m3(parentActivity, false);
        org.telegram.messenger.g0.s3(window, false);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.s0 == null) {
                this.s0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
            }
            window.setNavigationBarContrastEnforced(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void clearViews() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        a0 a0Var = this.G;
        if (a0Var != null) {
            a0Var.g();
            this.G = null;
        }
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.l();
            this.e = null;
        }
        super.clearViews();
        a1 a1Var = this.d;
        if (a1Var != null) {
            a1Var.O0();
            this.d = null;
        }
        this.f = null;
        this.h = null;
        this.y = null;
        this.a0 = null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01b0, code lost:
    
        if (r3 != 1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c0  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        boolean z10;
        m0 m0Var;
        long j10;
        ArrayList v;
        char c2;
        String str2;
        m0 m0Var2;
        TLRPC.ShareTheme shareTheme;
        int i3 = this.currentAccount;
        d[] dVarArr = d.f;
        if (dVarArr[i3] == null) {
            dVarArr[i3] = new d(i3);
        }
        d dVar = dVarArr[i3];
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = dVar.b;
        a.a(tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null);
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops2 = dVar.b;
        k3 k3Var = new k3(this, dVar, tL_shareThemeBackdrops2 != null ? tL_shareThemeBackdrops2.backdrops : null, 7);
        if (dVar.d) {
            k3Var.run();
        } else {
            dVar.e.add(k3Var);
            if (!dVar.c) {
                dVar.c = true;
                TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops3 = dVar.b;
                tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops3 != null ? tL_shareThemeBackdrops3.hash : 0;
                ConnectionsManager.getInstance(dVar.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new c3.b(1), new ai.c(dVar, 10));
            }
        }
        Activity parentActivity = getParentActivity();
        zh0 zh0Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).v1 : null;
        if (zh0Var != null && this.c == null) {
            org.telegram.ui.f fVar = new org.telegram.ui.f(zh0Var, 27);
            zh0Var.b.add(fVar);
            zh0Var.a();
            this.c = fVar;
        }
        int i10 = this.currentAccount;
        long j11 = this.a;
        long j12 = this.b;
        hp s12 = hp.s1(i10);
        String s6 = a1.g.s(new StringBuilder("https://"), s12.V2, "/");
        if (j11 != 0 || j12 == 0) {
            if (j11 == h10.i(i10).e()) {
                str = "";
                z10 = true;
            } else {
                str = "";
                z10 = false;
            }
            TLRPC.User a22 = s12.a2(Long.valueOf(j11));
            String n4 = a22 != null ? l10.n(a22) : null;
            if (n4 != null) {
                j10 = 0;
                m0Var = new m0(t4.c.q(s6, n4), n4, true, false, z10, j11, z10);
            } else if (z10) {
                if (a22 != null && a22.phone != null && (v = g5.r(i10).v(6)) != null) {
                    int size = v.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = v.get(i11);
                        i11++;
                        TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) obj;
                        if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                            c2 = 0;
                            break;
                        }
                        if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                            break;
                        }
                        if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                            c2 = 1;
                            break;
                        }
                    }
                    c2 = 2;
                    if (c2 == 2) {
                        ArrayList v10 = g5.r(i10).v(7);
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
                        if (a22.phone.startsWith("+")) {
                            str2 = "+" + a22.phone;
                        } else {
                            str2 = a22.phone;
                        }
                        String str3 = str2;
                        j10 = 0;
                        m0Var = new m0(t4.c.q(s6, str3), str3, false, false, true, j11, true);
                    }
                    if (c2 != 0) {
                    }
                    if (a22.phone.startsWith("+")) {
                    }
                    String str32 = str2;
                    j10 = 0;
                    m0Var = new m0(t4.c.q(s6, str32), str32, false, false, true, j11, true);
                }
                TLRPC.TL_exportedContactToken tL_exportedContactToken = s12.X7;
                TLRPC.TL_exportedContactToken tL_exportedContactToken2 = (tL_exportedContactToken == null || ((long) tL_exportedContactToken.expires) <= System.currentTimeMillis() / 1000) ? null : s12.X7;
                String str4 = tL_exportedContactToken2 != null ? tL_exportedContactToken2.url : null;
                j10 = 0;
                m0Var = new m0(str4, a22 != null ? l10.p(a22) : str, false, true, true, j11, true);
            } else {
                j10 = 0;
                m0Var = new m0(s6, a22 != null ? l10.p(a22) : str, false, false, false, j11, false);
            }
            m0Var2 = m0Var;
        } else {
            TLRPC.Chat M0 = s12.M0(Long.valueOf(j12));
            String K = t3.K(M0, false);
            if (K != null) {
                m0Var2 = new m0(t4.c.q(s6, K), K, true, false, false, -j12, t3.w(1, M0));
                j10 = 0;
            } else {
                String str5 = M0 != null ? M0.title : "";
                j10 = 0;
                m0Var2 = new m0(s6, str5, false, false, false, -j12, false);
            }
        }
        this.f = new FrameLayout(context);
        a1 a1Var = new a1(context, this.currentAccount, m0Var2.a, m0Var2.b, m0Var2.c, new c6.i(this, 6));
        this.d = a1Var;
        this.f.addView(a1Var, mf.c(-1.0f, -1));
        this.d.setImmediateOnOpen(this.E);
        this.d.setRevealOpening(true);
        if (this.H) {
            this.d.setReveal(1.0f);
            this.f.postDelayed(this.I, 680L);
        } else if (org.telegram.messenger.g0.Q1()) {
            a1 a1Var2 = this.d;
            a1Var2.setReveal(1.0f);
            a1Var2.T4 = false;
        } else {
            this.d.setReveal(0.0f);
        }
        this.fragmentView = this.f;
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.l();
        }
        int i13 = this.currentAccount;
        a1 a1Var3 = this.d;
        o0 o0Var2 = new o0(i13, a1Var3, m0Var2);
        this.e = o0Var2;
        boolean z11 = m0Var2.d;
        a1Var3.setTimerOnly(z11);
        a1Var3.setTemporaryLink(z11);
        LongSparseArray h = o0.h(i13);
        long j13 = m0Var2.f;
        n0 n0Var = (n0) h.get(j13);
        if (n0Var != null) {
            shareTheme = n0Var.a;
        } else {
            hp s13 = hp.s1(i13);
            if (j13 > j10) {
                TLRPC.UserFull b22 = s13.b2(j13);
                if (b22 != null) {
                    shareTheme = b22.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            } else {
                TLRPC.ChatFull N0 = s13.N0(-j13);
                if (N0 != null) {
                    shareTheme = N0.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            }
        }
        if (shareTheme != null) {
            a1Var3.setInstantTheme(true);
            o0Var2.a(shareTheme);
            a1Var3.setInstantTheme(false);
        }
        boolean z12 = m0Var2.g;
        a1Var3.setThemeEditable(z12);
        if (z12) {
            a1Var3.setGiftsOwner(j13);
        }
        if (m0Var2.e) {
            hs.f(i13).c(o0Var2, hs.k0);
            if (z11) {
                hp s14 = hp.s1(i13);
                TLRPC.TL_exportedContactToken tL_exportedContactToken3 = s14.X7;
                TLRPC.TL_exportedContactToken tL_exportedContactToken4 = (tL_exportedContactToken3 == null || ((long) tL_exportedContactToken3.expires) <= System.currentTimeMillis() / 1000) ? null : s14.X7;
                o0Var2.r = tL_exportedContactToken4;
                if (tL_exportedContactToken4 == null) {
                    o0Var2.m();
                } else {
                    a1Var3.setLinkExpires(tL_exportedContactToken4.expires);
                }
            }
            o0Var2.r();
            o0Var2.g();
            o0Var2.p();
        } else {
            a1Var3.setFeeStars(j10);
            o0Var2.g();
        }
        return this.f;
    }

    public final void d0() {
        a1 a1Var;
        if (this.h == null || (a1Var = this.d) == null || a1Var.getWidth() == 0) {
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

    @Override // org.telegram.ui.ActionBar.d2
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
        a0 a0Var = new a0(getParentActivity(), rectF, rectF2, new android.support.v4.media.c(this, 5));
        this.G = a0Var;
        a0Var.setButtonLabel(bd.M0(2131746478, null));
        a0 a0Var2 = this.G;
        a0Var2.setOnGallery(new a1.f(17, this, a0Var2));
        this.f.addView(this.G, mf.c(-1.0f, -1));
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
            c cVar2 = new c(getParentActivity(), new bb.c(this, 7));
            this.y = cVar2;
            cVar2.b = this.h;
            this.d.setOnPicksChanged(new f0(this, 1));
            this.y.setOutlineProvider(this.h.getOutlineProvider());
            this.y.setClipToOutline(true);
            this.f.addView(this.h, mf.e(-1, -1, 48));
            d0();
            this.f.post(new f0(this, 2));
        }
        d0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i3 = layoutParams.height;
        int i10 = layoutParams.leftMargin;
        int i11 = layoutParams.rightMargin;
        if (this.y.getParent() == null) {
            this.f.addView(this.y, mf.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.y.getLayoutParams();
        if (layoutParams2.height != i3 || layoutParams2.leftMargin != i10 || layoutParams2.rightMargin != i11) {
            layoutParams2.height = i3;
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
        y0 y0Var = this.d.n;
        int i12 = t02 ^ (y0Var != null ? y0Var.h : 872415231);
        if (this.h.getTranslationY() != f10 || i12 != this.J) {
            this.h.setTranslationY(f10);
            this.J = i12;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f11);
        h0 h0Var3 = this.h;
        a1 a1Var = this.d;
        y0 y0Var2 = a1Var.n;
        int i13 = y0Var2 != null ? y0Var2.b : -16777216;
        if (i13 != a1Var.b2) {
            a1Var.b2 = i13;
            a1Var.c2 = (i0.a.f(0.13f, -1, a1.D0(0.75f, 1.3f, 0.16f, i13)) & 16777215) | (-1728053248);
        }
        h0Var3.setHeaderColor(a1Var.c2);
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

    @Override // org.telegram.ui.ActionBar.d2
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        a1 a1Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || (a1Var = this.d) == null || a1Var.getCurrentLink() == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 28 || r2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.F = true;
            parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        } else {
            Bitmap T0 = this.d.T0();
            if (T0 == null) {
                return;
            }
            Utilities.e.c(new a1.f(16, this, T0));
        }
    }

    public final void i0(String str) {
        a1 a1Var;
        if (getParentActivity() == null || (a1Var = this.d) == null || a1Var.getCurrentLink() == null) {
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
            getParentActivity().startActivity(Intent.createChooser(intent, bd.M0(2131749178, null)));
        } catch (ActivityNotFoundException e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
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
        float[] fArr = d1.a[0];
        int ceil = (int) Math.ceil(org.telegram.messenger.g0.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i3 = ceil - 3;
        this.b0 = Math.max(0, i3);
        this.c0 = Math.max(0, i3);
        this.d0 = Math.max(0, ceil - 4);
        tabs.a = new ai.n(7, this, tabs);
        tabs.b = new b0(this);
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
        grid.g3 = new c0(this, grid, tabs);
        grid.f3 = new d0(0, this, grid);
        c cVar = this.y;
        if (cVar.U != grid) {
            cVar.U = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new j5(cVar, 3));
        }
        int L3 = org.telegram.messenger.g0.L(44.0f);
        this.a0 = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, org.telegram.messenger.g0.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        m0();
        grid.setClipToPadding(false);
        grid.j(new i4(1, this, tabs));
        tabs.bringToFront();
    }

    public final void l0() {
        if (this.X >= 0) {
            hs.f(this.Z).j(this.X);
        }
        if (this.Y >= 0) {
            hs.e().j(this.Y);
        }
        this.Y = -1;
        this.X = -1;
    }

    public final void m0() {
        a1 a1Var;
        m mVar = this.a0;
        if (mVar == null || (a1Var = this.d) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(a1Var.J.isEmpty() ? 12.0f : 73.0f);
        if (mVar.getPaddingBottom() != L) {
            mVar.setPadding(mVar.getPaddingLeft(), mVar.getPaddingTop(), mVar.getPaddingRight(), L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        a0 a0Var = this.G;
        if (a0Var != null) {
            if (z10) {
                a0Var.e();
            }
            return false;
        }
        a1 a1Var = this.d;
        if (a1Var != null) {
            float f10 = a1Var.l1;
            if (f10 > 0.5f || a1Var.g1 > 0.5f) {
                if (z10) {
                    if (f10 > 0.5f) {
                        a1Var.m1 = 0.0f;
                    } else if (a1Var.g1 > 0.5f) {
                        a1Var.h1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (this.d == null || org.telegram.messenger.g0.Q1()) {
            return null;
        }
        this.d.setRevealOpening(z10);
        this.d.setReveal(z10 ? 0.0f : 1.0f);
        int i3 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new bh.f(this, i3));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(z10 ? 860L : 200L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new androidx.fragment.app.g(this, z10, runnable, i3));
        org.telegram.messenger.g0.h3(new a1.f(15, this, animatorSet));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        Bundle bundle = this.arguments;
        this.a = bundle != null ? bundle.getLong("user_id") : 0L;
        Bundle bundle2 = this.arguments;
        this.b = bundle2 != null ? bundle2.getLong("chat_id") : 0L;
        Bundle bundle3 = this.arguments;
        this.E = bundle3 != null && bundle3.getBoolean("immediate") && az.o() == 2;
        if (this.a == 0 && this.b == 0) {
            this.a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0();
        org.telegram.ui.f fVar = this.c;
        if (fVar != null) {
            zh0 zh0Var = (zh0) fVar.b;
            if (zh0Var.b.remove(fVar)) {
                zh0Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.I);
        }
        a0 a0Var = this.G;
        if (a0Var != null) {
            a0Var.g();
            this.G = null;
        }
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.l();
            this.e = null;
        }
        a1 a1Var = this.d;
        if (a1Var != null) {
            a1Var.O0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        a0 a0Var = this.G;
        if (a0Var != null) {
            a0Var.g();
            a0 a0Var2 = this.G;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(a0Var2);
            }
            if (this.G == a0Var2) {
                this.G = null;
            }
            a1 a1Var = this.d;
            if (a1Var != null) {
                a1Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || Build.VERSION.SDK_INT < 29 || this.s0 == null) {
            return;
        }
        parentActivity.getWindow().setNavigationBarContrastEnforced(this.s0.booleanValue());
        this.s0 = null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        if (i3 == 4) {
            boolean z10 = iArr.length > 0 && iArr[0] == 0;
            if (this.F && z10) {
                this.F = false;
                h0();
            }
            this.F = false;
            return;
        }
        if (getParentActivity() == null || i3 != 34) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            f0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(bd.M0(2131746511, null));
        alertDialog$Builder.k(bd.M0(2131747308, null), new b0(this));
        alertDialog$Builder.h(bd.M0(2131751772, null), null);
        int i10 = k6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, k6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        b0();
        if (getParentActivity() != null) {
            org.telegram.messenger.g0.m3(getParentActivity(), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        a1 a1Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.H = true;
        }
        if (z10 && (a1Var = this.d) != null) {
            a1Var.setReveal(1.0f);
        }
        if (!z10 || z11 || this.f == null) {
            return;
        }
        float f10 = f.S;
        long j10 = 0;
        if (Build.VERSION.SDK_INT >= 29 && az.o() == 2) {
            j10 = Math.max(0L, Math.round(d1.b[51]) - 860);
        }
        FrameLayout frameLayout = this.f;
        f0 f0Var = this.I;
        frameLayout.removeCallbacks(f0Var);
        this.f.postDelayed(f0Var, j10 + 680);
    }
}
