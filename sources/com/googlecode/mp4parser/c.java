package com.googlecode.mp4parser;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class c extends a {
    public static final /* synthetic */ te.b c;
    public static final /* synthetic */ te.b d;
    public int a;
    public int b;

    static {
        te.a aVar = new te.a(c.class, "AbstractFullBox.java");
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
        this.a = e5.b.k(byteBuffer);
        this.b = e5.b.a(byteBuffer.get()) + (e5.b.h(byteBuffer) << 8);
    }

    public final void g(int i10) {
        k3.p(te.a.c(d, this, this, new Integer(i10)));
        this.b = i10;
    }

    @Override // com.googlecode.mp4parser.a
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        k3.p(te.a.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        e5.b.r(this.a, byteBuffer);
        e5.b.q(this.b, byteBuffer);
    }
}
