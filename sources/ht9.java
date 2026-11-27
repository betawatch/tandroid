// default package

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.SaveToGallerySettingsActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ht9 extends in {
    public boolean s;
    public final mm w;
    public final /* synthetic */ SaveToGallerySettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht9(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new mm(this);
        getDrawable().K = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.s ? 1.0f : 0.0f;
        mm mmVar = this.w;
        mmVar.e(false, f);
        int i = aob.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(vm2.f(mmVar.c, saveToGallerySettingsActivity.getThemedColor(i), saveToGallerySettingsActivity.getThemedColor(aob.n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        if (this.s != z) {
            this.s = z;
            this.w.e(z2, z ? 1.0f : 0.0f);
            invalidate();
        }
    }
}
