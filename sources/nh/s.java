package nh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ s(j0 j0Var, int i9) {
        this.a = i9;
        this.b = j0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i9 = this.a;
        j0 j0Var = this.b;
        switch (i9) {
            case 0:
                j0Var.T((ArrayList) obj, true);
                break;
            case 1:
                j0.o(j0Var, (TLRPC.TL_error) obj2);
                break;
            case 2:
                j0.n(j0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                int i10 = j0.R;
                j0Var.T((ArrayList) obj, false);
                break;
            case 4:
                j0.z(j0Var, (ArrayList) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                q0 q0Var = j0Var.I;
                arrayList.add(l41.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(l41.D(0, AndroidUtilities.dp(48.0f)));
                int i11 = 2;
                if (ChatObject.canBlockUsers(j0Var.f)) {
                    arrayList.add(l41.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new u(j0Var, i11)), true)));
                } else {
                    arrayList.add(l41.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(l41.j(2, j0Var.H));
                arrayList.add(l41.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", q0Var.l, new Object[0])));
                q0Var.c(arrayList);
                break;
        }
    }
}
