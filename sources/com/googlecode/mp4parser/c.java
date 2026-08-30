package com.googlecode.mp4parser;

import java.nio.ByteBuffer;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class c extends a {
    public static final /* synthetic */ a3.c c;
    public static final /* synthetic */ a3.c d;
    public int a;
    public int b;

    static {
        de.a aVar = new de.a(c.class, "AbstractFullBox.java");
        c = aVar.e(aVar.d("setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "void"));
        d = aVar.e(aVar.d("setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "void"));
    }

    @Override // com.googlecode.mp4parser.a
    public void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
    }

    public final int d() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.b;
    }

    public final int e() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.a;
    }

    public final void f(ByteBuffer byteBuffer) {
        this.a = r2.b.k(byteBuffer);
        this.b = r2.b.a(byteBuffer.get()) + (r2.b.h(byteBuffer) << 8);
    }

    public final void g(int i10) {
        yh.v(de.a.c(d, this, this, new Integer(i10)));
        this.b = i10;
    }

    @Override // com.googlecode.mp4parser.a
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        yh.v(de.a.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        r2.b.r(this.a, byteBuffer);
        r2.b.q(this.b, byteBuffer);
    }
}
