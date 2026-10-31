package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l extends FrameLayout implements org.telegram.messenger.v9, org.telegram.ui.ActionBar.k6 {
    public final int a;
    public final org.telegram.ui.Components.f6 b;
    public final org.telegram.ui.Components.f6 c;
    public final k d;
    public ArrayList e;
    public boolean f;

    public l(Activity activity, int i10) {
        super(activity);
        this.e = new ArrayList();
        this.a = i10;
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(activity, false, false, false);
        this.b = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setTranslationY(-org.telegram.messenger.i0.L(1.0f));
        e.addView(f6Var, w7.b6.o(-1, 18));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(activity, false, false, false);
        this.c = f6Var2;
        f6Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        e.addView(f6Var2, w7.b6.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        k kVar = new k(activity, i10);
        this.d = kVar;
        kVar.b(299L);
        addView(e, w7.b6.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(kVar, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.t6.N0(false);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(this, N0, null, N, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override // org.telegram.messenger.v9
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.f6 f6Var;
        String str;
        String str2;
        String a02;
        String a03;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.e = arrayList2;
        int size = arrayList2.size();
        k kVar = this.d;
        if (size == 1) {
            org.telegram.messenger.t9 t9Var = (org.telegram.messenger.t9) this.e.get(0);
            t9Var.getClass();
            if (t9Var.g(ConnectionsManager.getInstance(d20.s0).getCurrentTime())) {
                kVar.a(t9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = t9Var.f;
                kVar.a(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            kVar.f = 0;
            kVar.c.b();
            kVar.a.t(cd.L0(2131750345, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            f6Var = this.b;
            if (i10 >= size2) {
                break;
            }
            org.telegram.messenger.t9 t9Var2 = (org.telegram.messenger.t9) this.e.get(i10);
            boolean g10 = t9Var2.g(currentTime);
            int i11 = size2;
            long j10 = t9Var2.c;
            z10 |= g10;
            if (j10 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o5(j10, f6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = t9Var2.d();
            z11 |= d == 2 || d == 3;
            i10++;
            size2 = i11;
        }
        int i12 = size2;
        spannableStringBuilder.append(' ');
        if (z10) {
            if (i12 == 1) {
                str = null;
                a03 = cd.L0(2131750410, null);
            } else {
                str = null;
                a03 = cd.a0(null, null, 2131750409, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a03);
        } else {
            str = null;
            spannableStringBuilder.append((CharSequence) (i12 == 1 ? cd.L0(2131750428, null) : cd.a0(null, null, 2131750427, Integer.valueOf(i12))));
        }
        f6Var.c(spannableStringBuilder, true, true);
        this.f = false;
        org.telegram.ui.Components.f6 f6Var2 = this.c;
        if (z10) {
            f6Var2.setText(cd.L0(2131750422, str));
        } else if (z11) {
            f6Var2.setText(cd.L0(2131750421, str));
            this.f = true;
        } else if (i12 > 1) {
            f6Var2.setText(cd.L0(2131750417, str));
        } else {
            int i13 = ((org.telegram.messenger.t9) this.e.get(0)).i;
            if (i13 == 1) {
                a02 = cd.L0(2131750420, str);
            } else if (i13 == 2) {
                a02 = cd.L0(2131750419, str);
            } else if (i13 == 3) {
                a02 = cd.L0(2131750418, str);
            } else {
                int i14 = i13 % 100;
                if (i14 < 11 || i14 > 13) {
                    int i15 = i13 % 10;
                    if (i15 == 1) {
                        str2 = null;
                        a02 = cd.a0(null, null, 2131750412, Integer.valueOf(i13));
                    } else if (i15 == 2) {
                        str2 = null;
                        a02 = cd.a0(null, null, 2131750415, Integer.valueOf(i13));
                    } else if (i15 != 3) {
                        str2 = null;
                        a02 = cd.a0(null, null, 2131750411, Integer.valueOf(i13));
                    } else {
                        str2 = null;
                        a02 = cd.a0(null, null, 2131750413, Integer.valueOf(i13));
                    }
                } else {
                    str2 = null;
                    a02 = cd.a0(null, null, 2131750411, Integer.valueOf(i13));
                }
                f6Var2.setText(cd.a0(str2, str2, 2131750416, a02));
            }
            str2 = str;
            f6Var2.setText(cd.a0(str2, str2, 2131750416, a02));
        }
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.a;
        org.telegram.messenger.x9.c(i10).f.add(this);
        g(org.telegram.messenger.x9.c(i10).c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.x9.c(this.a).f.remove(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, this.f ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.y6, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
