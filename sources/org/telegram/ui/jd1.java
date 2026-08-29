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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jd1 extends org.telegram.ui.Components.il0 {
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

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.b() >= this.f && n1Var.b() < this.h;
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

    @Override // f2.p0
    public final int h() {
        return this.c;
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.a;
        int i11 = this.e;
        md1 md1Var = this.r;
        if (i10 < i11 || i11 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(md1Var.A);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            TLRPC.Chat chat = (TLRPC.Chat) md1Var.f.get(i10 - this.f);
            e4Var.e(chat, chat.title, (String) md1Var.h.get(i10 - this.f), i10 != this.h - 1);
            e4Var.c(md1Var.w.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        if (i10 != 1) {
            if (i10 == 2) {
                org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (b) null);
                org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false)), org.telegram.ui.ActionBar.g6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                jqVar.w = true;
                x6Var.setBackground(jqVar);
                view2 = x6Var;
            } else if (i10 != 3) {
                view2 = i10 != 5 ? new org.telegram.ui.Cells.e4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
            } else {
                org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.L6, 21, 8, false, null);
                k4Var.setHeight(54);
                k4Var.setText(LocaleController.getString(R.string.InactiveChats));
                view = k4Var;
            }
            view = view2;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.g6.m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            kaVar.addView(textView, i7.f6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            kaVar.a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            kaVar.addView(textView2, i7.f6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            bg.z3 z3Var = new bg.z3(context, new Paint(1), textPaint);
            z3Var.setWillNotDraw(false);
            z3Var.addView(imageView, i7.f6.e(-2, -2, 1));
            kaVar.addView(z3Var, i7.f6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            md1 md1Var = this.r;
            md1Var.x = kaVar;
            int i12 = md1Var.C;
            md1Var.x.setMessageText(i12 == 0 ? LocaleController.getString(R.string.TooManyCommunitiesHintJoin) : i12 == 1 ? LocaleController.getString(R.string.TooManyCommunitiesHintEdit) : LocaleController.getString(R.string.TooManyCommunitiesHintCreate));
            f2.x0 x0Var = new f2.x0(-1, -2);
            ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(23.0f);
            md1Var.x.setLayoutParams(x0Var);
            view = kaVar;
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
