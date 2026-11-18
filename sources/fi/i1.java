package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.sp;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i1 extends View {
    public final /* synthetic */ int a = 1;
    public final sp b;

    public i1(Context context) {
        super(context);
        this.b = new sp(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                int width = (getWidth() - L) - L;
                int height = (getHeight() - L) - L;
                sp spVar = this.b;
                spVar.setBounds(L, L, width, height);
                spVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                sp spVar2 = this.b;
                spVar2.setBounds(0, 0, width2, height2);
                spVar2.b(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.m5, false));
                spVar2.setAlpha(ks.e4);
                spVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public i1(Activity activity) {
        super(activity);
        this.b = new sp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.m5, false));
    }
}
