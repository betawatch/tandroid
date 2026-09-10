package fg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.f9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i extends f9 {
    public int E;
    public final /* synthetic */ m F;
    public int v;
    public float w;
    public long x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Context context) {
        super(context);
        this.F = mVar;
    }

    @Override // org.telegram.ui.Cells.f9
    public final void a() {
        m mVar = this.F;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.O;
            int i10 = this.y;
            drawable2.setBounds(i10, this.E, bounds.width() + i10, bounds.height() + this.E);
        }
    }

    @Override // org.telegram.ui.Cells.f9
    public final void b() {
        m mVar = this.F;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.w * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.y = i10;
            int i11 = bounds.top;
            this.E = i11;
            mVar.O.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.y + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.E);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.x;
            if (j3 > 17) {
                j3 = 17;
            }
            this.x = elapsedRealtime;
            if (this.v == 0) {
                float f7 = (j3 / 664.0f) + this.w;
                this.w = f7;
                if (f7 >= 1.0f) {
                    this.v = 1;
                    this.w = 1.0f;
                }
            } else {
                float f10 = this.w - (j3 / 664.0f);
                this.w = f10;
                if (f10 <= 0.0f) {
                    this.v = 0;
                    this.w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
