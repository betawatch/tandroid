package org.telegram.messenger;

import j$.util.function.Function$-CC;
import java.util.function.Function;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class fa implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ fa(int i10) {
        this.a = i10;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i10 = this.a;
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String valueOf;
        String lambda$applyAppConfig$34;
        Long lambda$new$14;
        int[] lambda$new$15;
        String str;
        switch (this.a) {
            case 0:
                valueOf = String.valueOf((Long) obj);
                return valueOf;
            case 1:
                lambda$applyAppConfig$34 = MessagesController.lambda$applyAppConfig$34((int[]) obj);
                return lambda$applyAppConfig$34;
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
