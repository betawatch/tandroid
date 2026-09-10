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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mz extends ul0 {
    public int L;
    public int M;
    public String N;
    public final /* synthetic */ rz Q;
    public final lz c;
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
    public ArrayList E = new ArrayList();
    public HashMap F = new HashMap();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public final kz O = new kz(this);
    public int P = -1;

    public mz(rz rzVar, Context context) {
        this.Q = rzVar;
        this.h = context;
        lz lzVar = new lz(context, rzVar.c1, new e(this, 12), new pv(this, 3), rzVar.Z1);
        this.c = lzVar;
        lzVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        lzVar.setClipToPadding(false);
        lzVar.Y2.r = false;
        lzVar.setNestedScrollingEnabled(false);
        lzVar.setDrawSelection(false);
        lzVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 7;
    }

    @Override // s4.h0
    public final int h() {
        int i10 = this.x;
        if (i10 != 1) {
            return i10 + 1;
        }
        return 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (this.d != 0 && i10 == h() - 1) {
            return 8;
        }
        if (i10 == this.P) {
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

    @Override // s4.h0
    public final void l() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        rz rzVar = this.Q;
        int i14 = rzVar.c1;
        iz izVar = rzVar.y0;
        this.P = -1;
        SparseArray sparseArray = this.n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.w;
        sparseArray3.clear();
        this.x = 0;
        int size = this.G.size() + this.E.size();
        this.c.Y2.N(false);
        long j3 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.s;
        if (j3 != 0) {
            ArrayList arrayList = this.f;
            int i15 = this.x;
            this.x = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.x;
                this.x = i16 + 1;
                this.P = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.x;
                this.x = i17 + 1;
                sparseArray2.put(i17, LocaleController.formatPluralString("Stickers", this.e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.x, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.x + i19;
                int i21 = (i19 / izVar.d) + i13;
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
            int ceil = (int) Math.ceil(i19 / izVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i13 + i23, Integer.valueOf(i19));
            }
            this.x = (ceil * izVar.d) + this.x;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList2 = this.K;
            boolean z12 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            int i24 = this.x;
            this.x = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.x;
                this.x = i25 + 1;
                this.P = i25;
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
                int size3 = this.I.size();
                int i28 = 0;
                int i29 = 0;
                while (i28 < size3) {
                    int i30 = i14;
                    ArrayList arrayList3 = (ArrayList) this.I.get(i28);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.H.get(arrayList3);
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
                        int i34 = (i29 / izVar.d) + i27;
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
                int ceil2 = (int) Math.ceil(i29 / izVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i29));
                }
                this.x = (izVar.d * ceil2) + this.x;
                i10 = i37 + ceil2;
            }
            if (z11) {
                int i39 = this.x;
                this.x = i39 + 1;
                sparseArray2.put(i39, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i40 = i10 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.x, str5);
                }
                int size5 = this.K.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.x + i41;
                    int i44 = (i41 / izVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i43, stickerSetById3);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / izVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.x = (ceil3 * izVar.d) + this.x;
            }
            if (z10 && !z11 && i12 == 0) {
                this.x = 1;
            }
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        rz rzVar = this.Q;
        LongSparseArray longSparseArray = rzVar.z1;
        LongSparseArray longSparseArray2 = rzVar.y1;
        int i11 = c1Var.f;
        View view = c1Var.a;
        SparseArray sparseArray = this.r;
        boolean z10 = true;
        z10 = true;
        if (i11 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
            g8Var.d(document, null, this.s.get(i10), (String) this.w.get(i10), false, false);
            if (!rzVar.j1.contains(document) && !rzVar.k1.contains(document)) {
                z10 = false;
            }
            g8Var.setRecent(z10);
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
                int A = org.telegram.messenger.em.A(82.0f, (int) Math.ceil(num.intValue() / rzVar.y0.d), rzVar.h.getHeight());
                k3Var.setHeight(A > 0 ? A : 1);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            Object obj2 = sparseArray.get(i10);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 instanceof String) {
                    p8Var.b(0, (String) obj2);
                    p8Var.d(0, null);
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            if (!TextUtils.isEmpty(this.N) && this.F.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    p8Var.b(0, stickerSet.title);
                }
                p8Var.d(this.N.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num2 = (Integer) this.G.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num2 != null) {
                p8Var.c(stickerSet2.title, 0, null, num2.intValue(), !TextUtils.isEmpty(this.N) ? this.N.length() : 0);
            }
            p8Var.d(0, null);
            return;
        }
        if (i11 != 3) {
            return;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i10);
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view;
        boolean z11 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) >= 0;
        char c10 = longSparseArray.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
        if (z11 || c10 != 0) {
            if (z11 && r3Var.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
                z11 = false;
            } else if (c10 != 0 && !r3Var.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
            }
        }
        r3Var.b(z11, false);
        int indexOfIgnoreCase = TextUtils.isEmpty(this.N) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.N);
        if (indexOfIgnoreCase >= 0) {
            r3Var.c(stickerSetCovered, false, false, indexOfIgnoreCase, this.N.length(), false);
            return;
        }
        r3Var.c(stickerSetCovered, false, false, 0, 0, false);
        if (TextUtils.isEmpty(this.N) || AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.N) != 0) {
            return;
        }
        String str = stickerSetCovered.set.short_name;
        int length = this.N.length();
        r3Var.F = str;
        r3Var.G = length;
        r3Var.f();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g2Var;
        ViewGroup ldVar;
        boolean z10 = true;
        Context context = this.h;
        rz rzVar = this.Q;
        switch (i10) {
            case 0:
                g2Var = new fg.g2(2, context, rzVar.Z1, z10);
                break;
            case 1:
                g2Var = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                g2Var = new org.telegram.ui.Cells.p8(this.h, false, false, rzVar.Z1, rzVar.i2);
                break;
            case 3:
                org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.h, rzVar.Z1, false, true);
                r3Var.setAddOnClickListener(new h0(this, 15));
                g2Var = r3Var;
                break;
            case 4:
                g2Var = new View(context);
                g2Var.setLayoutParams(new s4.p0(-1, rzVar.b1));
                break;
            case 5:
                ldVar = new bi.ld(this, context, 12);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.j6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(rzVar.z(i11), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                ldVar.addView(imageView, w7.a6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(rzVar.z(i11));
                ldVar.addView(textView, w7.a6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                ldVar.setLayoutParams(new s4.p0(-1, -2));
                g2Var = ldVar;
                break;
            case 6:
            default:
                g2Var = null;
                break;
            case 7:
                ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
                ldVar = this.c;
                ldVar.setLayoutParams(p0Var);
                g2Var = ldVar;
                break;
            case 8:
                g2Var = new View(rzVar.getContext());
                g2Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new fl0(g2Var);
    }
}
