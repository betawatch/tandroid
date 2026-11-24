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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o14 extends n39 {
    public boolean E;
    public int M;
    public int N;
    public String O;
    public final /* synthetic */ t14 R;
    public final o04 c;
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
    public final n14 P = new n14(this);
    public int Q = -1;

    public o14(t14 t14Var, Context context) {
        this.R = t14Var;
        this.h = context;
        o04 o04Var = new o04(context, t14Var.d1, new w72(this, (byte) 26), new kx3(this, (byte) 3), t14Var.a2);
        this.c = o04Var;
        o04Var.setPadding(gl.L(10.0f), 0, gl.L(10.0f), gl.L(5.0f));
        o04Var.setClipToPadding(false);
        o04Var.g3.r = false;
        o04Var.setNestedScrollingEnabled(false);
        o04Var.setDrawSelection(false);
        o04Var.setOnTouchListener(new p04(this, (byte) 2));
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 7;
    }

    @Override // w39
    public final int b() {
        int i = this.y;
        if (i != 1) {
            return i + 1;
        }
        return 2;
    }

    @Override // w39
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

    @Override // w39
    public final void f() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        t14 t14Var = this.R;
        int i5 = t14Var.d1;
        l14 l14Var = t14Var.z0;
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
                sparseArray2.put(i8, k96.G(this.e.count, "Stickers", new Object[0]));
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
                int i12 = (i10 / l14Var.d) + i4;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i9);
                sparseArray2.put(i11, document);
                ArrayList arrayList2 = arrayList;
                int i13 = i9;
                TLRPC.TL_messages_stickerSet p0 = hq6.d0(i5).p0(hq6.r0(document));
                if (p0 != null) {
                    sparseArray4.put(i11, p0);
                }
                sparseIntArray.put(i11, i12);
                i10++;
                i9 = i13 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i10 / l14Var.d);
            for (int i14 = 0; i14 < ceil; i14++) {
                sparseArray.put(i4 + i14, Integer.valueOf(i10));
            }
            this.y = (ceil * l14Var.d) + this.y;
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
                sparseArray2.put(i17, k96.M0(2131744637, null));
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
                        int i25 = (i19 / l14Var.d) + i18;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i21);
                        sparseArray2.put(i23, document2);
                        String str4 = str;
                        int i26 = i18;
                        TLRPC.TL_messages_stickerSet p02 = hq6.d0(i2).p0(hq6.r0(document2));
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
                int ceil2 = (int) Math.ceil(i19 / l14Var.d);
                for (int i28 = 0; i28 < ceil2; i28++) {
                    sparseArray.put(i27 + i28, Integer.valueOf(i19));
                }
                this.y = (l14Var.d * ceil2) + this.y;
                i = i27 + ceil2;
            }
            if (z2) {
                int i29 = this.y;
                this.y = i29 + 1;
                sparseArray2.put(i29, k96.M0(2131744638, null));
                int i30 = i + 1;
                String str5 = (String) this.I.get(this.L);
                if (str5 != null) {
                    sparseArray3.put(this.y, str5);
                }
                int size5 = this.L.size();
                int i31 = 0;
                for (int i32 = 0; i32 < size5; i32++) {
                    int i33 = this.y + i31;
                    int i34 = (i31 / l14Var.d) + i30;
                    TLRPC.Document document3 = (TLRPC.Document) this.L.get(i32);
                    sparseArray2.put(i33, document3);
                    TLRPC.TL_messages_stickerSet p03 = hq6.d0(i2).p0(hq6.r0(document3));
                    if (p03 != null) {
                        sparseArray4.put(i33, p03);
                    }
                    sparseIntArray.put(i33, i34);
                    i31++;
                }
                int ceil3 = (int) Math.ceil(i31 / l14Var.d);
                for (int i35 = 0; i35 < ceil3; i35++) {
                    sparseArray.put(i30 + i35, Integer.valueOf(i31));
                }
                this.y = (ceil3 * l14Var.d) + this.y;
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
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        t14 t14Var = this.R;
        LongSparseArray longSparseArray = t14Var.A1;
        LongSparseArray longSparseArray2 = t14Var.z1;
        int i2 = s49Var.f;
        View view = s49Var.a;
        SparseArray sparseArray = this.r;
        boolean z = true;
        z = true;
        if (i2 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
            xya xyaVar = (xya) view;
            xyaVar.d(document, null, this.s.get(i), (String) this.x.get(i), false, false);
            if (!t14Var.k1.contains(document) && !t14Var.l1.contains(document)) {
                z = false;
            }
            xyaVar.setRecent(z);
            return;
        }
        Integer num = null;
        if (i2 == 1) {
            y14 y14Var = (y14) view;
            if (i != this.y) {
                y14Var.setHeight(gl.L(82.0f));
                return;
            }
            int i3 = this.w.get(i - 1, TLObject.FLAG_31);
            if (i3 == Integer.MIN_VALUE) {
                y14Var.setHeight(1);
                return;
            }
            Object obj = this.n.get(i3);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
            } else if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num == null) {
                y14Var.setHeight(1);
                return;
            } else if (num.intValue() == 0) {
                y14Var.setHeight(gl.L(8.0f));
                return;
            } else {
                int height = t14Var.h.getHeight() - (gl.L(82.0f) * ((int) Math.ceil(num.intValue() / t14Var.z0.d)));
                y14Var.setHeight(height > 0 ? height : 1);
                return;
            }
        }
        if (i2 == 2) {
            vza vzaVar = (vza) view;
            Object obj2 = sparseArray.get(i);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 instanceof String) {
                    vzaVar.a(0, (String) obj2);
                    vzaVar.c(0, null);
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            if (!TextUtils.isEmpty(this.O) && this.G.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    vzaVar.a(0, stickerSet.title);
                }
                vzaVar.c(this.O.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num2 = (Integer) this.H.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num2 != null) {
                vzaVar.b(stickerSet2.title, 0, null, num2.intValue(), !TextUtils.isEmpty(this.O) ? this.O.length() : 0);
            }
            vzaVar.c(0, null);
            return;
        }
        if (i2 == 3) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i);
            m84 m84Var = (m84) view;
            boolean z2 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) >= 0;
            char c = longSparseArray.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
            if (z2) {
                if (m84Var.r) {
                    longSparseArray2.remove(stickerSetCovered.set.id);
                    z2 = false;
                }
                if (c != 0 && !m84Var.r) {
                    longSparseArray.remove(stickerSetCovered.set.id);
                }
            }
            m84Var.b(z2, false);
            int y1 = TextUtils.isEmpty(this.O) ? -1 : gl.y1(stickerSetCovered.set.title, this.O);
            if (y1 >= 0) {
                m84Var.c(stickerSetCovered, false, false, y1, this.O.length(), false);
                return;
            }
            m84Var.c(stickerSetCovered, false, false, 0, 0, false);
            if (TextUtils.isEmpty(this.O) || gl.y1(stickerSetCovered.set.short_name, this.O) != 0) {
                return;
            }
            m84Var.d(this.O.length(), stickerSetCovered.set.short_name);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        t14 t14Var = this.R;
        wjb wjbVar = t14Var.a2;
        boolean z = true;
        char c = 1;
        Context context = this.h;
        View view = null;
        switch (i) {
            case 0:
                view = new k14(context, z, wjbVar, c == true ? 1 : 0);
                break;
            case 1:
                view = new y14(context);
                break;
            case 2:
                view = new vza(this.h, false, false, t14Var.a2, t14Var.j2);
                break;
            case 3:
                m84 m84Var = new m84(17, t14Var.a2, this.h, false, true);
                m84Var.setAddOnClickListener(new yj3(this, (byte) 6));
                view = m84Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new e49(-1, t14Var.c1));
                break;
            case 5:
                yc ycVar = new yc((byte) 19, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i2 = bkb.Cf;
                zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-gl.L(24.0f));
                ycVar.addView(imageView, nme.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                tb4.u(16.0f, 2131747957, 1, textView, null);
                zkb.X(textView, i2, wjbVar);
                ycVar.addView(textView, nme.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                ycVar.setLayoutParams(new e49(-1, -2));
                view = ycVar;
                break;
            case 7:
                e49 e49Var = new e49(-1, gl.L(79.0f));
                view = this.c;
                view.setLayoutParams(e49Var);
                break;
            case 8:
                view = new View(t14Var.getContext());
                view.setLayoutParams(new e49(-1, gl.L(68.0f)));
                break;
        }
        return new y29(view);
    }
}
