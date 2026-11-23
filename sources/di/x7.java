package di;

import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ro;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.jz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x7(Object obj, int i7, boolean z10, int i10) {
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
                y8 y8Var = (y8) obj;
                if (!z10) {
                    y8Var.getClass();
                    break;
                } else {
                    y8Var.Q.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) y8Var.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                l2.p0 p0Var = (l2.p0) obj;
                m2.d dVar = p0Var.N;
                int i11 = p0Var.a[i10].a.b;
                m2.a U = dVar.U();
                dVar.V(U, 1033, new li.c(U, i10, i11, z10));
                break;
            case 2:
                mp mpVar = (mp) obj;
                int i12 = 0;
                while (i12 < mpVar.Q0.size()) {
                    if (((ro) mpVar.Q0.get(i12)).a == i10) {
                        mpVar.Q0.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                mpVar.R0 = null;
                mpVar.S0.clear();
                mpVar.getNotificationCenter().k(ks.O2, new Object[0]);
                if (z10) {
                    mpVar.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 3:
                HashMap hashMap = ((zy) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i10));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i10));
                    break;
                }
                break;
            case 4:
                ((je0) obj).a.b.z3(i10, z10);
                break;
            case 5:
                ul0 ul0Var = (ul0) obj;
                ul0Var.o = null;
                ul0Var.c(i10, z10, true);
                break;
            case 6:
                it0 it0Var = ((gr0) obj).a;
                org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
                if (g2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = it0.o0(i10, true);
                        tL_channels_setMainProfileTab.channel = g2Var.getMessagesController().j1(it0Var.g1.id);
                        TLRPC.ChatFull chatFull = it0Var.g1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = it0.o0(i10, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = it0Var.h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = o02;
                            g2Var.getMessagesStorage().j2(it0Var.h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    g2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    it0Var.P1(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.fc I = org.telegram.ui.Components.kc.b0((jz) obj).I(z10 ? R.raw.folder_in : R.raw.folder_out, z10 ? gd.G(i10, "FolderLinkAddedChats", new Object[0]) : gd.G(i10, "FolderLinkRemovedChats", new Object[0]), gd.N0(2131750651, null));
                I.j = 5000;
                I.j();
                break;
        }
    }

    public /* synthetic */ x7(Object obj, boolean z10, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.b = i7;
    }
}
