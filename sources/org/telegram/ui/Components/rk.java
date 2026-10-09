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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class rk extends mm0 {
    public long E;
    public long F;
    public int G;
    public String I;
    public String J;
    public String K;
    public boolean S;
    public int T;
    public boolean V;
    public final /* synthetic */ sk X;
    public final Context r;
    public nk v;
    public ea w;
    public long x;
    public gg.p0 y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.o10 H = new org.telegram.ui.o10(0, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final SparseArray O = new SparseArray();
    public final ArrayList P = new ArrayList();
    public final HashMap Q = new HashMap();
    public final ArrayList R = new ArrayList();
    public final AnimationNotificationsLocker U = new AnimationNotificationsLocker();
    public final org.telegram.ui.Cells.t6 W = new org.telegram.ui.Cells.t6(this, 6);

    public rk(sk skVar, Context context) {
        this.X = skVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.yl0
    public final void G(qm0 qm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.mm0
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

    @Override // org.telegram.ui.Components.mm0
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

    @Override // org.telegram.ui.Components.mm0
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

    @Override // org.telegram.ui.Components.mm0
    public final int R() {
        ArrayList arrayList = this.P;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.V ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.mm0
    public final View T(int i10, View view) {
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (v3Var == null) {
            Context context = this.r;
            sk skVar = this.X;
            v3Var = new org.telegram.ui.Cells.v3(context, skVar.a);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.e7, skVar.a) & (-218103809));
        }
        if (i10 == 0 || (i10 == 1 && this.s.isEmpty())) {
            v3Var.setAlpha(0.0f);
            return v3Var;
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.P;
        if (i11 < arrayList.size()) {
            v3Var.setAlpha(1.0f);
            if (((ArrayList) this.Q.get((String) arrayList.get(i11))) != null) {
                v3Var.setText((i11 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r1.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        int i12 = d1Var.f;
        return i12 == 1 || i12 == 4;
    }

    @Override // org.telegram.ui.Components.mm0
    public final void W(int i10, int i11, s4.d1 d1Var) {
        int i12 = i11;
        int i13 = d1Var.f;
        View view = d1Var.a;
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
            ((org.telegram.ui.Cells.v3) view).setText((i14 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r3.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i13 == 1 || i13 == 4) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            if (i10 == 0) {
                mk mkVar = (mk) O(S(i12), Q(i12));
                int i15 = mkVar.a;
                if (i15 != 0) {
                    k7Var.d(mkVar.b, mkVar.c, null, null, i15, false);
                } else {
                    k7Var.d(mkVar.b, mkVar.c, mkVar.d.toUpperCase().substring(0, Math.min(mkVar.d.length(), 4)), mkVar.e, 0, false);
                }
                File file = mkVar.f;
                sk skVar = this.X;
                if (file != null) {
                    k7Var.b(skVar.R.containsKey(file.toString()), !skVar.U);
                    return;
                } else {
                    k7Var.b(false, !skVar.U);
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
            MessageObject messageObject = (MessageObject) arrayList2.get(i12);
            boolean z11 = k7Var.getMessage() != null && k7Var.getMessage().getId() == messageObject.getId();
            if (i12 != arrayList2.size() - 1 || (i16 == arrayList.size() - 1 && this.S)) {
                z10 = true;
            }
            k7Var.c(messageObject, z10);
            k7Var.getViewTreeObserver().addOnPreDrawListener(new qk(this, k7Var, messageObject, z11, 0));
        }
    }

    public final void Y(String str, boolean z10) {
        long j3;
        sk skVar = this.X;
        lk lkVar = skVar.v;
        hk hkVar = skVar.r;
        ea eaVar = this.w;
        if (eaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eaVar);
            this.w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (hkVar.getAdapter() != lkVar) {
                hkVar.setAdapter(lkVar);
            }
            l();
        } else {
            ea eaVar2 = new ea(17, this, str);
            this.w = eaVar2;
            AndroidUtilities.runOnUIThread(eaVar2, 300L);
        }
        if (skVar.W || !lkVar.d.isEmpty()) {
            return;
        }
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i10 >= arrayList.size()) {
                Z(j10, j11, j12, gg.r0.a3[2], str, z10);
                return;
            }
            gg.p0 p0Var = (gg.p0) arrayList.get(i10);
            int i11 = p0Var.d;
            if (i11 == 4) {
                TLObject tLObject = p0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) tLObject).id;
                }
                j10 = j3;
            } else if (i11 == 6) {
                gg.n0 n0Var = p0Var.g;
                j11 = n0Var.b;
                j12 = n0Var.c;
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.nk] */
    public final void Z(final long j3, final long j10, final long j11, gg.p0 p0Var, final String str, boolean z10) {
        sk skVar = this.X;
        hk hkVar = skVar.r;
        ai.e7 e7Var = skVar.L;
        Locale locale = Locale.ENGLISH;
        final String str2 = j3 + j10 + j11 + p0Var.d + str;
        String str3 = this.I;
        final boolean z11 = str3 != null && str3.equals(str2);
        boolean z12 = !z11 && z10;
        this.y = p0Var;
        this.x = j3;
        this.E = j10;
        this.F = j11;
        nk nkVar = this.v;
        if (nkVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nkVar);
        }
        org.telegram.ui.Cells.t6 t6Var = this.W;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
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
            e7Var.setVisibility(0);
            l();
            this.T++;
            if (hkVar.getPinnedHeader() != null) {
                hkVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.S = true;
        l();
        if (!z11) {
            t6Var.run();
            e7Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i10 = 1 + this.T;
        this.T = i10;
        final AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
        ?? r02 = new Runnable() { // from class: org.telegram.ui.Components.nk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                long j12;
                boolean z13;
                long j13;
                long j14;
                int i11;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                long j15;
                final rk rkVar = rk.this;
                ArrayList arrayList4 = rkVar.N;
                long j16 = j3;
                final String str4 = str;
                final AccountInstance accountInstance2 = accountInstance;
                long j17 = j10;
                long j18 = j11;
                boolean z14 = z11;
                ArrayList<Object> arrayList5 = null;
                if (j16 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = rkVar.y.e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j16);
                    j12 = j16;
                    z13 = z14;
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z13 && str4.equals(rkVar.J) && !arrayList4.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList4)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    j13 = j17;
                } else {
                    j12 = j16;
                    z13 = z14;
                    if (TextUtils.isEmpty(str4)) {
                        j13 = j17;
                        j14 = j18;
                        i11 = 20;
                    } else {
                        j14 = j18;
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        i11 = 20;
                        j13 = j17;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList5 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i11;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = rkVar.y.e;
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j13 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z13 && str4.equals(rkVar.J) && !arrayList4.isEmpty()) {
                        MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList4);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = rkVar.G;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j19 = peer.channel_id;
                        if (j19 == 0) {
                            j19 = peer.chat_id;
                            if (j19 == 0) {
                                j15 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j15);
                            }
                        }
                        j15 = -j19;
                        tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j15);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                }
                rkVar.J = str4;
                rkVar.I = str2;
                final ArrayList arrayList7 = new ArrayList();
                gg.r0.z1(rkVar.J, arrayList7);
                ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                final int i12 = i10;
                final boolean z15 = z13;
                final ArrayList<Object> arrayList8 = arrayList5;
                final long j20 = j12;
                final long j21 = j13;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.ui.Components.ok
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        AccountInstance accountInstance3 = accountInstance2;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                MessageObject messageObject2 = new MessageObject(accountInstance3.getCurrentAccount(), messages_messages.messages.get(i13), false, true);
                                messageObject2.setQuery(str5);
                                arrayList9.add(messageObject2);
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ei.t3(rk.this, i12, tL_error, tLObject, accountInstance3, z15, str5, arrayList9, j20, j21, arrayList8, arrayList7));
                    }
                });
            }
        };
        this.v = r02;
        AndroidUtilities.runOnUIThread(r02, (!z11 || arrayList3.isEmpty()) ? 350L : 0L);
        skVar.J.setViewType(3);
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
        sk skVar = this.X;
        gg.r0 r0Var = skVar.H;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList3 = this.R;
            if (i10 >= arrayList3.size()) {
                break;
            }
            if (((gg.p0) arrayList3.get(i10)).a()) {
                z12 = true;
            } else if (((gg.p0) arrayList3.get(i10)).d == 4) {
                z13 = true;
            } else if (((gg.p0) arrayList3.get(i10)).d == 6) {
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
                r0Var.B1(arrayList, arrayList2, false);
                z11 = true;
                if (!z11) {
                    r0Var.B1(null, null, false);
                }
                r0Var.setEnabled(z11);
                if (z11 || r0Var.getTag() == null) {
                    if (z11 && r0Var.getTag() == null) {
                        return;
                    }
                    r0Var.setTag(z11 ? 1 : null);
                    animatorSet = skVar.I;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z11) {
                        r0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    skVar.I = animatorSet2;
                    hk hkVar = skVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(hkVar, (Property<hk, Float>) property, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(r0Var, (Property<gg.r0, Float>) property, !z11 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(skVar.J, (Property<j10, Float>) property, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(skVar.L, (Property<ai.e7, Float>) property, z11 ? AndroidUtilities.dp(44.0f) : 0.0f));
                    skVar.I.addListener(new t8(this, 8));
                    skVar.I.setInterpolator(hs.g);
                    skVar.I.setDuration(180L);
                    skVar.I.start();
                }
                return;
            }
        }
        z11 = false;
        if (!z11) {
        }
        r0Var.setEnabled(z11);
        if (z11) {
        }
        if (z11) {
        }
        r0Var.setTag(z11 ? 1 : null);
        animatorSet = skVar.I;
        if (animatorSet != null) {
        }
        if (z11) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        skVar.I = animatorSet22;
        hk hkVar2 = skVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(hkVar2, (Property<hk, Float>) property2, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(r0Var, (Property<gg.r0, Float>) property2, !z11 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(skVar.J, (Property<j10, Float>) property2, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(skVar.L, (Property<ai.e7, Float>) property2, z11 ? AndroidUtilities.dp(44.0f) : 0.0f));
        skVar.I.addListener(new t8(this, 8));
        skVar.I.setInterpolator(hs.g);
        skVar.I.setDuration(180L);
        skVar.I.start();
    }

    @Override // org.telegram.ui.Components.mm0, s4.i0
    public final void l() {
        X(false);
        this.X.W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        View view;
        sk skVar = this.X;
        Context context = this.r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    j10 j10Var = new j10(context, skVar.a);
                    j10Var.setViewType(3);
                    j10Var.setIsSingleCell(true);
                    v3Var = j10Var;
                } else if (i10 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, i10 == 1 ? 1 : 2, skVar.a);
            k7Var.setDrawDownloadIcon(false);
            view = k7Var;
            return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
        }
        v3Var = new org.telegram.ui.Cells.v3(context, skVar.a);
        view = v3Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
