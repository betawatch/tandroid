package com.google.mlkit.vision.label.internal;

import ab.f;
import ab.k;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import hb.a;
import hb.b;
import java.util.List;
import java.util.concurrent.Executor;
import w5.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ImageLabelerImpl extends MobileVisionBase<List<a>> implements b {
    public final c f;

    public ImageLabelerImpl(f fVar, Executor executor, c cVar) {
        super(fVar, executor);
        this.f = cVar;
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        c cVar = this.f;
        return cVar != null ? new c[]{cVar} : k.a;
    }
}
