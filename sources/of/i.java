package of;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.b9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i extends b9 {
    public int A;
    public final /* synthetic */ m B;
    public int v;
    public float w;
    public long x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Context context) {
        super(context);
        this.B = mVar;
    }

    @Override // org.telegram.ui.Cells.b9
    public final void a() {
        m mVar = this.B;
        Drawable drawable = mVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.K;
            int i9 = this.y;
            drawable2.setBounds(i9, this.A, bounds.width() + i9, bounds.height() + this.A);
        }
    }

    @Override // org.telegram.ui.Cells.b9
    public final void b() {
        m mVar = this.B;
        Drawable drawable = mVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.w * AndroidUtilities.dp(3.0f));
            int i9 = bounds.left;
            this.y = i9;
            int i10 = bounds.top;
            this.A = i10;
            mVar.K.setBounds(i9 + dp, AndroidUtilities.dp(1.0f) + i10, bounds.width() + this.y + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.A);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.x;
            if (j10 > 17) {
                j10 = 17;
            }
            this.x = elapsedRealtime;
            if (this.v == 0) {
                float f10 = (j10 / 664.0f) + this.w;
                this.w = f10;
                if (f10 >= 1.0f) {
                    this.v = 1;
                    this.w = 1.0f;
                }
            } else {
                float f11 = this.w - (j10 / 664.0f);
                this.w = f11;
                if (f11 <= 0.0f) {
                    this.v = 0;
                    this.w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
