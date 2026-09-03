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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class de1 extends org.telegram.ui.Components.ql0 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ ge1 r;

    public de1(ge1 ge1Var) {
        this.r = ge1Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.b() >= this.f && l1Var.b() < this.h;
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

    @Override // f2.o0
    public final int h() {
        return this.c;
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.a;
        int i11 = this.e;
        ge1 ge1Var = this.r;
        if (i10 < i11 || i11 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(ge1Var.B);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            TLRPC.Chat chat = (TLRPC.Chat) ge1Var.f.get(i10 - this.f);
            f4Var.e(chat, chat.title, (String) ge1Var.h.get(i10 - this.f), i10 != this.h - 1);
            f4Var.c(ge1Var.w.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        if (i10 != 1) {
            if (i10 == 2) {
                org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (b) null);
                org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                mqVar.w = true;
                y6Var.setBackground(mqVar);
                view2 = y6Var;
            } else if (i10 != 3) {
                view2 = i10 != 5 ? new org.telegram.ui.Cells.f4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.j3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
            } else {
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(viewGroup.getContext(), org.telegram.ui.ActionBar.j6.L6, 21, 8, false, null);
                l4Var.setHeight(54);
                l4Var.setText(LocaleController.getString(R.string.InactiveChats));
                view = l4Var;
            }
            view = view2;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.la laVar = new org.telegram.ui.Cells.la(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.j6.m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            laVar.addView(textView, k7.b6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            laVar.a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            laVar.addView(textView2, k7.b6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            dg.v3 v3Var = new dg.v3(context, new Paint(1), textPaint);
            v3Var.setWillNotDraw(false);
            v3Var.addView(imageView, k7.b6.e(-2, -2, 1));
            laVar.addView(v3Var, k7.b6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            ge1 ge1Var = this.r;
            ge1Var.x = laVar;
            int i12 = ge1Var.D;
            ge1Var.x.setMessageText(i12 == 0 ? LocaleController.getString(R.string.TooManyCommunitiesHintJoin) : i12 == 1 ? LocaleController.getString(R.string.TooManyCommunitiesHintEdit) : LocaleController.getString(R.string.TooManyCommunitiesHintCreate));
            f2.w0 w0Var = new f2.w0(-1, -2);
            ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(23.0f);
            ge1Var.x.setLayoutParams(w0Var);
            view = laVar;
        }
        return new org.telegram.ui.Components.dl0(view);
    }
}
