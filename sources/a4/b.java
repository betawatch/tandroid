package a4;

import d5.y;
import d5.z;
import h7.p8;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import o8.d;
import z3.c;
import z3.e;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends p8 {
    public final /* synthetic */ int a;

    public static b4.a c(z zVar) {
        String m10 = zVar.m();
        m10.getClass();
        String m11 = zVar.m();
        m11.getClass();
        return new b4.a(m10, m11, zVar.l(), zVar.l(), Arrays.copyOfRange(zVar.a, zVar.b, zVar.c));
    }

    @Override // h7.p8
    public final c b(e eVar, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                y yVar = new y(byteBuffer.array(), byteBuffer.limit());
                int i10 = 12;
                yVar.s(12);
                int f10 = (yVar.f() + yVar.i(12)) - 4;
                yVar.s(44);
                yVar.t(yVar.i(12));
                yVar.s(16);
                ArrayList arrayList = new ArrayList();
                while (yVar.f() < f10) {
                    yVar.s(48);
                    int i11 = yVar.i(8);
                    yVar.s(4);
                    int f11 = yVar.f() + yVar.i(i10);
                    String str = null;
                    String str2 = null;
                    while (yVar.f() < f11) {
                        int i12 = yVar.i(8);
                        int i13 = yVar.i(8);
                        int f12 = yVar.f() + i13;
                        if (i12 == 2) {
                            int i14 = yVar.i(16);
                            yVar.s(8);
                            if (i14 == 3) {
                                while (yVar.f() < f12) {
                                    int i15 = yVar.i(8);
                                    Charset charset = d.a;
                                    byte[] bArr = new byte[i15];
                                    yVar.k(i15, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i16 = yVar.i(8);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        yVar.t(yVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i12 == 21) {
                            Charset charset2 = d.a;
                            byte[] bArr2 = new byte[i13];
                            yVar.k(i13, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        yVar.p(f12 * 8);
                    }
                    yVar.p(f11 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i11, str.concat(str2)));
                    }
                    i10 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new c(arrayList);
            default:
                return new c(c(new z(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
