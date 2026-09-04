package ai;

import a4.h;
import android.content.Context;
import android.os.Looper;
import e2.d;
import e2.x;
import f2.p;
import f2.q;
import f2.r;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class a {
    public final /* synthetic */ int a;
    public boolean b;

    public /* synthetic */ a() {
        this.a = 0;
    }

    public void a(boolean z10) {
        switch (this.a) {
            case 3:
                if (this.b != z10) {
                    this.b = z10;
                    break;
                }
                break;
            default:
                if (this.b != z10) {
                    this.b = z10;
                    break;
                }
                break;
        }
    }

    public a(Context context, Looper looper, x xVar, int i10) {
        this.a = i10;
        switch (i10) {
            case 4:
                new ob.a(context.getApplicationContext());
                xVar.a(looper, null);
                break;
            default:
                context.getApplicationContext();
                xVar.a(looper, null);
                break;
        }
    }

    public a(boolean z10) {
        this.a = 1;
        this.b = z10;
    }

    public a(p pVar, r rVar) {
        this.a = 2;
        int i10 = rVar.a;
        ByteBuffer byteBuffer = rVar.b;
        d.b(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        h hVar = new h(bArr, min);
        pVar.getClass();
        if (hVar.h()) {
            this.b = false;
            return;
        }
        int i11 = hVar.i(2);
        if (!hVar.h()) {
            this.b = true;
            return;
        }
        if (i11 != 3 && i11 != 0) {
            hVar.h();
        }
        hVar.s();
        throw new q();
    }
}
