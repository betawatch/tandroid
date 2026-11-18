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
import org.telegram.ui.w81;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z11 extends FrameLayout implements org.telegram.messenger.fs, te.b, org.telegram.ui.ActionBar.c6 {
    public static final /* synthetic */ int m0 = 0;
    public final y11 E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final o11 K;
    public long L;
    public long M;
    public final te.a N;
    public fh.g O;
    public fh.g P;
    public float Q;
    public float R;
    public org.telegram.ui.zd S;
    public boolean T;
    public boolean U;
    public float V;
    public boolean W;
    public final te.a a;
    public boolean a0;
    public final te.a b;
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
    public final org.telegram.ui.ActionBar.i6 h;
    public org.telegram.messenger.q10 h0;
    public Runnable i0;
    public org.telegram.messenger.q10 j0;
    public boolean k0;
    public final HashSet l0;
    public final boolean n;
    public final boolean r;
    public final org.telegram.ui.bn s;
    public final boolean w;
    public final FrameLayout x;
    public final m11 y;

    /* JADX WARN: Type inference failed for: r3v8, types: [org.telegram.ui.Components.h11] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.h11] */
    public z11(Activity activity, org.telegram.ui.bn bnVar, int i7, long j3, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        ViewGroup viewGroup;
        boolean z11;
        lr lrVar = lr.h;
        this.a = new te.a(0, this, lrVar, 380L, true);
        this.b = new te.a(1, this, lrVar, 380L, false);
        this.N = new te.a(0, new i11(this), lrVar, 320L, false);
        this.V = 0.0f;
        this.l0 = new HashSet();
        this.s = bnVar;
        this.c = z10;
        this.e = i7;
        this.f = j3;
        this.h = i6Var;
        long j10 = -j3;
        this.n = org.telegram.messenger.v3.p0(org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j10)));
        boolean w10 = org.telegram.messenger.o10.w(org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3)));
        this.r = w10;
        final int i10 = 0;
        final int i11 = 1;
        this.w = !org.telegram.messenger.f3.w("topics_end_reached_", j10, org.telegram.messenger.j10.i(i7).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        addView(frameLayout, c8.ma.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.J = frameLayout2;
        addView(frameLayout2, c8.ma.d(64, -1.0f, org.telegram.messenger.ks.A1, 7.0f, 7.0f, 7.0f, 7.0f));
        m11 m11Var = new m11(this, activity, i7, new org.telegram.messenger.q10(this) { // from class: org.telegram.ui.Components.h11
            public final /* synthetic */ z11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i12;
                long j11;
                org.telegram.messenger.e00 e00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i10;
                z11 z11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z15 = z11Var.r;
                        int i14 = z11Var.e;
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i14);
                        long j15 = z11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.e00 e00Var2 = org.telegram.messenger.mp.u1(i14).t7;
                        ArrayList l10 = e00Var2.l(j16);
                        boolean z16 = z11Var.n;
                        int i15 = t11.b;
                        l41 K = l41.K(t11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z16;
                        K.L(z11Var.f0 == 0);
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
                                if (z11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((l41) i5.c.h(1, arrayList2)).z |= 8;
                                        }
                                        z41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        z41Var.M();
                                        z12 = true;
                                    }
                                    l41 K2 = l41.K(t11.class);
                                    K2.y = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z16) {
                                        j11 = j15;
                                        K2.C = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = z11Var.f0;
                                    if (z16) {
                                        e00Var = e00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        e00Var = e00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    e00Var2 = e00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.e00 e00Var3 = e00Var2;
                        if (z12) {
                            z41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !e00Var3.e(j16) && z11Var.w) {
                            l41 K3 = l41.K(t11.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList2.add(K3);
                            l41 K4 = l41.K(t11.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList2.add(K4);
                            l41 K5 = l41.K(t11.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.o10.w(c22)) {
                                l41 K6 = l41.K(t11.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList2.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        z11.c(z11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z18 = z11Var.n;
                        int i19 = z11Var.e;
                        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i19);
                        long j18 = z11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.e00 e00Var4 = org.telegram.messenger.mp.u1(i19).t7;
                        ArrayList l11 = e00Var4.l(j19);
                        boolean z19 = z11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = x11.b;
                            l41 K7 = l41.K(x11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z18;
                            K7.z = z19 ? 1 : 0;
                            K7.L(z11Var.f0 == 0);
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
                                TLRPC.User user = c23;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        c23 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (z11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        z41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        z41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = x11.b;
                                    l41 K8 = l41.K(x11.class);
                                    K8.y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z18) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = z11Var.f0;
                                    if (z18) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.id;
                                    }
                                    K8.L(j13 == j14);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    c23 = user;
                                    j18 = j20;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = c23;
                        if (z13) {
                            z41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !e00Var4.e(j19) && z11Var.w) {
                            int i24 = x11.b;
                            l41 K9 = l41.K(x11.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            l41 K10 = l41.K(x11.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            l41 K11 = l41.K(x11.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.o10.w(user2)) {
                                int i25 = x11.b;
                                l41 K12 = l41.K(x11.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList3.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new i11(this), new i11(this), i6Var);
        this.y = m11Var;
        m11Var.E1(new org.telegram.messenger.q10(this) { // from class: org.telegram.ui.Components.h11
            public final /* synthetic */ z11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i12;
                long j11;
                org.telegram.messenger.e00 e00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i11;
                z11 z11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z15 = z11Var.r;
                        int i14 = z11Var.e;
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i14);
                        long j15 = z11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.e00 e00Var2 = org.telegram.messenger.mp.u1(i14).t7;
                        ArrayList l10 = e00Var2.l(j16);
                        boolean z16 = z11Var.n;
                        int i15 = t11.b;
                        l41 K = l41.K(t11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z16;
                        K.L(z11Var.f0 == 0);
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
                                if (z11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((l41) i5.c.h(1, arrayList2)).z |= 8;
                                        }
                                        z41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        z41Var.M();
                                        z12 = true;
                                    }
                                    l41 K2 = l41.K(t11.class);
                                    K2.y = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z16) {
                                        j11 = j15;
                                        K2.C = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = z11Var.f0;
                                    if (z16) {
                                        e00Var = e00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        e00Var = e00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    e00Var2 = e00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.e00 e00Var3 = e00Var2;
                        if (z12) {
                            z41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !e00Var3.e(j16) && z11Var.w) {
                            l41 K3 = l41.K(t11.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList2.add(K3);
                            l41 K4 = l41.K(t11.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList2.add(K4);
                            l41 K5 = l41.K(t11.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.o10.w(c22)) {
                                l41 K6 = l41.K(t11.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList2.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        z11.c(z11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z18 = z11Var.n;
                        int i19 = z11Var.e;
                        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i19);
                        long j18 = z11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.e00 e00Var4 = org.telegram.messenger.mp.u1(i19).t7;
                        ArrayList l11 = e00Var4.l(j19);
                        boolean z19 = z11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = x11.b;
                            l41 K7 = l41.K(x11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z18;
                            K7.z = z19 ? 1 : 0;
                            K7.L(z11Var.f0 == 0);
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
                                TLRPC.User user = c23;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        c23 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (z11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        z41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        z41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = x11.b;
                                    l41 K8 = l41.K(x11.class);
                                    K8.y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z18) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = z11Var.f0;
                                    if (z18) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.id;
                                    }
                                    K8.L(j13 == j14);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    c23 = user;
                                    j18 = j20;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = c23;
                        if (z13) {
                            z41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !e00Var4.e(j19) && z11Var.w) {
                            int i24 = x11.b;
                            l41 K9 = l41.K(x11.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            l41 K10 = l41.K(x11.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            l41 K11 = l41.K(x11.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.o10.w(user2)) {
                                int i25 = x11.b;
                                l41 K12 = l41.K(x11.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList3.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        m11Var.setWillNotDraw(false);
        m11Var.g3.r = false;
        m11Var.getContext();
        jg.i0 i0Var = new jg.i0((ViewGroup) m11Var, 7);
        m11Var.f3 = i0Var;
        m11Var.setLayoutManager(i0Var);
        frameLayout.addView(m11Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 41.0f, 0.0f, 0.0f, 0.0f));
        m11Var.j(new n11(this, 0));
        if (w10) {
            y11 y11Var = new y11(i7, activity, i6Var);
            this.E = y11Var;
            y11Var.c(true, false, this.f0 == 0);
            y11Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g11
                public final /* synthetic */ z11 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            z11 z11Var = this.b;
                            o11 o11Var = z11Var.K;
                            o11Var.z1(false);
                            m11 m11Var2 = z11Var.y;
                            m11Var2.z1(false);
                            z11Var.N.a(false, true);
                            org.telegram.messenger.g0.Z3(o11Var);
                            org.telegram.messenger.g0.Z3(m11Var2);
                            break;
                        case 1:
                            this.b.h0.a(0, Boolean.FALSE);
                            break;
                        default:
                            z11.b(this.b);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(y11Var, c8.ma.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.E = null;
        }
        final int i12 = 2;
        ViewGroup viewGroup2 = viewGroup;
        o11 o11Var = new o11(activity, i7, new org.telegram.messenger.q10(this) { // from class: org.telegram.ui.Components.h11
            public final /* synthetic */ z11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i122;
                long j11;
                org.telegram.messenger.e00 e00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i12;
                z11 z11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z15 = z11Var.r;
                        int i14 = z11Var.e;
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i14);
                        long j15 = z11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.e00 e00Var2 = org.telegram.messenger.mp.u1(i14).t7;
                        ArrayList l10 = e00Var2.l(j16);
                        boolean z16 = z11Var.n;
                        int i15 = t11.b;
                        l41 K = l41.K(t11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z16;
                        K.L(z11Var.f0 == 0);
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
                                if (z11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((l41) i5.c.h(1, arrayList2)).z |= 8;
                                        }
                                        z41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        z41Var.M();
                                        z12 = true;
                                    }
                                    l41 K2 = l41.K(t11.class);
                                    K2.y = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z16) {
                                        j11 = j15;
                                        K2.C = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = z11Var.f0;
                                    if (z16) {
                                        e00Var = e00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        e00Var = e00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    e00Var2 = e00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.e00 e00Var3 = e00Var2;
                        if (z12) {
                            z41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !e00Var3.e(j16) && z11Var.w) {
                            l41 K3 = l41.K(t11.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList2.add(K3);
                            l41 K4 = l41.K(t11.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList2.add(K4);
                            l41 K5 = l41.K(t11.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.o10.w(c22)) {
                                l41 K6 = l41.K(t11.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList2.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        z11.c(z11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z18 = z11Var.n;
                        int i19 = z11Var.e;
                        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i19);
                        long j18 = z11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.e00 e00Var4 = org.telegram.messenger.mp.u1(i19).t7;
                        ArrayList l11 = e00Var4.l(j19);
                        boolean z19 = z11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = x11.b;
                            l41 K7 = l41.K(x11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z18;
                            K7.z = z19 ? 1 : 0;
                            K7.L(z11Var.f0 == 0);
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
                                TLRPC.User user = c23;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        c23 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (z11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        z41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        z41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = x11.b;
                                    l41 K8 = l41.K(x11.class);
                                    K8.y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z18) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = z11Var.f0;
                                    if (z18) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.id;
                                    }
                                    K8.L(j13 == j14);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    c23 = user;
                                    j18 = j20;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = c23;
                        if (z13) {
                            z41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !e00Var4.e(j19) && z11Var.w) {
                            int i24 = x11.b;
                            l41 K9 = l41.K(x11.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            l41 K10 = l41.K(x11.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            l41 K11 = l41.K(x11.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.o10.w(user2)) {
                                int i25 = x11.b;
                                l41 K12 = l41.K(x11.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList3.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new i11(this), new i11(this), i6Var);
        this.K = o11Var;
        o11Var.E1(new org.telegram.messenger.q10(this) { // from class: org.telegram.ui.Components.h11
            public final /* synthetic */ z11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i122;
                long j11;
                org.telegram.messenger.e00 e00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i11;
                z11 z11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z15 = z11Var.r;
                        int i14 = z11Var.e;
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i14);
                        long j15 = z11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.e00 e00Var2 = org.telegram.messenger.mp.u1(i14).t7;
                        ArrayList l10 = e00Var2.l(j16);
                        boolean z16 = z11Var.n;
                        int i15 = t11.b;
                        l41 K = l41.K(t11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z16;
                        K.L(z11Var.f0 == 0);
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
                                if (z11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((l41) i5.c.h(1, arrayList2)).z |= 8;
                                        }
                                        z41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        z41Var.M();
                                        z12 = true;
                                    }
                                    l41 K2 = l41.K(t11.class);
                                    K2.y = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z16) {
                                        j11 = j15;
                                        K2.C = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = z11Var.f0;
                                    if (z16) {
                                        e00Var = e00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        e00Var = e00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    e00Var2 = e00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.e00 e00Var3 = e00Var2;
                        if (z12) {
                            z41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !e00Var3.e(j16) && z11Var.w) {
                            l41 K3 = l41.K(t11.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList2.add(K3);
                            l41 K4 = l41.K(t11.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList2.add(K4);
                            l41 K5 = l41.K(t11.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.o10.w(c22)) {
                                l41 K6 = l41.K(t11.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList2.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        z11.c(z11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z18 = z11Var.n;
                        int i19 = z11Var.e;
                        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i19);
                        long j18 = z11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.e00 e00Var4 = org.telegram.messenger.mp.u1(i19).t7;
                        ArrayList l11 = e00Var4.l(j19);
                        boolean z19 = z11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = x11.b;
                            l41 K7 = l41.K(x11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z18;
                            K7.z = z19 ? 1 : 0;
                            K7.L(z11Var.f0 == 0);
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
                                TLRPC.User user = c23;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        c23 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (z11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        z41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        z41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = x11.b;
                                    l41 K8 = l41.K(x11.class);
                                    K8.y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z18) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = z11Var.f0;
                                    if (z18) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.id;
                                    }
                                    K8.L(j13 == j14);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    c23 = user;
                                    j18 = j20;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = c23;
                        if (z13) {
                            z41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !e00Var4.e(j19) && z11Var.w) {
                            int i24 = x11.b;
                            l41 K9 = l41.K(x11.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            l41 K10 = l41.K(x11.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            l41 K11 = l41.K(x11.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.o10.w(user2)) {
                                int i25 = x11.b;
                                l41 K12 = l41.K(x11.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList3.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        o11Var.g3.r = false;
        o11Var.setClipToPadding(false);
        o11Var.setClipChildren(false);
        viewGroup2.addView(o11Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, w10 ? 90.0f : 48.0f, 0.0f, 0.0f));
        o11Var.j(new n11(this, i11));
        final int i13 = 2;
        ImageView j11 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g11
            public final /* synthetic */ z11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        z11 z11Var = this.b;
                        o11 o11Var2 = z11Var.K;
                        o11Var2.z1(false);
                        m11 m11Var2 = z11Var.y;
                        m11Var2.z1(false);
                        z11Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(o11Var2);
                        org.telegram.messenger.g0.Z3(m11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        z11.b(this.b);
                        break;
                }
            }
        });
        this.H = j11;
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g11
            public final /* synthetic */ z11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        z11 z11Var = this.b;
                        o11 o11Var2 = z11Var.K;
                        o11Var2.z1(false);
                        m11 m11Var2 = z11Var.y;
                        m11Var2.z1(false);
                        z11Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(o11Var2);
                        org.telegram.messenger.g0.Z3(m11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        z11.b(this.b);
                        break;
                }
            }
        });
        this.I = j12;
        frameLayout.addView(j11, c8.ma.e(44, 36, 51));
        viewGroup2.addView(j12, c8.ma.e(64, 48, 51));
        final int i14 = 0;
        ImageView j13 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g11
            public final /* synthetic */ z11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        z11 z11Var = this.b;
                        o11 o11Var2 = z11Var.K;
                        o11Var2.z1(false);
                        m11 m11Var2 = z11Var.y;
                        m11Var2.z1(false);
                        z11Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(o11Var2);
                        org.telegram.messenger.g0.Z3(m11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        z11.b(this.b);
                        break;
                }
            }
        });
        this.F = j13;
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g11
            public final /* synthetic */ z11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        z11 z11Var = this.b;
                        o11 o11Var2 = z11Var.K;
                        o11Var2.z1(false);
                        m11 m11Var2 = z11Var.y;
                        m11Var2.z1(false);
                        z11Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(o11Var2);
                        org.telegram.messenger.g0.Z3(m11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        z11.b(this.b);
                        break;
                }
            }
        });
        this.G = j14;
        frameLayout.addView(j13, c8.ma.e(44, 36, 51));
        viewGroup2.addView(j14, c8.ma.e(64, 48, 51));
        org.telegram.messenger.mp.u1(i7).t7.n(3, j10, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).h7;
        if (z10 && org.telegram.messenger.f3.w("topicssidetabs", j3, sharedPreferences, false)) {
            this.V = 1.0f;
            z11 = true;
            this.U = true;
        } else {
            z11 = true;
        }
        boolean z12 = (z10 && org.telegram.messenger.f3.w("topicssidetabsb", j3, sharedPreferences, false)) ? z11 : false;
        this.T = z12;
        j12.setImageResource(z12 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        r(false);
        j11.setImageResource(!this.T ? R.drawable.menu_sidebar_left : R.drawable.menu_sidebar_top);
        g(false);
        h();
        p();
        q();
    }

    public static void a(z11 z11Var, l41 l41Var) {
        if (z11Var.n) {
            org.telegram.messenger.q10 q10Var = z11Var.j0;
            if (q10Var != null) {
                q10Var.a(Long.valueOf(l41Var.C), Boolean.FALSE);
                return;
            }
            return;
        }
        if (l41Var.C == -2) {
            Runnable runnable = z11Var.i0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        org.telegram.messenger.q10 q10Var2 = z11Var.h0;
        if (q10Var2 != null) {
            q10Var2.a(Integer.valueOf(l41Var.d), Boolean.FALSE);
        }
    }

    public static void b(z11 z11Var) {
        boolean z10 = z11Var.U;
        boolean z11 = true;
        if (!z10 && z11Var.T && z11Var.d0 == null && !z11Var.W) {
            if (z11Var.d) {
                return;
            }
            z11Var.d = true;
            z11Var.r(true);
            return;
        }
        if ((r2 = z11Var.d0) != null) {
            z11 = false;
            z11Var.d(z11);
        } else {
            z11 = false;
            z11Var.d(z11);
        }
    }

    public static void c(z11 z11Var, ArrayList arrayList) {
        long j3 = z11Var.f;
        org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(z11Var.e).t7;
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (i7 < arrayList.size()) {
            i7 = com.google.android.gms.internal.vision.e2.f(((l41) arrayList.get(i7)).d, i7, 1, arrayList2);
        }
        long j10 = -j3;
        e00Var.w(arrayList2, j10);
        e00Var.y(j10, false);
    }

    public static ImageView j(Context context, int i7, View.OnClickListener onClickListener) {
        ImageView e10 = org.telegram.messenger.n10.e(context, i7);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        e10.setOnClickListener(onClickListener);
        c8.ra.a(e10);
        return e10;
    }

    private void setAttached(boolean z10) {
        if (this.g0 == z10) {
            return;
        }
        this.g0 = z10;
        int i7 = org.telegram.messenger.ks.r;
        int i10 = org.telegram.messenger.ks.t5;
        long j3 = this.f;
        int i11 = this.e;
        if (!z10) {
            long j10 = -j3;
            LongSparseIntArray longSparseIntArray = org.telegram.messenger.mp.u1(i11).t7.r;
            int i12 = longSparseIntArray.get(j10, 0) - 1;
            longSparseIntArray.put(j10, i12 >= 0 ? i12 : 0);
            org.telegram.messenger.ks.f(i11).n(this, i10);
            org.telegram.messenger.ks.f(i11).n(this, i7);
            return;
        }
        org.telegram.messenger.ks.f(i11).c(this, i10);
        org.telegram.messenger.ks.f(i11).c(this, i7);
        org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(i11).t7;
        long j11 = -j3;
        LongSparseIntArray longSparseIntArray2 = e00Var.r;
        longSparseIntArray2.put(j11, longSparseIntArray2.get(j11, 0) + 1);
        e00Var.y(j11, true);
    }

    @Override // te.b
    public final void D(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(R.drawable.menu_sidebar_left);
            this.I.setImageResource(R.drawable.menu_sidebar_bottom);
            org.telegram.messenger.mp.u1(this.e).h7.edit().putBoolean("topicssidetabsb" + this.f, false).apply();
            r(true);
        }
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        p();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
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
        ofFloat.addUpdateListener(new e60(this, 28));
        this.e0.addListener(new org.telegram.ui.on(22, this, z10));
        this.e0.setInterpolator(pi.k.V);
        this.e0.setDuration(250L);
        this.e0.start();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.t5;
        long j3 = this.f;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() != (-j3)) {
                return;
            }
            q();
        } else if (i7 == org.telegram.messenger.ks.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.mp.I8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.mp.u1(this.e).t7.y(-j3, false);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        canvas.save();
        if (view == this.J) {
            canvas.clipPath(this.O.R.k);
        }
        if (view == this.x) {
            canvas.clipPath(this.P.R.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i7 = org.telegram.ui.ActionBar.n6.z6;
        org.telegram.ui.ActionBar.i6 i6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
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
        ArrayList l10 = org.telegram.messenger.mp.u1(this.e).t7.l(-this.f);
        this.a.a((l10 == null || l10.isEmpty() || this.k0) ? false : true, z10);
    }

    public v11 getCurrentTabsPosition() {
        return this.U ? v11.b : this.T ? v11.c : v11.a;
    }

    public float getSideMenuT() {
        return this.V * this.a.e;
    }

    public final void h() {
        te.a aVar = this.N;
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
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f)) - this.Q) + org.telegram.messenger.g0.W1(k(v11.c), org.telegram.messenger.g0.L(43.0f), 0));
        } else {
            frameLayout.setTranslationY(this.R + org.telegram.messenger.g0.W1(k(v11.a), -org.telegram.messenger.g0.L(43.0f), 0));
        }
    }

    public final float k(v11 v11Var) {
        float f10 = (1.0f - this.b.e) * this.a.e;
        if (v11Var == v11.b) {
            return this.V * f10;
        }
        if ((v11Var != v11.a || this.T) && !(v11Var == v11.c && this.T)) {
            return 0.0f;
        }
        return (1.0f - this.V) * f10;
    }

    public final boolean l() {
        if (this.V <= 0.5f) {
            int i7 = 0;
            while (true) {
                m11 m11Var = this.y;
                if (i7 >= m11Var.getChildCount()) {
                    break;
                }
                l41 G = m11Var.g3.G(RecyclerView.R(m11Var.getChildAt(i7)));
                if (G != null && G.s) {
                    return true;
                }
                i7++;
            }
        } else {
            int i10 = 0;
            while (true) {
                o11 o11Var = this.K;
                if (i10 >= o11Var.getChildCount()) {
                    break;
                }
                l41 G2 = o11Var.g3.G(RecyclerView.R(o11Var.getChildAt(i10)));
                if (G2 != null && G2.s) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(this.e).t7;
        long j3 = this.f;
        if (e00Var.e(-j3)) {
            return;
        }
        e00Var.o(-j3);
    }

    public final void n(long j3, boolean z10) {
        if (this.n) {
            org.telegram.messenger.q10 q10Var = this.j0;
            if (q10Var != null) {
                q10Var.a(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.q10 q10Var2 = this.h0;
        if (q10Var2 != null) {
            q10Var2.a(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        org.telegram.messenger.mp mpVar;
        final z11 z11Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i7;
        final z11 z11Var2;
        final y60 y60Var;
        boolean z11;
        final int i10;
        int i11 = this.e;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i11);
        long j3 = this.f;
        TLRPC.Chat O0 = j3 < 0 ? u12.O0(Long.valueOf(-j3)) : null;
        TLRPC.User c22 = j3 > 0 ? u12.c2(Long.valueOf(j3)) : null;
        final org.telegram.ui.bn bnVar = this.s;
        final y60 J = y60.J(bnVar, view);
        int i12 = 1;
        final int i13 = 0;
        if (org.telegram.messenger.v3.p0(O0)) {
            long o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
            if (o4 == 0 || !org.telegram.messenger.v3.A(i11, O0, 24)) {
                return false;
            }
            TLRPC.Chat chat = O0;
            y60Var = J;
            y60Var.c(R.drawable.msg_clear, org.telegram.messenger.gd.M0(2131752078, null), new di.i2(this, y60Var, o4, chat, 16), false);
            long j10 = chat.id;
            if (org.telegram.messenger.v3.p0(chat) && org.telegram.messenger.v3.A(i11, chat, 24)) {
                long j11 = chat.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(j10));
            TLRPC.User c23 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(o4));
            if (c23 != null && org.telegram.messenger.v3.w(2, O02)) {
                y60Var.c(R.drawable.msg_remove, org.telegram.messenger.gd.M0(2131753724, null), null, false);
                org.telegram.ui.ActionBar.z0 z12 = y60Var.z();
                z12.setVisibility(8);
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i11);
                di.o2 o2Var = new di.o2(this, z12, y60Var, j10, c23, O02);
                y60Var = y60Var;
                u13.M0(O02, c23, o2Var);
            }
            z11Var2 = this;
        } else {
            if (org.telegram.messenger.v3.y(15, O0) || org.telegram.messenger.o10.w(c22)) {
                boolean z13 = tL_forumTopic.pinned;
                mpVar = u12;
                z11Var = this;
                tL_forumTopic2 = tL_forumTopic;
                J.c(z13 ? R.drawable.msg_unpin : R.drawable.msg_pin, org.telegram.messenger.gd.M0(z13 ? 2131751441 : 2131751442, null), new n20(this, J, mpVar, tL_forumTopic, 11), false);
                if (tL_forumTopic2.pinned && !z10) {
                    J.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.M0(2131750694, null), new j11(z11Var, i12), false);
                }
                i7 = 15;
            } else {
                i7 = 15;
                tL_forumTopic2 = tL_forumTopic;
                mpVar = u12;
                z11Var = this;
            }
            if (org.telegram.messenger.v3.y(i7, O0) || org.telegram.messenger.o10.w(c22)) {
                J.c(R.drawable.outline_profile_edit_24, org.telegram.messenger.gd.M0(2131751205, null), new Runnable(z11Var) { // from class: org.telegram.ui.Components.l11
                    public final /* synthetic */ z11 b;

                    {
                        this.b = z11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        z11 z11Var3;
                        int i14 = i13;
                        z11 z11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        y60 y60Var2 = J;
                        switch (i14) {
                            case 0:
                                y60Var2.v();
                                z11Var4.s.presentFragment(w81.f0(-z11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                z11Var4.getClass();
                                y60Var2.v();
                                org.telegram.messenger.mp.u1(z11Var4.e).t7.z(tL_forumTopic3.id, -z11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                y60Var2.v();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                me meVar = new me(15);
                                z11 z11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z11Var5.getContext());
                                String K0 = org.telegram.messenger.gd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = z11Var5.f0;
                                if (hashSet.size() == 1) {
                                    z11Var3 = z11Var5;
                                    u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131751487, org.telegram.messenger.mp.u1(z11Var5.e).t7.f(-z11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z11Var3 = z11Var5;
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751486, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new di.t1(z11Var3, arrayList, j12, hashSet, meVar));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(20));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            final long j12 = tL_forumTopic2.id;
            final int currentAccount = bnVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.i6 resourceProvider = bnVar.getResourceProvider();
            final long j13 = z11Var.f;
            bi.h4 h4Var = new bi.h4(J, currentAccount, j13, j12, bnVar, resourceProvider);
            final y60 K = J.K();
            K.c(R.drawable.msg_arrow_back, org.telegram.messenger.gd.M0(2131753754, null), new org.telegram.ui.hq0(J, 27), false);
            K.c(R.drawable.msg_tone_on, org.telegram.messenger.gd.M0(2131745080, null), new Runnable() { // from class: org.telegram.ui.Components.ho
                @Override // java.lang.Runnable
                public final void run() {
                    y60.this.v();
                    SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(currentAccount).g7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j14 = j13;
                    long j15 = j12;
                    sb2.append(org.telegram.messenger.xs.v(j14, j15, false));
                    boolean z14 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z15 = !z14;
                    sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(j14, j15, false), z15).apply();
                    K.v();
                    org.telegram.ui.ActionBar.h2 h2Var = bnVar;
                    if (lc.a(h2Var)) {
                        lc.S(z14 ? 1 : 0, h2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.z0 z14 = K.z();
            K.c(R.drawable.msg_mute_period, org.telegram.messenger.gd.M0(2131748116, null), new bi.t4(J, resourceProvider, currentAccount, h4Var, 22), false);
            K.c(R.drawable.msg_customize, org.telegram.messenger.gd.M0(2131747724, null), new io(J, j13, j12, bnVar, resourceProvider), false);
            K.c(0, "", new di.i9(J, currentAccount, j13, j12, bnVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.z0 z15 = K.z();
            new Runnable() { // from class: org.telegram.ui.Components.jo
                @Override // java.lang.Runnable
                public final void run() {
                    int i14;
                    int i15 = currentAccount;
                    org.telegram.messenger.mp u14 = org.telegram.messenger.mp.u1(i15);
                    long j14 = j13;
                    long j15 = j12;
                    boolean u22 = u14.u2(j14, j15, null);
                    org.telegram.ui.ActionBar.z0 z0Var = z15;
                    org.telegram.ui.ActionBar.z0 z0Var2 = z14;
                    if (u22) {
                        z0Var.j(org.telegram.messenger.gd.M0(2131743611, null), R.drawable.msg_unmute, null);
                        i14 = org.telegram.ui.ActionBar.n6.x6;
                        z0Var2.setVisibility(8);
                    } else {
                        z0Var.j(org.telegram.messenger.gd.M0(2131748114, null), R.drawable.msg_mute, null);
                        int i16 = org.telegram.ui.ActionBar.n6.q7;
                        z0Var2.setVisibility(0);
                        if (org.telegram.messenger.mp.u1(i15).v2(j14, j15)) {
                            z0Var2.j(org.telegram.messenger.gd.M0(2131745082, null), R.drawable.msg_tone_off, null);
                        } else {
                            z0Var2.j(org.telegram.messenger.gd.M0(2131745080, null), R.drawable.msg_tone_on, null);
                        }
                        i14 = i16;
                    }
                    po.c(z0Var, i14);
                }
            }.run();
            long j14 = tL_forumTopic2.id;
            long j15 = z11Var.f;
            org.telegram.messenger.mp mpVar2 = mpVar;
            boolean u22 = mpVar2.u2(j15, j14, null);
            int i14 = u22 ? R.drawable.msg_unmute : R.drawable.msg_mute;
            int i15 = u22 ? 2131743612 : 2131748122;
            TLRPC.Chat chat2 = O0;
            z11Var2 = this;
            y60Var = J;
            y60Var.c(i14, org.telegram.messenger.gd.M0(i15, null), new org.telegram.ui.wn(z11Var2, mpVar2, tL_forumTopic, J, K, 7), false);
            if (!org.telegram.messenger.v3.i(i11, chat2, tL_forumTopic) || org.telegram.messenger.o10.v(c22)) {
                z11 = false;
                i10 = 1;
            } else {
                boolean z16 = tL_forumTopic.closed;
                i10 = 1;
                z11 = false;
                y60Var.c(z16 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, org.telegram.messenger.gd.M0(z16 ? 2131745889 : 2131752028, null), new Runnable(z11Var2) { // from class: org.telegram.ui.Components.l11
                    public final /* synthetic */ z11 b;

                    {
                        this.b = z11Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        z11 z11Var3;
                        int i142 = i10;
                        z11 z11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        y60 y60Var2 = y60Var;
                        switch (i142) {
                            case 0:
                                y60Var2.v();
                                z11Var4.s.presentFragment(w81.f0(-z11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                z11Var4.getClass();
                                y60Var2.v();
                                org.telegram.messenger.mp.u1(z11Var4.e).t7.z(tL_forumTopic3.id, -z11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                y60Var2.v();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                me meVar = new me(15);
                                z11 z11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z11Var5.getContext());
                                String K0 = org.telegram.messenger.gd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = z11Var5.f0;
                                if (hashSet.size() == 1) {
                                    z11Var3 = z11Var5;
                                    u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131751487, org.telegram.messenger.mp.u1(z11Var5.e).t7.f(-z11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z11Var3 = z11Var5;
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751486, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new di.t1(z11Var3, arrayList, j122, hashSet, meVar));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(20));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (org.telegram.messenger.v3.e(i11, chat2, tL_forumTopic)) {
                final int i16 = 2;
                y60Var.c(R.drawable.msg_delete, org.telegram.messenger.gd.K0(i10, "DeleteTopics"), new Runnable(z11Var2) { // from class: org.telegram.ui.Components.l11
                    public final /* synthetic */ z11 b;

                    {
                        this.b = z11Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        z11 z11Var3;
                        int i142 = i16;
                        z11 z11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        y60 y60Var2 = y60Var;
                        switch (i142) {
                            case 0:
                                y60Var2.v();
                                z11Var4.s.presentFragment(w81.f0(-z11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                z11Var4.getClass();
                                y60Var2.v();
                                org.telegram.messenger.mp.u1(z11Var4.e).t7.z(tL_forumTopic3.id, -z11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                y60Var2.v();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                me meVar = new me(15);
                                z11 z11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z11Var5.getContext());
                                String K0 = org.telegram.messenger.gd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = z11Var5.f0;
                                if (hashSet.size() == 1) {
                                    z11Var3 = z11Var5;
                                    u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131751487, org.telegram.messenger.mp.u1(z11Var5.e).t7.f(-z11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z11Var3 = z11Var5;
                                    u1Var.U = org.telegram.messenger.gd.M0(2131751486, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new di.t1(z11Var3, arrayList, j122, hashSet, meVar));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(20));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, z11);
            }
        }
        boolean z17 = view instanceof u11;
        org.telegram.ui.ActionBar.i6 i6Var = z11Var2.h;
        if (z17) {
            p11 p11Var = new p11();
            Paint paint = new Paint(1);
            p11Var.a = paint;
            p11Var.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, i6Var));
            y60Var.X(p11Var);
            y60Var.b0(org.telegram.messenger.g0.L(16.0f), 0.0f);
        } else if (z10) {
            y60Var.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var)));
            y60Var.W(5);
        } else {
            int L = org.telegram.messenger.g0.L(5.0f);
            int L2 = org.telegram.messenger.g0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var);
            float f10 = 0;
            float f11 = L;
            float f12 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f10, f10}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            y60Var.X(shapeDrawable);
        }
        y60Var.a0();
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
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        i();
    }

    public final void p() {
        org.telegram.ui.zd zdVar = this.S;
        if (zdVar != null) {
            zdVar.run();
        }
        i();
        float k10 = k(v11.b);
        float W1 = org.telegram.messenger.g0.W1(k10, -org.telegram.messenger.g0.L(78.0f), 0);
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(W1);
        frameLayout.setVisibility(k10 <= 0.0f ? 8 : 0);
        e();
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        org.telegram.ui.ActionBar.i6 i6Var = this.h;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, mode);
        org.telegram.ui.ActionBar.u6.s(this.G, i7, i6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        m11 m11Var = this.y;
        boolean canScrollHorizontally = m11Var.canScrollHorizontally(-1);
        m11Var.g3.O(true);
        if (!canScrollHorizontally) {
            m11Var.v0(0);
        }
        o11 o11Var = this.K;
        boolean canScrollVertically = o11Var.canScrollVertically(-1);
        o11Var.g3.O(true);
        if (!canScrollVertically) {
            o11Var.v0(0);
        }
        org.telegram.messenger.g0.g3(new j11(this, 0));
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

    public void setCurrentTopic(long j3) {
        this.f0 = j3;
        m11 m11Var = this.y;
        m11Var.g3.O(true);
        m11Var.invalidate();
        this.K.g3.O(true);
        y11 y11Var = this.E;
        if (y11Var != null) {
            y11Var.c(true, false, j3 == 0);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.q10 q10Var) {
        this.j0 = q10Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.q10 q10Var) {
        this.h0 = q10Var;
    }

    public void setSideMenuBackgroundDrawable(fh.g gVar) {
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

    public void setTopMenuBackgroundDrawable(fh.g gVar) {
        this.P = gVar;
        gVar.r(org.telegram.messenger.g0.L(18.0f));
        this.P.q(org.telegram.messenger.g0.L(7.0f));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            e();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
