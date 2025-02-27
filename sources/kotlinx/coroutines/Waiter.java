package kotlinx.coroutines;

import kotlinx.coroutines.internal.Segment;

/* loaded from: classes3.dex */
public interface Waiter {
    void invokeOnCancellation(Segment segment, int i);
}
