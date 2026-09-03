package gd;

import java.util.Iterator;
import k7.u8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class a implements Iterable {
    public final char a;
    public final char b;
    public final int c = 1;

    public a(char c3, char c10) {
        this.a = c3;
        this.b = (char) u8.a(c3, c10, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a, this.b, this.c);
    }
}
