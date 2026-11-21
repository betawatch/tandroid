package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m81 extends org.telegram.ui.Components.dk0 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ p81 r;

    public m81(p81 p81Var) {
        this.r = p81Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.b() >= this.f && f1Var.b() < this.h;
    }

    public final void E() {
        this.e = -1;
        this.f = -1;
        this.h = -1;
        this.n = -1;
        this.c = 2;
        this.d = 1;
        ArrayList arrayList = this.r.f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i7 = this.c;
        int i10 = i7 + 1;
        this.e = i7;
        int i11 = i7 + 2;
        this.c = i11;
        this.f = i10;
        int size = (arrayList.size() - 1) + i11;
        this.h = size;
        this.c = size + 1;
        this.n = size;
    }

    @Override // v4.i0
    public final int b() {
        return this.c;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == this.d) {
            return 2;
        }
        if (i7 == this.e) {
            return 3;
        }
        return i7 == this.n ? 5 : 4;
    }

    @Override // v4.i0
    public final void f() {
        E();
        super.f();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.a;
        int i10 = this.e;
        p81 p81Var = this.r;
        if (i7 < i10 || i10 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(p81Var.F);
        }
        if (d(i7) == 4) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            TLRPC.Chat chat = (TLRPC.Chat) p81Var.f.get(i7 - this.f);
            i4Var.e(chat, chat.title, (String) p81Var.h.get(i7 - this.f), i7 != this.h - 1);
            i4Var.c(p81Var.x.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        if (i7 != 1) {
            if (i7 == 2) {
                org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                Drawable Y0 = org.telegram.ui.ActionBar.m6.Y0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.m6.b7);
                int i10 = org.telegram.ui.ActionBar.m6.a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(colorDrawable, Y0);
                oqVar.x = true;
                z6Var.setBackground(oqVar);
                org.telegram.ui.ActionBar.t6.x(z6Var, colorDrawable, i10, null, PorterDuff.Mode.SRC_IN);
                view2 = z6Var;
            } else if (i7 != 3) {
                view2 = i7 != 5 ? new org.telegram.ui.Cells.i4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.n3(viewGroup.getContext(), org.telegram.messenger.g0.L(12.0f));
            } else {
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(viewGroup.getContext(), org.telegram.ui.ActionBar.m6.L6, 21, 8, false, null);
                o4Var.setHeight(54);
                o4Var.setText(org.telegram.messenger.gd.N0(2131749017, null));
                view = o4Var;
            }
            view = view2;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.m6.m9;
            org.telegram.ui.ActionBar.t6.s(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.f3.l(textView, i11, null, 1, 20.0f);
            textView.setGravity(17);
            jaVar.addView(textView, c8.ma.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            jaVar.a = textView2;
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            jaVar.addView(textView2, c8.ma.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            di.d1 d1Var = new di.d1(context, new Paint(1), textPaint);
            d1Var.setWillNotDraw(false);
            d1Var.addView(imageView, c8.ma.e(-2, -2, 1));
            jaVar.addView(d1Var, c8.ma.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(org.telegram.messenger.gd.N0(2131743799, null));
            imageView.setImageResource(R.drawable.groups_limit1);
            p81 p81Var = this.r;
            p81Var.y = jaVar;
            int i12 = p81Var.H;
            p81Var.y.setMessageText(i12 == 0 ? org.telegram.messenger.gd.N0(2131743796, null) : i12 == 1 ? org.telegram.messenger.gd.N0(2131743797, null) : org.telegram.messenger.gd.N0(2131743798, null));
            v4.q0 q0Var = new v4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(23.0f);
            p81Var.y.setLayoutParams(q0Var);
            view = jaVar;
        }
        return new org.telegram.ui.Components.mj0(view);
    }
}
