// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ag7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gg7 b;

    public /* synthetic */ ag7(gg7 gg7Var, byte b) {
        this.a = b;
        this.b = gg7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        gg7 gg7Var = this.b;
        switch (b) {
            case 0:
                fg7 fg7Var = gg7Var.l2;
                HashSet hashSet = gg7Var.Y1;
                if (hashSet.size() != 0 && fg7Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : gg7Var.d2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    fg7Var.a(arrayList);
                    gg7Var.dismiss();
                    break;
                }
                break;
            default:
                gg7Var.Y1.clear();
                gg7Var.T1.d.b(true);
                gg7Var.b1(true, false);
                break;
        }
    }
}
