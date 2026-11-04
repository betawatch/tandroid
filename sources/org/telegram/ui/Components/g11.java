package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.l81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g11 extends FrameLayout implements org.telegram.messenger.cs, qe.b, org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int m0 = 0;
    public final f11 E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final w01 K;
    public long L;
    public long M;
    public final qe.a N;
    public gh.g O;
    public gh.g P;
    public float Q;
    public float R;
    public org.telegram.ui.yd S;
    public boolean T;
    public boolean U;
    public float V;
    public boolean W;
    public final qe.a a;
    public boolean a0;
    public final qe.a b;
    public int b0;
    public boolean c;
    public int c0;
    public boolean d;
    public Boolean d0;
    public final int e;
    public ValueAnimator e0;
    public final long f;
    public long f0;
    public boolean g0;
    public final org.telegram.ui.ActionBar.e6 h;
    public org.telegram.messenger.n10 h0;
    public Runnable i0;
    public org.telegram.messenger.n10 j0;
    public boolean k0;
    public final HashSet l0;
    public final boolean n;
    public final boolean r;
    public final org.telegram.ui.wm s;
    public final boolean w;
    public final FrameLayout x;
    public final u01 y;

    /* JADX WARN: Type inference failed for: r3v8, types: [org.telegram.ui.Components.p01] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.p01] */
    public g11(Activity activity, org.telegram.ui.wm wmVar, int i3, long j10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        ViewGroup viewGroup;
        boolean z11;
        xq xqVar = xq.h;
        this.a = new qe.a(0, this, xqVar, 380L, true);
        this.b = new qe.a(1, this, xqVar, 380L, false);
        this.N = new qe.a(0, new q01(this), xqVar, 320L, false);
        this.V = 0.0f;
        this.l0 = new HashSet();
        this.s = wmVar;
        this.c = z10;
        this.e = i3;
        this.f = j10;
        this.h = e6Var;
        long j11 = -j10;
        this.n = org.telegram.messenger.t3.p0(org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j11)));
        boolean v = org.telegram.messenger.l10.v(org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10)));
        this.r = v;
        final int i10 = 0;
        final int i11 = 1;
        this.w = !org.telegram.messenger.k5.w("topics_end_reached_", j11, org.telegram.messenger.h10.i(i3).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        addView(frameLayout, b8.mf.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.J = frameLayout2;
        addView(frameLayout2, b8.mf.d(64, -1.0f, org.telegram.messenger.hs.A1, 7.0f, 7.0f, 7.0f, 7.0f));
        u01 u01Var = new u01(this, activity, i3, new org.telegram.messenger.n10(this) { // from class: org.telegram.ui.Components.p01
            public final /* synthetic */ g11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i12;
                long j12;
                org.telegram.messenger.c00 c00Var;
                long j13;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j14;
                long j15;
                int i13 = i10;
                g11 g11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z15 = g11Var.r;
                        int i14 = g11Var.e;
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i14);
                        long j16 = g11Var.f;
                        long j17 = -j16;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j17));
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(j16));
                        org.telegram.messenger.c00 c00Var2 = org.telegram.messenger.hp.s1(i14).q7;
                        ArrayList l10 = c00Var2.l(j17);
                        boolean z16 = g11Var.n;
                        int i15 = a11.b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(g11Var.f0 == 0);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z12 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z15) {
                                    i12 = i17;
                                    if (tL_forumTopic.id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) k2.p1.h(1, arrayList2)).y |= 8;
                                        }
                                        f41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        f41Var.M();
                                        z12 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = g11Var.f0;
                                    if (z16) {
                                        c00Var = c00Var2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        c00Var = c00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    c00Var2 = c00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.c00 c00Var3 = c00Var2;
                        if (z12) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !c00Var3.e(j17) && g11Var.w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.l10.v(a22)) {
                                r31 K6 = r31.K(a11.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList2.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        g11.c(g11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        f41 f41Var2 = (f41) obj2;
                        boolean z18 = g11Var.n;
                        int i19 = g11Var.e;
                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i19);
                        long j19 = g11Var.f;
                        long j20 = -j19;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j20));
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(i19).a2(Long.valueOf(j19));
                        org.telegram.messenger.c00 c00Var4 = org.telegram.messenger.hp.s1(i19).q7;
                        ArrayList l11 = c00Var4.l(j20);
                        boolean z19 = g11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = e11.b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(g11Var.f0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z20 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (g11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        f41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        f41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = e11.b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = g11Var.f0;
                                    if (z18) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j19 = j21;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z13) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !c00Var4.e(j20) && g11Var.w) {
                            int i24 = e11.b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(user2)) {
                                int i25 = e11.b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.q = false;
                                arrayList3.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new q01(this), new q01(this), e6Var);
        this.y = u01Var;
        u01Var.E1(new org.telegram.messenger.n10(this) { // from class: org.telegram.ui.Components.p01
            public final /* synthetic */ g11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i12;
                long j12;
                org.telegram.messenger.c00 c00Var;
                long j13;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j14;
                long j15;
                int i13 = i11;
                g11 g11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z15 = g11Var.r;
                        int i14 = g11Var.e;
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i14);
                        long j16 = g11Var.f;
                        long j17 = -j16;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j17));
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(j16));
                        org.telegram.messenger.c00 c00Var2 = org.telegram.messenger.hp.s1(i14).q7;
                        ArrayList l10 = c00Var2.l(j17);
                        boolean z16 = g11Var.n;
                        int i15 = a11.b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(g11Var.f0 == 0);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z12 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z15) {
                                    i12 = i17;
                                    if (tL_forumTopic.id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) k2.p1.h(1, arrayList2)).y |= 8;
                                        }
                                        f41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        f41Var.M();
                                        z12 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = g11Var.f0;
                                    if (z16) {
                                        c00Var = c00Var2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        c00Var = c00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    c00Var2 = c00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.c00 c00Var3 = c00Var2;
                        if (z12) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !c00Var3.e(j17) && g11Var.w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.l10.v(a22)) {
                                r31 K6 = r31.K(a11.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList2.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        g11.c(g11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        f41 f41Var2 = (f41) obj2;
                        boolean z18 = g11Var.n;
                        int i19 = g11Var.e;
                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i19);
                        long j19 = g11Var.f;
                        long j20 = -j19;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j20));
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(i19).a2(Long.valueOf(j19));
                        org.telegram.messenger.c00 c00Var4 = org.telegram.messenger.hp.s1(i19).q7;
                        ArrayList l11 = c00Var4.l(j20);
                        boolean z19 = g11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = e11.b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(g11Var.f0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z20 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (g11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        f41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        f41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = e11.b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = g11Var.f0;
                                    if (z18) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j19 = j21;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z13) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !c00Var4.e(j20) && g11Var.w) {
                            int i24 = e11.b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(user2)) {
                                int i25 = e11.b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.q = false;
                                arrayList3.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        u01Var.setWillNotDraw(false);
        u01Var.g3.r = false;
        u01Var.getContext();
        kg.f0 f0Var = new kg.f0((ViewGroup) u01Var, 7);
        u01Var.f3 = f0Var;
        u01Var.setLayoutManager(f0Var);
        frameLayout.addView(u01Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 41.0f, 0.0f, 0.0f, 0.0f));
        u01Var.j(new v01(this, 0));
        if (v) {
            f11 f11Var = new f11(i3, activity, e6Var);
            this.E = f11Var;
            f11Var.c(true, false, this.f0 == 0);
            f11Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o01
                public final /* synthetic */ g11 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            g11 g11Var = this.b;
                            w01 w01Var = g11Var.K;
                            w01Var.z1(false);
                            u01 u01Var2 = g11Var.y;
                            u01Var2.z1(false);
                            g11Var.N.a(false, true);
                            org.telegram.messenger.g0.b4(w01Var);
                            org.telegram.messenger.g0.b4(u01Var2);
                            break;
                        case 1:
                            this.b.h0.a(0, Boolean.FALSE);
                            break;
                        default:
                            g11.b(this.b);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(f11Var, b8.mf.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.E = null;
        }
        final int i12 = 2;
        ViewGroup viewGroup2 = viewGroup;
        w01 w01Var = new w01(activity, i3, new org.telegram.messenger.n10(this) { // from class: org.telegram.ui.Components.p01
            public final /* synthetic */ g11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i122;
                long j12;
                org.telegram.messenger.c00 c00Var;
                long j13;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j14;
                long j15;
                int i13 = i12;
                g11 g11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z15 = g11Var.r;
                        int i14 = g11Var.e;
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i14);
                        long j16 = g11Var.f;
                        long j17 = -j16;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j17));
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(j16));
                        org.telegram.messenger.c00 c00Var2 = org.telegram.messenger.hp.s1(i14).q7;
                        ArrayList l10 = c00Var2.l(j17);
                        boolean z16 = g11Var.n;
                        int i15 = a11.b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(g11Var.f0 == 0);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z12 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z15) {
                                    i122 = i17;
                                    if (tL_forumTopic.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (g11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) k2.p1.h(1, arrayList2)).y |= 8;
                                        }
                                        f41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        f41Var.M();
                                        z12 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = g11Var.f0;
                                    if (z16) {
                                        c00Var = c00Var2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        c00Var = c00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    c00Var2 = c00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.c00 c00Var3 = c00Var2;
                        if (z12) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !c00Var3.e(j17) && g11Var.w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.l10.v(a22)) {
                                r31 K6 = r31.K(a11.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList2.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        g11.c(g11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        f41 f41Var2 = (f41) obj2;
                        boolean z18 = g11Var.n;
                        int i19 = g11Var.e;
                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i19);
                        long j19 = g11Var.f;
                        long j20 = -j19;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j20));
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(i19).a2(Long.valueOf(j19));
                        org.telegram.messenger.c00 c00Var4 = org.telegram.messenger.hp.s1(i19).q7;
                        ArrayList l11 = c00Var4.l(j20);
                        boolean z19 = g11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = e11.b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(g11Var.f0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z20 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (g11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        f41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        f41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = e11.b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = g11Var.f0;
                                    if (z18) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j19 = j21;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z13) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !c00Var4.e(j20) && g11Var.w) {
                            int i24 = e11.b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(user2)) {
                                int i25 = e11.b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.q = false;
                                arrayList3.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new q01(this), new q01(this), e6Var);
        this.K = w01Var;
        w01Var.E1(new org.telegram.messenger.n10(this) { // from class: org.telegram.ui.Components.p01
            public final /* synthetic */ g11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i122;
                long j12;
                org.telegram.messenger.c00 c00Var;
                long j13;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j14;
                long j15;
                int i13 = i11;
                g11 g11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z15 = g11Var.r;
                        int i14 = g11Var.e;
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i14);
                        long j16 = g11Var.f;
                        long j17 = -j16;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j17));
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(j16));
                        org.telegram.messenger.c00 c00Var2 = org.telegram.messenger.hp.s1(i14).q7;
                        ArrayList l10 = c00Var2.l(j17);
                        boolean z16 = g11Var.n;
                        int i15 = a11.b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(g11Var.f0 == 0);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z12 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z15) {
                                    i122 = i17;
                                    if (tL_forumTopic.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (g11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) k2.p1.h(1, arrayList2)).y |= 8;
                                        }
                                        f41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        f41Var.M();
                                        z12 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = g11Var.f0;
                                    if (z16) {
                                        c00Var = c00Var2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        c00Var = c00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    c00Var2 = c00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.c00 c00Var3 = c00Var2;
                        if (z12) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !c00Var3.e(j17) && g11Var.w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.l10.v(a22)) {
                                r31 K6 = r31.K(a11.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList2.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        g11.c(g11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        f41 f41Var2 = (f41) obj2;
                        boolean z18 = g11Var.n;
                        int i19 = g11Var.e;
                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i19);
                        long j19 = g11Var.f;
                        long j20 = -j19;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j20));
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(i19).a2(Long.valueOf(j19));
                        org.telegram.messenger.c00 c00Var4 = org.telegram.messenger.hp.s1(i19).q7;
                        ArrayList l11 = c00Var4.l(j20);
                        boolean z19 = g11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = e11.b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(g11Var.f0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z20 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (g11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        f41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        f41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = e11.b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = g11Var.f0;
                                    if (z18) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j19 = j21;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z13) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !c00Var4.e(j20) && g11Var.w) {
                            int i24 = e11.b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(user2)) {
                                int i25 = e11.b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.q = false;
                                arrayList3.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        w01Var.g3.r = false;
        w01Var.setClipToPadding(false);
        w01Var.setClipChildren(false);
        viewGroup2.addView(w01Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, v ? 90.0f : 48.0f, 0.0f, 0.0f));
        w01Var.j(new v01(this, i11));
        final int i13 = 2;
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o01
            public final /* synthetic */ g11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        g11 g11Var = this.b;
                        w01 w01Var2 = g11Var.K;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.y;
                        u01Var2.z1(false);
                        g11Var.N.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        g11.b(this.b);
                        break;
                }
            }
        });
        this.H = j12;
        ImageView j13 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o01
            public final /* synthetic */ g11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        g11 g11Var = this.b;
                        w01 w01Var2 = g11Var.K;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.y;
                        u01Var2.z1(false);
                        g11Var.N.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        g11.b(this.b);
                        break;
                }
            }
        });
        this.I = j13;
        frameLayout.addView(j12, b8.mf.e(44, 36, 51));
        viewGroup2.addView(j13, b8.mf.e(64, 48, 51));
        final int i14 = 0;
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o01
            public final /* synthetic */ g11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        g11 g11Var = this.b;
                        w01 w01Var2 = g11Var.K;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.y;
                        u01Var2.z1(false);
                        g11Var.N.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        g11.b(this.b);
                        break;
                }
            }
        });
        this.F = j14;
        ImageView j15 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o01
            public final /* synthetic */ g11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        g11 g11Var = this.b;
                        w01 w01Var2 = g11Var.K;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.y;
                        u01Var2.z1(false);
                        g11Var.N.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        g11.b(this.b);
                        break;
                }
            }
        });
        this.G = j15;
        frameLayout.addView(j14, b8.mf.e(44, 36, 51));
        viewGroup2.addView(j15, b8.mf.e(64, 48, 51));
        org.telegram.messenger.hp.s1(i3).q7.n(3, j11, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).e7;
        if (z10 && org.telegram.messenger.k5.w("topicssidetabs", j10, sharedPreferences, false)) {
            this.V = 1.0f;
            z11 = true;
            this.U = true;
        } else {
            z11 = true;
        }
        boolean z12 = (z10 && org.telegram.messenger.k5.w("topicssidetabsb", j10, sharedPreferences, false)) ? z11 : false;
        this.T = z12;
        j13.setImageResource(z12 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        r(false);
        j12.setImageResource(!this.T ? R.drawable.menu_sidebar_left : R.drawable.menu_sidebar_top);
        g(false);
        h();
        p();
        q();
    }

    public static void a(g11 g11Var, r31 r31Var) {
        if (g11Var.n) {
            org.telegram.messenger.n10 n10Var = g11Var.j0;
            if (n10Var != null) {
                n10Var.a(Long.valueOf(r31Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (r31Var.B == -2) {
            Runnable runnable = g11Var.i0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        org.telegram.messenger.n10 n10Var2 = g11Var.h0;
        if (n10Var2 != null) {
            n10Var2.a(Integer.valueOf(r31Var.d), Boolean.FALSE);
        }
    }

    public static void b(g11 g11Var) {
        boolean z10 = g11Var.U;
        boolean z11 = true;
        if (!z10 && g11Var.T && g11Var.d0 == null && !g11Var.W) {
            if (g11Var.d) {
                return;
            }
            g11Var.d = true;
            g11Var.r(true);
            return;
        }
        if ((r2 = g11Var.d0) != null) {
            z11 = false;
            g11Var.d(z11);
        } else {
            z11 = false;
            g11Var.d(z11);
        }
    }

    public static void c(g11 g11Var, ArrayList arrayList) {
        long j10 = g11Var.f;
        org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(g11Var.e).q7;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            i3 = com.google.android.recaptcha.internal.a.f(((r31) arrayList.get(i3)).d, i3, 1, arrayList2);
        }
        long j11 = -j10;
        c00Var.w(arrayList2, j11);
        c00Var.y(j11, false);
    }

    public static ImageView j(Context context, int i3, View.OnClickListener onClickListener) {
        ImageView e10 = org.telegram.messenger.camera.q.e(context, i3);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        e10.setOnClickListener(onClickListener);
        b8.pf.a(e10);
        return e10;
    }

    private void setAttached(boolean z10) {
        if (this.g0 == z10) {
            return;
        }
        this.g0 = z10;
        int i3 = org.telegram.messenger.hs.r;
        int i10 = org.telegram.messenger.hs.q5;
        long j10 = this.f;
        int i11 = this.e;
        if (!z10) {
            long j11 = -j10;
            LongSparseIntArray longSparseIntArray = org.telegram.messenger.hp.s1(i11).q7.f;
            int i12 = longSparseIntArray.get(j11, 0) - 1;
            longSparseIntArray.put(j11, i12 >= 0 ? i12 : 0);
            org.telegram.messenger.hs.f(i11).n(this, i10);
            org.telegram.messenger.hs.f(i11).n(this, i3);
            return;
        }
        org.telegram.messenger.hs.f(i11).c(this, i10);
        org.telegram.messenger.hs.f(i11).c(this, i3);
        org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(i11).q7;
        long j12 = -j10;
        LongSparseIntArray longSparseIntArray2 = c00Var.f;
        longSparseIntArray2.put(j12, longSparseIntArray2.get(j12, 0) + 1);
        c00Var.y(j12, true);
    }

    @Override // qe.b
    public final void F(float f10, int i3) {
        if (i3 == 1 && f10 == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(R.drawable.menu_sidebar_left);
            this.I.setImageResource(R.drawable.menu_sidebar_bottom);
            org.telegram.messenger.hp.s1(this.e).e7.edit().putBoolean("topicssidetabsb" + this.f, false).apply();
            r(true);
        }
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        p();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
    }

    public final void d(boolean z10) {
        if (this.U == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.W) {
                this.d0 = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.T = !this.T;
        }
        this.U = z10;
        this.W = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new y50(this, 28));
        this.e0.addListener(new s9(21, this, z10));
        this.e0.setInterpolator(ni.l.V);
        this.e0.setDuration(250L);
        this.e0.start();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.q5;
        long j10 = this.f;
        if (i3 == i11) {
            if (((Long) objArr[0]).longValue() != (-j10)) {
                return;
            }
            q();
        } else if (i3 == org.telegram.messenger.hs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.hp.C8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.hp.s1(this.e).q7.y(-j10, false);
                q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.J;
        if (frameLayout.getVisibility() == 0) {
            this.O.setBounds((int) frameLayout.getTranslationX(), (int) this.R, (int) (frameLayout.getTranslationX() + org.telegram.messenger.g0.L(78.0f)), (int) (getMeasuredHeight() - this.Q));
            this.O.draw(canvas);
        }
        FrameLayout frameLayout2 = this.x;
        if (frameLayout2.getVisibility() == 0) {
            this.P.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.P.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + org.telegram.messenger.g0.L(50.0f)));
            this.P.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.J) {
            canvas.clipPath(this.O.R.k);
        }
        if (view == this.x) {
            canvas.clipPath(this.P.R.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i3 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
        int f10 = i0.a.f(1.0f - this.V, w02, w03);
        int f11 = i0.a.f(this.V, w02, w03);
        boolean z10 = this.a0;
        this.a0 = true;
        ImageView imageView = this.H;
        if (imageView != null && (!z10 || f10 != this.b0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.b0 = f10;
        ImageView imageView2 = this.I;
        if (imageView2 != null && (!z10 || f11 != this.c0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        }
        this.c0 = f11;
    }

    public final void f() {
        FrameLayout frameLayout = this.J;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.Q + this.R);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void g(boolean z10) {
        ArrayList l10 = org.telegram.messenger.hp.s1(this.e).q7.l(-this.f);
        this.a.a((l10 == null || l10.isEmpty() || this.k0) ? false : true, z10);
    }

    public c11 getCurrentTabsPosition() {
        return this.U ? c11.b : this.T ? c11.c : c11.a;
    }

    public float getSideMenuT() {
        return this.V * this.a.e;
    }

    public final void h() {
        qe.a aVar = this.N;
        float f10 = aVar.e;
        ImageView imageView = this.F;
        imageView.setAlpha(f10);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView.setVisibility(f10 > 0.0f ? 0 : 8);
        ImageView imageView2 = this.G;
        imageView2.setAlpha(f10);
        imageView2.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView2.setVisibility(f10 > 0.0f ? 0 : 8);
        float f11 = 1.0f - aVar.e;
        ImageView imageView3 = this.H;
        imageView3.setAlpha(f11);
        imageView3.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView3.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView3.setVisibility(f11 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.I;
        imageView4.setAlpha(f11);
        imageView4.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView4.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView4.setVisibility(f11 > 0.0f ? 0 : 8);
    }

    public final void i() {
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.0f, this.V);
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(T1);
        frameLayout.setVisibility((1.0f - this.b.e) * ((1.0f - this.V) * this.a.e) > 0.0f ? 0 : 8);
        if (this.T) {
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f)) - this.Q) + org.telegram.messenger.g0.W1(k(c11.c), org.telegram.messenger.g0.L(43.0f), 0));
        } else {
            frameLayout.setTranslationY(this.R + org.telegram.messenger.g0.W1(k(c11.a), -org.telegram.messenger.g0.L(43.0f), 0));
        }
    }

    public final float k(c11 c11Var) {
        float f10 = (1.0f - this.b.e) * this.a.e;
        if (c11Var == c11.b) {
            return this.V * f10;
        }
        if ((c11Var != c11.a || this.T) && !(c11Var == c11.c && this.T)) {
            return 0.0f;
        }
        return (1.0f - this.V) * f10;
    }

    public final boolean l() {
        if (this.V <= 0.5f) {
            int i3 = 0;
            while (true) {
                u01 u01Var = this.y;
                if (i3 >= u01Var.getChildCount()) {
                    break;
                }
                r31 G = u01Var.g3.G(RecyclerView.R(u01Var.getChildAt(i3)));
                if (G != null && G.r) {
                    return true;
                }
                i3++;
            }
        } else {
            int i10 = 0;
            while (true) {
                w01 w01Var = this.K;
                if (i10 >= w01Var.getChildCount()) {
                    break;
                }
                r31 G2 = w01Var.g3.G(RecyclerView.R(w01Var.getChildAt(i10)));
                if (G2 != null && G2.r) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(this.e).q7;
        long j10 = this.f;
        if (c00Var.e(-j10)) {
            return;
        }
        c00Var.o(-j10);
    }

    public final void n(long j10, boolean z10) {
        if (this.n) {
            org.telegram.messenger.n10 n10Var = this.j0;
            if (n10Var != null) {
                n10Var.a(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.n10 n10Var2 = this.h0;
        if (n10Var2 != null) {
            n10Var2.a(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        org.telegram.messenger.hp hpVar;
        final g11 g11Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i3;
        final g11 g11Var2;
        final f60 f60Var;
        boolean z11;
        final int i10;
        int i11 = this.e;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i11);
        long j10 = this.f;
        TLRPC.Chat M0 = j10 < 0 ? s12.M0(Long.valueOf(-j10)) : null;
        TLRPC.User a22 = j10 > 0 ? s12.a2(Long.valueOf(j10)) : null;
        final org.telegram.ui.wm wmVar = this.s;
        final f60 I = f60.I(wmVar, view);
        int i12 = 1;
        final int i13 = 0;
        if (org.telegram.messenger.t3.p0(M0)) {
            long o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            if (o10 == 0 || !org.telegram.messenger.t3.A(i11, M0, 24)) {
                return false;
            }
            TLRPC.Chat chat = M0;
            f60Var = I;
            f60Var.c(R.drawable.msg_clear, org.telegram.messenger.bd.M0(2131752089, null), new ci.l2(this, f60Var, o10, chat, 17), false);
            long j11 = chat.id;
            if (org.telegram.messenger.t3.p0(chat) && org.telegram.messenger.t3.A(i11, chat, 24)) {
                long j12 = chat.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(j11));
            TLRPC.User a23 = org.telegram.messenger.hp.s1(i11).a2(Long.valueOf(o10));
            if (a23 != null && org.telegram.messenger.t3.w(2, M02)) {
                f60Var.c(R.drawable.msg_remove, org.telegram.messenger.bd.M0(2131753726, null), null, false);
                org.telegram.ui.ActionBar.y0 y9 = f60Var.y();
                y9.setVisibility(8);
                org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i11);
                ci.d3 d3Var = new ci.d3(this, y9, f60Var, j11, a23, M02, 3);
                f60Var = f60Var;
                s13.K0(M02, a23, d3Var);
            }
            g11Var2 = this;
        } else {
            if (org.telegram.messenger.t3.y(15, M0) || org.telegram.messenger.l10.v(a22)) {
                boolean z12 = tL_forumTopic.pinned;
                hpVar = s12;
                g11Var = this;
                tL_forumTopic2 = tL_forumTopic;
                I.c(z12 ? R.drawable.msg_unpin : R.drawable.msg_pin, org.telegram.messenger.bd.M0(z12 ? 2131751453 : 2131751454, null), new v60(this, I, hpVar, tL_forumTopic, 10), false);
                if (tL_forumTopic2.pinned && !z10) {
                    I.c(R.drawable.tabs_reorder, org.telegram.messenger.bd.M0(2131750708, null), new r01(g11Var, i12), false);
                }
                i3 = 15;
            } else {
                i3 = 15;
                tL_forumTopic2 = tL_forumTopic;
                hpVar = s12;
                g11Var = this;
            }
            if (org.telegram.messenger.t3.y(i3, M0) || org.telegram.messenger.l10.v(a22)) {
                I.c(R.drawable.outline_profile_edit_24, org.telegram.messenger.bd.M0(2131751217, null), new Runnable(g11Var) { // from class: org.telegram.ui.Components.t01
                    public final /* synthetic */ g11 b;

                    {
                        this.b = g11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g11 g11Var3;
                        int i14 = i13;
                        g11 g11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        f60 f60Var2 = I;
                        switch (i14) {
                            case 0:
                                f60Var2.u();
                                g11Var4.s.presentFragment(l81.f0(-g11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                g11Var4.getClass();
                                f60Var2.u();
                                org.telegram.messenger.hp.s1(g11Var4.e).q7.z(tL_forumTopic3.id, -g11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                f60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                go goVar = new go(11);
                                g11 g11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var5.getContext());
                                String K0 = org.telegram.messenger.bd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = g11Var5.f0;
                                if (hashSet.size() == 1) {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131751499, org.telegram.messenger.hp.s1(g11Var5.e).q7.f(-g11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci.x3(g11Var3, arrayList, j13, hashSet, goVar));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(14));
                                s1Var.show();
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            final long j13 = tL_forumTopic2.id;
            final int currentAccount = wmVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.e6 resourceProvider = wmVar.getResourceProvider();
            final long j14 = g11Var.f;
            pn pnVar = new pn(I, currentAccount, j14, j13, wmVar, resourceProvider);
            final f60 J = I.J();
            J.c(R.drawable.msg_arrow_back, org.telegram.messenger.bd.M0(2131753756, null), new org.telegram.ui.xp0(I, 27), false);
            J.c(R.drawable.msg_tone_on, org.telegram.messenger.bd.M0(2131745285, null), new Runnable() { // from class: org.telegram.ui.Components.qn
                @Override // java.lang.Runnable
                public final void run() {
                    f60.this.u();
                    SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(currentAccount).d7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j15 = j14;
                    long j16 = j13;
                    sb2.append(org.telegram.messenger.us.v(j15, j16, false));
                    boolean z13 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z14 = !z13;
                    sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.us.v(j15, j16, false), z14).apply();
                    J.u();
                    org.telegram.ui.ActionBar.d2 d2Var = wmVar;
                    if (fc.a(d2Var)) {
                        fc.S(z13 ? 1 : 0, d2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.y0 y10 = J.y();
            J.c(R.drawable.msg_mute_period, org.telegram.messenger.bd.M0(2131748316, null), new bi.q0(I, resourceProvider, currentAccount, pnVar, 22), false);
            J.c(R.drawable.msg_customize, org.telegram.messenger.bd.M0(2131747925, null), new rn(I, j14, j13, wmVar, resourceProvider), false);
            J.c(0, "", new ci.p9(I, currentAccount, j14, j13, wmVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.y0 y11 = J.y();
            new Runnable() { // from class: org.telegram.ui.Components.sn
                @Override // java.lang.Runnable
                public final void run() {
                    int i14;
                    int i15 = currentAccount;
                    org.telegram.messenger.hp s14 = org.telegram.messenger.hp.s1(i15);
                    long j15 = j14;
                    long j16 = j13;
                    boolean r22 = s14.r2(j15, j16, null);
                    org.telegram.ui.ActionBar.y0 y0Var = y11;
                    org.telegram.ui.ActionBar.y0 y0Var2 = y10;
                    if (r22) {
                        y0Var.j(org.telegram.messenger.bd.M0(2131743858, null), R.drawable.msg_unmute, null);
                        i14 = org.telegram.ui.ActionBar.k6.x6;
                        y0Var2.setVisibility(8);
                    } else {
                        y0Var.j(org.telegram.messenger.bd.M0(2131748314, null), R.drawable.msg_mute, null);
                        int i16 = org.telegram.ui.ActionBar.k6.q7;
                        y0Var2.setVisibility(0);
                        if (org.telegram.messenger.hp.s1(i15).s2(j15, j16)) {
                            y0Var2.j(org.telegram.messenger.bd.M0(2131745287, null), R.drawable.msg_tone_off, null);
                        } else {
                            y0Var2.j(org.telegram.messenger.bd.M0(2131745285, null), R.drawable.msg_tone_on, null);
                        }
                        i14 = i16;
                    }
                    xn.c(y0Var, i14);
                }
            }.run();
            long j15 = tL_forumTopic2.id;
            long j16 = g11Var.f;
            org.telegram.messenger.hp hpVar2 = hpVar;
            boolean r22 = hpVar2.r2(j16, j15, null);
            int i14 = r22 ? R.drawable.msg_unmute : R.drawable.msg_mute;
            int i15 = r22 ? 2131743859 : 2131748322;
            TLRPC.Chat chat2 = M0;
            g11Var2 = this;
            f60Var = I;
            f60Var.c(i14, org.telegram.messenger.bd.M0(i15, null), new org.telegram.ui.lq(g11Var2, hpVar2, tL_forumTopic, I, J, 4), false);
            if (!org.telegram.messenger.t3.i(i11, chat2, tL_forumTopic) || org.telegram.messenger.l10.u(a22)) {
                z11 = false;
                i10 = 1;
            } else {
                boolean z13 = tL_forumTopic.closed;
                i10 = 1;
                z11 = false;
                f60Var.c(z13 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, org.telegram.messenger.bd.M0(z13 ? 2131746094 : 2131752039, null), new Runnable(g11Var2) { // from class: org.telegram.ui.Components.t01
                    public final /* synthetic */ g11 b;

                    {
                        this.b = g11Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g11 g11Var3;
                        int i142 = i10;
                        g11 g11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        f60 f60Var2 = f60Var;
                        switch (i142) {
                            case 0:
                                f60Var2.u();
                                g11Var4.s.presentFragment(l81.f0(-g11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                g11Var4.getClass();
                                f60Var2.u();
                                org.telegram.messenger.hp.s1(g11Var4.e).q7.z(tL_forumTopic3.id, -g11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                f60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                go goVar = new go(11);
                                g11 g11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var5.getContext());
                                String K0 = org.telegram.messenger.bd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = g11Var5.f0;
                                if (hashSet.size() == 1) {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131751499, org.telegram.messenger.hp.s1(g11Var5.e).q7.f(-g11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci.x3(g11Var3, arrayList, j132, hashSet, goVar));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(14));
                                s1Var.show();
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (org.telegram.messenger.t3.e(i11, chat2, tL_forumTopic)) {
                final int i16 = 2;
                f60Var.c(R.drawable.msg_delete, org.telegram.messenger.bd.K0(i10, "DeleteTopics"), new Runnable(g11Var2) { // from class: org.telegram.ui.Components.t01
                    public final /* synthetic */ g11 b;

                    {
                        this.b = g11Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g11 g11Var3;
                        int i142 = i16;
                        g11 g11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        f60 f60Var2 = f60Var;
                        switch (i142) {
                            case 0:
                                f60Var2.u();
                                g11Var4.s.presentFragment(l81.f0(-g11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                g11Var4.getClass();
                                f60Var2.u();
                                org.telegram.messenger.hp.s1(g11Var4.e).q7.z(tL_forumTopic3.id, -g11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                f60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                go goVar = new go(11);
                                g11 g11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var5.getContext());
                                String K0 = org.telegram.messenger.bd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = g11Var5.f0;
                                if (hashSet.size() == 1) {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131751499, org.telegram.messenger.hp.s1(g11Var5.e).q7.f(-g11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci.x3(g11Var3, arrayList, j132, hashSet, goVar));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(14));
                                s1Var.show();
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, z11);
            }
        }
        boolean z14 = view instanceof b11;
        org.telegram.ui.ActionBar.e6 e6Var = g11Var2.h;
        if (z14) {
            x01 x01Var = new x01();
            Paint paint = new Paint(1);
            x01Var.a = paint;
            x01Var.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, e6Var));
            f60Var.W(x01Var);
            f60Var.a0(org.telegram.messenger.g0.L(16.0f), 0.0f);
        } else if (z10) {
            f60Var.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var)));
            f60Var.V(5);
        } else {
            int L = org.telegram.messenger.g0.L(5.0f);
            int L2 = org.telegram.messenger.g0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var);
            float f10 = 0;
            float f11 = L;
            float f12 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f10, f10}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            f60Var.W(shapeDrawable);
        }
        f60Var.Z();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        i();
    }

    public final void p() {
        org.telegram.ui.yd ydVar = this.S;
        if (ydVar != null) {
            ydVar.run();
        }
        i();
        float k10 = k(c11.b);
        float W1 = org.telegram.messenger.g0.W1(k10, -org.telegram.messenger.g0.L(78.0f), 0);
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(W1);
        frameLayout.setVisibility(k10 <= 0.0f ? 8 : 0);
        e();
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, mode);
        org.telegram.ui.ActionBar.r6.t(this.G, i3, e6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        u01 u01Var = this.y;
        boolean canScrollHorizontally = u01Var.canScrollHorizontally(-1);
        u01Var.g3.O(true);
        if (!canScrollHorizontally) {
            u01Var.v0(0);
        }
        w01 w01Var = this.K;
        boolean canScrollVertically = w01Var.canScrollVertically(-1);
        w01Var.g3.O(true);
        if (!canScrollVertically) {
            w01Var.v0(0);
        }
        org.telegram.messenger.g0.h3(new r01(this, 0));
    }

    public final void r(boolean z10) {
        this.b.a(!this.c || this.d, z10);
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.k0 != z10) {
            this.k0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        this.f0 = j10;
        u01 u01Var = this.y;
        u01Var.g3.O(true);
        u01Var.invalidate();
        this.K.g3.O(true);
        f11 f11Var = this.E;
        if (f11Var != null) {
            f11Var.c(true, false, j10 == 0);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.n10 n10Var) {
        this.j0 = n10Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.n10 n10Var) {
        this.h0 = n10Var;
    }

    public void setSideMenuBackgroundDrawable(gh.g gVar) {
        this.O = gVar;
        gVar.r(org.telegram.messenger.g0.L(16.0f));
        this.O.q(org.telegram.messenger.g0.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f10) {
        this.Q = f10;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f10) {
        this.R = f10;
        this.J.setTranslationY(f10);
        i();
        f();
        invalidate();
    }

    public void setTabsEnabled(boolean z10) {
        if (this.c == z10) {
            return;
        }
        this.c = z10;
        if (!z10) {
            d(false);
        }
        r(true);
    }

    public void setTopMenuBackgroundDrawable(gh.g gVar) {
        this.P = gVar;
        gVar.r(org.telegram.messenger.g0.L(18.0f));
        this.P.q(org.telegram.messenger.g0.L(7.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            e();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
