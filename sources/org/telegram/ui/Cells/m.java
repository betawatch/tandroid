package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m extends FrameLayout implements org.telegram.messenger.t9, org.telegram.ui.ActionBar.z5 {
    public final int a;
    public final org.telegram.ui.Components.h6 b;
    public final org.telegram.ui.Components.h6 c;
    public final l d;
    public ArrayList e;
    public boolean f;

    public m(Activity activity, int i7) {
        super(activity);
        this.e = new ArrayList();
        this.a = i7;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(activity, false, false, false);
        this.b = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
        e10.addView(h6Var, c8.ja.o(-1, 18));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(activity, false, false, false);
        this.c = h6Var2;
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        e10.addView(h6Var2, c8.ja.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i7);
        this.d = lVar;
        lVar.b(299L);
        addView(e10, c8.ja.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, c8.ja.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.j6.N0(false);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.q6.j(this, N0, null, M, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override // org.telegram.messenger.t9
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.h6 h6Var;
        String str;
        String str2;
        String a02;
        String a03;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.e = arrayList2;
        int size = arrayList2.size();
        l lVar = this.d;
        if (size == 1) {
            org.telegram.messenger.r9 r9Var = (org.telegram.messenger.r9) this.e.get(0);
            r9Var.getClass();
            if (r9Var.g(ConnectionsManager.getInstance(m10.t0).getCurrentTime())) {
                lVar.a(r9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var.f;
                lVar.a(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            lVar.f = 0;
            lVar.c.b();
            lVar.a.t(hd.M0(2131750336, null), true, true);
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
            h6Var = this.b;
            if (i7 >= size2) {
                break;
            }
            org.telegram.messenger.r9 r9Var2 = (org.telegram.messenger.r9) this.e.get(i7);
            boolean g10 = r9Var2.g(currentTime);
            int i10 = size2;
            long j3 = r9Var2.c;
            z10 |= g10;
            if (j3 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(j3, h6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = r9Var2.d();
            z11 |= d == 2 || d == 3;
            i7++;
            size2 = i10;
        }
        int i11 = size2;
        spannableStringBuilder.append(' ');
        if (z10) {
            if (i11 == 1) {
                str = null;
                a03 = hd.M0(2131750401, null);
            } else {
                str = null;
                a03 = hd.a0(null, null, 2131750400, Integer.valueOf(i11));
            }
            spannableStringBuilder.append((CharSequence) a03);
        } else {
            str = null;
            spannableStringBuilder.append((CharSequence) (i11 == 1 ? hd.M0(2131750419, null) : hd.a0(null, null, 2131750418, Integer.valueOf(i11))));
        }
        h6Var.c(spannableStringBuilder, true, true);
        this.f = false;
        org.telegram.ui.Components.h6 h6Var2 = this.c;
        if (z10) {
            h6Var2.setText(hd.M0(2131750413, str));
        } else if (z11) {
            h6Var2.setText(hd.M0(2131750412, str));
            this.f = true;
        } else if (i11 > 1) {
            h6Var2.setText(hd.M0(2131750408, str));
        } else {
            int i12 = ((org.telegram.messenger.r9) this.e.get(0)).i;
            if (i12 == 1) {
                a02 = hd.M0(2131750411, str);
            } else if (i12 == 2) {
                a02 = hd.M0(2131750410, str);
            } else if (i12 == 3) {
                a02 = hd.M0(2131750409, str);
            } else {
                int i13 = i12 % 100;
                if (i13 < 11 || i13 > 13) {
                    int i14 = i12 % 10;
                    if (i14 == 1) {
                        str2 = null;
                        a02 = hd.a0(null, null, 2131750403, Integer.valueOf(i12));
                    } else if (i14 == 2) {
                        str2 = null;
                        a02 = hd.a0(null, null, 2131750406, Integer.valueOf(i12));
                    } else if (i14 != 3) {
                        str2 = null;
                        a02 = hd.a0(null, null, 2131750402, Integer.valueOf(i12));
                    } else {
                        str2 = null;
                        a02 = hd.a0(null, null, 2131750404, Integer.valueOf(i12));
                    }
                } else {
                    str2 = null;
                    a02 = hd.a0(null, null, 2131750402, Integer.valueOf(i12));
                }
                h6Var2.setText(hd.a0(str2, str2, 2131750407, a02));
            }
            str2 = str;
            h6Var2.setText(hd.a0(str2, str2, 2131750407, a02));
        }
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        org.telegram.messenger.v9.c(i7).f.add(this);
        g(org.telegram.messenger.v9.c(i7).c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.v9.c(this.a).f.remove(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, this.f ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.y6, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
