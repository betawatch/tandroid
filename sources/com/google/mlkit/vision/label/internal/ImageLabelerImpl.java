package com.google.mlkit.vision.label.internal;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import k6.c;
import qb.e;
import qb.j;
import xb.a;
import xb.b;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
