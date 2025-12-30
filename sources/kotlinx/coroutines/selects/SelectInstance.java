package kotlinx.coroutines.selects;

import kotlinx.coroutines.DisposableHandle;

/* loaded from: classes3.dex */
public interface SelectInstance {
    void disposeOnCompletion(DisposableHandle disposableHandle);

    void selectInRegistrationPhase(Object obj);
}
