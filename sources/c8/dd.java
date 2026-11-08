package c8;

import java.io.DataInputStream;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class dd {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            fArr[i7] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
