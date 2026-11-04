package kg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.ui.Cells.y8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i extends y8 {
    public long E;
    public int F;
    public int G;
    public final /* synthetic */ m H;
    public int x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Context context) {
        super(context);
        this.H = mVar;
    }

    @Override // org.telegram.ui.Cells.y8
    public final void a() {
        m mVar = this.H;
        Drawable drawable = mVar.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.P;
            int i3 = this.F;
            drawable2.setBounds(i3, this.G, bounds.width() + i3, bounds.height() + this.G);
        }
    }

    @Override // org.telegram.ui.Cells.y8
    public final void b() {
        m mVar = this.H;
        Drawable drawable = mVar.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.y * org.telegram.messenger.g0.L(3.0f));
            int i3 = bounds.left;
            this.F = i3;
            int i10 = bounds.top;
            this.G = i10;
            mVar.P.setBounds(i3 + L, org.telegram.messenger.g0.L(1.0f) + i10, bounds.width() + this.F + L, bounds.height() + org.telegram.messenger.g0.L(1.0f) + this.G);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.E;
            if (j10 > 17) {
                j10 = 17;
            }
            this.E = elapsedRealtime;
            if (this.x == 0) {
                float f10 = (j10 / 664.0f) + this.y;
                this.y = f10;
                if (f10 >= 1.0f) {
                    this.x = 1;
                    this.y = 1.0f;
                }
            } else {
                float f11 = this.y - (j10 / 664.0f);
                this.y = f11;
                if (f11 <= 0.0f) {
                    this.x = 0;
                    this.y = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
