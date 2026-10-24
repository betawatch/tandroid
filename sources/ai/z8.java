package ai;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.q00;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z8(Object obj, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        switch (this.a) {
            case 0:
                ha haVar = (ha) this.d;
                if (!this.c) {
                    haVar.getClass();
                    break;
                } else {
                    Set set = haVar.Q;
                    int i10 = this.b;
                    set.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) haVar.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                i2.q0 q0Var = (i2.q0) this.d;
                j2.e eVar = q0Var.M;
                i2.q1[] q1VarArr = q0Var.a;
                int i11 = this.b;
                int i12 = q1VarArr[i11].a.b;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1033, new ih.l(p5, i11, i12, this.c));
                break;
            case 2:
                ((og0) this.d).a.b.A3(this.b, this.c);
                break;
            case 3:
                zn0 zn0Var = (zn0) this.d;
                zn0Var.o = null;
                zn0Var.c(this.b, this.c, true);
                break;
            case 4:
                xv0 xv0Var = ((pt0) this.d).a;
                org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
                if (o2Var != null) {
                    boolean z10 = this.c;
                    int i13 = this.b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = xv0.f0(i13, true);
                        tL_channels_setMainProfileTab.channel = o2Var.getMessagesController().getInputChannel(xv0Var.d1.id);
                        TLRPC.ChatFull chatFull = xv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab f02 = xv0.f0(i13, true);
                        tL_account_setMainProfileTab2.tab = f02;
                        TLRPC.UserFull userFull = xv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = f02;
                            o2Var.getMessagesStorage().updateUserInfo(xv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    o2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    xv0Var.A1(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0((q00) this.d);
                boolean z11 = this.c;
                int i14 = z11 ? R.raw.folder_in : R.raw.folder_out;
                int i15 = this.b;
                org.telegram.ui.Components.qc M = a02.M(z11 ? LocaleController.formatPluralString("FolderLinkAddedChats", i15, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i15, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i14);
                M.j = 5000;
                M.j();
                break;
        }
    }

    public /* synthetic */ z8(Object obj, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = z10;
        this.b = i10;
    }
}
