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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a21 extends FrameLayout implements org.telegram.messenger.gs, te.b, org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int m0 = 0;
    public final z11 E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final p11 K;
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
    public final org.telegram.ui.ActionBar.h6 h;
    public org.telegram.messenger.r10 h0;
    public Runnable i0;
    public org.telegram.messenger.r10 j0;
    public boolean k0;
    public final HashSet l0;
    public final boolean n;
    public final boolean r;
    public final org.telegram.ui.bn s;
    public final boolean w;
    public final FrameLayout x;
    public final n11 y;

    /* JADX WARN: Type inference failed for: r3v8, types: [org.telegram.ui.Components.i11] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.i11] */
    public a21(Activity activity, org.telegram.ui.bn bnVar, int i7, long j3, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        ViewGroup viewGroup;
        boolean z11;
        nr nrVar = nr.h;
        this.a = new te.a(0, this, nrVar, 380L, true);
        this.b = new te.a(1, this, nrVar, 380L, false);
        this.N = new te.a(0, new j11(this), nrVar, 320L, false);
        this.V = 0.0f;
        this.l0 = new HashSet();
        this.s = bnVar;
        this.c = z10;
        this.e = i7;
        this.f = j3;
        this.h = h6Var;
        long j10 = -j3;
        this.n = org.telegram.messenger.v3.p0(org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j10)));
        boolean w10 = org.telegram.messenger.p10.w(org.telegram.messenger.np.u1(i7).c2(Long.valueOf(j3)));
        this.r = w10;
        final int i10 = 0;
        final int i11 = 1;
        this.w = !org.telegram.messenger.f3.w("topics_end_reached_", j10, org.telegram.messenger.k10.i(i7).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        addView(frameLayout, c8.ma.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.J = frameLayout2;
        addView(frameLayout2, c8.ma.d(64, -1.0f, org.telegram.messenger.ls.A1, 7.0f, 7.0f, 7.0f, 7.0f));
        n11 n11Var = new n11(this, activity, i7, new org.telegram.messenger.r10(this) { // from class: org.telegram.ui.Components.i11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i12;
                long j11;
                org.telegram.messenger.f00 f00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i10;
                a21 a21Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c51 c51Var = (c51) obj2;
                        boolean z15 = a21Var.r;
                        int i14 = a21Var.e;
                        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i14);
                        long j15 = a21Var.f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.np.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.f00 f00Var2 = org.telegram.messenger.np.u1(i14).t7;
                        ArrayList l10 = f00Var2.l(j16);
                        boolean z16 = a21Var.n;
                        int i15 = u11.b;
                        o41 K = o41.K(u11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z16;
                        K.L(a21Var.f0 == 0);
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
                                if (a21Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((o41) i5.c.h(1, arrayList2)).z |= 8;
                                        }
                                        c51Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        c51Var.M();
                                        z12 = true;
                                    }
                                    o41 K2 = o41.K(u11.class);
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
                                    long j17 = a21Var.f0;
                                    if (z16) {
                                        f00Var = f00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        f00Var = f00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    f00Var2 = f00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.f00 f00Var3 = f00Var2;
                        if (z12) {
                            c51Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !f00Var3.e(j16) && a21Var.w) {
                            o41 K3 = o41.K(u11.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList2.add(K3);
                            o41 K4 = o41.K(u11.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList2.add(K4);
                            o41 K5 = o41.K(u11.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.p10.w(c22)) {
                                o41 K6 = o41.K(u11.class);
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
                        a21.c(a21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        c51 c51Var2 = (c51) obj2;
                        boolean z18 = a21Var.n;
                        int i19 = a21Var.e;
                        org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(i19);
                        long j18 = a21Var.f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.np.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.f00 f00Var4 = org.telegram.messenger.np.u1(i19).t7;
                        ArrayList l11 = f00Var4.l(j19);
                        boolean z19 = a21Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = y11.b;
                            o41 K7 = o41.K(y11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z18;
                            K7.z = z19 ? 1 : 0;
                            K7.L(a21Var.f0 == 0);
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
                                if (a21Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        c51Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        c51Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = y11.b;
                                    o41 K8 = o41.K(y11.class);
                                    K8.y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z18) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = a21Var.f0;
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
                            c51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !f00Var4.e(j19) && a21Var.w) {
                            int i24 = y11.b;
                            o41 K9 = o41.K(y11.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            o41 K10 = o41.K(y11.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            o41 K11 = o41.K(y11.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.p10.w(user2)) {
                                int i25 = y11.b;
                                o41 K12 = o41.K(y11.class);
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
        }, new j11(this), new j11(this), h6Var);
        this.y = n11Var;
        n11Var.E1(new org.telegram.messenger.r10(this) { // from class: org.telegram.ui.Components.i11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i12;
                long j11;
                org.telegram.messenger.f00 f00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i11;
                a21 a21Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c51 c51Var = (c51) obj2;
                        boolean z15 = a21Var.r;
                        int i14 = a21Var.e;
                        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i14);
                        long j15 = a21Var.f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.np.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.f00 f00Var2 = org.telegram.messenger.np.u1(i14).t7;
                        ArrayList l10 = f00Var2.l(j16);
                        boolean z16 = a21Var.n;
                        int i15 = u11.b;
                        o41 K = o41.K(u11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z16;
                        K.L(a21Var.f0 == 0);
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
                                if (a21Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((o41) i5.c.h(1, arrayList2)).z |= 8;
                                        }
                                        c51Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        c51Var.M();
                                        z12 = true;
                                    }
                                    o41 K2 = o41.K(u11.class);
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
                                    long j17 = a21Var.f0;
                                    if (z16) {
                                        f00Var = f00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        f00Var = f00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    f00Var2 = f00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.f00 f00Var3 = f00Var2;
                        if (z12) {
                            c51Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !f00Var3.e(j16) && a21Var.w) {
                            o41 K3 = o41.K(u11.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList2.add(K3);
                            o41 K4 = o41.K(u11.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList2.add(K4);
                            o41 K5 = o41.K(u11.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.p10.w(c22)) {
                                o41 K6 = o41.K(u11.class);
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
                        a21.c(a21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        c51 c51Var2 = (c51) obj2;
                        boolean z18 = a21Var.n;
                        int i19 = a21Var.e;
                        org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(i19);
                        long j18 = a21Var.f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.np.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.f00 f00Var4 = org.telegram.messenger.np.u1(i19).t7;
                        ArrayList l11 = f00Var4.l(j19);
                        boolean z19 = a21Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = y11.b;
                            o41 K7 = o41.K(y11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z18;
                            K7.z = z19 ? 1 : 0;
                            K7.L(a21Var.f0 == 0);
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
                                if (a21Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        c51Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        c51Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = y11.b;
                                    o41 K8 = o41.K(y11.class);
                                    K8.y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z18) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = a21Var.f0;
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
                            c51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !f00Var4.e(j19) && a21Var.w) {
                            int i24 = y11.b;
                            o41 K9 = o41.K(y11.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            o41 K10 = o41.K(y11.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            o41 K11 = o41.K(y11.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.p10.w(user2)) {
                                int i25 = y11.b;
                                o41 K12 = o41.K(y11.class);
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
        n11Var.setWillNotDraw(false);
        n11Var.g3.r = false;
        n11Var.getContext();
        jg.i0 i0Var = new jg.i0((ViewGroup) n11Var, 7);
        n11Var.f3 = i0Var;
        n11Var.setLayoutManager(i0Var);
        frameLayout.addView(n11Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 41.0f, 0.0f, 0.0f, 0.0f));
        n11Var.j(new o11(this, 0));
        if (w10) {
            z11 z11Var = new z11(i7, activity, h6Var);
            this.E = z11Var;
            z11Var.c(true, false, this.f0 == 0);
            z11Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h11
                public final /* synthetic */ a21 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            a21 a21Var = this.b;
                            p11 p11Var = a21Var.K;
                            p11Var.z1(false);
                            n11 n11Var2 = a21Var.y;
                            n11Var2.z1(false);
                            a21Var.N.a(false, true);
                            org.telegram.messenger.g0.Z3(p11Var);
                            org.telegram.messenger.g0.Z3(n11Var2);
                            break;
                        case 1:
                            this.b.h0.a(0, Boolean.FALSE);
                            break;
                        default:
                            a21.b(this.b);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(z11Var, c8.ma.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.E = null;
        }
        final int i12 = 2;
        ViewGroup viewGroup2 = viewGroup;
        p11 p11Var = new p11(activity, i7, new org.telegram.messenger.r10(this) { // from class: org.telegram.ui.Components.i11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i122;
                long j11;
                org.telegram.messenger.f00 f00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i12;
                a21 a21Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c51 c51Var = (c51) obj2;
                        boolean z15 = a21Var.r;
                        int i14 = a21Var.e;
                        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i14);
                        long j15 = a21Var.f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.np.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.f00 f00Var2 = org.telegram.messenger.np.u1(i14).t7;
                        ArrayList l10 = f00Var2.l(j16);
                        boolean z16 = a21Var.n;
                        int i15 = u11.b;
                        o41 K = o41.K(u11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z16;
                        K.L(a21Var.f0 == 0);
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
                                if (a21Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((o41) i5.c.h(1, arrayList2)).z |= 8;
                                        }
                                        c51Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        c51Var.M();
                                        z12 = true;
                                    }
                                    o41 K2 = o41.K(u11.class);
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
                                    long j17 = a21Var.f0;
                                    if (z16) {
                                        f00Var = f00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        f00Var = f00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    f00Var2 = f00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.f00 f00Var3 = f00Var2;
                        if (z12) {
                            c51Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !f00Var3.e(j16) && a21Var.w) {
                            o41 K3 = o41.K(u11.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList2.add(K3);
                            o41 K4 = o41.K(u11.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList2.add(K4);
                            o41 K5 = o41.K(u11.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.p10.w(c22)) {
                                o41 K6 = o41.K(u11.class);
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
                        a21.c(a21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        c51 c51Var2 = (c51) obj2;
                        boolean z18 = a21Var.n;
                        int i19 = a21Var.e;
                        org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(i19);
                        long j18 = a21Var.f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.np.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.f00 f00Var4 = org.telegram.messenger.np.u1(i19).t7;
                        ArrayList l11 = f00Var4.l(j19);
                        boolean z19 = a21Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = y11.b;
                            o41 K7 = o41.K(y11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z18;
                            K7.z = z19 ? 1 : 0;
                            K7.L(a21Var.f0 == 0);
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
                                if (a21Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        c51Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        c51Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = y11.b;
                                    o41 K8 = o41.K(y11.class);
                                    K8.y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z18) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = a21Var.f0;
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
                            c51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !f00Var4.e(j19) && a21Var.w) {
                            int i24 = y11.b;
                            o41 K9 = o41.K(y11.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            o41 K10 = o41.K(y11.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            o41 K11 = o41.K(y11.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.p10.w(user2)) {
                                int i25 = y11.b;
                                o41 K12 = o41.K(y11.class);
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
        }, new j11(this), new j11(this), h6Var);
        this.K = p11Var;
        p11Var.E1(new org.telegram.messenger.r10(this) { // from class: org.telegram.ui.Components.i11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i122;
                long j11;
                org.telegram.messenger.f00 f00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i11;
                a21 a21Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c51 c51Var = (c51) obj2;
                        boolean z15 = a21Var.r;
                        int i14 = a21Var.e;
                        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i14);
                        long j15 = a21Var.f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.np.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.f00 f00Var2 = org.telegram.messenger.np.u1(i14).t7;
                        ArrayList l10 = f00Var2.l(j16);
                        boolean z16 = a21Var.n;
                        int i15 = u11.b;
                        o41 K = o41.K(u11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z16;
                        K.L(a21Var.f0 == 0);
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
                                if (a21Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((o41) i5.c.h(1, arrayList2)).z |= 8;
                                        }
                                        c51Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        c51Var.M();
                                        z12 = true;
                                    }
                                    o41 K2 = o41.K(u11.class);
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
                                    long j17 = a21Var.f0;
                                    if (z16) {
                                        f00Var = f00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        f00Var = f00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    f00Var2 = f00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.f00 f00Var3 = f00Var2;
                        if (z12) {
                            c51Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !f00Var3.e(j16) && a21Var.w) {
                            o41 K3 = o41.K(u11.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList2.add(K3);
                            o41 K4 = o41.K(u11.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList2.add(K4);
                            o41 K5 = o41.K(u11.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.p10.w(c22)) {
                                o41 K6 = o41.K(u11.class);
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
                        a21.c(a21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        c51 c51Var2 = (c51) obj2;
                        boolean z18 = a21Var.n;
                        int i19 = a21Var.e;
                        org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(i19);
                        long j18 = a21Var.f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.np.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.f00 f00Var4 = org.telegram.messenger.np.u1(i19).t7;
                        ArrayList l11 = f00Var4.l(j19);
                        boolean z19 = a21Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = y11.b;
                            o41 K7 = o41.K(y11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z18;
                            K7.z = z19 ? 1 : 0;
                            K7.L(a21Var.f0 == 0);
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
                                if (a21Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        c51Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        c51Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = y11.b;
                                    o41 K8 = o41.K(y11.class);
                                    K8.y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z18) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = a21Var.f0;
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
                            c51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !f00Var4.e(j19) && a21Var.w) {
                            int i24 = y11.b;
                            o41 K9 = o41.K(y11.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            o41 K10 = o41.K(y11.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            o41 K11 = o41.K(y11.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.p10.w(user2)) {
                                int i25 = y11.b;
                                o41 K12 = o41.K(y11.class);
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
        p11Var.g3.r = false;
        p11Var.setClipToPadding(false);
        p11Var.setClipChildren(false);
        viewGroup2.addView(p11Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 0.0f, w10 ? 90.0f : 48.0f, 0.0f, 0.0f));
        p11Var.j(new o11(this, i11));
        final int i13 = 2;
        ImageView j11 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        a21 a21Var = this.b;
                        p11 p11Var2 = a21Var.K;
                        p11Var2.z1(false);
                        n11 n11Var2 = a21Var.y;
                        n11Var2.z1(false);
                        a21Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(p11Var2);
                        org.telegram.messenger.g0.Z3(n11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        a21.b(this.b);
                        break;
                }
            }
        });
        this.H = j11;
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        a21 a21Var = this.b;
                        p11 p11Var2 = a21Var.K;
                        p11Var2.z1(false);
                        n11 n11Var2 = a21Var.y;
                        n11Var2.z1(false);
                        a21Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(p11Var2);
                        org.telegram.messenger.g0.Z3(n11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        a21.b(this.b);
                        break;
                }
            }
        });
        this.I = j12;
        frameLayout.addView(j11, c8.ma.e(44, 36, 51));
        viewGroup2.addView(j12, c8.ma.e(64, 48, 51));
        final int i14 = 0;
        ImageView j13 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        a21 a21Var = this.b;
                        p11 p11Var2 = a21Var.K;
                        p11Var2.z1(false);
                        n11 n11Var2 = a21Var.y;
                        n11Var2.z1(false);
                        a21Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(p11Var2);
                        org.telegram.messenger.g0.Z3(n11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        a21.b(this.b);
                        break;
                }
            }
        });
        this.F = j13;
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        a21 a21Var = this.b;
                        p11 p11Var2 = a21Var.K;
                        p11Var2.z1(false);
                        n11 n11Var2 = a21Var.y;
                        n11Var2.z1(false);
                        a21Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(p11Var2);
                        org.telegram.messenger.g0.Z3(n11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        a21.b(this.b);
                        break;
                }
            }
        });
        this.G = j14;
        frameLayout.addView(j13, c8.ma.e(44, 36, 51));
        viewGroup2.addView(j14, c8.ma.e(64, 48, 51));
        org.telegram.messenger.np.u1(i7).t7.n(3, j10, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(i7).h7;
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

    public static void a(a21 a21Var, o41 o41Var) {
        if (a21Var.n) {
            org.telegram.messenger.r10 r10Var = a21Var.j0;
            if (r10Var != null) {
                r10Var.a(Long.valueOf(o41Var.C), Boolean.FALSE);
                return;
            }
            return;
        }
        if (o41Var.C == -2) {
            Runnable runnable = a21Var.i0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        org.telegram.messenger.r10 r10Var2 = a21Var.h0;
        if (r10Var2 != null) {
            r10Var2.a(Integer.valueOf(o41Var.d), Boolean.FALSE);
        }
    }

    public static void b(a21 a21Var) {
        boolean z10 = a21Var.U;
        boolean z11 = true;
        if (!z10 && a21Var.T && a21Var.d0 == null && !a21Var.W) {
            if (a21Var.d) {
                return;
            }
            a21Var.d = true;
            a21Var.r(true);
            return;
        }
        if ((r2 = a21Var.d0) != null) {
            z11 = false;
            a21Var.d(z11);
        } else {
            z11 = false;
            a21Var.d(z11);
        }
    }

    public static void c(a21 a21Var, ArrayList arrayList) {
        long j3 = a21Var.f;
        org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(a21Var.e).t7;
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (i7 < arrayList.size()) {
            i7 = com.google.android.gms.internal.vision.e2.f(((o41) arrayList.get(i7)).d, i7, 1, arrayList2);
        }
        long j10 = -j3;
        f00Var.w(arrayList2, j10);
        f00Var.y(j10, false);
    }

    public static ImageView j(Context context, int i7, View.OnClickListener onClickListener) {
        ImageView e10 = org.telegram.messenger.o10.e(context, i7);
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
        int i7 = org.telegram.messenger.ls.r;
        int i10 = org.telegram.messenger.ls.t5;
        long j3 = this.f;
        int i11 = this.e;
        if (!z10) {
            long j10 = -j3;
            LongSparseIntArray longSparseIntArray = org.telegram.messenger.np.u1(i11).t7.r;
            int i12 = longSparseIntArray.get(j10, 0) - 1;
            longSparseIntArray.put(j10, i12 >= 0 ? i12 : 0);
            org.telegram.messenger.ls.f(i11).n(this, i10);
            org.telegram.messenger.ls.f(i11).n(this, i7);
            return;
        }
        org.telegram.messenger.ls.f(i11).c(this, i10);
        org.telegram.messenger.ls.f(i11).c(this, i7);
        org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(i11).t7;
        long j11 = -j3;
        LongSparseIntArray longSparseIntArray2 = f00Var.r;
        longSparseIntArray2.put(j11, longSparseIntArray2.get(j11, 0) + 1);
        f00Var.y(j11, true);
    }

    @Override // te.b
    public final void D(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(R.drawable.menu_sidebar_left);
            this.I.setImageResource(R.drawable.menu_sidebar_bottom);
            org.telegram.messenger.np.u1(this.e).h7.edit().putBoolean("topicssidetabsb" + this.f, false).apply();
            r(true);
        }
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        p();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
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
        ofFloat.addUpdateListener(new h60(this, 28));
        this.e0.addListener(new org.telegram.ui.on(22, this, z10));
        this.e0.setInterpolator(pi.k.V);
        this.e0.setDuration(250L);
        this.e0.start();
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.t5;
        long j3 = this.f;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() != (-j3)) {
                return;
            }
            q();
        } else if (i7 == org.telegram.messenger.ls.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.np.I8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.np.u1(this.e).t7.y(-j3, false);
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
        int i7 = org.telegram.ui.ActionBar.m6.z6;
        org.telegram.ui.ActionBar.h6 h6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var);
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
        ArrayList l10 = org.telegram.messenger.np.u1(this.e).t7.l(-this.f);
        this.a.a((l10 == null || l10.isEmpty() || this.k0) ? false : true, z10);
    }

    public w11 getCurrentTabsPosition() {
        return this.U ? w11.b : this.T ? w11.c : w11.a;
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
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f)) - this.Q) + org.telegram.messenger.g0.W1(k(w11.c), org.telegram.messenger.g0.L(43.0f), 0));
        } else {
            frameLayout.setTranslationY(this.R + org.telegram.messenger.g0.W1(k(w11.a), -org.telegram.messenger.g0.L(43.0f), 0));
        }
    }

    public final float k(w11 w11Var) {
        float f10 = (1.0f - this.b.e) * this.a.e;
        if (w11Var == w11.b) {
            return this.V * f10;
        }
        if ((w11Var != w11.a || this.T) && !(w11Var == w11.c && this.T)) {
            return 0.0f;
        }
        return (1.0f - this.V) * f10;
    }

    public final boolean l() {
        if (this.V <= 0.5f) {
            int i7 = 0;
            while (true) {
                n11 n11Var = this.y;
                if (i7 >= n11Var.getChildCount()) {
                    break;
                }
                o41 G = n11Var.g3.G(RecyclerView.R(n11Var.getChildAt(i7)));
                if (G != null && G.s) {
                    return true;
                }
                i7++;
            }
        } else {
            int i10 = 0;
            while (true) {
                p11 p11Var = this.K;
                if (i10 >= p11Var.getChildCount()) {
                    break;
                }
                o41 G2 = p11Var.g3.G(RecyclerView.R(p11Var.getChildAt(i10)));
                if (G2 != null && G2.s) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(this.e).t7;
        long j3 = this.f;
        if (f00Var.e(-j3)) {
            return;
        }
        f00Var.o(-j3);
    }

    public final void n(long j3, boolean z10) {
        if (this.n) {
            org.telegram.messenger.r10 r10Var = this.j0;
            if (r10Var != null) {
                r10Var.a(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.r10 r10Var2 = this.h0;
        if (r10Var2 != null) {
            r10Var2.a(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        org.telegram.messenger.np npVar;
        final a21 a21Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i7;
        final a21 a21Var2;
        final a70 a70Var;
        boolean z11;
        final int i10;
        int i11 = this.e;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i11);
        long j3 = this.f;
        TLRPC.Chat O0 = j3 < 0 ? u12.O0(Long.valueOf(-j3)) : null;
        TLRPC.User c22 = j3 > 0 ? u12.c2(Long.valueOf(j3)) : null;
        final org.telegram.ui.bn bnVar = this.s;
        final a70 J = a70.J(bnVar, view);
        int i12 = 1;
        final int i13 = 0;
        if (org.telegram.messenger.v3.p0(O0)) {
            long o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
            if (o4 == 0 || !org.telegram.messenger.v3.A(i11, O0, 24)) {
                return false;
            }
            TLRPC.Chat chat = O0;
            a70Var = J;
            a70Var.c(R.drawable.msg_clear, org.telegram.messenger.hd.N0(2131752077, null), new di.j2(this, a70Var, o4, chat, 16), false);
            long j10 = chat.id;
            if (org.telegram.messenger.v3.p0(chat) && org.telegram.messenger.v3.A(i11, chat, 24)) {
                long j11 = chat.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat O02 = org.telegram.messenger.np.u1(i11).O0(Long.valueOf(j10));
            TLRPC.User c23 = org.telegram.messenger.np.u1(i11).c2(Long.valueOf(o4));
            if (c23 != null && org.telegram.messenger.v3.w(2, O02)) {
                a70Var.c(R.drawable.msg_remove, org.telegram.messenger.hd.N0(2131753723, null), null, false);
                org.telegram.ui.ActionBar.y0 z12 = a70Var.z();
                z12.setVisibility(8);
                org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(i11);
                di.p2 p2Var = new di.p2(this, z12, a70Var, j10, c23, O02);
                a70Var = a70Var;
                u13.M0(O02, c23, p2Var);
            }
            a21Var2 = this;
        } else {
            if (org.telegram.messenger.v3.y(15, O0) || org.telegram.messenger.p10.w(c22)) {
                boolean z13 = tL_forumTopic.pinned;
                npVar = u12;
                a21Var = this;
                tL_forumTopic2 = tL_forumTopic;
                J.c(z13 ? R.drawable.msg_unpin : R.drawable.msg_pin, org.telegram.messenger.hd.N0(z13 ? 2131751440 : 2131751441, null), new q20(this, J, npVar, tL_forumTopic, 11), false);
                if (tL_forumTopic2.pinned && !z10) {
                    J.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.N0(2131750693, null), new k11(a21Var, i12), false);
                }
                i7 = 15;
            } else {
                i7 = 15;
                tL_forumTopic2 = tL_forumTopic;
                npVar = u12;
                a21Var = this;
            }
            if (org.telegram.messenger.v3.y(i7, O0) || org.telegram.messenger.p10.w(c22)) {
                J.c(R.drawable.outline_profile_edit_24, org.telegram.messenger.hd.N0(2131751204, null), new Runnable(a21Var) { // from class: org.telegram.ui.Components.m11
                    public final /* synthetic */ a21 b;

                    {
                        this.b = a21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a21 a21Var3;
                        int i14 = i13;
                        a21 a21Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        a70 a70Var2 = J;
                        switch (i14) {
                            case 0:
                                a70Var2.v();
                                a21Var4.s.presentFragment(w81.f0(-a21Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                a21Var4.getClass();
                                a70Var2.v();
                                org.telegram.messenger.np.u1(a21Var4.e).t7.z(tL_forumTopic3.id, -a21Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                a70Var2.v();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                me meVar = new me(15);
                                a21 a21Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a21Var5.getContext());
                                String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = a21Var5.f0;
                                if (hashSet.size() == 1) {
                                    a21Var3 = a21Var5;
                                    t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131751486, org.telegram.messenger.np.u1(a21Var5.e).t7.f(-a21Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    a21Var3 = a21Var5;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751485, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new di.t1(a21Var3, arrayList, j12, hashSet, meVar));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(20));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            final long j12 = tL_forumTopic2.id;
            final int currentAccount = bnVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.h6 resourceProvider = bnVar.getResourceProvider();
            final long j13 = a21Var.f;
            bi.l4 l4Var = new bi.l4(J, currentAccount, j13, j12, bnVar, resourceProvider);
            final a70 K = J.K();
            K.c(R.drawable.msg_arrow_back, org.telegram.messenger.hd.N0(2131753753, null), new org.telegram.ui.hq0(J, 27), false);
            K.c(R.drawable.msg_tone_on, org.telegram.messenger.hd.N0(2131745079, null), new Runnable() { // from class: org.telegram.ui.Components.jo
                @Override // java.lang.Runnable
                public final void run() {
                    a70.this.v();
                    SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(currentAccount).g7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j14 = j13;
                    long j15 = j12;
                    sb2.append(org.telegram.messenger.ys.v(j14, j15, false));
                    boolean z14 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z15 = !z14;
                    sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.ys.v(j14, j15, false), z15).apply();
                    K.v();
                    org.telegram.ui.ActionBar.g2 g2Var = bnVar;
                    if (lc.a(g2Var)) {
                        lc.S(z14 ? 1 : 0, g2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.y0 z14 = K.z();
            K.c(R.drawable.msg_mute_period, org.telegram.messenger.hd.N0(2131748115, null), new ai.b1(J, resourceProvider, currentAccount, l4Var, 23), false);
            K.c(R.drawable.msg_customize, org.telegram.messenger.hd.N0(2131747723, null), new ko(J, j13, j12, bnVar, resourceProvider), false);
            K.c(0, "", new di.j9(J, currentAccount, j13, j12, bnVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.y0 z15 = K.z();
            new Runnable() { // from class: org.telegram.ui.Components.lo
                @Override // java.lang.Runnable
                public final void run() {
                    int i14;
                    int i15 = currentAccount;
                    org.telegram.messenger.np u14 = org.telegram.messenger.np.u1(i15);
                    long j14 = j13;
                    long j15 = j12;
                    boolean u22 = u14.u2(j14, j15, null);
                    org.telegram.ui.ActionBar.y0 y0Var = z15;
                    org.telegram.ui.ActionBar.y0 y0Var2 = z14;
                    if (u22) {
                        y0Var.j(org.telegram.messenger.hd.N0(2131743603, null), R.drawable.msg_unmute, null);
                        i14 = org.telegram.ui.ActionBar.m6.x6;
                        y0Var2.setVisibility(8);
                    } else {
                        y0Var.j(org.telegram.messenger.hd.N0(2131748113, null), R.drawable.msg_mute, null);
                        int i16 = org.telegram.ui.ActionBar.m6.q7;
                        y0Var2.setVisibility(0);
                        if (org.telegram.messenger.np.u1(i15).v2(j14, j15)) {
                            y0Var2.j(org.telegram.messenger.hd.N0(2131745081, null), R.drawable.msg_tone_off, null);
                        } else {
                            y0Var2.j(org.telegram.messenger.hd.N0(2131745079, null), R.drawable.msg_tone_on, null);
                        }
                        i14 = i16;
                    }
                    ro.c(y0Var, i14);
                }
            }.run();
            long j14 = tL_forumTopic2.id;
            long j15 = a21Var.f;
            org.telegram.messenger.np npVar2 = npVar;
            boolean u22 = npVar2.u2(j15, j14, null);
            int i14 = u22 ? R.drawable.msg_unmute : R.drawable.msg_mute;
            int i15 = u22 ? 2131743604 : 2131748121;
            TLRPC.Chat chat2 = O0;
            a21Var2 = this;
            a70Var = J;
            a70Var.c(i14, org.telegram.messenger.hd.N0(i15, null), new org.telegram.ui.wn(a21Var2, npVar2, tL_forumTopic, J, K, 7), false);
            if (!org.telegram.messenger.v3.i(i11, chat2, tL_forumTopic) || org.telegram.messenger.p10.v(c22)) {
                z11 = false;
                i10 = 1;
            } else {
                boolean z16 = tL_forumTopic.closed;
                i10 = 1;
                z11 = false;
                a70Var.c(z16 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, org.telegram.messenger.hd.N0(z16 ? 2131745888 : 2131752027, null), new Runnable(a21Var2) { // from class: org.telegram.ui.Components.m11
                    public final /* synthetic */ a21 b;

                    {
                        this.b = a21Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a21 a21Var3;
                        int i142 = i10;
                        a21 a21Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        a70 a70Var2 = a70Var;
                        switch (i142) {
                            case 0:
                                a70Var2.v();
                                a21Var4.s.presentFragment(w81.f0(-a21Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                a21Var4.getClass();
                                a70Var2.v();
                                org.telegram.messenger.np.u1(a21Var4.e).t7.z(tL_forumTopic3.id, -a21Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                a70Var2.v();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                me meVar = new me(15);
                                a21 a21Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a21Var5.getContext());
                                String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = a21Var5.f0;
                                if (hashSet.size() == 1) {
                                    a21Var3 = a21Var5;
                                    t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131751486, org.telegram.messenger.np.u1(a21Var5.e).t7.f(-a21Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    a21Var3 = a21Var5;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751485, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new di.t1(a21Var3, arrayList, j122, hashSet, meVar));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(20));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (org.telegram.messenger.v3.e(i11, chat2, tL_forumTopic)) {
                final int i16 = 2;
                a70Var.c(R.drawable.msg_delete, org.telegram.messenger.hd.K0(i10, "DeleteTopics"), new Runnable(a21Var2) { // from class: org.telegram.ui.Components.m11
                    public final /* synthetic */ a21 b;

                    {
                        this.b = a21Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a21 a21Var3;
                        int i142 = i16;
                        a21 a21Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        a70 a70Var2 = a70Var;
                        switch (i142) {
                            case 0:
                                a70Var2.v();
                                a21Var4.s.presentFragment(w81.f0(-a21Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                a21Var4.getClass();
                                a70Var2.v();
                                org.telegram.messenger.np.u1(a21Var4.e).t7.z(tL_forumTopic3.id, -a21Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                a70Var2.v();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                me meVar = new me(15);
                                a21 a21Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a21Var5.getContext());
                                String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = a21Var5.f0;
                                if (hashSet.size() == 1) {
                                    a21Var3 = a21Var5;
                                    t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131751486, org.telegram.messenger.np.u1(a21Var5.e).t7.f(-a21Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    a21Var3 = a21Var5;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751485, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new di.t1(a21Var3, arrayList, j122, hashSet, meVar));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(20));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, z11);
            }
        }
        boolean z17 = view instanceof v11;
        org.telegram.ui.ActionBar.h6 h6Var = a21Var2.h;
        if (z17) {
            q11 q11Var = new q11();
            Paint paint = new Paint(1);
            q11Var.a = paint;
            q11Var.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, h6Var));
            a70Var.X(q11Var);
            a70Var.b0(org.telegram.messenger.g0.L(16.0f), 0.0f);
        } else if (z10) {
            a70Var.X(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var)));
            a70Var.W(5);
        } else {
            int L = org.telegram.messenger.g0.L(5.0f);
            int L2 = org.telegram.messenger.g0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var);
            float f10 = 0;
            float f11 = L;
            float f12 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f10, f10}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            a70Var.X(shapeDrawable);
        }
        a70Var.a0();
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
        float k10 = k(w11.b);
        float W1 = org.telegram.messenger.g0.W1(k10, -org.telegram.messenger.g0.L(78.0f), 0);
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(W1);
        frameLayout.setVisibility(k10 <= 0.0f ? 8 : 0);
        e();
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        org.telegram.ui.ActionBar.h6 h6Var = this.h;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, mode);
        org.telegram.ui.ActionBar.t6.s(this.G, i7, h6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        n11 n11Var = this.y;
        boolean canScrollHorizontally = n11Var.canScrollHorizontally(-1);
        n11Var.g3.O(true);
        if (!canScrollHorizontally) {
            n11Var.v0(0);
        }
        p11 p11Var = this.K;
        boolean canScrollVertically = p11Var.canScrollVertically(-1);
        p11Var.g3.O(true);
        if (!canScrollVertically) {
            p11Var.v0(0);
        }
        org.telegram.messenger.g0.g3(new k11(this, 0));
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
        n11 n11Var = this.y;
        n11Var.g3.O(true);
        n11Var.invalidate();
        this.K.g3.O(true);
        z11 z11Var = this.E;
        if (z11Var != null) {
            z11Var.c(true, false, j3 == 0);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.r10 r10Var) {
        this.j0 = r10Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.r10 r10Var) {
        this.h0 = r10Var;
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            e();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
