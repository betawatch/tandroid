package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final int a;
    public final org.telegram.ui.ActionBar.u6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final y9 h;
    public final TextView n;
    public float r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = true;
        this.a = i10;
        this.b = u6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.h(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        y9 y9Var = new y9(context);
        this.h = y9Var;
        NotificationCenter.listenEmojiLoading(y9Var);
        linearLayout.addView(y9Var, kb1.x(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, kb1.x(-2, -2, 49, 0, 2, 0, 0));
        kb1.c(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f7, boolean z10) {
        if (z10 || Math.abs(f7 - this.r) >= 0.01f) {
            this.r = f7;
            int i10 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.u6 u6Var = this.b;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            int f10 = i0.a.f(f7, w02, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            int f11 = i0.a.f(f7, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN) : null;
            y9 y9Var = this.h;
            y9Var.setColorFilter(porterDuffColorFilter);
            y9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
            y9Var.invalidate();
            this.n.setTextColor(f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        a(this.r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        int o12 = z10 ? org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var)) : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, u6Var);
        int i10 = this.c;
        setBackground(org.telegram.ui.ActionBar.y6.Z(o12, i10, i10));
    }
}
