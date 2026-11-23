package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class az extends org.telegram.ui.Cells.o4 {
    public final /* synthetic */ kz E;
    public final TextView r;
    public final di.db s;
    public int w;
    public final org.telegram.ui.Components.g5 x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public az(kz kzVar, Context context) {
        super(context, r2, 22, 15, false, r6);
        org.telegram.ui.ActionBar.h6 h6Var;
        this.E = kzVar;
        int i7 = org.telegram.ui.ActionBar.m6.L6;
        h6Var = ((org.telegram.ui.ActionBar.g2) kzVar).resourceProvider;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.z6, kzVar.getResourceProvider());
        textView.setText(org.telegram.messenger.hd.N0(kzVar.getUserConfig().q() ? 2131750603 : 2131750602, null));
        textView.setGravity(5);
        int i10 = (org.telegram.messenger.hd.a0 ? 3 : 5) | 48;
        float f10 = this.b;
        addView(textView, c8.ma.d(-1, -1.0f, i10, f10, 16.66f, f10, this.c));
        textView.setAlpha(0.0f);
        di.db dbVar = new di.db(this, getContext());
        this.s = dbVar;
        this.x = new org.telegram.ui.Components.g5(dbVar, 320L, org.telegram.ui.Components.nr.h, 0);
        dbVar.setTextSize(org.telegram.messenger.g0.L(10.0f));
        dbVar.setTypeface(org.telegram.messenger.g0.o());
        dbVar.setGravity(5);
        dbVar.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        int i11 = (org.telegram.messenger.hd.a0 ? 3 : 5) | 48;
        float f11 = this.b;
        addView(dbVar, c8.ma.d(-1, -1.0f, i11, f11, 16.66f, f11, this.c));
    }

    public final void d(int i7, boolean z10) {
        kz kzVar = this.E;
        String N0 = org.telegram.messenger.hd.N0(kzVar.getUserConfig().q() ? 2131750603 : 2131750602, null);
        TextView textView = this.r;
        textView.setText(N0);
        int i10 = 0;
        boolean z11 = i7 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.m6.r8;
            i10 = kzVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.w = i10;
        di.db dbVar = this.s;
        if (!z11) {
            dbVar.setEmojiColor(i10);
        }
        if (!z10) {
            this.x.a(this.w, true);
        }
        if (z11 != this.y) {
            this.y = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
            duration.setInterpolator(nrVar).start();
            dbVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(nrVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z10) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z11 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        di.db dbVar = this.s;
        CharSequence m10 = org.telegram.messenger.j6.m(charSequence, dbVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.hd.a0) {
            z11 = true;
        }
        dbVar.c(m10, z11, true);
    }
}
