package mc;

import hd.d;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import qe.b;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;
    public char[] b;
    public int c;

    public void a(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = this.b;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.b = copyOf;
        }
    }

    public void b() {
        b bVar = b.c;
        char[] array = this.b;
        bVar.getClass();
        j.e(array, "array");
        synchronized (bVar) {
            int i7 = bVar.a;
            if (array.length + i7 < qe.a.a) {
                bVar.a = i7 + array.length;
                ((d) bVar.b).addLast(array);
            }
        }
    }

    public void c(String text) {
        j.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.c, length);
        text.getChars(0, text.length(), this.b, this.c);
        this.c += length;
    }

    public final String toString() {
        switch (this.a) {
        }
        return new String(this.b, 0, this.c);
    }
}
