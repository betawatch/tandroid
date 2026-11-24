// default package

import android.animation.ValueAnimator;
import android.app.Activity;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mzb extends FrameLayout implements jm7, g94, vlb {
    public final lzb E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final czb K;
    public long L;
    public long M;
    public final fn0 N;
    public im0 O;
    public im0 P;
    public float Q;
    public float R;
    public mz S;
    public boolean T;
    public boolean U;
    public float V;
    public boolean W;
    public final fn0 a;
    public boolean a0;
    public final fn0 b;
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
    public final ylb h;
    public jac h0;
    public Runnable i0;
    public jac j0;
    public boolean k0;
    public final HashSet l0;
    public final boolean n;
    public final boolean r;
    public final yv1 s;
    public final boolean w;
    public final FrameLayout x;
    public final azb y;

    /* JADX WARN: Type inference failed for: r3v8, types: [vyb] */
    /* JADX WARN: Type inference failed for: r4v3, types: [vyb] */
    public mzb(Activity activity, yv1 yv1Var, int i, long j, boolean z, ylb ylbVar) {
        super(activity);
        ViewGroup viewGroup;
        boolean z2;
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 380L, true);
        this.b = new fn0(1, this, d53Var, 380L, false);
        this.N = new fn0(0, new wyb(this), d53Var, 320L, false);
        this.V = 0.0f;
        this.l0 = new HashSet();
        this.s = yv1Var;
        this.c = z;
        this.e = i;
        this.f = j;
        this.h = ylbVar;
        long j2 = -j;
        this.n = sd2.p0(oc7.r1(i).L0(Long.valueOf(j2)));
        boolean x = m9c.x(oc7.r1(i).W1(Long.valueOf(j)));
        this.r = x;
        final byte b = 0;
        final byte b2 = 1;
        this.w = !kt6.w("topics_end_reached_", j2, z8c.h(i).j(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        addView(frameLayout, qoe.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.J = frameLayout2;
        addView(frameLayout2, qoe.d(64, -1.0f, nm7.z1, 7.0f, 7.0f, 7.0f, 7.0f));
        azb azbVar = new azb(this, activity, i, new jac(this) { // from class: vyb
            public final /* synthetic */ mzb b;

            {
                this.b = this;
            }

            @Override // jac
            public final void a(Object obj, Object obj2) {
                boolean z3;
                boolean z4;
                long j3;
                qwb qwbVar;
                long j4;
                boolean z5;
                int i2;
                long j5;
                long j6;
                long j7;
                byte b3 = b;
                mzb mzbVar = this.b;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        boolean z6 = mzbVar.r;
                        int i3 = mzbVar.e;
                        oc7 r1 = oc7.r1(i3);
                        long j8 = mzbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat L0 = r1.L0(Long.valueOf(j9));
                        TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(j8));
                        qwb qwbVar2 = oc7.r1(i3).g4;
                        ArrayList l = qwbVar2.l(j9);
                        boolean z7 = mzbVar.n;
                        int i4 = gzb.b;
                        c6c K = c6c.K(gzb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z7;
                        K.L(mzbVar.f0 == 0);
                        arrayList.add(K);
                        if (l != null) {
                            int size = l.size();
                            int i5 = 0;
                            z3 = false;
                            while (i5 < size) {
                                Object obj3 = l.get(i5);
                                int i6 = i5 + 1;
                                int i7 = size;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                if (z6) {
                                    z4 = z6;
                                    if (tL_forumTopic.id == 1) {
                                        size = i7;
                                        i5 = i6;
                                        z6 = z4;
                                    }
                                } else {
                                    z4 = z6;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                } else {
                                    if (tL_forumTopic.pinned) {
                                        if (!z3) {
                                            l7cVar.M();
                                            z3 = true;
                                        }
                                    } else if (z3) {
                                        if (!arrayList.isEmpty()) {
                                            ((c6c) b10.f(1, arrayList)).z |= 8;
                                        }
                                        l7cVar.L();
                                        z3 = false;
                                    }
                                    c6c K2 = c6c.K(gzb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z7) {
                                        j3 = j8;
                                        K2.C = pg3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = mzbVar.f0;
                                    if (z7) {
                                        qwbVar = qwbVar2;
                                        j4 = pg3.n(tL_forumTopic.from_id);
                                    } else {
                                        qwbVar = qwbVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    K2.L(j10 == j4);
                                    arrayList.add(K2);
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                    qwbVar2 = qwbVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        boolean z8 = z6;
                        qwb qwbVar3 = qwbVar2;
                        if (z3) {
                            l7cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qwbVar3.e(j9) && mzbVar.w) {
                            c6c K3 = c6c.K(gzb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c6c K4 = c6c.K(gzb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c6c K5 = c6c.K(gzb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z8 && !z7) {
                            if ((L0 != null && sd2.w(15, L0)) || m9c.x(W1)) {
                                c6c K6 = c6c.K(gzb.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        long j11 = mzbVar.f;
                        qwb qwbVar4 = oc7.r1(mzbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < arrayList2.size(); i8 = td4.g(((c6c) arrayList2.get(i8)).d, i8, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qwbVar4.w(arrayList3, j12);
                        qwbVar4.y(j12, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l7c l7cVar2 = (l7c) obj2;
                        boolean z9 = mzbVar.n;
                        int i9 = mzbVar.e;
                        oc7 r12 = oc7.r1(i9);
                        long j13 = mzbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat L02 = r12.L0(Long.valueOf(j14));
                        TLRPC.User W12 = oc7.r1(i9).W1(Long.valueOf(j13));
                        qwb qwbVar5 = oc7.r1(i9).g4;
                        ArrayList l2 = qwbVar5.l(j14);
                        boolean z10 = mzbVar.r;
                        if (!z10) {
                            int i10 = kzb.b;
                            c6c K7 = c6c.K(kzb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z9;
                            K7.z = z10 ? 1 : 0;
                            K7.L(mzbVar.f0 == 0);
                            arrayList4.add(K7);
                        }
                        if (l2 != null) {
                            int size2 = l2.size();
                            z5 = false;
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj4 = l2.get(i11);
                                i11++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = W12;
                                if (z10) {
                                    i2 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        W12 = user;
                                        size2 = i2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    W12 = user;
                                    size2 = i2;
                                } else {
                                    if (tL_forumTopic2.pinned) {
                                        if (!z5) {
                                            l7cVar2.M();
                                            z5 = true;
                                        }
                                    } else if (z5) {
                                        l7cVar2.L();
                                        z5 = false;
                                    }
                                    int i12 = kzb.b;
                                    c6c K8 = c6c.K(kzb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z9) {
                                        j5 = j13;
                                        K8.C = pg3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = mzbVar.f0;
                                    if (z9) {
                                        j6 = j15;
                                        j7 = pg3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    K8.L(j6 == j7);
                                    arrayList4.add(K8);
                                    W12 = user;
                                    size2 = i2;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        TLRPC.User user2 = W12;
                        if (z5) {
                            l7cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qwbVar5.e(j14) && mzbVar.w) {
                            int i13 = kzb.b;
                            c6c K9 = c6c.K(kzb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c6c K10 = c6c.K(kzb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c6c K11 = c6c.K(kzb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z10 && !z9) {
                            if ((L02 != null && sd2.w(15, L02)) || m9c.x(user2)) {
                                int i14 = kzb.b;
                                c6c K12 = c6c.K(kzb.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList4.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new wyb(this), new wyb(this), ylbVar);
        this.y = azbVar;
        azbVar.E1(new jac(this) { // from class: vyb
            public final /* synthetic */ mzb b;

            {
                this.b = this;
            }

            @Override // jac
            public final void a(Object obj, Object obj2) {
                boolean z3;
                boolean z4;
                long j3;
                qwb qwbVar;
                long j4;
                boolean z5;
                int i2;
                long j5;
                long j6;
                long j7;
                byte b3 = b2;
                mzb mzbVar = this.b;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        boolean z6 = mzbVar.r;
                        int i3 = mzbVar.e;
                        oc7 r1 = oc7.r1(i3);
                        long j8 = mzbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat L0 = r1.L0(Long.valueOf(j9));
                        TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(j8));
                        qwb qwbVar2 = oc7.r1(i3).g4;
                        ArrayList l = qwbVar2.l(j9);
                        boolean z7 = mzbVar.n;
                        int i4 = gzb.b;
                        c6c K = c6c.K(gzb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z7;
                        K.L(mzbVar.f0 == 0);
                        arrayList.add(K);
                        if (l != null) {
                            int size = l.size();
                            int i5 = 0;
                            z3 = false;
                            while (i5 < size) {
                                Object obj3 = l.get(i5);
                                int i6 = i5 + 1;
                                int i7 = size;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                if (z6) {
                                    z4 = z6;
                                    if (tL_forumTopic.id == 1) {
                                        size = i7;
                                        i5 = i6;
                                        z6 = z4;
                                    }
                                } else {
                                    z4 = z6;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                } else {
                                    if (tL_forumTopic.pinned) {
                                        if (!z3) {
                                            l7cVar.M();
                                            z3 = true;
                                        }
                                    } else if (z3) {
                                        if (!arrayList.isEmpty()) {
                                            ((c6c) b10.f(1, arrayList)).z |= 8;
                                        }
                                        l7cVar.L();
                                        z3 = false;
                                    }
                                    c6c K2 = c6c.K(gzb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z7) {
                                        j3 = j8;
                                        K2.C = pg3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = mzbVar.f0;
                                    if (z7) {
                                        qwbVar = qwbVar2;
                                        j4 = pg3.n(tL_forumTopic.from_id);
                                    } else {
                                        qwbVar = qwbVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    K2.L(j10 == j4);
                                    arrayList.add(K2);
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                    qwbVar2 = qwbVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        boolean z8 = z6;
                        qwb qwbVar3 = qwbVar2;
                        if (z3) {
                            l7cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qwbVar3.e(j9) && mzbVar.w) {
                            c6c K3 = c6c.K(gzb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c6c K4 = c6c.K(gzb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c6c K5 = c6c.K(gzb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z8 && !z7) {
                            if ((L0 != null && sd2.w(15, L0)) || m9c.x(W1)) {
                                c6c K6 = c6c.K(gzb.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        long j11 = mzbVar.f;
                        qwb qwbVar4 = oc7.r1(mzbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < arrayList2.size(); i8 = td4.g(((c6c) arrayList2.get(i8)).d, i8, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qwbVar4.w(arrayList3, j12);
                        qwbVar4.y(j12, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l7c l7cVar2 = (l7c) obj2;
                        boolean z9 = mzbVar.n;
                        int i9 = mzbVar.e;
                        oc7 r12 = oc7.r1(i9);
                        long j13 = mzbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat L02 = r12.L0(Long.valueOf(j14));
                        TLRPC.User W12 = oc7.r1(i9).W1(Long.valueOf(j13));
                        qwb qwbVar5 = oc7.r1(i9).g4;
                        ArrayList l2 = qwbVar5.l(j14);
                        boolean z10 = mzbVar.r;
                        if (!z10) {
                            int i10 = kzb.b;
                            c6c K7 = c6c.K(kzb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z9;
                            K7.z = z10 ? 1 : 0;
                            K7.L(mzbVar.f0 == 0);
                            arrayList4.add(K7);
                        }
                        if (l2 != null) {
                            int size2 = l2.size();
                            z5 = false;
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj4 = l2.get(i11);
                                i11++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = W12;
                                if (z10) {
                                    i2 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        W12 = user;
                                        size2 = i2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    W12 = user;
                                    size2 = i2;
                                } else {
                                    if (tL_forumTopic2.pinned) {
                                        if (!z5) {
                                            l7cVar2.M();
                                            z5 = true;
                                        }
                                    } else if (z5) {
                                        l7cVar2.L();
                                        z5 = false;
                                    }
                                    int i12 = kzb.b;
                                    c6c K8 = c6c.K(kzb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z9) {
                                        j5 = j13;
                                        K8.C = pg3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = mzbVar.f0;
                                    if (z9) {
                                        j6 = j15;
                                        j7 = pg3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    K8.L(j6 == j7);
                                    arrayList4.add(K8);
                                    W12 = user;
                                    size2 = i2;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        TLRPC.User user2 = W12;
                        if (z5) {
                            l7cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qwbVar5.e(j14) && mzbVar.w) {
                            int i13 = kzb.b;
                            c6c K9 = c6c.K(kzb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c6c K10 = c6c.K(kzb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c6c K11 = c6c.K(kzb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z10 && !z9) {
                            if ((L02 != null && sd2.w(15, L02)) || m9c.x(user2)) {
                                int i14 = kzb.b;
                                c6c K12 = c6c.K(kzb.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList4.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        azbVar.setWillNotDraw(false);
        azbVar.g3.r = false;
        azbVar.getContext();
        jg2 jg2Var = new jg2((ViewGroup) azbVar, (byte) 8);
        azbVar.f3 = jg2Var;
        azbVar.setLayoutManager(jg2Var);
        frameLayout.addView(azbVar, qoe.d(-1, -1.0f, nm7.D1, 41.0f, 0.0f, 0.0f, 0.0f));
        azbVar.j(new bzb(this, (byte) 0));
        if (x) {
            lzb lzbVar = new lzb(i, ylbVar, activity);
            this.E = lzbVar;
            lzbVar.c(true, false, this.f0 == 0);
            lzbVar.setOnClickListener(new View.OnClickListener(this) { // from class: uyb
                public final /* synthetic */ mzb b;

                {
                    this.b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
                
                    r0 = false;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    byte b3 = b2;
                    boolean z3 = true;
                    mzb mzbVar = this.b;
                    switch (b3) {
                        case 0:
                            czb czbVar = mzbVar.K;
                            czbVar.z1(false);
                            azb azbVar2 = mzbVar.y;
                            azbVar2.z1(false);
                            mzbVar.N.a(false, true);
                            gm.V3(czbVar);
                            gm.V3(azbVar2);
                            break;
                        case 1:
                            mzbVar.h0.a(0, Boolean.FALSE);
                            break;
                        default:
                            boolean z4 = mzbVar.U;
                            if (!z4 && mzbVar.T && mzbVar.d0 == null && !mzbVar.W) {
                                if (!mzbVar.d) {
                                    mzbVar.d = true;
                                    mzbVar.o(true);
                                    break;
                                }
                            } else if ((r2 = mzbVar.d0) != null) {
                                mzbVar.a(z3);
                                break;
                            } else {
                                mzbVar.a(z3);
                            }
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(lzbVar, qoe.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.E = null;
        }
        final byte b3 = 2;
        ViewGroup viewGroup2 = viewGroup;
        czb czbVar = new czb(activity, i, new jac(this) { // from class: vyb
            public final /* synthetic */ mzb b;

            {
                this.b = this;
            }

            @Override // jac
            public final void a(Object obj, Object obj2) {
                boolean z3;
                boolean z4;
                long j3;
                qwb qwbVar;
                long j4;
                boolean z5;
                int i2;
                long j5;
                long j6;
                long j7;
                byte b32 = b3;
                mzb mzbVar = this.b;
                switch (b32) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        boolean z6 = mzbVar.r;
                        int i3 = mzbVar.e;
                        oc7 r1 = oc7.r1(i3);
                        long j8 = mzbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat L0 = r1.L0(Long.valueOf(j9));
                        TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(j8));
                        qwb qwbVar2 = oc7.r1(i3).g4;
                        ArrayList l = qwbVar2.l(j9);
                        boolean z7 = mzbVar.n;
                        int i4 = gzb.b;
                        c6c K = c6c.K(gzb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z7;
                        K.L(mzbVar.f0 == 0);
                        arrayList.add(K);
                        if (l != null) {
                            int size = l.size();
                            int i5 = 0;
                            z3 = false;
                            while (i5 < size) {
                                Object obj3 = l.get(i5);
                                int i6 = i5 + 1;
                                int i7 = size;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                if (z6) {
                                    z4 = z6;
                                    if (tL_forumTopic.id == 1) {
                                        size = i7;
                                        i5 = i6;
                                        z6 = z4;
                                    }
                                } else {
                                    z4 = z6;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                } else {
                                    if (tL_forumTopic.pinned) {
                                        if (!z3) {
                                            l7cVar.M();
                                            z3 = true;
                                        }
                                    } else if (z3) {
                                        if (!arrayList.isEmpty()) {
                                            ((c6c) b10.f(1, arrayList)).z |= 8;
                                        }
                                        l7cVar.L();
                                        z3 = false;
                                    }
                                    c6c K2 = c6c.K(gzb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z7) {
                                        j3 = j8;
                                        K2.C = pg3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = mzbVar.f0;
                                    if (z7) {
                                        qwbVar = qwbVar2;
                                        j4 = pg3.n(tL_forumTopic.from_id);
                                    } else {
                                        qwbVar = qwbVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    K2.L(j10 == j4);
                                    arrayList.add(K2);
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                    qwbVar2 = qwbVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        boolean z8 = z6;
                        qwb qwbVar3 = qwbVar2;
                        if (z3) {
                            l7cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qwbVar3.e(j9) && mzbVar.w) {
                            c6c K3 = c6c.K(gzb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c6c K4 = c6c.K(gzb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c6c K5 = c6c.K(gzb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z8 && !z7) {
                            if ((L0 != null && sd2.w(15, L0)) || m9c.x(W1)) {
                                c6c K6 = c6c.K(gzb.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        long j11 = mzbVar.f;
                        qwb qwbVar4 = oc7.r1(mzbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < arrayList2.size(); i8 = td4.g(((c6c) arrayList2.get(i8)).d, i8, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qwbVar4.w(arrayList3, j12);
                        qwbVar4.y(j12, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l7c l7cVar2 = (l7c) obj2;
                        boolean z9 = mzbVar.n;
                        int i9 = mzbVar.e;
                        oc7 r12 = oc7.r1(i9);
                        long j13 = mzbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat L02 = r12.L0(Long.valueOf(j14));
                        TLRPC.User W12 = oc7.r1(i9).W1(Long.valueOf(j13));
                        qwb qwbVar5 = oc7.r1(i9).g4;
                        ArrayList l2 = qwbVar5.l(j14);
                        boolean z10 = mzbVar.r;
                        if (!z10) {
                            int i10 = kzb.b;
                            c6c K7 = c6c.K(kzb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z9;
                            K7.z = z10 ? 1 : 0;
                            K7.L(mzbVar.f0 == 0);
                            arrayList4.add(K7);
                        }
                        if (l2 != null) {
                            int size2 = l2.size();
                            z5 = false;
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj4 = l2.get(i11);
                                i11++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = W12;
                                if (z10) {
                                    i2 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        W12 = user;
                                        size2 = i2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    W12 = user;
                                    size2 = i2;
                                } else {
                                    if (tL_forumTopic2.pinned) {
                                        if (!z5) {
                                            l7cVar2.M();
                                            z5 = true;
                                        }
                                    } else if (z5) {
                                        l7cVar2.L();
                                        z5 = false;
                                    }
                                    int i12 = kzb.b;
                                    c6c K8 = c6c.K(kzb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z9) {
                                        j5 = j13;
                                        K8.C = pg3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = mzbVar.f0;
                                    if (z9) {
                                        j6 = j15;
                                        j7 = pg3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    K8.L(j6 == j7);
                                    arrayList4.add(K8);
                                    W12 = user;
                                    size2 = i2;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        TLRPC.User user2 = W12;
                        if (z5) {
                            l7cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qwbVar5.e(j14) && mzbVar.w) {
                            int i13 = kzb.b;
                            c6c K9 = c6c.K(kzb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c6c K10 = c6c.K(kzb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c6c K11 = c6c.K(kzb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z10 && !z9) {
                            if ((L02 != null && sd2.w(15, L02)) || m9c.x(user2)) {
                                int i14 = kzb.b;
                                c6c K12 = c6c.K(kzb.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList4.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new wyb(this), new wyb(this), ylbVar);
        this.K = czbVar;
        czbVar.E1(new jac(this) { // from class: vyb
            public final /* synthetic */ mzb b;

            {
                this.b = this;
            }

            @Override // jac
            public final void a(Object obj, Object obj2) {
                boolean z3;
                boolean z4;
                long j3;
                qwb qwbVar;
                long j4;
                boolean z5;
                int i2;
                long j5;
                long j6;
                long j7;
                byte b32 = b2;
                mzb mzbVar = this.b;
                switch (b32) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        boolean z6 = mzbVar.r;
                        int i3 = mzbVar.e;
                        oc7 r1 = oc7.r1(i3);
                        long j8 = mzbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat L0 = r1.L0(Long.valueOf(j9));
                        TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(j8));
                        qwb qwbVar2 = oc7.r1(i3).g4;
                        ArrayList l = qwbVar2.l(j9);
                        boolean z7 = mzbVar.n;
                        int i4 = gzb.b;
                        c6c K = c6c.K(gzb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z7;
                        K.L(mzbVar.f0 == 0);
                        arrayList.add(K);
                        if (l != null) {
                            int size = l.size();
                            int i5 = 0;
                            z3 = false;
                            while (i5 < size) {
                                Object obj3 = l.get(i5);
                                int i6 = i5 + 1;
                                int i7 = size;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                if (z6) {
                                    z4 = z6;
                                    if (tL_forumTopic.id == 1) {
                                        size = i7;
                                        i5 = i6;
                                        z6 = z4;
                                    }
                                } else {
                                    z4 = z6;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                } else {
                                    if (tL_forumTopic.pinned) {
                                        if (!z3) {
                                            l7cVar.M();
                                            z3 = true;
                                        }
                                    } else if (z3) {
                                        if (!arrayList.isEmpty()) {
                                            ((c6c) b10.f(1, arrayList)).z |= 8;
                                        }
                                        l7cVar.L();
                                        z3 = false;
                                    }
                                    c6c K2 = c6c.K(gzb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z7) {
                                        j3 = j8;
                                        K2.C = pg3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = mzbVar.f0;
                                    if (z7) {
                                        qwbVar = qwbVar2;
                                        j4 = pg3.n(tL_forumTopic.from_id);
                                    } else {
                                        qwbVar = qwbVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    K2.L(j10 == j4);
                                    arrayList.add(K2);
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                    qwbVar2 = qwbVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        boolean z8 = z6;
                        qwb qwbVar3 = qwbVar2;
                        if (z3) {
                            l7cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qwbVar3.e(j9) && mzbVar.w) {
                            c6c K3 = c6c.K(gzb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c6c K4 = c6c.K(gzb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c6c K5 = c6c.K(gzb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z8 && !z7) {
                            if ((L0 != null && sd2.w(15, L0)) || m9c.x(W1)) {
                                c6c K6 = c6c.K(gzb.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        long j11 = mzbVar.f;
                        qwb qwbVar4 = oc7.r1(mzbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < arrayList2.size(); i8 = td4.g(((c6c) arrayList2.get(i8)).d, i8, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qwbVar4.w(arrayList3, j12);
                        qwbVar4.y(j12, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l7c l7cVar2 = (l7c) obj2;
                        boolean z9 = mzbVar.n;
                        int i9 = mzbVar.e;
                        oc7 r12 = oc7.r1(i9);
                        long j13 = mzbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat L02 = r12.L0(Long.valueOf(j14));
                        TLRPC.User W12 = oc7.r1(i9).W1(Long.valueOf(j13));
                        qwb qwbVar5 = oc7.r1(i9).g4;
                        ArrayList l2 = qwbVar5.l(j14);
                        boolean z10 = mzbVar.r;
                        if (!z10) {
                            int i10 = kzb.b;
                            c6c K7 = c6c.K(kzb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z9;
                            K7.z = z10 ? 1 : 0;
                            K7.L(mzbVar.f0 == 0);
                            arrayList4.add(K7);
                        }
                        if (l2 != null) {
                            int size2 = l2.size();
                            z5 = false;
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj4 = l2.get(i11);
                                i11++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = W12;
                                if (z10) {
                                    i2 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        W12 = user;
                                        size2 = i2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    W12 = user;
                                    size2 = i2;
                                } else {
                                    if (tL_forumTopic2.pinned) {
                                        if (!z5) {
                                            l7cVar2.M();
                                            z5 = true;
                                        }
                                    } else if (z5) {
                                        l7cVar2.L();
                                        z5 = false;
                                    }
                                    int i12 = kzb.b;
                                    c6c K8 = c6c.K(kzb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z9) {
                                        j5 = j13;
                                        K8.C = pg3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = mzbVar.f0;
                                    if (z9) {
                                        j6 = j15;
                                        j7 = pg3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    K8.L(j6 == j7);
                                    arrayList4.add(K8);
                                    W12 = user;
                                    size2 = i2;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        TLRPC.User user2 = W12;
                        if (z5) {
                            l7cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qwbVar5.e(j14) && mzbVar.w) {
                            int i13 = kzb.b;
                            c6c K9 = c6c.K(kzb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c6c K10 = c6c.K(kzb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c6c K11 = c6c.K(kzb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z10 && !z9) {
                            if ((L02 != null && sd2.w(15, L02)) || m9c.x(user2)) {
                                int i14 = kzb.b;
                                c6c K12 = c6c.K(kzb.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList4.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        czbVar.g3.r = false;
        czbVar.setClipToPadding(false);
        czbVar.setClipChildren(false);
        viewGroup2.addView(czbVar, qoe.d(-1, -1.0f, nm7.D1, 0.0f, x ? 90.0f : 48.0f, 0.0f, 0.0f));
        czbVar.j(new bzb(this, b2));
        final byte b4 = 2;
        ImageView g = g(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: uyb
            public final /* synthetic */ mzb b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                byte b32 = b4;
                boolean z3 = true;
                mzb mzbVar = this.b;
                switch (b32) {
                    case 0:
                        czb czbVar2 = mzbVar.K;
                        czbVar2.z1(false);
                        azb azbVar2 = mzbVar.y;
                        azbVar2.z1(false);
                        mzbVar.N.a(false, true);
                        gm.V3(czbVar2);
                        gm.V3(azbVar2);
                        break;
                    case 1:
                        mzbVar.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        boolean z4 = mzbVar.U;
                        if (!z4 && mzbVar.T && mzbVar.d0 == null && !mzbVar.W) {
                            if (!mzbVar.d) {
                                mzbVar.d = true;
                                mzbVar.o(true);
                                break;
                            }
                        } else if ((r2 = mzbVar.d0) != null) {
                            mzbVar.a(z3);
                            break;
                        } else {
                            mzbVar.a(z3);
                        }
                        break;
                }
            }
        });
        this.H = g;
        ImageView g2 = g(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: uyb
            public final /* synthetic */ mzb b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                byte b32 = b4;
                boolean z3 = true;
                mzb mzbVar = this.b;
                switch (b32) {
                    case 0:
                        czb czbVar2 = mzbVar.K;
                        czbVar2.z1(false);
                        azb azbVar2 = mzbVar.y;
                        azbVar2.z1(false);
                        mzbVar.N.a(false, true);
                        gm.V3(czbVar2);
                        gm.V3(azbVar2);
                        break;
                    case 1:
                        mzbVar.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        boolean z4 = mzbVar.U;
                        if (!z4 && mzbVar.T && mzbVar.d0 == null && !mzbVar.W) {
                            if (!mzbVar.d) {
                                mzbVar.d = true;
                                mzbVar.o(true);
                                break;
                            }
                        } else if ((r2 = mzbVar.d0) != null) {
                            mzbVar.a(z3);
                            break;
                        } else {
                            mzbVar.a(z3);
                        }
                        break;
                }
            }
        });
        this.I = g2;
        frameLayout.addView(g, qoe.e(44, 36, 51));
        viewGroup2.addView(g2, qoe.e(64, 48, 51));
        final byte b5 = 0;
        ImageView g3 = g(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: uyb
            public final /* synthetic */ mzb b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                byte b32 = b5;
                boolean z3 = true;
                mzb mzbVar = this.b;
                switch (b32) {
                    case 0:
                        czb czbVar2 = mzbVar.K;
                        czbVar2.z1(false);
                        azb azbVar2 = mzbVar.y;
                        azbVar2.z1(false);
                        mzbVar.N.a(false, true);
                        gm.V3(czbVar2);
                        gm.V3(azbVar2);
                        break;
                    case 1:
                        mzbVar.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        boolean z4 = mzbVar.U;
                        if (!z4 && mzbVar.T && mzbVar.d0 == null && !mzbVar.W) {
                            if (!mzbVar.d) {
                                mzbVar.d = true;
                                mzbVar.o(true);
                                break;
                            }
                        } else if ((r2 = mzbVar.d0) != null) {
                            mzbVar.a(z3);
                            break;
                        } else {
                            mzbVar.a(z3);
                        }
                        break;
                }
            }
        });
        this.F = g3;
        ImageView g4 = g(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: uyb
            public final /* synthetic */ mzb b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                byte b32 = b5;
                boolean z3 = true;
                mzb mzbVar = this.b;
                switch (b32) {
                    case 0:
                        czb czbVar2 = mzbVar.K;
                        czbVar2.z1(false);
                        azb azbVar2 = mzbVar.y;
                        azbVar2.z1(false);
                        mzbVar.N.a(false, true);
                        gm.V3(czbVar2);
                        gm.V3(azbVar2);
                        break;
                    case 1:
                        mzbVar.h0.a(0, Boolean.FALSE);
                        break;
                    default:
                        boolean z4 = mzbVar.U;
                        if (!z4 && mzbVar.T && mzbVar.d0 == null && !mzbVar.W) {
                            if (!mzbVar.d) {
                                mzbVar.d = true;
                                mzbVar.o(true);
                                break;
                            }
                        } else if ((r2 = mzbVar.d0) != null) {
                            mzbVar.a(z3);
                            break;
                        } else {
                            mzbVar.a(z3);
                        }
                        break;
                }
            }
        });
        this.G = g4;
        frameLayout.addView(g3, qoe.e(44, 36, 51));
        viewGroup2.addView(g4, qoe.e(64, 48, 51));
        oc7.r1(i).g4.n(3, j2, false);
        SharedPreferences sharedPreferences = oc7.r1(i).X3;
        if (z && kt6.w("topicssidetabs", j, sharedPreferences, false)) {
            this.V = 1.0f;
            z2 = true;
            this.U = true;
        } else {
            z2 = true;
        }
        boolean z3 = (z && kt6.w("topicssidetabsb", j, sharedPreferences, false)) ? z2 : false;
        this.T = z3;
        g2.setImageResource(z3 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        o(false);
        g.setImageResource(!this.T ? R.drawable.menu_sidebar_left : R.drawable.menu_sidebar_top);
        d(false);
        e();
        m();
        n();
    }

    public static ImageView g(Activity activity, int i, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(i);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        rve.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z) {
        if (this.g0 == z) {
            return;
        }
        this.g0 = z;
        int i = nm7.u5;
        long j = this.f;
        int i2 = this.e;
        if (!z) {
            long j2 = -j;
            LongSparseIntArray longSparseIntArray = oc7.r1(i2).g4.r;
            int i3 = longSparseIntArray.get(j2, 0) - 1;
            longSparseIntArray.put(j2, i3 >= 0 ? i3 : 0);
            nm7.f(i2).n(this, i);
            nm7.f(i2).n(this, 2);
            return;
        }
        nm7.f(i2).b(this, i);
        nm7.f(i2).b(this, 2);
        qwb qwbVar = oc7.r1(i2).g4;
        long j3 = -j;
        LongSparseIntArray longSparseIntArray2 = qwbVar.r;
        longSparseIntArray2.put(j3, longSparseIntArray2.get(j3, 0) + 1);
        qwbVar.y(j3, true);
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        m();
    }

    @Override // g94
    public final void V(float f, int i) {
        if (i == 1 && f == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(R.drawable.menu_sidebar_left);
            this.I.setImageResource(R.drawable.menu_sidebar_bottom);
            oc7.r1(this.e).X3.edit().putBoolean("topicssidetabsb" + this.f, false).apply();
            o(true);
        }
    }

    public final void a(boolean z) {
        if (this.U == z) {
            return;
        }
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.W) {
                this.d0 = Boolean.valueOf(z);
                return;
            }
        }
        if (!z) {
            this.T = !this.T;
        }
        this.U = z;
        this.W = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, z ? 1.0f : 0.0f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new oxb(this, (byte) 2));
        this.e0.addListener(new sw9((byte) 10, this, z));
        this.e0.setInterpolator(wb2.V);
        this.e0.setDuration(250L);
        this.e0.start();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y6));
    }

    public final void b() {
        int i = cmb.y6;
        ylb ylbVar = this.h;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.Ei, ylbVar);
        int f = on2.f(1.0f - this.V, v0, v02);
        int f2 = on2.f(this.V, v0, v02);
        boolean z = this.a0;
        this.a0 = true;
        ImageView imageView = this.H;
        if (imageView != null && (!z || f != this.b0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
        }
        this.b0 = f;
        ImageView imageView2 = this.I;
        if (imageView2 != null && (!z || f2 != this.c0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        }
        this.c0 = f2;
    }

    public final void c() {
        FrameLayout frameLayout = this.J;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.Q + this.R);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void d(boolean z) {
        ArrayList l = oc7.r1(this.e).g4.l(-this.f);
        this.a.a((l == null || l.isEmpty() || this.k0) ? false : true, z);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.u5;
        long j = this.f;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == (-j)) {
                n();
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = oc7.s5;
            if ((intValue & 512) > 0) {
                oc7.r1(this.e).g4.y(-j, false);
                n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.J;
        if (frameLayout.getVisibility() == 0) {
            this.O.setBounds((int) frameLayout.getTranslationX(), (int) this.R, (int) (frameLayout.getTranslationX() + gm.L(78.0f)), (int) (getMeasuredHeight() - this.Q));
            this.O.draw(canvas);
        }
        FrameLayout frameLayout2 = this.x;
        if (frameLayout2.getVisibility() == 0) {
            this.P.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.P.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + gm.L(50.0f)));
            this.P.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        if (view == this.J) {
            canvas.clipPath(this.O.S.k);
        }
        if (view == this.x) {
            canvas.clipPath(this.P.S.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        fn0 fn0Var = this.N;
        float f = fn0Var.e;
        ImageView imageView = this.F;
        imageView.setAlpha(f);
        imageView.setScaleX(gm.R1(0.4f, 1.0f, f));
        imageView.setScaleY(gm.R1(0.4f, 1.0f, f));
        imageView.setVisibility(f > 0.0f ? 0 : 8);
        ImageView imageView2 = this.G;
        imageView2.setAlpha(f);
        imageView2.setScaleX(gm.R1(0.4f, 1.0f, f));
        imageView2.setScaleY(gm.R1(0.4f, 1.0f, f));
        imageView2.setVisibility(f > 0.0f ? 0 : 8);
        float f2 = 1.0f - fn0Var.e;
        ImageView imageView3 = this.H;
        imageView3.setAlpha(f2);
        imageView3.setScaleX(gm.R1(0.4f, 1.0f, f2));
        imageView3.setScaleY(gm.R1(0.4f, 1.0f, f2));
        imageView3.setVisibility(f2 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.I;
        imageView4.setAlpha(f2);
        imageView4.setScaleX(gm.R1(0.4f, 1.0f, f2));
        imageView4.setScaleY(gm.R1(0.4f, 1.0f, f2));
        imageView4.setVisibility(f2 > 0.0f ? 0 : 8);
    }

    public final void f() {
        float R1 = gm.R1(1.0f, 0.0f, this.V);
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(R1);
        frameLayout.setVisibility((1.0f - this.b.e) * ((1.0f - this.V) * this.a.e) > 0.0f ? 0 : 8);
        if (this.T) {
            frameLayout.setTranslationY(((getMeasuredHeight() - gm.L(50.0f)) - this.Q) + gm.U1(h(izb.c), gm.L(43.0f), 0));
        } else {
            frameLayout.setTranslationY(this.R + gm.U1(h(izb.a), -gm.L(43.0f), 0));
        }
    }

    public izb getCurrentTabsPosition() {
        return this.U ? izb.b : this.T ? izb.c : izb.a;
    }

    public float getSideMenuT() {
        return this.V * this.a.e;
    }

    public final float h(izb izbVar) {
        float f = (1.0f - this.b.e) * this.a.e;
        if (izbVar == izb.b) {
            return this.V * f;
        }
        if ((izbVar != izb.a || this.T) && !(izbVar == izb.c && this.T)) {
            return 0.0f;
        }
        return (1.0f - this.V) * f;
    }

    public final boolean i() {
        if (this.V <= 0.5f) {
            int i = 0;
            while (true) {
                azb azbVar = this.y;
                if (i >= azbVar.getChildCount()) {
                    break;
                }
                c6c G = azbVar.g3.G(RecyclerView.R(azbVar.getChildAt(i)));
                if (G != null && G.s) {
                    return true;
                }
                i++;
            }
        } else {
            int i2 = 0;
            while (true) {
                czb czbVar = this.K;
                if (i2 >= czbVar.getChildCount()) {
                    break;
                }
                c6c G2 = czbVar.g3.G(RecyclerView.R(czbVar.getChildAt(i2)));
                if (G2 != null && G2.s) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    public final void j() {
        qwb qwbVar = oc7.r1(this.e).g4;
        long j = this.f;
        if (qwbVar.e(-j)) {
            return;
        }
        qwbVar.o(-j);
    }

    public final void k(long j, boolean z) {
        if (this.n) {
            jac jacVar = this.j0;
            if (jacVar != null) {
                jacVar.a(Long.valueOf(j), Boolean.valueOf(z));
                return;
            }
            return;
        }
        jac jacVar2 = this.h0;
        if (jacVar2 != null) {
            jacVar2.a(Integer.valueOf((int) j), Boolean.valueOf(z));
        }
    }

    public final boolean l(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z) {
        int i;
        int i2;
        oc7 oc7Var;
        final mzb mzbVar;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i3;
        String M0;
        int i4;
        final mzb mzbVar2;
        final bu5 bu5Var;
        boolean z2;
        final byte b;
        String M02;
        int i5;
        int i6 = this.e;
        oc7 r1 = oc7.r1(i6);
        long j = this.f;
        TLRPC.Chat L0 = j < 0 ? r1.L0(Long.valueOf(-j)) : null;
        TLRPC.User W1 = j > 0 ? r1.W1(Long.valueOf(j)) : null;
        yv1 yv1Var = this.s;
        final bu5 J = bu5.J(yv1Var, view);
        byte b2 = 1;
        final byte b3 = 0;
        if (sd2.p0(L0)) {
            long n = pg3.n(tL_forumTopic.from_id);
            if (n == 0 || !sd2.A(i6, L0, 24)) {
                return false;
            }
            TLRPC.Chat chat = L0;
            bu5Var = J;
            bu5Var.b(R.drawable.msg_clear, jb6.M0(2131752026, null), new nz8((Object) this, (Object) bu5Var, n, (Object) chat, (byte) 16), false);
            long j2 = chat.id;
            if (sd2.p0(chat) && sd2.A(i6, chat, 24)) {
                long j3 = chat.linked_monoforum_id;
                if (j3 != 0) {
                    j2 = j3;
                }
            }
            TLRPC.Chat L02 = oc7.r1(i6).L0(Long.valueOf(j2));
            TLRPC.User W12 = oc7.r1(i6).W1(Long.valueOf(n));
            if (W12 != null && sd2.w(2, L02)) {
                bu5Var.b(R.drawable.msg_remove, jb6.M0(2131753691, null), null, false);
                a8 z3 = bu5Var.z();
                z3.setVisibility(8);
                oc7 r12 = oc7.r1(i6);
                hs5 hs5Var = new hs5(this, z3, bu5Var, j2, W12, L02, (byte) 3);
                bu5Var = bu5Var;
                r12.J0(L02, W12, hs5Var);
            }
            mzbVar2 = this;
        } else {
            if (sd2.y(15, L0) || m9c.x(W1)) {
                if (tL_forumTopic.pinned) {
                    i = R.drawable.msg_unpin;
                    i2 = 2131751389;
                } else {
                    i = R.drawable.msg_pin;
                    i2 = 2131751390;
                }
                oc7Var = r1;
                mzbVar = this;
                tL_forumTopic2 = tL_forumTopic;
                J.b(i, jb6.M0(i2, null), new hza((Object) this, (Object) J, (Object) oc7Var, (Object) tL_forumTopic, (byte) 13), false);
                if (tL_forumTopic2.pinned && !z) {
                    J.b(R.drawable.tabs_reorder, jb6.M0(2131750642, null), new xyb(mzbVar, b2), false);
                }
                i3 = 15;
            } else {
                i3 = 15;
                tL_forumTopic2 = tL_forumTopic;
                oc7Var = r1;
                mzbVar = this;
            }
            if (sd2.y(i3, L0) || m9c.x(W1)) {
                J.b(R.drawable.outline_profile_edit_24, jb6.M0(2131751153, null), new Runnable(mzbVar) { // from class: zyb
                    public final /* synthetic */ mzb b;

                    {
                        this.b = mzbVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        mzb mzbVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        bu5 bu5Var2 = J;
                        switch (b4) {
                            case 0:
                                bu5Var2.u();
                                mzbVar3.s.presentFragment(wvb.f0(-mzbVar3.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                bu5Var2.u();
                                oc7.r1(mzbVar3.e).g4.z(tL_forumTopic3.id, -mzbVar3.f, !tL_forumTopic3.closed);
                                break;
                            default:
                                bu5Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                jd jdVar = new jd((byte) 10);
                                mzb mzbVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzbVar4.getContext());
                                String J0 = jb6.J0(hashSet.size(), "DeleteTopics");
                                he heVar = alertDialog$Builder.a;
                                heVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j4 = mzbVar4.f0;
                                if (hashSet.size() == 1) {
                                    heVar.U = jb6.a0(null, null, 2131751435, oc7.r1(mzbVar4.e).g4.f(-mzbVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    heVar.U = jb6.M0(2131751434, null);
                                }
                                alertDialog$Builder.j(jb6.M0(2131751535, null), new jp1(mzbVar4, arrayList, j4, hashSet, jdVar));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 3));
                                heVar.show();
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            long j4 = tL_forumTopic2.id;
            int currentAccount = yv1Var.getCurrentAccount();
            ylb resourceProvider = yv1Var.getResourceProvider();
            long j5 = mzbVar.f;
            cd2 cd2Var = new cd2(J, currentAccount, j5, j4, yv1Var, resourceProvider);
            bu5 K = J.K();
            K.b(R.drawable.msg_arrow_back, jb6.M0(2131753721, null), new bo1(J, (byte) 0), false);
            K.b(R.drawable.msg_tone_on, jb6.M0(2131745009, null), new y97(J, currentAccount, j5, j4, K, yv1Var, resourceProvider), false);
            a8 z4 = K.z();
            K.b(R.drawable.msg_mute_period, jb6.M0(2131748065, null), new up6((Object) J, (Object) resourceProvider, currentAccount, (Object) cd2Var, (byte) 16), false);
            K.b(R.drawable.msg_customize, jb6.M0(2131747650, null), new ev4((Object) J, j5, j4, (Object) yv1Var, (Object) resourceProvider, (byte) 3), false);
            K.b(0, "", new dd2(J, currentAccount, j5, j4, yv1Var, resourceProvider), false);
            new ed2(currentAccount, j5, j4, K.z(), z4).run();
            long j6 = tL_forumTopic2.id;
            long j7 = mzbVar.f;
            oc7 oc7Var2 = oc7Var;
            if (oc7Var2.o2(j7, j6, null)) {
                M0 = jb6.M0(2131743536, null);
                i4 = R.drawable.msg_unmute;
            } else {
                M0 = jb6.M0(2131748071, null);
                i4 = R.drawable.msg_mute;
            }
            int i7 = i4;
            TLRPC.Chat chat2 = L0;
            mzbVar2 = this;
            bu5Var = J;
            bu5Var.b(i7, M0, new vua(mzbVar2, oc7Var2, tL_forumTopic, J, K, (byte) 6), false);
            if (!sd2.i(i6, chat2, tL_forumTopic) || m9c.w(W1)) {
                z2 = false;
                b = 1;
            } else {
                if (tL_forumTopic.closed) {
                    M02 = jb6.M0(2131745817, null);
                    i5 = R.drawable.msg_topic_restart;
                } else {
                    M02 = jb6.M0(2131751976, null);
                    i5 = R.drawable.msg_topic_close;
                }
                b = 1;
                z2 = false;
                bu5Var.b(i5, M02, new Runnable(mzbVar2) { // from class: zyb
                    public final /* synthetic */ mzb b;

                    {
                        this.b = mzbVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b;
                        mzb mzbVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        bu5 bu5Var2 = bu5Var;
                        switch (b4) {
                            case 0:
                                bu5Var2.u();
                                mzbVar3.s.presentFragment(wvb.f0(-mzbVar3.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                bu5Var2.u();
                                oc7.r1(mzbVar3.e).g4.z(tL_forumTopic3.id, -mzbVar3.f, !tL_forumTopic3.closed);
                                break;
                            default:
                                bu5Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                jd jdVar = new jd((byte) 10);
                                mzb mzbVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzbVar4.getContext());
                                String J0 = jb6.J0(hashSet.size(), "DeleteTopics");
                                he heVar = alertDialog$Builder.a;
                                heVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j42 = mzbVar4.f0;
                                if (hashSet.size() == 1) {
                                    heVar.U = jb6.a0(null, null, 2131751435, oc7.r1(mzbVar4.e).g4.f(-mzbVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    heVar.U = jb6.M0(2131751434, null);
                                }
                                alertDialog$Builder.j(jb6.M0(2131751535, null), new jp1(mzbVar4, arrayList, j42, hashSet, jdVar));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 3));
                                heVar.show();
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (sd2.e(i6, chat2, tL_forumTopic)) {
                final byte b4 = 2;
                bu5Var.b(R.drawable.msg_delete, jb6.J0(b, "DeleteTopics"), new Runnable(mzbVar2) { // from class: zyb
                    public final /* synthetic */ mzb b;

                    {
                        this.b = mzbVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b4;
                        mzb mzbVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        bu5 bu5Var2 = bu5Var;
                        switch (b42) {
                            case 0:
                                bu5Var2.u();
                                mzbVar3.s.presentFragment(wvb.f0(-mzbVar3.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                bu5Var2.u();
                                oc7.r1(mzbVar3.e).g4.z(tL_forumTopic3.id, -mzbVar3.f, !tL_forumTopic3.closed);
                                break;
                            default:
                                bu5Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                jd jdVar = new jd((byte) 10);
                                mzb mzbVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzbVar4.getContext());
                                String J0 = jb6.J0(hashSet.size(), "DeleteTopics");
                                he heVar = alertDialog$Builder.a;
                                heVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j42 = mzbVar4.f0;
                                if (hashSet.size() == 1) {
                                    heVar.U = jb6.a0(null, null, 2131751435, oc7.r1(mzbVar4.e).g4.f(-mzbVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    heVar.U = jb6.M0(2131751434, null);
                                }
                                alertDialog$Builder.j(jb6.M0(2131751535, null), new jp1(mzbVar4, arrayList, j42, hashSet, jdVar));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 3));
                                heVar.show();
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, z2);
            }
        }
        boolean z5 = view instanceof hzb;
        ylb ylbVar = mzbVar2.h;
        if (z5) {
            dzb dzbVar = new dzb();
            Paint paint = new Paint(1);
            dzbVar.a = paint;
            dzbVar.b = new RectF();
            paint.setColor(cmb.v0(cmb.F8, ylbVar));
            bu5Var.X(dzbVar);
            bu5Var.b0(gm.L(16.0f), 0.0f);
        } else if (z) {
            bu5Var.X(cmb.b0(gm.L(16.0f), cmb.v0(cmb.c6, ylbVar)));
            bu5Var.W(5);
        } else {
            int L = gm.L(5.0f);
            int L2 = gm.L(5.0f);
            int v0 = cmb.v0(cmb.c6, ylbVar);
            float f = L;
            float f2 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, f, f, f2, f2, 0.0f, 0.0f}, null, null));
            shapeDrawable.getPaint().setColor(v0);
            bu5Var.X(shapeDrawable);
        }
        bu5Var.a0();
        return true;
    }

    public final void m() {
        mz mzVar = this.S;
        if (mzVar != null) {
            mzVar.run();
        }
        f();
        float h = h(izb.b);
        float U1 = gm.U1(h, -gm.L(78.0f), 0);
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(U1);
        frameLayout.setVisibility(h <= 0.0f ? 8 : 0);
        b();
        int i = cmb.Ei;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        ylb ylbVar = this.h;
        anb.s(imageView, i, ylbVar, mode);
        anb.s(this.G, i, ylbVar, mode);
        invalidate();
    }

    public final void n() {
        d(true);
        azb azbVar = this.y;
        boolean canScrollHorizontally = azbVar.canScrollHorizontally(-1);
        azbVar.g3.O(true);
        byte b = 0;
        if (!canScrollHorizontally) {
            azbVar.w0(0);
        }
        czb czbVar = this.K;
        boolean canScrollVertically = czbVar.canScrollVertically(-1);
        czbVar.g3.O(true);
        if (!canScrollVertically) {
            czbVar.w0(0);
        }
        gm.c3(new xyb(this, b));
    }

    public final void o(boolean z) {
        this.b.a(!this.c || this.d, z);
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
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f();
    }

    public void setAllTopicsHidden(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            d(true);
        }
    }

    public void setCurrentTopic(long j) {
        this.f0 = j;
        azb azbVar = this.y;
        azbVar.g3.O(true);
        azbVar.invalidate();
        this.K.g3.O(true);
        lzb lzbVar = this.E;
        if (lzbVar != null) {
            lzbVar.c(true, false, j == 0);
        }
    }

    public void setOnDialogSelected(jac jacVar) {
        this.j0 = jacVar;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setOnTopicSelected(jac jacVar) {
        this.h0 = jacVar;
    }

    public void setSideMenuBackgroundDrawable(im0 im0Var) {
        this.O = im0Var;
        im0Var.r(gm.L(16.0f));
        this.O.q(gm.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f) {
        this.Q = f;
        f();
        c();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f) {
        this.R = f;
        this.J.setTranslationY(f);
        f();
        c();
        invalidate();
    }

    public void setTabsEnabled(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (!z) {
            a(false);
        }
        o(true);
    }

    public void setTopMenuBackgroundDrawable(im0 im0Var) {
        this.P = im0Var;
        im0Var.r(gm.L(18.0f));
        this.P.q(gm.L(7.0f));
    }

    @Override // vlb
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
