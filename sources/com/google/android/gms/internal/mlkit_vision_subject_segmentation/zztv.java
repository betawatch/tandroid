package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zztv extends LazyInstanceMap {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zztv(zztu zztuVar) {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        zztd zztdVar = (zztd) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zztl(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zzte(MlKitContext.getInstance().getApplicationContext(), zztdVar), zztdVar.zzb());
    }
}
