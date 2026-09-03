package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(FrameLayout frameLayout, Object obj, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z2 z2Var = (z2) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                if (z2Var.getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            default:
                qh.d dVar = (qh.d) this.b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                if (dVar.C <= 0) {
                    h3Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                }
        }
    }
}
