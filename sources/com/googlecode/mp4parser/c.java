package com.googlecode.mp4parser;

import java.nio.ByteBuffer;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c extends a {
    public static final /* synthetic */ i9 c;
    public static final /* synthetic */ i9 d;
    public int a;
    public int b;

    static {
        we.a aVar = new we.a(c.class, "AbstractFullBox.java");
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
        this.a = g5.b.k(byteBuffer);
        this.b = g5.b.a(byteBuffer.get()) + (g5.b.h(byteBuffer) << 8);
    }

    public final void g(int i3) {
        com.google.android.recaptcha.internal.a.t(we.a.c(d, this, this, new Integer(i3)));
        this.b = i3;
    }

    @Override // com.googlecode.mp4parser.a
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        com.google.android.recaptcha.internal.a.t(we.a.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        g5.b.r(this.a, byteBuffer);
        g5.b.q(this.b, byteBuffer);
    }
}
