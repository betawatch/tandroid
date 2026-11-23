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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class oy extends dk0 {
    public boolean E;
    public int M;
    public int N;
    public String O;
    public final /* synthetic */ ty R;
    public final ox c;
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
    public ArrayList F = new ArrayList();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public HashMap I = new HashMap();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public ArrayList L = new ArrayList();
    public final ny P = new ny(this);
    public int Q = -1;

    public oy(ty tyVar, Context context) {
        this.R = tyVar;
        this.h = context;
        ox oxVar = new ox(context, tyVar.d1, new d(this, 13), new ky(this, 1), tyVar.a2);
        this.c = oxVar;
        oxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        oxVar.setClipToPadding(false);
        oxVar.g3.r = false;
        oxVar.setNestedScrollingEnabled(false);
        oxVar.setDrawSelection(false);
        oxVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 7;
    }

    @Override // v4.i0
    public final int b() {
        int i7 = this.y;
        if (i7 != 1) {
            return i7 + 1;
        }
        return 2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (this.d != 0 && i7 == b() - 1) {
            return 8;
        }
        if (i7 == this.Q) {
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

    @Override // v4.i0
    public final void f() {
        int i7;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        ty tyVar = this.R;
        int i13 = tyVar.d1;
        ly lyVar = tyVar.z0;
        this.Q = -1;
        SparseArray sparseArray = this.n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.x;
        sparseArray3.clear();
        this.y = 0;
        int size = this.H.size() + this.F.size();
        this.c.g3.O(false);
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
                this.Q = i15;
                sparseArray2.put(i15, "packs");
                int i16 = this.y;
                this.y = i16 + 1;
                sparseArray2.put(i16, org.telegram.messenger.hd.G(this.e.count, "Stickers", new Object[0]));
                i12 = 3;
            } else {
                i12 = 1;
            }
            String str2 = (String) this.I.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.y, str2);
            }
            int size2 = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (i17 < size2) {
                int i19 = this.y + i18;
                int i20 = (i18 / lyVar.d) + i12;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i17);
                sparseArray2.put(i19, document);
                ArrayList arrayList2 = arrayList;
                int i21 = i17;
                TLRPC.TL_messages_stickerSet q02 = org.telegram.messenger.si.d0(i13).q0(org.telegram.messenger.si.s0(document));
                if (q02 != null) {
                    sparseArray4.put(i19, q02);
                }
                sparseIntArray.put(i19, i20);
                i18++;
                i17 = i21 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i18 / lyVar.d);
            for (int i22 = 0; i22 < ceil; i22++) {
                sparseArray.put(i12 + i22, Integer.valueOf(i18));
            }
            this.y = (ceil * lyVar.d) + this.y;
        } else {
            boolean isEmpty = this.J.isEmpty();
            ArrayList arrayList3 = this.L;
            boolean z12 = (arrayList3 == null || arrayList3.isEmpty()) ? false : true;
            int i23 = this.y;
            this.y = i23 + 1;
            sparseArray2.put(i23, "search");
            if (size > 0) {
                int i24 = this.y;
                this.y = i24 + 1;
                this.Q = i24;
                sparseArray2.put(i24, "packs");
                i7 = 2;
            } else {
                i7 = 1;
            }
            if (isEmpty) {
                i10 = i13;
                z10 = isEmpty;
                z11 = z12;
                i11 = size;
            } else {
                int i25 = this.y;
                this.y = i25 + 1;
                sparseArray2.put(i25, org.telegram.messenger.hd.N0(2131744631, null));
                int i26 = i7 + 1;
                int size3 = this.J.size();
                int i27 = 0;
                int i28 = 0;
                while (i28 < size3) {
                    int i29 = i13;
                    ArrayList arrayList4 = (ArrayList) this.J.get(i28);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.I.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.y + i27, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z14 = z12;
                    int i30 = 0;
                    while (i30 < size4) {
                        int i31 = size4;
                        int i32 = this.y + i27;
                        int i33 = size;
                        int i34 = (i27 / lyVar.d) + i26;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i30);
                        sparseArray2.put(i32, document2);
                        String str4 = str;
                        int i35 = i26;
                        TLRPC.TL_messages_stickerSet q03 = org.telegram.messenger.si.d0(i29).q0(org.telegram.messenger.si.s0(document2));
                        if (q03 != null) {
                            sparseArray4.put(i32, q03);
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
                    isEmpty = z13;
                    z12 = z14;
                }
                i10 = i13;
                z10 = isEmpty;
                z11 = z12;
                i11 = size;
                int i36 = i26;
                int ceil2 = (int) Math.ceil(i27 / lyVar.d);
                for (int i37 = 0; i37 < ceil2; i37++) {
                    sparseArray.put(i36 + i37, Integer.valueOf(i27));
                }
                this.y = (lyVar.d * ceil2) + this.y;
                i7 = i36 + ceil2;
            }
            if (z11) {
                int i38 = this.y;
                this.y = i38 + 1;
                sparseArray2.put(i38, org.telegram.messenger.hd.N0(2131744632, null));
                int i39 = i7 + 1;
                String str5 = (String) this.I.get(this.L);
                if (str5 != null) {
                    sparseArray3.put(this.y, str5);
                }
                int size5 = this.L.size();
                int i40 = 0;
                for (int i41 = 0; i41 < size5; i41++) {
                    int i42 = this.y + i40;
                    int i43 = (i40 / lyVar.d) + i39;
                    TLRPC.Document document3 = (TLRPC.Document) this.L.get(i41);
                    sparseArray2.put(i42, document3);
                    TLRPC.TL_messages_stickerSet q04 = org.telegram.messenger.si.d0(i10).q0(org.telegram.messenger.si.s0(document3));
                    if (q04 != null) {
                        sparseArray4.put(i42, q04);
                    }
                    sparseIntArray.put(i42, i43);
                    i40++;
                }
                int ceil3 = (int) Math.ceil(i40 / lyVar.d);
                for (int i44 = 0; i44 < ceil3; i44++) {
                    sparseArray.put(i39 + i44, Integer.valueOf(i40));
                }
                this.y = (ceil3 * lyVar.d) + this.y;
            }
            if (z10 && !z11 && i11 == 0) {
                this.y = 1;
            }
        }
        super.f();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        ty tyVar = this.R;
        LongSparseArray longSparseArray = tyVar.A1;
        LongSparseArray longSparseArray2 = tyVar.z1;
        int i10 = f1Var.f;
        View view = f1Var.a;
        SparseArray sparseArray = this.r;
        boolean z10 = true;
        z10 = true;
        if (i10 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
            org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
            a8Var.d(document, null, this.s.get(i7), (String) this.x.get(i7), false, false);
            if (!tyVar.k1.contains(document) && !tyVar.l1.contains(document)) {
                z10 = false;
            }
            a8Var.setRecent(z10);
            return;
        }
        Integer num = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.n3 n3Var = (org.telegram.ui.Cells.n3) view;
            if (i7 != this.y) {
                n3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            int i11 = this.w.get(i7 - 1, TLObject.FLAG_31);
            if (i11 == Integer.MIN_VALUE) {
                n3Var.setHeight(1);
                return;
            }
            Object obj = this.n.get(i11);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
            } else if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num == null) {
                n3Var.setHeight(1);
                return;
            } else if (num.intValue() == 0) {
                n3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                return;
            } else {
                int B = org.telegram.messenger.o10.B(82.0f, (int) Math.ceil(num.intValue() / tyVar.z0.d), tyVar.h.getHeight());
                n3Var.setHeight(B > 0 ? B : 1);
                return;
            }
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            Object obj2 = sparseArray.get(i7);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 instanceof String) {
                    k8Var.a(0, (String) obj2);
                    k8Var.c(0, null);
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            if (!TextUtils.isEmpty(this.O) && this.G.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    k8Var.a(0, stickerSet.title);
                }
                k8Var.c(this.O.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num2 = (Integer) this.H.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num2 != null) {
                k8Var.b(stickerSet2.title, 0, null, num2.intValue(), !TextUtils.isEmpty(this.O) ? this.O.length() : 0);
            }
            k8Var.c(0, null);
            return;
        }
        if (i10 != 3) {
            return;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i7);
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        boolean z11 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) >= 0;
        char c10 = longSparseArray.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
        if (z11 || c10 != 0) {
            if (z11 && v3Var.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
                z11 = false;
            } else if (c10 != 0 && !v3Var.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
            }
        }
        v3Var.b(z11, false);
        int A1 = TextUtils.isEmpty(this.O) ? -1 : org.telegram.messenger.g0.A1(stickerSetCovered.set.title, this.O);
        if (A1 >= 0) {
            v3Var.c(stickerSetCovered, false, false, A1, this.O.length(), false);
            return;
        }
        v3Var.c(stickerSetCovered, false, false, 0, 0, false);
        if (TextUtils.isEmpty(this.O) || org.telegram.messenger.g0.A1(stickerSetCovered.set.short_name, this.O) != 0) {
            return;
        }
        v3Var.d(this.O.length(), stickerSetCovered.set.short_name);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ty tyVar = this.R;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.a2;
        boolean z10 = true;
        Context context = this.h;
        View view = null;
        switch (i7) {
            case 0:
                view = new jg.b2(2, context, h6Var, z10);
                break;
            case 1:
                view = new org.telegram.ui.Cells.n3(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.k8(this.h, false, false, tyVar.a2, tyVar.j2);
                break;
            case 3:
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(17, this.h, tyVar.a2, false, true);
                v3Var.setAddOnClickListener(new o0(this, 15));
                view = v3Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new v4.q0(-1, tyVar.c1));
                break;
            case 5:
                bi.e3 e3Var = new bi.e3(20, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i10 = org.telegram.ui.ActionBar.m6.Df;
                org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-org.telegram.messenger.g0.L(24.0f));
                e3Var.addView(imageView, c8.ma.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                org.telegram.messenger.o10.l(16.0f, 2131747956, 1, textView, null);
                org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
                e3Var.addView(textView, c8.ma.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                e3Var.setLayoutParams(new v4.q0(-1, -2));
                view = e3Var;
                break;
            case 7:
                v4.q0 q0Var = new v4.q0(-1, org.telegram.messenger.g0.L(79.0f));
                view = this.c;
                view.setLayoutParams(q0Var);
                break;
            case 8:
                view = new View(tyVar.getContext());
                view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(68.0f)));
                break;
        }
        return new mj0(view);
    }
}
