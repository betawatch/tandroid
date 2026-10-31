package i2;

import java.util.HashMap;
import org.telegram.messenger.ap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.i00;
import rh.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                vp vpVar = (vp) obj;
                int i13 = 0;
                while (i13 < vpVar.P0.size()) {
                    if (((ap) vpVar.P0.get(i13)).a == i11) {
                        vpVar.P0.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                vpVar.Q0 = null;
                vpVar.R0.clear();
                vpVar.getNotificationCenter().k(zs.O2, new Object[0]);
                if (z10) {
                    vpVar.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 2:
                HashMap hashMap = ((qz) obj).H;
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
                im0 im0Var = (im0) obj;
                im0Var.o = null;
                im0Var.c(i11, z10, true);
                break;
            case 5:
                zt0 zt0Var = ((vr0) obj).a;
                k2 k2Var = zt0Var.x1;
                if (k2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = zt0.m0(i11, true);
                        tL_channels_setMainProfileTab.channel = k2Var.getMessagesController().g1(zt0Var.f1.id);
                        TLRPC.ChatFull chatFull = zt0Var.f1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab m0 = zt0.m0(i11, true);
                        tL_account_setMainProfileTab2.tab = m0;
                        TLRPC.UserFull userFull = zt0Var.g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = m0;
                            k2Var.getMessagesStorage().j2(zt0Var.g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    k2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    zt0Var.K1(true);
                    break;
                }
                break;
            case 6:
                wb I = cc.a0((i00) obj).I(z10 ? R.raw.folder_in : R.raw.folder_out, z10 ? cd.G(i11, "FolderLinkAddedChats", new Object[0]) : cd.G(i11, "FolderLinkRemovedChats", new Object[0]), cd.L0(2131750669, null));
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
