package df;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i extends jf.a {
    public final /* synthetic */ int a;
    public final gf.a b;
    public final Serializable c;

    public i() {
        this.a = 1;
        this.b = new gf.l();
        this.c = new ArrayList();
    }

    @Override // jf.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // jf.a
    public void d() {
        int i3;
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
                for (i3 = 0; i3 < size + 1; i3++) {
                    sb2.append((CharSequence) arrayList.get(i3));
                    sb2.append('\n');
                }
                ((gf.l) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // jf.a
    public final gf.a e() {
        switch (this.a) {
            case 0:
                return (gf.i) this.b;
            default:
                return (gf.l) this.b;
        }
    }

    @Override // jf.a
    public void g(hf.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (gf.i) this.b);
                break;
        }
    }

    @Override // jf.a
    public final a h(g gVar) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (gVar.g >= 4) {
                    return new a(-1, gVar.c + 4, false);
                }
                if (gVar.h) {
                    return a.a(gVar.e);
                }
                return null;
        }
    }

    public i(int i3, String str) {
        this.a = 0;
        gf.i iVar = new gf.i();
        this.b = iVar;
        iVar.g = i3;
        this.c = str;
    }
}
