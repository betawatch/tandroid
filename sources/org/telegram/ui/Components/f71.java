package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f71 extends WebView {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(org.telegram.ui.kl0 kl0Var, Context context) {
        super(context);
        this.b = kl0Var;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.b, true);
                super.onAttachedToWindow();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.b, false);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i7, i10);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.kl0) this.b).fragmentView).requestDisallowInterceptTouchEvent(true);
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(Context context, Context context2) {
        super(context);
        this.b = context2;
    }
}
