package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final l9 h;
    public final TextView n;
    public float r;

    public e0(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = true;
        this.a = i7;
        this.b = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        l9 l9Var = new l9(context);
        this.h = l9Var;
        org.telegram.messenger.qs.i(l9Var);
        linearLayout.addView(l9Var, c8.ha.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, c8.ha.t(-2, -2, 49, 0, 2, 0, 0));
        c8.ka.b(this, 0.05f, 1.5f);
        a(true, 0.0f);
    }

    public final void a(boolean z9, float f10) {
        if (z9 || Math.abs(f10 - this.r) >= 0.01f) {
            this.r = f10;
            int i7 = org.telegram.ui.ActionBar.l6.G6;
            org.telegram.ui.ActionBar.g6 g6Var = this.b;
            int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
            int i10 = org.telegram.ui.ActionBar.l6.Ci;
            int f11 = i0.a.f(f10, w02, org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
            int f12 = i0.a.f(f10, org.telegram.ui.ActionBar.l6.w0(i7, g6Var), org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN) : null;
            l9 l9Var = this.h;
            l9Var.setColorFilter(porterDuffColorFilter);
            l9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
            l9Var.invalidate();
            this.n.setTextColor(f12);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.i6));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        a(true, this.r);
        boolean z9 = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        int r12 = z9 ? org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var)) : org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.i6, g6Var);
        int i7 = this.c;
        setBackground(org.telegram.ui.ActionBar.l6.a0(r12, i7, i7));
    }
}
