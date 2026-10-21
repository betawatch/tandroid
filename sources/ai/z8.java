package ai;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.n00;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                ga gaVar = (ga) this.d;
                if (!this.c) {
                    gaVar.getClass();
                    break;
                } else {
                    Set set = gaVar.Q;
                    int i10 = this.b;
                    set.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) gaVar.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                i2.r0 r0Var = (i2.r0) this.d;
                j2.f fVar = r0Var.M;
                i2.q1[] q1VarArr = r0Var.a;
                int i11 = this.b;
                int i12 = q1VarArr[i11].a.b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new j2.c(p5, i11, i12, this.c));
                break;
            case 2:
                ((kg0) this.d).a.b.A3(this.b, this.c);
                break;
            case 3:
                wn0 wn0Var = (wn0) this.d;
                wn0Var.o = null;
                wn0Var.c(this.b, this.c, true);
                break;
            case 4:
                uv0 uv0Var = ((mt0) this.d).a;
                org.telegram.ui.ActionBar.n2 n2Var = uv0Var.v1;
                if (n2Var != null) {
                    boolean z10 = this.c;
                    int i13 = this.b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = uv0.e0(i13, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(uv0Var.d1.id);
                        TLRPC.ChatFull chatFull = uv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab e02 = uv0.e0(i13, true);
                        tL_account_setMainProfileTab2.tab = e02;
                        TLRPC.UserFull userFull = uv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = e02;
                            n2Var.getMessagesStorage().updateUserInfo(uv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    uv0Var.y1(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0((n00) this.d);
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
