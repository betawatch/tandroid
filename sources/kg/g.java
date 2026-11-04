package kg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.ow;
import org.telegram.ui.a40;
import org.telegram.ui.g11;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends u4.o {
    public final /* synthetic */ int b;
    public ArrayList c;
    public Object d;

    public /* synthetic */ g() {
        this.b = 6;
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        switch (this.b) {
            case 0:
                return ((k) ((m) this.d).O.get(i3)).a == ((k) this.c.get(i10)).a;
            case 1:
                return true;
            case 2:
                return b(i3, i10);
            case 3:
                return false;
            case 4:
                return true;
            case 5:
                return true;
            default:
                sg.a aVar = (sg.a) this.c.get(i3);
                sg.a aVar2 = (sg.a) ((ArrayList) this.d).get(i10);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.b) {
            case 0:
                k kVar = (k) ((m) this.d).O.get(i3);
                k kVar2 = (k) this.c.get(i10);
                TLRPC.Dialog dialog = kVar.c;
                int i11 = kVar.a;
                int i12 = kVar2.a;
                TLRPC.Dialog dialog2 = kVar2.c;
                return i11 == i12 && (i11 != 0 ? i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.j == kVar2.j : !((tL_contact = kVar.e) == null || (tL_contact2 = kVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = kVar.d) == null || kVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && kVar.h == kVar2.h && kVar.f == kVar2.f && kVar.g == kVar2.g);
            case 1:
                return ((Integer) this.c.get(i3)).equals(((ow) this.d).n.get(i10));
            case 2:
                return Objects.equals(this.c.get(i3), ((oj0) this.d).n.get(i10));
            case 3:
                return ((l01) this.c.get(i3)).a() == ((l01) ((k01) this.d).c.get(i10)).a();
            case 4:
                a40 a40Var = (a40) this.d;
                ArrayList arrayList = this.c;
                if (i3 >= arrayList.size() || i10 >= a40Var.e.size()) {
                    return false;
                }
                return ((s3) arrayList.get(i3)).equals(a40Var.e.get(i10));
            case 5:
                return ((Long) this.c.get(i3)).equals(((g11) this.d).w0.get(i10));
            default:
                sg.a aVar = (sg.a) this.c.get(i3);
                sg.a aVar2 = (sg.a) ((ArrayList) this.d).get(i10);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override // u4.o
    public final int d() {
        switch (this.b) {
            case 0:
                return this.c.size();
            case 1:
                return ((ow) this.d).n.size();
            case 2:
                return ((oj0) this.d).n.size();
            case 3:
                return ((k01) this.d).c.size();
            case 4:
                return ((a40) this.d).e.size();
            case 5:
                return ((g11) this.d).w0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override // u4.o
    public final int e() {
        switch (this.b) {
        }
        return this.c.size();
    }

    public /* synthetic */ g(Object obj, ArrayList arrayList, int i3) {
        this.b = i3;
        this.d = obj;
        this.c = arrayList;
    }
}
