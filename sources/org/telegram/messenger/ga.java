package org.telegram.messenger;

import j$.util.function.Function$-CC;
import java.util.function.Function;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ga implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ ga(int i10) {
        this.a = i10;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i10 = this.a;
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String valueOf;
        String lambda$applyAppConfig$35;
        Long lambda$new$14;
        int[] lambda$new$15;
        String str;
        switch (this.a) {
            case 0:
                valueOf = String.valueOf((Long) obj);
                return valueOf;
            case 1:
                lambda$applyAppConfig$35 = MessagesController.lambda$applyAppConfig$35((int[]) obj);
                return lambda$applyAppConfig$35;
            case 2:
                lambda$new$14 = MessagesController.lambda$new$14((String) obj);
                return lambda$new$14;
            case 3:
                lambda$new$15 = MessagesController.lambda$new$15((String) obj);
                return lambda$new$15;
            default:
                str = ((TranslateController.Language) obj).displayName;
                return str;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i10 = this.a;
        return Function$-CC.$default$compose(this, function);
    }
}
