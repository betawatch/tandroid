package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ t(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        k0 k0Var = this.b;
        switch (i10) {
            case 0:
                k0Var.S((ArrayList) obj, true);
                break;
            case 1:
                k0.o(k0Var, (TLRPC.TL_error) obj2);
                break;
            case 2:
                k0.n(k0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                int i11 = k0.V;
                k0Var.S((ArrayList) obj, false);
                break;
            case 4:
                k0.z(k0Var, (ArrayList) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                t0 t0Var = k0Var.M;
                arrayList.add(h61.E(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(h61.E(0, AndroidUtilities.dp(48.0f)));
                int i12 = 2;
                if (ChatObject.canBlockUsers(k0Var.f)) {
                    arrayList.add(h61.B(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new v(k0Var, i12)), true)));
                } else {
                    arrayList.add(h61.B(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(h61.j(2, k0Var.L));
                arrayList.add(h61.t(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", t0Var.l, new Object[0])));
                t0Var.c(arrayList);
                break;
        }
    }
}
