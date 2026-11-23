package c8;

import java.io.DataInputStream;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class gd {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            fArr[i7] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
