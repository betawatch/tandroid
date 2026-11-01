package i2;

import java.util.HashMap;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bp;
import org.telegram.messenger.dd;
import org.telegram.messenger.rz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.h00;
import rh.e6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j0(Object obj, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10 = this.a;
        int i11 = this.b;
        boolean z10 = this.c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) obj;
                j2.g gVar = s0Var.M;
                int i12 = s0Var.a[i11].a.b;
                j2.a U = gVar.U();
                gVar.V(U, 1033, new j2.c(U, i11, i12, z10));
                break;
            case 1:
                wp wpVar = (wp) obj;
                int i13 = 0;
                while (i13 < wpVar.P0.size()) {
                    if (((bp) wpVar.P0.get(i13)).a == i11) {
                        wpVar.P0.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                wpVar.Q0 = null;
                wpVar.R0.clear();
                wpVar.getNotificationCenter().k(at.O2, new Object[0]);
                if (z10) {
                    wpVar.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 2:
                HashMap hashMap = ((rz) obj).H;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i11));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i11));
                    break;
                }
                break;
            case 3:
                ((ue0) obj).a.b.B3(i11, z10);
                break;
            case 4:
                jm0 jm0Var = (jm0) obj;
                jm0Var.o = null;
                jm0Var.c(i11, z10, true);
                break;
            case 5:
                au0 au0Var = ((wr0) obj).a;
                k2 k2Var = au0Var.x1;
                if (k2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = au0.n0(i11, true);
                        tL_channels_setMainProfileTab.channel = k2Var.getMessagesController().g1(au0Var.f1.id);
                        TLRPC.ChatFull chatFull = au0Var.f1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab n02 = au0.n0(i11, true);
                        tL_account_setMainProfileTab2.tab = n02;
                        TLRPC.UserFull userFull = au0Var.g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = n02;
                            k2Var.getMessagesStorage().j2(au0Var.g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    k2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    au0Var.L1(true);
                    break;
                }
                break;
            case 6:
                wb I = cc.a0((h00) obj).I(z10 ? R.raw.folder_in : R.raw.folder_out, z10 ? dd.G(i11, "FolderLinkAddedChats", new Object[0]) : dd.G(i11, "FolderLinkRemovedChats", new Object[0]), dd.L0(2131750669, null));
                I.j = 5000;
                I.j();
                break;
            default:
                e6 e6Var = (e6) obj;
                if (!z10) {
                    e6Var.getClass();
                    break;
                } else {
                    e6Var.Q.remove(Integer.valueOf(i11));
                    Runnable runnable = (Runnable) e6Var.R.remove(Integer.valueOf(i11));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ j0(Object obj, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = z10;
        this.b = i10;
    }
}
