package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                o3 o3Var = (o3) this.d;
                m3 m3Var = (m3) this.c;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                m3Var.setItemCount(i11);
                o3Var.setItemCount(i11);
                m3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                o3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i3, i10);
                break;
            default:
                int rotation = ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.b = true;
                if (org.telegram.messenger.g0.Q1()) {
                    ((TextView) this.c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else if (rotation == 3 || rotation == 1) {
                    ((TextView) this.c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
                } else {
                    ((TextView) this.c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                }
                this.b = false;
                super.onMeasure(i3, i10);
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

    public p3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, b8.mf.o(-2, -2));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.z6, e6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
        addView(textView, b8.mf.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
