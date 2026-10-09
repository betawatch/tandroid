package c3;

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j0 {
    public final /* synthetic */ int a;
    public boolean b;

    public /* synthetic */ j0() {
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

    public j0(Context context, Looper looper, e2.x xVar, int i10) {
        this.a = i10;
        switch (i10) {
            case 3:
                new na.d(context.getApplicationContext());
                xVar.a(looper, null);
                break;
            default:
                new t7.t(context.getApplicationContext());
                xVar.a(looper, null);
                break;
        }
    }

    public j0(boolean z10) {
        this.a = 0;
        this.b = z10;
    }

    public j0(f2.p pVar, f2.r rVar) {
        this.a = 1;
        int i10 = rVar.a;
        ByteBuffer byteBuffer = rVar.b;
        e2.d.b(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, min);
        pVar.getClass();
        if (gVar.h()) {
            this.b = false;
            return;
        }
        int i11 = gVar.i(2);
        if (!gVar.h()) {
            this.b = true;
            return;
        }
        if (i11 != 3 && i11 != 0) {
            gVar.h();
        }
        gVar.s();
        throw new f2.q();
    }
}
