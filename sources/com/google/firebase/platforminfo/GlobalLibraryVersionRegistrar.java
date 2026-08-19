package com.google.firebase.platforminfo;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class GlobalLibraryVersionRegistrar {
    private static volatile GlobalLibraryVersionRegistrar INSTANCE;
    private final Set infos = new HashSet();

    GlobalLibraryVersionRegistrar() {
    }

    Set getRegisteredVersions() {
        Set unmodifiableSet;
        synchronized (this.infos) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.infos);
        }
        return unmodifiableSet;
    }

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = INSTANCE;
        if (globalLibraryVersionRegistrar2 != null) {
            return globalLibraryVersionRegistrar2;
        }
        synchronized (GlobalLibraryVersionRegistrar.class) {
            try {
                globalLibraryVersionRegistrar = INSTANCE;
                if (globalLibraryVersionRegistrar == null) {
                    globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                    INSTANCE = globalLibraryVersionRegistrar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return globalLibraryVersionRegistrar;
    }
}
