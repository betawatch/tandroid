package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.cast.z4;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public e(z4 z4Var) {
        this.d = z4Var;
        this.c = z4Var.o();
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
                int i10 = this.b;
                if (i10 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i10 + 1;
                return Byte.valueOf(((g) this.d).b[i10]);
            case 1:
                int i11 = this.b;
                if (i11 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i11 + 1;
                return Byte.valueOf(((z4) this.d).n(i11));
            case 2:
                try {
                    com.google.android.gms.internal.clearcut.o oVar = (com.google.android.gms.internal.clearcut.o) this.d;
                    int i12 = this.b;
                    this.b = i12 + 1;
                    return Byte.valueOf(oVar.o(i12));
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            case 3:
                int i13 = this.b;
                if (i13 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i13 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.play_billing.l1) this.d).n(i13));
            case 4:
                int i14 = this.b;
                if (i14 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i14 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.vision.q0) this.d).p(i14));
            default:
                int i15 = this.b;
                if (i15 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i15 + 1;
                return Byte.valueOf(((n7.t0) this.d).n(i15));
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
        this.c = l1Var.o();
    }

    public e(com.google.android.gms.internal.vision.q0 q0Var) {
        this.d = q0Var;
        this.c = q0Var.n();
    }

    public e(n7.t0 t0Var) {
        this.d = t0Var;
        this.c = t0Var.p();
    }

    public e(g gVar) {
        this.d = gVar;
        this.c = gVar.size();
    }
}
