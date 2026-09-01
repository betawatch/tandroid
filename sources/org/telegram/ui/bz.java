package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bz {
    public float a;
    public float b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public ng.d j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public float o;
    public int p;
    public TLRPC.Document q;
    public final ImageReceiver r;
    public String s;

    public bz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
