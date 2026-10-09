package ci;

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
import org.telegram.ui.Components.mw0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class za implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ za(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        mw0 mw0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                lc lcVar = (lc) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = lcVar.c;
                if (obj != null && lcVar.p2 == null && !lcVar.W && lcVar.I()) {
                    int i11 = 0;
                    if (!this.b) {
                        lcVar.h0(false, true);
                        lcVar.Q0.a(lcVar.O1);
                        j7 j7Var = lcVar.O0;
                        boolean z10 = lcVar.O1 == 1;
                        j7Var.n0 = -1.0f;
                        j7Var.o0 = z10;
                        j7Var.invalidate();
                        lcVar.e(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            lcVar.O1 = i11;
                            l8 l4 = l8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = lcVar.v0;
                            l4.K0 = lcVar.w0;
                            l4.A();
                            lcVar.L1 = true;
                            if (lcVar.A0.j()) {
                                lcVar.G1 = null;
                                l4.P = 1.0f;
                                if (lcVar.A0.l(l4)) {
                                    lcVar.K1 = l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
                                }
                                lcVar.l0(true);
                            } else {
                                l4.B();
                                lcVar.K1 = l4;
                                if (z11) {
                                    ga.a(i10, l4);
                                }
                                lcVar.J(1, true);
                            }
                        } else if (obj instanceof l8) {
                            l8 l8Var = (l8) obj;
                            if (l8Var.L == null && !l8Var.v()) {
                                lcVar.e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().w.b(l8Var);
                                break;
                            } else {
                                l8Var.J0 = lcVar.v0;
                                l8Var.K0 = lcVar.w0;
                                lcVar.O1 = l8Var.K ? 1 : 0;
                                l8Var.M0 = bitmap;
                                lcVar.L1 = false;
                                lcVar.A0.n(l8Var);
                                lcVar.K1 = l8Var;
                                if (z11) {
                                    ga.a(i10, l8Var);
                                }
                                lcVar.J(1, true);
                            }
                        }
                    } else if (lcVar.K1 != null) {
                        lcVar.t();
                        lcVar.K1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            nb nbVar = lcVar.v1;
                            nbVar.d0(nbVar.j0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            nb nbVar2 = lcVar.v1;
                            TLObject tLObject = (TLObject) obj;
                            nbVar2.l2 = true;
                            j6 j6Var = nbVar2.R0;
                            float f7 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f7 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(nbVar2.R1, j6Var.getMeasuredWidth()) * 0.5d);
                                mw0Var = new mw0(floor, floor / f7);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(nbVar2.S1, j6Var.getMeasuredHeight()) * 0.5d);
                                mw0Var = new mw0(f7 * floor2, floor2);
                            }
                            qg.y1 y1Var = new qg.y1(nbVar2.getContext(), nbVar2.e0(), mw0Var, tLObject);
                            y1Var.setDelegate(nbVar2);
                            j6Var.addView(y1Var);
                            nbVar2.f0();
                            nbVar2.d0(y1Var);
                        }
                        lcVar.e(false);
                    }
                    kb kbVar = lcVar.M0;
                    if (kbVar != null) {
                        lcVar.l2 = kbVar.e.e0();
                        lcVar.m2 = lcVar.M0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                fi.k0.o((fi.k0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.ad.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.ad.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.ad.l(DialogObject.getShortName(profileActivity.e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.ad.d0(tL_error);
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
                org.telegram.ui.Wallet.c0 c0Var = (org.telegram.ui.Wallet.c0) this.c;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = c0Var.b;
                ArrayList arrayList2 = c0Var.c;
                c0Var.l = -1;
                c0Var.j = false;
                c0Var.i = false;
                boolean z13 = this.b;
                if (nftitems != null) {
                    if (z13) {
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
                            if (!wallettransaction.pending && !wallettransaction.failed) {
                                String str2 = wallettransaction.nft.address;
                                int size3 = arrayList.size();
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size3) {
                                        Object obj3 = arrayList.get(i14);
                                        i14++;
                                        if (org.telegram.ui.Wallet.k0.b(((TL_wallet.nftItem) obj3).address, str2)) {
                                            break;
                                        }
                                    } else {
                                        arrayList2.remove(size2);
                                    }
                                }
                            }
                        }
                    }
                    c0Var.g();
                } else {
                    if (z13) {
                        c0Var.g = false;
                        c0Var.h = false;
                    }
                    c0Var.k = tL_error2 == null ? "Could not load collectibles" : tL_error2.text;
                }
                c0Var.f();
                break;
        }
    }
}
