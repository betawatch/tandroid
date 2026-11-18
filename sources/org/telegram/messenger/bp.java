package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class bp {
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int a = 0;
    public final int[] g = new int[6];
    public final int[] h = new int[6];

    public static bp a(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return null;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        bp bpVar = new bp();
        bpVar.c = -1;
        bpVar.d = true;
        int i7 = tL_emojiStatusCollectible.edge_color;
        int[] iArr = bpVar.g;
        iArr[0] = i7 | (-16777216);
        int i10 = tL_emojiStatusCollectible.center_color;
        iArr[1] = i10 | (-16777216);
        iArr[2] = i7 | (-16777216);
        iArr[3] = i10 | (-16777216);
        int i11 = tL_emojiStatusCollectible.text_color;
        iArr[4] = i11 | (-16777216);
        iArr[5] = i11 | (-16777216);
        System.arraycopy(iArr, 0, bpVar.h, 0, 6);
        bpVar.a = tL_emojiStatusCollectible.pattern_color | (-16777216);
        return bpVar;
    }

    public static bp b(TLRPC.TL_help_peerColorOption tL_help_peerColorOption) {
        if (tL_help_peerColorOption == null) {
            return null;
        }
        bp bpVar = new bp();
        bpVar.c = tL_help_peerColorOption.color_id;
        bpVar.d = tL_help_peerColorOption.hidden;
        int i7 = tL_help_peerColorOption.flags;
        if ((i7 & 8) != 0) {
            bpVar.e = tL_help_peerColorOption.channel_min_level;
        }
        if ((i7 & 16) != 0) {
            bpVar.f = tL_help_peerColorOption.group_min_level;
        }
        System.arraycopy(p(tL_help_peerColorOption.colors), 0, bpVar.g, 0, 6);
        System.arraycopy(p(tL_help_peerColorOption.dark_colors), 0, bpVar.h, 0, 6);
        return bpVar;
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
                for (int i7 = 0; i7 < Math.min(2, arrayList2.size()); i7++) {
                    arrayList5.add(arrayList2.get(i7));
                }
            }
            if (arrayList3 != null) {
                for (int i10 = 0; i10 < Math.min(2, arrayList3.size()); i10++) {
                    arrayList5.add(arrayList3.get(i10));
                }
            }
            if (arrayList4 != null) {
                for (int i11 = 0; i11 < Math.min(2, arrayList4.size()); i11++) {
                    arrayList5.add(arrayList4.get(i11));
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
            for (int i12 = 0; i12 < Math.min(6, arrayList.size()); i12++) {
                iArr[i12] = arrayList.get(i12).intValue() | (-16777216);
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

    public final int e(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        if (i7 < 0 || i7 > 5) {
            return 0;
        }
        if (!this.b || (i10 = this.c) < 0 || i10 >= 7) {
            return (i6Var != null ? i6Var.d() : org.telegram.ui.ActionBar.n6.I.q() ? this.h : this.g)[i7];
        }
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.r8[i10], i6Var);
    }

    public final int f() {
        return (org.telegram.ui.ActionBar.n6.I.q() ? this.h : this.g)[0];
    }

    public final int g() {
        return (org.telegram.ui.ActionBar.n6.I.q() ? this.h : this.g)[1];
    }

    public final int h(boolean z10) {
        return (z10 ? this.h : this.g)[1];
    }

    public final int i() {
        return (org.telegram.ui.ActionBar.n6.I.q() ? this.h : this.g)[2];
    }

    public final int j(boolean z10) {
        return (z10 ? this.h : this.g)[2];
    }

    public final int k() {
        return (org.telegram.ui.ActionBar.n6.I.q() ? this.h : this.g)[4];
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
        boolean o4 = o(z10);
        int[] iArr = this.g;
        int[] iArr2 = this.h;
        if (o4) {
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
        int i7 = (z10 ? iArr2 : iArr)[5];
        if (z10) {
            iArr = iArr2;
        }
        return i7 != iArr[0];
    }
}
