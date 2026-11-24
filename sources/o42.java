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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o42 extends m59 {
    public sh4 E;
    public long F;
    public long G;
    public int H;
    public String J;
    public String K;
    public String L;
    public boolean T;
    public int U;
    public boolean W;
    public final /* synthetic */ p42 Y;
    public final Context r;
    public j42 w;
    public lx1 x;
    public long y;
    public ArrayList s = new ArrayList();
    public final ug4 I = new ug4(0, 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final SparseArray P = new SparseArray();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public final ArrayList S = new ArrayList();
    public final po V = new po(null);
    public final o1 X = new o1(this, 15);

    public o42(p42 p42Var, Context context) {
        this.Y = p42Var;
        this.r = context;
    }

    @Override // z49
    public final String F(int i) {
        return null;
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // m59
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

    @Override // m59
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

    @Override // m59
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

    @Override // m59
    public final int R() {
        ArrayList arrayList = this.Q;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.W ? 1 : 0) + 2;
    }

    @Override // m59
    public final View T(int i, View view) {
        ylb ylbVar = this.Y.a;
        l55 l55Var = (l55) view;
        if (l55Var == null) {
            l55Var = new l55(this.r, ylbVar);
            l55Var.setBackgroundColor(cmb.v0(cmb.d7, ylbVar) & (-218103809));
        }
        if (i == 0 || (i == 1 && this.s.isEmpty())) {
            l55Var.setAlpha(0.0f);
            return l55Var;
        }
        int i2 = i - 1;
        ArrayList arrayList = this.Q;
        if (i2 < arrayList.size()) {
            l55Var.setAlpha(1.0f);
            if (((ArrayList) this.R.get((String) arrayList.get(i2))) != null) {
                l55Var.setText((i2 != 0 || this.s.isEmpty()) ? jb6.e0(((k47) r0.get(0)).k.date, false) : jb6.M0(2131749309, null));
            }
        }
        return view;
    }

    @Override // m59
    public final void W(int i, int i2, u69 u69Var) {
        int i3 = i2;
        int i4 = u69Var.f;
        View view = u69Var.a;
        if (i4 == 2 || i4 == 3) {
            return;
        }
        HashMap hashMap = this.R;
        ArrayList arrayList = this.Q;
        boolean z = false;
        if (i4 == 0) {
            int i5 = i - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i5))) != null) {
                ((l55) view).setText((i5 != 0 || this.s.isEmpty()) ? jb6.e0(((k47) r3.get(0)).k.date, false) : jb6.M0(2131749309, null));
                return;
            }
            return;
        }
        if (i4 == 1 || i4 == 4) {
            ida idaVar = (ida) view;
            if (i == 0) {
                i42 i42Var = (i42) O(S(i3), Q(i3));
                int i6 = i42Var.a;
                if (i6 != 0) {
                    idaVar.d(i42Var.b, i42Var.c, null, null, i6, false);
                } else {
                    idaVar.d(i42Var.b, i42Var.c, i42Var.d.toUpperCase().substring(0, Math.min(i42Var.d.length(), 4)), i42Var.e, 0, false);
                }
                File file = i42Var.f;
                p42 p42Var = this.Y;
                if (file != null) {
                    idaVar.b(p42Var.S.containsKey(file.toString()), !p42Var.V);
                    return;
                } else {
                    idaVar.b(false, !p42Var.V);
                    return;
                }
            }
            int i7 = i - 1;
            if (i7 != 0 || !this.s.isEmpty()) {
                i3--;
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i7));
            if (arrayList2 != null) {
                k47 k47Var = (k47) arrayList2.get(i3);
                boolean z2 = idaVar.getMessage() != null && idaVar.getMessage().e1() == k47Var.e1();
                if (i3 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && this.T)) {
                    z = true;
                }
                idaVar.c(k47Var, z);
                idaVar.getViewTreeObserver().addOnPreDrawListener(new n42(this, idaVar, k47Var, z2, (byte) 0));
            }
        }
    }

    public final void Y(String str, boolean z) {
        long j;
        p42 p42Var = this.Y;
        h42 h42Var = p42Var.w;
        d42 d42Var = p42Var.r;
        lx1 lx1Var = this.x;
        if (lx1Var != null) {
            gm.r(lx1Var);
            this.x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (d42Var.getAdapter() != h42Var) {
                d42Var.setAdapter(h42Var);
            }
            f();
        } else {
            lx1 lx1Var2 = new lx1(this, str, (byte) 15);
            this.x = lx1Var2;
            gm.d3(lx1Var2, 300L);
        }
        if (p42Var.a0 || !h42Var.f.isEmpty()) {
            return;
        }
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i >= arrayList.size()) {
                Z(j2, j3, j4, uh4.k3[2], str, z);
                return;
            }
            sh4 sh4Var = (sh4) arrayList.get(i);
            byte b = sh4Var.d;
            if (b == 4) {
                TLObject tLObject = sh4Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) tLObject).id;
                }
                j2 = j;
            } else if (b == 6) {
                qh4 qh4Var = sh4Var.g;
                j3 = qh4Var.b;
                j4 = qh4Var.c;
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j42, java.lang.Runnable] */
    public final void Z(final long j, final long j2, final long j3, sh4 sh4Var, final String str, boolean z) {
        p42 p42Var = this.Y;
        d42 d42Var = p42Var.r;
        c42 c42Var = p42Var.M;
        Locale locale = Locale.ENGLISH;
        final String str2 = j + j2 + j3 + ((int) sh4Var.d) + str;
        String str3 = this.J;
        final boolean z2 = str3 != null && str3.equals(str2);
        boolean z3 = !z2 && z;
        this.E = sh4Var;
        this.y = j;
        this.F = j2;
        this.G = j3;
        j42 j42Var = this.w;
        if (j42Var != null) {
            gm.r(j42Var);
        }
        o1 o1Var = this.X;
        gm.r(o1Var);
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
            c42Var.setVisibility(0);
            f();
            this.U++;
            if (d42Var.getPinnedHeader() != null) {
                d42Var.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.T = true;
        f();
        if (!z2) {
            o1Var.run();
            c42Var.e(true, !z);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i = 1 + this.U;
        this.U = i;
        final j5 a = j5.a(z8c.t0);
        ?? r0 = new Runnable() { // from class: j42
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
                final o42 o42Var = o42.this;
                ArrayList arrayList5 = o42Var.O;
                final long j6 = j;
                final String str4 = str;
                final long j7 = j2;
                long j8 = j3;
                final boolean z4 = z2;
                if (j6 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = o42Var.E.e;
                    tL_messages_search.peer = oc7.r1(i3).i1(j6);
                    if (j7 > 0) {
                        tL_messages_search.min_date = (int) (j7 / 1000);
                    }
                    if (j8 > 0) {
                        tL_messages_search.max_date = (int) (j8 / 1000);
                    }
                    if (z4 && str4.equals(o42Var.K) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((k47) b10.f(1, arrayList5)).e1();
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
                        cf7.Y(i3).J0(0, str4, arrayList6, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i2;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = o42Var.E.e;
                    if (j7 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j7 / 1000);
                    }
                    if (j4 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j4 / 1000);
                    }
                    if (z4 && str4.equals(o42Var.K) && !arrayList5.isEmpty()) {
                        k47 k47Var = (k47) b10.f(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = k47Var.e1();
                        tL_messages_searchGlobal2.offset_rate = o42Var.H;
                        TLRPC.Peer peer = k47Var.k.peer_id;
                        long j9 = peer.channel_id;
                        if (j9 == 0) {
                            j9 = peer.chat_id;
                            if (j9 == 0) {
                                j5 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = oc7.r1(i3).i1(j5);
                                tL_messages_searchGlobal = tL_messages_searchGlobal2;
                            }
                        }
                        j5 = -j9;
                        tL_messages_searchGlobal2.offset_peer = oc7.r1(i3).i1(j5);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                o42Var.K = str4;
                o42Var.J = str2;
                final ArrayList arrayList7 = new ArrayList();
                uh4.B1(o42Var.K, arrayList7);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                final int i4 = i;
                final j5 j5Var3 = j5Var;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: k42
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList8 = new ArrayList();
                        j5 j5Var4 = j5Var3;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                k47 k47Var2 = new k47(j5Var4.a, messages_messages.messages.get(i5), false, true);
                                k47Var2.J5(str5, true);
                                arrayList8.add(k47Var2);
                            }
                        }
                        gm.c3(new bh1(o42.this, i4, tL_error, tLObject, j5Var4, z4, str5, arrayList8, j6, j7, arrayList4, arrayList7));
                    }
                });
            }
        };
        this.w = r0;
        gm.d3(r0, (!z2 || arrayList3.isEmpty()) ? 350L : 0L);
        p42Var.K.setViewType(3);
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
        p42 p42Var = this.Y;
        uh4 uh4Var = p42Var.I;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            ArrayList arrayList3 = this.S;
            if (i >= arrayList3.size()) {
                break;
            }
            if (((sh4) arrayList3.get(i)).a()) {
                z3 = true;
            } else if (((sh4) arrayList3.get(i)).d == 4) {
                z4 = true;
            } else if (((sh4) arrayList3.get(i)).d == 6) {
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
                uh4Var.D1(arrayList, arrayList2, false);
                z2 = true;
                if (!z2) {
                    uh4Var.D1(null, null, false);
                }
                uh4Var.setEnabled(z2);
                Object tag = uh4Var.getTag();
                if (z2) {
                    if (tag == null) {
                        return;
                    }
                } else if (tag != null) {
                    return;
                }
                uh4Var.setTag(z2 ? 1 : null);
                animatorSet = p42Var.J;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z2) {
                    uh4Var.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                p42Var.J = animatorSet2;
                d42 d42Var = p42Var.r;
                Property property = View.TRANSLATION_Y;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(d42Var, (Property<d42, Float>) property, !z2 ? gm.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(uh4Var, (Property<uh4, Float>) property, !z2 ? 0.0f : -gm.L(44.0f)), ObjectAnimator.ofFloat(p42Var.K, (Property<tk4, Float>) property, !z2 ? gm.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(p42Var.M, (Property<c42, Float>) property, z2 ? gm.L(44.0f) : 0.0f));
                p42Var.J.addListener(new b91((Object) this, (byte) 18));
                p42Var.J.setInterpolator(d53.g);
                p42Var.J.setDuration(180L);
                p42Var.J.start();
            }
        }
        z2 = false;
        if (!z2) {
        }
        uh4Var.setEnabled(z2);
        Object tag2 = uh4Var.getTag();
        if (z2) {
        }
        uh4Var.setTag(z2 ? 1 : null);
        animatorSet = p42Var.J;
        if (animatorSet != null) {
        }
        if (z2) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        p42Var.J = animatorSet22;
        d42 d42Var2 = p42Var.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(d42Var2, (Property<d42, Float>) property2, !z2 ? gm.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(uh4Var, (Property<uh4, Float>) property2, !z2 ? 0.0f : -gm.L(44.0f)), ObjectAnimator.ofFloat(p42Var.K, (Property<tk4, Float>) property2, !z2 ? gm.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(p42Var.M, (Property<c42, Float>) property2, z2 ? gm.L(44.0f) : 0.0f));
        p42Var.J.addListener(new b91((Object) this, (byte) 18));
        p42Var.J.setInterpolator(d53.g);
        p42Var.J.setDuration(180L);
        p42Var.J.start();
    }

    @Override // m59, y59
    public final void f() {
        X(false);
        this.Y.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        l55 l55Var;
        View view;
        ylb ylbVar = this.Y.a;
        Context context = this.r;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    tk4 tk4Var = new tk4(context, ylbVar);
                    tk4Var.setViewType(3);
                    tk4Var.setIsSingleCell(true);
                    l55Var = tk4Var;
                } else if (i != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return kt6.h(view, view, -1, -2);
                }
            }
            ida idaVar = new ida(i == 1 ? 1 : 2, ylbVar, context);
            idaVar.setDrawDownloadIcon(false);
            view = idaVar;
            return kt6.h(view, view, -1, -2);
        }
        l55Var = new l55(context, ylbVar);
        view = l55Var;
        return kt6.h(view, view, -1, -2);
    }
}
