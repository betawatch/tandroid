package hg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.e50;
import org.telegram.ui.i31;
import s4.n;
import zf.k;
import zf.m;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a extends n {
    public final /* synthetic */ int b;
    public ArrayList c;
    public Object d;

    public /* synthetic */ a() {
        this.b = 0;
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        switch (this.b) {
            case 0:
                b bVar = (b) this.c.get(i10);
                b bVar2 = (b) ((ArrayList) this.d).get(i11);
                if (bVar.a == bVar2.a) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                if (((k) ((m) this.d).N.get(i10)).a == ((k) this.c.get(i11)).a) {
                }
                break;
        }
        return true;
    }

    @Override // s4.n
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
                return ((Integer) this.c.get(i10)).equals(((ex) this.d).n.get(i11));
            case 2:
                return Objects.equals(this.c.get(i10), ((ok0) this.d).n.get(i11));
            case 3:
                e50 e50Var = (e50) this.d;
                ArrayList arrayList = this.c;
                if (i10 >= arrayList.size() || i11 >= e50Var.e.size()) {
                    return false;
                }
                return ((v3) arrayList.get(i10)).equals(e50Var.e.get(i11));
            case 4:
                return ((Long) this.c.get(i10)).equals(((i31) this.d).v0.get(i11));
            default:
                k kVar = (k) ((m) this.d).N.get(i10);
                k kVar2 = (k) this.c.get(i11);
                TLRPC.Dialog dialog = kVar.c;
                int i12 = kVar.a;
                int i13 = kVar2.a;
                TLRPC.Dialog dialog2 = kVar2.c;
                return i12 == i13 && (i12 != 0 ? i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : kVar.j == kVar2.j : !((tL_contact = kVar.e) == null || (tL_contact2 = kVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = kVar.d) == null || kVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && kVar.h == kVar2.h && kVar.f == kVar2.f && kVar.g == kVar2.g);
        }
    }

    @Override // s4.n
    public final int d() {
        switch (this.b) {
            case 0:
                return ((ArrayList) this.d).size();
            case 1:
                return ((ex) this.d).n.size();
            case 2:
                return ((ok0) this.d).n.size();
            case 3:
                return ((e50) this.d).e.size();
            case 4:
                return ((i31) this.d).v0.size();
            default:
                return this.c.size();
        }
    }

    @Override // s4.n
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
            case 4:
                return this.c.size();
            default:
                return ((m) this.d).N.size();
        }
    }

    public /* synthetic */ a(Object obj, ArrayList arrayList, int i10) {
        this.b = i10;
        this.d = obj;
        this.c = arrayList;
    }
}
