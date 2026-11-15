package c8;

import java.io.DataInputStream;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
