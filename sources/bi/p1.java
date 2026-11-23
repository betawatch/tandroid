package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ p1(f2 f2Var, int i7) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // org.telegram.messenger.w10
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
                f2 f2Var = this.b;
                TLRPC.UserFull d2 = mp.u1(f2Var.a).d2(i10.i(f2Var.a).e());
                TL_account.TL_birthday tL_birthday2 = d2 != null ? d2.birthday : null;
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday;
                }
                ConnectionsManager.getInstance(f2Var.a).sendRequest(updatebirthday, new q1(f2Var, d2, tL_birthday2, 0), 1024);
                mp.u1(f2Var.a).o2();
                mp.u1(f2Var.a).s4(0L, "BIRTHDAY_SETUP");
                ks.f(f2Var.a).k(ks.s1, new Object[0]);
                f2Var.j2.O(true);
                break;
        }
    }
}
