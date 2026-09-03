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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final p9 h;
    public final TextView n;
    public float r;

    public d0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = true;
        this.a = i10;
        this.b = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        p9 p9Var = new p9(context);
        this.h = p9Var;
        NotificationCenter.listenEmojiLoading(p9Var);
        linearLayout.addView(p9Var, k7.b6.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, k7.b6.t(-2, -2, 49, 0, 2, 0, 0));
        k7.d6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f10, boolean z4) {
        if (z4 || Math.abs(f10 - this.r) >= 0.01f) {
            this.r = f10;
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.f6 f6Var = this.b;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            int i11 = org.telegram.ui.ActionBar.j6.Oh;
            int d = i0.a.d(f10, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            int d10 = i0.a.d(f10, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
            p9 p9Var = this.h;
            p9Var.setColorFilter(porterDuffColorFilter);
            p9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            p9Var.invalidate();
            this.n.setTextColor(d10);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        a(this.r, true);
        boolean z4 = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int l1 = z4 ? org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var);
        int i10 = this.c;
        setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i10, i10));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
