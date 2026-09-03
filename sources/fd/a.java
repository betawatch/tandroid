package fd;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends ed.a {
    @Override // ed.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.d(current, "current(...)");
        return current;
    }
}
