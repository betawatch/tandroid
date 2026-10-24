package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class b implements AutoCloseable {
    public final /* synthetic */ PrismaHighlighter a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.a = prismaHighlighter;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
