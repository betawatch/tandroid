package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q3 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final View c;
    public final View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Context context, n3 n3Var, p3 p3Var) {
        super(context);
        this.c = n3Var;
        this.d = p3Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.d;
                n3 n3Var = (n3) this.c;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                n3Var.setItemCount(i11);
                p3Var.setItemCount(i11);
                n3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                p3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i7, i10);
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
                super.onMeasure(i7, i10);
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

    public q3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, c8.ha.o(-2, -2));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.z6, h6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
        addView(textView, c8.ha.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
