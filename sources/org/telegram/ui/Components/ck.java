package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ck extends pj0 {
    public jg.o0 E;
    public long F;
    public long G;
    public int H;
    public String J;
    public String K;
    public String L;
    public boolean T;
    public int U;
    public boolean W;
    public final /* synthetic */ dk Y;
    public final Context r;
    public xj w;
    public od x;
    public long y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.sz I = new org.telegram.ui.sz(0, 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final SparseArray P = new SparseArray();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public final ArrayList S = new ArrayList();
    public final h2.f V = new h2.f((int[]) null);
    public final zj X = new zj(this, 0);

    public ck(dk dkVar, Context context) {
        this.Y = dkVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int M(int i7) {
        if (i7 == 0) {
            return this.s.size();
        }
        int i10 = i7 - 1;
        ArrayList arrayList = this.Q;
        int i11 = 1;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.R.get(arrayList.get(i10));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i10 == 0 && this.s.isEmpty()) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override // org.telegram.ui.Components.pj0
    public final Object O(int i7, int i10) {
        ArrayList arrayList;
        if (i7 == 0) {
            if (i10 < this.s.size()) {
                return this.s.get(i10);
            }
            return null;
        }
        int i11 = i7 - 1;
        ArrayList arrayList2 = this.Q;
        if (i11 >= arrayList2.size() || (arrayList = (ArrayList) this.R.get(arrayList2.get(i11))) == null) {
            return null;
        }
        int i12 = i10 - ((i11 == 0 && this.s.isEmpty()) ? 0 : 1);
        if (i12 < 0 || i12 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i12);
    }

    @Override // org.telegram.ui.Components.pj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == R() - 1) {
            return 3;
        }
        int i11 = i7 - 1;
        if (i11 < this.Q.size()) {
            return (!(i11 == 0 && this.s.isEmpty()) && i10 == 0) ? 0 : 4;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int R() {
        ArrayList arrayList = this.Q;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.W ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.pj0
    public final View T(int i7, View view) {
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (x3Var == null) {
            Context context = this.r;
            dk dkVar = this.Y;
            x3Var = new org.telegram.ui.Cells.x3(context, dkVar.a);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.e7, dkVar.a) & (-218103809));
        }
        if (i7 == 0 || (i7 == 1 && this.s.isEmpty())) {
            x3Var.setAlpha(0.0f);
            return x3Var;
        }
        int i10 = i7 - 1;
        ArrayList arrayList = this.Q;
        if (i10 < arrayList.size()) {
            x3Var.setAlpha(1.0f);
            if (((ArrayList) this.R.get((String) arrayList.get(i10))) != null) {
                x3Var.setText((i10 != 0 || this.s.isEmpty()) ? org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) r1.get(0)).k.date, false) : org.telegram.messenger.hd.M0(2131749535, null));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        int i11 = e1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // org.telegram.ui.Components.pj0
    public final void W(int i7, int i10, v4.e1 e1Var) {
        int i11 = i10;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 2 || i12 == 3) {
            return;
        }
        HashMap hashMap = this.R;
        ArrayList arrayList = this.Q;
        boolean z10 = false;
        if (i12 == 0) {
            int i13 = i7 - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i13))) == null) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText((i13 != 0 || this.s.isEmpty()) ? org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) r3.get(0)).k.date, false) : org.telegram.messenger.hd.M0(2131749535, null));
            return;
        }
        if (i12 == 1 || i12 == 4) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            if (i7 == 0) {
                wj wjVar = (wj) O(S(i11), Q(i11));
                int i14 = wjVar.a;
                if (i14 != 0) {
                    g7Var.d(wjVar.b, wjVar.c, null, null, i14, false);
                } else {
                    g7Var.d(wjVar.b, wjVar.c, wjVar.d.toUpperCase().substring(0, Math.min(wjVar.d.length(), 4)), wjVar.e, 0, false);
                }
                File file = wjVar.f;
                dk dkVar = this.Y;
                if (file != null) {
                    g7Var.b(dkVar.S.containsKey(file.toString()), !dkVar.V);
                    return;
                } else {
                    g7Var.b(false, !dkVar.V);
                    return;
                }
            }
            int i15 = i7 - 1;
            if (i15 != 0 || !this.s.isEmpty()) {
                i11--;
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
            if (arrayList2 == null) {
                return;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i11);
            boolean z11 = g7Var.getMessage() != null && g7Var.getMessage().e1() == gjVar.e1();
            if (i11 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.T)) {
                z10 = true;
            }
            g7Var.c(gjVar, z10);
            g7Var.getViewTreeObserver().addOnPreDrawListener(new bk(this, g7Var, gjVar, z11, 0));
        }
    }

    public final void Y(String str, boolean z10) {
        long j3;
        dk dkVar = this.Y;
        vj vjVar = dkVar.w;
        rj rjVar = dkVar.r;
        od odVar = this.x;
        if (odVar != null) {
            org.telegram.messenger.g0.r(odVar);
            this.x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (rjVar.getAdapter() != vjVar) {
                rjVar.setAdapter(vjVar);
            }
            f();
        } else {
            od odVar2 = new od(13, this, str);
            this.x = odVar2;
            org.telegram.messenger.g0.i3(odVar2, 300L);
        }
        if (dkVar.a0 || !vjVar.f.isEmpty()) {
            return;
        }
        int i7 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i7 >= arrayList.size()) {
                Z(j10, j11, j12, jg.q0.k3[2], str, z10);
                return;
            }
            jg.o0 o0Var = (jg.o0) arrayList.get(i7);
            int i10 = o0Var.d;
            if (i10 == 4) {
                TLObject tLObject = o0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) tLObject).id;
                }
                j10 = j3;
            } else if (i10 == 6) {
                jg.m0 m0Var = o0Var.g;
                j11 = m0Var.b;
                j12 = m0Var.c;
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.xj] */
    public final void Z(final long j3, final long j10, final long j11, jg.o0 o0Var, final String str, boolean z10) {
        dk dkVar = this.Y;
        rj rjVar = dkVar.r;
        fi.x4 x4Var = dkVar.M;
        Locale locale = Locale.ENGLISH;
        final String str2 = j3 + j10 + j11 + o0Var.d + str;
        String str3 = this.J;
        final boolean z11 = str3 != null && str3.equals(str2);
        boolean z12 = !z11 && z10;
        this.E = o0Var;
        this.y = j3;
        this.F = j10;
        this.G = j11;
        xj xjVar = this.w;
        if (xjVar != null) {
            org.telegram.messenger.g0.r(xjVar);
        }
        zj zjVar = this.X;
        org.telegram.messenger.g0.r(zjVar);
        if (z11 && z10) {
            return;
        }
        ArrayList arrayList = this.N;
        ArrayList arrayList2 = this.M;
        ArrayList arrayList3 = this.O;
        if (z12) {
            arrayList3.clear();
            this.Q.clear();
            this.R.clear();
            this.T = true;
            x4Var.setVisibility(0);
            f();
            this.U++;
            if (rjVar.getPinnedHeader() != null) {
                rjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.T = true;
        f();
        if (!z11) {
            zjVar.run();
            x4Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i7 = 1 + this.U;
        this.U = i7;
        final org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.m10.t0);
        ?? r02 = new Runnable() { // from class: org.telegram.ui.Components.xj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                long j12;
                ArrayList arrayList4;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ArrayList arrayList5;
                long j13;
                final org.telegram.messenger.c cVar = a10;
                int i11 = cVar.a;
                final ck ckVar = ck.this;
                ArrayList arrayList6 = ckVar.O;
                final long j14 = j3;
                final String str4 = str;
                long j15 = j10;
                long j16 = j11;
                final boolean z13 = z11;
                if (j14 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = ckVar.E.e;
                    tL_messages_search.peer = org.telegram.messenger.np.s1(i11).j1(j14);
                    if (j15 > 0) {
                        tL_messages_search.min_date = (int) (j15 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_search.max_date = (int) (j16 / 1000);
                    }
                    if (z13 && str4.equals(ckVar.K) && !arrayList6.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.gj) i5.c.h(1, arrayList6)).e1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    j12 = j15;
                    arrayList5 = null;
                } else {
                    if (TextUtils.isEmpty(str4)) {
                        i10 = 20;
                        j12 = j15;
                        arrayList4 = null;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        i10 = 20;
                        j12 = j15;
                        org.telegram.messenger.vr.a0(i11).M0(0, str4, arrayList7, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i10;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = ckVar.E.e;
                    if (j12 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j12 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j16 / 1000);
                    }
                    if (z13 && str4.equals(ckVar.K) && !arrayList6.isEmpty()) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList6);
                        tL_messages_searchGlobal2.offset_id = gjVar.e1();
                        tL_messages_searchGlobal2.offset_rate = ckVar.H;
                        TLRPC.Peer peer = gjVar.k.peer_id;
                        long j17 = peer.channel_id;
                        if (j17 == 0) {
                            j17 = peer.chat_id;
                            if (j17 == 0) {
                                j13 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.np.s1(i11).j1(j13);
                            }
                        }
                        j13 = -j17;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.np.s1(i11).j1(j13);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    arrayList5 = arrayList4;
                }
                ckVar.K = str4;
                ckVar.J = str2;
                final ArrayList arrayList8 = new ArrayList();
                jg.q0.B1(ckVar.K, arrayList8);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final int i12 = i7;
                final long j18 = j12;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.ui.Components.yj
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        org.telegram.messenger.c cVar2 = cVar;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(cVar2.a, messages_messages.messages.get(i13), false, true);
                                gjVar2.K5(str5, true);
                                arrayList9.add(gjVar2);
                            }
                        }
                        org.telegram.messenger.g0.h3(new ki.d3(ck.this, i12, tL_error, tLObject, cVar2, z13, str5, arrayList9, j14, j18, arrayList5, arrayList8));
                    }
                });
            }
        };
        this.w = r02;
        org.telegram.messenger.g0.i3(r02, (!z11 || arrayList3.isEmpty()) ? 350L : 0L);
        dkVar.K.setViewType(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        boolean z11;
        AnimatorSet animatorSet;
        dk dkVar = this.Y;
        jg.q0 q0Var = dkVar.I;
        int i7 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList3 = this.S;
            if (i7 >= arrayList3.size()) {
                break;
            }
            if (((jg.o0) arrayList3.get(i7)).a()) {
                z12 = true;
            } else if (((jg.o0) arrayList3.get(i7)).d == 4) {
                z13 = true;
            } else if (((jg.o0) arrayList3.get(i7)).d == 6) {
                z14 = true;
            }
            i7++;
        }
        boolean z15 = ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? false : true;
        if ((z12 || z15 || !z10) && z15) {
            if (arrayList == null || arrayList.isEmpty() || z13) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z14) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null) {
                q0Var.D1(arrayList, arrayList2, false);
                z11 = true;
                if (!z11) {
                    q0Var.D1(null, null, false);
                }
                q0Var.setEnabled(z11);
                if (z11 || q0Var.getTag() == null) {
                    if (z11 && q0Var.getTag() == null) {
                        return;
                    }
                    q0Var.setTag(z11 ? 1 : null);
                    animatorSet = dkVar.J;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z11) {
                        q0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    dkVar.J = animatorSet2;
                    rj rjVar = dkVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(rjVar, (Property<rj, Float>) property, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(q0Var, (Property<jg.q0, Float>) property, !z11 ? 0.0f : -org.telegram.messenger.g0.L(44.0f)), ObjectAnimator.ofFloat(dkVar.K, (Property<pz, Float>) property, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(dkVar.M, (Property<fi.x4, Float>) property, z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f));
                    dkVar.J.addListener(new x5(this, 12));
                    dkVar.J.setInterpolator(er.g);
                    dkVar.J.setDuration(180L);
                    dkVar.J.start();
                }
                return;
            }
        }
        z11 = false;
        if (!z11) {
        }
        q0Var.setEnabled(z11);
        if (z11) {
        }
        if (z11) {
        }
        q0Var.setTag(z11 ? 1 : null);
        animatorSet = dkVar.J;
        if (animatorSet != null) {
        }
        if (z11) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        dkVar.J = animatorSet22;
        rj rjVar2 = dkVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(rjVar2, (Property<rj, Float>) property2, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(q0Var, (Property<jg.q0, Float>) property2, !z11 ? 0.0f : -org.telegram.messenger.g0.L(44.0f)), ObjectAnimator.ofFloat(dkVar.K, (Property<pz, Float>) property2, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(dkVar.M, (Property<fi.x4, Float>) property2, z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f));
        dkVar.J.addListener(new x5(this, 12));
        dkVar.J.setInterpolator(er.g);
        dkVar.J.setDuration(180L);
        dkVar.J.start();
    }

    @Override // org.telegram.ui.Components.pj0, v4.h0
    public final void f() {
        X(false);
        this.Y.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        View view;
        dk dkVar = this.Y;
        Context context = this.r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    pz pzVar = new pz(context, dkVar.a);
                    pzVar.setViewType(3);
                    pzVar.setIsSingleCell(true);
                    x3Var = pzVar;
                } else if (i7 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return i5.c.q(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(i7 == 1 ? 1 : 2, context, dkVar.a);
            g7Var.setDrawDownloadIcon(false);
            view = g7Var;
            return i5.c.q(view, view, -1, -2);
        }
        x3Var = new org.telegram.ui.Cells.x3(context, dkVar.a);
        view = x3Var;
        return i5.c.q(view, view, -1, -2);
    }
}
