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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ty extends yk0 {
    public int H;
    public int I;
    public String J;
    public final /* synthetic */ yy M;
    public final sy c;
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
    public ArrayList A = new ArrayList();
    public HashMap B = new HashMap();
    public HashMap C = new HashMap();
    public HashMap D = new HashMap();
    public ArrayList E = new ArrayList();
    public ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public final ry K = new ry(this);
    public int L = -1;

    public ty(yy yyVar, Context context) {
        this.M = yyVar;
        this.h = context;
        sy syVar = new sy(context, yyVar.Y0, new d(this, 12), new vu(this, 3), yyVar.V1);
        this.c = syVar;
        syVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        syVar.setClipToPadding(false);
        syVar.U2.r = false;
        syVar.setNestedScrollingEnabled(false);
        syVar.setDrawSelection(false);
        syVar.setOnTouchListener(new m.d2(this, 3));
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 7;
    }

    @Override // f2.q0
    public final int h() {
        int i10 = this.x;
        if (i10 != 1) {
            return i10 + 1;
        }
        return 2;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (this.d != 0 && i10 == h() - 1) {
            return 8;
        }
        if (i10 == this.L) {
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

    @Override // f2.q0
    public final void l() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        yy yyVar = this.M;
        int i14 = yyVar.Y0;
        py pyVar = yyVar.u0;
        this.L = -1;
        SparseArray sparseArray = this.n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.w;
        sparseArray3.clear();
        this.x = 0;
        int size = this.C.size() + this.A.size();
        this.c.U2.N(false);
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
                this.L = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.x;
                this.x = i17 + 1;
                sparseArray2.put(i17, LocaleController.formatPluralString("Stickers", this.e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.D.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.x, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.x + i19;
                int i21 = (i19 / pyVar.d) + i13;
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
            int ceil = (int) Math.ceil(i19 / pyVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i13 + i23, Integer.valueOf(i19));
            }
            this.x = (ceil * pyVar.d) + this.x;
        } else {
            boolean isEmpty = this.E.isEmpty();
            ArrayList arrayList2 = this.G;
            boolean z12 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            int i24 = this.x;
            this.x = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.x;
                this.x = i25 + 1;
                this.L = i25;
                sparseArray2.put(i25, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (isEmpty) {
                i11 = i14;
                z10 = isEmpty;
                z11 = z12;
                i12 = size;
            } else {
                int i26 = this.x;
                this.x = i26 + 1;
                sparseArray2.put(i26, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                int i27 = i10 + 1;
                int size3 = this.E.size();
                int i28 = 0;
                int i29 = 0;
                while (i28 < size3) {
                    int i30 = i14;
                    ArrayList arrayList3 = (ArrayList) this.E.get(i28);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.D.get(arrayList3);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.x + i29, str3);
                        str = str3;
                    }
                    int size4 = arrayList3.size();
                    boolean z14 = z12;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.x + i29;
                        String str4 = str;
                        int i34 = (i29 / pyVar.d) + i27;
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
                    isEmpty = z13;
                    z12 = z14;
                }
                i11 = i14;
                z10 = isEmpty;
                z11 = z12;
                i12 = size;
                int i37 = i27;
                int ceil2 = (int) Math.ceil(i29 / pyVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i29));
                }
                this.x = (pyVar.d * ceil2) + this.x;
                i10 = i37 + ceil2;
            }
            if (z11) {
                int i39 = this.x;
                this.x = i39 + 1;
                sparseArray2.put(i39, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i40 = i10 + 1;
                String str5 = (String) this.D.get(this.G);
                if (str5 != null) {
                    sparseArray3.put(this.x, str5);
                }
                int size5 = this.G.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.x + i41;
                    int i44 = (i41 / pyVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.G.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i43, stickerSetById3);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / pyVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.x = (ceil3 * pyVar.d) + this.x;
            }
            if (z10 && !z11 && i12 == 0) {
                this.x = 1;
            }
        }
        super.l();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        yy yyVar = this.M;
        LongSparseArray longSparseArray = yyVar.v1;
        LongSparseArray longSparseArray2 = yyVar.u1;
        int i11 = o1Var.f;
        View view = o1Var.a;
        SparseArray sparseArray = this.r;
        boolean z10 = true;
        z10 = true;
        if (i11 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
            a8Var.d(document, null, this.s.get(i10), (String) this.w.get(i10), false, false);
            if (!yyVar.f1.contains(document) && !yyVar.g1.contains(document)) {
                z10 = false;
            }
            a8Var.setRecent(z10);
            return;
        }
        Integer num = null;
        if (i11 == 1) {
            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) view;
            if (i10 != this.x) {
                i3Var.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            int i12 = this.v.get(i10 - 1, TLObject.FLAG_31);
            if (i12 == Integer.MIN_VALUE) {
                i3Var.setHeight(1);
                return;
            }
            Object obj = this.n.get(i12);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
            } else if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num == null) {
                i3Var.setHeight(1);
                return;
            } else if (num.intValue() == 0) {
                i3Var.setHeight(AndroidUtilities.dp(8.0f));
                return;
            } else {
                int z11 = org.telegram.messenger.rl.z(82.0f, (int) Math.ceil(num.intValue() / yyVar.u0.d), yyVar.h.getHeight());
                i3Var.setHeight(z11 > 0 ? z11 : 1);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            Object obj2 = sparseArray.get(i10);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 instanceof String) {
                    j8Var.b(0, (String) obj2);
                    j8Var.d(0, null);
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            if (!TextUtils.isEmpty(this.J) && this.B.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    j8Var.b(0, stickerSet.title);
                }
                j8Var.d(this.J.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num2 = (Integer) this.C.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num2 != null) {
                j8Var.c(stickerSet2.title, 0, null, num2.intValue(), !TextUtils.isEmpty(this.J) ? this.J.length() : 0);
            }
            j8Var.d(0, null);
            return;
        }
        if (i11 != 3) {
            return;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i10);
        org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view;
        boolean z12 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) >= 0;
        char c10 = longSparseArray.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
        if (z12 || c10 != 0) {
            if (z12 && p3Var.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
                z12 = false;
            } else if (c10 != 0 && !p3Var.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
            }
        }
        p3Var.b(z12, false);
        int indexOfIgnoreCase = TextUtils.isEmpty(this.J) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.J);
        if (indexOfIgnoreCase >= 0) {
            p3Var.c(stickerSetCovered, false, false, indexOfIgnoreCase, this.J.length(), false);
            return;
        }
        p3Var.c(stickerSetCovered, false, false, 0, 0, false);
        if (TextUtils.isEmpty(this.J) || AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.J) != 0) {
            return;
        }
        String str = stickerSetCovered.set.short_name;
        int length = this.J.length();
        p3Var.B = str;
        p3Var.C = length;
        p3Var.f();
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View oyVar;
        ViewGroup p1Var;
        boolean z10 = true;
        Context context = this.h;
        yy yyVar = this.M;
        switch (i10) {
            case 0:
                oyVar = new oy(1, context, yyVar.V1, z10);
                break;
            case 1:
                oyVar = new org.telegram.ui.Cells.i3(context);
                break;
            case 2:
                oyVar = new org.telegram.ui.Cells.j8(this.h, false, false, yyVar.V1, yyVar.e2);
                break;
            case 3:
                org.telegram.ui.Cells.p3 p3Var = new org.telegram.ui.Cells.p3(17, this.h, yyVar.V1, false, true);
                p3Var.setAddOnClickListener(new f0(this, 15));
                oyVar = p3Var;
                break;
            case 4:
                oyVar = new View(context);
                oyVar.setLayoutParams(new f2.y0(-1, yyVar.X0));
                break;
            case 5:
                p1Var = new ag.p1(this, context, 20);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.g6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(yyVar.B(i11), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                p1Var.addView(imageView, h7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(yyVar.B(i11));
                p1Var.addView(textView, h7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                p1Var.setLayoutParams(new f2.y0(-1, -2));
                oyVar = p1Var;
                break;
            case 6:
            default:
                oyVar = null;
                break;
            case 7:
                ViewGroup.LayoutParams y0Var = new f2.y0(-1, AndroidUtilities.dp(79.0f));
                p1Var = this.c;
                p1Var.setLayoutParams(y0Var);
                oyVar = p1Var;
                break;
            case 8:
                oyVar = new View(yyVar.getContext());
                oyVar.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new lk0(oyVar);
    }
}
