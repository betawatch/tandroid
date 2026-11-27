// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class d34 extends q9c {
    public final /* synthetic */ byte n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d34(Context context, int i, int i2, boolean z, icc iccVar, ncc nccVar, occ occVar, vnb vnbVar, int i3, int i4) {
        super(context, i, i2, z, iccVar, nccVar, occVar, vnbVar, i3, i4);
        this.n3 = (byte) 9;
    }

    @Override // d79
    public final Integer X0(int i) {
        switch (this.n3) {
            case 0:
                b8c G = this.g3.G(i);
                if (G == null || G.d != 2) {
                    return super.X0(i);
                }
                return 0;
            case 1:
            default:
                return super.X0(i);
            case 2:
                return 0;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.n3) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 2:
            default:
                super.onMeasure(i, i2);
                break;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 6:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 7:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 8:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
        }
    }

    @Override // d79
    public final boolean v1(View view) {
        switch (this.n3) {
            case 9:
                if (view instanceof l2c) {
                    l2c l2cVar = (l2c) view;
                    if (l2cVar.G > 0.0f || l2cVar.J.q()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.v1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d34(Context context, int i, int i2, boolean z, icc iccVar, ncc nccVar, occ occVar, vnb vnbVar, byte b) {
        super(context, i, i2, z, iccVar, nccVar, occVar, vnbVar);
        this.n3 = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d34(e eVar, icc iccVar, ncc nccVar, occ occVar, byte b) {
        super(eVar, iccVar, nccVar, occVar);
        this.n3 = b;
    }
}
