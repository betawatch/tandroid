package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y4(Object obj, Object obj2, Object obj3, int i10, String str, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i10;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new x1(context, u6Var, this.b, this.c, arrayList, false).show();
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                qf.c cVar = (qf.c) obj2;
                Long l4 = (Long) obj;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.User user = (l4 == null || l4.longValue() <= 0 || l4.longValue() == Long.MAX_VALUE) ? null : messagesController.getUser(l4);
                int i11 = this.b;
                if (user != null && !UserObject.isUserSelf(user)) {
                    launchActivity.Z(i11, user, this.c, cVar);
                    break;
                } else {
                    if (cVar != null) {
                        cVar.b();
                    }
                    if (user == null) {
                        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                        if (R != null) {
                            wh.n(R.string.NoUsernameFound, org.telegram.ui.Components.wc.b0(R), null);
                            break;
                        }
                    } else {
                        launchActivity.n0(i11, user.id, null);
                        break;
                    }
                }
                break;
        }
    }
}
