package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class l0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int a;
    public final org.telegram.ui.ActionBar.h6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final q9 h;
    public final TextView n;
    public float r;

    public l0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = true;
        this.a = i7;
        this.b = h6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        q9 q9Var = new q9(context);
        this.h = q9Var;
        org.telegram.messenger.ls.i(q9Var);
        linearLayout.addView(q9Var, c8.ma.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, c8.ma.t(-2, -2, 49, 0, 2, 0, 0));
        c8.ra.b(this, 0.05f, 1.5f);
        b(true, 0.0f);
    }

    public final void a(String str, CharSequence charSequence, Long l10) {
        int i7;
        this.f = true;
        q9 q9Var = this.h;
        q9Var.setColorFilter(null);
        q9Var.setImageDrawable(org.telegram.messenger.j6.g(str));
        this.n.setText(charSequence);
        int i10 = this.a;
        if (ConnectionsManager.getInstance(i10).isTestBackend()) {
            i7 = 0;
            while (i7 < 4) {
                if (org.telegram.messenger.k10.i(i7).p() && !ConnectionsManager.getInstance(i7).isTestBackend()) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        i7 = i10;
        if (l10 != null) {
            q9Var.setAnimatedEmojiDrawable(new p5(9, i10, l10.longValue()));
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            org.telegram.messenger.si.d0(i7).n0(tL_inputStickerSetShortName, null, false, false, new li.d(26, this, str));
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
    }

    public final void b(boolean z10, float f10) {
        if (z10 || Math.abs(f10 - this.r) >= 0.01f) {
            this.r = f10;
            int i7 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.h6 h6Var = this.b;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            int i10 = org.telegram.ui.ActionBar.m6.Fi;
            int f11 = i0.a.f(f10, w02, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            int f12 = i0.a.f(f10, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN) : null;
            q9 q9Var = this.h;
            q9Var.setColorFilter(porterDuffColorFilter);
            q9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
            q9Var.invalidate();
            this.n.setTextColor(f12);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        b(true, this.r);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        int r12 = z10 ? org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var)) : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var);
        int i7 = this.c;
        setBackground(org.telegram.ui.ActionBar.m6.a0(r12, i7, i7));
    }
}
