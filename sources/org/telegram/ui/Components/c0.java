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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final n9 h;
    public final TextView n;
    public float r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = true;
        this.a = i10;
        this.b = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        n9 n9Var = new n9(context);
        this.h = n9Var;
        NotificationCenter.listenEmojiLoading(n9Var);
        linearLayout.addView(n9Var, h7.z5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, h7.z5.t(-2, -2, 49, 0, 2, 0, 0));
        h7.b6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f10, boolean z10) {
        if (z10 || Math.abs(f10 - this.r) >= 0.01f) {
            this.r = f10;
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            org.telegram.ui.ActionBar.c6 c6Var = this.b;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            int i11 = org.telegram.ui.ActionBar.g6.Oh;
            int d = i0.b.d(f10, v02, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            int d10 = i0.b.d(f10, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
            n9 n9Var = this.h;
            n9Var.setColorFilter(porterDuffColorFilter);
            n9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            n9Var.invalidate();
            this.n.setTextColor(d10);
        }
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        a(this.r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        int l1 = z10 ? org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var);
        int i10 = this.c;
        setBackground(org.telegram.ui.ActionBar.g6.Y(l1, i10, i10));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
