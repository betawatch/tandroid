// default package

import android.content.Context;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c2c extends n39 {
    public final Context c;
    public boolean r;
    public boolean s;
    public int x;
    public final /* synthetic */ d2c y;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList n = new ArrayList();
    public int w = 5;

    public c2c(d2c d2cVar, Context context) {
        this.y = d2cVar;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (r8.get(r0).equals(-1) != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(int i, View view, boolean z) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z2;
        boolean z3;
        d2c d2cVar = this.y;
        LongSparseArray longSparseArray = d2cVar.e;
        LongSparseArray longSparseArray2 = d2cVar.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = d2cVar.c;
        int i2 = d2cVar.a;
        hq6 d0 = hq6.d0(i2);
        int i3 = this.x;
        SparseArray sparseArray = this.d;
        boolean z4 = true;
        ArrayList arrayList = this.e;
        if (i < i3) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue());
            ArrayList arrayList2 = d0.v0[0];
            boolean z5 = arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
            if (z5) {
                d0.f1(stickerSetCovered.set.id);
            }
            z2 = z5;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue());
            z2 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        d0.q1(stickerSetCovered2);
        int i4 = 0;
        while (true) {
            if (i4 >= stickerSetCoveredArr.length) {
                z3 = false;
                break;
            }
            if (stickerSetCoveredArr[i4] != null) {
                TLRPC.TL_messages_stickerSet p0 = hq6.d0(i2).p0(stickerSetCoveredArr[i4].set.id);
                if (p0 != null && !p0.set.archived) {
                    stickerSetCoveredArr[i4] = null;
                } else if (stickerSetCoveredArr[i4].set.id == stickerSetCovered2.set.id) {
                    z3 = true;
                    break;
                }
            }
            i4++;
        }
        boolean D0 = d0.D0(stickerSetCovered2.set.id, true);
        boolean z6 = longSparseArray2.indexOfKey(stickerSetCovered2.set.id) >= 0;
        boolean z7 = longSparseArray.indexOfKey(stickerSetCovered2.set.id) >= 0;
        if (z6 && D0) {
            longSparseArray2.remove(stickerSetCovered2.set.id);
            z6 = false;
        } else if (z7 && !D0) {
            longSparseArray.remove(stickerSetCovered2.set.id);
        }
        m84 m84Var = (m84) view;
        m84Var.c(stickerSetCovered2, z2, z, 0, 0, z3);
        m84Var.b(!z3 && z6, z);
        if (i > 0) {
            int i5 = i - 1;
            if (sparseArray.get(i5) != null) {
            }
            m84Var.setNeedDivider(z4);
        }
        z4 = false;
        m84Var.setNeedDivider(z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r3 >= r1.length) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r1[r3] != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r1[r3] = r9;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r1 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r10 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if ((r10 instanceof i84) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        ((i84) r10).f.a(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if ((r10 instanceof m84) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        ((m84) r10).b(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r0.d.put(r9.set.id, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r10 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r0.b.g(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r10 = r8.f;
        r0 = r10.size();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r1 >= r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        r3 = (org.telegram.tgnet.TLRPC.StickerSetCovered) r10.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r3 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r3.set.id != r9.set.id) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        h(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004a, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(TLRPC.StickerSetCovered stickerSetCovered, FrameLayout frameLayout) {
        d2c d2cVar = this.y;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = d2cVar.c;
        int i = 0;
        while (true) {
            if (i >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i] != null) {
                TLRPC.TL_messages_stickerSet p0 = hq6.d0(d2cVar.a).p0(stickerSetCoveredArr[i].set.id);
                if (p0 != null && !p0.set.archived) {
                    stickerSetCoveredArr[i] = null;
                    break;
                } else if (stickerSetCoveredArr[i].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i++;
        }
    }

    public final void G() {
        int i;
        int i2;
        d2c d2cVar = this.y;
        int measuredWidth = d2cVar.getMeasuredWidth();
        int i3 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / gl.L(72.0f));
            this.w = max;
            u1c u1cVar = d2cVar.r;
            if (u1cVar.J != max) {
                u1cVar.x1(max);
                d2cVar.K = false;
            }
        }
        if (d2cVar.K) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.x = 0;
        hq6 d0 = hq6.d0(d2cVar.a);
        ArrayList arrayList2 = new ArrayList(d0.t0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.n);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i4 >= arrayList2.size()) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i4);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                if (i4 == size) {
                    int i7 = this.x;
                    this.x = i7 + 1;
                    sparseArray.put(i7, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.x));
                int i8 = this.x;
                this.x = i8 + 1;
                int i9 = i5 + 1;
                sparseArray.put(i8, Integer.valueOf(i5));
                if (stickerSetCovered.covers.isEmpty()) {
                    sparseArray.put(this.x, stickerSetCovered.cover);
                } else {
                    i6 = (int) Math.ceil(stickerSetCovered.covers.size() / this.w);
                    for (int i10 = i3; i10 < stickerSetCovered.covers.size(); i10++) {
                        sparseArray.put(this.x + i10, stickerSetCovered.covers.get(i10));
                    }
                }
                int i11 = 0;
                while (true) {
                    i = this.w * i6;
                    i2 = this.x;
                    if (i11 >= i) {
                        break;
                    }
                    sparseArray2.put(i2 + i11, stickerSetCovered);
                    i11++;
                }
                this.x = i + i2;
                i5 = i9;
            }
            i4++;
            i3 = 0;
        }
        if (this.x != 0) {
            d2cVar.K = true;
            d2cVar.L = d0.Z();
        }
        f();
    }

    @Override // w39
    public final int b() {
        return this.x + 1;
    }

    @Override // w39
    public final int d(int i) {
        if (i == this.x) {
            return 3;
        }
        Object obj = this.d.get(i);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj.equals(-1) ? 4 : 2;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            ((xya) view).d((TLRPC.Document) this.d.get(i), null, this.f.get(i), null, false, false);
        } else {
            if (i2 == 1) {
                ((y14) view).setHeight(gl.L(82.0f));
                return;
            }
            if (i2 != 2) {
                if (i2 == 4) {
                    ((l35) view).setText(k96.M0(2131747571, null));
                    return;
                } else if (i2 != 5) {
                    return;
                }
            }
            E(i, view, false);
        }
    }

    @Override // w39
    public final void u(s49 s49Var, int i, List list) {
        if (!list.contains(0)) {
            t(s49Var, i);
            return;
        }
        int i2 = s49Var.f;
        if (i2 == 2 || i2 == 5) {
            E(i, s49Var.a, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        d2c d2cVar = this.y;
        wjb wjbVar = d2cVar.Q;
        final byte b = 0;
        boolean z = false;
        byte b2 = 3;
        Context context = this.c;
        if (i != 0) {
            final byte b3 = 1;
            if (i == 1) {
                frameLayout = new y14(context);
            } else if (i == 2) {
                m84 m84Var = new m84(17, d2cVar.Q, this.c, true, true);
                m84Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: b2c
                    public final /* synthetic */ c2c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b4 = b;
                        c2c c2cVar = this.b;
                        switch (b4) {
                            case 0:
                                m84 m84Var2 = (m84) view.getParent();
                                TLRPC.StickerSetCovered stickerSet = m84Var2.getStickerSet();
                                d2c d2cVar2 = c2cVar.y;
                                LongSparseArray longSparseArray = d2cVar2.d;
                                LongSparseArray longSparseArray2 = d2cVar2.e;
                                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                    if (!m84Var2.r) {
                                        c2cVar.F(stickerSet, m84Var2);
                                        break;
                                    } else {
                                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                                        d2cVar2.b.h(stickerSet);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i84 i84Var = (i84) view.getParent();
                                TLRPC.StickerSetCovered stickerSet2 = i84Var.getStickerSet();
                                d2c d2cVar3 = c2cVar.y;
                                LongSparseArray longSparseArray3 = d2cVar3.d;
                                LongSparseArray longSparseArray4 = d2cVar3.e;
                                if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                    if (!i84Var.w) {
                                        c2cVar.F(stickerSet2, i84Var);
                                        break;
                                    } else {
                                        longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                        d2cVar3.b.h(stickerSet2);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                frameLayout = m84Var;
            } else if (i == 3) {
                frameLayout = new View(context);
            } else if (i == 4) {
                frameLayout = new l35(context, wjbVar);
            } else if (i != 5) {
                frameLayout = null;
            } else {
                i84 i84Var = new i84(context, wjbVar);
                i84Var.setAddOnClickListener(new View.OnClickListener(this) { // from class: b2c
                    public final /* synthetic */ c2c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b4 = b3;
                        c2c c2cVar = this.b;
                        switch (b4) {
                            case 0:
                                m84 m84Var2 = (m84) view.getParent();
                                TLRPC.StickerSetCovered stickerSet = m84Var2.getStickerSet();
                                d2c d2cVar2 = c2cVar.y;
                                LongSparseArray longSparseArray = d2cVar2.d;
                                LongSparseArray longSparseArray2 = d2cVar2.e;
                                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                                    if (!m84Var2.r) {
                                        c2cVar.F(stickerSet, m84Var2);
                                        break;
                                    } else {
                                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                                        d2cVar2.b.h(stickerSet);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i84 i84Var2 = (i84) view.getParent();
                                TLRPC.StickerSetCovered stickerSet2 = i84Var2.getStickerSet();
                                d2c d2cVar3 = c2cVar.y;
                                LongSparseArray longSparseArray3 = d2cVar3.d;
                                LongSparseArray longSparseArray4 = d2cVar3.e;
                                if (longSparseArray3.indexOfKey(stickerSet2.set.id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.id) < 0) {
                                    if (!i84Var2.w) {
                                        c2cVar.F(stickerSet2, i84Var2);
                                        break;
                                    } else {
                                        longSparseArray4.put(stickerSet2.set.id, stickerSet2);
                                        d2cVar3.b.h(stickerSet2);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                i84Var.getImageView().setLayerNum(3);
                frameLayout = i84Var;
            }
        } else {
            k14 k14Var = new k14(context, z ? 1 : 0, wjbVar, b2);
            k14Var.getImageView().m0(3);
            frameLayout = k14Var;
        }
        return new y29(frameLayout);
    }
}
