package c8;

import java.io.DataInputStream;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class bd {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            fArr[i7] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
