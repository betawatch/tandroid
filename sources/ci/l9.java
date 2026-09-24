package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ l9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        da daVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.a) {
            case 0:
                y9 y9Var = this.b;
                HashMap hashMap = y9Var.d;
                ArrayList arrayList = y9Var.c;
                fa faVar = y9Var.W;
                d dVar = y9Var.v;
                if (!dVar.N) {
                    i10 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                    HashMap hashMap2 = faVar.e;
                    ArrayList arrayList2 = faVar.d;
                    HashMap hashMap3 = faVar.r;
                    ArrayList arrayList3 = faVar.n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = y9Var.a;
                    if (i19 == 5) {
                        n9 n9Var = faVar.V;
                        if (n9Var != null) {
                            n9Var.run(arrayList);
                        }
                        faVar.dismiss();
                        break;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new ai.v1(7, y9Var, messagesController));
                        break;
                    } else if (i19 == 0) {
                        int i20 = faVar.N;
                        if (i20 == 3) {
                            HashSet l1 = fa.l1(arrayList3, hashMap3);
                            int i21 = faVar.N;
                            i17 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                            daVar = new da(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = daVar.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = daVar.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                            daVar = new da(i20, i16, faVar.h);
                        } else if (i20 == 4) {
                            HashSet l12 = fa.l1(arrayList2, hashMap2);
                            int i22 = faVar.N;
                            i15 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                            daVar = new da(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = daVar.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = daVar.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            i14 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                            daVar = new da(i20, i14, (ArrayList) null);
                        }
                        faVar.g1(daVar, new ai.r5(faVar, 1), false);
                        break;
                    } else if (i19 == 2) {
                        if (faVar.Z) {
                            faVar.f1();
                            i13 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                            faVar.g1(new da(2, i13, arrayList), new ai.r5(faVar, 1), false);
                            break;
                        } else {
                            faVar.f1();
                            faVar.b.D(0);
                            break;
                        }
                    } else if (i19 != 3) {
                        if (i19 == 6) {
                            HashSet l13 = fa.l1(arrayList, hashMap);
                            dVar.setLoading(true);
                            i11 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                            ai.l9 storiesController = MessagesController.getInstance(i11).getStoriesController();
                            m9 m9Var = new m9(y9Var, 1);
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
                                Long l4 = (Long) it.next();
                                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i23).getInputPeer(l4.longValue());
                                if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                    hashSet.add(l4);
                                    tL_contacts_setBlocked.id.add(inputPeer);
                                }
                            }
                            storiesController.N = hashSet.size() + storiesController.N;
                            tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                            ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new ai.n8(m9Var, 0));
                            break;
                        } else {
                            faVar.N = i19;
                            faVar.f1();
                            faVar.b.D(0);
                            break;
                        }
                    } else if (faVar.Z) {
                        HashSet l14 = fa.l1(arrayList, hashMap);
                        if (!l14.isEmpty()) {
                            faVar.f1();
                            i12 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                            da daVar2 = new da(3, i12, new ArrayList(l14));
                            ArrayList arrayList6 = daVar2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = daVar2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            faVar.g1(daVar2, new m9(y9Var, 0), false);
                            break;
                        }
                    } else if (!fa.l1(arrayList, hashMap).isEmpty()) {
                        faVar.N = 3;
                        faVar.f1();
                        faVar.b.D(0);
                        break;
                    }
                }
                break;
            case 1:
                y9 y9Var2 = this.b;
                fa faVar2 = y9Var2.W;
                if (faVar2.O) {
                    faVar2.M = 5;
                    faVar2.b.D(1);
                    break;
                } else {
                    Context context = y9Var2.getContext();
                    d6Var = ((org.telegram.ui.ActionBar.e3) faVar2).resourcesProvider;
                    fa faVar3 = new fa(context, d6Var);
                    faVar3.V = new n9(y9Var2, 1);
                    faVar3.Q = faVar2.Q;
                    faVar3.show();
                    break;
                }
            default:
                y9 y9Var3 = this.b;
                HashMap hashMap7 = y9Var3.d;
                a0.i iVar = y9Var3.b;
                ArrayList arrayList7 = y9Var3.c;
                int size2 = arrayList7.size();
                int i24 = 0;
                while (i24 < size2) {
                    Object obj = arrayList7.get(i24);
                    i24++;
                    iVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        Object obj2 = arrayList8.get(i25);
                        i25++;
                        iVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                y9Var3.W.J.clear();
                y9Var3.x.c.a();
                y9Var3.f(true);
                y9Var3.e(true);
                break;
        }
    }
}
