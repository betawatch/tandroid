package ie;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends ne.a {
    public final /* synthetic */ int a;
    public final le.a b;
    public final Serializable c;

    public g() {
        this.a = 1;
        this.b = new le.l();
        this.c = new ArrayList();
    }

    @Override // ne.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // ne.a
    public void d() {
        int i10;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                char charAt = charSequence.charAt(i11);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i11++;
                            } else {
                                i11 = -1;
                            }
                        }
                        if (i11 == -1) {
                            size--;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (i10 = 0; i10 < size + 1; i10++) {
                    sb2.append((CharSequence) arrayList.get(i10));
                    sb2.append('\n');
                }
                ((le.l) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // ne.a
    public final le.a e() {
        switch (this.a) {
            case 0:
                return (le.i) this.b;
            default:
                return (le.l) this.b;
        }
    }

    @Override // ne.a
    public void g(me.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (le.i) this.b);
                break;
        }
    }

    @Override // ne.a
    public final g4.h h(e eVar) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (eVar.g >= 4) {
                    return new g4.h(-1, eVar.c + 4, false);
                }
                if (eVar.h) {
                    return g4.h.a(eVar.e);
                }
                return null;
        }
    }

    public g(int i10, String str) {
        this.a = 0;
        le.i iVar = new le.i();
        this.b = iVar;
        iVar.g = i10;
        this.c = str;
    }
}
