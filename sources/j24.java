// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j24 extends c79 {
    public boolean E;
    public int M;
    public int N;
    public String O;
    public final /* synthetic */ o24 R;
    public final j14 c;
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
    public final i24 P = new i24(this);
    public int Q = -1;

    public j24(o24 o24Var, Context context) {
        this.R = o24Var;
        this.h = context;
        j14 j14Var = new j14(context, o24Var.d1, new n82(this, (byte) 26), new lu3(this, (byte) 5), o24Var.a2);
        this.c = j14Var;
        j14Var.setPadding(hl.L(10.0f), 0, hl.L(10.0f), hl.L(5.0f));
        j14Var.setClipToPadding(false);
        j14Var.g3.r = false;
        j14Var.setNestedScrollingEnabled(false);
        j14Var.setDrawSelection(false);
        j14Var.setOnTouchListener(new k14(this, (byte) 2));
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 7;
    }

    @Override // j79
    public final int b() {
        int i = this.y;
        if (i != 1) {
            return i + 1;
        }
        return 2;
    }

    @Override // j79
    public final int d(int i) {
        if (this.d != 0 && i == b() - 1) {
            return 8;
        }
        if (i == this.Q) {
            return 7;
        }
        if (i == 0) {
            return 4;
        }
        if (i == 1 && this.y == 1) {
            return 5;
        }
        Object obj = this.r.get(i);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
    }

    @Override // j79
    public final void f() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        o24 o24Var = this.R;
        int i5 = o24Var.d1;
        g24 g24Var = o24Var.z0;
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
        long j = this.d;
        String str = "";
        SparseArray sparseArray4 = this.s;
        if (j != 0) {
            ArrayList arrayList = this.f;
            int i6 = this.y;
            this.y = i6 + 1;
            sparseArray2.put(i6, "search");
            if (size > 0) {
                int i7 = this.y;
                this.y = i7 + 1;
                this.Q = i7;
                sparseArray2.put(i7, "packs");
                int i8 = this.y;
                this.y = i8 + 1;
                sparseArray2.put(i8, ob6.G(this.e.count, "Stickers", new Object[0]));
                i4 = 3;
            } else {
                i4 = 1;
            }
            String str2 = (String) this.I.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.y, str2);
            }
            int size2 = arrayList.size();
            int i9 = 0;
            int i10 = 0;
            while (i9 < size2) {
                int i11 = this.y + i10;
                int i12 = (i10 / g24Var.d) + i4;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i9);
                sparseArray2.put(i11, document);
                ArrayList arrayList2 = arrayList;
                int i13 = i9;
                TLRPC.TL_messages_stickerSet p0 = ls6.d0(i5).p0(ls6.r0(document));
                if (p0 != null) {
                    sparseArray4.put(i11, p0);
                }
                sparseIntArray.put(i11, i12);
                i10++;
                i9 = i13 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i10 / g24Var.d);
            for (int i14 = 0; i14 < ceil; i14++) {
                sparseArray.put(i4 + i14, Integer.valueOf(i10));
            }
            this.y = (ceil * g24Var.d) + this.y;
        } else {
            boolean isEmpty = this.J.isEmpty();
            ArrayList arrayList3 = this.L;
            boolean z3 = (arrayList3 == null || arrayList3.isEmpty()) ? false : true;
            int i15 = this.y;
            this.y = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.y;
                this.y = i16 + 1;
                this.Q = i16;
                sparseArray2.put(i16, "packs");
                i = 2;
            } else {
                i = 1;
            }
            if (isEmpty) {
                i2 = i5;
                z = isEmpty;
                z2 = z3;
                i3 = size;
            } else {
                int i17 = this.y;
                this.y = i17 + 1;
                sparseArray2.put(i17, ob6.M0(2131744531, null));
                int i18 = i + 1;
                int size3 = this.J.size();
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    i2 = i5;
                    if (i20 >= size3) {
                        break;
                    }
                    ArrayList arrayList4 = (ArrayList) this.J.get(i20);
                    boolean z4 = isEmpty;
                    String str3 = (String) this.I.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.y + i19, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z5 = z3;
                    int i21 = 0;
                    while (i21 < size4) {
                        int i22 = size4;
                        int i23 = this.y + i19;
                        int i24 = size;
                        int i25 = (i19 / g24Var.d) + i18;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i21);
                        sparseArray2.put(i23, document2);
                        String str4 = str;
                        int i26 = i18;
                        TLRPC.TL_messages_stickerSet p02 = ls6.d0(i2).p0(ls6.r0(document2));
                        if (p02 != null) {
                            sparseArray4.put(i23, p02);
                        }
                        sparseIntArray.put(i23, i25);
                        i19++;
                        i21++;
                        size4 = i22;
                        size = i24;
                        arrayList4 = arrayList5;
                        i18 = i26;
                        str = str4;
                    }
                    i20++;
                    i5 = i2;
                    isEmpty = z4;
                    z3 = z5;
                }
                z = isEmpty;
                z2 = z3;
                i3 = size;
                int i27 = i18;
                int ceil2 = (int) Math.ceil(i19 / g24Var.d);
                for (int i28 = 0; i28 < ceil2; i28++) {
                    sparseArray.put(i27 + i28, Integer.valueOf(i19));
                }
                this.y = (g24Var.d * ceil2) + this.y;
                i = i27 + ceil2;
            }
            if (z2) {
                int i29 = this.y;
                this.y = i29 + 1;
                sparseArray2.put(i29, ob6.M0(2131744532, null));
                int i30 = i + 1;
                String str5 = (String) this.I.get(this.L);
                if (str5 != null) {
                    sparseArray3.put(this.y, str5);
                }
                int size5 = this.L.size();
                int i31 = 0;
                for (int i32 = 0; i32 < size5; i32++) {
                    int i33 = this.y + i31;
                    int i34 = (i31 / g24Var.d) + i30;
                    TLRPC.Document document3 = (TLRPC.Document) this.L.get(i32);
                    sparseArray2.put(i33, document3);
                    TLRPC.TL_messages_stickerSet p03 = ls6.d0(i2).p0(ls6.r0(document3));
                    if (p03 != null) {
                        sparseArray4.put(i33, p03);
                    }
                    sparseIntArray.put(i33, i34);
                    i31++;
                }
                int ceil3 = (int) Math.ceil(i31 / g24Var.d);
                for (int i35 = 0; i35 < ceil3; i35++) {
                    sparseArray.put(i30 + i35, Integer.valueOf(i31));
                }
                this.y = (ceil3 * g24Var.d) + this.y;
            }
            if (z && !z2 && i3 == 0) {
                this.y = 1;
            }
        }
        super.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r8 != 0) goto L23;
     */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        o24 o24Var = this.R;
        LongSparseArray longSparseArray = o24Var.A1;
        LongSparseArray longSparseArray2 = o24Var.z1;
        int i2 = f89Var.f;
        View view = f89Var.a;
        SparseArray sparseArray = this.r;
        boolean z = true;
        z = true;
        if (i2 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
            x2b x2bVar = (x2b) view;
            x2bVar.d(document, null, this.s.get(i), (String) this.x.get(i), false, false);
            if (!o24Var.k1.contains(document) && !o24Var.l1.contains(document)) {
                z = false;
            }
            x2bVar.setRecent(z);
            return;
        }
        Integer num = null;
        if (i2 == 1) {
            t24 t24Var = (t24) view;
            if (i != this.y) {
                t24Var.setHeight(hl.L(82.0f));
                return;
            }
            int i3 = this.w.get(i - 1, TLObject.FLAG_31);
            if (i3 == Integer.MIN_VALUE) {
                t24Var.setHeight(1);
                return;
            }
            Object obj = this.n.get(i3);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
            } else if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num == null) {
                t24Var.setHeight(1);
                return;
            } else if (num.intValue() == 0) {
                t24Var.setHeight(hl.L(8.0f));
                return;
            } else {
                int height = o24Var.h.getHeight() - (hl.L(82.0f) * ((int) Math.ceil(num.intValue() / o24Var.z0.d)));
                t24Var.setHeight(height > 0 ? height : 1);
                return;
            }
        }
        if (i2 == 2) {
            u3b u3bVar = (u3b) view;
            Object obj2 = sparseArray.get(i);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 instanceof String) {
                    u3bVar.a(0, (String) obj2);
                    u3bVar.c(0, null);
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            if (!TextUtils.isEmpty(this.O) && this.G.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    u3bVar.a(0, stickerSet.title);
                }
                u3bVar.c(this.O.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num2 = (Integer) this.H.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num2 != null) {
                u3bVar.b(stickerSet2.title, 0, null, num2.intValue(), !TextUtils.isEmpty(this.O) ? this.O.length() : 0);
            }
            u3bVar.c(0, null);
            return;
        }
        if (i2 == 3) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i);
            h94 h94Var = (h94) view;
            boolean z2 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) >= 0;
            char c = longSparseArray.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
            if (z2) {
                if (h94Var.r) {
                    longSparseArray2.remove(stickerSetCovered.set.id);
                    z2 = false;
                }
                if (c != 0 && !h94Var.r) {
                    longSparseArray.remove(stickerSetCovered.set.id);
                }
            }
            h94Var.b(z2, false);
            int y1 = TextUtils.isEmpty(this.O) ? -1 : hl.y1(stickerSetCovered.set.title, this.O);
            if (y1 >= 0) {
                h94Var.c(stickerSetCovered, false, false, y1, this.O.length(), false);
                return;
            }
            h94Var.c(stickerSetCovered, false, false, 0, 0, false);
            if (TextUtils.isEmpty(this.O) || hl.y1(stickerSetCovered.set.short_name, this.O) != 0) {
                return;
            }
            h94Var.d(this.O.length(), stickerSetCovered.set.short_name);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        o24 o24Var = this.R;
        vnb vnbVar = o24Var.a2;
        boolean z = true;
        char c = 1;
        Context context = this.h;
        View view = null;
        switch (i) {
            case 0:
                view = new f24(context, z, vnbVar, c == true ? 1 : 0);
                break;
            case 1:
                view = new t24(context);
                break;
            case 2:
                view = new u3b(this.h, false, false, o24Var.a2, o24Var.j2);
                break;
            case 3:
                h94 h94Var = new h94(17, o24Var.a2, this.h, false, true);
                h94Var.setAddOnClickListener(new mh3(this, (byte) 8));
                view = h94Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new r79(-1, o24Var.c1));
                break;
            case 5:
                zc zcVar = new zc((byte) 19, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i2 = aob.Df;
                yob.s(imageView, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-hl.L(24.0f));
                zcVar.addView(imageView, tre.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                qd4.u(16.0f, 2131747880, 1, textView, null);
                yob.X(textView, i2, vnbVar);
                zcVar.addView(textView, tre.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                zcVar.setLayoutParams(new r79(-1, -2));
                view = zcVar;
                break;
            case 7:
                r79 r79Var = new r79(-1, hl.L(79.0f));
                view = this.c;
                view.setLayoutParams(r79Var);
                break;
            case 8:
                view = new View(o24Var.getContext());
                view.setLayoutParams(new r79(-1, hl.L(68.0f)));
                break;
        }
        return new n69(view);
    }
}
