package fi;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gf;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m9(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        mt0 mt0Var;
        TLRPC.PhotoSize w10;
        int i7 = this.a;
        int i10 = 0;
        boolean z9 = this.b;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                va vaVar = (va) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int i11 = vaVar.c;
                if (obj != null && vaVar.p2 == null && !vaVar.W && vaVar.I()) {
                    if (!z9) {
                        vaVar.h0(false, true);
                        vaVar.Q0.a(vaVar.O1);
                        g6 g6Var = vaVar.O0;
                        boolean z10 = vaVar.O1 == 1;
                        g6Var.n0 = -1.0f;
                        g6Var.o0 = z10;
                        g6Var.invalidate();
                        vaVar.e(false);
                        boolean z11 = obj instanceof gf;
                        if (z11) {
                            gf gfVar = (gf) obj;
                            if (gfVar.b && !gfVar.d()) {
                                i10 = 1;
                            }
                            vaVar.O1 = i10;
                            e7 l10 = e7.l(gfVar);
                            l10.M0 = bitmap;
                            l10.J0 = vaVar.v0;
                            l10.K0 = vaVar.w0;
                            l10.A();
                            vaVar.L1 = true;
                            if (vaVar.A0.j()) {
                                vaVar.G1 = null;
                                l10.P = 1.0f;
                                if (vaVar.A0.l(l10)) {
                                    vaVar.K1 = e7.a(vaVar.A0.getLayout(), vaVar.A0.getContent());
                                }
                                vaVar.l0(true);
                            } else {
                                l10.B();
                                vaVar.K1 = l10;
                                if (z11) {
                                    t8.a(i11, l10);
                                }
                                vaVar.J(1, true);
                            }
                        } else if (obj instanceof e7) {
                            e7 e7Var = (e7) obj;
                            if (e7Var.L == null && !e7Var.v()) {
                                vaVar.e1.c("Failed to load draft");
                                qp.s1(i11).P1().w.b(e7Var);
                                break;
                            } else {
                                e7Var.J0 = vaVar.v0;
                                e7Var.K0 = vaVar.w0;
                                vaVar.O1 = e7Var.K ? 1 : 0;
                                e7Var.M0 = bitmap;
                                vaVar.L1 = false;
                                vaVar.A0.n(e7Var);
                                vaVar.K1 = e7Var;
                                if (z11) {
                                    t8.a(i11, e7Var);
                                }
                                vaVar.J(1, true);
                            }
                        }
                    } else if (vaVar.K1 != null) {
                        vaVar.t();
                        vaVar.K1.j = true;
                        if (obj instanceof gf) {
                            x9 x9Var = vaVar.v1;
                            x9Var.b0(x9Var.h0(((gf) obj).I, false));
                        } else if (obj instanceof TLObject) {
                            x9 x9Var2 = vaVar.v1;
                            TLObject tLObject = (TLObject) obj;
                            x9Var2.U1 = true;
                            j5 j5Var = x9Var2.A0;
                            float f10 = (!(tLObject instanceof TLRPC.Photo) || (w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) == null) ? 1.0f : w10.w / w10.h;
                            if (f10 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(x9Var2.A1, j5Var.getMeasuredWidth()) * 0.5d);
                                mt0Var = new mt0(floor, floor / f10);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(x9Var2.B1, j5Var.getMeasuredHeight()) * 0.5d);
                                mt0Var = new mt0(f10 * floor2, floor2);
                            }
                            tg.n1 n1Var = new tg.n1(x9Var2.getContext(), x9Var2.c0(), mt0Var, tLObject);
                            n1Var.setDelegate(x9Var2);
                            j5Var.addView(n1Var);
                            x9Var2.d0();
                            x9Var2.b0(n1Var);
                        }
                        vaVar.e(false);
                    }
                    i3 i3Var = vaVar.M0;
                    if (i3Var != null) {
                        vaVar.l2 = i3Var.e.e0();
                        vaVar.m2 = vaVar.M0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                ii.d0 d0Var = (ii.d0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        ii.m0.f(new hc((FrameLayout) d0Var.b, d0Var.I0), 2, z9);
                        d0Var.k1.E(0);
                        break;
                    } else {
                        org.telegram.ui.Cells.f1.r((FrameLayout) d0Var.b, d0Var.I0, tL_error, false);
                        break;
                    }
                } else {
                    ii.m0.f(new hc((FrameLayout) d0Var.b, d0Var.I0), 1, z9);
                    d0Var.k1.E(0);
                    break;
                }
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.S6;
                if (!profileActivity.c4()) {
                    if (hc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            hc.l(null, profileActivity, z9).j();
                        } else if (num.intValue() == 2) {
                            hc.l(org.telegram.messenger.m5.t(profileActivity.d1), profileActivity, z9).j();
                        } else if (tL_error2 != null) {
                            hc.d0(tL_error2);
                        }
                    }
                    org.telegram.messenger.n6 n6Var = profileActivity.W1;
                    if (n6Var != null) {
                        n6Var.g();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) obj3;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = f0Var.b;
                ArrayList arrayList2 = f0Var.c;
                f0Var.l = -1;
                f0Var.j = false;
                f0Var.i = false;
                if (nftitems != null) {
                    if (z9) {
                        arrayList.clear();
                    }
                    ArrayList<TL_wallet.nftItem> arrayList3 = nftitems.items;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_wallet.nftItem nftitem = arrayList3.get(i12);
                        i12++;
                        TL_wallet.nftItem nftitem2 = nftitem;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList.size()) {
                                arrayList.add(nftitem2);
                            } else if (org.telegram.ui.Wallet.n0.b(((TL_wallet.nftItem) arrayList.get(i13)).address, nftitem2.address)) {
                                arrayList.set(i13, nftitem2);
                            } else {
                                i13++;
                            }
                        }
                    }
                    String str = nftitems.next_offset;
                    f0Var.f = str;
                    boolean isEmpty = TextUtils.isEmpty(str);
                    f0Var.g = isEmpty;
                    f0Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed && !f0Var.d(wallettransaction.nft.address)) {
                                arrayList2.remove(size2);
                            }
                        }
                    }
                    f0Var.h();
                } else {
                    if (z9) {
                        f0Var.g = false;
                        f0Var.h = false;
                    }
                    f0Var.k = tL_error3 == null ? "Could not load collectibles" : tL_error3.text;
                }
                f0Var.g();
                break;
        }
    }
}
