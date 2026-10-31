package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ TLRPC.TL_error h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ tj(wj wjVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = wjVar;
        this.c = i10;
        this.h = tL_error;
        this.b = tLObject;
        this.r = cVar;
        this.f = z10;
        this.s = str;
        this.w = arrayList;
        this.d = j10;
        this.e = j11;
        this.x = arrayList2;
        this.y = arrayList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0361, code lost:
    
        if (r3.getChildCount() > 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0367, code lost:
    
        r8.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.uq(r13, (org.telegram.ui.Components.zz) r2, r1, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0375, code lost:
    
        r13.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0365, code lost:
    
        if (r2 != null) goto L123;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        View view;
        int i11;
        ArrayList arrayList;
        int i12;
        TLRPC.User user;
        int i13;
        TL_payments.connectedBotStarRef connectedbotstarref;
        org.telegram.ui.ActionBar.k2 T;
        int i14 = this.a;
        TLRPC.TL_error tL_error = this.h;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.w;
        boolean z10 = this.f;
        long j10 = this.e;
        Object obj4 = this.s;
        Object obj5 = this.r;
        TLObject tLObject = this.b;
        Object obj6 = this.n;
        switch (i14) {
            case 0:
                wj wjVar = (wj) obj6;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj5;
                String str = (String) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = wjVar.P;
                SparseArray sparseArray = wjVar.O;
                ArrayList arrayList6 = wjVar.M;
                HashMap hashMap = wjVar.Q;
                ArrayList arrayList7 = wjVar.N;
                ArrayList arrayList8 = wjVar.L;
                xj xjVar = wjVar.X;
                kj kjVar = xjVar.L;
                if (this.c == wjVar.T) {
                    wjVar.S = false;
                    if (tL_error != null) {
                        nh.p pVar = kjVar.d;
                        p80 p80Var = kjVar.e;
                        pVar.setText(org.telegram.messenger.cd.L0(2131745817, null));
                        p80Var.setVisibility(0);
                        p80Var.setText(org.telegram.messenger.cd.L0(2131745824, null));
                        kjVar.e(false, true);
                        break;
                    } else {
                        lj ljVar = xjVar.r;
                        kjVar.e(false, true);
                        p80 p80Var2 = kjVar.e;
                        nh.p pVar2 = kjVar.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        wjVar.G = messages_messages.next_rate;
                        int i15 = cVar.a;
                        lj ljVar2 = ljVar;
                        org.telegram.messenger.hs.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        org.telegram.messenger.vp.r1(i15).V3(messages_messages.users, false);
                        org.telegram.messenger.vp.r1(i15).P3(messages_messages.chats, false);
                        if (!z10) {
                            arrayList7.clear();
                            sparseArray.clear();
                            arrayList5.clear();
                            hashMap.clear();
                        }
                        int i16 = messages_messages.count;
                        wjVar.K = str;
                        int size = arrayList2.size();
                        int i17 = 0;
                        while (i17 < size) {
                            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i17);
                            String str2 = jjVar.Y;
                            ArrayList arrayList9 = (ArrayList) hashMap.get(str2);
                            ArrayList arrayList10 = arrayList2;
                            if (arrayList9 == null) {
                                arrayList = new ArrayList();
                                hashMap.put(str2, arrayList);
                                arrayList5.add(str2);
                            } else {
                                arrayList = arrayList9;
                            }
                            arrayList.add(jjVar);
                            arrayList7.add(jjVar);
                            sparseArray.put(jjVar.f1(), jjVar);
                            i17++;
                            arrayList2 = arrayList10;
                        }
                        if (arrayList7.size() > i16) {
                            i16 = arrayList7.size();
                        }
                        wjVar.V = arrayList7.size() >= i16;
                        if (arrayList7.isEmpty()) {
                            if (TextUtils.isEmpty(wjVar.K) && this.d == 0 && j10 == 0) {
                                pVar2.setText(org.telegram.messenger.cd.L0(2131745818, null));
                                p80Var2.setVisibility(0);
                                p80Var2.setText(org.telegram.messenger.cd.L0(2131745823, null));
                            } else {
                                pVar2.setText(org.telegram.messenger.cd.L0(2131745817, null));
                                p80Var2.setVisibility(0);
                                p80Var2.setText(org.telegram.messenger.cd.L0(2131745824, null));
                            }
                        }
                        if (z10) {
                            i10 = 0;
                            view = null;
                        } else {
                            arrayList8.clear();
                            if (arrayList3 != null) {
                                arrayList8.addAll(arrayList3);
                            }
                            if (str.length() >= 3) {
                                view = null;
                                if (org.telegram.messenger.cd.L0(2131745918, null).toLowerCase().startsWith(str) || "saved messages".startsWith(str)) {
                                    for (int i18 = 0; i18 < arrayList8.size(); i18++) {
                                        if (!(arrayList8.get(i18) instanceof TLRPC.User) || org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f().id != ((TLRPC.User) arrayList8.get(i18)).id) {
                                        }
                                    }
                                    i10 = 0;
                                    arrayList8.add(0, org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f());
                                }
                                i10 = 0;
                            } else {
                                i10 = 0;
                                view = null;
                            }
                            arrayList6.clear();
                            arrayList6.addAll(arrayList4);
                            wjVar.a0(arrayList8, arrayList6, TextUtils.isEmpty(wjVar.K));
                        }
                        int i19 = -1;
                        int i20 = i10;
                        View view2 = view;
                        while (i20 < size) {
                            lj ljVar3 = ljVar2;
                            View childAt = ljVar3.getChildAt(i20);
                            if (childAt instanceof zz) {
                                i19 = RecyclerView.R(childAt);
                                view2 = childAt;
                            }
                            i20++;
                            ljVar2 = ljVar3;
                        }
                        lj ljVar4 = ljVar2;
                        if (view2 != null) {
                            ljVar4.removeView(view2);
                        }
                        if (xjVar.J.getVisibility() == 0) {
                            i11 = 1;
                            break;
                        } else {
                            i11 = 1;
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ((vh.d) obj6).setLoading(false);
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i21 = this.c;
                    rh.r g10 = rh.r.g(i21);
                    long j11 = this.d;
                    rh.n d = g10.d(j11);
                    int i22 = d.a;
                    org.telegram.messenger.vp.r1(i22).V3(connectedstarrefbots.users, false);
                    d.c = 0;
                    d.h = false;
                    d.d = false;
                    ArrayList arrayList11 = d.e;
                    arrayList11.clear();
                    if (d.i != 0) {
                        i12 = i21;
                        user = user2;
                        ConnectionsManager.getInstance(i22).cancelRequest(d.i, true);
                        d.i = 0;
                    } else {
                        i12 = i21;
                        user = user2;
                    }
                    d.g = false;
                    d.c = connectedstarrefbots.count;
                    arrayList11.addAll(connectedstarrefbots.connected_bots);
                    d.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList11.size() >= d.c;
                    d.h = false;
                    int i23 = 0;
                    org.telegram.messenger.zs.f(i22).k(org.telegram.messenger.zs.L3, Long.valueOf(d.b));
                    d.a();
                    z2Var.dismiss();
                    int i24 = 0;
                    while (true) {
                        if (i24 < connectedstarrefbots.connected_bots.size()) {
                            TL_payments.connectedBotStarRef connectedbotstarref2 = connectedstarrefbots.connected_bots.get(i24);
                            i13 = i23;
                            connectedbotstarref = connectedbotstarref2;
                            if (connectedbotstarref2.bot_id != starrefprogram.bot_id) {
                                i24++;
                                i23 = i13;
                            }
                        } else {
                            i13 = i23;
                            connectedbotstarref = null;
                        }
                    }
                    if ((j10 != j11 || z10) && (T = LaunchActivity.T()) != null && (!(T instanceof xh.z2) || ((xh.z2) T).R != j11)) {
                        T.presentFragment(new xh.z2(j11));
                    }
                    if (connectedbotstarref != null) {
                        rh.p e = rh.r.g(i12).e(j11);
                        long j12 = connectedbotstarref.bot_id;
                        ArrayList arrayList12 = e.e;
                        int i25 = i13;
                        while (true) {
                            if (i25 < arrayList12.size()) {
                                if (((TL_payments.starRefProgram) arrayList12.get(i25)).bot_id == j12) {
                                    arrayList12.remove(i25);
                                    e.c--;
                                    org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(e.a);
                                    Object[] objArr = new Object[1];
                                    objArr[i13] = Long.valueOf(e.b);
                                    f7.k(org.telegram.messenger.zs.K3, objArr);
                                } else {
                                    i25++;
                                }
                            }
                        }
                        cc ccVar = new cc(xh.z2.J0(context, i12, connectedbotstarref, j11, p6Var).E, p6Var);
                        String L0 = org.telegram.messenger.cd.L0(2131754335, null);
                        String L02 = org.telegram.messenger.cd.L0(2131754336, null);
                        TLObject[] tLObjectArr = new TLObject[1];
                        tLObjectArr[i13] = user;
                        ccVar.V(Arrays.asList(tLObjectArr), L0, L02, null).j();
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.f1.s(z2Var.E, p6Var, tL_error, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ tj(vh.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.z2 z2Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.b = tLObject;
        this.c = i10;
        this.d = j10;
        this.r = z2Var;
        this.s = starrefprogram;
        this.e = j11;
        this.f = z10;
        this.w = context;
        this.x = p6Var;
        this.y = user;
        this.h = tL_error;
    }
}
