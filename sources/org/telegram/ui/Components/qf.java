package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qf {
    public final /* synthetic */ ChatActivityEnterView a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        Drawable backgroundImage = chatActivityEnterView.a2.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.draw(canvas);
        }
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        org.telegram.ui.bj bjVar = bnVar != null ? bnVar.A0 : null;
        if (bjVar == null || bjVar.getWidth() <= 0) {
            return;
        }
        canvas.save();
        canvas.translate(bjVar.getX(), bjVar.getY());
        bjVar.draw(canvas);
        canvas.restore();
    }

    public final void b() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        fe feVar = chatActivityEnterView.R0;
        if (feVar != null) {
            feVar.invalidate();
        }
        ai.n0 n0Var = chatActivityEnterView.j1;
        boolean z10 = n0Var != null && n0Var.m();
        gf gfVar = chatActivityEnterView.F0;
        Editable text = gfVar == null ? null : gfVar.getText();
        gf gfVar2 = chatActivityEnterView.F0;
        chatActivityEnterView.V1((gfVar2 == null || gfVar2.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        chatActivityEnterView.k6 = z10;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null) {
            bnVar.dd();
            yw0 yw0Var = bnVar.s1;
            if (yw0Var != null) {
                yw0Var.e();
            }
        }
    }

    public final void c(float f10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        fe feVar = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.A1;
        int i10 = org.telegram.ui.ActionBar.n6.Nl;
        int i11 = ChatActivityEnterView.n7;
        int C0 = chatActivityEnterView.C0(i10);
        if (f10 <= 0.004f) {
            if (chatActivityEnterView.z1 == 0) {
                return;
            }
            chatActivityEnterView.z1 = 0;
            feVar.setColorFilter(new PorterDuffColorFilter(C0, PorterDuff.Mode.SRC_IN));
            return;
        }
        int f11 = i0.a.f(Math.min(1.0f, f10), C0, i7 | (-16777216)) & (-117901064);
        if (f11 == chatActivityEnterView.z1) {
            return;
        }
        chatActivityEnterView.z1 = f11;
        ColorFilter colorFilter = (ColorFilter) sparseArray.get(f11);
        if (colorFilter == null) {
            colorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
            if (sparseArray.size() > 512) {
                sparseArray.clear();
            }
            sparseArray.put(f11, colorFilter);
        }
        feVar.setColorFilter(colorFilter);
    }

    public final void d(float f10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.w1 = f10;
        if (f10 >= 1.0f || f10 <= 0.0f) {
            Editable text = chatActivityEnterView.F0.getText();
            chatActivityEnterView.P1((chatActivityEnterView.F0.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        }
        chatActivityEnterView.i2();
        org.telegram.ui.d61 d61Var = chatActivityEnterView.d2;
        if (d61Var != null) {
            d61Var.invalidate();
        }
        ie ieVar = chatActivityEnterView.f2;
        if (ieVar != null) {
            ieVar.invalidate();
        }
        chatActivityEnterView.o2.setAlpha((1.0f - f10) * chatActivityEnterView.x1);
    }
}
