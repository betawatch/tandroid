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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class dy extends tj0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ ly w;

    public dy(ly lyVar, Context context) {
        this.w = lyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.a instanceof uj0;
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
        ly lyVar = this.w;
        ArrayList arrayList = lyVar.e1;
        Object obj = this.h.get(i7);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i11 = lyVar.H1;
            if (i11 >= 0) {
                return i11;
            }
            int i12 = lyVar.G1;
            if (i12 >= 0) {
                return i12;
            }
            return 0;
        }
        if (i7 == 0) {
            i7 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = lyVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
        }
        int i13 = this.r.get(i7, TLObject.FLAG_31);
        if (i13 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i10 = lyVar.F1;
        } else {
            Object obj2 = this.e.get(i13);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? lyVar.J1 : "recent".equals(obj2) ? lyVar.G1 : lyVar.H1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i10 = lyVar.F1;
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
        ly lyVar;
        HashMap hashMap;
        int i11;
        ly lyVar2 = this.w;
        int i12 = lyVar2.d1;
        if (lyVar2.U2) {
            return;
        }
        int measuredWidth = lyVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = org.telegram.messenger.g0.q.x;
        }
        int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
        this.d = L;
        lyVar2.F0.y1(L);
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
        ArrayList arrayList2 = lyVar2.e1;
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
                lyVar = lyVar2;
                i10 = i12;
                hashMap = hashMap2;
                i7 = i16;
            } else {
                if (i16 == -4) {
                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i12);
                    SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i12).g7;
                    ArrayList arrayList3 = b02.t0[i13];
                    if (lyVar2.n1.isEmpty()) {
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
                            lyVar = lyVar2;
                            i10 = i12;
                            hashMap = hashMap2;
                            i7 = i18;
                        } else {
                            i7 = i18;
                        }
                    }
                    lyVar = lyVar2;
                    i10 = i12;
                } else {
                    i7 = i16;
                    if (i7 == -3) {
                        arrayList = lyVar2.l1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i7 == -2) {
                        arrayList = lyVar2.k1;
                        if (!arrayList.isEmpty() && !lyVar2.T2) {
                            z10 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i7 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i7);
                            ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet2.documents;
                            if (!z10 && !lyVar2.T2) {
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
                            if (i7 == lyVar2.f1) {
                                lyVar2.g1 = this.s;
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
                                    lyVar = lyVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                lyVar = lyVar2;
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
                            lyVar = lyVar2;
                        }
                        lyVar = lyVar2;
                        i10 = i12;
                    }
                    tL_messages_stickerSet = null;
                    i10 = i12;
                    if (i7 == lyVar2.f1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    lyVar = lyVar2;
                }
                hashMap = hashMap2;
            }
            i16 = i7 + 1;
            i12 = i10;
            lyVar2 = lyVar;
            hashMap2 = hashMap;
            i13 = 0;
            i14 = -5;
        }
    }

    @Override // v4.h0
    public final int b() {
        int i7 = this.s;
        if (i7 != 0) {
            return i7 + 1;
        }
        return 0;
    }

    @Override // v4.h0
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

    @Override // v4.h0
    public final void f() {
        G();
        super.f();
    }

    @Override // v4.h0
    public final void p(int i7, int i10) {
        G();
        super.p(i7, i10);
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        ly lyVar = this.w;
        int i10 = lyVar.d1;
        int i11 = e1Var.f;
        View view = e1Var.a;
        SparseArray sparseArray = this.h;
        if (i11 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
            org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
            y7Var.d(document, null, this.n.get(i7), null, false, false);
            y7Var.setRecent(lyVar.k1.contains(document));
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
                arrayList = "recent".equals(obj) ? lyVar.k1 : lyVar.l1;
            }
            if (arrayList == null) {
                m3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                m3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                return;
            } else {
                int A = org.telegram.messenger.i20.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), lyVar.h.getHeight());
                m3Var.setHeight(A > 0 ? A : 1);
                return;
            }
        }
        final int i13 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                ((org.telegram.ui.Cells.g8) view).setIsLast(i7 == this.s - 1);
                return;
            } else {
                if (i11 != 5) {
                    return;
                }
                ((org.telegram.ui.Cells.i8) view).b(org.telegram.messenger.hd.M0(org.telegram.messenger.si.b0(i10).s0 ? 2131750832 : 2131750833, null), R.drawable.msg_close, org.telegram.messenger.hd.M0(2131754898, null), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
        i8Var.setHeaderOnClick(null);
        if (i7 == lyVar.g1) {
            int i14 = (lyVar.h1 && lyVar.i1 == null) ? 0 : lyVar.i1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat M0 = lyVar.K1 != null ? org.telegram.messenger.np.s1(i10).M0(Long.valueOf(lyVar.K1.id)) : null;
            i8Var.a(i14, org.telegram.messenger.hd.a0("CurrentGroupStickers", null, 2131751694, M0 != null ? M0.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i7);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                i8Var.a(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !lyVar.T2) {
                    i8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cy
                        public final /* synthetic */ dy b;

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
                i8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cy
                    public final /* synthetic */ dy b;

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
        if (obj2 == lyVar.k1) {
            i8Var.b(org.telegram.messenger.hd.M0(2131746364, null), R.drawable.msg_close, org.telegram.messenger.hd.M0(2131752063, null), 0, 0);
        } else if (obj2 == lyVar.l1) {
            i8Var.a(0, org.telegram.messenger.hd.M0(2131750841, null));
        } else if (obj2 == lyVar.m1) {
            i8Var.a(0, org.telegram.messenger.hd.M0(2131746947, null));
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ly lyVar = this.w;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.a2;
        int i10 = 17;
        final int i11 = 0;
        final int i12 = 1;
        boolean z10 = true;
        boolean z11 = true;
        Context context = this.c;
        View view = null;
        switch (i7) {
            case 0:
                view = new jg.b2(z11 ? 1 : 0, context, e6Var, z10 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(this.c, false, false, lyVar.a2, lyVar.j2);
                i8Var.setOnIconClickListener(new n2(i10, this, i8Var));
                view = i8Var;
                break;
            case 3:
                org.telegram.ui.Cells.g8 g8Var = new org.telegram.ui.Cells.g8(context);
                g8Var.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Of, null);
                i5.c.w(textView, 1, 14.0f, null, 2131749396);
                g8Var.addView(textView, c8.ja.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                g8Var.a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.Ji, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
                textView2.setText(org.telegram.messenger.hd.M0(2131752116, null).toUpperCase());
                g8Var.addView(textView2, c8.ja.t(-2, 28, 51, 17, 10, 14, 8));
                g8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ay
                    public final /* synthetic */ dy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                ly lyVar2 = this.b.w;
                                mx mxVar = lyVar2.u1;
                                if (mxVar != null) {
                                    mxVar.y(lyVar2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                ly lyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.si.b0(lyVar3.d1).t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.np.s1(lyVar3.d1).g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    dy dyVar = lyVar3.z0;
                                    if (dyVar != null) {
                                        dyVar.p(1, 2);
                                    }
                                    lyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.e2 e2Var = this.b.w.Z1;
                                if (e2Var instanceof org.telegram.ui.an) {
                                    ((org.telegram.ui.an) e2Var).Ba();
                                    break;
                                }
                                break;
                        }
                    }
                });
                g8Var.setLayoutParams(new v4.p0(-1, -2));
                view = g8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new v4.p0(-1, lyVar.c1));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(this.c, false, false, lyVar.a2, lyVar.j2);
                i8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ay
                    public final /* synthetic */ dy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i12) {
                            case 0:
                                ly lyVar2 = this.b.w;
                                mx mxVar = lyVar2.u1;
                                if (mxVar != null) {
                                    mxVar.y(lyVar2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                ly lyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.si.b0(lyVar3.d1).t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.np.s1(lyVar3.d1).g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    dy dyVar = lyVar3.z0;
                                    if (dyVar != null) {
                                        dyVar.p(1, 2);
                                    }
                                    lyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.e2 e2Var = this.b.w.Z1;
                                if (e2Var instanceof org.telegram.ui.an) {
                                    ((org.telegram.ui.an) e2Var).Ba();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = i8Var2;
                break;
            case 6:
                jy jyVar = new jy(lyVar, false);
                lyVar.G0 = jyVar;
                di.c1 c1Var = new di.c1(lyVar, context, jyVar);
                c1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                c1Var.setClipToPadding(false);
                c1Var.i(new fi.k(7));
                c1Var.setOnItemClickListener(new j(this, 6));
                c1Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(52.0f)));
                view = c1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int L = org.telegram.messenger.g0.L(13.0f);
                int i13 = org.telegram.ui.ActionBar.j6.Ef;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.r1(0.12f, lyVar.z(i13)));
                org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.12f, i13);
                linearLayout.setBackground(d02);
                org.telegram.ui.ActionBar.q6.j(linearLayout, d02, K, null, e6Var);
                c8.na.b(linearLayout, 0.1f, 1.5f);
                final int i14 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ay
                    public final /* synthetic */ dy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i14) {
                            case 0:
                                ly lyVar2 = this.b.w;
                                mx mxVar = lyVar2.u1;
                                if (mxVar != null) {
                                    mxVar.y(lyVar2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                ly lyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.si.b0(lyVar3.d1).t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.np.s1(lyVar3.d1).g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    dy dyVar = lyVar3.z0;
                                    if (dyVar != null) {
                                        dyVar.p(1, 2);
                                    }
                                    lyVar3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.e2 e2Var = this.b.w.Z1;
                                if (e2Var instanceof org.telegram.ui.an) {
                                    ((org.telegram.ui.an) e2Var).Ba();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                org.telegram.ui.ActionBar.q6.s(imageView, i13, e6Var, PorterDuff.Mode.SRC_IN);
                linearLayout.addView(imageView, c8.ja.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.k5.m(textView3, i13, e6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.hd.M0(2131751753, null));
                linearLayout.addView(textView3, c8.ja.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new cj0(view);
    }
}
