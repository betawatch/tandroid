package ai;

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
import bi.gc;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.s9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class s0 extends f2 {
    public boolean D;
    public boolean E;
    public i0 F;
    public boolean G;
    public final n0 H;
    public int I;
    public final Paint J;
    public float K;
    public final int[] L;
    public final int[] M;
    public LinearGradient N;
    public final Paint O;
    public final Matrix P;
    public final Paint Q;
    public final RectF R;
    public final float[] S;
    public final int[] T;
    public final int[] U;
    public LinearGradient V;
    public int W;
    public int X;
    public int Y;
    public r Z;
    public long a;
    public int a0;
    public long b;
    public int b0;
    public org.telegram.ui.f c;
    public int c0;
    public l1 d;
    public float d0;
    public y0 e;
    public boolean e0;
    public FrameLayout f;
    public LinearGradient f0;
    public final Paint g0;
    public q0 h;
    public final RectF h0;
    public final int[] i0;
    public final int[] j0;
    public final int[] k0;
    public final Path l0;
    public final RectF m0;
    public float n;
    public Paint n0;
    public final n1 o0;
    public final RectF p0;
    public boolean q0;
    public float r;
    public Boolean r0;
    public float s;
    public float w;
    public float x;
    public d y;

    public s0(Bundle bundle) {
        super(bundle);
        this.H = new n0(this, 0);
        this.J = new Paint();
        this.K = Float.NaN;
        this.L = new int[2];
        this.M = new int[2];
        this.O = new Paint();
        this.P = new Matrix();
        this.Q = new Paint(1);
        this.R = new RectF();
        this.S = new float[2];
        this.T = new int[2];
        this.U = new int[2];
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.g0 = new Paint();
        this.h0 = new RectF();
        this.i0 = new int[2];
        this.j0 = new int[2];
        this.k0 = new int[2];
        this.l0 = new Path();
        this.m0 = new RectF();
        this.o0 = new n1(0);
        this.p0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Z(s0 s0Var, AnimatorSet animatorSet) {
        s0Var.l0();
        boolean z9 = !s0Var.D;
        int i7 = s0Var.currentAccount;
        s0Var.Y = i7;
        s0Var.W = qs.f(i7).q(null, -1, z9);
        s0Var.X = qs.e().q(null, -1, z9);
        animatorSet.start();
    }

    public static void a0(s0 s0Var) {
        if (s0Var.getParentActivity() == null) {
            return;
        }
        zh.h1 h1Var = new zh.h1(s0Var.getParentActivity(), s0Var.currentAccount, s0Var.getUserConfig().e(), null, null);
        if (!h1Var.l2) {
            h1Var.l2 = true;
            gc gcVar = h1Var.n2;
            if (gcVar != null && (gcVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) h1Var.n2.getParent();
                int indexOfChild = viewGroup.indexOfChild(h1Var.n2);
                viewGroup.removeView(h1Var.n2);
                gc gcVar2 = new gc(h1Var.getContext(), qs.Z3, 2, 0);
                h1Var.n2 = gcVar2;
                viewGroup.addView(gcVar2, indexOfChild, ha.c(-1.0f, -1));
            }
            w70 w70Var = h1Var.o2;
            if (w70Var != null) {
                String M0 = hd.M0(2131750287, null);
                jb jbVar = h1Var.c2;
                jbVar.setText(M0);
                jbVar.setBreakStrategy(2);
                w70Var.setVisibility(8);
            }
            h1Var.Q1.O(false);
        }
        h1Var.show();
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

    public static void e0(f2 f2Var) {
        s9.j0(f2Var.getParentActivity(), 1, new f5.u(f2Var.getCurrentAccount(), f2Var, 1));
    }

    public static LinearGradient j0(boolean z9) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            float f10 = i7 / 8.0f;
            float C = com.google.android.recaptcha.internal.a.C(f10, 2.0f, 3.0f, f10 * f10);
            if (!z9) {
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
        org.telegram.messenger.g0.m3(parentActivity, false);
        org.telegram.messenger.g0.s3(window, false);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.r0 == null) {
                this.r0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
            }
            window.setNavigationBarContrastEnforced(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void clearViews() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        i0 i0Var = this.F;
        if (i0Var != null) {
            i0Var.g();
            this.F = null;
        }
        y0 y0Var = this.e;
        if (y0Var != null) {
            y0Var.l();
            this.e = null;
        }
        super.clearViews();
        l1 l1Var = this.d;
        if (l1Var != null) {
            l1Var.O0();
            this.d = null;
        }
        this.f = null;
        this.h = null;
        this.y = null;
        this.Z = null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01af, code lost:
    
        if (r3 != 1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bf  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        boolean z9;
        w0 w0Var;
        long j3;
        ArrayList v;
        char c10;
        String str2;
        w0 w0Var2;
        TLRPC.ShareTheme shareTheme;
        int i7 = this.currentAccount;
        f[] fVarArr = f.f;
        if (fVarArr[i7] == null) {
            fVarArr[i7] = new f(i7);
        }
        f fVar = fVarArr[i7];
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = fVar.b;
        a.a(tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null);
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops2 = fVar.b;
        aa.s sVar = new aa.s(this, fVar, tL_shareThemeBackdrops2 != null ? tL_shareThemeBackdrops2.backdrops : null, 2);
        if (fVar.d) {
            sVar.run();
        } else {
            fVar.e.add(sVar);
            if (!fVar.c) {
                fVar.c = true;
                TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops3 = fVar.b;
                tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops3 != null ? tL_shareThemeBackdrops3.hash : 0;
                ConnectionsManager.getInstance(fVar.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new d3.b(1), new e(fVar, 0));
            }
        }
        Activity parentActivity = getParentActivity();
        ci0 ci0Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).s1 : null;
        if (ci0Var != null && this.c == null) {
            org.telegram.ui.f fVar2 = new org.telegram.ui.f(ci0Var, 27);
            ci0Var.b.add(fVar2);
            ci0Var.a();
            this.c = fVar2;
        }
        int i10 = this.currentAccount;
        long j10 = this.a;
        long j11 = this.b;
        qp s12 = qp.s1(i10);
        String s5 = a8.p0.s(new StringBuilder("https://"), s12.U2, "/");
        if (j10 != 0 || j11 == 0) {
            if (j10 == p10.i(i10).e()) {
                str = "";
                z9 = true;
            } else {
                str = "";
                z9 = false;
            }
            TLRPC.User a22 = s12.a2(Long.valueOf(j10));
            String n10 = a22 != null ? t10.n(a22) : null;
            if (n10 != null) {
                j3 = 0;
                w0Var = new w0(rf.b.q(s5, n10), n10, true, false, z9, j10, z9);
            } else if (z9) {
                if (a22 != null && a22.phone != null && (v = g5.r(i10).v(6)) != null) {
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
                        j3 = 0;
                        w0Var = new w0(rf.b.q(s5, str3), str3, false, false, true, j10, true);
                    }
                    if (c10 != 0) {
                    }
                    if (a22.phone.startsWith("+")) {
                    }
                    String str32 = str2;
                    j3 = 0;
                    w0Var = new w0(rf.b.q(s5, str32), str32, false, false, true, j10, true);
                }
                TLRPC.TL_exportedContactToken tL_exportedContactToken = s12.X7;
                TLRPC.TL_exportedContactToken tL_exportedContactToken2 = (tL_exportedContactToken == null || ((long) tL_exportedContactToken.expires) <= System.currentTimeMillis() / 1000) ? null : s12.X7;
                String str4 = tL_exportedContactToken2 != null ? tL_exportedContactToken2.url : null;
                j3 = 0;
                w0Var = new w0(str4, a22 != null ? t10.p(a22) : str, false, true, true, j10, true);
            } else {
                j3 = 0;
                w0Var = new w0(s5, a22 != null ? t10.p(a22) : str, false, false, false, j10, false);
            }
            w0Var2 = w0Var;
        } else {
            TLRPC.Chat M0 = s12.M0(Long.valueOf(j11));
            String K = t3.K(M0, false);
            if (K != null) {
                w0Var2 = new w0(rf.b.q(s5, K), K, true, false, false, -j11, t3.w(1, M0));
                j3 = 0;
            } else {
                String str5 = M0 != null ? M0.title : "";
                j3 = 0;
                w0Var2 = new w0(s5, str5, false, false, false, -j11, false);
            }
        }
        this.f = new FrameLayout(context);
        l1 l1Var = new l1(context, this.currentAccount, w0Var2.a, w0Var2.b, w0Var2.c, new cb.c(this, 4));
        this.d = l1Var;
        this.f.addView(l1Var, ha.c(-1.0f, -1));
        this.d.setImmediateOnOpen(this.D);
        this.d.setRevealOpening(true);
        if (this.G) {
            this.d.setReveal(1.0f);
            this.f.postDelayed(this.H, 680L);
        } else if (org.telegram.messenger.g0.Q1()) {
            l1 l1Var2 = this.d;
            l1Var2.setReveal(1.0f);
            l1Var2.S4 = false;
        } else {
            this.d.setReveal(0.0f);
        }
        this.fragmentView = this.f;
        y0 y0Var = this.e;
        if (y0Var != null) {
            y0Var.l();
        }
        int i13 = this.currentAccount;
        l1 l1Var3 = this.d;
        y0 y0Var2 = new y0(i13, l1Var3, w0Var2);
        this.e = y0Var2;
        boolean z10 = w0Var2.d;
        l1Var3.setTimerOnly(z10);
        l1Var3.setTemporaryLink(z10);
        LongSparseArray h = y0.h(i13);
        long j12 = w0Var2.f;
        x0 x0Var = (x0) h.get(j12);
        if (x0Var != null) {
            shareTheme = x0Var.a;
        } else {
            qp s13 = qp.s1(i13);
            if (j12 > j3) {
                TLRPC.UserFull b22 = s13.b2(j12);
                if (b22 != null) {
                    shareTheme = b22.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                }
                shareTheme = null;
            } else {
                TLRPC.ChatFull N0 = s13.N0(-j12);
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
            l1Var3.setInstantTheme(true);
            y0Var2.a(shareTheme);
            l1Var3.setInstantTheme(false);
        }
        boolean z11 = w0Var2.g;
        l1Var3.setThemeEditable(z11);
        if (z11) {
            l1Var3.setGiftsOwner(j12);
        }
        if (w0Var2.e) {
            qs.f(i13).c(y0Var2, qs.k0);
            if (z10) {
                qp s14 = qp.s1(i13);
                TLRPC.TL_exportedContactToken tL_exportedContactToken3 = s14.X7;
                TLRPC.TL_exportedContactToken tL_exportedContactToken4 = (tL_exportedContactToken3 == null || ((long) tL_exportedContactToken3.expires) <= System.currentTimeMillis() / 1000) ? null : s14.X7;
                y0Var2.r = tL_exportedContactToken4;
                if (tL_exportedContactToken4 == null) {
                    y0Var2.m();
                } else {
                    l1Var3.setLinkExpires(tL_exportedContactToken4.expires);
                }
            }
            y0Var2.r();
            y0Var2.g();
            y0Var2.p();
        } else {
            l1Var3.setFeeStars(j3);
            y0Var2.g();
        }
        return this.f;
    }

    public final void d0() {
        l1 l1Var;
        if (this.h == null || (l1Var = this.d) == null || l1Var.getWidth() == 0) {
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
        if (this.F != null || this.d == null || this.f == null || getParentActivity() == null) {
            return;
        }
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        rectF.set(this.d.j7);
        rectF2.set(this.d.g7);
        if (rectF.isEmpty()) {
            rectF.set((this.f.getWidth() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f.getHeight() / 2.0f) - org.telegram.messenger.g0.L(20.0f), (this.f.getWidth() / 2.0f) + org.telegram.messenger.g0.L(20.0f), (this.f.getHeight() / 2.0f) + org.telegram.messenger.g0.L(20.0f));
        }
        this.d.setScanHidden(true);
        i0 i0Var = new i0(getParentActivity(), rectF, rectF2, new d6.i(this, 4));
        this.F = i0Var;
        i0Var.setButtonLabel(hd.M0(2131746469, null));
        i0 i0Var2 = this.F;
        i0Var2.setOnGallery(new a1.e(15, this, i0Var2));
        this.f.addView(this.F, ha.c(-1.0f, -1));
    }

    public final void g0(float f10, float f11, boolean z9) {
        if (!z9) {
            q0 q0Var = this.h;
            if (q0Var != null && q0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            d dVar = this.y;
            if (dVar == null || dVar.getVisibility() != 0) {
                return;
            }
            this.y.setVisibility(4);
            return;
        }
        if (this.h == null) {
            if (getParentActivity() == null) {
                return;
            }
            q0 q0Var2 = new q0(this, getParentActivity(), this.currentAccount, new p0(this));
            this.h = q0Var2;
            q0Var2.setOutlineProvider(new r0(this, 0));
            this.h.setClipToOutline(true);
            d dVar2 = new d(getParentActivity(), new aa.n(this, 1));
            this.y = dVar2;
            dVar2.b = this.h;
            this.d.setOnPicksChanged(new n0(this, 1));
            this.y.setOutlineProvider(this.h.getOutlineProvider());
            this.y.setClipToOutline(true);
            this.f.addView(this.h, ha.e(-1, -1, 48));
            d0();
            this.f.post(new n0(this, 2));
        }
        d0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i7 = layoutParams.height;
        int i10 = layoutParams.leftMargin;
        int i11 = layoutParams.rightMargin;
        if (this.y.getParent() == null) {
            this.f.addView(this.y, ha.e(-1, -1, 48));
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
        j1 j1Var = this.d.n;
        int i12 = t02 ^ (j1Var != null ? j1Var.h : 872415231);
        if (this.h.getTranslationY() != f10 || i12 != this.I) {
            this.h.setTranslationY(f10);
            this.I = i12;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f11);
        q0 q0Var3 = this.h;
        l1 l1Var = this.d;
        j1 j1Var2 = l1Var.n;
        int i13 = j1Var2 != null ? j1Var2.b : -16777216;
        if (i13 != l1Var.a2) {
            l1Var.a2 = i13;
            l1Var.b2 = (i0.a.f(0.13f, -1, l1.D0(0.75f, 1.3f, 0.16f, i13)) & 16777215) | (-1728053248);
        }
        q0Var3.setHeaderColor(l1Var.b2);
        if (this.h.getVisibility() != 0) {
            q0 q0Var4 = this.h;
            if (q0Var4.J) {
                q0Var4.J = false;
                q0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (this.q0) {
            return;
        }
        k0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        l1 l1Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || (l1Var = this.d) == null || l1Var.getCurrentLink() == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 28 || r2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.E = true;
            parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        } else {
            Bitmap T0 = this.d.T0();
            if (T0 == null) {
                return;
            }
            Utilities.e.c(new a1.e(14, this, T0));
        }
    }

    public final void i0(String str) {
        l1 l1Var;
        if (getParentActivity() == null || (l1Var = this.d) == null || l1Var.getCurrentLink() == null) {
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
            getParentActivity().startActivity(Intent.createChooser(intent, hd.M0(2131749169, null)));
        } catch (ActivityNotFoundException e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void k0() {
        q0 q0Var;
        if (this.q0 || (q0Var = this.h) == null) {
            return;
        }
        w tabs = q0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(20.0f));
        float[] fArr = o1.a[0];
        int ceil = (int) Math.ceil(org.telegram.messenger.g0.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i7 = ceil - 3;
        this.a0 = Math.max(0, i7);
        this.b0 = Math.max(0, i7);
        this.c0 = Math.max(0, ceil - 4);
        tabs.a = new ab.g(3, this, tabs);
        tabs.b = new j0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i10 = this.a0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i10, this.b0, i10, this.c0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new r0(this, 1));
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
        r grid = this.h.getGrid();
        this.q0 = true;
        grid.f3 = new k0(this, grid, tabs);
        grid.e3 = new aa.k(2, this, grid);
        d dVar = this.y;
        if (dVar.T != grid) {
            dVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new b(dVar, 0));
        }
        int L3 = org.telegram.messenger.g0.L(44.0f);
        this.Z = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, org.telegram.messenger.g0.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        m0();
        grid.setClipToPadding(false);
        grid.j(new o0(0, this, tabs));
        tabs.bringToFront();
    }

    public final void l0() {
        if (this.W >= 0) {
            qs.f(this.Y).j(this.W);
        }
        if (this.X >= 0) {
            qs.e().j(this.X);
        }
        this.X = -1;
        this.W = -1;
    }

    public final void m0() {
        l1 l1Var;
        r rVar = this.Z;
        if (rVar == null || (l1Var = this.d) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(l1Var.I.isEmpty() ? 12.0f : 73.0f);
        if (rVar.getPaddingBottom() != L) {
            rVar.setPadding(rVar.getPaddingLeft(), rVar.getPaddingTop(), rVar.getPaddingRight(), L);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        i0 i0Var = this.F;
        if (i0Var != null) {
            if (z9) {
                i0Var.e();
            }
            return false;
        }
        l1 l1Var = this.d;
        if (l1Var != null) {
            float f10 = l1Var.k1;
            if (f10 > 0.5f || l1Var.f1 > 0.5f) {
                if (z9) {
                    if (f10 > 0.5f) {
                        l1Var.l1 = 0.0f;
                    } else if (l1Var.f1 > 0.5f) {
                        l1Var.g1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        if (this.d == null || org.telegram.messenger.g0.Q1()) {
            return null;
        }
        this.d.setRevealOpening(z9);
        this.d.setReveal(z9 ? 0.0f : 1.0f);
        int i7 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ah.h(this, 2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(z9 ? 860L : 200L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new g0(this, z9, runnable, i7));
        org.telegram.messenger.g0.h3(new a1.e(13, this, animatorSet));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        Bundle bundle = this.arguments;
        this.a = bundle != null ? bundle.getLong("user_id") : 0L;
        Bundle bundle2 = this.arguments;
        this.b = bundle2 != null ? bundle2.getLong("chat_id") : 0L;
        Bundle bundle3 = this.arguments;
        this.D = bundle3 != null && bundle3.getBoolean("immediate") && iz.o() == 2;
        if (this.a == 0 && this.b == 0) {
            this.a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0();
        org.telegram.ui.f fVar = this.c;
        if (fVar != null) {
            ci0 ci0Var = (ci0) fVar.b;
            if (ci0Var.b.remove(fVar)) {
                ci0Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        i0 i0Var = this.F;
        if (i0Var != null) {
            i0Var.g();
            this.F = null;
        }
        y0 y0Var = this.e;
        if (y0Var != null) {
            y0Var.l();
            this.e = null;
        }
        l1 l1Var = this.d;
        if (l1Var != null) {
            l1Var.O0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        i0 i0Var = this.F;
        if (i0Var != null) {
            i0Var.g();
            i0 i0Var2 = this.F;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(i0Var2);
            }
            if (this.F == i0Var2) {
                this.F = null;
            }
            l1 l1Var = this.d;
            if (l1Var != null) {
                l1Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || Build.VERSION.SDK_INT < 29 || this.r0 == null) {
            return;
        }
        parentActivity.getWindow().setNavigationBarContrastEnforced(this.r0.booleanValue());
        this.r0 = null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 == 4) {
            boolean z9 = iArr.length > 0 && iArr[0] == 0;
            if (this.E && z9) {
                this.E = false;
                h0();
            }
            this.E = false;
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
        alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(hd.M0(2131746502, null));
        alertDialog$Builder.k(hd.M0(2131747299, null), new j0(this));
        alertDialog$Builder.h(hd.M0(2131751772, null), null);
        int i10 = k6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, k6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        b0();
        if (getParentActivity() != null) {
            org.telegram.messenger.g0.m3(getParentActivity(), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        l1 l1Var;
        super.onTransitionAnimationEnd(z9, z10);
        if (z9) {
            this.G = true;
        }
        if (z9 && (l1Var = this.d) != null) {
            l1Var.setReveal(1.0f);
        }
        if (!z9 || z10 || this.f == null) {
            return;
        }
        float f10 = h.S;
        long j3 = 0;
        if (Build.VERSION.SDK_INT >= 29 && iz.o() == 2) {
            j3 = Math.max(0L, Math.round(o1.b[51]) - 860);
        }
        FrameLayout frameLayout = this.f;
        n0 n0Var = this.H;
        frameLayout.removeCallbacks(n0Var);
        this.f.postDelayed(n0Var, j3 + 680);
    }
}
