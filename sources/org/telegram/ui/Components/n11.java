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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n11 extends FrameLayout implements org.telegram.messenger.ls, te.b, org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int l0 = 0;
    public final m11 D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final FrameLayout I;
    public final c11 J;
    public long K;
    public long L;
    public final te.a M;
    public fh.g N;
    public fh.g O;
    public float P;
    public float Q;
    public org.telegram.ui.ae R;
    public boolean S;
    public boolean T;
    public float U;
    public boolean V;
    public boolean W;
    public final te.a a;
    public int a0;
    public final te.a b;
    public int b0;
    public boolean c;
    public Boolean c0;
    public boolean d;
    public ValueAnimator d0;
    public final int e;
    public long e0;
    public final long f;
    public boolean f0;
    public org.telegram.messenger.v10 g0;
    public final org.telegram.ui.ActionBar.g6 h;
    public Runnable h0;
    public org.telegram.messenger.v10 i0;
    public boolean j0;
    public final HashSet k0;
    public final boolean n;
    public final boolean r;
    public final org.telegram.ui.cn s;
    public final boolean w;
    public final FrameLayout x;
    public final a11 y;

    /* JADX WARN: Type inference failed for: r3v8, types: [org.telegram.ui.Components.v01] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.v01] */
    public n11(Activity activity, org.telegram.ui.cn cnVar, int i7, long j3, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        ViewGroup viewGroup;
        boolean z10;
        xq xqVar = xq.h;
        this.a = new te.a(0, this, xqVar, 380L, true);
        this.b = new te.a(1, this, xqVar, 380L, false);
        this.M = new te.a(0, new w01(this), xqVar, 320L, false);
        this.U = 0.0f;
        this.k0 = new HashSet();
        this.s = cnVar;
        this.c = z9;
        this.e = i7;
        this.f = j3;
        this.h = g6Var;
        long j10 = -j3;
        this.n = org.telegram.messenger.t3.p0(org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10)));
        boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3)));
        this.r = v;
        final int i10 = 0;
        final int i11 = 1;
        this.w = !org.telegram.messenger.k5.w("topics_end_reached_", j10, org.telegram.messenger.p10.i(i7).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        addView(frameLayout, c8.ha.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.I = frameLayout2;
        addView(frameLayout2, c8.ha.d(64, -1.0f, org.telegram.messenger.qs.A1, 7.0f, 7.0f, 7.0f, 7.0f));
        a11 a11Var = new a11(this, activity, i7, new org.telegram.messenger.v10(this) { // from class: org.telegram.ui.Components.v01
            public final /* synthetic */ n11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                boolean z11;
                int i12;
                long j11;
                org.telegram.messenger.k00 k00Var;
                long j12;
                ArrayList arrayList;
                boolean z12;
                boolean z13;
                long j13;
                long j14;
                int i13 = i10;
                n11 n11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        m41 m41Var = (m41) obj2;
                        boolean z14 = n11Var.r;
                        int i14 = n11Var.e;
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i14);
                        long j15 = n11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.k00 k00Var2 = org.telegram.messenger.qp.s1(i14).q7;
                        ArrayList l10 = k00Var2.l(j16);
                        boolean z15 = n11Var.n;
                        int i15 = h11.b;
                        y31 K = y31.K(h11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z15;
                        K.L(n11Var.e0 == 0);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z11 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z14) {
                                    i12 = i17;
                                    if (tL_forumTopic.id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (n11Var.k0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z16 = tL_forumTopic.pinned;
                                    if (!z16 && z11) {
                                        if (!arrayList2.isEmpty()) {
                                            ((y31) jg.g.i(1, arrayList2)).y |= 8;
                                        }
                                        m41Var.L();
                                        z11 = false;
                                    } else if (z16 && !z11) {
                                        m41Var.M();
                                        z11 = true;
                                    }
                                    y31 K2 = y31.K(h11.class);
                                    K2.x = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z15) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = n11Var.e0;
                                    if (z15) {
                                        k00Var = k00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        k00Var = k00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    k00Var2 = k00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        org.telegram.messenger.k00 k00Var3 = k00Var2;
                        if (z11) {
                            m41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !k00Var3.e(j16) && n11Var.w) {
                            y31 K3 = y31.K(h11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            y31 K4 = y31.K(h11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            y31 K5 = y31.K(h11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z14 && !z15) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.t10.v(a22)) {
                                y31 K6 = y31.K(h11.class);
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
                        n11.c(n11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        m41 m41Var2 = (m41) obj2;
                        boolean z17 = n11Var.n;
                        int i19 = n11Var.e;
                        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i19);
                        long j18 = n11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.k00 k00Var4 = org.telegram.messenger.qp.s1(i19).q7;
                        ArrayList l11 = k00Var4.l(j19);
                        boolean z18 = n11Var.r;
                        if (z18) {
                            arrayList = l11;
                        } else {
                            int i20 = l11.b;
                            y31 K7 = y31.K(l11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(n11Var.e0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z19 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z18) {
                                    z13 = z19;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z19 = z13;
                                    }
                                } else {
                                    z13 = z19;
                                }
                                if (n11Var.k0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z19 = z13;
                                } else {
                                    boolean z20 = tL_forumTopic2.pinned;
                                    if (!z20 && z13) {
                                        m41Var2.L();
                                        z19 = false;
                                    } else if (!z20 || z13) {
                                        z19 = z13;
                                    } else {
                                        m41Var2.M();
                                        z19 = true;
                                    }
                                    int i23 = l11.b;
                                    y31 K8 = y31.K(l11.class);
                                    K8.x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z17) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = n11Var.e0;
                                    if (z17) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.id;
                                    }
                                    K8.L(j13 == j14);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j18 = j20;
                                }
                            }
                            z12 = z19;
                        } else {
                            z12 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z12) {
                            m41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !k00Var4.e(j19) && n11Var.w) {
                            int i24 = l11.b;
                            y31 K9 = y31.K(l11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            y31 K10 = y31.K(l11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            y31 K11 = y31.K(l11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(user2)) {
                                int i25 = l11.b;
                                y31 K12 = y31.K(l11.class);
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
        }, new w01(this), new w01(this), g6Var);
        this.y = a11Var;
        a11Var.E1(new org.telegram.messenger.v10(this) { // from class: org.telegram.ui.Components.v01
            public final /* synthetic */ n11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                boolean z11;
                int i12;
                long j11;
                org.telegram.messenger.k00 k00Var;
                long j12;
                ArrayList arrayList;
                boolean z12;
                boolean z13;
                long j13;
                long j14;
                int i13 = i11;
                n11 n11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        m41 m41Var = (m41) obj2;
                        boolean z14 = n11Var.r;
                        int i14 = n11Var.e;
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i14);
                        long j15 = n11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.k00 k00Var2 = org.telegram.messenger.qp.s1(i14).q7;
                        ArrayList l10 = k00Var2.l(j16);
                        boolean z15 = n11Var.n;
                        int i15 = h11.b;
                        y31 K = y31.K(h11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z15;
                        K.L(n11Var.e0 == 0);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z11 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z14) {
                                    i12 = i17;
                                    if (tL_forumTopic.id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (n11Var.k0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z16 = tL_forumTopic.pinned;
                                    if (!z16 && z11) {
                                        if (!arrayList2.isEmpty()) {
                                            ((y31) jg.g.i(1, arrayList2)).y |= 8;
                                        }
                                        m41Var.L();
                                        z11 = false;
                                    } else if (z16 && !z11) {
                                        m41Var.M();
                                        z11 = true;
                                    }
                                    y31 K2 = y31.K(h11.class);
                                    K2.x = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z15) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = n11Var.e0;
                                    if (z15) {
                                        k00Var = k00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        k00Var = k00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    k00Var2 = k00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        org.telegram.messenger.k00 k00Var3 = k00Var2;
                        if (z11) {
                            m41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !k00Var3.e(j16) && n11Var.w) {
                            y31 K3 = y31.K(h11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            y31 K4 = y31.K(h11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            y31 K5 = y31.K(h11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z14 && !z15) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.t10.v(a22)) {
                                y31 K6 = y31.K(h11.class);
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
                        n11.c(n11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        m41 m41Var2 = (m41) obj2;
                        boolean z17 = n11Var.n;
                        int i19 = n11Var.e;
                        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i19);
                        long j18 = n11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.k00 k00Var4 = org.telegram.messenger.qp.s1(i19).q7;
                        ArrayList l11 = k00Var4.l(j19);
                        boolean z18 = n11Var.r;
                        if (z18) {
                            arrayList = l11;
                        } else {
                            int i20 = l11.b;
                            y31 K7 = y31.K(l11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(n11Var.e0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z19 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z18) {
                                    z13 = z19;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z19 = z13;
                                    }
                                } else {
                                    z13 = z19;
                                }
                                if (n11Var.k0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z19 = z13;
                                } else {
                                    boolean z20 = tL_forumTopic2.pinned;
                                    if (!z20 && z13) {
                                        m41Var2.L();
                                        z19 = false;
                                    } else if (!z20 || z13) {
                                        z19 = z13;
                                    } else {
                                        m41Var2.M();
                                        z19 = true;
                                    }
                                    int i23 = l11.b;
                                    y31 K8 = y31.K(l11.class);
                                    K8.x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z17) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = n11Var.e0;
                                    if (z17) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.id;
                                    }
                                    K8.L(j13 == j14);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j18 = j20;
                                }
                            }
                            z12 = z19;
                        } else {
                            z12 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z12) {
                            m41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !k00Var4.e(j19) && n11Var.w) {
                            int i24 = l11.b;
                            y31 K9 = y31.K(l11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            y31 K10 = y31.K(l11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            y31 K11 = y31.K(l11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(user2)) {
                                int i25 = l11.b;
                                y31 K12 = y31.K(l11.class);
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
        a11Var.setWillNotDraw(false);
        a11Var.f3.r = false;
        a11Var.getContext();
        jg.i0 i0Var = new jg.i0((ViewGroup) a11Var, 7);
        a11Var.e3 = i0Var;
        a11Var.setLayoutManager(i0Var);
        frameLayout.addView(a11Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 41.0f, 0.0f, 0.0f, 0.0f));
        a11Var.j(new b11(this, 0));
        if (v) {
            m11 m11Var = new m11(i7, activity, g6Var);
            this.D = m11Var;
            m11Var.c(true, false, this.e0 == 0);
            m11Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u01
                public final /* synthetic */ n11 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            n11 n11Var = this.b;
                            c11 c11Var = n11Var.J;
                            c11Var.z1(false);
                            a11 a11Var2 = n11Var.y;
                            a11Var2.z1(false);
                            n11Var.M.a(false, true);
                            org.telegram.messenger.g0.b4(c11Var);
                            org.telegram.messenger.g0.b4(a11Var2);
                            break;
                        case 1:
                            this.b.g0.a(0, Boolean.FALSE);
                            break;
                        default:
                            n11.b(this.b);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(m11Var, c8.ha.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.D = null;
        }
        final int i12 = 2;
        ViewGroup viewGroup2 = viewGroup;
        c11 c11Var = new c11(activity, i7, new org.telegram.messenger.v10(this) { // from class: org.telegram.ui.Components.v01
            public final /* synthetic */ n11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                boolean z11;
                int i122;
                long j11;
                org.telegram.messenger.k00 k00Var;
                long j12;
                ArrayList arrayList;
                boolean z12;
                boolean z13;
                long j13;
                long j14;
                int i13 = i12;
                n11 n11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        m41 m41Var = (m41) obj2;
                        boolean z14 = n11Var.r;
                        int i14 = n11Var.e;
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i14);
                        long j15 = n11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.k00 k00Var2 = org.telegram.messenger.qp.s1(i14).q7;
                        ArrayList l10 = k00Var2.l(j16);
                        boolean z15 = n11Var.n;
                        int i15 = h11.b;
                        y31 K = y31.K(h11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z15;
                        K.L(n11Var.e0 == 0);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z11 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z14) {
                                    i122 = i17;
                                    if (tL_forumTopic.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (n11Var.k0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic.pinned;
                                    if (!z16 && z11) {
                                        if (!arrayList2.isEmpty()) {
                                            ((y31) jg.g.i(1, arrayList2)).y |= 8;
                                        }
                                        m41Var.L();
                                        z11 = false;
                                    } else if (z16 && !z11) {
                                        m41Var.M();
                                        z11 = true;
                                    }
                                    y31 K2 = y31.K(h11.class);
                                    K2.x = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z15) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = n11Var.e0;
                                    if (z15) {
                                        k00Var = k00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        k00Var = k00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    k00Var2 = k00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        org.telegram.messenger.k00 k00Var3 = k00Var2;
                        if (z11) {
                            m41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !k00Var3.e(j16) && n11Var.w) {
                            y31 K3 = y31.K(h11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            y31 K4 = y31.K(h11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            y31 K5 = y31.K(h11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z14 && !z15) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.t10.v(a22)) {
                                y31 K6 = y31.K(h11.class);
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
                        n11.c(n11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        m41 m41Var2 = (m41) obj2;
                        boolean z17 = n11Var.n;
                        int i19 = n11Var.e;
                        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i19);
                        long j18 = n11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.k00 k00Var4 = org.telegram.messenger.qp.s1(i19).q7;
                        ArrayList l11 = k00Var4.l(j19);
                        boolean z18 = n11Var.r;
                        if (z18) {
                            arrayList = l11;
                        } else {
                            int i20 = l11.b;
                            y31 K7 = y31.K(l11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(n11Var.e0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z19 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z18) {
                                    z13 = z19;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z19 = z13;
                                    }
                                } else {
                                    z13 = z19;
                                }
                                if (n11Var.k0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z19 = z13;
                                } else {
                                    boolean z20 = tL_forumTopic2.pinned;
                                    if (!z20 && z13) {
                                        m41Var2.L();
                                        z19 = false;
                                    } else if (!z20 || z13) {
                                        z19 = z13;
                                    } else {
                                        m41Var2.M();
                                        z19 = true;
                                    }
                                    int i23 = l11.b;
                                    y31 K8 = y31.K(l11.class);
                                    K8.x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z17) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = n11Var.e0;
                                    if (z17) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.id;
                                    }
                                    K8.L(j13 == j14);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j18 = j20;
                                }
                            }
                            z12 = z19;
                        } else {
                            z12 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z12) {
                            m41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !k00Var4.e(j19) && n11Var.w) {
                            int i24 = l11.b;
                            y31 K9 = y31.K(l11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            y31 K10 = y31.K(l11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            y31 K11 = y31.K(l11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(user2)) {
                                int i25 = l11.b;
                                y31 K12 = y31.K(l11.class);
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
        }, new w01(this), new w01(this), g6Var);
        this.J = c11Var;
        c11Var.E1(new org.telegram.messenger.v10(this) { // from class: org.telegram.ui.Components.v01
            public final /* synthetic */ n11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                boolean z11;
                int i122;
                long j11;
                org.telegram.messenger.k00 k00Var;
                long j12;
                ArrayList arrayList;
                boolean z12;
                boolean z13;
                long j13;
                long j14;
                int i13 = i11;
                n11 n11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        m41 m41Var = (m41) obj2;
                        boolean z14 = n11Var.r;
                        int i14 = n11Var.e;
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i14);
                        long j15 = n11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.k00 k00Var2 = org.telegram.messenger.qp.s1(i14).q7;
                        ArrayList l10 = k00Var2.l(j16);
                        boolean z15 = n11Var.n;
                        int i15 = h11.b;
                        y31 K = y31.K(h11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z15;
                        K.L(n11Var.e0 == 0);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z11 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z14) {
                                    i122 = i17;
                                    if (tL_forumTopic.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (n11Var.k0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic.pinned;
                                    if (!z16 && z11) {
                                        if (!arrayList2.isEmpty()) {
                                            ((y31) jg.g.i(1, arrayList2)).y |= 8;
                                        }
                                        m41Var.L();
                                        z11 = false;
                                    } else if (z16 && !z11) {
                                        m41Var.M();
                                        z11 = true;
                                    }
                                    y31 K2 = y31.K(h11.class);
                                    K2.x = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z15) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = n11Var.e0;
                                    if (z15) {
                                        k00Var = k00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        k00Var = k00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    k00Var2 = k00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        org.telegram.messenger.k00 k00Var3 = k00Var2;
                        if (z11) {
                            m41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !k00Var3.e(j16) && n11Var.w) {
                            y31 K3 = y31.K(h11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            y31 K4 = y31.K(h11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            y31 K5 = y31.K(h11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z14 && !z15) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.t10.v(a22)) {
                                y31 K6 = y31.K(h11.class);
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
                        n11.c(n11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        m41 m41Var2 = (m41) obj2;
                        boolean z17 = n11Var.n;
                        int i19 = n11Var.e;
                        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i19);
                        long j18 = n11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.k00 k00Var4 = org.telegram.messenger.qp.s1(i19).q7;
                        ArrayList l11 = k00Var4.l(j19);
                        boolean z18 = n11Var.r;
                        if (z18) {
                            arrayList = l11;
                        } else {
                            int i20 = l11.b;
                            y31 K7 = y31.K(l11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(n11Var.e0 == 0);
                            arrayList3.add(K7);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z19 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z18) {
                                    z13 = z19;
                                    if (tL_forumTopic2.id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z19 = z13;
                                    }
                                } else {
                                    z13 = z19;
                                }
                                if (n11Var.k0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z19 = z13;
                                } else {
                                    boolean z20 = tL_forumTopic2.pinned;
                                    if (!z20 && z13) {
                                        m41Var2.L();
                                        z19 = false;
                                    } else if (!z20 || z13) {
                                        z19 = z13;
                                    } else {
                                        m41Var2.M();
                                        z19 = true;
                                    }
                                    int i23 = l11.b;
                                    y31 K8 = y31.K(l11.class);
                                    K8.x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z17) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = n11Var.e0;
                                    if (z17) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.id;
                                    }
                                    K8.L(j13 == j14);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j18 = j20;
                                }
                            }
                            z12 = z19;
                        } else {
                            z12 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z12) {
                            m41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !k00Var4.e(j19) && n11Var.w) {
                            int i24 = l11.b;
                            y31 K9 = y31.K(l11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            y31 K10 = y31.K(l11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            y31 K11 = y31.K(l11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(user2)) {
                                int i25 = l11.b;
                                y31 K12 = y31.K(l11.class);
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
        c11Var.f3.r = false;
        c11Var.setClipToPadding(false);
        c11Var.setClipChildren(false);
        viewGroup2.addView(c11Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, v ? 90.0f : 48.0f, 0.0f, 0.0f));
        c11Var.j(new b11(this, i11));
        final int i13 = 2;
        ImageView j11 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u01
            public final /* synthetic */ n11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        n11 n11Var = this.b;
                        c11 c11Var2 = n11Var.J;
                        c11Var2.z1(false);
                        a11 a11Var2 = n11Var.y;
                        a11Var2.z1(false);
                        n11Var.M.a(false, true);
                        org.telegram.messenger.g0.b4(c11Var2);
                        org.telegram.messenger.g0.b4(a11Var2);
                        break;
                    case 1:
                        this.b.g0.a(0, Boolean.FALSE);
                        break;
                    default:
                        n11.b(this.b);
                        break;
                }
            }
        });
        this.G = j11;
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u01
            public final /* synthetic */ n11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        n11 n11Var = this.b;
                        c11 c11Var2 = n11Var.J;
                        c11Var2.z1(false);
                        a11 a11Var2 = n11Var.y;
                        a11Var2.z1(false);
                        n11Var.M.a(false, true);
                        org.telegram.messenger.g0.b4(c11Var2);
                        org.telegram.messenger.g0.b4(a11Var2);
                        break;
                    case 1:
                        this.b.g0.a(0, Boolean.FALSE);
                        break;
                    default:
                        n11.b(this.b);
                        break;
                }
            }
        });
        this.H = j12;
        frameLayout.addView(j11, c8.ha.e(44, 36, 51));
        viewGroup2.addView(j12, c8.ha.e(64, 48, 51));
        final int i14 = 0;
        ImageView j13 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u01
            public final /* synthetic */ n11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        n11 n11Var = this.b;
                        c11 c11Var2 = n11Var.J;
                        c11Var2.z1(false);
                        a11 a11Var2 = n11Var.y;
                        a11Var2.z1(false);
                        n11Var.M.a(false, true);
                        org.telegram.messenger.g0.b4(c11Var2);
                        org.telegram.messenger.g0.b4(a11Var2);
                        break;
                    case 1:
                        this.b.g0.a(0, Boolean.FALSE);
                        break;
                    default:
                        n11.b(this.b);
                        break;
                }
            }
        });
        this.E = j13;
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u01
            public final /* synthetic */ n11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        n11 n11Var = this.b;
                        c11 c11Var2 = n11Var.J;
                        c11Var2.z1(false);
                        a11 a11Var2 = n11Var.y;
                        a11Var2.z1(false);
                        n11Var.M.a(false, true);
                        org.telegram.messenger.g0.b4(c11Var2);
                        org.telegram.messenger.g0.b4(a11Var2);
                        break;
                    case 1:
                        this.b.g0.a(0, Boolean.FALSE);
                        break;
                    default:
                        n11.b(this.b);
                        break;
                }
            }
        });
        this.F = j14;
        frameLayout.addView(j13, c8.ha.e(44, 36, 51));
        viewGroup2.addView(j14, c8.ha.e(64, 48, 51));
        org.telegram.messenger.qp.s1(i7).q7.n(3, j10, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).e7;
        if (z9 && org.telegram.messenger.k5.w("topicssidetabs", j3, sharedPreferences, false)) {
            this.U = 1.0f;
            z10 = true;
            this.T = true;
        } else {
            z10 = true;
        }
        boolean z11 = (z9 && org.telegram.messenger.k5.w("topicssidetabsb", j3, sharedPreferences, false)) ? z10 : false;
        this.S = z11;
        j12.setImageResource(z11 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        r(false);
        j11.setImageResource(!this.S ? R.drawable.menu_sidebar_left : R.drawable.menu_sidebar_top);
        g(false);
        h();
        p();
        q();
    }

    public static void a(n11 n11Var, y31 y31Var) {
        if (n11Var.n) {
            org.telegram.messenger.v10 v10Var = n11Var.i0;
            if (v10Var != null) {
                v10Var.a(Long.valueOf(y31Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (y31Var.B == -2) {
            Runnable runnable = n11Var.h0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        org.telegram.messenger.v10 v10Var2 = n11Var.g0;
        if (v10Var2 != null) {
            v10Var2.a(Integer.valueOf(y31Var.d), Boolean.FALSE);
        }
    }

    public static void b(n11 n11Var) {
        boolean z9 = n11Var.T;
        boolean z10 = true;
        if (!z9 && n11Var.S && n11Var.c0 == null && !n11Var.V) {
            if (n11Var.d) {
                return;
            }
            n11Var.d = true;
            n11Var.r(true);
            return;
        }
        if ((r2 = n11Var.c0) != null) {
            z10 = false;
            n11Var.d(z10);
        } else {
            z10 = false;
            n11Var.d(z10);
        }
    }

    public static void c(n11 n11Var, ArrayList arrayList) {
        long j3 = n11Var.f;
        org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(n11Var.e).q7;
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (i7 < arrayList.size()) {
            i7 = com.google.android.recaptcha.internal.a.f(((y31) arrayList.get(i7)).d, i7, 1, arrayList2);
        }
        long j10 = -j3;
        k00Var.w(arrayList2, j10);
        k00Var.y(j10, false);
    }

    public static ImageView j(Context context, int i7, View.OnClickListener onClickListener) {
        ImageView e10 = org.telegram.messenger.camera.q.e(context, i7);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        e10.setOnClickListener(onClickListener);
        c8.ka.a(e10);
        return e10;
    }

    private void setAttached(boolean z9) {
        if (this.f0 == z9) {
            return;
        }
        this.f0 = z9;
        int i7 = org.telegram.messenger.qs.r;
        int i10 = org.telegram.messenger.qs.q5;
        long j3 = this.f;
        int i11 = this.e;
        if (!z9) {
            long j10 = -j3;
            LongSparseIntArray longSparseIntArray = org.telegram.messenger.qp.s1(i11).q7.f;
            int i12 = longSparseIntArray.get(j10, 0) - 1;
            longSparseIntArray.put(j10, i12 >= 0 ? i12 : 0);
            org.telegram.messenger.qs.f(i11).n(this, i10);
            org.telegram.messenger.qs.f(i11).n(this, i7);
            return;
        }
        org.telegram.messenger.qs.f(i11).c(this, i10);
        org.telegram.messenger.qs.f(i11).c(this, i7);
        org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(i11).q7;
        long j11 = -j3;
        LongSparseIntArray longSparseIntArray2 = k00Var.f;
        longSparseIntArray2.put(j11, longSparseIntArray2.get(j11, 0) + 1);
        k00Var.y(j11, true);
    }

    @Override // te.b
    public final void F(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f && this.d) {
            this.d = false;
            this.S = false;
            this.G.setImageResource(R.drawable.menu_sidebar_left);
            this.H.setImageResource(R.drawable.menu_sidebar_bottom);
            org.telegram.messenger.qp.s1(this.e).e7.edit().putBoolean("topicssidetabsb" + this.f, false).apply();
            r(true);
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        p();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z6));
    }

    public final void d(boolean z9) {
        if (this.T == z9) {
            return;
        }
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.V) {
                this.c0 = Boolean.valueOf(z9);
                return;
            }
        }
        if (!z9) {
            this.S = !this.S;
        }
        this.T = z9;
        this.V = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z9 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new d60(this, 26));
        this.d0.addListener(new t9(21, this, z9));
        this.d0.setInterpolator(mi.l.V);
        this.d0.setDuration(250L);
        this.d0.start();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.q5;
        long j3 = this.f;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() != (-j3)) {
                return;
            }
            q();
        } else if (i7 == org.telegram.messenger.qs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.qp.C8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.qp.s1(this.e).q7.y(-j3, false);
                q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.I;
        if (frameLayout.getVisibility() == 0) {
            this.N.setBounds((int) frameLayout.getTranslationX(), (int) this.Q, (int) (frameLayout.getTranslationX() + org.telegram.messenger.g0.L(78.0f)), (int) (getMeasuredHeight() - this.P));
            this.N.draw(canvas);
        }
        FrameLayout frameLayout2 = this.x;
        if (frameLayout2.getVisibility() == 0) {
            this.O.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.O.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + org.telegram.messenger.g0.L(50.0f)));
            this.O.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        canvas.save();
        if (view == this.I) {
            canvas.clipPath(this.N.Q.k);
        }
        if (view == this.x) {
            canvas.clipPath(this.O.Q.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i7 = org.telegram.ui.ActionBar.l6.z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var);
        int f10 = i0.a.f(1.0f - this.U, w02, w03);
        int f11 = i0.a.f(this.U, w02, w03);
        boolean z9 = this.W;
        this.W = true;
        ImageView imageView = this.G;
        if (imageView != null && (!z9 || f10 != this.a0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.a0 = f10;
        ImageView imageView2 = this.H;
        if (imageView2 != null && (!z9 || f11 != this.b0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        }
        this.b0 = f11;
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

    public final void g(boolean z9) {
        ArrayList l10 = org.telegram.messenger.qp.s1(this.e).q7.l(-this.f);
        this.a.a((l10 == null || l10.isEmpty() || this.j0) ? false : true, z9);
    }

    public j11 getCurrentTabsPosition() {
        return this.T ? j11.b : this.S ? j11.c : j11.a;
    }

    public float getSideMenuT() {
        return this.U * this.a.e;
    }

    public final void h() {
        te.a aVar = this.M;
        float f10 = aVar.e;
        ImageView imageView = this.E;
        imageView.setAlpha(f10);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView.setVisibility(f10 > 0.0f ? 0 : 8);
        ImageView imageView2 = this.F;
        imageView2.setAlpha(f10);
        imageView2.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView2.setVisibility(f10 > 0.0f ? 0 : 8);
        float f11 = 1.0f - aVar.e;
        ImageView imageView3 = this.G;
        imageView3.setAlpha(f11);
        imageView3.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView3.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView3.setVisibility(f11 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.H;
        imageView4.setAlpha(f11);
        imageView4.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView4.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView4.setVisibility(f11 > 0.0f ? 0 : 8);
    }

    public final void i() {
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.0f, this.U);
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(T1);
        frameLayout.setVisibility((1.0f - this.b.e) * ((1.0f - this.U) * this.a.e) > 0.0f ? 0 : 8);
        if (this.S) {
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f)) - this.P) + org.telegram.messenger.g0.W1(k(j11.c), org.telegram.messenger.g0.L(43.0f), 0));
        } else {
            frameLayout.setTranslationY(this.Q + org.telegram.messenger.g0.W1(k(j11.a), -org.telegram.messenger.g0.L(43.0f), 0));
        }
    }

    public final float k(j11 j11Var) {
        float f10 = (1.0f - this.b.e) * this.a.e;
        if (j11Var == j11.b) {
            return this.U * f10;
        }
        if ((j11Var != j11.a || this.S) && !(j11Var == j11.c && this.S)) {
            return 0.0f;
        }
        return (1.0f - this.U) * f10;
    }

    public final boolean l() {
        if (this.U <= 0.5f) {
            int i7 = 0;
            while (true) {
                a11 a11Var = this.y;
                if (i7 >= a11Var.getChildCount()) {
                    break;
                }
                y31 G = a11Var.f3.G(RecyclerView.R(a11Var.getChildAt(i7)));
                if (G != null && G.r) {
                    return true;
                }
                i7++;
            }
        } else {
            int i10 = 0;
            while (true) {
                c11 c11Var = this.J;
                if (i10 >= c11Var.getChildCount()) {
                    break;
                }
                y31 G2 = c11Var.f3.G(RecyclerView.R(c11Var.getChildAt(i10)));
                if (G2 != null && G2.r) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(this.e).q7;
        long j3 = this.f;
        if (k00Var.e(-j3)) {
            return;
        }
        k00Var.o(-j3);
    }

    public final void n(long j3, boolean z9) {
        if (this.n) {
            org.telegram.messenger.v10 v10Var = this.i0;
            if (v10Var != null) {
                v10Var.a(Long.valueOf(j3), Boolean.valueOf(z9));
                return;
            }
            return;
        }
        org.telegram.messenger.v10 v10Var2 = this.g0;
        if (v10Var2 != null) {
            v10Var2.a(Integer.valueOf((int) j3), Boolean.valueOf(z9));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z9) {
        org.telegram.messenger.qp qpVar;
        final n11 n11Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i7;
        final n11 n11Var2;
        final l60 l60Var;
        boolean z10;
        final int i10;
        int i11 = this.e;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i11);
        long j3 = this.f;
        TLRPC.Chat M0 = j3 < 0 ? s12.M0(Long.valueOf(-j3)) : null;
        TLRPC.User a22 = j3 > 0 ? s12.a2(Long.valueOf(j3)) : null;
        final org.telegram.ui.cn cnVar = this.s;
        final l60 I = l60.I(cnVar, view);
        int i12 = 1;
        final int i13 = 0;
        if (org.telegram.messenger.t3.p0(M0)) {
            long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            if (o4 == 0 || !org.telegram.messenger.t3.A(i11, M0, 24)) {
                return false;
            }
            TLRPC.Chat chat = M0;
            l60Var = I;
            l60Var.c(R.drawable.msg_clear, org.telegram.messenger.id.M0(2131752089, null), new bi.w2(this, l60Var, o4, chat, 17), false);
            long j10 = chat.id;
            if (org.telegram.messenger.t3.p0(chat) && org.telegram.messenger.t3.A(i11, chat, 24)) {
                long j11 = chat.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(j10));
            TLRPC.User a23 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(o4));
            if (a23 != null && org.telegram.messenger.t3.w(2, M02)) {
                l60Var.c(R.drawable.msg_remove, org.telegram.messenger.id.M0(2131753726, null), null, false);
                org.telegram.ui.ActionBar.z0 y10 = l60Var.y();
                y10.setVisibility(8);
                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i11);
                bi.q3 q3Var = new bi.q3(this, y10, l60Var, j10, a23, M02, 3);
                l60Var = l60Var;
                s13.K0(M02, a23, q3Var);
            }
            n11Var2 = this;
        } else {
            if (org.telegram.messenger.t3.y(15, M0) || org.telegram.messenger.t10.v(a22)) {
                boolean z11 = tL_forumTopic.pinned;
                qpVar = s12;
                n11Var = this;
                tL_forumTopic2 = tL_forumTopic;
                I.c(z11 ? R.drawable.msg_unpin : R.drawable.msg_pin, org.telegram.messenger.id.M0(z11 ? 2131751452 : 2131751453, null), new ln0(this, I, qpVar, tL_forumTopic, 4), false);
                if (tL_forumTopic2.pinned && !z9) {
                    I.c(R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131750707, null), new x01(n11Var, i12), false);
                }
                i7 = 15;
            } else {
                i7 = 15;
                tL_forumTopic2 = tL_forumTopic;
                qpVar = s12;
                n11Var = this;
            }
            if (org.telegram.messenger.t3.y(i7, M0) || org.telegram.messenger.t10.v(a22)) {
                I.c(R.drawable.outline_profile_edit_24, org.telegram.messenger.id.M0(2131751216, null), new Runnable(n11Var) { // from class: org.telegram.ui.Components.z01
                    public final /* synthetic */ n11 b;

                    {
                        this.b = n11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        n11 n11Var3;
                        int i14 = i13;
                        n11 n11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        l60 l60Var2 = I;
                        switch (i14) {
                            case 0:
                                l60Var2.u();
                                n11Var4.s.presentFragment(w81.f0(-n11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                n11Var4.getClass();
                                l60Var2.u();
                                org.telegram.messenger.qp.s1(n11Var4.e).q7.z(tL_forumTopic3.id, -n11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                l60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                vs vsVar = new vs(9);
                                n11 n11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n11Var5.getContext());
                                String K0 = org.telegram.messenger.id.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = n11Var5.e0;
                                if (hashSet.size() == 1) {
                                    n11Var3 = n11Var5;
                                    u1Var.T = org.telegram.messenger.id.a0(null, null, 2131751498, org.telegram.messenger.qp.s1(n11Var5.e).q7.f(-n11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    n11Var3 = n11Var5;
                                    u1Var.T = org.telegram.messenger.id.M0(2131751497, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new bi.n4(n11Var3, arrayList, j12, hashSet, vsVar));
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new jl0(13));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            final long j12 = tL_forumTopic2.id;
            final int currentAccount = cnVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.g6 resourceProvider = cnVar.getResourceProvider();
            final long j13 = n11Var.f;
            qn qnVar = new qn(I, currentAccount, j13, j12, cnVar, resourceProvider);
            final l60 J = I.J();
            J.c(R.drawable.msg_arrow_back, org.telegram.messenger.id.M0(2131753756, null), new org.telegram.ui.iq0(I, 27), false);
            J.c(R.drawable.msg_tone_on, org.telegram.messenger.id.M0(2131745275, null), new Runnable() { // from class: org.telegram.ui.Components.rn
                @Override // java.lang.Runnable
                public final void run() {
                    l60.this.u();
                    SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(currentAccount).d7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j14 = j13;
                    long j15 = j12;
                    sb2.append(org.telegram.messenger.dt.v(j14, j15, false));
                    boolean z12 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z13 = !z12;
                    sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(j14, j15, false), z13).apply();
                    J.u();
                    org.telegram.ui.ActionBar.f2 f2Var = cnVar;
                    if (hc.a(f2Var)) {
                        hc.S(z12 ? 1 : 0, f2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.z0 y11 = J.y();
            J.c(R.drawable.msg_mute_period, org.telegram.messenger.id.M0(2131748308, null), new ai.a1(I, resourceProvider, currentAccount, qnVar, 21), false);
            J.c(R.drawable.msg_customize, org.telegram.messenger.id.M0(2131747917, null), new sn(I, j13, j12, cnVar, resourceProvider), false);
            J.c(0, "", new bi.ra(I, currentAccount, j13, j12, cnVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.z0 y12 = J.y();
            new Runnable() { // from class: org.telegram.ui.Components.tn
                @Override // java.lang.Runnable
                public final void run() {
                    int i14;
                    int i15 = currentAccount;
                    org.telegram.messenger.qp s14 = org.telegram.messenger.qp.s1(i15);
                    long j14 = j13;
                    long j15 = j12;
                    boolean r22 = s14.r2(j14, j15, null);
                    org.telegram.ui.ActionBar.z0 z0Var = y12;
                    org.telegram.ui.ActionBar.z0 z0Var2 = y11;
                    if (r22) {
                        z0Var.j(org.telegram.messenger.id.M0(2131743848, null), R.drawable.msg_unmute, null);
                        i14 = org.telegram.ui.ActionBar.l6.x6;
                        z0Var2.setVisibility(8);
                    } else {
                        z0Var.j(org.telegram.messenger.id.M0(2131748306, null), R.drawable.msg_mute, null);
                        int i16 = org.telegram.ui.ActionBar.l6.q7;
                        z0Var2.setVisibility(0);
                        if (org.telegram.messenger.qp.s1(i15).s2(j14, j15)) {
                            z0Var2.j(org.telegram.messenger.id.M0(2131745277, null), R.drawable.msg_tone_off, null);
                        } else {
                            z0Var2.j(org.telegram.messenger.id.M0(2131745275, null), R.drawable.msg_tone_on, null);
                        }
                        i14 = i16;
                    }
                    yn.c(z0Var, i14);
                }
            }.run();
            long j14 = tL_forumTopic2.id;
            long j15 = n11Var.f;
            org.telegram.messenger.qp qpVar2 = qpVar;
            boolean r22 = qpVar2.r2(j15, j14, null);
            int i14 = r22 ? R.drawable.msg_unmute : R.drawable.msg_mute;
            int i15 = r22 ? 2131743849 : 2131748314;
            TLRPC.Chat chat2 = M0;
            n11Var2 = this;
            l60Var = I;
            l60Var.c(i14, org.telegram.messenger.id.M0(i15, null), new o10(n11Var2, qpVar2, tL_forumTopic, I, J, 3), false);
            if (!org.telegram.messenger.t3.i(i11, chat2, tL_forumTopic) || org.telegram.messenger.t10.u(a22)) {
                z10 = false;
                i10 = 1;
            } else {
                boolean z12 = tL_forumTopic.closed;
                i10 = 1;
                z10 = false;
                l60Var.c(z12 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, org.telegram.messenger.id.M0(z12 ? 2131746084 : 2131752039, null), new Runnable(n11Var2) { // from class: org.telegram.ui.Components.z01
                    public final /* synthetic */ n11 b;

                    {
                        this.b = n11Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        n11 n11Var3;
                        int i142 = i10;
                        n11 n11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        l60 l60Var2 = l60Var;
                        switch (i142) {
                            case 0:
                                l60Var2.u();
                                n11Var4.s.presentFragment(w81.f0(-n11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                n11Var4.getClass();
                                l60Var2.u();
                                org.telegram.messenger.qp.s1(n11Var4.e).q7.z(tL_forumTopic3.id, -n11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                l60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                vs vsVar = new vs(9);
                                n11 n11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n11Var5.getContext());
                                String K0 = org.telegram.messenger.id.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = n11Var5.e0;
                                if (hashSet.size() == 1) {
                                    n11Var3 = n11Var5;
                                    u1Var.T = org.telegram.messenger.id.a0(null, null, 2131751498, org.telegram.messenger.qp.s1(n11Var5.e).q7.f(-n11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    n11Var3 = n11Var5;
                                    u1Var.T = org.telegram.messenger.id.M0(2131751497, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new bi.n4(n11Var3, arrayList, j122, hashSet, vsVar));
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new jl0(13));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (org.telegram.messenger.t3.e(i11, chat2, tL_forumTopic)) {
                final int i16 = 2;
                l60Var.c(R.drawable.msg_delete, org.telegram.messenger.id.K0(i10, "DeleteTopics"), new Runnable(n11Var2) { // from class: org.telegram.ui.Components.z01
                    public final /* synthetic */ n11 b;

                    {
                        this.b = n11Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        n11 n11Var3;
                        int i142 = i16;
                        n11 n11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        l60 l60Var2 = l60Var;
                        switch (i142) {
                            case 0:
                                l60Var2.u();
                                n11Var4.s.presentFragment(w81.f0(-n11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                n11Var4.getClass();
                                l60Var2.u();
                                org.telegram.messenger.qp.s1(n11Var4.e).q7.z(tL_forumTopic3.id, -n11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                l60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                vs vsVar = new vs(9);
                                n11 n11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n11Var5.getContext());
                                String K0 = org.telegram.messenger.id.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = n11Var5.e0;
                                if (hashSet.size() == 1) {
                                    n11Var3 = n11Var5;
                                    u1Var.T = org.telegram.messenger.id.a0(null, null, 2131751498, org.telegram.messenger.qp.s1(n11Var5.e).q7.f(-n11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    n11Var3 = n11Var5;
                                    u1Var.T = org.telegram.messenger.id.M0(2131751497, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new bi.n4(n11Var3, arrayList, j122, hashSet, vsVar));
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new jl0(13));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, z10);
            }
        }
        boolean z13 = view instanceof i11;
        org.telegram.ui.ActionBar.g6 g6Var = n11Var2.h;
        if (z13) {
            d11 d11Var = new d11();
            Paint paint = new Paint(1);
            d11Var.a = paint;
            d11Var.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, g6Var));
            l60Var.W(d11Var);
            l60Var.a0(org.telegram.messenger.g0.L(16.0f), 0.0f);
        } else if (z9) {
            l60Var.W(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, g6Var)));
            l60Var.V(5);
        } else {
            int L = org.telegram.messenger.g0.L(5.0f);
            int L2 = org.telegram.messenger.g0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, g6Var);
            float f10 = 0;
            float f11 = L;
            float f12 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f10, f10}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            l60Var.W(shapeDrawable);
        }
        l60Var.Z();
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
        org.telegram.ui.ae aeVar = this.R;
        if (aeVar != null) {
            aeVar.run();
        }
        i();
        float k10 = k(j11.b);
        float W1 = org.telegram.messenger.g0.W1(k10, -org.telegram.messenger.g0.L(78.0f), 0);
        FrameLayout frameLayout = this.I;
        frameLayout.setTranslationX(W1);
        frameLayout.setVisibility(k10 <= 0.0f ? 8 : 0);
        e();
        int i7 = org.telegram.ui.ActionBar.l6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.E;
        org.telegram.ui.ActionBar.g6 g6Var = this.h;
        org.telegram.ui.ActionBar.s6.s(imageView, i7, g6Var, mode);
        org.telegram.ui.ActionBar.s6.s(this.F, i7, g6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        a11 a11Var = this.y;
        boolean canScrollHorizontally = a11Var.canScrollHorizontally(-1);
        a11Var.f3.O(true);
        if (!canScrollHorizontally) {
            a11Var.v0(0);
        }
        c11 c11Var = this.J;
        boolean canScrollVertically = c11Var.canScrollVertically(-1);
        c11Var.f3.O(true);
        if (!canScrollVertically) {
            c11Var.v0(0);
        }
        org.telegram.messenger.g0.h3(new x01(this, 0));
    }

    public final void r(boolean z9) {
        this.b.a(!this.c || this.d, z9);
    }

    public void setAllTopicsHidden(boolean z9) {
        if (this.j0 != z9) {
            this.j0 = z9;
            g(true);
        }
    }

    public void setCurrentTopic(long j3) {
        this.e0 = j3;
        a11 a11Var = this.y;
        a11Var.f3.O(true);
        a11Var.invalidate();
        this.J.f3.O(true);
        m11 m11Var = this.D;
        if (m11Var != null) {
            m11Var.c(true, false, j3 == 0);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.v10 v10Var) {
        this.i0 = v10Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.v10 v10Var) {
        this.g0 = v10Var;
    }

    public void setSideMenuBackgroundDrawable(fh.g gVar) {
        this.N = gVar;
        gVar.r(org.telegram.messenger.g0.L(16.0f));
        this.N.q(org.telegram.messenger.g0.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f10) {
        this.P = f10;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f10) {
        this.Q = f10;
        this.I.setTranslationY(f10);
        i();
        f();
        invalidate();
    }

    public void setTabsEnabled(boolean z9) {
        if (this.c == z9) {
            return;
        }
        this.c = z9;
        if (!z9) {
            d(false);
        }
        r(true);
    }

    public void setTopMenuBackgroundDrawable(fh.g gVar) {
        this.O = gVar;
        gVar.r(org.telegram.messenger.g0.L(18.0f));
        this.O.q(org.telegram.messenger.g0.L(7.0f));
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
