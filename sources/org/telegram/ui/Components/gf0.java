package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gf0 extends c5.c {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf0(Object obj, Context context, int i9) {
        super(context);
        this.h = i9;
        this.n = obj;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        MessageObject playingMessageObject;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.n;
                if (view == pipRoundVideoView.c && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    pipRoundVideoView.A.set(AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), getMeasuredWidth() - AndroidUtilities.dpf2(1.5f), getMeasuredHeight() - AndroidUtilities.dpf2(1.5f));
                    canvas.drawArc(pipRoundVideoView.A, -90.0f, playingMessageObject.audioProgress * 360.0f, false, org.telegram.ui.ActionBar.f6.k2);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // c5.c, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.h) {
            case 1:
                super.onMeasure(i9, i10);
                g81 g81Var = (g81) this.n;
                if (g81Var.f != null) {
                    ViewGroup.LayoutParams layoutParams = g81Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = g81Var.e;
                    if (imageView != null) {
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        layoutParams2.width = getMeasuredWidth();
                        layoutParams2.height = getMeasuredHeight();
                        break;
                    }
                }
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }
}
