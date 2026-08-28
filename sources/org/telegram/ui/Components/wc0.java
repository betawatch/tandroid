package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wc0 extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public wc0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.fingerprint);
        addView(imageView, g7.e6.e(-1, -1, 119));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setTextSize(1, 26.0f);
        textView.setGravity(17);
        addView(textView, g7.e6.d(-1, -2.0f, 17, 0.0f, -5.33f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 10.0f);
        textView2.setTextColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textView2.setGravity(17);
        addView(textView2, g7.e6.d(-1, -2.0f, 17, 0.0f, 14.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    public void setImage(int i9) {
        ImageView imageView = this.a;
        imageView.setVisibility(0);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        imageView.setImageResource(i9);
    }

    public void setNum(int i9) {
        this.a.setVisibility(8);
        TextView textView = this.b;
        textView.setVisibility(0);
        TextView textView2 = this.c;
        textView2.setVisibility(0);
        String str = "";
        textView.setText("" + i9);
        if (i9 != 0) {
            switch (i9) {
                case 2:
                    str = "ABC";
                    break;
                case 3:
                    str = "DEF";
                    break;
                case 4:
                    str = "GHI";
                    break;
                case 5:
                    str = "JKL";
                    break;
                case 6:
                    str = "MNO";
                    break;
                case 7:
                    str = "PQRS";
                    break;
                case 8:
                    str = "TUV";
                    break;
                case 9:
                    str = "WXYZ";
                    break;
            }
        } else {
            str = "+";
        }
        textView2.setText(str);
    }
}
