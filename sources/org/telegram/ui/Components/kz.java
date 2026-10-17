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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class kz extends hm0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ tz v;

    public kz(tz tzVar, Context context) {
        this.v = tzVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.a instanceof im0;
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
        tz tzVar = this.v;
        ArrayList arrayList = tzVar.d1;
        Object obj = this.h.get(i10);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i12 = tzVar.G1;
            if (i12 >= 0) {
                return i12;
            }
            int i13 = tzVar.F1;
            if (i13 >= 0) {
                return i13;
            }
            return 0;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = tzVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.d = measuredWidth / AndroidUtilities.dp(72.0f);
        }
        int i14 = this.r.get(i10, TLObject.FLAG_31);
        if (i14 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i11 = tzVar.E1;
        } else {
            Object obj2 = this.e.get(i14);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? tzVar.I1 : "recent".equals(obj2) ? tzVar.F1 : tzVar.G1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i11 = tzVar.E1;
        }
        return indexOf + i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        Object obj;
        int i11;
        tz tzVar;
        HashMap hashMap;
        int i12;
        tz tzVar2 = this.v;
        int i13 = tzVar2.c1;
        if (tzVar2.N2) {
            return;
        }
        int measuredWidth = tzVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = AndroidUtilities.displaySize.x;
        }
        int dp = measuredWidth / AndroidUtilities.dp(72.0f);
        this.d = dp;
        tzVar2.E0.y1(dp);
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
        ArrayList arrayList2 = tzVar2.d1;
        int i15 = -5;
        int i16 = 0;
        boolean z10 = false;
        int i17 = -5;
        while (i17 < arrayList2.size()) {
            if (i17 == i15) {
                int i18 = this.s;
                this.s = i18 + 1;
                sparseArray2.put(i18, "search");
                i16++;
                tzVar = tzVar2;
                i11 = i13;
                hashMap = hashMap2;
                i10 = i17;
            } else {
                if (i17 == -4) {
                    MediaDataController mediaDataController = MediaDataController.getInstance(i13);
                    SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i13);
                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                    if (tzVar2.m1.isEmpty()) {
                        i10 = i17;
                    } else {
                        int i19 = i17;
                        if (emojiSettings.getLong("featured_hidden", 0L) != featuredStickerSets.get(i14).set.id) {
                            int i20 = this.s;
                            this.s = i20 + 1;
                            sparseArray2.put(i20, "trend1");
                            int i21 = this.s;
                            this.s = i21 + 1;
                            sparseArray2.put(i21, "trend2");
                            i16 += 2;
                            tzVar = tzVar2;
                            i11 = i13;
                            hashMap = hashMap2;
                            i10 = i19;
                        } else {
                            i10 = i19;
                        }
                    }
                    tzVar = tzVar2;
                    i11 = i13;
                } else {
                    i10 = i17;
                    if (i10 == -3) {
                        arrayList = tzVar2.k1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i10 == -2) {
                        arrayList = tzVar2.j1;
                        if (!arrayList.isEmpty() && !tzVar2.M2) {
                            z10 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i10 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i10);
                            ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet2.documents;
                            if (!z10 && !tzVar2.M2) {
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
                            if (i10 == tzVar2.e1) {
                                tzVar2.f1 = this.s;
                                if (arrayList.isEmpty()) {
                                    sparseArray.put(i16, tL_messages_stickerSet);
                                    int i22 = i16 + 1;
                                    sparseIntArray.put(this.s, i16);
                                    sparseArray.put(i22, tL_messages_stickerSet);
                                    i16 += 2;
                                    sparseIntArray.put(this.s + 1, i22);
                                    int i23 = this.s;
                                    this.s = i23 + 1;
                                    sparseArray2.put(i23, tL_messages_stickerSet);
                                    int i24 = this.s;
                                    this.s = i24 + 1;
                                    sparseArray2.put(i24, "group");
                                    tzVar = tzVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                tzVar = tzVar2;
                                int ceil = (int) Math.ceil(arrayList.size() / this.d);
                                if (tL_messages_stickerSet != null) {
                                    sparseArray2.put(this.s, tL_messages_stickerSet);
                                } else {
                                    sparseArray2.put(this.s, arrayList);
                                }
                                sparseIntArray.put(this.s, i16);
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
                                    sparseIntArray.put(i26 + this.s, (i25 / this.d) + i16 + 1);
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
                                        sparseArray.put(i16 + i28, tL_messages_stickerSet);
                                    } else if (i10 == -1) {
                                        sparseArray.put(i16 + i28, "premium");
                                    } else if (i10 == -2) {
                                        sparseArray.put(i16 + i28, "recent");
                                    } else {
                                        sparseArray.put(i16 + i28, "fav");
                                    }
                                    i28++;
                                }
                                this.s = (this.d * ceil) + 1 + this.s;
                                i16 += i12;
                            }
                            tzVar = tzVar2;
                        }
                        tzVar = tzVar2;
                        i11 = i13;
                    }
                    tL_messages_stickerSet = null;
                    i11 = i13;
                    if (i10 == tzVar2.e1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    tzVar = tzVar2;
                }
                hashMap = hashMap2;
            }
            i17 = i10 + 1;
            i13 = i11;
            tzVar2 = tzVar;
            hashMap2 = hashMap;
            i14 = 0;
            i15 = -5;
        }
    }

    @Override // s4.g0
    public final int h() {
        int i10 = this.s;
        if (i10 != 0) {
            return i10 + 1;
        }
        return 0;
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final void l() {
        G();
        super.l();
    }

    @Override // s4.g0
    public final void t(int i10, int i11) {
        G();
        super.t(i10, i11);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        tz tzVar = this.v;
        int i11 = tzVar.c1;
        int i12 = b1Var.f;
        View view = b1Var.a;
        SparseArray sparseArray = this.h;
        if (i12 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
            e8Var.d(document, null, this.n.get(i10), null, false, false);
            e8Var.setRecent(tzVar.j1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        if (i12 == 1) {
            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
            if (i10 != this.s) {
                k3Var.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            int i13 = this.r.get(i10 - 1, TLObject.FLAG_31);
            if (i13 == Integer.MIN_VALUE) {
                k3Var.setHeight(1);
                return;
            }
            Object obj = this.e.get(i13);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? tzVar.j1 : tzVar.k1;
            }
            if (arrayList == null) {
                k3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                k3Var.setHeight(AndroidUtilities.dp(8.0f));
                return;
            } else {
                int C = org.telegram.messenger.wh.C(82.0f, (int) Math.ceil(arrayList.size() / this.d), tzVar.h.getHeight());
                k3Var.setHeight(C > 0 ? C : 1);
                return;
            }
        }
        final int i14 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                ((org.telegram.ui.Cells.m8) view).setIsLast(i10 == this.s - 1);
                return;
            } else {
                if (i12 != 5) {
                    return;
                }
                ((org.telegram.ui.Cells.n8) view).c(LocaleController.getString(MediaDataController.getInstance(i11).loadFeaturedPremium ? R.string.FeaturedStickersPremium : R.string.FeaturedStickers), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
        n8Var.setHeaderOnClick(null);
        if (i10 == tzVar.f1) {
            int i15 = (tzVar.g1 && tzVar.h1 == null) ? 0 : tzVar.h1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat chat = tzVar.J1 != null ? MessagesController.getInstance(i11).getChat(Long.valueOf(tzVar.J1.id)) : null;
            n8Var.b(i15, LocaleController.formatString("CurrentGroupStickers", R.string.CurrentGroupStickers, chat != null ? chat.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i10);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                n8Var.b(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !tzVar.M2) {
                    n8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jz
                        public final /* synthetic */ kz b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    this.b.v.t1.d(tL_messages_stickerSet.set, null, true);
                                    break;
                                default:
                                    this.b.v.t1.d(tL_messages_stickerSet.set, null, false);
                                    break;
                            }
                        }
                    });
                }
                n8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jz
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (r3) {
                            case 0:
                                this.b.v.t1.d(tL_messages_stickerSet.set, null, true);
                                break;
                            default:
                                this.b.v.t1.d(tL_messages_stickerSet.set, null, false);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (obj2 == tzVar.j1) {
            n8Var.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
        } else if (obj2 == tzVar.k1) {
            n8Var.b(0, LocaleController.getString(R.string.FavoriteStickers));
        } else if (obj2 == tzVar.l1) {
            n8Var.b(0, LocaleController.getString(R.string.PremiumStickers));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        final int i11 = 0;
        final int i12 = 1;
        boolean z10 = true;
        boolean z11 = true;
        tz tzVar = this.v;
        Context context = this.c;
        View view = null;
        switch (i10) {
            case 0:
                view = new hg.d2(z11 ? 1 : 0, context, tzVar.Z1, z10 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(this.c, false, false, tzVar.Z1, tzVar.i2);
                n8Var.setOnIconClickListener(new ca(12, this, n8Var));
                view = n8Var;
                break;
            case 3:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
                m8Var.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                m8Var.addView(textView, w7.z5.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                m8Var.a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.q.m(14.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false), 1, textView2);
                textView2.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                m8Var.addView(textView2, w7.z5.t(-2, 28, 51, 17, 10, 14, 8));
                m8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.iz
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                tz tzVar2 = this.b.v;
                                uy uyVar = tzVar2.t1;
                                if (uyVar != null) {
                                    uyVar.y(tzVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                tz tzVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(tzVar3.c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(tzVar3.c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    kz kzVar = tzVar3.y0;
                                    if (kzVar != null) {
                                        kzVar.t(1, 2);
                                    }
                                    tzVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.b.v.Y1;
                                if (n2Var instanceof org.telegram.ui.sn) {
                                    ((org.telegram.ui.sn) n2Var).da();
                                    break;
                                }
                                break;
                        }
                    }
                });
                m8Var.setLayoutParams(new s4.o0(-1, -2));
                view = m8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new s4.o0(-1, tzVar.b1));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(this.c, false, false, tzVar.Z1, tzVar.i2);
                n8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.iz
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i12) {
                            case 0:
                                tz tzVar2 = this.b.v;
                                uy uyVar = tzVar2.t1;
                                if (uyVar != null) {
                                    uyVar.y(tzVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                tz tzVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(tzVar3.c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(tzVar3.c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    kz kzVar = tzVar3.y0;
                                    if (kzVar != null) {
                                        kzVar.t(1, 2);
                                    }
                                    tzVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.b.v.Y1;
                                if (n2Var instanceof org.telegram.ui.sn) {
                                    ((org.telegram.ui.sn) n2Var).da();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = n8Var2;
                break;
            case 6:
                rz rzVar = new rz(tzVar, false);
                tzVar.F0 = rzVar;
                ai.u1 u1Var = new ai.u1(tzVar, context, rzVar);
                u1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                u1Var.setClipToPadding(false);
                u1Var.i(new ci.l(4));
                u1Var.setOnItemClickListener(new j(this, 6));
                u1Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(52.0f)));
                view = u1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i13 = org.telegram.ui.ActionBar.h6.Me;
                linearLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.12f, tzVar.A(i13))));
                w7.b6.b(linearLayout, 0.1f, 1.5f);
                final int i14 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.iz
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i14) {
                            case 0:
                                tz tzVar2 = this.b.v;
                                uy uyVar = tzVar2.t1;
                                if (uyVar != null) {
                                    uyVar.y(tzVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                tz tzVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(tzVar3.c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(tzVar3.c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    kz kzVar = tzVar3.y0;
                                    if (kzVar != null) {
                                        kzVar.t(1, 2);
                                    }
                                    tzVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.b.v.Y1;
                                if (n2Var instanceof org.telegram.ui.sn) {
                                    ((org.telegram.ui.sn) n2Var).da();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(tzVar.A(i13), PorterDuff.Mode.SRC_IN));
                linearLayout.addView(imageView, w7.z5.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(tzVar.A(i13));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout.addView(textView3, w7.z5.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, w7.z5.a(-1.0f, 8.0f, 8.0f, 8.0f, 8.0f, -1, 119));
                view = frameLayout;
                break;
        }
        return new sl0(view);
    }
}
