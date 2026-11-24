// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lb5 extends n39 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public hb5 f;
    public String h;
    public int n;
    public final /* synthetic */ mb5 r;

    public lb5(mb5 mb5Var, Context context) {
        this.r = mb5Var;
        this.c = context;
        C(true);
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return d(s49Var.b()) == 0;
    }

    public final void E(String str) {
        mb5 mb5Var = this.r;
        if (mb5Var.O) {
            boolean isEmpty = TextUtils.isEmpty(str);
            o39 o39Var = mb5Var.d;
            if (isEmpty) {
                o39Var.setBackground(null);
            } else {
                zkb.h(bkb.c6, mb5Var.getResourceProvider(), o39Var);
            }
        }
        byte b = 1;
        if (this.n != 0) {
            mb5Var.getConnectionsManager().cancelRequest(this.n, true);
            this.n = 0;
        }
        hb5 hb5Var = this.f;
        if (hb5Var != null) {
            gl.r(hb5Var);
            this.f = null;
        }
        this.h = null;
        int b2 = b();
        if (b2 > 0) {
            this.d.clear();
            this.e.clear();
            q(0, b2);
        }
        boolean isEmpty2 = TextUtils.isEmpty(str);
        zya zyaVar = mb5Var.b;
        if (isEmpty2) {
            zyaVar.setVisibility(8);
            mb5Var.b.e(false, true);
            return;
        }
        int visibility = zyaVar.getVisibility();
        zya zyaVar2 = mb5Var.b;
        if (visibility != 0) {
            zyaVar2.setVisibility(0);
            mb5Var.b.e(true, false);
        } else {
            zyaVar2.e(true, true);
        }
        hb5 hb5Var2 = new hb5(this, str, b);
        this.f = hb5Var2;
        gl.d3(hb5Var2, 300L);
    }

    @Override // w39
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // w39
    public final long c(int i) {
        if (d(i) != 0) {
            return -1L;
        }
        ArrayList arrayList = i > this.d.size() ? this.e : this.d;
        if (i > this.d.size()) {
            i = (i - this.d.size()) - 1;
        }
        return ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).set.id;
    }

    @Override // w39
    public final int d(int i) {
        return this.d.size() == i ? 1 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        ArrayList arrayList;
        if (d(i) != 0) {
            return;
        }
        boolean z = i > this.d.size();
        if (z) {
            arrayList = this.e;
            i = (i - this.d.size()) - 1;
        } else {
            arrayList = this.d;
        }
        rza rzaVar = (rza) s49Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i);
        rzaVar.d(tL_messages_stickerSet, i != arrayList.size() - 1, !z);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        mb5 mb5Var = this.r;
        wjb resourceProvider = mb5Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new cm4(bkb.p6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            rzaVar.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            SpannableString spannableString2 = new SpannableString(str3 + stickerSet.short_name);
            spannableString2.setSpan(new cm4(bkb.p6, resourceProvider), length, lowerCase.length() + length, 0);
            rzaVar.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = mb5Var.r;
        rzaVar.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : mb5Var.c0(mb5Var.w) != null ? mb5Var.c0(mb5Var.w).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        rza rzaVar;
        if (i != 0) {
            int i2 = bkb.A6;
            mb5 mb5Var = this.r;
            ld5 ld5Var = new ld5(this.c, i2, 21, 0, 0, false, false, mb5Var.getResourceProvider());
            ld5Var.setText(k96.M0(mb5Var.O ? 2131752107 : 2131752106, null));
            rzaVar = ld5Var;
        } else {
            rza rzaVar2 = new rza(this.c, 3);
            zkb.h(bkb.c6, null, rzaVar2);
            rzaVar = rzaVar2;
        }
        rzaVar.setLayoutParams(new e49(-1, -2));
        return new y29(rzaVar);
    }
}
