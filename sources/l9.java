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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l9 extends FrameLayout implements it4, tjb {
    public final int a;
    public final hn b;
    public final hn c;
    public final k9 d;
    public ArrayList e;
    public boolean f;

    public l9(Activity activity, int i) {
        super(activity);
        this.e = new ArrayList();
        this.a = i;
        LinearLayout m = ir2.m(activity, 1);
        hn hnVar = new hn(activity, false, false, false);
        this.b = hnVar;
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setTypeface(gl.o());
        hnVar.setTranslationY(-gl.L(1.0f));
        m.addView(hnVar, nme.o(-1, 18));
        hn hnVar2 = new hn(activity, false, false, false);
        this.c = hnVar2;
        hnVar2.setTextSize(gl.L(13.0f));
        m.addView(hnVar2, nme.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        k9 k9Var = new k9(activity, i);
        this.d = k9Var;
        k9Var.b(299L);
        addView(m, nme.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(k9Var, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable L0 = bkb.L0(false);
        vkb M = zkb.M(bkb.h6);
        setBackground(L0);
        zkb.j(this, L0, null, M, null);
        updateColors();
        setOnClickListener(new j1(this, (byte) 4));
    }

    @Override // it4
    public final void c(ArrayList arrayList) {
        hn hnVar;
        String str;
        String str2;
        String a0;
        String a02;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.e = arrayList2;
        int size = arrayList2.size();
        k9 k9Var = this.d;
        if (size == 1) {
            gt4 gt4Var = (gt4) this.e.get(0);
            gt4Var.getClass();
            if (gt4Var.g(ConnectionsManager.getInstance(y6c.t0).getCurrentTime())) {
                k9Var.a(gt4Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = gt4Var.f;
                k9Var.a(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            k9Var.f = 0;
            k9Var.c.b();
            k9Var.a.t(k96.M0(2131750320, null), true, true);
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
            hnVar = this.b;
            if (i >= size2) {
                break;
            }
            gt4 gt4Var2 = (gt4) this.e.get(i);
            boolean g = gt4Var2.g(currentTime);
            int i2 = size2;
            long j = gt4Var2.c;
            z |= g;
            if (j != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new gm(j, hnVar.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = gt4Var2.d();
            z2 |= d == 2 || d == 3;
            i++;
            size2 = i2;
        }
        int i3 = size2;
        spannableStringBuilder.append(' ');
        if (z) {
            if (i3 == 1) {
                str = null;
                a02 = k96.M0(2131750385, null);
            } else {
                str = null;
                a02 = k96.a0(null, null, 2131750384, Integer.valueOf(i3));
            }
            spannableStringBuilder.append((CharSequence) a02);
        } else {
            str = null;
            spannableStringBuilder.append((CharSequence) (i3 == 1 ? k96.M0(2131750403, null) : k96.a0(null, null, 2131750402, Integer.valueOf(i3))));
        }
        hnVar.c(spannableStringBuilder, true, true);
        this.f = false;
        hn hnVar2 = this.c;
        if (z) {
            hnVar2.setText(k96.M0(2131750397, str));
        } else if (z2) {
            hnVar2.setText(k96.M0(2131750396, str));
            this.f = true;
        } else if (i3 > 1) {
            hnVar2.setText(k96.M0(2131750392, str));
        } else {
            int i4 = ((gt4) this.e.get(0)).i;
            if (i4 == 1) {
                a0 = k96.M0(2131750395, str);
            } else if (i4 == 2) {
                a0 = k96.M0(2131750394, str);
            } else if (i4 == 3) {
                a0 = k96.M0(2131750393, str);
            } else {
                int i5 = i4 % 100;
                if (i5 < 11 || i5 > 13) {
                    int i6 = i4 % 10;
                    if (i6 == 1) {
                        str2 = null;
                        a0 = k96.a0(null, null, 2131750387, Integer.valueOf(i4));
                    } else if (i6 == 2) {
                        str2 = null;
                        a0 = k96.a0(null, null, 2131750390, Integer.valueOf(i4));
                    } else if (i6 != 3) {
                        str2 = null;
                        a0 = k96.a0(null, null, 2131750386, Integer.valueOf(i4));
                    } else {
                        str2 = null;
                        a0 = k96.a0(null, null, 2131750388, Integer.valueOf(i4));
                    }
                } else {
                    str2 = null;
                    a0 = k96.a0(null, null, 2131750386, Integer.valueOf(i4));
                }
                hnVar2.setText(k96.a0(str2, str2, 2131750391, a0));
            }
            str2 = str;
            hnVar2.setText(k96.a0(str2, str2, 2131750391, a0));
        }
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        kt4.c(i).f.add(this);
        c(kt4.c(i).c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kt4.c(this.a).f.remove(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        this.b.setTextColor(bkb.w0(null, bkb.F6, false));
        this.c.setTextColor(bkb.w0(null, this.f ? bkb.p7 : bkb.x6, false));
        invalidate();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
