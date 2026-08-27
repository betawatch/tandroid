package com.google.mlkit.vision.label.internal;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import gb.a;
import gb.b;
import java.util.List;
import java.util.concurrent.Executor;
import v5.c;
import za.e;
import za.j;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class ImageLabelerImpl extends MobileVisionBase<List<a>> implements b {
    public final c f;

    public ImageLabelerImpl(e eVar, Executor executor, c cVar) {
        super(eVar, executor);
        this.f = cVar;
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        c cVar = this.f;
        return cVar != null ? new c[]{cVar} : j.a;
    }
}
