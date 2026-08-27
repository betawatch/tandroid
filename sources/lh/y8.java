package lh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;

    public /* synthetic */ y8(k9 k9Var, int i10) {
        this.a = i10;
        this.b = k9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        o9 o9Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.a) {
            case 0:
                k9 k9Var = this.b;
                HashMap hashMap = k9Var.d;
                ArrayList arrayList = k9Var.c;
                q9 q9Var = k9Var.S;
                d dVar = k9Var.v;
                if (!dVar.J) {
                    i10 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                    HashMap hashMap2 = q9Var.e;
                    ArrayList arrayList2 = q9Var.d;
                    HashMap hashMap3 = q9Var.r;
                    ArrayList arrayList3 = q9Var.n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = k9Var.a;
                    if (i19 == 5) {
                        a9 a9Var = q9Var.R;
                        if (a9Var != null) {
                            a9Var.run(arrayList);
                        }
                        q9Var.dismiss();
                        break;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new cg.g0(k9Var, messagesController, 17));
                        break;
                    } else if (i19 == 0) {
                        int i20 = q9Var.J;
                        if (i20 == 3) {
                            HashSet l1 = q9.l1(arrayList3, hashMap3);
                            int i21 = q9Var.J;
                            i17 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                            o9Var = new o9(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = o9Var.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = o9Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                            o9Var = new o9(i20, i16, q9Var.h);
                        } else if (i20 == 4) {
                            HashSet l12 = q9.l1(arrayList2, hashMap2);
                            int i22 = q9Var.J;
                            i15 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                            o9Var = new o9(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = o9Var.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = o9Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            i14 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                            o9Var = new o9(i20, i14, (ArrayList) null);
                        }
                        q9Var.g1(o9Var, new jh.u3(q9Var, 1), false);
                        break;
                    } else if (i19 == 2) {
                        if (q9Var.V) {
                            q9Var.f1();
                            i13 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                            q9Var.g1(new o9(2, i13, arrayList), new jh.u3(q9Var, 1), false);
                            break;
                        } else {
                            q9Var.f1();
                            q9Var.b.D(0);
                            break;
                        }
                    } else if (i19 != 3) {
                        if (i19 == 6) {
                            HashSet l13 = q9.l1(arrayList, hashMap);
                            dVar.setLoading(true);
                            i11 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                            jh.s6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                            z8 z8Var = new z8(k9Var, 1);
                            int i23 = storiesController.a;
                            TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                            tL_contacts_setBlocked.my_stories_from = true;
                            HashSet hashSet = storiesController.L;
                            tL_contacts_setBlocked.limit = hashSet.size();
                            int size = storiesController.N - hashSet.size();
                            storiesController.N = size;
                            if (size < 0) {
                                storiesController.N = 0;
                            }
                            hashSet.clear();
                            Iterator it = l13.iterator();
                            while (it.hasNext()) {
                                Long l10 = (Long) it.next();
                                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i23).getInputPeer(l10.longValue());
                                if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                    hashSet.add(l10);
                                    tL_contacts_setBlocked.id.add(inputPeer);
                                }
                            }
                            storiesController.N = hashSet.size() + storiesController.N;
                            tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                            ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new cf.a(z8Var, 11));
                            break;
                        } else {
                            q9Var.J = i19;
                            q9Var.f1();
                            q9Var.b.D(0);
                            break;
                        }
                    } else if (q9Var.V) {
                        HashSet l14 = q9.l1(arrayList, hashMap);
                        if (!l14.isEmpty()) {
                            q9Var.f1();
                            i12 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                            o9 o9Var2 = new o9(3, i12, new ArrayList(l14));
                            ArrayList arrayList6 = o9Var2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = o9Var2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            q9Var.g1(o9Var2, new z8(k9Var, 0), false);
                            break;
                        }
                    } else if (!q9.l1(arrayList, hashMap).isEmpty()) {
                        q9Var.J = 3;
                        q9Var.f1();
                        q9Var.b.D(0);
                        break;
                    }
                }
                break;
            case 1:
                k9 k9Var2 = this.b;
                q9 q9Var2 = k9Var2.S;
                if (q9Var2.K) {
                    q9Var2.I = 5;
                    q9Var2.b.D(1);
                    break;
                } else {
                    Context context = k9Var2.getContext();
                    c6Var = ((org.telegram.ui.ActionBar.e3) q9Var2).resourcesProvider;
                    q9 q9Var3 = new q9(context, c6Var);
                    q9Var3.R = new a9(k9Var2, 1);
                    q9Var3.M = q9Var2.M;
                    q9Var3.show();
                    break;
                }
            default:
                k9 k9Var3 = this.b;
                HashMap hashMap7 = k9Var3.d;
                a0.h hVar = k9Var3.b;
                ArrayList arrayList7 = k9Var3.c;
                int size2 = arrayList7.size();
                int i24 = 0;
                while (i24 < size2) {
                    Object obj = arrayList7.get(i24);
                    i24++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        Object obj2 = arrayList8.get(i25);
                        i25++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                k9Var3.S.F.clear();
                k9Var3.x.c.a();
                k9Var3.f(true);
                k9Var3.e(true);
                break;
        }
    }
}
