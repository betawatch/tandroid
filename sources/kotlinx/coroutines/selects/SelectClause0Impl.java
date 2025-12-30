package kotlinx.coroutines.selects;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class SelectClause0Impl implements SelectClause0 {
    private final Object clauseObject;
    private final Function3 onCancellationConstructor;
    private final Function3 processResFunc;
    private final Function3 regFunc;

    public SelectClause0Impl(Object obj, Function3 function3, Function3 function32) {
        Function3 function33;
        this.clauseObject = obj;
        this.regFunc = function3;
        this.onCancellationConstructor = function32;
        function33 = SelectKt.DUMMY_PROCESS_RESULT_FUNCTION;
        this.processResFunc = function33;
    }

    public /* synthetic */ SelectClause0Impl(Object obj, Function3 function3, Function3 function32, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, (i & 4) != 0 ? null : function32);
    }
}
