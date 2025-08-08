package kotlinx.coroutines.flow;

/* loaded from: classes.dex */
public interface MutableStateFlow extends Flow, FlowCollector {
    Object getValue();

    void setValue(Object obj);
}
