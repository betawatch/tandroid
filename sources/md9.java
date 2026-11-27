// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class md9 extends ny0 {
    public static final /* synthetic */ int f2 = 0;
    public final String S1;
    public final ld9 T1;
    public final HorizontalScrollView U1;
    public final wc9 V1;
    public final wc9 W1;
    public final wc9 X1;
    public final wc9 Y1;
    public final hta Z1;
    public m62 a2;
    public final HashSet b2;
    public boolean c2;
    public wb d2;
    public boolean e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md9(final Context context, String str, final ld9 ld9Var) {
        super(2, (vnb) null, context, false);
        final byte b = 2;
        final byte b2 = 0;
        this.b2 = new HashSet();
        this.E1 = hl.L(12.0f);
        J();
        this.S1 = str;
        this.T1 = ld9Var;
        this.o1.setTitle(K0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(hl.L(11.0f), hl.L(6.0f), hl.L(11.0f), hl.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.U1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        wc9 wc9Var = new wc9(this.J0, context, false);
        this.V1 = wc9Var;
        wc9Var.setSorting(ld9Var.c.q);
        linearLayout.addView(wc9Var, tre.t(-2, -2, 16, 0, 0, 6, 0));
        wc9Var.setOnClickListener(new jy8(this, ld9Var, (byte) 4));
        wc9 wc9Var2 = new wc9(this.J0, context, false);
        this.W1 = wc9Var2;
        wc9Var2.setValue(ob6.M0(2131750348, null));
        linearLayout.addView(wc9Var2, tre.t(-2, -2, 16, 0, 0, 6, 0));
        wc9Var2.setOnClickListener(new View.OnClickListener(this) { // from class: kd9
            public final /* synthetic */ md9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                final ld9 ld9Var2 = ld9Var;
                md9 md9Var = this.b;
                switch (b3) {
                    case 0:
                        ed9 ed9Var = ld9Var2.c;
                        if (!ed9Var.g.isEmpty()) {
                            final fu5 fu5Var = new fu5(md9Var.c, md9Var.J0, md9Var.W1, false, true, false);
                            fu5Var.t = false;
                            fu5Var.e0 = true;
                            fu5Var.b0(0.0f, hl.L(-8.0f));
                            fu5Var.X = true;
                            fu5Var.p = new vn1(fu5Var, (byte) 9);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(ed9Var.g);
                            final byte b4 = 0;
                            Collections.sort(arrayList, new Comparator() { // from class: fd9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b5 = b4;
                                    ld9 ld9Var3 = ld9Var2;
                                    switch (b5) {
                                        case 0:
                                            Integer num = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num2 = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num4 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num6 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i = md9Var.a;
                            icc iccVar = new icc() { // from class: gd9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // icc
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b5 = b4;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList2 = arrayList;
                                    ld9 ld9Var3 = ld9Var2;
                                    String[] strArr2 = strArr;
                                    switch (b5) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String I3 = hl.I3(lowerCase);
                                            ed9 ed9Var2 = ld9Var3.c;
                                            boolean isEmpty = ed9Var2.k.isEmpty();
                                            int size = arrayList2.size();
                                            int i2 = 0;
                                            while (i2 < size) {
                                                Object obj3 = arrayList2.get(i2);
                                                i2++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = ed9Var2.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) ed9Var2.n.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i3 = yc9.b;
                                                    b8c K = b8c.K(yc9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(uc9.i(ob6.M0(2131749957, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String I32 = hl.I3(lowerCase2);
                                            ed9 ed9Var3 = ld9Var3.c;
                                            boolean isEmpty2 = ed9Var3.l.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList2.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = ed9Var3.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (uh9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) ed9Var3.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = oc9.b;
                                                b8c K2 = b8c.K(oc9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(uc9.i(ob6.M0(2131749963, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String I33 = hl.I3(lowerCase3);
                                            ed9 ed9Var4 = ld9Var3.c;
                                            boolean isEmpty3 = ed9Var4.m.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList2.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = ed9Var4.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || uh9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) ed9Var4.p.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = bd9.b;
                                                b8c K3 = b8c.K(bd9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            ncc nccVar = new ncc() { // from class: hd9
                                @Override // ncc
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b5 = b4;
                                    int i2 = 0;
                                    fu5 fu5Var2 = fu5Var;
                                    ld9 ld9Var3 = ld9Var2;
                                    b8c b8cVar = (b8c) obj;
                                    switch (b5) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                                            boolean contains = ld9Var3.c.k.contains(Long.valueOf(j));
                                            ed9 ed9Var2 = ld9Var3.c;
                                            if (contains) {
                                                ed9Var2.k.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = ed9Var2.k;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = ed9Var2.g;
                                                    int size = arrayList2.size();
                                                    while (i2 < size) {
                                                        Object obj3 = arrayList2.get(i2);
                                                        i2++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            ed9Var2.p();
                                            fu5Var2.u();
                                            break;
                                        case 1:
                                            int i3 = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                                            boolean contains2 = ld9Var3.c.l.contains(Integer.valueOf(i3));
                                            ed9 ed9Var3 = ld9Var3.c;
                                            if (contains2) {
                                                ed9Var3.l.remove(Integer.valueOf(i3));
                                            } else {
                                                HashSet hashSet2 = ed9Var3.l;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = ed9Var3.h;
                                                    int size2 = arrayList3.size();
                                                    while (i2 < size2) {
                                                        Object obj4 = arrayList3.get(i2);
                                                        i2++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i3) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i3));
                                                }
                                            }
                                            ed9Var3.p();
                                            fu5Var2.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                                            boolean contains3 = ld9Var3.c.m.contains(Long.valueOf(j3));
                                            ed9 ed9Var4 = ld9Var3.c;
                                            if (contains3) {
                                                ed9Var4.m.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = ed9Var4.m;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = ed9Var4.i;
                                                    int size3 = arrayList4.size();
                                                    while (i2 < size3) {
                                                        Object obj5 = arrayList4.get(i2);
                                                        i2++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            ed9Var4.p();
                                            fu5Var2.u();
                                            break;
                                    }
                                }
                            };
                            vnb vnbVar = md9Var.J0;
                            Context context2 = context;
                            d34 d34Var = new d34(context2, i, 0, false, iccVar, nccVar, null, vnbVar, (byte) 6);
                            d34Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            yob.s(imageView, aob.F8, md9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xt3 xt3Var = new xt3(context2, md9Var.J0);
                            xt3Var.setTextSize(1, 16.0f);
                            xt3Var.setInputType(573441);
                            xt3Var.setRawInputType(573441);
                            yob.D(xt3Var, aob.A6, md9Var.J0);
                            yob.l(xt3Var, 30, aob.G6, md9Var.J0);
                            xt3Var.setCursorSize(hl.L(19.0f));
                            xt3Var.setCursorWidth(1.5f);
                            xt3Var.setHint(ob6.M0(2131749956, null));
                            yob.X(xt3Var, aob.E8, md9Var.J0);
                            xt3Var.setBackground(null);
                            frameLayout.addView(xt3Var, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xt3Var.addTextChangedListener(new ry(strArr, d34Var, false, (byte) 15));
                            if (arrayList.size() > 8) {
                                fu5Var.q(frameLayout, tre.o(-1, 44));
                                fu5Var.j();
                            }
                            if (!ed9Var.k.isEmpty()) {
                                fu5Var.b(R.drawable.msg_select, ob6.M0(2131745398, null), new id9(ld9Var2, (byte) 0), false);
                            }
                            fu5Var.p(d34Var);
                            fu5Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        ed9 ed9Var2 = ld9Var2.c;
                        if (!ed9Var2.h.isEmpty()) {
                            final fu5 fu5Var2 = new fu5(md9Var.c, md9Var.J0, md9Var.X1, false, true, false);
                            fu5Var2.t = false;
                            fu5Var2.e0 = true;
                            fu5Var2.b0(0.0f, hl.L(-8.0f));
                            fu5Var2.X = true;
                            fu5Var2.p = new vn1(fu5Var2, (byte) 7);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(ed9Var2.h);
                            final byte b5 = 1;
                            Collections.sort(arrayList2, new Comparator() { // from class: fd9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b52 = b5;
                                    ld9 ld9Var3 = ld9Var2;
                                    switch (b52) {
                                        case 0:
                                            Integer num = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num2 = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num4 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num6 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i2 = md9Var.a;
                            icc iccVar2 = new icc() { // from class: gd9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // icc
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b52 = b5;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    ld9 ld9Var3 = ld9Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = hl.I3(lowerCase);
                                            ed9 ed9Var22 = ld9Var3.c;
                                            boolean isEmpty = ed9Var22.k.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = ed9Var22.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) ed9Var22.n.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i3 = yc9.b;
                                                    b8c K = b8c.K(yc9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(uc9.i(ob6.M0(2131749957, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = hl.I3(lowerCase2);
                                            ed9 ed9Var3 = ld9Var3.c;
                                            boolean isEmpty2 = ed9Var3.l.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = ed9Var3.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (uh9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) ed9Var3.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = oc9.b;
                                                b8c K2 = b8c.K(oc9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(uc9.i(ob6.M0(2131749963, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = hl.I3(lowerCase3);
                                            ed9 ed9Var4 = ld9Var3.c;
                                            boolean isEmpty3 = ed9Var4.m.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = ed9Var4.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || uh9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) ed9Var4.p.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = bd9.b;
                                                b8c K3 = b8c.K(bd9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            ncc nccVar2 = new ncc() { // from class: hd9
                                @Override // ncc
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b52 = b5;
                                    int i22 = 0;
                                    fu5 fu5Var22 = fu5Var2;
                                    ld9 ld9Var3 = ld9Var2;
                                    b8c b8cVar = (b8c) obj;
                                    switch (b52) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                                            boolean contains = ld9Var3.c.k.contains(Long.valueOf(j));
                                            ed9 ed9Var22 = ld9Var3.c;
                                            if (contains) {
                                                ed9Var22.k.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = ed9Var22.k;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = ed9Var22.g;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            ed9Var22.p();
                                            fu5Var22.u();
                                            break;
                                        case 1:
                                            int i3 = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                                            boolean contains2 = ld9Var3.c.l.contains(Integer.valueOf(i3));
                                            ed9 ed9Var3 = ld9Var3.c;
                                            if (contains2) {
                                                ed9Var3.l.remove(Integer.valueOf(i3));
                                            } else {
                                                HashSet hashSet2 = ed9Var3.l;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = ed9Var3.h;
                                                    int size2 = arrayList3.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList3.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i3) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i3));
                                                }
                                            }
                                            ed9Var3.p();
                                            fu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                                            boolean contains3 = ld9Var3.c.m.contains(Long.valueOf(j3));
                                            ed9 ed9Var4 = ld9Var3.c;
                                            if (contains3) {
                                                ed9Var4.m.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = ed9Var4.m;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = ed9Var4.i;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            ed9Var4.p();
                                            fu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            vnb vnbVar2 = md9Var.J0;
                            Context context3 = context;
                            d34 d34Var2 = new d34(context3, i2, 0, false, iccVar2, nccVar2, null, vnbVar2, (byte) 7);
                            d34Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            yob.s(imageView2, aob.F8, md9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xt3 xt3Var2 = new xt3(context3, md9Var.J0);
                            xt3Var2.setTextSize(1, 16.0f);
                            xt3Var2.setInputType(573441);
                            xt3Var2.setRawInputType(573441);
                            yob.D(xt3Var2, aob.A6, md9Var.J0);
                            yob.l(xt3Var2, 30, aob.G6, md9Var.J0);
                            xt3Var2.setCursorSize(hl.L(19.0f));
                            xt3Var2.setCursorWidth(1.5f);
                            xt3Var2.setHint(ob6.M0(2131749956, null));
                            yob.X(xt3Var2, aob.E8, md9Var.J0);
                            xt3Var2.setBackground(null);
                            frameLayout2.addView(xt3Var2, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xt3Var2.addTextChangedListener(new ry(strArr2, d34Var2, false, (byte) 16));
                            if (arrayList2.size() > 8) {
                                fu5Var2.q(frameLayout2, tre.o(-1, 44));
                                fu5Var2.j();
                            }
                            if (!ed9Var2.l.isEmpty()) {
                                fu5Var2.b(R.drawable.msg_select, ob6.M0(2131745398, null), new id9(ld9Var2, (byte) 1), false);
                            }
                            fu5Var2.p(d34Var2);
                            fu5Var2.a0();
                            break;
                        }
                        break;
                    default:
                        ed9 ed9Var3 = ld9Var2.c;
                        if (!ed9Var3.i.isEmpty()) {
                            final fu5 fu5Var3 = new fu5(md9Var.c, md9Var.J0, md9Var.Y1, false, true, false);
                            fu5Var3.t = false;
                            fu5Var3.e0 = true;
                            fu5Var3.b0(0.0f, hl.L(-8.0f));
                            fu5Var3.X = true;
                            fu5Var3.p = new vn1(fu5Var3, (byte) 8);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(ed9Var3.i);
                            final byte b6 = 2;
                            Collections.sort(arrayList3, new Comparator() { // from class: fd9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b52 = b6;
                                    ld9 ld9Var3 = ld9Var2;
                                    switch (b52) {
                                        case 0:
                                            Integer num = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num2 = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num4 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num6 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i3 = md9Var.a;
                            icc iccVar3 = new icc() { // from class: gd9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // icc
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b52 = b6;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    ld9 ld9Var3 = ld9Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = hl.I3(lowerCase);
                                            ed9 ed9Var22 = ld9Var3.c;
                                            boolean isEmpty = ed9Var22.k.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = ed9Var22.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) ed9Var22.n.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = yc9.b;
                                                    b8c K = b8c.K(yc9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(uc9.i(ob6.M0(2131749957, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = hl.I3(lowerCase2);
                                            ed9 ed9Var32 = ld9Var3.c;
                                            boolean isEmpty2 = ed9Var32.l.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = ed9Var32.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (uh9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) ed9Var32.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = oc9.b;
                                                b8c K2 = b8c.K(oc9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(uc9.i(ob6.M0(2131749963, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = hl.I3(lowerCase3);
                                            ed9 ed9Var4 = ld9Var3.c;
                                            boolean isEmpty3 = ed9Var4.m.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = ed9Var4.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || uh9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) ed9Var4.p.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = bd9.b;
                                                b8c K3 = b8c.K(bd9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            ncc nccVar3 = new ncc() { // from class: hd9
                                @Override // ncc
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b52 = b6;
                                    int i22 = 0;
                                    fu5 fu5Var22 = fu5Var3;
                                    ld9 ld9Var3 = ld9Var2;
                                    b8c b8cVar = (b8c) obj;
                                    switch (b52) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                                            boolean contains = ld9Var3.c.k.contains(Long.valueOf(j));
                                            ed9 ed9Var22 = ld9Var3.c;
                                            if (contains) {
                                                ed9Var22.k.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = ed9Var22.k;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = ed9Var22.g;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            ed9Var22.p();
                                            fu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                                            boolean contains2 = ld9Var3.c.l.contains(Integer.valueOf(i32));
                                            ed9 ed9Var32 = ld9Var3.c;
                                            if (contains2) {
                                                ed9Var32.l.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = ed9Var32.l;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = ed9Var32.h;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            ed9Var32.p();
                                            fu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                                            boolean contains3 = ld9Var3.c.m.contains(Long.valueOf(j3));
                                            ed9 ed9Var4 = ld9Var3.c;
                                            if (contains3) {
                                                ed9Var4.m.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = ed9Var4.m;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = ed9Var4.i;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            ed9Var4.p();
                                            fu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            vnb vnbVar3 = md9Var.J0;
                            Context context4 = context;
                            d34 d34Var3 = new d34(context4, i3, 0, false, iccVar3, nccVar3, null, vnbVar3, (byte) 8);
                            d34Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            yob.s(imageView3, aob.F8, md9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xt3 xt3Var3 = new xt3(context4, md9Var.J0);
                            xt3Var3.setTextSize(1, 16.0f);
                            xt3Var3.setInputType(573441);
                            xt3Var3.setRawInputType(573441);
                            yob.D(xt3Var3, aob.A6, md9Var.J0);
                            yob.l(xt3Var3, 30, aob.G6, md9Var.J0);
                            xt3Var3.setCursorSize(hl.L(19.0f));
                            xt3Var3.setCursorWidth(1.5f);
                            xt3Var3.setHint(ob6.M0(2131749956, null));
                            yob.X(xt3Var3, aob.E8, md9Var.J0);
                            xt3Var3.setBackground(null);
                            frameLayout3.addView(xt3Var3, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xt3Var3.addTextChangedListener(new ry(strArr3, d34Var3, false, (byte) 17));
                            if (arrayList3.size() > 8) {
                                fu5Var3.q(frameLayout3, tre.o(-1, 44));
                                fu5Var3.j();
                            }
                            if (!ed9Var3.m.isEmpty()) {
                                fu5Var3.b(R.drawable.msg_select, ob6.M0(2131745398, null), new id9(ld9Var2, (byte) 2), false);
                            }
                            fu5Var3.p(d34Var3);
                            fu5Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        wc9 wc9Var3 = new wc9(this.J0, context, false);
        this.X1 = wc9Var3;
        wc9Var3.setValue(ob6.M0(2131750349, null));
        linearLayout.addView(wc9Var3, tre.t(-2, -2, 16, 0, 0, 6, 0));
        final byte b3 = 1;
        wc9Var3.setOnClickListener(new View.OnClickListener(this) { // from class: kd9
            public final /* synthetic */ md9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                final ld9 ld9Var2 = ld9Var;
                md9 md9Var = this.b;
                switch (b32) {
                    case 0:
                        ed9 ed9Var = ld9Var2.c;
                        if (!ed9Var.g.isEmpty()) {
                            final fu5 fu5Var = new fu5(md9Var.c, md9Var.J0, md9Var.W1, false, true, false);
                            fu5Var.t = false;
                            fu5Var.e0 = true;
                            fu5Var.b0(0.0f, hl.L(-8.0f));
                            fu5Var.X = true;
                            fu5Var.p = new vn1(fu5Var, (byte) 9);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(ed9Var.g);
                            final byte b4 = 0;
                            Collections.sort(arrayList, new Comparator() { // from class: fd9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b52 = b4;
                                    ld9 ld9Var3 = ld9Var2;
                                    switch (b52) {
                                        case 0:
                                            Integer num = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num2 = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num4 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num6 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i = md9Var.a;
                            icc iccVar = new icc() { // from class: gd9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // icc
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b52 = b4;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList;
                                    ld9 ld9Var3 = ld9Var2;
                                    String[] strArr22 = strArr;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = hl.I3(lowerCase);
                                            ed9 ed9Var22 = ld9Var3.c;
                                            boolean isEmpty = ed9Var22.k.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = ed9Var22.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) ed9Var22.n.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = yc9.b;
                                                    b8c K = b8c.K(yc9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(uc9.i(ob6.M0(2131749957, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = hl.I3(lowerCase2);
                                            ed9 ed9Var32 = ld9Var3.c;
                                            boolean isEmpty2 = ed9Var32.l.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = ed9Var32.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (uh9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) ed9Var32.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = oc9.b;
                                                b8c K2 = b8c.K(oc9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(uc9.i(ob6.M0(2131749963, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = hl.I3(lowerCase3);
                                            ed9 ed9Var4 = ld9Var3.c;
                                            boolean isEmpty3 = ed9Var4.m.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = ed9Var4.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || uh9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) ed9Var4.p.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = bd9.b;
                                                b8c K3 = b8c.K(bd9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            ncc nccVar = new ncc() { // from class: hd9
                                @Override // ncc
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b52 = b4;
                                    int i22 = 0;
                                    fu5 fu5Var22 = fu5Var;
                                    ld9 ld9Var3 = ld9Var2;
                                    b8c b8cVar = (b8c) obj;
                                    switch (b52) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                                            boolean contains = ld9Var3.c.k.contains(Long.valueOf(j));
                                            ed9 ed9Var22 = ld9Var3.c;
                                            if (contains) {
                                                ed9Var22.k.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = ed9Var22.k;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = ed9Var22.g;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            ed9Var22.p();
                                            fu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                                            boolean contains2 = ld9Var3.c.l.contains(Integer.valueOf(i32));
                                            ed9 ed9Var32 = ld9Var3.c;
                                            if (contains2) {
                                                ed9Var32.l.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = ed9Var32.l;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = ed9Var32.h;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            ed9Var32.p();
                                            fu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                                            boolean contains3 = ld9Var3.c.m.contains(Long.valueOf(j3));
                                            ed9 ed9Var4 = ld9Var3.c;
                                            if (contains3) {
                                                ed9Var4.m.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = ed9Var4.m;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = ed9Var4.i;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            ed9Var4.p();
                                            fu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            vnb vnbVar = md9Var.J0;
                            Context context2 = context;
                            d34 d34Var = new d34(context2, i, 0, false, iccVar, nccVar, null, vnbVar, (byte) 6);
                            d34Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            yob.s(imageView, aob.F8, md9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xt3 xt3Var = new xt3(context2, md9Var.J0);
                            xt3Var.setTextSize(1, 16.0f);
                            xt3Var.setInputType(573441);
                            xt3Var.setRawInputType(573441);
                            yob.D(xt3Var, aob.A6, md9Var.J0);
                            yob.l(xt3Var, 30, aob.G6, md9Var.J0);
                            xt3Var.setCursorSize(hl.L(19.0f));
                            xt3Var.setCursorWidth(1.5f);
                            xt3Var.setHint(ob6.M0(2131749956, null));
                            yob.X(xt3Var, aob.E8, md9Var.J0);
                            xt3Var.setBackground(null);
                            frameLayout.addView(xt3Var, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xt3Var.addTextChangedListener(new ry(strArr, d34Var, false, (byte) 15));
                            if (arrayList.size() > 8) {
                                fu5Var.q(frameLayout, tre.o(-1, 44));
                                fu5Var.j();
                            }
                            if (!ed9Var.k.isEmpty()) {
                                fu5Var.b(R.drawable.msg_select, ob6.M0(2131745398, null), new id9(ld9Var2, (byte) 0), false);
                            }
                            fu5Var.p(d34Var);
                            fu5Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        ed9 ed9Var2 = ld9Var2.c;
                        if (!ed9Var2.h.isEmpty()) {
                            final fu5 fu5Var2 = new fu5(md9Var.c, md9Var.J0, md9Var.X1, false, true, false);
                            fu5Var2.t = false;
                            fu5Var2.e0 = true;
                            fu5Var2.b0(0.0f, hl.L(-8.0f));
                            fu5Var2.X = true;
                            fu5Var2.p = new vn1(fu5Var2, (byte) 7);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(ed9Var2.h);
                            final byte b5 = 1;
                            Collections.sort(arrayList2, new Comparator() { // from class: fd9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b52 = b5;
                                    ld9 ld9Var3 = ld9Var2;
                                    switch (b52) {
                                        case 0:
                                            Integer num = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num2 = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num4 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num6 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i2 = md9Var.a;
                            icc iccVar2 = new icc() { // from class: gd9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // icc
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b52 = b5;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    ld9 ld9Var3 = ld9Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = hl.I3(lowerCase);
                                            ed9 ed9Var22 = ld9Var3.c;
                                            boolean isEmpty = ed9Var22.k.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = ed9Var22.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) ed9Var22.n.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = yc9.b;
                                                    b8c K = b8c.K(yc9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(uc9.i(ob6.M0(2131749957, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = hl.I3(lowerCase2);
                                            ed9 ed9Var32 = ld9Var3.c;
                                            boolean isEmpty2 = ed9Var32.l.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = ed9Var32.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (uh9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) ed9Var32.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = oc9.b;
                                                b8c K2 = b8c.K(oc9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(uc9.i(ob6.M0(2131749963, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = hl.I3(lowerCase3);
                                            ed9 ed9Var4 = ld9Var3.c;
                                            boolean isEmpty3 = ed9Var4.m.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = ed9Var4.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || uh9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) ed9Var4.p.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = bd9.b;
                                                b8c K3 = b8c.K(bd9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            ncc nccVar2 = new ncc() { // from class: hd9
                                @Override // ncc
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b52 = b5;
                                    int i22 = 0;
                                    fu5 fu5Var22 = fu5Var2;
                                    ld9 ld9Var3 = ld9Var2;
                                    b8c b8cVar = (b8c) obj;
                                    switch (b52) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                                            boolean contains = ld9Var3.c.k.contains(Long.valueOf(j));
                                            ed9 ed9Var22 = ld9Var3.c;
                                            if (contains) {
                                                ed9Var22.k.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = ed9Var22.k;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = ed9Var22.g;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            ed9Var22.p();
                                            fu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                                            boolean contains2 = ld9Var3.c.l.contains(Integer.valueOf(i32));
                                            ed9 ed9Var32 = ld9Var3.c;
                                            if (contains2) {
                                                ed9Var32.l.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = ed9Var32.l;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = ed9Var32.h;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            ed9Var32.p();
                                            fu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                                            boolean contains3 = ld9Var3.c.m.contains(Long.valueOf(j3));
                                            ed9 ed9Var4 = ld9Var3.c;
                                            if (contains3) {
                                                ed9Var4.m.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = ed9Var4.m;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = ed9Var4.i;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            ed9Var4.p();
                                            fu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            vnb vnbVar2 = md9Var.J0;
                            Context context3 = context;
                            d34 d34Var2 = new d34(context3, i2, 0, false, iccVar2, nccVar2, null, vnbVar2, (byte) 7);
                            d34Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            yob.s(imageView2, aob.F8, md9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xt3 xt3Var2 = new xt3(context3, md9Var.J0);
                            xt3Var2.setTextSize(1, 16.0f);
                            xt3Var2.setInputType(573441);
                            xt3Var2.setRawInputType(573441);
                            yob.D(xt3Var2, aob.A6, md9Var.J0);
                            yob.l(xt3Var2, 30, aob.G6, md9Var.J0);
                            xt3Var2.setCursorSize(hl.L(19.0f));
                            xt3Var2.setCursorWidth(1.5f);
                            xt3Var2.setHint(ob6.M0(2131749956, null));
                            yob.X(xt3Var2, aob.E8, md9Var.J0);
                            xt3Var2.setBackground(null);
                            frameLayout2.addView(xt3Var2, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xt3Var2.addTextChangedListener(new ry(strArr2, d34Var2, false, (byte) 16));
                            if (arrayList2.size() > 8) {
                                fu5Var2.q(frameLayout2, tre.o(-1, 44));
                                fu5Var2.j();
                            }
                            if (!ed9Var2.l.isEmpty()) {
                                fu5Var2.b(R.drawable.msg_select, ob6.M0(2131745398, null), new id9(ld9Var2, (byte) 1), false);
                            }
                            fu5Var2.p(d34Var2);
                            fu5Var2.a0();
                            break;
                        }
                        break;
                    default:
                        ed9 ed9Var3 = ld9Var2.c;
                        if (!ed9Var3.i.isEmpty()) {
                            final fu5 fu5Var3 = new fu5(md9Var.c, md9Var.J0, md9Var.Y1, false, true, false);
                            fu5Var3.t = false;
                            fu5Var3.e0 = true;
                            fu5Var3.b0(0.0f, hl.L(-8.0f));
                            fu5Var3.X = true;
                            fu5Var3.p = new vn1(fu5Var3, (byte) 8);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(ed9Var3.i);
                            final byte b6 = 2;
                            Collections.sort(arrayList3, new Comparator() { // from class: fd9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b52 = b6;
                                    ld9 ld9Var3 = ld9Var2;
                                    switch (b52) {
                                        case 0:
                                            Integer num = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num2 = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num4 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num6 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i3 = md9Var.a;
                            icc iccVar3 = new icc() { // from class: gd9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // icc
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b52 = b6;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    ld9 ld9Var3 = ld9Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = hl.I3(lowerCase);
                                            ed9 ed9Var22 = ld9Var3.c;
                                            boolean isEmpty = ed9Var22.k.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = ed9Var22.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) ed9Var22.n.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = yc9.b;
                                                    b8c K = b8c.K(yc9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(uc9.i(ob6.M0(2131749957, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = hl.I3(lowerCase2);
                                            ed9 ed9Var32 = ld9Var3.c;
                                            boolean isEmpty2 = ed9Var32.l.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = ed9Var32.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (uh9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) ed9Var32.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = oc9.b;
                                                b8c K2 = b8c.K(oc9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(uc9.i(ob6.M0(2131749963, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = hl.I3(lowerCase3);
                                            ed9 ed9Var4 = ld9Var3.c;
                                            boolean isEmpty3 = ed9Var4.m.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = ed9Var4.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || uh9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) ed9Var4.p.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = bd9.b;
                                                b8c K3 = b8c.K(bd9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            ncc nccVar3 = new ncc() { // from class: hd9
                                @Override // ncc
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b52 = b6;
                                    int i22 = 0;
                                    fu5 fu5Var22 = fu5Var3;
                                    ld9 ld9Var3 = ld9Var2;
                                    b8c b8cVar = (b8c) obj;
                                    switch (b52) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                                            boolean contains = ld9Var3.c.k.contains(Long.valueOf(j));
                                            ed9 ed9Var22 = ld9Var3.c;
                                            if (contains) {
                                                ed9Var22.k.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = ed9Var22.k;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = ed9Var22.g;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            ed9Var22.p();
                                            fu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                                            boolean contains2 = ld9Var3.c.l.contains(Integer.valueOf(i32));
                                            ed9 ed9Var32 = ld9Var3.c;
                                            if (contains2) {
                                                ed9Var32.l.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = ed9Var32.l;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = ed9Var32.h;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            ed9Var32.p();
                                            fu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                                            boolean contains3 = ld9Var3.c.m.contains(Long.valueOf(j3));
                                            ed9 ed9Var4 = ld9Var3.c;
                                            if (contains3) {
                                                ed9Var4.m.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = ed9Var4.m;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = ed9Var4.i;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            ed9Var4.p();
                                            fu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            vnb vnbVar3 = md9Var.J0;
                            Context context4 = context;
                            d34 d34Var3 = new d34(context4, i3, 0, false, iccVar3, nccVar3, null, vnbVar3, (byte) 8);
                            d34Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            yob.s(imageView3, aob.F8, md9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xt3 xt3Var3 = new xt3(context4, md9Var.J0);
                            xt3Var3.setTextSize(1, 16.0f);
                            xt3Var3.setInputType(573441);
                            xt3Var3.setRawInputType(573441);
                            yob.D(xt3Var3, aob.A6, md9Var.J0);
                            yob.l(xt3Var3, 30, aob.G6, md9Var.J0);
                            xt3Var3.setCursorSize(hl.L(19.0f));
                            xt3Var3.setCursorWidth(1.5f);
                            xt3Var3.setHint(ob6.M0(2131749956, null));
                            yob.X(xt3Var3, aob.E8, md9Var.J0);
                            xt3Var3.setBackground(null);
                            frameLayout3.addView(xt3Var3, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xt3Var3.addTextChangedListener(new ry(strArr3, d34Var3, false, (byte) 17));
                            if (arrayList3.size() > 8) {
                                fu5Var3.q(frameLayout3, tre.o(-1, 44));
                                fu5Var3.j();
                            }
                            if (!ed9Var3.m.isEmpty()) {
                                fu5Var3.b(R.drawable.msg_select, ob6.M0(2131745398, null), new id9(ld9Var2, (byte) 2), false);
                            }
                            fu5Var3.p(d34Var3);
                            fu5Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        wc9 wc9Var4 = new wc9(this.J0, context, false);
        this.Y1 = wc9Var4;
        wc9Var4.setValue(ob6.M0(2131750341, null));
        linearLayout.addView(wc9Var4, tre.t(-2, -2, 16, 0, 0, 0, 0));
        wc9Var4.setOnClickListener(new View.OnClickListener(this) { // from class: kd9
            public final /* synthetic */ md9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b;
                final ld9 ld9Var2 = ld9Var;
                md9 md9Var = this.b;
                switch (b32) {
                    case 0:
                        ed9 ed9Var = ld9Var2.c;
                        if (!ed9Var.g.isEmpty()) {
                            final fu5 fu5Var = new fu5(md9Var.c, md9Var.J0, md9Var.W1, false, true, false);
                            fu5Var.t = false;
                            fu5Var.e0 = true;
                            fu5Var.b0(0.0f, hl.L(-8.0f));
                            fu5Var.X = true;
                            fu5Var.p = new vn1(fu5Var, (byte) 9);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(ed9Var.g);
                            final byte b4 = 0;
                            Collections.sort(arrayList, new Comparator() { // from class: fd9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b52 = b4;
                                    ld9 ld9Var3 = ld9Var2;
                                    switch (b52) {
                                        case 0:
                                            Integer num = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num2 = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num4 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num6 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i = md9Var.a;
                            icc iccVar = new icc() { // from class: gd9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // icc
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b52 = b4;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList;
                                    ld9 ld9Var3 = ld9Var2;
                                    String[] strArr22 = strArr;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = hl.I3(lowerCase);
                                            ed9 ed9Var22 = ld9Var3.c;
                                            boolean isEmpty = ed9Var22.k.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = ed9Var22.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) ed9Var22.n.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = yc9.b;
                                                    b8c K = b8c.K(yc9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(uc9.i(ob6.M0(2131749957, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = hl.I3(lowerCase2);
                                            ed9 ed9Var32 = ld9Var3.c;
                                            boolean isEmpty2 = ed9Var32.l.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = ed9Var32.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (uh9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) ed9Var32.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = oc9.b;
                                                b8c K2 = b8c.K(oc9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(uc9.i(ob6.M0(2131749963, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = hl.I3(lowerCase3);
                                            ed9 ed9Var4 = ld9Var3.c;
                                            boolean isEmpty3 = ed9Var4.m.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = ed9Var4.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || uh9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) ed9Var4.p.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = bd9.b;
                                                b8c K3 = b8c.K(bd9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            ncc nccVar = new ncc() { // from class: hd9
                                @Override // ncc
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b52 = b4;
                                    int i22 = 0;
                                    fu5 fu5Var22 = fu5Var;
                                    ld9 ld9Var3 = ld9Var2;
                                    b8c b8cVar = (b8c) obj;
                                    switch (b52) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                                            boolean contains = ld9Var3.c.k.contains(Long.valueOf(j));
                                            ed9 ed9Var22 = ld9Var3.c;
                                            if (contains) {
                                                ed9Var22.k.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = ed9Var22.k;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = ed9Var22.g;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            ed9Var22.p();
                                            fu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                                            boolean contains2 = ld9Var3.c.l.contains(Integer.valueOf(i32));
                                            ed9 ed9Var32 = ld9Var3.c;
                                            if (contains2) {
                                                ed9Var32.l.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = ed9Var32.l;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = ed9Var32.h;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            ed9Var32.p();
                                            fu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                                            boolean contains3 = ld9Var3.c.m.contains(Long.valueOf(j3));
                                            ed9 ed9Var4 = ld9Var3.c;
                                            if (contains3) {
                                                ed9Var4.m.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = ed9Var4.m;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = ed9Var4.i;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            ed9Var4.p();
                                            fu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            vnb vnbVar = md9Var.J0;
                            Context context2 = context;
                            d34 d34Var = new d34(context2, i, 0, false, iccVar, nccVar, null, vnbVar, (byte) 6);
                            d34Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            yob.s(imageView, aob.F8, md9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xt3 xt3Var = new xt3(context2, md9Var.J0);
                            xt3Var.setTextSize(1, 16.0f);
                            xt3Var.setInputType(573441);
                            xt3Var.setRawInputType(573441);
                            yob.D(xt3Var, aob.A6, md9Var.J0);
                            yob.l(xt3Var, 30, aob.G6, md9Var.J0);
                            xt3Var.setCursorSize(hl.L(19.0f));
                            xt3Var.setCursorWidth(1.5f);
                            xt3Var.setHint(ob6.M0(2131749956, null));
                            yob.X(xt3Var, aob.E8, md9Var.J0);
                            xt3Var.setBackground(null);
                            frameLayout.addView(xt3Var, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xt3Var.addTextChangedListener(new ry(strArr, d34Var, false, (byte) 15));
                            if (arrayList.size() > 8) {
                                fu5Var.q(frameLayout, tre.o(-1, 44));
                                fu5Var.j();
                            }
                            if (!ed9Var.k.isEmpty()) {
                                fu5Var.b(R.drawable.msg_select, ob6.M0(2131745398, null), new id9(ld9Var2, (byte) 0), false);
                            }
                            fu5Var.p(d34Var);
                            fu5Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        ed9 ed9Var2 = ld9Var2.c;
                        if (!ed9Var2.h.isEmpty()) {
                            final fu5 fu5Var2 = new fu5(md9Var.c, md9Var.J0, md9Var.X1, false, true, false);
                            fu5Var2.t = false;
                            fu5Var2.e0 = true;
                            fu5Var2.b0(0.0f, hl.L(-8.0f));
                            fu5Var2.X = true;
                            fu5Var2.p = new vn1(fu5Var2, (byte) 7);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(ed9Var2.h);
                            final byte b5 = 1;
                            Collections.sort(arrayList2, new Comparator() { // from class: fd9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b52 = b5;
                                    ld9 ld9Var3 = ld9Var2;
                                    switch (b52) {
                                        case 0:
                                            Integer num = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num2 = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num4 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num6 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i2 = md9Var.a;
                            icc iccVar2 = new icc() { // from class: gd9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // icc
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b52 = b5;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    ld9 ld9Var3 = ld9Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = hl.I3(lowerCase);
                                            ed9 ed9Var22 = ld9Var3.c;
                                            boolean isEmpty = ed9Var22.k.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = ed9Var22.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) ed9Var22.n.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = yc9.b;
                                                    b8c K = b8c.K(yc9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(uc9.i(ob6.M0(2131749957, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = hl.I3(lowerCase2);
                                            ed9 ed9Var32 = ld9Var3.c;
                                            boolean isEmpty2 = ed9Var32.l.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = ed9Var32.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (uh9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) ed9Var32.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = oc9.b;
                                                b8c K2 = b8c.K(oc9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(uc9.i(ob6.M0(2131749963, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = hl.I3(lowerCase3);
                                            ed9 ed9Var4 = ld9Var3.c;
                                            boolean isEmpty3 = ed9Var4.m.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = ed9Var4.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || uh9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) ed9Var4.p.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = bd9.b;
                                                b8c K3 = b8c.K(bd9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            ncc nccVar2 = new ncc() { // from class: hd9
                                @Override // ncc
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b52 = b5;
                                    int i22 = 0;
                                    fu5 fu5Var22 = fu5Var2;
                                    ld9 ld9Var3 = ld9Var2;
                                    b8c b8cVar = (b8c) obj;
                                    switch (b52) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                                            boolean contains = ld9Var3.c.k.contains(Long.valueOf(j));
                                            ed9 ed9Var22 = ld9Var3.c;
                                            if (contains) {
                                                ed9Var22.k.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = ed9Var22.k;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = ed9Var22.g;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            ed9Var22.p();
                                            fu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                                            boolean contains2 = ld9Var3.c.l.contains(Integer.valueOf(i32));
                                            ed9 ed9Var32 = ld9Var3.c;
                                            if (contains2) {
                                                ed9Var32.l.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = ed9Var32.l;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = ed9Var32.h;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            ed9Var32.p();
                                            fu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                                            boolean contains3 = ld9Var3.c.m.contains(Long.valueOf(j3));
                                            ed9 ed9Var4 = ld9Var3.c;
                                            if (contains3) {
                                                ed9Var4.m.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = ed9Var4.m;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = ed9Var4.i;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            ed9Var4.p();
                                            fu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            vnb vnbVar2 = md9Var.J0;
                            Context context3 = context;
                            d34 d34Var2 = new d34(context3, i2, 0, false, iccVar2, nccVar2, null, vnbVar2, (byte) 7);
                            d34Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            yob.s(imageView2, aob.F8, md9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xt3 xt3Var2 = new xt3(context3, md9Var.J0);
                            xt3Var2.setTextSize(1, 16.0f);
                            xt3Var2.setInputType(573441);
                            xt3Var2.setRawInputType(573441);
                            yob.D(xt3Var2, aob.A6, md9Var.J0);
                            yob.l(xt3Var2, 30, aob.G6, md9Var.J0);
                            xt3Var2.setCursorSize(hl.L(19.0f));
                            xt3Var2.setCursorWidth(1.5f);
                            xt3Var2.setHint(ob6.M0(2131749956, null));
                            yob.X(xt3Var2, aob.E8, md9Var.J0);
                            xt3Var2.setBackground(null);
                            frameLayout2.addView(xt3Var2, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xt3Var2.addTextChangedListener(new ry(strArr2, d34Var2, false, (byte) 16));
                            if (arrayList2.size() > 8) {
                                fu5Var2.q(frameLayout2, tre.o(-1, 44));
                                fu5Var2.j();
                            }
                            if (!ed9Var2.l.isEmpty()) {
                                fu5Var2.b(R.drawable.msg_select, ob6.M0(2131745398, null), new id9(ld9Var2, (byte) 1), false);
                            }
                            fu5Var2.p(d34Var2);
                            fu5Var2.a0();
                            break;
                        }
                        break;
                    default:
                        ed9 ed9Var3 = ld9Var2.c;
                        if (!ed9Var3.i.isEmpty()) {
                            final fu5 fu5Var3 = new fu5(md9Var.c, md9Var.J0, md9Var.Y1, false, true, false);
                            fu5Var3.t = false;
                            fu5Var3.e0 = true;
                            fu5Var3.b0(0.0f, hl.L(-8.0f));
                            fu5Var3.X = true;
                            fu5Var3.p = new vn1(fu5Var3, (byte) 8);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(ed9Var3.i);
                            final byte b6 = 2;
                            Collections.sort(arrayList3, new Comparator() { // from class: fd9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b52 = b6;
                                    ld9 ld9Var3 = ld9Var2;
                                    switch (b52) {
                                        case 0:
                                            Integer num = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num2 = (Integer) ld9Var3.c.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num4 = (Integer) ld9Var3.c.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num6 = (Integer) ld9Var3.c.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i3 = md9Var.a;
                            icc iccVar3 = new icc() { // from class: gd9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // icc
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b52 = b6;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    ld9 ld9Var3 = ld9Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = hl.I3(lowerCase);
                                            ed9 ed9Var22 = ld9Var3.c;
                                            boolean isEmpty = ed9Var22.k.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = ed9Var22.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) ed9Var22.n.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = yc9.b;
                                                    b8c K = b8c.K(yc9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(uc9.i(ob6.M0(2131749957, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = hl.I3(lowerCase2);
                                            ed9 ed9Var32 = ld9Var3.c;
                                            boolean isEmpty2 = ed9Var32.l.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = ed9Var32.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (uh9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) ed9Var32.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = oc9.b;
                                                b8c K2 = b8c.K(oc9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(uc9.i(ob6.M0(2131749963, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = hl.I3(lowerCase3);
                                            ed9 ed9Var4 = ld9Var3.c;
                                            boolean isEmpty3 = ed9Var4.m.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = ed9Var4.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || uh9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) ed9Var4.p.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = bd9.b;
                                                b8c K3 = b8c.K(bd9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            ncc nccVar3 = new ncc() { // from class: hd9
                                @Override // ncc
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b52 = b6;
                                    int i22 = 0;
                                    fu5 fu5Var22 = fu5Var3;
                                    ld9 ld9Var3 = ld9Var2;
                                    b8c b8cVar = (b8c) obj;
                                    switch (b52) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                                            boolean contains = ld9Var3.c.k.contains(Long.valueOf(j));
                                            ed9 ed9Var22 = ld9Var3.c;
                                            if (contains) {
                                                ed9Var22.k.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = ed9Var22.k;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = ed9Var22.g;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            ed9Var22.p();
                                            fu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                                            boolean contains2 = ld9Var3.c.l.contains(Integer.valueOf(i32));
                                            ed9 ed9Var32 = ld9Var3.c;
                                            if (contains2) {
                                                ed9Var32.l.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = ed9Var32.l;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = ed9Var32.h;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            ed9Var32.p();
                                            fu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                                            boolean contains3 = ld9Var3.c.m.contains(Long.valueOf(j3));
                                            ed9 ed9Var4 = ld9Var3.c;
                                            if (contains3) {
                                                ed9Var4.m.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = ed9Var4.m;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = ed9Var4.i;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            ed9Var4.p();
                                            fu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            vnb vnbVar3 = md9Var.J0;
                            Context context4 = context;
                            d34 d34Var3 = new d34(context4, i3, 0, false, iccVar3, nccVar3, null, vnbVar3, (byte) 8);
                            d34Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            yob.s(imageView3, aob.F8, md9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xt3 xt3Var3 = new xt3(context4, md9Var.J0);
                            xt3Var3.setTextSize(1, 16.0f);
                            xt3Var3.setInputType(573441);
                            xt3Var3.setRawInputType(573441);
                            yob.D(xt3Var3, aob.A6, md9Var.J0);
                            yob.l(xt3Var3, 30, aob.G6, md9Var.J0);
                            xt3Var3.setCursorSize(hl.L(19.0f));
                            xt3Var3.setCursorWidth(1.5f);
                            xt3Var3.setHint(ob6.M0(2131749956, null));
                            yob.X(xt3Var3, aob.E8, md9Var.J0);
                            xt3Var3.setBackground(null);
                            frameLayout3.addView(xt3Var3, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xt3Var3.addTextChangedListener(new ry(strArr3, d34Var3, false, (byte) 17));
                            if (arrayList3.size() > 8) {
                                fu5Var3.q(frameLayout3, tre.o(-1, 44));
                                fu5Var3.j();
                            }
                            if (!ed9Var3.m.isEmpty()) {
                                fu5Var3.b(R.drawable.msg_select, ob6.M0(2131745398, null), new id9(ld9Var2, (byte) 2), false);
                            }
                            fu5Var3.p(d34Var3);
                            fu5Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        getContext();
        u55 u55Var = new u55(3);
        u55Var.O = new ar1(this, (byte) 14);
        this.n1.setLayoutManager(u55Var);
        this.n1.setOnItemClickListener(new m88((Object) this, (Object) ld9Var, (byte) 21));
        this.n1.setPadding(hl.L(8.0f) + this.u0, 0, hl.L(8.0f) + this.u0, 0);
        this.n1.setOnScrollListener(new e98(this, (byte) 12));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        this.n1.setItemSelectorColorProvider(new iy8((byte) 9));
        hta htaVar = new hta(context);
        this.Z1 = htaVar;
        int L = hl.L(20.0f);
        int L2 = hl.L(9.0f);
        htaVar.h = L;
        htaVar.n = L2;
        htaVar.setRoundRadius(hl.L(22.0f));
        htaVar.setFullRect(true);
        hl.k2(new sh9(htaVar, (byte) 8), 12.0f, 12, new ArrayList());
        htaVar.setPivotY(0.0f);
        this.c.addView(htaVar, tre.e(-1, -2, 55));
        this.d2.O(false);
        ld9Var.d = new jd9(this, b3);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        wb wbVar = new wb(this, d79Var, getContext(), this.a, new hj8(this, (byte) 9), this.J0, (byte) 3);
        this.d2 = wbVar;
        return wbVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        String str = this.S1;
        return str != null ? str : ob6.M0(2131749717, null);
    }

    @Override // ny0
    public final void P0(float f) {
        float y = this.b.getY() + f;
        hta htaVar = this.Z1;
        float measuredHeight = y - htaVar.getMeasuredHeight();
        float l = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + hl.L(8.0f)) / htaVar.getMeasuredHeight());
        float height = this.c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l = Math.min(l, Utilities.l(1.0f - ((measuredHeight - height) / hl.N(128.0f))));
        }
        htaVar.setScaleX(l);
        htaVar.setScaleY(l);
        htaVar.setAlpha(hl.x1(l, 0.5f, 1.0f));
        htaVar.setTranslationY(measuredHeight);
    }

    public final void Z0() {
        int S;
        b8c G;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            d79 d79Var = this.n1;
            if (i >= d79Var.getChildCount()) {
                break;
            }
            View childAt = d79Var.getChildAt(i);
            if ((childAt instanceof tk4) && (S = RecyclerView.S(childAt) - 1) >= 0 && (G = this.d2.G(S)) != null) {
                if (G.d < 10) {
                    z = true;
                } else {
                    z2 = true;
                }
            }
            i++;
        }
        ld9 ld9Var = this.T1;
        if (z) {
            ld9Var.b.a();
        }
        if (z2) {
            ld9Var.c.o(false);
        }
    }
}
