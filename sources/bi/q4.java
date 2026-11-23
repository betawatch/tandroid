package bi;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.ng;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q4(ur urVar, long j3, ArrayList arrayList, boolean z10, int i7, int i10) {
        this.f = urVar;
        this.b = j3;
        this.h = arrayList;
        this.c = z10;
        this.d = i7;
        this.e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean z10;
        long j3;
        int i7;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.f;
                String str = (String) this.h;
                boolean z11 = tLObject instanceof TL_stars.TL_payments_uniqueStarGift;
                int i10 = this.d;
                if (z11) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    np.u1(i10).f4(tL_payments_uniqueStarGift.users, false);
                    np.u1(i10).Z3(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        z10 = this.c;
                        j3 = this.b;
                        if ((tL_starGiftUnique == null && x4.m(tL_starGiftUnique) == z10 && (!z10 || j3 == 0 || tL_starGiftUnique.getResellAmount(cg.b.b).b == j3)) || (i7 = this.e + 1) >= 8) {
                            if (tL_starGiftUnique != null) {
                                org.telegram.ui.Wallet.u0.D(i10).B().i(tL_starGiftUnique);
                                di.y8.y(i10, false).a0(tL_starGiftUnique);
                                ArrayList arrayList = j8.U;
                                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                                    boolean m10 = x4.m(tL_starGiftUnique);
                                    ArrayList arrayList2 = new ArrayList(arrayList);
                                    int size = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList2.get(i11);
                                        i11++;
                                        WeakReference weakReference = (WeakReference) obj;
                                        x7 x7Var = (x7) weakReference.get();
                                        if (x7Var == null) {
                                            arrayList.remove(weakReference);
                                        } else {
                                            ArrayList arrayList3 = x7Var.d;
                                            if (x7Var.a == i10 && x7Var.b == tL_starGiftUnique.gift_id) {
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 < arrayList3.size()) {
                                                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList3.get(i12);
                                                        if (!tL_starGiftUnique.slug.equals(tL_starGiftUnique2.slug)) {
                                                            i12++;
                                                        } else if (x4.m(tL_starGiftUnique2)) {
                                                            if (m10) {
                                                                arrayList3.set(i12, tL_starGiftUnique);
                                                                y10 y10Var = x7Var.c;
                                                                if (y10Var != null) {
                                                                    y10Var.a(Boolean.FALSE);
                                                                }
                                                            } else {
                                                                x7Var.n(tL_starGiftUnique2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.h3(new o4(i10, i7, j3, str, z10), x4.a[i7]);
                            break;
                        }
                    }
                }
                tL_starGiftUnique = null;
                z10 = this.c;
                j3 = this.b;
                if (tL_starGiftUnique == null) {
                }
                org.telegram.messenger.g0.h3(new o4(i10, i7, j3, str, z10), x4.a[i7]);
                break;
            case 1:
                ((ur) this.f).Q0(this.d, this.e, this.b, (ArrayList) this.h, this.c);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.g0 = null;
                chatActivityEnterView.O0(true);
                gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null) {
                    gfVar.setText("");
                }
                ng ngVar = chatActivityEnterView.P3;
                if (ngVar != null) {
                    ngVar.H(charSequence, this.c, this.d, this.e, this.b);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q4(TLObject tLObject, int i7, boolean z10, long j3, int i10, String str) {
        this.f = tLObject;
        this.d = i7;
        this.c = z10;
        this.b = j3;
        this.e = i10;
        this.h = str;
    }

    public /* synthetic */ q4(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.b = j3;
    }
}
