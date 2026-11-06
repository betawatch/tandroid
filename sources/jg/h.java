package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.pw;
import org.telegram.ui.f40;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class h extends v4.o {
    public final /* synthetic */ int b;
    public ArrayList c;
    public Object d;

    public /* synthetic */ h() {
        this.b = 6;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        switch (this.b) {
            case 0:
                return ((l) ((n) this.d).N.get(i7)).a == ((l) this.c.get(i10)).a;
            case 1:
                return true;
            case 2:
                return b(i7, i10);
            case 3:
                return false;
            case 4:
                return true;
            case 5:
                return true;
            default:
                rg.a aVar = (rg.a) this.c.get(i7);
                rg.a aVar2 = (rg.a) ((ArrayList) this.d).get(i10);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.b) {
            case 0:
                l lVar = (l) ((n) this.d).N.get(i7);
                l lVar2 = (l) this.c.get(i10);
                TLRPC.Dialog dialog = lVar.c;
                int i11 = lVar.a;
                int i12 = lVar2.a;
                TLRPC.Dialog dialog2 = lVar2.c;
                return i11 == i12 && (i11 != 0 ? i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : lVar.j == lVar2.j : !((tL_contact = lVar.e) == null || (tL_contact2 = lVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = lVar.d) == null || lVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && lVar.h == lVar2.h && lVar.f == lVar2.f && lVar.g == lVar2.g);
            case 1:
                return ((Integer) this.c.get(i7)).equals(((pw) this.d).n.get(i10));
            case 2:
                return Objects.equals(this.c.get(i7), ((kj0) this.d).n.get(i10));
            case 3:
                return ((l01) this.c.get(i7)).a() == ((l01) ((k01) this.d).c.get(i10)).a();
            case 4:
                f40 f40Var = (f40) this.d;
                ArrayList arrayList = this.c;
                if (i7 >= arrayList.size() || i10 >= f40Var.e.size()) {
                    return false;
                }
                return ((s3) arrayList.get(i7)).equals(f40Var.e.get(i10));
            case 5:
                return ((Long) this.c.get(i7)).equals(((q11) this.d).v0.get(i10));
            default:
                rg.a aVar = (rg.a) this.c.get(i7);
                rg.a aVar2 = (rg.a) ((ArrayList) this.d).get(i10);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override // v4.o
    public final int d() {
        switch (this.b) {
            case 0:
                return this.c.size();
            case 1:
                return ((pw) this.d).n.size();
            case 2:
                return ((kj0) this.d).n.size();
            case 3:
                return ((k01) this.d).c.size();
            case 4:
                return ((f40) this.d).e.size();
            case 5:
                return ((q11) this.d).v0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override // v4.o
    public final int e() {
        switch (this.b) {
        }
        return this.c.size();
    }

    public /* synthetic */ h(Object obj, ArrayList arrayList, int i7) {
        this.b = i7;
        this.d = obj;
        this.c = arrayList;
    }
}
