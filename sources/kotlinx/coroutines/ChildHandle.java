package kotlinx.coroutines;

/* loaded from: classes3.dex */
public interface ChildHandle extends DisposableHandle {
    boolean childCancelled(Throwable th);

    Job getParent();
}
