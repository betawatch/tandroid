// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ns implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ns(qs qsVar, byte b) {
        this(qsVar.c);
        this.d = b;
        switch (b) {
            case 1:
                this.e = qsVar;
                this(qsVar.c);
                break;
            default:
                this.e = qsVar;
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
            lq5.n();
            return null;
        }
        int i = this.b;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                f = ((qs) obj).f(i);
                break;
            case 1:
                f = ((qs) obj).i(i);
                break;
            default:
                f = ((ss) obj).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            grb.i("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((qs) obj).g(i);
                break;
            case 1:
                ((qs) obj).g(i);
                break;
            default:
                ((ss) obj).h(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ns(ss ssVar) {
        this(ssVar.c);
        this.d = (byte) 2;
        this.e = ssVar;
    }

    public ns(int i) {
        this.a = i;
    }
}
