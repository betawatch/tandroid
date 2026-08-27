package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class id1 extends org.telegram.ui.Components.yk0 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ ld1 r;

    public id1(ld1 ld1Var) {
        this.r = ld1Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.b() >= this.f && o1Var.b() < this.h;
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

    @Override // f2.q0
    public final int h() {
        return this.c;
    }

    @Override // f2.q0
    public final int j(int i10) {
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

    @Override // f2.q0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.a;
        int i11 = this.e;
        ld1 ld1Var = this.r;
        if (i10 < i11 || i11 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(ld1Var.A);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
            TLRPC.Chat chat = (TLRPC.Chat) ld1Var.f.get(i10 - this.f);
            d4Var.e(chat, chat.title, (String) ld1Var.h.get(i10 - this.f), i10 != this.h - 1);
            d4Var.c(ld1Var.w.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        if (i10 != 1) {
            if (i10 == 2) {
                org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false)), org.telegram.ui.ActionBar.g6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                dqVar.w = true;
                w6Var.setBackground(dqVar);
                view2 = w6Var;
            } else if (i10 != 3) {
                view2 = i10 != 5 ? new org.telegram.ui.Cells.d4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
            } else {
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.L6, 21, 8, false, null);
                j4Var.setHeight(54);
                j4Var.setText(LocaleController.getString(R.string.InactiveChats));
                view = j4Var;
            }
            view = view2;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.g6.m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            jaVar.addView(textView, h7.z5.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            jaVar.a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            jaVar.addView(textView2, h7.z5.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            hh.h1 h1Var = new hh.h1(context, new Paint(1), textPaint);
            h1Var.setWillNotDraw(false);
            h1Var.addView(imageView, h7.z5.e(-2, -2, 1));
            jaVar.addView(h1Var, h7.z5.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            ld1 ld1Var = this.r;
            ld1Var.x = jaVar;
            int i12 = ld1Var.C;
            ld1Var.x.setMessageText(i12 == 0 ? LocaleController.getString(R.string.TooManyCommunitiesHintJoin) : i12 == 1 ? LocaleController.getString(R.string.TooManyCommunitiesHintEdit) : LocaleController.getString(R.string.TooManyCommunitiesHintCreate));
            f2.y0 y0Var = new f2.y0(-1, -2);
            ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) y0Var).topMargin = AndroidUtilities.dp(23.0f);
            ld1Var.x.setLayoutParams(y0Var);
            view = jaVar;
        }
        return new org.telegram.ui.Components.lk0(view);
    }
}
