package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Queue;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class zzmn extends zzml implements Queue {
    @Override // java.util.Queue
    public final Object element() {
        return zzd().element();
    }

    public boolean offer(Object obj) {
        return zzd().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return zzd().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return zzd().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return zzd().remove();
    }

    @Override // com.google.android.recaptcha.internal.zzml
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }

    public abstract Queue zzd();
}
