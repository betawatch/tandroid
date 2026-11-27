// default package

import android.content.DialogInterface;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lw1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fn7 c;

    public /* synthetic */ lw1(fn7 fn7Var, boolean z, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.b = z;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean z = this.b;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fn7Var;
                int i = ChatActivityEnterView.X7;
                boolean z2 = fc.b(chatActivityEnterView.R, chatActivityEnterView.l()) != null;
                if (z2 || z) {
                    hl.d3(new vv1(chatActivityEnterView, z2, (byte) 0), 180L);
                    break;
                }
            default:
                sbb sbbVar = (sbb) fn7Var;
                sbbVar.A2 = false;
                sbbVar.Y0.x(7, true);
                if (z) {
                    sbbVar.o(true);
                    break;
                }
                break;
        }
    }
}
