package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ne0 {
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
        int i9 = 5;
        float[] fArr = {-0.001f, f10 / 100.0f, 0.0f, f10 / 100.0f, 0.25f, f11, 0.5f, f12, 0.75f, f13, 1.0f, f14 / 100.0f, 1.001f, f14 / 100.0f};
        int i10 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i11 = 1;
        while (i11 < i9) {
            int i12 = (i11 - 1) * 2;
            float f15 = fArr[i12];
            float f16 = fArr[i12 + 1];
            int i13 = i11 * 2;
            float f17 = fArr[i13];
            float f18 = fArr[i13 + 1];
            int i14 = i11 + 1;
            int i15 = i14 * 2;
            float f19 = fArr[i15];
            float f20 = fArr[i15 + 1];
            int i16 = (i11 + 2) * 2;
            float f21 = fArr[i16];
            float f22 = fArr[i16 + 1];
            int i17 = 1;
            while (i17 < i10) {
                float f23 = i17 * 0.01f;
                float f24 = f23 * f23;
                float f25 = f24 * f23;
                float z10 = ((((((f17 * 3.0f) - f15) - (f19 * 3.0f)) + f21) * f25) + ((((f19 * 4.0f) + ((f15 * 2.0f) - (f17 * 5.0f))) - f21) * f24) + e2.c.z(f19, f15, f23, f17 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f18 * 3.0f) - f16) - (f20 * 3.0f)) + f22) * f25) + ((((4.0f * f20) + ((2.0f * f16) - (5.0f * f18))) - f22) * f24) + e2.c.z(f20, f16, f23, f18 * 2.0f)) * 0.5f));
                if (z10 > f15) {
                    arrayList2.add(Float.valueOf(z10));
                    arrayList2.add(Float.valueOf(max));
                }
                if ((i17 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(max));
                }
                i17++;
                i10 = 100;
            }
            arrayList2.add(Float.valueOf(f19));
            arrayList2.add(Float.valueOf(f20));
            i11 = i14;
            i9 = 5;
            i10 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[12]));
        arrayList2.add(Float.valueOf(fArr[13]));
        this.f = new float[arrayList.size()];
        int i18 = 0;
        while (true) {
            float[] fArr2 = this.f;
            if (i18 >= fArr2.length) {
                break;
            }
            fArr2[i18] = ((Float) arrayList.get(i18)).floatValue();
            i18++;
        }
        int size = arrayList2.size();
        float[] fArr3 = new float[size];
        for (int i19 = 0; i19 < size; i19++) {
            fArr3[i19] = ((Float) arrayList2.get(i19)).floatValue();
        }
        return fArr3;
    }

    public final boolean b() {
        return ((double) Math.abs(this.a - 0.0f)) < 1.0E-5d && ((double) Math.abs(this.b - 25.0f)) < 1.0E-5d && ((double) Math.abs(this.c - 50.0f)) < 1.0E-5d && ((double) Math.abs(this.d - 75.0f)) < 1.0E-5d && ((double) Math.abs(this.e - 100.0f)) < 1.0E-5d;
    }

    public final void c(InputSerializedData inputSerializedData, boolean z10) {
        this.a = inputSerializedData.readFloat(z10);
        this.b = inputSerializedData.readFloat(z10);
        this.c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.e = inputSerializedData.readFloat(z10);
    }

    public final void d(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeFloat(this.a);
        outputSerializedData.writeFloat(this.b);
        outputSerializedData.writeFloat(this.c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.e);
    }
}
