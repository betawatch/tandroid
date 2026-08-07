package org.telegram.ui.iv;

/* loaded from: classes5.dex */
public interface RichCaptionHost {
    RichEditText getCaptionEditText();

    BlockRow getRow();

    boolean isPressOnCaption(int i, int i2);

    void persistCaption();
}
