package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public interface RequestDelegate {
    void run(TLObject tLObject, TLRPC.TL_error tL_error);
}
