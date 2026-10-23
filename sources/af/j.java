package af;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class j extends ff.a {
    public final /* synthetic */ int a;
    public final df.a b;
    public final Serializable c;

    public j() {
        this.a = 1;
        this.b = new df.l();
        this.c = new ArrayList();
    }

    @Override // ff.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // ff.a
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
                ((df.l) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // ff.a
    public final df.a e() {
        switch (this.a) {
            case 0:
                return (df.i) this.b;
            default:
                return (df.l) this.b;
        }
    }

    @Override // ff.a
    public void g(ef.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (df.i) this.b);
                break;
        }
    }

    @Override // ff.a
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

    public j(int i10, String str) {
        this.a = 0;
        df.i iVar = new df.i();
        this.b = iVar;
        iVar.g = i10;
        this.c = str;
    }
}
