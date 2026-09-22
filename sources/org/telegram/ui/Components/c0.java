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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final u9 h;
    public final TextView n;
    public float r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = true;
        this.a = i10;
        this.b = e6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        u9 u9Var = new u9(context);
        this.h = u9Var;
        NotificationCenter.listenEmojiLoading(u9Var);
        linearLayout.addView(u9Var, w7.x5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, w7.x5.t(-2, -2, 49, 0, 2, 0, 0));
        w7.z5.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f7, boolean z10) {
        if (z10 || Math.abs(f7 - this.r) >= 0.01f) {
            this.r = f7;
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
            int i11 = org.telegram.ui.ActionBar.i6.Oh;
            int d = i0.a.d(f7, v02, org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
            int d10 = i0.a.d(f7, org.telegram.ui.ActionBar.i6.v0(i10, e6Var), org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
            u9 u9Var = this.h;
            u9Var.setColorFilter(porterDuffColorFilter);
            u9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            u9Var.invalidate();
            this.n.setTextColor(d10);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        a(this.r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int l1 = z10 ? org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)) : org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, e6Var);
        int i10 = this.c;
        setBackground(org.telegram.ui.ActionBar.i6.Y(l1, i10, i10));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
