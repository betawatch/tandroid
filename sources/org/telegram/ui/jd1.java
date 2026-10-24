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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class jd1 extends org.telegram.ui.Components.lm0 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ md1 r;

    public jd1(md1 md1Var) {
        this.r = md1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.b() >= this.f && b1Var.b() < this.h;
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
    public final int h() {
        return this.c;
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final void l() {
        E();
        super.l();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        int i11 = this.e;
        md1 md1Var = this.r;
        if (i10 < i11 || i11 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(md1Var.E);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            TLRPC.Chat chat = (TLRPC.Chat) md1Var.f.get(i10 - this.f);
            f4Var.e(chat, chat.title, (String) md1Var.h.get(i10 - this.f), i10 != this.h - 1);
            f4Var.c(md1Var.w.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        if (i10 != 1) {
            if (i10 == 2) {
                org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
                Drawable X0 = org.telegram.ui.ActionBar.k6.X0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                int i11 = org.telegram.ui.ActionBar.k6.a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(colorDrawable, X0);
                yqVar.w = true;
                b7Var.setBackground(yqVar);
                org.telegram.ui.ActionBar.r6.z(b7Var, colorDrawable, i11, null, PorterDuff.Mode.SRC_IN);
                view2 = b7Var;
            } else if (i10 != 3) {
                view2 = i10 != 5 ? new org.telegram.ui.Cells.f4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.j3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
            } else {
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(viewGroup.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 8, false, null);
                l4Var.setHeight(54);
                l4Var.setText(LocaleController.getString(R.string.InactiveChats));
                view = l4Var;
            }
            view = view2;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.oa oaVar = new org.telegram.ui.Cells.oa(context);
            ImageView imageView = new ImageView(context);
            int i12 = org.telegram.ui.ActionBar.k6.m9;
            org.telegram.ui.ActionBar.r6.t(imageView, i12, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.v0.q(textView, i12, null, 1, 20.0f);
            textView.setGravity(17);
            oaVar.addView(textView, w7.z5.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            oaVar.a = textView2;
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            oaVar.addView(textView2, w7.z5.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            ai.w1 w1Var = new ai.w1(context, new Paint(1), textPaint);
            w1Var.setWillNotDraw(false);
            w1Var.addView(imageView, w7.z5.e(-2, -2, 1));
            oaVar.addView(w1Var, w7.z5.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            md1 md1Var = this.r;
            md1Var.x = oaVar;
            int i13 = md1Var.G;
            md1Var.x.setMessageText(i13 == 0 ? LocaleController.getString(R.string.TooManyCommunitiesHintJoin) : i13 == 1 ? LocaleController.getString(R.string.TooManyCommunitiesHintEdit) : LocaleController.getString(R.string.TooManyCommunitiesHintCreate));
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(23.0f);
            md1Var.x.setLayoutParams(o0Var);
            view = oaVar;
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
