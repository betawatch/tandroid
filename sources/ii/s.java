package ii;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ s(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        j0 j0Var = this.b;
        switch (i10) {
            case 0:
                j0Var.e0((ArrayList) obj, true);
                break;
            case 1:
                j0.o(j0Var, (TLRPC.TL_error) obj2);
                break;
            case 2:
                j0.n(j0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                int i11 = j0.V;
                j0Var.e0((ArrayList) obj, false);
                break;
            case 4:
                j0.D(j0Var, (ArrayList) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                r0 r0Var = j0Var.M;
                arrayList.add(t61.E(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(t61.E(0, AndroidUtilities.dp(48.0f)));
                int i12 = 2;
                if (ChatObject.canBlockUsers(j0Var.f)) {
                    arrayList.add(t61.B(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new u(j0Var, i12)), true)));
                } else {
                    arrayList.add(t61.B(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(t61.j(2, j0Var.L));
                arrayList.add(t61.t(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", r0Var.l, new Object[0])));
                r0Var.c(arrayList);
                break;
        }
    }
}
