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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class l1c extends FrameLayout implements fn7, s84, snb {
    public final k1c E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final b1c K;
    public long L;
    public long M;
    public final fm0 N;
    public jl0 O;
    public jl0 P;
    public float Q;
    public float R;
    public zo1 S;
    public boolean T;
    public boolean U;
    public float V;
    public boolean W;
    public final fm0 a;
    public boolean a0;
    public final fm0 b;
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
    public final vnb h;
    public icc h0;
    public Runnable i0;
    public icc j0;
    public boolean k0;
    public final HashSet l0;
    public final boolean n;
    public final boolean r;
    public final zu1 s;
    public final boolean w;
    public final FrameLayout x;
    public final z0c y;

    /* JADX WARN: Type inference failed for: r3v10, types: [y0c] */
    /* JADX WARN: Type inference failed for: r4v3, types: [y0c] */
    public l1c(Activity activity, zu1 zu1Var, int i, long j, boolean z, vnb vnbVar) {
        super(activity);
        ViewGroup viewGroup;
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 380L, true);
        this.b = new fm0(1, this, k43Var, 380L, false);
        this.N = new fm0(0, new t0c(this), k43Var, 320L, false);
        this.V = 0.0f;
        this.l0 = new HashSet();
        this.s = zu1Var;
        this.c = z;
        this.e = i;
        this.f = j;
        this.h = vnbVar;
        long j2 = -j;
        this.n = xc2.p0(uc7.s1(i).M0(Long.valueOf(j2)));
        boolean x = lbc.x(uc7.s1(i).X1(Long.valueOf(j)));
        this.r = x;
        final byte b = 0;
        this.w = !qu6.v("topics_end_reached_", j2, yac.h(i).j(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        addView(frameLayout, tre.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.J = frameLayout2;
        addView(frameLayout2, tre.d(64, -1.0f, jn7.z1, 7.0f, 7.0f, 7.0f, 7.0f));
        boolean z2 = true;
        z0c z0cVar = new z0c(this, activity, i, new icc(this) { // from class: y0c
            public final /* synthetic */ l1c b;

            {
                this.b = this;
            }

            @Override // icc
            public final void a(Object obj, Object obj2) {
                boolean z3;
                boolean z4;
                long j3;
                qyb qybVar;
                long j4;
                boolean z5;
                int i2;
                long j5;
                long j6;
                long j7;
                byte b2 = b;
                l1c l1cVar = this.b;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l9c l9cVar = (l9c) obj2;
                        boolean z6 = l1cVar.r;
                        int i3 = l1cVar.e;
                        uc7 s1 = uc7.s1(i3);
                        long j8 = l1cVar.f;
                        long j9 = -j8;
                        TLRPC.Chat M0 = s1.M0(Long.valueOf(j9));
                        TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(j8));
                        qyb qybVar2 = uc7.s1(i3).g4;
                        ArrayList l = qybVar2.l(j9);
                        boolean z7 = l1cVar.n;
                        int i4 = f1c.b;
                        b8c K = b8c.K(f1c.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z7;
                        K.L(l1cVar.f0 == 0);
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
                                if (l1cVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                } else {
                                    if (tL_forumTopic.pinned) {
                                        if (!z3) {
                                            l9cVar.M();
                                            z3 = true;
                                        }
                                    } else if (z3) {
                                        if (!arrayList.isEmpty()) {
                                            ((b8c) c00.g(1, arrayList)).z |= 8;
                                        }
                                        l9cVar.L();
                                        z3 = false;
                                    }
                                    b8c K2 = b8c.K(f1c.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z7) {
                                        j3 = j8;
                                        K2.C = wf3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = l1cVar.f0;
                                    if (z7) {
                                        qybVar = qybVar2;
                                        j4 = wf3.n(tL_forumTopic.from_id);
                                    } else {
                                        qybVar = qybVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    K2.L(j10 == j4);
                                    arrayList.add(K2);
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                    qybVar2 = qybVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        boolean z8 = z6;
                        qyb qybVar3 = qybVar2;
                        if (z3) {
                            l9cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qybVar3.e(j9) && l1cVar.w) {
                            b8c K3 = b8c.K(f1c.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            b8c K4 = b8c.K(f1c.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            b8c K5 = b8c.K(f1c.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z8 && !z7) {
                            if ((M0 != null && xc2.w(15, M0)) || lbc.x(X1)) {
                                b8c K6 = b8c.K(f1c.class);
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
                        long j11 = l1cVar.f;
                        qyb qybVar4 = uc7.s1(l1cVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < arrayList2.size(); i8 = qd4.g(((b8c) arrayList2.get(i8)).d, i8, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qybVar4.w(arrayList3, j12);
                        qybVar4.y(j12, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l9c l9cVar2 = (l9c) obj2;
                        boolean z9 = l1cVar.n;
                        int i9 = l1cVar.e;
                        uc7 s12 = uc7.s1(i9);
                        long j13 = l1cVar.f;
                        long j14 = -j13;
                        TLRPC.Chat M02 = s12.M0(Long.valueOf(j14));
                        TLRPC.User X12 = uc7.s1(i9).X1(Long.valueOf(j13));
                        qyb qybVar5 = uc7.s1(i9).g4;
                        ArrayList l2 = qybVar5.l(j14);
                        boolean z10 = l1cVar.r;
                        if (!z10) {
                            int i10 = j1c.b;
                            b8c K7 = b8c.K(j1c.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z9;
                            K7.z = z10 ? 1 : 0;
                            K7.L(l1cVar.f0 == 0);
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
                                TLRPC.User user = X12;
                                if (z10) {
                                    i2 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        X12 = user;
                                        size2 = i2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (l1cVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    X12 = user;
                                    size2 = i2;
                                } else {
                                    if (tL_forumTopic2.pinned) {
                                        if (!z5) {
                                            l9cVar2.M();
                                            z5 = true;
                                        }
                                    } else if (z5) {
                                        l9cVar2.L();
                                        z5 = false;
                                    }
                                    int i12 = j1c.b;
                                    b8c K8 = b8c.K(j1c.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z9) {
                                        j5 = j13;
                                        K8.C = wf3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = l1cVar.f0;
                                    if (z9) {
                                        j6 = j15;
                                        j7 = wf3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    K8.L(j6 == j7);
                                    arrayList4.add(K8);
                                    X12 = user;
                                    size2 = i2;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        TLRPC.User user2 = X12;
                        if (z5) {
                            l9cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qybVar5.e(j14) && l1cVar.w) {
                            int i13 = j1c.b;
                            b8c K9 = b8c.K(j1c.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            b8c K10 = b8c.K(j1c.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            b8c K11 = b8c.K(j1c.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z10 && !z9) {
                            if ((M02 != null && xc2.w(15, M02)) || lbc.x(user2)) {
                                int i14 = j1c.b;
                                b8c K12 = b8c.K(j1c.class);
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
        }, new t0c(this), new t0c(this), vnbVar);
        this.y = z0cVar;
        final byte b2 = z2 ? (byte) 1 : (byte) 0;
        z0cVar.F1(new icc(this) { // from class: y0c
            public final /* synthetic */ l1c b;

            {
                this.b = this;
            }

            @Override // icc
            public final void a(Object obj, Object obj2) {
                boolean z3;
                boolean z4;
                long j3;
                qyb qybVar;
                long j4;
                boolean z5;
                int i2;
                long j5;
                long j6;
                long j7;
                byte b22 = b2;
                l1c l1cVar = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l9c l9cVar = (l9c) obj2;
                        boolean z6 = l1cVar.r;
                        int i3 = l1cVar.e;
                        uc7 s1 = uc7.s1(i3);
                        long j8 = l1cVar.f;
                        long j9 = -j8;
                        TLRPC.Chat M0 = s1.M0(Long.valueOf(j9));
                        TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(j8));
                        qyb qybVar2 = uc7.s1(i3).g4;
                        ArrayList l = qybVar2.l(j9);
                        boolean z7 = l1cVar.n;
                        int i4 = f1c.b;
                        b8c K = b8c.K(f1c.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z7;
                        K.L(l1cVar.f0 == 0);
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
                                if (l1cVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                } else {
                                    if (tL_forumTopic.pinned) {
                                        if (!z3) {
                                            l9cVar.M();
                                            z3 = true;
                                        }
                                    } else if (z3) {
                                        if (!arrayList.isEmpty()) {
                                            ((b8c) c00.g(1, arrayList)).z |= 8;
                                        }
                                        l9cVar.L();
                                        z3 = false;
                                    }
                                    b8c K2 = b8c.K(f1c.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z7) {
                                        j3 = j8;
                                        K2.C = wf3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = l1cVar.f0;
                                    if (z7) {
                                        qybVar = qybVar2;
                                        j4 = wf3.n(tL_forumTopic.from_id);
                                    } else {
                                        qybVar = qybVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    K2.L(j10 == j4);
                                    arrayList.add(K2);
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                    qybVar2 = qybVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        boolean z8 = z6;
                        qyb qybVar3 = qybVar2;
                        if (z3) {
                            l9cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qybVar3.e(j9) && l1cVar.w) {
                            b8c K3 = b8c.K(f1c.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            b8c K4 = b8c.K(f1c.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            b8c K5 = b8c.K(f1c.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z8 && !z7) {
                            if ((M0 != null && xc2.w(15, M0)) || lbc.x(X1)) {
                                b8c K6 = b8c.K(f1c.class);
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
                        long j11 = l1cVar.f;
                        qyb qybVar4 = uc7.s1(l1cVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < arrayList2.size(); i8 = qd4.g(((b8c) arrayList2.get(i8)).d, i8, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qybVar4.w(arrayList3, j12);
                        qybVar4.y(j12, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l9c l9cVar2 = (l9c) obj2;
                        boolean z9 = l1cVar.n;
                        int i9 = l1cVar.e;
                        uc7 s12 = uc7.s1(i9);
                        long j13 = l1cVar.f;
                        long j14 = -j13;
                        TLRPC.Chat M02 = s12.M0(Long.valueOf(j14));
                        TLRPC.User X12 = uc7.s1(i9).X1(Long.valueOf(j13));
                        qyb qybVar5 = uc7.s1(i9).g4;
                        ArrayList l2 = qybVar5.l(j14);
                        boolean z10 = l1cVar.r;
                        if (!z10) {
                            int i10 = j1c.b;
                            b8c K7 = b8c.K(j1c.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z9;
                            K7.z = z10 ? 1 : 0;
                            K7.L(l1cVar.f0 == 0);
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
                                TLRPC.User user = X12;
                                if (z10) {
                                    i2 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        X12 = user;
                                        size2 = i2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (l1cVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    X12 = user;
                                    size2 = i2;
                                } else {
                                    if (tL_forumTopic2.pinned) {
                                        if (!z5) {
                                            l9cVar2.M();
                                            z5 = true;
                                        }
                                    } else if (z5) {
                                        l9cVar2.L();
                                        z5 = false;
                                    }
                                    int i12 = j1c.b;
                                    b8c K8 = b8c.K(j1c.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z9) {
                                        j5 = j13;
                                        K8.C = wf3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = l1cVar.f0;
                                    if (z9) {
                                        j6 = j15;
                                        j7 = wf3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    K8.L(j6 == j7);
                                    arrayList4.add(K8);
                                    X12 = user;
                                    size2 = i2;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        TLRPC.User user2 = X12;
                        if (z5) {
                            l9cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qybVar5.e(j14) && l1cVar.w) {
                            int i13 = j1c.b;
                            b8c K9 = b8c.K(j1c.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            b8c K10 = b8c.K(j1c.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            b8c K11 = b8c.K(j1c.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z10 && !z9) {
                            if ((M02 != null && xc2.w(15, M02)) || lbc.x(user2)) {
                                int i14 = j1c.b;
                                b8c K12 = b8c.K(j1c.class);
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
        z0cVar.setWillNotDraw(false);
        z0cVar.g3.r = false;
        z0cVar.getContext();
        of2 of2Var = new of2((ViewGroup) z0cVar, (byte) 8);
        z0cVar.f3 = of2Var;
        z0cVar.setLayoutManager(of2Var);
        frameLayout.addView(z0cVar, tre.d(-1, -1.0f, jn7.D1, 41.0f, 0.0f, 0.0f, 0.0f));
        z0cVar.j(new a1c(this, (byte) 0));
        final byte b3 = 2;
        if (x) {
            k1c k1cVar = new k1c(i, vnbVar, activity);
            this.E = k1cVar;
            k1cVar.c(true, false, this.f0 == 0);
            k1cVar.setOnClickListener(new View.OnClickListener(this) { // from class: w0c
                public final /* synthetic */ l1c b;

                {
                    this.b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
                
                    r0 = false;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    byte b4 = b3;
                    boolean z3 = true;
                    l1c l1cVar = this.b;
                    switch (b4) {
                        case 0:
                            boolean z4 = l1cVar.U;
                            if (!z4 && l1cVar.T && l1cVar.d0 == null && !l1cVar.W) {
                                if (!l1cVar.d) {
                                    l1cVar.d = true;
                                    l1cVar.o(true);
                                    break;
                                }
                            } else if ((r2 = l1cVar.d0) != null) {
                                l1cVar.a(z3);
                                break;
                            } else {
                                l1cVar.a(z3);
                            }
                            break;
                        case 1:
                            b1c b1cVar = l1cVar.K;
                            b1cVar.A1(false);
                            z0c z0cVar2 = l1cVar.y;
                            z0cVar2.A1(false);
                            l1cVar.N.a(false, true);
                            hl.V3(b1cVar);
                            hl.V3(z0cVar2);
                            break;
                        default:
                            l1cVar.h0.a(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(k1cVar, tre.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.E = null;
        }
        ViewGroup viewGroup2 = viewGroup;
        b1c b1cVar = new b1c(activity, i, new icc(this) { // from class: y0c
            public final /* synthetic */ l1c b;

            {
                this.b = this;
            }

            @Override // icc
            public final void a(Object obj, Object obj2) {
                boolean z3;
                boolean z4;
                long j3;
                qyb qybVar;
                long j4;
                boolean z5;
                int i2;
                long j5;
                long j6;
                long j7;
                byte b22 = b3;
                l1c l1cVar = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l9c l9cVar = (l9c) obj2;
                        boolean z6 = l1cVar.r;
                        int i3 = l1cVar.e;
                        uc7 s1 = uc7.s1(i3);
                        long j8 = l1cVar.f;
                        long j9 = -j8;
                        TLRPC.Chat M0 = s1.M0(Long.valueOf(j9));
                        TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(j8));
                        qyb qybVar2 = uc7.s1(i3).g4;
                        ArrayList l = qybVar2.l(j9);
                        boolean z7 = l1cVar.n;
                        int i4 = f1c.b;
                        b8c K = b8c.K(f1c.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z7;
                        K.L(l1cVar.f0 == 0);
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
                                if (l1cVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                } else {
                                    if (tL_forumTopic.pinned) {
                                        if (!z3) {
                                            l9cVar.M();
                                            z3 = true;
                                        }
                                    } else if (z3) {
                                        if (!arrayList.isEmpty()) {
                                            ((b8c) c00.g(1, arrayList)).z |= 8;
                                        }
                                        l9cVar.L();
                                        z3 = false;
                                    }
                                    b8c K2 = b8c.K(f1c.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z7) {
                                        j3 = j8;
                                        K2.C = wf3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = l1cVar.f0;
                                    if (z7) {
                                        qybVar = qybVar2;
                                        j4 = wf3.n(tL_forumTopic.from_id);
                                    } else {
                                        qybVar = qybVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    K2.L(j10 == j4);
                                    arrayList.add(K2);
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                    qybVar2 = qybVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        boolean z8 = z6;
                        qyb qybVar3 = qybVar2;
                        if (z3) {
                            l9cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qybVar3.e(j9) && l1cVar.w) {
                            b8c K3 = b8c.K(f1c.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            b8c K4 = b8c.K(f1c.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            b8c K5 = b8c.K(f1c.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z8 && !z7) {
                            if ((M0 != null && xc2.w(15, M0)) || lbc.x(X1)) {
                                b8c K6 = b8c.K(f1c.class);
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
                        long j11 = l1cVar.f;
                        qyb qybVar4 = uc7.s1(l1cVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < arrayList2.size(); i8 = qd4.g(((b8c) arrayList2.get(i8)).d, i8, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qybVar4.w(arrayList3, j12);
                        qybVar4.y(j12, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l9c l9cVar2 = (l9c) obj2;
                        boolean z9 = l1cVar.n;
                        int i9 = l1cVar.e;
                        uc7 s12 = uc7.s1(i9);
                        long j13 = l1cVar.f;
                        long j14 = -j13;
                        TLRPC.Chat M02 = s12.M0(Long.valueOf(j14));
                        TLRPC.User X12 = uc7.s1(i9).X1(Long.valueOf(j13));
                        qyb qybVar5 = uc7.s1(i9).g4;
                        ArrayList l2 = qybVar5.l(j14);
                        boolean z10 = l1cVar.r;
                        if (!z10) {
                            int i10 = j1c.b;
                            b8c K7 = b8c.K(j1c.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z9;
                            K7.z = z10 ? 1 : 0;
                            K7.L(l1cVar.f0 == 0);
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
                                TLRPC.User user = X12;
                                if (z10) {
                                    i2 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        X12 = user;
                                        size2 = i2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (l1cVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    X12 = user;
                                    size2 = i2;
                                } else {
                                    if (tL_forumTopic2.pinned) {
                                        if (!z5) {
                                            l9cVar2.M();
                                            z5 = true;
                                        }
                                    } else if (z5) {
                                        l9cVar2.L();
                                        z5 = false;
                                    }
                                    int i12 = j1c.b;
                                    b8c K8 = b8c.K(j1c.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z9) {
                                        j5 = j13;
                                        K8.C = wf3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = l1cVar.f0;
                                    if (z9) {
                                        j6 = j15;
                                        j7 = wf3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    K8.L(j6 == j7);
                                    arrayList4.add(K8);
                                    X12 = user;
                                    size2 = i2;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        TLRPC.User user2 = X12;
                        if (z5) {
                            l9cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qybVar5.e(j14) && l1cVar.w) {
                            int i13 = j1c.b;
                            b8c K9 = b8c.K(j1c.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            b8c K10 = b8c.K(j1c.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            b8c K11 = b8c.K(j1c.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z10 && !z9) {
                            if ((M02 != null && xc2.w(15, M02)) || lbc.x(user2)) {
                                int i14 = j1c.b;
                                b8c K12 = b8c.K(j1c.class);
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
        }, new t0c(this), new t0c(this), vnbVar);
        this.K = b1cVar;
        final byte b4 = z2 ? (byte) 1 : (byte) 0;
        b1cVar.F1(new icc(this) { // from class: y0c
            public final /* synthetic */ l1c b;

            {
                this.b = this;
            }

            @Override // icc
            public final void a(Object obj, Object obj2) {
                boolean z3;
                boolean z4;
                long j3;
                qyb qybVar;
                long j4;
                boolean z5;
                int i2;
                long j5;
                long j6;
                long j7;
                byte b22 = b4;
                l1c l1cVar = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l9c l9cVar = (l9c) obj2;
                        boolean z6 = l1cVar.r;
                        int i3 = l1cVar.e;
                        uc7 s1 = uc7.s1(i3);
                        long j8 = l1cVar.f;
                        long j9 = -j8;
                        TLRPC.Chat M0 = s1.M0(Long.valueOf(j9));
                        TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(j8));
                        qyb qybVar2 = uc7.s1(i3).g4;
                        ArrayList l = qybVar2.l(j9);
                        boolean z7 = l1cVar.n;
                        int i4 = f1c.b;
                        b8c K = b8c.K(f1c.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z7;
                        K.L(l1cVar.f0 == 0);
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
                                if (l1cVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                } else {
                                    if (tL_forumTopic.pinned) {
                                        if (!z3) {
                                            l9cVar.M();
                                            z3 = true;
                                        }
                                    } else if (z3) {
                                        if (!arrayList.isEmpty()) {
                                            ((b8c) c00.g(1, arrayList)).z |= 8;
                                        }
                                        l9cVar.L();
                                        z3 = false;
                                    }
                                    b8c K2 = b8c.K(f1c.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z7) {
                                        j3 = j8;
                                        K2.C = wf3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = l1cVar.f0;
                                    if (z7) {
                                        qybVar = qybVar2;
                                        j4 = wf3.n(tL_forumTopic.from_id);
                                    } else {
                                        qybVar = qybVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    K2.L(j10 == j4);
                                    arrayList.add(K2);
                                    size = i7;
                                    i5 = i6;
                                    z6 = z4;
                                    qybVar2 = qybVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        boolean z8 = z6;
                        qyb qybVar3 = qybVar2;
                        if (z3) {
                            l9cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qybVar3.e(j9) && l1cVar.w) {
                            b8c K3 = b8c.K(f1c.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            b8c K4 = b8c.K(f1c.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            b8c K5 = b8c.K(f1c.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z8 && !z7) {
                            if ((M0 != null && xc2.w(15, M0)) || lbc.x(X1)) {
                                b8c K6 = b8c.K(f1c.class);
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
                        long j11 = l1cVar.f;
                        qyb qybVar4 = uc7.s1(l1cVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < arrayList2.size(); i8 = qd4.g(((b8c) arrayList2.get(i8)).d, i8, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qybVar4.w(arrayList3, j12);
                        qybVar4.y(j12, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l9c l9cVar2 = (l9c) obj2;
                        boolean z9 = l1cVar.n;
                        int i9 = l1cVar.e;
                        uc7 s12 = uc7.s1(i9);
                        long j13 = l1cVar.f;
                        long j14 = -j13;
                        TLRPC.Chat M02 = s12.M0(Long.valueOf(j14));
                        TLRPC.User X12 = uc7.s1(i9).X1(Long.valueOf(j13));
                        qyb qybVar5 = uc7.s1(i9).g4;
                        ArrayList l2 = qybVar5.l(j14);
                        boolean z10 = l1cVar.r;
                        if (!z10) {
                            int i10 = j1c.b;
                            b8c K7 = b8c.K(j1c.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z9;
                            K7.z = z10 ? 1 : 0;
                            K7.L(l1cVar.f0 == 0);
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
                                TLRPC.User user = X12;
                                if (z10) {
                                    i2 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        X12 = user;
                                        size2 = i2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (l1cVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    X12 = user;
                                    size2 = i2;
                                } else {
                                    if (tL_forumTopic2.pinned) {
                                        if (!z5) {
                                            l9cVar2.M();
                                            z5 = true;
                                        }
                                    } else if (z5) {
                                        l9cVar2.L();
                                        z5 = false;
                                    }
                                    int i12 = j1c.b;
                                    b8c K8 = b8c.K(j1c.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z9) {
                                        j5 = j13;
                                        K8.C = wf3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = l1cVar.f0;
                                    if (z9) {
                                        j6 = j15;
                                        j7 = wf3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    K8.L(j6 == j7);
                                    arrayList4.add(K8);
                                    X12 = user;
                                    size2 = i2;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        TLRPC.User user2 = X12;
                        if (z5) {
                            l9cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qybVar5.e(j14) && l1cVar.w) {
                            int i13 = j1c.b;
                            b8c K9 = b8c.K(j1c.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            b8c K10 = b8c.K(j1c.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            b8c K11 = b8c.K(j1c.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z10 && !z9) {
                            if ((M02 != null && xc2.w(15, M02)) || lbc.x(user2)) {
                                int i14 = j1c.b;
                                b8c K12 = b8c.K(j1c.class);
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
        b1cVar.g3.r = false;
        b1cVar.setClipToPadding(false);
        b1cVar.setClipChildren(false);
        viewGroup2.addView(b1cVar, tre.d(-1, -1.0f, jn7.D1, 0.0f, x ? 90.0f : 48.0f, 0.0f, 0.0f));
        b1cVar.j(new a1c(this, z2 ? (byte) 1 : (byte) 0));
        final byte b5 = 0;
        ImageView g = g(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: w0c
            public final /* synthetic */ l1c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                byte b42 = b5;
                boolean z3 = true;
                l1c l1cVar = this.b;
                switch (b42) {
                    case 0:
                        boolean z4 = l1cVar.U;
                        if (!z4 && l1cVar.T && l1cVar.d0 == null && !l1cVar.W) {
                            if (!l1cVar.d) {
                                l1cVar.d = true;
                                l1cVar.o(true);
                                break;
                            }
                        } else if ((r2 = l1cVar.d0) != null) {
                            l1cVar.a(z3);
                            break;
                        } else {
                            l1cVar.a(z3);
                        }
                        break;
                    case 1:
                        b1c b1cVar2 = l1cVar.K;
                        b1cVar2.A1(false);
                        z0c z0cVar2 = l1cVar.y;
                        z0cVar2.A1(false);
                        l1cVar.N.a(false, true);
                        hl.V3(b1cVar2);
                        hl.V3(z0cVar2);
                        break;
                    default:
                        l1cVar.h0.a(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.H = g;
        ImageView g2 = g(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: w0c
            public final /* synthetic */ l1c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                byte b42 = b5;
                boolean z3 = true;
                l1c l1cVar = this.b;
                switch (b42) {
                    case 0:
                        boolean z4 = l1cVar.U;
                        if (!z4 && l1cVar.T && l1cVar.d0 == null && !l1cVar.W) {
                            if (!l1cVar.d) {
                                l1cVar.d = true;
                                l1cVar.o(true);
                                break;
                            }
                        } else if ((r2 = l1cVar.d0) != null) {
                            l1cVar.a(z3);
                            break;
                        } else {
                            l1cVar.a(z3);
                        }
                        break;
                    case 1:
                        b1c b1cVar2 = l1cVar.K;
                        b1cVar2.A1(false);
                        z0c z0cVar2 = l1cVar.y;
                        z0cVar2.A1(false);
                        l1cVar.N.a(false, true);
                        hl.V3(b1cVar2);
                        hl.V3(z0cVar2);
                        break;
                    default:
                        l1cVar.h0.a(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.I = g2;
        frameLayout.addView(g, tre.e(44, 36, 51));
        viewGroup2.addView(g2, tre.e(64, 48, 51));
        final byte b6 = z2 ? (byte) 1 : (byte) 0;
        ImageView g3 = g(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: w0c
            public final /* synthetic */ l1c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                byte b42 = b6;
                boolean z3 = true;
                l1c l1cVar = this.b;
                switch (b42) {
                    case 0:
                        boolean z4 = l1cVar.U;
                        if (!z4 && l1cVar.T && l1cVar.d0 == null && !l1cVar.W) {
                            if (!l1cVar.d) {
                                l1cVar.d = true;
                                l1cVar.o(true);
                                break;
                            }
                        } else if ((r2 = l1cVar.d0) != null) {
                            l1cVar.a(z3);
                            break;
                        } else {
                            l1cVar.a(z3);
                        }
                        break;
                    case 1:
                        b1c b1cVar2 = l1cVar.K;
                        b1cVar2.A1(false);
                        z0c z0cVar2 = l1cVar.y;
                        z0cVar2.A1(false);
                        l1cVar.N.a(false, true);
                        hl.V3(b1cVar2);
                        hl.V3(z0cVar2);
                        break;
                    default:
                        l1cVar.h0.a(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.F = g3;
        final byte b7 = z2 ? (byte) 1 : (byte) 0;
        ImageView g4 = g(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: w0c
            public final /* synthetic */ l1c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                byte b42 = b7;
                boolean z3 = true;
                l1c l1cVar = this.b;
                switch (b42) {
                    case 0:
                        boolean z4 = l1cVar.U;
                        if (!z4 && l1cVar.T && l1cVar.d0 == null && !l1cVar.W) {
                            if (!l1cVar.d) {
                                l1cVar.d = true;
                                l1cVar.o(true);
                                break;
                            }
                        } else if ((r2 = l1cVar.d0) != null) {
                            l1cVar.a(z3);
                            break;
                        } else {
                            l1cVar.a(z3);
                        }
                        break;
                    case 1:
                        b1c b1cVar2 = l1cVar.K;
                        b1cVar2.A1(false);
                        z0c z0cVar2 = l1cVar.y;
                        z0cVar2.A1(false);
                        l1cVar.N.a(false, true);
                        hl.V3(b1cVar2);
                        hl.V3(z0cVar2);
                        break;
                    default:
                        l1cVar.h0.a(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.G = g4;
        frameLayout.addView(g3, tre.e(44, 36, 51));
        viewGroup2.addView(g4, tre.e(64, 48, 51));
        uc7.s1(i).g4.n(3, j2, false);
        SharedPreferences sharedPreferences = uc7.s1(i).X3;
        if (z && qu6.v("topicssidetabs", j, sharedPreferences, false)) {
            this.V = 1.0f;
            this.U = true;
        }
        z2 = (z && qu6.v("topicssidetabsb", j, sharedPreferences, false)) ? z2 : false;
        this.T = z2;
        g2.setImageResource(z2 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
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
        iye.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z) {
        if (this.g0 == z) {
            return;
        }
        this.g0 = z;
        int i = jn7.t5;
        long j = this.f;
        int i2 = this.e;
        if (!z) {
            long j2 = -j;
            LongSparseIntArray longSparseIntArray = uc7.s1(i2).g4.r;
            int i3 = longSparseIntArray.get(j2, 0) - 1;
            longSparseIntArray.put(j2, i3 >= 0 ? i3 : 0);
            jn7.f(i2).n(this, i);
            jn7.f(i2).n(this, 2);
            return;
        }
        jn7.f(i2).b(this, i);
        jn7.f(i2).b(this, 2);
        qyb qybVar = uc7.s1(i2).g4;
        long j3 = -j;
        LongSparseIntArray longSparseIntArray2 = qybVar.r;
        longSparseIntArray2.put(j3, longSparseIntArray2.get(j3, 0) + 1);
        qybVar.y(j3, true);
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
        ofFloat.addUpdateListener(new pzb(this, (byte) 2));
        this.e0.addListener(new i1a((byte) 9, this, z));
        this.e0.setInterpolator(bb2.V);
        this.e0.setDuration(250L);
        this.e0.start();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z6));
    }

    public final void b() {
        int i = aob.z6;
        vnb vnbVar = this.h;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.Fi, vnbVar);
        int f = vm2.f(1.0f - this.V, v0, v02);
        int f2 = vm2.f(this.V, v0, v02);
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
        ArrayList l = uc7.s1(this.e).g4.l(-this.f);
        this.a.a((l == null || l.isEmpty() || this.k0) ? false : true, z);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.t5;
        long j = this.f;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == (-j)) {
                n();
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = uc7.r5;
            if ((intValue & 512) > 0) {
                uc7.s1(this.e).g4.y(-j, false);
                n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.J;
        if (frameLayout.getVisibility() == 0) {
            this.O.setBounds((int) frameLayout.getTranslationX(), (int) this.R, (int) (frameLayout.getTranslationX() + hl.L(78.0f)), (int) (getMeasuredHeight() - this.Q));
            this.O.draw(canvas);
        }
        FrameLayout frameLayout2 = this.x;
        if (frameLayout2.getVisibility() == 0) {
            this.P.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.P.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + hl.L(50.0f)));
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
        fm0 fm0Var = this.N;
        float f = fm0Var.e;
        ImageView imageView = this.F;
        imageView.setAlpha(f);
        imageView.setScaleX(hl.R1(0.4f, 1.0f, f));
        imageView.setScaleY(hl.R1(0.4f, 1.0f, f));
        imageView.setVisibility(f > 0.0f ? 0 : 8);
        ImageView imageView2 = this.G;
        imageView2.setAlpha(f);
        imageView2.setScaleX(hl.R1(0.4f, 1.0f, f));
        imageView2.setScaleY(hl.R1(0.4f, 1.0f, f));
        imageView2.setVisibility(f > 0.0f ? 0 : 8);
        float f2 = 1.0f - fm0Var.e;
        ImageView imageView3 = this.H;
        imageView3.setAlpha(f2);
        imageView3.setScaleX(hl.R1(0.4f, 1.0f, f2));
        imageView3.setScaleY(hl.R1(0.4f, 1.0f, f2));
        imageView3.setVisibility(f2 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.I;
        imageView4.setAlpha(f2);
        imageView4.setScaleX(hl.R1(0.4f, 1.0f, f2));
        imageView4.setScaleY(hl.R1(0.4f, 1.0f, f2));
        imageView4.setVisibility(f2 > 0.0f ? 0 : 8);
    }

    public final void f() {
        float R1 = hl.R1(1.0f, 0.0f, this.V);
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(R1);
        frameLayout.setVisibility((1.0f - this.b.e) * ((1.0f - this.V) * this.a.e) > 0.0f ? 0 : 8);
        if (this.T) {
            frameLayout.setTranslationY(((getMeasuredHeight() - hl.L(50.0f)) - this.Q) + hl.U1(h(h1c.c), hl.L(43.0f), 0));
        } else {
            frameLayout.setTranslationY(this.R + hl.U1(h(h1c.a), -hl.L(43.0f), 0));
        }
    }

    public h1c getCurrentTabsPosition() {
        return this.U ? h1c.b : this.T ? h1c.c : h1c.a;
    }

    public float getSideMenuT() {
        return this.V * this.a.e;
    }

    public final float h(h1c h1cVar) {
        float f = (1.0f - this.b.e) * this.a.e;
        if (h1cVar == h1c.b) {
            return this.V * f;
        }
        if ((h1cVar != h1c.a || this.T) && !(h1cVar == h1c.c && this.T)) {
            return 0.0f;
        }
        return (1.0f - this.V) * f;
    }

    public final boolean i() {
        if (this.V <= 0.5f) {
            int i = 0;
            while (true) {
                z0c z0cVar = this.y;
                if (i >= z0cVar.getChildCount()) {
                    break;
                }
                b8c G = z0cVar.g3.G(RecyclerView.S(z0cVar.getChildAt(i)));
                if (G != null && G.s) {
                    return true;
                }
                i++;
            }
        } else {
            int i2 = 0;
            while (true) {
                b1c b1cVar = this.K;
                if (i2 >= b1cVar.getChildCount()) {
                    break;
                }
                b8c G2 = b1cVar.g3.G(RecyclerView.S(b1cVar.getChildAt(i2)));
                if (G2 != null && G2.s) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    public final void j() {
        qyb qybVar = uc7.s1(this.e).g4;
        long j = this.f;
        if (qybVar.e(-j)) {
            return;
        }
        qybVar.o(-j);
    }

    public final void k(long j, boolean z) {
        if (this.n) {
            icc iccVar = this.j0;
            if (iccVar != null) {
                iccVar.a(Long.valueOf(j), Boolean.valueOf(z));
                return;
            }
            return;
        }
        icc iccVar2 = this.h0;
        if (iccVar2 != null) {
            iccVar2.a(Integer.valueOf((int) j), Boolean.valueOf(z));
        }
    }

    public final boolean l(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z) {
        int i;
        int i2;
        uc7 uc7Var;
        final l1c l1cVar;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i3;
        String M0;
        int i4;
        final l1c l1cVar2;
        final fu5 fu5Var;
        boolean z2;
        final byte b;
        String M02;
        int i5;
        int i6 = this.e;
        uc7 s1 = uc7.s1(i6);
        long j = this.f;
        TLRPC.Chat M03 = j < 0 ? s1.M0(Long.valueOf(-j)) : null;
        TLRPC.User X1 = j > 0 ? s1.X1(Long.valueOf(j)) : null;
        zu1 zu1Var = this.s;
        final fu5 J = fu5.J(zu1Var, view);
        byte b2 = 1;
        final byte b3 = 0;
        if (xc2.p0(M03)) {
            long n = wf3.n(tL_forumTopic.from_id);
            if (n == 0 || !xc2.A(i6, M03, 24)) {
                return false;
            }
            TLRPC.Chat chat = M03;
            fu5Var = J;
            fu5Var.b(R.drawable.msg_clear, ob6.M0(2131752054, null), new y09((Object) this, (Object) fu5Var, n, (Object) chat, (byte) 16), false);
            long j2 = chat.id;
            if (xc2.p0(chat) && xc2.A(i6, chat, 24)) {
                long j3 = chat.linked_monoforum_id;
                if (j3 != 0) {
                    j2 = j3;
                }
            }
            TLRPC.Chat M04 = uc7.s1(i6).M0(Long.valueOf(j2));
            TLRPC.User X12 = uc7.s1(i6).X1(Long.valueOf(n));
            if (X12 != null && xc2.w(2, M04)) {
                fu5Var.b(R.drawable.msg_remove, ob6.M0(2131753719, null), null, false);
                b8 z3 = fu5Var.z();
                z3.setVisibility(8);
                uc7 s12 = uc7.s1(i6);
                ks5 ks5Var = new ks5(this, z3, fu5Var, j2, X12, M04, (byte) 3);
                fu5Var = fu5Var;
                s12.K0(M04, X12, ks5Var);
            }
            l1cVar2 = this;
        } else {
            if (xc2.y(15, M03) || lbc.x(X1)) {
                if (tL_forumTopic.pinned) {
                    i = R.drawable.msg_unpin;
                    i2 = 2131751417;
                } else {
                    i = R.drawable.msg_pin;
                    i2 = 2131751418;
                }
                uc7Var = s1;
                l1cVar = this;
                tL_forumTopic2 = tL_forumTopic;
                J.b(i, ob6.M0(i2, null), new kta((Object) this, (Object) J, (Object) uc7Var, (Object) tL_forumTopic, (byte) 14), false);
                if (tL_forumTopic2.pinned && !z) {
                    J.b(R.drawable.tabs_reorder, ob6.M0(2131750670, null), new u0c(l1cVar, b2), false);
                }
                i3 = 15;
            } else {
                i3 = 15;
                tL_forumTopic2 = tL_forumTopic;
                uc7Var = s1;
                l1cVar = this;
            }
            if (xc2.y(i3, M03) || lbc.x(X1)) {
                J.b(R.drawable.outline_profile_edit_24, ob6.M0(2131751181, null), new Runnable(l1cVar) { // from class: v0c
                    public final /* synthetic */ l1c b;

                    {
                        this.b = l1cVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        l1c l1cVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        fu5 fu5Var2 = J;
                        switch (b4) {
                            case 0:
                                fu5Var2.u();
                                l1cVar3.s.presentFragment(wxb.e0(-l1cVar3.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                fu5Var2.u();
                                uc7.s1(l1cVar3.e).g4.z(tL_forumTopic3.id, -l1cVar3.f, !tL_forumTopic3.closed);
                                break;
                            default:
                                fu5Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                kc kcVar = new kc((byte) 10);
                                l1c l1cVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l1cVar4.getContext());
                                String J0 = ob6.J0(hashSet.size(), "DeleteTopics");
                                id idVar = alertDialog$Builder.a;
                                idVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j4 = l1cVar4.f0;
                                if (hashSet.size() == 1) {
                                    idVar.U = ob6.a0(null, null, 2131751463, uc7.s1(l1cVar4.e).g4.f(-l1cVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    idVar.U = ob6.M0(2131751462, null);
                                }
                                alertDialog$Builder.j(ob6.M0(2131751563, null), new oo1(l1cVar4, arrayList, j4, hashSet, kcVar));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), new grb((byte) 4));
                                idVar.show();
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            long j4 = tL_forumTopic2.id;
            int currentAccount = zu1Var.getCurrentAccount();
            vnb resourceProvider = zu1Var.getResourceProvider();
            long j5 = l1cVar.f;
            hc2 hc2Var = new hc2(J, currentAccount, j5, j4, zu1Var, resourceProvider);
            fu5 K = J.K();
            K.b(R.drawable.msg_arrow_back, ob6.M0(2131753749, null), new vn1(J, (byte) 0), false);
            K.b(R.drawable.msg_tone_on, ob6.M0(2131745003, null), new ga7(J, currentAccount, j5, j4, K, zu1Var, resourceProvider), false);
            b8 z4 = K.z();
            K.b(R.drawable.msg_mute_period, ob6.M0(2131748062, null), new gp6((Object) J, (Object) resourceProvider, currentAccount, (Object) hc2Var, (byte) 16), false);
            K.b(R.drawable.msg_customize, ob6.M0(2131747644, null), new hv4((Object) J, j5, j4, (Object) zu1Var, (Object) resourceProvider, (byte) 3), false);
            K.b(0, "", new ic2(J, currentAccount, j5, j4, zu1Var, resourceProvider), false);
            new jc2(currentAccount, j5, j4, K.z(), z4).run();
            long j6 = tL_forumTopic2.id;
            long j7 = l1cVar.f;
            uc7 uc7Var2 = uc7Var;
            if (uc7Var2.p2(j7, j6, null)) {
                M0 = ob6.M0(2131743504, null);
                i4 = R.drawable.msg_unmute;
            } else {
                M0 = ob6.M0(2131748068, null);
                i4 = R.drawable.msg_mute;
            }
            int i7 = i4;
            TLRPC.Chat chat2 = M03;
            l1cVar2 = this;
            fu5Var = J;
            fu5Var.b(i7, M0, new uwa(l1cVar2, uc7Var2, tL_forumTopic, J, K, (byte) 7), false);
            if (!xc2.i(i6, chat2, tL_forumTopic) || lbc.w(X1)) {
                z2 = false;
                b = 1;
            } else {
                if (tL_forumTopic.closed) {
                    M02 = ob6.M0(2131745811, null);
                    i5 = R.drawable.msg_topic_restart;
                } else {
                    M02 = ob6.M0(2131752004, null);
                    i5 = R.drawable.msg_topic_close;
                }
                b = 1;
                z2 = false;
                fu5Var.b(i5, M02, new Runnable(l1cVar2) { // from class: v0c
                    public final /* synthetic */ l1c b;

                    {
                        this.b = l1cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b;
                        l1c l1cVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        fu5 fu5Var2 = fu5Var;
                        switch (b4) {
                            case 0:
                                fu5Var2.u();
                                l1cVar3.s.presentFragment(wxb.e0(-l1cVar3.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                fu5Var2.u();
                                uc7.s1(l1cVar3.e).g4.z(tL_forumTopic3.id, -l1cVar3.f, !tL_forumTopic3.closed);
                                break;
                            default:
                                fu5Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                kc kcVar = new kc((byte) 10);
                                l1c l1cVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l1cVar4.getContext());
                                String J0 = ob6.J0(hashSet.size(), "DeleteTopics");
                                id idVar = alertDialog$Builder.a;
                                idVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j42 = l1cVar4.f0;
                                if (hashSet.size() == 1) {
                                    idVar.U = ob6.a0(null, null, 2131751463, uc7.s1(l1cVar4.e).g4.f(-l1cVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    idVar.U = ob6.M0(2131751462, null);
                                }
                                alertDialog$Builder.j(ob6.M0(2131751563, null), new oo1(l1cVar4, arrayList, j42, hashSet, kcVar));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), new grb((byte) 4));
                                idVar.show();
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (xc2.e(i6, chat2, tL_forumTopic)) {
                final byte b4 = 2;
                fu5Var.b(R.drawable.msg_delete, ob6.J0(b, "DeleteTopics"), new Runnable(l1cVar2) { // from class: v0c
                    public final /* synthetic */ l1c b;

                    {
                        this.b = l1cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b4;
                        l1c l1cVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        fu5 fu5Var2 = fu5Var;
                        switch (b42) {
                            case 0:
                                fu5Var2.u();
                                l1cVar3.s.presentFragment(wxb.e0(-l1cVar3.f, tL_forumTopic3.id));
                                break;
                            case 1:
                                fu5Var2.u();
                                uc7.s1(l1cVar3.e).g4.z(tL_forumTopic3.id, -l1cVar3.f, !tL_forumTopic3.closed);
                                break;
                            default:
                                fu5Var2.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                kc kcVar = new kc((byte) 10);
                                l1c l1cVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l1cVar4.getContext());
                                String J0 = ob6.J0(hashSet.size(), "DeleteTopics");
                                id idVar = alertDialog$Builder.a;
                                idVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j42 = l1cVar4.f0;
                                if (hashSet.size() == 1) {
                                    idVar.U = ob6.a0(null, null, 2131751463, uc7.s1(l1cVar4.e).g4.f(-l1cVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    idVar.U = ob6.M0(2131751462, null);
                                }
                                alertDialog$Builder.j(ob6.M0(2131751563, null), new oo1(l1cVar4, arrayList, j42, hashSet, kcVar));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), new grb((byte) 4));
                                idVar.show();
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, z2);
            }
        }
        boolean z5 = view instanceof g1c;
        vnb vnbVar = l1cVar2.h;
        if (z5) {
            c1c c1cVar = new c1c();
            Paint paint = new Paint(1);
            c1cVar.a = paint;
            c1cVar.b = new RectF();
            paint.setColor(aob.v0(aob.G8, vnbVar));
            fu5Var.X(c1cVar);
            fu5Var.b0(hl.L(16.0f), 0.0f);
        } else if (z) {
            fu5Var.X(aob.b0(hl.L(16.0f), aob.v0(aob.d6, vnbVar)));
            fu5Var.W(5);
        } else {
            int L = hl.L(5.0f);
            int L2 = hl.L(5.0f);
            int v0 = aob.v0(aob.d6, vnbVar);
            float f = L;
            float f2 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, f, f, f2, f2, 0.0f, 0.0f}, null, null));
            shapeDrawable.getPaint().setColor(v0);
            fu5Var.X(shapeDrawable);
        }
        fu5Var.a0();
        return true;
    }

    public final void m() {
        zo1 zo1Var = this.S;
        if (zo1Var != null) {
            zo1Var.run();
        }
        f();
        float h = h(h1c.b);
        float U1 = hl.U1(h, -hl.L(78.0f), 0);
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(U1);
        frameLayout.setVisibility(h <= 0.0f ? 8 : 0);
        b();
        int i = aob.Fi;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        vnb vnbVar = this.h;
        yob.s(imageView, i, vnbVar, mode);
        yob.s(this.G, i, vnbVar, mode);
        invalidate();
    }

    public final void n() {
        d(true);
        z0c z0cVar = this.y;
        boolean canScrollHorizontally = z0cVar.canScrollHorizontally(-1);
        z0cVar.g3.O(true);
        byte b = 0;
        if (!canScrollHorizontally) {
            z0cVar.x0(0);
        }
        b1c b1cVar = this.K;
        boolean canScrollVertically = b1cVar.canScrollVertically(-1);
        b1cVar.g3.O(true);
        if (!canScrollVertically) {
            b1cVar.x0(0);
        }
        hl.c3(new u0c(this, b));
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
        z0c z0cVar = this.y;
        z0cVar.g3.O(true);
        z0cVar.invalidate();
        this.K.g3.O(true);
        k1c k1cVar = this.E;
        if (k1cVar != null) {
            k1cVar.c(true, false, j == 0);
        }
    }

    public void setOnDialogSelected(icc iccVar) {
        this.j0 = iccVar;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setOnTopicSelected(icc iccVar) {
        this.h0 = iccVar;
    }

    public void setSideMenuBackgroundDrawable(jl0 jl0Var) {
        this.O = jl0Var;
        jl0Var.r(hl.L(16.0f));
        this.O.q(hl.L(7.0f));
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

    public void setTopMenuBackgroundDrawable(jl0 jl0Var) {
        this.P = jl0Var;
        jl0Var.r(hl.L(18.0f));
        this.P.q(hl.L(7.0f));
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        m();
    }

    @Override // snb
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
        if (i == 1 && f == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(R.drawable.menu_sidebar_left);
            this.I.setImageResource(R.drawable.menu_sidebar_bottom);
            uc7.s1(this.e).X3.edit().putBoolean("topicssidetabsb" + this.f, false).apply();
            o(true);
        }
    }
}
