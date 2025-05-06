package org.telegram.messenger.pip;

import android.view.View;

/* loaded from: classes3.dex */
public interface PictureInPictureContentViewProvider {
    void attachContentToWindow();

    View detachContentFromWindow();

    void onAttachContentToPip();

    void prepareDetachContentFromPip();
}
