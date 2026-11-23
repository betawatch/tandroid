package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rf {
    public final /* synthetic */ ChatActivityEnterView a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        Drawable backgroundImage = chatActivityEnterView.c2.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.draw(canvas);
        }
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
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
        ge geVar = chatActivityEnterView.R0;
        if (geVar != null) {
            geVar.invalidate();
        }
        chatActivityEnterView.q2(chatActivityEnterView.M6);
        ai.l0 l0Var = chatActivityEnterView.j1;
        boolean z10 = l0Var != null && l0Var.l();
        hf hfVar = chatActivityEnterView.F0;
        Editable text = hfVar == null ? null : hfVar.getText();
        hf hfVar2 = chatActivityEnterView.F0;
        chatActivityEnterView.b2((hfVar2 == null || hfVar2.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        chatActivityEnterView.m6 = z10;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            bnVar.dd();
            zw0 zw0Var = bnVar.s1;
            if (zw0Var != null) {
                zw0Var.e();
            }
        }
    }

    public final void c(float f10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ge geVar = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.C1;
        int i10 = org.telegram.ui.ActionBar.n6.Nl;
        int i11 = ChatActivityEnterView.s7;
        int G0 = chatActivityEnterView.G0(i10);
        if (f10 <= 0.004f) {
            if (chatActivityEnterView.B1 == 0) {
                return;
            }
            chatActivityEnterView.B1 = 0;
            geVar.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
            return;
        }
        int f11 = i0.a.f(Math.min(1.0f, f10), G0, i7 | (-16777216)) & (-117901064);
        if (f11 == chatActivityEnterView.B1) {
            return;
        }
        chatActivityEnterView.B1 = f11;
        ColorFilter colorFilter = (ColorFilter) sparseArray.get(f11);
        if (colorFilter == null) {
            colorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
            if (sparseArray.size() > 512) {
                sparseArray.clear();
            }
            sparseArray.put(f11, colorFilter);
        }
        geVar.setColorFilter(colorFilter);
    }

    public final void d(float f10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.y1 = f10;
        if (f10 >= 1.0f || f10 <= 0.0f) {
            Editable text = chatActivityEnterView.F0.getText();
            chatActivityEnterView.V1((chatActivityEnterView.F0.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        }
        chatActivityEnterView.o2();
        org.telegram.ui.b61 b61Var = chatActivityEnterView.f2;
        if (b61Var != null) {
            b61Var.invalidate();
        }
        je jeVar = chatActivityEnterView.h2;
        if (jeVar != null) {
            jeVar.invalidate();
        }
        chatActivityEnterView.q2.setAlpha((1.0f - f10) * chatActivityEnterView.z1);
    }
}
