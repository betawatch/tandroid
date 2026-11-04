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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tj extends oj0 {
    public kg.l0 E;
    public long F;
    public long G;
    public int H;
    public String J;
    public String K;
    public String L;
    public boolean T;
    public int U;
    public boolean W;
    public final /* synthetic */ uj Y;
    public final Context r;
    public pj w;
    public org.telegram.ui.lo x;
    public long y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.pz I = new org.telegram.ui.pz(0, 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final SparseArray P = new SparseArray();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public final ArrayList S = new ArrayList();
    public final g2.g V = new g2.g((int[]) null);
    public final mi.b0 X = new mi.b0(this, 26);

    public tj(uj ujVar, Context context) {
        this.Y = ujVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        return null;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int M(int i3) {
        if (i3 == 0) {
            return this.s.size();
        }
        int i10 = i3 - 1;
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

    @Override // org.telegram.ui.Components.oj0
    public final Object O(int i3, int i10) {
        ArrayList arrayList;
        if (i3 == 0) {
            if (i10 < this.s.size()) {
                return this.s.get(i10);
            }
            return null;
        }
        int i11 = i3 - 1;
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

    @Override // org.telegram.ui.Components.oj0
    public final int P(int i3, int i10) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == R() - 1) {
            return 3;
        }
        int i11 = i3 - 1;
        if (i11 < this.Q.size()) {
            return (!(i11 == 0 && this.s.isEmpty()) && i10 == 0) ? 0 : 4;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int R() {
        ArrayList arrayList = this.Q;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.W ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.oj0
    public final View T(int i3, View view) {
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (x3Var == null) {
            Context context = this.r;
            uj ujVar = this.Y;
            x3Var = new org.telegram.ui.Cells.x3(context, ujVar.a);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.e7, ujVar.a) & (-218103809));
        }
        if (i3 == 0 || (i3 == 1 && this.s.isEmpty())) {
            x3Var.setAlpha(0.0f);
            return x3Var;
        }
        int i10 = i3 - 1;
        ArrayList arrayList = this.Q;
        if (i10 < arrayList.size()) {
            x3Var.setAlpha(1.0f);
            if (((ArrayList) this.R.get((String) arrayList.get(i10))) != null) {
                x3Var.setText((i10 != 0 || this.s.isEmpty()) ? org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) r1.get(0)).k.date, false) : org.telegram.messenger.bd.M0(2131749543, null));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        int i11 = d1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void W(int i3, int i10, u4.d1 d1Var) {
        int i11 = i10;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 2 || i12 == 3) {
            return;
        }
        HashMap hashMap = this.R;
        ArrayList arrayList = this.Q;
        boolean z10 = false;
        if (i12 == 0) {
            int i13 = i3 - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i13))) == null) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText((i13 != 0 || this.s.isEmpty()) ? org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) r3.get(0)).k.date, false) : org.telegram.messenger.bd.M0(2131749543, null));
            return;
        }
        if (i12 == 1 || i12 == 4) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            if (i3 == 0) {
                oj ojVar = (oj) O(S(i11), Q(i11));
                int i14 = ojVar.a;
                if (i14 != 0) {
                    g7Var.d(ojVar.b, ojVar.c, null, null, i14, false);
                } else {
                    g7Var.d(ojVar.b, ojVar.c, ojVar.d.toUpperCase().substring(0, Math.min(ojVar.d.length(), 4)), ojVar.e, 0, false);
                }
                File file = ojVar.f;
                uj ujVar = this.Y;
                if (file != null) {
                    g7Var.b(ujVar.S.containsKey(file.toString()), !ujVar.V);
                    return;
                } else {
                    g7Var.b(false, !ujVar.V);
                    return;
                }
            }
            int i15 = i3 - 1;
            if (i15 != 0 || !this.s.isEmpty()) {
                i11--;
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
            if (arrayList2 == null) {
                return;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i11);
            boolean z11 = g7Var.getMessage() != null && g7Var.getMessage().f1() == ziVar.f1();
            if (i11 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.T)) {
                z10 = true;
            }
            g7Var.c(ziVar, z10);
            g7Var.getViewTreeObserver().addOnPreDrawListener(new sj(this, g7Var, ziVar, z11, 0));
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        uj ujVar = this.Y;
        nj njVar = ujVar.w;
        jj jjVar = ujVar.r;
        org.telegram.ui.lo loVar = this.x;
        if (loVar != null) {
            org.telegram.messenger.g0.r(loVar);
            this.x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (jjVar.getAdapter() != njVar) {
                jjVar.setAdapter(njVar);
            }
            f();
        } else {
            org.telegram.ui.lo loVar2 = new org.telegram.ui.lo(24, this, str);
            this.x = loVar2;
            org.telegram.messenger.g0.i3(loVar2, 300L);
        }
        if (ujVar.a0 || !njVar.f.isEmpty()) {
            return;
        }
        int i3 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i3 >= arrayList.size()) {
                Z(j11, j12, j13, kg.n0.k3[2], str, z10);
                return;
            }
            kg.l0 l0Var = (kg.l0) arrayList.get(i3);
            int i10 = l0Var.d;
            if (i10 == 4) {
                TLObject tLObject = l0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).id;
                }
                j11 = j10;
            } else if (i10 == 6) {
                kg.j0 j0Var = l0Var.g;
                j12 = j0Var.b;
                j13 = j0Var.c;
            }
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.pj] */
    public final void Z(final long j10, final long j11, final long j12, kg.l0 l0Var, final String str, boolean z10) {
        uj ujVar = this.Y;
        jj jjVar = ujVar.r;
        ei.f5 f5Var = ujVar.M;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + l0Var.d + str;
        String str3 = this.J;
        final boolean z11 = str3 != null && str3.equals(str2);
        boolean z12 = !z11 && z10;
        this.E = l0Var;
        this.y = j10;
        this.F = j11;
        this.G = j12;
        pj pjVar = this.w;
        if (pjVar != null) {
            org.telegram.messenger.g0.r(pjVar);
        }
        mi.b0 b0Var = this.X;
        org.telegram.messenger.g0.r(b0Var);
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
            f5Var.setVisibility(0);
            f();
            this.U++;
            if (jjVar.getPinnedHeader() != null) {
                jjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.T = true;
        f();
        if (!z11) {
            b0Var.run();
            f5Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i3 = 1 + this.U;
        this.U = i3;
        final org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.h10.t0);
        ?? r02 = new Runnable() { // from class: org.telegram.ui.Components.pj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                long j13;
                ArrayList arrayList4;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ArrayList arrayList5;
                long j14;
                final org.telegram.messenger.c cVar = a10;
                int i11 = cVar.a;
                final tj tjVar = tj.this;
                ArrayList arrayList6 = tjVar.O;
                final long j15 = j10;
                final String str4 = str;
                long j16 = j11;
                long j17 = j12;
                final boolean z13 = z11;
                if (j15 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = tjVar.E.e;
                    tL_messages_search.peer = org.telegram.messenger.hp.s1(i11).j1(j15);
                    if (j16 > 0) {
                        tL_messages_search.min_date = (int) (j16 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_search.max_date = (int) (j17 / 1000);
                    }
                    if (z13 && str4.equals(tjVar.K) && !arrayList6.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.zi) k2.p1.h(1, arrayList6)).f1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    j13 = j16;
                    arrayList5 = null;
                } else {
                    if (TextUtils.isEmpty(str4)) {
                        i10 = 20;
                        j13 = j16;
                        arrayList4 = null;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        i10 = 20;
                        j13 = j16;
                        org.telegram.messenger.qr.a0(i11).M0(0, str4, arrayList7, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i10;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = tjVar.E.e;
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j13 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j17 / 1000);
                    }
                    if (z13 && str4.equals(tjVar.K) && !arrayList6.isEmpty()) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList6);
                        tL_messages_searchGlobal2.offset_id = ziVar.f1();
                        tL_messages_searchGlobal2.offset_rate = tjVar.H;
                        TLRPC.Peer peer = ziVar.k.peer_id;
                        long j18 = peer.channel_id;
                        if (j18 == 0) {
                            j18 = peer.chat_id;
                            if (j18 == 0) {
                                j14 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.hp.s1(i11).j1(j14);
                            }
                        }
                        j14 = -j18;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.hp.s1(i11).j1(j14);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    arrayList5 = arrayList4;
                }
                tjVar.K = str4;
                tjVar.J = str2;
                final ArrayList arrayList8 = new ArrayList();
                kg.n0.B1(tjVar.K, arrayList8);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final int i12 = i3;
                final long j19 = j13;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.ui.Components.qj
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        org.telegram.messenger.c cVar2 = cVar;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(cVar2.a, messages_messages.messages.get(i13), false, true);
                                ziVar2.L5(str5, true);
                                arrayList9.add(ziVar2);
                            }
                        }
                        org.telegram.messenger.g0.h3(new ii.g3(tj.this, i12, tL_error, tLObject, cVar2, z13, str5, arrayList9, j15, j19, arrayList5, arrayList8));
                    }
                });
            }
        };
        this.w = r02;
        org.telegram.messenger.g0.i3(r02, (!z11 || arrayList3.isEmpty()) ? 350L : 0L);
        ujVar.K.setViewType(3);
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
        uj ujVar = this.Y;
        kg.n0 n0Var = ujVar.I;
        int i3 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList3 = this.S;
            if (i3 >= arrayList3.size()) {
                break;
            }
            if (((kg.l0) arrayList3.get(i3)).a()) {
                z12 = true;
            } else if (((kg.l0) arrayList3.get(i3)).d == 4) {
                z13 = true;
            } else if (((kg.l0) arrayList3.get(i3)).d == 6) {
                z14 = true;
            }
            i3++;
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
                n0Var.D1(arrayList, arrayList2, false);
                z11 = true;
                if (!z11) {
                    n0Var.D1(null, null, false);
                }
                n0Var.setEnabled(z11);
                if (z11 || n0Var.getTag() == null) {
                    if (z11 && n0Var.getTag() == null) {
                        return;
                    }
                    n0Var.setTag(z11 ? 1 : null);
                    animatorSet = ujVar.J;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z11) {
                        n0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ujVar.J = animatorSet2;
                    jj jjVar = ujVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(jjVar, (Property<jj, Float>) property, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(n0Var, (Property<kg.n0, Float>) property, !z11 ? 0.0f : -org.telegram.messenger.g0.L(44.0f)), ObjectAnimator.ofFloat(ujVar.K, (Property<iz, Float>) property, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(ujVar.M, (Property<ei.f5, Float>) property, z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f));
                    ujVar.J.addListener(new x5(this, 12));
                    ujVar.J.setInterpolator(xq.g);
                    ujVar.J.setDuration(180L);
                    ujVar.J.start();
                }
                return;
            }
        }
        z11 = false;
        if (!z11) {
        }
        n0Var.setEnabled(z11);
        if (z11) {
        }
        if (z11) {
        }
        n0Var.setTag(z11 ? 1 : null);
        animatorSet = ujVar.J;
        if (animatorSet != null) {
        }
        if (z11) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        ujVar.J = animatorSet22;
        jj jjVar2 = ujVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(jjVar2, (Property<jj, Float>) property2, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(n0Var, (Property<kg.n0, Float>) property2, !z11 ? 0.0f : -org.telegram.messenger.g0.L(44.0f)), ObjectAnimator.ofFloat(ujVar.K, (Property<iz, Float>) property2, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(ujVar.M, (Property<ei.f5, Float>) property2, z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f));
        ujVar.J.addListener(new x5(this, 12));
        ujVar.J.setInterpolator(xq.g);
        ujVar.J.setDuration(180L);
        ujVar.J.start();
    }

    @Override // org.telegram.ui.Components.oj0, u4.h0
    public final void f() {
        X(false);
        this.Y.X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.x3 x3Var;
        View view;
        uj ujVar = this.Y;
        Context context = this.r;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    iz izVar = new iz(context, ujVar.a);
                    izVar.setViewType(3);
                    izVar.setIsSingleCell(true);
                    x3Var = izVar;
                } else if (i3 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return k2.p1.p(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(i3 == 1 ? 1 : 2, context, ujVar.a);
            g7Var.setDrawDownloadIcon(false);
            view = g7Var;
            return k2.p1.p(view, view, -1, -2);
        }
        x3Var = new org.telegram.ui.Cells.x3(context, ujVar.a);
        view = x3Var;
        return k2.p1.p(view, view, -1, -2);
    }
}
