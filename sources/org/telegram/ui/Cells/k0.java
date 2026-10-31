package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k0 {
    public final q1 a;
    public final org.telegram.ui.Components.r8[] b;
    public final ImageReceiver[] c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f;
    public final boolean g;
    public final Drawable h;
    public final Paint i;
    public final Paint j;
    public final qz0 k;
    public boolean l;
    public boolean m;
    public final dc n;
    public final TLObject o;

    public k0(q1 q1Var, TLObject[] tLObjectArr, int i10) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = q1Var;
        this.o = tLObjectArr[0];
        this.n = new j0(q1Var, q1Var, 0);
        this.c = new ImageReceiver[3];
        this.b = new org.telegram.ui.Components.r8[3];
        for (int i11 = 0; i11 < 3; i11++) {
            this.c[i11] = new ImageReceiver(q1Var);
            this.c[i11].H0(q1Var);
            this.c[i11].J0(org.telegram.messenger.i0.L(54.0f));
            this.b[i11] = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            if (i11 >= tLObjectArr.length || (tLObject = tLObjectArr[i11]) == null) {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ra, q1Var.Ob), org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, q1Var.Ob)))};
                paint.setColor(iArr[0]);
                this.c[i11].w0(new org.telegram.ui.ActionBar.y2(q1Var, iArr, paint));
            } else {
                this.b[i11].p(tLObject);
                this.c[i11].i0(tLObjectArr[i11], this.b[i11], null);
            }
        }
        if (q1Var.N0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.i0.L(11.0f));
        boolean q6 = d20.i(q1Var.Y5).q();
        this.e = cd.L0(q6 ? 2131748345 : 2131743879, null);
        this.i.setStyle(Paint.Style.STROKE);
        this.g = true;
        this.h = q6 ? null : q1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.o) == null) {
            this.k = null;
        } else {
            this.k = new qz0(i0.a.i(i10, "+"), 9.33f, org.telegram.messenger.i0.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i10;
        if (tLObject instanceof TLRPC.Chat) {
            int i11 = ((TLRPC.Chat) tLObject).participants_count;
            if (i11 > 1) {
                return cd.S(null, i11);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i10 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return cd.S(null, i10);
        }
        return null;
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.c;
            if (i10 >= imageReceiverArr.length) {
                return;
            }
            imageReceiverArr[i10].P();
            i10++;
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
        imageReceiverArr[0].J0(org.telegram.messenger.i0.L(54.0f));
        if (q1Var.N0) {
            a();
        }
        org.telegram.ui.Components.r8[] r8VarArr = {r3};
        this.b = r8VarArr;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.p(tLObject);
        imageReceiverArr[0].i0(tLObject, r8VarArr[0], null);
        textPaint.setTextSize(org.telegram.messenger.i0.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = h20.p((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = org.telegram.messenger.k6.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.e = charSequence;
        this.i.setStyle(Paint.Style.STROKE);
        this.g = false;
        this.h = q1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.k = null;
        } else {
            this.k = new qz0(b(tLObject), 9.33f, org.telegram.messenger.i0.o());
        }
    }
}
