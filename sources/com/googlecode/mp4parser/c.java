package com.googlecode.mp4parser;

import java.nio.ByteBuffer;
import y7.i6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class c extends a {
    public static final /* synthetic */ i6 c;
    public static final /* synthetic */ i6 d;
    public int a;
    public int b;

    static {
        ze.a aVar = new ze.a(c.class, "AbstractFullBox.java");
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
        this.a = h5.b.k(byteBuffer);
        this.b = h5.b.a(byteBuffer.get()) + (h5.b.h(byteBuffer) << 8);
    }

    public final void g(int i7) {
        com.google.android.recaptcha.internal.a.t(ze.a.c(d, this, this, new Integer(i7)));
        this.b = i7;
    }

    @Override // com.googlecode.mp4parser.a
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        com.google.android.recaptcha.internal.a.t(ze.a.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        h5.b.r(this.a, byteBuffer);
        h5.b.q(this.b, byteBuffer);
    }
}
