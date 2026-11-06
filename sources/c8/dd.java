package c8;

import java.io.DataInputStream;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
