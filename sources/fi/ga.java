package fi;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ga implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        rw0 rw0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10 = this.a;
        int i11 = 0;
        boolean z10 = this.b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                sb sbVar = (sb) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int i12 = sbVar.c;
                if (obj != null && sbVar.p2 == null && !sbVar.W && sbVar.I()) {
                    if (!z10) {
                        sbVar.h0(false, true);
                        sbVar.Q0.a(sbVar.O1);
                        w6 w6Var = sbVar.O0;
                        boolean z11 = sbVar.O1 == 1;
                        w6Var.n0 = -1.0f;
                        w6Var.o0 = z11;
                        w6Var.invalidate();
                        sbVar.e(false);
                        boolean z12 = obj instanceof MediaController.PhotoEntry;
                        if (z12) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            sbVar.O1 = i11;
                            w7 l4 = w7.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = sbVar.v0;
                            l4.K0 = sbVar.w0;
                            l4.A();
                            sbVar.L1 = true;
                            if (sbVar.A0.j()) {
                                sbVar.G1 = null;
                                l4.P = 1.0f;
                                if (sbVar.A0.l(l4)) {
                                    sbVar.K1 = w7.a(sbVar.A0.getLayout(), sbVar.A0.getContent());
                                }
                                sbVar.l0(true);
                            } else {
                                l4.B();
                                sbVar.K1 = l4;
                                if (z12) {
                                    o9.a(i12, l4);
                                }
                                sbVar.J(1, true);
                            }
                        } else if (obj instanceof w7) {
                            w7 w7Var = (w7) obj;
                            if (w7Var.L == null && !w7Var.v()) {
                                sbVar.e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i12).getStoriesController().w.b(w7Var);
                                break;
                            } else {
                                w7Var.J0 = sbVar.v0;
                                w7Var.K0 = sbVar.w0;
                                sbVar.O1 = w7Var.K ? 1 : 0;
                                w7Var.M0 = bitmap;
                                sbVar.L1 = false;
                                sbVar.A0.n(w7Var);
                                sbVar.K1 = w7Var;
                                if (z12) {
                                    o9.a(i12, w7Var);
                                }
                                sbVar.J(1, true);
                            }
                        }
                    } else if (sbVar.K1 != null) {
                        sbVar.t();
                        sbVar.K1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ta taVar = sbVar.v1;
                            taVar.b0(taVar.h0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            ta taVar2 = sbVar.v1;
                            TLObject tLObject = (TLObject) obj;
                            taVar2.a2 = true;
                            y5 y5Var = taVar2.G0;
                            float f7 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f7 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(taVar2.G1, y5Var.getMeasuredWidth()) * 0.5d);
                                rw0Var = new rw0(floor, floor / f7);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(taVar2.H1, y5Var.getMeasuredHeight()) * 0.5d);
                                rw0Var = new rw0(f7 * floor2, floor2);
                            }
                            sg.y1 y1Var = new sg.y1(taVar2.getContext(), taVar2.c0(), rw0Var, tLObject);
                            y1Var.setDelegate(taVar2);
                            y5Var.addView(y1Var);
                            taVar2.d0();
                            taVar2.b0(y1Var);
                        }
                        sbVar.e(false);
                    }
                    qa qaVar = sbVar.M0;
                    if (qaVar != null) {
                        sbVar.l2 = qaVar.e.e0();
                        sbVar.m2 = sbVar.M0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                ii.j0.m((ii.j0) obj3, z10, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i13 = ProfileActivity.R6;
                if (!profileActivity.V3()) {
                    if (wc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            wc.l(null, profileActivity, z10).j();
                        } else if (num.intValue() == 2) {
                            wc.l(DialogObject.getShortName(profileActivity.e1), profileActivity, z10).j();
                        } else if (tL_error != null) {
                            wc.e0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.X1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.d0 d0Var = (org.telegram.ui.Wallet.d0) obj3;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = d0Var.b;
                ArrayList arrayList2 = d0Var.c;
                d0Var.l = -1;
                d0Var.j = false;
                d0Var.i = false;
                if (nftitems != null) {
                    if (z10) {
                        arrayList.clear();
                    }
                    ArrayList<TL_wallet.nftItem> arrayList3 = nftitems.items;
                    int size = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_wallet.nftItem nftitem = arrayList3.get(i14);
                        i14++;
                        TL_wallet.nftItem nftitem2 = nftitem;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= arrayList.size()) {
                                arrayList.add(nftitem2);
                            } else if (org.telegram.ui.Wallet.l0.b(((TL_wallet.nftItem) arrayList.get(i15)).address, nftitem2.address)) {
                                arrayList.set(i15, nftitem2);
                            } else {
                                i15++;
                            }
                        }
                    }
                    String str = nftitems.next_offset;
                    d0Var.f = str;
                    boolean isEmpty = TextUtils.isEmpty(str);
                    d0Var.g = isEmpty;
                    d0Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed && !d0Var.d(wallettransaction.nft.address)) {
                                arrayList2.remove(size2);
                            }
                        }
                    }
                    d0Var.h();
                } else {
                    if (z10) {
                        d0Var.g = false;
                        d0Var.h = false;
                    }
                    d0Var.k = tL_error2 == null ? "Could not load collectibles" : tL_error2.text;
                }
                d0Var.g();
                break;
        }
    }
}
