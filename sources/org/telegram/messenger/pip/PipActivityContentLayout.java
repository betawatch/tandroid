package org.telegram.messenger.pip;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes3.dex */
class PipActivityContentLayout extends FrameLayout {
    private final Activity activity;
    private boolean isViewInPip;
    private int originalHeight;
    private int originalWidth;

    PipActivityContentLayout(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    public boolean isViewInPip() {
        return this.isViewInPip;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.activity);
        if (!isInPictureInPictureMode) {
            this.originalWidth = size;
            this.originalHeight = size2;
        }
        this.isViewInPip = isInPictureInPictureMode && size < this.originalWidth && size2 < this.originalHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLRPC.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLRPC.FLAG_30));
    }
}
