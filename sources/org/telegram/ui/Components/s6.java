package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ s6(y7 y7Var, int i7) {
        this.a = i7;
        this.b = y7Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                y7 y7Var = this.b;
                y7Var.S1 = z10;
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.v0 v0Var = y7Var.R1;
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
