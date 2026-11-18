package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x3 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final View c;
    public final View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(Context context, u3 u3Var, w3 w3Var) {
        super(context);
        this.c = u3Var;
        this.d = w3Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) this.d;
                u3 u3Var = (u3) this.c;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                u3Var.setItemCount(i11);
                w3Var.setItemCount(i11);
                u3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                w3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
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

    public x3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, c8.ma.o(-2, -2));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.z6, i6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
        addView(textView, c8.ma.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
