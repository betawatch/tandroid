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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ek extends sk0 {
    public long A;
    public long B;
    public int C;
    public String E;
    public String F;
    public String G;
    public boolean O;
    public int P;
    public boolean R;
    public final /* synthetic */ fk T;
    public final Context r;
    public ak v;
    public org.telegram.ui.wq w;
    public long x;
    public of.m0 y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.x00 D = new org.telegram.ui.x00(0, 0);
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final SparseArray K = new SparseArray();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList N = new ArrayList();
    public final AnimationNotificationsLocker Q = new AnimationNotificationsLocker();
    public final m.i3 S = new m.i3(this, 13);

    public ek(fk fkVar, Context context) {
        this.T = fkVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        return null;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int M(int i9) {
        if (i9 == 0) {
            return this.s.size();
        }
        int i10 = i9 - 1;
        ArrayList arrayList = this.L;
        int i11 = 1;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.M.get(arrayList.get(i10));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i10 == 0 && this.s.isEmpty()) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override // org.telegram.ui.Components.sk0
    public final Object O(int i9, int i10) {
        ArrayList arrayList;
        if (i9 == 0) {
            if (i10 < this.s.size()) {
                return this.s.get(i10);
            }
            return null;
        }
        int i11 = i9 - 1;
        ArrayList arrayList2 = this.L;
        if (i11 >= arrayList2.size() || (arrayList = (ArrayList) this.M.get(arrayList2.get(i11))) == null) {
            return null;
        }
        int i12 = i10 - ((i11 == 0 && this.s.isEmpty()) ? 0 : 1);
        if (i12 < 0 || i12 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i12);
    }

    @Override // org.telegram.ui.Components.sk0
    public final int P(int i9, int i10) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == R() - 1) {
            return 3;
        }
        int i11 = i9 - 1;
        if (i11 < this.L.size()) {
            return (!(i11 == 0 && this.s.isEmpty()) && i10 == 0) ? 0 : 4;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int R() {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.R ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.sk0
    public final View T(int i9, View view) {
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (v3Var == null) {
            Context context = this.r;
            fk fkVar = this.T;
            v3Var = new org.telegram.ui.Cells.v3(context, fkVar.a);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.e7, fkVar.a) & (-218103809));
        }
        if (i9 == 0 || (i9 == 1 && this.s.isEmpty())) {
            v3Var.setAlpha(0.0f);
            return v3Var;
        }
        int i10 = i9 - 1;
        ArrayList arrayList = this.L;
        if (i10 < arrayList.size()) {
            v3Var.setAlpha(1.0f);
            if (((ArrayList) this.M.get((String) arrayList.get(i10))) != null) {
                v3Var.setText((i10 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r1.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        int i11 = q1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // org.telegram.ui.Components.sk0
    public final void W(int i9, int i10, f2.q1 q1Var) {
        int i11 = i10;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 == 2 || i12 == 3) {
            return;
        }
        HashMap hashMap = this.M;
        ArrayList arrayList = this.L;
        boolean z10 = false;
        if (i12 == 0) {
            int i13 = i9 - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i13))) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText((i13 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r3.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i12 == 1 || i12 == 4) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            if (i9 == 0) {
                zj zjVar = (zj) O(S(i11), Q(i11));
                int i14 = zjVar.a;
                if (i14 != 0) {
                    i7Var.d(false, zjVar.b, i14, zjVar.c, null, null);
                } else {
                    i7Var.d(false, zjVar.b, 0, zjVar.c, zjVar.d.toUpperCase().substring(0, Math.min(zjVar.d.length(), 4)), zjVar.e);
                }
                File file = zjVar.f;
                fk fkVar = this.T;
                if (file != null) {
                    i7Var.b(fkVar.N.containsKey(file.toString()), !fkVar.Q);
                    return;
                } else {
                    i7Var.b(false, !fkVar.Q);
                    return;
                }
            }
            int i15 = i9 - 1;
            if (i15 != 0 || !this.s.isEmpty()) {
                i11--;
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
            if (arrayList2 == null) {
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            boolean z11 = i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject.getId();
            if (i11 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.O)) {
                z10 = true;
            }
            i7Var.c(messageObject, z10);
            i7Var.getViewTreeObserver().addOnPreDrawListener(new dk(this, i7Var, messageObject, z11, 0));
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        fk fkVar = this.T;
        yj yjVar = fkVar.v;
        uj ujVar = fkVar.r;
        org.telegram.ui.wq wqVar = this.w;
        if (wqVar != null) {
            AndroidUtilities.cancelRunOnUIThread(wqVar);
            this.w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (ujVar.getAdapter() != yjVar) {
                ujVar.setAdapter(yjVar);
            }
            l();
        } else {
            org.telegram.ui.wq wqVar2 = new org.telegram.ui.wq(20, this, str);
            this.w = wqVar2;
            AndroidUtilities.runOnUIThread(wqVar2, 300L);
        }
        if (fkVar.S || !yjVar.d.isEmpty()) {
            return;
        }
        int i9 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i9 >= arrayList.size()) {
                Z(j11, j12, j13, of.o0.Y2[2], str, z10);
                return;
            }
            of.m0 m0Var = (of.m0) arrayList.get(i9);
            int i10 = m0Var.d;
            if (i10 == 4) {
                TLObject tLObject = m0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).id;
                }
                j11 = j10;
            } else if (i10 == 6) {
                of.k0 k0Var = m0Var.g;
                j12 = k0Var.b;
                j13 = k0Var.c;
            }
            i9++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.ak] */
    public final void Z(final long j10, final long j11, final long j12, of.m0 m0Var, final String str, boolean z10) {
        fk fkVar = this.T;
        uj ujVar = fkVar.r;
        ih.b5 b5Var = fkVar.H;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + m0Var.d + str;
        String str3 = this.E;
        final boolean z11 = str3 != null && str3.equals(str2);
        boolean z12 = !z11 && z10;
        this.y = m0Var;
        this.x = j10;
        this.A = j11;
        this.B = j12;
        ak akVar = this.v;
        if (akVar != null) {
            AndroidUtilities.cancelRunOnUIThread(akVar);
        }
        m.i3 i3Var = this.S;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
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
            b5Var.setVisibility(0);
            l();
            this.P++;
            if (ujVar.getPinnedHeader() != null) {
                ujVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.O = true;
        l();
        if (!z11) {
            i3Var.run();
            b5Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i9 = 1 + this.P;
        this.P = i9;
        final AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
        ?? r02 = new Runnable() { // from class: org.telegram.ui.Components.ak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                String str4;
                long j13;
                int i10;
                ArrayList<Object> arrayList4;
                long j14;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ek ekVar = ek.this;
                ArrayList arrayList5 = ekVar.J;
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
                    tL_messages_search.filter = ekVar.y.e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j15);
                    if (j16 > 0) {
                        tL_messages_search.min_date = (int) (j16 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_search.max_date = (int) (j17 / 1000);
                    }
                    if (z13 && str5.equals(ekVar.F) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) j3.r0.j(1, arrayList5)).getId();
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
                        i10 = 20;
                        arrayList4 = null;
                    } else {
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        j13 = j17;
                        str4 = str5;
                        i10 = 20;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList4 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i10;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = ekVar.y.e;
                    if (j16 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j16 / 1000);
                    }
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j13 / 1000);
                    }
                    if (z13 && str4.equals(ekVar.F) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = ekVar.C;
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
                ekVar.F = str4;
                ekVar.E = str2;
                final ArrayList arrayList7 = new ArrayList();
                of.o0.y1(ekVar.F, arrayList7);
                ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                final int i11 = i9;
                final String str6 = str4;
                final ArrayList<Object> arrayList8 = arrayList4;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.ui.Components.bk
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        AccountInstance accountInstance3 = accountInstance2;
                        String str7 = str6;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                MessageObject messageObject2 = new MessageObject(accountInstance3.getCurrentAccount(), messages_messages.messages.get(i12), false, true);
                                messageObject2.setQuery(str7);
                                arrayList9.add(messageObject2);
                            }
                        }
                        AndroidUtilities.runOnUIThread(new mh.i3(ek.this, i11, tL_error, tLObject, accountInstance3, z13, str7, arrayList9, j15, j16, arrayList8, arrayList7));
                    }
                });
            }
        };
        this.v = r02;
        AndroidUtilities.runOnUIThread(r02, (!z11 || arrayList3.isEmpty()) ? 350L : 0L);
        fkVar.F.setViewType(3);
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
        fk fkVar = this.T;
        of.o0 o0Var = fkVar.D;
        int i9 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList3 = this.N;
            if (i9 >= arrayList3.size()) {
                break;
            }
            if (((of.m0) arrayList3.get(i9)).a()) {
                z12 = true;
            } else if (((of.m0) arrayList3.get(i9)).d == 4) {
                z13 = true;
            } else if (((of.m0) arrayList3.get(i9)).d == 6) {
                z14 = true;
            }
            i9++;
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
                o0Var.A1(arrayList, arrayList2, false);
                z11 = true;
                if (!z11) {
                    o0Var.A1(null, null, false);
                }
                o0Var.setEnabled(z11);
                if (z11 || o0Var.getTag() == null) {
                    if (z11 && o0Var.getTag() == null) {
                        return;
                    }
                    o0Var.setTag(z11 ? 1 : null);
                    animatorSet = fkVar.E;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z11) {
                        o0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    fkVar.E = animatorSet2;
                    uj ujVar = fkVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ujVar, (Property<uj, Float>) property, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(o0Var, (Property<of.o0, Float>) property, !z11 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(fkVar.F, (Property<e00, Float>) property, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(fkVar.H, (Property<ih.b5, Float>) property, z11 ? AndroidUtilities.dp(44.0f) : 0.0f));
                    fkVar.E.addListener(new org.telegram.ui.xp(this, 14));
                    fkVar.E.setInterpolator(gr.g);
                    fkVar.E.setDuration(180L);
                    fkVar.E.start();
                }
                return;
            }
        }
        z11 = false;
        if (!z11) {
        }
        o0Var.setEnabled(z11);
        if (z11) {
        }
        if (z11) {
        }
        o0Var.setTag(z11 ? 1 : null);
        animatorSet = fkVar.E;
        if (animatorSet != null) {
        }
        if (z11) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        fkVar.E = animatorSet22;
        uj ujVar2 = fkVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(ujVar2, (Property<uj, Float>) property2, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(o0Var, (Property<of.o0, Float>) property2, !z11 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(fkVar.F, (Property<e00, Float>) property2, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(fkVar.H, (Property<ih.b5, Float>) property2, z11 ? AndroidUtilities.dp(44.0f) : 0.0f));
        fkVar.E.addListener(new org.telegram.ui.xp(this, 14));
        fkVar.E.setInterpolator(gr.g);
        fkVar.E.setDuration(180L);
        fkVar.E.start();
    }

    @Override // org.telegram.ui.Components.sk0, f2.r0
    public final void l() {
        X(false);
        this.T.S();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.v3 v3Var;
        View view;
        fk fkVar = this.T;
        Context context = this.r;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    e00 e00Var = new e00(context, fkVar.a);
                    e00Var.setViewType(3);
                    e00Var.setIsSingleCell(true);
                    v3Var = e00Var;
                } else if (i9 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return j3.r0.s(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, i9 == 1 ? 1 : 2, fkVar.a);
            i7Var.setDrawDownloadIcon(false);
            view = i7Var;
            return j3.r0.s(view, view, -1, -2);
        }
        v3Var = new org.telegram.ui.Cells.v3(context, fkVar.a);
        view = v3Var;
        return j3.r0.s(view, view, -1, -2);
    }
}
