package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 extends IOException {
    public s0(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public s0(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super(str.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), indexOutOfBoundsException);
    }
}
