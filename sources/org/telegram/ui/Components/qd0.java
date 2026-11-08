package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qd0 {
    public float a = 0.0f;
    public float b = 25.0f;
    public float c = 50.0f;
    public float d = 75.0f;
    public float e = 100.0f;
    public float[] f;

    public final float[] a() {
        float f10 = this.a;
        float f11 = this.b / 100.0f;
        float f12 = this.c / 100.0f;
        float f13 = this.d / 100.0f;
        float f14 = this.e;
        int i7 = 2;
        int i10 = 5;
        char c10 = '\f';
        char c11 = '\r';
        float[] fArr = {-0.001f, f10 / 100.0f, 0.0f, f10 / 100.0f, 0.25f, f11, 0.5f, f12, 0.75f, f13, 1.0f, f14 / 100.0f, 1.001f, f14 / 100.0f};
        int i11 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i12 = 1;
        while (i12 < i10) {
            int i13 = (i12 - 1) * i7;
            float f15 = fArr[i13];
            float f16 = fArr[i13 + 1];
            int i14 = i12 * 2;
            float f17 = fArr[i14];
            float f18 = fArr[i14 + 1];
            int i15 = i12 + 1;
            int i16 = i15 * 2;
            int i17 = i7;
            float f19 = fArr[i16];
            char c12 = c10;
            float f20 = fArr[i16 + 1];
            int i18 = (i12 + 2) * 2;
            float f21 = fArr[i18];
            float f22 = fArr[i18 + 1];
            char c13 = c11;
            int i19 = 1;
            while (i19 < i11) {
                float f23 = i19 * 0.01f;
                float f24 = f23 * f23;
                float f25 = f24 * f23;
                float z9 = ((((((f17 * 3.0f) - f15) - (f19 * 3.0f)) + f21) * f25) + ((((f19 * 4.0f) + ((f15 * 2.0f) - (f17 * 5.0f))) - f21) * f24) + com.google.android.recaptcha.internal.a.z(f19, f15, f23, f17 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f18 * 3.0f) - f16) - (f20 * 3.0f)) + f22) * f25) + ((((4.0f * f20) + ((2.0f * f16) - (5.0f * f18))) - f22) * f24) + com.google.android.recaptcha.internal.a.z(f20, f16, f23, f18 * 2.0f)) * 0.5f));
                if (z9 > f15) {
                    arrayList2.add(Float.valueOf(z9));
                    arrayList2.add(Float.valueOf(max));
                }
                if ((i19 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(max));
                }
                i19++;
                i11 = 100;
            }
            arrayList2.add(Float.valueOf(f19));
            arrayList2.add(Float.valueOf(f20));
            i12 = i15;
            i7 = i17;
            c10 = c12;
            c11 = c13;
            i10 = 5;
            i11 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[c10]));
        arrayList2.add(Float.valueOf(fArr[c11]));
        this.f = new float[arrayList.size()];
        int i20 = 0;
        while (true) {
            float[] fArr2 = this.f;
            if (i20 >= fArr2.length) {
                break;
            }
            fArr2[i20] = ((Float) arrayList.get(i20)).floatValue();
            i20++;
        }
        int size = arrayList2.size();
        float[] fArr3 = new float[size];
        for (int i21 = 0; i21 < size; i21++) {
            fArr3[i21] = ((Float) arrayList2.get(i21)).floatValue();
        }
        return fArr3;
    }

    public final boolean b() {
        return ((double) Math.abs(this.a - 0.0f)) < 1.0E-5d && ((double) Math.abs(this.b - 25.0f)) < 1.0E-5d && ((double) Math.abs(this.c - 50.0f)) < 1.0E-5d && ((double) Math.abs(this.d - 75.0f)) < 1.0E-5d && ((double) Math.abs(this.e - 100.0f)) < 1.0E-5d;
    }

    public final void c(NativeByteBuffer nativeByteBuffer) {
        this.a = nativeByteBuffer.readFloat(true);
        this.b = nativeByteBuffer.readFloat(true);
        this.c = nativeByteBuffer.readFloat(true);
        this.d = nativeByteBuffer.readFloat(true);
        this.e = nativeByteBuffer.readFloat(true);
    }

    public final void d(NativeByteBuffer nativeByteBuffer) {
        nativeByteBuffer.writeFloat(this.a);
        nativeByteBuffer.writeFloat(this.b);
        nativeByteBuffer.writeFloat(this.c);
        nativeByteBuffer.writeFloat(this.d);
        nativeByteBuffer.writeFloat(this.e);
    }
}
