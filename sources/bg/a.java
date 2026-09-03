package bg;

import f2.q;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.rx;
import org.telegram.ui.x61;
import tf.i;
import tf.k;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a extends q {
    public final /* synthetic */ int b;
    public ArrayList c;
    public Object d;

    public /* synthetic */ a() {
        this.b = 0;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        switch (this.b) {
            case 0:
                b bVar = (b) this.c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.a != bVar2.a) {
                    return false;
                }
                return bVar.a(bVar2);
            case 1:
                return true;
            case 2:
                return b(i10, i11);
            case 3:
                return true;
            default:
                return ((i) ((k) this.d).K.get(i10)).a == ((i) this.c.get(i11)).a;
        }
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.b) {
            case 0:
                b bVar = (b) this.c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.a != bVar2.a) {
                    return false;
                }
                return bVar.equals(bVar2);
            case 1:
                return ((Integer) this.c.get(i10)).equals(((rx) this.d).n.get(i11));
            case 2:
                return Objects.equals(this.c.get(i10), ((nl0) this.d).n.get(i11));
            case 3:
                return ((Long) this.c.get(i10)).equals(((x61) this.d).s0.get(i11));
            default:
                i iVar = (i) ((k) this.d).K.get(i10);
                i iVar2 = (i) this.c.get(i11);
                TLRPC.Dialog dialog = iVar.c;
                int i12 = iVar.a;
                int i13 = iVar2.a;
                TLRPC.Dialog dialog2 = iVar2.c;
                return i12 == i13 && (i12 != 0 ? i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : iVar.j == iVar2.j : !((tL_contact = iVar.e) == null || (tL_contact2 = iVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = iVar.d) == null || iVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && iVar.h == iVar2.h && iVar.f == iVar2.f && iVar.g == iVar2.g);
        }
    }

    @Override // f2.q
    public final int d() {
        switch (this.b) {
            case 0:
                return ((ArrayList) this.d).size();
            case 1:
                return ((rx) this.d).n.size();
            case 2:
                return ((nl0) this.d).n.size();
            case 3:
                return ((x61) this.d).s0.size();
            default:
                return this.c.size();
        }
    }

    @Override // f2.q
    public final int e() {
        switch (this.b) {
            case 0:
                return this.c.size();
            case 1:
                return this.c.size();
            case 2:
                return this.c.size();
            case 3:
                return this.c.size();
            default:
                return ((k) this.d).K.size();
        }
    }

    public /* synthetic */ a(Object obj, ArrayList arrayList, int i10) {
        this.b = i10;
        this.d = obj;
        this.c = arrayList;
    }
}
