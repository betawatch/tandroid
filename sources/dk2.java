// default package

import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class dk2 implements AutoCloseable {
    public final /* synthetic */ PrismaHighlighter a;

    public dk2(PrismaHighlighter prismaHighlighter) {
        this.a = prismaHighlighter;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
