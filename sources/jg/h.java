package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.pw;
import org.telegram.ui.i40;
import org.telegram.ui.t11;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h extends v4.o {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, ArrayList arrayList, int i7) {
        this.b = i7;
        this.d = obj;
        this.c = arrayList;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        switch (this.b) {
            case 0:
                if (((l) ((n) this.d).N.get(i7)).a == ((l) this.c.get(i10)).a) {
                }
                break;
        }
        return true;
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
                return ((p01) this.c.get(i7)).a() == ((p01) ((n01) this.d).c.get(i10)).a();
            case 4:
                i40 i40Var = (i40) this.d;
                ArrayList arrayList = this.c;
                if (i7 >= arrayList.size() || i10 >= i40Var.e.size()) {
                    return false;
                }
                return ((s3) arrayList.get(i7)).equals(i40Var.e.get(i10));
            default:
                return ((Long) this.c.get(i7)).equals(((t11) this.d).v0.get(i10));
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
                return ((n01) this.d).c.size();
            case 4:
                return ((i40) this.d).e.size();
            default:
                return ((t11) this.d).v0.size();
        }
    }

    @Override // v4.o
    public final int e() {
        switch (this.b) {
        }
        return this.c.size();
    }
}
