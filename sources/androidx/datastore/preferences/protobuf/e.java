package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.cast.x4;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public e(x4 x4Var) {
        this.d = x4Var;
        this.c = x4Var.o();
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
                int i9 = this.b;
                if (i9 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i9 + 1;
                return Byte.valueOf(((g) this.d).b[i9]);
            case 1:
                int i10 = this.b;
                if (i10 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i10 + 1;
                return Byte.valueOf(((x4) this.d).n(i10));
            case 2:
                try {
                    com.google.android.gms.internal.clearcut.o oVar = (com.google.android.gms.internal.clearcut.o) this.d;
                    int i11 = this.b;
                    this.b = i11 + 1;
                    return Byte.valueOf(oVar.o(i11));
                } catch (IndexOutOfBoundsException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 3:
                int i12 = this.b;
                if (i12 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i12 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.play_billing.l1) this.d).n(i12));
            case 4:
                int i13 = this.b;
                if (i13 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i13 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.vision.q0) this.d).p(i13));
            default:
                int i14 = this.b;
                if (i14 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i14 + 1;
                return Byte.valueOf(((x6.s0) this.d).n(i14));
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

    public e(x6.s0 s0Var) {
        this.d = s0Var;
        this.c = s0Var.p();
    }

    public e(g gVar) {
        this.d = gVar;
        this.c = gVar.size();
    }
}
