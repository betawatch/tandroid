package com.googlecode.mp4parser;

import java.nio.ByteBuffer;
import m5.i;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class c extends a {
    public static final /* synthetic */ i c;
    public static final /* synthetic */ i d;
    public int a;
    public int b;

    static {
        be.a aVar = new be.a(c.class, "AbstractFullBox.java");
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
        th.u(be.a.c(d, this, this, new Integer(i10)));
        this.b = i10;
    }

    @Override // com.googlecode.mp4parser.a
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        th.u(be.a.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        r2.b.r(this.a, byteBuffer);
        r2.b.q(this.b, byteBuffer);
    }
}
