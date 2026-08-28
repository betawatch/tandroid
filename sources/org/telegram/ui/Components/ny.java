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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ny extends vk0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ wy v;

    public ny(wy wyVar, Context context) {
        this.v = wyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.a instanceof wk0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i9) {
        int indexOf;
        int i10;
        wy wyVar = this.v;
        ArrayList arrayList = wyVar.Z0;
        Object obj = this.h.get(i9);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i11 = wyVar.C1;
            if (i11 >= 0) {
                return i11;
            }
            int i12 = wyVar.B1;
            if (i12 >= 0) {
                return i12;
            }
            return 0;
        }
        if (i9 == 0) {
            i9 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = wyVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.d = measuredWidth / AndroidUtilities.dp(72.0f);
        }
        int i13 = this.r.get(i9, TLObject.FLAG_31);
        if (i13 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i10 = wyVar.A1;
        } else {
            Object obj2 = this.e.get(i13);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? wyVar.E1 : "recent".equals(obj2) ? wyVar.B1 : wyVar.C1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i10 = wyVar.A1;
        }
        return indexOf + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        int i9;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        Object obj;
        int i10;
        wy wyVar;
        HashMap hashMap;
        int i11;
        wy wyVar2 = this.v;
        int i12 = wyVar2.Y0;
        if (wyVar2.J2) {
            return;
        }
        int measuredWidth = wyVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = AndroidUtilities.displaySize.x;
        }
        int dp = measuredWidth / AndroidUtilities.dp(72.0f);
        this.d = dp;
        wyVar2.A0.y1(dp);
        SparseArray sparseArray = this.e;
        sparseArray.clear();
        HashMap hashMap2 = this.f;
        hashMap2.clear();
        SparseIntArray sparseIntArray = this.r;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.h;
        sparseArray2.clear();
        int i13 = 0;
        this.s = 0;
        ArrayList arrayList2 = wyVar2.Z0;
        int i14 = -5;
        int i15 = -5;
        int i16 = 0;
        boolean z10 = false;
        while (i15 < arrayList2.size()) {
            if (i15 == i14) {
                int i17 = this.s;
                this.s = i17 + 1;
                sparseArray2.put(i17, "search");
                i16++;
                wyVar = wyVar2;
                i10 = i12;
                hashMap = hashMap2;
                i9 = i15;
            } else {
                if (i15 == -4) {
                    MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                    SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i12);
                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                    if (wyVar2.i1.isEmpty()) {
                        i9 = i15;
                    } else {
                        int i18 = i15;
                        if (emojiSettings.getLong("featured_hidden", 0L) != featuredStickerSets.get(i13).set.id) {
                            int i19 = this.s;
                            this.s = i19 + 1;
                            sparseArray2.put(i19, "trend1");
                            int i20 = this.s;
                            this.s = i20 + 1;
                            sparseArray2.put(i20, "trend2");
                            i16 += 2;
                            wyVar = wyVar2;
                            i10 = i12;
                            hashMap = hashMap2;
                            i9 = i18;
                        } else {
                            i9 = i18;
                        }
                    }
                    wyVar = wyVar2;
                    i10 = i12;
                } else {
                    i9 = i15;
                    if (i9 == -3) {
                        arrayList = wyVar2.g1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i9 == -2) {
                        arrayList = wyVar2.f1;
                        if (!arrayList.isEmpty() && !wyVar2.I2) {
                            z10 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i9 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i9);
                            ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet2.documents;
                            if (!z10 && !wyVar2.I2) {
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
                            i10 = i12;
                            if (i9 == wyVar2.a1) {
                                wyVar2.b1 = this.s;
                                if (arrayList.isEmpty()) {
                                    sparseArray.put(i16, tL_messages_stickerSet);
                                    int i21 = i16 + 1;
                                    sparseIntArray.put(this.s, i16);
                                    sparseArray.put(i21, tL_messages_stickerSet);
                                    i16 += 2;
                                    sparseIntArray.put(this.s + 1, i21);
                                    int i22 = this.s;
                                    this.s = i22 + 1;
                                    sparseArray2.put(i22, tL_messages_stickerSet);
                                    int i23 = this.s;
                                    this.s = i23 + 1;
                                    sparseArray2.put(i23, "group");
                                    wyVar = wyVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                wyVar = wyVar2;
                                int ceil = (int) Math.ceil(arrayList.size() / this.d);
                                if (tL_messages_stickerSet != null) {
                                    sparseArray2.put(this.s, tL_messages_stickerSet);
                                } else {
                                    sparseArray2.put(this.s, arrayList);
                                }
                                sparseIntArray.put(this.s, i16);
                                int i24 = 0;
                                while (i24 < arrayList.size()) {
                                    int i25 = i24 + 1;
                                    int i26 = i25 + this.s;
                                    HashMap hashMap3 = hashMap2;
                                    sparseArray2.put(i26, arrayList.get(i24));
                                    SparseArray sparseArray3 = this.n;
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray3.put(i26, tL_messages_stickerSet);
                                    } else {
                                        sparseArray3.put(i26, obj);
                                    }
                                    sparseIntArray.put(i25 + this.s, (i24 / this.d) + i16 + 1);
                                    i24 = i25;
                                    hashMap2 = hashMap3;
                                }
                                hashMap = hashMap2;
                                int i27 = 0;
                                while (true) {
                                    i11 = ceil + 1;
                                    if (i27 >= i11) {
                                        break;
                                    }
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray.put(i16 + i27, tL_messages_stickerSet);
                                    } else if (i9 == -1) {
                                        sparseArray.put(i16 + i27, "premium");
                                    } else if (i9 == -2) {
                                        sparseArray.put(i16 + i27, "recent");
                                    } else {
                                        sparseArray.put(i16 + i27, "fav");
                                    }
                                    i27++;
                                }
                                this.s = (this.d * ceil) + 1 + this.s;
                                i16 += i11;
                            }
                            wyVar = wyVar2;
                        }
                        wyVar = wyVar2;
                        i10 = i12;
                    }
                    tL_messages_stickerSet = null;
                    i10 = i12;
                    if (i9 == wyVar2.a1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    wyVar = wyVar2;
                }
                hashMap = hashMap2;
            }
            i15 = i9 + 1;
            i12 = i10;
            wyVar2 = wyVar;
            hashMap2 = hashMap;
            i13 = 0;
            i14 = -5;
        }
    }

    @Override // f2.r0
    public final int h() {
        int i9 = this.s;
        if (i9 != 0) {
            return i9 + 1;
        }
        return 0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 4;
        }
        Object obj = this.h.get(i9);
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

    @Override // f2.r0
    public final void l() {
        G();
        super.l();
    }

    @Override // f2.r0
    public final void t(int i9, int i10) {
        G();
        super.t(i9, i10);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        wy wyVar = this.v;
        int i10 = wyVar.Y0;
        int i11 = q1Var.f;
        View view = q1Var.a;
        SparseArray sparseArray = this.h;
        if (i11 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i9);
            org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
            d8Var.d(document, null, this.n.get(i9), null, false, false);
            d8Var.setRecent(wyVar.f1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        if (i11 == 1) {
            org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) view;
            if (i9 != this.s) {
                l3Var.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            int i12 = this.r.get(i9 - 1, TLObject.FLAG_31);
            if (i12 == Integer.MIN_VALUE) {
                l3Var.setHeight(1);
                return;
            }
            Object obj = this.e.get(i12);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? wyVar.f1 : wyVar.g1;
            }
            if (arrayList == null) {
                l3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                l3Var.setHeight(AndroidUtilities.dp(8.0f));
                return;
            } else {
                int A = org.telegram.messenger.ll.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), wyVar.h.getHeight());
                l3Var.setHeight(A > 0 ? A : 1);
                return;
            }
        }
        final int i13 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                ((org.telegram.ui.Cells.l8) view).setIsLast(i9 == this.s - 1);
                return;
            } else {
                if (i11 != 5) {
                    return;
                }
                ((org.telegram.ui.Cells.m8) view).c(LocaleController.getString(MediaDataController.getInstance(i10).loadFeaturedPremium ? R.string.FeaturedStickersPremium : R.string.FeaturedStickers), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        m8Var.setHeaderOnClick(null);
        if (i9 == wyVar.b1) {
            int i14 = (wyVar.c1 && wyVar.d1 == null) ? 0 : wyVar.d1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat chat = wyVar.F1 != null ? MessagesController.getInstance(i10).getChat(Long.valueOf(wyVar.F1.id)) : null;
            m8Var.b(i14, LocaleController.formatString("CurrentGroupStickers", R.string.CurrentGroupStickers, chat != null ? chat.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i9);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                m8Var.b(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !wyVar.I2) {
                    m8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.my
                        public final /* synthetic */ ny b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i13) {
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
                m8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.my
                    public final /* synthetic */ ny b;

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
        if (obj2 == wyVar.f1) {
            m8Var.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
        } else if (obj2 == wyVar.g1) {
            m8Var.b(0, LocaleController.getString(R.string.FavoriteStickers));
        } else if (obj2 == wyVar.h1) {
            m8Var.b(0, LocaleController.getString(R.string.PremiumStickers));
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        final int i10 = 0;
        final int i11 = 1;
        boolean z10 = true;
        boolean z11 = true;
        wy wyVar = this.v;
        Context context = this.c;
        View view = null;
        switch (i9) {
            case 0:
                view = new of.x1(z11 ? 1 : 0, context, wyVar.V1, z10 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.l3(context);
                break;
            case 2:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(this.c, false, false, wyVar.V1, wyVar.e2);
                m8Var.setOnIconClickListener(new s2(19, this, m8Var));
                view = m8Var;
                break;
            case 3:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
                l8Var.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                l8Var.addView(textView, g7.e6.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                l8Var.a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.l0.q(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false), 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                l8Var.addView(textView2, g7.e6.t(-2, 28, 51, 17, 10, 14, 8));
                l8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ly
                    public final /* synthetic */ ny b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                wy wyVar2 = this.b.v;
                                wx wxVar = wyVar2.p1;
                                if (wxVar != null) {
                                    wxVar.y(wyVar2.F1.id);
                                    break;
                                }
                                break;
                            case 1:
                                wy wyVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(wyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(wyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    ny nyVar = wyVar3.u0;
                                    if (nyVar != null) {
                                        nyVar.t(1, 2);
                                    }
                                    wyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.o2 o2Var = this.b.v.U1;
                                if (o2Var instanceof org.telegram.ui.qn) {
                                    ((org.telegram.ui.qn) o2Var).Y9();
                                    break;
                                }
                                break;
                        }
                    }
                });
                l8Var.setLayoutParams(new f2.a1(-1, -2));
                view = l8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new f2.a1(-1, wyVar.X0));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(this.c, false, false, wyVar.V1, wyVar.e2);
                m8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ly
                    public final /* synthetic */ ny b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i11) {
                            case 0:
                                wy wyVar2 = this.b.v;
                                wx wxVar = wyVar2.p1;
                                if (wxVar != null) {
                                    wxVar.y(wyVar2.F1.id);
                                    break;
                                }
                                break;
                            case 1:
                                wy wyVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(wyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(wyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    ny nyVar = wyVar3.u0;
                                    if (nyVar != null) {
                                        nyVar.t(1, 2);
                                    }
                                    wyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.o2 o2Var = this.b.v.U1;
                                if (o2Var instanceof org.telegram.ui.qn) {
                                    ((org.telegram.ui.qn) o2Var).Y9();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = m8Var2;
                break;
            case 6:
                uy uyVar = new uy(wyVar, false);
                wyVar.B0 = uyVar;
                gh.f1 f1Var = new gh.f1(wyVar, context, uyVar);
                f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                f1Var.setClipToPadding(false);
                f1Var.i(new ih.l(3));
                f1Var.setOnItemClickListener(new j(this, 6));
                f1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(52.0f)));
                view = f1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i12 = org.telegram.ui.ActionBar.f6.Me;
                linearLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(0.12f, wyVar.z(i12))));
                g7.g6.b(linearLayout, 0.1f, 1.5f);
                final int i13 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ly
                    public final /* synthetic */ ny b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i13) {
                            case 0:
                                wy wyVar2 = this.b.v;
                                wx wxVar = wyVar2.p1;
                                if (wxVar != null) {
                                    wxVar.y(wyVar2.F1.id);
                                    break;
                                }
                                break;
                            case 1:
                                wy wyVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(wyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(wyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    ny nyVar = wyVar3.u0;
                                    if (nyVar != null) {
                                        nyVar.t(1, 2);
                                    }
                                    wyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.o2 o2Var = this.b.v.U1;
                                if (o2Var instanceof org.telegram.ui.qn) {
                                    ((org.telegram.ui.qn) o2Var).Y9();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(wyVar.z(i12), PorterDuff.Mode.SRC_IN));
                linearLayout.addView(imageView, g7.e6.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(wyVar.z(i12));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout.addView(textView3, g7.e6.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, g7.e6.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new ik0(view);
    }
}
