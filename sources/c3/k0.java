package c3;

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k0 {
    public final /* synthetic */ int a;
    public boolean b;

    public /* synthetic */ k0() {
        this.a = 4;
    }

    public void a(boolean z10) {
        switch (this.a) {
            case 2:
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

    public k0(Context context, Looper looper, e2.x xVar, int i10) {
        this.a = i10;
        switch (i10) {
            case 3:
                new rb.a(context.getApplicationContext());
                xVar.a(looper, null);
                break;
            default:
                new qb.b(context.getApplicationContext());
                xVar.a(looper, null);
                break;
        }
    }

    public k0(boolean z10) {
        this.a = 0;
        this.b = z10;
    }

    public k0(f2.o oVar, f2.q qVar) {
        this.a = 1;
        int i10 = qVar.a;
        ByteBuffer byteBuffer = qVar.b;
        e2.d.b(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.h hVar = new a4.h(bArr, min);
        oVar.getClass();
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
        throw new f2.p();
    }
}
