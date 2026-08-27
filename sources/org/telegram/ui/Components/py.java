package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class py extends yk0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ yy v;

    public py(yy yyVar, Context context) {
        this.v = yyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.a instanceof zk0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i10) {
        int indexOf;
        int i11;
        yy yyVar = this.v;
        ArrayList arrayList = yyVar.Z0;
        Object obj = this.h.get(i10);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i12 = yyVar.C1;
            if (i12 >= 0) {
                return i12;
            }
            int i13 = yyVar.B1;
            if (i13 >= 0) {
                return i13;
            }
            return 0;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = yyVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.d = measuredWidth / AndroidUtilities.dp(72.0f);
        }
        int i14 = this.r.get(i10, TLObject.FLAG_31);
        if (i14 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i11 = yyVar.A1;
        } else {
            Object obj2 = this.e.get(i14);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? yyVar.E1 : "recent".equals(obj2) ? yyVar.B1 : yyVar.C1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i11 = yyVar.A1;
        }
        return indexOf + i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        Object obj;
        int i11;
        yy yyVar;
        HashMap hashMap;
        int i12;
        yy yyVar2 = this.v;
        int i13 = yyVar2.Y0;
        if (yyVar2.J2) {
            return;
        }
        int measuredWidth = yyVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = AndroidUtilities.displaySize.x;
        }
        int dp = measuredWidth / AndroidUtilities.dp(72.0f);
        this.d = dp;
        yyVar2.A0.y1(dp);
        SparseArray sparseArray = this.e;
        sparseArray.clear();
        HashMap hashMap2 = this.f;
        hashMap2.clear();
        SparseIntArray sparseIntArray = this.r;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.h;
        sparseArray2.clear();
        int i14 = 0;
        this.s = 0;
        ArrayList arrayList2 = yyVar2.Z0;
        int i15 = -5;
        int i16 = -5;
        int i17 = 0;
        boolean z10 = false;
        while (i16 < arrayList2.size()) {
            if (i16 == i15) {
                int i18 = this.s;
                this.s = i18 + 1;
                sparseArray2.put(i18, "search");
                i17++;
                yyVar = yyVar2;
                i11 = i13;
                hashMap = hashMap2;
                i10 = i16;
            } else {
                if (i16 == -4) {
                    MediaDataController mediaDataController = MediaDataController.getInstance(i13);
                    SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i13);
                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                    if (yyVar2.i1.isEmpty()) {
                        i10 = i16;
                    } else {
                        int i19 = i16;
                        if (emojiSettings.getLong("featured_hidden", 0L) != featuredStickerSets.get(i14).set.id) {
                            int i20 = this.s;
                            this.s = i20 + 1;
                            sparseArray2.put(i20, "trend1");
                            int i21 = this.s;
                            this.s = i21 + 1;
                            sparseArray2.put(i21, "trend2");
                            i17 += 2;
                            yyVar = yyVar2;
                            i11 = i13;
                            hashMap = hashMap2;
                            i10 = i19;
                        } else {
                            i10 = i19;
                        }
                    }
                    yyVar = yyVar2;
                    i11 = i13;
                } else {
                    i10 = i16;
                    if (i10 == -3) {
                        arrayList = yyVar2.g1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i10 == -2) {
                        arrayList = yyVar2.f1;
                        if (!arrayList.isEmpty() && !yyVar2.I2) {
                            z10 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i10 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i10);
                            ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet2.documents;
                            if (!z10 && !yyVar2.I2) {
                                ArrayList<TLRPC.Document> arrayList4 = new ArrayList<>(arrayList3);
                                arrayList4.add(0, new TLRPC.TL_documentEmpty());
                                arrayList3 = arrayList4;
                                z10 = true;
                            }
                            hashMap2.put(tL_messages_stickerSet2, Integer.valueOf(this.s));
                            ArrayList<TLRPC.Document> arrayList5 = arrayList3;
                            tL_messages_stickerSet = tL_messages_stickerSet2;
                            arrayList = arrayList5;
                            obj = null;
                            i11 = i13;
                            if (i10 == yyVar2.a1) {
                                yyVar2.b1 = this.s;
                                if (arrayList.isEmpty()) {
                                    sparseArray.put(i17, tL_messages_stickerSet);
                                    int i22 = i17 + 1;
                                    sparseIntArray.put(this.s, i17);
                                    sparseArray.put(i22, tL_messages_stickerSet);
                                    i17 += 2;
                                    sparseIntArray.put(this.s + 1, i22);
                                    int i23 = this.s;
                                    this.s = i23 + 1;
                                    sparseArray2.put(i23, tL_messages_stickerSet);
                                    int i24 = this.s;
                                    this.s = i24 + 1;
                                    sparseArray2.put(i24, "group");
                                    yyVar = yyVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                yyVar = yyVar2;
                                int ceil = (int) Math.ceil(arrayList.size() / this.d);
                                if (tL_messages_stickerSet != null) {
                                    sparseArray2.put(this.s, tL_messages_stickerSet);
                                } else {
                                    sparseArray2.put(this.s, arrayList);
                                }
                                sparseIntArray.put(this.s, i17);
                                int i25 = 0;
                                while (i25 < arrayList.size()) {
                                    int i26 = i25 + 1;
                                    int i27 = i26 + this.s;
                                    HashMap hashMap3 = hashMap2;
                                    sparseArray2.put(i27, arrayList.get(i25));
                                    SparseArray sparseArray3 = this.n;
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray3.put(i27, tL_messages_stickerSet);
                                    } else {
                                        sparseArray3.put(i27, obj);
                                    }
                                    sparseIntArray.put(i26 + this.s, (i25 / this.d) + i17 + 1);
                                    i25 = i26;
                                    hashMap2 = hashMap3;
                                }
                                hashMap = hashMap2;
                                int i28 = 0;
                                while (true) {
                                    i12 = ceil + 1;
                                    if (i28 >= i12) {
                                        break;
                                    }
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray.put(i17 + i28, tL_messages_stickerSet);
                                    } else if (i10 == -1) {
                                        sparseArray.put(i17 + i28, "premium");
                                    } else if (i10 == -2) {
                                        sparseArray.put(i17 + i28, "recent");
                                    } else {
                                        sparseArray.put(i17 + i28, "fav");
                                    }
                                    i28++;
                                }
                                this.s = (this.d * ceil) + 1 + this.s;
                                i17 += i12;
                            }
                            yyVar = yyVar2;
                        }
                        yyVar = yyVar2;
                        i11 = i13;
                    }
                    tL_messages_stickerSet = null;
                    i11 = i13;
                    if (i10 == yyVar2.a1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    yyVar = yyVar2;
                }
                hashMap = hashMap2;
            }
            i16 = i10 + 1;
            i13 = i11;
            yyVar2 = yyVar;
            hashMap2 = hashMap;
            i14 = 0;
            i15 = -5;
        }
    }

    @Override // f2.q0
    public final int h() {
        int i10 = this.s;
        if (i10 != 0) {
            return i10 + 1;
        }
        return 0;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == 0) {
            return 4;
        }
        Object obj = this.h.get(i10);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return obj instanceof TLRPC.TL_documentEmpty ? 7 : 0;
        }
        if (!(obj instanceof String)) {
            return 2;
        }
        if ("trend1".equals(obj)) {
            return 5;
        }
        return "trend2".equals(obj) ? 6 : 3;
    }

    @Override // f2.q0
    public final void l() {
        G();
        super.l();
    }

    @Override // f2.q0
    public final void t(int i10, int i11) {
        G();
        super.t(i10, i11);
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        yy yyVar = this.v;
        int i11 = yyVar.Y0;
        int i12 = o1Var.f;
        View view = o1Var.a;
        SparseArray sparseArray = this.h;
        if (i12 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
            a8Var.d(document, null, this.n.get(i10), null, false, false);
            a8Var.setRecent(yyVar.f1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        if (i12 == 1) {
            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) view;
            if (i10 != this.s) {
                i3Var.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            int i13 = this.r.get(i10 - 1, TLObject.FLAG_31);
            if (i13 == Integer.MIN_VALUE) {
                i3Var.setHeight(1);
                return;
            }
            Object obj = this.e.get(i13);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? yyVar.f1 : yyVar.g1;
            }
            if (arrayList == null) {
                i3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                i3Var.setHeight(AndroidUtilities.dp(8.0f));
                return;
            } else {
                int z10 = org.telegram.messenger.rl.z(82.0f, (int) Math.ceil(arrayList.size() / this.d), yyVar.h.getHeight());
                i3Var.setHeight(z10 > 0 ? z10 : 1);
                return;
            }
        }
        final int i14 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                ((org.telegram.ui.Cells.i8) view).setIsLast(i10 == this.s - 1);
                return;
            } else {
                if (i12 != 5) {
                    return;
                }
                ((org.telegram.ui.Cells.j8) view).c(LocaleController.getString(MediaDataController.getInstance(i11).loadFeaturedPremium ? R.string.FeaturedStickersPremium : R.string.FeaturedStickers), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
        j8Var.setHeaderOnClick(null);
        if (i10 == yyVar.b1) {
            int i15 = (yyVar.c1 && yyVar.d1 == null) ? 0 : yyVar.d1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat chat = yyVar.F1 != null ? MessagesController.getInstance(i11).getChat(Long.valueOf(yyVar.F1.id)) : null;
            j8Var.b(i15, LocaleController.formatString("CurrentGroupStickers", R.string.CurrentGroupStickers, chat != null ? chat.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i10);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                j8Var.b(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !yyVar.I2) {
                    j8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ny
                        public final /* synthetic */ py b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    this.b.v.p1.d(tL_messages_stickerSet.set, null, true);
                                    break;
                                default:
                                    this.b.v.p1.d(tL_messages_stickerSet.set, null, false);
                                    break;
                            }
                        }
                    });
                }
                j8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ny
                    public final /* synthetic */ py b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (r3) {
                            case 0:
                                this.b.v.p1.d(tL_messages_stickerSet.set, null, true);
                                break;
                            default:
                                this.b.v.p1.d(tL_messages_stickerSet.set, null, false);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (obj2 == yyVar.f1) {
            j8Var.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
        } else if (obj2 == yyVar.g1) {
            j8Var.b(0, LocaleController.getString(R.string.FavoriteStickers));
        } else if (obj2 == yyVar.h1) {
            j8Var.b(0, LocaleController.getString(R.string.PremiumStickers));
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        final int i11 = 2;
        final int i12 = 0;
        final int i13 = 1;
        boolean z10 = true;
        yy yyVar = this.v;
        Context context = this.c;
        View view = null;
        switch (i10) {
            case 0:
                view = new oy(i12, context, yyVar.V1, z10 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.i3(context);
                break;
            case 2:
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.c, false, false, yyVar.V1, yyVar.e2);
                j8Var.setOnIconClickListener(new q2(20, this, j8Var));
                view = j8Var;
                break;
            case 3:
                org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(context);
                i8Var.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                i8Var.addView(textView, h7.z5.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                i8Var.a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.y1.s(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                i8Var.addView(textView2, h7.z5.t(-2, 28, 51, 17, 10, 14, 8));
                i8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.my
                    public final /* synthetic */ py b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                yy yyVar2 = this.b.v;
                                xx xxVar = yyVar2.p1;
                                if (xxVar != null) {
                                    xxVar.y(yyVar2.F1.id);
                                    break;
                                }
                                break;
                            case 1:
                                yy yyVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(yyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(yyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    py pyVar = yyVar3.u0;
                                    if (pyVar != null) {
                                        pyVar.t(1, 2);
                                    }
                                    yyVar3.Z(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.b.v.U1;
                                if (n2Var instanceof org.telegram.ui.rn) {
                                    ((org.telegram.ui.rn) n2Var).Y9();
                                    break;
                                }
                                break;
                        }
                    }
                });
                i8Var.setLayoutParams(new f2.y0(-1, -2));
                view = i8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new f2.y0(-1, yyVar.X0));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.c, false, false, yyVar.V1, yyVar.e2);
                j8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.my
                    public final /* synthetic */ py b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i13) {
                            case 0:
                                yy yyVar2 = this.b.v;
                                xx xxVar = yyVar2.p1;
                                if (xxVar != null) {
                                    xxVar.y(yyVar2.F1.id);
                                    break;
                                }
                                break;
                            case 1:
                                yy yyVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(yyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(yyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    py pyVar = yyVar3.u0;
                                    if (pyVar != null) {
                                        pyVar.t(1, 2);
                                    }
                                    yyVar3.Z(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.b.v.U1;
                                if (n2Var instanceof org.telegram.ui.rn) {
                                    ((org.telegram.ui.rn) n2Var).Y9();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = j8Var2;
                break;
            case 6:
                wy wyVar = new wy(yyVar, false);
                yyVar.B0 = wyVar;
                hh.f1 f1Var = new hh.f1(yyVar, context, wyVar);
                f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                f1Var.setClipToPadding(false);
                f1Var.i(new jh.j(i11));
                f1Var.setOnItemClickListener(new j(this, 6));
                f1Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(52.0f)));
                view = f1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i14 = org.telegram.ui.ActionBar.g6.Me;
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(0.12f, yyVar.B(i14))));
                h7.b6.b(linearLayout, 0.1f, 1.5f);
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.my
                    public final /* synthetic */ py b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i11) {
                            case 0:
                                yy yyVar2 = this.b.v;
                                xx xxVar = yyVar2.p1;
                                if (xxVar != null) {
                                    xxVar.y(yyVar2.F1.id);
                                    break;
                                }
                                break;
                            case 1:
                                yy yyVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(yyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(yyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    py pyVar = yyVar3.u0;
                                    if (pyVar != null) {
                                        pyVar.t(1, 2);
                                    }
                                    yyVar3.Z(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.b.v.U1;
                                if (n2Var instanceof org.telegram.ui.rn) {
                                    ((org.telegram.ui.rn) n2Var).Y9();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(yyVar.B(i14), PorterDuff.Mode.SRC_IN));
                linearLayout.addView(imageView, h7.z5.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(yyVar.B(i14));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout.addView(textView3, h7.z5.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, h7.z5.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new lk0(view);
    }
}
