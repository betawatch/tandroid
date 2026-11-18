package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;

    public /* synthetic */ l1(a2 a2Var, int i7) {
        this.a = i7;
        this.b = a2Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            case 1:
                ArrayList arrayList = this.b.i2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                a2 a2Var = this.b;
                TLRPC.UserFull d2 = mp.u1(a2Var.a).d2(j10.i(a2Var.a).e());
                TL_account.TL_birthday tL_birthday2 = d2 != null ? d2.birthday : null;
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday;
                }
                ConnectionsManager.getInstance(a2Var.a).sendRequest(updatebirthday, new m1(a2Var, d2, tL_birthday2, 0), 1024);
                mp.u1(a2Var.a).o2();
                mp.u1(a2Var.a).s4(0L, "BIRTHDAY_SETUP");
                ks.f(a2Var.a).k(ks.s1, new Object[0]);
                a2Var.j2.O(true);
                break;
        }
    }
}
