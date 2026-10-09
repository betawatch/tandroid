package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hg0 {
    public float a = 0.0f;
    public float b = 25.0f;
    public float c = 50.0f;
    public float d = 75.0f;
    public float e = 100.0f;
    public float[] f;

    public final float[] a() {
        float f7 = this.a;
        float f10 = this.b / 100.0f;
        float f11 = this.c / 100.0f;
        float f12 = this.d / 100.0f;
        float f13 = this.e;
        int i10 = 2;
        int i11 = 5;
        char c10 = '\f';
        char c11 = '\r';
        float[] fArr = {-0.001f, f7 / 100.0f, 0.0f, f7 / 100.0f, 0.25f, f10, 0.5f, f11, 0.75f, f12, 1.0f, f13 / 100.0f, 1.001f, f13 / 100.0f};
        int i12 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i13 = 1;
        while (i13 < i11) {
            int i14 = (i13 - 1) * i10;
            float f14 = fArr[i14];
            float f15 = fArr[i14 + 1];
            int i15 = i13 * 2;
            float f16 = fArr[i15];
            float f17 = fArr[i15 + 1];
            int i16 = i13 + 1;
            int i17 = i16 * 2;
            int i18 = i10;
            float f18 = fArr[i17];
            char c12 = c10;
            float f19 = fArr[i17 + 1];
            int i19 = (i13 + 2) * 2;
            float f20 = fArr[i19];
            float f21 = fArr[i19 + 1];
            char c13 = c11;
            int i20 = 1;
            while (i20 < i12) {
                float f22 = i20 * 0.01f;
                float f23 = f22 * f22;
                float f24 = f23 * f22;
                float y3 = ((((((f16 * 3.0f) - f14) - (f18 * 3.0f)) + f20) * f24) + ((((f18 * 4.0f) + ((f14 * 2.0f) - (f16 * 5.0f))) - f20) * f23) + com.google.android.gms.internal.vision.e2.y(f18, f14, f22, f16 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f17 * 3.0f) - f15) - (f19 * 3.0f)) + f21) * f24) + ((((4.0f * f19) + ((2.0f * f15) - (5.0f * f17))) - f21) * f23) + com.google.android.gms.internal.vision.e2.y(f19, f15, f22, f17 * 2.0f)) * 0.5f));
                if (y3 > f14) {
                    arrayList2.add(Float.valueOf(y3));
                    arrayList2.add(Float.valueOf(max));
                }
                if ((i20 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(max));
                }
                i20++;
                i12 = 100;
            }
            arrayList2.add(Float.valueOf(f18));
            arrayList2.add(Float.valueOf(f19));
            i13 = i16;
            i10 = i18;
            c10 = c12;
            c11 = c13;
            i11 = 5;
            i12 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[c10]));
        arrayList2.add(Float.valueOf(fArr[c11]));
        this.f = new float[arrayList.size()];
        int i21 = 0;
        while (true) {
            float[] fArr2 = this.f;
            if (i21 >= fArr2.length) {
                break;
            }
            fArr2[i21] = ((Float) arrayList.get(i21)).floatValue();
            i21++;
        }
        int size = arrayList2.size();
        float[] fArr3 = new float[size];
        for (int i22 = 0; i22 < size; i22++) {
            fArr3[i22] = ((Float) arrayList2.get(i22)).floatValue();
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
