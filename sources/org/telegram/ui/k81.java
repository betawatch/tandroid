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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class k81 extends org.telegram.ui.Components.oj0 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ n81 r;

    public k81(n81 n81Var) {
        this.r = n81Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.b() >= this.f && d1Var.b() < this.h;
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

    @Override // v4.g0
    public final int b() {
        return this.c;
    }

    @Override // v4.g0
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

    @Override // v4.g0
    public final void f() {
        E();
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.a;
        int i10 = this.e;
        n81 n81Var = this.r;
        if (i7 < i10 || i10 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(n81Var.E);
        }
        if (d(i7) == 4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            TLRPC.Chat chat = (TLRPC.Chat) n81Var.f.get(i7 - this.f);
            h4Var.e(chat, chat.title, (String) n81Var.h.get(i7 - this.f), i7 != this.h - 1);
            h4Var.c(n81Var.x.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        if (i7 != 1) {
            if (i7 == 2) {
                org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = org.telegram.ui.ActionBar.k6.Y0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                int i10 = org.telegram.ui.ActionBar.k6.a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(colorDrawable, Y0);
                xpVar.x = true;
                y6Var.setBackground(xpVar);
                org.telegram.ui.ActionBar.r6.y(y6Var, colorDrawable, i10, null, PorterDuff.Mode.SRC_IN);
                view2 = y6Var;
            } else if (i7 != 3) {
                view2 = i7 != 5 ? new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.m3(viewGroup.getContext(), org.telegram.messenger.g0.L(12.0f));
            } else {
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(viewGroup.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 8, false, null);
                n4Var.setHeight(54);
                n4Var.setText(org.telegram.messenger.id.M0(2131749211, null));
                view = n4Var;
            }
            view = view2;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ha haVar = new org.telegram.ui.Cells.ha(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.k6.m9;
            org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.k5.n(textView, i11, null, 1, 20.0f);
            textView.setGravity(17);
            haVar.addView(textView, c8.ha.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            haVar.a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            haVar.addView(textView2, c8.ha.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            bi.s1 s1Var = new bi.s1(context, new Paint(1), textPaint);
            s1Var.setWillNotDraw(false);
            s1Var.addView(imageView, c8.ha.e(-2, -2, 1));
            haVar.addView(s1Var, c8.ha.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(org.telegram.messenger.id.M0(2131744043, null));
            imageView.setImageResource(R.drawable.groups_limit1);
            n81 n81Var = this.r;
            n81Var.y = haVar;
            int i12 = n81Var.G;
            n81Var.y.setMessageText(i12 == 0 ? org.telegram.messenger.id.M0(2131744040, null) : i12 == 1 ? org.telegram.messenger.id.M0(2131744041, null) : org.telegram.messenger.id.M0(2131744042, null));
            v4.o0 o0Var = new v4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(23.0f);
            n81Var.y.setLayoutParams(o0Var);
            view = haVar;
        }
        return new org.telegram.ui.Components.xi0(view);
    }
}
