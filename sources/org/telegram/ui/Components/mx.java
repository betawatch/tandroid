package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mx extends f2.q {
    public final /* synthetic */ int b;
    public ArrayList c;
    public Object d;

    public /* synthetic */ mx() {
        this.b = 4;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        switch (this.b) {
            case 0:
                return true;
            case 1:
                return b(i10, i11);
            case 2:
                return true;
            case 3:
                return ((rf.j) ((rf.l) this.d).J.get(i10)).a == ((rf.j) this.c.get(i11)).a;
            default:
                zf.a aVar = (zf.a) this.c.get(i10);
                zf.a aVar2 = (zf.a) ((ArrayList) this.d).get(i11);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.a(aVar2);
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
                return ((Integer) this.c.get(i10)).equals(((nx) this.d).n.get(i11));
            case 1:
                return Objects.equals(this.c.get(i10), ((fl0) this.d).n.get(i11));
            case 2:
                return ((Long) this.c.get(i10)).equals(((org.telegram.ui.d61) this.d).r0.get(i11));
            case 3:
                rf.j jVar = (rf.j) ((rf.l) this.d).J.get(i10);
                rf.j jVar2 = (rf.j) this.c.get(i11);
                TLRPC.Dialog dialog = jVar.c;
                int i12 = jVar.a;
                int i13 = jVar2.a;
                TLRPC.Dialog dialog2 = jVar2.c;
                return i12 == i13 && (i12 != 0 ? i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : jVar.j == jVar2.j : !((tL_contact = jVar.e) == null || (tL_contact2 = jVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = jVar.d) == null || jVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && jVar.h == jVar2.h && jVar.f == jVar2.f && jVar.g == jVar2.g);
            default:
                zf.a aVar = (zf.a) this.c.get(i10);
                zf.a aVar2 = (zf.a) ((ArrayList) this.d).get(i11);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override // f2.q
    public final int d() {
        switch (this.b) {
            case 0:
                return ((nx) this.d).n.size();
            case 1:
                return ((fl0) this.d).n.size();
            case 2:
                return ((org.telegram.ui.d61) this.d).r0.size();
            case 3:
                return this.c.size();
            default:
                return ((ArrayList) this.d).size();
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
                return ((rf.l) this.d).J.size();
            default:
                return this.c.size();
        }
    }

    public /* synthetic */ mx(Object obj, ArrayList arrayList, int i10) {
        this.b = i10;
        this.d = obj;
        this.c = arrayList;
    }
}
