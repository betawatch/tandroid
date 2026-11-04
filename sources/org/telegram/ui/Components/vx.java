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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vx extends sj0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ ey w;

    public vx(ey eyVar, Context context) {
        this.w = eyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.a instanceof tj0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i3) {
        int indexOf;
        int i10;
        ey eyVar = this.w;
        ArrayList arrayList = eyVar.e1;
        Object obj = this.h.get(i3);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i11 = eyVar.H1;
            if (i11 >= 0) {
                return i11;
            }
            int i12 = eyVar.G1;
            if (i12 >= 0) {
                return i12;
            }
            return 0;
        }
        if (i3 == 0) {
            i3 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = eyVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
        }
        int i13 = this.r.get(i3, TLObject.FLAG_31);
        if (i13 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i10 = eyVar.F1;
        } else {
            Object obj2 = this.e.get(i13);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? eyVar.J1 : "recent".equals(obj2) ? eyVar.G1 : eyVar.H1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i10 = eyVar.F1;
        }
        return indexOf + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        int i3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        Object obj;
        int i10;
        ey eyVar;
        HashMap hashMap;
        int i11;
        ey eyVar2 = this.w;
        int i12 = eyVar2.d1;
        if (eyVar2.U2) {
            return;
        }
        int measuredWidth = eyVar2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = org.telegram.messenger.g0.q.x;
        }
        int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
        this.d = L;
        eyVar2.F0.y1(L);
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
        ArrayList arrayList2 = eyVar2.e1;
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
                eyVar = eyVar2;
                i10 = i12;
                hashMap = hashMap2;
                i3 = i16;
            } else {
                if (i16 == -4) {
                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i12);
                    SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i12).f7;
                    ArrayList arrayList3 = b02.t0[i13];
                    if (eyVar2.n1.isEmpty()) {
                        i3 = i16;
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
                            eyVar = eyVar2;
                            i10 = i12;
                            hashMap = hashMap2;
                            i3 = i18;
                        } else {
                            i3 = i18;
                        }
                    }
                    eyVar = eyVar2;
                    i10 = i12;
                } else {
                    i3 = i16;
                    if (i3 == -3) {
                        arrayList = eyVar2.l1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i3 == -2) {
                        arrayList = eyVar2.k1;
                        if (!arrayList.isEmpty() && !eyVar2.T2) {
                            z10 = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i3 != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i3);
                            ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet2.documents;
                            if (!z10 && !eyVar2.T2) {
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
                            if (i3 == eyVar2.f1) {
                                eyVar2.g1 = this.s;
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
                                    eyVar = eyVar2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                eyVar = eyVar2;
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
                                    } else if (i3 == -1) {
                                        sparseArray.put(i15 + i27, "premium");
                                    } else if (i3 == -2) {
                                        sparseArray.put(i15 + i27, "recent");
                                    } else {
                                        sparseArray.put(i15 + i27, "fav");
                                    }
                                    i27++;
                                }
                                this.s = (this.d * ceil) + 1 + this.s;
                                i15 += i11;
                            }
                            eyVar = eyVar2;
                        }
                        eyVar = eyVar2;
                        i10 = i12;
                    }
                    tL_messages_stickerSet = null;
                    i10 = i12;
                    if (i3 == eyVar2.f1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    eyVar = eyVar2;
                }
                hashMap = hashMap2;
            }
            i16 = i3 + 1;
            i12 = i10;
            eyVar2 = eyVar;
            hashMap2 = hashMap;
            i13 = 0;
            i14 = -5;
        }
    }

    @Override // u4.h0
    public final int b() {
        int i3 = this.s;
        if (i3 != 0) {
            return i3 + 1;
        }
        return 0;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 4;
        }
        Object obj = this.h.get(i3);
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

    @Override // u4.h0
    public final void f() {
        G();
        super.f();
    }

    @Override // u4.h0
    public final void p(int i3, int i10) {
        G();
        super.p(i3, i10);
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        ey eyVar = this.w;
        int i10 = eyVar.d1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        SparseArray sparseArray = this.h;
        if (i11 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i3);
            org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
            y7Var.d(document, null, this.n.get(i3), null, false, false);
            y7Var.setRecent(eyVar.k1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        if (i11 == 1) {
            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view;
            if (i3 != this.s) {
                m3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            int i12 = this.r.get(i3 - 1, TLObject.FLAG_31);
            if (i12 == Integer.MIN_VALUE) {
                m3Var.setHeight(1);
                return;
            }
            Object obj = this.e.get(i12);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? eyVar.k1 : eyVar.l1;
            }
            if (arrayList == null) {
                m3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                m3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                return;
            } else {
                int A = org.telegram.messenger.camera.q.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), eyVar.h.getHeight());
                m3Var.setHeight(A > 0 ? A : 1);
                return;
            }
        }
        final int i13 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                ((org.telegram.ui.Cells.g8) view).setIsLast(i3 == this.s - 1);
                return;
            } else {
                if (i11 != 5) {
                    return;
                }
                ((org.telegram.ui.Cells.i8) view).b(org.telegram.messenger.bd.M0(org.telegram.messenger.li.b0(i10).s0 ? 2131750833 : 2131750834, null), R.drawable.msg_close, org.telegram.messenger.bd.M0(2131754898, null), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
        i8Var.setHeaderOnClick(null);
        if (i3 == eyVar.g1) {
            int i14 = (eyVar.h1 && eyVar.i1 == null) ? 0 : eyVar.i1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat M0 = eyVar.K1 != null ? org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(eyVar.K1.id)) : null;
            i8Var.a(i14, org.telegram.messenger.bd.a0("CurrentGroupStickers", null, 2131751695, M0 != null ? M0.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i3);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                i8Var.a(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !eyVar.T2) {
                    i8Var.setEdit(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ux
                        public final /* synthetic */ vx b;

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
                i8Var.setHeaderOnClick(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ux
                    public final /* synthetic */ vx b;

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
        if (obj2 == eyVar.k1) {
            i8Var.b(org.telegram.messenger.bd.M0(2131746372, null), R.drawable.msg_close, org.telegram.messenger.bd.M0(2131752063, null), 0, 0);
        } else if (obj2 == eyVar.l1) {
            i8Var.a(0, org.telegram.messenger.bd.M0(2131750842, null));
        } else if (obj2 == eyVar.m1) {
            i8Var.a(0, org.telegram.messenger.bd.M0(2131746955, null));
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ey eyVar = this.w;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.a2;
        final int i10 = 0;
        final int i11 = 1;
        boolean z10 = true;
        boolean z11 = true;
        Context context = this.c;
        View view = null;
        switch (i3) {
            case 0:
                view = new kg.x1(z11 ? 1 : 0, context, e6Var, z10 ? 1 : 0);
                break;
            case 1:
                view = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(this.c, false, false, eyVar.a2, eyVar.j2);
                i8Var.setOnIconClickListener(new q2(16, this, i8Var));
                view = i8Var;
                break;
            case 3:
                org.telegram.ui.Cells.g8 g8Var = new org.telegram.ui.Cells.g8(context);
                g8Var.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Lf, null);
                k2.p1.u(textView, 1, 14.0f, null, 2131749404);
                g8Var.addView(textView, b8.mf.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                g8Var.a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.Gi, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                textView2.setText(org.telegram.messenger.bd.M0(2131752116, null).toUpperCase());
                g8Var.addView(textView2, b8.mf.t(-2, 28, 51, 17, 10, 14, 8));
                g8Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tx
                    public final /* synthetic */ vx b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                ey eyVar2 = this.b.w;
                                fx fxVar = eyVar2.u1;
                                if (fxVar != null) {
                                    fxVar.y(eyVar2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                ey eyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.li.b0(eyVar3.d1).t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.hp.s1(eyVar3.d1).f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    vx vxVar = eyVar3.z0;
                                    if (vxVar != null) {
                                        vxVar.p(1, 2);
                                    }
                                    eyVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.d2 d2Var = this.b.w.Z1;
                                if (d2Var instanceof org.telegram.ui.wm) {
                                    ((org.telegram.ui.wm) d2Var).ya();
                                    break;
                                }
                                break;
                        }
                    }
                });
                g8Var.setLayoutParams(new u4.p0(-1, -2));
                view = g8Var;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new u4.p0(-1, eyVar.c1));
                view = view2;
                break;
            case 5:
                org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(this.c, false, false, eyVar.a2, eyVar.j2);
                i8Var2.setOnIconClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tx
                    public final /* synthetic */ vx b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i11) {
                            case 0:
                                ey eyVar2 = this.b.w;
                                fx fxVar = eyVar2.u1;
                                if (fxVar != null) {
                                    fxVar.y(eyVar2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                ey eyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.li.b0(eyVar3.d1).t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.hp.s1(eyVar3.d1).f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    vx vxVar = eyVar3.z0;
                                    if (vxVar != null) {
                                        vxVar.p(1, 2);
                                    }
                                    eyVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.d2 d2Var = this.b.w.Z1;
                                if (d2Var instanceof org.telegram.ui.wm) {
                                    ((org.telegram.ui.wm) d2Var).ya();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = i8Var2;
                break;
            case 6:
                cy cyVar = new cy(eyVar, false);
                eyVar.G0 = cyVar;
                ci.j1 j1Var = new ci.j1(eyVar, context, cyVar);
                j1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                j1Var.setClipToPadding(false);
                j1Var.i(new ei.l(7));
                j1Var.setOnItemClickListener(new k(this, 6));
                j1Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(52.0f)));
                view = j1Var;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int L = org.telegram.messenger.g0.L(13.0f);
                int i12 = org.telegram.ui.ActionBar.k6.Bf;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.12f, eyVar.z(i12)));
                org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i12);
                linearLayout.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(linearLayout, d02, L2, null, e6Var);
                b8.pf.b(linearLayout, 0.1f, 1.5f);
                final int i13 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tx
                    public final /* synthetic */ vx b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i13) {
                            case 0:
                                ey eyVar2 = this.b.w;
                                fx fxVar = eyVar2.u1;
                                if (fxVar != null) {
                                    fxVar.y(eyVar2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                ey eyVar3 = this.b.w;
                                ArrayList arrayList = org.telegram.messenger.li.b0(eyVar3.d1).t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.hp.s1(eyVar3.d1).f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    vx vxVar = eyVar3.z0;
                                    if (vxVar != null) {
                                        vxVar.p(1, 2);
                                    }
                                    eyVar3.X(false);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.d2 d2Var = this.b.w.Z1;
                                if (d2Var instanceof org.telegram.ui.wm) {
                                    ((org.telegram.ui.wm) d2Var).ya();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                org.telegram.ui.ActionBar.r6.t(imageView, i12, e6Var, PorterDuff.Mode.SRC_IN);
                linearLayout.addView(imageView, b8.mf.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.k5.n(textView3, i12, e6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.bd.M0(2131751753, null));
                linearLayout.addView(textView3, b8.mf.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new bj0(view);
    }
}
