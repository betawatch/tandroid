// default package

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class eu6 {
    public final du6 a;
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
    public zs6 u;
    public ps w;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public eu6(du6 du6Var, String str, String str2, boolean z) {
        this.a = du6Var;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public static ut6 a() {
        gu6.b();
        vt6 vt6Var = gu6.c().e;
        if (vt6Var instanceof ut6) {
            return (ut6) vt6Var;
        }
        return null;
    }

    public final pj4 b(eu6 eu6Var) {
        if (eu6Var == null) {
            fvc.f("route must not be null");
            return null;
        }
        String str = eu6Var.c;
        ps psVar = this.w;
        if (psVar == null || !psVar.containsKey(str)) {
            return null;
        }
        return new pj4(this.w.get(str), (byte) 16);
    }

    public final wt6 c() {
        gu6.b();
        return this.a.a;
    }

    public final boolean d() {
        gu6.b();
        eu6 eu6Var = gu6.c().v;
        if (eu6Var == null) {
            sc8.j("There is no default route.  The media router has not yet been fully initialized.");
            return false;
        }
        if (eu6Var == this || this.n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) ((z24) c().d).b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return DesugarCollections.unmodifiableList(this.v).size() >= 1;
    }

    public final boolean f() {
        return this.u != null && this.g;
    }

    public final boolean g() {
        gu6.b();
        return gu6.c().e() == this;
    }

    public final boolean h(yt6 yt6Var) {
        if (yt6Var == null) {
            w26.j("selector must not be null");
            return false;
        }
        gu6.b();
        yt6Var.a();
        if (!yt6Var.b.isEmpty()) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                IntentFilter intentFilter = (IntentFilter) obj;
                if (intentFilter != null) {
                    Iterator it = yt6Var.b.iterator();
                    while (it.hasNext()) {
                        if (intentFilter.hasCategory((String) it.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f8, code lost:
    
        if (r5.hasNext() == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(zs6 zs6Var) {
        int i;
        int i2;
        eu6 eu6Var;
        int countActions;
        int i3 = 0;
        if (this.u != zs6Var) {
            this.u = zs6Var;
            if (zs6Var != null) {
                Bundle bundle = zs6Var.a;
                if (Objects.equals(this.d, bundle.getString("name"))) {
                    i = 0;
                } else {
                    this.d = bundle.getString("name");
                    i = 1;
                }
                if (!Objects.equals(this.e, bundle.getString("status"))) {
                    this.e = bundle.getString("status");
                    i = 1;
                }
                Uri uri = this.f;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.f = string2 == null ? null : Uri.parse(string2);
                    i = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i = 1;
                }
                if (this.i != bundle.getInt("connectionState", 0)) {
                    this.i = bundle.getInt("connectionState", 0);
                    i = 1;
                }
                ArrayList b = zs6Var.b();
                ArrayList arrayList = this.k;
                if (arrayList != b) {
                    ListIterator listIterator = arrayList.listIterator();
                    ListIterator listIterator2 = b.listIterator();
                    loop0: while (listIterator.hasNext() && listIterator2.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) listIterator.next();
                        IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                        if (intentFilter != intentFilter2) {
                            if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                                break;
                            }
                            int i4 = 0;
                            while (true) {
                                if (i4 < countActions) {
                                    if (!intentFilter.getAction(i4).equals(intentFilter2.getAction(i4))) {
                                        break loop0;
                                    }
                                    i4++;
                                } else {
                                    int countCategories = intentFilter.countCategories();
                                    if (countCategories != intentFilter2.countCategories()) {
                                        break;
                                    }
                                    for (int i5 = 0; i5 < countCategories; i5++) {
                                        if (!intentFilter.getCategory(i5).equals(intentFilter2.getCategory(i5))) {
                                            break loop0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!listIterator.hasNext()) {
                    }
                    arrayList.clear();
                    arrayList.addAll(zs6Var.b());
                    i = 1;
                }
                if (this.l != bundle.getInt("playbackType", 1)) {
                    this.l = bundle.getInt("playbackType", 1);
                    i = 1;
                }
                if (this.m != bundle.getInt("playbackStream", -1)) {
                    this.m = bundle.getInt("playbackStream", -1);
                    i = 1;
                }
                if (this.n != bundle.getInt("deviceType")) {
                    this.n = bundle.getInt("deviceType");
                    i = 1;
                }
                int i6 = 3;
                if (this.o != bundle.getInt("volumeHandling", 0)) {
                    this.o = bundle.getInt("volumeHandling", 0);
                    i = 3;
                }
                if (this.p != bundle.getInt("volume")) {
                    this.p = bundle.getInt("volume");
                    i = 3;
                }
                if (this.q != bundle.getInt("volumeMax")) {
                    this.q = bundle.getInt("volumeMax");
                } else {
                    i6 = i;
                }
                if (this.r != bundle.getInt("presentationDisplayId", -1)) {
                    this.r = bundle.getInt("presentationDisplayId", -1);
                    i6 |= 5;
                }
                if (!Objects.equals(this.s, bundle.getBundle("extras"))) {
                    this.s = bundle.getBundle("extras");
                    i6 |= 1;
                }
                if (!Objects.equals(this.t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.t = (IntentSender) bundle.getParcelable("settingsIntent");
                    i6 |= 1;
                }
                if (this.j != bundle.getBoolean("canDisconnect", false)) {
                    this.j = bundle.getBoolean("canDisconnect", false);
                    i6 |= 5;
                }
                ArrayList c = zs6Var.c();
                ArrayList arrayList2 = new ArrayList();
                boolean z = c.size() != this.v.size();
                if (!c.isEmpty()) {
                    ux4 c2 = gu6.c();
                    int size = c.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = c.get(i7);
                        i7++;
                        c2.getClass();
                        String str = (String) c2.k.get(new lu7(((ComponentName) this.a.d.b).flattenToShortString(), (String) obj));
                        ArrayList arrayList3 = c2.j;
                        int size2 = arrayList3.size();
                        int i8 = i3;
                        while (true) {
                            if (i8 >= size2) {
                                i2 = i3;
                                eu6Var = null;
                                break;
                            }
                            Object obj2 = arrayList3.get(i8);
                            i8++;
                            eu6Var = (eu6) obj2;
                            i2 = i3;
                            if (eu6Var.c.equals(str)) {
                                break;
                            }
                            i3 = i2;
                        }
                        if (eu6Var != null) {
                            arrayList2.add(eu6Var);
                            if (!z && !this.v.contains(eu6Var)) {
                                z = true;
                            }
                        }
                        i3 = i2;
                    }
                }
                if (!z) {
                    return i6;
                }
                this.v = arrayList2;
                return i6 | 1;
            }
        }
        return 0;
    }

    public final void j(int i) {
        vt6 vt6Var;
        vt6 vt6Var2;
        gu6.b();
        ux4 c = gu6.c();
        int min = Math.min(this.q, Math.max(0, i));
        HashMap hashMap = c.b;
        if (this == c.d && (vt6Var2 = c.e) != null) {
            vt6Var2.f(min);
        } else {
            if (hashMap.isEmpty() || (vt6Var = (vt6) hashMap.get(this.c)) == null) {
                return;
            }
            vt6Var.f(min);
        }
    }

    public final void k(int i) {
        vt6 vt6Var;
        vt6 vt6Var2;
        gu6.b();
        if (i != 0) {
            ux4 c = gu6.c();
            HashMap hashMap = c.b;
            if (this == c.d && (vt6Var2 = c.e) != null) {
                vt6Var2.i(i);
            } else {
                if (hashMap.isEmpty() || (vt6Var = (vt6) hashMap.get(this.c)) == null) {
                    return;
                }
                vt6Var.i(i);
            }
        }
    }

    public final void l() {
        gu6.b();
        gu6.c().i(this, 3);
    }

    public final boolean m(String str) {
        gu6.b();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(ArrayList arrayList) {
        this.v.clear();
        ps psVar = this.w;
        int i = 0;
        if (psVar == null) {
            psVar = new ps(0);
            this.w = psVar;
        }
        psVar.clear();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tt6 tt6Var = (tt6) obj;
            eu6 a = this.a.a(tt6Var.a.d());
            if (a != null) {
                this.w.put(a.c, tt6Var);
                int i2 = tt6Var.b;
                if (i2 == 2 || i2 == 3) {
                    this.v.add(a);
                }
            }
        }
        gu6.c().a.b(kk7.h4, this);
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
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i) != this) {
                    sb.append(((eu6) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
