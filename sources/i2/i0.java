package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.k10;
import zh.n5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i0(Object obj, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = i10;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.d;
                j2.f fVar = r0Var.M;
                r1[] r1VarArr = r0Var.a;
                int i10 = this.c;
                int i11 = r1VarArr[i10].a.b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new j2.c(p5, i10, i11, this.b));
                break;
            case 1:
                ((qg0) this.d).a.b.y3(this.c, this.b);
                break;
            case 2:
                zn0 zn0Var = (zn0) this.d;
                zn0Var.o = null;
                zn0Var.c(this.c, this.b, true);
                break;
            case 3:
                xv0 xv0Var = ((pt0) this.d).a;
                m2 m2Var = xv0Var.v1;
                if (m2Var != null) {
                    boolean z10 = this.b;
                    int i12 = this.c;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = xv0.d0(i12, true);
                        tL_channels_setMainProfileTab.channel = m2Var.getMessagesController().getInputChannel(xv0Var.d1.id);
                        TLRPC.ChatFull chatFull = xv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = xv0.d0(i12, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = xv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            m2Var.getMessagesStorage().updateUserInfo(xv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    m2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    xv0Var.w1(true);
                    break;
                }
                break;
            case 4:
                zc a02 = zc.a0((k10) this.d);
                boolean z11 = this.b;
                int i13 = z11 ? R.raw.folder_in : R.raw.folder_out;
                int i14 = this.c;
                sc M = a02.M(z11 ? LocaleController.formatPluralString("FolderLinkAddedChats", i14, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i14, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i13);
                M.j = 5000;
                M.j();
                break;
            default:
                n5 n5Var = (n5) this.d;
                if (!this.b) {
                    n5Var.getClass();
                    break;
                } else {
                    Set set = n5Var.Q;
                    int i15 = this.c;
                    set.remove(Integer.valueOf(i15));
                    Runnable runnable = (Runnable) n5Var.R.remove(Integer.valueOf(i15));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ i0(Object obj, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = z10;
        this.c = i10;
    }
}
