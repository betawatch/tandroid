package ci;

import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.mo;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.ez;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c8(Object obj, int i3, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i3;
        this.c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i3 = this.a;
        int i10 = this.b;
        boolean z10 = this.c;
        Object obj = this.d;
        switch (i3) {
            case 0:
                e9 e9Var = (e9) obj;
                if (!z10) {
                    e9Var.getClass();
                    break;
                } else {
                    e9Var.Q.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) e9Var.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                k2.r0 r0Var = (k2.r0) obj;
                l2.f fVar = r0Var.N;
                int i11 = r0Var.a[i10].a.b;
                l2.a U = fVar.U();
                fVar.V(U, 1033, new l2.c(i10, i11, U, z10));
                break;
            case 2:
                hp hpVar = (hp) obj;
                int i12 = 0;
                while (i12 < hpVar.Q0.size()) {
                    if (((mo) hpVar.Q0.get(i12)).a == i10) {
                        hpVar.Q0.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                hpVar.R0 = null;
                hpVar.S0.clear();
                hpVar.getNotificationCenter().k(hs.O2, new Object[0]);
                if (z10) {
                    hpVar.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 3:
                HashMap hashMap = ((yy) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i10));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i10));
                    break;
                }
                break;
            case 4:
                ((td0) obj).a.b.B3(i10, z10);
                break;
            case 5:
                jl0 jl0Var = (jl0) obj;
                jl0Var.o = null;
                jl0Var.c(i10, z10, true);
                break;
            case 6:
                ws0 ws0Var = ((uq0) obj).a;
                org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
                if (d2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = ws0.o0(i10, true);
                        tL_channels_setMainProfileTab.channel = d2Var.getMessagesController().h1(ws0Var.g1.id);
                        TLRPC.ChatFull chatFull = ws0Var.g1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = ws0.o0(i10, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = ws0Var.h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = o02;
                            d2Var.getMessagesStorage().j2(ws0Var.h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    d2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    ws0Var.N1(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0((ez) obj).I(z10 ? R.raw.folder_in : R.raw.folder_out, z10 ? bd.G(i10, "FolderLinkAddedChats", new Object[0]) : bd.G(i10, "FolderLinkRemovedChats", new Object[0]), bd.M0(2131750669, null));
                I.j = 5000;
                I.j();
                break;
        }
    }

    public /* synthetic */ c8(Object obj, boolean z10, int i3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.b = i3;
    }
}
