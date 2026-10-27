package org.telegram.ui.Components;

import android.content.Context;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ou0 extends LinearLayout {
    public final TextView a;
    public final ImageView b;
    public boolean c;

    public ou0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, kb1.r(-2, -2));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.z6, u6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        addView(textView, kb1.x(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        this.c = true;
        if (AndroidUtilities.isTablet()) {
            this.a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else if (rotation == 3 || rotation == 1) {
            this.a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        } else {
            this.a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        }
        this.c = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }
}
