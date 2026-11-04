package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pj extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj(wm wmVar, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = wmVar;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                wm wmVar = this.b;
                if (view == wmVar.j3) {
                    ImageView imageView = wmVar.h3;
                    int i13 = (imageView == null || imageView.getVisibility() == 8) ? 18 : 66;
                    ImageView imageView2 = wmVar.i3;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i13 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i13);
                }
                super.measureChildWithMargins(view, i3, i10, i11, i12);
                break;
            default:
                super.measureChildWithMargins(view, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f10);
                this.b.m1.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        switch (this.a) {
            case 0:
                super.setVisibility(i3);
                this.b.gd.h(2, i3 == 0, getMeasuredWidth() > 0);
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }
}
