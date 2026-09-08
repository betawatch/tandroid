package hg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.tx;
import org.telegram.ui.j71;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g extends s4.o {
    public final /* synthetic */ int b;
    public ArrayList c;
    public Object d;

    public /* synthetic */ g() {
        this.b = 4;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        switch (this.b) {
            case 0:
                return ((k) ((m) this.d).N.get(i10)).a == ((k) this.c.get(i11)).a;
            case 1:
                return true;
            case 2:
                return b(i10, i11);
            case 3:
                return true;
            default:
                pg.a aVar = (pg.a) this.c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.b) {
            case 0:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.c.get(i11);
                TLRPC.Dialog dialog = kVar.c;
                int i12 = kVar.a;
                int i13 = kVar2.a;
                TLRPC.Dialog dialog2 = kVar2.c;
                return i12 == i13 && (i12 != 0 ? i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.j == kVar2.j : !((tL_contact = kVar.e) == null || (tL_contact2 = kVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = kVar.d) == null || kVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && kVar.h == kVar2.h && kVar.f == kVar2.f && kVar.g == kVar2.g);
            case 1:
                return ((Integer) this.c.get(i10)).equals(((tx) this.d).n.get(i11));
            case 2:
                return Objects.equals(this.c.get(i10), ((hl0) this.d).n.get(i11));
            case 3:
                return ((Long) this.c.get(i10)).equals(((j71) this.d).v0.get(i11));
            default:
                pg.a aVar = (pg.a) this.c.get(i10);
                pg.a aVar2 = (pg.a) ((ArrayList) this.d).get(i11);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override // s4.o
    public final int d() {
        switch (this.b) {
            case 0:
                return this.c.size();
            case 1:
                return ((tx) this.d).n.size();
            case 2:
                return ((hl0) this.d).n.size();
            case 3:
                return ((j71) this.d).v0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override // s4.o
    public final int e() {
        switch (this.b) {
        }
        return this.c.size();
    }

    public /* synthetic */ g(Object obj, ArrayList arrayList, int i10) {
        this.b = i10;
        this.d = obj;
        this.c = arrayList;
    }
}
