// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jm2 extends tk4 {
    public static int W;
    public final /* synthetic */ byte V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm2(Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.V = b;
    }

    @Override // tk4
    public final int getColumnsCount() {
        switch (this.V) {
            case 1:
            case 3:
                return 3;
            case 2:
            default:
                return super.getColumnsCount();
        }
    }

    @Override // tk4
    public final int getViewType() {
        switch (this.V) {
            case 3:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override // tk4, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.V) {
            case 0:
                int i3 = 0;
                if (getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int i4 = 0;
                    while (i3 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i3);
                        if ((childAt instanceof aqc) && childAt.getMeasuredHeight() > 0) {
                            i4 = Math.max(i4, childAt.getMeasuredHeight());
                        }
                        i3++;
                    }
                    i3 = i4;
                }
                if (i3 <= 0) {
                    i3 = W;
                }
                if (i3 > 0) {
                    setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
                    break;
                } else {
                    super.onMeasure(i, i2);
                    break;
                }
            case 1:
            default:
                super.onMeasure(i, i2);
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(104.0f));
                break;
        }
    }
}
