package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fz extends rl0 {
    public int I;
    public int J;
    public String K;
    public final /* synthetic */ kz N;
    public final ez c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final Context h;
    public int x;
    public boolean y;
    public final SparseArray n = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseArray w = new SparseArray();
    public ArrayList B = new ArrayList();
    public HashMap C = new HashMap();
    public HashMap D = new HashMap();
    public HashMap E = new HashMap();
    public ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public ArrayList H = new ArrayList();
    public final dz L = new dz(this);
    public int M = -1;

    public fz(kz kzVar, Context context) {
        this.N = kzVar;
        this.h = context;
        ez ezVar = new ez(context, kzVar.Z0, new d(this, 12), new fv(this, 3), kzVar.W1);
        this.c = ezVar;
        ezVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        ezVar.setClipToPadding(false);
        ezVar.V2.r = false;
        ezVar.setNestedScrollingEnabled(false);
        ezVar.setDrawSelection(false);
        ezVar.setOnTouchListener(new m.d2(this, 3));
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 7;
    }

    @Override // f2.o0
    public final int h() {
        int i10 = this.x;
        if (i10 != 1) {
            return i10 + 1;
        }
        return 2;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (this.d != 0 && i10 == h() - 1) {
            return 8;
        }
        if (i10 == this.M) {
            return 7;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1 && this.x == 1) {
            return 5;
        }
        Object obj = this.r.get(i10);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
    }

    @Override // f2.o0
    public final void l() {
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        int i12;
        int i13;
        kz kzVar = this.N;
        int i14 = kzVar.Z0;
        bz bzVar = kzVar.v0;
        this.M = -1;
        SparseArray sparseArray = this.n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.w;
        sparseArray3.clear();
        this.x = 0;
        int size = this.D.size() + this.B.size();
        this.c.V2.N(false);
        long j10 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.s;
        if (j10 != 0) {
            ArrayList arrayList = this.f;
            int i15 = this.x;
            this.x = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.x;
                this.x = i16 + 1;
                this.M = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.x;
                this.x = i17 + 1;
                sparseArray2.put(i17, LocaleController.formatPluralString("Stickers", this.e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.E.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.x, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.x + i19;
                int i21 = (i19 / bzVar.d) + i13;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i18);
                sparseArray2.put(i20, document);
                SparseArray sparseArray5 = sparseArray2;
                int i22 = size2;
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i14).getStickerSetById(MediaDataController.getStickerSetId(document));
                if (stickerSetById != null) {
                    sparseArray4.put(i20, stickerSetById);
                }
                sparseIntArray.put(i20, i21);
                i19++;
                i18++;
                size2 = i22;
                sparseArray2 = sparseArray5;
            }
            int ceil = (int) Math.ceil(i19 / bzVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i13 + i23, Integer.valueOf(i19));
            }
            this.x = (ceil * bzVar.d) + this.x;
        } else {
            boolean isEmpty = this.F.isEmpty();
            ArrayList arrayList2 = this.H;
            boolean z11 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            int i24 = this.x;
            this.x = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.x;
                this.x = i25 + 1;
                this.M = i25;
                sparseArray2.put(i25, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (isEmpty) {
                i11 = i14;
                z4 = isEmpty;
                z10 = z11;
                i12 = size;
            } else {
                int i26 = this.x;
                this.x = i26 + 1;
                sparseArray2.put(i26, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                int i27 = i10 + 1;
                int size3 = this.F.size();
                int i28 = 0;
                int i29 = 0;
                while (i28 < size3) {
                    int i30 = i14;
                    ArrayList arrayList3 = (ArrayList) this.F.get(i28);
                    boolean z12 = isEmpty;
                    String str3 = (String) this.E.get(arrayList3);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.x + i29, str3);
                        str = str3;
                    }
                    int size4 = arrayList3.size();
                    boolean z13 = z11;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.x + i29;
                        String str4 = str;
                        int i34 = (i29 / bzVar.d) + i27;
                        ArrayList arrayList4 = arrayList3;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i31);
                        sparseArray2.put(i33, document2);
                        int i35 = size;
                        int i36 = i27;
                        TLRPC.TL_messages_stickerSet stickerSetById2 = MediaDataController.getInstance(i30).getStickerSetById(MediaDataController.getStickerSetId(document2));
                        if (stickerSetById2 != null) {
                            sparseArray4.put(i33, stickerSetById2);
                        }
                        sparseIntArray.put(i33, i34);
                        i29++;
                        i31++;
                        size4 = i32;
                        str = str4;
                        arrayList3 = arrayList4;
                        size = i35;
                        i27 = i36;
                    }
                    i28++;
                    i14 = i30;
                    isEmpty = z12;
                    z11 = z13;
                }
                i11 = i14;
                z4 = isEmpty;
                z10 = z11;
                i12 = size;
                int i37 = i27;
                int ceil2 = (int) Math.ceil(i29 / bzVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i29));
                }
                this.x = (bzVar.d * ceil2) + this.x;
                i10 = i37 + ceil2;
            }
            if (z10) {
                int i39 = this.x;
                this.x = i39 + 1;
                sparseArray2.put(i39, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i40 = i10 + 1;
                String str5 = (String) this.E.get(this.H);
                if (str5 != null) {
                    sparseArray3.put(this.x, str5);
                }
                int size5 = this.H.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.x + i41;
                    int i44 = (i41 / bzVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.H.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i43, stickerSetById3);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / bzVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.x = (ceil3 * bzVar.d) + this.x;
            }
            if (z4 && !z10 && i12 == 0) {
                this.x = 1;
            }
        }
        super.l();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        kz kzVar = this.N;
        LongSparseArray longSparseArray = kzVar.w1;
        LongSparseArray longSparseArray2 = kzVar.v1;
        int i11 = l1Var.f;
        View view = l1Var.a;
        SparseArray sparseArray = this.r;
        boolean z4 = true;
        z4 = true;
        if (i11 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
            d8Var.d(document, null, this.s.get(i10), (String) this.w.get(i10), false, false);
            if (!kzVar.g1.contains(document) && !kzVar.h1.contains(document)) {
                z4 = false;
            }
            d8Var.setRecent(z4);
            return;
        }
        Integer num = null;
        if (i11 == 1) {
            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
            if (i10 != this.x) {
                k3Var.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            int i12 = this.v.get(i10 - 1, TLObject.FLAG_31);
            if (i12 == Integer.MIN_VALUE) {
                k3Var.setHeight(1);
                return;
            }
            Object obj = this.n.get(i12);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
            } else if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num == null) {
                k3Var.setHeight(1);
                return;
            } else if (num.intValue() == 0) {
                k3Var.setHeight(AndroidUtilities.dp(8.0f));
                return;
            } else {
                int z10 = org.telegram.ui.b.z(82.0f, (int) Math.ceil(num.intValue() / kzVar.v0.d), kzVar.h.getHeight());
                k3Var.setHeight(z10 > 0 ? z10 : 1);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            Object obj2 = sparseArray.get(i10);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 instanceof String) {
                    m8Var.b(0, (String) obj2);
                    m8Var.d(0, null);
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            if (!TextUtils.isEmpty(this.K) && this.C.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    m8Var.b(0, stickerSet.title);
                }
                m8Var.d(this.K.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num2 = (Integer) this.D.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num2 != null) {
                m8Var.c(stickerSet2.title, 0, null, num2.intValue(), !TextUtils.isEmpty(this.K) ? this.K.length() : 0);
            }
            m8Var.d(0, null);
            return;
        }
        if (i11 != 3) {
            return;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i10);
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view;
        boolean z11 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) >= 0;
        char c3 = longSparseArray.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
        if (z11 || c3 != 0) {
            if (z11 && r3Var.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
                z11 = false;
            } else if (c3 != 0 && !r3Var.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
            }
        }
        r3Var.b(z11, false);
        int indexOfIgnoreCase = TextUtils.isEmpty(this.K) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.K);
        if (indexOfIgnoreCase >= 0) {
            r3Var.c(stickerSetCovered, false, false, indexOfIgnoreCase, this.K.length(), false);
            return;
        }
        r3Var.c(stickerSetCovered, false, false, 0, 0, false);
        if (TextUtils.isEmpty(this.K) || AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.K) != 0) {
            return;
        }
        String str = stickerSetCovered.set.short_name;
        int length = this.K.length();
        r3Var.C = str;
        r3Var.D = length;
        r3Var.f();
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View azVar;
        ViewGroup u2Var;
        boolean z4 = true;
        Context context = this.h;
        kz kzVar = this.N;
        switch (i10) {
            case 0:
                azVar = new az(1, context, kzVar.W1, z4);
                break;
            case 1:
                azVar = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                azVar = new org.telegram.ui.Cells.m8(this.h, false, false, kzVar.W1, kzVar.f2);
                break;
            case 3:
                org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.h, kzVar.W1, false, true);
                r3Var.setAddOnClickListener(new g0(this, 15));
                azVar = r3Var;
                break;
            case 4:
                azVar = new View(context);
                azVar.setLayoutParams(new f2.w0(-1, kzVar.Y0));
                break;
            case 5:
                u2Var = new dg.u2(this, context, 20);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.j6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(kzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                u2Var.addView(imageView, k7.b6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(kzVar.A(i11));
                u2Var.addView(textView, k7.b6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                u2Var.setLayoutParams(new f2.w0(-1, -2));
                azVar = u2Var;
                break;
            case 6:
            default:
                azVar = null;
                break;
            case 7:
                ViewGroup.LayoutParams w0Var = new f2.w0(-1, AndroidUtilities.dp(79.0f));
                u2Var = this.c;
                u2Var.setLayoutParams(w0Var);
                azVar = u2Var;
                break;
            case 8:
                azVar = new View(kzVar.getContext());
                azVar.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new el0(azVar);
    }
}
