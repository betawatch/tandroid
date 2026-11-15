package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ae implements r4, ni0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ae(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.k1(z10, i7, i10, 0L, true);
                break;
            default:
                this.b.k1(z10, i7, 0, 0L, true);
                break;
        }
    }

    public void a(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        Drawable backgroundImage = chatActivityEnterView.U1.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.draw(canvas);
        }
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        org.telegram.ui.aj ajVar = anVar != null ? anVar.A0 : null;
        if (ajVar == null || ajVar.getWidth() <= 0) {
            return;
        }
        canvas.save();
        canvas.translate(ajVar.getX(), ajVar.getY());
        ajVar.draw(canvas);
        canvas.restore();
    }

    public void b() {
        ChatActivityEnterView chatActivityEnterView = this.b;
        ai.n0 n0Var = chatActivityEnterView.j1;
        boolean z10 = false;
        boolean z11 = (n0Var == null || n0Var.r == 0) ? false : true;
        xe xeVar = chatActivityEnterView.F0;
        Editable text = xeVar == null ? null : xeVar.getText();
        xe xeVar2 = chatActivityEnterView.F0;
        if (xeVar2 != null && xeVar2.getLineCount() > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
            z10 = true;
        }
        chatActivityEnterView.N1(z10);
        chatActivityEnterView.e6 = z11;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        if (anVar != null) {
            anVar.dd();
            rw0 rw0Var = anVar.s1;
            if (rw0Var != null) {
                rw0Var.e();
            }
        }
    }

    public void c(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        uc ucVar = chatActivityEnterView.P1;
        gg ggVar = chatActivityEnterView.w2;
        if (ggVar != null) {
            ggVar.invalidate();
        }
        if (z10) {
            return;
        }
        yh.a aVar = chatActivityEnterView.L1;
        if (aVar != null) {
            oi0 oi0Var = chatActivityEnterView.i1;
            aVar.c(Math.round(Math.max(1.0f, (oi0Var.w - oi0Var.s) * oi0Var.r)));
        }
        org.telegram.messenger.g0.r(ucVar);
        org.telegram.messenger.g0.i3(ucVar, 300L);
    }

    public void d(float f10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        wd wdVar = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.v1;
        int i10 = org.telegram.ui.ActionBar.j6.Nl;
        int i11 = ChatActivityEnterView.N6;
        int u02 = chatActivityEnterView.u0(i10);
        if (f10 <= 0.004f) {
            if (chatActivityEnterView.u1 == 0) {
                return;
            }
            chatActivityEnterView.u1 = 0;
            wdVar.setColorFilter(new PorterDuffColorFilter(u02, PorterDuff.Mode.SRC_IN));
            return;
        }
        int f11 = i0.a.f(Math.min(1.0f, f10), u02, i7 | (-16777216)) & (-117901064);
        if (f11 == chatActivityEnterView.u1) {
            return;
        }
        chatActivityEnterView.u1 = f11;
        ColorFilter colorFilter = (ColorFilter) sparseArray.get(f11);
        if (colorFilter == null) {
            colorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
            if (sparseArray.size() > 512) {
                sparseArray.clear();
            }
            sparseArray.put(f11, colorFilter);
        }
        wdVar.setColorFilter(colorFilter);
    }

    public void e(float f10) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        chatActivityEnterView.r1 = f10;
        if (f10 >= 1.0f || f10 <= 0.0f) {
            Editable text = chatActivityEnterView.F0.getText();
            chatActivityEnterView.H1((chatActivityEnterView.F0.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        }
        chatActivityEnterView.Z1();
        org.telegram.ui.z51 z51Var = chatActivityEnterView.X1;
        if (z51Var != null) {
            z51Var.invalidate();
        }
        zd zdVar = chatActivityEnterView.Z1;
        if (zdVar != null) {
            zdVar.invalidate();
        }
        chatActivityEnterView.i2.setAlpha((1.0f - f10) * chatActivityEnterView.s1);
    }
}
