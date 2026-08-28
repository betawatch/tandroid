package of;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.b61;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends f2.s {
    public final /* synthetic */ int b;
    public ArrayList c;
    public Object d;

    public /* synthetic */ g() {
        this.b = 4;
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        switch (this.b) {
            case 0:
                return ((k) ((m) this.d).J.get(i9)).a == ((k) this.c.get(i10)).a;
            case 1:
                return true;
            case 2:
                return b(i9, i10);
            case 3:
                return true;
            default:
                wf.a aVar = (wf.a) this.c.get(i9);
                wf.a aVar2 = (wf.a) ((ArrayList) this.d).get(i10);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.b) {
            case 0:
                k kVar = (k) ((m) this.d).J.get(i9);
                k kVar2 = (k) this.c.get(i10);
                TLRPC.Dialog dialog = kVar.c;
                int i11 = kVar.a;
                int i12 = kVar2.a;
                TLRPC.Dialog dialog2 = kVar2.c;
                return i11 == i12 && (i11 != 0 ? i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.j == kVar2.j : !((tL_contact = kVar.e) == null || (tL_contact2 = kVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = kVar.d) == null || kVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && kVar.h == kVar2.h && kVar.f == kVar2.f && kVar.g == kVar2.g);
            case 1:
                return ((Integer) this.c.get(i9)).equals(((fx) this.d).n.get(i10));
            case 2:
                return Objects.equals(this.c.get(i9), ((sk0) this.d).n.get(i10));
            case 3:
                return ((Long) this.c.get(i9)).equals(((b61) this.d).r0.get(i10));
            default:
                wf.a aVar = (wf.a) this.c.get(i9);
                wf.a aVar2 = (wf.a) ((ArrayList) this.d).get(i10);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override // f2.s
    public final int d() {
        switch (this.b) {
            case 0:
                return this.c.size();
            case 1:
                return ((fx) this.d).n.size();
            case 2:
                return ((sk0) this.d).n.size();
            case 3:
                return ((b61) this.d).r0.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override // f2.s
    public final int e() {
        switch (this.b) {
        }
        return this.c.size();
    }

    public /* synthetic */ g(Object obj, ArrayList arrayList, int i9) {
        this.b = i9;
        this.d = obj;
        this.c = arrayList;
    }
}
