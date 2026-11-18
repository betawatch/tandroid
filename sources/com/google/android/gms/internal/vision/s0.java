package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class s0 extends IOException {
    public s0(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public s0(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super(str.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), indexOutOfBoundsException);
    }
}
