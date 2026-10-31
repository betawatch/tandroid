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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wj extends ok0 {
    public zf.e0 D;
    public long E;
    public long F;
    public int G;
    public String I;
    public String J;
    public String K;
    public boolean S;
    public int T;
    public boolean V;
    public final /* synthetic */ xj X;
    public final Context r;
    public rj w;
    public cd x;
    public long y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.s00 H = new org.telegram.ui.s00(0, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final SparseArray O = new SparseArray();
    public final ArrayList P = new ArrayList();
    public final HashMap Q = new HashMap();
    public final ArrayList R = new ArrayList();
    public final e2.f U = new e2.f(null);
    public final mg.c2 W = new mg.c2(this, 25);

    public wj(xj xjVar, Context context) {
        this.X = xjVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int M(int i10) {
        if (i10 == 0) {
            return this.s.size();
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.P;
        int i12 = 1;
        if (i11 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.Q.get(arrayList.get(i11));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i11 == 0 && this.s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override // org.telegram.ui.Components.ok0
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        if (i10 == 0) {
            if (i11 < this.s.size()) {
                return this.s.get(i11);
            }
            return null;
        }
        int i12 = i10 - 1;
        ArrayList arrayList2 = this.P;
        if (i12 >= arrayList2.size() || (arrayList = (ArrayList) this.Q.get(arrayList2.get(i12))) == null) {
            return null;
        }
        int i13 = i11 - ((i12 == 0 && this.s.isEmpty()) ? 0 : 1);
        if (i13 < 0 || i13 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i13);
    }

    @Override // org.telegram.ui.Components.ok0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == R() - 1) {
            return 3;
        }
        int i12 = i10 - 1;
        if (i12 < this.P.size()) {
            return (!(i12 == 0 && this.s.isEmpty()) && i11 == 0) ? 0 : 4;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int R() {
        ArrayList arrayList = this.P;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.V ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.ok0
    public final View T(int i10, View view) {
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
        if (z3Var == null) {
            Context context = this.r;
            xj xjVar = this.X;
            z3Var = new org.telegram.ui.Cells.z3(context, xjVar.a);
            z3Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.e7, xjVar.a) & (-218103809));
        }
        if (i10 == 0 || (i10 == 1 && this.s.isEmpty())) {
            z3Var.setAlpha(0.0f);
            return z3Var;
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.P;
        if (i11 < arrayList.size()) {
            z3Var.setAlpha(1.0f);
            if (((ArrayList) this.Q.get((String) arrayList.get(i11))) != null) {
                z3Var.setText((i11 != 0 || this.s.isEmpty()) ? org.telegram.messenger.cd.e0(((org.telegram.messenger.jj) r1.get(0)).k.date, false) : org.telegram.messenger.cd.L0(2131749544, null));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        int i12 = c1Var.f;
        return i12 == 1 || i12 == 4;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        int i12 = i11;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 2 || i13 == 3) {
            return;
        }
        HashMap hashMap = this.Q;
        ArrayList arrayList = this.P;
        boolean z10 = false;
        if (i13 == 0) {
            int i14 = i10 - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i14))) == null) {
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText((i14 != 0 || this.s.isEmpty()) ? org.telegram.messenger.cd.e0(((org.telegram.messenger.jj) r3.get(0)).k.date, false) : org.telegram.messenger.cd.L0(2131749544, null));
            return;
        }
        if (i13 == 1 || i13 == 4) {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            if (i10 == 0) {
                qj qjVar = (qj) O(S(i12), Q(i12));
                int i15 = qjVar.a;
                if (i15 != 0) {
                    l7Var.d(qjVar.b, qjVar.c, null, null, i15, false);
                } else {
                    l7Var.d(qjVar.b, qjVar.c, qjVar.d.toUpperCase().substring(0, Math.min(qjVar.d.length(), 4)), qjVar.e, 0, false);
                }
                File file = qjVar.f;
                xj xjVar = this.X;
                if (file != null) {
                    l7Var.b(xjVar.R.containsKey(file.toString()), !xjVar.U);
                    return;
                } else {
                    l7Var.b(false, !xjVar.U);
                    return;
                }
            }
            int i16 = i10 - 1;
            if (i16 != 0 || !this.s.isEmpty()) {
                i12--;
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i16));
            if (arrayList2 == null) {
                return;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i12);
            boolean z11 = l7Var.getMessage() != null && l7Var.getMessage().f1() == jjVar.f1();
            if (i12 != arrayList2.size() - 1 || (i16 == arrayList.size() - 1 && this.S)) {
                z10 = true;
            }
            l7Var.c(jjVar, z10);
            l7Var.getViewTreeObserver().addOnPreDrawListener(new vj(this, l7Var, jjVar, z11, 0));
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        xj xjVar = this.X;
        pj pjVar = xjVar.w;
        lj ljVar = xjVar.r;
        cd cdVar = this.x;
        if (cdVar != null) {
            org.telegram.messenger.i0.r(cdVar);
            this.x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (ljVar.getAdapter() != pjVar) {
                ljVar.setAdapter(pjVar);
            }
            f();
        } else {
            cd cdVar2 = new cd(13, this, str);
            this.x = cdVar2;
            org.telegram.messenger.i0.h3(cdVar2, 300L);
        }
        if (xjVar.W || !pjVar.f.isEmpty()) {
            return;
        }
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i10 >= arrayList.size()) {
                Z(j11, j12, j13, zf.g0.j3[2], str, z10);
                return;
            }
            zf.e0 e0Var = (zf.e0) arrayList.get(i10);
            int i11 = e0Var.d;
            if (i11 == 4) {
                TLObject tLObject = e0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).id;
                }
                j11 = j10;
            } else if (i11 == 6) {
                zf.c0 c0Var = e0Var.g;
                j12 = c0Var.b;
                j13 = c0Var.c;
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.rj] */
    public final void Z(final long j10, final long j11, final long j12, zf.e0 e0Var, final String str, boolean z10) {
        xj xjVar = this.X;
        lj ljVar = xjVar.r;
        kj kjVar = xjVar.L;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + e0Var.d + str;
        String str3 = this.I;
        final boolean z11 = str3 != null && str3.equals(str2);
        boolean z12 = !z11 && z10;
        this.D = e0Var;
        this.y = j10;
        this.E = j11;
        this.F = j12;
        rj rjVar = this.w;
        if (rjVar != null) {
            org.telegram.messenger.i0.r(rjVar);
        }
        mg.c2 c2Var = this.W;
        org.telegram.messenger.i0.r(c2Var);
        if (z11 && z10) {
            return;
        }
        ArrayList arrayList = this.M;
        ArrayList arrayList2 = this.L;
        ArrayList arrayList3 = this.N;
        if (z12) {
            arrayList3.clear();
            this.P.clear();
            this.Q.clear();
            this.S = true;
            kjVar.setVisibility(0);
            f();
            this.T++;
            if (ljVar.getPinnedHeader() != null) {
                ljVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.S = true;
        f();
        if (!z11) {
            c2Var.run();
            kjVar.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i10 = 1 + this.T;
        this.T = i10;
        final org.telegram.messenger.c a2 = org.telegram.messenger.c.a(org.telegram.messenger.d20.s0);
        ?? r02 = new Runnable() { // from class: org.telegram.ui.Components.rj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                long j13;
                ArrayList arrayList4;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ArrayList arrayList5;
                long j14;
                final org.telegram.messenger.c cVar = a2;
                int i12 = cVar.a;
                final wj wjVar = wj.this;
                ArrayList arrayList6 = wjVar.N;
                final long j15 = j10;
                final String str4 = str;
                long j16 = j11;
                long j17 = j12;
                final boolean z13 = z11;
                if (j15 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = wjVar.D.e;
                    tL_messages_search.peer = org.telegram.messenger.vp.r1(i12).i1(j15);
                    if (j16 > 0) {
                        tL_messages_search.min_date = (int) (j16 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_search.max_date = (int) (j17 / 1000);
                    }
                    if (z13 && str4.equals(wjVar.J) && !arrayList6.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.jj) i0.a.g(1, arrayList6)).f1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    j13 = j16;
                    arrayList5 = null;
                } else {
                    if (TextUtils.isEmpty(str4)) {
                        i11 = 20;
                        j13 = j16;
                        arrayList4 = null;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        i11 = 20;
                        j13 = j16;
                        org.telegram.messenger.hs.a0(i12).M0(0, str4, arrayList7, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i11;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = wjVar.D.e;
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j13 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j17 / 1000);
                    }
                    if (z13 && str4.equals(wjVar.J) && !arrayList6.isEmpty()) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList6);
                        tL_messages_searchGlobal2.offset_id = jjVar.f1();
                        tL_messages_searchGlobal2.offset_rate = wjVar.G;
                        TLRPC.Peer peer = jjVar.k.peer_id;
                        long j18 = peer.channel_id;
                        if (j18 == 0) {
                            j18 = peer.chat_id;
                            if (j18 == 0) {
                                j14 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.vp.r1(i12).i1(j14);
                            }
                        }
                        j14 = -j18;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.vp.r1(i12).i1(j14);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    arrayList5 = arrayList4;
                }
                wjVar.J = str4;
                wjVar.I = str2;
                final ArrayList arrayList8 = new ArrayList();
                zf.g0.B1(wjVar.J, arrayList8);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                final int i13 = i10;
                final long j19 = j13;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.ui.Components.sj
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        org.telegram.messenger.c cVar2 = cVar;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(cVar2.a, messages_messages.messages.get(i14), false, true);
                                jjVar2.J5(str5, true);
                                arrayList9.add(jjVar2);
                            }
                        }
                        org.telegram.messenger.i0.g3(new tj(wj.this, i13, tL_error, tLObject, cVar2, z13, str5, arrayList9, j15, j19, arrayList5, arrayList8));
                    }
                });
            }
        };
        this.w = r02;
        org.telegram.messenger.i0.h3(r02, (!z11 || arrayList3.isEmpty()) ? 350L : 0L);
        xjVar.J.setViewType(3);
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
        xj xjVar = this.X;
        zf.g0 g0Var = xjVar.H;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList3 = this.R;
            if (i10 >= arrayList3.size()) {
                break;
            }
            if (((zf.e0) arrayList3.get(i10)).a()) {
                z12 = true;
            } else if (((zf.e0) arrayList3.get(i10)).d == 4) {
                z13 = true;
            } else if (((zf.e0) arrayList3.get(i10)).d == 6) {
                z14 = true;
            }
            i10++;
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
                g0Var.D1(arrayList, arrayList2, false);
                z11 = true;
                if (!z11) {
                    g0Var.D1(null, null, false);
                }
                g0Var.setEnabled(z11);
                if (z11 || g0Var.getTag() == null) {
                    if (z11 && g0Var.getTag() == null) {
                        return;
                    }
                    g0Var.setTag(z11 ? 1 : null);
                    animatorSet = xjVar.I;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z11) {
                        g0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    xjVar.I = animatorSet2;
                    lj ljVar = xjVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ljVar, (Property<lj, Float>) property, !z11 ? org.telegram.messenger.i0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(g0Var, (Property<zf.g0, Float>) property, !z11 ? 0.0f : -org.telegram.messenger.i0.L(44.0f)), ObjectAnimator.ofFloat(xjVar.J, (Property<zz, Float>) property, !z11 ? org.telegram.messenger.i0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(xjVar.L, (Property<kj, Float>) property, z11 ? org.telegram.messenger.i0.L(44.0f) : 0.0f));
                    xjVar.I.addListener(new w5(this, 12));
                    xjVar.I.setInterpolator(gr.g);
                    xjVar.I.setDuration(180L);
                    xjVar.I.start();
                }
                return;
            }
        }
        z11 = false;
        if (!z11) {
        }
        g0Var.setEnabled(z11);
        if (z11) {
        }
        if (z11) {
        }
        g0Var.setTag(z11 ? 1 : null);
        animatorSet = xjVar.I;
        if (animatorSet != null) {
        }
        if (z11) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        xjVar.I = animatorSet22;
        lj ljVar2 = xjVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(ljVar2, (Property<lj, Float>) property2, !z11 ? org.telegram.messenger.i0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(g0Var, (Property<zf.g0, Float>) property2, !z11 ? 0.0f : -org.telegram.messenger.i0.L(44.0f)), ObjectAnimator.ofFloat(xjVar.J, (Property<zz, Float>) property2, !z11 ? org.telegram.messenger.i0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(xjVar.L, (Property<kj, Float>) property2, z11 ? org.telegram.messenger.i0.L(44.0f) : 0.0f));
        xjVar.I.addListener(new w5(this, 12));
        xjVar.I.setInterpolator(gr.g);
        xjVar.I.setDuration(180L);
        xjVar.I.start();
    }

    @Override // org.telegram.ui.Components.ok0, s4.g0
    public final void f() {
        X(false);
        this.X.W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        View view;
        xj xjVar = this.X;
        Context context = this.r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    zz zzVar = new zz(context, xjVar.a);
                    zzVar.setViewType(3);
                    zzVar.setIsSingleCell(true);
                    z3Var = zzVar;
                } else if (i10 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return sc.e.o(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(i10 == 1 ? 1 : 2, context, xjVar.a);
            l7Var.setDrawDownloadIcon(false);
            view = l7Var;
            return sc.e.o(view, view, -1, -2);
        }
        z3Var = new org.telegram.ui.Cells.z3(context, xjVar.a);
        view = z3Var;
        return sc.e.o(view, view, -1, -2);
    }
}
