package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p3 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final View c;
    public final View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Context context, m3 m3Var, o3 o3Var) {
        super(context);
        this.c = m3Var;
        this.d = o3Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                o3 o3Var = (o3) this.d;
                m3 m3Var = (m3) this.c;
                this.b = true;
                Point point = org.telegram.messenger.i0.q;
                int i12 = point.x > point.y ? 3 : 5;
                m3Var.setItemCount(i12);
                o3Var.setItemCount(i12);
                m3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                o3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                int rotation = ((WindowManager) org.telegram.messenger.w0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.b = true;
                if (org.telegram.messenger.i0.Q1()) {
                    ((TextView) this.c).setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(128.0f));
                } else if (rotation == 3 || rotation == 1) {
                    ((TextView) this.c).setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
                } else {
                    ((TextView) this.c).setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(128.0f));
                }
                this.b = false;
                super.onMeasure(i10, i11);
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

    public p3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, w7.b6.o(-2, -2));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.z6, p6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(128.0f));
        addView(textView, w7.b6.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
