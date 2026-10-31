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
import org.telegram.ui.la1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o21 extends FrameLayout implements org.telegram.messenger.us, fe.e, org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int o0 = 0;
    public final boolean D;
    public final FrameLayout E;
    public final c21 F;
    public final n21 G;
    public final ImageView H;
    public final ImageView I;
    public final ImageView J;
    public final ImageView K;
    public final FrameLayout L;
    public final e21 M;
    public long N;
    public long O;
    public final fe.b P;
    public vg.f Q;
    public vg.f R;
    public float S;
    public float T;
    public org.telegram.ui.me U;
    public boolean V;
    public boolean W;
    public final fe.b a;
    public float a0;
    public final fe.b b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final boolean d;
    public int d0;
    public boolean e;
    public int e0;
    public org.telegram.ui.me f;
    public Boolean f0;
    public ValueAnimator g0;
    public boolean h;
    public long h0;
    public boolean i0;
    public org.telegram.messenger.j20 j0;
    public Runnable k0;
    public org.telegram.messenger.j20 l0;
    public boolean m0;
    public final int n;
    public final HashSet n0;
    public final long r;
    public final org.telegram.ui.ActionBar.p6 s;
    public final boolean w;
    public final boolean x;
    public final org.telegram.ui.un y;

    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.ui.Components.v11] */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.ui.Components.v11] */
    public o21(Activity activity, org.telegram.ui.un unVar, int i10, long j10, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        boolean z11;
        gr grVar = gr.h;
        this.a = new fe.b(0, this, grVar, 380L, true);
        this.b = new fe.b(1, this, grVar, 380L, false);
        final int i11 = 0;
        this.P = new fe.b(0, new w11(this), grVar, 320L, false);
        this.a0 = 0.0f;
        this.n0 = new HashSet();
        this.y = unVar;
        this.c = z10;
        final int i12 = 1;
        boolean z12 = z10 && org.telegram.messenger.h20.u(org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10)));
        this.d = z12;
        this.n = i10;
        this.r = j10;
        this.s = p6Var;
        long j11 = -j10;
        this.w = org.telegram.messenger.w3.p0(org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j11)));
        boolean v = org.telegram.messenger.h20.v(org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10)));
        this.x = v;
        this.D = !org.telegram.messenger.m5.w("topics_end_reached_", j11, org.telegram.messenger.d20.i(i10).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.E = frameLayout;
        addView(frameLayout, w7.b6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.L = frameLayout2;
        addView(frameLayout2, w7.b6.d(64, -1.0f, org.telegram.messenger.zs.A1, 7.0f, 7.0f, 7.0f, 7.0f));
        c21 c21Var = new c21(this, activity, i10, new org.telegram.messenger.j20(this) { // from class: org.telegram.ui.Components.v11
            public final /* synthetic */ o21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                boolean z13;
                int i13;
                long j12;
                org.telegram.messenger.x00 x00Var;
                long j13;
                ArrayList arrayList;
                boolean z14;
                boolean z15;
                long j14;
                long j15;
                int i14 = i11;
                o21 o21Var = this.b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        boolean z16 = o21Var.x;
                        int i15 = o21Var.n;
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i15);
                        long j16 = o21Var.r;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.x00 x00Var2 = org.telegram.messenger.vp.r1(i15).r7;
                        ArrayList l4 = x00Var2.l(j17);
                        boolean z17 = o21Var.w;
                        int i16 = i21.b;
                        a51 K = a51.K(i21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z17;
                        K.L(o21Var.h0 == 0);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z13 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z16) {
                                    i13 = i18;
                                    if (tL_forumTopic.id == 1) {
                                        size = i19;
                                        i17 = i13;
                                    }
                                } else {
                                    i13 = i18;
                                }
                                if (o21Var.n0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i19;
                                    i17 = i13;
                                } else {
                                    boolean z18 = tL_forumTopic.pinned;
                                    if (!z18 && z13) {
                                        if (!arrayList2.isEmpty()) {
                                            ((a51) i0.a.g(1, arrayList2)).y |= 8;
                                        }
                                        p51Var.L();
                                        z13 = false;
                                    } else if (z18 && !z13) {
                                        p51Var.M();
                                        z13 = true;
                                    }
                                    a51 K2 = a51.K(i21.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z17) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = o21Var.h0;
                                    if (z17) {
                                        x00Var = x00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        x00Var = x00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i13;
                                    x00Var2 = x00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z13 = false;
                        }
                        org.telegram.messenger.x00 x00Var3 = x00Var2;
                        if (z13) {
                            p51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !x00Var3.e(j17) && o21Var.D) {
                            a51 K3 = a51.K(i21.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            a51 K4 = a51.K(i21.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            a51 K5 = a51.K(i21.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z16 && !z17) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.h20.v(Z1)) {
                                a51 K6 = a51.K(i21.class);
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
                        o21.c(o21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p51 p51Var2 = (p51) obj2;
                        boolean z19 = o21Var.w;
                        int i20 = o21Var.n;
                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i20);
                        long j19 = o21Var.r;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.x00 x00Var4 = org.telegram.messenger.vp.r1(i20).r7;
                        ArrayList l10 = x00Var4.l(j20);
                        boolean z20 = o21Var.x;
                        if (z20) {
                            arrayList = l10;
                        } else {
                            int i21 = m21.b;
                            a51 K7 = a51.K(m21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z19;
                            K7.y = z20 ? 1 : 0;
                            K7.L(o21Var.h0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z21 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z20) {
                                    z15 = z21;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z21 = z15;
                                    }
                                } else {
                                    z15 = z21;
                                }
                                if (o21Var.n0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z21 = z15;
                                } else {
                                    boolean z22 = tL_forumTopic2.pinned;
                                    if (!z22 && z15) {
                                        p51Var2.L();
                                        z21 = false;
                                    } else if (!z22 || z15) {
                                        z21 = z15;
                                    } else {
                                        p51Var2.M();
                                        z21 = true;
                                    }
                                    int i24 = m21.b;
                                    a51 K8 = a51.K(m21.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z19) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = o21Var.h0;
                                    if (z19) {
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
                            z14 = z21;
                        } else {
                            z14 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z14) {
                            p51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !x00Var4.e(j20) && o21Var.D) {
                            int i25 = m21.b;
                            a51 K9 = a51.K(m21.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            a51 K10 = a51.K(m21.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            a51 K11 = a51.K(m21.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z20 && !z19) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.h20.v(user2)) {
                                int i26 = m21.b;
                                a51 K12 = a51.K(m21.class);
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
        }, new w11(this), new w11(this), p6Var);
        this.F = c21Var;
        c21Var.E1(new org.telegram.messenger.j20(this) { // from class: org.telegram.ui.Components.v11
            public final /* synthetic */ o21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                boolean z13;
                int i13;
                long j12;
                org.telegram.messenger.x00 x00Var;
                long j13;
                ArrayList arrayList;
                boolean z14;
                boolean z15;
                long j14;
                long j15;
                int i14 = i12;
                o21 o21Var = this.b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        boolean z16 = o21Var.x;
                        int i15 = o21Var.n;
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i15);
                        long j16 = o21Var.r;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.x00 x00Var2 = org.telegram.messenger.vp.r1(i15).r7;
                        ArrayList l4 = x00Var2.l(j17);
                        boolean z17 = o21Var.w;
                        int i16 = i21.b;
                        a51 K = a51.K(i21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z17;
                        K.L(o21Var.h0 == 0);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z13 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z16) {
                                    i13 = i18;
                                    if (tL_forumTopic.id == 1) {
                                        size = i19;
                                        i17 = i13;
                                    }
                                } else {
                                    i13 = i18;
                                }
                                if (o21Var.n0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i19;
                                    i17 = i13;
                                } else {
                                    boolean z18 = tL_forumTopic.pinned;
                                    if (!z18 && z13) {
                                        if (!arrayList2.isEmpty()) {
                                            ((a51) i0.a.g(1, arrayList2)).y |= 8;
                                        }
                                        p51Var.L();
                                        z13 = false;
                                    } else if (z18 && !z13) {
                                        p51Var.M();
                                        z13 = true;
                                    }
                                    a51 K2 = a51.K(i21.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z17) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = o21Var.h0;
                                    if (z17) {
                                        x00Var = x00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        x00Var = x00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i13;
                                    x00Var2 = x00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z13 = false;
                        }
                        org.telegram.messenger.x00 x00Var3 = x00Var2;
                        if (z13) {
                            p51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !x00Var3.e(j17) && o21Var.D) {
                            a51 K3 = a51.K(i21.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            a51 K4 = a51.K(i21.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            a51 K5 = a51.K(i21.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z16 && !z17) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.h20.v(Z1)) {
                                a51 K6 = a51.K(i21.class);
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
                        o21.c(o21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p51 p51Var2 = (p51) obj2;
                        boolean z19 = o21Var.w;
                        int i20 = o21Var.n;
                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i20);
                        long j19 = o21Var.r;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.x00 x00Var4 = org.telegram.messenger.vp.r1(i20).r7;
                        ArrayList l10 = x00Var4.l(j20);
                        boolean z20 = o21Var.x;
                        if (z20) {
                            arrayList = l10;
                        } else {
                            int i21 = m21.b;
                            a51 K7 = a51.K(m21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z19;
                            K7.y = z20 ? 1 : 0;
                            K7.L(o21Var.h0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z21 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z20) {
                                    z15 = z21;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z21 = z15;
                                    }
                                } else {
                                    z15 = z21;
                                }
                                if (o21Var.n0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z21 = z15;
                                } else {
                                    boolean z22 = tL_forumTopic2.pinned;
                                    if (!z22 && z15) {
                                        p51Var2.L();
                                        z21 = false;
                                    } else if (!z22 || z15) {
                                        z21 = z15;
                                    } else {
                                        p51Var2.M();
                                        z21 = true;
                                    }
                                    int i24 = m21.b;
                                    a51 K8 = a51.K(m21.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z19) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = o21Var.h0;
                                    if (z19) {
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
                            z14 = z21;
                        } else {
                            z14 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z14) {
                            p51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !x00Var4.e(j20) && o21Var.D) {
                            int i25 = m21.b;
                            a51 K9 = a51.K(m21.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            a51 K10 = a51.K(m21.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            a51 K11 = a51.K(m21.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z20 && !z19) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.h20.v(user2)) {
                                int i26 = m21.b;
                                a51 K12 = a51.K(m21.class);
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
        c21Var.setWillNotDraw(false);
        c21Var.f3.r = false;
        c21Var.getContext();
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) c21Var, 6);
        c21Var.e3 = brVar;
        c21Var.setLayoutManager(brVar);
        frameLayout.addView(c21Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 41.0f, 0.0f, 0.0f, 0.0f));
        c21Var.j(new d21(this, i11));
        if (v) {
            n21 n21Var = new n21(i10, activity, p6Var);
            this.G = n21Var;
            n21Var.c(true, false, this.h0 == 0);
            n21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u11
                public final /* synthetic */ o21 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            o21 o21Var = this.b;
                            e21 e21Var = o21Var.M;
                            e21Var.z1(false);
                            c21 c21Var2 = o21Var.F;
                            c21Var2.z1(false);
                            o21Var.P.a(false, true);
                            org.telegram.messenger.i0.a4(e21Var);
                            org.telegram.messenger.i0.a4(c21Var2);
                            break;
                        case 1:
                            this.b.j0.a(0, Boolean.FALSE);
                            break;
                        default:
                            o21.b(this.b);
                            break;
                    }
                }
            });
            frameLayout2.addView(n21Var, w7.b6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            this.G = null;
        }
        final int i13 = 2;
        e21 e21Var = new e21(activity, i10, new org.telegram.messenger.j20(this) { // from class: org.telegram.ui.Components.v11
            public final /* synthetic */ o21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                boolean z13;
                int i132;
                long j12;
                org.telegram.messenger.x00 x00Var;
                long j13;
                ArrayList arrayList;
                boolean z14;
                boolean z15;
                long j14;
                long j15;
                int i14 = i13;
                o21 o21Var = this.b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        boolean z16 = o21Var.x;
                        int i15 = o21Var.n;
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i15);
                        long j16 = o21Var.r;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.x00 x00Var2 = org.telegram.messenger.vp.r1(i15).r7;
                        ArrayList l4 = x00Var2.l(j17);
                        boolean z17 = o21Var.w;
                        int i16 = i21.b;
                        a51 K = a51.K(i21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z17;
                        K.L(o21Var.h0 == 0);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z13 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z16) {
                                    i132 = i18;
                                    if (tL_forumTopic.id == 1) {
                                        size = i19;
                                        i17 = i132;
                                    }
                                } else {
                                    i132 = i18;
                                }
                                if (o21Var.n0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i19;
                                    i17 = i132;
                                } else {
                                    boolean z18 = tL_forumTopic.pinned;
                                    if (!z18 && z13) {
                                        if (!arrayList2.isEmpty()) {
                                            ((a51) i0.a.g(1, arrayList2)).y |= 8;
                                        }
                                        p51Var.L();
                                        z13 = false;
                                    } else if (z18 && !z13) {
                                        p51Var.M();
                                        z13 = true;
                                    }
                                    a51 K2 = a51.K(i21.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z17) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = o21Var.h0;
                                    if (z17) {
                                        x00Var = x00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        x00Var = x00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i132;
                                    x00Var2 = x00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z13 = false;
                        }
                        org.telegram.messenger.x00 x00Var3 = x00Var2;
                        if (z13) {
                            p51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !x00Var3.e(j17) && o21Var.D) {
                            a51 K3 = a51.K(i21.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            a51 K4 = a51.K(i21.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            a51 K5 = a51.K(i21.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z16 && !z17) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.h20.v(Z1)) {
                                a51 K6 = a51.K(i21.class);
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
                        o21.c(o21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p51 p51Var2 = (p51) obj2;
                        boolean z19 = o21Var.w;
                        int i20 = o21Var.n;
                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i20);
                        long j19 = o21Var.r;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.x00 x00Var4 = org.telegram.messenger.vp.r1(i20).r7;
                        ArrayList l10 = x00Var4.l(j20);
                        boolean z20 = o21Var.x;
                        if (z20) {
                            arrayList = l10;
                        } else {
                            int i21 = m21.b;
                            a51 K7 = a51.K(m21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z19;
                            K7.y = z20 ? 1 : 0;
                            K7.L(o21Var.h0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z21 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z20) {
                                    z15 = z21;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z21 = z15;
                                    }
                                } else {
                                    z15 = z21;
                                }
                                if (o21Var.n0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z21 = z15;
                                } else {
                                    boolean z22 = tL_forumTopic2.pinned;
                                    if (!z22 && z15) {
                                        p51Var2.L();
                                        z21 = false;
                                    } else if (!z22 || z15) {
                                        z21 = z15;
                                    } else {
                                        p51Var2.M();
                                        z21 = true;
                                    }
                                    int i24 = m21.b;
                                    a51 K8 = a51.K(m21.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z19) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = o21Var.h0;
                                    if (z19) {
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
                            z14 = z21;
                        } else {
                            z14 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z14) {
                            p51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !x00Var4.e(j20) && o21Var.D) {
                            int i25 = m21.b;
                            a51 K9 = a51.K(m21.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            a51 K10 = a51.K(m21.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            a51 K11 = a51.K(m21.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z20 && !z19) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.h20.v(user2)) {
                                int i26 = m21.b;
                                a51 K12 = a51.K(m21.class);
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
        }, new w11(this), new w11(this), p6Var);
        this.M = e21Var;
        e21Var.E1(new org.telegram.messenger.j20(this) { // from class: org.telegram.ui.Components.v11
            public final /* synthetic */ o21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                boolean z13;
                int i132;
                long j12;
                org.telegram.messenger.x00 x00Var;
                long j13;
                ArrayList arrayList;
                boolean z14;
                boolean z15;
                long j14;
                long j15;
                int i14 = i12;
                o21 o21Var = this.b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        boolean z16 = o21Var.x;
                        int i15 = o21Var.n;
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i15);
                        long j16 = o21Var.r;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.x00 x00Var2 = org.telegram.messenger.vp.r1(i15).r7;
                        ArrayList l4 = x00Var2.l(j17);
                        boolean z17 = o21Var.w;
                        int i16 = i21.b;
                        a51 K = a51.K(i21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z17;
                        K.L(o21Var.h0 == 0);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z13 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z16) {
                                    i132 = i18;
                                    if (tL_forumTopic.id == 1) {
                                        size = i19;
                                        i17 = i132;
                                    }
                                } else {
                                    i132 = i18;
                                }
                                if (o21Var.n0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i19;
                                    i17 = i132;
                                } else {
                                    boolean z18 = tL_forumTopic.pinned;
                                    if (!z18 && z13) {
                                        if (!arrayList2.isEmpty()) {
                                            ((a51) i0.a.g(1, arrayList2)).y |= 8;
                                        }
                                        p51Var.L();
                                        z13 = false;
                                    } else if (z18 && !z13) {
                                        p51Var.M();
                                        z13 = true;
                                    }
                                    a51 K2 = a51.K(i21.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z17) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = o21Var.h0;
                                    if (z17) {
                                        x00Var = x00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        x00Var = x00Var2;
                                        j13 = tL_forumTopic.id;
                                    }
                                    K2.L(j18 == j13);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i132;
                                    x00Var2 = x00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z13 = false;
                        }
                        org.telegram.messenger.x00 x00Var3 = x00Var2;
                        if (z13) {
                            p51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !x00Var3.e(j17) && o21Var.D) {
                            a51 K3 = a51.K(i21.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            a51 K4 = a51.K(i21.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            a51 K5 = a51.K(i21.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z16 && !z17) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.h20.v(Z1)) {
                                a51 K6 = a51.K(i21.class);
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
                        o21.c(o21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p51 p51Var2 = (p51) obj2;
                        boolean z19 = o21Var.w;
                        int i20 = o21Var.n;
                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i20);
                        long j19 = o21Var.r;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.x00 x00Var4 = org.telegram.messenger.vp.r1(i20).r7;
                        ArrayList l10 = x00Var4.l(j20);
                        boolean z20 = o21Var.x;
                        if (z20) {
                            arrayList = l10;
                        } else {
                            int i21 = m21.b;
                            a51 K7 = a51.K(m21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z19;
                            K7.y = z20 ? 1 : 0;
                            K7.L(o21Var.h0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z21 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z20) {
                                    z15 = z21;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z21 = z15;
                                    }
                                } else {
                                    z15 = z21;
                                }
                                if (o21Var.n0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z21 = z15;
                                } else {
                                    boolean z22 = tL_forumTopic2.pinned;
                                    if (!z22 && z15) {
                                        p51Var2.L();
                                        z21 = false;
                                    } else if (!z22 || z15) {
                                        z21 = z15;
                                    } else {
                                        p51Var2.M();
                                        z21 = true;
                                    }
                                    int i24 = m21.b;
                                    a51 K8 = a51.K(m21.class);
                                    K8.x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z19) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = o21Var.h0;
                                    if (z19) {
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
                            z14 = z21;
                        } else {
                            z14 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z14) {
                            p51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !x00Var4.e(j20) && o21Var.D) {
                            int i25 = m21.b;
                            a51 K9 = a51.K(m21.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            a51 K10 = a51.K(m21.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            a51 K11 = a51.K(m21.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z20 && !z19) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.h20.v(user2)) {
                                int i26 = m21.b;
                                a51 K12 = a51.K(m21.class);
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
        e21Var.f3.r = false;
        e21Var.setClipToPadding(false);
        e21Var.setClipChildren(false);
        frameLayout2.addView(e21Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, v ? 90.0f : 48.0f, 0.0f, 0.0f));
        e21Var.j(new d21(this, i12));
        final int i14 = 2;
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u11
            public final /* synthetic */ o21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        o21 o21Var = this.b;
                        e21 e21Var2 = o21Var.M;
                        e21Var2.z1(false);
                        c21 c21Var2 = o21Var.F;
                        c21Var2.z1(false);
                        o21Var.P.a(false, true);
                        org.telegram.messenger.i0.a4(e21Var2);
                        org.telegram.messenger.i0.a4(c21Var2);
                        break;
                    case 1:
                        this.b.j0.a(0, Boolean.FALSE);
                        break;
                    default:
                        o21.b(this.b);
                        break;
                }
            }
        });
        this.J = j12;
        ImageView j13 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u11
            public final /* synthetic */ o21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        o21 o21Var = this.b;
                        e21 e21Var2 = o21Var.M;
                        e21Var2.z1(false);
                        c21 c21Var2 = o21Var.F;
                        c21Var2.z1(false);
                        o21Var.P.a(false, true);
                        org.telegram.messenger.i0.a4(e21Var2);
                        org.telegram.messenger.i0.a4(c21Var2);
                        break;
                    case 1:
                        this.b.j0.a(0, Boolean.FALSE);
                        break;
                    default:
                        o21.b(this.b);
                        break;
                }
            }
        });
        this.K = j13;
        frameLayout.addView(j12, w7.b6.e(44, 36, 51));
        frameLayout2.addView(j13, w7.b6.e(64, 48, 51));
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u11
            public final /* synthetic */ o21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o21 o21Var = this.b;
                        e21 e21Var2 = o21Var.M;
                        e21Var2.z1(false);
                        c21 c21Var2 = o21Var.F;
                        c21Var2.z1(false);
                        o21Var.P.a(false, true);
                        org.telegram.messenger.i0.a4(e21Var2);
                        org.telegram.messenger.i0.a4(c21Var2);
                        break;
                    case 1:
                        this.b.j0.a(0, Boolean.FALSE);
                        break;
                    default:
                        o21.b(this.b);
                        break;
                }
            }
        });
        this.H = j14;
        ImageView j15 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u11
            public final /* synthetic */ o21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o21 o21Var = this.b;
                        e21 e21Var2 = o21Var.M;
                        e21Var2.z1(false);
                        c21 c21Var2 = o21Var.F;
                        c21Var2.z1(false);
                        o21Var.P.a(false, true);
                        org.telegram.messenger.i0.a4(e21Var2);
                        org.telegram.messenger.i0.a4(c21Var2);
                        break;
                    case 1:
                        this.b.j0.a(0, Boolean.FALSE);
                        break;
                    default:
                        o21.b(this.b);
                        break;
                }
            }
        });
        this.I = j15;
        frameLayout.addView(j14, w7.b6.e(44, 36, 51));
        frameLayout2.addView(j15, w7.b6.e(64, 48, 51));
        org.telegram.messenger.vp.r1(i10).r7.n(3, j11, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).f7;
        if (z10 && org.telegram.messenger.m5.w("topicssidetabs", j10, sharedPreferences, false)) {
            this.a0 = 1.0f;
            z11 = true;
            this.W = true;
        } else {
            z11 = true;
        }
        boolean z13 = (z10 && org.telegram.messenger.m5.w("topicssidetabsb", j10, sharedPreferences, false)) ? z11 : false;
        this.V = z13;
        j13.setImageResource(z13 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        this.e = (z12 && !this.W && org.telegram.messenger.m5.w("topicssidepanel", j10, sharedPreferences, false)) ? z11 : false;
        r(false);
        s();
        g(false);
        h();
        p();
        q();
    }

    public static void a(o21 o21Var, a51 a51Var) {
        if (o21Var.w) {
            org.telegram.messenger.j20 j20Var = o21Var.l0;
            if (j20Var != null) {
                j20Var.a(Long.valueOf(a51Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (a51Var.B == -2) {
            Runnable runnable = o21Var.k0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        org.telegram.messenger.j20 j20Var2 = o21Var.j0;
        if (j20Var2 != null) {
            j20Var2.a(Integer.valueOf(a51Var.d), Boolean.FALSE);
        }
    }

    public static void b(o21 o21Var) {
        boolean z10 = o21Var.W;
        boolean z11 = true;
        if (z10 || !o21Var.V || o21Var.f0 != null || o21Var.b0) {
            if ((r2 = o21Var.f0) != null) {
                z11 = false;
                o21Var.d(z11);
                return;
            } else {
                z11 = false;
                o21Var.d(z11);
                return;
            }
        }
        if (o21Var.d) {
            o21Var.setSidebarMode(true);
        } else {
            if (o21Var.h) {
                return;
            }
            o21Var.h = true;
            o21Var.r(true);
        }
    }

    public static void c(o21 o21Var, ArrayList arrayList) {
        long j10 = o21Var.r;
        org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(o21Var.n).r7;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = c3.i0.j(((a51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        x00Var.w(arrayList2, j11);
        x00Var.y(j11, false);
    }

    public static ImageView j(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView e = org.telegram.messenger.z20.e(context, i10);
        e.setScaleType(ImageView.ScaleType.CENTER);
        e.setOnClickListener(onClickListener);
        w7.e6.a(e);
        return e;
    }

    private void setAttached(boolean z10) {
        if (this.i0 == z10) {
            return;
        }
        this.i0 = z10;
        int i10 = org.telegram.messenger.zs.r;
        int i11 = org.telegram.messenger.zs.q5;
        long j10 = this.r;
        int i12 = this.n;
        if (!z10) {
            long j11 = -j10;
            LongSparseIntArray longSparseIntArray = org.telegram.messenger.vp.r1(i12).r7.f;
            int i13 = longSparseIntArray.get(j11, 0) - 1;
            longSparseIntArray.put(j11, i13 >= 0 ? i13 : 0);
            org.telegram.messenger.zs.f(i12).n(this, i11);
            org.telegram.messenger.zs.f(i12).n(this, i10);
            return;
        }
        org.telegram.messenger.zs.f(i12).c(this, i11);
        org.telegram.messenger.zs.f(i12).c(this, i10);
        org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(i12).r7;
        long j12 = -j10;
        LongSparseIntArray longSparseIntArray2 = x00Var.f;
        longSparseIntArray2.put(j12, longSparseIntArray2.get(j12, 0) + 1);
        x00Var.y(j12, true);
    }

    @Override // fe.e
    public final void E(float f7, int i10) {
        if (i10 == 1 && f7 == 1.0f && this.h) {
            this.h = false;
            this.V = false;
            s();
            this.K.setImageResource(R.drawable.menu_sidebar_bottom);
            org.telegram.messenger.vp.r1(this.n).f7.edit().putBoolean("topicssidetabsb" + this.r, false).apply();
            r(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
    }

    public final void d(boolean z10) {
        if (this.W == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.b0) {
                this.f0 = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.V = !this.V;
        }
        this.W = z10;
        this.b0 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 28));
        this.g0.addListener(new ha0(7, this, z10));
        this.g0.setInterpolator(ci.o.V);
        this.g0.setDuration(250L);
        this.g0.start();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.q5;
        long j10 = this.r;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != (-j10)) {
                return;
            }
            q();
        } else if (i10 == org.telegram.messenger.zs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.vp.D8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.vp.r1(this.n).r7.y(-j10, false);
                q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.L;
        if (frameLayout.getVisibility() == 0) {
            this.Q.setBounds((int) frameLayout.getTranslationX(), (int) this.T, (int) (frameLayout.getTranslationX() + org.telegram.messenger.i0.L(78.0f)), (int) (getMeasuredHeight() - this.S));
            this.Q.draw(canvas);
        }
        FrameLayout frameLayout2 = this.E;
        if (frameLayout2.getVisibility() == 0) {
            this.R.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.R.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + org.telegram.messenger.i0.L(50.0f)));
            this.R.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.L) {
            canvas.clipPath(this.Q.M.k);
        }
        if (view == this.E) {
            canvas.clipPath(this.R.M.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.s;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
        int f7 = i0.b.f(1.0f - this.a0, w02, w03);
        int f10 = i0.b.f(this.a0, w02, w03);
        boolean z10 = this.c0;
        this.c0 = true;
        ImageView imageView = this.J;
        if (imageView != null && (!z10 || f7 != this.d0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        }
        this.d0 = f7;
        ImageView imageView2 = this.K;
        if (imageView2 != null && (!z10 || f10 != this.e0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.e0 = f10;
    }

    public final void f() {
        FrameLayout frameLayout = this.L;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.S + this.T);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void g(boolean z10) {
        ArrayList l4 = org.telegram.messenger.vp.r1(this.n).r7.l(-this.r);
        this.a.a((l4 == null || l4.isEmpty() || this.m0) ? false : true, z10);
    }

    public k21 getCurrentTabsPosition() {
        return this.W ? k21.b : this.V ? k21.c : k21.a;
    }

    public float getSideMenuT() {
        return this.a0 * this.a.e;
    }

    public final void h() {
        fe.b bVar = this.P;
        float f7 = bVar.e;
        ImageView imageView = this.H;
        imageView.setAlpha(f7);
        imageView.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView.setVisibility(f7 > 0.0f ? 0 : 8);
        ImageView imageView2 = this.I;
        imageView2.setAlpha(f7);
        imageView2.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView2.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView2.setVisibility(f7 > 0.0f ? 0 : 8);
        float f10 = 1.0f - bVar.e;
        ImageView imageView3 = this.J;
        imageView3.setAlpha(f10);
        imageView3.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView3.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView3.setVisibility(f10 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.K;
        imageView4.setAlpha(f10);
        imageView4.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView4.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView4.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public final void i() {
        float T1 = org.telegram.messenger.i0.T1(1.0f, 0.0f, this.a0);
        FrameLayout frameLayout = this.E;
        frameLayout.setAlpha(T1);
        frameLayout.setVisibility((1.0f - this.b.e) * ((1.0f - this.a0) * this.a.e) > 0.0f ? 0 : 8);
        if (this.V) {
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.i0.L(50.0f)) - this.S) + org.telegram.messenger.i0.W1(k(k21.c), org.telegram.messenger.i0.L(43.0f), 0));
        } else {
            frameLayout.setTranslationY(this.T + org.telegram.messenger.i0.W1(k(k21.a), -org.telegram.messenger.i0.L(43.0f), 0));
        }
    }

    public final float k(k21 k21Var) {
        float f7 = (1.0f - this.b.e) * this.a.e;
        if (k21Var == k21.b) {
            return this.a0 * f7;
        }
        if ((k21Var != k21.a || this.V) && !(k21Var == k21.c && this.V)) {
            return 0.0f;
        }
        return (1.0f - this.a0) * f7;
    }

    public final boolean l() {
        if (this.a0 <= 0.5f) {
            int i10 = 0;
            while (true) {
                c21 c21Var = this.F;
                if (i10 >= c21Var.getChildCount()) {
                    break;
                }
                a51 G = c21Var.f3.G(RecyclerView.R(c21Var.getChildAt(i10)));
                if (G != null && G.r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                e21 e21Var = this.M;
                if (i11 >= e21Var.getChildCount()) {
                    break;
                }
                a51 G2 = e21Var.f3.G(RecyclerView.R(e21Var.getChildAt(i11)));
                if (G2 != null && G2.r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(this.n).r7;
        long j10 = this.r;
        if (x00Var.e(-j10)) {
            return;
        }
        x00Var.o(-j10);
    }

    public final void n(long j10, boolean z10) {
        if (this.w) {
            org.telegram.messenger.j20 j20Var = this.l0;
            if (j20Var != null) {
                j20Var.a(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.j20 j20Var2 = this.j0;
        if (j20Var2 != null) {
            j20Var2.a(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        org.telegram.messenger.vp vpVar;
        final o21 o21Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i10;
        final o21 o21Var2;
        final z60 z60Var;
        boolean z11;
        final int i11;
        int i12 = this.n;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i12);
        long j10 = this.r;
        TLRPC.Chat L0 = j10 < 0 ? r12.L0(Long.valueOf(-j10)) : null;
        TLRPC.User Z1 = j10 > 0 ? r12.Z1(Long.valueOf(j10)) : null;
        final org.telegram.ui.un unVar = this.y;
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
            z60Var.c(R.drawable.msg_clear, org.telegram.messenger.cd.L0(2131752089, null), new ag.a3(this, z60Var, o10, chat, 5), false);
            long j11 = chat.id;
            if (org.telegram.messenger.w3.p0(chat) && org.telegram.messenger.w3.A(i12, chat, 24)) {
                long j12 = chat.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(j11));
            TLRPC.User Z12 = org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(o10));
            if (Z12 != null && org.telegram.messenger.w3.w(2, L02)) {
                z60Var.c(R.drawable.msg_remove, org.telegram.messenger.cd.L0(2131753726, null), null, false);
                org.telegram.ui.ActionBar.b1 y3 = z60Var.y();
                y3.setVisibility(8);
                org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i12);
                y11 y11Var = new y11(this, y3, z60Var, j11, Z12, L02);
                z60Var = z60Var;
                r13.K(true, L02, Z12, y11Var);
            }
            o21Var2 = this;
        } else {
            if (org.telegram.messenger.w3.y(15, L0) || org.telegram.messenger.h20.v(Z1)) {
                boolean z12 = tL_forumTopic.pinned;
                vpVar = r12;
                o21Var = this;
                tL_forumTopic2 = tL_forumTopic;
                I.c(z12 ? R.drawable.msg_unpin : R.drawable.msg_pin, org.telegram.messenger.cd.L0(z12 ? 2131751453 : 2131751454, null), new org.telegram.ui.fp((Object) this, (Object) I, (Object) vpVar, (Object) tL_forumTopic, 24), false);
                if (tL_forumTopic2.pinned && !z10) {
                    I.c(R.drawable.tabs_reorder, org.telegram.messenger.cd.L0(2131750708, null), new x11(o21Var, i13), false);
                }
                i10 = 15;
            } else {
                i10 = 15;
                tL_forumTopic2 = tL_forumTopic;
                vpVar = r12;
                o21Var = this;
            }
            if (org.telegram.messenger.w3.y(i10, L0) || org.telegram.messenger.h20.v(Z1)) {
                I.c(R.drawable.outline_profile_edit_24, org.telegram.messenger.cd.L0(2131751217, null), new Runnable(o21Var) { // from class: org.telegram.ui.Components.b21
                    public final /* synthetic */ o21 b;

                    {
                        this.b = o21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i14;
                        o21 o21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        z60 z60Var2 = I;
                        switch (i16) {
                            case 0:
                                z60Var2.u();
                                o21Var3.y.presentFragment(la1.e0(-o21Var3.r, tL_forumTopic3.id));
                                break;
                            case 1:
                                o21Var3.getClass();
                                z60Var2.u();
                                org.telegram.messenger.vp.r1(o21Var3.n).r7.z(tL_forumTopic3.id, -o21Var3.r, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                z60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(28);
                                o21 o21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o21Var4.getContext());
                                String J0 = org.telegram.messenger.cd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = o21Var4.h0;
                                if (hashSet.size() == 1) {
                                    i15 = 0;
                                    x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131751499, org.telegram.messenger.vp.r1(o21Var4.n).r7.f(-o21Var4.r, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i15 = 0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.lh(o21Var4, arrayList, j13, hashSet, rzVar));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new z11(i15));
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
            final long j14 = o21Var.r;
            yn ynVar = new yn(I, currentAccount, j14, j13, unVar, resourceProvider);
            final z60 J = I.J();
            J.c(R.drawable.msg_arrow_back, org.telegram.messenger.cd.L0(2131753756, null), new org.telegram.ui.rr0(I, 27), false);
            J.c(R.drawable.msg_tone_on, org.telegram.messenger.cd.L0(2131745293, null), new Runnable() { // from class: org.telegram.ui.Components.zn
                @Override // java.lang.Runnable
                public final void run() {
                    z60.this.u();
                    SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(currentAccount).e7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j15 = j14;
                    long j16 = j13;
                    sb2.append(org.telegram.messenger.ot.v(j15, j16, false));
                    boolean z13 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z14 = !z13;
                    sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.ot.v(j15, j16, false), z14).apply();
                    J.u();
                    org.telegram.ui.ActionBar.k2 k2Var = unVar;
                    if (cc.a(k2Var)) {
                        cc.S(z13 ? 1 : 0, k2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.b1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, org.telegram.messenger.cd.L0(2131748323, null), new ag.g3(I, resourceProvider, currentAccount, ynVar, 16), false);
            J.c(R.drawable.msg_customize, org.telegram.messenger.cd.L0(2131747933, null), new mg.n0(I, j14, j13, unVar, resourceProvider), false);
            J.c(0, "", new org.telegram.messenger.mn(I, currentAccount, j14, j13, unVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.b1 y11 = J.y();
            new Runnable() { // from class: org.telegram.ui.Components.ao
                @Override // java.lang.Runnable
                public final void run() {
                    int i15;
                    int i16 = currentAccount;
                    org.telegram.messenger.vp r14 = org.telegram.messenger.vp.r1(i16);
                    long j15 = j14;
                    long j16 = j13;
                    boolean q22 = r14.q2(j15, j16, null);
                    org.telegram.ui.ActionBar.b1 b1Var = y11;
                    org.telegram.ui.ActionBar.b1 b1Var2 = y10;
                    if (q22) {
                        b1Var.j(org.telegram.messenger.cd.L0(2131743873, null), R.drawable.msg_unmute, null);
                        i15 = org.telegram.ui.ActionBar.t6.x6;
                        b1Var2.setVisibility(8);
                    } else {
                        b1Var.j(org.telegram.messenger.cd.L0(2131748321, null), R.drawable.msg_mute, null);
                        int i17 = org.telegram.ui.ActionBar.t6.q7;
                        b1Var2.setVisibility(0);
                        if (org.telegram.messenger.vp.r1(i16).r2(j15, j16)) {
                            b1Var2.j(org.telegram.messenger.cd.L0(2131745295, null), R.drawable.msg_tone_off, null);
                        } else {
                            b1Var2.j(org.telegram.messenger.cd.L0(2131745293, null), R.drawable.msg_tone_on, null);
                        }
                        i15 = i17;
                    }
                    go.c(b1Var, i15);
                }
            }.run();
            long j15 = tL_forumTopic2.id;
            long j16 = o21Var.r;
            org.telegram.messenger.vp vpVar2 = vpVar;
            boolean q22 = vpVar2.q2(j16, j15, null);
            int i15 = q22 ? R.drawable.msg_unmute : R.drawable.msg_mute;
            int i16 = q22 ? 2131743874 : 2131748329;
            TLRPC.Chat chat2 = L0;
            o21Var2 = this;
            z60Var = I;
            z60Var.c(i15, org.telegram.messenger.cd.L0(i16, null), new ag.e3(o21Var2, vpVar2, tL_forumTopic, I, J, 22), false);
            if (!org.telegram.messenger.w3.i(i12, chat2, tL_forumTopic) || org.telegram.messenger.h20.u(Z1)) {
                z11 = false;
                i11 = 1;
            } else {
                boolean z13 = tL_forumTopic.closed;
                i11 = 1;
                z11 = false;
                z60Var.c(z13 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, org.telegram.messenger.cd.L0(z13 ? 2131746101 : 2131752039, null), new Runnable(o21Var2) { // from class: org.telegram.ui.Components.b21
                    public final /* synthetic */ o21 b;

                    {
                        this.b = o21Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i152;
                        int i162 = i11;
                        o21 o21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        z60 z60Var2 = z60Var;
                        switch (i162) {
                            case 0:
                                z60Var2.u();
                                o21Var3.y.presentFragment(la1.e0(-o21Var3.r, tL_forumTopic3.id));
                                break;
                            case 1:
                                o21Var3.getClass();
                                z60Var2.u();
                                org.telegram.messenger.vp.r1(o21Var3.n).r7.z(tL_forumTopic3.id, -o21Var3.r, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                z60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(28);
                                o21 o21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o21Var4.getContext());
                                String J0 = org.telegram.messenger.cd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = o21Var4.h0;
                                if (hashSet.size() == 1) {
                                    i152 = 0;
                                    x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131751499, org.telegram.messenger.vp.r1(o21Var4.n).r7.f(-o21Var4.r, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i152 = 0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.lh(o21Var4, arrayList, j132, hashSet, rzVar));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new z11(i152));
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
                z60Var.c(R.drawable.msg_delete, org.telegram.messenger.cd.J0(i11, "DeleteTopics"), new Runnable(o21Var2) { // from class: org.telegram.ui.Components.b21
                    public final /* synthetic */ o21 b;

                    {
                        this.b = o21Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i152;
                        int i162 = i17;
                        o21 o21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        z60 z60Var2 = z60Var;
                        switch (i162) {
                            case 0:
                                z60Var2.u();
                                o21Var3.y.presentFragment(la1.e0(-o21Var3.r, tL_forumTopic3.id));
                                break;
                            case 1:
                                o21Var3.getClass();
                                z60Var2.u();
                                org.telegram.messenger.vp.r1(o21Var3.n).r7.z(tL_forumTopic3.id, -o21Var3.r, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                z60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(28);
                                o21 o21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o21Var4.getContext());
                                String J0 = org.telegram.messenger.cd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = o21Var4.h0;
                                if (hashSet.size() == 1) {
                                    i152 = 0;
                                    x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131751499, org.telegram.messenger.vp.r1(o21Var4.n).r7.f(-o21Var4.r, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i152 = 0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.lh(o21Var4, arrayList, j132, hashSet, rzVar));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new z11(i152));
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
        boolean z14 = view instanceof j21;
        org.telegram.ui.ActionBar.p6 p6Var = o21Var2.s;
        if (z14) {
            f21 f21Var = new f21();
            Paint paint = new Paint(1);
            f21Var.a = paint;
            f21Var.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, p6Var));
            z60Var.W(f21Var);
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
        org.telegram.ui.me meVar = this.U;
        if (meVar != null) {
            meVar.run();
        }
        i();
        float k10 = k(k21.b);
        float W1 = org.telegram.messenger.i0.W1(k10, -org.telegram.messenger.i0.L(78.0f), 0);
        FrameLayout frameLayout = this.L;
        frameLayout.setTranslationX(W1);
        frameLayout.setVisibility(k10 <= 0.0f ? 8 : 0);
        e();
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.H;
        org.telegram.ui.ActionBar.p6 p6Var = this.s;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, mode);
        org.telegram.ui.ActionBar.a7.t(this.I, i10, p6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        c21 c21Var = this.F;
        boolean canScrollHorizontally = c21Var.canScrollHorizontally(-1);
        c21Var.f3.O(true);
        if (!canScrollHorizontally) {
            c21Var.v0(0);
        }
        e21 e21Var = this.M;
        boolean canScrollVertically = e21Var.canScrollVertically(-1);
        e21Var.f3.O(true);
        if (!canScrollVertically) {
            e21Var.v0(0);
        }
        org.telegram.messenger.i0.g3(new x11(this, 0));
    }

    public final void r(boolean z10) {
        this.b.a(!this.c || this.e || this.h, z10);
    }

    public final void s() {
        this.J.setImageResource(!this.V ? R.drawable.menu_sidebar_left : this.d ? R.drawable.menu_sidebar_right : R.drawable.menu_sidebar_top);
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        this.h0 = j10;
        c21 c21Var = this.F;
        c21Var.f3.O(true);
        c21Var.invalidate();
        this.M.f3.O(true);
        n21 n21Var = this.G;
        if (n21Var != null) {
            n21Var.c(true, false, j10 == 0);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.j20 j20Var) {
        this.l0 = j20Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.k0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.j20 j20Var) {
        this.j0 = j20Var;
    }

    public void setSideMenuBackgroundDrawable(vg.f fVar) {
        this.Q = fVar;
        fVar.q(org.telegram.messenger.i0.L(16.0f));
        this.Q.p(org.telegram.messenger.i0.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f7) {
        this.S = f7;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f7) {
        this.T = f7;
        this.L.setTranslationY(f7);
        i();
        f();
        invalidate();
    }

    public void setSidebarMode(boolean z10) {
        if (!this.d || this.e == z10) {
            return;
        }
        this.e = z10;
        if (!z10) {
            this.V = false;
            s();
            this.K.setImageResource(R.drawable.menu_sidebar_bottom);
        }
        r(true);
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.n).f7.edit();
        StringBuilder sb2 = new StringBuilder("topicssidepanel");
        long j10 = this.r;
        sb2.append(j10);
        edit.putBoolean(sb2.toString(), z10).putBoolean(a1.g.l(j10, "topicssidetabsb"), this.V).apply();
        org.telegram.ui.me meVar = this.f;
        if (meVar != null) {
            meVar.run();
        }
    }

    public void setTopMenuBackgroundDrawable(vg.f fVar) {
        this.R = fVar;
        fVar.q(org.telegram.messenger.i0.L(18.0f));
        this.R.p(org.telegram.messenger.i0.L(7.0f));
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
