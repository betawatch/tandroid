package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pw0 {
    public final int a;
    public boolean b;
    public rw0 c;
    public final boolean[] g;
    public boolean i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList j = new ArrayList();

    public pw0(int i3, int i10) {
        boolean[] zArr = new boolean[2];
        this.g = zArr;
        this.a = i10;
        if (i10 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String i11 = k2.p1.i(i10, "");
            for (int i12 = 0; i12 < i11.length(); i12++) {
                int charAt = i11.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = sw0.s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            org.telegram.messenger.li.b0(i3).l0(tL_inputStickerSetShortName, 0, false, false, new z(this, hashSet, arrayList, 11));
        }
        String str = sw0.s[Utilities.b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        org.telegram.messenger.li.b0(i3).l0(tL_inputStickerSetShortName2, 0, false, false, new org.telegram.ui.Components.ei(25, this, str));
    }

    public static pw0 c(int i3, TLRPC.UserFull userFull, pw0 pw0Var) {
        TL_account.TL_birthday tL_birthday;
        if (!org.telegram.messenger.lc.e(2) || !org.telegram.messenger.v1.d(userFull)) {
            if (pw0Var == null) {
                return null;
            }
            pw0Var.b(false);
            return null;
        }
        int years = (userFull == null || (tL_birthday = userFull.birthday) == null || (tL_birthday.flags & 1) == 0) ? 0 : Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
        if (pw0Var != null) {
            if (pw0Var.a == years) {
                return pw0Var;
            }
            pw0Var.b(false);
        }
        return new pw0(i3, years);
    }

    public final void a() {
        if (this.b || this.f.size() < this.e.size()) {
            return;
        }
        boolean[] zArr = this.g;
        int i3 = 0;
        if (zArr[0] && zArr[1]) {
            this.b = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }
    }

    public final void b(boolean z10) {
        if (!z10 && !this.j.isEmpty()) {
            this.i = true;
            return;
        }
        this.h.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((rw0) arrayList.get(i3)).R();
                i3++;
            }
        }
    }
}
