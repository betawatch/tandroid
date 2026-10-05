package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fz {
    public float a;
    public float b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public zg.d j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public float o;
    public int p;
    public TLRPC.Document q;
    public final ImageReceiver r;
    public String s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
