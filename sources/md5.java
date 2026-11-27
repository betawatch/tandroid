// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class md5 extends c79 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public se4 f;
    public String h;
    public int n;
    public final /* synthetic */ nd5 r;

    public md5(nd5 nd5Var, Context context) {
        this.r = nd5Var;
        this.c = context;
        C(true);
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return d(f89Var.b()) == 0;
    }

    public final void E(String str) {
        nd5 nd5Var = this.r;
        if (nd5Var.O) {
            boolean isEmpty = TextUtils.isEmpty(str);
            d79 d79Var = nd5Var.d;
            if (isEmpty) {
                d79Var.setBackground(null);
            } else {
                yob.h(aob.d6, nd5Var.getResourceProvider(), d79Var);
            }
        }
        if (this.n != 0) {
            nd5Var.getConnectionsManager().cancelRequest(this.n, true);
            this.n = 0;
        }
        se4 se4Var = this.f;
        if (se4Var != null) {
            hl.r(se4Var);
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
        z2b z2bVar = nd5Var.b;
        if (isEmpty2) {
            z2bVar.setVisibility(8);
            nd5Var.b.e(false, true);
            return;
        }
        int visibility = z2bVar.getVisibility();
        z2b z2bVar2 = nd5Var.b;
        if (visibility != 0) {
            z2bVar2.setVisibility(0);
            nd5Var.b.e(true, false);
        } else {
            z2bVar2.e(true, true);
        }
        se4 se4Var2 = new se4(this, str, (byte) 28);
        this.f = se4Var2;
        hl.d3(se4Var2, 300L);
    }

    @Override // j79
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // j79
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

    @Override // j79
    public final int d(int i) {
        return this.d.size() == i ? 1 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
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
        p3b p3bVar = (p3b) f89Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i);
        p3bVar.d(tL_messages_stickerSet, i != arrayList.size() - 1, !z);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        nd5 nd5Var = this.r;
        vnb resourceProvider = nd5Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new ho4(aob.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            p3bVar.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            SpannableString spannableString2 = new SpannableString(str3 + stickerSet.short_name);
            spannableString2.setSpan(new ho4(aob.q6, resourceProvider), length, lowerCase.length() + length, 0);
            p3bVar.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nd5Var.r;
        p3bVar.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : nd5Var.c0(nd5Var.w) != null ? nd5Var.c0(nd5Var.w).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        p3b p3bVar;
        if (i != 0) {
            int i2 = aob.B6;
            nd5 nd5Var = this.r;
            mf5 mf5Var = new mf5(this.c, i2, 21, 0, 0, false, false, nd5Var.getResourceProvider());
            mf5Var.setText(ob6.M0(nd5Var.O ? 2131752084 : 2131752083, null));
            p3bVar = mf5Var;
        } else {
            p3b p3bVar2 = new p3b(this.c, 3);
            yob.h(aob.d6, null, p3bVar2);
            p3bVar = p3bVar2;
        }
        p3bVar.setLayoutParams(new r79(-1, -2));
        return new n69(p3bVar);
    }
}
