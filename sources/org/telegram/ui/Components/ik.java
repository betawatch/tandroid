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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ik extends ol0 {
    public long B;
    public long C;
    public int D;
    public String F;
    public String G;
    public String H;
    public boolean P;
    public int Q;
    public boolean S;
    public final /* synthetic */ jk U;
    public final Context r;
    public dk v;
    public org.telegram.ui.mp w;
    public long x;
    public uf.e0 y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.l10 E = new org.telegram.ui.l10(0, 0);
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final SparseArray L = new SparseArray();
    public final ArrayList M = new ArrayList();
    public final HashMap N = new HashMap();
    public final ArrayList O = new ArrayList();
    public final AnimationNotificationsLocker R = new AnimationNotificationsLocker();
    public final m2.b T = new m2.b(this, 15);

    public ik(jk jkVar, Context context) {
        this.U = jkVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.cl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int M(int i10) {
        if (i10 == 0) {
            return this.s.size();
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.M;
        int i12 = 1;
        if (i11 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.N.get(arrayList.get(i11));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i11 == 0 && this.s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override // org.telegram.ui.Components.ol0
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        if (i10 == 0) {
            if (i11 < this.s.size()) {
                return this.s.get(i11);
            }
            return null;
        }
        int i12 = i10 - 1;
        ArrayList arrayList2 = this.M;
        if (i12 >= arrayList2.size() || (arrayList = (ArrayList) this.N.get(arrayList2.get(i12))) == null) {
            return null;
        }
        int i13 = i11 - ((i12 == 0 && this.s.isEmpty()) ? 0 : 1);
        if (i13 < 0 || i13 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i13);
    }

    @Override // org.telegram.ui.Components.ol0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == R() - 1) {
            return 3;
        }
        int i12 = i10 - 1;
        if (i12 < this.M.size()) {
            return (!(i12 == 0 && this.s.isEmpty()) && i11 == 0) ? 0 : 4;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int R() {
        ArrayList arrayList = this.M;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.S ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.ol0
    public final View T(int i10, View view) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        if (u3Var == null) {
            Context context = this.r;
            jk jkVar = this.U;
            u3Var = new org.telegram.ui.Cells.u3(context, jkVar.a);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.e7, jkVar.a) & (-218103809));
        }
        if (i10 == 0 || (i10 == 1 && this.s.isEmpty())) {
            u3Var.setAlpha(0.0f);
            return u3Var;
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.M;
        if (i11 < arrayList.size()) {
            u3Var.setAlpha(1.0f);
            if (((ArrayList) this.N.get((String) arrayList.get(i11))) != null) {
                u3Var.setText((i11 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r1.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ol0
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        int i12 = m1Var.f;
        return i12 == 1 || i12 == 4;
    }

    @Override // org.telegram.ui.Components.ol0
    public final void W(int i10, int i11, f2.m1 m1Var) {
        int i12 = i11;
        int i13 = m1Var.f;
        View view = m1Var.a;
        if (i13 == 2 || i13 == 3) {
            return;
        }
        HashMap hashMap = this.N;
        ArrayList arrayList = this.M;
        boolean z4 = false;
        if (i13 == 0) {
            int i14 = i10 - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i14))) == null) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText((i14 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r3.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i13 == 1 || i13 == 4) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            if (i10 == 0) {
                ck ckVar = (ck) O(S(i12), Q(i12));
                int i15 = ckVar.a;
                if (i15 != 0) {
                    i7Var.d(ckVar.b, ckVar.c, null, null, i15, false);
                } else {
                    i7Var.d(ckVar.b, ckVar.c, ckVar.d.toUpperCase().substring(0, Math.min(ckVar.d.length(), 4)), ckVar.e, 0, false);
                }
                File file = ckVar.f;
                jk jkVar = this.U;
                if (file != null) {
                    i7Var.b(jkVar.O.containsKey(file.toString()), !jkVar.R);
                    return;
                } else {
                    i7Var.b(false, !jkVar.R);
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
            boolean z10 = i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject.getId();
            if (i12 != arrayList2.size() - 1 || (i16 == arrayList.size() - 1 && this.P)) {
                z4 = true;
            }
            i7Var.c(messageObject, z4);
            i7Var.getViewTreeObserver().addOnPreDrawListener(new hk(this, i7Var, messageObject, z10, 0));
        }
    }

    public final void Y(String str, boolean z4) {
        long j10;
        jk jkVar = this.U;
        bk bkVar = jkVar.v;
        xj xjVar = jkVar.r;
        org.telegram.ui.mp mpVar = this.w;
        if (mpVar != null) {
            AndroidUtilities.cancelRunOnUIThread(mpVar);
            this.w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (xjVar.getAdapter() != bkVar) {
                xjVar.setAdapter(bkVar);
            }
            l();
        } else {
            org.telegram.ui.mp mpVar2 = new org.telegram.ui.mp(24, this, str);
            this.w = mpVar2;
            AndroidUtilities.runOnUIThread(mpVar2, 300L);
        }
        if (jkVar.T || !bkVar.d.isEmpty()) {
            return;
        }
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                Z(j11, j12, j13, uf.g0.Z2[2], str, z4);
                return;
            }
            uf.e0 e0Var = (uf.e0) arrayList.get(i10);
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
                uf.c0 c0Var = e0Var.g;
                j12 = c0Var.b;
                j13 = c0Var.c;
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.dk] */
    public final void Z(final long j10, final long j11, final long j12, uf.e0 e0Var, final String str, boolean z4) {
        jk jkVar = this.U;
        xj xjVar = jkVar.r;
        oh.z4 z4Var = jkVar.I;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + e0Var.d + str;
        String str3 = this.F;
        final boolean z10 = str3 != null && str3.equals(str2);
        boolean z11 = !z10 && z4;
        this.y = e0Var;
        this.x = j10;
        this.B = j11;
        this.C = j12;
        dk dkVar = this.v;
        if (dkVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dkVar);
        }
        m2.b bVar = this.T;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        if (z10 && z4) {
            return;
        }
        ArrayList arrayList = this.J;
        ArrayList arrayList2 = this.I;
        ArrayList arrayList3 = this.K;
        if (z11) {
            arrayList3.clear();
            this.M.clear();
            this.N.clear();
            this.P = true;
            z4Var.setVisibility(0);
            l();
            this.Q++;
            if (xjVar.getPinnedHeader() != null) {
                xjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.P = true;
        l();
        if (!z10) {
            bVar.run();
            z4Var.e(true, !z4);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i10 = 1 + this.Q;
        this.Q = i10;
        final AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
        ?? r02 = new Runnable() { // from class: org.telegram.ui.Components.dk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                String str4;
                long j13;
                int i11;
                ArrayList<Object> arrayList4;
                long j14;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ik ikVar = ik.this;
                ArrayList arrayList5 = ikVar.K;
                final long j15 = j10;
                String str5 = str;
                final AccountInstance accountInstance2 = accountInstance;
                final long j16 = j11;
                long j17 = j12;
                final boolean z12 = z10;
                if (j15 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = ikVar.y.e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j15);
                    if (j16 > 0) {
                        tL_messages_search.min_date = (int) (j16 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_search.max_date = (int) (j17 / 1000);
                    }
                    if (z12 && str5.equals(ikVar.G) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) l.d.i(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    str4 = str5;
                    arrayList4 = null;
                    tL_messages_searchGlobal = tL_messages_search;
                } else {
                    if (TextUtils.isEmpty(str5)) {
                        str4 = str5;
                        j13 = j17;
                        i11 = 20;
                        arrayList4 = null;
                    } else {
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        j13 = j17;
                        str4 = str5;
                        i11 = 20;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList4 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i11;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = ikVar.y.e;
                    if (j16 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j16 / 1000);
                    }
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j13 / 1000);
                    }
                    if (z12 && str4.equals(ikVar.G) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) l.d.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = ikVar.D;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j18 = peer.channel_id;
                        if (j18 == 0) {
                            j18 = peer.chat_id;
                            if (j18 == 0) {
                                j14 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j14);
                                tL_messages_searchGlobal = tL_messages_searchGlobal2;
                            }
                        }
                        j14 = -j18;
                        tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j14);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                ikVar.G = str4;
                ikVar.F = str2;
                final ArrayList arrayList7 = new ArrayList();
                uf.g0.x1(ikVar.G, arrayList7);
                ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                final int i12 = i10;
                final String str6 = str4;
                final ArrayList<Object> arrayList8 = arrayList4;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.ui.Components.ek
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        AccountInstance accountInstance3 = accountInstance2;
                        String str7 = str6;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                MessageObject messageObject2 = new MessageObject(accountInstance3.getCurrentAccount(), messages_messages.messages.get(i13), false, true);
                                messageObject2.setQuery(str7);
                                arrayList9.add(messageObject2);
                            }
                        }
                        AndroidUtilities.runOnUIThread(new fk(ik.this, i12, tL_error, tLObject, accountInstance3, z12, str7, arrayList9, j15, j16, arrayList8, arrayList7));
                    }
                });
            }
        };
        this.v = r02;
        AndroidUtilities.runOnUIThread(r02, (!z10 || arrayList3.isEmpty()) ? 350L : 0L);
        jkVar.G.setViewType(3);
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
    public final void a0(ArrayList arrayList, ArrayList arrayList2, boolean z4) {
        boolean z10;
        AnimatorSet animatorSet;
        jk jkVar = this.U;
        uf.g0 g0Var = jkVar.E;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            ArrayList arrayList3 = this.O;
            if (i10 >= arrayList3.size()) {
                break;
            }
            if (((uf.e0) arrayList3.get(i10)).a()) {
                z11 = true;
            } else if (((uf.e0) arrayList3.get(i10)).d == 4) {
                z12 = true;
            } else if (((uf.e0) arrayList3.get(i10)).d == 6) {
                z13 = true;
            }
            i10++;
        }
        boolean z14 = ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? false : true;
        if ((z11 || z14 || !z4) && z14) {
            if (arrayList == null || arrayList.isEmpty() || z12) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z13) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null) {
                g0Var.z1(arrayList, arrayList2, false);
                z10 = true;
                if (!z10) {
                    g0Var.z1(null, null, false);
                }
                g0Var.setEnabled(z10);
                if (z10 || g0Var.getTag() == null) {
                    if (z10 && g0Var.getTag() == null) {
                        return;
                    }
                    g0Var.setTag(z10 ? 1 : null);
                    animatorSet = jkVar.F;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z10) {
                        g0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    jkVar.F = animatorSet2;
                    xj xjVar = jkVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(xjVar, (Property<xj, Float>) property, !z10 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(g0Var, (Property<uf.g0, Float>) property, !z10 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(jkVar.G, (Property<u00, Float>) property, !z10 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(jkVar.I, (Property<oh.z4, Float>) property, z10 ? AndroidUtilities.dp(44.0f) : 0.0f));
                    jkVar.F.addListener(new a9(this, 7));
                    jkVar.F.setInterpolator(pr.g);
                    jkVar.F.setDuration(180L);
                    jkVar.F.start();
                }
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
        g0Var.setEnabled(z10);
        if (z10) {
        }
        if (z10) {
        }
        g0Var.setTag(z10 ? 1 : null);
        animatorSet = jkVar.F;
        if (animatorSet != null) {
        }
        if (z10) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        jkVar.F = animatorSet22;
        xj xjVar2 = jkVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(xjVar2, (Property<xj, Float>) property2, !z10 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(g0Var, (Property<uf.g0, Float>) property2, !z10 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(jkVar.G, (Property<u00, Float>) property2, !z10 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(jkVar.I, (Property<oh.z4, Float>) property2, z10 ? AndroidUtilities.dp(44.0f) : 0.0f));
        jkVar.F.addListener(new a9(this, 7));
        jkVar.F.setInterpolator(pr.g);
        jkVar.F.setDuration(180L);
        jkVar.F.start();
    }

    @Override // org.telegram.ui.Components.ol0, f2.p0
    public final void l() {
        X(false);
        this.U.T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        View view;
        jk jkVar = this.U;
        Context context = this.r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    u00 u00Var = new u00(context, jkVar.a);
                    u00Var.setViewType(3);
                    u00Var.setIsSingleCell(true);
                    u3Var = u00Var;
                } else if (i10 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return org.telegram.ui.yh.o(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, i10 == 1 ? 1 : 2, jkVar.a);
            i7Var.setDrawDownloadIcon(false);
            view = i7Var;
            return org.telegram.ui.yh.o(view, view, -1, -2);
        }
        u3Var = new org.telegram.ui.Cells.u3(context, jkVar.a);
        view = u3Var;
        return org.telegram.ui.yh.o(view, view, -1, -2);
    }
}
