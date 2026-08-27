package ge;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends le.a {
    public final /* synthetic */ int a;
    public final je.a b;
    public final Serializable c;

    public g() {
        this.a = 1;
        this.b = new je.l();
        this.c = new ArrayList();
    }

    @Override // le.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // le.a
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
                ((je.l) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // le.a
    public final je.a e() {
        switch (this.a) {
            case 0:
                return (je.i) this.b;
            default:
                return (je.l) this.b;
        }
    }

    @Override // le.a
    public void g(ke.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (je.i) this.b);
                break;
        }
    }

    @Override // le.a
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

    public g(int i10, String str) {
        this.a = 0;
        je.i iVar = new je.i();
        this.b = iVar;
        iVar.g = i10;
        this.c = str;
    }
}
