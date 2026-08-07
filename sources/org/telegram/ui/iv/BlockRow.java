package org.telegram.ui.iv;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* loaded from: classes5.dex */
public class BlockRow {
    private static long ID_GEN = 1;
    public long authorQuoteId;
    public TL_iv.PageBlock block;
    public boolean checkbox;
    public boolean checked;
    public boolean detailsEnd;
    public boolean firstBlock;
    public final long id;
    public boolean itemStart;
    public int level;
    public MediaUploadState media;
    public ArrayList medias;
    public int num;
    public final ArrayList path;
    public int quoteBottomEdge;
    public boolean quoteFirst;
    public final ArrayList quoteIds;
    public boolean quoteLast;
    public int quoteTopEdge;
    public boolean singleParagraph;
    public boolean titleAutoBold;
    public boolean titleAutoBoldInitialized;

    public BlockRow(TL_iv.PageBlock pageBlock) {
        this(pageBlock, 0, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BlockRow(TL_iv.PageBlock pageBlock, int i, int i2) {
        this(pageBlock, i, i2, r4);
        long j = ID_GEN;
        ID_GEN = 1 + j;
    }

    public BlockRow(TL_iv.PageBlock pageBlock, int i, int i2, long j) {
        this.path = new ArrayList();
        this.quoteIds = new ArrayList();
        this.block = pageBlock;
        this.level = i;
        this.num = i2;
        this.id = j;
    }

    public boolean isInList() {
        return this.level > 0;
    }

    public boolean isOrdered() {
        return this.num > 0;
    }

    public boolean isChecklist() {
        return this.level > 0 && this.checkbox;
    }
}
