package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jz extends lm0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ sz v;

    public jz(sz szVar, Context context) {
        this.v = szVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.a instanceof mm0;
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
        sz szVar = this.v;
        ArrayList arrayList = szVar.d1;
        Object obj = this.h.get(i10);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i12 = szVar.G1;
            if (i12 >= 0) {
                return i12;
            }
            int i13 = szVar.F1;
            if (i13 >= 0) {
                return i13;
            }
            return 0;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = szVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.d = measuredWidth / AndroidUtilities.dp(72.0f);
        }
        int i14 = this.r.get(i10, TLObject.FLAG_31);
        if (i14 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i11 = szVar.E1;
        } else {
            Object obj2 = this.e.get(i14);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? szVar.I1 : "recent".equals(obj2) ? szVar.F1 : szVar.G1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i11 = szVar.E1;
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
        sz szVar;
        HashMap hashMap;
        int i12;
        sz szVar2 = this.v;
        int i13 = szVar2.c1;
        if (szVar2.R2) {
            return;
        }
        int measuredWidth = szVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = AndroidUtilities.displaySize.x;
        }
        int dp = measuredWidth / AndroidUtilities.dp(72.0f);
        this.d = dp;
        szVar2.E0.z1(dp);
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
        ArrayList arrayList2 = szVar2.d1;
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
                szVar = szVar2;
                i11 = i13;
                hashMap = hashMap2;
                i10 = i17;
            } else {
                if (i17 == -4) {
                    MediaDataController mediaDataController = MediaDataController.getInstance(i13);
                    SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i13);
                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                    if (szVar2.m1.isEmpty()) {
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
                            szVar = szVar2;
                            i11 = i13;
                            hashMap = hashMap2;
                            i10 = i19;
                        } else {
                            i10 = i19;
                        }
                    }
                    szVar = szVar2;
                    i11 = i13;
                } else {
                    i10 = i17;
                    if (i10 == -3) {
                        arrayList = szVar2.k1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i10 == -2) {
                        arrayList = szVar2.j1;
                        if (!arrayList.isEmpty() && !szVar2.Q2) {
                            z10 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i10 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i10);
                            ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet2.documents;
                            if (!z10 && !szVar2.Q2) {
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
                            if (i10 == szVar2.e1) {
                                szVar2.f1 = this.s;
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
                                    szVar = szVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                szVar = szVar2;
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
                            szVar = szVar2;
                        }
                        szVar = szVar2;
                        i11 = i13;
                    }
                    tL_messages_stickerSet = null;
                    i11 = i13;
                    if (i10 == szVar2.e1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    szVar = szVar2;
                }
                hashMap = hashMap2;
            }
            i17 = i10 + 1;
            i13 = i11;
            szVar2 = szVar;
            hashMap2 = hashMap;
            i14 = 0;
            i15 = -5;
        }
    }

    @Override // s4.h0
    public final int h() {
        int i10 = this.s;
        if (i10 != 0) {
            return i10 + 1;
        }
        return 0;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void l() {
        G();
        super.l();
    }

    @Override // s4.h0
    public final void t(int i10, int i11) {
        G();
        super.t(i10, i11);
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        sz szVar = this.v;
        int i11 = szVar.c1;
        int i12 = e1Var.f;
        View view = e1Var.a;
        SparseArray sparseArray = this.h;
        if (i12 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
            i8Var.d(document, null, this.n.get(i10), null, false, false);
            i8Var.setRecent(szVar.j1.contains(document));
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
                arrayList = "recent".equals(obj) ? szVar.j1 : szVar.k1;
            }
            if (arrayList == null) {
                i3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                i3Var.setHeight(AndroidUtilities.dp(8.0f));
                return;
            } else {
                int C = org.telegram.messenger.vh.C(82.0f, (int) Math.ceil(arrayList.size() / this.d), szVar.h.getHeight());
                i3Var.setHeight(C > 0 ? C : 1);
                return;
            }
        }
        final int i14 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                ((org.telegram.ui.Cells.q8) view).setIsLast(i10 == this.s - 1);
                return;
            } else {
                if (i12 != 5) {
                    return;
                }
                ((org.telegram.ui.Cells.s8) view).b(LocaleController.getString(MediaDataController.getInstance(i11).loadFeaturedPremium ? R.string.FeaturedStickersPremium : R.string.FeaturedStickers), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
        s8Var.setHeaderOnClick(null);
        if (i10 == szVar.f1) {
            int i15 = (szVar.g1 && szVar.h1 == null) ? 0 : szVar.h1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat chat = szVar.J1 != null ? MessagesController.getInstance(i11).getChat(Long.valueOf(szVar.J1.id)) : null;
            s8Var.a(i15, LocaleController.formatString("CurrentGroupStickers", R.string.CurrentGroupStickers, chat != null ? chat.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i10);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                s8Var.a(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !szVar.Q2) {
                    s8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.iz
                        public final /* synthetic */ jz b;

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
                s8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.iz
                    public final /* synthetic */ jz b;

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
        if (obj2 == szVar.j1) {
            s8Var.b(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
        } else if (obj2 == szVar.k1) {
            s8Var.a(0, LocaleController.getString(R.string.FavoriteStickers));
        } else if (obj2 == szVar.l1) {
            s8Var.a(0, LocaleController.getString(R.string.PremiumStickers));
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        sz szVar = this.v;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        final int i11 = 0;
        final int i12 = 1;
        boolean z10 = true;
        boolean z11 = true;
        Context context = this.c;
        View view = null;
        switch (i10) {
            case 0:
                view = new ig.c2(z11 ? 1 : 0, context, u6Var, z10 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.i3(context);
                break;
            case 2:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(this.c, false, false, szVar.Z1, szVar.i2);
                s8Var.setOnIconClickListener(new ga(14, this, s8Var));
                view = s8Var;
                break;
            case 3:
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
                q8Var.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.We, null);
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                q8Var.addView(textView, gb1.x(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                q8Var.a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.Sh, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                q8Var.addView(textView2, gb1.x(-2, 28, 51, 17, 10, 14, 8));
                q8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hz
                    public final /* synthetic */ jz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                sz szVar2 = this.b.v;
                                ty tyVar = szVar2.t1;
                                if (tyVar != null) {
                                    tyVar.y(szVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                sz szVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(szVar3.c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(szVar3.c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    jz jzVar = szVar3.y0;
                                    if (jzVar != null) {
                                        jzVar.t(1, 2);
                                    }
                                    szVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.r2 r2Var = this.b.v.Y1;
                                if (r2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) r2Var).ia();
                                    break;
                                }
                                break;
                        }
                    }
                });
                q8Var.setLayoutParams(new s4.q0(-1, -2));
                view = q8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new s4.q0(-1, szVar.b1));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(this.c, false, false, szVar.Z1, szVar.i2);
                s8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hz
                    public final /* synthetic */ jz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i12) {
                            case 0:
                                sz szVar2 = this.b.v;
                                ty tyVar = szVar2.t1;
                                if (tyVar != null) {
                                    tyVar.y(szVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                sz szVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(szVar3.c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(szVar3.c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    jz jzVar = szVar3.y0;
                                    if (jzVar != null) {
                                        jzVar.t(1, 2);
                                    }
                                    szVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.r2 r2Var = this.b.v.Y1;
                                if (r2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) r2Var).ia();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = s8Var2;
                break;
            case 6:
                qz qzVar = new qz(szVar, false);
                szVar.F0 = qzVar;
                bi.r1 r1Var = new bi.r1(szVar, context, qzVar);
                r1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                r1Var.setClipToPadding(false);
                r1Var.i(new di.l(4));
                r1Var.setOnItemClickListener(new j(this, 6));
                r1Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(52.0f)));
                view = r1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i13 = org.telegram.ui.ActionBar.y6.Me;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.12f, szVar.A(i13)));
                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.12f, i13);
                linearLayout.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(linearLayout, c02, L, null, u6Var);
                gb1.c(linearLayout, 0.1f, 1.5f);
                final int i14 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hz
                    public final /* synthetic */ jz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i14) {
                            case 0:
                                sz szVar2 = this.b.v;
                                ty tyVar = szVar2.t1;
                                if (tyVar != null) {
                                    tyVar.y(szVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                sz szVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(szVar3.c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(szVar3.c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    jz jzVar = szVar3.y0;
                                    if (jzVar != null) {
                                        jzVar.t(1, 2);
                                    }
                                    szVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.r2 r2Var = this.b.v.Y1;
                                if (r2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) r2Var).ia();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                org.telegram.ui.ActionBar.f7.t(imageView, i13, u6Var, PorterDuff.Mode.SRC_IN);
                linearLayout.addView(imageView, gb1.x(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.t.r(textView3, i13, u6Var, 1, 11.0f);
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout.addView(textView3, gb1.x(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, gb1.h(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new vl0(view);
    }
}
