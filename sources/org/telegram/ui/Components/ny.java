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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ny extends sk0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ vy w;

    public ny(vy vyVar, Context context) {
        this.w = vyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.a instanceof tk0;
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
        vy vyVar = this.w;
        ArrayList arrayList = vyVar.d1;
        Object obj = this.h.get(i10);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i12 = vyVar.G1;
            if (i12 >= 0) {
                return i12;
            }
            int i13 = vyVar.F1;
            if (i13 >= 0) {
                return i13;
            }
            return 0;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = vyVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.i0.q.x;
            }
            this.d = measuredWidth / org.telegram.messenger.i0.L(72.0f);
        }
        int i14 = this.r.get(i10, TLObject.FLAG_31);
        if (i14 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i11 = vyVar.E1;
        } else {
            Object obj2 = this.e.get(i14);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? vyVar.I1 : "recent".equals(obj2) ? vyVar.F1 : vyVar.G1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i11 = vyVar.E1;
        }
        return indexOf + i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        Object obj;
        int i11;
        vy vyVar;
        HashMap hashMap;
        int i12;
        vy vyVar2 = this.w;
        int i13 = vyVar2.c1;
        if (vyVar2.T2) {
            return;
        }
        int measuredWidth = vyVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = org.telegram.messenger.i0.q.x;
        }
        int L = measuredWidth / org.telegram.messenger.i0.L(72.0f);
        this.d = L;
        vyVar2.E0.y1(L);
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
        ArrayList arrayList2 = vyVar2.d1;
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
                vyVar = vyVar2;
                i11 = i13;
                hashMap = hashMap2;
                i10 = i17;
            } else {
                if (i17 == -4) {
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i13);
                    SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i13).g7;
                    ArrayList arrayList3 = b02.s0[i14];
                    if (vyVar2.m1.isEmpty()) {
                        i10 = i17;
                    } else {
                        int i19 = i17;
                        if (sharedPreferences.getLong("featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList3.get(i14)).set.id) {
                            int i20 = this.s;
                            this.s = i20 + 1;
                            sparseArray2.put(i20, "trend1");
                            int i21 = this.s;
                            this.s = i21 + 1;
                            sparseArray2.put(i21, "trend2");
                            i16 += 2;
                            vyVar = vyVar2;
                            i11 = i13;
                            hashMap = hashMap2;
                            i10 = i19;
                        } else {
                            i10 = i19;
                        }
                    }
                    vyVar = vyVar2;
                    i11 = i13;
                } else {
                    i10 = i17;
                    if (i10 == -3) {
                        arrayList = vyVar2.k1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i10 == -2) {
                        arrayList = vyVar2.j1;
                        if (!arrayList.isEmpty() && !vyVar2.S2) {
                            z10 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i10 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i10);
                            ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet2.documents;
                            if (!z10 && !vyVar2.S2) {
                                ArrayList<TLRPC.Document> arrayList5 = new ArrayList<>(arrayList4);
                                arrayList5.add(0, new TLRPC.TL_documentEmpty());
                                arrayList4 = arrayList5;
                                z10 = true;
                            }
                            hashMap2.put(tL_messages_stickerSet2, Integer.valueOf(this.s));
                            ArrayList<TLRPC.Document> arrayList6 = arrayList4;
                            tL_messages_stickerSet = tL_messages_stickerSet2;
                            arrayList = arrayList6;
                            obj = null;
                            i11 = i13;
                            if (i10 == vyVar2.e1) {
                                vyVar2.f1 = this.s;
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
                                    vyVar = vyVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                vyVar = vyVar2;
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
                            vyVar = vyVar2;
                        }
                        vyVar = vyVar2;
                        i11 = i13;
                    }
                    tL_messages_stickerSet = null;
                    i11 = i13;
                    if (i10 == vyVar2.e1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    vyVar = vyVar2;
                }
                hashMap = hashMap2;
            }
            i17 = i10 + 1;
            i13 = i11;
            vyVar2 = vyVar;
            hashMap2 = hashMap;
            i14 = 0;
            i15 = -5;
        }
    }

    @Override // s4.g0
    public final int b() {
        int i10 = this.s;
        if (i10 != 0) {
            return i10 + 1;
        }
        return 0;
    }

    @Override // s4.g0
    public final int d(int i10) {
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
    public final void f() {
        G();
        super.f();
    }

    @Override // s4.g0
    public final void p(int i10, int i11) {
        G();
        super.p(i10, i11);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        vy vyVar = this.w;
        int i11 = vyVar.c1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        SparseArray sparseArray = this.h;
        if (i12 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
            d8Var.d(document, null, this.n.get(i10), null, false, false);
            d8Var.setRecent(vyVar.j1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        if (i12 == 1) {
            org.telegram.ui.Cells.o3 o3Var = (org.telegram.ui.Cells.o3) view;
            if (i10 != this.s) {
                o3Var.setHeight(org.telegram.messenger.i0.L(82.0f));
                return;
            }
            int i13 = this.r.get(i10 - 1, TLObject.FLAG_31);
            if (i13 == Integer.MIN_VALUE) {
                o3Var.setHeight(1);
                return;
            }
            Object obj = this.e.get(i13);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? vyVar.j1 : vyVar.k1;
            }
            if (arrayList == null) {
                o3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                o3Var.setHeight(org.telegram.messenger.i0.L(8.0f));
                return;
            } else {
                int A = org.telegram.messenger.z20.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), vyVar.h.getHeight());
                o3Var.setHeight(A > 0 ? A : 1);
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
                ((org.telegram.ui.Cells.n8) view).b(org.telegram.messenger.cd.L0(org.telegram.messenger.ui.b0(i11).r0 ? 2131750833 : 2131750834, null), R.drawable.msg_close, org.telegram.messenger.cd.L0(2131754898, null), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
        n8Var.setHeaderOnClick(null);
        if (i10 == vyVar.f1) {
            int i15 = (vyVar.g1 && vyVar.h1 == null) ? 0 : vyVar.h1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat L0 = vyVar.J1 != null ? org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(vyVar.J1.id)) : null;
            n8Var.a(i15, org.telegram.messenger.cd.a0("CurrentGroupStickers", null, 2131751695, L0 != null ? L0.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i10);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                n8Var.a(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !vyVar.S2) {
                    n8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ly
                        public final /* synthetic */ ny b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    this.b.w.t1.d(tL_messages_stickerSet.set, null, true);
                                    break;
                                default:
                                    this.b.w.t1.d(tL_messages_stickerSet.set, null, false);
                                    break;
                            }
                        }
                    });
                }
                n8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ly
                    public final /* synthetic */ ny b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (r3) {
                            case 0:
                                this.b.w.t1.d(tL_messages_stickerSet.set, null, true);
                                break;
                            default:
                                this.b.w.t1.d(tL_messages_stickerSet.set, null, false);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (obj2 == vyVar.j1) {
            n8Var.b(org.telegram.messenger.cd.L0(2131746379, null), R.drawable.msg_close, org.telegram.messenger.cd.L0(2131752063, null), 0, 0);
        } else if (obj2 == vyVar.k1) {
            n8Var.a(0, org.telegram.messenger.cd.L0(2131750842, null));
        } else if (obj2 == vyVar.l1) {
            n8Var.a(0, org.telegram.messenger.cd.L0(2131746962, null));
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        vy vyVar = this.w;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        final int i11 = 0;
        final int i12 = 1;
        boolean z10 = true;
        Context context = this.c;
        View view = null;
        switch (i10) {
            case 0:
                view = new my(i11, context, p6Var, z10 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.o3(context);
                break;
            case 2:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(this.c, false, false, vyVar.Z1, vyVar.i2);
                n8Var.setOnIconClickListener(new sr(3, this, n8Var));
                view = n8Var;
                break;
            case 3:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
                l8Var.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Lf, null);
                sc.e.u(textView, 1, 14.0f, null, 2131749405);
                l8Var.addView(textView, w7.b6.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                l8Var.a = textView2;
                textView2.setPadding(org.telegram.messenger.i0.L(17.0f), 0, org.telegram.messenger.i0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.Gi, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
                textView2.setText(org.telegram.messenger.cd.L0(2131752116, null).toUpperCase());
                l8Var.addView(textView2, w7.b6.t(-2, 28, 51, 17, 10, 14, 8));
                l8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ky
                    public final /* synthetic */ ny b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                vy vyVar2 = this.b.w;
                                vx vxVar = vyVar2.t1;
                                if (vxVar != null) {
                                    vxVar.y(vyVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                vy vyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.ui.b0(vyVar3.c1).s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.vp.r1(vyVar3.c1).g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    ny nyVar = vyVar3.y0;
                                    if (nyVar != null) {
                                        nyVar.p(1, 2);
                                    }
                                    vyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.k2 k2Var = this.b.w.Y1;
                                if (k2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) k2Var).oa();
                                    break;
                                }
                                break;
                        }
                    }
                });
                l8Var.setLayoutParams(new s4.o0(-1, -2));
                view = l8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new s4.o0(-1, vyVar.b1));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(this.c, false, false, vyVar.Z1, vyVar.i2);
                n8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ky
                    public final /* synthetic */ ny b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i12) {
                            case 0:
                                vy vyVar2 = this.b.w;
                                vx vxVar = vyVar2.t1;
                                if (vxVar != null) {
                                    vxVar.y(vyVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                vy vyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.ui.b0(vyVar3.c1).s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.vp.r1(vyVar3.c1).g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    ny nyVar = vyVar3.y0;
                                    if (nyVar != null) {
                                        nyVar.p(1, 2);
                                    }
                                    vyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.k2 k2Var = this.b.w.Y1;
                                if (k2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) k2Var).oa();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = n8Var2;
                break;
            case 6:
                ty tyVar = new ty(vyVar, false);
                vyVar.F0 = tyVar;
                ag.b1 b1Var = new ag.b1(vyVar, context, tyVar);
                b1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), 0);
                b1Var.setClipToPadding(false);
                b1Var.i(new dh.g(4));
                b1Var.setOnItemClickListener(new k(this, 6));
                b1Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(52.0f)));
                view = b1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int L = org.telegram.messenger.i0.L(13.0f);
                int i13 = org.telegram.ui.ActionBar.t6.Bf;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.12f, vyVar.A(i13)));
                org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i13);
                linearLayout.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(linearLayout, d02, L2, null, p6Var);
                w7.e6.b(linearLayout, 0.1f, 1.5f);
                final int i14 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ky
                    public final /* synthetic */ ny b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i14) {
                            case 0:
                                vy vyVar2 = this.b.w;
                                vx vxVar = vyVar2.t1;
                                if (vxVar != null) {
                                    vxVar.y(vyVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                vy vyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.ui.b0(vyVar3.c1).s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.vp.r1(vyVar3.c1).g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    ny nyVar = vyVar3.y0;
                                    if (nyVar != null) {
                                        nyVar.p(1, 2);
                                    }
                                    vyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.k2 k2Var = this.b.w.Y1;
                                if (k2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) k2Var).oa();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                org.telegram.ui.ActionBar.a7.t(imageView, i13, p6Var, PorterDuff.Mode.SRC_IN);
                linearLayout.addView(imageView, w7.b6.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.m5.m(textView3, i13, p6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.cd.L0(2131751753, null));
                linearLayout.addView(textView3, w7.b6.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new ck0(view);
    }
}
