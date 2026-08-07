package org.telegram.ui.iv;

import j$.util.function.BiFunction$-CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes5.dex */
public final /* synthetic */ class RichEditorListView$$ExternalSyntheticLambda61 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
    }
}
