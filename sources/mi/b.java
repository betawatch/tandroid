package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
