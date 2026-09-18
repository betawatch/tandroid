package org.telegram.ui.Cells;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q4 extends FrameLayout {
    public TextView a;

    public void setCellHeight(int i10) {
        setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(54.0f), i10));
    }

    public void setLetter(String str) {
        this.a.setText(str.toUpperCase());
    }
}
