package di;

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
import org.telegram.ui.Components.iw0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ya implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ya(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        iw0 iw0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                kc kcVar = (kc) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = kcVar.c;
                if (obj != null && kcVar.p2 == null && !kcVar.W && kcVar.I()) {
                    int i11 = 0;
                    if (!this.b) {
                        kcVar.h0(false, true);
                        kcVar.Q0.a(kcVar.O1);
                        i7 i7Var = kcVar.O0;
                        boolean z10 = kcVar.O1 == 1;
                        i7Var.n0 = -1.0f;
                        i7Var.o0 = z10;
                        i7Var.invalidate();
                        kcVar.e(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            kcVar.O1 = i11;
                            k8 l4 = k8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = kcVar.v0;
                            l4.K0 = kcVar.w0;
                            l4.A();
                            kcVar.L1 = true;
                            if (kcVar.A0.j()) {
                                kcVar.G1 = null;
                                l4.P = 1.0f;
                                if (kcVar.A0.l(l4)) {
                                    kcVar.K1 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
                                }
                                kcVar.l0(true);
                            } else {
                                l4.B();
                                kcVar.K1 = l4;
                                if (z11) {
                                    fa.a(i10, l4);
                                }
                                kcVar.J(1, true);
                            }
                        } else if (obj instanceof k8) {
                            k8 k8Var = (k8) obj;
                            if (k8Var.L == null && !k8Var.v()) {
                                kcVar.e1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().w.b(k8Var);
                                break;
                            } else {
                                k8Var.J0 = kcVar.v0;
                                k8Var.K0 = kcVar.w0;
                                kcVar.O1 = k8Var.K ? 1 : 0;
                                k8Var.M0 = bitmap;
                                kcVar.L1 = false;
                                kcVar.A0.n(k8Var);
                                kcVar.K1 = k8Var;
                                if (z11) {
                                    fa.a(i10, k8Var);
                                }
                                kcVar.J(1, true);
                            }
                        }
                    } else if (kcVar.K1 != null) {
                        kcVar.t();
                        kcVar.K1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            mb mbVar = kcVar.v1;
                            mbVar.d0(mbVar.j0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            mb mbVar2 = kcVar.v1;
                            TLObject tLObject = (TLObject) obj;
                            mbVar2.l2 = true;
                            i6 i6Var = mbVar2.R0;
                            float f7 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f7 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(mbVar2.R1, i6Var.getMeasuredWidth()) * 0.5d);
                                iw0Var = new iw0(floor, floor / f7);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(mbVar2.S1, i6Var.getMeasuredHeight()) * 0.5d);
                                iw0Var = new iw0(f7 * floor2, floor2);
                            }
                            rg.z1 z1Var = new rg.z1(mbVar2.getContext(), mbVar2.e0(), iw0Var, tLObject);
                            z1Var.setDelegate(mbVar2);
                            i6Var.addView(z1Var);
                            mbVar2.f0();
                            mbVar2.d0(z1Var);
                        }
                        kcVar.e(false);
                    }
                    jb jbVar = kcVar.M0;
                    if (jbVar != null) {
                        kcVar.l2 = jbVar.e.e0();
                        kcVar.m2 = kcVar.M0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                gi.k0.n((gi.k0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.zc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.zc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.zc.l(DialogObject.getShortName(profileActivity.e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.zc.d0(tL_error);
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
