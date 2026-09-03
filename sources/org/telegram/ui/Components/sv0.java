package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sv0 extends a60 {
    public final /* synthetic */ uv0 d;

    public sv0(uv0 uv0Var) {
        this.d = uv0Var;
    }

    @Override // org.telegram.ui.Components.ho0
    public final CharSequence d() {
        uv0 uv0Var = this.d;
        int i10 = uv0Var.F;
        String[] strArr = uv0Var.C;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.a60
    public final int i() {
        return this.d.C.length - 1;
    }

    @Override // org.telegram.ui.Components.a60
    public final int j() {
        return this.d.F;
    }

    @Override // org.telegram.ui.Components.a60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
