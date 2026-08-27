package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lw extends ImageView {
    public final /* synthetic */ yy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(yy yyVar, Context context) {
        super(context);
        this.a = yyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xx xxVar;
        int action = motionEvent.getAction();
        yy yyVar = this.a;
        if (action == 0) {
            yyVar.L1 = true;
            yyVar.M1 = false;
            AndroidUtilities.runOnUIThread(new xl(yyVar, 350, 1), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            yyVar.L1 = false;
            if (!yyVar.M1 && (xxVar = yyVar.p1) != null && xxVar.k()) {
                try {
                    yyVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
