// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jnc extends el7 {
    public final /* synthetic */ ViewGroup W1;
    public final /* synthetic */ View[] X1;
    public final /* synthetic */ Context Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnc(Context context, ViewGroup viewGroup, ylb ylbVar, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, ylbVar);
        this.W1 = viewGroup2;
        this.X1 = viewArr;
        this.Y1 = context2;
    }

    @Override // el7, mz0
    public final void O0(float f) {
        super.O0(f);
        if (this.W1 instanceof wgc) {
            this.s0.setBounds(0, (int) f, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // mz0
    public final boolean U0() {
        return !(this.W1 instanceof wgc);
    }

    @Override // el7
    public final int Y0() {
        return cmb.v0(cmb.c6, this.J0);
    }

    @Override // el7, my0, android.app.Dialog
    public final void show() {
        super.show();
        if (this.W1 instanceof wgc) {
            View[] viewArr = this.X1;
            if (viewArr[0] == null) {
                w2a w2aVar = new w2a(this, this.Y1);
                viewArr[0] = w2aVar;
                this.b.addView(w2aVar, 0, qoe.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.n1.setPadding(0, 0, 0, 0);
        }
    }
}
