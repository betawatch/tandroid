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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a81 extends org.telegram.ui.Components.sj0 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ d81 r;

    public a81(d81 d81Var) {
        this.r = d81Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
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
        int i3 = this.c;
        int i10 = i3 + 1;
        this.e = i3;
        int i11 = i3 + 2;
        this.c = i11;
        this.f = i10;
        int size = (arrayList.size() - 1) + i11;
        this.h = size;
        this.c = size + 1;
        this.n = size;
    }

    @Override // u4.h0
    public final int b() {
        return this.c;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == this.d) {
            return 2;
        }
        if (i3 == this.e) {
            return 3;
        }
        return i3 == this.n ? 5 : 4;
    }

    @Override // u4.h0
    public final void f() {
        E();
        super.f();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.a;
        int i10 = this.e;
        d81 d81Var = this.r;
        if (i3 < i10 || i10 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(d81Var.F);
        }
        if (d(i3) == 4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            TLRPC.Chat chat = (TLRPC.Chat) d81Var.f.get(i3 - this.f);
            h4Var.e(chat, chat.title, (String) d81Var.h.get(i3 - this.f), i3 != this.h - 1);
            h4Var.c(d81Var.x.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        if (i3 != 1) {
            if (i3 == 2) {
                org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = org.telegram.ui.ActionBar.k6.Y0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                int i10 = org.telegram.ui.ActionBar.k6.a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(colorDrawable, Y0);
                xpVar.x = true;
                x6Var.setBackground(xpVar);
                org.telegram.ui.ActionBar.r6.y(x6Var, colorDrawable, i10, null, PorterDuff.Mode.SRC_IN);
                view2 = x6Var;
            } else if (i3 != 3) {
                view2 = i3 != 5 ? new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.m3(viewGroup.getContext(), org.telegram.messenger.g0.L(12.0f));
            } else {
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(viewGroup.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 8, false, null);
                n4Var.setHeight(54);
                n4Var.setText(org.telegram.messenger.bd.M0(2131749218, null));
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
            haVar.addView(textView, b8.mf.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            haVar.a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            haVar.addView(textView2, b8.mf.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            ci.l1 l1Var = new ci.l1(context, new Paint(1), textPaint);
            l1Var.setWillNotDraw(false);
            l1Var.addView(imageView, b8.mf.e(-2, -2, 1));
            haVar.addView(l1Var, b8.mf.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(org.telegram.messenger.bd.M0(2131744050, null));
            imageView.setImageResource(R.drawable.groups_limit1);
            d81 d81Var = this.r;
            d81Var.y = haVar;
            int i12 = d81Var.H;
            d81Var.y.setMessageText(i12 == 0 ? org.telegram.messenger.bd.M0(2131744047, null) : i12 == 1 ? org.telegram.messenger.bd.M0(2131744048, null) : org.telegram.messenger.bd.M0(2131744049, null));
            u4.p0 p0Var = new u4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(23.0f);
            d81Var.y.setLayoutParams(p0Var);
            view = haVar;
        }
        return new org.telegram.ui.Components.bj0(view);
    }
}
