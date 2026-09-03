package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.d60;
import org.telegram.ui.j60;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class l extends FrameLayout {
    public int a;
    public j60 b;
    public u c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f;

    public l(Context context, boolean z4) {
        super(context);
        this.f = z4;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public u getRenderer() {
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
    public final void onMeasure(int i10, int i11) {
        if (this.f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.b.F(), TLObject.FLAG_30));
        } else {
            float f10 = d60.C3 ? 3.0f : 2.0f;
            float z4 = org.telegram.ui.b.z(14.0f, 2, AndroidUtilities.displaySize.x) + (d60.C3 ? -AndroidUtilities.dp(90.0f) : 0);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) ((d60.D3 ? z4 / 2.0f : z4 / f10) + AndroidUtilities.dp(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(u uVar) {
        this.c = uVar;
    }
}
