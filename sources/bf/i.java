package bf;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i extends gf.a {
    public final /* synthetic */ int a;
    public final ef.a b;
    public final Serializable c;

    public i() {
        this.a = 1;
        this.b = new ef.l();
        this.c = new ArrayList();
    }

    @Override // gf.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // gf.a
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
                ((ef.l) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // gf.a
    public final ef.a e() {
        switch (this.a) {
            case 0:
                return (ef.i) this.b;
            default:
                return (ef.l) this.b;
        }
    }

    @Override // gf.a
    public void g(ff.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (ef.i) this.b);
                break;
        }
    }

    @Override // gf.a
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

    public i(int i10, String str) {
        this.a = 0;
        ef.i iVar = new ef.i();
        this.b = iVar;
        iVar.g = i10;
        this.c = str;
    }
}
