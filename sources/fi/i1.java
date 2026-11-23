package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class i1 extends View {
    public final /* synthetic */ int a = 1;
    public final up b;

    public i1(Context context) {
        super(context);
        this.b = new up(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                int width = (getWidth() - L) - L;
                int height = (getHeight() - L) - L;
                up upVar = this.b;
                upVar.setBounds(L, L, width, height);
                upVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                up upVar2 = this.b;
                upVar2.setBounds(0, 0, width2, height2);
                upVar2.b(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.m5, false));
                upVar2.setAlpha(ls.e4);
                upVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public i1(Activity activity) {
        super(activity);
        this.b = new up(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.m5, false));
    }
}
