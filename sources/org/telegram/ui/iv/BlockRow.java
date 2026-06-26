package org.telegram.ui.iv;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* loaded from: classes3.dex */
public class BlockRow {
    private static long ID_GEN = 1;
    public TL_iv.PageBlock block;
    public boolean checkbox;
    public boolean checked;
    public boolean detailsEnd;
    public final long id;
    public int level;
    public MediaUploadState media;
    public ArrayList medias;
    public int num;

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
