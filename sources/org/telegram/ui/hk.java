package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hk extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk(tn tnVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = tnVar;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                tn tnVar = this.b;
                if (view == tnVar.Q2) {
                    ImageView imageView = tnVar.O2;
                    int i14 = (imageView == null || imageView.getVisibility() == 8) ? 18 : 66;
                    ImageView imageView2 = tnVar.P2;
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
    public void setTranslationY(float f9) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f9);
                this.b.T0.invalidate();
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 0:
                super.setVisibility(i10);
                this.b.xc.j(2, i10 == 0, getMeasuredWidth() > 0);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
