// default package

import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class kla implements Iterator {
    public String b;
    public final CharSequence c;
    public final qj1 d;
    public final /* synthetic */ v39 h;
    public int a = 2;
    public int e = 0;
    public int f = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public kla(v39 v39Var, wk4 wk4Var, CharSequence charSequence) {
        this.h = v39Var;
        this.d = (qj1) wk4Var.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i;
        gre.p(this.a != 4);
        int F = ug8.F(this.a);
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
                tj1 tj1Var = (tj1) this.h.b;
                CharSequence charSequence = this.c;
                int length = charSequence.length();
                gre.m(i3, length);
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (tj1Var.b(charSequence.charAt(i3))) {
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
                    qj1 qj1Var = this.d;
                    if (i2 < i3) {
                        charSequence.charAt(i2);
                        qj1Var.getClass();
                        charSequence.charAt(i3 - 1);
                        qj1Var.getClass();
                    }
                    int i5 = this.f;
                    if (i5 == 1) {
                        i3 = charSequence.length();
                        this.e = -1;
                        if (i3 > i2) {
                            charSequence.charAt(i3 - 1);
                            qj1Var.getClass();
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
            w26.g();
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
