package com.googlecode.mp4parser;

import c3.h0;
import java.nio.ByteBuffer;
import li.e3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class c extends a {
    public static final /* synthetic */ e3 c;
    public static final /* synthetic */ e3 d;
    public int a;
    public int b;

    static {
        ue.a aVar = new ue.a(c.class, "AbstractFullBox.java");
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
        this.a = f5.b.k(byteBuffer);
        this.b = f5.b.a(byteBuffer.get()) + (f5.b.h(byteBuffer) << 8);
    }

    public final void g(int i10) {
        h0.s(ue.a.c(d, this, this, new Integer(i10)));
        this.b = i10;
    }

    @Override // com.googlecode.mp4parser.a
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        h0.s(ue.a.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        f5.b.r(this.a, byteBuffer);
        f5.b.q(this.b, byteBuffer);
    }
}
