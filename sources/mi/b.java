package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
