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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class lk extends zj0 {
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
    public final /* synthetic */ mk Y;
    public final Context r;
    public gk w;
    public mf x;
    public long y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.vz I = new org.telegram.ui.vz(0, 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final SparseArray P = new SparseArray();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public final ArrayList S = new ArrayList();
    public final h2.f V = new h2.f((int[]) null);
    public final ik X = new ik(this, 0);

    public lk(mk mkVar, Context context) {
        this.Y = mkVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.zj0
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

    @Override // org.telegram.ui.Components.zj0
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

    @Override // org.telegram.ui.Components.zj0
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

    @Override // org.telegram.ui.Components.zj0
    public final int R() {
        ArrayList arrayList = this.Q;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.W ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.zj0
    public final View T(int i7, View view) {
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
        if (y3Var == null) {
            Context context = this.r;
            mk mkVar = this.Y;
            y3Var = new org.telegram.ui.Cells.y3(context, mkVar.a);
            y3Var.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.e7, mkVar.a) & (-218103809));
        }
        if (i7 == 0 || (i7 == 1 && this.s.isEmpty())) {
            y3Var.setAlpha(0.0f);
            return y3Var;
        }
        int i10 = i7 - 1;
        ArrayList arrayList = this.Q;
        if (i10 < arrayList.size()) {
            y3Var.setAlpha(1.0f);
            if (((ArrayList) this.R.get((String) arrayList.get(i10))) != null) {
                y3Var.setText((i10 != 0 || this.s.isEmpty()) ? org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) r1.get(0)).k.date, false) : org.telegram.messenger.hd.N0(2131749359, null));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.zj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        int i11 = f1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // org.telegram.ui.Components.zj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        int i11 = i10;
        int i12 = f1Var.f;
        View view = f1Var.a;
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
            ((org.telegram.ui.Cells.y3) view).setText((i13 != 0 || this.s.isEmpty()) ? org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) r3.get(0)).k.date, false) : org.telegram.messenger.hd.N0(2131749359, null));
            return;
        }
        if (i12 == 1 || i12 == 4) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            if (i7 == 0) {
                fk fkVar = (fk) O(S(i11), Q(i11));
                int i14 = fkVar.a;
                if (i14 != 0) {
                    i7Var.d(fkVar.b, fkVar.c, null, null, i14, false);
                } else {
                    i7Var.d(fkVar.b, fkVar.c, fkVar.d.toUpperCase().substring(0, Math.min(fkVar.d.length(), 4)), fkVar.e, 0, false);
                }
                File file = fkVar.f;
                mk mkVar = this.Y;
                if (file != null) {
                    i7Var.b(mkVar.S.containsKey(file.toString()), !mkVar.V);
                    return;
                } else {
                    i7Var.b(false, !mkVar.V);
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
            boolean z11 = i7Var.getMessage() != null && i7Var.getMessage().e1() == gjVar.e1();
            if (i11 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.T)) {
                z10 = true;
            }
            i7Var.c(gjVar, z10);
            i7Var.getViewTreeObserver().addOnPreDrawListener(new kk(this, i7Var, gjVar, z11, 0));
        }
    }

    public final void Y(String str, boolean z10) {
        long j3;
        mk mkVar = this.Y;
        ek ekVar = mkVar.w;
        ak akVar = mkVar.r;
        mf mfVar = this.x;
        if (mfVar != null) {
            org.telegram.messenger.g0.r(mfVar);
            this.x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (akVar.getAdapter() != ekVar) {
                akVar.setAdapter(ekVar);
            }
            f();
        } else {
            mf mfVar2 = new mf(11, this, str);
            this.x = mfVar2;
            org.telegram.messenger.g0.h3(mfVar2, 300L);
        }
        if (mkVar.a0 || !ekVar.f.isEmpty()) {
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

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.gk] */
    public final void Z(final long j3, final long j10, final long j11, jg.o0 o0Var, final String str, boolean z10) {
        mk mkVar = this.Y;
        ak akVar = mkVar.r;
        fi.w4 w4Var = mkVar.M;
        Locale locale = Locale.ENGLISH;
        final String str2 = j3 + j10 + j11 + o0Var.d + str;
        String str3 = this.J;
        final boolean z11 = str3 != null && str3.equals(str2);
        boolean z12 = !z11 && z10;
        this.E = o0Var;
        this.y = j3;
        this.F = j10;
        this.G = j11;
        gk gkVar = this.w;
        if (gkVar != null) {
            org.telegram.messenger.g0.r(gkVar);
        }
        ik ikVar = this.X;
        org.telegram.messenger.g0.r(ikVar);
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
            w4Var.setVisibility(0);
            f();
            this.U++;
            if (akVar.getPinnedHeader() != null) {
                akVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.T = true;
        f();
        if (!z11) {
            ikVar.run();
            w4Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i7 = 1 + this.U;
        this.U = i7;
        final org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.k10.t0);
        ?? r02 = new Runnable() { // from class: org.telegram.ui.Components.gk
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
                final lk lkVar = lk.this;
                ArrayList arrayList6 = lkVar.O;
                final long j14 = j3;
                final String str4 = str;
                long j15 = j10;
                long j16 = j11;
                final boolean z13 = z11;
                if (j14 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = lkVar.E.e;
                    tL_messages_search.peer = org.telegram.messenger.np.u1(i11).l1(j14);
                    if (j15 > 0) {
                        tL_messages_search.min_date = (int) (j15 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_search.max_date = (int) (j16 / 1000);
                    }
                    if (z13 && str4.equals(lkVar.K) && !arrayList6.isEmpty()) {
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
                        org.telegram.messenger.ur.a0(i11).M0(0, str4, arrayList7, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i10;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = lkVar.E.e;
                    if (j12 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j12 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j16 / 1000);
                    }
                    if (z13 && str4.equals(lkVar.K) && !arrayList6.isEmpty()) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList6);
                        tL_messages_searchGlobal2.offset_id = gjVar.e1();
                        tL_messages_searchGlobal2.offset_rate = lkVar.H;
                        TLRPC.Peer peer = gjVar.k.peer_id;
                        long j17 = peer.channel_id;
                        if (j17 == 0) {
                            j17 = peer.chat_id;
                            if (j17 == 0) {
                                j13 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.np.u1(i11).l1(j13);
                            }
                        }
                        j13 = -j17;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.np.u1(i11).l1(j13);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    arrayList5 = arrayList4;
                }
                lkVar.K = str4;
                lkVar.J = str2;
                final ArrayList arrayList8 = new ArrayList();
                jg.q0.B1(lkVar.K, arrayList8);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final int i12 = i7;
                final long j18 = j12;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.ui.Components.hk
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
                        org.telegram.messenger.g0.g3(new ki.x2(lk.this, i12, tL_error, tLObject, cVar2, z13, str5, arrayList9, j14, j18, arrayList5, arrayList8));
                    }
                });
            }
        };
        this.w = r02;
        org.telegram.messenger.g0.h3(r02, (!z11 || arrayList3.isEmpty()) ? 350L : 0L);
        mkVar.K.setViewType(3);
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
        mk mkVar = this.Y;
        jg.q0 q0Var = mkVar.I;
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
                    animatorSet = mkVar.J;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z11) {
                        q0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    mkVar.J = animatorSet2;
                    ak akVar = mkVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(akVar, (Property<ak, Float>) property, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(q0Var, (Property<jg.q0, Float>) property, !z11 ? 0.0f : -org.telegram.messenger.g0.L(44.0f)), ObjectAnimator.ofFloat(mkVar.K, (Property<yz, Float>) property, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(mkVar.M, (Property<fi.w4, Float>) property, z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f));
                    mkVar.J.addListener(new y(this, 13));
                    mkVar.J.setInterpolator(nr.g);
                    mkVar.J.setDuration(180L);
                    mkVar.J.start();
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
        animatorSet = mkVar.J;
        if (animatorSet != null) {
        }
        if (z11) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        mkVar.J = animatorSet22;
        ak akVar2 = mkVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(akVar2, (Property<ak, Float>) property2, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(q0Var, (Property<jg.q0, Float>) property2, !z11 ? 0.0f : -org.telegram.messenger.g0.L(44.0f)), ObjectAnimator.ofFloat(mkVar.K, (Property<yz, Float>) property2, !z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(mkVar.M, (Property<fi.w4, Float>) property2, z11 ? org.telegram.messenger.g0.L(44.0f) : 0.0f));
        mkVar.J.addListener(new y(this, 13));
        mkVar.J.setInterpolator(nr.g);
        mkVar.J.setDuration(180L);
        mkVar.J.start();
    }

    @Override // org.telegram.ui.Components.zj0, v4.i0
    public final void f() {
        X(false);
        this.Y.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        View view;
        mk mkVar = this.Y;
        Context context = this.r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    yz yzVar = new yz(context, mkVar.a);
                    yzVar.setViewType(3);
                    yzVar.setIsSingleCell(true);
                    y3Var = yzVar;
                } else if (i7 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return i5.c.q(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(i7 == 1 ? 1 : 2, context, mkVar.a);
            i7Var.setDrawDownloadIcon(false);
            view = i7Var;
            return i5.c.q(view, view, -1, -2);
        }
        y3Var = new org.telegram.ui.Cells.y3(context, mkVar.a);
        view = y3Var;
        return i5.c.q(view, view, -1, -2);
    }
}
