package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.o50;
import org.telegram.ui.u50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class l extends FrameLayout {
    public int a;
    public u50 b;
    public t c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f;

    public l(Context context, boolean z10) {
        super(context);
        this.f = z10;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public t getRenderer() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(this.b.F(), TLObject.FLAG_30));
        } else {
            float f10 = o50.B3 ? 3.0f : 2.0f;
            float A = ll.A(14.0f, 2, AndroidUtilities.displaySize.x) + (o50.B3 ? -AndroidUtilities.dp(90.0f) : 0);
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) ((o50.C3 ? A / 2.0f : A / f10) + AndroidUtilities.dp(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(t tVar) {
        this.c = tVar;
    }
}
