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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class iy extends dk0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ qy w;

    public iy(qy qyVar, Context context) {
        this.w = qyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.a instanceof ek0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i7) {
        int indexOf;
        int i10;
        qy qyVar = this.w;
        ArrayList arrayList = qyVar.e1;
        Object obj = this.h.get(i7);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i11 = qyVar.H1;
            if (i11 >= 0) {
                return i11;
            }
            int i12 = qyVar.G1;
            if (i12 >= 0) {
                return i12;
            }
            return 0;
        }
        if (i7 == 0) {
            i7 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = qyVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
        }
        int i13 = this.r.get(i7, TLObject.FLAG_31);
        if (i13 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i10 = qyVar.F1;
        } else {
            Object obj2 = this.e.get(i13);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? qyVar.J1 : "recent".equals(obj2) ? qyVar.G1 : qyVar.H1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i10 = qyVar.F1;
        }
        return indexOf + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        int i7;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        Object obj;
        int i10;
        qy qyVar;
        HashMap hashMap;
        int i11;
        qy qyVar2 = this.w;
        int i12 = qyVar2.d1;
        if (qyVar2.U2) {
            return;
        }
        int measuredWidth = qyVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = org.telegram.messenger.g0.q.x;
        }
        int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
        this.d = L;
        qyVar2.F0.y1(L);
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
        ArrayList arrayList2 = qyVar2.e1;
        int i14 = -5;
        int i15 = 0;
        boolean z10 = false;
        int i16 = -5;
        while (i16 < arrayList2.size()) {
            if (i16 == i14) {
                int i17 = this.s;
                this.s = i17 + 1;
                sparseArray2.put(i17, "search");
                i15++;
                qyVar = qyVar2;
                i10 = i12;
                hashMap = hashMap2;
                i7 = i16;
            } else {
                if (i16 == -4) {
                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i12);
                    SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i12).i7;
                    ArrayList arrayList3 = d02.t0[i13];
                    if (qyVar2.n1.isEmpty()) {
                        i7 = i16;
                    } else {
                        int i18 = i16;
                        if (sharedPreferences.getLong("featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList3.get(i13)).set.id) {
                            int i19 = this.s;
                            this.s = i19 + 1;
                            sparseArray2.put(i19, "trend1");
                            int i20 = this.s;
                            this.s = i20 + 1;
                            sparseArray2.put(i20, "trend2");
                            i15 += 2;
                            qyVar = qyVar2;
                            i10 = i12;
                            hashMap = hashMap2;
                            i7 = i18;
                        } else {
                            i7 = i18;
                        }
                    }
                    qyVar = qyVar2;
                    i10 = i12;
                } else {
                    i7 = i16;
                    if (i7 == -3) {
                        arrayList = qyVar2.l1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i7 == -2) {
                        arrayList = qyVar2.k1;
                        if (!arrayList.isEmpty() && !qyVar2.T2) {
                            z10 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i7 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i7);
                            ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet2.documents;
                            if (!z10 && !qyVar2.T2) {
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
                            i10 = i12;
                            if (i7 == qyVar2.f1) {
                                qyVar2.g1 = this.s;
                                if (arrayList.isEmpty()) {
                                    sparseArray.put(i15, tL_messages_stickerSet);
                                    int i21 = i15 + 1;
                                    sparseIntArray.put(this.s, i15);
                                    sparseArray.put(i21, tL_messages_stickerSet);
                                    i15 += 2;
                                    sparseIntArray.put(this.s + 1, i21);
                                    int i22 = this.s;
                                    this.s = i22 + 1;
                                    sparseArray2.put(i22, tL_messages_stickerSet);
                                    int i23 = this.s;
                                    this.s = i23 + 1;
                                    sparseArray2.put(i23, "group");
                                    qyVar = qyVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                qyVar = qyVar2;
                                int ceil = (int) Math.ceil(arrayList.size() / this.d);
                                if (tL_messages_stickerSet != null) {
                                    sparseArray2.put(this.s, tL_messages_stickerSet);
                                } else {
                                    sparseArray2.put(this.s, arrayList);
                                }
                                sparseIntArray.put(this.s, i15);
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
                                    sparseIntArray.put(i25 + this.s, (i24 / this.d) + i15 + 1);
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
                                        sparseArray.put(i15 + i27, tL_messages_stickerSet);
                                    } else if (i7 == -1) {
                                        sparseArray.put(i15 + i27, "premium");
                                    } else if (i7 == -2) {
                                        sparseArray.put(i15 + i27, "recent");
                                    } else {
                                        sparseArray.put(i15 + i27, "fav");
                                    }
                                    i27++;
                                }
                                this.s = (this.d * ceil) + 1 + this.s;
                                i15 += i11;
                            }
                            qyVar = qyVar2;
                        }
                        qyVar = qyVar2;
                        i10 = i12;
                    }
                    tL_messages_stickerSet = null;
                    i10 = i12;
                    if (i7 == qyVar2.f1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    qyVar = qyVar2;
                }
                hashMap = hashMap2;
            }
            i16 = i7 + 1;
            i12 = i10;
            qyVar2 = qyVar;
            hashMap2 = hashMap;
            i13 = 0;
            i14 = -5;
        }
    }

    @Override // v4.i0
    public final int b() {
        int i7 = this.s;
        if (i7 != 0) {
            return i7 + 1;
        }
        return 0;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 4;
        }
        Object obj = this.h.get(i7);
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

    @Override // v4.i0
    public final void f() {
        G();
        super.f();
    }

    @Override // v4.i0
    public final void p(int i7, int i10) {
        G();
        super.p(i7, i10);
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        qy qyVar = this.w;
        int i10 = qyVar.d1;
        int i11 = f1Var.f;
        View view = f1Var.a;
        SparseArray sparseArray = this.h;
        if (i11 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
            org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
            z7Var.d(document, null, this.n.get(i7), null, false, false);
            z7Var.setRecent(qyVar.k1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        if (i11 == 1) {
            org.telegram.ui.Cells.n3 n3Var = (org.telegram.ui.Cells.n3) view;
            if (i7 != this.s) {
                n3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            int i12 = this.r.get(i7 - 1, TLObject.FLAG_31);
            if (i12 == Integer.MIN_VALUE) {
                n3Var.setHeight(1);
                return;
            }
            Object obj = this.e.get(i12);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? qyVar.k1 : qyVar.l1;
            }
            if (arrayList == null) {
                n3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                n3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                return;
            } else {
                int B = org.telegram.messenger.m10.B(82.0f, (int) Math.ceil(arrayList.size() / this.d), qyVar.h.getHeight());
                n3Var.setHeight(B > 0 ? B : 1);
                return;
            }
        }
        final int i13 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                ((org.telegram.ui.Cells.h8) view).setIsLast(i7 == this.s - 1);
                return;
            } else {
                if (i11 != 5) {
                    return;
                }
                ((org.telegram.ui.Cells.j8) view).b(org.telegram.messenger.gd.N0(org.telegram.messenger.ri.d0(i10).s0 ? 2131750820 : 2131750821, null), R.drawable.msg_close, org.telegram.messenger.gd.N0(2131754898, null), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
        j8Var.setHeaderOnClick(null);
        if (i7 == qyVar.g1) {
            int i14 = (qyVar.h1 && qyVar.i1 == null) ? 0 : qyVar.i1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat O0 = qyVar.K1 != null ? org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(qyVar.K1.id)) : null;
            j8Var.a(i14, org.telegram.messenger.gd.a0("CurrentGroupStickers", null, 2131751682, O0 != null ? O0.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i7);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                j8Var.a(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !qyVar.T2) {
                    j8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gy
                        public final /* synthetic */ iy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i13) {
                                case 0:
                                    this.b.w.u1.d(tL_messages_stickerSet.set, null, true);
                                    break;
                                default:
                                    this.b.w.u1.d(tL_messages_stickerSet.set, null, false);
                                    break;
                            }
                        }
                    });
                }
                j8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gy
                    public final /* synthetic */ iy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (r3) {
                            case 0:
                                this.b.w.u1.d(tL_messages_stickerSet.set, null, true);
                                break;
                            default:
                                this.b.w.u1.d(tL_messages_stickerSet.set, null, false);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (obj2 == qyVar.k1) {
            j8Var.b(org.telegram.messenger.gd.N0(2131746168, null), R.drawable.msg_close, org.telegram.messenger.gd.N0(2131752051, null), 0, 0);
        } else if (obj2 == qyVar.l1) {
            j8Var.a(0, org.telegram.messenger.gd.N0(2131750829, null));
        } else if (obj2 == qyVar.m1) {
            j8Var.a(0, org.telegram.messenger.gd.N0(2131746753, null));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        qy qyVar = this.w;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.a2;
        final int i10 = 0;
        final int i11 = 1;
        boolean z10 = true;
        boolean z11 = true;
        Context context = this.c;
        View view = null;
        switch (i7) {
            case 0:
                view = new jg.b2(z11 ? 1 : 0, context, i6Var, z10 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.n3(context);
                break;
            case 2:
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.c, false, false, qyVar.a2, qyVar.j2);
                j8Var.setOnIconClickListener(new l8(12, this, j8Var));
                view = j8Var;
                break;
            case 3:
                org.telegram.ui.Cells.h8 h8Var = new org.telegram.ui.Cells.h8(context);
                h8Var.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Of, null);
                i5.c.r(14.0f, 1, 2131749203, textView, null);
                h8Var.addView(textView, c8.na.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                h8Var.a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.Ji, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 4.0f));
                textView2.setText(org.telegram.messenger.gd.N0(2131752104, null).toUpperCase());
                h8Var.addView(textView2, c8.na.t(-2, 28, 51, 17, 10, 14, 8));
                h8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fy
                    public final /* synthetic */ iy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                qy qyVar2 = this.b.w;
                                qx qxVar = qyVar2.u1;
                                if (qxVar != null) {
                                    qxVar.y(qyVar2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                qy qyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.ri.d0(qyVar3.d1).t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.mp.u1(qyVar3.d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    iy iyVar = qyVar3.z0;
                                    if (iyVar != null) {
                                        iyVar.p(1, 2);
                                    }
                                    qyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.g2 g2Var = this.b.w.Z1;
                                if (g2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) g2Var).Ba();
                                    break;
                                }
                                break;
                        }
                    }
                });
                h8Var.setLayoutParams(new v4.q0(-1, -2));
                view = h8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new v4.q0(-1, qyVar.c1));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.c, false, false, qyVar.a2, qyVar.j2);
                j8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fy
                    public final /* synthetic */ iy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i11) {
                            case 0:
                                qy qyVar2 = this.b.w;
                                qx qxVar = qyVar2.u1;
                                if (qxVar != null) {
                                    qxVar.y(qyVar2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                qy qyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.ri.d0(qyVar3.d1).t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.mp.u1(qyVar3.d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    iy iyVar = qyVar3.z0;
                                    if (iyVar != null) {
                                        iyVar.p(1, 2);
                                    }
                                    qyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.g2 g2Var = this.b.w.Z1;
                                if (g2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) g2Var).Ba();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = j8Var2;
                break;
            case 6:
                oy oyVar = new oy(qyVar, false);
                qyVar.G0 = oyVar;
                di.b1 b1Var = new di.b1(qyVar, context, oyVar);
                b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                b1Var.setClipToPadding(false);
                b1Var.i(new fi.k(7));
                b1Var.setOnItemClickListener(new n(this, 6));
                b1Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(52.0f)));
                view = b1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int L = org.telegram.messenger.g0.L(13.0f);
                int i12 = org.telegram.ui.ActionBar.n6.Ef;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.12f, qyVar.z(i12)));
                org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i12);
                linearLayout.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(linearLayout, d02, K, null, i6Var);
                c8.sa.b(linearLayout, 0.1f, 1.5f);
                final int i13 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fy
                    public final /* synthetic */ iy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i13) {
                            case 0:
                                qy qyVar2 = this.b.w;
                                qx qxVar = qyVar2.u1;
                                if (qxVar != null) {
                                    qxVar.y(qyVar2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                qy qyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.ri.d0(qyVar3.d1).t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.mp.u1(qyVar3.d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    iy iyVar = qyVar3.z0;
                                    if (iyVar != null) {
                                        iyVar.p(1, 2);
                                    }
                                    qyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.g2 g2Var = this.b.w.Z1;
                                if (g2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) g2Var).Ba();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                org.telegram.ui.ActionBar.u6.s(imageView, i12, i6Var, PorterDuff.Mode.SRC_IN);
                linearLayout.addView(imageView, c8.na.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.f3.l(textView3, i12, i6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.gd.N0(2131751741, null));
                linearLayout.addView(textView3, c8.na.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, c8.na.d(-1, -1.0f, org.telegram.messenger.ks.E1, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new mj0(view);
    }
}
