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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sk extends rl0 {
    public long E;
    public long F;
    public int G;
    public String I;
    public String J;
    public String K;
    public boolean S;
    public int T;
    public boolean V;
    public final /* synthetic */ tk X;
    public final Context r;
    public ok v;
    public ee w;
    public long x;
    public fg.q0 y;
    public ArrayList s = new ArrayList();
    public final org.telegram.ui.r10 H = new org.telegram.ui.r10(0, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final SparseArray O = new SparseArray();
    public final ArrayList P = new ArrayList();
    public final HashMap Q = new HashMap();
    public final ArrayList R = new ArrayList();
    public final AnimationNotificationsLocker U = new AnimationNotificationsLocker();
    public final org.telegram.ui.Cells.l9 W = new org.telegram.ui.Cells.l9(this, 4);

    public sk(tk tkVar, Context context) {
        this.X = tkVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.rl0
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

    @Override // org.telegram.ui.Components.rl0
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

    @Override // org.telegram.ui.Components.rl0
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

    @Override // org.telegram.ui.Components.rl0
    public final int R() {
        ArrayList arrayList = this.P;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.V ? 1 : 0) + 2;
    }

    @Override // org.telegram.ui.Components.rl0
    public final View T(int i10, View view) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        if (u3Var == null) {
            Context context = this.r;
            tk tkVar = this.X;
            u3Var = new org.telegram.ui.Cells.u3(context, tkVar.a);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, tkVar.a) & (-218103809));
        }
        if (i10 == 0 || (i10 == 1 && this.s.isEmpty())) {
            u3Var.setAlpha(0.0f);
            return u3Var;
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.P;
        if (i11 < arrayList.size()) {
            u3Var.setAlpha(1.0f);
            if (((ArrayList) this.Q.get((String) arrayList.get(i11))) != null) {
                u3Var.setText((i11 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r1.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        int i12 = c1Var.f;
        return i12 == 1 || i12 == 4;
    }

    @Override // org.telegram.ui.Components.rl0
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
            ((org.telegram.ui.Cells.u3) view).setText((i14 != 0 || this.s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) r3.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i13 == 1 || i13 == 4) {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            if (i10 == 0) {
                nk nkVar = (nk) O(S(i12), Q(i12));
                int i15 = nkVar.a;
                if (i15 != 0) {
                    l7Var.d(nkVar.b, nkVar.c, null, null, i15, false);
                } else {
                    l7Var.d(nkVar.b, nkVar.c, nkVar.d.toUpperCase().substring(0, Math.min(nkVar.d.length(), 4)), nkVar.e, 0, false);
                }
                File file = nkVar.f;
                tk tkVar = this.X;
                if (file != null) {
                    l7Var.b(tkVar.R.containsKey(file.toString()), !tkVar.U);
                    return;
                } else {
                    l7Var.b(false, !tkVar.U);
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
            boolean z11 = l7Var.getMessage() != null && l7Var.getMessage().getId() == messageObject.getId();
            if (i12 != arrayList2.size() - 1 || (i16 == arrayList.size() - 1 && this.S)) {
                z10 = true;
            }
            l7Var.c(messageObject, z10);
            l7Var.getViewTreeObserver().addOnPreDrawListener(new rk(this, l7Var, messageObject, z11, 0));
        }
    }

    public final void Y(String str, boolean z10) {
        long j3;
        tk tkVar = this.X;
        mk mkVar = tkVar.v;
        ik ikVar = tkVar.r;
        ee eeVar = this.w;
        if (eeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eeVar);
            this.w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (ikVar.getAdapter() != mkVar) {
                ikVar.setAdapter(mkVar);
            }
            l();
        } else {
            ee eeVar2 = new ee(11, this, str);
            this.w = eeVar2;
            AndroidUtilities.runOnUIThread(eeVar2, 300L);
        }
        if (tkVar.W || !mkVar.d.isEmpty()) {
            return;
        }
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i10 >= arrayList.size()) {
                Z(j10, j11, j12, fg.s0.c3[2], str, z10);
                return;
            }
            fg.q0 q0Var = (fg.q0) arrayList.get(i10);
            int i11 = q0Var.d;
            if (i11 == 4) {
                TLObject tLObject = q0Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) tLObject).id;
                }
                j10 = j3;
            } else if (i11 == 6) {
                fg.o0 o0Var = q0Var.g;
                j11 = o0Var.b;
                j12 = o0Var.c;
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, org.telegram.ui.Components.ok] */
    public final void Z(final long j3, final long j10, final long j11, fg.q0 q0Var, final String str, boolean z10) {
        tk tkVar = this.X;
        ik ikVar = tkVar.r;
        hk hkVar = tkVar.L;
        Locale locale = Locale.ENGLISH;
        final String str2 = j3 + j10 + j11 + q0Var.d + str;
        String str3 = this.I;
        final boolean z11 = str3 != null && str3.equals(str2);
        boolean z12 = !z11 && z10;
        this.y = q0Var;
        this.x = j3;
        this.E = j10;
        this.F = j11;
        ok okVar = this.v;
        if (okVar != null) {
            AndroidUtilities.cancelRunOnUIThread(okVar);
        }
        org.telegram.ui.Cells.l9 l9Var = this.W;
        AndroidUtilities.cancelRunOnUIThread(l9Var);
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
            hkVar.setVisibility(0);
            l();
            this.T++;
            if (ikVar.getPinnedHeader() != null) {
                ikVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.S = true;
        l();
        if (!z11) {
            l9Var.run();
            hkVar.e(true, !z10);
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
        ?? r02 = new Runnable() { // from class: org.telegram.ui.Components.ok
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                String str4;
                long j12;
                int i11;
                ArrayList<Object> arrayList4;
                long j13;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final sk skVar = sk.this;
                ArrayList arrayList5 = skVar.N;
                final long j14 = j3;
                String str5 = str;
                final AccountInstance accountInstance2 = accountInstance;
                final long j15 = j10;
                long j16 = j11;
                final boolean z13 = z11;
                if (j14 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = skVar.y.e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j14);
                    if (j15 > 0) {
                        tL_messages_search.min_date = (int) (j15 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_search.max_date = (int) (j16 / 1000);
                    }
                    if (z13 && str5.equals(skVar.J) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) hc.b.i(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    str4 = str5;
                    arrayList4 = null;
                    tL_messages_searchGlobal = tL_messages_search;
                } else {
                    if (TextUtils.isEmpty(str5)) {
                        str4 = str5;
                        j12 = j16;
                        i11 = 20;
                        arrayList4 = null;
                    } else {
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        j12 = j16;
                        str4 = str5;
                        i11 = 20;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList4 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i11;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = skVar.y.e;
                    if (j15 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                    }
                    if (j12 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j12 / 1000);
                    }
                    if (z13 && str4.equals(skVar.J) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) hc.b.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = skVar.G;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j17 = peer.channel_id;
                        if (j17 == 0) {
                            j17 = peer.chat_id;
                            if (j17 == 0) {
                                j13 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j13);
                                tL_messages_searchGlobal = tL_messages_searchGlobal2;
                            }
                        }
                        j13 = -j17;
                        tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j13);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                skVar.J = str4;
                skVar.I = str2;
                final ArrayList arrayList7 = new ArrayList();
                fg.s0.x1(skVar.J, arrayList7);
                ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                final int i12 = i10;
                final String str6 = str4;
                final ArrayList<Object> arrayList8 = arrayList4;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.ui.Components.pk
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
                        AndroidUtilities.runOnUIThread(new di.w3(sk.this, i12, tL_error, tLObject, accountInstance3, z13, str7, arrayList9, j14, j15, arrayList8, arrayList7));
                    }
                });
            }
        };
        this.v = r02;
        AndroidUtilities.runOnUIThread(r02, (!z11 || arrayList3.isEmpty()) ? 350L : 0L);
        tkVar.J.setViewType(3);
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
        tk tkVar = this.X;
        fg.s0 s0Var = tkVar.H;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList3 = this.R;
            if (i10 >= arrayList3.size()) {
                break;
            }
            if (((fg.q0) arrayList3.get(i10)).a()) {
                z12 = true;
            } else if (((fg.q0) arrayList3.get(i10)).d == 4) {
                z13 = true;
            } else if (((fg.q0) arrayList3.get(i10)).d == 6) {
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
                s0Var.z1(arrayList, arrayList2, false);
                z11 = true;
                if (!z11) {
                    s0Var.z1(null, null, false);
                }
                s0Var.setEnabled(z11);
                if (z11 || s0Var.getTag() == null) {
                    if (z11 && s0Var.getTag() == null) {
                        return;
                    }
                    s0Var.setTag(z11 ? 1 : null);
                    animatorSet = tkVar.I;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z11) {
                        s0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    tkVar.I = animatorSet2;
                    ik ikVar = tkVar.r;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ikVar, (Property<ik, Float>) property, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(s0Var, (Property<fg.s0, Float>) property, !z11 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(tkVar.J, (Property<a10, Float>) property, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(tkVar.L, (Property<hk, Float>) property, z11 ? AndroidUtilities.dp(44.0f) : 0.0f));
                    tkVar.I.addListener(new org.telegram.ui.Cells.v5(this, 28));
                    tkVar.I.setInterpolator(wr.g);
                    tkVar.I.setDuration(180L);
                    tkVar.I.start();
                }
                return;
            }
        }
        z11 = false;
        if (!z11) {
        }
        s0Var.setEnabled(z11);
        if (z11) {
        }
        if (z11) {
        }
        s0Var.setTag(z11 ? 1 : null);
        animatorSet = tkVar.I;
        if (animatorSet != null) {
        }
        if (z11) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        tkVar.I = animatorSet22;
        ik ikVar2 = tkVar.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(ikVar2, (Property<ik, Float>) property2, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(s0Var, (Property<fg.s0, Float>) property2, !z11 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(tkVar.J, (Property<a10, Float>) property2, !z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(tkVar.L, (Property<hk, Float>) property2, z11 ? AndroidUtilities.dp(44.0f) : 0.0f));
        tkVar.I.addListener(new org.telegram.ui.Cells.v5(this, 28));
        tkVar.I.setInterpolator(wr.g);
        tkVar.I.setDuration(180L);
        tkVar.I.start();
    }

    @Override // org.telegram.ui.Components.rl0, s4.h0
    public final void l() {
        X(false);
        this.X.T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        View view;
        tk tkVar = this.X;
        Context context = this.r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    a10 a10Var = new a10(context, tkVar.a);
                    a10Var.setViewType(3);
                    a10Var.setIsSingleCell(true);
                    u3Var = a10Var;
                } else if (i10 != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
                }
            }
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, i10 == 1 ? 1 : 2, tkVar.a);
            l7Var.setDrawDownloadIcon(false);
            view = l7Var;
            return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
        }
        u3Var = new org.telegram.ui.Cells.u3(context, tkVar.a);
        view = u3Var;
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
