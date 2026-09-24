package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public interface u40 {
    void B(float f7);

    void L(boolean z10, boolean z11);

    void P();

    void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize);

    boolean e();

    org.telegram.ui.vu0 getCloseIntoObject();

    String getInitialSearchString();

    boolean t();
}
