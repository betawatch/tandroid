package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class at extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ ft o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(ft ftVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = ftVar;
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        kt ktVar = this.o.a;
        ktVar.k = null;
        ktVar.K = false;
        if (ktVar.R) {
            ktVar.m();
        }
    }
}
