package com.google.android.gms.internal.mlkit_language_id;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* loaded from: classes.dex */
final /* synthetic */ class zzcs implements ComponentFactory {
    static final ComponentFactory zza = new zzcs();

    private zzcs() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new zzct((zzcr) componentContainer.get(zzcr.class));
    }
}
