package com.google.firebase.crashlytics;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component> getComponents() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
