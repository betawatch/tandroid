package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.rp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class i1 extends View {
    public final /* synthetic */ int a = 1;
    public final rp b;

    public i1(Context context) {
        super(context);
        this.b = new rp(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(2.0f), -13522392);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int L = org.telegram.messenger.g0.L(1.0f);
                int width = (getWidth() - L) - L;
                int height = (getHeight() - L) - L;
                rp rpVar = this.b;
                rpVar.setBounds(L, L, width, height);
                rpVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                rp rpVar2 = this.b;
                rpVar2.setBounds(0, 0, width2, height2);
                rpVar2.b(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.m5, false));
                rpVar2.setAlpha(ks.e4);
                rpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public i1(Activity activity) {
        super(activity);
        this.b = new rp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.m5, false));
    }
}
