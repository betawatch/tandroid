package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m extends FrameLayout implements org.telegram.messenger.s9, org.telegram.ui.ActionBar.c6 {
    public final int a;
    public final org.telegram.ui.Components.n6 b;
    public final org.telegram.ui.Components.n6 c;
    public final l d;
    public ArrayList e;
    public boolean f;

    public m(Activity activity, int i7) {
        super(activity);
        this.e = new ArrayList();
        this.a = i7;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(activity, false, false, false);
        this.b = n6Var;
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
        f10.addView(n6Var, c8.ma.o(-1, 18));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(activity, false, false, false);
        this.c = n6Var2;
        n6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        f10.addView(n6Var2, c8.ma.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i7);
        this.d = lVar;
        lVar.b(299L);
        addView(f10, c8.ma.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, c8.ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.n6.N0(false);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.u6.j(this, N0, null, M, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override // org.telegram.messenger.s9
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.n6 n6Var;
        String str;
        String str2;
        String a02;
        String a03;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.e = arrayList2;
        int size = arrayList2.size();
        l lVar = this.d;
        if (size == 1) {
            org.telegram.messenger.q9 q9Var = (org.telegram.messenger.q9) this.e.get(0);
            q9Var.getClass();
            if (q9Var.g(ConnectionsManager.getInstance(j10.t0).getCurrentTime())) {
                lVar.a(q9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var.f;
                lVar.a(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            lVar.f = 0;
            lVar.c.b();
            lVar.a.t(gd.M0(2131750320, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            n6Var = this.b;
            if (i7 >= size2) {
                break;
            }
            org.telegram.messenger.q9 q9Var2 = (org.telegram.messenger.q9) this.e.get(i7);
            boolean g10 = q9Var2.g(currentTime);
            int i10 = size2;
            long j3 = q9Var2.c;
            z10 |= g10;
            if (j3 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(j3, n6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = q9Var2.d();
            z11 |= d == 2 || d == 3;
            i7++;
            size2 = i10;
        }
        int i11 = size2;
        spannableStringBuilder.append(' ');
        if (z10) {
            if (i11 == 1) {
                str = null;
                a03 = gd.M0(2131750385, null);
            } else {
                str = null;
                a03 = gd.a0(null, null, 2131750384, Integer.valueOf(i11));
            }
            spannableStringBuilder.append((CharSequence) a03);
        } else {
            str = null;
            spannableStringBuilder.append((CharSequence) (i11 == 1 ? gd.M0(2131750403, null) : gd.a0(null, null, 2131750402, Integer.valueOf(i11))));
        }
        n6Var.c(spannableStringBuilder, true, true);
        this.f = false;
        org.telegram.ui.Components.n6 n6Var2 = this.c;
        if (z10) {
            n6Var2.setText(gd.M0(2131750397, str));
        } else if (z11) {
            n6Var2.setText(gd.M0(2131750396, str));
            this.f = true;
        } else if (i11 > 1) {
            n6Var2.setText(gd.M0(2131750392, str));
        } else {
            int i12 = ((org.telegram.messenger.q9) this.e.get(0)).i;
            if (i12 == 1) {
                a02 = gd.M0(2131750395, str);
            } else if (i12 == 2) {
                a02 = gd.M0(2131750394, str);
            } else if (i12 == 3) {
                a02 = gd.M0(2131750393, str);
            } else {
                int i13 = i12 % 100;
                if (i13 < 11 || i13 > 13) {
                    int i14 = i12 % 10;
                    if (i14 == 1) {
                        str2 = null;
                        a02 = gd.a0(null, null, 2131750387, Integer.valueOf(i12));
                    } else if (i14 == 2) {
                        str2 = null;
                        a02 = gd.a0(null, null, 2131750390, Integer.valueOf(i12));
                    } else if (i14 != 3) {
                        str2 = null;
                        a02 = gd.a0(null, null, 2131750386, Integer.valueOf(i12));
                    } else {
                        str2 = null;
                        a02 = gd.a0(null, null, 2131750388, Integer.valueOf(i12));
                    }
                } else {
                    str2 = null;
                    a02 = gd.a0(null, null, 2131750386, Integer.valueOf(i12));
                }
                n6Var2.setText(gd.a0(str2, str2, 2131750391, a02));
            }
            str2 = str;
            n6Var2.setText(gd.a0(str2, str2, 2131750391, a02));
        }
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        org.telegram.messenger.u9.c(i7).f.add(this);
        g(org.telegram.messenger.u9.c(i7).c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.u9.c(this.a).f.remove(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, this.f ? org.telegram.ui.ActionBar.n6.q7 : org.telegram.ui.ActionBar.n6.y6, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
