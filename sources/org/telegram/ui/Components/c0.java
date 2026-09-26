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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final int a;
    public final org.telegram.ui.ActionBar.d6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final w9 h;
    public final TextView n;
    public float r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = true;
        this.a = i10;
        this.b = d6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        w9 w9Var = new w9(context);
        this.h = w9Var;
        NotificationCenter.listenEmojiLoading(w9Var);
        linearLayout.addView(w9Var, w7.y5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, w7.y5.t(-2, -2, 49, 0, 2, 0, 0));
        w7.a6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f7, boolean z10) {
        if (z10 || Math.abs(f7 - this.r) >= 0.01f) {
            this.r = f7;
            int i10 = org.telegram.ui.ActionBar.h6.G6;
            org.telegram.ui.ActionBar.d6 d6Var = this.b;
            int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
            int i11 = org.telegram.ui.ActionBar.h6.Oh;
            int d = i0.a.d(f7, v02, org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            int d10 = i0.a.d(f7, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
            w9 w9Var = this.h;
            w9Var.setColorFilter(porterDuffColorFilter);
            w9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            w9Var.invalidate();
            this.n.setTextColor(d10);
        }
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        a(this.r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = this.b;
        int l1 = z10 ? org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)) : org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, d6Var);
        int i10 = this.c;
        setBackground(org.telegram.ui.ActionBar.h6.Y(l1, i10, i10));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
