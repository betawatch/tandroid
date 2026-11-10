package m6;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {
    public static final /* synthetic */ d b = new d(0);
    public static final /* synthetic */ d c = new d(1);
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i7) {
        this.a = i7;
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
