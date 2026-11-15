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
import org.telegram.ui.s81;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p11 extends FrameLayout implements org.telegram.messenger.is, te.b, org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int m0 = 0;
    public final o11 E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final e11 K;
    public long L;
    public long M;
    public final te.a N;
    public fh.g O;
    public fh.g P;
    public float Q;
    public float R;
    public org.telegram.ui.yd S;
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
    public final org.telegram.ui.ActionBar.e6 h;
    public org.telegram.messenger.s10 h0;
    public Runnable i0;
    public org.telegram.messenger.s10 j0;
    public boolean k0;
    public final HashSet l0;
    public final boolean n;
    public final boolean r;
    public final org.telegram.ui.an s;
    public final boolean w;
    public final FrameLayout x;
    public final c11 y;

    /* JADX WARN: Type inference failed for: r3v8, types: [org.telegram.ui.Components.x01] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.x01] */
    public p11(Activity activity, org.telegram.ui.an anVar, int i7, long j3, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        ViewGroup viewGroup;
        boolean z11;
        er erVar = er.h;
        this.a = new te.a(0, this, erVar, 380L, true);
        this.b = new te.a(1, this, erVar, 380L, false);
        this.N = new te.a(0, new y01(this), erVar, 320L, false);
        this.V = 0.0f;
        this.l0 = new HashSet();
        this.s = anVar;
        this.c = z10;
        this.e = i7;
        this.f = j3;
        this.h = e6Var;
        long j10 = -j3;
        this.n = org.telegram.messenger.t3.p0(org.telegram.messenger.np.s1(i7).M0(Long.valueOf(j10)));
        boolean v = org.telegram.messenger.q10.v(org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3)));
        this.r = v;
        final int i10 = 0;
        final int i11 = 1;
        this.w = !org.telegram.messenger.k5.w("topics_end_reached_", j10, org.telegram.messenger.m10.i(i7).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        addView(frameLayout, c8.ja.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.J = frameLayout2;
        addView(frameLayout2, c8.ja.d(64, -1.0f, org.telegram.messenger.ns.A1, 7.0f, 7.0f, 7.0f, 7.0f));
        c11 c11Var = new c11(this, activity, i7, new org.telegram.messenger.s10(this) { // from class: org.telegram.ui.Components.x01
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i12;
                long j11;
                org.telegram.messenger.h00 h00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i10;
                p11 p11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p41 p41Var = (p41) obj2;
                        boolean z15 = p11Var.r;
                        int i14 = p11Var.e;
                        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i14);
                        long j15 = p11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.np.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.h00 h00Var2 = org.telegram.messenger.np.s1(i14).r7;
                        ArrayList l10 = h00Var2.l(j16);
                        boolean z16 = p11Var.n;
                        int i15 = j11.b;
                        b41 K = b41.K(j11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(p11Var.f0 == 0);
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
                                if (p11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b41) i5.c.h(1, arrayList2)).y |= 8;
                                        }
                                        p41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        p41Var.M();
                                        z12 = true;
                                    }
                                    b41 K2 = b41.K(j11.class);
                                    K2.x = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = p11Var.f0;
                                    if (z16) {
                                        h00Var = h00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        h00Var = h00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    h00Var2 = h00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.h00 h00Var3 = h00Var2;
                        if (z12) {
                            p41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !h00Var3.e(j16) && p11Var.w) {
                            b41 K3 = b41.K(j11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            b41 K4 = b41.K(j11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            b41 K5 = b41.K(j11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.q10.v(a22)) {
                                b41 K6 = b41.K(j11.class);
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
                        p11.c(p11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p41 p41Var2 = (p41) obj2;
                        boolean z18 = p11Var.n;
                        int i19 = p11Var.e;
                        org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(i19);
                        long j18 = p11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.np.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.h00 h00Var4 = org.telegram.messenger.np.s1(i19).r7;
                        ArrayList l11 = h00Var4.l(j19);
                        boolean z19 = p11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = n11.b;
                            b41 K7 = b41.K(n11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(p11Var.f0 == 0);
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
                                if (p11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        p41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        p41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = n11.b;
                                    b41 K8 = b41.K(n11.class);
                                    K8.x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = p11Var.f0;
                                    if (z18) {
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
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z13) {
                            p41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !h00Var4.e(j19) && p11Var.w) {
                            int i24 = n11.b;
                            b41 K9 = b41.K(n11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b41 K10 = b41.K(n11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b41 K11 = b41.K(n11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.q10.v(user2)) {
                                int i25 = n11.b;
                                b41 K12 = b41.K(n11.class);
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
        }, new y01(this), new y01(this), e6Var);
        this.y = c11Var;
        c11Var.E1(new org.telegram.messenger.s10(this) { // from class: org.telegram.ui.Components.x01
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i12;
                long j11;
                org.telegram.messenger.h00 h00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i11;
                p11 p11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p41 p41Var = (p41) obj2;
                        boolean z15 = p11Var.r;
                        int i14 = p11Var.e;
                        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i14);
                        long j15 = p11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.np.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.h00 h00Var2 = org.telegram.messenger.np.s1(i14).r7;
                        ArrayList l10 = h00Var2.l(j16);
                        boolean z16 = p11Var.n;
                        int i15 = j11.b;
                        b41 K = b41.K(j11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(p11Var.f0 == 0);
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
                                if (p11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b41) i5.c.h(1, arrayList2)).y |= 8;
                                        }
                                        p41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        p41Var.M();
                                        z12 = true;
                                    }
                                    b41 K2 = b41.K(j11.class);
                                    K2.x = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = p11Var.f0;
                                    if (z16) {
                                        h00Var = h00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        h00Var = h00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    h00Var2 = h00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.h00 h00Var3 = h00Var2;
                        if (z12) {
                            p41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !h00Var3.e(j16) && p11Var.w) {
                            b41 K3 = b41.K(j11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            b41 K4 = b41.K(j11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            b41 K5 = b41.K(j11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.q10.v(a22)) {
                                b41 K6 = b41.K(j11.class);
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
                        p11.c(p11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p41 p41Var2 = (p41) obj2;
                        boolean z18 = p11Var.n;
                        int i19 = p11Var.e;
                        org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(i19);
                        long j18 = p11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.np.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.h00 h00Var4 = org.telegram.messenger.np.s1(i19).r7;
                        ArrayList l11 = h00Var4.l(j19);
                        boolean z19 = p11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = n11.b;
                            b41 K7 = b41.K(n11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(p11Var.f0 == 0);
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
                                if (p11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        p41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        p41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = n11.b;
                                    b41 K8 = b41.K(n11.class);
                                    K8.x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = p11Var.f0;
                                    if (z18) {
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
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z13) {
                            p41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !h00Var4.e(j19) && p11Var.w) {
                            int i24 = n11.b;
                            b41 K9 = b41.K(n11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b41 K10 = b41.K(n11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b41 K11 = b41.K(n11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.q10.v(user2)) {
                                int i25 = n11.b;
                                b41 K12 = b41.K(n11.class);
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
        c11Var.setWillNotDraw(false);
        c11Var.g3.r = false;
        c11Var.getContext();
        jg.i0 i0Var = new jg.i0((ViewGroup) c11Var, 7);
        c11Var.f3 = i0Var;
        c11Var.setLayoutManager(i0Var);
        frameLayout.addView(c11Var, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 41.0f, 0.0f, 0.0f, 0.0f));
        c11Var.j(new d11(this, 0));
        if (v) {
            o11 o11Var = new o11(i7, activity, e6Var);
            this.E = o11Var;
            o11Var.c(true, false, this.f0 == 0);
            o11Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w01
                public final /* synthetic */ p11 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            p11 p11Var = this.b;
                            e11 e11Var = p11Var.K;
                            e11Var.z1(false);
                            c11 c11Var2 = p11Var.y;
                            c11Var2.z1(false);
                            p11Var.N.a(false, true);
                            org.telegram.messenger.g0.a4(e11Var);
                            org.telegram.messenger.g0.a4(c11Var2);
                            break;
                        case 1:
                            this.b.h0.a(0, Boolean.FALSE);
                            break;
                        default:
                            p11.b(this.b);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(o11Var, c8.ja.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.E = null;
        }
        final int i12 = 2;
        ViewGroup viewGroup2 = viewGroup;
        e11 e11Var = new e11(activity, i7, new org.telegram.messenger.s10(this) { // from class: org.telegram.ui.Components.x01
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i122;
                long j11;
                org.telegram.messenger.h00 h00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i12;
                p11 p11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p41 p41Var = (p41) obj2;
                        boolean z15 = p11Var.r;
                        int i14 = p11Var.e;
                        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i14);
                        long j15 = p11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.np.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.h00 h00Var2 = org.telegram.messenger.np.s1(i14).r7;
                        ArrayList l10 = h00Var2.l(j16);
                        boolean z16 = p11Var.n;
                        int i15 = j11.b;
                        b41 K = b41.K(j11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(p11Var.f0 == 0);
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
                                if (p11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b41) i5.c.h(1, arrayList2)).y |= 8;
                                        }
                                        p41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        p41Var.M();
                                        z12 = true;
                                    }
                                    b41 K2 = b41.K(j11.class);
                                    K2.x = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = p11Var.f0;
                                    if (z16) {
                                        h00Var = h00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        h00Var = h00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    h00Var2 = h00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.h00 h00Var3 = h00Var2;
                        if (z12) {
                            p41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !h00Var3.e(j16) && p11Var.w) {
                            b41 K3 = b41.K(j11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            b41 K4 = b41.K(j11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            b41 K5 = b41.K(j11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.q10.v(a22)) {
                                b41 K6 = b41.K(j11.class);
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
                        p11.c(p11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p41 p41Var2 = (p41) obj2;
                        boolean z18 = p11Var.n;
                        int i19 = p11Var.e;
                        org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(i19);
                        long j18 = p11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.np.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.h00 h00Var4 = org.telegram.messenger.np.s1(i19).r7;
                        ArrayList l11 = h00Var4.l(j19);
                        boolean z19 = p11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = n11.b;
                            b41 K7 = b41.K(n11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(p11Var.f0 == 0);
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
                                if (p11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        p41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        p41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = n11.b;
                                    b41 K8 = b41.K(n11.class);
                                    K8.x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = p11Var.f0;
                                    if (z18) {
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
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z13) {
                            p41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !h00Var4.e(j19) && p11Var.w) {
                            int i24 = n11.b;
                            b41 K9 = b41.K(n11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b41 K10 = b41.K(n11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b41 K11 = b41.K(n11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.q10.v(user2)) {
                                int i25 = n11.b;
                                b41 K12 = b41.K(n11.class);
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
        }, new y01(this), new y01(this), e6Var);
        this.K = e11Var;
        e11Var.E1(new org.telegram.messenger.s10(this) { // from class: org.telegram.ui.Components.x01
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                boolean z12;
                int i122;
                long j11;
                org.telegram.messenger.h00 h00Var;
                long j12;
                ArrayList arrayList;
                boolean z13;
                boolean z14;
                long j13;
                long j14;
                int i13 = i11;
                p11 p11Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p41 p41Var = (p41) obj2;
                        boolean z15 = p11Var.r;
                        int i14 = p11Var.e;
                        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i14);
                        long j15 = p11Var.f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.np.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.h00 h00Var2 = org.telegram.messenger.np.s1(i14).r7;
                        ArrayList l10 = h00Var2.l(j16);
                        boolean z16 = p11Var.n;
                        int i15 = j11.b;
                        b41 K = b41.K(j11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z16;
                        K.L(p11Var.f0 == 0);
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
                                if (p11Var.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z17 = tL_forumTopic.pinned;
                                    if (!z17 && z12) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b41) i5.c.h(1, arrayList2)).y |= 8;
                                        }
                                        p41Var.L();
                                        z12 = false;
                                    } else if (z17 && !z12) {
                                        p41Var.M();
                                        z12 = true;
                                    }
                                    b41 K2 = b41.K(j11.class);
                                    K2.x = j15;
                                    K2.d = tL_forumTopic.id;
                                    K2.G = tL_forumTopic;
                                    if (z16) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = p11Var.f0;
                                    if (z16) {
                                        h00Var = h00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        h00Var = h00Var2;
                                        j12 = tL_forumTopic.id;
                                    }
                                    K2.L(j17 == j12);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    h00Var2 = h00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.h00 h00Var3 = h00Var2;
                        if (z12) {
                            p41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !h00Var3.e(j16) && p11Var.w) {
                            b41 K3 = b41.K(j11.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList2.add(K3);
                            b41 K4 = b41.K(j11.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList2.add(K4);
                            b41 K5 = b41.K(j11.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList2.add(K5);
                        }
                        if (!z15 && !z16) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.q10.v(a22)) {
                                b41 K6 = b41.K(j11.class);
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
                        p11.c(p11Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p41 p41Var2 = (p41) obj2;
                        boolean z18 = p11Var.n;
                        int i19 = p11Var.e;
                        org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(i19);
                        long j18 = p11Var.f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.np.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.h00 h00Var4 = org.telegram.messenger.np.s1(i19).r7;
                        ArrayList l11 = h00Var4.l(j19);
                        boolean z19 = p11Var.r;
                        if (z19) {
                            arrayList = l11;
                        } else {
                            int i20 = n11.b;
                            b41 K7 = b41.K(n11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z18;
                            K7.y = z19 ? 1 : 0;
                            K7.L(p11Var.f0 == 0);
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
                                if (p11Var.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z20 = z14;
                                } else {
                                    boolean z21 = tL_forumTopic2.pinned;
                                    if (!z21 && z14) {
                                        p41Var2.L();
                                        z20 = false;
                                    } else if (!z21 || z14) {
                                        z20 = z14;
                                    } else {
                                        p41Var2.M();
                                        z20 = true;
                                    }
                                    int i23 = n11.b;
                                    b41 K8 = b41.K(n11.class);
                                    K8.x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.id;
                                    K8.G = tL_forumTopic2;
                                    if (z18) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = p11Var.f0;
                                    if (z18) {
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
                            z13 = z20;
                        } else {
                            z13 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z13) {
                            p41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !h00Var4.e(j19) && p11Var.w) {
                            int i24 = n11.b;
                            b41 K9 = b41.K(n11.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b41 K10 = b41.K(n11.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b41 K11 = b41.K(n11.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z19 && !z18) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.q10.v(user2)) {
                                int i25 = n11.b;
                                b41 K12 = b41.K(n11.class);
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
        e11Var.g3.r = false;
        e11Var.setClipToPadding(false);
        e11Var.setClipChildren(false);
        viewGroup2.addView(e11Var, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, v ? 90.0f : 48.0f, 0.0f, 0.0f));
        e11Var.j(new d11(this, i11));
        final int i13 = 2;
        ImageView j11 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w01
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        p11 p11Var = this.b;
                        e11 e11Var2 = p11Var.K;
                        e11Var2.z1(false);
                        c11 c11Var2 = p11Var.y;
                        c11Var2.z1(false);
                        p11Var.N.a(false, true);
                        org.telegram.messenger.g0.a4(e11Var2);
                        org.telegram.messenger.g0.a4(c11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        p11.b(this.b);
                        break;
                }
            }
        });
        this.H = j11;
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w01
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        p11 p11Var = this.b;
                        e11 e11Var2 = p11Var.K;
                        e11Var2.z1(false);
                        c11 c11Var2 = p11Var.y;
                        c11Var2.z1(false);
                        p11Var.N.a(false, true);
                        org.telegram.messenger.g0.a4(e11Var2);
                        org.telegram.messenger.g0.a4(c11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        p11.b(this.b);
                        break;
                }
            }
        });
        this.I = j12;
        frameLayout.addView(j11, c8.ja.e(44, 36, 51));
        viewGroup2.addView(j12, c8.ja.e(64, 48, 51));
        final int i14 = 0;
        ImageView j13 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w01
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        p11 p11Var = this.b;
                        e11 e11Var2 = p11Var.K;
                        e11Var2.z1(false);
                        c11 c11Var2 = p11Var.y;
                        c11Var2.z1(false);
                        p11Var.N.a(false, true);
                        org.telegram.messenger.g0.a4(e11Var2);
                        org.telegram.messenger.g0.a4(c11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        p11.b(this.b);
                        break;
                }
            }
        });
        this.F = j13;
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w01
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        p11 p11Var = this.b;
                        e11 e11Var2 = p11Var.K;
                        e11Var2.z1(false);
                        c11 c11Var2 = p11Var.y;
                        c11Var2.z1(false);
                        p11Var.N.a(false, true);
                        org.telegram.messenger.g0.a4(e11Var2);
                        org.telegram.messenger.g0.a4(c11Var2);
                        break;
                    case 1:
                        this.b.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        p11.b(this.b);
                        break;
                }
            }
        });
        this.G = j14;
        frameLayout.addView(j13, c8.ja.e(44, 36, 51));
        viewGroup2.addView(j14, c8.ja.e(64, 48, 51));
        org.telegram.messenger.np.s1(i7).r7.n(3, j10, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i7).f7;
        if (z10 && org.telegram.messenger.k5.w("topicssidetabs", j3, sharedPreferences, false)) {
            this.V = 1.0f;
            z11 = true;
            this.U = true;
        } else {
            z11 = true;
        }
        boolean z12 = (z10 && org.telegram.messenger.k5.w("topicssidetabsb", j3, sharedPreferences, false)) ? z11 : false;
        this.T = z12;
        j12.setImageResource(z12 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        r(false);
        j11.setImageResource(!this.T ? R.drawable.menu_sidebar_left : R.drawable.menu_sidebar_top);
        g(false);
        h();
        p();
        q();
    }

    public static void a(p11 p11Var, b41 b41Var) {
        if (p11Var.n) {
            org.telegram.messenger.s10 s10Var = p11Var.j0;
            if (s10Var != null) {
                s10Var.a(Long.valueOf(b41Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (b41Var.B == -2) {
            Runnable runnable = p11Var.i0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        org.telegram.messenger.s10 s10Var2 = p11Var.h0;
        if (s10Var2 != null) {
            s10Var2.a(Integer.valueOf(b41Var.d), Boolean.FALSE);
        }
    }

    public static void b(p11 p11Var) {
        boolean z10 = p11Var.U;
        boolean z11 = true;
        if (!z10 && p11Var.T && p11Var.d0 == null && !p11Var.W) {
            if (p11Var.d) {
                return;
            }
            p11Var.d = true;
            p11Var.r(true);
            return;
        }
        if ((r2 = p11Var.d0) != null) {
            z11 = false;
            p11Var.d(z11);
        } else {
            z11 = false;
            p11Var.d(z11);
        }
    }

    public static void c(p11 p11Var, ArrayList arrayList) {
        long j3 = p11Var.f;
        org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(p11Var.e).r7;
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (i7 < arrayList.size()) {
            i7 = com.google.android.gms.internal.vision.e2.f(((b41) arrayList.get(i7)).d, i7, 1, arrayList2);
        }
        long j10 = -j3;
        h00Var.w(arrayList2, j10);
        h00Var.y(j10, false);
    }

    public static ImageView j(Context context, int i7, View.OnClickListener onClickListener) {
        ImageView e10 = org.telegram.messenger.i20.e(context, i7);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        e10.setOnClickListener(onClickListener);
        c8.na.a(e10);
        return e10;
    }

    private void setAttached(boolean z10) {
        if (this.g0 == z10) {
            return;
        }
        this.g0 = z10;
        int i7 = org.telegram.messenger.ns.r;
        int i10 = org.telegram.messenger.ns.q5;
        long j3 = this.f;
        int i11 = this.e;
        if (!z10) {
            long j10 = -j3;
            LongSparseIntArray longSparseIntArray = org.telegram.messenger.np.s1(i11).r7.f;
            int i12 = longSparseIntArray.get(j10, 0) - 1;
            longSparseIntArray.put(j10, i12 >= 0 ? i12 : 0);
            org.telegram.messenger.ns.f(i11).n(this, i10);
            org.telegram.messenger.ns.f(i11).n(this, i7);
            return;
        }
        org.telegram.messenger.ns.f(i11).c(this, i10);
        org.telegram.messenger.ns.f(i11).c(this, i7);
        org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(i11).r7;
        long j11 = -j3;
        LongSparseIntArray longSparseIntArray2 = h00Var.f;
        longSparseIntArray2.put(j11, longSparseIntArray2.get(j11, 0) + 1);
        h00Var.y(j11, true);
    }

    @Override // te.b
    public final void E(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(R.drawable.menu_sidebar_left);
            this.I.setImageResource(R.drawable.menu_sidebar_bottom);
            org.telegram.messenger.np.s1(this.e).f7.edit().putBoolean("topicssidetabsb" + this.f, false).apply();
            r(true);
        }
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        p();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
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
        ofFloat.addUpdateListener(new f60(this, 26));
        this.e0.addListener(new org.telegram.ui.nn(22, this, z10));
        this.e0.setInterpolator(pi.k.V);
        this.e0.setDuration(250L);
        this.e0.start();
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.q5;
        long j3 = this.f;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() != (-j3)) {
                return;
            }
            q();
        } else if (i7 == org.telegram.messenger.ns.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.np.D8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.np.s1(this.e).r7.y(-j3, false);
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
        int i7 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
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
        ArrayList l10 = org.telegram.messenger.np.s1(this.e).r7.l(-this.f);
        this.a.a((l10 == null || l10.isEmpty() || this.k0) ? false : true, z10);
    }

    public l11 getCurrentTabsPosition() {
        return this.U ? l11.b : this.T ? l11.c : l11.a;
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
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f)) - this.Q) + org.telegram.messenger.g0.W1(k(l11.c), org.telegram.messenger.g0.L(43.0f), 0));
        } else {
            frameLayout.setTranslationY(this.R + org.telegram.messenger.g0.W1(k(l11.a), -org.telegram.messenger.g0.L(43.0f), 0));
        }
    }

    public final float k(l11 l11Var) {
        float f10 = (1.0f - this.b.e) * this.a.e;
        if (l11Var == l11.b) {
            return this.V * f10;
        }
        if ((l11Var != l11.a || this.T) && !(l11Var == l11.c && this.T)) {
            return 0.0f;
        }
        return (1.0f - this.V) * f10;
    }

    public final boolean l() {
        if (this.V <= 0.5f) {
            int i7 = 0;
            while (true) {
                c11 c11Var = this.y;
                if (i7 >= c11Var.getChildCount()) {
                    break;
                }
                b41 G = c11Var.g3.G(RecyclerView.R(c11Var.getChildAt(i7)));
                if (G != null && G.r) {
                    return true;
                }
                i7++;
            }
        } else {
            int i10 = 0;
            while (true) {
                e11 e11Var = this.K;
                if (i10 >= e11Var.getChildCount()) {
                    break;
                }
                b41 G2 = e11Var.g3.G(RecyclerView.R(e11Var.getChildAt(i10)));
                if (G2 != null && G2.r) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(this.e).r7;
        long j3 = this.f;
        if (h00Var.e(-j3)) {
            return;
        }
        h00Var.o(-j3);
    }

    public final void n(long j3, boolean z10) {
        if (this.n) {
            org.telegram.messenger.s10 s10Var = this.j0;
            if (s10Var != null) {
                s10Var.a(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.s10 s10Var2 = this.h0;
        if (s10Var2 != null) {
            s10Var2.a(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        org.telegram.messenger.np npVar;
        final p11 p11Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i7;
        final p11 p11Var2;
        final m60 m60Var;
        boolean z11;
        final int i10;
        int i11 = this.e;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i11);
        long j3 = this.f;
        TLRPC.Chat M0 = j3 < 0 ? s12.M0(Long.valueOf(-j3)) : null;
        TLRPC.User a22 = j3 > 0 ? s12.a2(Long.valueOf(j3)) : null;
        final org.telegram.ui.an anVar = this.s;
        final m60 I = m60.I(anVar, view);
        int i12 = 1;
        final int i13 = 0;
        if (org.telegram.messenger.t3.p0(M0)) {
            long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            if (o4 == 0 || !org.telegram.messenger.t3.A(i11, M0, 24)) {
                return false;
            }
            TLRPC.Chat chat = M0;
            m60Var = I;
            m60Var.c(R.drawable.msg_clear, org.telegram.messenger.hd.M0(2131752089, null), new di.f2(this, m60Var, o4, chat, 17), false);
            long j10 = chat.id;
            if (org.telegram.messenger.t3.p0(chat) && org.telegram.messenger.t3.A(i11, chat, 24)) {
                long j11 = chat.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat M02 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(j10));
            TLRPC.User a23 = org.telegram.messenger.np.s1(i11).a2(Long.valueOf(o4));
            if (a23 != null && org.telegram.messenger.t3.w(2, M02)) {
                m60Var.c(R.drawable.msg_remove, org.telegram.messenger.hd.M0(2131753726, null), null, false);
                org.telegram.ui.ActionBar.z0 y10 = m60Var.y();
                y10.setVisibility(8);
                org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(i11);
                di.w2 w2Var = new di.w2(this, y10, m60Var, j10, a23, M02, 3);
                m60Var = m60Var;
                s13.K0(M02, a23, w2Var);
            }
            p11Var2 = this;
        } else {
            if (org.telegram.messenger.t3.y(15, M0) || org.telegram.messenger.q10.v(a22)) {
                boolean z12 = tL_forumTopic.pinned;
                npVar = s12;
                p11Var = this;
                tL_forumTopic2 = tL_forumTopic;
                I.c(z12 ? R.drawable.msg_unpin : R.drawable.msg_pin, org.telegram.messenger.hd.M0(z12 ? 2131751452 : 2131751453, null), new u80(this, I, npVar, tL_forumTopic, 8), false);
                if (tL_forumTopic2.pinned && !z10) {
                    I.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131750707, null), new z01(p11Var, i12), false);
                }
                i7 = 15;
            } else {
                i7 = 15;
                tL_forumTopic2 = tL_forumTopic;
                npVar = s12;
                p11Var = this;
            }
            if (org.telegram.messenger.t3.y(i7, M0) || org.telegram.messenger.q10.v(a22)) {
                I.c(R.drawable.outline_profile_edit_24, org.telegram.messenger.hd.M0(2131751216, null), new Runnable(p11Var) { // from class: org.telegram.ui.Components.b11
                    public final /* synthetic */ p11 b;

                    {
                        this.b = p11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        p11 p11Var3;
                        int i14 = i13;
                        p11 p11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        m60 m60Var2 = I;
                        switch (i14) {
                            case 0:
                                m60Var2.u();
                                p11Var4.s.presentFragment(s81.f0(-p11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                p11Var4.getClass();
                                m60Var2.u();
                                org.telegram.messenger.np.s1(p11Var4.e).r7.z(tL_forumTopic3.id, -p11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                m60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                ih ihVar = new ih(13);
                                p11 p11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p11Var5.getContext());
                                String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = p11Var5.f0;
                                if (hashSet.size() == 1) {
                                    p11Var3 = p11Var5;
                                    t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131751498, org.telegram.messenger.np.s1(p11Var5.e).r7.f(-p11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    p11Var3 = p11Var5;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751497, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new di.o3(p11Var3, arrayList, j12, hashSet, ihVar));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(19));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            final long j12 = tL_forumTopic2.id;
            final int currentAccount = anVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.e6 resourceProvider = anVar.getResourceProvider();
            final long j13 = p11Var.f;
            yn ynVar = new yn(I, currentAccount, j13, j12, anVar, resourceProvider);
            final m60 J = I.J();
            J.c(R.drawable.msg_arrow_back, org.telegram.messenger.hd.M0(2131753756, null), new org.telegram.ui.fq0(I, 27), false);
            J.c(R.drawable.msg_tone_on, org.telegram.messenger.hd.M0(2131745275, null), new Runnable() { // from class: org.telegram.ui.Components.zn
                @Override // java.lang.Runnable
                public final void run() {
                    m60.this.u();
                    SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(currentAccount).e7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j14 = j13;
                    long j15 = j12;
                    sb2.append(org.telegram.messenger.at.v(j14, j15, false));
                    boolean z13 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z14 = !z13;
                    sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.at.v(j14, j15, false), z14).apply();
                    J.u();
                    org.telegram.ui.ActionBar.e2 e2Var = anVar;
                    if (cc.a(e2Var)) {
                        cc.S(z13 ? 1 : 0, e2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.z0 y11 = J.y();
            J.c(R.drawable.msg_mute_period, org.telegram.messenger.hd.M0(2131748308, null), new ci.p0(I, resourceProvider, currentAccount, ynVar, 21), false);
            J.c(R.drawable.msg_customize, org.telegram.messenger.hd.M0(2131747917, null), new ao(I, j13, j12, anVar, resourceProvider), false);
            J.c(0, "", new di.f9(I, currentAccount, j13, j12, anVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.z0 y12 = J.y();
            new Runnable() { // from class: org.telegram.ui.Components.bo
                @Override // java.lang.Runnable
                public final void run() {
                    int i14;
                    int i15 = currentAccount;
                    org.telegram.messenger.np s14 = org.telegram.messenger.np.s1(i15);
                    long j14 = j13;
                    long j15 = j12;
                    boolean r22 = s14.r2(j14, j15, null);
                    org.telegram.ui.ActionBar.z0 z0Var = y12;
                    org.telegram.ui.ActionBar.z0 z0Var2 = y11;
                    if (r22) {
                        z0Var.j(org.telegram.messenger.hd.M0(2131743848, null), R.drawable.msg_unmute, null);
                        i14 = org.telegram.ui.ActionBar.j6.x6;
                        z0Var2.setVisibility(8);
                    } else {
                        z0Var.j(org.telegram.messenger.hd.M0(2131748306, null), R.drawable.msg_mute, null);
                        int i16 = org.telegram.ui.ActionBar.j6.q7;
                        z0Var2.setVisibility(0);
                        if (org.telegram.messenger.np.s1(i15).s2(j14, j15)) {
                            z0Var2.j(org.telegram.messenger.hd.M0(2131745277, null), R.drawable.msg_tone_off, null);
                        } else {
                            z0Var2.j(org.telegram.messenger.hd.M0(2131745275, null), R.drawable.msg_tone_on, null);
                        }
                        i14 = i16;
                    }
                    io.c(z0Var, i14);
                }
            }.run();
            long j14 = tL_forumTopic2.id;
            long j15 = p11Var.f;
            org.telegram.messenger.np npVar2 = npVar;
            boolean r22 = npVar2.r2(j15, j14, null);
            int i14 = r22 ? R.drawable.msg_unmute : R.drawable.msg_mute;
            int i15 = r22 ? 2131743849 : 2131748314;
            TLRPC.Chat chat2 = M0;
            p11Var2 = this;
            m60Var = I;
            m60Var.c(i14, org.telegram.messenger.hd.M0(i15, null), new org.telegram.ui.hp(p11Var2, npVar2, tL_forumTopic, I, J, 6), false);
            if (!org.telegram.messenger.t3.i(i11, chat2, tL_forumTopic) || org.telegram.messenger.q10.u(a22)) {
                z11 = false;
                i10 = 1;
            } else {
                boolean z13 = tL_forumTopic.closed;
                i10 = 1;
                z11 = false;
                m60Var.c(z13 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, org.telegram.messenger.hd.M0(z13 ? 2131746084 : 2131752039, null), new Runnable(p11Var2) { // from class: org.telegram.ui.Components.b11
                    public final /* synthetic */ p11 b;

                    {
                        this.b = p11Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        p11 p11Var3;
                        int i142 = i10;
                        p11 p11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        m60 m60Var2 = m60Var;
                        switch (i142) {
                            case 0:
                                m60Var2.u();
                                p11Var4.s.presentFragment(s81.f0(-p11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                p11Var4.getClass();
                                m60Var2.u();
                                org.telegram.messenger.np.s1(p11Var4.e).r7.z(tL_forumTopic3.id, -p11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                m60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                ih ihVar = new ih(13);
                                p11 p11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p11Var5.getContext());
                                String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = p11Var5.f0;
                                if (hashSet.size() == 1) {
                                    p11Var3 = p11Var5;
                                    t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131751498, org.telegram.messenger.np.s1(p11Var5.e).r7.f(-p11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    p11Var3 = p11Var5;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751497, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new di.o3(p11Var3, arrayList, j122, hashSet, ihVar));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(19));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (org.telegram.messenger.t3.e(i11, chat2, tL_forumTopic)) {
                final int i16 = 2;
                m60Var.c(R.drawable.msg_delete, org.telegram.messenger.hd.K0(i10, "DeleteTopics"), new Runnable(p11Var2) { // from class: org.telegram.ui.Components.b11
                    public final /* synthetic */ p11 b;

                    {
                        this.b = p11Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        p11 p11Var3;
                        int i142 = i16;
                        p11 p11Var4 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        m60 m60Var2 = m60Var;
                        switch (i142) {
                            case 0:
                                m60Var2.u();
                                p11Var4.s.presentFragment(s81.f0(-p11Var4.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                p11Var4.getClass();
                                m60Var2.u();
                                org.telegram.messenger.np.s1(p11Var4.e).r7.z(tL_forumTopic3.id, -p11Var4.f, true ^ tL_forumTopic3.closed);
                                break;
                            default:
                                m60Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                ih ihVar = new ih(13);
                                p11 p11Var5 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p11Var5.getContext());
                                String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = p11Var5.f0;
                                if (hashSet.size() == 1) {
                                    p11Var3 = p11Var5;
                                    t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131751498, org.telegram.messenger.np.s1(p11Var5.e).r7.f(-p11Var5.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    p11Var3 = p11Var5;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751497, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new di.o3(p11Var3, arrayList, j122, hashSet, ihVar));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(19));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, z11);
            }
        }
        boolean z14 = view instanceof k11;
        org.telegram.ui.ActionBar.e6 e6Var = p11Var2.h;
        if (z14) {
            f11 f11Var = new f11();
            Paint paint = new Paint(1);
            f11Var.a = paint;
            f11Var.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, e6Var));
            m60Var.W(f11Var);
            m60Var.a0(org.telegram.messenger.g0.L(16.0f), 0.0f);
        } else if (z10) {
            m60Var.W(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var)));
            m60Var.V(5);
        } else {
            int L = org.telegram.messenger.g0.L(5.0f);
            int L2 = org.telegram.messenger.g0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var);
            float f10 = 0;
            float f11 = L;
            float f12 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f10, f10}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            m60Var.W(shapeDrawable);
        }
        m60Var.Z();
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
        org.telegram.ui.yd ydVar = this.S;
        if (ydVar != null) {
            ydVar.run();
        }
        i();
        float k10 = k(l11.b);
        float W1 = org.telegram.messenger.g0.W1(k10, -org.telegram.messenger.g0.L(78.0f), 0);
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(W1);
        frameLayout.setVisibility(k10 <= 0.0f ? 8 : 0);
        e();
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, mode);
        org.telegram.ui.ActionBar.q6.s(this.G, i7, e6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        c11 c11Var = this.y;
        boolean canScrollHorizontally = c11Var.canScrollHorizontally(-1);
        c11Var.g3.O(true);
        if (!canScrollHorizontally) {
            c11Var.v0(0);
        }
        e11 e11Var = this.K;
        boolean canScrollVertically = e11Var.canScrollVertically(-1);
        e11Var.g3.O(true);
        if (!canScrollVertically) {
            e11Var.v0(0);
        }
        org.telegram.messenger.g0.h3(new z01(this, 0));
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
        c11 c11Var = this.y;
        c11Var.g3.O(true);
        c11Var.invalidate();
        this.K.g3.O(true);
        o11 o11Var = this.E;
        if (o11Var != null) {
            o11Var.c(true, false, j3 == 0);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.s10 s10Var) {
        this.j0 = s10Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.s10 s10Var) {
        this.h0 = s10Var;
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            e();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
