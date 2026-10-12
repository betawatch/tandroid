package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public interface h50 {
    void E(float f7);

    void K(boolean z10, boolean z11);

    void P();

    void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize);

    boolean e();

    org.telegram.ui.kv0 getCloseIntoObject();

    String getInitialSearchString();

    boolean v();
}
