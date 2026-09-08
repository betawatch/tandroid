package com.googlecode.mp4parser;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import mg.n;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class c extends a {
    public static final /* synthetic */ n c;
    public static final /* synthetic */ n d;
    public int a;
    public int b;

    static {
        re.a aVar = new re.a(c.class, "AbstractFullBox.java");
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
        e2.q(re.a.c(d, this, this, new Integer(i10)));
        this.b = i10;
    }

    @Override // com.googlecode.mp4parser.a
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        e2.q(re.a.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        e5.b.r(this.a, byteBuffer);
        e5.b.q(this.b, byteBuffer);
    }
}
