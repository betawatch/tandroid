package c2;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z {
    public final y a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Bundle s;
    public IntentSender t;
    public n u;
    public a0.f w;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public z(y yVar, String str, String str2, boolean z10) {
        this.a = yVar;
        this.b = str;
        this.c = str2;
        this.h = z10;
    }

    public static q a() {
        b0.b();
        r rVar = b0.c().e;
        if (rVar instanceof q) {
            return (q) rVar;
        }
        return null;
    }

    public final ae.b b(z zVar) {
        if (zVar == null) {
            throw new NullPointerException("route must not be null");
        }
        String str = zVar.c;
        a0.f fVar = this.w;
        if (fVar == null || !fVar.containsKey(str)) {
            return null;
        }
        return new ae.b((p) this.w.get(str), 5);
    }

    public final s c() {
        y yVar = this.a;
        yVar.getClass();
        b0.b();
        return yVar.a;
    }

    public final boolean d() {
        b0.b();
        z zVar = b0.c().v;
        if (zVar == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (zVar == this || this.n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) ((k5.i) c().d).b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return DesugarCollections.unmodifiableList(this.v).size() >= 1;
    }

    public final boolean f() {
        return this.u != null && this.g;
    }

    public final boolean g() {
        b0.b();
        return b0.c().e() == this;
    }

    public final boolean h(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        b0.b();
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            uVar.a();
            if (!uVar.b.isEmpty()) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        Iterator it = uVar.b.iterator();
                        while (it.hasNext()) {
                            if (intentFilter.hasCategory((String) it.next())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0103, code lost:
    
        if (r5.hasNext() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(n nVar) {
        int i10;
        z zVar;
        int countActions;
        if (this.u == nVar) {
            return 0;
        }
        this.u = nVar;
        if (nVar == null) {
            return 0;
        }
        Bundle bundle = nVar.a;
        if (Objects.equals(this.d, bundle.getString("name"))) {
            i10 = 0;
        } else {
            this.d = bundle.getString("name");
            i10 = 1;
        }
        if (!Objects.equals(this.e, bundle.getString("status"))) {
            this.e = bundle.getString("status");
            i10 = 1;
        }
        Uri uri = this.f;
        String string = bundle.getString("iconUri");
        if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
            String string2 = bundle.getString("iconUri");
            this.f = string2 == null ? null : Uri.parse(string2);
            i10 = 1;
        }
        if (this.g != bundle.getBoolean("enabled", true)) {
            this.g = bundle.getBoolean("enabled", true);
            i10 = 1;
        }
        if (this.i != bundle.getInt("connectionState", 0)) {
            this.i = bundle.getInt("connectionState", 0);
            i10 = 1;
        }
        ArrayList b10 = nVar.b();
        ArrayList arrayList = this.k;
        if (arrayList != b10) {
            if (arrayList != null) {
                ListIterator listIterator = arrayList.listIterator();
                ListIterator listIterator2 = b10.listIterator();
                loop0: while (listIterator.hasNext() && listIterator2.hasNext()) {
                    IntentFilter intentFilter = (IntentFilter) listIterator.next();
                    IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                    if (intentFilter != intentFilter2) {
                        if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                            break;
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 >= countActions) {
                                int countCategories = intentFilter.countCategories();
                                if (countCategories != intentFilter2.countCategories()) {
                                    break;
                                }
                                for (int i12 = 0; i12 < countCategories; i12++) {
                                    if (!intentFilter.getCategory(i12).equals(intentFilter2.getCategory(i12))) {
                                        break loop0;
                                    }
                                }
                            } else {
                                if (!intentFilter.getAction(i11).equals(intentFilter2.getAction(i11))) {
                                    break loop0;
                                }
                                i11++;
                            }
                        }
                    }
                }
                if (!listIterator.hasNext()) {
                }
            }
            arrayList.clear();
            arrayList.addAll(nVar.b());
            i10 = 1;
        }
        if (this.l != bundle.getInt("playbackType", 1)) {
            this.l = bundle.getInt("playbackType", 1);
            i10 = 1;
        }
        if (this.m != bundle.getInt("playbackStream", -1)) {
            this.m = bundle.getInt("playbackStream", -1);
            i10 = 1;
        }
        if (this.n != bundle.getInt("deviceType")) {
            this.n = bundle.getInt("deviceType");
            i10 = 1;
        }
        int i13 = 3;
        if (this.o != bundle.getInt("volumeHandling", 0)) {
            this.o = bundle.getInt("volumeHandling", 0);
            i10 = 3;
        }
        if (this.p != bundle.getInt("volume")) {
            this.p = bundle.getInt("volume");
            i10 = 3;
        }
        if (this.q != bundle.getInt("volumeMax")) {
            this.q = bundle.getInt("volumeMax");
        } else {
            i13 = i10;
        }
        if (this.r != bundle.getInt("presentationDisplayId", -1)) {
            this.r = bundle.getInt("presentationDisplayId", -1);
            i13 |= 5;
        }
        if (!Objects.equals(this.s, bundle.getBundle("extras"))) {
            this.s = bundle.getBundle("extras");
            i13 |= 1;
        }
        if (!Objects.equals(this.t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
            this.t = (IntentSender) bundle.getParcelable("settingsIntent");
            i13 |= 1;
        }
        if (this.j != bundle.getBoolean("canDisconnect", false)) {
            this.j = bundle.getBoolean("canDisconnect", false);
            i13 |= 5;
        }
        ArrayList c10 = nVar.c();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = c10.size() != this.v.size();
        if (!c10.isEmpty()) {
            e c11 = b0.c();
            int size = c10.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = c10.get(i14);
                i14++;
                c11.getClass();
                String str = (String) c11.k.get(new q0.b(((ComponentName) this.a.d.b).flattenToShortString(), (String) obj));
                ArrayList arrayList3 = c11.j;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        zVar = null;
                        break;
                    }
                    Object obj2 = arrayList3.get(i15);
                    i15++;
                    zVar = (z) obj2;
                    if (zVar.c.equals(str)) {
                        break;
                    }
                }
                if (zVar != null) {
                    arrayList2.add(zVar);
                    if (!z10 && !this.v.contains(zVar)) {
                        z10 = true;
                    }
                }
            }
        }
        if (!z10) {
            return i13;
        }
        this.v = arrayList2;
        return i13 | 1;
    }

    public final void j(int i10) {
        r rVar;
        r rVar2;
        b0.b();
        e c10 = b0.c();
        int min = Math.min(this.q, Math.max(0, i10));
        HashMap hashMap = c10.b;
        if (this == c10.d && (rVar2 = c10.e) != null) {
            rVar2.f(min);
        } else {
            if (hashMap.isEmpty() || (rVar = (r) hashMap.get(this.c)) == null) {
                return;
            }
            rVar.f(min);
        }
    }

    public final void k(int i10) {
        r rVar;
        r rVar2;
        b0.b();
        if (i10 != 0) {
            e c10 = b0.c();
            HashMap hashMap = c10.b;
            if (this == c10.d && (rVar2 = c10.e) != null) {
                rVar2.i(i10);
            } else {
                if (hashMap.isEmpty() || (rVar = (r) hashMap.get(this.c)) == null) {
                    return;
                }
                rVar.i(i10);
            }
        }
    }

    public final void l() {
        b0.b();
        b0.c().i(this, 3);
    }

    public final boolean m(String str) {
        b0.b();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        this.v.clear();
        if (this.w == null) {
            this.w = new a0.f(0);
        }
        this.w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            z a2 = this.a.a(pVar.a.d());
            if (a2 != null) {
                this.w.put(a2.c, pVar);
                int i10 = pVar.b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        b0.c().a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f);
        sb2.append(", enabled=");
        sb2.append(this.g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.i);
        sb2.append(", canDisconnect=");
        sb2.append(this.j);
        sb2.append(", playbackType=");
        sb2.append(this.l);
        sb2.append(", playbackStream=");
        sb2.append(this.m);
        sb2.append(", deviceType=");
        sb2.append(this.n);
        sb2.append(", volumeHandling=");
        sb2.append(this.o);
        sb2.append(", volume=");
        sb2.append(this.p);
        sb2.append(", volumeMax=");
        sb2.append(this.q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.r);
        sb2.append(", extras=");
        sb2.append(this.s);
        sb2.append(", settingsIntent=");
        sb2.append(this.t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.a.d.b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((z) this.v.get(i10)).c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
