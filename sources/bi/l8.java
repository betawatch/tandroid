package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.na;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l8 extends ra {
    public static final /* synthetic */ int g2 = 0;
    public final String T1;
    public final k8 U1;
    public final HorizontalScrollView V1;
    public final r7 W1;
    public final r7 X1;
    public final r7 Y1;
    public final r7 Z1;
    public final di.k4 a2;
    public di.c2 b2;
    public final HashSet c2;
    public boolean d2;
    public j8 e2;
    public boolean f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(final Context context, String str, final k8 k8Var) {
        super(2, context, (org.telegram.ui.ActionBar.i6) null, false);
        final int i7 = 2;
        final int i10 = 0;
        this.c2 = new HashSet();
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        this.T1 = str;
        this.U1 = k8Var;
        this.p1.setTitle(P0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.V1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        r7 r7Var = new r7(context, this.J0, false);
        this.W1 = r7Var;
        r7Var.setSorting(k8Var.c.p);
        linearLayout.addView(r7Var, na.t(-2, -2, 16, 0, 0, 6, 0));
        int i11 = 6;
        r7Var.setOnClickListener(new ai.p2(i11, this, k8Var));
        r7 r7Var2 = new r7(context, this.J0, false);
        this.X1 = r7Var2;
        r7Var2.setValue(gd.N0(2131750370, null));
        linearLayout.addView(r7Var2, na.t(-2, -2, 16, 0, 0, 6, 0));
        r7Var2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.i8
            public final /* synthetic */ l8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i10;
                final k8 k8Var2 = k8Var;
                l8 l8Var = this.b;
                final int i13 = 2;
                final int i14 = 1;
                switch (i12) {
                    case 0:
                        a8 a8Var = k8Var2.c;
                        if (!a8Var.f.isEmpty()) {
                            final x60 x60Var = new x60(l8Var.c, l8Var.J0, l8Var.X1, false, true, false);
                            x60Var.t = false;
                            x60Var.b0 = true;
                            x60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            x60Var.U = true;
                            x60Var.p = new h6(x60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(a8Var.f);
                            final int i15 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: bi.f8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            k8 k8Var3 = k8Var2;
                                            Integer num = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k8 k8Var4 = k8Var2;
                                            Integer num3 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k8 k8Var5 = k8Var2;
                                            Integer num5 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i16 = l8Var.a;
                            final int i17 = 0;
                            p10 p10Var = new p10() { // from class: bi.b8
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj, Object obj2) {
                                    int i18 = i17;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    k8 k8Var3 = k8Var2;
                                    String[] strArr2 = strArr;
                                    switch (i18) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            a8 a8Var2 = k8Var3.c;
                                            boolean isEmpty = a8Var2.j.isEmpty();
                                            int size = arrayList2.size();
                                            int i19 = 0;
                                            while (i19 < size) {
                                                Object obj3 = arrayList2.get(i19);
                                                i19++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = a8Var2.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) a8Var2.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = u7.b;
                                                    n41 K = n41.K(u7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(p7.i(gd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            a8 a8Var3 = k8Var3.c;
                                            boolean isEmpty2 = a8Var3.k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList2.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = a8Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) a8Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = m7.b;
                                                    n41 K2 = n41.K(m7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.m = lowerCase2;
                                                    K2.A = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(p7.i(gd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            a8 a8Var4 = k8Var3.c;
                                            boolean isEmpty3 = a8Var4.l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList2.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = a8Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) a8Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = x7.b;
                                                    n41 K3 = n41.K(x7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.m = lowerCase3;
                                                    K3.A = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(p7.i(gd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            u10 u10Var = new u10() { // from class: bi.c8
                                @Override // org.telegram.messenger.u10
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    n41 n41Var = (n41) obj;
                                    switch (i17) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                                            a8 a8Var2 = k8Var2.c;
                                            HashSet hashSet = a8Var2.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList2 = a8Var2.f;
                                                int size = arrayList2.size();
                                                int i18 = 0;
                                                while (i18 < size) {
                                                    Object obj3 = arrayList2.get(i18);
                                                    i18++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            a8Var2.m();
                                            x60Var.v();
                                            break;
                                        case 1:
                                            int i19 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                                            a8 a8Var3 = k8Var2.c;
                                            HashSet hashSet2 = a8Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i19))) {
                                                hashSet2.remove(Integer.valueOf(i19));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = a8Var3.g;
                                                int size2 = arrayList3.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList3.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i19) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i19));
                                            }
                                            a8Var3.m();
                                            x60Var.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                                            a8 a8Var4 = k8Var2.c;
                                            HashSet hashSet3 = a8Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = a8Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            a8Var4.m();
                                            x60Var.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var = l8Var.J0;
                            Context context2 = context;
                            l7 l7Var = new l7(context2, i16, 0, false, p10Var, u10Var, null, i6Var, 4);
                            l7Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, l8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, l8Var.J0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, l8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, l8Var.J0);
                            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, l8Var.J0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new v(strArr, l7Var, false, 4));
                            if (arrayList.size() > 8) {
                                x60Var.r(frameLayout, na.o(-1, 44));
                                x60Var.k();
                            }
                            if (!a8Var.j.isEmpty()) {
                                x60Var.c(R.drawable.msg_select, gd.N0(2131745474, null), new d8(k8Var2, 0), false);
                            }
                            x60Var.q(l7Var);
                            x60Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        a8 a8Var2 = k8Var2.c;
                        if (!a8Var2.g.isEmpty()) {
                            final x60 x60Var2 = new x60(l8Var.c, l8Var.J0, l8Var.Y1, false, true, false);
                            x60Var2.t = false;
                            x60Var2.b0 = true;
                            x60Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            x60Var2.U = true;
                            x60Var2.p = new h6(x60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(a8Var2.g);
                            final int i18 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: bi.f8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            k8 k8Var3 = k8Var2;
                                            Integer num = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k8 k8Var4 = k8Var2;
                                            Integer num3 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k8 k8Var5 = k8Var2;
                                            Integer num5 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i19 = l8Var.a;
                            p10 p10Var2 = new p10() { // from class: bi.b8
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i14;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    k8 k8Var3 = k8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            a8 a8Var22 = k8Var3.c;
                                            boolean isEmpty = a8Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = a8Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) a8Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = u7.b;
                                                    n41 K = n41.K(u7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(p7.i(gd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            a8 a8Var3 = k8Var3.c;
                                            boolean isEmpty2 = a8Var3.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = a8Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) a8Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = m7.b;
                                                    n41 K2 = n41.K(m7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.m = lowerCase2;
                                                    K2.A = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(p7.i(gd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            a8 a8Var4 = k8Var3.c;
                                            boolean isEmpty3 = a8Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = a8Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) a8Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = x7.b;
                                                    n41 K3 = n41.K(x7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.m = lowerCase3;
                                                    K3.A = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(p7.i(gd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            u10 u10Var2 = new u10() { // from class: bi.c8
                                @Override // org.telegram.messenger.u10
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    n41 n41Var = (n41) obj;
                                    switch (i14) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                                            a8 a8Var22 = k8Var2.c;
                                            HashSet hashSet = a8Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = a8Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            a8Var22.m();
                                            x60Var2.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                                            a8 a8Var3 = k8Var2.c;
                                            HashSet hashSet2 = a8Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = a8Var3.g;
                                                int size2 = arrayList3.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList3.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            a8Var3.m();
                                            x60Var2.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                                            a8 a8Var4 = k8Var2.c;
                                            HashSet hashSet3 = a8Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = a8Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            a8Var4.m();
                                            x60Var2.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var2 = l8Var.J0;
                            Context context3 = context;
                            l7 l7Var2 = new l7(context3, i19, 0, false, p10Var2, u10Var2, null, i6Var2, 5);
                            l7Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.F8, l8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, l8Var.J0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar2, org.telegram.ui.ActionBar.n6.A6, l8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar2, 30, org.telegram.ui.ActionBar.n6.G6, l8Var.J0);
                            mtVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar2, org.telegram.ui.ActionBar.n6.E8, l8Var.J0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new v(strArr2, l7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                x60Var2.r(frameLayout2, na.o(-1, 44));
                                x60Var2.k();
                            }
                            if (!a8Var2.k.isEmpty()) {
                                x60Var2.c(R.drawable.msg_select, gd.N0(2131745474, null), new d8(k8Var2, 1), false);
                            }
                            x60Var2.q(l7Var2);
                            x60Var2.a0();
                            break;
                        }
                        break;
                    default:
                        a8 a8Var3 = k8Var2.c;
                        if (!a8Var3.h.isEmpty()) {
                            final x60 x60Var3 = new x60(l8Var.c, l8Var.J0, l8Var.Z1, false, true, false);
                            x60Var3.t = false;
                            x60Var3.b0 = true;
                            x60Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            x60Var3.U = true;
                            x60Var3.p = new h6(x60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(a8Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: bi.f8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            k8 k8Var3 = k8Var2;
                                            Integer num = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k8 k8Var4 = k8Var2;
                                            Integer num3 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k8 k8Var5 = k8Var2;
                                            Integer num5 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i20 = l8Var.a;
                            p10 p10Var3 = new p10() { // from class: bi.b8
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    k8 k8Var3 = k8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            a8 a8Var22 = k8Var3.c;
                                            boolean isEmpty = a8Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = a8Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) a8Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = u7.b;
                                                    n41 K = n41.K(u7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(p7.i(gd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            a8 a8Var32 = k8Var3.c;
                                            boolean isEmpty2 = a8Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = a8Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) a8Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = m7.b;
                                                    n41 K2 = n41.K(m7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.m = lowerCase2;
                                                    K2.A = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(p7.i(gd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            a8 a8Var4 = k8Var3.c;
                                            boolean isEmpty3 = a8Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = a8Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) a8Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = x7.b;
                                                    n41 K3 = n41.K(x7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.m = lowerCase3;
                                                    K3.A = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(p7.i(gd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            u10 u10Var3 = new u10() { // from class: bi.c8
                                @Override // org.telegram.messenger.u10
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    n41 n41Var = (n41) obj;
                                    switch (i13) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                                            a8 a8Var22 = k8Var2.c;
                                            HashSet hashSet = a8Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = a8Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            a8Var22.m();
                                            x60Var3.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                                            a8 a8Var32 = k8Var2.c;
                                            HashSet hashSet2 = a8Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = a8Var32.g;
                                                int size2 = arrayList32.size();
                                                int i202 = 0;
                                                while (i202 < size2) {
                                                    Object obj4 = arrayList32.get(i202);
                                                    i202++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            a8Var32.m();
                                            x60Var3.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                                            a8 a8Var4 = k8Var2.c;
                                            HashSet hashSet3 = a8Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = a8Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            a8Var4.m();
                                            x60Var3.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var3 = l8Var.J0;
                            Context context4 = context;
                            l7 l7Var3 = new l7(context4, i20, 0, false, p10Var3, u10Var3, null, i6Var3, 6);
                            l7Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.F8, l8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, l8Var.J0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar3, org.telegram.ui.ActionBar.n6.A6, l8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar3, 30, org.telegram.ui.ActionBar.n6.G6, l8Var.J0);
                            mtVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar3, org.telegram.ui.ActionBar.n6.E8, l8Var.J0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new v(strArr3, l7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                x60Var3.r(frameLayout3, na.o(-1, 44));
                                x60Var3.k();
                            }
                            if (!a8Var3.l.isEmpty()) {
                                x60Var3.c(R.drawable.msg_select, gd.N0(2131745474, null), new d8(k8Var2, 2), false);
                            }
                            x60Var3.q(l7Var3);
                            x60Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        r7 r7Var3 = new r7(context, this.J0, false);
        this.Y1 = r7Var3;
        r7Var3.setValue(gd.N0(2131750371, null));
        linearLayout.addView(r7Var3, na.t(-2, -2, 16, 0, 0, 6, 0));
        final int i12 = 1;
        r7Var3.setOnClickListener(new View.OnClickListener(this) { // from class: bi.i8
            public final /* synthetic */ l8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i12;
                final k8 k8Var2 = k8Var;
                l8 l8Var = this.b;
                final int i13 = 2;
                final int i14 = 1;
                switch (i122) {
                    case 0:
                        a8 a8Var = k8Var2.c;
                        if (!a8Var.f.isEmpty()) {
                            final x60 x60Var = new x60(l8Var.c, l8Var.J0, l8Var.X1, false, true, false);
                            x60Var.t = false;
                            x60Var.b0 = true;
                            x60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            x60Var.U = true;
                            x60Var.p = new h6(x60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(a8Var.f);
                            final int i15 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: bi.f8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            k8 k8Var3 = k8Var2;
                                            Integer num = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k8 k8Var4 = k8Var2;
                                            Integer num3 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k8 k8Var5 = k8Var2;
                                            Integer num5 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i16 = l8Var.a;
                            final int i17 = 0;
                            p10 p10Var = new p10() { // from class: bi.b8
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i17;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    k8 k8Var3 = k8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            a8 a8Var22 = k8Var3.c;
                                            boolean isEmpty = a8Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = a8Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) a8Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = u7.b;
                                                    n41 K = n41.K(u7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(p7.i(gd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            a8 a8Var32 = k8Var3.c;
                                            boolean isEmpty2 = a8Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = a8Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) a8Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = m7.b;
                                                    n41 K2 = n41.K(m7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.m = lowerCase2;
                                                    K2.A = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(p7.i(gd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            a8 a8Var4 = k8Var3.c;
                                            boolean isEmpty3 = a8Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = a8Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) a8Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = x7.b;
                                                    n41 K3 = n41.K(x7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.m = lowerCase3;
                                                    K3.A = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(p7.i(gd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            u10 u10Var = new u10() { // from class: bi.c8
                                @Override // org.telegram.messenger.u10
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    n41 n41Var = (n41) obj;
                                    switch (i17) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                                            a8 a8Var22 = k8Var2.c;
                                            HashSet hashSet = a8Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = a8Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            a8Var22.m();
                                            x60Var.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                                            a8 a8Var32 = k8Var2.c;
                                            HashSet hashSet2 = a8Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = a8Var32.g;
                                                int size2 = arrayList32.size();
                                                int i202 = 0;
                                                while (i202 < size2) {
                                                    Object obj4 = arrayList32.get(i202);
                                                    i202++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            a8Var32.m();
                                            x60Var.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                                            a8 a8Var4 = k8Var2.c;
                                            HashSet hashSet3 = a8Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = a8Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            a8Var4.m();
                                            x60Var.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var = l8Var.J0;
                            Context context2 = context;
                            l7 l7Var = new l7(context2, i16, 0, false, p10Var, u10Var, null, i6Var, 4);
                            l7Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, l8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, l8Var.J0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, l8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, l8Var.J0);
                            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, l8Var.J0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new v(strArr, l7Var, false, 4));
                            if (arrayList.size() > 8) {
                                x60Var.r(frameLayout, na.o(-1, 44));
                                x60Var.k();
                            }
                            if (!a8Var.j.isEmpty()) {
                                x60Var.c(R.drawable.msg_select, gd.N0(2131745474, null), new d8(k8Var2, 0), false);
                            }
                            x60Var.q(l7Var);
                            x60Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        a8 a8Var2 = k8Var2.c;
                        if (!a8Var2.g.isEmpty()) {
                            final x60 x60Var2 = new x60(l8Var.c, l8Var.J0, l8Var.Y1, false, true, false);
                            x60Var2.t = false;
                            x60Var2.b0 = true;
                            x60Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            x60Var2.U = true;
                            x60Var2.p = new h6(x60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(a8Var2.g);
                            final int i18 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: bi.f8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            k8 k8Var3 = k8Var2;
                                            Integer num = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k8 k8Var4 = k8Var2;
                                            Integer num3 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k8 k8Var5 = k8Var2;
                                            Integer num5 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i19 = l8Var.a;
                            p10 p10Var2 = new p10() { // from class: bi.b8
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i14;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    k8 k8Var3 = k8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            a8 a8Var22 = k8Var3.c;
                                            boolean isEmpty = a8Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = a8Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) a8Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = u7.b;
                                                    n41 K = n41.K(u7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(p7.i(gd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            a8 a8Var32 = k8Var3.c;
                                            boolean isEmpty2 = a8Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = a8Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) a8Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = m7.b;
                                                    n41 K2 = n41.K(m7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.m = lowerCase2;
                                                    K2.A = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(p7.i(gd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            a8 a8Var4 = k8Var3.c;
                                            boolean isEmpty3 = a8Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = a8Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) a8Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = x7.b;
                                                    n41 K3 = n41.K(x7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.m = lowerCase3;
                                                    K3.A = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(p7.i(gd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            u10 u10Var2 = new u10() { // from class: bi.c8
                                @Override // org.telegram.messenger.u10
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    n41 n41Var = (n41) obj;
                                    switch (i14) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                                            a8 a8Var22 = k8Var2.c;
                                            HashSet hashSet = a8Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = a8Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            a8Var22.m();
                                            x60Var2.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                                            a8 a8Var32 = k8Var2.c;
                                            HashSet hashSet2 = a8Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = a8Var32.g;
                                                int size2 = arrayList32.size();
                                                int i202 = 0;
                                                while (i202 < size2) {
                                                    Object obj4 = arrayList32.get(i202);
                                                    i202++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            a8Var32.m();
                                            x60Var2.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                                            a8 a8Var4 = k8Var2.c;
                                            HashSet hashSet3 = a8Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = a8Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            a8Var4.m();
                                            x60Var2.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var2 = l8Var.J0;
                            Context context3 = context;
                            l7 l7Var2 = new l7(context3, i19, 0, false, p10Var2, u10Var2, null, i6Var2, 5);
                            l7Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.F8, l8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, l8Var.J0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar2, org.telegram.ui.ActionBar.n6.A6, l8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar2, 30, org.telegram.ui.ActionBar.n6.G6, l8Var.J0);
                            mtVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar2, org.telegram.ui.ActionBar.n6.E8, l8Var.J0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new v(strArr2, l7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                x60Var2.r(frameLayout2, na.o(-1, 44));
                                x60Var2.k();
                            }
                            if (!a8Var2.k.isEmpty()) {
                                x60Var2.c(R.drawable.msg_select, gd.N0(2131745474, null), new d8(k8Var2, 1), false);
                            }
                            x60Var2.q(l7Var2);
                            x60Var2.a0();
                            break;
                        }
                        break;
                    default:
                        a8 a8Var3 = k8Var2.c;
                        if (!a8Var3.h.isEmpty()) {
                            final x60 x60Var3 = new x60(l8Var.c, l8Var.J0, l8Var.Z1, false, true, false);
                            x60Var3.t = false;
                            x60Var3.b0 = true;
                            x60Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            x60Var3.U = true;
                            x60Var3.p = new h6(x60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(a8Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: bi.f8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            k8 k8Var3 = k8Var2;
                                            Integer num = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k8 k8Var4 = k8Var2;
                                            Integer num3 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k8 k8Var5 = k8Var2;
                                            Integer num5 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i20 = l8Var.a;
                            p10 p10Var3 = new p10() { // from class: bi.b8
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    k8 k8Var3 = k8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            a8 a8Var22 = k8Var3.c;
                                            boolean isEmpty = a8Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = a8Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) a8Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = u7.b;
                                                    n41 K = n41.K(u7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(p7.i(gd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            a8 a8Var32 = k8Var3.c;
                                            boolean isEmpty2 = a8Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = a8Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) a8Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = m7.b;
                                                    n41 K2 = n41.K(m7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.m = lowerCase2;
                                                    K2.A = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(p7.i(gd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            a8 a8Var4 = k8Var3.c;
                                            boolean isEmpty3 = a8Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = a8Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) a8Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = x7.b;
                                                    n41 K3 = n41.K(x7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.m = lowerCase3;
                                                    K3.A = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(p7.i(gd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            u10 u10Var3 = new u10() { // from class: bi.c8
                                @Override // org.telegram.messenger.u10
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    n41 n41Var = (n41) obj;
                                    switch (i13) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                                            a8 a8Var22 = k8Var2.c;
                                            HashSet hashSet = a8Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = a8Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            a8Var22.m();
                                            x60Var3.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                                            a8 a8Var32 = k8Var2.c;
                                            HashSet hashSet2 = a8Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = a8Var32.g;
                                                int size2 = arrayList32.size();
                                                int i202 = 0;
                                                while (i202 < size2) {
                                                    Object obj4 = arrayList32.get(i202);
                                                    i202++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            a8Var32.m();
                                            x60Var3.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                                            a8 a8Var4 = k8Var2.c;
                                            HashSet hashSet3 = a8Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = a8Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            a8Var4.m();
                                            x60Var3.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var3 = l8Var.J0;
                            Context context4 = context;
                            l7 l7Var3 = new l7(context4, i20, 0, false, p10Var3, u10Var3, null, i6Var3, 6);
                            l7Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.F8, l8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, l8Var.J0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar3, org.telegram.ui.ActionBar.n6.A6, l8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar3, 30, org.telegram.ui.ActionBar.n6.G6, l8Var.J0);
                            mtVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar3, org.telegram.ui.ActionBar.n6.E8, l8Var.J0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new v(strArr3, l7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                x60Var3.r(frameLayout3, na.o(-1, 44));
                                x60Var3.k();
                            }
                            if (!a8Var3.l.isEmpty()) {
                                x60Var3.c(R.drawable.msg_select, gd.N0(2131745474, null), new d8(k8Var2, 2), false);
                            }
                            x60Var3.q(l7Var3);
                            x60Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        r7 r7Var4 = new r7(context, this.J0, false);
        this.Z1 = r7Var4;
        r7Var4.setValue(gd.N0(2131750363, null));
        linearLayout.addView(r7Var4, na.t(-2, -2, 16, 0, 0, 0, 0));
        r7Var4.setOnClickListener(new View.OnClickListener(this) { // from class: bi.i8
            public final /* synthetic */ l8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i7;
                final k8 k8Var2 = k8Var;
                l8 l8Var = this.b;
                final int i13 = 2;
                final int i14 = 1;
                switch (i122) {
                    case 0:
                        a8 a8Var = k8Var2.c;
                        if (!a8Var.f.isEmpty()) {
                            final x60 x60Var = new x60(l8Var.c, l8Var.J0, l8Var.X1, false, true, false);
                            x60Var.t = false;
                            x60Var.b0 = true;
                            x60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            x60Var.U = true;
                            x60Var.p = new h6(x60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(a8Var.f);
                            final int i15 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: bi.f8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            k8 k8Var3 = k8Var2;
                                            Integer num = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k8 k8Var4 = k8Var2;
                                            Integer num3 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k8 k8Var5 = k8Var2;
                                            Integer num5 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i16 = l8Var.a;
                            final int i17 = 0;
                            p10 p10Var = new p10() { // from class: bi.b8
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i17;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    k8 k8Var3 = k8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            a8 a8Var22 = k8Var3.c;
                                            boolean isEmpty = a8Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = a8Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) a8Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = u7.b;
                                                    n41 K = n41.K(u7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(p7.i(gd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            a8 a8Var32 = k8Var3.c;
                                            boolean isEmpty2 = a8Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = a8Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) a8Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = m7.b;
                                                    n41 K2 = n41.K(m7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.m = lowerCase2;
                                                    K2.A = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(p7.i(gd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            a8 a8Var4 = k8Var3.c;
                                            boolean isEmpty3 = a8Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = a8Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) a8Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = x7.b;
                                                    n41 K3 = n41.K(x7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.m = lowerCase3;
                                                    K3.A = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(p7.i(gd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            u10 u10Var = new u10() { // from class: bi.c8
                                @Override // org.telegram.messenger.u10
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    n41 n41Var = (n41) obj;
                                    switch (i17) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                                            a8 a8Var22 = k8Var2.c;
                                            HashSet hashSet = a8Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = a8Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            a8Var22.m();
                                            x60Var.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                                            a8 a8Var32 = k8Var2.c;
                                            HashSet hashSet2 = a8Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = a8Var32.g;
                                                int size2 = arrayList32.size();
                                                int i202 = 0;
                                                while (i202 < size2) {
                                                    Object obj4 = arrayList32.get(i202);
                                                    i202++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            a8Var32.m();
                                            x60Var.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                                            a8 a8Var4 = k8Var2.c;
                                            HashSet hashSet3 = a8Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = a8Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            a8Var4.m();
                                            x60Var.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var = l8Var.J0;
                            Context context2 = context;
                            l7 l7Var = new l7(context2, i16, 0, false, p10Var, u10Var, null, i6Var, 4);
                            l7Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, l8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, l8Var.J0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, l8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, l8Var.J0);
                            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, l8Var.J0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new v(strArr, l7Var, false, 4));
                            if (arrayList.size() > 8) {
                                x60Var.r(frameLayout, na.o(-1, 44));
                                x60Var.k();
                            }
                            if (!a8Var.j.isEmpty()) {
                                x60Var.c(R.drawable.msg_select, gd.N0(2131745474, null), new d8(k8Var2, 0), false);
                            }
                            x60Var.q(l7Var);
                            x60Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        a8 a8Var2 = k8Var2.c;
                        if (!a8Var2.g.isEmpty()) {
                            final x60 x60Var2 = new x60(l8Var.c, l8Var.J0, l8Var.Y1, false, true, false);
                            x60Var2.t = false;
                            x60Var2.b0 = true;
                            x60Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            x60Var2.U = true;
                            x60Var2.p = new h6(x60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(a8Var2.g);
                            final int i18 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: bi.f8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            k8 k8Var3 = k8Var2;
                                            Integer num = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k8 k8Var4 = k8Var2;
                                            Integer num3 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k8 k8Var5 = k8Var2;
                                            Integer num5 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i19 = l8Var.a;
                            p10 p10Var2 = new p10() { // from class: bi.b8
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i14;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    k8 k8Var3 = k8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            a8 a8Var22 = k8Var3.c;
                                            boolean isEmpty = a8Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = a8Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) a8Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = u7.b;
                                                    n41 K = n41.K(u7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(p7.i(gd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            a8 a8Var32 = k8Var3.c;
                                            boolean isEmpty2 = a8Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = a8Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) a8Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = m7.b;
                                                    n41 K2 = n41.K(m7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.m = lowerCase2;
                                                    K2.A = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(p7.i(gd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            a8 a8Var4 = k8Var3.c;
                                            boolean isEmpty3 = a8Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = a8Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) a8Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = x7.b;
                                                    n41 K3 = n41.K(x7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.m = lowerCase3;
                                                    K3.A = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(p7.i(gd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            u10 u10Var2 = new u10() { // from class: bi.c8
                                @Override // org.telegram.messenger.u10
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    n41 n41Var = (n41) obj;
                                    switch (i14) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                                            a8 a8Var22 = k8Var2.c;
                                            HashSet hashSet = a8Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = a8Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            a8Var22.m();
                                            x60Var2.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                                            a8 a8Var32 = k8Var2.c;
                                            HashSet hashSet2 = a8Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = a8Var32.g;
                                                int size2 = arrayList32.size();
                                                int i202 = 0;
                                                while (i202 < size2) {
                                                    Object obj4 = arrayList32.get(i202);
                                                    i202++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            a8Var32.m();
                                            x60Var2.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                                            a8 a8Var4 = k8Var2.c;
                                            HashSet hashSet3 = a8Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = a8Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            a8Var4.m();
                                            x60Var2.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var2 = l8Var.J0;
                            Context context3 = context;
                            l7 l7Var2 = new l7(context3, i19, 0, false, p10Var2, u10Var2, null, i6Var2, 5);
                            l7Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.F8, l8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, l8Var.J0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar2, org.telegram.ui.ActionBar.n6.A6, l8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar2, 30, org.telegram.ui.ActionBar.n6.G6, l8Var.J0);
                            mtVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar2, org.telegram.ui.ActionBar.n6.E8, l8Var.J0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new v(strArr2, l7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                x60Var2.r(frameLayout2, na.o(-1, 44));
                                x60Var2.k();
                            }
                            if (!a8Var2.k.isEmpty()) {
                                x60Var2.c(R.drawable.msg_select, gd.N0(2131745474, null), new d8(k8Var2, 1), false);
                            }
                            x60Var2.q(l7Var2);
                            x60Var2.a0();
                            break;
                        }
                        break;
                    default:
                        a8 a8Var3 = k8Var2.c;
                        if (!a8Var3.h.isEmpty()) {
                            final x60 x60Var3 = new x60(l8Var.c, l8Var.J0, l8Var.Z1, false, true, false);
                            x60Var3.t = false;
                            x60Var3.b0 = true;
                            x60Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            x60Var3.U = true;
                            x60Var3.p = new h6(x60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(a8Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: bi.f8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            k8 k8Var3 = k8Var2;
                                            Integer num = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k8 k8Var4 = k8Var2;
                                            Integer num3 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) k8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k8 k8Var5 = k8Var2;
                                            Integer num5 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) k8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i20 = l8Var.a;
                            p10 p10Var3 = new p10() { // from class: bi.b8
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    k8 k8Var3 = k8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            a8 a8Var22 = k8Var3.c;
                                            boolean isEmpty = a8Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = a8Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) a8Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = u7.b;
                                                    n41 K = n41.K(u7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(p7.i(gd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            a8 a8Var32 = k8Var3.c;
                                            boolean isEmpty2 = a8Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = a8Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) a8Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = m7.b;
                                                    n41 K2 = n41.K(m7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.m = lowerCase2;
                                                    K2.A = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(p7.i(gd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            a8 a8Var4 = k8Var3.c;
                                            boolean isEmpty3 = a8Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = a8Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) a8Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = x7.b;
                                                    n41 K3 = n41.K(x7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.m = lowerCase3;
                                                    K3.A = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(p7.i(gd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            u10 u10Var3 = new u10() { // from class: bi.c8
                                @Override // org.telegram.messenger.u10
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    n41 n41Var = (n41) obj;
                                    switch (i13) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                                            a8 a8Var22 = k8Var2.c;
                                            HashSet hashSet = a8Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = a8Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            a8Var22.m();
                                            x60Var3.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                                            a8 a8Var32 = k8Var2.c;
                                            HashSet hashSet2 = a8Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = a8Var32.g;
                                                int size2 = arrayList32.size();
                                                int i202 = 0;
                                                while (i202 < size2) {
                                                    Object obj4 = arrayList32.get(i202);
                                                    i202++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            a8Var32.m();
                                            x60Var3.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                                            a8 a8Var4 = k8Var2.c;
                                            HashSet hashSet3 = a8Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = a8Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            a8Var4.m();
                                            x60Var3.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var3 = l8Var.J0;
                            Context context4 = context;
                            l7 l7Var3 = new l7(context4, i20, 0, false, p10Var3, u10Var3, null, i6Var3, 6);
                            l7Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.F8, l8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, l8Var.J0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar3, org.telegram.ui.ActionBar.n6.A6, l8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar3, 30, org.telegram.ui.ActionBar.n6.G6, l8Var.J0);
                            mtVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar3, org.telegram.ui.ActionBar.n6.E8, l8Var.J0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new v(strArr3, l7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                x60Var3.r(frameLayout3, na.o(-1, 44));
                                x60Var3.k();
                            }
                            if (!a8Var3.l.isEmpty()) {
                                x60Var3.c(R.drawable.msg_select, gd.N0(2131745474, null), new d8(k8Var2, 2), false);
                            }
                            x60Var3.q(l7Var3);
                            x60Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        getContext();
        v4.t tVar = new v4.t(3);
        tVar.O = new y2(this, i12);
        this.o1.setLayoutManager(tVar);
        this.o1.setOnItemClickListener(new ab.g(i11, this, k8Var));
        this.o1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.u0, 0, org.telegram.messenger.g0.L(8.0f) + this.u0, 0);
        this.o1.setOnScrollListener(new v1(this, i7));
        v4.l lVar = new v4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.o1.setItemAnimator(lVar);
        this.o1.setItemSelectorColorProvider(new a3.l(23));
        di.k4 k4Var = new di.k4(context);
        this.a2 = k4Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        k4Var.h = L;
        k4Var.n = L2;
        k4Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        k4Var.setFullRect(true);
        org.telegram.messenger.g0.m2(new ai.d0(k4Var, 11), 12.0f, 12, new ArrayList());
        k4Var.setPivotY(0.0f);
        this.c.addView(k4Var, na.e(-1, -2, 55));
        this.e2.O(false);
        k8Var.d = new e8(this, i12);
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        j8 j8Var = new j8(this, ek0Var, getContext(), this.a, new b(this, 10), this.J0, 0);
        this.e2 = j8Var;
        return j8Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        String str = this.T1;
        return str != null ? str : gd.N0(2131749754, null);
    }

    @Override // org.telegram.ui.Components.ra
    public final void U0(float f10) {
        float y10 = this.b.getY() + f10;
        di.k4 k4Var = this.a2;
        float measuredHeight = y10 - k4Var.getMeasuredHeight();
        float l10 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.g0.L(8.0f)) / k4Var.getMeasuredHeight());
        float height = this.c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l10 = Math.min(l10, Utilities.l(1.0f - ((measuredHeight - height) / org.telegram.messenger.g0.N(128.0f))));
        }
        k4Var.setScaleX(l10);
        k4Var.setScaleY(l10);
        k4Var.setAlpha(org.telegram.messenger.g0.z1(l10, 0.5f, 1.0f));
        k4Var.setTranslationY(measuredHeight);
    }

    public final void e1() {
        int R;
        n41 G;
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ek0 ek0Var = this.o1;
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if ((childAt instanceof vz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.e2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i7++;
        }
        k8 k8Var = this.U1;
        if (z10) {
            k8Var.b.a();
        }
        if (z11) {
            k8Var.c.l(false);
        }
    }
}
