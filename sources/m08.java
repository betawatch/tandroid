// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m08 extends n39 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ t08 e;

    /* JADX WARN: Multi-variable type inference failed */
    public m08(t08 t08Var, Context context, int i) {
        this.e = t08Var;
        this.c = context;
        this.d = i;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 3 || i == 6 || i == 8 || i == 12;
    }

    @Override // w39
    public final int b() {
        return this.e.l0;
    }

    @Override // w39
    public final int d(int i) {
        t08 t08Var = this.e;
        if (i == t08Var.S || i == t08Var.h0 || i == t08Var.U || i == t08Var.a0) {
            return 2;
        }
        if (i == t08Var.R) {
            return 1;
        }
        if (i == t08Var.T) {
            return 3;
        }
        if (i == t08Var.V) {
            return 5;
        }
        if (i == t08Var.W) {
            return 6;
        }
        if (i == t08Var.i0) {
            return 10;
        }
        if (i == t08Var.j0) {
            return 11;
        }
        if (i == t08Var.b0) {
            return 7;
        }
        if (i >= t08Var.c0 && i < t08Var.d0) {
            return t08Var.L == null ? 8 : 12;
        }
        if (i < t08Var.e0 || i >= t08Var.f0) {
            return (i == t08Var.l0 - 1 || i == t08Var.k0) ? 4 : 2;
        }
        return 9;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        String M0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = s49Var.a;
        t08 t08Var = this.e;
        HashMap hashMap = t08Var.N;
        ArrayList arrayList = t08Var.m0;
        a18 a18Var = t08Var.q0;
        ArrayList arrayList2 = t08Var.M;
        int d = d(i);
        boolean z = this.d;
        int i3 = 1;
        r11 = true;
        boolean z2 = true;
        byte b = 0;
        switch (d) {
            case 1:
                zkb.h(bkb.c6, a18Var.getResourceProvider(), view);
                ((w08) view).updateColors();
                break;
            case 2:
                mhb mhbVar = (mhb) view;
                mhbVar.setFixedSize(0);
                if (i != t08Var.S) {
                    if (i != t08Var.a0) {
                        if (i == t08Var.h0) {
                            mhbVar.setText(k96.M0(2131743501, null));
                            break;
                        }
                    } else {
                        mhbVar.setText("");
                        mhbVar.setFixedSize(12);
                        break;
                    }
                } else {
                    if (z) {
                        M0 = k96.M0(a18Var.a ? 2131752422 : 2131743513, null);
                    } else {
                        M0 = k96.M0(a18Var.a ? 2131752310 : 2131743495, null);
                    }
                    mhbVar.setText(gl.D2(gl.N2(M0, -1, 0, new k08(this, z ? 1 : 0), null), true));
                    break;
                }
                break;
            case 3:
                ((s08) view).updateColors();
                break;
            case 6:
                wgb wgbVar = (wgb) view;
                wgbVar.updateColors();
                zkb.h(bkb.c6, a18Var.getResourceProvider(), wgbVar);
                wgbVar.updateColors();
                if (i == t08Var.W) {
                    wgbVar.k(k96.M0(a18Var.a ? 2131752312 : 2131743498, null), false);
                    break;
                }
                break;
            case 7:
                ld5 ld5Var = (ld5) view;
                if (i == t08Var.b0) {
                    ld5Var.c(k96.M0(2131743502, null), false);
                }
                zkb.h(bkb.c6, a18Var.getResourceProvider(), ld5Var);
                break;
            case 8:
                g08 g08Var = (g08) view;
                int i4 = i - t08Var.c0;
                if (i4 >= 0 && i4 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i4);
                    g08Var.a(i4, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = t08Var.r;
                    g08Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = t08Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    g08Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                t08Var.G = view;
                z08 z08Var = t08Var.F;
                arrayList2.clear();
                hashMap.clear();
                i2 = ((d) a18Var).currentAccount;
                ArrayList arrayList3 = gta.v(i2, false).I;
                arrayList2.add(k96.M0(2131749930, null));
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i5);
                    if ((!z || (z == i3 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (t08Var.L == starGift) {
                            i6 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i3);
                        textPaint.setTextSize(gl.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        gm gmVar = new gm(starGift.getDocument(), textPaint.getFontMetricsInt());
                        gmVar.size = gl.L(14.0f);
                        spannableStringBuilder.setSpan(gmVar, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i5++;
                    i3 = 1;
                }
                l08 l08Var = new l08(this, b);
                ArrayList arrayList4 = z08Var.f;
                boolean z3 = z08Var.L == 0;
                z08Var.L = 0;
                z08Var.h = l08Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                z08Var.c.f();
                z08Var.a(i6, z3);
                t08Var.l(z08Var);
                view.post(new i08(t08Var, (byte) 3));
                break;
            case 11:
                ((r08) view).updateColors();
                break;
            case 12:
                nv4 nv4Var = (nv4) view;
                int i7 = i - t08Var.c0;
                if (t08Var.K != null && i7 >= 0 && i7 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i7);
                    nv4Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = t08Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = t08Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z2 = false;
                    }
                    nv4Var.f(z2, false);
                    break;
                }
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2;
        wjb wjbVar;
        View view;
        wjb wjbVar2;
        wjb wjbVar3;
        wjb wjbVar4;
        int i3;
        wjb wjbVar5;
        t08 t08Var = this.e;
        a18 a18Var = t08Var.q0;
        byte b = 1;
        switch (i) {
            case 1:
                Context context = t08Var.getContext();
                i2 = ((d) a18Var).currentAccount;
                wjbVar = ((d) a18Var).resourceProvider;
                w08 w08Var = new w08(this.d ? 1 : 0, i2, wjbVar, context);
                t08Var.f = w08Var;
                zkb.h(bkb.c6, a18Var.getResourceProvider(), w08Var);
                w08Var.a(t08Var.h, false);
                w08Var.setOnColorClick(new l08(this, b));
                view = w08Var;
                break;
            case 2:
            default:
                view = new mhb(t08Var.getContext(), a18Var.getResourceProvider());
                break;
            case 3:
                s08 s08Var = new s08(t08Var, t08Var.getContext());
                t08Var.E = s08Var;
                s08Var.b(false);
                view = s08Var;
                break;
            case 4:
                View d62Var = new d62(t08Var.getContext(), (byte) 18);
                d62Var.setTag(-33024);
                view = d62Var;
                break;
            case 5:
                View view2 = new View(t08Var.getContext());
                view2.setTag(-33024);
                view = view2;
                break;
            case 6:
                View wgbVar = new wgb(t08Var.getContext(), a18Var.getResourceProvider());
                zkb.h(bkb.c6, a18Var.getResourceProvider(), wgbVar);
                view = wgbVar;
                break;
            case 7:
                Context context2 = t08Var.getContext();
                wjbVar2 = ((d) a18Var).resourceProvider;
                View ld5Var = new ld5(context2, wjbVar2);
                zkb.h(bkb.c6, a18Var.getResourceProvider(), ld5Var);
                view = ld5Var;
                break;
            case 8:
                Context context3 = t08Var.getContext();
                wjbVar3 = ((d) a18Var).resourceProvider;
                View g08Var = new g08(wjbVar3, context3, false);
                g08Var.setTag(-33024);
                view = g08Var;
                break;
            case 9:
                Context context4 = this.c;
                wjbVar4 = ((d) a18Var).resourceProvider;
                pi4 pi4Var = new pi4(context4, wjbVar4);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(35);
                pi4Var.setTag(-33024);
                view = pi4Var;
                break;
            case 10:
                View d62Var2 = new d62(t08Var.getContext(), (byte) 19);
                d62Var2.setTag(-33024);
                view = d62Var2;
                break;
            case 11:
                view = new r08(t08Var, t08Var.getContext());
                break;
            case 12:
                Context context5 = t08Var.getContext();
                i3 = ((d) a18Var).currentAccount;
                wjbVar5 = ((d) a18Var).resourceProvider;
                View nv4Var = new nv4(i3, wjbVar5, context5);
                nv4Var.setTag(-33024);
                view = nv4Var;
                break;
        }
        return new y29(view);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        t08 t08Var = this.e;
        ArrayList arrayList = t08Var.m0;
        int i = s49Var.f;
        View view = s49Var.a;
        if (i == 10) {
            t08Var.G = view;
            view.post(new i08(t08Var, (byte) 2));
            return;
        }
        boolean z = true;
        if (i == 8) {
            g08 g08Var = (g08) view;
            int b = s49Var.b() - t08Var.c0;
            if (b < 0 || b >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b);
            g08Var.a(b, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = t08Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = t08Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z = false;
            }
            g08Var.b(z, false);
            return;
        }
        if (i == 12) {
            nv4 nv4Var = (nv4) view;
            int b2 = s49Var.b() - t08Var.c0;
            if (t08Var.K == null || b2 < 0 || b2 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b2);
            nv4Var.h(tL_starGiftUnique2, false, false, false, true, false);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = t08Var.r;
            if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = t08Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                z = false;
            }
            nv4Var.f(z, false);
        }
    }
}
