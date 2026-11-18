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
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.kz;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                x8 x8Var = (x8) obj;
                if (!z10) {
                    x8Var.getClass();
                    break;
                } else {
                    x8Var.Q.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) x8Var.R.remove(Integer.valueOf(i10));
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
                ((je0) obj).a.b.x3(i10, z10);
                break;
            case 5:
                sl0 sl0Var = (sl0) obj;
                sl0Var.o = null;
                sl0Var.c(i10, z10, true);
                break;
            case 6:
                gt0 gt0Var = ((fr0) obj).a;
                org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
                if (h2Var != null) {
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = gt0.o0(i10, true);
                        tL_channels_setMainProfileTab.channel = h2Var.getMessagesController().j1(gt0Var.g1.id);
                        TLRPC.ChatFull chatFull = gt0Var.g1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = gt0.o0(i10, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = gt0Var.h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = o02;
                            h2Var.getMessagesStorage().j2(gt0Var.h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    h2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    gt0Var.P1(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0((kz) obj).I(z10 ? R.raw.folder_in : R.raw.folder_out, z10 ? gd.G(i10, "FolderLinkAddedChats", new Object[0]) : gd.G(i10, "FolderLinkRemovedChats", new Object[0]), gd.M0(2131750652, null));
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
