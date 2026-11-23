package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ y6(e8 e8Var, int i7) {
        this.a = i7;
        this.b = e8Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                e8 e8Var = this.b;
                e8Var.S1 = z10;
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.u0 u0Var = e8Var.R1;
                float floatValue = ((Float) obj).floatValue();
                u0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.c2.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
