package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class uw0 {
    public final int a;
    public final org.telegram.ui.Cells.v0 b;
    public final org.telegram.ui.ActionBar.i6 c;
    public final nh0 d;
    public TL_account.TL_birthday e;
    public wy0 f;
    public wy0[] g;
    public wy0[] h;
    public boolean i;
    public wy0 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final lc m;

    public uw0(int i7, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = i7;
        this.b = v0Var;
        this.c = i6Var;
        nh0 nh0Var = new nh0(R.raw.cake, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(66.0f), true, null);
        this.d = nh0Var;
        nh0Var.H(false);
        this.m = new lc(v0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.b;
        int width = (v0Var.getWidth() - L) / 2;
        int L2 = org.telegram.messenger.g0.L(13.0f) + L;
        nh0 nh0Var = this.d;
        nh0Var.setBounds(width, org.telegram.messenger.g0.L(13.0f), width + L, L2);
        nh0Var.draw(canvas);
        this.f.c((v0Var.getWidth() - this.f.k()) / 2.0f, org.telegram.messenger.g0.L(19.0f) + L, 1.0f, -1, canvas);
        int i7 = (int) (this.f.i() + org.telegram.messenger.g0.L(19.0f) + L + org.telegram.messenger.g0.L(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.g.length; i11++) {
            i10 = (int) (Math.max(this.g[i11].k(), this.h[i11].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.g.length) {
            float max = Math.max(this.g[i12].k(), this.h[i12].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            wy0 wy0Var = this.g[i12];
            wy0Var.c(f11 - (wy0Var.k() / 2.0f), i7, 0.75f, -1, canvas);
            wy0 wy0Var2 = this.h[i12];
            wy0Var2.c(f11 - (wy0Var2.k() / 2.0f), org.telegram.messenger.g0.L(16.0f) + i7, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.i) {
            int L3 = org.telegram.messenger.g0.L(38.0f) + i7;
            canvas.save();
            float k10 = this.j.k() + org.telegram.messenger.g0.L(26.0f);
            float L4 = org.telegram.messenger.g0.L(30.0f);
            float f12 = L3;
            RectF rectF = this.k;
            rectF.set((v0Var.getWidth() - k10) / 2.0f, f12, (v0Var.getWidth() + k10) / 2.0f, f12 + L4);
            float a10 = this.m.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float f13 = L4 / 2.0f;
            canvas.drawRoundRect(rectF, f13, f13, this.l);
            this.j.c(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        b5.l(this.b.getContext(), org.telegram.messenger.gd.N0(2131751660, null), org.telegram.messenger.gd.N0(2131751659, null), this.e, new y2(this, 13), null, true, false, this.c).D0();
    }

    public final void c(org.telegram.messenger.fj fjVar) {
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) fjVar.k.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        wy0 wy0Var = new wy0(TextUtils.concat(fjVar.v, ":"), 13.0f, null);
        wy0Var.m(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        wy0Var.a();
        wy0Var.p(org.telegram.messenger.g0.L(174.0f) - org.telegram.messenger.g0.L(32.0f));
        this.f = wy0Var;
        int i7 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
        wy0[] wy0VarArr = new wy0[i7];
        this.g = wy0VarArr;
        this.h = new wy0[i7];
        wy0VarArr[0] = new wy0(org.telegram.messenger.gd.N0(2131751662, null), 11.0f, null);
        this.h[0] = new wy0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, org.telegram.messenger.g0.o());
        this.g[1] = new wy0(org.telegram.messenger.gd.N0(2131751661, null), 11.0f, null);
        wy0[] wy0VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i10 = tL_messageActionSuggestBirthday.birthday.month - 1;
        sb2.append((i10 < 0 || i10 >= 12) ? i5.c.i(i10, "") : org.telegram.messenger.gd.N0(new int[]{2131748893, 2131750817, 2131748490, 2131754170, 2131748469, 2131748871, 2131748873, 2131753892, 2131745369, 2131747636, 2131747641, 2131751593}[i10], null));
        wy0VarArr2[1] = new wy0(sb2.toString(), 11.0f, org.telegram.messenger.g0.o());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.g[2] = new wy0(org.telegram.messenger.gd.N0(2131751657, null), 11.0f, null);
            this.h[2] = new wy0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, org.telegram.messenger.g0.o());
        }
        this.i = !fjVar.P3();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        this.l.setColor(org.telegram.ui.ActionBar.n6.r1(0.12f, i6Var != null ? i6Var.b() : org.telegram.ui.ActionBar.n6.I.q() ? -1 : -16777216));
        this.j = new wy0(org.telegram.messenger.gd.N0(2131744150, null), 14.0f, org.telegram.messenger.g0.o());
    }
}
