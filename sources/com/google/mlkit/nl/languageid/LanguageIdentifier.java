package com.google.mlkit.nl.languageid;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface LanguageIdentifier extends LifecycleObserver, Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void close();

    Task identifyLanguage(String str);
}
