package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public interface ProfileStoreBoundaryInterface {
    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    InvocationHandler getOrCreateProfile(String str);

    InvocationHandler getProfile(String str);
}
