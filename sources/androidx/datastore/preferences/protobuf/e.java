package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.cast.w4;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public e(b7.w0 w0Var) {
        this.d = w0Var;
        this.c = w0Var.p();
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
                return Byte.valueOf(((b7.w0) this.d).n(i11));
            case 2:
                int i12 = this.b;
                if (i12 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i12 + 1;
                return Byte.valueOf(((w4) this.d).n(i12));
            case 3:
                try {
                    com.google.android.gms.internal.clearcut.o oVar = (com.google.android.gms.internal.clearcut.o) this.d;
                    int i13 = this.b;
                    this.b = i13 + 1;
                    return Byte.valueOf(oVar.o(i13));
                } catch (IndexOutOfBoundsException e6) {
                    throw new NoSuchElementException(e6.getMessage());
                }
            case 4:
                int i14 = this.b;
                if (i14 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i14 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.play_billing.l1) this.d).n(i14));
            default:
                int i15 = this.b;
                if (i15 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i15 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.vision.q0) this.d).p(i15));
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

    public e(w4 w4Var) {
        this.d = w4Var;
        this.c = w4Var.o();
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

    public e(g gVar) {
        this.d = gVar;
        this.c = gVar.size();
    }
}
