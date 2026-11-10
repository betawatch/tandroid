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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tj extends kj0 {
    public jg.o0 D;
    public long E;
    public long F;
    public int G;
    public String I;
    public String J;
    public String K;
    public boolean S;
    public int T;
    public boolean V;
    public final /* synthetic */ uj X;
    public final Context r;
    public pj w;
    public org.telegram.ui.fq x;
    public long y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.uz H = new org.telegram.ui.uz(0, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final SparseArray O = new SparseArray();
    public final ArrayList P = new ArrayList();
    public final HashMap Q = new HashMap();
    public final ArrayList R = new ArrayList();
    public final h2.f U = new h2.f((int[]) null);
    public final m.f3 W = new m.f3(this, 27);

    public tj(uj ujVar, Context context) {
        this.X = ujVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int M(int i7) {
        if (i7 == 0) {
            return this.s.size();
        }
        int i10 = i7 - 1;
        ArrayList arrayList = this.P;
        int i11 = 1;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.Q.get(arrayList.get(i10));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i10 == 0 && this.s.isEmpty()) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override // org.telegram.ui.Components.kj0
    public final Object O(int i7, int i10) {
        ArrayList arrayList;
        if (i7 == 0) {
            if (i10 < this.s.size()) {
                return this.s.get(i10);
            }
            return null;
        }
        int i11 = i7 - 1;
        ArrayList arrayList2 = this.P;
        if (i11 >= arrayList2.size() || (arrayList = (ArrayList) this.Q.get(arrayList2.get(i11))) == null) {
            return null;
        }
        int i12 = i10 - ((i11 == 0 && this.s.isEmpty()) ? 0 : 1);
        if (i12 < 0 || i12 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i12);
    }

    @Override // org.telegram.ui.Components.kj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == R() - 1) {
            return 3;
        }
        int i11 = i7 - 1;
        if (i11 < this.P.size()) {
            return (!(i11 == 0 && this.s.isEmpty()) && i10 == 0) ? 0 : 4;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int R() {
        ArrayList arrayList = this.P;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.V ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.kj0
    public final View T(int i7, View view) {
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (x3Var == null) {
            Context context = this.r;
            uj ujVar = this.X;
            x3Var = new org.telegram.ui.Cells.x3(context, ujVar.a);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.e7, ujVar.a) & (-218103809));
        }
        if (i7 == 0 || (i7 == 1 && this.s.isEmpty())) {
            x3Var.setAlpha(0.0f);
            return x3Var;
        }
        int i10 = i7 - 1;
        ArrayList arrayList = this.P;
        if (i10 < arrayList.size()) {
            x3Var.setAlpha(1.0f);
            if (((ArrayList) this.Q.get((String) arrayList.get(i10))) != null) {
                x3Var.setText((i10 != 0 || this.s.isEmpty()) ? org.telegram.messenger.id.e0(((org.telegram.messenger.ij) r1.get(0)).k.date, false) : org.telegram.messenger.id.M0(2131749535, null));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        int i11 = d1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        int i11 = i10;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 2 || i12 == 3) {
            return;
        }
        HashMap hashMap = this.Q;
        ArrayList arrayList = this.P;
        boolean z9 = false;
        if (i12 == 0) {
            int i13 = i7 - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i13))) == null) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText((i13 != 0 || this.s.isEmpty()) ? org.telegram.messenger.id.e0(((org.telegram.messenger.ij) r3.get(0)).k.date, false) : org.telegram.messenger.id.M0(2131749535, null));
            return;
        }
        if (i12 == 1 || i12 == 4) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            if (i7 == 0) {
                oj ojVar = (oj) O(S(i11), Q(i11));
                int i14 = ojVar.a;
                if (i14 != 0) {
                    h7Var.d(ojVar.b, ojVar.c, null, null, i14, false);
                } else {
                    h7Var.d(ojVar.b, ojVar.c, ojVar.d.toUpperCase().substring(0, Math.min(ojVar.d.length(), 4)), ojVar.e, 0, false);
                }
                File file = ojVar.f;
                uj ujVar = this.X;
                if (file != null) {
                    h7Var.b(ujVar.R.containsKey(file.toString()), !ujVar.U);
                    return;
                } else {
                    h7Var.b(false, !ujVar.U);
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
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i11);
            boolean z10 = h7Var.getMessage() != null && h7Var.getMessage().e1() == ijVar.e1();
            if (i11 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.S)) {
                z9 = true;
            }
            h7Var.c(ijVar, z9);
            h7Var.getViewTreeObserver().addOnPreDrawListener(new sj(this, h7Var, ijVar, z10, 0));
        }
    }

    public final void Y(String str, boolean z9) {
        long j3;
        uj ujVar = this.X;
        nj njVar = ujVar.w;
        jj jjVar = ujVar.r;
        org.telegram.ui.fq fqVar = this.x;
        if (fqVar != null) {
            org.telegram.messenger.g0.r(fqVar);
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
            org.telegram.ui.fq fqVar2 = new org.telegram.ui.fq(20, this, str);
            this.x = fqVar2;
            org.telegram.messenger.g0.i3(fqVar2, 300L);
        }
        if (ujVar.W || !njVar.f.isEmpty()) {
            return;
        }
        int i7 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i7 >= arrayList.size()) {
                Z(j10, j11, j12, jg.q0.j3[2], str, z9);
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

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.pj] */
    public final void Z(final long j3, final long j10, final long j11, jg.o0 o0Var, final String str, boolean z9) {
        uj ujVar = this.X;
        jj jjVar = ujVar.r;
        di.g5 g5Var = ujVar.L;
        Locale locale = Locale.ENGLISH;
        final String str2 = j3 + j10 + j11 + o0Var.d + str;
        String str3 = this.I;
        final boolean z10 = str3 != null && str3.equals(str2);
        boolean z11 = !z10 && z9;
        this.D = o0Var;
        this.y = j3;
        this.E = j10;
        this.F = j11;
        pj pjVar = this.w;
        if (pjVar != null) {
            org.telegram.messenger.g0.r(pjVar);
        }
        m.f3 f3Var = this.W;
        org.telegram.messenger.g0.r(f3Var);
        if (z10 && z9) {
            return;
        }
        ArrayList arrayList = this.M;
        ArrayList arrayList2 = this.L;
        ArrayList arrayList3 = this.N;
        if (z11) {
            arrayList3.clear();
            this.P.clear();
            this.Q.clear();
            this.S = true;
            g5Var.setVisibility(0);
            f();
            this.T++;
            if (jjVar.getPinnedHeader() != null) {
                jjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.S = true;
        f();
        if (!z10) {
            f3Var.run();
            g5Var.e(true, !z9);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i7 = 1 + this.T;
        this.T = i7;
        final org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.p10.s0);
        ?? r02 = new Runnable() { // from class: org.telegram.ui.Components.pj
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
                final tj tjVar = tj.this;
                ArrayList arrayList6 = tjVar.N;
                final long j14 = j3;
                final String str4 = str;
                long j15 = j10;
                long j16 = j11;
                final boolean z12 = z10;
                if (j14 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = tjVar.D.e;
                    tL_messages_search.peer = org.telegram.messenger.qp.s1(i11).j1(j14);
                    if (j15 > 0) {
                        tL_messages_search.min_date = (int) (j15 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_search.max_date = (int) (j16 / 1000);
                    }
                    if (z12 && str4.equals(tjVar.J) && !arrayList6.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList6)).e1();
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
                        org.telegram.messenger.yr.a0(i11).M0(0, str4, arrayList7, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i10;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = tjVar.D.e;
                    if (j12 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j12 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j16 / 1000);
                    }
                    if (z12 && str4.equals(tjVar.J) && !arrayList6.isEmpty()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList6);
                        tL_messages_searchGlobal2.offset_id = ijVar.e1();
                        tL_messages_searchGlobal2.offset_rate = tjVar.G;
                        TLRPC.Peer peer = ijVar.k.peer_id;
                        long j17 = peer.channel_id;
                        if (j17 == 0) {
                            j17 = peer.chat_id;
                            if (j17 == 0) {
                                j13 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.qp.s1(i11).j1(j13);
                            }
                        }
                        j13 = -j17;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.qp.s1(i11).j1(j13);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    arrayList5 = arrayList4;
                }
                tjVar.J = str4;
                tjVar.I = str2;
                final ArrayList arrayList8 = new ArrayList();
                jg.q0.B1(tjVar.J, arrayList8);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final int i12 = i7;
                final long j18 = j12;
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
                                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(cVar2.a, messages_messages.messages.get(i13), false, true);
                                ijVar2.K5(str5, true);
                                arrayList9.add(ijVar2);
                            }
                        }
                        org.telegram.messenger.g0.h3(new hi.g3(tj.this, i12, tL_error, tLObject, cVar2, z12, str5, arrayList9, j14, j18, arrayList5, arrayList8));
                    }
                });
            }
        };
        this.w = r02;
        org.telegram.messenger.g0.i3(r02, (!z10 || arrayList3.isEmpty()) ? 350L : 0L);
        ujVar.J.setViewType(3);
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
    public final void a0(ArrayList arrayList, ArrayList arrayList2, boolean z9) {
        boolean z10;
        AnimatorSet animatorSet;
        uj ujVar = this.X;
        jg.q0 q0Var = ujVar.H;
        int i7 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            ArrayList arrayList3 = this.R;
            if (i7 >= arrayList3.size()) {
                break;
            }
            if (((jg.o0) arrayList3.get(i7)).a()) {
                z11 = true;
            } else if (((jg.o0) arrayList3.get(i7)).d == 4) {
                z12 = true;
            } else if (((jg.o0) arrayList3.get(i7)).d == 6) {
                z13 = true;
            }
            i7++;
        }
        boolean z14 = ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? false : true;
        if ((z11 || z14 || !z9) && z14) {
            if (arrayList == null || arrayList.isEmpty() || z12) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z13) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null) {
                q0Var.D1(arrayList, arrayList2, false);
                z10 = true;
                if (!z10) {
                    q0Var.D1(null, null, false);
                }
                q0Var.setEnabled(z10);
                if (z10 || q0Var.getTag() == null) {
                    if (z10 && q0Var.getTag() == null) {
                        return;
                    }
                    q0Var.setTag(z10 ? 1 : null);
                    animatorSet = ujVar.I;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z10) {
                        q0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ujVar.I = animatorSet2;
                    jj jjVar = ujVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(jjVar, (Property<jj, Float>) property, !z10 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(q0Var, (Property<jg.q0, Float>) property, !z10 ? 0.0f : -org.telegram.messenger.g0.L(44.0f)), ObjectAnimator.ofFloat(ujVar.J, (Property<lz, Float>) property, !z10 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(ujVar.L, (Property<di.g5, Float>) property, z10 ? org.telegram.messenger.g0.L(44.0f) : 0.0f));
                    ujVar.I.addListener(new y5(this, 12));
                    ujVar.I.setInterpolator(wq.g);
                    ujVar.I.setDuration(180L);
                    ujVar.I.start();
                }
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
        q0Var.setEnabled(z10);
        if (z10) {
        }
        if (z10) {
        }
        q0Var.setTag(z10 ? 1 : null);
        animatorSet = ujVar.I;
        if (animatorSet != null) {
        }
        if (z10) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        ujVar.I = animatorSet22;
        jj jjVar2 = ujVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(jjVar2, (Property<jj, Float>) property2, !z10 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(q0Var, (Property<jg.q0, Float>) property2, !z10 ? 0.0f : -org.telegram.messenger.g0.L(44.0f)), ObjectAnimator.ofFloat(ujVar.J, (Property<lz, Float>) property2, !z10 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(ujVar.L, (Property<di.g5, Float>) property2, z10 ? org.telegram.messenger.g0.L(44.0f) : 0.0f));
        ujVar.I.addListener(new y5(this, 12));
        ujVar.I.setInterpolator(wq.g);
        ujVar.I.setDuration(180L);
        ujVar.I.start();
    }

    @Override // org.telegram.ui.Components.kj0, v4.g0
    public final void f() {
        X(false);
        this.X.X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        View view;
        uj ujVar = this.X;
        Context context = this.r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    lz lzVar = new lz(context, ujVar.a);
                    lzVar.setViewType(3);
                    lzVar.setIsSingleCell(true);
                    x3Var = lzVar;
                } else if (i7 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return jg.g.r(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(i7 == 1 ? 1 : 2, context, ujVar.a);
            h7Var.setDrawDownloadIcon(false);
            view = h7Var;
            return jg.g.r(view, view, -1, -2);
        }
        x3Var = new org.telegram.ui.Cells.x3(context, ujVar.a);
        view = x3Var;
        return jg.g.r(view, view, -1, -2);
    }
}
