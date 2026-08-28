package cg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a extends wf.a {
    public CharSequence c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f;
    public boolean g;
    public long h;
    public int i;
    public int j;
    public List k;
    public int l;
    public TLObject m;

    public static a b(TLRPC.Chat chat, int i9, boolean z10) {
        a aVar = new a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.g = z10;
        aVar.i = i9;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        a aVar = new a(7, false);
        aVar.c = charSequence;
        aVar.g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i9, long j10, boolean z10, boolean z11) {
        a aVar = new a(17, z10);
        aVar.i = i9;
        aVar.h = j10;
        aVar.m = tL_starsGiveawayOption;
        aVar.g = z11;
        return aVar;
    }

    public static a e(int i9, int i10, boolean z10, ArrayList arrayList) {
        a aVar = new a(11, i10 == i9);
        aVar.l = i9;
        aVar.g = z10;
        aVar.f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        a aVar = new a(6, false);
        aVar.c = str;
        return aVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (((Integer) list.get(i9)).intValue() != ((Integer) list2.get(i9)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // wf.a
    public final boolean a(wf.a aVar) {
        a aVar2;
        int i9;
        int i10;
        if (this == aVar) {
            return true;
        }
        if (a.class == aVar.getClass() && (i9 = (aVar2 = (a) aVar).a) == (i10 = this.a)) {
            return i10 == 0 ? this.g == aVar2.g : i9 == 17 ? this.i == aVar2.i && this.h == aVar2.h && this.m == aVar2.m && this.g == aVar2.g && this.b == aVar2.b : i10 == 5 ? this.i == aVar2.i && g(this.k, aVar2.k) : i10 == 13 && this.i == aVar2.i && TextUtils.equals(this.c, aVar2.c);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        int i9 = this.a;
        if (i9 != aVar.a) {
            return false;
        }
        if (i9 == 0) {
            return true;
        }
        return i9 == 17 ? this.i == aVar.i && this.m == aVar.m : i9 == 5 ? g(this.k, aVar.k) : i9 == 13 ? TextUtils.equals(this.c, aVar.c) : this.e == aVar.e && this.f == aVar.f && this.d == aVar.d && this.m == aVar.m && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && this.h == aVar.h && this.l == aVar.l && TextUtils.equals(this.c, aVar.c);
    }
}
