package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jz {
    public float a;
    public float b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public ah.e j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public float o;
    public int p;
    public TLRPC.Document q;
    public final ImageReceiver r;
    public String s;

    public jz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
