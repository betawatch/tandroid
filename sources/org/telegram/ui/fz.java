package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
