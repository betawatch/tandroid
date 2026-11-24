// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c32 extends j39 {
    public rf4 E;
    public long F;
    public long G;
    public int H;
    public String J;
    public String K;
    public String L;
    public boolean T;
    public int U;
    public boolean W;
    public final /* synthetic */ d32 Y;
    public final Context r;
    public x22 w;
    public kx1 x;
    public long y;
    public ArrayList s = new ArrayList();
    public final se4 I = new se4(0, 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final SparseArray P = new SparseArray();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public final ArrayList S = new ArrayList();
    public final on V = new on(null);
    public final o1 X = new o1(this, 15);

    public c32(d32 d32Var, Context context) {
        this.Y = d32Var;
        this.r = context;
    }

    @Override // w29
    public final String F(int i) {
        return null;
    }

    @Override // w29
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // j39
    public final int M(int i) {
        if (i == 0) {
            return this.s.size();
        }
        int i2 = i - 1;
        ArrayList arrayList = this.Q;
        int i3 = 1;
        if (i2 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.R.get(arrayList.get(i2));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i2 == 0 && this.s.isEmpty()) {
            i3 = 0;
        }
        return size + i3;
    }

    @Override // j39
    public final Object O(int i, int i2) {
        ArrayList arrayList;
        if (i == 0) {
            if (i2 < this.s.size()) {
                return this.s.get(i2);
            }
            return null;
        }
        int i3 = i - 1;
        ArrayList arrayList2 = this.Q;
        if (i3 >= arrayList2.size() || (arrayList = (ArrayList) this.R.get(arrayList2.get(i3))) == null) {
            return null;
        }
        int i4 = i2 - ((i3 == 0 && this.s.isEmpty()) ? 0 : 1);
        if (i4 < 0 || i4 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i4);
    }

    @Override // j39
    public final int P(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i == R() - 1) {
            return 3;
        }
        int i3 = i - 1;
        if (i3 < this.Q.size()) {
            return (!(i3 == 0 && this.s.isEmpty()) && i2 == 0) ? 0 : 4;
        }
        return 2;
    }

    @Override // j39
    public final int R() {
        ArrayList arrayList = this.Q;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.W ? 1 : 0) + 2;
    }

    @Override // j39
    public final View T(int i, View view) {
        wjb wjbVar = this.Y.a;
        l35 l35Var = (l35) view;
        if (l35Var == null) {
            l35Var = new l35(this.r, wjbVar);
            l35Var.setBackgroundColor(bkb.v0(bkb.d7, wjbVar) & (-218103809));
        }
        if (i == 0 || (i == 1 && this.s.isEmpty())) {
            l35Var.setAlpha(0.0f);
            return l35Var;
        }
        int i2 = i - 1;
        ArrayList arrayList = this.Q;
        if (i2 < arrayList.size()) {
            l35Var.setAlpha(1.0f);
            if (((ArrayList) this.R.get((String) arrayList.get(i2))) != null) {
                l35Var.setText((i2 != 0 || this.s.isEmpty()) ? k96.e0(((k27) r0.get(0)).k.date, false) : k96.M0(2131749360, null));
            }
        }
        return view;
    }

    @Override // j39
    public final void W(int i, int i2, s49 s49Var) {
        int i3 = i2;
        int i4 = s49Var.f;
        View view = s49Var.a;
        if (i4 == 2 || i4 == 3) {
            return;
        }
        HashMap hashMap = this.R;
        ArrayList arrayList = this.Q;
        boolean z = false;
        if (i4 == 0) {
            int i5 = i - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i5))) != null) {
                ((l35) view).setText((i5 != 0 || this.s.isEmpty()) ? k96.e0(((k27) r3.get(0)).k.date, false) : k96.M0(2131749360, null));
                return;
            }
            return;
        }
        if (i4 == 1 || i4 == 4) {
            iba ibaVar = (iba) view;
            if (i == 0) {
                w22 w22Var = (w22) O(S(i3), Q(i3));
                int i6 = w22Var.a;
                if (i6 != 0) {
                    ibaVar.d(w22Var.b, w22Var.c, null, null, i6, false);
                } else {
                    ibaVar.d(w22Var.b, w22Var.c, w22Var.d.toUpperCase().substring(0, Math.min(w22Var.d.length(), 4)), w22Var.e, 0, false);
                }
                File file = w22Var.f;
                d32 d32Var = this.Y;
                if (file != null) {
                    ibaVar.b(d32Var.S.containsKey(file.toString()), !d32Var.V);
                    return;
                } else {
                    ibaVar.b(false, !d32Var.V);
                    return;
                }
            }
            int i7 = i - 1;
            if (i7 != 0 || !this.s.isEmpty()) {
                i3--;
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i7));
            if (arrayList2 != null) {
                k27 k27Var = (k27) arrayList2.get(i3);
                boolean z2 = ibaVar.getMessage() != null && ibaVar.getMessage().e1() == k27Var.e1();
                if (i3 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && this.T)) {
                    z = true;
                }
                ibaVar.c(k27Var, z);
                ibaVar.getViewTreeObserver().addOnPreDrawListener(new b32(this, ibaVar, k27Var, z2, (byte) 0));
            }
        }
    }

    public final void Y(String str, boolean z) {
        long j;
        d32 d32Var = this.Y;
        v22 v22Var = d32Var.w;
        r22 r22Var = d32Var.r;
        kx1 kx1Var = this.x;
        if (kx1Var != null) {
            gl.r(kx1Var);
            this.x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (r22Var.getAdapter() != v22Var) {
                r22Var.setAdapter(v22Var);
            }
            f();
        } else {
            kx1 kx1Var2 = new kx1(this, str, (byte) 14);
            this.x = kx1Var2;
            gl.d3(kx1Var2, 300L);
        }
        if (d32Var.a0 || !v22Var.f.isEmpty()) {
            return;
        }
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i >= arrayList.size()) {
                Z(j2, j3, j4, tf4.k3[2], str, z);
                return;
            }
            rf4 rf4Var = (rf4) arrayList.get(i);
            byte b = rf4Var.d;
            if (b == 4) {
                TLObject tLObject = rf4Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) tLObject).id;
                }
                j2 = j;
            } else if (b == 6) {
                pf4 pf4Var = rf4Var.g;
                j3 = pf4Var.b;
                j4 = pf4Var.c;
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, x22] */
    public final void Z(final long j, final long j2, final long j3, rf4 rf4Var, final String str, boolean z) {
        d32 d32Var = this.Y;
        r22 r22Var = d32Var.r;
        q22 q22Var = d32Var.M;
        Locale locale = Locale.ENGLISH;
        final String str2 = j + j2 + j3 + ((int) rf4Var.d) + str;
        String str3 = this.J;
        final boolean z2 = str3 != null && str3.equals(str2);
        boolean z3 = !z2 && z;
        this.E = rf4Var;
        this.y = j;
        this.F = j2;
        this.G = j3;
        x22 x22Var = this.w;
        if (x22Var != null) {
            gl.r(x22Var);
        }
        o1 o1Var = this.X;
        gl.r(o1Var);
        if (z2 && z) {
            return;
        }
        ArrayList arrayList = this.N;
        ArrayList arrayList2 = this.M;
        ArrayList arrayList3 = this.O;
        if (z3) {
            arrayList3.clear();
            this.Q.clear();
            this.R.clear();
            this.T = true;
            q22Var.setVisibility(0);
            f();
            this.U++;
            if (r22Var.getPinnedHeader() != null) {
                r22Var.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.T = true;
        f();
        if (!z2) {
            o1Var.run();
            q22Var.e(true, !z);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i = 1 + this.U;
        this.U = i;
        final j5 a = j5.a(y6c.t0);
        ?? r0 = new Runnable() { // from class: x22
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                j5 j5Var;
                int i2;
                long j4;
                final ArrayList arrayList4;
                long j5;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                j5 j5Var2 = a;
                int i3 = j5Var2.a;
                final c32 c32Var = c32.this;
                ArrayList arrayList5 = c32Var.O;
                final long j6 = j;
                final String str4 = str;
                final long j7 = j2;
                long j8 = j3;
                final boolean z4 = z2;
                if (j6 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = c32Var.E.e;
                    tL_messages_search.peer = na7.q1(i3).h1(j6);
                    if (j7 > 0) {
                        tL_messages_search.min_date = (int) (j7 / 1000);
                    }
                    if (j8 > 0) {
                        tL_messages_search.max_date = (int) (j8 / 1000);
                    }
                    if (z4 && str4.equals(c32Var.K) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((k27) b00.f(1, arrayList5)).e1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    j5Var = j5Var2;
                    arrayList4 = null;
                    tL_messages_searchGlobal = tL_messages_search;
                } else {
                    if (TextUtils.isEmpty(str4)) {
                        j5Var = j5Var2;
                        i2 = 20;
                        j4 = j8;
                        arrayList4 = null;
                    } else {
                        ArrayList arrayList6 = new ArrayList();
                        j4 = j8;
                        j5Var = j5Var2;
                        i2 = 20;
                        ad7.Y(i3).J0(0, str4, arrayList6, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i2;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = c32Var.E.e;
                    if (j7 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j7 / 1000);
                    }
                    if (j4 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j4 / 1000);
                    }
                    if (z4 && str4.equals(c32Var.K) && !arrayList5.isEmpty()) {
                        k27 k27Var = (k27) b00.f(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = k27Var.e1();
                        tL_messages_searchGlobal2.offset_rate = c32Var.H;
                        TLRPC.Peer peer = k27Var.k.peer_id;
                        long j9 = peer.channel_id;
                        if (j9 == 0) {
                            j9 = peer.chat_id;
                            if (j9 == 0) {
                                j5 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = na7.q1(i3).h1(j5);
                                tL_messages_searchGlobal = tL_messages_searchGlobal2;
                            }
                        }
                        j5 = -j9;
                        tL_messages_searchGlobal2.offset_peer = na7.q1(i3).h1(j5);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                c32Var.K = str4;
                c32Var.J = str2;
                final ArrayList arrayList7 = new ArrayList();
                tf4.B1(c32Var.K, arrayList7);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                final int i4 = i;
                final j5 j5Var3 = j5Var;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: y22
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList8 = new ArrayList();
                        j5 j5Var4 = j5Var3;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                k27 k27Var2 = new k27(j5Var4.a, messages_messages.messages.get(i5), false, true);
                                k27Var2.J5(str5, true);
                                arrayList8.add(k27Var2);
                            }
                        }
                        gl.c3(new tf1(c32.this, i4, tL_error, tLObject, j5Var4, z4, str5, arrayList8, j6, j7, arrayList4, arrayList7));
                    }
                });
            }
        };
        this.w = r0;
        gl.d3(r0, (!z2 || arrayList3.isEmpty()) ? 350L : 0L);
        d32Var.K.setViewType(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        boolean z2;
        AnimatorSet animatorSet;
        d32 d32Var = this.Y;
        tf4 tf4Var = d32Var.I;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            ArrayList arrayList3 = this.S;
            if (i >= arrayList3.size()) {
                break;
            }
            if (((rf4) arrayList3.get(i)).a()) {
                z3 = true;
            } else if (((rf4) arrayList3.get(i)).d == 4) {
                z4 = true;
            } else if (((rf4) arrayList3.get(i)).d == 6) {
                z5 = true;
            }
            i++;
        }
        boolean z6 = ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? false : true;
        if ((z3 || z6 || !z) && z6) {
            if (arrayList == null || arrayList.isEmpty() || z4) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z5) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null) {
                tf4Var.D1(arrayList, arrayList2, false);
                z2 = true;
                if (!z2) {
                    tf4Var.D1(null, null, false);
                }
                tf4Var.setEnabled(z2);
                Object tag = tf4Var.getTag();
                if (z2) {
                    if (tag == null) {
                        return;
                    }
                } else if (tag != null) {
                    return;
                }
                tf4Var.setTag(z2 ? 1 : null);
                animatorSet = d32Var.J;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z2) {
                    tf4Var.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                d32Var.J = animatorSet2;
                r22 r22Var = d32Var.r;
                Property property = View.TRANSLATION_Y;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(r22Var, (Property<r22, Float>) property, !z2 ? gl.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(tf4Var, (Property<tf4, Float>) property, !z2 ? 0.0f : -gl.L(44.0f)), ObjectAnimator.ofFloat(d32Var.K, (Property<pi4, Float>) property, !z2 ? gl.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(d32Var.M, (Property<q22, Float>) property, z2 ? gl.L(44.0f) : 0.0f));
                d32Var.J.addListener(new bb1((Object) this, (byte) 16));
                d32Var.J.setInterpolator(s33.g);
                d32Var.J.setDuration(180L);
                d32Var.J.start();
            }
        }
        z2 = false;
        if (!z2) {
        }
        tf4Var.setEnabled(z2);
        Object tag2 = tf4Var.getTag();
        if (z2) {
        }
        tf4Var.setTag(z2 ? 1 : null);
        animatorSet = d32Var.J;
        if (animatorSet != null) {
        }
        if (z2) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        d32Var.J = animatorSet22;
        r22 r22Var2 = d32Var.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(r22Var2, (Property<r22, Float>) property2, !z2 ? gl.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(tf4Var, (Property<tf4, Float>) property2, !z2 ? 0.0f : -gl.L(44.0f)), ObjectAnimator.ofFloat(d32Var.K, (Property<pi4, Float>) property2, !z2 ? gl.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(d32Var.M, (Property<q22, Float>) property2, z2 ? gl.L(44.0f) : 0.0f));
        d32Var.J.addListener(new bb1((Object) this, (byte) 16));
        d32Var.J.setInterpolator(s33.g);
        d32Var.J.setDuration(180L);
        d32Var.J.start();
    }

    @Override // j39, w39
    public final void f() {
        X(false);
        this.Y.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        l35 l35Var;
        View view;
        wjb wjbVar = this.Y.a;
        Context context = this.r;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    pi4 pi4Var = new pi4(context, wjbVar);
                    pi4Var.setViewType(3);
                    pi4Var.setIsSingleCell(true);
                    l35Var = pi4Var;
                } else if (i != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return ls6.h(view, view, -1, -2);
                }
            }
            iba ibaVar = new iba(i == 1 ? 1 : 2, wjbVar, context);
            ibaVar.setDrawDownloadIcon(false);
            view = ibaVar;
            return ls6.h(view, view, -1, -2);
        }
        l35Var = new l35(context, wjbVar);
        view = l35Var;
        return ls6.h(view, view, -1, -2);
    }
}
