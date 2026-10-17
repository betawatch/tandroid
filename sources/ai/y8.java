package ai;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.p00;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y8(Object obj, int i10, boolean z10, int i11) {
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
                fa faVar = (fa) this.d;
                if (!this.c) {
                    faVar.getClass();
                    break;
                } else {
                    Set set = faVar.Q;
                    int i10 = this.b;
                    set.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) faVar.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                i2.p0 p0Var = (i2.p0) this.d;
                j2.f fVar = p0Var.M;
                i2.p1[] p1VarArr = p0Var.a;
                int i11 = this.b;
                int i12 = p1VarArr[i11].a.b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new j2.c(p5, i11, i12, this.c));
                break;
            case 2:
                ((jg0) this.d).a.b.y3(this.b, this.c);
                break;
            case 3:
                vn0 vn0Var = (vn0) this.d;
                vn0Var.o = null;
                vn0Var.c(this.b, this.c, true);
                break;
            case 4:
                sv0 sv0Var = ((kt0) this.d).a;
                org.telegram.ui.ActionBar.n2 n2Var = sv0Var.v1;
                if (n2Var != null) {
                    boolean z10 = this.c;
                    int i13 = this.b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = sv0.e0(i13, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(sv0Var.d1.id);
                        TLRPC.ChatFull chatFull = sv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab e02 = sv0.e0(i13, true);
                        tL_account_setMainProfileTab2.tab = e02;
                        TLRPC.UserFull userFull = sv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = e02;
                            n2Var.getMessagesStorage().updateUserInfo(sv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    sv0Var.y1(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0((p00) this.d);
                boolean z11 = this.c;
                int i14 = z11 ? R.raw.folder_in : R.raw.folder_out;
                int i15 = this.b;
                org.telegram.ui.Components.qc M = a02.M(z11 ? LocaleController.formatPluralString("FolderLinkAddedChats", i15, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i15, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i14);
                M.j = 5000;
                M.j();
                break;
        }
    }

    public /* synthetic */ y8(Object obj, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = z10;
        this.b = i10;
    }
}
