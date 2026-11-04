package ei;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.cp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r1 extends View {
    public final /* synthetic */ int a = 1;
    public final cp b;

    public r1(Context context) {
        super(context);
        this.b = new cp(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                int width = (getWidth() - L) - L;
                int height = (getHeight() - L) - L;
                cp cpVar = this.b;
                cpVar.setBounds(L, L, width, height);
                cpVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                cp cpVar2 = this.b;
                cpVar2.setBounds(0, 0, width2, height2);
                cpVar2.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.m5, false));
                cpVar2.setAlpha(hs.e4);
                cpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public r1(Activity activity) {
        super(activity);
        this.b = new cp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.m5, false));
    }
}
