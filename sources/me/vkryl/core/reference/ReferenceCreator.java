package me.vkryl.core.reference;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public interface ReferenceCreator {
    Reference newReference(Object obj);

    public abstract /* synthetic */ class -CC {
        public static Reference $default$newReference(ReferenceCreator referenceCreator, Object obj) {
            return new WeakReference(obj);
        }
    }
}
