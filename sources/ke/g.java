package ke;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g extends pe.a {
    public final /* synthetic */ int a;
    public final ne.a b;
    public final Serializable c;

    public g() {
        this.a = 1;
        this.b = new ne.l();
        this.c = new ArrayList();
    }

    @Override // pe.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // pe.a
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
                StringBuilder sb = new StringBuilder();
                for (i10 = 0; i10 < size + 1; i10++) {
                    sb.append((CharSequence) arrayList.get(i10));
                    sb.append('\n');
                }
                ((ne.l) this.b).g = sb.toString();
                break;
        }
    }

    @Override // pe.a
    public final ne.a e() {
        switch (this.a) {
            case 0:
                return (ne.i) this.b;
            default:
                return (ne.l) this.b;
        }
    }

    @Override // pe.a
    public void g(oe.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (ne.i) this.b);
                break;
        }
    }

    @Override // pe.a
    public final j4.h h(e eVar) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (eVar.g >= 4) {
                    return new j4.h(-1, eVar.c + 4, false);
                }
                if (eVar.h) {
                    return j4.h.a(eVar.e);
                }
                return null;
        }
    }

    public g(int i10, String str) {
        this.a = 0;
        ne.i iVar = new ne.i();
        this.b = iVar;
        iVar.g = i10;
        this.c = str;
    }
}
