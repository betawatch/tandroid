package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r2 extends View {
    public final /* synthetic */ v2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(v2 v2Var, Context context) {
        super(context);
        this.a = v2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.a.getThemedColor(j6.e7));
    }
}
