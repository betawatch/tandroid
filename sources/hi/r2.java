package hi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class r2 extends wz {
    public static int W;
    public final /* synthetic */ int V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.V = i7;
    }

    @Override // org.telegram.ui.Components.wz
    public int getColumnsCount() {
        switch (this.V) {
            case 0:
                return 3;
            case 1:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override // org.telegram.ui.Components.wz
    public int getViewType() {
        switch (this.V) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override // org.telegram.ui.Components.wz, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.V) {
            case 2:
                int i11 = 0;
                if (getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int i12 = 0;
                    while (i11 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Wallet.e8) && childAt.getMeasuredHeight() > 0) {
                            i12 = Math.max(i12, childAt.getMeasuredHeight());
                        }
                        i11++;
                    }
                    i11 = i12;
                }
                if (i11 <= 0) {
                    i11 = W;
                }
                if (i11 > 0) {
                    setMeasuredDimension(View.MeasureSpec.getSize(i7), i11);
                    break;
                } else {
                    super.onMeasure(i7, i10);
                    break;
                }
            case 3:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(104.0f));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }
}
