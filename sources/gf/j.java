package gf;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j extends mf.a {
    public final /* synthetic */ int a;
    public final kf.a b;
    public final Serializable c;

    public j() {
        this.a = 1;
        this.b = new kf.l();
        this.c = new ArrayList();
    }

    @Override // mf.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // mf.a
    public void d() {
        int i7;
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
                for (i7 = 0; i7 < size + 1; i7++) {
                    sb2.append((CharSequence) arrayList.get(i7));
                    sb2.append('\n');
                }
                ((kf.l) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // mf.a
    public final kf.a e() {
        switch (this.a) {
            case 0:
                return (kf.i) this.b;
            default:
                return (kf.l) this.b;
        }
    }

    @Override // mf.a
    public void g(lf.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (kf.i) this.b);
                break;
        }
    }

    @Override // mf.a
    public final a h(h hVar) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (hVar.g >= 4) {
                    return new a(-1, hVar.c + 4, false);
                }
                if (hVar.h) {
                    return a.a(hVar.e);
                }
                return null;
        }
    }

    public j(int i7, String str) {
        this.a = 0;
        kf.i iVar = new kf.i();
        this.b = iVar;
        iVar.g = i7;
        this.c = str;
    }
}
