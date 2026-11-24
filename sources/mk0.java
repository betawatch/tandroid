// default package

import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mk0 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public mk0(String str) {
        this.a = str;
    }

    public static mk0 b(TL_account.contactBirthdays contactbirthdays) {
        mk0 mk0Var;
        int i;
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(5);
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(1);
        calendar.add(5, -1);
        int i5 = calendar.get(5);
        int i6 = calendar.get(2) + 1;
        calendar.get(1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, 1);
        int i7 = calendar2.get(5);
        int i8 = calendar2.get(2) + 1;
        calendar2.get(1);
        mk0 mk0Var2 = new mk0(i2 + "_" + i3 + "_" + i4);
        ArrayList<TL_account.TL_contactBirthday> arrayList = contactbirthdays.contacts;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TL_account.TL_contactBirthday tL_contactBirthday = arrayList.get(i9);
            i9++;
            TL_account.TL_contactBirthday tL_contactBirthday2 = tL_contactBirthday;
            TL_account.TL_birthday tL_birthday = tL_contactBirthday2.birthday;
            int i10 = tL_birthday.day;
            TLRPC.User user = null;
            ArrayList arrayList2 = (i10 == i2 && tL_birthday.month == i3) ? mk0Var2.c : (i10 == i5 && tL_birthday.month == i6) ? mk0Var2.b : (i10 == i7 && tL_birthday.month == i8) ? mk0Var2.d : null;
            if (arrayList2 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= contactbirthdays.users.size()) {
                        mk0Var = mk0Var2;
                        i = i7;
                        break;
                    }
                    mk0Var = mk0Var2;
                    i = i7;
                    if (contactbirthdays.users.get(i11).id == tL_contactBirthday2.contact_id) {
                        user = contactbirthdays.users.get(i11);
                        break;
                    }
                    i11++;
                    i7 = i;
                    mk0Var2 = mk0Var;
                }
                if (user != null && !m9c.D(user)) {
                    arrayList2.add(user);
                }
            } else {
                mk0Var = mk0Var2;
                i = i7;
            }
            i7 = i;
            mk0Var2 = mk0Var;
        }
        return mk0Var2;
    }

    public final boolean a(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((TLRPC.User) obj).id == j) {
                return true;
            }
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            if (((TLRPC.User) obj2).id == j) {
                return true;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            if (((TLRPC.User) obj3).id == j) {
                return true;
            }
        }
        return false;
    }
}
