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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dz extends sl0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ mz v;

    public dz(mz mzVar, Context context) {
        this.v = mzVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.a instanceof tl0;
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
        mz mzVar = this.v;
        ArrayList arrayList = mzVar.a1;
        Object obj = this.h.get(i10);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i12 = mzVar.D1;
            if (i12 >= 0) {
                return i12;
            }
            int i13 = mzVar.C1;
            if (i13 >= 0) {
                return i13;
            }
            return 0;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = mzVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.d = measuredWidth / AndroidUtilities.dp(72.0f);
        }
        int i14 = this.r.get(i10, TLObject.FLAG_31);
        if (i14 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i11 = mzVar.B1;
        } else {
            Object obj2 = this.e.get(i14);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? mzVar.F1 : "recent".equals(obj2) ? mzVar.C1 : mzVar.D1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i11 = mzVar.B1;
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
        mz mzVar;
        HashMap hashMap;
        int i12;
        mz mzVar2 = this.v;
        int i13 = mzVar2.Z0;
        if (mzVar2.K2) {
            return;
        }
        int measuredWidth = mzVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = AndroidUtilities.displaySize.x;
        }
        int dp = measuredWidth / AndroidUtilities.dp(72.0f);
        this.d = dp;
        mzVar2.B0.y1(dp);
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
        ArrayList arrayList2 = mzVar2.a1;
        int i15 = -5;
        int i16 = -5;
        int i17 = 0;
        boolean z4 = false;
        while (i16 < arrayList2.size()) {
            if (i16 == i15) {
                int i18 = this.s;
                this.s = i18 + 1;
                sparseArray2.put(i18, "search");
                i17++;
                mzVar = mzVar2;
                i11 = i13;
                hashMap = hashMap2;
                i10 = i16;
            } else {
                if (i16 == -4) {
                    MediaDataController mediaDataController = MediaDataController.getInstance(i13);
                    SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i13);
                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                    if (mzVar2.j1.isEmpty()) {
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
                            mzVar = mzVar2;
                            i11 = i13;
                            hashMap = hashMap2;
                            i10 = i19;
                        } else {
                            i10 = i19;
                        }
                    }
                    mzVar = mzVar2;
                    i11 = i13;
                } else {
                    i10 = i16;
                    if (i10 == -3) {
                        arrayList = mzVar2.h1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i10 == -2) {
                        arrayList = mzVar2.g1;
                        if (!arrayList.isEmpty() && !mzVar2.J2) {
                            z4 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i10 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i10);
                            ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet2.documents;
                            if (!z4 && !mzVar2.J2) {
                                ArrayList<TLRPC.Document> arrayList4 = new ArrayList<>(arrayList3);
                                arrayList4.add(0, new TLRPC.TL_documentEmpty());
                                arrayList3 = arrayList4;
                                z4 = true;
                            }
                            hashMap2.put(tL_messages_stickerSet2, Integer.valueOf(this.s));
                            ArrayList<TLRPC.Document> arrayList5 = arrayList3;
                            tL_messages_stickerSet = tL_messages_stickerSet2;
                            arrayList = arrayList5;
                            obj = null;
                            i11 = i13;
                            if (i10 == mzVar2.b1) {
                                mzVar2.c1 = this.s;
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
                                    mzVar = mzVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                mzVar = mzVar2;
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
                            mzVar = mzVar2;
                        }
                        mzVar = mzVar2;
                        i11 = i13;
                    }
                    tL_messages_stickerSet = null;
                    i11 = i13;
                    if (i10 == mzVar2.b1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    mzVar = mzVar2;
                }
                hashMap = hashMap2;
            }
            i16 = i10 + 1;
            i13 = i11;
            mzVar2 = mzVar;
            hashMap2 = hashMap;
            i14 = 0;
            i15 = -5;
        }
    }

    @Override // f2.p0
    public final int h() {
        int i10 = this.s;
        if (i10 != 0) {
            return i10 + 1;
        }
        return 0;
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void l() {
        G();
        super.l();
    }

    @Override // f2.p0
    public final void t(int i10, int i11) {
        G();
        super.t(i10, i11);
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        mz mzVar = this.v;
        int i11 = mzVar.Z0;
        int i12 = m1Var.f;
        View view = m1Var.a;
        SparseArray sparseArray = this.h;
        if (i12 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
            d8Var.d(document, null, this.n.get(i10), null, false, false);
            d8Var.setRecent(mzVar.g1.contains(document));
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
                arrayList = "recent".equals(obj) ? mzVar.g1 : mzVar.h1;
            }
            if (arrayList == null) {
                k3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                k3Var.setHeight(AndroidUtilities.dp(8.0f));
                return;
            } else {
                int z4 = org.telegram.ui.b.z(82.0f, (int) Math.ceil(arrayList.size() / this.d), mzVar.h.getHeight());
                k3Var.setHeight(z4 > 0 ? z4 : 1);
                return;
            }
        }
        final int i14 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                ((org.telegram.ui.Cells.l8) view).setIsLast(i10 == this.s - 1);
                return;
            } else {
                if (i12 != 5) {
                    return;
                }
                ((org.telegram.ui.Cells.m8) view).c(LocaleController.getString(MediaDataController.getInstance(i11).loadFeaturedPremium ? R.string.FeaturedStickersPremium : R.string.FeaturedStickers), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        m8Var.setHeaderOnClick(null);
        if (i10 == mzVar.c1) {
            int i15 = (mzVar.d1 && mzVar.e1 == null) ? 0 : mzVar.e1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat chat = mzVar.G1 != null ? MessagesController.getInstance(i11).getChat(Long.valueOf(mzVar.G1.id)) : null;
            m8Var.b(i15, LocaleController.formatString("CurrentGroupStickers", R.string.CurrentGroupStickers, chat != null ? chat.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i10);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                m8Var.b(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !mzVar.J2) {
                    m8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bz
                        public final /* synthetic */ dz b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    this.b.v.q1.d(tL_messages_stickerSet.set, null, true);
                                    break;
                                default:
                                    this.b.v.q1.d(tL_messages_stickerSet.set, null, false);
                                    break;
                            }
                        }
                    });
                }
                m8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bz
                    public final /* synthetic */ dz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (r3) {
                            case 0:
                                this.b.v.q1.d(tL_messages_stickerSet.set, null, true);
                                break;
                            default:
                                this.b.v.q1.d(tL_messages_stickerSet.set, null, false);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (obj2 == mzVar.g1) {
            m8Var.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
        } else if (obj2 == mzVar.h1) {
            m8Var.b(0, LocaleController.getString(R.string.FavoriteStickers));
        } else if (obj2 == mzVar.i1) {
            m8Var.b(0, LocaleController.getString(R.string.PremiumStickers));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        final int i11 = 2;
        int i12 = 17;
        final int i13 = 0;
        final int i14 = 1;
        boolean z4 = true;
        mz mzVar = this.v;
        Context context = this.c;
        View view = null;
        switch (i10) {
            case 0:
                view = new cz(i13, context, mzVar.W1, z4 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(this.c, false, false, mzVar.W1, mzVar.f2);
                m8Var.setOnIconClickListener(new w2(i12, this, m8Var));
                view = m8Var;
                break;
            case 3:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
                l8Var.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                l8Var.addView(textView, k7.c6.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                l8Var.a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false), 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                l8Var.addView(textView2, k7.c6.t(-2, 28, 51, 17, 10, 14, 8));
                l8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.az
                    public final /* synthetic */ dz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                mz mzVar2 = this.b.v;
                                my myVar = mzVar2.q1;
                                if (myVar != null) {
                                    myVar.y(mzVar2.G1.id);
                                    break;
                                }
                                break;
                            case 1:
                                mz mzVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(mzVar3.Z0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(mzVar3.Z0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    dz dzVar = mzVar3.v0;
                                    if (dzVar != null) {
                                        dzVar.t(1, 2);
                                    }
                                    mzVar3.Z(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.p2 p2Var = this.b.v.V1;
                                if (p2Var instanceof org.telegram.ui.xn) {
                                    ((org.telegram.ui.xn) p2Var).Y9();
                                    break;
                                }
                                break;
                        }
                    }
                });
                l8Var.setLayoutParams(new f2.x0(-1, -2));
                view = l8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new f2.x0(-1, mzVar.Y0));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(this.c, false, false, mzVar.W1, mzVar.f2);
                m8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.az
                    public final /* synthetic */ dz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i14) {
                            case 0:
                                mz mzVar2 = this.b.v;
                                my myVar = mzVar2.q1;
                                if (myVar != null) {
                                    myVar.y(mzVar2.G1.id);
                                    break;
                                }
                                break;
                            case 1:
                                mz mzVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(mzVar3.Z0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(mzVar3.Z0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    dz dzVar = mzVar3.v0;
                                    if (dzVar != null) {
                                        dzVar.t(1, 2);
                                    }
                                    mzVar3.Z(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.p2 p2Var = this.b.v.V1;
                                if (p2Var instanceof org.telegram.ui.xn) {
                                    ((org.telegram.ui.xn) p2Var).Y9();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = m8Var2;
                break;
            case 6:
                kz kzVar = new kz(mzVar, false);
                mzVar.C0 = kzVar;
                mh.d1 d1Var = new mh.d1(mzVar, context, kzVar);
                d1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                d1Var.setClipToPadding(false);
                d1Var.i(new oh.j(i11));
                d1Var.setOnItemClickListener(new k(this, 6));
                d1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(52.0f)));
                view = d1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i15 = org.telegram.ui.ActionBar.k6.Me;
                linearLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(dp, org.telegram.ui.ActionBar.k6.l1(0.12f, mzVar.A(i15))));
                k7.e6.b(linearLayout, 0.1f, 1.5f);
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.az
                    public final /* synthetic */ dz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i11) {
                            case 0:
                                mz mzVar2 = this.b.v;
                                my myVar = mzVar2.q1;
                                if (myVar != null) {
                                    myVar.y(mzVar2.G1.id);
                                    break;
                                }
                                break;
                            case 1:
                                mz mzVar3 = this.b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(mzVar3.Z0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(mzVar3.Z0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                    dz dzVar = mzVar3.v0;
                                    if (dzVar != null) {
                                        dzVar.t(1, 2);
                                    }
                                    mzVar3.Z(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.p2 p2Var = this.b.v.V1;
                                if (p2Var instanceof org.telegram.ui.xn) {
                                    ((org.telegram.ui.xn) p2Var).Y9();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(mzVar.A(i15), PorterDuff.Mode.SRC_IN));
                linearLayout.addView(imageView, k7.c6.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(mzVar.A(i15));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout.addView(textView3, k7.c6.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, k7.c6.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new fl0(view);
    }
}
