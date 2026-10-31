package mg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ x1(i2 i2Var, int i10) {
        this.a = i10;
        this.b = i2Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                i2 i2Var = this.b;
                ArrayList arrayList = i2Var.j2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                g2 g2Var = i2Var.Q1;
                if (g2Var.Q) {
                    g2Var.setLoading(false);
                    if (i2Var.k1.G) {
                        i2Var.k1();
                        break;
                    }
                }
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            case 2:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                i2 i2Var2 = this.b;
                TLRPC.UserFull a2 = vp.r1(i2Var2.a).a2(d20.i(i2Var2.a).e());
                TL_account.TL_birthday tL_birthday2 = a2 != null ? a2.birthday : null;
                if (a2 != null) {
                    a2.flags2 |= 32;
                    a2.birthday = tL_birthday;
                }
                ConnectionsManager.getInstance(i2Var2.a).sendRequest(updatebirthday, new ag.p0(i2Var2, a2, tL_birthday2, 7), 1024);
                vp.r1(i2Var2.a).l2();
                vp.r1(i2Var2.a).h4(0L, "BIRTHDAY_SETUP");
                zs.f(i2Var2.a).k(zs.s1, new Object[0]);
                i2Var2.o1(true, true);
                break;
            default:
                i2 i2Var3 = this.b;
                i2Var3.g2 = (String) obj;
                c2 c2Var = i2Var3.o2;
                org.telegram.messenger.i0.r(c2Var);
                org.telegram.messenger.i0.h3(c2Var, 350L);
                break;
        }
    }
}
