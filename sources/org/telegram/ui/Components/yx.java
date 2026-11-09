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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yx extends pj0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ hy w;

    public yx(hy hyVar, Context context) {
        this.w = hyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.a instanceof qj0;
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
        hy hyVar = this.w;
        ArrayList arrayList = hyVar.d1;
        Object obj = this.h.get(i7);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i11 = hyVar.G1;
            if (i11 >= 0) {
                return i11;
            }
            int i12 = hyVar.F1;
            if (i12 >= 0) {
                return i12;
            }
            return 0;
        }
        if (i7 == 0) {
            i7 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = hyVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
        }
        int i13 = this.r.get(i7, TLObject.FLAG_31);
        if (i13 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i10 = hyVar.E1;
        } else {
            Object obj2 = this.e.get(i13);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? hyVar.I1 : "recent".equals(obj2) ? hyVar.F1 : hyVar.G1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i10 = hyVar.E1;
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
        hy hyVar;
        HashMap hashMap;
        int i11;
        hy hyVar2 = this.w;
        int i12 = hyVar2.c1;
        if (hyVar2.T2) {
            return;
        }
        int measuredWidth = hyVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = org.telegram.messenger.g0.q.x;
        }
        int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
        this.d = L;
        hyVar2.E0.y1(L);
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
        ArrayList arrayList2 = hyVar2.d1;
        int i14 = -5;
        int i15 = 0;
        boolean z9 = false;
        int i16 = -5;
        while (i16 < arrayList2.size()) {
            if (i16 == i14) {
                int i17 = this.s;
                this.s = i17 + 1;
                sparseArray2.put(i17, "search");
                i15++;
                hyVar = hyVar2;
                i10 = i12;
                hashMap = hashMap2;
                i7 = i16;
            } else {
                if (i16 == -4) {
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i12);
                    SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i12).f7;
                    ArrayList arrayList3 = b02.s0[i13];
                    if (hyVar2.m1.isEmpty()) {
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
                            hyVar = hyVar2;
                            i10 = i12;
                            hashMap = hashMap2;
                            i7 = i18;
                        } else {
                            i7 = i18;
                        }
                    }
                    hyVar = hyVar2;
                    i10 = i12;
                } else {
                    i7 = i16;
                    if (i7 == -3) {
                        arrayList = hyVar2.k1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i7 == -2) {
                        arrayList = hyVar2.j1;
                        if (!arrayList.isEmpty() && !hyVar2.S2) {
                            z9 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i7 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i7);
                            ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet2.documents;
                            if (!z9 && !hyVar2.S2) {
                                ArrayList<TLRPC.Document> arrayList5 = new ArrayList<>(arrayList4);
                                arrayList5.add(0, new TLRPC.TL_documentEmpty());
                                arrayList4 = arrayList5;
                                z9 = true;
                            }
                            hashMap2.put(tL_messages_stickerSet2, Integer.valueOf(this.s));
                            ArrayList<TLRPC.Document> arrayList6 = arrayList4;
                            tL_messages_stickerSet = tL_messages_stickerSet2;
                            arrayList = arrayList6;
                            obj = null;
                            i10 = i12;
                            if (i7 == hyVar2.e1) {
                                hyVar2.f1 = this.s;
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
                                    hyVar = hyVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                hyVar = hyVar2;
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
                            hyVar = hyVar2;
                        }
                        hyVar = hyVar2;
                        i10 = i12;
                    }
                    tL_messages_stickerSet = null;
                    i10 = i12;
                    if (i7 == hyVar2.e1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    hyVar = hyVar2;
                }
                hashMap = hashMap2;
            }
            i16 = i7 + 1;
            i12 = i10;
            hyVar2 = hyVar;
            hashMap2 = hashMap;
            i13 = 0;
            i14 = -5;
        }
    }

    @Override // v4.g0
    public final int b() {
        int i7 = this.s;
        if (i7 != 0) {
            return i7 + 1;
        }
        return 0;
    }

    @Override // v4.g0
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

    @Override // v4.g0
    public final void f() {
        G();
        super.f();
    }

    @Override // v4.g0
    public final void p(int i7, int i10) {
        G();
        super.p(i7, i10);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        hy hyVar = this.w;
        int i10 = hyVar.c1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        SparseArray sparseArray = this.h;
        if (i11 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
            org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
            z7Var.d(document, null, this.n.get(i7), null, false, false);
            z7Var.setRecent(hyVar.j1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        if (i11 == 1) {
            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view;
            if (i7 != this.s) {
                m3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            int i12 = this.r.get(i7 - 1, TLObject.FLAG_31);
            if (i12 == Integer.MIN_VALUE) {
                m3Var.setHeight(1);
                return;
            }
            Object obj = this.e.get(i12);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? hyVar.j1 : hyVar.k1;
            }
            if (arrayList == null) {
                m3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                m3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                return;
            } else {
                int A = org.telegram.messenger.camera.q.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), hyVar.h.getHeight());
                m3Var.setHeight(A > 0 ? A : 1);
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
                ((org.telegram.ui.Cells.j8) view).b(org.telegram.messenger.id.M0(org.telegram.messenger.ui.b0(i10).r0 ? 2131750832 : 2131750833, null), R.drawable.msg_close, org.telegram.messenger.id.M0(2131754898, null), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
        j8Var.setHeaderOnClick(null);
        if (i7 == hyVar.f1) {
            int i14 = (hyVar.g1 && hyVar.h1 == null) ? 0 : hyVar.h1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat M0 = hyVar.J1 != null ? org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(hyVar.J1.id)) : null;
            j8Var.a(i14, org.telegram.messenger.id.a0("CurrentGroupStickers", null, 2131751694, M0 != null ? M0.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i7);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                j8Var.a(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !hyVar.S2) {
                    j8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xx
                        public final /* synthetic */ yx b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i13) {
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
                j8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xx
                    public final /* synthetic */ yx b;

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
        if (obj2 == hyVar.j1) {
            j8Var.b(org.telegram.messenger.id.M0(2131746364, null), R.drawable.msg_close, org.telegram.messenger.id.M0(2131752063, null), 0, 0);
        } else if (obj2 == hyVar.k1) {
            j8Var.a(0, org.telegram.messenger.id.M0(2131750841, null));
        } else if (obj2 == hyVar.l1) {
            j8Var.a(0, org.telegram.messenger.id.M0(2131746947, null));
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        hy hyVar = this.w;
        org.telegram.ui.ActionBar.g6 g6Var = hyVar.Z1;
        final int i10 = 0;
        final int i11 = 1;
        boolean z9 = true;
        boolean z10 = true;
        Context context = this.c;
        View view = null;
        switch (i7) {
            case 0:
                view = new jg.c2(z10 ? 1 : 0, context, g6Var, z9 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.c, false, false, hyVar.Z1, hyVar.i2);
                j8Var.setOnIconClickListener(new lk(10, this, j8Var));
                view = j8Var;
                break;
            case 3:
                org.telegram.ui.Cells.h8 h8Var = new org.telegram.ui.Cells.h8(context);
                h8Var.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Lf, null);
                jg.g.v(textView, 1, 14.0f, null, 2131749396);
                h8Var.addView(textView, c8.ha.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                h8Var.a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.l6.Gi, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 4.0f));
                textView2.setText(org.telegram.messenger.id.M0(2131752116, null).toUpperCase());
                h8Var.addView(textView2, c8.ha.t(-2, 28, 51, 17, 10, 14, 8));
                h8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wx
                    public final /* synthetic */ yx b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                hy hyVar2 = this.b.w;
                                ix ixVar = hyVar2.t1;
                                if (ixVar != null) {
                                    ixVar.y(hyVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                hy hyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.ui.b0(hyVar3.c1).s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.qp.s1(hyVar3.c1).f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    yx yxVar = hyVar3.y0;
                                    if (yxVar != null) {
                                        yxVar.p(1, 2);
                                    }
                                    hyVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.f2 f2Var = this.b.w.Y1;
                                if (f2Var instanceof org.telegram.ui.cn) {
                                    ((org.telegram.ui.cn) f2Var).Aa();
                                    break;
                                }
                                break;
                        }
                    }
                });
                h8Var.setLayoutParams(new v4.o0(-1, -2));
                view = h8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new v4.o0(-1, hyVar.b1));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.c, false, false, hyVar.Z1, hyVar.i2);
                j8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wx
                    public final /* synthetic */ yx b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i11) {
                            case 0:
                                hy hyVar2 = this.b.w;
                                ix ixVar = hyVar2.t1;
                                if (ixVar != null) {
                                    ixVar.y(hyVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                hy hyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.ui.b0(hyVar3.c1).s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.qp.s1(hyVar3.c1).f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    yx yxVar = hyVar3.y0;
                                    if (yxVar != null) {
                                        yxVar.p(1, 2);
                                    }
                                    hyVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.f2 f2Var = this.b.w.Y1;
                                if (f2Var instanceof org.telegram.ui.cn) {
                                    ((org.telegram.ui.cn) f2Var).Aa();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = j8Var2;
                break;
            case 6:
                fy fyVar = new fy(hyVar, false);
                hyVar.F0 = fyVar;
                bi.q1 q1Var = new bi.q1(hyVar, context, fyVar);
                q1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                q1Var.setClipToPadding(false);
                q1Var.i(new di.k(7));
                q1Var.setOnItemClickListener(new k(this, 6));
                q1Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(52.0f)));
                view = q1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int L = org.telegram.messenger.g0.L(13.0f);
                int i12 = org.telegram.ui.ActionBar.l6.Bf;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.r1(0.12f, hyVar.z(i12)));
                org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.12f, i12);
                linearLayout.setBackground(d02);
                org.telegram.ui.ActionBar.s6.j(linearLayout, d02, K, null, g6Var);
                c8.ka.b(linearLayout, 0.1f, 1.5f);
                final int i13 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wx
                    public final /* synthetic */ yx b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i13) {
                            case 0:
                                hy hyVar2 = this.b.w;
                                ix ixVar = hyVar2.t1;
                                if (ixVar != null) {
                                    ixVar.y(hyVar2.J1.id);
                                    break;
                                }
                                break;
                            case 1:
                                hy hyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.ui.b0(hyVar3.c1).s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.qp.s1(hyVar3.c1).f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    yx yxVar = hyVar3.y0;
                                    if (yxVar != null) {
                                        yxVar.p(1, 2);
                                    }
                                    hyVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.f2 f2Var = this.b.w.Y1;
                                if (f2Var instanceof org.telegram.ui.cn) {
                                    ((org.telegram.ui.cn) f2Var).Aa();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                org.telegram.ui.ActionBar.s6.s(imageView, i12, g6Var, PorterDuff.Mode.SRC_IN);
                linearLayout.addView(imageView, c8.ha.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.k5.n(textView3, i12, g6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.id.M0(2131751753, null));
                linearLayout.addView(textView3, c8.ha.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new yi0(view);
    }
}
