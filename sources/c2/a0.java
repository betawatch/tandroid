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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a0 {
    public final z a;
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

    public a0(z zVar, String str, String str2, boolean z4) {
        this.a = zVar;
        this.b = str;
        this.c = str2;
        this.h = z4;
    }

    public static r a() {
        c0.b();
        s sVar = c0.c().e;
        if (sVar instanceof r) {
            return (r) sVar;
        }
        return null;
    }

    public final ja.c b(a0 a0Var) {
        if (a0Var == null) {
            throw new NullPointerException("route must not be null");
        }
        String str = a0Var.c;
        a0.f fVar = this.w;
        if (fVar == null || !fVar.containsKey(str)) {
            return null;
        }
        return new ja.c((q) this.w.get(str));
    }

    public final t c() {
        z zVar = this.a;
        zVar.getClass();
        c0.b();
        return zVar.a;
    }

    public final boolean d() {
        c0.b();
        a0 a0Var = c0.c().v;
        if (a0Var == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (a0Var == this || this.n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) ((y5.h) c().d).b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return DesugarCollections.unmodifiableList(this.v).size() >= 1;
    }

    public final boolean f() {
        return this.u != null && this.g;
    }

    public final boolean g() {
        c0.b();
        return c0.c().e() == this;
    }

    public final boolean h(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        c0.b();
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            vVar.a();
            if (!vVar.b.isEmpty()) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        Iterator it = vVar.b.iterator();
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
        a0 a0Var;
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
        ArrayList c3 = nVar.c();
        ArrayList arrayList2 = new ArrayList();
        boolean z4 = c3.size() != this.v.size();
        if (!c3.isEmpty()) {
            e c10 = c0.c();
            int size = c3.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = c3.get(i14);
                i14++;
                c10.getClass();
                String str = (String) c10.k.get(new q0.b(((ComponentName) this.a.d.b).flattenToShortString(), (String) obj));
                ArrayList arrayList3 = c10.j;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        a0Var = null;
                        break;
                    }
                    Object obj2 = arrayList3.get(i15);
                    i15++;
                    a0Var = (a0) obj2;
                    if (a0Var.c.equals(str)) {
                        break;
                    }
                }
                if (a0Var != null) {
                    arrayList2.add(a0Var);
                    if (!z4 && !this.v.contains(a0Var)) {
                        z4 = true;
                    }
                }
            }
        }
        if (!z4) {
            return i13;
        }
        this.v = arrayList2;
        return i13 | 1;
    }

    public final void j(int i10) {
        s sVar;
        s sVar2;
        c0.b();
        e c3 = c0.c();
        int min = Math.min(this.q, Math.max(0, i10));
        HashMap hashMap = c3.b;
        if (this == c3.d && (sVar2 = c3.e) != null) {
            sVar2.f(min);
        } else {
            if (hashMap.isEmpty() || (sVar = (s) hashMap.get(this.c)) == null) {
                return;
            }
            sVar.f(min);
        }
    }

    public final void k(int i10) {
        s sVar;
        s sVar2;
        c0.b();
        if (i10 != 0) {
            e c3 = c0.c();
            HashMap hashMap = c3.b;
            if (this == c3.d && (sVar2 = c3.e) != null) {
                sVar2.i(i10);
            } else {
                if (hashMap.isEmpty() || (sVar = (s) hashMap.get(this.c)) == null) {
                    return;
                }
                sVar.i(i10);
            }
        }
    }

    public final void l() {
        c0.b();
        c0.c().i(this, 3);
    }

    public final boolean m(String str) {
        c0.b();
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
            q qVar = (q) it.next();
            a0 a2 = this.a.a(qVar.a.d());
            if (a2 != null) {
                this.w.put(a2.c, qVar);
                int i10 = qVar.b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        c0.c().a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.l);
        sb.append(", playbackStream=");
        sb.append(this.m);
        sb.append(", deviceType=");
        sb.append(this.n);
        sb.append(", volumeHandling=");
        sb.append(this.o);
        sb.append(", volume=");
        sb.append(this.p);
        sb.append(", volumeMax=");
        sb.append(this.q);
        sb.append(", presentationDisplayId=");
        sb.append(this.r);
        sb.append(", extras=");
        sb.append(this.s);
        sb.append(", settingsIntent=");
        sb.append(this.t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.a.d.b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb.append(((a0) this.v.get(i10)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
