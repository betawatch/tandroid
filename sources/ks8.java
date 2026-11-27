// default package

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ks8 {
    public final int a;
    public boolean b;
    public ms8 c;
    public final boolean[] g;
    public boolean i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList j = new ArrayList();

    public ks8(int i, int i2) {
        boolean[] zArr = new boolean[2];
        this.g = zArr;
        this.a = i2;
        byte b = 3;
        if (i2 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String valueOf = String.valueOf(i2);
            for (int i3 = 0; i3 < valueOf.length(); i3++) {
                int charAt = valueOf.charAt(i3) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = ns8.s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            ls6.d0(i).m0(tL_inputStickerSetShortName, 0, false, false, new w58(this, hashSet, arrayList, b));
        }
        String str = ns8.s[Utilities.b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        ls6.d0(i).m0(tL_inputStickerSetShortName2, 0, false, false, new v35(this, str, (byte) 22));
    }

    public static ks8 c(int i, TLRPC.UserFull userFull, ks8 ks8Var) {
        TL_account.TL_birthday tL_birthday;
        if (!i86.e(2) || !pj0.d(userFull)) {
            if (ks8Var == null) {
                return null;
            }
            ks8Var.b(false);
            return null;
        }
        int years = (userFull == null || (tL_birthday = userFull.birthday) == null || (tL_birthday.flags & 1) == 0) ? 0 : Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
        if (ks8Var != null) {
            if (ks8Var.a == years) {
                return ks8Var;
            }
            ks8Var.b(false);
        }
        return new ks8(i, years);
    }

    public final void a() {
        if (this.b || this.f.size() < this.e.size()) {
            return;
        }
        boolean[] zArr = this.g;
        int i = 0;
        if (zArr[0] && zArr[1]) {
            this.b = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }
    }

    public final void b(boolean z) {
        if (!z && !this.j.isEmpty()) {
            this.i = true;
            return;
        }
        this.h.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((ms8) arrayList.get(i)).K();
                i++;
            }
        }
    }
}
