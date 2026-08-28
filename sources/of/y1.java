package of;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import g7.e6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.l3;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y1 extends vk0 {
    public ImageView H;
    public TextView I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public String N;
    public final b6 P;
    public final Context d;
    public final v31 e;
    public final TLRPC.StickerSetCovered[] f;
    public final LongSparseArray h;
    public final LongSparseArray n;
    public int y;
    public final int c = UserConfig.selectedAccount;
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseIntArray w = new SparseIntArray();
    public final SparseArray x = new SparseArray();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public final HashMap C = new HashMap();
    public final HashMap D = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList F = new ArrayList();
    public final SparseArray G = new SparseArray();
    public final w1 O = new w1(this);

    public y1(Context context, v31 v31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, b6 b6Var) {
        this.d = context;
        this.e = v31Var;
        this.f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.n = longSparseArray2;
        this.P = b6Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void E(s3 s3Var, int i9, boolean z10) {
        boolean z11;
        s3 s3Var2;
        boolean z12;
        int i10 = this.c;
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.s.get(i9);
        boolean z13 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.id));
        int i11 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f;
            if (i11 >= stickerSetCoveredArr.length) {
                z11 = false;
                break;
            }
            if (stickerSetCoveredArr[i11] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i10).getStickerSetById(stickerSetCoveredArr[i11].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i11] = null;
                } else if (stickerSetCoveredArr[i11].set.id == stickerSetCovered.set.id) {
                    z11 = true;
                    break;
                }
            }
            i11++;
        }
        int indexOfIgnoreCase = TextUtils.isEmpty(this.N) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.N);
        if (indexOfIgnoreCase >= 0) {
            s3Var2 = s3Var;
            z12 = z10;
            s3Var2.c(stickerSetCovered, z13, z12, indexOfIgnoreCase, this.N.length(), z11);
        } else {
            s3Var2 = s3Var;
            z12 = z10;
            s3Var2.c(stickerSetCovered, z13, z12, 0, 0, z11);
            if (!TextUtils.isEmpty(this.N) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.N) == 0) {
                String str = stickerSetCovered.set.short_name;
                int length = this.N.length();
                s3Var2.B = str;
                s3Var2.C = length;
                s3Var2.f();
            }
        }
        if (z13) {
            mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.id);
        }
        long j10 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray = this.h;
        boolean z14 = longSparseArray.indexOfKey(j10) >= 0;
        long j11 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray2 = this.n;
        boolean z15 = longSparseArray2.indexOfKey(j11) >= 0;
        if (z14 || z15) {
            if (z14 && s3Var2.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
                z14 = false;
            } else if (z15 && !s3Var2.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
            }
        }
        s3Var2.b(!z11 && z14, z12);
        mediaDataController.preloadStickerSetThumb(stickerSetCovered);
        s3Var2.setNeedDivider(i9 > 0);
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
    
        r2[r1] = r9;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r10.b(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r8.h.put(r9.set.id, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r10 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r8.e.a.g(r10.getStickerSet(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r10 = r8.G;
        r1 = r10.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r2 >= r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r3 = (org.telegram.tgnet.TLRPC.StickerSetCovered) r10.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r3 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r3.set.id != r9.set.id) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        n(r2, 0);
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
    public final void F(TLRPC.StickerSetCovered stickerSetCovered, s3 s3Var) {
        int i9 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f;
            if (i9 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i9] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.c).getStickerSetById(stickerSetCoveredArr[i9].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i9] = null;
                    break;
                } else if (stickerSetCoveredArr[i9].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i9++;
        }
    }

    @Override // f2.r0
    public final int h() {
        return Math.max(1, this.y + 1);
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0 && this.y == 0) {
            return 5;
        }
        if (i9 == h() - 1) {
            return 4;
        }
        Object obj = this.s.get(i9);
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
    @Override // f2.r0
    public final void l() {
        v31 v31Var;
        int i9;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.w;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.G;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.x;
        sparseArray5.clear();
        this.y = 0;
        ArrayList arrayList5 = this.A;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.B;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.F;
        int i11 = !arrayList7.isEmpty() ? 1 : 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size + size2 + i11) {
            SparseArray sparseArray6 = this.v;
            v31 v31Var2 = this.e;
            if (i12 < size2) {
                v31Var = v31Var2;
                ?? r62 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i12);
                i9 = size;
                arrayList3 = r62.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i10 = i11;
                stickerSetCovered = r62;
            } else {
                v31Var = v31Var2;
                i9 = size;
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
                        String str2 = (String) this.E.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.y + i16, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i19 = 0;
                        while (i19 < size4) {
                            String str3 = str;
                            int i20 = this.y + i16;
                            int i21 = size4;
                            int a2 = (i16 / v31Var.a()) + i13;
                            int i22 = i19;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i19);
                            sparseArray3.put(i20, document);
                            ArrayList arrayList9 = arrayList7;
                            int i23 = i16;
                            TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.c).getStickerSetById(MediaDataController.getStickerSetId(document));
                            if (stickerSetById != null) {
                                sparseArray6.put(i20, stickerSetById);
                            }
                            sparseIntArray.put(i20, a2);
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
                    int ceil = (int) Math.ceil(i16 / v31Var.a());
                    for (int i24 = 0; i24 < ceil; i24++) {
                        sparseArray2.put(i13 + i24, Integer.valueOf(i16));
                    }
                    this.y = (v31Var.a() * ceil) + this.y;
                    i13 += ceil;
                    arrayList4 = arrayList5;
                    i12++;
                    size = i9;
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
                int ceil2 = (int) Math.ceil(arrayList3.size() / v31Var.a());
                sparseArray3.put(this.y, stickerSetCovered);
                if (i12 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.y, stickerSetCovered);
                }
                sparseIntArray.put(this.y, i13);
                int size5 = arrayList3.size();
                int i25 = 0;
                while (i25 < size5) {
                    int i26 = i25 + 1;
                    int i27 = ceil2;
                    int i28 = this.y + i26;
                    int a3 = i25 / v31Var.a();
                    ArrayList arrayList10 = arrayList5;
                    sparseArray3.put(i28, arrayList3.get(i25));
                    sparseArray6.put(i28, stickerSetCovered);
                    sparseIntArray.put(i28, a3 + i13 + 1);
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
                this.y = (v31Var.a() * i29) + 1 + this.y;
                i13 += i30;
                i12++;
                size = i9;
                arrayList6 = arrayList;
                i11 = i10;
                sparseArray5 = sparseArray;
                arrayList5 = arrayList4;
                arrayList7 = arrayList2;
            }
            arrayList4 = arrayList5;
            i12++;
            size = i9;
            arrayList6 = arrayList;
            i11 = i10;
            sparseArray5 = sparseArray;
            arrayList5 = arrayList4;
            arrayList7 = arrayList2;
        }
        super.l();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        SparseArray sparseArray = this.s;
        if (i10 == 0) {
            ((d8) view).d((TLRPC.Document) sparseArray.get(i9), null, this.v.get(i9), (String) this.x.get(i9), false, false);
            return;
        }
        if (i10 == 1) {
            ((l3) view).setHeight(0);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            E((s3) view, i9, false);
            return;
        }
        m8 m8Var = (m8) view;
        Object obj = sparseArray.get(i9);
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!TextUtils.isEmpty(this.N) && this.C.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    m8Var.b(0, stickerSet.title);
                }
                m8Var.d(this.N.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num = (Integer) this.D.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num != null) {
                m8Var.c(stickerSet2.title, 0, null, num.intValue(), !TextUtils.isEmpty(this.N) ? this.N.length() : 0);
            }
            m8Var.d(0, null);
        }
    }

    @Override // f2.r0
    public final void w(f2.q1 q1Var, int i9, List list) {
        if (list.contains(0) && q1Var.f == 3) {
            E((s3) q1Var.a, i9, true);
        } else {
            v(q1Var, i9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.view.View] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        b6 b6Var = this.P;
        Context context = this.d;
        if (i9 == 0) {
            x1 x1Var = new x1(0, context, b6Var, false);
            x1Var.getImageView().setLayerNum(3);
            frameLayout = x1Var;
        } else if (i9 == 1) {
            frameLayout = new l3(context);
        } else if (i9 == 2) {
            frameLayout = new m8(this.d, false, true, this.P, false);
        } else if (i9 == 3) {
            s3 s3Var = new s3(17, this.d, this.P, true, true);
            s3Var.setAddOnClickListener(new x8(this, 11));
            frameLayout = s3Var;
        } else if (i9 == 4) {
            frameLayout = new View(context);
        } else if (i9 != 5) {
            frameLayout = null;
        } else {
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.H.setImageResource(R.drawable.stickers_empty);
            ImageView imageView2 = this.H;
            int i10 = f6.Le;
            imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
            linearLayout.addView(this.H, e6.n(-2, -2));
            linearLayout.addView(new Space(context), e6.n(-1, 15));
            TextView textView = new TextView(context);
            this.I = textView;
            textView.setText(LocaleController.getString(R.string.NoStickersFound));
            this.I.setTextSize(1, 16.0f);
            this.I.setTextColor(f6.v0(i10, b6Var));
            linearLayout.addView(this.I, e6.n(-2, -2));
            linearLayout.setMinimumHeight(AndroidUtilities.dp(112.0f));
            linearLayout.setLayoutParams(e6.c(-1.0f, -1));
            frameLayout = linearLayout;
        }
        return new ik0(frameLayout);
    }
}
