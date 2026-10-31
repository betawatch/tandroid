package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qy extends sk0 {
    public boolean D;
    public int L;
    public int M;
    public String N;
    public final /* synthetic */ vy Q;
    public final qx c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final Context h;
    public int y;
    public final SparseArray n = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseIntArray w = new SparseIntArray();
    public final SparseArray x = new SparseArray();
    public ArrayList E = new ArrayList();
    public HashMap F = new HashMap();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public final py O = new py(this);
    public int P = -1;

    public qy(vy vyVar, Context context) {
        this.Q = vyVar;
        this.h = context;
        qx qxVar = new qx(context, vyVar.c1, new d(this, 12), new px(this, 2), vyVar.Z1);
        this.c = qxVar;
        qxVar.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f));
        qxVar.setClipToPadding(false);
        qxVar.f3.r = false;
        qxVar.setNestedScrollingEnabled(false);
        qxVar.setDrawSelection(false);
        qxVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 7;
    }

    @Override // s4.g0
    public final int b() {
        int i10 = this.y;
        if (i10 != 1) {
            return i10 + 1;
        }
        return 2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (this.d != 0 && i10 == b() - 1) {
            return 8;
        }
        if (i10 == this.P) {
            return 7;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1 && this.y == 1) {
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

    @Override // s4.g0
    public final void f() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        vy vyVar = this.Q;
        int i14 = vyVar.c1;
        ny nyVar = vyVar.y0;
        this.P = -1;
        SparseArray sparseArray = this.n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.x;
        sparseArray3.clear();
        this.y = 0;
        int size = this.G.size() + this.E.size();
        this.c.f3.O(false);
        long j10 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.s;
        if (j10 != 0) {
            ArrayList arrayList = this.f;
            int i15 = this.y;
            this.y = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.y;
                this.y = i16 + 1;
                this.P = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.y;
                this.y = i17 + 1;
                sparseArray2.put(i17, org.telegram.messenger.cd.G(this.e.count, "Stickers", new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.y, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.y + i19;
                int i21 = (i19 / nyVar.d) + i13;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i18);
                sparseArray2.put(i20, document);
                ArrayList arrayList2 = arrayList;
                int i22 = i18;
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ui.b0(i14).o0(org.telegram.messenger.ui.q0(document));
                if (o02 != null) {
                    sparseArray4.put(i20, o02);
                }
                sparseIntArray.put(i20, i21);
                i19++;
                i18 = i22 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i19 / nyVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i13 + i23, Integer.valueOf(i19));
            }
            this.y = (ceil * nyVar.d) + this.y;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList3 = this.K;
            boolean z12 = (arrayList3 == null || arrayList3.isEmpty()) ? false : true;
            int i24 = this.y;
            this.y = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.y;
                this.y = i25 + 1;
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
                int i26 = this.y;
                this.y = i26 + 1;
                sparseArray2.put(i26, org.telegram.messenger.cd.L0(2131744892, null));
                int i27 = i10 + 1;
                int size3 = this.I.size();
                int i28 = 0;
                int i29 = 0;
                while (i29 < size3) {
                    int i30 = i14;
                    ArrayList arrayList4 = (ArrayList) this.I.get(i29);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.H.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.y + i28, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z14 = z12;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.y + i28;
                        int i34 = size;
                        int i35 = (i28 / nyVar.d) + i27;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i31);
                        sparseArray2.put(i33, document2);
                        String str4 = str;
                        int i36 = i27;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.ui.b0(i30).o0(org.telegram.messenger.ui.q0(document2));
                        if (o03 != null) {
                            sparseArray4.put(i33, o03);
                        }
                        sparseIntArray.put(i33, i35);
                        i28++;
                        i31++;
                        size4 = i32;
                        size = i34;
                        arrayList4 = arrayList5;
                        i27 = i36;
                        str = str4;
                    }
                    i29++;
                    i14 = i30;
                    isEmpty = z13;
                    z12 = z14;
                }
                i11 = i14;
                z10 = isEmpty;
                z11 = z12;
                i12 = size;
                int i37 = i27;
                int ceil2 = (int) Math.ceil(i28 / nyVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i28));
                }
                this.y = (nyVar.d * ceil2) + this.y;
                i10 = i37 + ceil2;
            }
            if (z11) {
                int i39 = this.y;
                this.y = i39 + 1;
                sparseArray2.put(i39, org.telegram.messenger.cd.L0(2131744893, null));
                int i40 = i10 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.y, str5);
                }
                int size5 = this.K.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.y + i41;
                    int i44 = (i41 / nyVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet o04 = org.telegram.messenger.ui.b0(i11).o0(org.telegram.messenger.ui.q0(document3));
                    if (o04 != null) {
                        sparseArray4.put(i43, o04);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / nyVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.y = (ceil3 * nyVar.d) + this.y;
            }
            if (z10 && !z11 && i12 == 0) {
                this.y = 1;
            }
        }
        super.f();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        vy vyVar = this.Q;
        LongSparseArray longSparseArray = vyVar.z1;
        LongSparseArray longSparseArray2 = vyVar.y1;
        int i11 = c1Var.f;
        View view = c1Var.a;
        SparseArray sparseArray = this.r;
        boolean z10 = true;
        z10 = true;
        if (i11 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
            d8Var.d(document, null, this.s.get(i10), (String) this.x.get(i10), false, false);
            if (!vyVar.j1.contains(document) && !vyVar.k1.contains(document)) {
                z10 = false;
            }
            d8Var.setRecent(z10);
            return;
        }
        Integer num = null;
        if (i11 == 1) {
            org.telegram.ui.Cells.o3 o3Var = (org.telegram.ui.Cells.o3) view;
            if (i10 != this.y) {
                o3Var.setHeight(org.telegram.messenger.i0.L(82.0f));
                return;
            }
            int i12 = this.w.get(i10 - 1, TLObject.FLAG_31);
            if (i12 == Integer.MIN_VALUE) {
                o3Var.setHeight(1);
                return;
            }
            Object obj = this.n.get(i12);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
            } else if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num == null) {
                o3Var.setHeight(1);
                return;
            } else if (num.intValue() == 0) {
                o3Var.setHeight(org.telegram.messenger.i0.L(8.0f));
                return;
            } else {
                int A = org.telegram.messenger.z20.A(82.0f, (int) Math.ceil(num.intValue() / vyVar.y0.d), vyVar.h.getHeight());
                o3Var.setHeight(A > 0 ? A : 1);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            Object obj2 = sparseArray.get(i10);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 instanceof String) {
                    n8Var.a(0, (String) obj2);
                    n8Var.c(0, null);
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            if (!TextUtils.isEmpty(this.N) && this.F.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    n8Var.a(0, stickerSet.title);
                }
                n8Var.c(this.N.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num2 = (Integer) this.G.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num2 != null) {
                n8Var.b(stickerSet2.title, 0, null, num2.intValue(), !TextUtils.isEmpty(this.N) ? this.N.length() : 0);
            }
            n8Var.c(0, null);
            return;
        }
        if (i11 != 3) {
            return;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i10);
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        boolean z11 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) >= 0;
        char c10 = longSparseArray.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
        if (z11 || c10 != 0) {
            if (z11 && w3Var.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
                z11 = false;
            } else if (c10 != 0 && !w3Var.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
            }
        }
        w3Var.b(z11, false);
        int A1 = TextUtils.isEmpty(this.N) ? -1 : org.telegram.messenger.i0.A1(stickerSetCovered.set.title, this.N);
        if (A1 >= 0) {
            w3Var.c(stickerSetCovered, false, false, A1, this.N.length(), false);
            return;
        }
        w3Var.c(stickerSetCovered, false, false, 0, 0, false);
        if (TextUtils.isEmpty(this.N) || org.telegram.messenger.i0.A1(stickerSetCovered.set.short_name, this.N) != 0) {
            return;
        }
        w3Var.d(this.N.length(), stickerSetCovered.set.short_name);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        vy vyVar = this.Q;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        int i11 = 1;
        char c10 = 1;
        Context context = this.h;
        View view = null;
        switch (i10) {
            case 0:
                view = new my(i11, context, p6Var, c10 == true ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.o3(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.n8(this.h, false, false, vyVar.Z1, vyVar.i2);
                break;
            case 3:
                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(17, this.h, vyVar.Z1, false, true);
                w3Var.setAddOnClickListener(new h0(this, 13));
                view = w3Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new s4.o0(-1, vyVar.b1));
                break;
            case 5:
                jg.l0 l0Var = new jg.l0(this, context, 18);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i12 = org.telegram.ui.ActionBar.t6.Af;
                org.telegram.ui.ActionBar.a7.t(imageView, i12, p6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-org.telegram.messenger.i0.L(24.0f));
                l0Var.addView(imageView, w7.b6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.cd.L0(2131748165, null));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(textView, i12, p6Var);
                l0Var.addView(textView, w7.b6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                l0Var.setLayoutParams(new s4.o0(-1, -2));
                view = l0Var;
                break;
            case 7:
                s4.o0 o0Var = new s4.o0(-1, org.telegram.messenger.i0.L(79.0f));
                view = this.c;
                view.setLayoutParams(o0Var);
                break;
            case 8:
                view = new View(vyVar.getContext());
                view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(68.0f)));
                break;
        }
        return new ck0(view);
    }
}
