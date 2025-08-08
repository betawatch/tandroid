package com.google.firebase.ktx;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component> getComponents() {
        return CollectionsKt.listOf(LibraryVersionComponent.create("fire-core-ktx", "20.4.2"));
    }
}
