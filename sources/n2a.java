// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class n2a extends FrameLayout implements vk7 {
    public final az8 a;
    public final /* synthetic */ p2a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2a(p2a p2aVar, Context context) {
        super(context);
        this.b = p2aVar;
        this.a = new az8((byte) 3);
    }

    @Override // uk7
    public final void k(int i, View view) {
        this.a.b = 0;
    }

    @Override // vk7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        p2a p2aVar = this.b;
        oab oabVar = p2aVar.r;
        if (p2aVar.y > 0 || i4 == 0 || i2 != 0) {
            return;
        }
        float f = oabVar.f0;
        float f2 = i4 + f;
        if (f2 <= f) {
            f = f2;
        }
        p2aVar.setOffset(f);
        oabVar.f0 = f;
        a58 currentPeerView = oabVar.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        dab dabVar = oabVar.w;
        if (dabVar != null) {
            dabVar.invalidate();
        }
    }

    @Override // uk7
    public final boolean n(View view, View view2, int i, int i2) {
        return this.b.y <= 0 && i == 2;
    }

    @Override // uk7
    public final void q(View view, View view2, int i, int i2) {
        this.a.b = i;
    }

    @Override // uk7
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        p2a p2aVar = this.b;
        oab oabVar = p2aVar.r;
        if (p2aVar.y <= 0) {
            float f = oabVar.f0;
            float f2 = p2aVar.c;
            if (f >= f2 || i2 <= 0) {
                return;
            }
            float f3 = f + i2;
            iArr[1] = i2;
            if (f3 <= f2) {
                f2 = f3;
            }
            p2aVar.setOffset(f2);
            oabVar.f0 = f2;
            a58 currentPeerView = oabVar.o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            dab dabVar = oabVar.w;
            if (dabVar != null) {
                dabVar.invalidate();
            }
        }
    }

    @Override // uk7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
