package org.telegram.messenger.voip;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class Resampler {
    public static native int convert44to48(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native int convert48to44(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
