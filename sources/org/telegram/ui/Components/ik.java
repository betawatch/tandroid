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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ik extends fl0 {
    public long A;
    public long B;
    public int C;
    public String E;
    public String F;
    public String G;
    public boolean O;
    public int P;
    public boolean R;
    public final /* synthetic */ jk T;
    public final Context r;
    public dk v;
    public z2 w;
    public long x;
    public rf.f0 y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.z00 D = new org.telegram.ui.z00(0, 0);
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final SparseArray K = new SparseArray();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList N = new ArrayList();
    public final AnimationNotificationsLocker Q = new AnimationNotificationsLocker();
    public final lh.m7 S = new lh.m7(this, 16);

    public ik(jk jkVar, Context context) {
        this.T = jkVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int M(int i10) {
        if (i10 == 0) {
            return this.s.size();
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.L;
        int i12 = 1;
        if (i11 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.M.get(arrayList.get(i11));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i11 == 0 && this.s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override // org.telegram.ui.Components.fl0
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        if (i10 == 0) {
            if (i11 < this.s.size()) {
                return this.s.get(i11);
            }
            return null;
        }
        int i12 = i10 - 1;
        ArrayList arrayList2 = this.L;
        if (i12 >= arrayList2.size() || (arrayList = (ArrayList) this.M.get(arrayList2.get(i12))) == null) {
            return null;
        }
        int i13 = i11 - ((i12 == 0 && this.s.isEmpty()) ? 0 : 1);
        if (i13 < 0 || i13 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i13);
    }

    @Override // org.telegram.ui.Components.fl0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == R() - 1) {
            return 3;
        }
        int i12 = i10 - 1;
        if (i12 < this.L.size()) {
            return (!(i12 == 0 && this.s.isEmpty()) && i11 == 0) ? 0 : 4;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int R() {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.R ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.fl0
    public final View T(int i10, View view) {
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        if (s3Var == null) {
            Context context = this.r;
            jk jkVar = this.T;
            s3Var = new org.telegram.ui.Cells.s3(context, jkVar.a);
            s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.e7, jkVar.a) & (-218103809));
        }
        if (i10 == 0 || (i10 == 1 && this.s.isEmpty())) {
            s3Var.setAlpha(0.0f);
            return s3Var;
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.L;
        if (i11 < arrayList.size()) {
            s3Var.setAlpha(1.0f);
            if (((ArrayList) this.M.get((String) arrayList.get(i11))) != null) {
                s3Var.setText((i11 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r1.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        int i12 = n1Var.f;
        return i12 == 1 || i12 == 4;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void W(int i10, int i11, f2.n1 n1Var) {
        int i12 = i11;
        int i13 = n1Var.f;
        View view = n1Var.a;
        if (i13 == 2 || i13 == 3) {
            return;
        }
        HashMap hashMap = this.M;
        ArrayList arrayList = this.L;
        boolean z10 = false;
        if (i13 == 0) {
            int i14 = i10 - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i14))) == null) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText((i14 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r3.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i13 == 1 || i13 == 4) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            if (i10 == 0) {
                ck ckVar = (ck) O(S(i12), Q(i12));
                int i15 = ckVar.a;
                if (i15 != 0) {
                    g7Var.d(false, ckVar.b, i15, ckVar.c, null, null);
                } else {
                    g7Var.d(false, ckVar.b, 0, ckVar.c, ckVar.d.toUpperCase().substring(0, Math.min(ckVar.d.length(), 4)), ckVar.e);
                }
                File file = ckVar.f;
                jk jkVar = this.T;
                if (file != null) {
                    g7Var.b(jkVar.N.containsKey(file.toString()), !jkVar.Q);
                    return;
                } else {
                    g7Var.b(false, !jkVar.Q);
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
            boolean z11 = g7Var.getMessage() != null && g7Var.getMessage().getId() == messageObject.getId();
            if (i12 != arrayList2.size() - 1 || (i16 == arrayList.size() - 1 && this.O)) {
                z10 = true;
            }
            g7Var.c(messageObject, z10);
            g7Var.getViewTreeObserver().addOnPreDrawListener(new hk(this, g7Var, messageObject, z11, 0));
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        jk jkVar = this.T;
        bk bkVar = jkVar.v;
        xj xjVar = jkVar.r;
        z2 z2Var = this.w;
        if (z2Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z2Var);
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
            z2 z2Var2 = new z2(17, this, str);
            this.w = z2Var2;
            AndroidUtilities.runOnUIThread(z2Var2, 300L);
        }
        if (jkVar.S || !bkVar.d.isEmpty()) {
            return;
        }
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                Z(j11, j12, j13, rf.h0.Y2[2], str, z10);
                return;
            }
            rf.f0 f0Var = (rf.f0) arrayList.get(i10);
            int i11 = f0Var.d;
            if (i11 == 4) {
                TLObject tLObject = f0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).id;
                }
                j11 = j10;
            } else if (i11 == 6) {
                rf.d0 d0Var = f0Var.g;
                j12 = d0Var.b;
                j13 = d0Var.c;
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.dk] */
    public final void Z(final long j10, final long j11, final long j12, rf.f0 f0Var, final String str, boolean z10) {
        jk jkVar = this.T;
        xj xjVar = jkVar.r;
        lh.x4 x4Var = jkVar.H;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + f0Var.d + str;
        String str3 = this.E;
        final boolean z11 = str3 != null && str3.equals(str2);
        boolean z12 = !z11 && z10;
        this.y = f0Var;
        this.x = j10;
        this.A = j11;
        this.B = j12;
        dk dkVar = this.v;
        if (dkVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dkVar);
        }
        lh.m7 m7Var = this.S;
        AndroidUtilities.cancelRunOnUIThread(m7Var);
        if (z11 && z10) {
            return;
        }
        ArrayList arrayList = this.I;
        ArrayList arrayList2 = this.H;
        ArrayList arrayList3 = this.J;
        if (z12) {
            arrayList3.clear();
            this.L.clear();
            this.M.clear();
            this.O = true;
            x4Var.setVisibility(0);
            l();
            this.P++;
            if (xjVar.getPinnedHeader() != null) {
                xjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.O = true;
        l();
        if (!z11) {
            m7Var.run();
            x4Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i10 = 1 + this.P;
        this.P = i10;
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
                ArrayList arrayList5 = ikVar.J;
                final long j15 = j10;
                String str5 = str;
                final AccountInstance accountInstance2 = accountInstance;
                final long j16 = j11;
                long j17 = j12;
                final boolean z13 = z11;
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
                    if (z13 && str5.equals(ikVar.F) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) j7.l1.i(1, arrayList5)).getId();
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
                    if (z13 && str4.equals(ikVar.F) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = ikVar.C;
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
                ikVar.F = str4;
                ikVar.E = str2;
                final ArrayList arrayList7 = new ArrayList();
                rf.h0.y1(ikVar.F, arrayList7);
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
                        AndroidUtilities.runOnUIThread(new fk(ik.this, i12, tL_error, tLObject, accountInstance3, z13, str7, arrayList9, j15, j16, arrayList8, arrayList7));
                    }
                });
            }
        };
        this.v = r02;
        AndroidUtilities.runOnUIThread(r02, (!z11 || arrayList3.isEmpty()) ? 350L : 0L);
        jkVar.F.setViewType(3);
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
        jk jkVar = this.T;
        rf.h0 h0Var = jkVar.D;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList3 = this.N;
            if (i10 >= arrayList3.size()) {
                break;
            }
            if (((rf.f0) arrayList3.get(i10)).a()) {
                z12 = true;
            } else if (((rf.f0) arrayList3.get(i10)).d == 4) {
                z13 = true;
            } else if (((rf.f0) arrayList3.get(i10)).d == 6) {
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
                h0Var.A1(arrayList, arrayList2, false);
                z11 = true;
                if (!z11) {
                    h0Var.A1(null, null, false);
                }
                h0Var.setEnabled(z11);
                if (z11 || h0Var.getTag() == null) {
                    if (z11 && h0Var.getTag() == null) {
                        return;
                    }
                    h0Var.setTag(z11 ? 1 : null);
                    animatorSet = jkVar.E;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z11) {
                        h0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    jkVar.E = animatorSet2;
                    xj xjVar = jkVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(xjVar, (Property<xj, Float>) property, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(h0Var, (Property<rf.h0, Float>) property, !z11 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(jkVar.F, (Property<p00, Float>) property, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(jkVar.H, (Property<lh.x4, Float>) property, z11 ? AndroidUtilities.dp(44.0f) : 0.0f));
                    jkVar.E.addListener(new org.telegram.ui.bm(this, 16));
                    jkVar.E.setInterpolator(jr.g);
                    jkVar.E.setDuration(180L);
                    jkVar.E.start();
                }
                return;
            }
        }
        z11 = false;
        if (!z11) {
        }
        h0Var.setEnabled(z11);
        if (z11) {
        }
        if (z11) {
        }
        h0Var.setTag(z11 ? 1 : null);
        animatorSet = jkVar.E;
        if (animatorSet != null) {
        }
        if (z11) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        jkVar.E = animatorSet22;
        xj xjVar2 = jkVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(xjVar2, (Property<xj, Float>) property2, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(h0Var, (Property<rf.h0, Float>) property2, !z11 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(jkVar.F, (Property<p00, Float>) property2, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(jkVar.H, (Property<lh.x4, Float>) property2, z11 ? AndroidUtilities.dp(44.0f) : 0.0f));
        jkVar.E.addListener(new org.telegram.ui.bm(this, 16));
        jkVar.E.setInterpolator(jr.g);
        jkVar.E.setDuration(180L);
        jkVar.E.start();
    }

    @Override // org.telegram.ui.Components.fl0, f2.p0
    public final void l() {
        X(false);
        this.T.T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s3 s3Var;
        View view;
        jk jkVar = this.T;
        Context context = this.r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    p00 p00Var = new p00(context, jkVar.a);
                    p00Var.setViewType(3);
                    p00Var.setIsSingleCell(true);
                    s3Var = p00Var;
                } else if (i10 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return org.telegram.ui.th.m(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(context, i10 == 1 ? 1 : 2, jkVar.a);
            g7Var.setDrawDownloadIcon(false);
            view = g7Var;
            return org.telegram.ui.th.m(view, view, -1, -2);
        }
        s3Var = new org.telegram.ui.Cells.s3(context, jkVar.a);
        view = s3Var;
        return org.telegram.ui.th.m(view, view, -1, -2);
    }
}
