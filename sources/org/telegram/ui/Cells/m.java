package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class m extends FrameLayout implements org.telegram.messenger.u9, org.telegram.ui.ActionBar.a6 {
    public final int a;
    public final org.telegram.ui.Components.j6 b;
    public final org.telegram.ui.Components.j6 c;
    public final l d;
    public ArrayList e;
    public boolean f;

    public m(Activity activity, int i7) {
        super(activity);
        this.e = new ArrayList();
        this.a = i7;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, false, false, false);
        this.b = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
        e10.addView(j6Var, c8.ha.o(-1, 18));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(activity, false, false, false);
        this.c = j6Var2;
        j6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        e10.addView(j6Var2, c8.ha.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i7);
        this.d = lVar;
        lVar.b(299L);
        addView(e10, c8.ha.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.k6.N0(false);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(this, N0, null, N, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override // org.telegram.messenger.u9
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.j6 j6Var;
        String str;
        String str2;
        String a02;
        String a03;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.e = arrayList2;
        int size = arrayList2.size();
        l lVar = this.d;
        if (size == 1) {
            org.telegram.messenger.s9 s9Var = (org.telegram.messenger.s9) this.e.get(0);
            s9Var.getClass();
            if (s9Var.g(ConnectionsManager.getInstance(p10.s0).getCurrentTime())) {
                lVar.a(s9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var.f;
                lVar.a(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            lVar.f = 0;
            lVar.c.b();
            lVar.a.t(id.M0(2131750337, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        int i7 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            j6Var = this.b;
            if (i7 >= size2) {
                break;
            }
            org.telegram.messenger.s9 s9Var2 = (org.telegram.messenger.s9) this.e.get(i7);
            boolean g10 = s9Var2.g(currentTime);
            int i10 = size2;
            long j3 = s9Var2.c;
            z9 |= g10;
            if (j3 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.r5(j3, j6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = s9Var2.d();
            z10 |= d == 2 || d == 3;
            i7++;
            size2 = i10;
        }
        int i11 = size2;
        spannableStringBuilder.append(' ');
        if (z9) {
            if (i11 == 1) {
                str = null;
                a03 = id.M0(2131750402, null);
            } else {
                str = null;
                a03 = id.a0(null, null, 2131750401, Integer.valueOf(i11));
            }
            spannableStringBuilder.append((CharSequence) a03);
        } else {
            str = null;
            spannableStringBuilder.append((CharSequence) (i11 == 1 ? id.M0(2131750420, null) : id.a0(null, null, 2131750419, Integer.valueOf(i11))));
        }
        j6Var.c(spannableStringBuilder, true, true);
        this.f = false;
        org.telegram.ui.Components.j6 j6Var2 = this.c;
        if (z9) {
            j6Var2.setText(id.M0(2131750414, str));
        } else if (z10) {
            j6Var2.setText(id.M0(2131750413, str));
            this.f = true;
        } else if (i11 > 1) {
            j6Var2.setText(id.M0(2131750409, str));
        } else {
            int i12 = ((org.telegram.messenger.s9) this.e.get(0)).i;
            if (i12 == 1) {
                a02 = id.M0(2131750412, str);
            } else if (i12 == 2) {
                a02 = id.M0(2131750411, str);
            } else if (i12 == 3) {
                a02 = id.M0(2131750410, str);
            } else {
                int i13 = i12 % 100;
                if (i13 < 11 || i13 > 13) {
                    int i14 = i12 % 10;
                    if (i14 == 1) {
                        str2 = null;
                        a02 = id.a0(null, null, 2131750404, Integer.valueOf(i12));
                    } else if (i14 == 2) {
                        str2 = null;
                        a02 = id.a0(null, null, 2131750407, Integer.valueOf(i12));
                    } else if (i14 != 3) {
                        str2 = null;
                        a02 = id.a0(null, null, 2131750403, Integer.valueOf(i12));
                    } else {
                        str2 = null;
                        a02 = id.a0(null, null, 2131750405, Integer.valueOf(i12));
                    }
                } else {
                    str2 = null;
                    a02 = id.a0(null, null, 2131750403, Integer.valueOf(i12));
                }
                j6Var2.setText(id.a0(str2, str2, 2131750408, a02));
            }
            str2 = str;
            j6Var2.setText(id.a0(str2, str2, 2131750408, a02));
        }
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        org.telegram.messenger.w9.c(i7).f.add(this);
        g(org.telegram.messenger.w9.c(i7).c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.w9.c(this.a).f.remove(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, this.f ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.y6, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
