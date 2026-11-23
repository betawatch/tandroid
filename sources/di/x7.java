package di;

import java.util.HashMap;
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.so;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.kz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                l2.o0 o0Var = (l2.o0) obj;
                m2.d dVar = o0Var.N;
                int i11 = o0Var.a[i10].a.b;
                m2.a U = dVar.U();
                dVar.V(U, 1033, new li.c(U, i10, i11, z10));
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
                npVar.getNotificationCenter().k(ls.O2, new Object[0]);
                if (z10) {
                    npVar.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 3:
                HashMap hashMap = ((az) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i10));
                if (bool != null && bool.booleanValue() == z10) {
                    hashMap.remove(Integer.valueOf(i10));
                    break;
                }
                break;
            case 4:
                ((ke0) obj).a.b.x3(i10, z10);
                break;
            case 5:
                ul0 ul0Var = (ul0) obj;
                ul0Var.o = null;
                ul0Var.c(i10, z10, true);
                break;
            case 6:
                jt0 jt0Var = ((hr0) obj).a;
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
                if (g2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = jt0.o0(i10, true);
                        tL_channels_setMainProfileTab.channel = g2Var.getMessagesController().j1(jt0Var.g1.id);
                        TLRPC.ChatFull chatFull = jt0Var.g1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = jt0.o0(i10, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = jt0Var.h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = o02;
                            g2Var.getMessagesStorage().j2(jt0Var.h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    g2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    jt0Var.P1(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0((kz) obj).I(z10 ? R.raw.folder_in : R.raw.folder_out, z10 ? hd.G(i10, "FolderLinkAddedChats", new Object[0]) : hd.G(i10, "FolderLinkRemovedChats", new Object[0]), hd.N0(2131750651, null));
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
