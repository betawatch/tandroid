package jg;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.u3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.i40;
import org.telegram.ui.r11;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g extends v4.o {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, ArrayList arrayList, int i7) {
        this.b = i7;
        this.d = obj;
        this.c = arrayList;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        switch (this.b) {
            case 0:
                if (((k) ((m) this.d).O.get(i7)).a == ((k) this.c.get(i10)).a) {
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
                k kVar = (k) ((m) this.d).O.get(i7);
                k kVar2 = (k) this.c.get(i10);
                TLRPC.Dialog dialog = kVar.c;
                int i11 = kVar.a;
                int i12 = kVar2.a;
                TLRPC.Dialog dialog2 = kVar2.c;
                return i11 == i12 && (i11 != 0 ? i11 != 14 ? i11 != 4 ? i11 != 6 ? i11 != 5 ? i11 != 10 : kVar.j == kVar2.j : !((tL_contact = kVar.e) == null || (tL_contact2 = kVar2.e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = kVar.d) == null || kVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.id == dialog2.id && kVar.h == kVar2.h && kVar.f == kVar2.f && kVar.g == kVar2.g);
            case 1:
                return ((Integer) this.c.get(i7)).equals(((bx) this.d).n.get(i10));
            case 2:
                return Objects.equals(this.c.get(i7), ((xj0) this.d).n.get(i10));
            case 3:
                return ((b11) this.c.get(i7)).a() == ((b11) ((a11) this.d).c.get(i10)).a();
            case 4:
                i40 i40Var = (i40) this.d;
                ArrayList arrayList = this.c;
                if (i7 >= arrayList.size() || i10 >= i40Var.e.size()) {
                    return false;
                }
                return ((u3) arrayList.get(i7)).equals(i40Var.e.get(i10));
            default:
                return ((Long) this.c.get(i7)).equals(((r11) this.d).w0.get(i10));
        }
    }

    @Override // v4.o
    public final int d() {
        switch (this.b) {
            case 0:
                return this.c.size();
            case 1:
                return ((bx) this.d).n.size();
            case 2:
                return ((xj0) this.d).n.size();
            case 3:
                return ((a11) this.d).c.size();
            case 4:
                return ((i40) this.d).e.size();
            default:
                return ((r11) this.d).w0.size();
        }
    }

    @Override // v4.o
    public final int e() {
        switch (this.b) {
        }
        return this.c.size();
    }
}
