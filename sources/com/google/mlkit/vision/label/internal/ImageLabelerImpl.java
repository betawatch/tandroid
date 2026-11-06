package com.google.mlkit.vision.label.internal;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import n6.c;
import pb.e;
import pb.j;
import wb.a;
import wb.b;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
