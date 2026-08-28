package org.telegram.ui.Cells;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r4 extends FrameLayout {
    public TextView a;

    public void setCellHeight(int i9) {
        setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(54.0f), i9));
    }

    public void setLetter(String str) {
        this.a.setText(str.toUpperCase());
    }
}
