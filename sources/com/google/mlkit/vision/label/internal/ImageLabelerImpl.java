package com.google.mlkit.vision.label.internal;

import cb.f;
import cb.k;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import jb.a;
import jb.b;
import y5.c;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
