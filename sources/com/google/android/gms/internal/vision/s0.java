package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class s0 extends IOException {
    public s0(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public s0(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super(str.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), indexOutOfBoundsException);
    }
}
