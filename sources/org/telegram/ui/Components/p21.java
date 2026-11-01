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
import org.telegram.ui.ja1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p21 extends FrameLayout implements org.telegram.messenger.vs, fe.e, org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int l0 = 0;
    public final o21 D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final FrameLayout I;
    public final f21 J;
    public long K;
    public long L;
    public final fe.b M;
    public vg.f N;
    public vg.f O;
    public float P;
    public float Q;
    public org.telegram.ui.me R;
    public boolean S;
    public boolean T;
    public float U;
    public boolean V;
    public boolean W;
    public final fe.b a;
    public int a0;
    public final fe.b b;
    public int b0;
    public boolean c;
    public Boolean c0;
    public boolean d;
    public ValueAnimator d0;
    public final int e;
    public long e0;
    public final long f;
    public boolean f0;
    public org.telegram.messenger.k20 g0;
    public final org.telegram.ui.ActionBar.p6 h;
    public Runnable h0;
    public org.telegram.messenger.k20 i0;
    public boolean j0;
    public final HashSet k0;
    public final boolean n;
    public final boolean r;
    public final org.telegram.ui.un s;
    public final boolean w;
    public final FrameLayout x;
    public final d21 y;

    /* JADX WARN: Type inference failed for: r3v8, types: [org.telegram.ui.Components.w11] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.w11] */
    public p21(Activity activity, org.telegram.ui.un unVar, int i10, long j10, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        ViewGroup viewGroup;
        boolean z11;
        gr grVar = gr.h;
        this.a = new fe.b(0, this, grVar, 380L, true);
        this.b = new fe.b(1, this, grVar, 380L, false);
        this.M = new fe.b(0, new x11(this), grVar, 320L, false);
        this.U = 0.0f;
        this.k0 = new HashSet();
        this.s = unVar;
        this.c = z10;
        this.e = i10;
        this.f = j10;
        this.h = p6Var;
        long j11 = -j10;
        this.n = org.telegram.messenger.w3.p0(org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(j11)));
        boolean v = org.telegram.messenger.i20.v(org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(j10)));
        this.r = v;
        final int i11 = 0;
        final int i12 = 1;
        this.w = !org.telegram.messenger.m5.w("topics_end_reached_", j11, org.telegram.messenger.e20.i(i10).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        addView(frameLayout, w7.b6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.I = frameLayout2;
        addView(frameLayout2, w7.b6.d(64, -1.0f, org.telegram.messenger.at.A1, 7.0f, 7.0f, 7.0f, 7.0f));
        d21 d21Var = new d21(this, activity, i10, new org.telegram.messenger.k20(this) { // from class: org.telegram.ui.Components.w11
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.k20
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i13;
                long j12;
                org.telegram.messenger.y00 y00Var;
                long j13;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j14;
                long j15;
                int i14 = i11;
                p21 p21Var = this.b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        q51 q51Var = (q51) obj2;
                        boolean z15 = p21Var.r;
                        int i15 = p21Var.e;
                        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i15);
                        long j16 = p21Var.f;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.y00 y00Var2 = org.telegram.messenger.wp.r1(i15).r7;
                        ArrayList l4 = y00Var2.l(j17);
                        boolean z16 = p21Var.n;
                        int i16 = j21.b;
                        b51 K = b51.K(j21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(p21Var.e0 == 0);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z12 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z15) {
                                    i13 = i18;
                                    if (tL_forumTopic.id == 1) {
                                        size = i19;
                                        i17 = i13;
                                    }
                                } else {
                                    i13 = i18;
                                }
                                if (p21Var.k0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i19;
                                    i17 = i13;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b51) i0.a.g(1, arrayList2)).y |= 8;
                                        }
                                        q51Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        q51Var.M();
                                        z12 = true;
                                    }
                                    b51 K2 = b51.K(j21.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = p21Var.e0;
                                    if (z16) {
                                        y00Var = y00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        y00Var = y00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i13;
                                    y00Var2 = y00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.y00 y00Var3 = y00Var2;
                        if (z12) {
                            q51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !y00Var3.e(j17) && p21Var.w) {
                            b51 K3 = b51.K(j21.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            b51 K4 = b51.K(j21.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            b51 K5 = b51.K(j21.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.i20.v(Z1)) {
                                b51 K6 = b51.K(j21.class);
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
                        p21.c(p21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        q51 q51Var2 = (q51) obj2;
                        boolean z18 = p21Var.n;
                        int i20 = p21Var.e;
                        org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i20);
                        long j19 = p21Var.f;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.y00 y00Var4 = org.telegram.messenger.wp.r1(i20).r7;
                        ArrayList l10 = y00Var4.l(j20);
                        boolean z19 = p21Var.r;
                        if (z19) {
                            arrayList = l10;
                        } else {
                            int i21 = n21.b;
                            b51 K7 = b51.K(n21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(p21Var.e0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z20 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (p21Var.k0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        q51Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        q51Var2.M();
                                        z20 = true;
                                    }
                                    int i24 = n21.b;
                                    b51 K8 = b51.K(n21.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = p21Var.e0;
                                    if (z18) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList3.add(K8);
                                    size2 = i23;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z13) {
                            q51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !y00Var4.e(j20) && p21Var.w) {
                            int i25 = n21.b;
                            b51 K9 = b51.K(n21.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b51 K10 = b51.K(n21.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b51 K11 = b51.K(n21.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.i20.v(user2)) {
                                int i26 = n21.b;
                                b51 K12 = b51.K(n21.class);
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
        }, new x11(this), new x11(this), p6Var);
        this.y = d21Var;
        d21Var.E1(new org.telegram.messenger.k20(this) { // from class: org.telegram.ui.Components.w11
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.k20
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i13;
                long j12;
                org.telegram.messenger.y00 y00Var;
                long j13;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j14;
                long j15;
                int i14 = i12;
                p21 p21Var = this.b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        q51 q51Var = (q51) obj2;
                        boolean z15 = p21Var.r;
                        int i15 = p21Var.e;
                        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i15);
                        long j16 = p21Var.f;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.y00 y00Var2 = org.telegram.messenger.wp.r1(i15).r7;
                        ArrayList l4 = y00Var2.l(j17);
                        boolean z16 = p21Var.n;
                        int i16 = j21.b;
                        b51 K = b51.K(j21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(p21Var.e0 == 0);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z12 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z15) {
                                    i13 = i18;
                                    if (tL_forumTopic.id == 1) {
                                        size = i19;
                                        i17 = i13;
                                    }
                                } else {
                                    i13 = i18;
                                }
                                if (p21Var.k0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i19;
                                    i17 = i13;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b51) i0.a.g(1, arrayList2)).y |= 8;
                                        }
                                        q51Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        q51Var.M();
                                        z12 = true;
                                    }
                                    b51 K2 = b51.K(j21.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = p21Var.e0;
                                    if (z16) {
                                        y00Var = y00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        y00Var = y00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i13;
                                    y00Var2 = y00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.y00 y00Var3 = y00Var2;
                        if (z12) {
                            q51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !y00Var3.e(j17) && p21Var.w) {
                            b51 K3 = b51.K(j21.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            b51 K4 = b51.K(j21.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            b51 K5 = b51.K(j21.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.i20.v(Z1)) {
                                b51 K6 = b51.K(j21.class);
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
                        p21.c(p21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        q51 q51Var2 = (q51) obj2;
                        boolean z18 = p21Var.n;
                        int i20 = p21Var.e;
                        org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i20);
                        long j19 = p21Var.f;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.y00 y00Var4 = org.telegram.messenger.wp.r1(i20).r7;
                        ArrayList l10 = y00Var4.l(j20);
                        boolean z19 = p21Var.r;
                        if (z19) {
                            arrayList = l10;
                        } else {
                            int i21 = n21.b;
                            b51 K7 = b51.K(n21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(p21Var.e0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z20 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (p21Var.k0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        q51Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        q51Var2.M();
                                        z20 = true;
                                    }
                                    int i24 = n21.b;
                                    b51 K8 = b51.K(n21.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = p21Var.e0;
                                    if (z18) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList3.add(K8);
                                    size2 = i23;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z13) {
                            q51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !y00Var4.e(j20) && p21Var.w) {
                            int i25 = n21.b;
                            b51 K9 = b51.K(n21.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b51 K10 = b51.K(n21.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b51 K11 = b51.K(n21.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.i20.v(user2)) {
                                int i26 = n21.b;
                                b51 K12 = b51.K(n21.class);
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
        d21Var.setWillNotDraw(false);
        d21Var.f3.r = false;
        d21Var.getContext();
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) d21Var, 6);
        d21Var.e3 = brVar;
        d21Var.setLayoutManager(brVar);
        frameLayout.addView(d21Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.at.E1, 41.0f, 0.0f, 0.0f, 0.0f));
        d21Var.j(new e21(this, 0));
        if (v) {
            o21 o21Var = new o21(i10, activity, p6Var);
            this.D = o21Var;
            o21Var.c(true, false, this.e0 == 0);
            o21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v11
                public final /* synthetic */ p21 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            p21 p21Var = this.b;
                            f21 f21Var = p21Var.J;
                            f21Var.z1(false);
                            d21 d21Var2 = p21Var.y;
                            d21Var2.z1(false);
                            p21Var.M.a(false, true);
                            org.telegram.messenger.i0.a4(f21Var);
                            org.telegram.messenger.i0.a4(d21Var2);
                            break;
                        case 1:
                            this.b.g0.a(0, Boolean.FALSE);
                            break;
                        default:
                            p21.b(this.b);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(o21Var, w7.b6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.D = null;
        }
        final int i13 = 2;
        ViewGroup viewGroup2 = viewGroup;
        f21 f21Var = new f21(activity, i10, new org.telegram.messenger.k20(this) { // from class: org.telegram.ui.Components.w11
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.k20
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i132;
                long j12;
                org.telegram.messenger.y00 y00Var;
                long j13;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j14;
                long j15;
                int i14 = i13;
                p21 p21Var = this.b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        q51 q51Var = (q51) obj2;
                        boolean z15 = p21Var.r;
                        int i15 = p21Var.e;
                        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i15);
                        long j16 = p21Var.f;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.y00 y00Var2 = org.telegram.messenger.wp.r1(i15).r7;
                        ArrayList l4 = y00Var2.l(j17);
                        boolean z16 = p21Var.n;
                        int i16 = j21.b;
                        b51 K = b51.K(j21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(p21Var.e0 == 0);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z12 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z15) {
                                    i132 = i18;
                                    if (tL_forumTopic.id == 1) {
                                        size = i19;
                                        i17 = i132;
                                    }
                                } else {
                                    i132 = i18;
                                }
                                if (p21Var.k0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i19;
                                    i17 = i132;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b51) i0.a.g(1, arrayList2)).y |= 8;
                                        }
                                        q51Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        q51Var.M();
                                        z12 = true;
                                    }
                                    b51 K2 = b51.K(j21.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = p21Var.e0;
                                    if (z16) {
                                        y00Var = y00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        y00Var = y00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i132;
                                    y00Var2 = y00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.y00 y00Var3 = y00Var2;
                        if (z12) {
                            q51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !y00Var3.e(j17) && p21Var.w) {
                            b51 K3 = b51.K(j21.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            b51 K4 = b51.K(j21.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            b51 K5 = b51.K(j21.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.i20.v(Z1)) {
                                b51 K6 = b51.K(j21.class);
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
                        p21.c(p21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        q51 q51Var2 = (q51) obj2;
                        boolean z18 = p21Var.n;
                        int i20 = p21Var.e;
                        org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i20);
                        long j19 = p21Var.f;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.y00 y00Var4 = org.telegram.messenger.wp.r1(i20).r7;
                        ArrayList l10 = y00Var4.l(j20);
                        boolean z19 = p21Var.r;
                        if (z19) {
                            arrayList = l10;
                        } else {
                            int i21 = n21.b;
                            b51 K7 = b51.K(n21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(p21Var.e0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z20 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (p21Var.k0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        q51Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        q51Var2.M();
                                        z20 = true;
                                    }
                                    int i24 = n21.b;
                                    b51 K8 = b51.K(n21.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = p21Var.e0;
                                    if (z18) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList3.add(K8);
                                    size2 = i23;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z13) {
                            q51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !y00Var4.e(j20) && p21Var.w) {
                            int i25 = n21.b;
                            b51 K9 = b51.K(n21.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b51 K10 = b51.K(n21.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b51 K11 = b51.K(n21.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.i20.v(user2)) {
                                int i26 = n21.b;
                                b51 K12 = b51.K(n21.class);
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
        }, new x11(this), new x11(this), p6Var);
        this.J = f21Var;
        f21Var.E1(new org.telegram.messenger.k20(this) { // from class: org.telegram.ui.Components.w11
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.k20
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i132;
                long j12;
                org.telegram.messenger.y00 y00Var;
                long j13;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j14;
                long j15;
                int i14 = i12;
                p21 p21Var = this.b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        q51 q51Var = (q51) obj2;
                        boolean z15 = p21Var.r;
                        int i15 = p21Var.e;
                        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i15);
                        long j16 = p21Var.f;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.y00 y00Var2 = org.telegram.messenger.wp.r1(i15).r7;
                        ArrayList l4 = y00Var2.l(j17);
                        boolean z16 = p21Var.n;
                        int i16 = j21.b;
                        b51 K = b51.K(j21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(p21Var.e0 == 0);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z12 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z15) {
                                    i132 = i18;
                                    if (tL_forumTopic.id == 1) {
                                        size = i19;
                                        i17 = i132;
                                    }
                                } else {
                                    i132 = i18;
                                }
                                if (p21Var.k0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i19;
                                    i17 = i132;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b51) i0.a.g(1, arrayList2)).y |= 8;
                                        }
                                        q51Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        q51Var.M();
                                        z12 = true;
                                    }
                                    b51 K2 = b51.K(j21.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = p21Var.e0;
                                    if (z16) {
                                        y00Var = y00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        y00Var = y00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i132;
                                    y00Var2 = y00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.y00 y00Var3 = y00Var2;
                        if (z12) {
                            q51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !y00Var3.e(j17) && p21Var.w) {
                            b51 K3 = b51.K(j21.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            b51 K4 = b51.K(j21.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            b51 K5 = b51.K(j21.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.i20.v(Z1)) {
                                b51 K6 = b51.K(j21.class);
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
                        p21.c(p21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        q51 q51Var2 = (q51) obj2;
                        boolean z18 = p21Var.n;
                        int i20 = p21Var.e;
                        org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i20);
                        long j19 = p21Var.f;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.y00 y00Var4 = org.telegram.messenger.wp.r1(i20).r7;
                        ArrayList l10 = y00Var4.l(j20);
                        boolean z19 = p21Var.r;
                        if (z19) {
                            arrayList = l10;
                        } else {
                            int i21 = n21.b;
                            b51 K7 = b51.K(n21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(p21Var.e0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z20 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z19) {
                                    z14 = z20;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z20 = z14;
                                    }
                                } else {
                                    z14 = z20;
                                }
                                if (p21Var.k0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        q51Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        q51Var2.M();
                                        z20 = true;
                                    }
                                    int i24 = n21.b;
                                    b51 K8 = b51.K(n21.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = p21Var.e0;
                                    if (z18) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList3.add(K8);
                                    size2 = i23;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z13) {
                            q51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !y00Var4.e(j20) && p21Var.w) {
                            int i25 = n21.b;
                            b51 K9 = b51.K(n21.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b51 K10 = b51.K(n21.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b51 K11 = b51.K(n21.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.i20.v(user2)) {
                                int i26 = n21.b;
                                b51 K12 = b51.K(n21.class);
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
        f21Var.f3.r = false;
        f21Var.setClipToPadding(false);
        f21Var.setClipChildren(false);
        viewGroup2.addView(f21Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.at.E1, 0.0f, v ? 90.0f : 48.0f, 0.0f, 0.0f));
        f21Var.j(new e21(this, i12));
        final int i14 = 2;
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v11
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        p21 p21Var = this.b;
                        f21 f21Var2 = p21Var.J;
                        f21Var2.z1(false);
                        d21 d21Var2 = p21Var.y;
                        d21Var2.z1(false);
                        p21Var.M.a(false, true);
                        org.telegram.messenger.i0.a4(f21Var2);
                        org.telegram.messenger.i0.a4(d21Var2);
                        break;
                    case 1:
                        this.b.g0.a(0, Boolean.FALSE);
                        break;
                    default:
                        p21.b(this.b);
                        break;
                }
            }
        });
        this.G = j12;
        ImageView j13 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v11
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        p21 p21Var = this.b;
                        f21 f21Var2 = p21Var.J;
                        f21Var2.z1(false);
                        d21 d21Var2 = p21Var.y;
                        d21Var2.z1(false);
                        p21Var.M.a(false, true);
                        org.telegram.messenger.i0.a4(f21Var2);
                        org.telegram.messenger.i0.a4(d21Var2);
                        break;
                    case 1:
                        this.b.g0.a(0, Boolean.FALSE);
                        break;
                    default:
                        p21.b(this.b);
                        break;
                }
            }
        });
        this.H = j13;
        frameLayout.addView(j12, w7.b6.e(44, 36, 51));
        viewGroup2.addView(j13, w7.b6.e(64, 48, 51));
        final int i15 = 0;
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v11
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        p21 p21Var = this.b;
                        f21 f21Var2 = p21Var.J;
                        f21Var2.z1(false);
                        d21 d21Var2 = p21Var.y;
                        d21Var2.z1(false);
                        p21Var.M.a(false, true);
                        org.telegram.messenger.i0.a4(f21Var2);
                        org.telegram.messenger.i0.a4(d21Var2);
                        break;
                    case 1:
                        this.b.g0.a(0, Boolean.FALSE);
                        break;
                    default:
                        p21.b(this.b);
                        break;
                }
            }
        });
        this.E = j14;
        ImageView j15 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v11
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        p21 p21Var = this.b;
                        f21 f21Var2 = p21Var.J;
                        f21Var2.z1(false);
                        d21 d21Var2 = p21Var.y;
                        d21Var2.z1(false);
                        p21Var.M.a(false, true);
                        org.telegram.messenger.i0.a4(f21Var2);
                        org.telegram.messenger.i0.a4(d21Var2);
                        break;
                    case 1:
                        this.b.g0.a(0, Boolean.FALSE);
                        break;
                    default:
                        p21.b(this.b);
                        break;
                }
            }
        });
        this.F = j15;
        frameLayout.addView(j14, w7.b6.e(44, 36, 51));
        viewGroup2.addView(j15, w7.b6.e(64, 48, 51));
        org.telegram.messenger.wp.r1(i10).r7.n(3, j11, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i10).f7;
        if (z10 && org.telegram.messenger.m5.w("topicssidetabs", j10, sharedPreferences, false)) {
            this.U = 1.0f;
            z11 = true;
            this.T = true;
        } else {
            z11 = true;
        }
        boolean z12 = (z10 && org.telegram.messenger.m5.w("topicssidetabsb", j10, sharedPreferences, false)) ? z11 : false;
        this.S = z12;
        j13.setImageResource(z12 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        r(false);
        j12.setImageResource(!this.S ? R.drawable.menu_sidebar_left : R.drawable.menu_sidebar_top);
        g(false);
        h();
        p();
        q();
    }

    public static void a(p21 p21Var, b51 b51Var) {
        if (p21Var.n) {
            org.telegram.messenger.k20 k20Var = p21Var.i0;
            if (k20Var != null) {
                k20Var.a(Long.valueOf(b51Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (b51Var.B == -2) {
            Runnable runnable = p21Var.h0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        org.telegram.messenger.k20 k20Var2 = p21Var.g0;
        if (k20Var2 != null) {
            k20Var2.a(Integer.valueOf(b51Var.d), Boolean.FALSE);
        }
    }

    public static void b(p21 p21Var) {
        boolean z10 = p21Var.T;
        boolean z11 = true;
        if (!z10 && p21Var.S && p21Var.c0 == null && !p21Var.V) {
            if (p21Var.d) {
                return;
            }
            p21Var.d = true;
            p21Var.r(true);
            return;
        }
        if ((r2 = p21Var.c0) != null) {
            z11 = false;
            p21Var.d(z11);
        } else {
            z11 = false;
            p21Var.d(z11);
        }
    }

    public static void c(p21 p21Var, ArrayList arrayList) {
        long j10 = p21Var.f;
        org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(p21Var.e).r7;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = c3.i0.j(((b51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        y00Var.w(arrayList2, j11);
        y00Var.y(j11, false);
    }

    public static ImageView j(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView e = org.telegram.messenger.a30.e(context, i10);
        e.setScaleType(ImageView.ScaleType.CENTER);
        e.setOnClickListener(onClickListener);
        w7.e6.a(e);
        return e;
    }

    private void setAttached(boolean z10) {
        if (this.f0 == z10) {
            return;
        }
        this.f0 = z10;
        int i10 = org.telegram.messenger.at.r;
        int i11 = org.telegram.messenger.at.q5;
        long j10 = this.f;
        int i12 = this.e;
        if (!z10) {
            long j11 = -j10;
            LongSparseIntArray longSparseIntArray = org.telegram.messenger.wp.r1(i12).r7.f;
            int i13 = longSparseIntArray.get(j11, 0) - 1;
            longSparseIntArray.put(j11, i13 >= 0 ? i13 : 0);
            org.telegram.messenger.at.f(i12).n(this, i11);
            org.telegram.messenger.at.f(i12).n(this, i10);
            return;
        }
        org.telegram.messenger.at.f(i12).c(this, i11);
        org.telegram.messenger.at.f(i12).c(this, i10);
        org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(i12).r7;
        long j12 = -j10;
        LongSparseIntArray longSparseIntArray2 = y00Var.f;
        longSparseIntArray2.put(j12, longSparseIntArray2.get(j12, 0) + 1);
        y00Var.y(j12, true);
    }

    @Override // fe.e
    public final void E(float f7, int i10) {
        if (i10 == 1 && f7 == 1.0f && this.d) {
            this.d = false;
            this.S = false;
            this.G.setImageResource(R.drawable.menu_sidebar_left);
            this.H.setImageResource(R.drawable.menu_sidebar_bottom);
            org.telegram.messenger.wp.r1(this.e).f7.edit().putBoolean("topicssidetabsb" + this.f, false).apply();
            r(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
    }

    public final void d(boolean z10) {
        if (this.T == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.V) {
                this.c0 = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.S = !this.S;
        }
        this.T = z10;
        this.V = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z10 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 28));
        this.d0.addListener(new ha0(7, this, z10));
        this.d0.setInterpolator(ci.o.V);
        this.d0.setDuration(250L);
        this.d0.start();
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.q5;
        long j10 = this.f;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != (-j10)) {
                return;
            }
            q();
        } else if (i10 == org.telegram.messenger.at.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.wp.D8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.wp.r1(this.e).r7.y(-j10, false);
                q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.I;
        if (frameLayout.getVisibility() == 0) {
            this.N.setBounds((int) frameLayout.getTranslationX(), (int) this.Q, (int) (frameLayout.getTranslationX() + org.telegram.messenger.i0.L(78.0f)), (int) (getMeasuredHeight() - this.P));
            this.N.draw(canvas);
        }
        FrameLayout frameLayout2 = this.x;
        if (frameLayout2.getVisibility() == 0) {
            this.O.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.O.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + org.telegram.messenger.i0.L(50.0f)));
            this.O.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.I) {
            canvas.clipPath(this.N.P.k);
        }
        if (view == this.x) {
            canvas.clipPath(this.O.P.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
        int f7 = i0.b.f(1.0f - this.U, w02, w03);
        int f10 = i0.b.f(this.U, w02, w03);
        boolean z10 = this.W;
        this.W = true;
        ImageView imageView = this.G;
        if (imageView != null && (!z10 || f7 != this.a0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        }
        this.a0 = f7;
        ImageView imageView2 = this.H;
        if (imageView2 != null && (!z10 || f10 != this.b0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.b0 = f10;
    }

    public final void f() {
        FrameLayout frameLayout = this.I;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.P + this.Q);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void g(boolean z10) {
        ArrayList l4 = org.telegram.messenger.wp.r1(this.e).r7.l(-this.f);
        this.a.a((l4 == null || l4.isEmpty() || this.j0) ? false : true, z10);
    }

    public l21 getCurrentTabsPosition() {
        return this.T ? l21.b : this.S ? l21.c : l21.a;
    }

    public float getSideMenuT() {
        return this.U * this.a.e;
    }

    public final void h() {
        fe.b bVar = this.M;
        float f7 = bVar.e;
        ImageView imageView = this.E;
        imageView.setAlpha(f7);
        imageView.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView.setVisibility(f7 > 0.0f ? 0 : 8);
        ImageView imageView2 = this.F;
        imageView2.setAlpha(f7);
        imageView2.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView2.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView2.setVisibility(f7 > 0.0f ? 0 : 8);
        float f10 = 1.0f - bVar.e;
        ImageView imageView3 = this.G;
        imageView3.setAlpha(f10);
        imageView3.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView3.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView3.setVisibility(f10 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.H;
        imageView4.setAlpha(f10);
        imageView4.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView4.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView4.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public final void i() {
        float T1 = org.telegram.messenger.i0.T1(1.0f, 0.0f, this.U);
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(T1);
        frameLayout.setVisibility((1.0f - this.b.e) * ((1.0f - this.U) * this.a.e) > 0.0f ? 0 : 8);
        if (this.S) {
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.i0.L(50.0f)) - this.P) + org.telegram.messenger.i0.W1(k(l21.c), org.telegram.messenger.i0.L(43.0f), 0));
        } else {
            frameLayout.setTranslationY(this.Q + org.telegram.messenger.i0.W1(k(l21.a), -org.telegram.messenger.i0.L(43.0f), 0));
        }
    }

    public final float k(l21 l21Var) {
        float f7 = (1.0f - this.b.e) * this.a.e;
        if (l21Var == l21.b) {
            return this.U * f7;
        }
        if ((l21Var != l21.a || this.S) && !(l21Var == l21.c && this.S)) {
            return 0.0f;
        }
        return (1.0f - this.U) * f7;
    }

    public final boolean l() {
        if (this.U <= 0.5f) {
            int i10 = 0;
            while (true) {
                d21 d21Var = this.y;
                if (i10 >= d21Var.getChildCount()) {
                    break;
                }
                b51 G = d21Var.f3.G(RecyclerView.R(d21Var.getChildAt(i10)));
                if (G != null && G.r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                f21 f21Var = this.J;
                if (i11 >= f21Var.getChildCount()) {
                    break;
                }
                b51 G2 = f21Var.f3.G(RecyclerView.R(f21Var.getChildAt(i11)));
                if (G2 != null && G2.r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(this.e).r7;
        long j10 = this.f;
        if (y00Var.e(-j10)) {
            return;
        }
        y00Var.o(-j10);
    }

    public final void n(long j10, boolean z10) {
        if (this.n) {
            org.telegram.messenger.k20 k20Var = this.i0;
            if (k20Var != null) {
                k20Var.a(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.k20 k20Var2 = this.g0;
        if (k20Var2 != null) {
            k20Var2.a(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        org.telegram.messenger.wp wpVar;
        final p21 p21Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i10;
        final p21 p21Var2;
        final z60 z60Var;
        boolean z11;
        final int i11;
        int i12 = this.e;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i12);
        long j10 = this.f;
        TLRPC.Chat L0 = j10 < 0 ? r12.L0(Long.valueOf(-j10)) : null;
        TLRPC.User Z1 = j10 > 0 ? r12.Z1(Long.valueOf(j10)) : null;
        final org.telegram.ui.un unVar = this.s;
        final z60 I = z60.I(unVar, view);
        int i13 = 1;
        final int i14 = 0;
        if (org.telegram.messenger.w3.p0(L0)) {
            long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
            if (o10 == 0 || !org.telegram.messenger.w3.A(i12, L0, 24)) {
                return false;
            }
            TLRPC.Chat chat = L0;
            z60Var = I;
            z60Var.c(R.drawable.msg_clear, org.telegram.messenger.dd.L0(2131752089, null), new ag.a3(this, z60Var, o10, chat, 5), false);
            long j11 = chat.id;
            if (org.telegram.messenger.w3.p0(chat) && org.telegram.messenger.w3.A(i12, chat, 24)) {
                long j12 = chat.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat L02 = org.telegram.messenger.wp.r1(i12).L0(Long.valueOf(j11));
            TLRPC.User Z12 = org.telegram.messenger.wp.r1(i12).Z1(Long.valueOf(o10));
            if (Z12 != null && org.telegram.messenger.w3.w(2, L02)) {
                z60Var.c(R.drawable.msg_remove, org.telegram.messenger.dd.L0(2131753726, null), null, false);
                org.telegram.ui.ActionBar.b1 y3 = z60Var.y();
                y3.setVisibility(8);
                org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i12);
                z11 z11Var = new z11(this, y3, z60Var, j11, Z12, L02);
                z60Var = z60Var;
                r13.K(true, L02, Z12, z11Var);
            }
            p21Var2 = this;
        } else {
            if (org.telegram.messenger.w3.y(15, L0) || org.telegram.messenger.i20.v(Z1)) {
                boolean z12 = tL_forumTopic.pinned;
                wpVar = r12;
                p21Var = this;
                tL_forumTopic2 = tL_forumTopic;
                I.c(z12 ? R.drawable.msg_unpin : R.drawable.msg_pin, org.telegram.messenger.dd.L0(z12 ? 2131751453 : 2131751454, null), new org.telegram.ui.fp((Object) this, (Object) I, (Object) wpVar, (Object) tL_forumTopic, 24), false);
                if (tL_forumTopic2.pinned && !z10) {
                    I.c(R.drawable.tabs_reorder, org.telegram.messenger.dd.L0(2131750708, null), new y11(p21Var, i13), false);
                }
                i10 = 15;
            } else {
                i10 = 15;
                tL_forumTopic2 = tL_forumTopic;
                wpVar = r12;
                p21Var = this;
            }
            if (org.telegram.messenger.w3.y(i10, L0) || org.telegram.messenger.i20.v(Z1)) {
                I.c(R.drawable.outline_profile_edit_24, org.telegram.messenger.dd.L0(2131751217, null), new Runnable(p21Var) { // from class: org.telegram.ui.Components.c21
                    public final /* synthetic */ p21 b;

                    {
                        this.b = p21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i14;
                        p21 p21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        z60 z60Var2 = I;
                        switch (i16) {
                            case 0:
                                z60Var2.u();
                                p21Var3.s.presentFragment(ja1.f0(-p21Var3.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                p21Var3.getClass();
                                z60Var2.u();
                                org.telegram.messenger.wp.r1(p21Var3.e).r7.z(tL_forumTopic3.id, -p21Var3.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                z60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(28);
                                p21 p21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p21Var4.getContext());
                                String J0 = org.telegram.messenger.dd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = p21Var4.e0;
                                if (hashSet.size() == 1) {
                                    i15 = 0;
                                    x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131751499, org.telegram.messenger.wp.r1(p21Var4.e).r7.f(-p21Var4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i15 = 0;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.lh(p21Var4, arrayList, j13, hashSet, szVar));
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new a21(i15));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            final long j13 = tL_forumTopic2.id;
            final int currentAccount = unVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.p6 resourceProvider = unVar.getResourceProvider();
            final long j14 = p21Var.f;
            yn ynVar = new yn(I, currentAccount, j14, j13, unVar, resourceProvider);
            final z60 J = I.J();
            J.c(R.drawable.msg_arrow_back, org.telegram.messenger.dd.L0(2131753756, null), new org.telegram.ui.qr0(I, 27), false);
            J.c(R.drawable.msg_tone_on, org.telegram.messenger.dd.L0(2131745293, null), new Runnable() { // from class: org.telegram.ui.Components.zn
                @Override // java.lang.Runnable
                public final void run() {
                    z60.this.u();
                    SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(currentAccount).e7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j15 = j14;
                    long j16 = j13;
                    sb2.append(org.telegram.messenger.pt.v(j15, j16, false));
                    boolean z13 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z14 = !z13;
                    sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.pt.v(j15, j16, false), z14).apply();
                    J.u();
                    org.telegram.ui.ActionBar.k2 k2Var = unVar;
                    if (cc.a(k2Var)) {
                        cc.S(z13 ? 1 : 0, k2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.b1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, org.telegram.messenger.dd.L0(2131748323, null), new ag.g3(I, resourceProvider, currentAccount, ynVar, 16), false);
            J.c(R.drawable.msg_customize, org.telegram.messenger.dd.L0(2131747933, null), new mg.n0(I, j14, j13, unVar, resourceProvider), false);
            J.c(0, "", new org.telegram.messenger.nn(I, currentAccount, j14, j13, unVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.b1 y11 = J.y();
            new Runnable() { // from class: org.telegram.ui.Components.ao
                @Override // java.lang.Runnable
                public final void run() {
                    int i15;
                    int i16 = currentAccount;
                    org.telegram.messenger.wp r14 = org.telegram.messenger.wp.r1(i16);
                    long j15 = j14;
                    long j16 = j13;
                    boolean q22 = r14.q2(j15, j16, null);
                    org.telegram.ui.ActionBar.b1 b1Var = y11;
                    org.telegram.ui.ActionBar.b1 b1Var2 = y10;
                    if (q22) {
                        b1Var.j(org.telegram.messenger.dd.L0(2131743873, null), R.drawable.msg_unmute, null);
                        i15 = org.telegram.ui.ActionBar.t6.x6;
                        b1Var2.setVisibility(8);
                    } else {
                        b1Var.j(org.telegram.messenger.dd.L0(2131748321, null), R.drawable.msg_mute, null);
                        int i17 = org.telegram.ui.ActionBar.t6.q7;
                        b1Var2.setVisibility(0);
                        if (org.telegram.messenger.wp.r1(i16).r2(j15, j16)) {
                            b1Var2.j(org.telegram.messenger.dd.L0(2131745295, null), R.drawable.msg_tone_off, null);
                        } else {
                            b1Var2.j(org.telegram.messenger.dd.L0(2131745293, null), R.drawable.msg_tone_on, null);
                        }
                        i15 = i17;
                    }
                    go.c(b1Var, i15);
                }
            }.run();
            long j15 = tL_forumTopic2.id;
            long j16 = p21Var.f;
            org.telegram.messenger.wp wpVar2 = wpVar;
            boolean q22 = wpVar2.q2(j16, j15, null);
            int i15 = q22 ? R.drawable.msg_unmute : R.drawable.msg_mute;
            int i16 = q22 ? 2131743874 : 2131748329;
            TLRPC.Chat chat2 = L0;
            p21Var2 = this;
            z60Var = I;
            z60Var.c(i15, org.telegram.messenger.dd.L0(i16, null), new ag.e3(p21Var2, wpVar2, tL_forumTopic, I, J, 22), false);
            if (!org.telegram.messenger.w3.i(i12, chat2, tL_forumTopic) || org.telegram.messenger.i20.u(Z1)) {
                z11 = false;
                i11 = 1;
            } else {
                boolean z13 = tL_forumTopic.closed;
                i11 = 1;
                z11 = false;
                z60Var.c(z13 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, org.telegram.messenger.dd.L0(z13 ? 2131746101 : 2131752039, null), new Runnable(p21Var2) { // from class: org.telegram.ui.Components.c21
                    public final /* synthetic */ p21 b;

                    {
                        this.b = p21Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i152;
                        int i162 = i11;
                        p21 p21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        z60 z60Var2 = z60Var;
                        switch (i162) {
                            case 0:
                                z60Var2.u();
                                p21Var3.s.presentFragment(ja1.f0(-p21Var3.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                p21Var3.getClass();
                                z60Var2.u();
                                org.telegram.messenger.wp.r1(p21Var3.e).r7.z(tL_forumTopic3.id, -p21Var3.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                z60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(28);
                                p21 p21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p21Var4.getContext());
                                String J0 = org.telegram.messenger.dd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = p21Var4.e0;
                                if (hashSet.size() == 1) {
                                    i152 = 0;
                                    x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131751499, org.telegram.messenger.wp.r1(p21Var4.e).r7.f(-p21Var4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i152 = 0;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.lh(p21Var4, arrayList, j132, hashSet, szVar));
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new a21(i152));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (org.telegram.messenger.w3.e(i12, chat2, tL_forumTopic)) {
                final int i17 = 2;
                z60Var.c(R.drawable.msg_delete, org.telegram.messenger.dd.J0(i11, "DeleteTopics"), new Runnable(p21Var2) { // from class: org.telegram.ui.Components.c21
                    public final /* synthetic */ p21 b;

                    {
                        this.b = p21Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i152;
                        int i162 = i17;
                        p21 p21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        z60 z60Var2 = z60Var;
                        switch (i162) {
                            case 0:
                                z60Var2.u();
                                p21Var3.s.presentFragment(ja1.f0(-p21Var3.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                p21Var3.getClass();
                                z60Var2.u();
                                org.telegram.messenger.wp.r1(p21Var3.e).r7.z(tL_forumTopic3.id, -p21Var3.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                z60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(28);
                                p21 p21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p21Var4.getContext());
                                String J0 = org.telegram.messenger.dd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = p21Var4.e0;
                                if (hashSet.size() == 1) {
                                    i152 = 0;
                                    x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131751499, org.telegram.messenger.wp.r1(p21Var4.e).r7.f(-p21Var4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i152 = 0;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.lh(p21Var4, arrayList, j132, hashSet, szVar));
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new a21(i152));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, z11);
            }
        }
        boolean z14 = view instanceof k21;
        org.telegram.ui.ActionBar.p6 p6Var = p21Var2.h;
        if (z14) {
            g21 g21Var = new g21();
            Paint paint = new Paint(1);
            g21Var.a = paint;
            g21Var.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, p6Var));
            z60Var.W(g21Var);
            z60Var.a0(org.telegram.messenger.i0.L(16.0f), 0.0f);
        } else if (z10) {
            z60Var.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var)));
            z60Var.V(5);
        } else {
            int L = org.telegram.messenger.i0.L(5.0f);
            int L2 = org.telegram.messenger.i0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var);
            float f7 = 0;
            float f10 = L;
            float f11 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f7, f7, f10, f10, f11, f11, f7, f7}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            z60Var.W(shapeDrawable);
        }
        z60Var.Z();
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        i();
    }

    public final void p() {
        org.telegram.ui.me meVar = this.R;
        if (meVar != null) {
            meVar.run();
        }
        i();
        float k10 = k(l21.b);
        float W1 = org.telegram.messenger.i0.W1(k10, -org.telegram.messenger.i0.L(78.0f), 0);
        FrameLayout frameLayout = this.I;
        frameLayout.setTranslationX(W1);
        frameLayout.setVisibility(k10 <= 0.0f ? 8 : 0);
        e();
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.E;
        org.telegram.ui.ActionBar.p6 p6Var = this.h;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, mode);
        org.telegram.ui.ActionBar.a7.t(this.F, i10, p6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        d21 d21Var = this.y;
        boolean canScrollHorizontally = d21Var.canScrollHorizontally(-1);
        d21Var.f3.O(true);
        if (!canScrollHorizontally) {
            d21Var.v0(0);
        }
        f21 f21Var = this.J;
        boolean canScrollVertically = f21Var.canScrollVertically(-1);
        f21Var.f3.O(true);
        if (!canScrollVertically) {
            f21Var.v0(0);
        }
        org.telegram.messenger.i0.g3(new y11(this, 0));
    }

    public final void r(boolean z10) {
        this.b.a(!this.c || this.d, z10);
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.j0 != z10) {
            this.j0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        this.e0 = j10;
        d21 d21Var = this.y;
        d21Var.f3.O(true);
        d21Var.invalidate();
        this.J.f3.O(true);
        o21 o21Var = this.D;
        if (o21Var != null) {
            o21Var.c(true, false, j10 == 0);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.k20 k20Var) {
        this.i0 = k20Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.k20 k20Var) {
        this.g0 = k20Var;
    }

    public void setSideMenuBackgroundDrawable(vg.f fVar) {
        this.N = fVar;
        fVar.q(org.telegram.messenger.i0.L(16.0f));
        this.N.p(org.telegram.messenger.i0.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f7) {
        this.P = f7;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f7) {
        this.Q = f7;
        this.I.setTranslationY(f7);
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

    public void setTopMenuBackgroundDrawable(vg.f fVar) {
        this.O = fVar;
        fVar.q(org.telegram.messenger.i0.L(18.0f));
        this.O.p(org.telegram.messenger.i0.L(7.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            e();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        p();
    }
}
