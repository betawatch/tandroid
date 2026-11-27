// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class e4a extends FrameLayout implements bl7 {
    public final l09 a;
    public final /* synthetic */ g4a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4a(g4a g4aVar, Context context) {
        super(context);
        this.b = g4aVar;
        this.a = new l09((byte) 3);
    }

    @Override // al7
    public final void k(int i, View view) {
        this.a.b = 0;
    }

    @Override // bl7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        g4a g4aVar = this.b;
        lcb lcbVar = g4aVar.r;
        if (g4aVar.y > 0 || i4 == 0 || i2 != 0) {
            return;
        }
        float f = lcbVar.f0;
        float f2 = i4 + f;
        if (f2 <= f) {
            f = f2;
        }
        g4aVar.setOffset(f);
        lcbVar.f0 = f;
        o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        zbb zbbVar = lcbVar.w;
        if (zbbVar != null) {
            zbbVar.invalidate();
        }
    }

    @Override // al7
    public final boolean n(View view, View view2, int i, int i2) {
        return this.b.y <= 0 && i == 2;
    }

    @Override // al7
    public final void q(View view, View view2, int i, int i2) {
        this.a.b = i;
    }

    @Override // al7
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        g4a g4aVar = this.b;
        lcb lcbVar = g4aVar.r;
        if (g4aVar.y <= 0) {
            float f = lcbVar.f0;
            float f2 = g4aVar.c;
            if (f >= f2 || i2 <= 0) {
                return;
            }
            float f3 = f + i2;
            iArr[1] = i2;
            if (f3 <= f2) {
                f2 = f3;
            }
            g4aVar.setOffset(f2);
            lcbVar.f0 = f2;
            o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            zbb zbbVar = lcbVar.w;
            if (zbbVar != null) {
                zbbVar.invalidate();
            }
        }
    }

    @Override // al7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
