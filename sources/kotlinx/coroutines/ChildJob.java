package kotlinx.coroutines;

/* loaded from: classes3.dex */
public interface ChildJob extends Job {
    void parentCancelled(ParentJob parentJob);
}
