package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.uk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a2 extends uk0 implements vs {
    public final Path e3;
    public q0.a f3;

    public a2(Context context) {
        super(context, null);
        this.e3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new s4.a0());
        setAdapter(new z1());
        setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        setClipToPadding(false);
    }

    @Override // org.telegram.ui.Components.uk0
    public final Integer V0(int i10) {
        return 285212671;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.C5) {
            getAdapter().f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        q0.a aVar = this.f3;
        if (aVar != null) {
            Path path = this.e3;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.f3 != null) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.e().c(this, at.C5);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.e().n(this, at.C5);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, a30.B(16.0f, org.telegram.messenger.i0.L(48.0f) * Math.min(ig.h0.c().size(), 6), TLObject.FLAG_30));
    }

    public void setMaskProvider(q0.a aVar) {
        this.f3 = aVar;
        invalidate();
    }
}
