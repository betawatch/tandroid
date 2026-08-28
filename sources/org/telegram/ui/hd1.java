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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hd1 extends org.telegram.ui.Components.vk0 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ kd1 r;

    public hd1(kd1 kd1Var) {
        this.r = kd1Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.b() >= this.f && q1Var.b() < this.h;
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
        int i9 = this.c;
        int i10 = i9 + 1;
        this.e = i9;
        int i11 = i9 + 2;
        this.c = i11;
        this.f = i10;
        int size = (arrayList.size() - 1) + i11;
        this.h = size;
        this.c = size + 1;
        this.n = size;
    }

    @Override // f2.r0
    public final int h() {
        return this.c;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == this.d) {
            return 2;
        }
        if (i9 == this.e) {
            return 3;
        }
        return i9 == this.n ? 5 : 4;
    }

    @Override // f2.r0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.a;
        int i10 = this.e;
        kd1 kd1Var = this.r;
        if (i9 < i10 || i10 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(kd1Var.A);
        }
        if (j(i9) == 4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            TLRPC.Chat chat = (TLRPC.Chat) kd1Var.f.get(i9 - this.f);
            g4Var.e(chat, chat.title, (String) kd1Var.h.get(i9 - this.f), i9 != this.h - 1);
            g4Var.c(kd1Var.w.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        if (i9 != 1) {
            if (i9 == 2) {
                org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
                org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false)), org.telegram.ui.ActionBar.f6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
                fqVar.w = true;
                z6Var.setBackground(fqVar);
                view2 = z6Var;
            } else if (i9 != 3) {
                view2 = i9 != 5 ? new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.l3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
            } else {
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(viewGroup.getContext(), org.telegram.ui.ActionBar.f6.L6, 21, 8, false, null);
                m4Var.setHeight(54);
                m4Var.setText(LocaleController.getString(R.string.InactiveChats));
                view = m4Var;
            }
            view = view2;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.na naVar = new org.telegram.ui.Cells.na(context);
            ImageView imageView = new ImageView(context);
            int i10 = org.telegram.ui.ActionBar.f6.m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            naVar.addView(textView, g7.e6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            naVar.a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            naVar.addView(textView2, g7.e6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            gh.h1 h1Var = new gh.h1(context, new Paint(1), textPaint);
            h1Var.setWillNotDraw(false);
            h1Var.addView(imageView, g7.e6.e(-2, -2, 1));
            naVar.addView(h1Var, g7.e6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            kd1 kd1Var = this.r;
            kd1Var.x = naVar;
            int i11 = kd1Var.C;
            kd1Var.x.setMessageText(i11 == 0 ? LocaleController.getString(R.string.TooManyCommunitiesHintJoin) : i11 == 1 ? LocaleController.getString(R.string.TooManyCommunitiesHintEdit) : LocaleController.getString(R.string.TooManyCommunitiesHintCreate));
            f2.a1 a1Var = new f2.a1(-1, -2);
            ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) a1Var).topMargin = AndroidUtilities.dp(23.0f);
            kd1Var.x.setLayoutParams(a1Var);
            view = naVar;
        }
        return new org.telegram.ui.Components.ik0(view);
    }
}
