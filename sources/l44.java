// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class l44 {
    public final ArrayList a = new ArrayList();
    public final zh6 b = new zh6();
    public final zh6 c = new zh6();

    public final void a(TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, r47 r47Var) {
        long B0 = r47.B0(tL_message);
        this.a.add(ephemeralMessage);
        zh6 zh6Var = this.b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) zh6Var.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            zh6Var.k(B0, tL_messages_messages);
        }
        tL_messages_messages.messages.add(tL_message);
        zh6 zh6Var2 = this.c;
        ArrayList arrayList = (ArrayList) zh6Var2.f(B0);
        if (arrayList == null) {
            arrayList = qd4.s(zh6Var2, B0);
        }
        arrayList.add(r47Var);
    }
}
