package jg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import c8.ma;
import hi.o4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.k8;
import org.telegram.ui.Cells.n3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c2 extends dk0 {
    public int E;
    public ImageView M;
    public TextView N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public String S;
    public final h6 U;
    public final Context d;
    public final y31 e;
    public final TLRPC.StickerSetCovered[] f;
    public final LongSparseArray h;
    public final LongSparseArray n;
    public final int c = k10.t0;
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseArray w = new SparseArray();
    public final SparseIntArray x = new SparseIntArray();
    public final SparseArray y = new SparseArray();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final SparseArray L = new SparseArray();
    public final a2 T = new a2(this);

    public c2(Context context, y31 y31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, h6 h6Var) {
        this.d = context;
        this.e = y31Var;
        this.f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.n = longSparseArray2;
        this.U = h6Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(v3 v3Var, int i7, boolean z10) {
        boolean z11;
        v3 v3Var2;
        boolean z12;
        int i10 = this.c;
        si d02 = si.d0(i10);
        ArrayList arrayList = d02.v0[0];
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.s.get(i7);
        boolean z13 = arrayList != null && arrayList.contains(Long.valueOf(stickerSetCovered.set.id));
        int i11 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f;
            if (i11 >= stickerSetCoveredArr.length) {
                z11 = false;
                break;
            }
            if (stickerSetCoveredArr[i11] != null) {
                TLRPC.TL_messages_stickerSet q02 = si.d0(i10).q0(stickerSetCoveredArr[i11].set.id);
                if (q02 != null && !q02.set.archived) {
                    stickerSetCoveredArr[i11] = null;
                } else if (stickerSetCoveredArr[i11].set.id == stickerSetCovered.set.id) {
                    z11 = true;
                    break;
                }
            }
            i11++;
        }
        int A1 = TextUtils.isEmpty(this.S) ? -1 : org.telegram.messenger.g0.A1(stickerSetCovered.set.title, this.S);
        if (A1 >= 0) {
            v3Var2 = v3Var;
            z12 = z10;
            v3Var2.c(stickerSetCovered, z13, z12, A1, this.S.length(), z11);
        } else {
            v3Var2 = v3Var;
            z12 = z10;
            v3Var2.c(stickerSetCovered, z13, z12, 0, 0, z11);
            if (!TextUtils.isEmpty(this.S) && org.telegram.messenger.g0.A1(stickerSetCovered.set.short_name, this.S) == 0) {
                v3Var2.d(this.S.length(), stickerSetCovered.set.short_name);
            }
        }
        if (z13) {
            d02.h1(stickerSetCovered.set.id);
        }
        long j3 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray = this.h;
        boolean z14 = longSparseArray.indexOfKey(j3) >= 0;
        long j10 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray2 = this.n;
        boolean z15 = longSparseArray2.indexOfKey(j10) >= 0;
        if (z14 || z15) {
            if (z14 && v3Var2.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
                z14 = false;
            } else if (z15 && !v3Var2.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
            }
        }
        v3Var2.b(!z11 && z14, z12);
        d02.s1(stickerSetCovered);
        v3Var2.setNeedDivider(i7 > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r1 >= r2.length) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r2[r1] != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        r2[r1] = r8;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r9 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r9.b(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r7.h.put(r8.set.id, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r9 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r7.e.a.g(r9.getStickerSet(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r9 = r7.L;
        r1 = r9.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r2 >= r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r3 = (org.telegram.tgnet.TLRPC.StickerSetCovered) r9.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r3 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r3.set.id != r8.set.id) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        h(r2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0049, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(TLRPC.StickerSetCovered stickerSetCovered, v3 v3Var) {
        int i7 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f;
            if (i7 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i7] != null) {
                TLRPC.TL_messages_stickerSet q02 = si.d0(this.c).q0(stickerSetCoveredArr[i7].set.id);
                if (q02 != null && !q02.set.archived) {
                    stickerSetCoveredArr[i7] = null;
                    break;
                } else if (stickerSetCoveredArr[i7].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i7++;
        }
    }

    @Override // v4.i0
    public final int b() {
        return Math.max(1, this.E + 1);
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0 && this.E == 0) {
            return 5;
        }
        if (i7 == b() - 1) {
            return 4;
        }
        Object obj = this.s.get(i7);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v21, types: [org.telegram.tgnet.TLRPC$TL_messages_stickerSet, org.telegram.tgnet.TLRPC$messages_StickerSet] */
    @Override // v4.i0
    public final void f() {
        y31 y31Var;
        int i7;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.x;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.L;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.y;
        sparseArray5.clear();
        this.E = 0;
        ArrayList arrayList5 = this.F;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.G;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.K;
        int i11 = !arrayList7.isEmpty() ? 1 : 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size + size2 + i11) {
            SparseArray sparseArray6 = this.w;
            y31 y31Var2 = this.e;
            if (i12 < size2) {
                y31Var = y31Var2;
                ?? r62 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i12);
                i7 = size;
                arrayList3 = r62.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i10 = i11;
                stickerSetCovered = r62;
            } else {
                y31Var = y31Var2;
                i7 = size;
                int i14 = i12 - size2;
                if (i14 < i11) {
                    int size3 = arrayList7.size();
                    String str = "";
                    arrayList = arrayList6;
                    i10 = i11;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < size3) {
                        int i17 = size3;
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(i15);
                        int i18 = i15;
                        String str2 = (String) this.J.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.E + i16, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i19 = 0;
                        while (i19 < size4) {
                            String str3 = str;
                            int i20 = this.E + i16;
                            int i21 = size4;
                            int a10 = (i16 / y31Var.a()) + i13;
                            int i22 = i19;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i19);
                            sparseArray3.put(i20, document);
                            ArrayList arrayList9 = arrayList7;
                            int i23 = i16;
                            TLRPC.TL_messages_stickerSet q02 = si.d0(this.c).q0(si.s0(document));
                            if (q02 != null) {
                                sparseArray6.put(i20, q02);
                            }
                            sparseIntArray.put(i20, a10);
                            i16 = i23 + 1;
                            i19 = i22 + 1;
                            str = str3;
                            size4 = i21;
                            arrayList7 = arrayList9;
                        }
                        i15 = i18 + 1;
                        size3 = i17;
                        sparseArray5 = sparseArray7;
                    }
                    sparseArray = sparseArray5;
                    arrayList2 = arrayList7;
                    int ceil = (int) Math.ceil(i16 / y31Var.a());
                    for (int i24 = 0; i24 < ceil; i24++) {
                        sparseArray2.put(i13 + i24, Integer.valueOf(i16));
                    }
                    this.E = (y31Var.a() * ceil) + this.E;
                    i13 += ceil;
                    arrayList4 = arrayList5;
                    i12++;
                    size = i7;
                    arrayList6 = arrayList;
                    i11 = i10;
                    sparseArray5 = sparseArray;
                    arrayList5 = arrayList4;
                    arrayList7 = arrayList2;
                } else {
                    sparseArray = sparseArray5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    i10 = i11;
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList5.get(i14 - i10);
                    arrayList3 = stickerSetCovered2.covers;
                    stickerSetCovered = stickerSetCovered2;
                }
            }
            if (!arrayList3.isEmpty()) {
                int ceil2 = (int) Math.ceil(arrayList3.size() / y31Var.a());
                sparseArray3.put(this.E, stickerSetCovered);
                if (i12 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.E, stickerSetCovered);
                }
                sparseIntArray.put(this.E, i13);
                int size5 = arrayList3.size();
                int i25 = 0;
                while (i25 < size5) {
                    int i26 = i25 + 1;
                    int i27 = ceil2;
                    int i28 = this.E + i26;
                    int a11 = i25 / y31Var.a();
                    ArrayList arrayList10 = arrayList5;
                    sparseArray3.put(i28, arrayList3.get(i25));
                    sparseArray6.put(i28, stickerSetCovered);
                    sparseIntArray.put(i28, a11 + i13 + 1);
                    if (i12 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                        sparseArray4.put(i28, stickerSetCovered);
                    }
                    i25 = i26;
                    ceil2 = i27;
                    arrayList5 = arrayList10;
                }
                int i29 = ceil2;
                arrayList4 = arrayList5;
                int i30 = i29 + 1;
                for (int i31 = 0; i31 < i30; i31++) {
                    sparseArray2.put(i13 + i31, stickerSetCovered);
                }
                this.E = (y31Var.a() * i29) + 1 + this.E;
                i13 += i30;
                i12++;
                size = i7;
                arrayList6 = arrayList;
                i11 = i10;
                sparseArray5 = sparseArray;
                arrayList5 = arrayList4;
                arrayList7 = arrayList2;
            }
            arrayList4 = arrayList5;
            i12++;
            size = i7;
            arrayList6 = arrayList;
            i11 = i10;
            sparseArray5 = sparseArray;
            arrayList5 = arrayList4;
            arrayList7 = arrayList2;
        }
        super.f();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        SparseArray sparseArray = this.s;
        if (i10 == 0) {
            ((a8) view).d((TLRPC.Document) sparseArray.get(i7), null, this.w.get(i7), (String) this.y.get(i7), false, false);
            return;
        }
        if (i10 == 1) {
            ((n3) view).setHeight(0);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            E((v3) view, i7, false);
            return;
        }
        k8 k8Var = (k8) view;
        Object obj = sparseArray.get(i7);
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!TextUtils.isEmpty(this.S) && this.H.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    k8Var.a(0, stickerSet.title);
                }
                k8Var.c(this.S.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num = (Integer) this.I.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num != null) {
                k8Var.b(stickerSet2.title, 0, null, num.intValue(), !TextUtils.isEmpty(this.S) ? this.S.length() : 0);
            }
            k8Var.c(0, null);
        }
    }

    @Override // v4.i0
    public final void v(v4.f1 f1Var, int i7, List list) {
        if (list.contains(0) && f1Var.f == 3) {
            E((v3) f1Var.a, i7, true);
        } else {
            t(f1Var, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.View] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        h6 h6Var = this.U;
        Context context = this.d;
        if (i7 == 0) {
            b2 b2Var = new b2(0, context, h6Var, false ? 1 : 0);
            b2Var.getImageView().E0(3);
            frameLayout = b2Var;
        } else if (i7 == 1) {
            frameLayout = new n3(context);
        } else if (i7 == 2) {
            frameLayout = new k8(this.d, false, true, this.U, false);
        } else if (i7 == 3) {
            v3 v3Var = new v3(17, this.d, this.U, true, true);
            v3Var.setAddOnClickListener(new o4(this, 6));
            frameLayout = v3Var;
        } else if (i7 != 4) {
            frameLayout = null;
            if (i7 == 5) {
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                ImageView imageView = new ImageView(context);
                this.M = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.M.setImageResource(R.drawable.stickers_empty);
                ImageView imageView2 = this.M;
                int i10 = m6.Df;
                t6.s(imageView2, i10, h6Var, PorterDuff.Mode.MULTIPLY);
                linearLayout.addView(this.M, ma.o(-2, -2));
                linearLayout.addView(new Space(context), ma.o(-1, 15));
                TextView textView = new TextView(context);
                this.N = textView;
                textView.setText(hd.N0(2131747956, null));
                this.N.setTextSize(1, 16.0f);
                t6.U(this.N, i10, h6Var);
                linearLayout.addView(this.N, ma.o(-2, -2));
                linearLayout.setMinimumHeight(org.telegram.messenger.g0.L(112.0f));
                linearLayout.setLayoutParams(ma.c(-1.0f, -1));
                frameLayout = linearLayout;
            }
        } else {
            frameLayout = new View(context);
        }
        return new mj0(frameLayout);
    }
}
