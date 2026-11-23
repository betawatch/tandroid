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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final int a;
    public final org.telegram.ui.ActionBar.i6 b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final p9 h;
    public final TextView n;
    public float r;

    public k0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = true;
        this.a = i7;
        this.b = i6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        p9 p9Var = new p9(context);
        this.h = p9Var;
        org.telegram.messenger.ks.i(p9Var);
        linearLayout.addView(p9Var, c8.na.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, c8.na.t(-2, -2, 49, 0, 2, 0, 0));
        c8.sa.b(this, 0.05f, 1.5f);
        b(true, 0.0f);
    }

    public final void a(String str, CharSequence charSequence, Long l10) {
        int i7;
        this.f = true;
        p9 p9Var = this.h;
        p9Var.setColorFilter(null);
        p9Var.setImageDrawable(org.telegram.messenger.j6.g(str));
        this.n.setText(charSequence);
        int i10 = this.a;
        if (ConnectionsManager.getInstance(i10).isTestBackend()) {
            i7 = 0;
            while (i7 < 4) {
                if (org.telegram.messenger.i10.i(i7).p() && !ConnectionsManager.getInstance(i7).isTestBackend()) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        i7 = i10;
        if (l10 != null) {
            p9Var.setAnimatedEmojiDrawable(new o5(9, i10, l10.longValue()));
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            org.telegram.messenger.ri.d0(i7).n0(tL_inputStickerSetShortName, null, false, false, new ki.n2(27, this, str));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
    }

    public final void b(boolean z10, float f10) {
        if (z10 || Math.abs(f10 - this.r) >= 0.01f) {
            this.r = f10;
            int i7 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.i6 i6Var = this.b;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
            int i10 = org.telegram.ui.ActionBar.n6.Fi;
            int f11 = i0.a.f(f10, w02, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
            int f12 = i0.a.f(f10, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN) : null;
            p9 p9Var = this.h;
            p9Var.setColorFilter(porterDuffColorFilter);
            p9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
            p9Var.invalidate();
            this.n.setTextColor(f12);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        b(true, this.r);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        int r12 = z10 ? org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var)) : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var);
        int i7 = this.c;
        setBackground(org.telegram.ui.ActionBar.n6.a0(r12, i7, i7));
    }
}
