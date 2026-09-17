package com.google.mlkit.vision.label.internal;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import k6.c;
import qb.e;
import qb.j;
import xb.a;
import xb.b;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
