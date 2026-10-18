package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class py {
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

    public py() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
