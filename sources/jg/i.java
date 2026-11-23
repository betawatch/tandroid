package jg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.ui.Cells.a9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i extends a9 {
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

    @Override // org.telegram.ui.Cells.a9
    public final void a() {
        m mVar = this.H;
        Drawable drawable = mVar.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.P;
            int i7 = this.F;
            drawable2.setBounds(i7, this.G, bounds.width() + i7, bounds.height() + this.G);
        }
    }

    @Override // org.telegram.ui.Cells.a9
    public final void b() {
        m mVar = this.H;
        Drawable drawable = mVar.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.y * org.telegram.messenger.g0.L(3.0f));
            int i7 = bounds.left;
            this.F = i7;
            int i10 = bounds.top;
            this.G = i10;
            mVar.P.setBounds(i7 + L, org.telegram.messenger.g0.L(1.0f) + i10, bounds.width() + this.F + L, bounds.height() + org.telegram.messenger.g0.L(1.0f) + this.G);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.E;
            if (j3 > 17) {
                j3 = 17;
            }
            this.E = elapsedRealtime;
            if (this.x == 0) {
                float f10 = (j3 / 664.0f) + this.y;
                this.y = f10;
                if (f10 >= 1.0f) {
                    this.x = 1;
                    this.y = 1.0f;
                }
            } else {
                float f11 = this.y - (j3 / 664.0f);
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
