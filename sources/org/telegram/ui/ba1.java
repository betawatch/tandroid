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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ba1 extends org.telegram.ui.Components.sk0 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ ea1 r;

    public ba1(ea1 ea1Var) {
        this.r = ea1Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.b() >= this.f && c1Var.b() < this.h;
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
        int i10 = this.c;
        int i11 = i10 + 1;
        this.e = i10;
        int i12 = i10 + 2;
        this.c = i12;
        this.f = i11;
        int size = (arrayList.size() - 1) + i12;
        this.h = size;
        this.c = size + 1;
        this.n = size;
    }

    @Override // s4.g0
    public final int b() {
        return this.c;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == this.d) {
            return 2;
        }
        if (i10 == this.e) {
            return 3;
        }
        return i10 == this.n ? 5 : 4;
    }

    @Override // s4.g0
    public final void f() {
        E();
        super.f();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        int i11 = this.e;
        ea1 ea1Var = this.r;
        if (i10 < i11 || i11 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(ea1Var.E);
        }
        if (d(i10) == 4) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            TLRPC.Chat chat = (TLRPC.Chat) ea1Var.f.get(i10 - this.f);
            j4Var.e(chat, chat.title, (String) ea1Var.h.get(i10 - this.f), i10 != this.h - 1);
            j4Var.c(ea1Var.x.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        if (i10 != 1) {
            if (i10 == 2) {
                org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = org.telegram.ui.ActionBar.t6.Y0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7);
                int i11 = org.telegram.ui.ActionBar.t6.a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(colorDrawable, Y0);
                eqVar.x = true;
                c7Var.setBackground(eqVar);
                org.telegram.ui.ActionBar.a7.y(c7Var, colorDrawable, i11, null, PorterDuff.Mode.SRC_IN);
                view2 = c7Var;
            } else if (i10 != 3) {
                view2 = i10 != 5 ? new org.telegram.ui.Cells.j4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.o3(viewGroup.getContext(), org.telegram.messenger.i0.L(12.0f));
            } else {
                org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(viewGroup.getContext(), org.telegram.ui.ActionBar.t6.L6, 21, 8, false, null);
                p4Var.setHeight(54);
                p4Var.setText(org.telegram.messenger.cd.L0(2131749219, null));
                view = p4Var;
            }
            view = view2;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ha haVar = new org.telegram.ui.Cells.ha(context);
            ImageView imageView = new ImageView(context);
            int i12 = org.telegram.ui.ActionBar.t6.m9;
            org.telegram.ui.ActionBar.a7.t(imageView, i12, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.m5.m(textView, i12, null, 1, 20.0f);
            textView.setGravity(17);
            haVar.addView(textView, w7.b6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            haVar.a = textView2;
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            haVar.addView(textView2, w7.b6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            jg.a3 a3Var = new jg.a3(context, new Paint(1), textPaint);
            a3Var.setWillNotDraw(false);
            a3Var.addView(imageView, w7.b6.e(-2, -2, 1));
            haVar.addView(a3Var, w7.b6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(org.telegram.messenger.cd.L0(2131744065, null));
            imageView.setImageResource(R.drawable.groups_limit1);
            ea1 ea1Var = this.r;
            ea1Var.y = haVar;
            int i13 = ea1Var.G;
            ea1Var.y.setMessageText(i13 == 0 ? org.telegram.messenger.cd.L0(2131744062, null) : i13 == 1 ? org.telegram.messenger.cd.L0(2131744063, null) : org.telegram.messenger.cd.L0(2131744064, null));
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = org.telegram.messenger.i0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.i0.L(23.0f);
            ea1Var.y.setLayoutParams(o0Var);
            view = haVar;
        }
        return new org.telegram.ui.Components.ck0(view);
    }
}
