package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.cast.u4;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public e(u4 u4Var) {
        this.d = u4Var;
        this.c = u4Var.j();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                }
                break;
            case 1:
                if (this.b < this.c) {
                }
                break;
            case 2:
                if (this.b < this.c) {
                }
                break;
            case 3:
                if (this.b < this.c) {
                }
                break;
            case 4:
                if (this.b < this.c) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i7 = this.b;
                if (i7 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i7 + 1;
                return Byte.valueOf(((h) this.d).m(i7));
            case 1:
                int i10 = this.b;
                if (i10 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i10 + 1;
                return Byte.valueOf(((u4) this.d).i(i10));
            case 2:
                try {
                    com.google.android.gms.internal.clearcut.o oVar = (com.google.android.gms.internal.clearcut.o) this.d;
                    int i11 = this.b;
                    this.b = i11 + 1;
                    return Byte.valueOf(oVar.j(i11));
                } catch (IndexOutOfBoundsException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 3:
                int i12 = this.b;
                if (i12 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i12 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.play_billing.l1) this.d).i(i12));
            case 4:
                int i13 = this.b;
                if (i13 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i13 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.vision.q0) this.d).k(i13));
            default:
                int i14 = this.b;
                if (i14 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i14 + 1;
                return Byte.valueOf(((q7.s0) this.d).i(i14));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public e(com.google.android.gms.internal.clearcut.o oVar) {
        this.d = oVar;
        this.c = oVar.size();
    }

    public e(com.google.android.gms.internal.play_billing.l1 l1Var) {
        this.d = l1Var;
        this.c = l1Var.j();
    }

    public e(com.google.android.gms.internal.vision.q0 q0Var) {
        this.d = q0Var;
        this.c = q0Var.i();
    }

    public e(q7.s0 s0Var) {
        this.d = s0Var;
        this.c = s0Var.k();
    }

    public e(h hVar) {
        this.d = hVar;
        this.c = hVar.size();
    }
}
