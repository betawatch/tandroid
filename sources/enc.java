// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class enc extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ enc(goc gocVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = gocVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.dispatchSetPressed(z);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        switch (this.a) {
            case 0:
                goc gocVar = this.b;
                if (gocVar.q0) {
                    va vaVar = gocVar.a;
                    i = -(vaVar != null ? vaVar.getPaddingTop() : 0);
                } else {
                    i = 0;
                }
                canvas.save();
                int width = getWidth();
                int height = getHeight();
                va vaVar2 = gocVar.a;
                canvas.clipRect(0, i, width, (vaVar2 != null ? vaVar2.getPaddingBottom() : 0) + height);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                if (getParent() instanceof ViewGroup) {
                    ((ViewGroup) getParent()).setClipChildren(false);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                goc gocVar = this.b;
                hs1 hs1Var = gocVar.s0;
                va vaVar = gocVar.a;
                int i5 = -(vaVar != null ? vaVar.getPaddingTop() : 0);
                int i6 = i3 - i;
                int i7 = i4 - i2;
                va vaVar2 = gocVar.a;
                hs1Var.layout(0, i5, i6, (vaVar2 != null ? vaVar2.getPaddingBottom() : 0) + i7);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        goc gocVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                hs1 hs1Var = gocVar.s0;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                va vaVar = gocVar.a;
                int paddingTop = (vaVar != null ? vaVar.getPaddingTop() : 0) + size2;
                va vaVar2 = gocVar.a;
                hs1Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((vaVar2 != null ? vaVar2.getPaddingBottom() : 0) + paddingTop, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(gocVar.T.c(gm.L(4.0f))));
                break;
        }
    }

    private final void a(boolean z) {
    }
}
