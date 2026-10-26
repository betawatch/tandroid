package bi;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.db1;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fb1;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.o00;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ((lg0) this.d).a.b.A3(this.b, this.c);
                break;
            case 3:
                eo0 eo0Var = (eo0) this.d;
                eo0Var.o = null;
                eo0Var.c(this.b, this.c, true);
                break;
            case 4:
                aw0 aw0Var = ((vt0) this.d).a;
                org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
                if (r2Var != null) {
                    boolean z10 = this.c;
                    int i13 = this.b;
                    if (z10) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = aw0.l0(i13, true);
                        tL_channels_setMainProfileTab.channel = r2Var.getMessagesController().getInputChannel(aw0Var.f1.id);
                        TLRPC.ChatFull chatFull = aw0Var.f1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab l02 = aw0.l0(i13, true);
                        tL_account_setMainProfileTab2.tab = l02;
                        TLRPC.UserFull userFull = aw0Var.g1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = l02;
                            r2Var.getMessagesStorage().updateUserInfo(aw0Var.g1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    r2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    aw0Var.J1(true);
                    break;
                }
                break;
            case 5:
                db1 db1Var = (db1) fb1.a.get((String) this.d);
                if (db1Var != null && db1Var.i != null) {
                    boolean contains = fb1.g.contains(db1Var);
                    int i14 = this.b;
                    if (!contains) {
                        db1Var.t = i14;
                        db1Var.u = this.c;
                        ArrayList arrayList = fb1.f;
                        arrayList.remove(db1Var);
                        arrayList.add(db1Var);
                        fb1.j();
                        break;
                    } else {
                        db1Var.t = i14;
                        db1Var.i.l(i14);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0((o00) this.d);
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
