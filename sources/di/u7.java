package di;

import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.so;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.hz;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u7(Object obj, int i7, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i7 = this.a;
        int i10 = this.b;
        boolean z10 = this.c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                v8 v8Var = (v8) obj;
                if (!z10) {
                    v8Var.getClass();
                    break;
                } else {
                    v8Var.Q.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) v8Var.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                l2.o0 o0Var = (l2.o0) obj;
                m2.e eVar = o0Var.N;
                int i11 = o0Var.a[i10].a.b;
                m2.a U = eVar.U();
                eVar.V(U, 1033, new li.p(U, i10, i11, z10));
                break;
            case 2:
                np npVar = (np) obj;
                int i12 = 0;
                while (i12 < npVar.Q0.size()) {
                    if (((so) npVar.Q0.get(i12)).a == i10) {
                        npVar.Q0.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                npVar.R0 = null;
                npVar.S0.clear();
                npVar.getNotificationCenter().k(ns.O2, new Object[0]);
                if (z10) {
                    npVar.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 3:
                HashMap hashMap = ((ez) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i10));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i10));
                    break;
                }
                break;
            case 4:
                ((zd0) obj).a.b.x3(i10, z10);
                break;
            case 5:
                kl0 kl0Var = (kl0) obj;
                kl0Var.o = null;
                kl0Var.c(i10, z10, true);
                break;
            case 6:
                ys0 ys0Var = ((xq0) obj).a;
                org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
                if (e2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = ys0.o0(i10, true);
                        tL_channels_setMainProfileTab.channel = e2Var.getMessagesController().h1(ys0Var.g1.id);
                        TLRPC.ChatFull chatFull = ys0Var.g1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = ys0.o0(i10, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = ys0Var.h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = o02;
                            e2Var.getMessagesStorage().j2(ys0Var.h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    e2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    ys0Var.P1(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0((hz) obj).I(z10 ? R.raw.folder_in : R.raw.folder_out, z10 ? hd.G(i10, "FolderLinkAddedChats", new Object[0]) : hd.G(i10, "FolderLinkRemovedChats", new Object[0]), hd.M0(2131750668, null));
                I.j = 5000;
                I.j();
                break;
        }
    }

    public /* synthetic */ u7(Object obj, boolean z10, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.b = i7;
    }
}
