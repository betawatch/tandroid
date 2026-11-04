package jc;

import ed.e;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import ne.b;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;
    public char[] b;
    public int c;

    public void a(int i3, int i10) {
        int i11 = i10 + i3;
        char[] cArr = this.b;
        if (cArr.length <= i11) {
            int i12 = i3 * 2;
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
            int i3 = bVar.a;
            if (array.length + i3 < ne.a.a) {
                bVar.a = i3 + array.length;
                ((e) bVar.b).addLast(array);
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
