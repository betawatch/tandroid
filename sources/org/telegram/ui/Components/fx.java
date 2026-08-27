package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fx extends f2.q {
    public final /* synthetic */ int b;
    public ArrayList c;
    public Object d;

    public /* synthetic */ fx() {
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
                return ((pf.i) ((pf.k) this.d).J.get(i10)).a == ((pf.i) this.c.get(i11)).a;
            default:
                xf.a aVar = (xf.a) this.c.get(i10);
                xf.a aVar2 = (xf.a) ((ArrayList) this.d).get(i11);
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
                return ((Integer) this.c.get(i10)).equals(((gx) this.d).n.get(i11));
            case 1:
                return Objects.equals(this.c.get(i10), ((vk0) this.d).n.get(i11));
            case 2:
                return ((Long) this.c.get(i10)).equals(((org.telegram.ui.a61) this.d).r0.get(i11));
            case 3:
                pf.i iVar = (pf.i) ((pf.k) this.d).J.get(i10);
                pf.i iVar2 = (pf.i) this.c.get(i11);
                TLRPC.Dialog dialog = iVar.c;
                int i12 = iVar.a;
                int i13 = iVar2.a;
                TLRPC.Dialog dialog2 = iVar2.c;
                return i12 == i13 && (i12 != 0 ? i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : iVar.j == iVar2.j : !((tL_contact = iVar.e) == null || (tL_contact2 = iVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = iVar.d) == null || iVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && iVar.h == iVar2.h && iVar.f == iVar2.f && iVar.g == iVar2.g);
            default:
                xf.a aVar = (xf.a) this.c.get(i10);
                xf.a aVar2 = (xf.a) ((ArrayList) this.d).get(i11);
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
                return ((gx) this.d).n.size();
            case 1:
                return ((vk0) this.d).n.size();
            case 2:
                return ((org.telegram.ui.a61) this.d).r0.size();
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
                return ((pf.k) this.d).J.size();
            default:
                return this.c.size();
        }
    }

    public /* synthetic */ fx(Object obj, ArrayList arrayList, int i10) {
        this.b = i10;
        this.d = obj;
        this.c = arrayList;
    }
}
