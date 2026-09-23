package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.f60;
import org.telegram.ui.l60;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class l extends FrameLayout {
    public int a;
    public l60 b;
    public u c;
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
            float f7 = f60.F3 ? 3.0f : 2.0f;
            float A = ul.A(14.0f, 2, AndroidUtilities.displaySize.x) + (f60.F3 ? -AndroidUtilities.dp(90.0f) : 0);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) ((f60.G3 ? A / 2.0f : A / f7) + AndroidUtilities.dp(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(u uVar) {
        this.c = uVar;
    }
}
