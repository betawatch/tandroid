package bi;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.jb1;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.q00;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u8(Object obj, int i10, boolean z10, int i11) {
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
                ca caVar = (ca) this.d;
                if (!this.c) {
                    caVar.getClass();
                    break;
                } else {
                    Set set = caVar.Q;
                    int i10 = this.b;
                    set.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) caVar.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                i2.s0 s0Var = (i2.s0) this.d;
                j2.e eVar = s0Var.M;
                i2.r1[] r1VarArr = s0Var.a;
                int i11 = this.b;
                int i12 = r1VarArr[i11].a.b;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1033, new ig.g(p10, i11, i12, this.c));
                break;
            case 2:
                ((mg0) this.d).a.b.B3(this.b, this.c);
                break;
            case 3:
                fo0 fo0Var = (fo0) this.d;
                fo0Var.o = null;
                fo0Var.c(this.b, this.c, true);
                break;
            case 4:
                bw0 bw0Var = ((wt0) this.d).a;
                org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
                if (r2Var != null) {
                    boolean z10 = this.c;
                    int i13 = this.b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = bw0.l0(i13, true);
                        tL_channels_setMainProfileTab.channel = r2Var.getMessagesController().getInputChannel(bw0Var.f1.id);
                        TLRPC.ChatFull chatFull = bw0Var.f1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab l02 = bw0.l0(i13, true);
                        tL_account_setMainProfileTab2.tab = l02;
                        TLRPC.UserFull userFull = bw0Var.g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = l02;
                            r2Var.getMessagesStorage().updateUserInfo(bw0Var.g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    r2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    bw0Var.J1(true);
                    break;
                }
                break;
            case 5:
                gb1 gb1Var = (gb1) jb1.a.get((String) this.d);
                if (gb1Var != null && gb1Var.s != null) {
                    boolean contains = jb1.g.contains(gb1Var);
                    int i14 = this.b;
                    if (!contains) {
                        gb1Var.D = i14;
                        gb1Var.E = this.c;
                        ArrayList arrayList = jb1.f;
                        arrayList.remove(gb1Var);
                        arrayList.add(gb1Var);
                        jb1.n();
                        break;
                    } else {
                        gb1Var.D = i14;
                        gb1Var.s.q(i14);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0((q00) this.d);
                boolean z11 = this.c;
                int i15 = z11 ? R.raw.folder_in : R.raw.folder_out;
                int i16 = this.b;
                org.telegram.ui.Components.qc M = b02.M(z11 ? LocaleController.formatPluralString("FolderLinkAddedChats", i16, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i16, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i15);
                M.j = 5000;
                M.j();
                break;
        }
    }

    public /* synthetic */ u8(Object obj, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = z10;
        this.b = i10;
    }
}
