// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i24 extends q5c {
    public final /* synthetic */ byte n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i24(Context context, int i, int i2, boolean z, i8c i8cVar, n8c n8cVar, o8c o8cVar, wjb wjbVar, int i3, int i4) {
        super(context, i, i2, z, i8cVar, n8cVar, o8cVar, wjbVar, i3, i4);
        this.n3 = (byte) 8;
    }

    @Override // o39
    public final Integer W0(int i) {
        switch (this.n3) {
            case 0:
                c4c G = this.g3.G(i);
                if (G == null || G.d != 2) {
                    return super.W0(i);
                }
                return 0;
            case 1:
                return 0;
            default:
                return super.W0(i);
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.n3) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 6:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 7:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // o39
    public final boolean u1(View view) {
        switch (this.n3) {
            case 8:
                if (view instanceof lyb) {
                    lyb lybVar = (lyb) view;
                    if (lybVar.G > 0.0f || lybVar.J.q()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i24(Context context, int i, int i2, boolean z, i8c i8cVar, n8c n8cVar, o8c o8cVar, wjb wjbVar, byte b) {
        super(context, i, i2, z, i8cVar, n8cVar, o8cVar, wjbVar);
        this.n3 = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i24(d dVar, i8c i8cVar, n8c n8cVar, o8c o8cVar, byte b) {
        super(dVar, i8cVar, n8cVar, o8cVar);
        this.n3 = b;
    }
}
