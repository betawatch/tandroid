// default package

import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lna implements Iterator {
    public String b;
    public final CharSequence c;
    public final yk1 d;
    public final /* synthetic */ oo8 h;
    public int a = 2;
    public int e = 0;
    public int f = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public lna(oo8 oo8Var, wm4 wm4Var, CharSequence charSequence) {
        this.h = oo8Var;
        this.d = (yk1) wm4Var.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i;
        jte.p(this.a != 4);
        int F = wi8.F(this.a);
        if (F == 0) {
            return true;
        }
        if (F != 2) {
            this.a = 4;
            int i2 = this.e;
            while (true) {
                int i3 = this.e;
                if (i3 == -1) {
                    this.a = 3;
                    str = null;
                    break;
                }
                bl1 bl1Var = (bl1) this.h.b;
                CharSequence charSequence = this.c;
                int length = charSequence.length();
                jte.m(i3, length);
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (bl1Var.b(charSequence.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 == -1) {
                    i3 = charSequence.length();
                    this.e = -1;
                    i = -1;
                } else {
                    i = i3 + 1;
                    this.e = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.e = i4;
                    if (i4 > charSequence.length()) {
                        this.e = -1;
                    }
                } else {
                    yk1 yk1Var = this.d;
                    if (i2 < i3) {
                        charSequence.charAt(i2);
                        yk1Var.getClass();
                        charSequence.charAt(i3 - 1);
                        yk1Var.getClass();
                    }
                    int i5 = this.f;
                    if (i5 == 1) {
                        i3 = charSequence.length();
                        this.e = -1;
                        if (i3 > i2) {
                            charSequence.charAt(i3 - 1);
                            yk1Var.getClass();
                        }
                    } else {
                        this.f = i5 - 1;
                    }
                    str = charSequence.subSequence(i2, i3).toString();
                }
            }
            this.b = str;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            u36.g();
            return null;
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
