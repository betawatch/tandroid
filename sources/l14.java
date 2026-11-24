// default package

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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l14 extends n39 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ t14 w;

    public l14(t14 t14Var, Context context) {
        this.w = t14Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.a instanceof o39;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i) {
        int indexOf;
        int i2;
        t14 t14Var = this.w;
        ArrayList arrayList = t14Var.e1;
        Object obj = this.h.get(i);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i3 = t14Var.H1;
            if (i3 >= 0) {
                return i3;
            }
            int i4 = t14Var.G1;
            if (i4 >= 0) {
                return i4;
            }
            return 0;
        }
        if (i == 0) {
            i = 1;
        }
        if (this.d == 0) {
            int measuredWidth = t14Var.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = gl.q.x;
            }
            this.d = measuredWidth / gl.L(72.0f);
        }
        int i5 = this.r.get(i, TLObject.FLAG_31);
        if (i5 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i2 = t14Var.F1;
        } else {
            Object obj2 = this.e.get(i5);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? t14Var.J1 : "recent".equals(obj2) ? t14Var.G1 : t14Var.H1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i2 = t14Var.F1;
        }
        return indexOf + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        int i;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        Object obj;
        int i2;
        t14 t14Var;
        HashMap hashMap;
        int i3;
        t14 t14Var2 = this.w;
        int i4 = t14Var2.d1;
        if (t14Var2.T2) {
            return;
        }
        int measuredWidth = t14Var2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = gl.q.x;
        }
        int L = measuredWidth / gl.L(72.0f);
        this.d = L;
        t14Var2.F0.x1(L);
        SparseArray sparseArray = this.e;
        sparseArray.clear();
        HashMap hashMap2 = this.f;
        hashMap2.clear();
        SparseIntArray sparseIntArray = this.r;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.h;
        sparseArray2.clear();
        int i5 = 0;
        this.s = 0;
        ArrayList arrayList2 = t14Var2.e1;
        int i6 = -5;
        int i7 = 0;
        boolean z = false;
        int i8 = -5;
        while (i8 < arrayList2.size()) {
            if (i8 == i6) {
                int i9 = this.s;
                this.s = i9 + 1;
                sparseArray2.put(i9, "search");
                i7++;
                t14Var = t14Var2;
                i2 = i4;
                hashMap = hashMap2;
                i = i8;
            } else {
                if (i8 == -4) {
                    hq6 d0 = hq6.d0(i4);
                    SharedPreferences sharedPreferences = na7.q1(i4).Y3;
                    ArrayList arrayList3 = d0.t0[i5];
                    if (t14Var2.n1.isEmpty()) {
                        i = i8;
                    } else {
                        int i10 = i8;
                        if (sharedPreferences.getLong("featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList3.get(i5)).set.id) {
                            int i11 = this.s;
                            this.s = i11 + 1;
                            sparseArray2.put(i11, "trend1");
                            int i12 = this.s;
                            this.s = i12 + 1;
                            sparseArray2.put(i12, "trend2");
                            i7 += 2;
                            t14Var = t14Var2;
                            i2 = i4;
                            hashMap = hashMap2;
                            i = i10;
                        } else {
                            i = i10;
                        }
                    }
                    t14Var = t14Var2;
                    i2 = i4;
                } else {
                    i = i8;
                    if (i == -3) {
                        arrayList = t14Var2.l1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i == -2) {
                        arrayList = t14Var2.k1;
                        if (!arrayList.isEmpty() && !t14Var2.S2) {
                            z = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i);
                            ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet2.documents;
                            if (!z && !t14Var2.S2) {
                                ArrayList<TLRPC.Document> arrayList5 = new ArrayList<>(arrayList4);
                                arrayList5.add(0, new TLRPC.TL_documentEmpty());
                                arrayList4 = arrayList5;
                                z = true;
                            }
                            hashMap2.put(tL_messages_stickerSet2, Integer.valueOf(this.s));
                            ArrayList<TLRPC.Document> arrayList6 = arrayList4;
                            tL_messages_stickerSet = tL_messages_stickerSet2;
                            arrayList = arrayList6;
                            obj = null;
                            i2 = i4;
                            if (i == t14Var2.f1) {
                                t14Var2.g1 = this.s;
                                if (arrayList.isEmpty()) {
                                    sparseArray.put(i7, tL_messages_stickerSet);
                                    int i13 = i7 + 1;
                                    sparseIntArray.put(this.s, i7);
                                    sparseArray.put(i13, tL_messages_stickerSet);
                                    i7 += 2;
                                    sparseIntArray.put(this.s + 1, i13);
                                    int i14 = this.s;
                                    this.s = i14 + 1;
                                    sparseArray2.put(i14, tL_messages_stickerSet);
                                    int i15 = this.s;
                                    this.s = i15 + 1;
                                    sparseArray2.put(i15, "group");
                                    t14Var = t14Var2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                t14Var = t14Var2;
                                int ceil = (int) Math.ceil(arrayList.size() / this.d);
                                int i16 = this.s;
                                if (tL_messages_stickerSet != null) {
                                    sparseArray2.put(i16, tL_messages_stickerSet);
                                } else {
                                    sparseArray2.put(i16, arrayList);
                                }
                                sparseIntArray.put(this.s, i7);
                                int i17 = 0;
                                while (i17 < arrayList.size()) {
                                    int i18 = i17 + 1;
                                    int i19 = i18 + this.s;
                                    HashMap hashMap3 = hashMap2;
                                    sparseArray2.put(i19, arrayList.get(i17));
                                    SparseArray sparseArray3 = this.n;
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray3.put(i19, tL_messages_stickerSet);
                                    } else {
                                        sparseArray3.put(i19, obj);
                                    }
                                    sparseIntArray.put(i18 + this.s, (i17 / this.d) + i7 + 1);
                                    i17 = i18;
                                    hashMap2 = hashMap3;
                                }
                                hashMap = hashMap2;
                                int i20 = 0;
                                while (true) {
                                    i3 = ceil + 1;
                                    if (i20 >= i3) {
                                        break;
                                    }
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray.put(i7 + i20, tL_messages_stickerSet);
                                    } else if (i == -1) {
                                        sparseArray.put(i7 + i20, "premium");
                                    } else {
                                        int i21 = i7 + i20;
                                        if (i == -2) {
                                            sparseArray.put(i21, "recent");
                                        } else {
                                            sparseArray.put(i21, "fav");
                                        }
                                    }
                                    i20++;
                                }
                                this.s = (this.d * ceil) + 1 + this.s;
                                i7 += i3;
                            }
                            t14Var = t14Var2;
                        }
                        t14Var = t14Var2;
                        i2 = i4;
                    }
                    tL_messages_stickerSet = null;
                    i2 = i4;
                    if (i == t14Var2.f1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    t14Var = t14Var2;
                }
                hashMap = hashMap2;
            }
            i8 = i + 1;
            i4 = i2;
            t14Var2 = t14Var;
            hashMap2 = hashMap;
            i5 = 0;
            i6 = -5;
        }
    }

    @Override // w39
    public final int b() {
        int i = this.s;
        if (i != 0) {
            return i + 1;
        }
        return 0;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 4;
        }
        Object obj = this.h.get(i);
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

    @Override // w39
    public final void f() {
        G();
        super.f();
    }

    @Override // w39
    public final void q(int i, int i2) {
        G();
        super.q(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final void t(s49 s49Var, int i) {
        t14 t14Var = this.w;
        int i2 = t14Var.d1;
        int i3 = s49Var.f;
        View view = s49Var.a;
        SparseArray sparseArray = this.h;
        if (i3 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
            xya xyaVar = (xya) view;
            xyaVar.d(document, null, this.n.get(i), null, false, false);
            xyaVar.setRecent(t14Var.k1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        if (i3 == 1) {
            y14 y14Var = (y14) view;
            if (i != this.s) {
                y14Var.setHeight(gl.L(82.0f));
                return;
            }
            int i4 = this.r.get(i - 1, TLObject.FLAG_31);
            if (i4 == Integer.MIN_VALUE) {
                y14Var.setHeight(1);
                return;
            }
            Object obj = this.e.get(i4);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? t14Var.k1 : t14Var.l1;
            }
            if (arrayList == null) {
                y14Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                y14Var.setHeight(gl.L(8.0f));
                return;
            } else {
                int height = t14Var.h.getHeight() - (gl.L(82.0f) * ((int) Math.ceil(arrayList.size() / this.d)));
                y14Var.setHeight(height > 0 ? height : (byte) 1);
                return;
            }
        }
        final byte b = 0;
        if (i3 != 2) {
            if (i3 == 3) {
                ((sza) view).setIsLast(i == this.s - 1);
                return;
            } else {
                if (i3 == 5) {
                    ((vza) view).b(k96.M0(hq6.d0(i2).s0 ? 2131750820 : 2131750821, null), R.drawable.msg_close, k96.M0(2131754898, null), 0, 0);
                    return;
                }
                return;
            }
        }
        vza vzaVar = (vza) view;
        vzaVar.setHeaderOnClick(null);
        if (i == t14Var.g1) {
            int i5 = (t14Var.h1 && t14Var.i1 == null) ? 0 : t14Var.i1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat K0 = t14Var.K1 != null ? na7.q1(i2).K0(Long.valueOf(t14Var.K1.id)) : null;
            vzaVar.a(i5, k96.a0("CurrentGroupStickers", null, 2131751682, K0 != null ? K0.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                vzaVar.a(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !t14Var.S2) {
                    vzaVar.setEdit(new View.OnClickListener(this) { // from class: j14
                        public final /* synthetic */ l14 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b2 = b;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                            l14 l14Var = this.b;
                            switch (b2) {
                                case 0:
                                    l14Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                    break;
                                default:
                                    l14Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                    break;
                            }
                        }
                    });
                }
                vzaVar.setHeaderOnClick(new View.OnClickListener(this) { // from class: j14
                    public final /* synthetic */ l14 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b2 = r3;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        l14 l14Var = this.b;
                        switch (b2) {
                            case 0:
                                l14Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                break;
                            default:
                                l14Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (obj2 == t14Var.k1) {
            vzaVar.b(k96.M0(2131746171, null), R.drawable.msg_close, k96.M0(2131752051, null), 0, 0);
        } else if (obj2 == t14Var.l1) {
            vzaVar.a(0, k96.M0(2131750829, null));
        } else if (obj2 == t14Var.m1) {
            vzaVar.a(0, k96.M0(2131746756, null));
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        t14 t14Var = this.w;
        wjb wjbVar = t14Var.a2;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = true;
        Context context = this.c;
        View view = null;
        switch (i) {
            case 0:
                view = new k14(context, z ? 1 : 0, wjbVar, b);
                break;
            case 1:
                view = new y14(context);
                break;
            case 2:
                vza vzaVar = new vza(this.c, false, false, t14Var.a2, t14Var.j2);
                vzaVar.setOnIconClickListener(new xf3((Object) this, (Object) vzaVar, (byte) 8));
                view = vzaVar;
                break;
            case 3:
                sza szaVar = new sza(context);
                szaVar.setOrientation(1);
                TextView textView = new TextView(context);
                zkb.X(textView, bkb.Nf, null);
                ir2.r(14.0f, 1, 2131749204, textView, null);
                szaVar.addView(textView, nme.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                szaVar.a = textView2;
                textView2.setPadding(gl.L(17.0f), 0, gl.L(17.0f), 0);
                textView2.setGravity(17);
                tb4.w(textView2, bkb.Ii, null, 1, 14.0f);
                textView2.setBackground(sjb.f(bkb.Ei, 4.0f));
                textView2.setText(k96.M0(2131752104, null).toUpperCase());
                szaVar.addView(textView2, nme.t(-2, 28, 51, 17, 10, 14, 8));
                szaVar.setAddOnClickListener(new View.OnClickListener(this) { // from class: i14
                    public final /* synthetic */ l14 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b;
                        l14 l14Var = this.b;
                        switch (b3) {
                            case 0:
                                t14 t14Var2 = l14Var.w;
                                u04 u04Var = t14Var2.u1;
                                if (u04Var != null) {
                                    u04Var.y(t14Var2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                t14 t14Var3 = l14Var.w;
                                int i2 = t14Var3.d1;
                                ArrayList arrayList = hq6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    na7.q1(i2).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    l14 l14Var2 = t14Var3.z0;
                                    if (l14Var2 != null) {
                                        l14Var2.q(1, 2);
                                    }
                                    t14Var3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                d dVar = l14Var.w.Z1;
                                if (dVar instanceof mu1) {
                                    ((mu1) dVar).ba();
                                    break;
                                }
                                break;
                        }
                    }
                });
                szaVar.setLayoutParams(new e49(-1, -2));
                view = szaVar;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new e49(-1, t14Var.c1));
                view = view2;
                break;
            case 5:
                vza vzaVar2 = new vza(this.c, false, false, t14Var.a2, t14Var.j2);
                vzaVar2.setOnIconClickListener(new View.OnClickListener(this) { // from class: i14
                    public final /* synthetic */ l14 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        byte b3 = b2;
                        l14 l14Var = this.b;
                        switch (b3) {
                            case 0:
                                t14 t14Var2 = l14Var.w;
                                u04 u04Var = t14Var2.u1;
                                if (u04Var != null) {
                                    u04Var.y(t14Var2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                t14 t14Var3 = l14Var.w;
                                int i2 = t14Var3.d1;
                                ArrayList arrayList = hq6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    na7.q1(i2).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    l14 l14Var2 = t14Var3.z0;
                                    if (l14Var2 != null) {
                                        l14Var2.q(1, 2);
                                    }
                                    t14Var3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                d dVar = l14Var.w.Z1;
                                if (dVar instanceof mu1) {
                                    ((mu1) dVar).ba();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = vzaVar2;
                break;
            case 6:
                r14 r14Var = new r14(t14Var, false);
                t14Var.G0 = r14Var;
                fu fuVar = new fu(t14Var, context, r14Var);
                fuVar.setPadding(gl.L(8.0f), gl.L(4.0f), gl.L(8.0f), 0);
                fuVar.setClipToPadding(false);
                fuVar.i(new oq1((byte) 3));
                fuVar.setOnItemClickListener(new u(this, (byte) 25));
                fuVar.setLayoutParams(new e49(-1, gl.L(52.0f)));
                view = fuVar;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int L = gl.L(13.0f);
                int i2 = bkb.Df;
                ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.12f, t14Var.y(i2)));
                vkb K = zkb.K(0.12f, i2);
                linearLayout.setBackground(b0);
                zkb.j(linearLayout, b0, K, null, wjbVar);
                ote.b(linearLayout, 0.1f, 1.5f);
                final byte b3 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: i14
                    public final /* synthetic */ l14 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        byte b32 = b3;
                        l14 l14Var = this.b;
                        switch (b32) {
                            case 0:
                                t14 t14Var2 = l14Var.w;
                                u04 u04Var = t14Var2.u1;
                                if (u04Var != null) {
                                    u04Var.y(t14Var2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                t14 t14Var3 = l14Var.w;
                                int i22 = t14Var3.d1;
                                ArrayList arrayList = hq6.d0(i22).t0[0];
                                if (!arrayList.isEmpty()) {
                                    na7.q1(i22).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    l14 l14Var2 = t14Var3.z0;
                                    if (l14Var2 != null) {
                                        l14Var2.q(1, 2);
                                    }
                                    t14Var3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                d dVar = l14Var.w.Z1;
                                if (dVar instanceof mu1) {
                                    ((mu1) dVar).ba();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_IN);
                linearLayout.addView(imageView, nme.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                tb4.w(textView3, i2, wjbVar, 1, 11.0f);
                textView3.setText(k96.M0(2131751741, null));
                linearLayout.addView(textView3, nme.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, nme.d(-1, -1.0f, kk7.D1, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new y29(view);
    }
}
