package kotlin.coroutines;

/* loaded from: classes3.dex */
public interface Continuation {
    CoroutineContext getContext();

    void resumeWith(Object obj);
}
