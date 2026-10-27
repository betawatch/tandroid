package ig;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.f61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h extends s4.p {
    public final /* synthetic */ int b;
    public ArrayList c;
    public Object d;

    public /* synthetic */ h() {
        this.b = 4;
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        switch (this.b) {
            case 0:
                return ((l) ((n) this.d).N.get(i10)).a == ((l) this.c.get(i11)).a;
            case 1:
                return true;
            case 2:
                return b(i10, i11);
            case 3:
                return true;
            default:
                qg.a aVar = (qg.a) this.c.get(i10);
                qg.a aVar2 = (qg.a) ((ArrayList) this.d).get(i11);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.b) {
            case 0:
                l lVar = (l) ((n) this.d).N.get(i10);
                l lVar2 = (l) this.c.get(i11);
                TLRPC.Dialog dialog = lVar.c;
                int i12 = lVar.a;
                int i13 = lVar2.a;
                TLRPC.Dialog dialog2 = lVar2.c;
                return i12 == i13 && (i12 != 0 ? i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : lVar.j == lVar2.j : !((tL_contact = lVar.e) == null || (tL_contact2 = lVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = lVar.d) == null || lVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && lVar.h == lVar2.h && lVar.f == lVar2.f && lVar.g == lVar2.g);
            case 1:
                return ((Integer) this.c.get(i10)).equals(((zx) this.d).n.get(i11));
            case 2:
                return Objects.equals(this.c.get(i10), ((im0) this.d).n.get(i11));
            case 3:
                return ((Long) this.c.get(i10)).equals(((f61) this.d).v0.get(i11));
            default:
                qg.a aVar = (qg.a) this.c.get(i10);
                qg.a aVar2 = (qg.a) ((ArrayList) this.d).get(i11);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override // s4.p
    public final int d() {
        switch (this.b) {
            case 0:
                return this.c.size();
            case 1:
                return ((zx) this.d).n.size();
            case 2:
                return ((im0) this.d).n.size();
            case 3:
                return ((f61) this.d).v0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override // s4.p
    public final int e() {
        switch (this.b) {
        }
        return this.c.size();
    }

    public /* synthetic */ h(Object obj, ArrayList arrayList, int i10) {
        this.b = i10;
        this.d = obj;
        this.c = arrayList;
    }
}
