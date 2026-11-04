package gi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r8 {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final HashMap d;
    public final ArrayList e;
    public final ArrayList f;

    public r8(int i3, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        int i10 = 0;
        if (a(arrayList, TLRPC.TL_privacyValueAllowAll.class) != null) {
            this.a = 4;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
            if (tL_privacyValueDisallowUsers != null) {
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                hp s12 = hp.s1(i3);
                while (i10 < tL_privacyValueDisallowUsers.users.size()) {
                    Long l10 = tL_privacyValueDisallowUsers.users.get(i10);
                    l10.getClass();
                    TLRPC.InputUser q12 = s12.q1(s12.a2(l10));
                    if (!(q12 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers.users.add(q12);
                        this.c.add(l10);
                        this.e.add(q12);
                    }
                    i10++;
                }
                this.b.add(tL_inputPrivacyValueDisallowUsers);
                return;
            }
            return;
        }
        if (a(arrayList, TLRPC.TL_privacyValueAllowCloseFriends.class) != null) {
            this.a = 1;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
            return;
        }
        TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) a(arrayList, TLRPC.TL_privacyValueAllowUsers.class);
        if (tL_privacyValueAllowUsers != null) {
            this.a = 3;
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            hp s13 = hp.s1(i3);
            while (i10 < tL_privacyValueAllowUsers.users.size()) {
                Long l11 = tL_privacyValueAllowUsers.users.get(i10);
                l11.getClass();
                TLRPC.InputUser q13 = s13.q1(s13.a2(l11));
                if (!(q13 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueAllowUsers.users.add(q13);
                    this.c.add(l11);
                    this.e.add(q13);
                }
                i10++;
            }
            this.b.add(tL_inputPrivacyValueAllowUsers);
            return;
        }
        if (a(arrayList, TLRPC.TL_privacyValueAllowContacts.class) == null) {
            this.a = 4;
            return;
        }
        this.a = 2;
        arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers2 = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
        if (tL_privacyValueDisallowUsers2 != null) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            hp s14 = hp.s1(i3);
            while (i10 < tL_privacyValueDisallowUsers2.users.size()) {
                Long l12 = tL_privacyValueDisallowUsers2.users.get(i10);
                l12.getClass();
                TLRPC.InputUser q14 = s14.q1(s14.a2(l12));
                if (!(q14 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(q14);
                    this.c.add(l12);
                    this.e.add(q14);
                }
                i10++;
            }
            this.b.add(tL_inputPrivacyValueDisallowUsers2);
        }
    }

    public static TLRPC.PrivacyRule a(ArrayList arrayList, Class cls) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i3);
            if (cls.isInstance(privacyRule)) {
                return privacyRule;
            }
        }
        return null;
    }

    public final boolean b(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        ArrayList arrayList = this.c;
        int i3 = this.a;
        if (i3 == 4) {
            return !arrayList.contains(Long.valueOf(user.id));
        }
        if (i3 == 2) {
            return !arrayList.contains(Long.valueOf(user.id)) && user.contact;
        }
        if (i3 == 1) {
            return user.close_friend;
        }
        if (i3 == 3) {
            if (arrayList.contains(Long.valueOf(user.id))) {
                return true;
            }
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                if (((ArrayList) it.next()).contains(Long.valueOf(user.id))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        int size;
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty()) {
            return bd.G(arrayList.size(), "StoryPrivacyRecipients", new Object[0]);
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2.isEmpty()) {
            return bd.M0(2131744543, null);
        }
        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(0);
        int i3 = this.a;
        if (i3 == 4) {
            TLRPC.InputPrivacyRule inputPrivacyRule2 = arrayList2.size() >= 2 ? (TLRPC.InputPrivacyRule) arrayList2.get(1) : null;
            return (!(inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) || (size = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule2).users.size()) <= 0) ? bd.M0(2131744555, null) : bd.G(size, "StoryPrivacyEveryoneExclude", new Object[0]);
        }
        if (i3 == 1) {
            return bd.M0(2131744562, null);
        }
        if (i3 == 3 && (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
            return bd.G(((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule).users.size(), "StoryPrivacyContacts", new Object[0]);
        }
        if (i3 == 2) {
            TLRPC.InputPrivacyRule inputPrivacyRule3 = arrayList2.size() >= 2 ? (TLRPC.InputPrivacyRule) arrayList2.get(1) : null;
            if (!(inputPrivacyRule3 instanceof TLRPC.TL_inputPrivacyValueDisallowUsers)) {
                return bd.M0(2131744570, null);
            }
            int size2 = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule3).users.size();
            return size2 > 0 ? bd.G(size2, "StoryPrivacyContactsExclude", new Object[0]) : bd.M0(2131744570, null);
        }
        if (i3 != 0) {
            return bd.M0(2131744543, null);
        }
        if (!(inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
            return bd.M0(2131744543, null);
        }
        int size3 = ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule).users.size();
        return size3 <= 0 ? bd.M0(2131744543, null) : bd.G(size3, "StoryPrivacyContacts", new Object[0]);
    }

    public r8() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = 4;
        arrayList.add(new TLRPC.TL_inputPrivacyValueAllowAll());
    }

    public r8(int i3, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f = arrayList3;
        this.a = i3;
        int i11 = 0;
        if (i3 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (i10 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                Long l10 = (Long) arrayList.get(i11);
                l10.longValue();
                this.c.add(l10);
                hp s12 = hp.s1(i10);
                TLRPC.InputUser q12 = s12.q1(s12.a2(l10));
                if (!(q12 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers.users.add(q12);
                    this.e.add(q12);
                }
                i11++;
            }
            this.b.add(tL_inputPrivacyValueDisallowUsers);
            return;
        }
        if (i3 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
            return;
        }
        if (i3 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (i10 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                Long l11 = (Long) arrayList.get(i11);
                l11.longValue();
                this.c.add(l11);
                hp s13 = hp.s1(i10);
                TLRPC.InputUser q13 = s13.q1(s13.a2(l11));
                if (!(q13 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(q13);
                    this.e.add(q13);
                }
                i11++;
            }
            this.b.add(tL_inputPrivacyValueDisallowUsers2);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5 || arrayList == null) {
                return;
            }
            arrayList3.addAll(arrayList);
            return;
        }
        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
        if (i10 >= 0 && arrayList != null && !arrayList.isEmpty()) {
            while (i11 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i11);
                l12.longValue();
                this.c.add(l12);
                hp s14 = hp.s1(i10);
                TLRPC.InputUser q14 = s14.q1(s14.a2(l12));
                if (!(q14 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueAllowUsers.users.add(q14);
                    this.e.add(q14);
                }
                i11++;
            }
        }
        this.b.add(tL_inputPrivacyValueAllowUsers);
    }

    public r8(int i3, ArrayList arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = i3;
        int i11 = 0;
        if (i3 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                TLRPC.InputUser inputUser = (TLRPC.InputUser) arrayList.get(i11);
                if (inputUser != null) {
                    tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    this.c.add(Long.valueOf(inputUser.user_id));
                    this.e.add(inputUser);
                }
                i11++;
            }
            this.b.add(tL_inputPrivacyValueDisallowUsers);
            return;
        }
        if (i3 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
            return;
        }
        if (i3 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                TLRPC.InputUser inputUser2 = (TLRPC.InputUser) arrayList.get(i11);
                if (inputUser2 != null) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                    this.c.add(Long.valueOf(inputUser2.user_id));
                    this.e.add(inputUser2);
                }
                i11++;
            }
            this.b.add(tL_inputPrivacyValueDisallowUsers2);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                while (i11 < arrayList.size()) {
                    TLRPC.InputUser inputUser3 = (TLRPC.InputUser) arrayList.get(i11);
                    if (inputUser3 != null) {
                        this.f.add(Long.valueOf(inputUser3.user_id));
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
        if (!arrayList.isEmpty()) {
            while (i11 < arrayList.size()) {
                TLRPC.InputUser inputUser4 = (TLRPC.InputUser) arrayList.get(i11);
                if (inputUser4 != null) {
                    tL_inputPrivacyValueAllowUsers.users.add(inputUser4);
                    this.c.add(Long.valueOf(inputUser4.user_id));
                    this.e.add(inputUser4);
                }
                i11++;
            }
        }
        this.b.add(tL_inputPrivacyValueAllowUsers);
    }
}
