package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p61;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                k0Var.V((ArrayList) obj, true);
                break;
            case 1:
                k0.q(k0Var, (TLRPC.TL_error) obj2);
                break;
            case 2:
                k0.p(k0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                int i11 = k0.V;
                k0Var.V((ArrayList) obj, false);
                break;
            case 4:
                k0.C(k0Var, (ArrayList) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                t0 t0Var = k0Var.M;
                arrayList.add(p61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(p61.D(0, AndroidUtilities.dp(48.0f)));
                int i12 = 2;
                if (ChatObject.canBlockUsers(k0Var.f)) {
                    arrayList.add(p61.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new v(k0Var, i12)), true)));
                } else {
                    arrayList.add(p61.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(p61.j(2, k0Var.L));
                arrayList.add(p61.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", t0Var.l, new Object[0])));
                t0Var.c(arrayList);
                break;
        }
    }
}
