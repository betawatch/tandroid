package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final p9 h;
    public final TextView n;
    public float r;

    public d0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = true;
        this.a = i10;
        this.b = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        p9 p9Var = new p9(context);
        this.h = p9Var;
        NotificationCenter.listenEmojiLoading(p9Var);
        linearLayout.addView(p9Var, k7.c6.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, k7.c6.t(-2, -2, 49, 0, 2, 0, 0));
        k7.e6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f10, boolean z4) {
        if (z4 || Math.abs(f10 - this.r) >= 0.01f) {
            this.r = f10;
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.g6 g6Var = this.b;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            int d = i0.a.d(f10, v02, org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            int d10 = i0.a.d(f10, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
            p9 p9Var = this.h;
            p9Var.setColorFilter(porterDuffColorFilter);
            p9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            p9Var.invalidate();
            this.n.setTextColor(d10);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        a(this.r, true);
        boolean z4 = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        int l1 = z4 ? org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)) : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var);
        int i10 = this.c;
        setBackground(org.telegram.ui.ActionBar.k6.Y(l1, i10, i10));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
