package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class sf {
    public final /* synthetic */ ChatActivityEnterView a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
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
        fe feVar = chatActivityEnterView.R0;
        if (feVar != null) {
            feVar.invalidate();
        }
        chatActivityEnterView.o2(chatActivityEnterView.M6);
        ai.p0 p0Var = chatActivityEnterView.j1;
        boolean z10 = p0Var != null && p0Var.n();
        gf gfVar = chatActivityEnterView.F0;
        Editable text = gfVar == null ? null : gfVar.getText();
        gf gfVar2 = chatActivityEnterView.F0;
        chatActivityEnterView.Z1((gfVar2 == null || gfVar2.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        chatActivityEnterView.m6 = z10;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            bnVar.dd();
            ax0 ax0Var = bnVar.s1;
            if (ax0Var != null) {
                ax0Var.e();
            }
        }
    }

    public final void c(float f10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        fe feVar = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.C1;
        int i10 = org.telegram.ui.ActionBar.m6.Nl;
        int i11 = ChatActivityEnterView.s7;
        int G0 = chatActivityEnterView.G0(i10);
        if (f10 <= 0.004f) {
            if (chatActivityEnterView.B1 == 0) {
                return;
            }
            chatActivityEnterView.B1 = 0;
            feVar.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
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
        feVar.setColorFilter(colorFilter);
    }

    public final void d(float f10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.y1 = f10;
        if (f10 >= 1.0f || f10 <= 0.0f) {
            Editable text = chatActivityEnterView.F0.getText();
            chatActivityEnterView.T1((chatActivityEnterView.F0.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        }
        chatActivityEnterView.m2();
        org.telegram.ui.d61 d61Var = chatActivityEnterView.f2;
        if (d61Var != null) {
            d61Var.invalidate();
        }
        ie ieVar = chatActivityEnterView.h2;
        if (ieVar != null) {
            ieVar.invalidate();
        }
        chatActivityEnterView.q2.setAlpha((1.0f - f10) * chatActivityEnterView.z1);
    }
}
