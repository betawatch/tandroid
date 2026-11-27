// default package

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ak3 extends qie {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ak3(Object obj, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = obj;
        this.b = arrayList;
    }

    @Override // qie
    public final boolean a(int i, int i2) {
        switch (this.a) {
            case 0:
                return ((ek3) ((gk3) this.c).O.get(i)).a == ((ek3) this.b.get(i2)).a;
            case 1:
            case 2:
                return true;
            case 3:
                return b(i, i2);
            case 4:
                return true;
            default:
                return false;
        }
    }

    @Override // qie
    public final boolean b(int i, int i2) {
        TLRPC.TL_contact tL_contact;
        String str;
        byte b = this.a;
        Object obj = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                ek3 ek3Var = (ek3) ((gk3) obj).O.get(i);
                ek3 ek3Var2 = (ek3) arrayList.get(i2);
                TLRPC.Dialog dialog = ek3Var.c;
                int i3 = ek3Var.a;
                int i4 = ek3Var2.a;
                TLRPC.Dialog dialog2 = ek3Var2.c;
                if (i3 == i4) {
                    if (i3 == 0) {
                        if (dialog != null && dialog2 != null && dialog.id == dialog2.id && ek3Var.h == ek3Var2.h && ek3Var.f == ek3Var2.f && ek3Var.g == ek3Var2.g) {
                            return true;
                        }
                    } else if (i3 == 14) {
                        if (dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder) {
                            return true;
                        }
                    } else if (i3 == 4) {
                        TLRPC.RecentMeUrl recentMeUrl = ek3Var.d;
                        if (recentMeUrl != null && ek3Var2.d != null && (str = recentMeUrl.url) != null && str.equals(str)) {
                            return true;
                        }
                    } else if (i3 == 6) {
                        TLRPC.TL_contact tL_contact2 = ek3Var.e;
                        if (tL_contact2 != null && (tL_contact = ek3Var2.e) != null && tL_contact2.user_id == tL_contact.user_id) {
                            return true;
                        }
                    } else if (i3 == 5) {
                        if (ek3Var.j == ek3Var2.j) {
                            return true;
                        }
                    } else if (i3 != 10) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((Integer) arrayList.get(i)).equals(((y04) obj).n.get(i2));
            case 2:
                sb5 sb5Var = (sb5) obj;
                if (i >= arrayList.size() || i2 >= sb5Var.e.size()) {
                    return false;
                }
                return ((wc2) arrayList.get(i)).equals(sb5Var.e.get(i2));
            case 3:
                return Objects.equals(arrayList.get(i), ((y69) obj).n.get(i2));
            case 4:
                return ((Long) arrayList.get(i)).equals(((n1a) obj).w0.get(i2));
            default:
                return ((j0c) arrayList.get(i)).a() == ((j0c) ((i0c) obj).c.get(i2)).a();
        }
    }

    @Override // qie
    public final int c() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return this.b.size();
            case 1:
                return ((y04) obj).n.size();
            case 2:
                return ((sb5) obj).e.size();
            case 3:
                return ((y69) obj).n.size();
            case 4:
                return ((n1a) obj).w0.size();
            default:
                return ((i0c) obj).c.size();
        }
    }

    @Override // qie
    public final int d() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
        }
        return arrayList.size();
    }
}
