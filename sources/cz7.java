// default package

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cz7 extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public cz7(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.fingerprint);
        addView(imageView, tre.e(-1, -1, jn7.D1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(hl.o());
        textView.setTextColor(-1);
        textView.setTextSize(1, 26.0f);
        textView.setGravity(17);
        addView(textView, tre.d(-1, -2.0f, 17, 0.0f, -5.33f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 10.0f);
        textView2.setTextColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textView2.setGravity(17);
        addView(textView2, tre.d(-1, -2.0f, 17, 0.0f, 14.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    public void setImage(int i) {
        ImageView imageView = this.a;
        imageView.setVisibility(0);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        imageView.setImageResource(i);
    }

    public void setNum(int i) {
        String str;
        this.a.setVisibility(8);
        TextView textView = this.b;
        textView.setVisibility(0);
        TextView textView2 = this.c;
        textView2.setVisibility(0);
        textView.setText(String.valueOf(i));
        if (i != 0) {
            switch (i) {
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
                default:
                    str = "";
                    break;
            }
        } else {
            str = "+";
        }
        textView2.setText(str);
    }
}
