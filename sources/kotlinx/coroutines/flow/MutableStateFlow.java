package kotlinx.coroutines.flow;

/* loaded from: classes3.dex */
public interface MutableStateFlow extends Flow, FlowCollector {
    Object getValue();

    void setValue(Object obj);
}
