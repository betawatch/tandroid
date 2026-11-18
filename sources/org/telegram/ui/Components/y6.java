package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ y6(g8 g8Var, int i7) {
        this.a = i7;
        this.b = g8Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                g8 g8Var = this.b;
                g8Var.S1 = z10;
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.v0 v0Var = g8Var.R1;
                float floatValue = ((Float) obj).floatValue();
                v0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.c2.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
