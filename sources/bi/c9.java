package bi;

import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.vo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.zd0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c9(Object obj, int i7, boolean z9, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i7 = this.a;
        int i10 = this.b;
        boolean z9 = this.c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                ea eaVar = (ea) obj;
                if (!z9) {
                    eaVar.getClass();
                    break;
                } else {
                    eaVar.Q.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) eaVar.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                l2.r0 r0Var = (l2.r0) obj;
                m2.e eVar = r0Var.M;
                int i11 = r0Var.a[i10].a.b;
                m2.a U = eVar.U();
                eVar.V(U, 1033, new m2.c(U, i10, i11, z9));
                break;
            case 2:
                qp qpVar = (qp) obj;
                int i12 = 0;
                while (i12 < qpVar.P0.size()) {
                    if (((vo) qpVar.P0.get(i12)).a == i10) {
                        qpVar.P0.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                qpVar.Q0 = null;
                qpVar.R0.clear();
                qpVar.getNotificationCenter().k(qs.O2, new Object[0]);
                if (z9) {
                    qpVar.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 3:
                HashMap hashMap = ((gz) obj).H;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i10));
                if (bool != null && bool.booleanValue() == z9) {
                    hashMap.remove(Integer.valueOf(i10));
                    break;
                }
                break;
            case 4:
                ((zd0) obj).a.b.w3(i10, z9);
                break;
            case 5:
                fl0 fl0Var = (fl0) obj;
                fl0Var.o = null;
                fl0Var.c(i10, z9, true);
                break;
            case 6:
                xs0 xs0Var = ((uq0) obj).a;
                org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
                if (f2Var != null) {
                    if (z9) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = xs0.o0(i10, true);
                        tL_channels_setMainProfileTab.channel = f2Var.getMessagesController().h1(xs0Var.f1.id);
                        TLRPC.ChatFull chatFull = xs0Var.f1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab o02 = xs0.o0(i10, true);
                        tL_account_setMainProfileTab2.tab = o02;
                        TLRPC.UserFull userFull = xs0Var.g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = o02;
                            f2Var.getMessagesStorage().j2(xs0Var.g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    f2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    xs0Var.N1(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0((org.telegram.ui.gz) obj).I(z9 ? R.raw.folder_in : R.raw.folder_out, z9 ? org.telegram.messenger.id.G(i10, "FolderLinkAddedChats", new Object[0]) : org.telegram.messenger.id.G(i10, "FolderLinkRemovedChats", new Object[0]), org.telegram.messenger.id.M0(2131750669, null));
                I.j = 5000;
                I.j();
                break;
        }
    }

    public /* synthetic */ c9(Object obj, boolean z9, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z9;
        this.b = i7;
    }
}
