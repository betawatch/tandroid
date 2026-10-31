package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class kp {
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int a = 0;
    public final int[] g = new int[6];
    public final int[] h = new int[6];

    public static kp a(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return null;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        kp kpVar = new kp();
        kpVar.c = -1;
        kpVar.d = true;
        int i10 = tL_emojiStatusCollectible.edge_color;
        int[] iArr = kpVar.g;
        iArr[0] = i10 | (-16777216);
        int i11 = tL_emojiStatusCollectible.center_color;
        iArr[1] = i11 | (-16777216);
        iArr[2] = i10 | (-16777216);
        iArr[3] = i11 | (-16777216);
        int i12 = tL_emojiStatusCollectible.text_color;
        iArr[4] = i12 | (-16777216);
        iArr[5] = i12 | (-16777216);
        System.arraycopy(iArr, 0, kpVar.h, 0, 6);
        kpVar.a = tL_emojiStatusCollectible.pattern_color | (-16777216);
        return kpVar;
    }

    public static kp b(TLRPC.TL_help_peerColorOption tL_help_peerColorOption) {
        if (tL_help_peerColorOption == null) {
            return null;
        }
        kp kpVar = new kp();
        kpVar.c = tL_help_peerColorOption.color_id;
        kpVar.d = tL_help_peerColorOption.hidden;
        int i10 = tL_help_peerColorOption.flags;
        if ((i10 & 8) != 0) {
            kpVar.e = tL_help_peerColorOption.channel_min_level;
        }
        if ((i10 & 16) != 0) {
            kpVar.f = tL_help_peerColorOption.group_min_level;
        }
        System.arraycopy(p(tL_help_peerColorOption.colors), 0, kpVar.g, 0, 6);
        System.arraycopy(p(tL_help_peerColorOption.dark_colors), 0, kpVar.h, 0, 6);
        return kpVar;
    }

    public static int[] p(TLRPC.help_PeerColorSet help_peercolorset) {
        ArrayList<Integer> arrayList;
        int[] iArr = new int[6];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        if (help_peercolorset instanceof TLRPC.TL_help_peerColorSet) {
            arrayList = ((TLRPC.TL_help_peerColorSet) help_peercolorset).colors;
        } else if (help_peercolorset instanceof TLRPC.TL_help_peerColorProfileSet) {
            TLRPC.TL_help_peerColorProfileSet tL_help_peerColorProfileSet = (TLRPC.TL_help_peerColorProfileSet) help_peercolorset;
            ArrayList<Integer> arrayList2 = tL_help_peerColorProfileSet.palette_colors;
            ArrayList<Integer> arrayList3 = tL_help_peerColorProfileSet.bg_colors;
            ArrayList<Integer> arrayList4 = tL_help_peerColorProfileSet.story_colors;
            ArrayList<Integer> arrayList5 = new ArrayList<>();
            if (arrayList2 != null) {
                for (int i10 = 0; i10 < Math.min(2, arrayList2.size()); i10++) {
                    arrayList5.add(arrayList2.get(i10));
                }
            }
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < Math.min(2, arrayList3.size()); i11++) {
                    arrayList5.add(arrayList3.get(i11));
                }
            }
            if (arrayList4 != null) {
                for (int i12 = 0; i12 < Math.min(2, arrayList4.size()); i12++) {
                    arrayList5.add(arrayList4.get(i12));
                }
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                Arrays.fill(iArr, arrayList.get(0).intValue() | (-16777216));
            }
            for (int i13 = 0; i13 < Math.min(6, arrayList.size()); i13++) {
                iArr[i13] = arrayList.get(i13).intValue() | (-16777216);
            }
        }
        return iArr;
    }

    public final int c(boolean z10) {
        return o(z10) ? j(z10) : h(z10);
    }

    public final int d(boolean z10) {
        if (o(z10)) {
            return (z10 ? this.h : this.g)[3];
        }
        return h(z10);
    }

    public final int e(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        if (i10 < 0 || i10 > 5) {
            return 0;
        }
        if (!this.b || (i11 = this.c) < 0 || i11 >= 7) {
            return (p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q() ? this.h : this.g)[i10];
        }
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.r8[i11], p6Var);
    }

    public final int f() {
        return (org.telegram.ui.ActionBar.t6.I.q() ? this.h : this.g)[0];
    }

    public final int g() {
        return (org.telegram.ui.ActionBar.t6.I.q() ? this.h : this.g)[1];
    }

    public final int h(boolean z10) {
        return (z10 ? this.h : this.g)[1];
    }

    public final int i() {
        return (org.telegram.ui.ActionBar.t6.I.q() ? this.h : this.g)[2];
    }

    public final int j(boolean z10) {
        return (z10 ? this.h : this.g)[2];
    }

    public final int k() {
        return (org.telegram.ui.ActionBar.t6.I.q() ? this.h : this.g)[4];
    }

    public final int l(boolean z10) {
        return z10 ? this.f : this.e;
    }

    public final int m(boolean z10) {
        if (o(z10)) {
            return (z10 ? this.h : this.g)[4];
        }
        return j(z10);
    }

    public final int n(boolean z10) {
        boolean o10 = o(z10);
        int[] iArr = this.g;
        int[] iArr2 = this.h;
        if (o10) {
            if (z10) {
                iArr = iArr2;
            }
            return iArr[5];
        }
        if (z10) {
            iArr = iArr2;
        }
        return iArr[3];
    }

    public final boolean o(boolean z10) {
        int[] iArr = this.g;
        int[] iArr2 = this.h;
        int i10 = (z10 ? iArr2 : iArr)[5];
        if (z10) {
            iArr = iArr2;
        }
        return i10 != iArr[0];
    }
}
