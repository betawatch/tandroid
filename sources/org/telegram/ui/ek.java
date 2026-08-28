package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ek extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ek(qn qnVar, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = qnVar;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                qn qnVar = this.b;
                if (view == qnVar.Q2) {
                    ImageView imageView = qnVar.O2;
                    int i13 = (imageView == null || imageView.getVisibility() == 8) ? 18 : 66;
                    ImageView imageView2 = qnVar.P2;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i13 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = AndroidUtilities.dp(i13);
                }
                super.measureChildWithMargins(view, i9, i10, i11, i12);
                break;
            default:
                super.measureChildWithMargins(view, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f10);
                this.b.T0.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        switch (this.a) {
            case 0:
                super.setVisibility(i9);
                this.b.xc.j(2, i9 == 0, getMeasuredWidth() > 0);
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }
}
