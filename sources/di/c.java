package di;

import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class c implements AutoCloseable {
    public final /* synthetic */ PrismaHighlighter a;

    public c(PrismaHighlighter prismaHighlighter) {
        this.a = prismaHighlighter;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
