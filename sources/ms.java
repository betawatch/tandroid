// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ms implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ms(ps psVar, byte b) {
        this(psVar.c);
        this.d = b;
        switch (b) {
            case 1:
                this.e = psVar;
                this(psVar.c);
                break;
            default:
                this.e = psVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f;
        if (!hasNext()) {
            w26.g();
            return null;
        }
        int i = this.b;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                f = ((ps) obj).f(i);
                break;
            case 1:
                f = ((ps) obj).i(i);
                break;
            default:
                f = ((rs) obj).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            sc8.j("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((ps) obj).g(i);
                break;
            case 1:
                ((ps) obj).g(i);
                break;
            default:
                ((rs) obj).h(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ms(rs rsVar) {
        this(rsVar.c);
        this.d = (byte) 2;
        this.e = rsVar;
    }

    public ms(int i) {
        this.a = i;
    }
}
