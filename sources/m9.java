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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m9 extends FrameLayout implements mv4, snb {
    public final int a;
    public final in b;
    public final in c;
    public final l9 d;
    public ArrayList e;
    public boolean f;

    public m9(Activity activity, int i) {
        super(activity);
        this.e = new ArrayList();
        this.a = i;
        LinearLayout m = bs2.m(activity, 1);
        in inVar = new in(activity, false, false, false);
        this.b = inVar;
        inVar.setTextSize(hl.L(14.0f));
        inVar.setTypeface(hl.o());
        inVar.setTranslationY(-hl.L(1.0f));
        m.addView(inVar, tre.o(-1, 18));
        in inVar2 = new in(activity, false, false, false);
        this.c = inVar2;
        inVar2.setTextSize(hl.L(13.0f));
        m.addView(inVar2, tre.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l9 l9Var = new l9(activity, i);
        this.d = l9Var;
        l9Var.b(299L);
        addView(m, tre.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(l9Var, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable L0 = aob.L0(false);
        uob M = yob.M(aob.i6);
        setBackground(L0);
        yob.j(this, L0, null, M, null);
        updateColors();
        setOnClickListener(new k1(this, (byte) 4));
    }

    @Override // mv4
    public final void c(ArrayList arrayList) {
        in inVar;
        String str;
        String str2;
        String a0;
        String a02;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.e = arrayList2;
        int size = arrayList2.size();
        l9 l9Var = this.d;
        if (size == 1) {
            kv4 kv4Var = (kv4) this.e.get(0);
            kv4Var.getClass();
            if (kv4Var.g(ConnectionsManager.getInstance(yac.t0).getCurrentTime())) {
                l9Var.a(kv4Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = kv4Var.f;
                l9Var.a(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            l9Var.f = 0;
            l9Var.c.b();
            l9Var.a.t(ob6.M0(2131750297, null), true, true);
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
            inVar = this.b;
            if (i >= size2) {
                break;
            }
            kv4 kv4Var2 = (kv4) this.e.get(i);
            boolean g = kv4Var2.g(currentTime);
            int i2 = size2;
            long j = kv4Var2.c;
            z |= g;
            if (j != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new hm(j, inVar.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = kv4Var2.d();
            z2 |= d == 2 || d == 3;
            i++;
            size2 = i2;
        }
        int i3 = size2;
        spannableStringBuilder.append(' ');
        if (z) {
            if (i3 == 1) {
                str = null;
                a02 = ob6.M0(2131750362, null);
            } else {
                str = null;
                a02 = ob6.a0(null, null, 2131750361, Integer.valueOf(i3));
            }
            spannableStringBuilder.append((CharSequence) a02);
        } else {
            str = null;
            spannableStringBuilder.append((CharSequence) (i3 == 1 ? ob6.M0(2131750380, null) : ob6.a0(null, null, 2131750379, Integer.valueOf(i3))));
        }
        inVar.c(spannableStringBuilder, true, true);
        this.f = false;
        in inVar2 = this.c;
        if (z) {
            inVar2.setText(ob6.M0(2131750374, str));
        } else if (z2) {
            inVar2.setText(ob6.M0(2131750373, str));
            this.f = true;
        } else if (i3 > 1) {
            inVar2.setText(ob6.M0(2131750369, str));
        } else {
            int i4 = ((kv4) this.e.get(0)).i;
            if (i4 == 1) {
                a0 = ob6.M0(2131750372, str);
            } else if (i4 == 2) {
                a0 = ob6.M0(2131750371, str);
            } else if (i4 == 3) {
                a0 = ob6.M0(2131750370, str);
            } else {
                int i5 = i4 % 100;
                if (i5 < 11 || i5 > 13) {
                    int i6 = i4 % 10;
                    if (i6 == 1) {
                        str2 = null;
                        a0 = ob6.a0(null, null, 2131750364, Integer.valueOf(i4));
                    } else if (i6 == 2) {
                        str2 = null;
                        a0 = ob6.a0(null, null, 2131750367, Integer.valueOf(i4));
                    } else if (i6 != 3) {
                        str2 = null;
                        a0 = ob6.a0(null, null, 2131750363, Integer.valueOf(i4));
                    } else {
                        str2 = null;
                        a0 = ob6.a0(null, null, 2131750365, Integer.valueOf(i4));
                    }
                } else {
                    str2 = null;
                    a0 = ob6.a0(null, null, 2131750363, Integer.valueOf(i4));
                }
                inVar2.setText(ob6.a0(str2, str2, 2131750368, a0));
            }
            str2 = str;
            inVar2.setText(ob6.a0(str2, str2, 2131750368, a0));
        }
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        ov4.c(i).f.add(this);
        c(ov4.c(i).c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ov4.c(this.a).f.remove(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        this.b.setTextColor(aob.w0(null, aob.G6, false));
        this.c.setTextColor(aob.w0(null, this.f ? aob.q7 : aob.y6, false));
        invalidate();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
