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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cy extends oj0 {
    public boolean D;
    public int L;
    public int M;
    public String N;
    public final /* synthetic */ hy Q;
    public final cx c;
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
    public final ay O = new ay(this);
    public int P = -1;

    public cy(hy hyVar, Context context) {
        this.Q = hyVar;
        this.h = context;
        cx cxVar = new cx(context, hyVar.c1, new d(this, 12), new bx(this, 2), hyVar.Z1);
        this.c = cxVar;
        cxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        cxVar.setClipToPadding(false);
        cxVar.f3.r = false;
        cxVar.setNestedScrollingEnabled(false);
        cxVar.setDrawSelection(false);
        cxVar.setOnTouchListener(new m.d2(this, 3));
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 7;
    }

    @Override // v4.g0
    public final int b() {
        int i7 = this.y;
        if (i7 != 1) {
            return i7 + 1;
        }
        return 2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (this.d != 0 && i7 == b() - 1) {
            return 8;
        }
        if (i7 == this.P) {
            return 7;
        }
        if (i7 == 0) {
            return 4;
        }
        if (i7 == 1 && this.y == 1) {
            return 5;
        }
        Object obj = this.r.get(i7);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
    }

    @Override // v4.g0
    public final void f() {
        int i7;
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        hy hyVar = this.Q;
        int i13 = hyVar.c1;
        yx yxVar = hyVar.y0;
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
        long j3 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.s;
        if (j3 != 0) {
            ArrayList arrayList = this.f;
            int i14 = this.y;
            this.y = i14 + 1;
            sparseArray2.put(i14, "search");
            if (size > 0) {
                int i15 = this.y;
                this.y = i15 + 1;
                this.P = i15;
                sparseArray2.put(i15, "packs");
                int i16 = this.y;
                this.y = i16 + 1;
                sparseArray2.put(i16, org.telegram.messenger.id.G(this.e.count, "Stickers", new Object[0]));
                i12 = 3;
            } else {
                i12 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.y, str2);
            }
            int size2 = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (i17 < size2) {
                int i19 = this.y + i18;
                int i20 = (i18 / yxVar.d) + i12;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i17);
                sparseArray2.put(i19, document);
                ArrayList arrayList2 = arrayList;
                int i21 = i17;
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ui.b0(i13).o0(org.telegram.messenger.ui.q0(document));
                if (o02 != null) {
                    sparseArray4.put(i19, o02);
                }
                sparseIntArray.put(i19, i20);
                i18++;
                i17 = i21 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i18 / yxVar.d);
            for (int i22 = 0; i22 < ceil; i22++) {
                sparseArray.put(i12 + i22, Integer.valueOf(i18));
            }
            this.y = (ceil * yxVar.d) + this.y;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList3 = this.K;
            boolean z11 = (arrayList3 == null || arrayList3.isEmpty()) ? false : true;
            int i23 = this.y;
            this.y = i23 + 1;
            sparseArray2.put(i23, "search");
            if (size > 0) {
                int i24 = this.y;
                this.y = i24 + 1;
                this.P = i24;
                sparseArray2.put(i24, "packs");
                i7 = 2;
            } else {
                i7 = 1;
            }
            if (isEmpty) {
                i10 = i13;
                z9 = isEmpty;
                z10 = z11;
                i11 = size;
            } else {
                int i25 = this.y;
                this.y = i25 + 1;
                sparseArray2.put(i25, org.telegram.messenger.id.M0(2131744877, null));
                int i26 = i7 + 1;
                int size3 = this.I.size();
                int i27 = 0;
                int i28 = 0;
                while (i28 < size3) {
                    int i29 = i13;
                    ArrayList arrayList4 = (ArrayList) this.I.get(i28);
                    boolean z12 = isEmpty;
                    String str3 = (String) this.H.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.y + i27, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z13 = z11;
                    int i30 = 0;
                    while (i30 < size4) {
                        int i31 = size4;
                        int i32 = this.y + i27;
                        int i33 = size;
                        int i34 = (i27 / yxVar.d) + i26;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i30);
                        sparseArray2.put(i32, document2);
                        String str4 = str;
                        int i35 = i26;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.ui.b0(i29).o0(org.telegram.messenger.ui.q0(document2));
                        if (o03 != null) {
                            sparseArray4.put(i32, o03);
                        }
                        sparseIntArray.put(i32, i34);
                        i27++;
                        i30++;
                        size4 = i31;
                        size = i33;
                        arrayList4 = arrayList5;
                        i26 = i35;
                        str = str4;
                    }
                    i28++;
                    i13 = i29;
                    isEmpty = z12;
                    z11 = z13;
                }
                i10 = i13;
                z9 = isEmpty;
                z10 = z11;
                i11 = size;
                int i36 = i26;
                int ceil2 = (int) Math.ceil(i27 / yxVar.d);
                for (int i37 = 0; i37 < ceil2; i37++) {
                    sparseArray.put(i36 + i37, Integer.valueOf(i27));
                }
                this.y = (yxVar.d * ceil2) + this.y;
                i7 = i36 + ceil2;
            }
            if (z10) {
                int i38 = this.y;
                this.y = i38 + 1;
                sparseArray2.put(i38, org.telegram.messenger.id.M0(2131744878, null));
                int i39 = i7 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.y, str5);
                }
                int size5 = this.K.size();
                int i40 = 0;
                for (int i41 = 0; i41 < size5; i41++) {
                    int i42 = this.y + i40;
                    int i43 = (i40 / yxVar.d) + i39;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i41);
                    sparseArray2.put(i42, document3);
                    TLRPC.TL_messages_stickerSet o04 = org.telegram.messenger.ui.b0(i10).o0(org.telegram.messenger.ui.q0(document3));
                    if (o04 != null) {
                        sparseArray4.put(i42, o04);
                    }
                    sparseIntArray.put(i42, i43);
                    i40++;
                }
                int ceil3 = (int) Math.ceil(i40 / yxVar.d);
                for (int i44 = 0; i44 < ceil3; i44++) {
                    sparseArray.put(i39 + i44, Integer.valueOf(i40));
                }
                this.y = (ceil3 * yxVar.d) + this.y;
            }
            if (z9 && !z10 && i11 == 0) {
                this.y = 1;
            }
        }
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        hy hyVar = this.Q;
        LongSparseArray longSparseArray = hyVar.z1;
        LongSparseArray longSparseArray2 = hyVar.y1;
        int i10 = d1Var.f;
        View view = d1Var.a;
        SparseArray sparseArray = this.r;
        boolean z9 = true;
        z9 = true;
        if (i10 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
            org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
            z7Var.d(document, null, this.s.get(i7), (String) this.x.get(i7), false, false);
            if (!hyVar.j1.contains(document) && !hyVar.k1.contains(document)) {
                z9 = false;
            }
            z7Var.setRecent(z9);
            return;
        }
        Integer num = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view;
            if (i7 != this.y) {
                m3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            int i11 = this.w.get(i7 - 1, TLObject.FLAG_31);
            if (i11 == Integer.MIN_VALUE) {
                m3Var.setHeight(1);
                return;
            }
            Object obj = this.n.get(i11);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
            } else if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num == null) {
                m3Var.setHeight(1);
                return;
            } else if (num.intValue() == 0) {
                m3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                return;
            } else {
                int A = org.telegram.messenger.camera.q.A(82.0f, (int) Math.ceil(num.intValue() / hyVar.y0.d), hyVar.h.getHeight());
                m3Var.setHeight(A > 0 ? A : 1);
                return;
            }
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            Object obj2 = sparseArray.get(i7);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 instanceof String) {
                    j8Var.a(0, (String) obj2);
                    j8Var.c(0, null);
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            if (!TextUtils.isEmpty(this.N) && this.F.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    j8Var.a(0, stickerSet.title);
                }
                j8Var.c(this.N.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num2 = (Integer) this.G.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num2 != null) {
                j8Var.b(stickerSet2.title, 0, null, num2.intValue(), !TextUtils.isEmpty(this.N) ? this.N.length() : 0);
            }
            j8Var.c(0, null);
            return;
        }
        if (i10 != 3) {
            return;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i7);
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        boolean z10 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) >= 0;
        char c10 = longSparseArray.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
        if (z10 || c10 != 0) {
            if (z10 && u3Var.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
                z10 = false;
            } else if (c10 != 0 && !u3Var.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
            }
        }
        u3Var.b(z10, false);
        int A1 = TextUtils.isEmpty(this.N) ? -1 : org.telegram.messenger.g0.A1(stickerSetCovered.set.title, this.N);
        if (A1 >= 0) {
            u3Var.c(stickerSetCovered, false, false, A1, this.N.length(), false);
            return;
        }
        u3Var.c(stickerSetCovered, false, false, 0, 0, false);
        if (TextUtils.isEmpty(this.N) || org.telegram.messenger.g0.A1(stickerSetCovered.set.short_name, this.N) != 0) {
            return;
        }
        u3Var.d(this.N.length(), stickerSetCovered.set.short_name);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        hy hyVar = this.Q;
        org.telegram.ui.ActionBar.f6 f6Var = hyVar.Z1;
        boolean z9 = true;
        Context context = this.h;
        View view = null;
        switch (i7) {
            case 0:
                view = new jg.c2(2, context, f6Var, z9);
                break;
            case 1:
                view = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.j8(this.h, false, false, hyVar.Z1, hyVar.i2);
                break;
            case 3:
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(17, this.h, hyVar.Z1, false, true);
                u3Var.setAddOnClickListener(new h0(this, 14));
                view = u3Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new v4.o0(-1, hyVar.b1));
                break;
            case 5:
                bi.e5 e5Var = new bi.e5(19, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i10 = org.telegram.ui.ActionBar.k6.Af;
                org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-org.telegram.messenger.g0.L(24.0f));
                e5Var.addView(imageView, c8.ha.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.id.M0(2131748150, null));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
                e5Var.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                e5Var.setLayoutParams(new v4.o0(-1, -2));
                view = e5Var;
                break;
            case 7:
                v4.o0 o0Var = new v4.o0(-1, org.telegram.messenger.g0.L(79.0f));
                view = this.c;
                view.setLayoutParams(o0Var);
                break;
            case 8:
                view = new View(hyVar.getContext());
                view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(68.0f)));
                break;
        }
        return new xi0(view);
    }
}
