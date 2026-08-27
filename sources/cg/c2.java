package cg;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.qa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa b;

    public /* synthetic */ c2(qa qaVar, int i10) {
        this.a = i10;
        this.b = qaVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((i2) this.b).g0.addAll((List) obj2);
                break;
            default:
                ((ch.h) this.b).X.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
