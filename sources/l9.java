// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l9 extends FrameLayout implements jv4, vlb {
    public final int a;
    public final io b;
    public final io c;
    public final k9 d;
    public ArrayList e;
    public boolean f;

    public l9(Activity activity, int i) {
        super(activity);
        this.e = new ArrayList();
        this.a = i;
        LinearLayout l = td4.l(activity, 1);
        io ioVar = new io(activity, false, false, false);
        this.b = ioVar;
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setTypeface(gm.o());
        ioVar.setTranslationY(-gm.L(1.0f));
        l.addView(ioVar, qoe.o(-1, 18));
        io ioVar2 = new io(activity, false, false, false);
        this.c = ioVar2;
        ioVar2.setTextSize(gm.L(13.0f));
        l.addView(ioVar2, qoe.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        k9 k9Var = new k9(activity, i);
        this.d = k9Var;
        k9Var.b(299L);
        addView(l, qoe.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(k9Var, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable L0 = cmb.L0(false);
        wmb M = anb.M(cmb.h6);
        setBackground(L0);
        anb.j(this, L0, null, M, null);
        updateColors();
        setOnClickListener(new j1(this, (byte) 4));
    }

    @Override // jv4
    public final void c(ArrayList arrayList) {
        io ioVar;
        String str;
        String str2;
        String a0;
        String a02;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.e = arrayList2;
        int size = arrayList2.size();
        k9 k9Var = this.d;
        if (size == 1) {
            hv4 hv4Var = (hv4) this.e.get(0);
            hv4Var.getClass();
            if (hv4Var.g(ConnectionsManager.getInstance(z8c.t0).getCurrentTime())) {
                k9Var.a(hv4Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = hv4Var.f;
                k9Var.a(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            k9Var.f = 0;
            k9Var.c.b();
            k9Var.a.t(jb6.M0(2131750269, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ioVar = this.b;
            if (i >= size2) {
                break;
            }
            hv4 hv4Var2 = (hv4) this.e.get(i);
            boolean g = hv4Var2.g(currentTime);
            int i2 = size2;
            long j = hv4Var2.c;
            z |= g;
            if (j != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new gn(j, ioVar.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = hv4Var2.d();
            z2 |= d == 2 || d == 3;
            i++;
            size2 = i2;
        }
        int i3 = size2;
        spannableStringBuilder.append(' ');
        if (z) {
            if (i3 == 1) {
                str = null;
                a02 = jb6.M0(2131750334, null);
            } else {
                str = null;
                a02 = jb6.a0(null, null, 2131750333, Integer.valueOf(i3));
            }
            spannableStringBuilder.append((CharSequence) a02);
        } else {
            str = null;
            spannableStringBuilder.append((CharSequence) (i3 == 1 ? jb6.M0(2131750352, null) : jb6.a0(null, null, 2131750351, Integer.valueOf(i3))));
        }
        ioVar.c(spannableStringBuilder, true, true);
        this.f = false;
        io ioVar2 = this.c;
        if (z) {
            ioVar2.setText(jb6.M0(2131750346, str));
        } else if (z2) {
            ioVar2.setText(jb6.M0(2131750345, str));
            this.f = true;
        } else if (i3 > 1) {
            ioVar2.setText(jb6.M0(2131750341, str));
        } else {
            int i4 = ((hv4) this.e.get(0)).i;
            if (i4 == 1) {
                a0 = jb6.M0(2131750344, str);
            } else if (i4 == 2) {
                a0 = jb6.M0(2131750343, str);
            } else if (i4 == 3) {
                a0 = jb6.M0(2131750342, str);
            } else {
                int i5 = i4 % 100;
                if (i5 < 11 || i5 > 13) {
                    int i6 = i4 % 10;
                    if (i6 == 1) {
                        str2 = null;
                        a0 = jb6.a0(null, null, 2131750336, Integer.valueOf(i4));
                    } else if (i6 == 2) {
                        str2 = null;
                        a0 = jb6.a0(null, null, 2131750339, Integer.valueOf(i4));
                    } else if (i6 != 3) {
                        str2 = null;
                        a0 = jb6.a0(null, null, 2131750335, Integer.valueOf(i4));
                    } else {
                        str2 = null;
                        a0 = jb6.a0(null, null, 2131750337, Integer.valueOf(i4));
                    }
                } else {
                    str2 = null;
                    a0 = jb6.a0(null, null, 2131750335, Integer.valueOf(i4));
                }
                ioVar2.setText(jb6.a0(str2, str2, 2131750340, a0));
            }
            str2 = str;
            ioVar2.setText(jb6.a0(str2, str2, 2131750340, a0));
        }
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        lv4.c(i).f.add(this);
        c(lv4.c(i).c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lv4.c(this.a).f.remove(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        this.b.setTextColor(cmb.w0(null, cmb.F6, false));
        this.c.setTextColor(cmb.w0(null, this.f ? cmb.p7 : cmb.x6, false));
        invalidate();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
