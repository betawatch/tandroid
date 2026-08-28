package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j01 {
    public final int a;
    public boolean b;
    public l01 c;
    public final boolean[] g;
    public boolean i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList j = new ArrayList();

    public j01(int i9, int i10) {
        boolean[] zArr = new boolean[2];
        this.g = zArr;
        this.a = i10;
        int i11 = 9;
        if (i10 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String l10 = j3.r0.l(i10, "");
            for (int i12 = 0; i12 < l10.length(); i12++) {
                int charAt = l10.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = m01.s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i9).getStickerSet(tL_inputStickerSetShortName, 0, false, new a0(this, hashSet, arrayList, 7));
        }
        String str = m01.s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i9).getStickerSet(tL_inputStickerSetShortName2, 0, false, new eb0(i11, this, str));
    }

    public static j01 c(int i9, TLRPC.UserFull userFull, j01 j01Var) {
        TL_account.TL_birthday tL_birthday;
        if (!LiteMode.isEnabled(2) || !BirthdayController.isToday(userFull)) {
            if (j01Var == null) {
                return null;
            }
            j01Var.b(false);
            return null;
        }
        int years = (userFull == null || (tL_birthday = userFull.birthday) == null || (tL_birthday.flags & 1) == 0) ? 0 : Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
        if (j01Var != null) {
            if (j01Var.a == years) {
                return j01Var;
            }
            j01Var.b(false);
        }
        return new j01(i9, years);
    }

    public final void a() {
        if (this.b || this.f.size() < this.e.size()) {
            return;
        }
        boolean[] zArr = this.g;
        int i9 = 0;
        if (zArr[0] && zArr[1]) {
            this.b = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
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
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i9 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((l01) arrayList.get(i9)).onDetachedFromWindow();
                i9++;
            }
        }
    }
}
