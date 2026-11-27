// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ci extends LinearLayout {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final View c;
    public final View d;

    public ci(Context context, vnb vnbVar) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, tre.o(-2, -2));
        yob.X(textView, aob.z6, vnbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(hl.L(40.0f), 0, hl.L(40.0f), hl.L(128.0f));
        addView(textView, tre.t(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.d;
                zh zhVar = (zh) this.c;
                this.b = true;
                Point point = hl.q;
                int i3 = point.x <= point.y ? 5 : 3;
                zhVar.setItemCount(i3);
                biVar.setItemCount(i3);
                zhVar.getLayoutParams().height = hl.L(42.0f) * i3;
                biVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            default:
                int rotation = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.b = true;
                if (hl.O1()) {
                    ((TextView) this.c).setPadding(hl.L(40.0f), 0, hl.L(40.0f), hl.L(128.0f));
                } else if (rotation == 3 || rotation == 1) {
                    ((TextView) this.c).setPadding(hl.L(40.0f), 0, hl.L(40.0f), 0);
                } else {
                    ((TextView) this.c).setPadding(hl.L(40.0f), 0, hl.L(40.0f), hl.L(128.0f));
                }
                this.b = false;
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(Activity activity, zh zhVar, bi biVar) {
        super(activity);
        this.c = zhVar;
        this.d = biVar;
        this.b = false;
    }
}
