package org.telegram.messenger.voip;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class Resampler {
    public static native int convert44to48(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native int convert48to44(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
