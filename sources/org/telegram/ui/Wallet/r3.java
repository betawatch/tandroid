package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.f30;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class r3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ f30 a;

    public r3(f30 f30Var) {
        this.a = f30Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i7, int i10) {
        f30 f30Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, f30Var.a, f30Var.b, Shader.TileMode.CLAMP);
    }
}
