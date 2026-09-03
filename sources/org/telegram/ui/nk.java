package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nk extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk(xn xnVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = xnVar;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                xn xnVar = this.b;
                if (view == xnVar.R2) {
                    ImageView imageView = xnVar.P2;
                    int i14 = (imageView == null || imageView.getVisibility() == 8) ? 18 : 66;
                    ImageView imageView2 = xnVar.Q2;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i14 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = AndroidUtilities.dp(i14);
                }
                super.measureChildWithMargins(view, i10, i11, i12, i13);
                break;
            default:
                super.measureChildWithMargins(view, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f10);
                this.b.U0.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 0:
                super.setVisibility(i10);
                this.b.yc.h(2, i10 == 0, getMeasuredWidth() > 0);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
