// default package

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class kuc implements rl3, fd {
    public final /* synthetic */ muc a;

    public /* synthetic */ kuc(muc mucVar) {
        this.a = mucVar;
    }

    @Override // rl3
    public final void a(zh6 zh6Var, ArrayList arrayList) {
        muc mucVar = this.a;
        ArrayList arrayList2 = mucVar.s;
        if (mucVar.r) {
            return;
        }
        arrayList2.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sl3 sl3Var = (sl3) obj;
            TLObject tLObject = sl3Var.a;
            if ((tLObject instanceof TLRPC.User) && muc.d0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) sl3Var.a);
            }
        }
        wa waVar = mucVar.a;
        if (waVar != null) {
            waVar.g3.O(true);
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        muc mucVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            mucVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
