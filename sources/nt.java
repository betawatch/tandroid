// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nt implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nt(qt qtVar, byte b) {
        this(qtVar.c);
        this.d = b;
        switch (b) {
            case 1:
                this.e = qtVar;
                this(qtVar.c);
                break;
            default:
                this.e = qtVar;
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
            u36.g();
            return null;
        }
        int i = this.b;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                f = ((qt) obj).f(i);
                break;
            case 1:
                f = ((qt) obj).i(i);
                break;
            default:
                f = ((st) obj).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            dq9.m("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((qt) obj).g(i);
                break;
            case 1:
                ((qt) obj).g(i);
                break;
            default:
                ((st) obj).h(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nt(st stVar) {
        this(stVar.c);
        this.d = (byte) 2;
        this.e = stVar;
    }

    public nt(int i) {
        this.a = i;
    }
}
