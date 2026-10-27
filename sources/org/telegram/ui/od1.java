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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class od1 extends org.telegram.ui.Components.mm0 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ rd1 r;

    public od1(rd1 rd1Var) {
        this.r = rd1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.b() >= this.f && e1Var.b() < this.h;
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

    @Override // s4.h0
    public final int h() {
        return this.c;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void l() {
        E();
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.a;
        int i11 = this.e;
        rd1 rd1Var = this.r;
        if (i10 < i11 || i11 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(rd1Var.E);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            TLRPC.Chat chat = (TLRPC.Chat) rd1Var.f.get(i10 - this.f);
            k4Var.e(chat, chat.title, (String) rd1Var.h.get(i10 - this.f), i10 != this.h - 1);
            k4Var.c(rd1Var.w.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        if (i10 != 1) {
            if (i10 == 2) {
                org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
                Drawable X0 = org.telegram.ui.ActionBar.y6.X0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.y6.b7);
                int i11 = org.telegram.ui.ActionBar.y6.a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(colorDrawable, X0);
                arVar.w = true;
                f7Var.setBackground(arVar);
                org.telegram.ui.ActionBar.f7.y(f7Var, colorDrawable, i11, null, PorterDuff.Mode.SRC_IN);
                view2 = f7Var;
            } else if (i10 != 3) {
                view2 = i10 != 5 ? new org.telegram.ui.Cells.k4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
            } else {
                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(viewGroup.getContext(), org.telegram.ui.ActionBar.y6.L6, 21, 8, false, null);
                q4Var.setHeight(54);
                q4Var.setText(LocaleController.getString(R.string.InactiveChats));
                view = q4Var;
            }
            view = view2;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(context);
            ImageView imageView = new ImageView(context);
            int i12 = org.telegram.ui.ActionBar.y6.m9;
            org.telegram.ui.ActionBar.f7.t(imageView, i12, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.t.r(textView, i12, null, 1, 20.0f);
            textView.setGravity(17);
            saVar.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            saVar.a = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            saVar.addView(textView2, org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            bi.t1 t1Var = new bi.t1(context, new Paint(1), textPaint);
            t1Var.setWillNotDraw(false);
            t1Var.addView(imageView, org.telegram.ui.Components.kb1.i(-2, -2, 1));
            saVar.addView(t1Var, org.telegram.ui.Components.kb1.h(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            rd1 rd1Var = this.r;
            rd1Var.x = saVar;
            int i13 = rd1Var.G;
            rd1Var.x.setMessageText(i13 == 0 ? LocaleController.getString(R.string.TooManyCommunitiesHintJoin) : i13 == 1 ? LocaleController.getString(R.string.TooManyCommunitiesHintEdit) : LocaleController.getString(R.string.TooManyCommunitiesHintCreate));
            s4.q0 q0Var = new s4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(23.0f);
            rd1Var.x.setLayoutParams(q0Var);
            view = saVar;
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
