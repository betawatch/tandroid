package ig;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j extends i9 {
    public int E;
    public int F;
    public final /* synthetic */ n G;
    public int w;
    public float x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Context context) {
        super(context);
        this.G = nVar;
    }

    @Override // org.telegram.ui.Cells.i9
    public final void a() {
        n nVar = this.G;
        Drawable drawable = nVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = nVar.O;
            int i10 = this.E;
            drawable2.setBounds(i10, this.F, bounds.width() + i10, bounds.height() + this.F);
        }
    }

    @Override // org.telegram.ui.Cells.i9
    public final void b() {
        n nVar = this.G;
        Drawable drawable = nVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.x * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.E = i10;
            int i11 = bounds.top;
            this.F = i11;
            nVar.O.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.E + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.F);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.y;
            if (j10 > 17) {
                j10 = 17;
            }
            this.y = elapsedRealtime;
            if (this.w == 0) {
                float f7 = (j10 / 664.0f) + this.x;
                this.x = f7;
                if (f7 >= 1.0f) {
                    this.w = 1;
                    this.x = 1.0f;
                }
            } else {
                float f10 = this.x - (j10 / 664.0f);
                this.x = f10;
                if (f10 <= 0.0f) {
                    this.w = 0;
                    this.x = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
