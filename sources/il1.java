// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class il1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ il1(zu1 zu1Var, int i) {
        this.a = (byte) 4;
        this.b = zu1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wb2 wb2Var;
        r47 messageObject;
        byte b = this.a;
        boolean z = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.e = zu1Var.getMessagesController().M0(Long.valueOf(zu1Var.e.id));
                if (zu1Var.Z7()) {
                    TLRPC.Chat chat = zu1Var.e;
                    if (chat.in_news || !xc2.r0(chat)) {
                        zu1Var.sb = false;
                        if (z && !zu1Var.e.in_news) {
                            zu1Var.P4(true, false, true);
                            break;
                        } else {
                            zu1Var.Yb(zu1Var.e.in_news ? 2131752496 : 2131752498);
                        }
                    }
                }
                zu1Var.Pc(false);
                break;
            case 1:
                zu1Var.presentFragment(new PremiumPreviewFragment(0, z ? "upload_speed" : "download_speed"));
                break;
            case 2:
                zu1Var.getNotificationsController().G(zu1Var.l6, 0L, !z);
                zu1Var.Pc(false);
                zu1Var.Yb(z ? 2131752310 : 2131752388);
                break;
            case 3:
                zu1Var.getMessagesController().b(!z ? 1 : 0, 0, zu1Var.l6);
                zu1Var.Yb(z ? 2131752240 : 2131752433);
                break;
            case 4:
                wq1 wq1Var = zu1Var.A0;
                if (wq1Var != null) {
                    int childCount = wq1Var.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = zu1Var.A0.getChildAt(i);
                        if ((childAt instanceof wb2) && (messageObject = (wb2Var = (wb2) childAt).getMessageObject()) != null && messageObject.T(zu1Var.V3)) {
                            wb2Var.J3(z ? 1 : 0, true, true);
                        }
                    }
                }
                zu1Var.V3 = null;
                break;
            default:
                zu1Var.gd(0, z);
                break;
        }
    }

    public /* synthetic */ il1(zu1 zu1Var, boolean z, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = z;
    }
}
