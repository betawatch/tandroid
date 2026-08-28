package com.googlecode.mp4parser;

import java.nio.ByteBuffer;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c extends a {
    public static final /* synthetic */ zd.b c;
    public static final /* synthetic */ zd.b d;
    public int a;
    public int b;

    static {
        zd.a aVar = new zd.a(c.class, "AbstractFullBox.java");
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
        this.a = p2.b.k(byteBuffer);
        this.b = p2.b.a(byteBuffer.get()) + (p2.b.h(byteBuffer) << 8);
    }

    public final void g(int i9) {
        j2.t(zd.a.c(d, this, this, new Integer(i9)));
        this.b = i9;
    }

    @Override // com.googlecode.mp4parser.a
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        j2.t(zd.a.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        p2.b.r(this.a, byteBuffer);
        p2.b.q(this.b, byteBuffer);
    }
}
