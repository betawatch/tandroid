package bi;

import android.util.SparseIntArray;
import c8.l9;
import di.o9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.on0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e5 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e5(int i7, oi.a2 a2Var, aa.c0 c0Var) {
        this.a = 3;
        this.b = i7;
        this.c = a2Var;
        this.d = c0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.c;
                int i7 = this.b;
                k6 k6Var = (k6) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.h2 h2Var = q6Var.a;
                di.m8 m8Var = q6Var.e;
                m8Var.a(i7, arrayList);
                k6Var.f(true);
                q6Var.f(true);
                q6Var.o();
                TL_stars.TL_starGiftCollection c10 = m8Var.c(i7);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            gc R = lc.b0(h2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750377, di.f6.F1(savedStarGift.gift), c10.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        gc R2 = lc.b0(h2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.W2(gd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.messenger.g0.g3(new u4((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.c, this.b, (TLRPC.User) this.d, 10));
                break;
            case 2:
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                h2Var2.showDialog(new ni.a(h2Var2.getContext(), chat, -chat2.id, new o9(h2Var2, this.b, chat2, chat, 2)));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new u4(this.b, (oi.a2) this.c, (SparseIntArray) obj, (aa.c0) this.d, 13));
                break;
            case 4:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.c;
                int[] iArr = (int[]) this.d;
                int i10 = this.b;
                float f10 = iArr[0];
                float f11 = i10;
                m6Var.a(Float.valueOf((l9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f11)) + (f10 / f11)), Boolean.FALSE);
                break;
            case 5:
                g00 g00Var = (g00) this.c;
                x10 x10Var = (x10) this.d;
                int i11 = this.b;
                g00Var.getClass();
                g00Var.w2 = ((Boolean) obj).booleanValue();
                g00Var.dismiss();
                x10Var.a(Integer.valueOf(i11));
                break;
            default:
                Utilities.i.c(new ai.g1((tg.e2) this.c, this.b, (List) obj, new ArrayList(), (on0) this.d, 27));
                break;
        }
    }

    public /* synthetic */ e5(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ e5(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
