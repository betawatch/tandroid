package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ow0 extends l60 {
    public final /* synthetic */ qw0 d;

    public ow0(qw0 qw0Var) {
        this.d = qw0Var;
    }

    @Override // org.telegram.ui.Components.wo0
    public final CharSequence d() {
        qw0 qw0Var = this.d;
        int i10 = qw0Var.I;
        String[] strArr = qw0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.l60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.l60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.l60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
