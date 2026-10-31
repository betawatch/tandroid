package nd;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends md.a {
    @Override // md.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
