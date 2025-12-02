package kotlin.random;

import java.io.Serializable;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class Random {
    public static final Default Default = new Default(null);
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    public abstract int nextInt(int i);

    public static final class Default extends Random implements Serializable {
        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Default() {
        }

        @Override // kotlin.random.Random
        public int nextInt(int i) {
            return Random.defaultRandom.nextInt(i);
        }
    }
}
