package com.google.android.gms.common.data;

import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface DataBuffer extends Iterable, Releasable, Closeable {
    Object get(int i);

    int getCount();
}
