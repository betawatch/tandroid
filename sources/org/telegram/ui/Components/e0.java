package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final int a;
    public final org.telegram.ui.ActionBar.p6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final g9 h;
    public final TextView n;
    public float r;

    public e0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = true;
        this.a = i10;
        this.b = p6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        g9 g9Var = new g9(context);
        this.h = g9Var;
        org.telegram.messenger.zs.i(g9Var);
        linearLayout.addView(g9Var, w7.b6.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, w7.b6.t(-2, -2, 49, 0, 2, 0, 0));
        w7.e6.b(this, 0.05f, 1.5f);
        a(true, 0.0f);
    }

    public final void a(boolean z10, float f7) {
        if (z10 || Math.abs(f7 - this.r) >= 0.01f) {
            this.r = f7;
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.p6 p6Var = this.b;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            int i11 = org.telegram.ui.ActionBar.t6.Ci;
            int f10 = i0.b.f(f7, w02, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            int f11 = i0.b.f(f7, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN) : null;
            g9 g9Var = this.h;
            g9Var.setColorFilter(porterDuffColorFilter);
            g9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
            g9Var.invalidate();
            this.n.setTextColor(f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        a(true, this.r);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int r12 = z10 ? org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var)) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var);
        int i10 = this.c;
        setBackground(org.telegram.ui.ActionBar.t6.a0(r12, i10, i10));
    }
}
