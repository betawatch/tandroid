// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jd5 extends q59 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public fd5 f;
    public String h;
    public int n;
    public final /* synthetic */ kd5 r;

    public jd5(kd5 kd5Var, Context context) {
        this.r = kd5Var;
        this.c = context;
        C(true);
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return d(u69Var.b()) == 0;
    }

    public final void E(String str) {
        kd5 kd5Var = this.r;
        if (kd5Var.O) {
            boolean isEmpty = TextUtils.isEmpty(str);
            r59 r59Var = kd5Var.d;
            if (isEmpty) {
                r59Var.setBackground(null);
            } else {
                anb.h(cmb.c6, kd5Var.getResourceProvider(), r59Var);
            }
        }
        if (this.n != 0) {
            kd5Var.getConnectionsManager().cancelRequest(this.n, true);
            this.n = 0;
        }
        fd5 fd5Var = this.f;
        if (fd5Var != null) {
            gm.r(fd5Var);
            this.f = null;
        }
        this.h = null;
        int b = b();
        if (b > 0) {
            this.d.clear();
            this.e.clear();
            q(0, b);
        }
        boolean isEmpty2 = TextUtils.isEmpty(str);
        a1b a1bVar = kd5Var.b;
        if (isEmpty2) {
            a1bVar.setVisibility(8);
            kd5Var.b.e(false, true);
            return;
        }
        int visibility = a1bVar.getVisibility();
        a1b a1bVar2 = kd5Var.b;
        if (visibility != 0) {
            a1bVar2.setVisibility(0);
            kd5Var.b.e(true, false);
        } else {
            a1bVar2.e(true, true);
        }
        fd5 fd5Var2 = new fd5(this, str, (byte) 2);
        this.f = fd5Var2;
        gm.d3(fd5Var2, 300L);
    }

    @Override // y59
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // y59
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

    @Override // y59
    public final int d(int i) {
        return this.d.size() == i ? 1 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
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
        s1b s1bVar = (s1b) u69Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i);
        s1bVar.d(tL_messages_stickerSet, i != arrayList.size() - 1, !z);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        kd5 kd5Var = this.r;
        ylb resourceProvider = kd5Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new do4(cmb.p6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            s1bVar.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            SpannableString spannableString2 = new SpannableString(str3 + stickerSet.short_name);
            spannableString2.setSpan(new do4(cmb.p6, resourceProvider), length, lowerCase.length() + length, 0);
            s1bVar.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = kd5Var.r;
        s1bVar.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : kd5Var.d0(kd5Var.w) != null ? kd5Var.d0(kd5Var.w).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        s1b s1bVar;
        if (i != 0) {
            int i2 = cmb.A6;
            kd5 kd5Var = this.r;
            jf5 jf5Var = new jf5(this.c, i2, 21, 0, 0, false, false, kd5Var.getResourceProvider());
            jf5Var.setText(jb6.M0(kd5Var.O ? 2131752056 : 2131752055, null));
            s1bVar = jf5Var;
        } else {
            s1b s1bVar2 = new s1b(this.c, 3);
            anb.h(cmb.c6, null, s1bVar2);
            s1bVar = s1bVar2;
        }
        s1bVar.setLayoutParams(new g69(-1, -2));
        return new b59(s1bVar);
    }
}
