package fe;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends ke.a {
    public final /* synthetic */ int a;
    public final ie.a b;
    public final Serializable c;

    public g() {
        this.a = 1;
        this.b = new ie.l();
        this.c = new ArrayList();
    }

    @Override // ke.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // ke.a
    public void d() {
        int i9;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                char charAt = charSequence.charAt(i10);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i10++;
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 == -1) {
                            size--;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (i9 = 0; i9 < size + 1; i9++) {
                    sb2.append((CharSequence) arrayList.get(i9));
                    sb2.append('\n');
                }
                ((ie.l) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // ke.a
    public final ie.a e() {
        switch (this.a) {
            case 0:
                return (ie.i) this.b;
            default:
                return (ie.l) this.b;
        }
    }

    @Override // ke.a
    public void g(je.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (ie.i) this.b);
                break;
        }
    }

    @Override // ke.a
    public final e4.h h(e eVar) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (eVar.g >= 4) {
                    return new e4.h(-1, eVar.c + 4, false);
                }
                if (eVar.h) {
                    return e4.h.a(eVar.e);
                }
                return null;
        }
    }

    public g(int i9, String str) {
        this.a = 0;
        ie.i iVar = new ie.i();
        this.b = iVar;
        iVar.g = i9;
        this.c = str;
    }
}
