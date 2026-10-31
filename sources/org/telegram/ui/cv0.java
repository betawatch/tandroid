package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv0 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cv0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        org.telegram.ui.Components.pu0 pu0Var;
        TLRPC.PhotoSize w9;
        int i10 = this.a;
        int i11 = 0;
        boolean z10 = this.b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.R6;
                if (!profileActivity.b4()) {
                    if (org.telegram.ui.Components.cc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            org.telegram.ui.Components.cc.l(null, profileActivity, z10).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.cc.l(org.telegram.messenger.o5.t(profileActivity.d1), profileActivity, z10).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.cc.d0(tL_error);
                        }
                    }
                    org.telegram.messenger.o6 o6Var = profileActivity.W1;
                    if (o6Var != null) {
                        o6Var.g();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Wallet.c0 c0Var = (org.telegram.ui.Wallet.c0) obj3;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = c0Var.b;
                ArrayList arrayList2 = c0Var.c;
                c0Var.l = -1;
                c0Var.j = false;
                c0Var.i = false;
                if (nftitems != null) {
                    if (z10) {
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
                            } else if (org.telegram.ui.Wallet.k0.b(((TL_wallet.nftItem) arrayList.get(i13)).address, nftitem2.address)) {
                                arrayList.set(i13, nftitem2);
                            } else {
                                i13++;
                            }
                        }
                    }
                    String str = nftitems.next_offset;
                    c0Var.f = str;
                    boolean isEmpty = TextUtils.isEmpty(str);
                    c0Var.g = isEmpty;
                    c0Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed && !c0Var.d(wallettransaction.nft.address)) {
                                arrayList2.remove(size2);
                            }
                        }
                    }
                    c0Var.h();
                } else {
                    if (z10) {
                        c0Var.g = false;
                        c0Var.h = false;
                    }
                    c0Var.k = tL_error2 == null ? "Could not load collectibles" : tL_error2.text;
                }
                c0Var.g();
                break;
            case 2:
                vh.o8 o8Var = (vh.o8) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int i14 = o8Var.c;
                if (obj != null && o8Var.p2 == null && !o8Var.W && o8Var.I()) {
                    if (!z10) {
                        o8Var.h0(false, true);
                        o8Var.Q0.a(o8Var.O1);
                        vh.r4 r4Var = o8Var.O0;
                        boolean z11 = o8Var.O1 == 1;
                        r4Var.n0 = -1.0f;
                        r4Var.o0 = z11;
                        r4Var.invalidate();
                        o8Var.e(false);
                        boolean z12 = obj instanceof org.telegram.messenger.ef;
                        if (z12) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            if (efVar.b && !efVar.d()) {
                                i11 = 1;
                            }
                            o8Var.O1 = i11;
                            vh.n5 l4 = vh.n5.l(efVar);
                            l4.M0 = bitmap;
                            l4.J0 = o8Var.v0;
                            l4.K0 = o8Var.w0;
                            l4.A();
                            o8Var.L1 = true;
                            if (o8Var.A0.j()) {
                                o8Var.G1 = null;
                                l4.P = 1.0f;
                                if (o8Var.A0.l(l4)) {
                                    o8Var.K1 = vh.n5.a(o8Var.A0.getLayout(), o8Var.A0.getContent());
                                }
                                o8Var.l0(true);
                            } else {
                                l4.B();
                                o8Var.K1 = l4;
                                if (z12) {
                                    vh.x6.a(i14, l4);
                                }
                                o8Var.J(1, true);
                            }
                        } else if (obj instanceof vh.n5) {
                            vh.n5 n5Var = (vh.n5) obj;
                            if (n5Var.L == null && !n5Var.v()) {
                                o8Var.e1.c("Failed to load draft");
                                org.telegram.messenger.vp.r1(i14).O1().w.c(n5Var);
                                break;
                            } else {
                                n5Var.J0 = o8Var.v0;
                                n5Var.K0 = o8Var.w0;
                                o8Var.O1 = n5Var.K ? 1 : 0;
                                n5Var.M0 = bitmap;
                                o8Var.L1 = false;
                                o8Var.A0.n(n5Var);
                                o8Var.K1 = n5Var;
                                if (z12) {
                                    vh.x6.a(i14, n5Var);
                                }
                                o8Var.J(1, true);
                            }
                        }
                    } else if (o8Var.K1 != null) {
                        o8Var.t();
                        o8Var.K1.j = true;
                        if (obj instanceof org.telegram.messenger.ef) {
                            vh.s7 s7Var = o8Var.v1;
                            s7Var.b0(s7Var.h0(((org.telegram.messenger.ef) obj).I, false));
                        } else if (obj instanceof TLObject) {
                            vh.s7 s7Var2 = o8Var.v1;
                            TLObject tLObject = (TLObject) obj;
                            s7Var2.U1 = true;
                            vh.x3 x3Var = s7Var2.A0;
                            float f7 = (!(tLObject instanceof TLRPC.Photo) || (w9 = org.telegram.messenger.b8.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) == null) ? 1.0f : w9.w / w9.h;
                            if (f7 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(s7Var2.A1, x3Var.getMeasuredWidth()) * 0.5d);
                                pu0Var = new org.telegram.ui.Components.pu0(floor, floor / f7);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(s7Var2.B1, x3Var.getMeasuredHeight()) * 0.5d);
                                pu0Var = new org.telegram.ui.Components.pu0(f7 * floor2, floor2);
                            }
                            jg.e2 e2Var = new jg.e2(s7Var2.getContext(), s7Var2.c0(), pu0Var, tLObject);
                            e2Var.setDelegate(s7Var2);
                            x3Var.addView(e2Var);
                            s7Var2.d0();
                            s7Var2.b0(e2Var);
                        }
                        o8Var.e(false);
                    }
                    vh.m2 m2Var = o8Var.M0;
                    if (m2Var != null) {
                        o8Var.l2 = m2Var.e.e0();
                        o8Var.m2 = o8Var.M0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            default:
                yh.a0 a0Var = (yh.a0) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error3.text)) {
                        yh.f0.f(new org.telegram.ui.Components.cc((FrameLayout) a0Var.b, a0Var.I0), 2, z10);
                        a0Var.k1.E(0);
                        break;
                    } else {
                        org.telegram.ui.Cells.f1.s((FrameLayout) a0Var.b, a0Var.I0, tL_error3, false);
                        break;
                    }
                } else {
                    yh.f0.f(new org.telegram.ui.Components.cc((FrameLayout) a0Var.b, a0Var.I0), 1, z10);
                    a0Var.k1.E(0);
                    break;
                }
        }
    }
}
