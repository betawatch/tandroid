package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k0 {
    public final q1 a;
    public final org.telegram.ui.Components.u8[] b;
    public final ImageReceiver[] c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f;
    public final boolean g;
    public final Drawable h;
    public final Paint i;
    public final Paint j;
    public final ly0 k;
    public boolean l;
    public boolean m;
    public final gc n;
    public final TLObject o;

    public k0(q1 q1Var, TLObject[] tLObjectArr, int i3) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = q1Var;
        this.o = tLObjectArr[0];
        this.n = new j0(q1Var, q1Var, 0);
        this.c = new ImageReceiver[3];
        this.b = new org.telegram.ui.Components.u8[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.c[i10] = new ImageReceiver(q1Var);
            this.c[i10].H0(q1Var);
            this.c[i10].J0(org.telegram.messenger.g0.L(54.0f));
            this.b[i10] = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            if (i10 >= tLObjectArr.length || (tLObject = tLObjectArr[i10]) == null) {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ra, q1Var.Pb), org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, q1Var.Pb)))};
                paint.setColor(iArr[0]);
                this.c[i10].w0(new org.telegram.ui.ActionBar.s2(q1Var, iArr, paint));
            } else {
                this.b[i10].p(tLObject);
                this.c[i10].i0(tLObjectArr[i10], this.b[i10], null);
            }
        }
        if (q1Var.O0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.g0.L(11.0f));
        boolean q10 = h10.i(q1Var.Z5).q();
        this.e = bd.M0(q10 ? 2131748338 : 2131743864, null);
        this.i.setStyle(Paint.Style.STROKE);
        this.g = true;
        this.h = q10 ? null : q1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.o) == null) {
            this.k = null;
        } else {
            this.k = new ly0(k2.p1.i(i3, "+"), 9.33f, org.telegram.messenger.g0.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i3;
        if (tLObject instanceof TLRPC.Chat) {
            int i10 = ((TLRPC.Chat) tLObject).participants_count;
            if (i10 > 1) {
                return bd.S(null, i10);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i3 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return bd.S(null, i3);
        }
        return null;
    }

    public final void a() {
        int i3 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.c;
            if (i3 >= imageReceiverArr.length) {
                return;
            }
            imageReceiverArr[i3].P();
            i3++;
        }
    }

    public k0(q1 q1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = q1Var;
        this.o = tLObject;
        this.n = new j0(q1Var, q1Var, 1);
        ImageReceiver[] imageReceiverArr = {r3};
        this.c = imageReceiverArr;
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        imageReceiver.H0(q1Var);
        imageReceiverArr[0].J0(org.telegram.messenger.g0.L(54.0f));
        if (q1Var.O0) {
            a();
        }
        org.telegram.ui.Components.u8[] u8VarArr = {r3};
        this.b = u8VarArr;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.p(tLObject);
        imageReceiverArr[0].i0(tLObject, u8VarArr[0], null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = l10.p((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = org.telegram.messenger.i6.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.e = charSequence;
        this.i.setStyle(Paint.Style.STROKE);
        this.g = false;
        this.h = q1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.k = null;
        } else {
            this.k = new ly0(b(tLObject), 9.33f, org.telegram.messenger.g0.o());
        }
    }
}
