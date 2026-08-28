package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ae extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(ChatActivityEnterView chatActivityEnterView, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                mh.v3 v3Var = chatActivityEnterView.g0;
                return (v3Var == null || v3Var.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.g0.dispatchTouchEvent(motionEvent);
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (!chatActivityEnterView2.F || chatActivityEnterView2.O4 == BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (view == chatActivityEnterView.F0 && chatActivityEnterView.d0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i9, i10, i11, i12);
                setPivotX(i9 - AndroidUtilities.dp(22.0f));
                setPivotY(i10 - AndroidUtilities.dp(22.0f));
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (!chatActivityEnterView.F || chatActivityEnterView.O4 == BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        switch (this.a) {
            case 2:
                super.setVisibility(i9);
                this.b.P1(true);
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }
}
