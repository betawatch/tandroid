package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class u4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collator b;

    public /* synthetic */ u4(Collator collator, int i7) {
        this.a = i7;
        this.b = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                char charAt = str2.charAt(0);
                char charAt2 = str3.charAt(0);
                if (charAt == '#') {
                    return 1;
                }
                if (charAt2 == '#') {
                    return -1;
                }
                return this.b.compare(str2, str3);
            case 1:
                d5 d5Var = (d5) obj;
                d5 d5Var2 = (d5) obj2;
                String str4 = d5Var.i;
                if (str4.length() == 0) {
                    str4 = d5Var.j;
                }
                String str5 = d5Var2.i;
                if (str5.length() == 0) {
                    str5 = d5Var2.j;
                }
                return this.b.compare(str4, str5);
            case 2:
                String str6 = "";
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    str = g5.m(0, user.first_name, user.last_name);
                } else if (obj instanceof d5) {
                    d5 d5Var3 = (d5) obj;
                    TLRPC.User user2 = d5Var3.m;
                    str = user2 != null ? g5.m(0, user2.first_name, user2.last_name) : g5.m(0, d5Var3.i, d5Var3.j);
                } else {
                    str = "";
                }
                if (obj2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) obj2;
                    str6 = g5.m(0, user3.first_name, user3.last_name);
                } else if (obj2 instanceof d5) {
                    d5 d5Var4 = (d5) obj2;
                    TLRPC.User user4 = d5Var4.m;
                    str6 = user4 != null ? g5.m(0, user4.first_name, user4.last_name) : g5.m(0, d5Var4.i, d5Var4.j);
                }
                return this.b.compare(str, str6);
            case 3:
                String str7 = (String) obj;
                String str8 = (String) obj2;
                char charAt3 = str7.charAt(0);
                char charAt4 = str8.charAt(0);
                if (charAt3 == '#') {
                    return 1;
                }
                if (charAt4 == '#') {
                    return -1;
                }
                return this.b.compare(str7, str8);
            case 4:
                String str9 = (String) obj;
                String str10 = (String) obj2;
                char charAt5 = str9.charAt(0);
                char charAt6 = str10.charAt(0);
                if (charAt5 == '#') {
                    return 1;
                }
                if (charAt6 == '#') {
                    return -1;
                }
                return this.b.compare(str9, str10);
            default:
                String str11 = (String) obj;
                String str12 = (String) obj2;
                char charAt7 = str11.charAt(0);
                char charAt8 = str12.charAt(0);
                if (charAt7 == '#') {
                    return 1;
                }
                if (charAt8 == '#') {
                    return -1;
                }
                return this.b.compare(str11, str12);
        }
    }
}
